package com.ss.android.ugc.aweme.live.toplives.watchlater;

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
public final class WatchLaterHistoryNavBarAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxNavBar tuxNavBar;
        String string;
        super.onViewCreated(view);
        if (getContext() != null && (view instanceof TuxNavBar) && (tuxNavBar = (TuxNavBar) view) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS546S0100000_2(this, 671));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            Context context = tuxNavBar.getContext();
            if (context == null || (string = context.getString(2131856910)) == null) {
                string = "";
            }
            c1250250idj.LIZJ = string;
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
    }
}
