package com.ss.android.ugc.aweme.storage;

import X.C0WYJ;
import X.C844470XAv;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IStorageApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class IStorageServiceImpl implements IStorageApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStorageApi
    public final long LIZIZ() {
        StorageInfoCacheInitTask.LL.getClass();
        return StorageInfoCacheInitTask.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStorageApi
    public final long LIZJ() {
        StorageInfoCacheInitTask.LL.getClass();
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            long j = ((Keva) StorageInfoCacheInitTask.LLIZ.getValue()).getLong("storage_mock_available_internal", -1L);
            if (j > 0) {
                StorageInfoCacheInitTask.LLILLJJLI = j;
            }
        }
        return StorageInfoCacheInitTask.LLILLJJLI >= 0 ? StorageInfoCacheInitTask.LLILLJJLI : C0WYJ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStorageApi
    public final int getDraftCount() {
        StorageInfoCacheInitTask.LL.getClass();
        return StorageInfoCacheInitTask.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStorageApi
    public final long LIZ(Context context) {
        StorageInfoCacheInitTask.LL.getClass();
        if (StorageInfoCacheInitTask.LLILLL >= 0) {
            return StorageInfoCacheInitTask.LLILLL;
        }
        return C0WYJ.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStorageApi
    public final void openDraftActivity(Context context, Bundle bundle) {
        IAVDraftService iAVDraftServiceDraftService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
            iAVDraftServiceDraftService.openDraftActivity(context, bundle);
        }
    }
}
