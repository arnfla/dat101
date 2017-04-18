package no.hib.dat101.modell;

import javax.persistence.*;

@Entity
@Table(name = "bil", schema = "FYLLINNN")
public class Bil {
	@Id
	private String regnr;
	
	@Column(name = "merke")
	private String merke;
	
	@Column(name = "modell")
	private String modell;
	
	@Column(name = "farge")
	private String farge;
	
	@Column(name = "bilkategori")
	private Character bilkategori;
	
	@ManyToOne
	@JoinColumn(name = "kontor", referencedColumnName = "id")
	private Utleiekontor utleiekontor;
	
	@ManyToOne(mappedBy = "bil")
	private List<Utleie> utleie;
}
