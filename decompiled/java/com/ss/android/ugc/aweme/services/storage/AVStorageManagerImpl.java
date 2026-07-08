package com.ss.android.ugc.aweme.services.storage;

import X.C01GW;
import X.C0MB0;
import X.C13VH;
import X.C13VR;
import X.C280860Azc;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1460960o7a;
import X.InterfaceC1604540rrA;
import X.InterfaceC2269281Dry;
import X.InterfaceC570310MYj;
import X.InterfaceC580000Mow;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl implements InterfaceC2269281Dry {
    public final C01GW cleanUselessDraftsProvider$delegate;
    public final C01GW pathService$delegate;
    public final C01GW persistedAllowListManager$delegate;
    public final C01GW monitor$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$monitor$2());
    public final C01GW allowListService$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$allowListService$2());
    public final C01GW fileProvider$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$fileProvider$2());
    public final C01GW pathAdapter$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$pathAdapter$2());

    @Override // X.InterfaceC2269281Dry
    public C13VR getAllowListService() {
        return (C13VR) this.allowListService$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public InterfaceC1604540rrA getCleanUselessDraftsProvider() {
        return (InterfaceC1604540rrA) this.cleanUselessDraftsProvider$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public C13VH getFileProvider() {
        return (C13VH) this.fileProvider$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public C0MB0 getMonitor() {
        return (C0MB0) this.monitor$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public InterfaceC1460960o7a getPathAdapter() {
        return (InterfaceC1460960o7a) this.pathAdapter$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public InterfaceC570310MYj getPathService() {
        return (InterfaceC570310MYj) this.pathService$delegate.getValue();
    }

    @Override // X.InterfaceC2269281Dry
    public InterfaceC580000Mow getPersistedAllowListManager() {
        return (InterfaceC580000Mow) this.persistedAllowListManager$delegate.getValue();
    }

    public AVStorageManagerImpl() {
        this.pathService$delegate = C452501pT.LIZ(((Boolean) C280860Azc.LIZ.getValue()).booleanValue() ? EnumC452301pR.NONE : EnumC452301pR.SYNCHRONIZED, new AVStorageManagerImpl$pathService$2());
        this.persistedAllowListManager$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$persistedAllowListManager$2());
        this.cleanUselessDraftsProvider$delegate = C452501pT.LIZIZ(new AVStorageManagerImpl$cleanUselessDraftsProvider$2());
    }
}
