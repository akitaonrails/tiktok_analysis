package kotlin.jvm.internal;

import X.AbstractC20694715yT;
import X.C05RV;
import X.C069P;
import X.C09AY;
import X.C1244180iTw;
import X.C1244220iU0;
import X.C1244260iU4;
import X.C1244270iU5;
import X.C1244360iUE;
import X.C1244370iUF;
import X.C1244380iUG;
import X.C1244390iUH;
import X.C1244400iUI;
import X.C1244410iUJ;
import X.C19212010Ec;
import X.C20304714cf;
import X.C20304814cg;
import X.C20305414cm;
import X.C20694515yR;
import X.C20694615yS;
import X.C20694815yU;
import X.C20696015yg;
import X.C207267168r;
import X.C207274168y;
import X.C2097908Jt;
import X.EnumC1725606pK;
import X.EnumC891030YxR;
import X.InterfaceC15516065q;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment;
import com.tiktok.ttm.ttmparam.TTMMapParam;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class AwS492S0200000_31 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS492S0200000_31(C20696015yg c20696015yg, PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = c20696015yg;
        this.l1 = pushSettingsLoginComposeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS492S0200000_31(C207267168r c207267168r, C207274168y c207274168y, int i) {
        super(3);
        this.$t = i;
        this.l0 = c207267168r;
        this.l1 = c207274168y;
    }

    public static final Object invoke$0(AwS492S0200000_31 awS492S0200000_31, Object obj, Object obj2, Object obj3) {
        ((C207267168r) awS492S0200000_31.l0).LIZLLL((C207274168y) awS492S0200000_31.l1, new TTMMapParam(C2097908Jt.LIZJ(new Pair("is_success", Integer.valueOf(((Boolean) obj3).booleanValue() ? 1 : 0)))));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS492S0200000_31 awS492S0200000_31, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            List<AbstractC20694715yT> list = ((C20696015yg) awS492S0200000_31.l0).LIZIZ;
            PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment = (PushSettingsLoginComposeFragment) awS492S0200000_31.l1;
            for (AbstractC20694715yT abstractC20694715yT : list) {
                if (!Intrinsics.LJFF(abstractC20694715yT.getUniqueId(), "im_msg_req_push") || C19212010Ec.LIZJ.LIZJ() != C05RV.BUSINESS_INBOX) {
                    if (Intrinsics.LJFF(abstractC20694715yT.getUniqueId(), "im_alert_tones")) {
                        IMContactApi.LIZ.getClass();
                        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
                        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_ALERT;
                        MessageAlert messageAlert = (MessageAlert) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
                        if (messageAlert == null || !messageAlert.LIZIZ()) {
                        }
                    }
                    if (Intrinsics.LJFF(abstractC20694715yT.getUniqueId(), "im_notification_permissions")) {
                        IMContactApi.LIZ.getClass();
                        InterfaceC15516065q interfaceC15516065qLIZJ2 = C069P.LIZ().LIZJ();
                        EnumC1725606pK enumC1725606pK2 = EnumC1725606pK.MESSAGE_ALERT;
                        MessageAlert messageAlert2 = (MessageAlert) interfaceC15516065qLIZJ2.LJFF(enumC1725606pK2, null, null, enumC1725606pK2.getAllowUsingLocalStaleValue(), true);
                        if (messageAlert2 != null) {
                            Integer num = messageAlert2.outAppAlertPermissionStatus;
                            int value = EnumC891030YxR.ENABLE.getValue();
                            if (num == null || num.intValue() != value) {
                            }
                        }
                    }
                    if (abstractC20694715yT instanceof C20694815yU) {
                        interfaceC1680500tpg.LJJIIJZLJL(229816922);
                        C20304714cf.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C20694815yU) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), false, null, interfaceC1680500tpg, 0, 24);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C1244400iUI) {
                        interfaceC1680500tpg.LJJIIJZLJL(229995513);
                        C1244410iUJ.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C1244400iUI) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), interfaceC1680500tpg, 0);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C1244380iUG) {
                        interfaceC1680500tpg.LJJIIJZLJL(230175561);
                        C1244390iUH.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C1244380iUG) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), pushSettingsLoginComposeFragment.getLayoutInflater(), false, interfaceC1680500tpg, 0, 16);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C1244360iUE) {
                        interfaceC1680500tpg.LJJIIJZLJL(230372535);
                        C1244370iUF.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C1244360iUE) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), interfaceC1680500tpg, 0);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C1244220iU0) {
                        interfaceC1680500tpg.LJJIIJZLJL(230545825);
                        C1244180iTw.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C1244220iU0) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), false, interfaceC1680500tpg, 0, 8);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C1244260iU4) {
                        interfaceC1680500tpg.LJJIIJZLJL(230718712);
                        C1244270iU5.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C1244260iU4) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), interfaceC1680500tpg, 0);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C20694515yR) {
                        interfaceC1680500tpg.LJJIIJZLJL(230911997);
                        C20304814cg.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C20694515yR) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), false, pushSettingsLoginComposeFragment.getActivity(), interfaceC1680500tpg, 0, 8);
                        interfaceC1680500tpg.LJ();
                    } else if (abstractC20694715yT instanceof C20694615yS) {
                        interfaceC1680500tpg.LJJIIJZLJL(231377276);
                        C20305414cm.LIZ(pushSettingsLoginComposeFragment.requireContext(), (C20694615yS) abstractC20694715yT, pushSettingsLoginComposeFragment.OR(), pushSettingsLoginComposeFragment.getLayoutInflater(), false, interfaceC1680500tpg, 0, 16);
                        interfaceC1680500tpg.LJ();
                    } else {
                        interfaceC1680500tpg.LJJIIJZLJL(231733776);
                        interfaceC1680500tpg.LJ();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
