package com.ss.android.ugc.aweme.rich.reward.gecko.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RewardGeckoChannelConfig {

    @C09CT("reward_ad_common_channels")
    public final List<String> rewardAdCommonChannels;

    @C09CT("reward_anole_gecko_channels")
    public final List<String> rewardAnoleGeckoChannels;

    public RewardGeckoChannelConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardGeckoChannelConfig)) {
            return false;
        }
        RewardGeckoChannelConfig rewardGeckoChannelConfig = (RewardGeckoChannelConfig) obj;
        return Intrinsics.LJFF(this.rewardAnoleGeckoChannels, rewardGeckoChannelConfig.rewardAnoleGeckoChannels) && Intrinsics.LJFF(this.rewardAdCommonChannels, rewardGeckoChannelConfig.rewardAdCommonChannels);
    }

    public final int hashCode() {
        List<String> list = this.rewardAnoleGeckoChannels;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.rewardAdCommonChannels;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardGeckoChannelConfig(rewardAnoleGeckoChannels=");
        sbLIZ.append(this.rewardAnoleGeckoChannels);
        sbLIZ.append(", rewardAdCommonChannels=");
        sbLIZ.append(this.rewardAdCommonChannels);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RewardGeckoChannelConfig(List<String> list, List<String> list2) {
        this.rewardAnoleGeckoChannels = list;
        this.rewardAdCommonChannels = list2;
    }

    public RewardGeckoChannelConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
