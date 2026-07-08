package com.ss.android.ugc.aweme.node;

import X.InterfaceC1583080rIY;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;

/* JADX INFO: loaded from: classes25.dex */
public final class SettingsPageNode extends TabFragmentNode {
    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return "page_setting";
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
        return "page_setting";
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass("page_setting");
    }
}
