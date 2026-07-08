package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RechargeCustomError_ProtoDecoder implements C0IMD<RechargeCustomError> {
    public static RechargeCustomError LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RechargeCustomError rechargeCustomError = new RechargeCustomError();
        rechargeCustomError.contentReplace = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rechargeCustomError.promptType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        rechargeCustomError.toastContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        rechargeCustomError.popUpTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rechargeCustomError.popUpContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        RechargePopUpContentReplace rechargePopUpContentReplaceLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        rechargePopUpContentReplaceLIZLLL = _RechargePopUpContentReplace_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (rechargePopUpContentReplaceLIZLLL != null) {
                                        rechargeCustomError.contentReplace.put(strLIZLLL, rechargePopUpContentReplaceLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        rechargeCustomError.popUpDismiss = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        rechargeCustomError.popUpDismissAction = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        rechargeCustomError.popUpPrimaryCta = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rechargeCustomError.popUpPrimaryCtaSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rechargeCustomError.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rechargeCustomError.popUpStyle = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        rechargeCustomError.linkToJump = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        rechargeCustomError.popUpPrimaryAction = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        rechargeCustomError.penaltyWarningSkip = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        rechargeCustomError.errCode = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        rechargeCustomError.popUpDismissCtaSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        rechargeCustomError.questionMarkCtaSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        rechargeCustomError.idvDecisionConf = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rechargeCustomError;
            }
        }
    }

    public static void LJ(RechargeCustomError rechargeCustomError) {
        Map<String, RechargePopUpContentReplace> map = rechargeCustomError.contentReplace;
        if (map == null) {
            rechargeCustomError.contentReplace = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, RechargePopUpContentReplace>> it2 = rechargeCustomError.contentReplace.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RechargeCustomError rechargeCustomError) {
        LJ(rechargeCustomError);
    }

    @Override // X.C0IMD
    public final RechargeCustomError LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RechargeCustomError rechargeCustomError, List list) {
    }
}
