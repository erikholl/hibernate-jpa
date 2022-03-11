package be.intecbrussel.service;

import be.intecbrussel.data.ColorDAO;
import be.intecbrussel.model.Color;

public class ColorService {
    private ColorDAO colorDao;

    public ColorService() {
        this.colorDao = new ColorDAO();
    }

    public void addColor(Color c) {
        colorDao.addColor(c);
    }

    public void updateAttribute(Color c) {
        colorDao.updateAttribute(c);
    }
}
