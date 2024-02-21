package com.veggievibe.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.veggievibe.backend.model.DairyDetails;
import com.veggievibe.backend.model.FruitDetails;
import com.veggievibe.backend.model.VegetableDetails;
import com.veggievibe.backend.repository.DairyRepo;
import com.veggievibe.backend.repository.FruiteRepo;
import com.veggievibe.backend.repository.VeggieRepo;

@Service
public class VeggieServices {
    
    @Autowired
    private VeggieRepo veggieRepo;

    @Autowired
    private FruiteRepo fruiteRepo;

    @Autowired
    private DairyRepo dairyRepo;

    public VegetableDetails saveVegeteable(VegetableDetails vegetableDetails)
    {
        veggieRepo.save(vegetableDetails);
        return vegetableDetails;
    }
    public FruitDetails saveFruits(FruitDetails fruitDetails)
    {
        fruiteRepo.save(fruitDetails);
        return fruitDetails;
    }
    public DairyDetails saveDairy(DairyDetails dairyDetails)
    {
        dairyRepo.save(dairyDetails);
        return dairyDetails;
    }

    public List<VegetableDetails> getVegetables()
    {
        return veggieRepo.findAll();
    }

    public List<FruitDetails> getFruits()
    {
        return fruiteRepo.findAll();
    }

    public List<DairyDetails> getDairies()
    {
        return dairyRepo.findAll();
    }

    public VegetableDetails searchVeggieById(int id)
    {
        return veggieRepo.findById(id).orElse(null);
    }

    public FruitDetails searchFruiteById(int id)
    {
        return fruiteRepo.findById(id).orElse(null);
    }

    public DairyDetails searchDairyById(int id)
    {
        return dairyRepo.findById(id).orElse(null);
    }

    public List<VegetableDetails> searchVeggieByName(String name)
    {
        return veggieRepo.findByName(name);
    }

    public List<FruitDetails> searchFruiteByName(String name)
    {
        return fruiteRepo.findByName(name);
    }

    public List<DairyDetails> searchDairyDetails(String name)
    {
        return dairyRepo.findByName(name);
    }

    public Boolean updateVeggie(int id, VegetableDetails vegetableDetails)
    {
        if(this.searchVeggieById(id) == null)
            return false;
            
        try{
            veggieRepo.save(vegetableDetails);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<VegetableDetails> SortVeggieByPriceAsc()
    {
        return veggieRepo.sortByPriceAsc();
    }

    public List<FruitDetails> SortFruiteByPriceAsc()
    {
        return fruiteRepo.sortByPriceAsc();
    }

    public List<DairyDetails> SortDairyByPriceAsc()
    {
        return dairyRepo.sortByPriceAsc();
    }

    public List<VegetableDetails> SortVeggieByPriceDesc()
    {
        return veggieRepo.sortByPriceDesc();
    }

    public List<FruitDetails> SortFruiteByPriceDesc()
    {
        return fruiteRepo.sortByPriceDesc();
    }

    public List<DairyDetails> SortDairyByPriceDesc()
    {
        return dairyRepo.sortByPriceDesc();
    }

    public List<VegetableDetails> SortVeggieByNameAsc()
    {
        return veggieRepo.sortByNameAsc();
    }

    public List<FruitDetails> SortFruiteByNameAsc()
    {
        return fruiteRepo.sortByNameAsc();
    }

    public List<DairyDetails> SortDairyByNameAsc()
    {
        return dairyRepo.sortByNameAsc();
    }

    public List<VegetableDetails> SortVeggieByNameDesc()
    {
        return veggieRepo.sortByNameDesc();
    }

    public List<FruitDetails> SortFruiteByNameDesc()
    {
        return fruiteRepo.sortByNameDesc();
    }

    public List<DairyDetails> SortDairyByNameDesc()
    {
        return dairyRepo.sortByNameDesc();
    } 
}
