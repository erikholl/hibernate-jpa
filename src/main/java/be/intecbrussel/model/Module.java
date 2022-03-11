package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Module")
public class Module {
    @Id
    private int moduleId;

    private String moduleName;
    private String brand;
    private int widthInHP;
    private int depthInMM;
    private BigDecimal pricePerUnit;
    private double currentPlusTwelve;
    private double currentMinTwelve;
    private double currentPlusFive;
    private String mainFunction;
    private String secondaryFunction1;
    private String secondaryFunction2;
    private String secondaryFunction3;
    private String url;

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWidthInHP() {
        return widthInHP;
    }

    public void setWidthInHP(int widthInHP) {
        this.widthInHP = widthInHP;
    }

    public int getDepthInMM() {
        return depthInMM;
    }

    public void setDepthInMM(int depthInMM) {
        this.depthInMM = depthInMM;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getCurrentPlusTwelve() {
        return currentPlusTwelve;
    }

    public void setCurrentPlusTwelve(double currentPlusTwelve) {
        this.currentPlusTwelve = currentPlusTwelve;
    }

    public double getCurrentMinTwelve() {
        return currentMinTwelve;
    }

    public void setCurrentMinTwelve(double currentMinTwelve) {
        this.currentMinTwelve = currentMinTwelve;
    }

    public double getCurrentPlusFive() {
        return currentPlusFive;
    }

    public void setCurrentPlusFive(double currentPlusFive) {
        this.currentPlusFive = currentPlusFive;
    }

    public String getMainFunction() {
        return mainFunction;
    }

    public void setMainFunction(String mainFunction) {
        this.mainFunction = mainFunction;
    }

    public String getSecondaryFunction1() {
        return secondaryFunction1;
    }

    public void setSecondaryFunction1(String secondaryFunction1) {
        this.secondaryFunction1 = secondaryFunction1;
    }

    public String getSecondaryFunction2() {
        return secondaryFunction2;
    }

    public void setSecondaryFunction2(String secondaryFunction2) {
        this.secondaryFunction2 = secondaryFunction2;
    }

    public String getSecondaryFunction3() {
        return secondaryFunction3;
    }

    public void setSecondaryFunction3(String secondaryFunction3) {
        this.secondaryFunction3 = secondaryFunction3;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "moduleId=" + moduleId +
                ", moduleName='" + moduleName + '\'' +
                ", brand='" + brand + '\'' +
                ", widthInHP=" + widthInHP +
                ", depthInMM=" + depthInMM +
                ", pricePerUnit=" + pricePerUnit +
                ", currentPlusTwelve=" + currentPlusTwelve +
                ", currentMinTwelve=" + currentMinTwelve +
                ", currentPlusFive=" + currentPlusFive +
                ", mainFunction='" + mainFunction + '\'' +
                ", secondaryFunction1='" + secondaryFunction1 + '\'' +
                ", secondaryFunction2='" + secondaryFunction2 + '\'' +
                ", secondaryFunction3='" + secondaryFunction3 + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
