package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IMallLandingPerfTrackerDependencyService extends IECommerceHostService {
    String newPerfId();

    void onClickMallEntry(String str, Long l);

    void onLandingFinished(String str, String str2, Map<String, ? extends Object> map, int i);

    void onLandingMallAndInsert(String str, String str2, Map<String, ? extends Object> map, int i);

    void onSearchMixLandingFinished(String str, long j, String str2);

    void onStartJumpToMall(String str, Long l, boolean z);
}
