package kotlin.jvm.internal;

import X.C09AJ;
import X.C09AY;
import X.C09HI;
import X.C09HJ;
import X.C0DTS;
import X.C0Q2K;
import X.C1309830kBp;
import X.C1325290kal;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C143400gi;
import X.C1537900q7g;
import X.C1538590q8n;
import X.C1541950qED;
import X.C1848510yCf;
import X.C19482611Ke;
import X.C19EG;
import X.C1D3S;
import X.C20248814Kw;
import X.C20684815ws;
import X.C2365409Oq;
import X.C639490P6l;
import X.C639570P6t;
import X.C649470Pdh;
import X.C662770Pz9;
import X.C665760Q9m;
import X.C675340QeK;
import X.C676050QfT;
import X.C676320Qfu;
import X.C677480Qhm;
import X.C682210QpP;
import X.C682230QpR;
import X.C684410Qsx;
import X.C684470Qt3;
import X.C684850Qtf;
import X.C736680Sv4;
import X.C957403oi;
import X.EnumC2211841BhW;
import X.EnumC682220QpQ;
import X.InterfaceC683840Qs2;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model.VideoVerticalResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.landingpage.ui.SearchSimpleLandingPageFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchVideoDocItemCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class AwS124S1100000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        String imprId;
        C675340QeK c675340QeK = (C675340QeK) obj;
        String str = awS124S1100000_10.s0;
        if (str == null) {
            str = "";
        }
        LogPbBean logPbBean = ((VideoVerticalResponse) awS124S1100000_10.l1).logPb;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        return C675340QeK.LIZ(c675340QeK, str, imprId, null, null, 12);
    }

    public static final Object invoke$1(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("log_id", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchlogId());
        c957403oi.LIZLLL("search_entrance", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchEntrance());
        c957403oi.LIZLLL("search_position", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchPosition());
        c957403oi.LIZLLL("button_type", awS124S1100000_10.s0);
        c957403oi.LIZLLL("action_type", "long_press_feedback");
        c957403oi.LIZLLL("text_type", "recom_search_feedback");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = awS124S1100000_10.s0;
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) awS124S1100000_10.l1;
        linkedHashMap.put("lcp_start_time_ms", str);
        linkedHashMap.put("search_keyword", searchJediMixFeedFragment.dS());
        linkedHashMap.put("search_enter_method", searchJediMixFeedFragment.LLJJIJI);
        ((C0Q2K) obj).LIZ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C665760Q9m c665760Q9m = (C665760Q9m) obj;
        Map<String, List<Aweme>> map = c665760Q9m.LLILLL;
        map.put(awS124S1100000_10.s0, (List) awS124S1100000_10.l1);
        return C665760Q9m.LIZ(c665760Q9m, null, null, map, null, null, 27);
    }

    public static final Object invoke$12(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C1848510yCf) obj).LJFF(new AwS124S1100000_10((C662770Pz9) awS124S1100000_10.l1, awS124S1100000_10.s0, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C0Q2K c0q2k = (C0Q2K) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C662770Pz9 c662770Pz9 = (C662770Pz9) awS124S1100000_10.l1;
        String str = awS124S1100000_10.s0;
        linkedHashMap.put("lcp_end_time_ms", c662770Pz9.LIZJ);
        if (str != null) {
            linkedHashMap.put("card_start_time_ms", str);
        }
        linkedHashMap.put("is_first_screen", "1");
        Map<String, String> map = c662770Pz9.LIZLLL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        c0q2k.LIZ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS124S1100000_10 awS124S1100000_10, Object obj) throws JSONException {
        String str;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            byte[] bArrLIZLLL = C1325290kal.LIZLLL(bitmap);
            C09AJ c09aj = (C09AJ) awS124S1100000_10.l1;
            TypedByteArray typedByteArrayLIZIZ = C2365409Oq.LIZIZ(bArrLIZLLL);
            Integer numValueOf = Integer.valueOf(bitmap.getWidth());
            Integer numValueOf2 = Integer.valueOf(bitmap.getHeight());
            C09HJ c09hj = C09HI.LIZ;
            String str2 = awS124S1100000_10.s0;
            c09hj.getClass();
            if (C09HJ.LIZ(str2)) {
                str = awS124S1100000_10.s0;
            } else {
                str = null;
            }
            c09aj.onNext(new C676050QfT(typedByteArrayLIZIZ, null, null, null, numValueOf, numValueOf2, str));
            C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(428));
        } else {
            ((C09AJ) awS124S1100000_10.l1).onError(new Throwable());
            C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(429));
            C676320Qfu.LIZ("image fetch failed");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        Map map = (Map) awS124S1100000_10.l1;
        C639570P6t c639570P6t = C639570P6t.LIZ;
        String str = awS124S1100000_10.s0;
        c639570P6t.getClass();
        List listLJFF = C639570P6t.LJFF(str, map);
        obj.getClass();
        return new C143400gi(map, listLJFF);
    }

    public static final Object invoke$16(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        Object objLIZIZ = ((C677480Qhm) awS124S1100000_10.l1).LIZIZ(awS124S1100000_10.s0);
        if (objLIZIZ != null) {
            sparkContext.LJJLIIIJ(objLIZIZ, "abParams");
        }
        C1538590q8n c1538590q8n = sparkContext.liteLynxConfig;
        if (c1538590q8n != null) {
            c1538590q8n.LIZIZ = true;
            c1538590q8n.LIZLLL = true;
            c1538590q8n.LJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS124S1100000_10.l1).getResources().getString(2131844861), new AwS124S1100000_10((Context) awS124S1100000_10.l1, awS124S1100000_10.s0, 18));
        c1397620mTQ.LIZJ(1, ((Context) awS124S1100000_10.l1).getResources().getString(2131844860), new AwS55S1000000_4(awS124S1100000_10.s0, 5));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C0DTS.LIZ.getClass();
        String strLIZ = C0DTS.LIZ(0, "claim_store");
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = (Context) awS124S1100000_10.l1;
        SparkContext sparkContext = new SparkContext();
        if (strLIZ == null) {
            strLIZ = "";
        }
        sparkContext.LJJLIIJ(strLIZ);
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", awS124S1100000_10.s0);
        linkedHashMap.put("action", "switch");
        C20684815ws.LJIILLIIL("claim_store_popup_result", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C1309830kBp c1309830kBp = (C1309830kBp) obj;
        if (((C1D3S) awS124S1100000_10.l1) == C1D3S.PRE_LAYOUT) {
            c1309830kBp.LJIJ = true;
            c1309830kBp.LJIIIZ = true;
            c1309830kBp.LJIIJ = true;
        }
        if (C649470Pdh.LJIILJJIL(awS124S1100000_10.s0)) {
            c1309830kBp.LJII = true;
        }
        if (C649470Pdh.LJIIJ(awS124S1100000_10.s0)) {
            c1309830kBp.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("log_id", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchlogId());
        c957403oi.LIZLLL("search_entrance", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchEntrance());
        c957403oi.LIZLLL("search_position", ((InterfaceC683840Qs2) awS124S1100000_10.l1).getSearchPosition());
        c957403oi.LIZLLL("action_type", "long_press_feedback");
        c957403oi.LIZLLL("impr_id", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C684470Qt3) awS124S1100000_10.l1).LIZJ("confirm", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C684470Qt3) awS124S1100000_10.l1).LIZJ("cancel", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C684410Qsx) awS124S1100000_10.l1).LIZJ("confirm", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C684410Qsx) awS124S1100000_10.l1).LIZJ("center", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((C684410Qsx) awS124S1100000_10.l1).LIZJ("cancel", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS95S1000000_10(awS124S1100000_10.s0, 11);
        c20248814Kw.LIZIZ(new C684850Qtf((SearchVideoDocItemCell) awS124S1100000_10.l1, awS124S1100000_10.s0));
        C20248814Kw.LIZJ(c20248814Kw, true, false, 0.1f, 0, EnumC2211841BhW.NORMAL, null, null, 96);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        SearchSimpleLandingPageFragment searchSimpleLandingPageFragment = (SearchSimpleLandingPageFragment) awS124S1100000_10.l1;
        EnumC682220QpQ enumC682220QpQ = ((C682210QpP) obj).LLILZLL;
        searchSimpleLandingPageFragment.getClass();
        int i = C682230QpR.LIZ[enumC682220QpQ.ordinal()];
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        searchSimpleLandingPageFragment.LLIZLLLIL = z;
        C736680Sv4.LJIJJ(searchSimpleLandingPageFragment.NR(), new AwS589S0100000_10(searchSimpleLandingPageFragment, 661));
        ((SearchSimpleLandingPageFragment) awS124S1100000_10.l1).OR(awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((ShowSearchRSReportPanelMethod) awS124S1100000_10.l1).mobRelatedSearchReportConfirm("confirm", awS124S1100000_10.s0);
        ((ShowSearchRSReportPanelMethod) awS124S1100000_10.l1).openReportPage(awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((ShowSearchRSReportPanelMethod) awS124S1100000_10.l1).mobRelatedSearchReportConfirm("not_relevant", awS124S1100000_10.s0);
        C19EG c19eg = ((ShowSearchRSReportPanelMethod) awS124S1100000_10.l1).activity;
        if (c19eg != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIIZ(2131847191);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((OpenAlertMethod) awS124S1100000_10.l1).onButtonAction("confirm", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((OpenAlertMethod) awS124S1100000_10.l1).onButtonAction("center", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        ((OpenAlertMethod) awS124S1100000_10.l1).onButtonAction("cancel", awS124S1100000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS124S1100000_10 awS124S1100000_10, Object obj) {
        return ((C639490P6l) awS124S1100000_10.l1).LIZ.invoke(obj, awS124S1100000_10.s0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C639490P6l c639490P6l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c639490P6l;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C662770Pz9 c662770Pz9, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c662770Pz9;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C677480Qhm c677480Qhm, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c677480Qhm;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(InterfaceC683840Qs2 interfaceC683840Qs2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC683840Qs2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C684410Qsx c684410Qsx, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c684410Qsx;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C684470Qt3 c684470Qt3, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c684470Qt3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C19482611Ke c19482611Ke, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19482611Ke;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(C1D3S c1d3s, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1d3s;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(SearchSimpleLandingPageFragment searchSimpleLandingPageFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = searchSimpleLandingPageFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(OpenAlertMethod openAlertMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAlertMethod;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(ShowSearchRSReportPanelMethod showSearchRSReportPanelMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = showSearchRSReportPanelMethod;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(SearchVideoDocItemCell searchVideoDocItemCell, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = searchVideoDocItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(String str, VideoVerticalResponse videoVerticalResponse, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoVerticalResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1100000_10(String str, SearchJediMixFeedFragment searchJediMixFeedFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = searchJediMixFeedFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S1100000_10(String str, String str2, List<Aweme> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS124S1100000_10(Map map, Map<String, ? extends Object> map2, String str) {
        super(1);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
