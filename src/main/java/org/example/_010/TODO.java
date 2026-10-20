package org.example._010;

import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class TODO {
    private Long id;
    private String nombre;
    private String descripcion;
    private boolean finalizado;
}
