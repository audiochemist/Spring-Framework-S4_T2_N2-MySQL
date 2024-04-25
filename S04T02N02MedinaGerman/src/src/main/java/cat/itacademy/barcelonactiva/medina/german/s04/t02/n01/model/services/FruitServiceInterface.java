package cat.itacademy.barcelonactiva.medina.german.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.medina.german.s04.t02.n01.exceptions.EmptyFruitException;
import cat.itacademy.barcelonactiva.medina.german.s04.t02.n01.exceptions.FruitNoFound;
import cat.itacademy.barcelonactiva.medina.german.s04.t02.n01.model.domain.Fruit;

import java.util.List;

public interface FruitServiceInterface {
    public Fruit createFruit (Fruit fruit) throws EmptyFruitException, FruitNoFound;
    public void deleteFruit(int id) throws FruitNoFound;
    public Fruit getOneFruitById(int id) throws FruitNoFound;
    public List<Fruit> getAllFruits() throws EmptyFruitException;

}