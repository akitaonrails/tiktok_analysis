package com.ss.android.ugc.aweme.ecommerce.dependency.storage;

import X.C04TD;
import X.C1336210ksN;
import X.EnumC1335310kqv;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class StorageDependencyService implements IStorageDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService
    public EnumC1335310kqv getStorageState() {
        return C1336210ksN.LIZLLL();
    }

    public static IStorageDependencyService createIStorageDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IStorageDependencyService.class, z);
        if (objLIZ != null) {
            return (IStorageDependencyService) objLIZ;
        }
        if (C04TD.S == null) {
            synchronized (IStorageDependencyService.class) {
                if (C04TD.S == null) {
                    C04TD.S = new StorageDependencyService();
                }
            }
        }
        return C04TD.S;
    }
}
