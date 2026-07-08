package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C108P;
import X.C10EF;
import X.C10EJ;
import X.C10HL;
import X.C1157780gEa;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1428470nHB;
import X.C15O7;
import X.C18WR;
import X.C1915720zx4;
import X.C1915790zxB;
import X.C19203410Au;
import X.C19323610io;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21290818Tq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2344009Gk;
import X.C770770ULj;
import X.CallableC1915740zx6;
import X.InterfaceC1915880zxK;
import X.InterfaceC19222210Ia;
import X.InterfaceC332260D0u;
import Y.ACListenerS62S1200000_28;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupComplianceDialogUI;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.privacy.setting.prompt.removeoff.RemoveOffViewModel;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS111S1200000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        return C19323610io.LJJIJL((C19323610io) obj, null, new ACListenerS62S1200000_28((CreatorToolsActivity) awS111S1200000_28.l1, (ShowCaseModel) awS111S1200000_28.l2, awS111S1200000_28.s0, 0), true, null, null, false, false, null, false, false, null, false, false, 16777195);
    }

    public static final Object invoke$1(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Activity) awS111S1200000_28.l1, "aweme://push_setting_notification_choice");
        smartRouteBuildRoute.withParam("enter_from", "popup");
        smartRouteBuildRoute.open();
        C10EF c10ef = (C10EF) awS111S1200000_28.l2;
        if (c10ef != null) {
            C10EJ.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c10ef.LIZJ);
            c2344009Gk.LJIIIIZZ("enter_method", c10ef.LIZLLL);
            c2344009Gk.LJIIIIZZ("room_id", c10ef.LIZ);
            c2344009Gk.LJIIIIZZ("anchor_id", c10ef.LIZIZ);
            C20684815ws.LJIILLIIL("livesdk_push_pre_permission_auth", c2344009Gk.LIZ);
        } else {
            C10EJ c10ej = C10EJ.LIZ;
            String str = awS111S1200000_28.s0;
            c10ej.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("enter_method", "notification_bell");
            c2344009Gk2.LJIIIIZZ("enter_reason", "leave");
            C20684815ws.LJIILLIIL("push_pre_permission_auth", c2344009Gk2.LIZ);
        }
        C10EJ.LIZ.getClass();
        C10EJ.LIZLLL("live", "click_open");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        String creationId;
        String strLJIILL;
        AVETParameter avetParameter;
        ((C770770ULj) obj).LIZIZ = true;
        ((InterfaceC19222210Ia) awS111S1200000_28.l1).LIZ();
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS111S1200000_28.l2;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS111S1200000_28.l2;
        String contentSource = null;
        if (videoPublishEditModel2 != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel2);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS111S1200000_28.l2;
        if (videoPublishEditModel3 != null && (avetParameter = videoPublishEditModel3.getAvetParameter()) != null) {
            contentSource = avetParameter.getContentSource();
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LJ("exit_method", "Cancel");
        c0lab.LJ("enter_from", awS111S1200000_28.s0);
        C20684815ws.LJIILLIIL("dismiss_aigc_pop_up", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        if (obj instanceof CancellationException) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveForPost: url=");
            sbLIZ.append(awS111S1200000_28.s0);
            sbLIZ.append(", state=CancellationException");
            C21290818Tq.LIZJ("AiChatSaveComponent", C2188811AlT.LIZIZ(sbLIZ));
            ((C18WR) awS111S1200000_28.l1).W2();
            ((InterfaceC332260D0u) awS111S1200000_28.l2).setValue(C1157780gEa.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1915720zx4.LIZ.getClass();
            C1915790zxB c1915790zxB = (C1915790zxB) C1915720zx4.LJIIJ.getValue();
            String str = awS111S1200000_28.s0;
            List list = (List) awS111S1200000_28.l1;
            InterfaceC1915880zxK interfaceC1915880zxK = (InterfaceC1915880zxK) awS111S1200000_28.l2;
            c1915790zxB.getClass();
            C15O7.LIZJ(new CallableC1915740zx6(interfaceC1915880zxK, c1915790zxB, str, list));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        SmartRouter.buildRoute((Activity) awS111S1200000_28.l1, "//setting/diskmanager_compose").open();
        C10HL.LIZ((C10HL) awS111S1200000_28.l2, "clean_app", awS111S1200000_28.s0, null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131837036, new AwS111S1200000_28((Activity) awS111S1200000_28.l1, (C10HL) awS111S1200000_28.l2, awS111S1200000_28.s0, 13));
        c1397620mTQ.LJII(R.string.m_4, new AwS142S1100000_28((C10HL) awS111S1200000_28.l2, awS111S1200000_28.s0, 11));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        C108P c108p = C108P.LIZ;
        RemoveOffProps removeOffProps = (RemoveOffProps) awS111S1200000_28.l1;
        RemoveOffViewModel removeOffViewModel = (RemoveOffViewModel) awS111S1200000_28.l2;
        String str = awS111S1200000_28.s0;
        c108p.getClass();
        C108P.LIZJ((C770770ULj) obj, removeOffProps, removeOffViewModel, str);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        C108P c108p = C108P.LIZ;
        RemoveOffProps removeOffProps = (RemoveOffProps) awS111S1200000_28.l1;
        RemoveOffViewModel removeOffViewModel = (RemoveOffViewModel) awS111S1200000_28.l2;
        String str = awS111S1200000_28.s0;
        c108p.getClass();
        C108P.LIZJ((C770770ULj) obj, removeOffProps, removeOffViewModel, str);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((C1397660mTU) obj).LIZJ = false;
        C20684815ws.LJIILLIIL("pns_popup_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "report_submit_associated_post"), new Pair("business", "privacy"), new Pair("popup_key", "manage_reuse_content"), new Pair("action", awS111S1200000_28.s0)));
        ((Function0) awS111S1200000_28.l1).invoke();
        ((C19203410Au) awS111S1200000_28.l2).getClass();
        C19203410Au.LJIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131835117, new AwS111S1200000_28((Activity) awS111S1200000_28.l1, (C10EF) awS111S1200000_28.l2, awS111S1200000_28.s0, 1));
        c1397620mTQ.LJII(R.string.m_4, new AwS142S1100000_28((C10EF) awS111S1200000_28.l2, awS111S1200000_28.s0, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupBlocksUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupBlocksUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupBlocksUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupComplianceDialogUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupComplianceDialogUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        ((UniversalPopupComplianceDialogUI) awS111S1200000_28.l1).pl(((UniversalPopupBlockElement) awS111S1200000_28.l2).action, null, awS111S1200000_28.s0);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS111S1200000_28 awS111S1200000_28, Object obj) {
        String creationId;
        String strLJIILL;
        String contentSource;
        String strLJIILL2;
        AVETParameter avetParameter;
        AVETParameter avetParameter2;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        AIGCInfo aIGCInfo;
        ((C770770ULj) obj).LIZIZ = true;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS111S1200000_28.l1;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (aIGCInfo = privacySettingModel.aigcInfo) != null) {
            aIGCInfo.AIGCLabelType = 1;
        }
        ((InterfaceC19222210Ia) awS111S1200000_28.l2).LIZIZ();
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS111S1200000_28.l1;
        String creationId2 = "model is null";
        if (videoPublishEditModel2 == null) {
            creationId = "model is null";
        } else {
            creationId = videoPublishEditModel2.getCreationId();
        }
        c0lab.LJ("creation_id", creationId);
        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS111S1200000_28.l1;
        String contentSource2 = null;
        if (videoPublishEditModel3 != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel3);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        VideoPublishEditModel videoPublishEditModel4 = (VideoPublishEditModel) awS111S1200000_28.l1;
        if (videoPublishEditModel4 != null && (avetParameter2 = videoPublishEditModel4.getAvetParameter()) != null) {
            contentSource = avetParameter2.getContentSource();
        } else {
            contentSource = null;
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LIZ(1, "action_type");
        c0lab.LJ("enter_from", awS111S1200000_28.s0);
        C20684815ws.LJIILLIIL("aigc_toggle", c0lab.LIZ);
        C0LAB c0lab2 = new C0LAB();
        VideoPublishEditModel videoPublishEditModel5 = (VideoPublishEditModel) awS111S1200000_28.l1;
        if (videoPublishEditModel5 != null) {
            creationId2 = videoPublishEditModel5.getCreationId();
        }
        c0lab2.LJ("creation_id", creationId2);
        VideoPublishEditModel videoPublishEditModel6 = (VideoPublishEditModel) awS111S1200000_28.l1;
        if (videoPublishEditModel6 != null) {
            strLJIILL2 = C1428470nHB.LJIILL(videoPublishEditModel6);
        } else {
            strLJIILL2 = null;
        }
        c0lab2.LJ("content_type", strLJIILL2);
        VideoPublishEditModel videoPublishEditModel7 = (VideoPublishEditModel) awS111S1200000_28.l1;
        if (videoPublishEditModel7 != null && (avetParameter = videoPublishEditModel7.getAvetParameter()) != null) {
            contentSource2 = avetParameter.getContentSource();
        }
        c0lab2.LJ("content_source", contentSource2);
        c0lab2.LJ("exit_method", "OK");
        c0lab2.LJ("enter_from", awS111S1200000_28.s0);
        C20684815ws.LJIILLIIL("dismiss_aigc_pop_up", c0lab2.LIZ);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS111S1200000_28(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, X.InterfaceC19222210Ia r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 9 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS111S1200000_28.<init>(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.10Ia, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(InterfaceC1915880zxK interfaceC1915880zxK, String str, List list, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = list;
        this.l2 = interfaceC1915880zxK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(Activity activity, C10EF c10ef, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.l2 = c10ef;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(Activity activity, C10HL c10hl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.l2 = c10hl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(CreatorToolsActivity creatorToolsActivity, ShowCaseModel showCaseModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = creatorToolsActivity;
        this.l2 = showCaseModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(UniversalPopupBlocksUI universalPopupBlocksUI, UniversalPopupBlockElement universalPopupBlockElement, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = universalPopupBlocksUI;
        this.l2 = universalPopupBlockElement;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(UniversalPopupComplianceDialogUI universalPopupComplianceDialogUI, UniversalPopupBlockElement universalPopupBlockElement, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = universalPopupComplianceDialogUI;
        this.l2 = universalPopupBlockElement;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(RemoveOffProps removeOffProps, RemoveOffViewModel removeOffViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = removeOffProps;
        this.l2 = removeOffViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1200000_28(String str, C18WR c18wr, C2252321DDq c2252321DDq, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c18wr;
        this.l2 = c2252321DDq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS111S1200000_28(String str, String str2, Function0<Unit> function0, C19203410Au c19203410Au) {
        super(1);
        this.$t = c19203410Au;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function0;
    }
}
