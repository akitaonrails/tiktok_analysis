package kotlin.jvm.internal;

import X.C09AY;
import X.C106Y;
import X.C10BM;
import X.C10EF;
import X.C10EJ;
import X.C10HL;
import X.C1397620mTQ;
import X.C1893050zMV;
import X.C1896420zRw;
import X.C1896470zS1;
import X.C191918106i;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.DialogC19307610gE;
import X.InterfaceC19307810gG;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyRecordingNoticeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseAccountExtra;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS142S1100000_28 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        if (((C1896420zRw) obj).LIZ == 10009) {
            ((C1896470zS1) awS142S1100000_28.l1).LIZ();
        } else {
            ((C1896470zS1) awS142S1100000_28.l1).LIZ();
            ((C1896470zS1) awS142S1100000_28.l1).LJJIFFI(awS142S1100000_28.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        ((C1896470zS1) awS142S1100000_28.l1).LJJIFFI(awS142S1100000_28.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                str = "close";
            }
            return Unit.LIZ;
        }
        str = "slide_close";
        String str2 = awS142S1100000_28.s0;
        PageFinder pageFinder = (PageFinder) awS142S1100000_28.l1;
        C1893050zMV.LIZ.getClass();
        C1893050zMV.LIZ(pageFinder, str2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        ((C10HL) awS142S1100000_28.l1).getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("toast_type", "clean_app");
        C20684815ws.LJIILLIIL("storage_toast_cancel", c2344009Gk.LIZ);
        C10HL.LIZ((C10HL) awS142S1100000_28.l1, "not_now", awS142S1100000_28.s0, null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C191918106i c191918106i = C191918106i.LIZ;
        String str = awS142S1100000_28.s0;
        c191918106i.getClass();
        C191918106i.LIZJ(1, str);
        ((Function0) awS142S1100000_28.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C10EF c10ef = (C10EF) awS142S1100000_28.l1;
        if (c10ef != null) {
            C10EJ.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c10ef.LIZJ);
            c2344009Gk.LJIIIIZZ("enter_method", c10ef.LIZLLL);
            c2344009Gk.LJIIIIZZ("room_id", c10ef.LIZ);
            c2344009Gk.LJIIIIZZ("anchor_id", c10ef.LIZIZ);
            C20684815ws.LJIILLIIL("livesdk_push_pre_permission_deny", c2344009Gk.LIZ);
        } else {
            C10EJ c10ej = C10EJ.LIZ;
            String str = awS142S1100000_28.s0;
            c10ej.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("enter_method", "notification_bell");
            c2344009Gk2.LJIIIIZZ("enter_reason", "leave");
            C20684815ws.LJIILLIIL("push_pre_permission_deny", c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        InterfaceC19307810gG interfaceC19307810gG = (InterfaceC19307810gG) obj;
        DialogC19307610gE dialogC19307610gE = (DialogC19307610gE) awS142S1100000_28.l1;
        String str = awS142S1100000_28.s0;
        dialogC19307610gE.getClass();
        if (Intrinsics.LJFF(str, "/aweme/v2/ug/ugc/permission/item/perm/submit")) {
            return interfaceC19307810gG.LIZ(awS142S1100000_28.s0, "select_period_all");
        }
        return interfaceC19307810gG.LIZ(awS142S1100000_28.s0, null);
    }

    public static final Object invoke$5(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C106Y c106y = (C106Y) awS142S1100000_28.l1;
        String str = awS142S1100000_28.s0;
        c106y.getClass();
        C106Y.LJJIJIL(2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String str = awS142S1100000_28.s0;
        if (str == null) {
            str = "confirm";
        }
        c1397620mTQ.LIZJ(0, str, new AwS607S0100000_28((DialogBuilder) awS142S1100000_28.l1, 262));
        DialogBuilder dialogBuilder = (DialogBuilder) awS142S1100000_28.l1;
        String str2 = dialogBuilder.negativeBtnText;
        if (str2 != null && dialogBuilder.negativeClickListener != null) {
            c1397620mTQ.LIZJ(1, str2, new AwS607S0100000_28(dialogBuilder, 263));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String str = awS142S1100000_28.s0;
        if (str == null) {
            str = "confirm";
        }
        c1397620mTQ.LIZJ(0, str, new AwS607S0100000_28((com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder) awS142S1100000_28.l1, 271));
        com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder dialogBuilder = (com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder) awS142S1100000_28.l1;
        String str2 = dialogBuilder.negativeBtnText;
        if (str2 != null && dialogBuilder.negativeClickListener != null) {
            c1397620mTQ.LIZJ(1, str2, new AwS607S0100000_28(dialogBuilder, 272));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        C10BM.LIZLLL("account", awS142S1100000_28.s0, C10BM.LIZIZ(((Number) obj).intValue()), C2097608Jq.LJIIIIZZ(new Pair("duet_status", C10BM.LIZ(((ContentReuseAccountExtra) awS142S1100000_28.l1).noPaDuet)), new Pair("stitch_status", C10BM.LIZ(((ContentReuseAccountExtra) awS142S1100000_28.l1).noPaStitch)), new Pair("sticker_status", C10BM.LIZIZ(((ContentReuseAccountExtra) awS142S1100000_28.l1).noPaCreateSticker)), new Pair("story_status", C10BM.LIZIZ(((ContentReuseAccountExtra) awS142S1100000_28.l1).noPaShareToStory))));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS142S1100000_28 awS142S1100000_28, Object obj) {
        PoiThirdPartyRecordingNoticeConfig.PoiThirdPartyRecordingNoticeConfigModel poiThirdPartyRecordingNoticeConfigModel;
        View view = (View) obj;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            poiThirdPartyRecordingNoticeConfigModel = PoiThirdPartyRecordingNoticeConfig.LIZ;
            PoiThirdPartyRecordingNoticeConfig.PoiThirdPartyRecordingNoticeConfigModel poiThirdPartyRecordingNoticeConfigModel2 = (PoiThirdPartyRecordingNoticeConfig.PoiThirdPartyRecordingNoticeConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttls_third_party_recording_notice_config", PoiThirdPartyRecordingNoticeConfig.PoiThirdPartyRecordingNoticeConfigModel.class, poiThirdPartyRecordingNoticeConfigModel);
            if (poiThirdPartyRecordingNoticeConfigModel2 != null) {
                poiThirdPartyRecordingNoticeConfigModel = poiThirdPartyRecordingNoticeConfigModel2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            poiThirdPartyRecordingNoticeConfigModel = PoiThirdPartyRecordingNoticeConfig.LIZ;
        }
        String str = poiThirdPartyRecordingNoticeConfigModel.privacyPolicyLink;
        if (str != null && str.length() != 0) {
            C1893050zMV c1893050zMV = C1893050zMV.LIZ;
            Context context = view.getContext();
            c1893050zMV.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(str));
            smartRouteBuildRoute.open();
            C1893050zMV.LIZ((PageFinder) awS142S1100000_28.l1, awS142S1100000_28.s0, "click_privacy");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(C1896470zS1 c1896470zS1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1896470zS1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(C106Y c106y, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c106y;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(C10EF c10ef, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c10ef;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(C10HL c10hl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c10hl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(DialogC19307610gE dialogC19307610gE, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = dialogC19307610gE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(String str, PageFinder pageFinder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(String str, DialogBuilder dialogBuilder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = dialogBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(String str, com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder dialogBuilder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = dialogBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1100000_28(String str, ContentReuseAccountExtra contentReuseAccountExtra, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = contentReuseAccountExtra;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS142S1100000_28(String str, String str2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }
}
