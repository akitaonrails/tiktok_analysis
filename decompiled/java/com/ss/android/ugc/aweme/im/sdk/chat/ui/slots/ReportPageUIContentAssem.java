package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C01GW;
import X.C0HZQ;
import X.C1383370m6R;
import X.C1559260qg8;
import X.C19ME;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C462500IBs;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.EnumC461660I8m;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;
import u4.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class ReportPageUIContentAssem extends ReusedSkeletonUIContentAssem<ReportPageUIContentAssem, Boolean> {
    public final C1559260qg8 LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    public ReportPageUIContentAssem() {
        super(C462500IBs.LIZ);
        this.LLJJJJJIL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 336));
        this.LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 337));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        C19ME c19me;
        C786410Ut5.LLLLLZ((C0HZQ) this.LLJJJJLIIL.getValue(), 0);
        View view2 = (View) this.LLJJL.getValue();
        if ((view2 instanceof ConstraintLayout) && view2 != null) {
            C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, null, false, 30);
            if (((C898900ZOe) this.LLJJJJJIL.getValue()).LLILLL != EnumC461660I8m.START || (viewFindViewById = view2.findViewById(R.id.bka)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                c19me.startToEnd = R.id.djs;
                c19me.startToStart = -1;
                C786410Ut5.W5(viewFindViewById, c19me);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(C869590Y9l c869590Y9l, Boolean bool) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        C786410Ut5.LLLLLZ((C0HZQ) this.LLJJJJLIIL.getValue(), 0);
        ((C0HZQ) this.LLJJJJLIIL.getValue()).setChecked(zBooleanValue);
        View viewLJJIJL = LJJIJL();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((Boolean) cp()).booleanValue()) {
            i = 2131824462;
        } else {
            i = 2131824457;
        }
        q0.LJJIFFI(viewLJJIJL, C1383370m6R.LJIIJ(i));
    }
}
