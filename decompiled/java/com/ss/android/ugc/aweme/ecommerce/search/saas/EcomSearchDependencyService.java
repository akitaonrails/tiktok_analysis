package com.ss.android.ugc.aweme.ecommerce.search.saas;

import X.C04TD;
import X.C0QXR;
import X.C0QY2;
import X.C2232408os;
import X.C341050DYp;
import X.C671890QXb;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchDependencyService implements IEcomSearchDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void initSignalMonitor() {
        ((IEcSearchFeedCardService) ServiceManager.get().getService(IEcSearchFeedCardService.class)).initSignalMonitor();
    }

    public static IEcomSearchDependencyService createIEcomSearchDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEcomSearchDependencyService.class, z);
        if (objLIZ != null) {
            return (IEcomSearchDependencyService) objLIZ;
        }
        if (C04TD.f105X == null) {
            synchronized (IEcomSearchDependencyService.class) {
                if (C04TD.f105X == null) {
                    C04TD.f105X = new EcomSearchDependencyService();
                }
            }
        }
        return C04TD.f105X;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public String getParamByName(String str) {
        return ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).getParamByName(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public View getSimilarPhotoSearchView(Context context) {
        return ((IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class)).getSimilarPhotoSearchView(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void verifySearchParams(Map<String, ? extends Object> map, List<String> list) {
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).verifySearchParams(map, list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void reportUserActionMetrics(String str, String str2, Map<String, String> map) {
        C2232408os c2232408os = C341050DYp.LIZ;
        C341050DYp.LJI(str, str2, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void updateUserActionData(String str, String str2, Map<String, Object> map) {
        C2232408os c2232408os = C341050DYp.LIZ;
        C341050DYp.LJII(str, str2, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void openPhotoSearchResult(Context context, PhotoSearchEnterParams photoSearchEnterParams, Bitmap bitmap, Bitmap bitmap2) {
        IPhotoSearchService iPhotoSearchService = (IPhotoSearchService) PluggableExtentionKt.pluggableSpi$default(IPhotoSearchService.class, false, false, false, 14, null);
        if (iPhotoSearchService != null) {
            iPhotoSearchService.LJIIIZ(context, photoSearchEnterParams, bitmap, null, bitmap2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public void reportPDPLeaveRate(View view, Long l, long j, Map<String, ? extends Object> map) {
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).reportPDPLeaveRate(view, l, j, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService
    public C0QY2 getEntranceView(Context context, C0QXR c0qxr, C671890QXb c671890QXb, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        return ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).getEntranceView(context, c0qxr, c671890QXb, lifecycleOwner, function0);
    }
}
