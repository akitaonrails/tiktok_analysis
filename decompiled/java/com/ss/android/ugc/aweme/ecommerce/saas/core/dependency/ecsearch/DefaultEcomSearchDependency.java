package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch;

import X.C0QXR;
import X.C0QY2;
import X.C671890QXb;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class DefaultEcomSearchDependency implements IEcomSearchDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public C0QY2 getEntranceView(Context context, C0QXR c0qxr, C671890QXb c671890QXb, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public String getParamByName(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public View getSimilarPhotoSearchView(Context context) {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void initSignalMonitor() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void openPhotoSearchResult(Context context, PhotoSearchEnterParams photoSearchEnterParams, Bitmap bitmap, Bitmap bitmap2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void reportPDPLeaveRate(View view, Long l, long j, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void reportUserActionMetrics(String str, String str2, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void updateUserActionData(String str, String str2, Map<String, Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void verifySearchParams(Map<String, ? extends Object> map, List<String> list) {
    }
}
