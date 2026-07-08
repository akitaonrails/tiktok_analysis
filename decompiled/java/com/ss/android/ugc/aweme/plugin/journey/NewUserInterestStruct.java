package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserInterestStruct {

    @C09CT("cover_url")
    public final String cover_url;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("interest_type")
    public final Integer interest_type;

    @C09CT("level")
    public final Integer level;

    @C09CT("selected")
    public final Boolean selected;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public final String type;

    public NewUserInterestStruct() {
        this("", null, null, null, null, null, null);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cover_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.interest_type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.level;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.selected;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public NewUserInterestStruct(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4) {
        this.id = str;
        this.text = str2;
        this.cover_url = str3;
        this.interest_type = num;
        this.level = num2;
        this.selected = bool;
        this.type = str4;
    }
}
