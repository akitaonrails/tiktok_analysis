package com.ss.android.ugc.aweme.relation.storage;

import X.C0CCZ;
import X.C0W30;
import X.C816950W2z;
import X.InterfaceC2193008iW;
import X.InterfaceC2448809ig;
import com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask;

/* JADX INFO: loaded from: classes14.dex */
public final class RelationStorageServiceImpl implements IRelationStorageService {
    public final C0W30 LIZ = new C0W30();
    public final C816950W2z LIZIZ = new C816950W2z();

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final C0CCZ LIZIZ() {
        return new StorageLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC2193008iW LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC2448809ig LIZJ() {
        return this.LIZ;
    }
}
