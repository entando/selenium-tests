/*
Copyright 2015-Present Entando Inc. (http://www.entando.com) All rights reserved.
This library is free software; you can redistribute it and/or modify it under
the terms of the GNU Lesser General Public License as published by the Free
Software Foundation; either version 2.1 of the License, or (at your option)
any later version.
This library is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
details.
 */
package org.entando.selenium.utils;

import java.util.Arrays;
import java.util.List;

/**
 * This class contains some utils methos for the Categories tests (Helpers)
 * 
 * @version 1.01
 */
public class CategoriesTestBase extends ExpandableTableTestTypology{
    //Expected table header titles
    public final List<String> expectedHeaderTitles = 
            Arrays.asList("Categories tree", "Actions");
    
    //Default category
    public final String defaultCategoryName = "SeleniumTest_DontTouch";
    
    
    public boolean addCategory(){
        return true;
    }
    
    
    
    public boolean deleteCategory(){
        return true;
    }
    
}
