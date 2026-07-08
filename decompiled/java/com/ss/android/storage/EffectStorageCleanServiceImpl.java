package com.ss.android.storage;

import X.C04TD;
import X.C0C88;
import X.C2276581E8y;
import X.C2426509f5;
import X.C2427009fA;
import com.ss.android.ugc.aweme.services.storage.IStorageTaskService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EffectStorageCleanServiceImpl implements IStorageTaskService {
    public static IStorageTaskService LIZ() {
        Object objLIZ = C04TD.LIZ(IStorageTaskService.class, false);
        if (objLIZ != null) {
            return (IStorageTaskService) objLIZ;
        }
        if (C04TD.LJJLIIIJILLIZJL == null) {
            synchronized (IStorageTaskService.class) {
                if (C04TD.LJJLIIIJILLIZJL == null) {
                    C04TD.LJJLIIIJILLIZJL = new EffectStorageCleanServiceImpl();
                }
            }
        }
        return C04TD.LJJLIIIJILLIZJL;
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IStorageTaskService
    public final void runStorageTask() {
        C2426509f5.LIZ().getClass();
        if (Intrinsics.LJFF(C0C88.LIZIZ.get("StorageTask"), Boolean.TRUE)) {
            return;
        }
        StorageTask storageTaskLIZ = C2426509f5.LIZ();
        storageTaskLIZ.getClass();
        C2427009fA.LIZJ = new C2276581E8y(storageTaskLIZ);
    }
}
