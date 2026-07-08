package com.ss.android.ugc.aweme.friendstab.model;

import X.EnumC1583310rIv;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public final class ToolBarIconModel {
    public final String contentDescription;
    public final View customizedView;
    public final boolean hasDot;
    public final Integer heatSize;
    public final int iconRes;
    public final String imageUrl;
    public final boolean isCycle;
    public final Function0<Unit> onClick;
    public final int tintColor;
    public final EnumC1583310rIv type;
    public final boolean useTuxIcon;

    public ToolBarIconModel() {
        this(false, 0, 0, EnumC1583310rIv.DEFAULT, false, null, null, null, null, true, null);
    }

    public final boolean isCycle() {
        return this.isCycle;
    }

    public ToolBarIconModel(boolean z, int i, int i2, EnumC1583310rIv enumC1583310rIv, boolean z2, String str, View view, String str2, Integer num, boolean z3, Function0<Unit> function0) {
        this.hasDot = z;
        this.iconRes = i;
        this.tintColor = i2;
        this.type = enumC1583310rIv;
        this.isCycle = z2;
        this.imageUrl = str;
        this.customizedView = view;
        this.contentDescription = str2;
        this.heatSize = num;
        this.useTuxIcon = z3;
        this.onClick = function0;
    }
}
