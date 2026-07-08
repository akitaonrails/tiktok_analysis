package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import X.AnonymousClass0957;
import X.C928003jy;
import android.content.Context;
import com.google.gson.h;
import com.google.gson.n;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultECUgPayToMallDependencyService implements IECUgPayToMallDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void appendScrollFeedTo(h hVar) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public String getDiversionSchema(Context context, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Integer getPayToMallMethodV3(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public String handleMiddlePageUrlAfterPaySuccess(String str, Integer num, String str2, String str3) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public C928003jy handlePaySuccessWithLandingSchema(String str, String str2, String str3, Integer num) {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void saveDiversionSchema(Context context, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void setBackButtonDataDeferred(AnonymousClass0957<n> anonymousClass0957) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void setPayToMallParams(Map<String, Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void trackMallEntranceClick(HashMap<String, Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void trackMallEntranceShow(HashMap<String, Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Pair<Boolean, Map<String, Object>> mallParamsV2(Map<String, Object> map) {
        return new Pair<>(Boolean.TRUE, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Pair<Integer, Map<String, Object>> mallParamsV3(Map<String, Object> map) {
        return new Pair<>(null, null);
    }
}
