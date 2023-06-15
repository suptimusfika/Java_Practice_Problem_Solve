//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
// If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]
public class Problem20_ExtractPrice {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        paragraph = paragraph.replaceAll("[^\\d]", " ");
        paragraph = paragraph.trim();
        paragraph = paragraph.replaceAll(" +", " ");
        String[] word=(paragraph.split(" "));
        String l = word[1];
        int laptopPrice = Integer.parseInt(l);
        String m = word[2];
        int mousePrice = Integer.parseInt(m);
        String numMouse = word[3];
        int numberOfMouse = Integer.parseInt(numMouse);
        String dis = word[4];
        int discount = Integer.parseInt(dis);
        int totalCost = laptopPrice + (numberOfMouse * mousePrice);
        double totalCostWithDiscount = totalCost - (discount * totalCost) / 100;
        System.out.println("Total cost after giving 15% discount = " + totalCostWithDiscount);
    }
}
