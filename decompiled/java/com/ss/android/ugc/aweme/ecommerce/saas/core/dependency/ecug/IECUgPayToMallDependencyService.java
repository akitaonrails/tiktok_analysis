package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import X.AnonymousClass0957;
import X.C928003jy;
import android.content.Context;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public interface IECUgPayToMallDependencyService extends IECommerceHostService {
    void appendScrollFeedTo(h hVar);

    String getDiversionSchema(Context context, String str);

    Integer getPayToMallMethodV3(String str);

    String handleMiddlePageUrlAfterPaySuccess(String str, Integer num, String str2, String str3);

    C928003jy handlePaySuccessWithLandingSchema(String str, String str2, String str3, Integer num);

    Pair<Boolean, Map<String, Object>> mallParamsV2(Map<String, Object> map);

    Pair<Integer, Map<String, Object>> mallParamsV3(Map<String, Object> map);

    void saveDiversionSchema(Context context, String str, String str2);

    void setBackButtonDataDeferred(AnonymousClass0957<n> anonymousClass0957);

    void setPayToMallParams(Map<String, Object> map);

    void trackMallEntranceClick(HashMap<String, Object> map);

    void trackMallEntranceShow(HashMap<String, Object> map);
}
