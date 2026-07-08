package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.AnonymousClass0629;
import X.C0PEM;
import X.C0YG2;
import X.C0Z4E;
import X.C13DV;
import X.C1559260qg8;
import X.C1697820uHc;
import X.C1719206oI;
import X.C19212010Ec;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C427401lQ;
import X.C723600SZy;
import X.C876470YZx;
import X.C876590Ya9;
import X.C876610YaB;
import X.C878790Ydh;
import X.C878960Ydy;
import X.C879050Ye7;
import X.C880690Ygl;
import X.C880790Ygv;
import X.C880830Ygz;
import X.C880960YhC;
import X.C885570Yod;
import X.C885590Yof;
import X.C885630Yoj;
import X.C887750Ys9;
import X.EnumC871430YGn;
import X.EnumC880520YgU;
import X.InterfaceC0148002o;
import X.InterfaceC885440YoQ;
import X.InterfaceC885460YoS;
import X.InterfaceC885550Yob;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPageVM extends AssemViewModel<C885570Yod> implements InterfaceC885440YoQ, C0YG2 {
    public final InterfaceC885460YoS LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C887750Ys9.class, "message_request_fragment_config"), true);
    public final C2252321DDq LLILLL = C1BNE.LIZ(Boolean.FALSE);

    @Override // X.C0YG2
    public final void I02(List<String> list) {
    }

    @Override // X.InterfaceC885440YoQ
    public final void An() {
        this.LLILLL.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC885440YoQ
    public final void B6() {
        setState(AFwS248S0000000_14.get$arr$(118));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC871430YGn enumC871430YGn;
        EnumC871430YGn enumC871430YGn2;
        C887750Ys9 c887750Ys9 = (C887750Ys9) this.LLILLJJLI.getValue();
        if (c887750Ys9 == null || (enumC871430YGn = c887750Ys9.LLILLJJLI) == null) {
            enumC871430YGn = EnumC871430YGn.ALL_STRANGER;
        }
        C887750Ys9 c887750Ys92 = (C887750Ys9) this.LLILLJJLI.getValue();
        if (c887750Ys92 == null || (enumC871430YGn2 = c887750Ys92.LLILLJJLI) == null) {
            enumC871430YGn2 = EnumC871430YGn.ALL_STRANGER;
        }
        return new C885570Yod(enumC871430YGn, vQ2(enumC871430YGn2), 124);
    }

    @Override // X.InterfaceC885440YoQ
    public final List<C878960Ydy> C40() {
        return getState().LLILLJJLI;
    }

    @Override // X.InterfaceC885440YoQ
    public final boolean Ro() {
        return getState().LLILLJJLI.size() > 1;
    }

    @Override // X.InterfaceC885440YoQ
    public final EnumC871430YGn a1() {
        return getState().LL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C876470YZx.LIZ().LJIIL(this);
        if (a1() != EnumC871430YGn.ALL_RISKY) {
            C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
            C880960YhC.LIZ.getClass();
            C880960YhC.LJIIIIZZ();
            C878790Ydh.LJ(false);
            if (C19212010Ec.LIZJ.LJJJJZI()) {
                C878790Ydh.LIZLLL(System.currentTimeMillis());
            }
            C879050Ye7.LIZJ = false;
            C879050Ye7.LJ = "";
            C879050Ye7.LJI = null;
            ((LinkedHashMap) C879050Ye7.LJFF).clear();
            ((LinkedHashMap) C879050Ye7.LIZIZ).clear();
            ((LinkedHashMap) C880830Ygz.LIZ).clear();
            C876590Ya9.LIZ.getClass();
            C876590Ya9.LIZ(false);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C876470YZx.LIZ().LJIIIZ(this);
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
        if (C885630Yoj.LIZJ(false)) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C885590Yof(this, null), 2);
        }
        if (getState().LL != EnumC871430YGn.ALL_RISKY) {
            if (C19212010Ec.LIZJ.LJJJJZI()) {
                C878790Ydh.LIZLLL(System.currentTimeMillis());
            }
            IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null);
            if (iAwemeImManager != null) {
                iAwemeImManager.LJ();
            }
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C427401lQ(this, null), 3);
            C0Z4E.LIZ.getClass();
            Iterator it2 = ((ArrayList) C0Z4E.LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC885550Yob) it2.next()).S6();
            }
        }
    }

    public MessageRequestPageVM(MessageRequestLoadingAbilityVM messageRequestLoadingAbilityVM) {
        this.LL = messageRequestLoadingAbilityVM;
    }

    public static List vQ2(EnumC871430YGn enumC871430YGn) {
        if (enumC871430YGn != EnumC871430YGn.ALL_RISKY) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            C880790Ygv c880790Ygv = C880790Ygv.LIZ;
            EnumC880520YgU enumC880520YgULIZ = C880690Ygl.LIZ();
            c880790Ygv.getClass();
            c13dvLIZIZ.add(C880790Ygv.LJ(enumC880520YgULIZ));
            if (C19212010Ec.LIZJ.LJLLLLLL()) {
                IMAIServiceAPI.LIZ.getClass();
                if (AnonymousClass0629.LIZ().LIZ().LIZLLL(false) != 0) {
                    c13dvLIZIZ.add(C880790Ygv.LJ(EnumC880520YgU.AI_REPLIED));
                }
                c13dvLIZIZ.add(C880790Ygv.LJ(EnumC880520YgU.BUSINESS));
                c13dvLIZIZ.add(C880790Ygv.LJ(EnumC880520YgU.CREATOR));
                if (C885630Yoj.LIZIZ()) {
                    c13dvLIZIZ.add(C880790Ygv.LJ(EnumC880520YgU.NEW_FOLLOWER));
                } else {
                    c13dvLIZIZ.add(C880790Ygv.LJ(EnumC880520YgU.LONG_TIME_FOLLOWER));
                }
            }
            return C1697820uHc.LIZ(c13dvLIZIZ);
        }
        C880790Ygv c880790Ygv2 = C880790Ygv.LIZ;
        EnumC880520YgU enumC880520YgU = EnumC880520YgU.RISKY;
        c880790Ygv2.getClass();
        return Collections.singletonList(C880790Ygv.LJ(enumC880520YgU));
    }

    public final void wQ2(EnumC871430YGn enumC871430YGn) {
        if (enumC871430YGn == getState().LL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetRequestType: ");
        sbLIZ.append(getState().LL);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC871430YGn);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL.setValue(Boolean.FALSE);
        setState(new AwS380S0200000_14(enumC871430YGn, this, 29));
    }

    @Override // X.C0YG2
    public final void xf0(C876610YaB c876610YaB) {
        setState(new AwS593S0100000_14(c876610YaB, 45));
    }
}
