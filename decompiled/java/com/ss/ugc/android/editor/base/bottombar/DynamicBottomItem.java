package com.ss.ugc.android.editor.base.bottombar;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class DynamicBottomItem {

    @C09CT("item_type")
    public String itemType;

    @C09CT("left_to")
    public String leftTo;

    @C09CT("pin_index")
    public int pinIndex;

    @C09CT("right_to")
    public String rightTo;

    public final String getItemType() {
        return this.itemType;
    }

    public final String getLeftTo() {
        return this.leftTo;
    }

    public final int getPinIndex() {
        return this.pinIndex;
    }

    public final String getRightTo() {
        return this.rightTo;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setLeftTo(String str) {
        this.leftTo = str;
    }

    public final void setPinIndex(int i) {
        this.pinIndex = i;
    }

    public final void setRightTo(String str) {
        this.rightTo = str;
    }
}
