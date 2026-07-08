package com.ss.android.ugc.aweme.homepage;

import X.AbstractC1563340qmi;
import X.AbstractC1583710rJZ;
import X.AbstractC1591090rVT;
import X.AbstractC1591940rWq;
import X.C0CCZ;
import X.C1591020rVM;
import X.C19EG;
import X.InterfaceC1294060jmO;
import X.InterfaceC1570600qyQ;
import X.InterfaceC1570710qyb;
import X.InterfaceC1577800rA2;
import X.InterfaceC1581590rG9;
import X.InterfaceC1588590rRR;
import X.InterfaceC1590050rTn;
import X.InterfaceC1590080rTq;
import X.InterfaceC1590350rUH;
import X.InterfaceC1590620rUi;
import X.InterfaceC1591910rWn;
import X.InterfaceC1591950rWr;
import X.InterfaceC1592890rYN;
import X.InterfaceC1594050raF;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IHomePageService {
    void LIZ();

    AbstractC1563340qmi LIZIZ(LifecycleOwner lifecycleOwner);

    @InterfaceC1294060jmO
    C0CCZ LIZJ(long j, boolean z);

    InterfaceC1590080rTq LIZLLL();

    void LJ(C19EG c19eg, List list);

    boolean LJFF(C19EG c19eg);

    InterfaceC1590620rUi LJI();

    InterfaceC1581590rG9 LJII();

    C1591020rVM LJIIIIZZ(MainActivity mainActivity);

    InterfaceC1591950rWr LJIIIZ();

    InterfaceC1592890rYN LJIIJ();

    InterfaceC1588590rRR LJIIJJI(C19EG c19eg);

    void LJIIL(Context context);

    boolean LJIILIIL(C19EG c19eg);

    InterfaceC1591910rWn LJIILJJIL();

    InterfaceC1570600qyQ LJIILL(C19EG c19eg);

    InterfaceC1594050raF LJIILLIIL();

    InterfaceC1590050rTn LJIIZILJ();

    InterfaceC1590350rUH LJIJ();

    IFragmentMainPageIcon LJIJI();

    InterfaceC1577800rA2 LJIJJ(C19EG c19eg);

    ITabStrip LJIJJLI(FrameLayout frameLayout);

    AbstractC1591090rVT LJIL(AbstractC1591940rWq abstractC1591940rWq);

    IPreDrawableInflate LJJ();

    C1591020rVM LJJI(MainActivity mainActivity, C1591020rVM c1591020rVM);

    @InterfaceC1294060jmO
    C0CCZ LJJIFFI();

    InterfaceC1570710qyb LJJII(C19EG c19eg);

    void LJJIII();

    AbstractC1583710rJZ getRootNode(C19EG c19eg);
}
