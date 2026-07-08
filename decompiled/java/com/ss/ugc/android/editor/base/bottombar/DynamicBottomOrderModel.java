package com.ss.ugc.android.editor.base.bottombar;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class DynamicBottomOrderModel {
    public boolean enable;
    public List<DynamicBottomItem> orderList;

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<DynamicBottomItem> getOrderList() {
        return this.orderList;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setOrderList(List<DynamicBottomItem> list) {
        this.orderList = list;
    }
}
