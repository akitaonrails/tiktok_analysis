package kotlin.jvm.internal;

import X.AnonymousClass0957;
import X.C050Y;
import X.C066L;
import X.C069P;
import X.C06O1;
import X.C06YA;
import X.C098200Yq;
import X.C09AY;
import X.C09MB;
import X.C0WT9;
import X.C0ZML;
import X.C13LE;
import X.C1590906Kt;
import X.C1599206Ny;
import X.C1664806fW;
import X.C189200o6;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C639570P6t;
import X.EnumC12995056r;
import X.EnumC1665006fY;
import android.graphics.BitmapRegionDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AwS87S1000000_2 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return this.s0;
            case 30:
                return this.s0;
            case 31:
                return this.s0;
            case 32:
                return this.s0;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return this.s0;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return this.s0;
            case 35:
                return this.s0;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1000000_2(int i) {
        super(0);
        this.$t = i;
        this.s0 = "list data refresh";
    }

    public static final Object invoke$0(AwS87S1000000_2 awS87S1000000_2) {
        C639570P6t c639570P6t = C639570P6t.LIZ;
        String str = awS87S1000000_2.s0;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchReviewAggregationDetailVideoVM.class);
        c639570P6t.getClass();
        return C639570P6t.LIZ(str, c19719912DlLIZ);
    }

    public static final Object invoke$1(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResponse: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadNGWrapper before real preloadNG invoke channel: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable preload control start construct preload task scene: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real action invoke dispatched, scene: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpNode[");
        sbLIZ.append(awS87S1000000_2.s0);
        sbLIZ.append("] resetResult");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS87S1000000_2 awS87S1000000_2) {
        C639570P6t c639570P6t = C639570P6t.LIZ;
        String str = awS87S1000000_2.s0;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchReviewAggregationDetailVideoVM.class);
        c639570P6t.getClass();
        return C639570P6t.LIZ(str, c19719912DlLIZ);
    }

    public static final Object invoke$15(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseApiData, path = ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLynxImageLoaded, ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bizScene null! ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS87S1000000_2 awS87S1000000_2) {
        C066L c066l = C066L.LIZIZ;
        String str = awS87S1000000_2.s0;
        c066l.getClass();
        C066L.LIZIZ(str, true);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS87S1000000_2 awS87S1000000_2) {
        C066L c066l = C066L.LIZIZ;
        String str = awS87S1000000_2.s0;
        c066l.getClass();
        C066L.LIZIZ(str, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeGeneralExposureSource providerId: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanOnPageDetach exposePage= ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$21(AwS87S1000000_2 awS87S1000000_2) {
        String str = awS87S1000000_2.s0;
        return C2097608Jq.LJIIIIZZ(new Pair(EnumC12995056r.SHOW, Integer.valueOf(C1599206Ny.LIZJ(str, C06O1.SHOW))), new Pair(EnumC12995056r.CLICK, Integer.valueOf(C1599206Ny.LIZJ(str, C06O1.CLICK))), new Pair(EnumC12995056r.DISMISS, Integer.valueOf(C1599206Ny.LIZJ(str, C06O1.CLOSE))));
    }

    public static final Object invoke$22(AwS87S1000000_2 awS87S1000000_2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", awS87S1000000_2.s0);
            C189200o6.m2constructorimpl(jSONObject.put("start_preload_node", System.currentTimeMillis() - C050Y.LIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("live_inbox_preload_perf", jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSyncProgressInfo ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$24(AwS87S1000000_2 awS87S1000000_2) {
        C1664806fW.LIZIZ.LIZJ(new Pair(awS87S1000000_2.s0, EnumC1665006fY.AUTO_SWITCH));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadResources: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$26(AwS87S1000000_2 awS87S1000000_2) {
        return new C06YA(awS87S1000000_2.s0);
    }

    public static final Object invoke$27(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyPreloadViewLoadFinished prefetchKey: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$28(AwS87S1000000_2 awS87S1000000_2) {
        AnonymousClass0957<BitmapRegionDecoder> anonymousClass0957Remove = C09MB.LJ.remove(awS87S1000000_2.s0);
        if (anonymousClass0957Remove != null) {
            anonymousClass0957Remove.LIZIZ(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS87S1000000_2 awS87S1000000_2) {
        StreakLocalExtHelper streakLocalExtHelper = StreakLocalExtHelper.LIZ;
        String str = awS87S1000000_2.s0;
        streakLocalExtHelper.getClass();
        boolean zLIZLLL = StreakLocalExtHelper.LIZLLL(str, "streak_unlock_anim", null);
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakLocalExtHelper: clearStreakAnimInfo, convId=");
        sbLIZ.append(awS87S1000000_2.s0);
        sbLIZ.append(", result=");
        sbLIZ.append(zLIZLLL);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove cache node ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$37(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshUid ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$38(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache is not exist, wait network data to render, industry:");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$39(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channelStyle=");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateArticleStickerConfig success: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$40(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeFeedExposureSource providerId: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$41(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi-scene source not supported ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$42(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerService: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$43(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Bootstrap] permanently disabled for uid=");
        sbLIZ.append(awS87S1000000_2.s0);
        sbLIZ.append(", skip register triggers");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$44(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Bootstrap] setup noop: same uid=");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$45(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Bootstrap] teardownPreviousAccount oldUid=");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$46(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS87S1000000_2.s0);
        sbLIZ.append(" img loaded");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$47(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTemplateChannelByUrl failed ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$48(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchBcmConfig parse success, version: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$49(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sea_pdp_coupon_");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeSnapshot(");
        sbLIZ.append(awS87S1000000_2.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$50(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sea_pdp_coupon_button_");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$51(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsParamChecker init sceneName: ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$52(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove session failed, sessionId = ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$53(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove launch failed, sessionId = ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS87S1000000_2 awS87S1000000_2) {
        C0WT9 c0wt9 = C0WT9.LIZ;
        String str = awS87S1000000_2.s0;
        c0wt9.getClass();
        C0WT9.LJ("iab_clear_cookie_click", "dialog_cancel", str);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: checkDataChangeForVoucherBanner: reason=");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS87S1000000_2 awS87S1000000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load video ");
        sbLIZ.append(awS87S1000000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS87S1000000_2 awS87S1000000_2) {
        if (awS87S1000000_2.s0.length() > 0) {
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LIZLLL().LIZIZ(awS87S1000000_2.s0);
            IMProfileBridge.LIZ.getClass();
            IMProfileBridge iMProfileBridgeLIZ = C0ZML.LIZ();
            if (iMProfileBridgeLIZ != null) {
                iMProfileBridgeLIZ.LIZJ(awS87S1000000_2.s0, null, null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1000000_2(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
