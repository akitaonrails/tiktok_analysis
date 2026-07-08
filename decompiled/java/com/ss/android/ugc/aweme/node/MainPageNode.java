package com.ss.android.ugc.aweme.node;

import X.AbstractC1583720rJa;
import X.C1581650rGF;
import X.C19EG;
import X.C2188811AlT;
import X.C343710Ddh;
import X.InterfaceC1583080rIY;
import X.InterfaceC1583870rJp;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageNode extends TabFragmentGroup {
    public final C19EG LLJILJILJ;

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return "page_feed";
    }

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        return null;
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return null;
    }

    @Override // X.AbstractC1583710rJZ
    public final boolean LJJII() {
        return false;
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return "page_feed";
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass("page_feed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainPageNode(C19EG c19eg) {
        this.LLJILJILJ = c19eg;
        for (InterfaceC1583870rJp interfaceC1583870rJp : HomeTabViewModel.LLILZIL.LIZ(c19eg).vy()) {
            if (!Intrinsics.LJFF(interfaceC1583870rJp.tag(), "PUBLISH")) {
                LJJ((AbstractC1583720rJa) interfaceC1583870rJp);
            }
        }
    }

    @Override // X.AbstractC1583710rJZ
    public final void LJJIIZ(Bundle bundle, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main page node switch tag, ");
        sbLIZ.append(str);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = bundle.getBoolean("isForcedRefreshView", false);
        Intrinsics.LJFF(bundle.getString("hox_skip_node"), "RootNode");
        String string = bundle.getString("enter_method", null);
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(this.LLJILJILJ);
        tabChangeManagerLIZ.getClass();
        if (str != null) {
            EasyNavigationExperimentServiceImpl.LIZIZ();
            int i = tabChangeManagerLIZ.LLJI + 1;
            tabChangeManagerLIZ.LLJI = i;
            tabChangeManagerLIZ.yQ2(str, z, i, false, bundle, string);
        }
    }
}
