package com.ss.android.ugc.aweme.ecommerce.search.searchbar.ellipsis;

import X.C0R4A;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import X.C19EH;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import g1c.AjS11S0000000_4;
import g1c.AjS42S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBarEllipsisAssem extends UIContentAssem {
    public View LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public boolean LLJI;

    public final void Go(Lifecycle.State state) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("container")) != null) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.onViewCreated(view);
        TuxSheet tuxSheet = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.bqf, null);
        this.LLIZLLLIL = viewLJLLJ;
        if (viewLJLLJ != null) {
            C786410Ut5.I7(new AjS11S0000000_4(3), viewLJLLJ);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.rn0);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchEllipsisTextCell.class);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIII = view3;
            tuxSheet2.LLJJIJIL = null;
            tuxSheet2.LLJJJ = null;
            c1390920mIc.LJIIIIZZ(0);
            C0R4A c0r4a = new C0R4A(this, 8);
            tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLILLJJLI = c0r4a;
        }
        C786410Ut5.I7(new AjS42S0200000_10(this, tuxSheet, 1), view);
    }
}
