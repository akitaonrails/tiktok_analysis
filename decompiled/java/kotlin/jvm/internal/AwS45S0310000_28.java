package kotlin.jvm.internal;

import X.C036E;
import X.C09AY;
import X.C0PEM;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1900960zZG;
import X.C1901130zZX;
import X.C1901150zZZ;
import X.C19298010eg;
import X.C23250099c;
import X.C604920No2;
import X.C844470XAv;
import X.EnumC19301010fA;
import X.EnumC19301210fC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS45S0310000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModelCp = ((NotificationWidgetContainer) awS45S0310000_28.l0).cp();
        NoticeDisableActionInfo noticeDisableActionInfo = (NoticeDisableActionInfo) awS45S0310000_28.l1;
        boolean z = awS45S0310000_28.z3;
        notificationFragmentV2ViewModelCp.setState(new AwS114S0110000_28(noticeDisableActionInfo, z, 8));
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C036E.LIZ.LIZIZ()) {
            C1901130zZX c1901130zZX = C1901130zZX.LIZJ;
            synchronized (c1901130zZX) {
                C1900960zZG c1900960zZGLJ = c1901130zZX.LJ();
                if (c1900960zZGLJ != null) {
                    c1900960zZGLJ.LIZIZ(noticeDisableActionInfo, z);
                }
            }
            C1901150zZZ.LIZJ.LIZLLL(noticeDisableActionInfo, z);
            C23250099c.LIZLLL(notificationFragmentV2ViewModelCp.getAssemVMScope(), C0PEM.LIZJ, null, new C604920No2(noticeDisableActionInfo, z, notificationFragmentV2ViewModelCp, null), 2);
        } else {
            notificationFragmentV2ViewModelCp.setState(new AwS40S0010000_28(z, 25));
        }
        NotificationWidgetContainer notificationWidgetContainer = (NotificationWidgetContainer) awS45S0310000_28.l0;
        notificationWidgetContainer.Co(notificationWidgetContainer.ko());
        ((NotificationWidgetContainer) awS45S0310000_28.l0).lp((MusNotice) awS45S0310000_28.l2, "click", ((NoticeDisableActionInfo) awS45S0310000_28.l1).muteType);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        ((Map) awS45S0310000_28.l0).put("user_type", "edit");
        ((Map) awS45S0310000_28.l0).put("type", "-1007");
        ((Map) awS45S0310000_28.l0).put("result", "2");
        C19298010eg.LJ("age_gate_popup_response", (Map) awS45S0310000_28.l0, ((AgeGateFragment) awS45S0310000_28.l1).VR());
        C19298010eg.LJFF("2");
        if (awS45S0310000_28.z3) {
            ((AgeGateFragment) awS45S0310000_28.l1).ZR(null, null);
        }
        ((Function1) awS45S0310000_28.l2).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        ((Map) awS45S0310000_28.l0).put("is_confirm", "1");
        C19298010eg.LJ("age_edit_confirm_popup_result", (Map) awS45S0310000_28.l0, ((AgeGateCelebrationSettingFragment) awS45S0310000_28.l1).gS());
        if (awS45S0310000_28.z3) {
            ((AgeGateCelebrationSettingFragment) awS45S0310000_28.l1).iS(null, null);
        }
        ((Function1) awS45S0310000_28.l2).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PNSDialogModel pNSDialogModel = (PNSDialogModel) awS45S0310000_28.l0;
        List<PNSAgeConfirmOption> list = pNSDialogModel.options;
        boolean z = true;
        if (list != null) {
            AgeGateFragment ageGateFragment = (AgeGateFragment) awS45S0310000_28.l1;
            boolean z2 = awS45S0310000_28.z3;
            Function1 function1 = (Function1) awS45S0310000_28.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.optionType == EnumC19301010fA.CONTINUE.getType()) {
                    c1397620mTQ.LIZJ(2, pNSAgeConfirmOption.optionContent, new AwS45S0310000_28((Map) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) z2, (boolean) function1, (Function1<? super Integer, Unit>) 8));
                } else if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397620mTQ.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS123S0400000_28(c1397620mTQ, (C1397620mTQ) pNSAgeConfirmOption, (PNSAgeConfirmOption) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) 6));
                } else if (pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397620mTQ.LIZJ(1, pNSAgeConfirmOption.optionContent, new AwS394S0200000_28((Map) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) 109));
                } else {
                    c1397620mTQ.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS45S0310000_28((Map) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) z2, (boolean) function1, (Function1<? super Integer, Unit>) 1));
                }
            }
        }
        PNSDialogModel pNSDialogModel2 = (PNSDialogModel) awS45S0310000_28.l0;
        if (!pNSDialogModel2.forceVertical ? pNSDialogModel2.alignmentType != EnumC19301210fC.HORIZONTAL.getType() : pNSDialogModel2.alignmentType != EnumC19301210fC.VERTICAL.getType()) {
            z = false;
        }
        c1397620mTQ.LJFF = z;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        List<PNSAgeConfirmOption> list = ((PNSDialogModel) awS45S0310000_28.l0).options;
        if (list != null) {
            AgeGateFragment ageGateFragment = (AgeGateFragment) awS45S0310000_28.l1;
            boolean z = awS45S0310000_28.z3;
            Function1 function1 = (Function1) awS45S0310000_28.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                if (pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397630mTR.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS607S0100000_28(ageGateFragment, 381));
                } else {
                    c1397630mTR.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS79S0210000_28(z, (boolean) ageGateFragment, (AgeGateFragment) function1, (Function1<? super Integer, Unit>) 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        ((Map) awS45S0310000_28.l0).put("user_type", "edit");
        ((Map) awS45S0310000_28.l0).put("type", "-1007");
        ((Map) awS45S0310000_28.l0).put("result", "2");
        C19298010eg.LJ("age_gate_popup_response", (Map) awS45S0310000_28.l0, ((AgeGateCelebrationSettingFragment) awS45S0310000_28.l1).gS());
        C19298010eg.LJFF("2");
        if (awS45S0310000_28.z3) {
            ((AgeGateCelebrationSettingFragment) awS45S0310000_28.l1).iS(null, null);
        }
        ((Function1) awS45S0310000_28.l2).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        PNSDialogModel pNSDialogModel = (PNSDialogModel) awS45S0310000_28.l0;
        List<PNSAgeConfirmOption> list = pNSDialogModel.options;
        boolean z = true;
        if (list != null) {
            AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment = (AgeGateCelebrationSettingFragment) awS45S0310000_28.l1;
            boolean z2 = awS45S0310000_28.z3;
            Function1 function1 = (Function1) awS45S0310000_28.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.optionType == EnumC19301010fA.CONTINUE.getType()) {
                    c1397620mTQ.LIZJ(2, pNSAgeConfirmOption.optionContent, new AwS45S0310000_28((Map) linkedHashMap, (Map<String, String>) ageGateCelebrationSettingFragment, (AgeGateCelebrationSettingFragment) z2, (boolean) function1, (Function1<? super Integer, Unit>) 2));
                } else if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397620mTQ.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS123S0400000_28(c1397620mTQ, (C1397620mTQ) pNSAgeConfirmOption, (PNSAgeConfirmOption) linkedHashMap, (Map<String, String>) ageGateCelebrationSettingFragment, (AgeGateCelebrationSettingFragment) 5));
                } else if (pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397620mTQ.LIZJ(1, pNSAgeConfirmOption.optionContent, new AwS394S0200000_28((Map) linkedHashMap, (Map<String, String>) ageGateCelebrationSettingFragment, (AgeGateCelebrationSettingFragment) 107));
                } else {
                    c1397620mTQ.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS45S0310000_28((Map) linkedHashMap, (Map<String, String>) ageGateCelebrationSettingFragment, (AgeGateCelebrationSettingFragment) z2, (boolean) function1, (Function1<? super Integer, Unit>) 5));
                }
            }
        }
        PNSDialogModel pNSDialogModel2 = (PNSDialogModel) awS45S0310000_28.l0;
        if (!pNSDialogModel2.forceVertical ? pNSDialogModel2.alignmentType != EnumC19301210fC.HORIZONTAL.getType() : pNSDialogModel2.alignmentType != EnumC19301210fC.VERTICAL.getType()) {
            z = false;
        }
        c1397620mTQ.LJFF = z;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        List<PNSAgeConfirmOption> list = ((PNSDialogModel) awS45S0310000_28.l0).options;
        if (list != null) {
            AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment = (AgeGateCelebrationSettingFragment) awS45S0310000_28.l1;
            boolean z = awS45S0310000_28.z3;
            Function1 function1 = (Function1) awS45S0310000_28.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : list) {
                if (pNSAgeConfirmOption.optionType == EnumC19301010fA.DISMISS.getType()) {
                    c1397630mTR.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS606S0100000_27(ageGateCelebrationSettingFragment, 620));
                } else {
                    c1397630mTR.LIZJ(0, pNSAgeConfirmOption.optionContent, new AwS79S0210000_28(z, (boolean) ageGateCelebrationSettingFragment, (AgeGateCelebrationSettingFragment) function1, (Function1<? super Integer, Unit>) 2));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS45S0310000_28 awS45S0310000_28, Object obj) {
        ((Map) awS45S0310000_28.l0).put("is_confirm", "1");
        C19298010eg.LJ("age_edit_confirm_popup_result", (Map) awS45S0310000_28.l0, ((AgeGateFragment) awS45S0310000_28.l1).VR());
        if (awS45S0310000_28.z3) {
            ((AgeGateFragment) awS45S0310000_28.l1).ZR(null, null);
        }
        ((Function1) awS45S0310000_28.l2).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0310000_28(NotificationWidgetContainer notificationWidgetContainer, NoticeDisableActionInfo noticeDisableActionInfo, boolean z, MusNotice musNotice, int i) {
        super(1);
        this.$t = i;
        this.l0 = notificationWidgetContainer;
        this.l1 = noticeDisableActionInfo;
        this.z3 = z;
        this.l2 = musNotice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0310000_28(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment, boolean z, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.z3 = ageGateCelebrationSettingFragment;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0310000_28(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, AgeGateFragment ageGateFragment, boolean z, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.z3 = ageGateFragment;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0310000_28(Map map, Map<String, String> map2, AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment, boolean z, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = map;
        this.l1 = map2;
        this.z3 = ageGateCelebrationSettingFragment;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0310000_28(Map map, Map<String, String> map2, AgeGateFragment ageGateFragment, boolean z, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = map;
        this.l1 = map2;
        this.z3 = ageGateFragment;
        this.l2 = z;
    }
}
