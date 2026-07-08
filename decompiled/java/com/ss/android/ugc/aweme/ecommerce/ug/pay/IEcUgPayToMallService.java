package com.ss.android.ugc.aweme.ecommerce.ug.pay;

import X.AnonymousClass0957;
import X.C1740920vP8;
import X.C928003jy;
import android.content.Context;
import android.net.Uri;
import com.google.gson.h;
import com.google.gson.n;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public interface IEcUgPayToMallService {
    String LIZ(String str);

    AnonymousClass0957<n> LIZIZ();

    Uri LIZJ(Uri uri, Uri uri2);

    Map<String, Object> LIZLLL();

    void appendScrollFeedTo(h hVar);

    String getDiversionSchema(Context context, String str);

    Integer getPayToMallMethodV3(String str);

    C1740920vP8 getTracker();

    String handleMiddlePageUrlAfterPaySuccess(String str, Integer num, String str2, String str3);

    C928003jy handlePaySuccessWithLandingSchema(String str, String str2, String str3, Integer num);

    Pair<Boolean, Map<String, Object>> mallParamsV2(Map<String, Object> map);

    Pair<Integer, Map<String, Object>> mallParamsV3(Map<String, Object> map);

    void saveDiversionSchema(Context context, String str, String str2);

    void setBackButtonDataDeferred(AnonymousClass0957<n> anonymousClass0957);

    void setPayToMallParams(Map<String, Object> map);
}
