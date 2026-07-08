package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.AnonymousClass1295;
import X.AnonymousClass1298;
import X.C09AY;
import X.C11FW;
import X.C12PU;
import X.C1440005kM;
import X.C1528405yc;
import X.C1741890vQh;
import X.C1799610wvn;
import X.C1873590yr7;
import X.C19273110af;
import X.C19392510tv;
import X.C19651211uY;
import X.C19652311uj;
import X.C19653311ut;
import X.C19654411v4;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C849850XVn;
import X.EnumC1430380nKG;
import X.EnumC19646311tl;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.anchor.model.WikiAnchor;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public class AwS144S1200000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS144S1200000_29 awS144S1200000_29) throws JSONException {
        C1528405yc.LIZ((Integer) awS144S1200000_29.l1, "group_onboarding_card", "share_to_comment", awS144S1200000_29.s0);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS144S1200000_29.l2;
        String str = awS144S1200000_29.s0;
        c11fw.getClass();
        C11FW.LIZLLL(context, str, "group_onboarding_card");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS144S1200000_29 awS144S1200000_29) {
        C1528405yc.LIZ((Integer) awS144S1200000_29.l1, "group_onboarding_card", "share_to_post", awS144S1200000_29.s0);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS144S1200000_29.l2;
        String str = awS144S1200000_29.s0;
        c11fw.getClass();
        IMCameraBridgeApi iMCameraBridgeApi = (IMCameraBridgeApi) PluggableExtentionKt.pluggableSpiForReal(IMCameraBridgeApi.class);
        if (iMCameraBridgeApi != null) {
            iMCameraBridgeApi.LJIIZILJ(context, str, "group_onboarding_card");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS144S1200000_29 awS144S1200000_29) {
        C19392510tv c19392510tv = C19392510tv.LIZ;
        C19EG c19eg = (C19EG) awS144S1200000_29.l1;
        String str = awS144S1200000_29.s0;
        Map map = (Map) awS144S1200000_29.l2;
        c19392510tv.getClass();
        C19392510tv.LIZ(c19eg, str, map, false);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS144S1200000_29 awS144S1200000_29) {
        C19392510tv.LIZ.getClass();
        ((AbstractC1604130rqV) C19392510tv.LIZIZ.getValue()).LJIIIZ("request permission success");
        C19392510tv.LIZ((C19EG) awS144S1200000_29.l1, awS144S1200000_29.s0, (Map) awS144S1200000_29.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS144S1200000_29 awS144S1200000_29) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("533", "pip_android_confirmation_popup_btn", true);
        C19392510tv.LIZ.getClass();
        ((AbstractC1604130rqV) C19392510tv.LIZIZ.getValue()).LJIIIZ("request permission");
        C19EG c19eg = (C19EG) awS144S1200000_29.l1;
        C1873590yr7.LIZIZ(c19eg, new AwS144S1200000_29(c19eg, (C19EG) awS144S1200000_29.s0, (String) awS144S1200000_29.l2, (Map<String, String>) 11));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS144S1200000_29 awS144S1200000_29) {
        ((BagGuideTooltipController) awS144S1200000_29.l1).showTooltipV2(awS144S1200000_29.s0, (LiveBagIconAnimation) awS144S1200000_29.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS144S1200000_29 awS144S1200000_29) {
        ((BagGuideTooltipController) awS144S1200000_29.l1).showTooltipV2(awS144S1200000_29.s0, (LiveBagIconAnimation) awS144S1200000_29.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS144S1200000_29 awS144S1200000_29) {
        EnumC19646311tl enumC19646311tl;
        ((C19651211uY) awS144S1200000_29.l1).LIZIZ();
        C19651211uY c19651211uY = (C19651211uY) awS144S1200000_29.l1;
        c19651211uY.LIZIZ.LIZIZ(awS144S1200000_29.s0);
        NewsAnchorPublishViewModel newsAnchorPublishViewModel = (NewsAnchorPublishViewModel) awS144S1200000_29.l2;
        if (awS144S1200000_29.s0.length() > 0) {
            enumC19646311tl = EnumC19646311tl.CLEAR;
        } else {
            enumC19646311tl = EnumC19646311tl.NONE;
        }
        C19654411v4 c19654411v4 = new C19654411v4(enumC19646311tl, "", Boolean.FALSE, null, 8);
        newsAnchorPublishViewModel.getClass();
        newsAnchorPublishViewModel.setState(new AwS608S0100000_29(c19654411v4, 139));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS144S1200000_29 awS144S1200000_29) {
        EnumC19646311tl enumC19646311tl;
        ((C19651211uY) awS144S1200000_29.l1).LIZIZ();
        C19651211uY c19651211uY = (C19651211uY) awS144S1200000_29.l1;
        c19651211uY.LIZIZ.LIZIZ(awS144S1200000_29.s0);
        NewsAnchorPublishViewModel newsAnchorPublishViewModel = (NewsAnchorPublishViewModel) awS144S1200000_29.l2;
        if (awS144S1200000_29.s0.length() > 0) {
            enumC19646311tl = EnumC19646311tl.CLEAR;
        } else {
            enumC19646311tl = EnumC19646311tl.NONE;
        }
        C19652311uj c19652311uj = new C19652311uj(enumC19646311tl, new C19653311ut(true, ""));
        newsAnchorPublishViewModel.getClass();
        newsAnchorPublishViewModel.setState(new AwS608S0100000_29(c19652311uj, 138));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS144S1200000_29 awS144S1200000_29) {
        ((Function0) awS144S1200000_29.l1).invoke();
        ((C12PU) awS144S1200000_29.l2).LIZIZ(awS144S1200000_29.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS144S1200000_29 awS144S1200000_29) {
        String stringExtra;
        int type = EnumC1430380nKG.WIKIPEDIA.getTYPE();
        String str = awS144S1200000_29.s0;
        String str2 = ((AddWikiActivity) awS144S1200000_29.l1).LLJI;
        String stringExtra2 = null;
        if (str2 == null) {
            str2 = null;
        }
        C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(type, C1741890vQh.LJIIIIZZ(new WikiAnchor(str, str2)), awS144S1200000_29.s0, "", 1, "", null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null)));
        ((AddWikiActivity) awS144S1200000_29.l1).finish();
        C2344009Gk c2344009Gk = (C2344009Gk) awS144S1200000_29.l2;
        String str3 = ((AddWikiActivity) awS144S1200000_29.l1).LLJI;
        if (str3 == null) {
            str3 = null;
        }
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("language", str3);
        c2344009Gk.LJIIIIZZ("wiki_entry", awS144S1200000_29.s0);
        c2344009Gk.LJIIIIZZ("key_word", ((AddWikiActivity) awS144S1200000_29.l1).LLIZLLLIL);
        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        try {
            stringExtra = ((AddWikiActivity) awS144S1200000_29.l1).getIntent().getStringExtra("content_source");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c2344009Gk.LJIIIIZZ("content_source", stringExtra);
        try {
            stringExtra2 = ((AddWikiActivity) awS144S1200000_29.l1).getIntent().getStringExtra("content_type");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c2344009Gk.LJIIIIZZ("content_type", stringExtra2);
        C20684815ws.LJIILLIIL("add_wiki", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS144S1200000_29 awS144S1200000_29) {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ != null) {
            localTestApiLIZ.copyContent(awS144S1200000_29.s0, ((AnonymousClass1298) awS144S1200000_29.l1).itemView.getContext());
        }
        ((Function0) awS144S1200000_29.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS144S1200000_29 awS144S1200000_29) {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ != null) {
            localTestApiLIZ.copyContent(awS144S1200000_29.s0, ((AnonymousClass1295) awS144S1200000_29.l1).itemView.getContext());
        }
        ((Function0) awS144S1200000_29.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S1200000_29(C19EG c19eg, C19EG c19eg2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = c19eg;
        this.s0 = c19eg2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1200000_29(Context context, String str, Integer num, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1200000_29(BagGuideTooltipController bagGuideTooltipController, String str, LiveBagIconAnimation liveBagIconAnimation, int i) {
        super(0);
        this.$t = i;
        this.l1 = bagGuideTooltipController;
        this.s0 = str;
        this.l2 = liveBagIconAnimation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1200000_29(NewsAnchorPublishViewModel newsAnchorPublishViewModel, C19651211uY c19651211uY, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19651211uY;
        this.s0 = str;
        this.l2 = newsAnchorPublishViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S1200000_29(String str, String str2, AnonymousClass1295 anonymousClass1295, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = anonymousClass1295;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S1200000_29(String str, String str2, AnonymousClass1298 anonymousClass1298, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = anonymousClass1298;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1200000_29(String str, AddWikiActivity addWikiActivity, C2344009Gk c2344009Gk, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = addWikiActivity;
        this.l2 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S1200000_29(Function0 function0, Function0<Unit> function02, C12PU c12pu, String str) {
        super(0);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.s0 = c12pu;
    }
}
