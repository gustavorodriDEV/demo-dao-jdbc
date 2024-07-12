package model.dao;

import model.dao.impl.SellerDaoJdbc;

public class DaoFactory {  

    public static SellerDao createSellerDao() { 
        return new SellerDaoJdbc();
    }
    
}
