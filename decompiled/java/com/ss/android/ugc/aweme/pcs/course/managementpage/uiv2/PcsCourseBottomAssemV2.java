package com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2;

import X.AbstractC738140SxQ;
import X.C0JHC;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1697506kn;
import X.C16F5;
import X.C197039127h;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C497740JfY;
import X.C522030Kdd;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseBottomAssemV2 extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(142), new AwS551S0100000_7((AbstractC738140SxQ) this, 382), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;
    public C197039127h LLJJIJI;
    public C16F5 LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hl9;
    }

    public final PcsCourseManageVM hp() {
        return (PcsCourseManageVM) this.LLJJI.getValue();
    }

    public final C0JHC ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public PcsCourseBottomAssemV2() {
        C13LE.LIZ(PcsVideoEditVM.class);
        AFwS237S0000000_7.get$arr$(143);
        new AwS551S0100000_7((AbstractC738140SxQ) this, 383);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.whg);
        this.LLJJIJI = c197039127h;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS583S0100000_4(c197039127h, 356));
        }
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.xj5);
        String strLJIJI = C497740JfY.LJIJI(2131855762);
        C1697506kn.LIZ(this.LLJJIJIIJIL, strLJIJI, C497740JfY.LJIJJ(2131855760, strLJIJI), 9, R.attr.ezq, R.attr.ezs, new AwS551S0100000_7(this, 660));
        C197039127h c197039127h2 = this.LLJJIJI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 219));
        }
        PcsCourseManageVM pcsCourseManageVMHp = hp();
        selectSubscribe(pcsCourseManageVMHp, new C2217381BqS() { // from class: X.0JE1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0JI2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C488550JDx) obj).LLIZ);
            }
        }, new C2217381BqS() { // from class: X.0JHS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C488550JDx) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZIZ(pcsCourseManageVMHp.usedInReusedScene), null, new C522030Kdd(this, 2));
    }
}
