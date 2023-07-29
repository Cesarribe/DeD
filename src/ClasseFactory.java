public class ClasseFactory {
    public Class createClass(String classType) {
        if (classType.equalsIgnoreCase("fighter")) {
            return new FighterClass();
        } else if (classType.equalsIgnoreCase("wizard")) {
            return new WizardClass();
        } else {
            throw new IllegalArgumentException("Unknown class type: " + classType);
        }
    } // colocar todas as classes
}

