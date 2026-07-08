package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityConfigItem {

    @C09CT("activity_type")
    public final Integer activityType;

    @C09CT("chosen")
    public final Boolean chosen;

    @C09CT("extra_text")
    public final String extraText;

    @C09CT("text")
    public final String text;

    public ActivityConfigItem() {
        this(Boolean.FALSE, null, null, null);
    }

    public final int hashCode() {
        Boolean bool = this.chosen;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.activityType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public ActivityConfigItem(Boolean bool, Integer num, String str, String str2) {
        this.chosen = bool;
        this.activityType = num;
        this.text = str;
        this.extraText = str2;
    }
}
