package com.ss.android.ugc.aweme.node;

import X.AbstractC1583720rJa;
import X.C1585030rLh;
import X.C19EG;
import X.C486860J7k;
import X.InterfaceC1055050dYt;
import X.InterfaceC1583080rIY;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;

/* JADX INFO: loaded from: classes25.dex */
public final class ProfileGroupPageNode extends TabFragmentGroup {
    public final C19EG LLJILJILJ;
    public final AbstractC1583720rJa LLJILLL;
    public ScrollSwitchStateManager LLJJ;

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return "page_profile";
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
        return "page_profile";
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass("page_profile");
    }

    public ProfileGroupPageNode(C19EG c19eg) {
        HomePageCommonService homePageCommonService;
        this.LLJILJILJ = c19eg;
        if (C1585030rLh.LJJI() && (homePageCommonService = (HomePageCommonService) ServiceManager.get().getService(HomePageCommonService.class)) != null) {
            AbstractC1583720rJa abstractC1583720rJaLJIIIZ = homePageCommonService.LJIIIZ(c19eg);
            this.LLJILLL = abstractC1583720rJaLJIIIZ;
            if (abstractC1583720rJaLJIIIZ != null) {
                LJJ(abstractC1583720rJaLJIIIZ);
                LJJ(new AbstractC1583720rJa() { // from class: X.0rHw
                    @Override // X.AbstractC1583720rJa
                    public final Bundle LJIIZILJ() {
                        return null;
                    }

                    @Override // X.AbstractC1583720rJa
                    public final Class<? extends Fragment> LJIJ() {
                        return null;
                    }

                    @Override // X.AbstractC1583720rJa
                    public final String tag() {
                        return "profile_fake_child";
                    }
                });
            }
        }
    }

    @Override // X.AbstractC1583710rJZ
    public final void LJJIIZ(Bundle bundle, String str) {
        InterfaceC1055050dYt interfaceC1055050dYt;
        AbstractC1583720rJa abstractC1583720rJa = this.LLJILLL;
        if (abstractC1583720rJa != null && TextUtils.equals(abstractC1583720rJa.tag(), str)) {
            if (this.LLJJ == null) {
                this.LLJJ = C486860J7k.LIZIZ(this.LLJILJILJ);
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLJJ;
            ComponentCallbacks componentCallbacksXQ2 = null;
            if (scrollSwitchStateManager != null) {
                componentCallbacksXQ2 = scrollSwitchStateManager.xQ2("page_profile");
            }
            if ((componentCallbacksXQ2 instanceof InterfaceC1055050dYt) && (interfaceC1055050dYt = (InterfaceC1055050dYt) componentCallbacksXQ2) != null) {
                interfaceC1055050dYt.Ll(bundle);
            }
        }
    }
}
