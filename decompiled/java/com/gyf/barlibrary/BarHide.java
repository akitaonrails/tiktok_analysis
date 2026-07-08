package com.gyf.barlibrary;

import X.C08FF;

/* JADX INFO: loaded from: classes33.dex */
public enum BarHide {
    FLAG_HIDE_STATUS_BAR,
    FLAG_HIDE_NAVIGATION_BAR,
    FLAG_HIDE_BAR,
    FLAG_SHOW_BAR;

    public static BarHide valueOf(String str) {
        return (BarHide) C08FF.LIZ(BarHide.class, str);
    }
}
