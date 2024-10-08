package mattiasusin.D1_S1_U5.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Menu {
    protected String name;
    protected int calories;
    protected double price;
}

