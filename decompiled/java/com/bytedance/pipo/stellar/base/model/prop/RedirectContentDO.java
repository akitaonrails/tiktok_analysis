package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RedirectContentDO implements Serializable {

    @C09CT("body")
    public final String body;

    @C09CT("business")
    public final String business;

    @C09CT("close_page")
    public final Integer closePage;

    @C09CT("close_type")
    public final Integer closeType;

    @C09CT("header")
    public final String header;

    @C09CT("jump_schema")
    public final String schema;

    @C09CT("target_id")
    public final String targetId;

    public RedirectContentDO() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectContentDO)) {
            return false;
        }
        RedirectContentDO redirectContentDO = (RedirectContentDO) obj;
        return Intrinsics.LJFF(this.schema, redirectContentDO.schema) && Intrinsics.LJFF(this.business, redirectContentDO.business) && Intrinsics.LJFF(this.closePage, redirectContentDO.closePage) && Intrinsics.LJFF(this.header, redirectContentDO.header) && Intrinsics.LJFF(this.body, redirectContentDO.body) && Intrinsics.LJFF(this.closeType, redirectContentDO.closeType) && Intrinsics.LJFF(this.targetId, redirectContentDO.targetId);
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.business;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.closePage;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.header;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.closeType;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.targetId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public RedirectContentDO(String str, String str2, Integer num, String str3, String str4, Integer num2, String str5) {
        this.schema = str;
        this.business = str2;
        this.closePage = num;
        this.header = str3;
        this.body = str4;
        this.closeType = num2;
        this.targetId = str5;
    }
}
