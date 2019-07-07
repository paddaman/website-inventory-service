package se.website.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;

/**
 * Created 2019-07-07 by patrikingverud
 */

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Null(message = "Id cannot be set. It will be set automatically by the in the database.")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
