package defpackage;

import X.C1336210ksN;
import X.EnumC12948054w;
import com.ss.android.ugc.aweme.services.storage.IStorageSensitivityService;

/* JADX INFO: loaded from: classes3.dex */
public final class StorageSensitivityServiceImpl implements IStorageSensitivityService {
    @Override // com.ss.android.ugc.aweme.services.storage.IStorageSensitivityService
    public final boolean isSensitiveUserStored() {
        return C1336210ksN.LIZJ() == EnumC12948054w.SENSITIVITY_LAST_FOURTEEN_DAYS;
    }
}
