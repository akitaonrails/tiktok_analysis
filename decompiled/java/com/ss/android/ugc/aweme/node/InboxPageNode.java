package com.ss.android.ugc.aweme.node;

import X.C1585030rLh;
import X.C1720106oR;
import X.C19212010Ec;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC1583080rIY;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxPageNode extends TabFragmentNode {
    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return "NOTIFICATION";
    }

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        return null;
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return null;
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return "NOTIFICATION";
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        boolean z = C1585030rLh.LJIIJ("NOTIFICATION") == 0;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLeft = ");
        sbLIZ.append(z);
        C1720106oR.LJI("InboxPageNode", C2188811AlT.LIZIZ(sbLIZ));
        return z ? C19212010Ec.LIZJ.LJJLIIJ() : ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass("NOTIFICATION");
    }
}
