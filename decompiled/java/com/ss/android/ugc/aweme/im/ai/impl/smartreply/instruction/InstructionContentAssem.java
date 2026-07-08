package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction;

import X.C1607106Qz;
import X.C19EG;
import X.C418440Gaw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS137S0100000_2;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS110S0101000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionContentAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ceo;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        int iMin;
        super.xo();
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.p14);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 80));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            iMin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(230));
        } else {
            int iLIZ = (C1607106Qz.LIZ(c19egLIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) / 2;
            if (iLIZ < 0) {
                iLIZ = 0;
            }
            iMin = Math.min(iLIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(230)));
        }
        C723850SaN.LIZLLL(this, new AwS110S0101000_2(this, iMin, 16));
    }
}
