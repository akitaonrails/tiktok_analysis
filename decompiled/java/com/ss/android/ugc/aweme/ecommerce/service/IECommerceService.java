package com.ss.android.ugc.aweme.ecommerce.service;

import X.C1242910iRt;
import X.InterfaceC1249740icu;
import X.InterfaceC1364105Vn;
import X.InterfaceC1890400zIE;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public interface IECommerceService {
    public static final C1242910iRt LIZ = C1242910iRt.LIZ;

    void appendAdTrackParam(Aweme aweme, Uri.Builder builder);

    PowerViewPagerFragmentItem<?> createWishListFragmentData(String str, String str2);

    void doNewCartAnimation(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z, Integer num, View view, ViewGroup viewGroup, ViewGroup viewGroup2, Function1<? super Boolean, Unit> function1);

    boolean enableAddCartAnimatorOpt();

    String generateAdLynxLogExtra(Aweme aweme, String str);

    String generateAdLynxLogExtraAll(Aweme aweme, String str);

    String generateTrackId(Aweme aweme);

    List<IInterceptor> getEComPipeRouterInterceptors();

    List<IInterceptor> getECommerceRouterInterceptors();

    Map<String, Object> getPdpAlgorithmMetricsParams(List<String> list, String str);

    InterfaceC1890400zIE inboxService();

    boolean isECADVideo(Aweme aweme);

    boolean isHalfPDPFullScreenMode(Fragment fragment);

    boolean isLiveCreatorBCToggleAvailable();

    String modifySchemaOfNotice(String str, String str2, String str3, String str4, View view);

    void onBootFinish();

    void onEnterEcommerceLiveRoom(Fragment fragment);

    void openOrderSubmit(Context context, OrderSubmitEnterParamsV2 orderSubmitEnterParamsV2, String str);

    InterfaceC1249740icu orderCenterService();

    void postEvent(String str, JSONObject jSONObject);

    void prefetchPdp(String str, Context context);

    void prefetchPdp(String str, Context context, int i);

    String prefetchPdpEnterLiveRoom(String str);

    void prefetchPdpResource(String str, Context context, int i, boolean z, Fragment fragment);

    void prefetchSchema(String str, Context context);

    void releaseSharedPlayerInFeed(String str);

    void reportAdVideoLog(Aweme aweme, boolean z, int i, String str);

    void reportVerticalSearchApiLog(String str, JSONObject jSONObject);

    void setCurrentRoomId(Long l);

    void setIsDeeplinkOpenECMallSearchFlag(boolean z);

    void setSearchResultTabNameFlag(String str, Fragment fragment);

    Object shootCart(float f, float f2, View view, View view2, Integer num, Function0<Unit> function0, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void updateFallbackConfig(Map<String, String> map);
}
