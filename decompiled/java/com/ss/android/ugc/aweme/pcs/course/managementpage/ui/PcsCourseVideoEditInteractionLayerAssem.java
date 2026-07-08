package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C2263161Di6;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489550JHt;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS169S0100000_35;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoEditInteractionLayerAssem extends UISlotAssem {
    public final C2263161Di6 LLJJI = ((C489550JHt) new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(138), new AwS551S0100000_7((AbstractC738140SxQ) this, 379), new C451610HnL(this, true, true), new C723700Sa8(this)).getValue().getState()).LLILLL;
    public FrameLayout LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlm;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.q4_);
        this.LLJJIII = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS169S0100000_35(this, 8));
        }
    }
}
