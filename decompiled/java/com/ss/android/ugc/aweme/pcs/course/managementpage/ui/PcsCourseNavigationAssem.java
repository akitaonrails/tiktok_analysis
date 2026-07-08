package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C0JHC;
import X.C1220000hqw;
import X.C13LE;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import wh6.AbS499S0200000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseNavigationAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(133), new AwS551S0100000_7((AbstractC738140SxQ) this, 376), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlf;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.mk3);
        if (liveIconView != null) {
            C786410Ut5.I7(new AbS499S0200000_7(liveIconView, this, 9), liveIconView);
        }
    }
}
