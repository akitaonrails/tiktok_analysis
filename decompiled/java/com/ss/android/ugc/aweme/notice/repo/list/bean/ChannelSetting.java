package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ChannelSetting {

    @C09CT("is_display")
    public final Boolean isDisplay;

    @C09CT("is_subscribe")
    public Boolean isSubscribe;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelSetting)) {
            return false;
        }
        ChannelSetting channelSetting = (ChannelSetting) obj;
        return Intrinsics.LJFF(this.isDisplay, channelSetting.isDisplay) && Intrinsics.LJFF(this.isSubscribe, channelSetting.isSubscribe);
    }

    public final int hashCode() {
        Boolean bool = this.isDisplay;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSubscribe;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public ChannelSetting(Boolean bool, Boolean bool2) {
        this.isDisplay = bool;
        this.isSubscribe = bool2;
    }
}
