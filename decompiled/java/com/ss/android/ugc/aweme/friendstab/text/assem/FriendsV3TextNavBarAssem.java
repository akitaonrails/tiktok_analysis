package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1389300mG0;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FriendsV3TextNavBarAssem extends BasePanelUIComponent {
    public final C630740Ooa LLJIJIL = C628500Oky.LIZ(new AwS556S0100000_12(this, 489));

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 490));
        if (C1389300mG0.LJIJI(C724240Sb0.LJI(this))) {
            i = 2131850106;
        } else {
            i = 2131850115;
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = view.getContext().getString(i);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJIJIL.getValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
    }
}
