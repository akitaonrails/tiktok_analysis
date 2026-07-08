package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeiExtraInfo {

    @C09CT("resume_cohost")
    public final SeiMultiCoHostStreamInfo anchorStreamStatusInfo;

    @C09CT("avatar")
    public final SeiAvatarInfo avatarInfo;

    @C09CT("countdown")
    public final SeiCountdownGuestInfo guestCountdownInfo;

    @C09CT("show_info")
    public final SeiLiveShowGuestInfo guestLiveShowInfo;

    @C09CT("noticeboard")
    public final SeiNoticeboardInfo noticeboardInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiExtraInfo)) {
            return false;
        }
        SeiExtraInfo seiExtraInfo = (SeiExtraInfo) obj;
        return Intrinsics.LJFF(this.guestLiveShowInfo, seiExtraInfo.guestLiveShowInfo) && Intrinsics.LJFF(this.anchorStreamStatusInfo, seiExtraInfo.anchorStreamStatusInfo) && Intrinsics.LJFF(this.guestCountdownInfo, seiExtraInfo.guestCountdownInfo) && Intrinsics.LJFF(this.noticeboardInfo, seiExtraInfo.noticeboardInfo) && Intrinsics.LJFF(this.avatarInfo, seiExtraInfo.avatarInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiExtraInfo(guestLiveShowInfo=");
        sbLIZ.append(this.guestLiveShowInfo);
        sbLIZ.append(", anchorStreamStatusInfo=");
        sbLIZ.append(this.anchorStreamStatusInfo);
        sbLIZ.append(", guestCountdownInfo=");
        sbLIZ.append(this.guestCountdownInfo);
        sbLIZ.append(", noticeboardInfo=");
        sbLIZ.append(this.noticeboardInfo);
        sbLIZ.append(", avatarInfo=");
        sbLIZ.append(this.avatarInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiExtraInfo(SeiLiveShowGuestInfo seiLiveShowGuestInfo, SeiMultiCoHostStreamInfo seiMultiCoHostStreamInfo, SeiCountdownGuestInfo seiCountdownGuestInfo, SeiNoticeboardInfo seiNoticeboardInfo, SeiAvatarInfo seiAvatarInfo) {
        this.guestLiveShowInfo = seiLiveShowGuestInfo;
        this.anchorStreamStatusInfo = seiMultiCoHostStreamInfo;
        this.guestCountdownInfo = seiCountdownGuestInfo;
        this.noticeboardInfo = seiNoticeboardInfo;
        this.avatarInfo = seiAvatarInfo;
    }
}
