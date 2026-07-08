package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C01GW;
import X.C111700bb;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseFavoritePageAssem extends UIContentAssem implements BasicFavoritePageAbilities, VisibilityAware {
    public C1749280vcc LLIZLLLIL;
    public FrameLayout LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C111700bb.class, "base_favorite_page"), checkSupervisorPrepared());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 368));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 253));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 366));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 367));

    public abstract String Go();

    public abstract String Ho();

    public abstract void Lo();

    public abstract void No();

    public final C1749280vcc Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, BasicFavoritePageAbilities.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, VisibilityAware.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, BasicFavoritePageAbilities.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, VisibilityAware.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    public void onVisibilityChanged(boolean z) {
        if (z && ((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
            Lo();
        }
    }
}
