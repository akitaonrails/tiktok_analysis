package com.ss.android.ugc.aweme.creatortools.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShowCaseModel {

    @C09CT("click_schema")
    public final String clickSchema;

    @C09CT("have_permission")
    public final boolean havePermission;

    @C09CT("show_entrance")
    public final boolean showEntrance;

    public ShowCaseModel(boolean z, boolean z2, String str) {
        this.showEntrance = z;
        this.havePermission = z2;
        this.clickSchema = str;
    }
}
