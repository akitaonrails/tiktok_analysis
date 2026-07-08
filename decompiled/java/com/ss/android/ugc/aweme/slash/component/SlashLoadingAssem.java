package com.ss.android.ugc.aweme.slash.component;

import X.C1308910kAL;
import X.C1749280vcc;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SlashLoadingAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, view.getContext());
            if (numLIZJ != null) {
                c1749280vcc.setBackgroundColor(numLIZJ.intValue());
            }
            c1749280vcc.LJ();
            viewGroup.addView(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
