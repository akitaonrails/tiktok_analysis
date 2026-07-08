package com.ss.android.ugc.aweme.ecommerce.dummyspi;

import X.C08CX;
import X.C13BV;
import X.C2097608Jq;
import X.InterfaceC1249740icu;
import X.InterfaceC1364105Vn;
import X.InterfaceC1890400zIE;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class DummyECommerceService implements IECommerceService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void appendAdTrackParam(Aweme aweme, Uri.Builder builder) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public PowerViewPagerFragmentItem<?> createWishListFragmentData(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void doNewCartAnimation(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z, Integer num, View view, ViewGroup viewGroup, ViewGroup viewGroup2, Function1<? super Boolean, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean enableAddCartAnimatorOpt() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtra(Aweme aweme, String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtraAll(Aweme aweme, String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateTrackId(Aweme aweme) {
        return "";
    }

    public int getPageTemplate(Integer num, String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isECADVideo(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isHalfPDPFullScreenMode(Fragment fragment) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isLiveCreatorBCToggleAvailable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String modifySchemaOfNotice(String str, String str2, String str3, String str4, View view) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onBootFinish() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onEnterEcommerceLiveRoom(Fragment fragment) {
    }

    public boolean openAppLink(Context context, String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void openOrderSubmit(Context context, OrderSubmitEnterParamsV2 orderSubmitEnterParamsV2, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void postEvent(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String str, Context context, int i) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String prefetchPdpEnterLiveRoom(String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdpResource(String str, Context context, int i, boolean z, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchSchema(String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void releaseSharedPlayerInFeed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportAdVideoLog(Aweme aweme, boolean z, int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportVerticalSearchApiLog(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setCurrentRoomId(Long l) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setIsDeeplinkOpenECMallSearchFlag(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setSearchResultTabNameFlag(String str, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void updateFallbackConfig(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public InterfaceC1890400zIE inboxService() {
        return new InterfaceC1890400zIE() { // from class: X.0w3g
            @Override // X.InterfaceC1890400zIE
            public final void LIZ(C00BC c00bc) {
            }

            @Override // X.InterfaceC1890400zIE
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC1890400zIE
            public final void LJFF(EnumC1767180w5U enumC1767180w5U, String str) {
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC1890400zIE
            public final MoveFullEntryAssetsData LJIIIZ() {
                return null;
            }

            @Override // X.InterfaceC1890400zIE
            public final List<Integer> LIZJ() {
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public InterfaceC1249740icu orderCenterService() {
        return new InterfaceC1249740icu() { // from class: X.0w3f
            @Override // X.InterfaceC1249740icu
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1249740icu
            public final void LIZJ(String str, Map map) {
            }

            @Override // X.InterfaceC1249740icu
            public final int LIZLLL() {
                return -1;
            }

            @Override // X.InterfaceC1249740icu
            public final void LJFF(Context context, String str, String str2, Map map) {
            }

            @Override // X.InterfaceC1249740icu
            public final int LIZ() {
                IECommerceService.LIZ.getClass();
                return 0;
            }

            @Override // X.InterfaceC1249740icu
            public final InterfaceC2024807wU LJ() {
                return new InterfaceC2024807wU() { // from class: X.0w3h
                    @Override // X.InterfaceC2024807wU
                    public final void LIZ(Activity activity) {
                    }

                    @Override // X.InterfaceC2024807wU
                    public final void LIZIZ(Lifecycle lifecycle, C2174541A8m c2174541A8m) {
                    }

                    @Override // X.InterfaceC2024807wU
                    public final void LIZJ(InterfaceC2027807wy interfaceC2027807wy) {
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getEComPipeRouterInterceptors() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getECommerceRouterInterceptors() {
        return C13BV.INSTANCE;
    }

    public List<Pair<Integer, String>> getPageTemplateList(String str) {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Map<String, Object> getPdpAlgorithmMetricsParams(List<String> list, String str) {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String str, Context context) {
        prefetchPdp(str, context, 1);
    }

    public Set<String> getPagesStrategyService(Integer num, String str, String str2, String str3) {
        return C08CX.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Object shootCart(float f, float f2, View view, View view2, Integer num, Function0<Unit> function0, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }
}
