package com.ss.android.ugc.aweme.discover.impl;

import X.C648810Pcd;
import X.InterfaceC1603440rpO;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.IDiscoveryService;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;

/* JADX INFO: loaded from: classes25.dex */
public final class DiscoveryServiceImpl implements IDiscoveryService {
    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment LLJILJILJ() {
        return new DiscoverAndSearchFragment();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Class<? extends Fragment> LLJIJIL() {
        return DiscoverAndSearchFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final InterfaceC1603440rpO LLJILJIL() {
        return C648810Pcd.LIZ;
    }
}
