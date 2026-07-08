package com.ss.android.ugc.aweme.music.addtodsp.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TT2DSPPlatformInfo implements Serializable {

    @C09CT("always_show_in_fyp_switch")
    public final Boolean alwaysShowInFyp;

    @C09CT("developer_token")
    public final String developerToken;

    @C09CT("platform")
    public final int dspPlatform;

    @C09CT("platform_selected_by_user")
    public final boolean platformSelectedByUser;

    @C09CT("promotion_tag")
    public final String promotionTag;

    public int hashCode() {
        int iZ2 = ((this.dspPlatform * 31) + C786410Ut5.Z2(this.platformSelectedByUser)) * 31;
        String str = this.developerToken;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promotionTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.alwaysShowInFyp;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public TT2DSPPlatformInfo(int i, boolean z, String str, String str2, Boolean bool) {
        this.dspPlatform = i;
        this.platformSelectedByUser = z;
        this.developerToken = str;
        this.promotionTag = str2;
        this.alwaysShowInFyp = bool;
    }
}
