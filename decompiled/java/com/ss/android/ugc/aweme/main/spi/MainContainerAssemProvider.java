package com.ss.android.ugc.aweme.main.spi;

import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class MainContainerAssemProvider implements IMainContainerAssemProvider {
    @Override // com.ss.android.ugc.aweme.main.spi.IMainContainerAssemProvider
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(MFToolBarAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.main.spi.IMainContainerAssemProvider
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(MFBizIconsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.main.spi.IMainContainerAssemProvider
    public final TabAbilityAssem LIZ() {
        return new TabAbilityAssem();
    }
}
