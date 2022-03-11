package be.intecbrussel.service;

import be.intecbrussel.data.ModuleDAO;
import be.intecbrussel.model.Module;

public class ModuleService {
    private ModuleDAO moduleDao;

    public ModuleService() {
        this.moduleDao = new ModuleDAO();
    }

    public Module addModule(Module m) {
        moduleDao.addModule(m);
        return m;
    }
}
