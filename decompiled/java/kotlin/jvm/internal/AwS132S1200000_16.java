package kotlin.jvm.internal;

import X.AbstractC1008090cL9;
import X.AbstractC1051250dSl;
import X.AbstractC1542100qES;
import X.C013C;
import X.C09AY;
import X.C1007900cKq;
import X.C1008420cLg;
import X.C1009980cOC;
import X.C1010440cOw;
import X.C1014710cVp;
import X.C1014730cVr;
import X.C1017800cao;
import X.C1027360cqE;
import X.C1028380crs;
import X.C1029750cu5;
import X.C1029760cu6;
import X.C1030130cuh;
import X.C1039700dA8;
import X.C1044750dIH;
import X.C1076870e85;
import X.C1554300qY8;
import X.C19EG;
import X.C1D2P;
import X.C2188811AlT;
import X.C259800zU;
import X.C288730BTj;
import X.C443120HZe;
import X.EnumC1039670dA5;
import X.InterfaceC1007930cKt;
import X.InterfaceC1017820caq;
import X.InterfaceC1023400cjq;
import X.InterfaceC1051160dSc;
import X.InterfaceC1541990qEH;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.experiment.AnalyticsSDUISetting;
import com.ss.android.ugc.aweme.feed.model.AdAnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AwS132S1200000_16 extends C09AY implements Function0 {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS132S1200000_16 r39) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS132S1200000_16.invoke$0(kotlin.jvm.internal.AwS132S1200000_16):java.lang.Object");
    }

    public static final Object invoke$1(AwS132S1200000_16 awS132S1200000_16) {
        ((C1030130cuh) awS132S1200000_16.l1).getAnchorTitleFromXml().setText(awS132S1200000_16.s0);
        ((C1030130cuh) awS132S1200000_16.l1).setSecondLineText((AdAnchorsExtras) awS132S1200000_16.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS132S1200000_16 awS132S1200000_16) {
        ((C013C) awS132S1200000_16.l1).element = false;
        Context context = (Context) awS132S1200000_16.l2;
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = awS132S1200000_16.s0;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402685965);
        C1554300qY8.LIZIZ(context, sparkThirdContext);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS132S1200000_16 awS132S1200000_16) {
        ((C1076870e85) awS132S1200000_16.l1).LJJI();
        C1076870e85 c1076870e85 = (C1076870e85) awS132S1200000_16.l1;
        c1076870e85.LLIZLLLIL.storeInt("ai_comment_banner_counter_hide", c1076870e85.LLIZLLLIL.getInt("ai_comment_banner_counter_hide", 0) + 1);
        C1076870e85 c1076870e852 = (C1076870e85) awS132S1200000_16.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1076870e85) awS132S1200000_16.l1).LLIZLLLIL.getString("ai_comment_banner_interacted_video_ids", ""));
        sbLIZ.append(',');
        sbLIZ.append(((Aweme) awS132S1200000_16.l2).getAid());
        c1076870e852.LLIZLLLIL.storeString("ai_comment_banner_interacted_video_ids", C2188811AlT.LIZIZ(sbLIZ));
        C1076870e85 c1076870e853 = (C1076870e85) awS132S1200000_16.l1;
        String str = awS132S1200000_16.s0;
        Aweme aweme = (Aweme) awS132S1200000_16.l2;
        c1076870e853.getClass();
        C1076870e85.LJJIFFI(aweme, "hide", str);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS132S1200000_16 awS132S1200000_16) {
        AnalyticsSDUISetting.H5AnalyticsInfoStructJsonModel h5AnalyticsInfoStructJsonModelLIZ = AnalyticsSDUISetting.LIZ();
        if (h5AnalyticsInfoStructJsonModelLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.detailEntryURL);
            sbLIZ.append(((Aweme) awS132S1200000_16.l1).getAid());
            sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.queryParams);
            sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.queryParamsCommentHeader);
            SmartRouter.buildRoute(((C1076870e85) awS132S1200000_16.l2).getContext(), C2188811AlT.LIZIZ(sbLIZ)).open();
        }
        ((C1076870e85) awS132S1200000_16.l2).LJJI();
        C1076870e85 c1076870e85 = (C1076870e85) awS132S1200000_16.l2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((C1076870e85) awS132S1200000_16.l2).LLIZLLLIL.getString("ai_comment_banner_interacted_video_ids", ""));
        sbLIZ2.append(',');
        sbLIZ2.append(((Aweme) awS132S1200000_16.l1).getAid());
        c1076870e85.LLIZLLLIL.storeString("ai_comment_banner_interacted_video_ids", C2188811AlT.LIZIZ(sbLIZ2));
        C1076870e85 c1076870e852 = (C1076870e85) awS132S1200000_16.l2;
        String str = awS132S1200000_16.s0;
        Aweme aweme = (Aweme) awS132S1200000_16.l1;
        c1076870e852.getClass();
        C1076870e85.LJJIFFI(aweme, "view_insights", str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS132S1200000_16 awS132S1200000_16) {
        ((AbstractC1542100qES) awS132S1200000_16.l1).LJLIIL((InterfaceC1541990qEH) awS132S1200000_16.l2, awS132S1200000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS132S1200000_16 awS132S1200000_16) {
        boolean z;
        boolean z2;
        EnumC1039670dA5 enumC1039670dA5 = EnumC1039670dA5.LOAD_URL;
        String scene = ((AbstractC1051250dSl) awS132S1200000_16.l1).getScene();
        String str = awS132S1200000_16.s0;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) awS132S1200000_16.l1;
        C1028380crs c1028380crs = abstractC1051250dSl.hybridContainerOption;
        boolean z3 = true;
        if (abstractC1051250dSl.iAdHybridLoadStatus == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (((InterfaceC1051160dSc) awS132S1200000_16.l2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        InterfaceC1051160dSc interfaceC1051160dSc = (InterfaceC1051160dSc) awS132S1200000_16.l2;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z3 = false;
        }
        C1029750cu5.LIZ(enumC1039670dA5, scene, str, c1028380crs, new C1029760cu6(null, boolValueOf, boolValueOf2, Boolean.valueOf(z3)));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS132S1200000_16 awS132S1200000_16) {
        C1039700dA8.LJ(((AdWebViewClient) awS132S1200000_16.l1).adWebViewExtension, (WebView) awS132S1200000_16.l2, awS132S1200000_16.s0, true, 0, "");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS132S1200000_16 awS132S1200000_16) {
        C1044750dIH c1044750dIH = (C1044750dIH) awS132S1200000_16.l1;
        String str = awS132S1200000_16.s0;
        c1044750dIH.getClass();
        C1044750dIH.LIZ(str);
        ((Function0) awS132S1200000_16.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS132S1200000_16 awS132S1200000_16) {
        C1D2P c1d2pLJIIIIZZ;
        InterfaceC1017820caq interfaceC1017820caqLJIIJJI = ((C1017800cao) awS132S1200000_16.l1).LJIIJJI();
        if (interfaceC1017820caqLJIIJJI != null) {
            interfaceC1017820caqLJIIJJI.LJJL(awS132S1200000_16.s0);
        }
        InterfaceC1017820caq interfaceC1017820caqLJIIJJI2 = ((C1017800cao) awS132S1200000_16.l1).LJIIJJI();
        if (interfaceC1017820caqLJIIJJI2 != null && (c1d2pLJIIIIZZ = interfaceC1017820caqLJIIJJI2.LJIIIIZZ((AwemeRawAd) awS132S1200000_16.l2)) != null) {
            c1d2pLJIIIIZZ.LJJIIZI(null, "homepage_ad", null, "cip_cancel");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS132S1200000_16 awS132S1200000_16) {
        if (!((Boolean) C288730BTj.LIZIZ.getValue()).booleanValue() || !((C1014730cVr) awS132S1200000_16.l1).LLLF) {
            ((C1014730cVr) awS132S1200000_16.l1).LLL.offer(new C1014710cVp(awS132S1200000_16.s0, (JSONObject) awS132S1200000_16.l2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS132S1200000_16 awS132S1200000_16) {
        AnoleComponentModel anoleComponentModelAk;
        String str;
        InterfaceC1007930cKt interfaceC1007930cKt = ((C1007900cKq) awS132S1200000_16.l1).LJII.get(awS132S1200000_16.s0);
        if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null && (str = anoleComponentModelAk.slotID) != null) {
            ((C1007900cKq) awS132S1200000_16.l1).LJIIJJI.offer(new C1008420cLg(awS132S1200000_16.s0, str, (AbstractC1008090cL9) awS132S1200000_16.l2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS132S1200000_16 awS132S1200000_16) {
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(((C1010440cOw) awS132S1200000_16.l1).LLILZIL);
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJZ.getValue(), new AwS100S1200000_16((C1010440cOw) awS132S1200000_16.l1, awS132S1200000_16.s0, (C013C) awS132S1200000_16.l2, 9));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS132S1200000_16(X.C1076870e85 r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 11 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS132S1200000_16.<init>(X.0e85, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1007900cKq c1007900cKq, String str, AbstractC1008090cL9 abstractC1008090cL9, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1007900cKq;
        this.s0 = str;
        this.l2 = abstractC1008090cL9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1010440cOw c1010440cOw, String str, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1010440cOw;
        this.s0 = str;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1014730cVr c1014730cVr, String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1014730cVr;
        this.s0 = str;
        this.l2 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1017800cao c1017800cao, String str, AwemeRawAd awemeRawAd, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1017800cao;
        this.s0 = str;
        this.l2 = awemeRawAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S1200000_16(C1027360cqE c1027360cqE, C1027360cqE c1027360cqE2, C259800zU<C19EG> c259800zU, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1027360cqE;
        this.l2 = c1027360cqE2;
        this.s0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1030130cuh c1030130cuh, String str, AdAnchorsExtras adAnchorsExtras, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1030130cuh;
        this.s0 = str;
        this.l2 = adAnchorsExtras;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(C1044750dIH c1044750dIH, String str, AwS417S0200000_16 awS417S0200000_16, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1044750dIH;
        this.s0 = str;
        this.l2 = awS417S0200000_16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(AbstractC1051250dSl abstractC1051250dSl, String str, InterfaceC1051160dSc interfaceC1051160dSc, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1051250dSl;
        this.s0 = str;
        this.l2 = interfaceC1051160dSc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(AbstractC1542100qES abstractC1542100qES, InterfaceC1541990qEH interfaceC1541990qEH, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1542100qES;
        this.l2 = interfaceC1541990qEH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(Context context, String str, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l1 = c013c;
        this.l2 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1200000_16(AdWebViewClient adWebViewClient, WebView webView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = adWebViewClient;
        this.l2 = webView;
        this.s0 = str;
    }
}
