package kotlin.jvm.internal;

import X.AbstractC2213701BkW;
import X.AbstractRunnableC820240WFq;
import X.C09AY;
import X.C0WG4;
import X.C0WG5;
import X.C0WRN;
import X.C0WST;
import X.C0WSU;
import X.C0WZJ;
import X.C0WZO;
import X.C0WZW;
import X.C0WZX;
import X.C0XLQ;
import X.C1161920gLG;
import X.C1237330iIt;
import X.C20441214yg;
import X.C2188811AlT;
import X.C238400w2;
import X.C786410Ut5;
import X.C800950VbR;
import X.C800960VbS;
import X.C814390Vx7;
import X.C820210WFn;
import X.C840660WyO;
import X.C849020XSi;
import X.EnumC820330WFz;
import X.EnumC994770bzf;
import X.InterfaceC634840OvC;
import X.InterfaceC849040XSk;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl;
import com.bytedance.helios.network.pipeline.ModifyConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.ttm.TTMParamData;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS414S0200000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS414S0200000_13 awS414S0200000_13) {
        String strLJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(CostTimeline)\nOkHttp_intercept(cost = ");
        sbLIZ.append(((C238400w2) awS414S0200000_13.l0).element / ((long) 1000000));
        sbLIZ.append(" millisecond)\n");
        C840660WyO c840660WyO = (C840660WyO) awS414S0200000_13.l1;
        if (c840660WyO != null) {
            strLJIILL = c840660WyO.LJIILL();
        } else {
            strLJIILL = null;
        }
        sbLIZ.append(strLJIILL);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS414S0200000_13 awS414S0200000_13) {
        Integer numValueOf;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getQueries isHitCache:false size: ");
        sbLIZ.append(((HashMap) awS414S0200000_13.l0).size());
        sbLIZ.append(" url: ");
        C0XLQ c0xlq = (C0XLQ) awS414S0200000_13.l1;
        if (c0xlq != null && (str = c0xlq.LJIIIIZZ) != null) {
            numValueOf = Integer.valueOf(str.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.queryLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadResources error: ");
        sbLIZ.append(((IPumbaaModuleInitService) awS414S0200000_13.l0).name());
        sbLIZ.append(" : ");
        sbLIZ.append(((Throwable) awS414S0200000_13.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS414S0200000_13 awS414S0200000_13) {
        ((AbstractC2213701BkW) awS414S0200000_13.l0).LJIIJJI((TTMParamData) awS414S0200000_13.l1, false);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0WZO) awS414S0200000_13.l0).name());
        sbLIZ.append(" start validate >> ");
        sbLIZ.append((C0WZJ) awS414S0200000_13.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0WZO) awS414S0200000_13.l0).name());
        sbLIZ.append(" intercept >> ");
        sbLIZ.append((C0WZJ) awS414S0200000_13.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0WZO) awS414S0200000_13.l0).name());
        sbLIZ.append(" start guard >> ");
        sbLIZ.append((C0WZJ) awS414S0200000_13.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0WZO) awS414S0200000_13.l0).name());
        sbLIZ.append(" process exception: ");
        sbLIZ.append((Exception) awS414S0200000_13.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fuse >> ");
        sbLIZ.append((C0WZJ) awS414S0200000_13.l0);
        sbLIZ.append("  action >> ");
        sbLIZ.append(((C0WRN) awS414S0200000_13.l1).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WRAP_CREATE_FAIL mode=");
        sbLIZ.append((EnumC994770bzf) awS414S0200000_13.l0);
        sbLIZ.append(" error=");
        sbLIZ.append(((IOException) awS414S0200000_13.l1).getClass().getSimpleName());
        sbLIZ.append(" msg=");
        sbLIZ.append(((IOException) awS414S0200000_13.l1).getMessage());
        sbLIZ.append(" fallback=origin_stream");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS414S0200000_13 awS414S0200000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModifyConfig.modify id: ");
        sbLIZ.append(((C840660WyO) awS414S0200000_13.l0).LIZ.LIZ.LIZ);
        sbLIZ.append(" modifyConfig: ");
        sbLIZ.append((ModifyConfig) awS414S0200000_13.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS414S0200000_13 awS414S0200000_13) throws Throwable {
        FirebaseAnalytics firebaseAnalytics = ((C0WG5) awS414S0200000_13.l0).LIZ;
        Map map = (Map) awS414S0200000_13.l1;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bZtQZRElSwVrkXl8Q+gfSDKB5vNaXndutmOfs", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {map};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/util/Map;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11060, "com/google/firebase/analytics/FirebaseAnalytics", "setConsent", firebaseAnalytics, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11060, "com/google/firebase/analytics/FirebaseAnalytics", "setConsent", null, objArr, firebaseAnalytics, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    firebaseAnalytics = (FirebaseAnalytics) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    map = (Map) obj2;
                }
            }
            firebaseAnalytics.getClass();
            final Bundle bundle = new Bundle();
            C0WG4 c0wg4 = (C0WG4) map.get(EnumC820330WFz.AD_STORAGE);
            if (c0wg4 != null) {
                int iOrdinal = c0wg4.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        C786410Ut5.LJJJI("ad_storage", "denied", bundle);
                    }
                } else {
                    C786410Ut5.LJJJI("ad_storage", "granted", bundle);
                }
            }
            C0WG4 c0wg42 = (C0WG4) map.get(EnumC820330WFz.ANALYTICS_STORAGE);
            if (c0wg42 != null) {
                int iOrdinal2 = c0wg42.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        C786410Ut5.LJJJI("analytics_storage", "denied", bundle);
                    }
                } else {
                    C786410Ut5.LJJJI("analytics_storage", "granted", bundle);
                }
            }
            C0WG4 c0wg43 = (C0WG4) map.get(EnumC820330WFz.AD_USER_DATA);
            if (c0wg43 != null) {
                int iOrdinal3 = c0wg43.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        C786410Ut5.LJJJI("ad_user_data", "denied", bundle);
                    }
                } else {
                    C786410Ut5.LJJJI("ad_user_data", "granted", bundle);
                }
            }
            C0WG4 c0wg44 = (C0WG4) map.get(EnumC820330WFz.AD_PERSONALIZATION);
            if (c0wg44 != null) {
                int iOrdinal4 = c0wg44.ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1) {
                        C786410Ut5.LJJJI("ad_personalization", "denied", bundle);
                    }
                } else {
                    C786410Ut5.LJJJI("ad_personalization", "granted", bundle);
                }
            }
            final C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, bundle) { // from class: X.0WFy
                public final /* synthetic */ Bundle LLILZIL;
                public final /* synthetic */ C820210WFn LLILZLL;

                @Override // X.AbstractRunnableC820240WFq
                public final void LIZ() {
                    InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                    C0W3J.LJIIIIZZ(interfaceC820490WGp);
                    interfaceC820490WGp.setConsentThirdParty(this.LLILZIL, this.LL);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c820210WFn, true);
                    this.LLILZIL = bundle;
                    this.LLILZLL = c820210WFn;
                }
            });
            c0wst.LIZ(11060, "com/google/firebase/analytics/FirebaseAnalytics", "setConsent", null, objArr, firebaseAnalytics, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$4(AwS414S0200000_13 awS414S0200000_13) {
        Activity activityLIZLLL;
        Activity activityLIZLLL2;
        Activity activityLIZLLL3;
        String pageName = ((InterfaceC849040XSk) awS414S0200000_13.l0).getPageName();
        int iHashCode = pageName.hashCode();
        if (iHashCode != -1818618242) {
            if (iHashCode != -1642579952) {
                if (iHashCode == 985115772 && pageName.equals("app_setting_page")) {
                    C849020XSi c849020XSi = (C849020XSi) awS414S0200000_13.l1;
                    c849020XSi.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("package:");
                    sbLIZ.append(GlobalContext.getApplicationContext().getPackageName());
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                    try {
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965697);
                        InterfaceC634840OvC interfaceC634840OvC = c849020XSi.IBridgeSdkContext;
                        if (interfaceC634840OvC != null && (activityLIZLLL3 = interfaceC634840OvC.LIZLLL()) != null) {
                            C849020XSi.LIZJ(activityLIZLLL3, intent);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e.getMessage());
                    }
                }
            } else if (pageName.equals("battery_setting_page")) {
                C849020XSi c849020XSi2 = (C849020XSi) awS414S0200000_13.l1;
                c849020XSi2.getClass();
                Intent intent2 = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                try {
                    ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent2, 1207965697);
                    InterfaceC634840OvC interfaceC634840OvC2 = c849020XSi2.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null && (activityLIZLLL2 = interfaceC634840OvC2.LIZLLL()) != null) {
                        C849020XSi.LIZJ(activityLIZLLL2, intent2);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e2.getMessage());
                }
            }
        } else if (pageName.equals("home_setting_page")) {
            C849020XSi c849020XSi3 = (C849020XSi) awS414S0200000_13.l1;
            c849020XSi3.getClass();
            Intent intent3 = new Intent("android.settings.SETTINGS");
            try {
                ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent3, 1207965697);
                InterfaceC634840OvC interfaceC634840OvC3 = c849020XSi3.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (activityLIZLLL = interfaceC634840OvC3.LIZLLL()) != null) {
                    C849020XSi.LIZJ(activityLIZLLL, intent3);
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20441214yg.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e3.getMessage());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS414S0200000_13 awS414S0200000_13) {
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) ((InterfaceC853790XeT) awS414S0200000_13.l0)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS414S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS414S0200000_13 awS414S0200000_13) {
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) awS414S0200000_13.l0)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS414S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS414S0200000_13 awS414S0200000_13) {
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) awS414S0200000_13.l0)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS414S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS414S0200000_13 awS414S0200000_13) {
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) ((InterfaceC853790XeT) awS414S0200000_13.l0)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS414S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS414S0200000_13 awS414S0200000_13) {
        C800960VbS c800960VbS = (C800960VbS) awS414S0200000_13.l0;
        C800950VbR c800950VbR = (C800950VbR) awS414S0200000_13.l1;
        c800960VbS.getClass();
        c800950VbR.getClass();
        Pair pair = new Pair(Long.valueOf(c800950VbR.LIZ.get()), Integer.valueOf(c800950VbR.LIZIZ.get()));
        c800950VbR.LIZ.set(0L);
        c800950VbR.LIZIZ.set(0);
        long jLongValue = ((Number) pair.getFirst()).longValue();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(jLongValue));
        map.put("calculate_count", String.valueOf(iIntValue));
        map.put("is_new_user", String.valueOf(((Boolean) c800960VbS.LIZJ.getValue()).booleanValue()));
        return map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C238400w2 c238400w2, C840660WyO c840660WyO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c840660WyO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C800960VbS c800960VbS, C800950VbR c800950VbR, int i) {
        super(0);
        this.$t = i;
        this.l0 = c800960VbS;
        this.l1 = c800950VbR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS414S0200000_13(C0WG5 c0wg5, C0WG5 c0wg52, Map<EnumC820330WFz, ? extends C0WG4> map) {
        super(0);
        this.$t = map;
        this.l0 = c0wg5;
        this.l1 = c0wg52;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C0WZJ c0wzj, C0WRN c0wrn, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0wzj;
        this.l1 = c0wrn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C0WZO c0wzo, C0WZJ c0wzj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0wzo;
        this.l1 = c0wzj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C0WZO c0wzo, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0wzo;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(C840660WyO c840660WyO, ModifyConfig modifyConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = c840660WyO;
        this.l1 = modifyConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(InterfaceC849040XSk interfaceC849040XSk, C849020XSi c849020XSi, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC849040XSk;
        this.l1 = c849020XSi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC853790XeT;
        this.l1 = c1237330iIt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(EnumC994770bzf enumC994770bzf, IOException iOException, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC994770bzf;
        this.l1 = iOException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(AbstractC2213701BkW abstractC2213701BkW, TTMParamData tTMParamData, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC2213701BkW;
        this.l1 = tTMParamData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS414S0200000_13(IPumbaaModuleInitService iPumbaaModuleInitService, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = iPumbaaModuleInitService;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS414S0200000_13(HashMap map, HashMap<String, List<String>> map2, C0XLQ c0xlq) {
        super(0);
        this.$t = c0xlq;
        this.l0 = map;
        this.l1 = map2;
    }
}
