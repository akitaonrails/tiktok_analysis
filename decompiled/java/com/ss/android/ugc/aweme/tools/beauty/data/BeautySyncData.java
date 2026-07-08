package com.ss.android.ugc.aweme.tools.beauty.data;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautySyncData {
    public String categoryId;
    public String effectId;
    public String parentId;
    public String resourceId;

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setResourceId(String str) {
        this.resourceId = str;
    }

    public BeautySyncData(String str, String str2, String str3, String str4) {
        this.effectId = str;
        this.resourceId = str2;
        this.categoryId = str3;
        this.parentId = str4;
    }
}
