package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TT2DSPSongInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("always_show_in_fyp_switch")
    public Boolean alwaysShowInFyp;

    @C09CT("button_type")
    public int buttonType;

    @C09CT("platform")
    public Integer dspPlatform;

    @C09CT("platform_selected_by_user")
    public Boolean platformSelectedByUser;

    @C09CT("show_mdp_tt_to_dsp_status")
    public int showStatusInSdp;

    @C09CT("song_id")
    public String songId;

    @C09CT("token")
    public DspAuthToken token;

    public static final class Companion {
    }

    public TT2DSPSongInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TT2DSPSongInfo)) {
            return false;
        }
        TT2DSPSongInfo tT2DSPSongInfo = (TT2DSPSongInfo) obj;
        return Intrinsics.LJFF(this.dspPlatform, tT2DSPSongInfo.dspPlatform) && Intrinsics.LJFF(this.songId, tT2DSPSongInfo.songId) && Intrinsics.LJFF(this.platformSelectedByUser, tT2DSPSongInfo.platformSelectedByUser) && Intrinsics.LJFF(this.token, tT2DSPSongInfo.token) && this.buttonType == tT2DSPSongInfo.buttonType && Intrinsics.LJFF(this.alwaysShowInFyp, tT2DSPSongInfo.alwaysShowInFyp) && this.showStatusInSdp == tT2DSPSongInfo.showStatusInSdp;
    }

    public int hashCode() {
        Integer num = this.dspPlatform;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.songId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.platformSelectedByUser;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DspAuthToken dspAuthToken = this.token;
        int iHashCode4 = (((iHashCode3 + (dspAuthToken == null ? 0 : dspAuthToken.hashCode())) * 31) + this.buttonType) * 31;
        Boolean bool2 = this.alwaysShowInFyp;
        return ((iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.showStatusInSdp;
    }

    public TT2DSPSongInfo(Integer num, String str, Boolean bool, DspAuthToken dspAuthToken, int i, Boolean bool2, int i2) {
        this.dspPlatform = num;
        this.songId = str;
        this.platformSelectedByUser = bool;
        this.token = dspAuthToken;
        this.buttonType = i;
        this.alwaysShowInFyp = bool2;
        this.showStatusInSdp = i2;
    }
}
