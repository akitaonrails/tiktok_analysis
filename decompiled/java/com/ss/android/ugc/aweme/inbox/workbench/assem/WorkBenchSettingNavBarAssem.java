package com.ss.android.ugc.aweme.inbox.workbench.assem;

import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkBenchSettingNavBarAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxNavBar tuxNavBar;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (tuxNavBar = (TuxNavBar) view.findViewById(R.id.workbench_setting_navbar)) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS546S0100000_2(this, 629));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131837460);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            tuxNavBar.setNavActions(c0om1);
        }
    }
}
