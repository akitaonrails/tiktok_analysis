package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KaraokeSong_ProtoDecoder implements C0IMD<KaraokeSong> {
    public static KaraokeSong LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        KaraokeSong karaokeSong = new KaraokeSong();
        karaokeSong.coverUrls = new ArrayList();
        karaokeSong.labelIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        karaokeSong.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        karaokeSong.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        karaokeSong.displayArtist = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        karaokeSong.album = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        karaokeSong.duration = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        karaokeSong.prelude = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        karaokeSong.postlude = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        karaokeSong.coverVid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        karaokeSong.coverUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        karaokeSong.audioInfo = _AudioStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        karaokeSong.accompanimentInfo = _AccompanimentStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        karaokeSong.lyricInfo = _LyricStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        karaokeSong.songStatus = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        karaokeSong.labelIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 15:
                        karaokeSong.isFavorite = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 16:
                        karaokeSong.isAdded = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        karaokeSong.isRequest = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        karaokeSong.isYouSingRequest = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        karaokeSong.singer = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return karaokeSong;
            }
        }
    }

    public static void LJ(KaraokeSong karaokeSong) {
        if (karaokeSong.coverUrls == null) {
            karaokeSong.coverUrls = new ArrayList();
        }
        AudioStruct audioStruct = karaokeSong.audioInfo;
        if (audioStruct != null && audioStruct.audioUrls == null) {
            audioStruct.audioUrls = new ArrayList();
        }
        AccompanimentStruct accompanimentStruct = karaokeSong.accompanimentInfo;
        if (accompanimentStruct != null && accompanimentStruct.accompanimentUrls == null) {
            accompanimentStruct.accompanimentUrls = new ArrayList();
        }
        LyricStruct lyricStruct = karaokeSong.lyricInfo;
        if (lyricStruct != null && lyricStruct.klyricUrls == null) {
            lyricStruct.klyricUrls = new ArrayList();
        }
        if (karaokeSong.labelIds == null) {
            karaokeSong.labelIds = new ArrayList();
        }
        User user = karaokeSong.singer;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(KaraokeSong karaokeSong) {
        LJ(karaokeSong);
    }

    @Override // X.C0IMD
    public final KaraokeSong LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KaraokeSong karaokeSong, List list) {
    }
}
