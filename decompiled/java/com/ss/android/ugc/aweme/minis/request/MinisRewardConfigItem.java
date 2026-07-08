package com.ss.android.ugc.aweme.minis.request;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRewardConfigItem {

    @C09CT("config_version")
    public final Long configVersion;

    @C09CT("reward_amount")
    public final String rewardAmount;

    @C09CT("reward_icon_url")
    public final String rewardIconUrl;

    @C09CT("reward_name")
    public final String rewardName;

    @C09CT("reward_scene")
    public final String rewardScene;

    public MinisRewardConfigItem() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisRewardConfigItem)) {
            return false;
        }
        MinisRewardConfigItem minisRewardConfigItem = (MinisRewardConfigItem) obj;
        return Intrinsics.LJFF(this.rewardScene, minisRewardConfigItem.rewardScene) && Intrinsics.LJFF(this.rewardName, minisRewardConfigItem.rewardName) && Intrinsics.LJFF(this.rewardAmount, minisRewardConfigItem.rewardAmount) && Intrinsics.LJFF(this.rewardIconUrl, minisRewardConfigItem.rewardIconUrl) && Intrinsics.LJFF(this.configVersion, minisRewardConfigItem.configVersion);
    }

    public final int hashCode() {
        String str = this.rewardScene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rewardName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rewardAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rewardIconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.configVersion;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRewardConfigItem(rewardScene=");
        sbLIZ.append(this.rewardScene);
        sbLIZ.append(", rewardName=");
        sbLIZ.append(this.rewardName);
        sbLIZ.append(", rewardAmount=");
        sbLIZ.append(this.rewardAmount);
        sbLIZ.append(", rewardIconUrl=");
        sbLIZ.append(this.rewardIconUrl);
        sbLIZ.append(", configVersion=");
        sbLIZ.append(this.configVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisRewardConfigItem(String str, String str2, String str3, String str4, Long l) {
        this.rewardScene = str;
        this.rewardName = str2;
        this.rewardAmount = str3;
        this.rewardIconUrl = str4;
        this.configVersion = l;
    }
}
