package com.ss.android.ugc.aweme.im.chatroom.common.titlebar.model;

import X.C09CT;
import X.C1419705h5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TitleBarRightIconMetaData implements InterfaceC898340ZMa {

    @C09CT("conversation_type")
    public final Integer conversationType;

    @C09CT("current_locale_time_second")
    public final long currentLocaleTimeSecond;

    @C09CT("current_server_time_second")
    public final long currentServerTimeSecond;

    @C09CT("from_path")
    public final String fromPath;

    @C09CT("shared_feed_entrance_status")
    public final Boolean sharedFeedEntranceStatus;

    @C09CT("voice_call_entrance_status")
    public final Boolean voiceCallEntranceStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public TitleBarRightIconMetaData() {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        IMHostApi.LIZ.getClass();
        this(null, bool, bool2, jCurrentTimeMillis, C1419705h5.LIZ() != null ? r0.getServerTime() : 0L, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBarRightIconMetaData)) {
            return false;
        }
        TitleBarRightIconMetaData titleBarRightIconMetaData = (TitleBarRightIconMetaData) obj;
        return Intrinsics.LJFF(this.conversationType, titleBarRightIconMetaData.conversationType) && Intrinsics.LJFF(this.sharedFeedEntranceStatus, titleBarRightIconMetaData.sharedFeedEntranceStatus) && Intrinsics.LJFF(this.voiceCallEntranceStatus, titleBarRightIconMetaData.voiceCallEntranceStatus) && this.currentLocaleTimeSecond == titleBarRightIconMetaData.currentLocaleTimeSecond && this.currentServerTimeSecond == titleBarRightIconMetaData.currentServerTimeSecond && Intrinsics.LJFF(this.fromPath, titleBarRightIconMetaData.fromPath);
    }

    public final int hashCode() {
        Integer num = this.conversationType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.sharedFeedEntranceStatus;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.voiceCallEntranceStatus;
        int iHashCode3 = (((((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C786410Ut5.Y2(this.currentLocaleTimeSecond)) * 31) + C786410Ut5.Y2(this.currentServerTimeSecond)) * 31;
        String str = this.fromPath;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarRightIconMetaData(conversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(", sharedFeedEntranceStatus=");
        sbLIZ.append(this.sharedFeedEntranceStatus);
        sbLIZ.append(", voiceCallEntranceStatus=");
        sbLIZ.append(this.voiceCallEntranceStatus);
        sbLIZ.append(", currentLocaleTimeSecond=");
        sbLIZ.append(this.currentLocaleTimeSecond);
        sbLIZ.append(", currentServerTimeSecond=");
        sbLIZ.append(this.currentServerTimeSecond);
        sbLIZ.append(", fromPath=");
        sbLIZ.append(this.fromPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public TitleBarRightIconMetaData(Integer num, Boolean bool, Boolean bool2, long j, long j2, String str) {
        this.conversationType = num;
        this.sharedFeedEntranceStatus = bool;
        this.voiceCallEntranceStatus = bool2;
        this.currentLocaleTimeSecond = j;
        this.currentServerTimeSecond = j2;
        this.fromPath = str;
    }
}
