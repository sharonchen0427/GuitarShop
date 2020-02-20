public class GuitarSpec {

        private String   model;

        private Builder builder;//
        private Type type;//
        private int numStrings;
        private Wood backWood, topWood;//

        public GuitarSpec(
                Builder builder,//
                String model,
                Type type,//
                int numStrings,
                Wood backWood,//
                Wood topWood){ //constructor //

            this.builder = builder;
            this.model = model;
            this.type = type;
            this.numStrings =numStrings;
            this.backWood = backWood;
            this.topWood = topWood;

        }

        /**
         * @return the serialNumber
         */

        /**
         * @return the builder
         */
        public Builder getBuilder() {
            return builder;
        }

        /**
         * @return the model
         */
        public String getModel() {
            return model;
        }

        /**
         * @return the type
         */
        public Type getType() {
            return type;
        }
        public int getNumStrings(){
            return numStrings;
        }
        /**
         * @return the backWood
         */
        public Wood getBackWood() {
            return backWood;
        }

        /**
         * @return the topWood
         */
        public Wood getTopWood() {
            return topWood;
        }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
            return false;
        if (type != otherSpec.type)
            return false;
        if (numStrings != otherSpec.numStrings)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        return true;
    }

    /**
         * @return the price
         */



}
