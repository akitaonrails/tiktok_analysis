package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveDisplayInfoContent {

    @C09CT("desc")
    public String desc;

    @C09CT("title")
    public String title;

    public SaveDisplayInfoContent() {
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public SaveDisplayInfoContent(String str, String str2) {
        this.title = str;
        this.desc = str2;
    }
}
