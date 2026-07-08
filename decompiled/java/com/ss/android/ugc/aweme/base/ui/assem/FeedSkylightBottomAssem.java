package com.ss.android.ugc.aweme.base.ui.assem;

import X.C14LC;
import X.C786410Ut5;
import Y.AObserverS226S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;

/* JADX INFO: loaded from: classes25.dex */
public class FeedSkylightBottomAssem extends UIContentAssem {
    public int LLIZLLLIL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C14LC.LJIJ.removeObservers(this);
    }

    public void Go(int i) {
        if (LJJIJL().getLayoutParams().height == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(LJJIJL(), layoutParams);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C14LC.LJIJ.observe(this, new AObserverS226S0100000_24(this, 20));
    }
}
