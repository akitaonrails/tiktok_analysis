package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ToplivePageItem_ProtoDecoder implements C0IMD<ToplivePageItem> {
    public static ToplivePageItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ToplivePageItem toplivePageItem = new ToplivePageItem();
        toplivePageItem.subItems = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    toplivePageItem.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    toplivePageItem.enterMethod = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    toplivePageItem.relatedLiveNumber = c1516680pZS.LJIIJ();
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    toplivePageItem.defaultBgUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 14:
                                    toplivePageItem.lightBgUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 15:
                                    toplivePageItem.darkBgUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 16:
                                    toplivePageItem.defaultBgColor = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    toplivePageItem.cardTitle = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    toplivePageItem.cardType = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 19:
                                    toplivePageItem.matchDegree = c1516680pZS.LJIIJ();
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    toplivePageItem.lightBgColor = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 21:
                                    toplivePageItem.darkBgColor = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            toplivePageItem.subItems.add(LIZLLL(c1516680pZS));
                        }
                    } else {
                        toplivePageItem.itemName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    toplivePageItem.itemId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return toplivePageItem;
            }
        }
    }

    public static void LJ(ToplivePageItem toplivePageItem) {
        List<ToplivePageItem> list = toplivePageItem.subItems;
        if (list == null) {
            toplivePageItem.subItems = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ToplivePageItem toplivePageItem2 : toplivePageItem.subItems) {
                if (toplivePageItem2 != null) {
                    LJ(toplivePageItem2);
                }
            }
        }
        Room room = toplivePageItem.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ToplivePageItem toplivePageItem) {
        LJ(toplivePageItem);
    }

    @Override // X.C0IMD
    public final ToplivePageItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ToplivePageItem toplivePageItem, List list) {
    }
}
