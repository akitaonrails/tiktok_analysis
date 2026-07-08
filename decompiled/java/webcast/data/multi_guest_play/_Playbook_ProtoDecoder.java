package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Playbook_ProtoDecoder implements C0IMD<Playbook> {
    public static Playbook LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Playbook playbook = new Playbook();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playbook.playbookId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        playbook.authorInfo = _SimpleUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        playbook.content = _PlaybookContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        playbook.totalFavorites = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        playbook.totalUsage = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        playbook.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        playbook.updateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        playbook.isUpdatedVersion = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playbook.isMyFavorite = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playbook.isMyCreation = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        playbook.playbookVisibility = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        playbook.isModified = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        playbook.playbookType = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        playbook.automationUserSetting = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbook;
            }
        }
    }

    public static void LJ(Playbook playbook) {
        ImageModel imageModel;
        SimpleUser simpleUser = playbook.authorInfo;
        if (simpleUser != null && (imageModel = simpleUser.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            _PlaybookContent_ProtoDecoder.LJ(playbookContent);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Playbook playbook) {
        LJ(playbook);
    }

    @Override // X.C0IMD
    public final Playbook LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Playbook playbook, List list) {
    }
}
