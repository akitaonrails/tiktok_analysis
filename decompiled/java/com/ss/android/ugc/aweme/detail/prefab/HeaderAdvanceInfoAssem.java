package com.ss.android.ugc.aweme.detail.prefab;

import X.C01GW;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.prefab.LinearLayoutAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class HeaderAdvanceInfoAssem extends LinearLayoutAssem {
    public final int LLJJIII = R.id.fpw;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 68));

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        super.hp();
        if (!ip().LLJILJIL.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            C786410Ut5.LJJJLZIJ((View) this.LLJJIJI.getValue(), viewGroup);
            View view = (View) this.LLJJIJI.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            viewGroup.addView(view, 0, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem
    public final int lp() {
        return this.LLJJIII;
    }
}
