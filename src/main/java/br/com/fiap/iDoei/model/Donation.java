package br.com.fiap.iDoei.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Donation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Food idFood;
	@ManyToOne
	private Ong idOng;
	@ManyToOne
	private Person idPerson;
	private String receivingDate;
}
