package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch;

import X.C0QXR;
import X.C0QY2;
import X.C671890QXb;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public interface IEcomSearchDependencyService extends IECommerceHostService {
    C0QY2 getEntranceView(Context context, C0QXR c0qxr, C671890QXb c671890QXb, LifecycleOwner lifecycleOwner, Function0<Unit> function0);

    String getParamByName(String str);

    View getSimilarPhotoSearchView(Context context);

    void initSignalMonitor();

    void openPhotoSearchResult(Context context, PhotoSearchEnterParams photoSearchEnterParams, Bitmap bitmap, Bitmap bitmap2);

    void reportPDPLeaveRate(View view, Long l, long j, Map<String, ? extends Object> map);

    void reportUserActionMetrics(String str, String str2, Map<String, String> map);

    void updateUserActionData(String str, String str2, Map<String, Object> map);

    void verifySearchParams(Map<String, ? extends Object> map, List<String> list);
}
