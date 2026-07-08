package com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui;

import X.AbstractC738140SxQ;
import X.C0JHC;
import X.C1220000hqw;
import X.C13LE;
import X.C197039127h;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS111S0200000_7;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoEditBottomAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(167), new AwS551S0100000_7((AbstractC738140SxQ) this, 398), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hll;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.g31);
        C786410Ut5.U8(c197039127h, new ACListenerS111S0200000_7(c197039127h, this, 77));
    }
}
