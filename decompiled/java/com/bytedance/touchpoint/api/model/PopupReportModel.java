package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupReportModel {

    @C09CT("popup_id")
    public final String id;

    @C09CT("popup_type")
    public final String name;

    @C09CT("popup_click_type")
    public final String type;

    public PopupReportModel(String str, String str2, String str3) {
        this.type = str;
        this.id = str2;
        this.name = str3;
    }
}
