package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownContent_ProtoDecoder implements C0IMD<GuestShowdownContent> {
    public static GuestShowdownContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownContent guestShowdownContent = new GuestShowdownContent();
        guestShowdownContent.leavePlayUsers = new ArrayList();
        guestShowdownContent.runningPlayUsers = new ArrayList();
        guestShowdownContent.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestShowdownContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guestShowdownContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guestShowdownContent.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestShowdownContent.playStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        guestShowdownContent.version = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guestShowdownContent.partyStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        guestShowdownContent.punishmentStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        guestShowdownContent.playConfig = _GuestShowdownConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        guestShowdownContent.runningPlayUsers.add(_GuestShowdownUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        guestShowdownContent.leavePlayUsers.add(_GuestShowdownUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        guestShowdownContent.streamId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        guestShowdownContent.runningStep = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        guestShowdownContent.contributors.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownContent;
            }
        }
    }

    public static void LJ(GuestShowdownContent guestShowdownContent) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
        if (list == null) {
            guestShowdownContent.runningPlayUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GuestShowdownUser guestShowdownUser : guestShowdownContent.runningPlayUsers) {
                if (guestShowdownUser != null && (imageModel = guestShowdownUser.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<GuestShowdownUser> list2 = guestShowdownContent.leavePlayUsers;
        if (list2 == null) {
            guestShowdownContent.leavePlayUsers = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (GuestShowdownUser guestShowdownUser2 : guestShowdownContent.leavePlayUsers) {
                if (guestShowdownUser2 != null && (imageModel2 = guestShowdownUser2.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        if (guestShowdownContent.contributors == null) {
            guestShowdownContent.contributors = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestShowdownContent guestShowdownContent) {
        LJ(guestShowdownContent);
    }

    @Override // X.C0IMD
    public final GuestShowdownContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownContent guestShowdownContent, List list) {
    }
}
