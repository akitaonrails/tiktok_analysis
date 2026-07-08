package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECSeaPdpPreloadCardModel {

    @C09CT("action")
    public final String action;

    @C09CT("container_type")
    public final String containerType;

    @C09CT("count")
    public final Integer count;

    @C09CT("schema")
    public final String schema;

    @C09CT("card_type")
    public final String type;

    public ECSeaPdpPreloadCardModel() {
        this(null, null, null, null, null);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.containerType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public ECSeaPdpPreloadCardModel(String str, String str2, Integer num, String str3, String str4) {
        this.type = str;
        this.action = str2;
        this.count = num;
        this.containerType = str3;
        this.schema = str4;
    }
}
