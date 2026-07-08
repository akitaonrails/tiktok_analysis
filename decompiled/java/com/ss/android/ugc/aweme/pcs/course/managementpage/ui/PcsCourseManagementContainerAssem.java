package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseManagementContainerAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(129), new AwS551S0100000_7((AbstractC738140SxQ) this, 375), new C451610HnL(this, true, true), new C723700Sa8(this));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hl_;
    }

    public final PcsCourseManageVM hp() {
        return (PcsCourseManageVM) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS586S0100000_7(this, 373));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JDb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), new AwS621S0100000_7(this, 65), 4);
    }
}
