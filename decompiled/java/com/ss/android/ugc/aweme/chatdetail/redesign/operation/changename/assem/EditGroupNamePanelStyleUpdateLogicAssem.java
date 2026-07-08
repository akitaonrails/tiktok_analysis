package com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.assem;

import X.C01GW;
import X.C0H25;
import X.C0H29;
import X.C1509305vX;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class EditGroupNamePanelStyleUpdateLogicAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS550S0100000_6(this, 35));
    public final C01GW LLJ = C1509305vX.LIZ(new AwS550S0100000_6(this, 32));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS550S0100000_6(this, 36));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 34));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 33));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C0H25 c0h25 = (C0H25) this.LLJIJIL.getValue();
        if (c0h25 != null) {
            c0h25.onPause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C0H25 c0h25 = (C0H25) this.LLJIJIL.getValue();
        if (c0h25 != null) {
            c0h25.onResume();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LLIZLLLIL.getValue();
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            constraintLayout.getLayoutParams().height = -2;
            C786410Ut5.m6(constraintLayout, layoutParams);
        }
        C0H25 c0h25 = (C0H25) this.LLJIJIL.getValue();
        if (c0h25 != null) {
            c0h25.LJJIIJ((C0H29) this.LLJILJIL.getValue());
        }
    }
}
