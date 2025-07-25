// SPDX-License-Identifier: MIT

package com.callumthomson.fuckyouicons;

import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;

public class IconsTableModel extends DefaultTableModel {

    public static int ICON_PREVIEW_ROW_NUMBER = 0;
    public static int ICON_ENABLED_ROW_NUMBER = 1;
    public static int ICON_NAME_ROW_NUMBER = 2;

    /**
     * Table columns type.
     */
    @SuppressWarnings("unchecked")
    private final Class<Object>[] types = new Class[]{Icon.class, Boolean.class, String.class};

    /**
     * Indicates if table columns are editable.
     */
    private final boolean[] canEdit = new boolean[]{false, true, false};

    public IconsTableModel() {
        super(new Object[][]{}, new String[]{"", "", "Icon Name"});
    }

    @Override
    public Class<Object> getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
}
