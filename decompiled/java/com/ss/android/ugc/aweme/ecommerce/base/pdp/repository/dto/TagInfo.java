package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TagInfo {

    @C09CT("extra_text")
    public final String extraText;

    @C09CT("tag_type")
    public final Integer tagType;

    @C09CT("text")
    public final String text;

    public final int hashCode() {
        Integer num = this.tagType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public TagInfo(Integer num, String str, String str2) {
        this.tagType = num;
        this.text = str;
        this.extraText = str2;
    }
}
