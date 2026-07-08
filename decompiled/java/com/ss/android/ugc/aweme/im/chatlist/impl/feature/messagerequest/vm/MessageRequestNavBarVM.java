package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.AbstractC885540Yoa;
import X.C01GW;
import X.C0C64;
import X.C13BV;
import X.C13DV;
import X.C13LP;
import X.C1697820uHc;
import X.C19212010Ec;
import X.C2010507uB;
import X.C452501pT;
import X.C876610YaB;
import X.C878960Ydy;
import X.C880690Ygl;
import X.C885310YoD;
import X.C885430YoP;
import X.C885570Yod;
import X.C885580Yoe;
import X.EnumC871430YGn;
import X.EnumC880520YgU;
import X.EnumC880850Yh1;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestNavBarVM extends AssemViewModel<C2010507uB> {
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(114));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2010507uB(0);
    }

    public final void vQ2(C885570Yod c885570Yod, C885430YoP c885430YoP) {
        int i;
        EnumC880520YgU enumC880520YgU;
        boolean z;
        int iLIZ;
        List listSingletonList;
        C878960Ydy c878960Ydy;
        int iLIZ2 = 0;
        if (c885570Yod.LL == EnumC871430YGn.ALL_RISKY) {
            i = 1;
        } else {
            i = 0;
        }
        boolean zLJIJJLI = ((PrivacySettingsFeature) this.LLILLJJLI.getValue()).LJIJJLI(true);
        C878960Ydy c878960Ydy2 = c885430YoP.LLILLL;
        EnumC880520YgU enumC880520YgU2 = null;
        if (c878960Ydy2 != null) {
            enumC880520YgU = c878960Ydy2.LLILLL;
        } else {
            enumC880520YgU = null;
        }
        boolean zLJJJJ = C13LP.LJJJJ(enumC880520YgU, C880690Ygl.LIZ);
        if (zLJJJJ && (c878960Ydy = c885430YoP.LLILLL) != null) {
            enumC880520YgU2 = c878960Ydy.LLILLL;
        }
        EnumC880850Yh1 enumC880850Yh1 = c885430YoP.LL;
        C876610YaB c876610YaB = c885570Yod.LLILLL;
        List<AbstractC885540Yoa<?>> list = c885430YoP.LLILLJJLI;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (enumC880850Yh1 == EnumC880850Yh1.MULTI_SELECT) {
            listSingletonList = Collections.singletonList("tag_right_cancel");
        } else {
            if (c876610YaB != null) {
                iLIZ = c876610YaB.LIZ();
            } else {
                iLIZ = 0;
            }
            if (i == 0) {
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                if (zLJJJJ) {
                    c13dvLIZIZ.add("tag_right_edit");
                } else {
                    if (iLIZ > 0 && zLJIJJLI) {
                        c13dvLIZIZ.add("tag_right_risky");
                    }
                    if (!z || C0C64.LJIILLIIL().LJIJ(31744, 0, "im_message_request_on_device_prioritization", false) != 1 || !C19212010Ec.LIZJ.LJLLLLLL()) {
                        c13dvLIZIZ.add("tag_right_option");
                    }
                }
                listSingletonList = C1697820uHc.LIZ(c13dvLIZIZ);
            } else if (z) {
                listSingletonList = C13BV.INSTANCE;
            } else {
                listSingletonList = Collections.singletonList("tag_right_edit");
            }
        }
        C876610YaB c876610YaB2 = c885570Yod.LLILLL;
        if (!this.LL && listSingletonList.contains("tag_right_risky")) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            if (c876610YaB2 != null) {
                iLIZ2 = c876610YaB2.LIZ();
            }
            c885310YoD.getClass();
            C885310YoD.LJJIJIIJI(iLIZ2);
            this.LL = true;
        }
        setState(new C885580Yoe(this, c885570Yod, i, enumC880520YgU2, listSingletonList, zLJIJJLI, c885430YoP));
    }
}
