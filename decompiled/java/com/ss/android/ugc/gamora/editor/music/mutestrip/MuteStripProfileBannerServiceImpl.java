package com.ss.android.ugc.gamora.editor.music.mutestrip;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0XQ7;
import X.C10I5;
import X.C10IO;
import X.C10IT;
import X.C2188811AlT;
import X.InterfaceC20660715sz;
import X.InterfaceC625970Ogt;
import android.view.ViewGroup;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.edit.IMuteStripProfileBannerService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class MuteStripProfileBannerServiceImpl implements IMuteStripProfileBannerService {
    public static IMuteStripProfileBannerService LIZ() {
        Object objLIZ = C04TD.LIZ(IMuteStripProfileBannerService.class, false);
        if (objLIZ != null) {
            return (IMuteStripProfileBannerService) objLIZ;
        }
        if (C04TD.s6 == null) {
            synchronized (IMuteStripProfileBannerService.class) {
                if (C04TD.s6 == null) {
                    C04TD.s6 = new MuteStripProfileBannerServiceImpl();
                }
            }
        }
        return C04TD.s6;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripProfileBannerService
    public final boolean shouldShowCopyrightViolationSnackBar(Aweme aweme) {
        String uid;
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && aweme.getAid() != null && aweme.getCreateTime() >= C10IO.LIZIZ().getLong("last_shown_banner_create_time", 0L)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC625970Ogt interfaceC625970OgtLIZIZ = C10IO.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append('_');
            sbLIZ.append(C10IO.LIZ(aweme));
            sbLIZ.append("_banner_last_show_time");
            if (jCurrentTimeMillis - interfaceC625970OgtLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) > 604800000) {
                C10IT.LIZ.getClass();
                if (C10IT.LJIIJ(aweme) || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) {
                    return false;
                }
                AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
                if (statusSafety2 == null || (mappedMuteStripStatus = statusSafety2.getMappedMuteStripStatus()) == null) {
                    mappedMuteStripStatus = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
                }
                if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_REMOVING || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UPDATING || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_SONGS_ADDED || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DIRECTLY_POSTED || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_ADD_SONGS || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_NO_SHOW) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripProfileBannerService
    public final void showCopyrightViolationSnackBar(ViewGroup viewGroup, InterfaceC20660715sz interfaceC20660715sz, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        PopupManager.LJIJI(new C10I5(viewGroup, interfaceC20660715sz, aweme, null, true, 8), true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aweme.getAid() != null) {
            InterfaceC625970Ogt interfaceC625970OgtLIZIZ = C10IO.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append('_');
            sbLIZ.append(C10IO.LIZ(aweme));
            sbLIZ.append("_banner_last_show_time");
            interfaceC625970OgtLIZIZ.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        }
        C10IO.LIZIZ().LJIIIIZZ("last_shown_banner_create_time", aweme.getCreateTime());
    }
}
