package kotlin.jvm.internal;

import X.AbstractC19484711Kz;
import X.C09AY;
import X.C10CX;
import X.C11S5;
import X.C1391990mKL;
import X.C13LP;
import X.C1440005kM;
import X.C1686406j0;
import X.C1701940uOG;
import X.C1913750ztt;
import X.C19207610Ck;
import X.C19334510kZ;
import X.C211000rc;
import X.C2188811AlT;
import X.C824390WVp;
import X.C849850XVn;
import X.InterfaceC1589330rSd;
import Y.AfS53S1100000_28;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.SubSwitch;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS305S0300000_28 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS305S0300000_28 awS305S0300000_28, Object obj, Object obj2) {
        String str;
        String str2;
        C211000rc.LIZ("[Push-New]");
        C19207610Ck c19207610Ck = (C19207610Ck) awS305S0300000_28.l0;
        c19207610Ck.LLJ = C10CX.LIZ;
        if (Intrinsics.LJFF("dm", c19207610Ck.LLILLJJLI.trigger)) {
            C1440005kM.LIZ(new C1686406j0());
        }
        List<SubSwitch> list = ((PopupElementsConfig) awS305S0300000_28.l1).subSwitches;
        if (list != null) {
            list.isEmpty();
        }
        C19207610Ck c19207610Ck2 = (C19207610Ck) awS305S0300000_28.l0;
        PopupInstanceConfig popupInstanceConfig = (PopupInstanceConfig) awS305S0300000_28.l2;
        if ((!c19207610Ck2.LLIZ.isEmpty()) && popupInstanceConfig.popupActionsConfig.needSetSubSwitches) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c19207610Ck2.LLIZ, ",1,", null, null, 0, null, null, 62);
            PopupActionsConfig popupActionsConfig = popupInstanceConfig.popupActionsConfig;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(",1");
            popupActionsConfig.setSubSwitchesNewKeyValues(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Toggle new key-values: ");
            sbLIZ2.append(popupInstanceConfig.popupActionsConfig.subSwitchesNewKeyValues);
            C2188811AlT.LIZIZ(sbLIZ2);
            C211000rc.LIZ("[Push-New]");
        }
        C19207610Ck c19207610Ck3 = (C19207610Ck) awS305S0300000_28.l0;
        PopupActionsConfig popupActionsConfig2 = ((PopupInstanceConfig) awS305S0300000_28.l2).popupActionsConfig;
        c19207610Ck3.getClass();
        if (popupActionsConfig2.jump2SystemSettings && !C824390WVp.LIZJ(c19207610Ck3.LL)) {
            C211000rc.LIZ("[Push-New]");
            C824390WVp.LJFF(c19207610Ck3.LL, c19207610Ck3.LLILLJJLI.trigger);
        }
        if (popupActionsConfig2.needSetSubSwitches && (str2 = popupActionsConfig2.subSwitchesNewKeyValues) != null && str2.length() > 0) {
            AbstractC19484711Kz.LJII(new C19334510kZ(str2, popupActionsConfig2, 2)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS53S1100000_28(popupActionsConfig2, str2, 6), new AfS53S1100000_28(popupActionsConfig2, str2, 7));
        }
        InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
        C19207610Ck c19207610Ck4 = (C19207610Ck) awS305S0300000_28.l0;
        String str3 = ((PopupInstanceConfig) awS305S0300000_28.l2).panelType;
        c19207610Ck4.getClass();
        if (Intrinsics.LJFF(str3, "push_new_default")) {
            str = "338_normal";
        } else if (Intrinsics.LJFF(str3, "push_new_toggle")) {
            str = "338_toggle";
        } else {
            str = "338";
        }
        interfaceC1589330rSdLIZJ.LJIJI(str, "turnOnNotif_bottomSheet_button_getNotified", true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS305S0300000_28 awS305S0300000_28, Object obj, Object obj2) {
        boolean zLJFF;
        UniversalPopupAction universalPopupAction;
        C1391990mKL c1391990mKL = (C1391990mKL) obj2;
        ((Function1) awS305S0300000_28.l0).invoke(((C1913750ztt) awS305S0300000_28.l1).LIZJ);
        UniversalPopupButton universalPopupButton = (UniversalPopupButton) awS305S0300000_28.l2;
        if (universalPopupButton != null && (universalPopupAction = universalPopupButton.action) != null) {
            zLJFF = Intrinsics.LJFF(universalPopupAction.dismiss, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        c1391990mKL.LIZIZ = zLJFF;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS305S0300000_28(C19207610Ck c19207610Ck, PopupElementsConfig popupElementsConfig, PopupInstanceConfig popupInstanceConfig, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19207610Ck;
        this.l1 = popupElementsConfig;
        this.l2 = popupInstanceConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS305S0300000_28(UniversalPopupButton universalPopupButton, C1913750ztt c1913750ztt, AwS596S0100000_17 awS596S0100000_17, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS596S0100000_17;
        this.l1 = c1913750ztt;
        this.l2 = universalPopupButton;
    }
}
