import java.util.ArrayList;

/**
 * Created by charette on 5/2/2016.
 */
public class Recipe {
    private ArrayList<String> ingredients = null;
    private int preparationTime = 0;
    private int numberOfIngredients = 0;
    private String recipeName = "";

    public Recipe(String recipeName){
        this.recipeName = recipeName;
    }

    public Recipe(String recipeName, int prepTime){
        this.recipeName = recipeName;
        preparationTime = prepTime;
    }

    public Recipe(String recipeName, int prepTime, int numberOfIngredients){
        this.recipeName = recipeName;
        preparationTime = prepTime;
        this.numberOfIngredients = numberOfIngredients;
    }

    public ArrayList<String> getIngrediants() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public String toString(){
        return "" + this.recipeName + ": " + ingredients.toString();
    }
}
