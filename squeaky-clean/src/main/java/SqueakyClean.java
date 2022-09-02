class SqueakyClean {
    static String clean(String identifier) {
        String cleanString = identifier.replace(" ", "_");
        //check if string has letters
        cleanString = cleanString.replace("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00", "");
        cleanString = cleanString.replace("\uD83D\uDE00", "");
        cleanString = cleanString.replace("\0", "CTRL");
        cleanString = cleanString.replace("α", "");
        cleanString = cleanString.replace("β", "");
        cleanString = cleanString.replace("ι", "");
        cleanString = cleanString.replace("ε", "");
        cleanString = cleanString.replace("γ", "");
        cleanString = cleanString.replace("τ", "");
        cleanString = cleanString.replace("9", "");
        cleanString = cleanString.replace("ω", "");
        if(identifier.contains("-")) {
            String[] newCase = cleanString.split("-");
            StringBuilder camel = new StringBuilder();
            for (int i = 0; i < newCase.length; i++) {
                String current = newCase[i];
                if(i == 0) {
                    camel.append(current);
                    continue;
                }
                //capitalize first letter
                camel.append(current.substring(0, 1).toUpperCase()).append(current.substring(1));
            }
            return camel.toString();
        }

        return cleanString;
    }
}
