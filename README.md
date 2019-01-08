# CustomViewFlipAnimation
A Customised library for 3D flip animation for any view like ImageView,Button etc.
# Gradle
      dependencies {
            implementation 'com.rizz.customviewfliplib:customviewfliplib:1.0'
       }
# Usage

     ArrayList<View> viewArrayList = new ArrayList<>();
  
     viewArrayList.add(img_src);
  
     for(int i =0;i < viewArrayList.size();i++) {
                    CustomFlipAnimation flipAnimation = new CustomFlipAnimation(viewArrayList.get(i));
                    viewArrayList.get(i).startAnimation(flipAnimation);
                }
