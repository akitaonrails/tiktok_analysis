package com.ss.android.ugc.aweme.purchasepanel.service;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.components.model.Component;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasePanelParams {

    @C09CT("components")
    public final List<Component> components;

    @C09CT("purchase_panel_title")
    public final String title;

    public PurchasePanelParams() {
        this(null, null, 3, null);
    }

    public PurchasePanelParams(String str, List<Component> list) {
        this.title = str;
        this.components = list;
    }

    public PurchasePanelParams(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
