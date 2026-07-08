package com.ss.android.ugc.aweme.im.b2c.strategy.model;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatCommonConfMetaData implements InterfaceC898340ZMa {

    @C09CT("conversation_type")
    public final int conversationType;

    @C09CT("current_locale_time_second")
    public final long currentLocaleTimeSecond;

    @C09CT("current_server_time_second")
    public final long currentServerTimeSecond;

    @C09CT("entrance_type")
    public final List<Double> entranceType;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("from_path")
    public final String fromPath;

    @C09CT("group_owner_user_tags")
    public final String groupOwnerUserTags;

    @C09CT("conv_group_type")
    public final String groupType;

    @C09CT("peer_age_interval")
    public final Integer peerUserAgeInterval;

    @C09CT("peer_user_tags")
    public final String peerUserTags;

    @C09CT("user_tags")
    public final String userTags;

    public ChatCommonConfMetaData() {
        this(null, null, 0, null, null, null, null, null, 0L, 0L, null, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatCommonConfMetaData)) {
            return false;
        }
        ChatCommonConfMetaData chatCommonConfMetaData = (ChatCommonConfMetaData) obj;
        return Intrinsics.LJFF(this.userTags, chatCommonConfMetaData.userTags) && Intrinsics.LJFF(this.entranceType, chatCommonConfMetaData.entranceType) && this.conversationType == chatCommonConfMetaData.conversationType && Intrinsics.LJFF(this.followStatus, chatCommonConfMetaData.followStatus) && Intrinsics.LJFF(this.peerUserTags, chatCommonConfMetaData.peerUserTags) && Intrinsics.LJFF(this.peerUserAgeInterval, chatCommonConfMetaData.peerUserAgeInterval) && Intrinsics.LJFF(this.groupType, chatCommonConfMetaData.groupType) && Intrinsics.LJFF(this.groupOwnerUserTags, chatCommonConfMetaData.groupOwnerUserTags) && this.currentLocaleTimeSecond == chatCommonConfMetaData.currentLocaleTimeSecond && this.currentServerTimeSecond == chatCommonConfMetaData.currentServerTimeSecond && Intrinsics.LJFF(this.fromPath, chatCommonConfMetaData.fromPath);
    }

    public final int hashCode() {
        int iHashCode = ((((this.userTags.hashCode() * 31) + this.entranceType.hashCode()) * 31) + this.conversationType) * 31;
        Integer num = this.followStatus;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.peerUserTags.hashCode()) * 31;
        Integer num2 = this.peerUserAgeInterval;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.groupType;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupOwnerUserTags;
        int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.currentLocaleTimeSecond)) * 31) + C786410Ut5.Y2(this.currentServerTimeSecond)) * 31;
        String str3 = this.fromPath;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ChatCommonConfMetaData(userTags=" + this.userTags + ", entranceType=" + this.entranceType + ", conversationType=" + this.conversationType + ", followStatus=" + this.followStatus + ", peerUserTags=" + this.peerUserTags + ", peerUserAgeInterval=" + this.peerUserAgeInterval + ", groupType=" + this.groupType + ", groupOwnerUserTags=" + this.groupOwnerUserTags + ", currentLocaleTimeSecond=" + this.currentLocaleTimeSecond + ", currentServerTimeSecond=" + this.currentServerTimeSecond + ", fromPath=" + this.fromPath + ')';
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZ() {
        return this.currentLocaleTimeSecond;
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZIZ() {
        return this.currentServerTimeSecond;
    }

    @Override // X.InterfaceC898340ZMa
    public final String LIZJ() {
        return this.fromPath;
    }

    public ChatCommonConfMetaData(String str, List<Double> list, int i, Integer num, String str2, Integer num2, String str3, String str4, long j, long j2, String str5) {
        this.userTags = str;
        this.entranceType = list;
        this.conversationType = i;
        this.followStatus = num;
        this.peerUserTags = str2;
        this.peerUserAgeInterval = num2;
        this.groupType = str3;
        this.groupOwnerUserTags = str4;
        this.currentLocaleTimeSecond = j;
        this.currentServerTimeSecond = j2;
        this.fromPath = str5;
    }

    public ChatCommonConfMetaData(String str, List list, int i, Integer num, String str2, Integer num2, String str3, String str4, long j, long j2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 0 : num2, (i2 & 64) != 0 ? null : str3, (i2 & 128) == 0 ? str4 : null, (i2 & 256) != 0 ? System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : j, (i2 & 512) != 0 ? ((INetwork) ServiceManager.get().getService(INetwork.class)).getServerTime() : j2, (i2 & 1024) == 0 ? str5 : "");
    }
}
