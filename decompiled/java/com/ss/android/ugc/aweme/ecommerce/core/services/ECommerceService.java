package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.AnonymousClass0181;
import X.AnonymousClass0317;
import X.AnonymousClass0406;
import X.AnonymousClass0408;
import X.AnonymousClass0409;
import X.C01GW;
import X.C034S;
import X.C034Z;
import X.C03M5;
import X.C04J0;
import X.C04TD;
import X.C054G;
import X.C08CX;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09JN;
import X.C0C5P;
import X.C0C64;
import X.C0CNO;
import X.C0H9H;
import X.C0N0Y;
import X.C0PEM;
import X.C0XQB;
import X.C1013003xg;
import X.C1013303xj;
import X.C1054504Al;
import X.C1055504Av;
import X.C1071004Gu;
import X.C1120604Zw;
import X.C1124704ab;
import X.C1125104af;
import X.C11RS;
import X.C11S5;
import X.C1336100ksC;
import X.C1388190mED;
import X.C13BV;
import X.C13LP;
import X.C1507790pL7;
import X.C15438062q;
import X.C15O7;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1725790v0j;
import X.C1735130vFn;
import X.C1735160vFq;
import X.C1735240vFy;
import X.C1735400vGE;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C1742270vRJ;
import X.C1758140vqu;
import X.C1758310vrB;
import X.C1758430vrN;
import X.C1758440vrO;
import X.C1758480vrS;
import X.C1758570vrb;
import X.C1766600w4Y;
import X.C1766610w4Z;
import X.C1766860w4y;
import X.C1766870w4z;
import X.C18E9;
import X.C18EN;
import X.C1907507dZ;
import X.C1942307jB;
import X.C1956507lT;
import X.C19719512Dh;
import X.C1AF0;
import X.C1AQS;
import X.C2085508Ez;
import X.C2097608Jq;
import X.C21246818Cs;
import X.C2173808fQ;
import X.C2173908fR;
import X.C2188811AlT;
import X.C2211621BhA;
import X.C2211641BhC;
import X.C2252611DEt;
import X.C23250099c;
import X.C426630Go9;
import X.C428070GqT;
import X.C452501pT;
import X.C770702zh;
import X.C786410Ut5;
import X.C817503Hh;
import X.C928603k4;
import X.C938403le;
import X.C954703oH;
import X.C955103oL;
import X.C955403oO;
import X.C958103op;
import X.C969603qg;
import X.C973803rM;
import X.C987903td;
import X.C993603uY;
import X.EnumC586490MzP;
import X.EnumC586500MzQ;
import X.EnumC955203oM;
import X.EnumC969503qf;
import X.InterfaceC1249740icu;
import X.InterfaceC1364105Vn;
import X.InterfaceC1487280oo2;
import X.InterfaceC1758450vrP;
import X.InterfaceC1890400zIE;
import X.InterfaceC21252118Et;
import X.InterfaceC304970BxP;
import Y.AComparatorS45S0000000_26;
import Y.ALAdapterS0S0500000_2;
import Y.AUListenerS1S0400001_6;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.vo.ClientScreen;
import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityBaseInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBatchResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import com.ss.android.ugc.aweme.ecommerce.compliance.ScenesConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECInboxMsgCreatorShopConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECMallLivePdpAccurateModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSearchLivePdpAccurateModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomLruCacheSetting;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OptConfigV2;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PrefetchSchemaConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.SkuPrefetchConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.TemplateChangeConfig;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomOutProductPipeInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSchemaFallbackInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkH5AdaptInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.SchemaFallbackConfig;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.BootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ActivityBaseInfoV2;
import com.ss.android.ugc.aweme.ecommerce.model.ActivityUserSelectionV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSKUDTOV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderShopDigestV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitRequestParamV2;
import com.ss.android.ugc.aweme.ecommerce.model.RegionV2;
import com.ss.android.ugc.aweme.ecommerce.model.SkuCardStyleInfoV2;
import com.ss.android.ugc.aweme.ecommerce.model.VoucherMetaV2;
import com.ss.android.ugc.aweme.ecommerce.router.EcomRouteInjectInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IApiLoggerService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpResourceService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInterceptor;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ECommerceService implements IECommerceService {
    public static final int $stable = 8;
    public String adPageFrom;
    public String adVideoTrackerId;
    public final EcomSchemaFallbackInterceptor fallbackInterceptor;
    public final C01GW interceptors$delegate;
    public final List<IInterceptor> pipeInterceptors;

    private final String toBtmCode(int i) {
        return i != 1 ? i != 2 ? "c022282.d63940" : "c6053.d51817" : "c6053.d2507";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onEnterEcommerceLiveRoom(Fragment fragment) {
    }

    private final List<IInterceptor> getInterceptors() {
        return (List) this.interceptors$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public InterfaceC1890400zIE inboxService() {
        return new InterfaceC1890400zIE() { // from class: X.0w5O
            @Override // X.InterfaceC1890400zIE
            public final void LIZIZ() {
                AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
                AnonymousClass0317 anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin;
                C1767130w5P.LIZ.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("migration_type", Integer.valueOf(C1767190w5V.LJ));
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IECommerceMallDependencyService.class.getName(), anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                    }
                    linkedHashMap.put("shop_tab_type", Integer.valueOf(Intrinsics.LJFF(((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin).shouldShowMall2TabOrTopTab(), Boolean.TRUE) ? 1 : 0));
                    linkedHashMap.put("need_hide_shop_updates", Integer.valueOf(C1767130w5P.LIZJ != null ? 1 : 0));
                    linkedHashMap.put("need_show_migrate_module", Integer.valueOf(C1767130w5P.LIZ() ? 1 : 0));
                    linkedHashMap.put("need_hide_inbox_shop_entrance", Integer.valueOf(C1767130w5P.LIZIZ != null ? 1 : 0));
                    EnumC1987407qS enumC1987407qS = C1767130w5P.LIZLLL;
                    if (enumC1987407qS != null) {
                        linkedHashMap.put("request_type", Integer.valueOf(enumC1987407qS.getType()));
                    }
                    linkedHashMap.put("request_stage", Integer.valueOf(C1767130w5P.LJFF.getStage()));
                    linkedHashMap.put("request_duration", Long.valueOf(C1767130w5P.LJI));
                    linkedHashMap.put("request_count", Integer.valueOf(C1767130w5P.LJ));
                    Integer num = C1767130w5P.LJII;
                    if (num != null) {
                        linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
                    }
                    String str = C1767130w5P.LJIIIIZZ;
                    if (str != null) {
                        linkedHashMap.put("error_msg", str);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = BootLogDependencyService.createIBootLogDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime2, 1, IBootLogDependencyService.class.getName(), anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBootLogDependencyService.class);
                    }
                    linkedHashMap.put("duration_from_cold_boot", Long.valueOf(jCurrentTimeMillis - ((IBootLogDependencyService) anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin).coldBootBegin()));
                    C1739730vND.LIZ.getClass();
                    C1018703yb.LIZIZ("rd_tiktokec_inbox_shop_migrate_monitor", linkedHashMap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LIZLLL() {
                IECommerceHostService iECommerceHostService;
                IECommerceHostService iECommerceHostService2;
                C1767130w5P.LIZ.getClass();
                if (!C1767190w5V.LIZJ) {
                    return false;
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    IECommerceMallDependencyService iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IECommerceMallDependencyService.class.getName(), iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin != null ? iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName() : null, iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin != null);
                    iECommerceHostService = iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                }
                if (!Intrinsics.LJFF(((IECommerceMallDependencyService) iECommerceHostService).shouldShowMall2TabOrTopTab(), Boolean.TRUE)) {
                    return false;
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    IECommerceMallDependencyService iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin2 = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IECommerceMallDependencyService.class.getName(), iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin2 != null ? iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin2.getClass().getName() : null, iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin2 != null);
                    iECommerceHostService2 = iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin2;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                }
                boolean zShouldShowMallTab = ((IECommerceMallDependencyService) iECommerceHostService2).shouldShowMallTab();
                if (C1767190w5V.LIZ) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1767130w5P.LIZLLL = EnumC1987407qS.PARTIAL_MIGRATE;
                    C1767130w5P.LJFF = EnumC1767140w5Q.IN_PROGRESS;
                    C1767130w5P.LJ++;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1767150w5R(zShouldShowMallTab ? 1 : 0, jCurrentTimeMillis, null), 3);
                } else {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C1767130w5P.LIZLLL = EnumC1987407qS.FULL_MIGRATE;
                    C1767130w5P.LJFF = EnumC1767140w5Q.IN_PROGRESS;
                    C1767130w5P.LJ++;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1767160w5S(zShouldShowMallTab ? 1 : 0, jCurrentTimeMillis2, null), 3);
                }
                return true;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJ() {
                C1124104aV.LIZ.getClass();
                return C1124104aV.LIZJ;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJI() {
                C1767130w5P.LIZ.getClass();
                return C1767130w5P.LIZ();
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJII() {
                C1767130w5P.LIZ.getClass();
                return C1767130w5P.LIZJ != null;
            }

            @Override // X.InterfaceC1890400zIE
            public final boolean LJIIIIZZ() {
                C1767130w5P.LIZ.getClass();
                return C1767130w5P.LIZIZ != null;
            }

            @Override // X.InterfaceC1890400zIE
            public final MoveFullEntryAssetsData LJIIIZ() {
                C1767130w5P.LIZ.getClass();
                return C1767130w5P.LIZIZ;
            }

            @Override // X.InterfaceC1890400zIE
            public final List<Integer> LIZJ() {
                ECInboxMsgCreatorShopConfig.MsgGroupConfig msgGroupConfigLIZ = ECInboxMsgCreatorShopConfig.LIZ();
                return C13LP.LJLIL(msgGroupConfigLIZ.shopGroups, msgGroupConfigLIZ.creatorGroups);
            }

            @Override // X.InterfaceC1890400zIE
            public final void LIZ(C00BC c00bc) {
                IECommerceHostService iECommerceHostService;
                C19EG c19eg;
                boolean z;
                String name;
                if (c00bc == C00BC.REFRESH_CART_COUNT) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name = iECommerceHostService.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    Activity currentActivity = ((IApplicationDependencyService) iECommerceHostService).getCurrentActivity();
                    if ((currentActivity instanceof C19EG) && (c19eg = (C19EG) currentActivity) != null) {
                        C1124104aV c1124104aV = C1124104aV.LIZ;
                        LifecycleOwner lifecycleOwnerLIZLLL = C20161913uj.LIZLLL(c19eg);
                        if (C1124104aV.LIZJ) {
                            String str = C1124104aV.LIZLLL;
                            c1124104aV.getClass();
                            if (Intrinsics.LJFF(str, ((IAccountDependencyService) C1124104aV.LIZIZ.getValue()).getUserId())) {
                                return;
                            }
                        } else {
                            c1124104aV.getClass();
                        }
                        C1124104aV.LIZJ = false;
                        c1124104aV.getClass();
                        C1124104aV.LIZLLL = ((IAccountDependencyService) C1124104aV.LIZIZ.getValue()).getUserId();
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZLLL), C0PEM.LIZJ, null, new C13010057g(null), 2);
                    }
                }
            }

            @Override // X.InterfaceC1890400zIE
            public final void LJFF(EnumC1767180w5U enumC1767180w5U, String str) {
                C1767130w5P.LIZ.getClass();
                C1767130w5P.LIZIZ(enumC1767180w5U, true, str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onBootFinish() {
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        List<ScenesConfig> list;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0408.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_template_region_settings", false)) {
            AnonymousClass0408.LIZIZ = true;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new AnonymousClass0406(null), 2);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C955403oO(null), 2);
        AnonymousClass0409.LIZ.getClass();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object obj = AnonymousClass0409.LIZJ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(TemplateChangeConfig.class, obj, "pdp_template_change_opt", false);
        if (objLJJII != null) {
            obj = objLJJII;
        }
        if (Intrinsics.LJFF(obj, AnonymousClass0409.LIZIZ)) {
            C0C5P.LIZJ().LJIIJJI("pdp_template_change_opt", new InterfaceC304970BxP() { // from class: X.0vrU
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    AnonymousClass0408.LIZ.getClass();
                    AnonymousClass0408.LIZIZ();
                    C0C5P.LIZJ().LJIJ("pdp_template_change_opt", this);
                }
            });
        }
        C1735400vGE c1735400vGE = new C0XQB() { // from class: X.0vGE
            @Override // X.C0XQB
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String str;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        } else {
                            str = "Logout";
                        }
                    } else {
                        str = "Switch";
                    }
                } else {
                    str = "Login";
                }
                C1735240vFy.LIZ.getClass();
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1735160vFq(str, null), 3);
            }
        };
        c1735400vGE.getClass();
        if (C1124704ab.LIZ() && (list = C1735130vFn.LIZ().scenes) != null && !list.isEmpty()) {
            Iterator<ScenesConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().needDialog) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).addLoginOrLogoutListener(c1735400vGE);
                    C1735240vFy.LIZ.getClass();
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1735160vFq("TTStartup", null), 3);
                }
            }
        }
        SmartCheckIntegrateImpl.LIZLLL().init();
        C034Z.LIZ.getClass();
        if (C034Z.LIZ() && C1907507dZ.LIZ()) {
            ((IApiLoggerService) ServiceManager.get().getService(IApiLoggerService.class)).init();
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C2173908fR.LIZ;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2173808fQ(null), 2);
        if (!C973803rM.LIZ.get()) {
            C15O7.LIZJ(new Callable() { // from class: X.0vrR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("ECommerceService@4fed.onBootFinish$1");
                    C973303rH.LL.getClass();
                    String str = C973303rH.LLILLJJLI;
                    C1C7U.LIZIZ("ECommerceService@4fed.onBootFinish$1");
                    return str;
                }
            });
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IEcomSearchDependencyService.class.getName(), anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        ((IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin).initSignalMonitor();
        C0CNO.LIZLLL(0L, AFwS201S0000000_14.get$arr$(69));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public InterfaceC1249740icu orderCenterService() {
        return new InterfaceC1249740icu() { // from class: X.0vgs
            @Override // X.InterfaceC1249740icu
            public final InterfaceC2024807wU LJ() {
                return new OrderCenterEntry();
            }

            @Override // X.InterfaceC1249740icu
            public final int LIZ() {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_order_center_style", true);
                if (iLJIJ == 0) {
                    IECommerceService.LIZ.getClass();
                    return 0;
                }
                if (iLJIJ == 1 || iLJIJ == 2) {
                    IECommerceService.LIZ.getClass();
                    return 1;
                }
                if (iLJIJ == 3 || iLJIJ == 4) {
                    IECommerceService.LIZ.getClass();
                    return 2;
                }
                IECommerceService.LIZ.getClass();
                return 0;
            }

            @Override // X.InterfaceC1249740icu
            public final int LIZLLL() {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_order_center_style", true);
                if (iLJIJ == 1 || iLJIJ == 3) {
                    IECommerceService.LIZ.getClass();
                    return 0;
                }
                if (iLJIJ != 2 && iLJIJ != 4) {
                    return -1;
                }
                IECommerceService.LIZ.getClass();
                return 1;
            }

            @Override // X.InterfaceC1249740icu
            public final void LIZIZ(String str) {
                C1750760vf0.LIZ.getClass();
                C1750760vf0.LIZ(str);
            }

            @Override // X.InterfaceC1249740icu
            public final void LIZJ(String str, Map map) {
                C1018703yb.LIZLLL("tiktokec_ecommerce_centre_entry_show", new AwS45S2100000_26(map, str, 19));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v31 */
            /* JADX WARN: Type inference failed for: r3v32 */
            @Override // X.InterfaceC1249740icu
            public final void LJFF(Context context, String str, String str2, Map map) {
                T t;
                AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
                AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2;
                String str3;
                boolean z;
                String name;
                AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
                boolean z2;
                boolean z3;
                String name2;
                String str4 = str2;
                boolean zLJI = MethodIDManager.LJI(202335);
                C1018703yb.LIZLLL("tiktokec_ecommerce_centre_entry_click", new AwS45S2100000_26(map, str, 18));
                C259800zU c259800zU = new C259800zU();
                String str5 = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1";
                ?? LJI = str4;
                if (str4 == null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                        LJI = SettingsManager.LJI("order_center_schema", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJI = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1";
                    }
                }
                c259800zU.element = LJI;
                if (LJI.length() == 0) {
                    Object objLJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("ecom_order_center_default_schema", String.class, "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1");
                    t = str5;
                    if (objLJIIIIZZ != null) {
                        t = objLJIIIIZZ;
                    }
                } else {
                    t = c259800zU.element;
                }
                c259800zU.element = t;
                C1752000vh0.LIZ.getClass();
                String name3 = null;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_order_center_first_screen_optimize_precise_setting", true, false)) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C059R("personal_home_page", null, c259800zU), 3);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("start_click_time", System.currentTimeMillis());
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name4 = IECommerceMallDependencyService.class.getName();
                    if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        name2 = anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name2 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                }
                if (((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin).shouldShowMallTab()) {
                    str3 = "1";
                } else {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2 = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name5 = IECommerceMallDependencyService.class.getName();
                        if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2 != null) {
                            name = anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                    }
                    if (((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin2).shouldShowMallTopTab()) {
                        str3 = "2";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                }
                SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, (String) c259800zU.element, C2097608Jq.LJIIIIZZ(new Pair("trackParams", C786410Ut5.J3(jSONObject)), new Pair("previous_page", "personal_home_page"), new Pair("entry", "advanced_interactions"), new Pair("entry_name", str), new Pair("shop_tab_position", str3)), false);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name6 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                smartRouteLIZIZ.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), EnumC992703uP.ECOMMERCE_THIRD_PARTY));
                smartRouteLIZIZ.open();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
    }

    public ECommerceService() {
        C15O7.LIZJ(new Callable() { // from class: X.18A1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object c098200Yq;
                C1C7U.LIZ("ECommerceService@4fed.<init>$1");
                try {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    EcomLruCacheSetting.EcomLruCacheSettingConfig ecomLruCacheSettingConfig = EcomLruCacheSetting.LIZ;
                    EcomLruCacheSetting.EcomLruCacheSettingConfig ecomLruCacheSettingConfig2 = (EcomLruCacheSetting.EcomLruCacheSettingConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_lru_cache_setting", EcomLruCacheSetting.EcomLruCacheSettingConfig.class, ecomLruCacheSettingConfig);
                    if (ecomLruCacheSettingConfig2 != null) {
                        ecomLruCacheSettingConfig = ecomLruCacheSettingConfig2;
                    }
                    for (EcomLruCacheSetting.EcomLruCacheScene ecomLruCacheScene : ecomLruCacheSettingConfig.scenes) {
                        String str = ecomLruCacheScene.scene;
                        if (str != null) {
                            C212391189t c212391189t = C212391189t.LIZ;
                            int i = ecomLruCacheScene.maxSize;
                            boolean z = ecomLruCacheScene.persistence;
                            int i2 = ecomLruCacheScene.timeout;
                            boolean z2 = ecomLruCacheScene.immediate;
                            c212391189t.getClass();
                            ((C18A0) C212391189t.LIZIZ.getValue()).LIZ(str, new C212392189u(str, i, z, i2, z2));
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                C1C7U.LIZIZ("ECommerceService@4fed.<init>$1");
                return c189200o6M1boximpl;
            }
        });
        this.fallbackInterceptor = new EcomSchemaFallbackInterceptor();
        this.interceptors$delegate = C452501pT.LIZIZ(new C1125104af(this));
        this.pipeInterceptors = C13LP.LLIIII(C1697810uHb.LJIILJJIL(new EcomOutProductPipeInterceptor(), EcomGeckoUpdateInterceptor.LL, new ECSparkPreloadInterceptor(), new EcomSparkH5AdaptInterceptor(), new EcomRouteInjectInterceptor()));
        this.adPageFrom = "";
        this.adVideoTrackerId = "";
    }

    private final GodaV2RequestParams getGodaV2RequestParams() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        Float fValueOf = Float.valueOf(C1336100ksC.LIZJ(applicationContext));
        Float fValueOf2 = Float.valueOf(C1336100ksC.LIZIZ(applicationContext));
        Float fValueOf3 = Float.valueOf(1.0f);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return new GodaV2RequestParams(new ClientScreen(fValueOf, fValueOf2, fValueOf3, Boolean.valueOf(((IApplicationDependencyService) iECommerceHostService2).isPad())), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean enableAddCartAnimatorOpt() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OptConfigV2 optConfigV2 = C426630Go9.LIZ;
        OptConfigV2 optConfigV22 = (OptConfigV2) c0c64LJIILLIIL.LJJII(OptConfigV2.class, optConfigV2, "pdp_add_cart_optimize_v2", true);
        if (optConfigV22 != null) {
            optConfigV2 = optConfigV22;
        }
        return optConfigV2.addCartAnimatorOpt;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getECommerceRouterInterceptors() {
        return getInterceptors();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isLiveCreatorBCToggleAvailable() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("creator_bc_toggle", 0) == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getEComPipeRouterInterceptors() {
        return this.pipeInterceptors;
    }

    private final HashMap<String, Object> getTrackParams(Uri uri) {
        HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "trackParams");
        if (mapLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZJ);
            linkedHashMap.remove("product_id");
            linkedHashMap.remove("author_id");
            mapLIZJ.put("entrance_info", C1741890vQh.LJIIIIZZ(linkedHashMap));
            return mapLIZJ;
        }
        return null;
    }

    private final void prefetchSkuBatch(String str) {
        SkuPrefetchConfig skuPrefetchConfig;
        Boolean bool;
        IPdpStarter.PdpEnterParam pdpEnterParamSchema2EnterParamForSku;
        Map linkedHashMap;
        String string;
        List list;
        if (str != null && str.length() != 0) {
            C054G c054g = C1758140vqu.LIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ECSettingConfig eCSettingConfig = C1013303xj.LIZ;
            ECSettingConfig eCSettingConfig2 = (ECSettingConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_settings_config", ECSettingConfig.class, eCSettingConfig);
            if (eCSettingConfig2 != null) {
                eCSettingConfig = eCSettingConfig2;
            }
            PrefetchSchemaConfig prefetchSchemaConfig = eCSettingConfig.prefetchSchema;
            if (prefetchSchemaConfig != null && (skuPrefetchConfig = prefetchSchemaConfig.skuPrefetch) != null && (bool = skuPrefetchConfig.enable) != null && bool.booleanValue()) {
                Uri uri = UriProtector.parse(str);
                if (Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/sku") && (pdpEnterParamSchema2EnterParamForSku = schema2EnterParamForSku(str)) != null) {
                    InterfaceC1758450vrP.LIZ.getClass();
                    C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                    GodaV2RequestParams godaV2RequestParams = getGodaV2RequestParams();
                    c1758310vrB.getClass();
                    C1758570vrb c1758570vrb = PdpApi.LIZ;
                    IPdpStarter.PdpEnterParam pdpEnterParamCopy = pdpEnterParamSchema2EnterParamForSku.copy(new LinkedHashMap(pdpEnterParamSchema2EnterParamForSku.requestParams), pdpEnterParamSchema2EnterParamForSku.orderRequestParams, pdpEnterParamSchema2EnterParamForSku.trackParams, pdpEnterParamSchema2EnterParamForSku.pipeParams, pdpEnterParamSchema2EnterParamForSku.visitReportParams, pdpEnterParamSchema2EnterParamForSku.fullScreen, pdpEnterParamSchema2EnterParamForSku.checkedSkuIds, pdpEnterParamSchema2EnterParamForSku.expandHeight, pdpEnterParamSchema2EnterParamForSku.collapsedHeight, pdpEnterParamSchema2EnterParamForSku.collapsible, pdpEnterParamSchema2EnterParamForSku.playerControl, pdpEnterParamSchema2EnterParamForSku.isPromotionPage, pdpEnterParamSchema2EnterParamForSku.productEnterContext, pdpEnterParamSchema2EnterParamForSku.pdpCacheKey, pdpEnterParamSchema2EnterParamForSku.pdpPreParam, pdpEnterParamSchema2EnterParamForSku.preTrackNodeId, pdpEnterParamSchema2EnterParamForSku.awemeId, pdpEnterParamSchema2EnterParamForSku.clickFrom, pdpEnterParamSchema2EnterParamForSku.bizType, pdpEnterParamSchema2EnterParamForSku.enterViewName, pdpEnterParamSchema2EnterParamForSku.ocpContext, pdpEnterParamSchema2EnterParamForSku.ocpFlag, pdpEnterParamSchema2EnterParamForSku.ocpOrderId, pdpEnterParamSchema2EnterParamForSku.selectedAddressId, pdpEnterParamSchema2EnterParamForSku.btmToken, pdpEnterParamSchema2EnterParamForSku.route, pdpEnterParamSchema2EnterParamForSku.schemaChainKey, pdpEnterParamSchema2EnterParamForSku.autoOpenSku, pdpEnterParamSchema2EnterParamForSku.autoOpenSkuPanelClickFrom, pdpEnterParamSchema2EnterParamForSku.containerParams, pdpEnterParamSchema2EnterParamForSku.isFromPdpAddCartAfterToastEntrance, pdpEnterParamSchema2EnterParamForSku.autoAddToCart, pdpEnterParamSchema2EnterParamForSku.pdpPreviousPageId, pdpEnterParamSchema2EnterParamForSku.trackId, pdpEnterParamSchema2EnterParamForSku.recipientInfoId, pdpEnterParamSchema2EnterParamForSku.expandOnShow, pdpEnterParamSchema2EnterParamForSku.pageExpressionType);
                    pdpEnterParamCopy.requestParams.put("template", "tt_sku_selection");
                    Object obj = pdpEnterParamCopy.requestParams.get("product_id");
                    if ((obj instanceof List) && (list = (List) obj) != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Object obj2 : list) {
                            Map<String, Object> map = pdpEnterParamCopy.requestParams;
                            C1013003xg c1013003xg = IPdpStarter.LIZ;
                            Map<String, Object> map2 = pdpEnterParamSchema2EnterParamForSku.trackParams;
                            c1013003xg.getClass();
                            map.put("product_source_info", C2097608Jq.LJI(new Pair(obj2, Integer.valueOf(C1013003xg.LIZ(map2)))));
                            arrayList.add(Unit.LIZ);
                        }
                    }
                    C1742270vRJ.LIZ(pdpEnterParamCopy, pdpEnterParamCopy.requestParams);
                    PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
                    if (pageSourceInfoLJ != null) {
                        pdpEnterParamCopy.requestParams.put("page_source_info", C1741890vQh.LJIIIIZZ(pageSourceInfoLJ));
                    }
                    pdpEnterParamCopy.requestParams.putAll(C1742270vRJ.LIZIZ(pdpEnterParamSchema2EnterParamForSku));
                    Object obj3 = pdpEnterParamCopy.requestParams.get("experiment");
                    if (!C19719512Dh.LJII(obj3) || (linkedHashMap = (Map) obj3) == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    Pair[] pairArr = new Pair[1];
                    n nVarLIZJ = C1071004Gu.LIZJ();
                    if (nVarLIZJ == null || (string = nVarLIZJ.toString()) == null) {
                        string = "";
                    }
                    pairArr[0] = new Pair("ec_pdp_sea_bff_config", string);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    if (C1071004Gu.LIZ()) {
                        C1055504Av.LIZ.getClass();
                        C1055504Av.LJI(mapLJIIJ);
                    }
                    Map mapLIZ = C1758480vrS.LIZ();
                    if (mapLIZ != null) {
                        mapLJIIJ.putAll(mapLIZ);
                    }
                    Object linkedHashMap2 = linkedHashMap.get("params_map");
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap.put("params_map", linkedHashMap2);
                    }
                    C19719512Dh.LIZJ(linkedHashMap2).putAll(mapLJIIJ);
                    pdpEnterParamCopy.requestParams.put("experiment", linkedHashMap);
                    C11RS.LJLZ(c1758570vrb.LJFF(pdpEnterParamCopy, godaV2RequestParams).LJL(C11S5.LIZ()).LJJLIIIJJIZ(1L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vrT
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj4) {
                            final C1758520vrW c1758520vrW = (C1758520vrW) obj4;
                            if (c1758520vrW.isCodeOK()) {
                                return c1758520vrW;
                            }
                            final int i = c1758520vrW.code;
                            final String str2 = c1758520vrW.message;
                            throw new RuntimeException(i, str2, c1758520vrW) { // from class: X.0vrV
                                public static final int $stable = 8;
                                public final int LL;
                                public final C1758520vrW LLILLJJLI;

                                public final int getCode() {
                                    return this.LL;
                                }

                                public final C1758520vrW getResp() {
                                    return this.LLILLJJLI;
                                }

                                {
                                    super(str2);
                                    this.LL = i;
                                    this.LLILLJJLI = c1758520vrW;
                                }
                            };
                        }
                    }).LJJIJIIJI(new C09JN() { // from class: X.00Q3
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                            C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchPdpBatchV2$source$2");
                            C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchPdpBatchV2$source$2");
                        }
                    }).LJJIJIL(new C09JN() { // from class: X.00Q4
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                            C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchPdpBatchV2$source$3");
                            C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchPdpBatchV2$source$3");
                        }
                    })).LJLLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.09Y1
                        @Override // X.C09JN
                        public final void accept(Object obj4) {
                            Map<String, PDPResponse> map3;
                            List<ProductPackStruct> list2;
                            ProductPackStruct productPackStruct;
                            C1C7U.LIZ("ECommerceService@4fed.prefetchSkuBatch$1$1");
                            PDPBatchResponseData pDPBatchResponseData = (PDPBatchResponseData) ((Response) obj4).data;
                            if (pDPBatchResponseData != null && (map3 = pDPBatchResponseData.pdpResponses) != null) {
                                for (Map.Entry<String, PDPResponse> entry : map3.entrySet()) {
                                    String key = entry.getKey();
                                    PDPResponse value = entry.getValue();
                                    C1054204Ai c1054204Ai = C1054204Ai.LIZ;
                                    GodaV2Protocol<ProductInfoPackData> godaV2Protocol = value.godaV2Protocol;
                                    Boolean bool2 = Boolean.TRUE;
                                    c1054204Ai.getClass();
                                    ProductInfoPackData productInfoPackDataLJI = C1054204Ai.LJI(godaV2Protocol, null, bool2);
                                    if (productInfoPackDataLJI != null && (list2 = productInfoPackDataLJI.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) ListProtector.get(list2, 0)) != null) {
                                        C054G c054g2 = C1758140vqu.LIZ;
                                        C1758140vqu.LJFF(key, productPackStruct, EnumC1756020vnU.PREFETCH_PART, null);
                                    }
                                }
                            }
                            C1C7U.LIZIZ("ECommerceService@4fed.prefetchSkuBatch$1$1");
                        }
                    }, new C09JN() { // from class: X.09Y3
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                            C1C7U.LIZ("ECommerceService@4fed.prefetchSkuBatch$1$2");
                            C1C7U.LIZIZ("ECommerceService@4fed.prefetchSkuBatch$1$2");
                        }
                    });
                }
            }
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParam(String str) {
        ConcurrentHashMap concurrentHashMap;
        Uri uri = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uri.getHost(), "ec") || !Intrinsics.LJFF(uri.getPath(), "/pdp")) {
            return null;
        }
        try {
            HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "requestParams");
            if (mapLIZJ != null) {
                concurrentHashMap = new ConcurrentHashMap(mapLIZJ);
            } else {
                concurrentHashMap = new ConcurrentHashMap();
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            return new IPdpStarter.PdpEnterParam(concurrentHashMap, null, getTrackParams(uri), null, null, false, null, C958103op.LIZJ(), null, true, true, false, null, null, new ConcurrentHashMap(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 0, null, null, null, false, null);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParamForSku(String str) {
        ConcurrentHashMap concurrentHashMap;
        Uri uri = UriProtector.parse(str);
        if (Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/sku")) {
            try {
                HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "requestParams");
                if (mapLIZJ != null) {
                    concurrentHashMap = new ConcurrentHashMap(mapLIZJ);
                } else {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                return new IPdpStarter.PdpEnterParam(concurrentHashMap, null, null, null, null, false, null, C958103op.LIZJ(), null, true, true, false, null, null, new ConcurrentHashMap(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 0, null, null, null, false, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateTrackId(Aweme aweme) {
        List<String> list;
        EcommerceInfo ecommerceInfo;
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null) {
                list = ecommerceInfo.spuList;
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getRequestId());
            sbLIZ.append('_');
            sbLIZ.append(aweme.getAid());
            sbLIZ.append('_');
            sbLIZ.append(list.get(0));
            sbLIZ.append('_');
            sbLIZ.append(System.currentTimeMillis());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_ec_mall_track_id_md5", true)) {
                String strLIZ = C2085508Ez.LIZ(strLIZIZ);
                if (strLIZ != null) {
                    strLIZIZ = strLIZ;
                }
                this.adVideoTrackerId = strLIZIZ;
                return strLIZIZ;
            }
            this.adVideoTrackerId = strLIZIZ;
            return strLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public List<Pair<Integer, String>> getPageTemplateList(String str) {
        EnumC969503qf[] enumC969503qfArrValues = EnumC969503qf.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC969503qf enumC969503qf : enumC969503qfArrValues) {
            if (Intrinsics.LJFF(enumC969503qf.getPage(), str) || Intrinsics.LJFF(enumC969503qf.getPage(), "*")) {
                arrayList.add(enumC969503qf);
            }
        }
        List<EnumC969503qf> listLJLLLL = C13LP.LJLLLL(new AComparatorS45S0000000_26(2), arrayList);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        for (EnumC969503qf enumC969503qf2 : listLJLLLL) {
            arrayList2.add(new Pair(Integer.valueOf(enumC969503qf2.getTemplate()), enumC969503qf2.name()));
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isECADVideo(Aweme aweme) {
        List<String> list;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        String pageFrom = awemeRawAd.getPageFrom();
        if (pageFrom != null && pageFrom.length() > 0) {
            this.adPageFrom = awemeRawAd.getPageFrom();
        }
        EcommerceInfo ecommerceInfo = awemeRawAd.getEcommerceInfo();
        if (ecommerceInfo == null || (list = ecommerceInfo.spuList) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isHalfPDPFullScreenMode(Fragment fragment) {
        String str;
        C18E9 c18e9LIZJ;
        String str2;
        C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(fragment));
        if (btmPageInfoV2 == null || (str = btmPageInfoV2.LJII) == null || (c18e9LIZJ = C18EN.LIZJ(str)) == null) {
            return false;
        }
        InterfaceC21252118Et interfaceC21252118EtLIZJ = c18e9LIZJ.LIZJ(btmPageInfoV2.LJI);
        Collection<? extends InterfaceC21252118Et> collectionLJ = c18e9LIZJ.LJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionLJ) {
            InterfaceC21252118Et interfaceC21252118Et = (InterfaceC21252118Et) obj;
            if (Intrinsics.LJFF(interfaceC21252118Et.LJIILIIL(), interfaceC21252118EtLIZJ) && interfaceC21252118Et.LJIIJ() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            String strOptString$default = null;
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it2.next();
            C21246818Cs btmPageInfoV22 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(((InterfaceC21252118Et) next).LJIIJ()));
            if (btmPageInfoV22 != null) {
                str2 = btmPageInfoV22.LIZIZ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "a2270.b6661.c0.d0")) {
                BcmParams bcmParams = btmPageInfoV22.LJIIL;
                if (bcmParams != null) {
                    strOptString$default = BcmParams.optString$default(bcmParams, "is_half_screen_pdp_full_screen_mode", null, 2, null);
                }
                if (Intrinsics.LJFF(strOptString$default, "1")) {
                    if (next == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String prefetchPdpEnterLiveRoom(String str) {
        Uri uri;
        String strLIZIZ;
        if (str.length() != 0 && (strLIZIZ = C1942307jB.LIZIZ((uri = UriProtector.parse(str)), "prefetch_scene")) != null) {
            int iHashCode = strLIZIZ.hashCode();
            if (iHashCode != -1472524243) {
                if (iHashCode != 3343892) {
                    if (iHashCode == 998835423 && strLIZIZ.equals("general_search")) {
                        return getExtraSchema(uri, str, "general_search");
                    }
                    return str;
                }
                if (strLIZIZ.equals("mall")) {
                    C1758430vrN.LIZ.getClass();
                    C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                    ECMallLivePdpAccurateModel eCMallLivePdpAccurateModel = C1758430vrN.LIZIZ;
                    ECMallLivePdpAccurateModel eCMallLivePdpAccurateModel2 = (ECMallLivePdpAccurateModel) c0c64LJIILLIIL.LJJII(ECMallLivePdpAccurateModel.class, eCMallLivePdpAccurateModel, "ec_mall_live_pdp_jump_accurate", true);
                    if (eCMallLivePdpAccurateModel2 != null) {
                        eCMallLivePdpAccurateModel = eCMallLivePdpAccurateModel2;
                    }
                    int i = eCMallLivePdpAccurateModel.enable;
                    if (i != EnumC586490MzP.Style1.getValue() && i != EnumC586490MzP.Style2.getValue()) {
                        return getDefaultSchema(uri, str);
                    }
                    return getExtraSchema(uri, str, "mall");
                }
                return str;
            }
            if (strLIZIZ.equals("search_vertical")) {
                C1758440vrO.LIZ.getClass();
                C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
                ECSearchLivePdpAccurateModel eCSearchLivePdpAccurateModel = C1758440vrO.LIZIZ;
                ECSearchLivePdpAccurateModel eCSearchLivePdpAccurateModel2 = (ECSearchLivePdpAccurateModel) c0c64LJIILLIIL2.LJJII(ECSearchLivePdpAccurateModel.class, eCSearchLivePdpAccurateModel, "ec_search_live_pdp_jump_accurate", true);
                if (eCSearchLivePdpAccurateModel2 != null) {
                    eCSearchLivePdpAccurateModel = eCSearchLivePdpAccurateModel2;
                }
                int i2 = eCSearchLivePdpAccurateModel.enable;
                if (i2 != EnumC586500MzQ.STYLE1.getValue() && i2 != EnumC586500MzQ.STYLE2.getValue()) {
                    return getDefaultSchema(uri, str);
                }
                return getExtraSchema(uri, str, "search_vertical");
            }
            return str;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void releaseSharedPlayerInFeed(String str) {
        ArrayMap<String, C1766610w4Z> arrayMap;
        C1766610w4Z c1766610w4Z;
        SoftReference<C0N0Y> softReference;
        C0N0Y c0n0y;
        C1766600w4Y.LIZ.getClass();
        if (str != null && (c1766610w4Z = (arrayMap = C1766600w4Y.LIZIZ).get(str)) != null && c1766610w4Z.LJ) {
            C1766610w4Z c1766610w4Z2 = arrayMap.get(str);
            if (c1766610w4Z2 != null && (softReference = c1766610w4Z2.LIZ) != null && (c0n0y = softReference.get()) != null) {
                c0n0y.release();
            }
            arrayMap.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setCurrentRoomId(Long l) {
        IPdpStarter.LIZ.getClass();
        C1013003xg.LIZIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setIsDeeplinkOpenECMallSearchFlag(boolean z) {
        C2211641BhC c2211641BhC;
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        C1766860w4y.LIZ.getClass();
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC2 = C2211621BhA.LIZJ;
            if (c2211641BhC2 != null && c2211641BhC2.LJJJ == null && c2211641BhC2 != null) {
                c2211641BhC2.LJJJ = new ConcurrentHashMap<>();
            }
            C1766870w4z.LIZ.getClass();
            String str2 = "1";
            if (C1766870w4z.LIZ("ec_is_deeplink_ec_mall_search") && (c2211641BhC = C2211621BhA.LIZJ) != null && (concurrentHashMap = c2211641BhC.LJJJ) != null) {
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                concurrentHashMap.put("ec_is_deeplink_ec_mall_search", str);
            }
            C13BV c13bv = C13BV.INSTANCE;
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C1766870w4z.LJFF("ec_is_deeplink_ec_mall_search", str2, c13bv, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void updateFallbackConfig(Map<String, String> map) {
        HashMap<String, SchemaFallbackConfig> map2 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), new SchemaFallbackConfig(entry.getKey(), entry.getValue()));
        }
        this.fallbackInterceptor.LLILLJJLI = map2;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class WishListFragmentData extends PowerViewPagerFragmentItem<WishListFragment> {
        public final String location;
        public final String previousPage;
        public static final Parcelable.Creator<WishListFragmentData> CREATOR = new Parcelable.Creator<WishListFragmentData>() { // from class: X.0e7g
            @Override // android.os.Parcelable.Creator
            public final ECommerceService.WishListFragmentData createFromParcel(Parcel parcel) {
                return new ECommerceService.WishListFragmentData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ECommerceService.WishListFragmentData[] newArray(int i) {
                return new ECommerceService.WishListFragmentData[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.location);
            parcel.writeString(this.previousPage);
        }

        public WishListFragmentData(String str, String str2) {
            this.location = str;
            this.previousPage = str2;
        }
    }

    private final String getDefaultSchema(Uri uri, String str) {
        Uri.Builder builderAppendQueryParameter;
        Uri uriBuild;
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (builderBuildUpon != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()))) != null && (uriBuild = builderAppendQueryParameter.build()) != null) {
                String string = uriBuild.toString();
                if (string != null) {
                    return string;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return str;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void appendAdTrackParam(Aweme aweme, Uri.Builder builder) {
        EcommerceInfo ecommerceInfo;
        List<String> list;
        String str;
        List<String> list2;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (list = ecommerceInfo.spuList) != null && list.size() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
                if (ecommerceInfo2 != null && (list2 = ecommerceInfo2.spuList) != null) {
                    str = list2.get(0);
                } else {
                    str = null;
                }
                jSONObject.put("group_id", aweme.getAid());
                if (awemeRawAd.getAdId() != null) {
                    jSONObject.put("ad_id", awemeRawAd.getAdId().longValue());
                }
                jSONObject.put("product_id", str);
                jSONObject.put("track_id", this.adVideoTrackerId);
                builder.appendQueryParameter("trackParams", C786410Ut5.J3(jSONObject));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public WishListFragmentData createWishListFragmentData(String str, String str2) {
        return new WishListFragmentData(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtra(Aweme aweme, String str) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            int i = 1;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (!Intrinsics.LJFF(authorUid, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
                i = 0;
            }
            jSONObject.put("is_self", i);
            jSONObject.put("enter_from", this.adPageFrom);
            jSONObject.put("follow_status", AwemeExtKt.getFollowStatus(aweme));
            jSONObject.put("track_id", str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtraAll(Aweme aweme, String str) {
        boolean z;
        String str2;
        int i;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        int i2;
        boolean z2;
        String str3;
        String str4;
        String nativeSiteCustomData;
        String nativeSiteCustomData2;
        boolean z3;
        List<String> list;
        EcommerceInfo ecommerceInfo;
        List<String> list2;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        boolean z4 = true;
        if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (list2 = ecommerceInfo.spuList) != null && list2.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
            String name = null;
            if (ecommerceInfo2 != null && (list = ecommerceInfo2.spuList) != null) {
                str2 = list.get(0);
            } else {
                str2 = null;
            }
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            if (aweme.isAd()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_ad", i);
            if (awemeRawAd.getCreativeId() != null) {
                jSONObject.put("creative_id", awemeRawAd.getCreativeId().longValue());
            }
            if (awemeRawAd.getAdId() != null) {
                jSONObject.put("ad_id", awemeRawAd.getAdId().longValue());
            }
            jSONObject.put("track_id", str);
            jSONObject.put("item_order", 1);
            jSONObject.put("request_id", aweme.getRequestId());
            jSONObject.put("product_id", str2);
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (Intrinsics.LJFF(authorUid, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_self", i2);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (nativeSiteCustomData2 = awemeRawAd2.getNativeSiteCustomData()) == null || !a0.LJJIIZI(nativeSiteCustomData2, "shopType", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 == null || (nativeSiteCustomData = awemeRawAd3.getNativeSiteCustomData()) == null || !a0.LJJIIZI(nativeSiteCustomData, "\"shopType\":2", false)) {
                    z4 = false;
                }
                if (z4) {
                    str4 = "100";
                } else {
                    str4 = "5";
                }
                jSONObject.put("product_source", str4);
            }
            jSONObject.put("enter_from", this.adPageFrom);
            jSONObject.put("source_page_type", "video");
            jSONObject.put("page_name", "video");
            if (aweme.getAwemeType() == 101) {
                str3 = "live";
            } else {
                str3 = "ad_video_entrance";
            }
            jSONObject.put("entrance_form", str3);
            jSONObject.put("click_area", "finish");
            jSONObject.put("follow_status", AwemeExtKt.getFollowStatus(aweme));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Map<String, Object> getPdpAlgorithmMetricsParams(List<String> list, String str) {
        if (list != null) {
            Map mapLIZ = C1054504Al.LIZ(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        return C1054504Al.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void postEvent(String str, JSONObject jSONObject) {
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String str, Context context) {
        prefetchPdp(str, context, 1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchSchema(String str, Context context) {
        String path;
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getHost(), "ec") && (path = uri.getPath()) != null) {
                int iHashCode = path.hashCode();
                if (iHashCode != 1511021) {
                    if (iHashCode == 1514126 && path.equals("/sku")) {
                        prefetchSkuBatch(str);
                        return;
                    }
                    return;
                }
                if (!path.equals("/pdp")) {
                    return;
                }
                prefetchPdp(str, context, 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportVerticalSearchApiLog(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put("page_name", "shop_search_result");
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setSearchResultTabNameFlag(String str, Fragment fragment) {
        C2211641BhC c2211641BhC;
        ConcurrentHashMap<String, String> concurrentHashMap;
        C1766860w4y.LIZ.getClass();
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC2 = C2211621BhA.LIZJ;
            if (c2211641BhC2 != null && c2211641BhC2.LJJJ == null && c2211641BhC2 != null) {
                c2211641BhC2.LJJJ = new ConcurrentHashMap<>();
            }
            C1766870w4z.LIZ.getClass();
            if (C1766870w4z.LIZ("ec_search_tab_name") && (c2211641BhC = C2211621BhA.LIZJ) != null && (concurrentHashMap = c2211641BhC.LJJJ) != null) {
                concurrentHashMap.put("ec_search_tab_name", str);
            }
        }
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        List listSingletonList = Collections.singletonList(PageFinder.via(fragment));
        c1766870w4z.getClass();
        C1766870w4z.LJFF("ec_search_tab_name", str, listSingletonList, false);
    }

    private final String getExtraSchema(Uri uri, String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2;
        Uri.Builder builderAppendQueryParameter3;
        Uri.Builder builderAppendQueryParameter4;
        Uri uriBuild;
        try {
            HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "requestParams");
            if (mapLIZJ != null) {
                concurrentHashMap = new ConcurrentHashMap(mapLIZJ);
            } else {
                concurrentHashMap = new ConcurrentHashMap();
            }
            HashMap<String, Object> mapLIZJ2 = C1741890vQh.LIZJ(uri, "trackParams");
            if (mapLIZJ2 != null) {
                concurrentHashMap2 = new ConcurrentHashMap(mapLIZJ2);
            } else {
                concurrentHashMap2 = new ConcurrentHashMap();
            }
            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
            concurrentHashMap3.put("isPrefetchScene", "1");
            concurrentHashMap3.put("prefetchScene", str2);
            concurrentHashMap2.put("traffic_source_list", new JSONArray(C1742080vR0.LJI(uri)));
            InterfaceC1758450vrP.LIZ.getClass();
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            C1758310vrB.LJJJJ(new IPdpStarter.PdpEnterParam(concurrentHashMap, null, concurrentHashMap2, null, null, false, null, C958103op.LIZJ(), null, true, true, false, null, null, concurrentHashMap3, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 0, null, null, null, false, null), false, 4, false, Boolean.FALSE, null, null, new C04J0(), getGodaV2RequestParams());
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (builderBuildUpon != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("autoSchema", "1")) != null && (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()))) != null && (builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("prefetchScene", str2)) != null && (builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("isScenePrefetch", "1")) != null && (uriBuild = builderAppendQueryParameter4.build()) != null) {
                String string = uriBuild.toString();
                if (string != null) {
                    return string;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return str;
        }
    }

    public int getPageTemplate(Integer num, String str, String str2) {
        return AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), str, str2, null, 8);
    }

    public boolean openAppLink(Context context, String str, String str2) {
        C1725790v0j.LIZ.getClass();
        return C1725790v0j.LIZJ(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void openOrderSubmit(Context context, OrderSubmitEnterParamsV2 orderSubmitEnterParamsV2, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ActivityUserSelection activityUserSelection;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        SkuCardStyleInfo skuCardStyleInfo;
        C928603k4.LIZ.getClass();
        C993603uY.LIZJ(str, AFwS268S0000000_26.get$arr$(592));
        OrderSubmitRequestParamV2 orderSubmitRequestParamV2 = orderSubmitEnterParamsV2.requestParams;
        String str2 = orderSubmitRequestParamV2.buyerAddrId;
        List<OrderShopDigestV2> list = orderSubmitRequestParamV2.orderShop;
        int i = 10;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (OrderShopDigestV2 orderShopDigestV2 : list) {
                String str3 = orderShopDigestV2.sellerId;
                List<OrderSKUDTOV2> list2 = orderShopDigestV2.orderSKUs;
                if (list2 != null) {
                    arrayList7 = new ArrayList(C15438062q.LJIJJ(list2, i));
                    for (OrderSKUDTOV2 orderSKUDTOV2 : list2) {
                        String str4 = orderSKUDTOV2.productId;
                        String str5 = orderSKUDTOV2.skuId;
                        Integer num = orderSKUDTOV2.quantity;
                        String str6 = orderSKUDTOV2.cartItemId;
                        Integer num2 = orderSKUDTOV2.source;
                        String str7 = orderSKUDTOV2.sourceInfo;
                        String str8 = orderSKUDTOV2.entranceInfo;
                        String str9 = orderSKUDTOV2.chainKey;
                        String str10 = orderSKUDTOV2.kolId;
                        String str11 = orderSKUDTOV2.logisticsServiceId;
                        String str12 = orderSKUDTOV2.priceVal;
                        String str13 = orderSKUDTOV2.currency;
                        String str14 = orderSKUDTOV2.warehouseId;
                        String str15 = orderSKUDTOV2.bundleId;
                        String str16 = orderSKUDTOV2.aggregationKey;
                        Integer num3 = orderSKUDTOV2.aggregationCount;
                        SkuCardStyleInfoV2 skuCardStyleInfoV2 = orderSKUDTOV2.skuCardStyleInfo;
                        if (skuCardStyleInfoV2 != null) {
                            skuCardStyleInfo = new SkuCardStyleInfo(skuCardStyleInfoV2.skuCardStyleType, skuCardStyleInfoV2.titleLightText, skuCardStyleInfoV2.editBundleQuantityToast);
                        } else {
                            skuCardStyleInfo = null;
                        }
                        arrayList7.add(new OrderSKUDTO(str4, str5, num, str6, num2, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, num3, skuCardStyleInfo, orderSKUDTOV2.channelReserveKey, orderSKUDTOV2.bizType, null, null, null, null, null, null, null, null));
                    }
                } else {
                    arrayList7 = null;
                }
                arrayList.add(new OrderShopDigest(str3, arrayList7, orderShopDigestV2.deliveryOption));
                i = 10;
            }
        } else {
            arrayList = null;
        }
        HashMap<String, Object> map = orderSubmitRequestParamV2.orderRequestParams;
        String str17 = orderSubmitRequestParamV2.noticeVoucherTypeId;
        List<String> list3 = orderSubmitRequestParamV2.claimVoucherTypeIds;
        List<VoucherMetaV2> list4 = orderSubmitRequestParamV2.claimVoucherMetas;
        if (list4 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, i));
            for (VoucherMetaV2 voucherMetaV2 : list4) {
                arrayList2.add(new VoucherMeta(voucherMetaV2.voucherTypeId, voucherMetaV2.voucherId, voucherMetaV2.instanceKey));
            }
        } else {
            arrayList2 = null;
        }
        List<String> list5 = orderSubmitRequestParamV2.activityIds;
        Long l = orderSubmitRequestParamV2.keyTimestamp;
        Integer num4 = orderSubmitRequestParamV2.oneStepOrderType;
        Boolean bool = orderSubmitRequestParamV2.isFromFollow;
        Map<String, String> map2 = orderSubmitRequestParamV2.daInfo;
        String str18 = orderSubmitRequestParamV2.preLogId;
        String str19 = orderSubmitRequestParamV2.billInfoParams;
        List<String> list6 = orderSubmitRequestParamV2.promotionIds;
        List<VoucherMetaV2> list7 = orderSubmitRequestParamV2.selectedVoucherMetas;
        if (list7 != null) {
            arrayList3 = new ArrayList(C15438062q.LJIJJ(list7, 10));
            for (VoucherMetaV2 voucherMetaV22 : list7) {
                arrayList3.add(new VoucherMeta(voucherMetaV22.voucherTypeId, voucherMetaV22.voucherId, voucherMetaV22.instanceKey));
            }
        } else {
            arrayList3 = null;
        }
        ActivityUserSelectionV2 activityUserSelectionV2 = orderSubmitRequestParamV2.activityUserSelection;
        if (activityUserSelectionV2 != null) {
            List<ActivityBaseInfoV2> list8 = activityUserSelectionV2.removedActivityInfos;
            if (list8 != null) {
                arrayList5 = new ArrayList(C15438062q.LJIJJ(list8, 10));
                for (ActivityBaseInfoV2 activityBaseInfoV2 : list8) {
                    arrayList5.add(new ActivityBaseInfo(activityBaseInfoV2.activityId, activityBaseInfoV2.promotionTemplate));
                }
            } else {
                arrayList5 = null;
            }
            List<ActivityBaseInfoV2> list9 = activityUserSelectionV2.selectedActivityInfos;
            if (list9 != null) {
                arrayList6 = new ArrayList(C15438062q.LJIJJ(list9, 10));
                for (ActivityBaseInfoV2 activityBaseInfoV22 : list9) {
                    arrayList6.add(new ActivityBaseInfo(activityBaseInfoV22.activityId, activityBaseInfoV22.promotionTemplate));
                }
            } else {
                arrayList6 = null;
            }
            activityUserSelection = new ActivityUserSelection(arrayList5, arrayList6);
        } else {
            activityUserSelection = null;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = new OrderSubmitRequestParam(str2, arrayList, map, str17, list3, arrayList2, list5, l, 0L, 0L, null, num4, bool, map2, str18, str19, list6, arrayList3, activityUserSelection, null, null, null, null, null);
        List<RegionV2> list10 = orderSubmitEnterParamsV2.combinedArea;
        if (list10 != null) {
            arrayList4 = new ArrayList(C15438062q.LJIJJ(list10, 10));
            for (RegionV2 regionV2 : list10) {
                arrayList4.add(new Region(regionV2.name, regionV2.geoNameId, regionV2.code, regionV2.districtKey, null, null, null));
            }
        } else {
            arrayList4 = null;
        }
        C928603k4.LIZ(context, new OrderSubmitEnterParams(orderSubmitRequestParam, null, arrayList4, orderSubmitEnterParamsV2.chainKey, orderSubmitEnterParamsV2.trackParams, orderSubmitEnterParamsV2.repoId, orderSubmitEnterParamsV2.buyType, null, orderSubmitEnterParamsV2.pdpFrom, null, orderSubmitEnterParamsV2.voucherTypeId, Integer.valueOf(orderSubmitEnterParamsV2.bizType), orderSubmitEnterParamsV2.pipoBnplSelectedTenure, orderSubmitEnterParamsV2.freeShipping, orderSubmitEnterParamsV2.orderRequestParams, orderSubmitEnterParamsV2.softIntercept, orderSubmitEnterParamsV2.btmToken, orderSubmitEnterParamsV2.platformLinkBasedItem, Boolean.FALSE, null, null, orderSubmitEnterParamsV2.seaOneStepType, orderSubmitEnterParamsV2.seaOneStepMask), str, orderSubmitEnterParamsV2.buyNowSchema, null, 0, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String str, Context context, int i) {
        IPdpStarter.PdpEnterParam pdpEnterParamSchema2EnterParam;
        Activity activityLIZ;
        Uri uri = UriProtector.parse(str);
        if (Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/pdp") && Intrinsics.LJFF(uri.getPath(), "/pdp") && (pdpEnterParamSchema2EnterParam = schema2EnterParam(str)) != null) {
            InterfaceC1758450vrP.LIZ.getClass();
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            C1758310vrB.LJJJJ(pdpEnterParamSchema2EnterParam, false, i, false, Boolean.FALSE, null, null, new C04J0(), getGodaV2RequestParams()).LIZJ.LJJLL(new C09JN() { // from class: X.0hej
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ECommerceService@4fed.prefetchPdp$1$1");
                    C1C7U.LIZIZ("ECommerceService@4fed.prefetchPdp$1$1");
                }
            }, new C09JN() { // from class: X.0hek
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ECommerceService@4fed.prefetchPdp$1$2");
                    C1C7U.LIZIZ("ECommerceService@4fed.prefetchPdp$1$2");
                }
            });
            if (!pdpEnterParamSchema2EnterParam.isPromotionPage() && !pdpEnterParamSchema2EnterParam.fullScreen && context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C954703oH.LIZIZ(activityLIZ, false);
            }
        }
    }

    public Set<String> getPagesStrategyService(Integer num, String str, String str2, String str3) {
        EnumC955203oM enumC955203oMLIZ = C955103oL.LIZ(num);
        if (str == null) {
            return C08CX.INSTANCE;
        }
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, enumC955203oMLIZ, str, null, null, 12);
        C969603qg c969603qg = EnumC969503qf.Companion;
        String bizName = enumC955203oMLIZ.getBizName();
        c969603qg.getClass();
        C987903td c987903tdLIZIZ = C969603qg.LIZIZ(iLJIIJJI, "product_detail", bizName);
        ConcurrentHashMap<Class<? extends Object>, C938403le> concurrentHashMap = C03M5.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        final BizIdentity bizIdentity = new BizIdentity(str3, c987903tdLIZIZ.LIZ, c987903tdLIZIZ.LIZIZ);
        final HashSet hashSet = new HashSet();
        C03M5.LIZ.forEach(new BiConsumer() { // from class: X.03zi
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Object obj3 = ((C938403le) obj2).LIZIZ.get(bizIdentity.getUniqueKey());
                if (obj3 != null) {
                    Class<?> cls = obj3.getClass();
                    HashSet<String> hashSet2 = hashSet;
                    Object obj4 = ((Map) C03M5.LIZIZ.getValue()).get(cls);
                    if (obj4 != null) {
                        hashSet2.add((String) obj4);
                    }
                }
            }
        });
        return hashSet;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportAdVideoLog(Aweme aweme, boolean z, int i, String str) {
        EcommerceInfo ecommerceInfo;
        List<String> list;
        String str2;
        int i2;
        IECommerceHostService iECommerceHostService;
        String str3;
        String str4;
        String str5;
        boolean z2;
        String nativeSiteCustomData;
        boolean z3;
        boolean z4;
        String str6;
        String nativeSiteCustomData2;
        String nativeSiteCustomData3;
        List<String> list2;
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (list = ecommerceInfo.spuList) != null && list.size() == 1) {
                EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
                String name = null;
                if (ecommerceInfo2 != null && (list2 = ecommerceInfo2.spuList) != null) {
                    str2 = list2.get(0);
                } else {
                    str2 = null;
                }
                Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, toBtmCode(i), PageFinder.via(awemeRawAd.getBtmPageId()), null, 4, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                jSONObject.put("group_id", aweme.getAid());
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && (nativeSiteCustomData = awemeRawAd2.getNativeSiteCustomData()) != null && a0.LJJIIZI(nativeSiteCustomData, "shopType", false)) {
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 != null && (nativeSiteCustomData3 = awemeRawAd3.getNativeSiteCustomData()) != null && a0.LJJIIZI(nativeSiteCustomData3, "\"shopType\":2", false)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                    if (awemeRawAd4 != null && (nativeSiteCustomData2 = awemeRawAd4.getNativeSiteCustomData()) != null && a0.LJJIIZI(nativeSiteCustomData2, "\"shopType\":1", false)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        str6 = "100";
                    } else {
                        str6 = null;
                    }
                    if (!z4) {
                        if (str6 != null) {
                        }
                    } else {
                        str6 = "5";
                    }
                    jSONObject.put("product_source", str6);
                }
                jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
                if (aweme.isAd()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_ad", i2);
                if (awemeRawAd.getCreativeId() != null) {
                    jSONObject.put("creative_id", awemeRawAd.getCreativeId().longValue());
                }
                if (awemeRawAd.getAdId() != null) {
                    jSONObject.put("ad_id", awemeRawAd.getAdId().longValue());
                }
                jSONObject.put("track_id", str);
                jSONObject.put("item_order", 1);
                jSONObject.put("request_id", aweme.getRequestId());
                jSONObject.put("product_id", str2);
                String authorUid = AwemeExtKt.getAuthorUid(aweme);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IAccountDependencyService.class.getName();
                    if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                        name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                    iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                jSONObject.put("is_self", Intrinsics.LJFF(authorUid, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0);
                jSONObject.put("enter_from", this.adPageFrom);
                jSONObject.put("source_page_type", "video");
                jSONObject.put("page_name", "video");
                if (aweme.getAwemeType() == 101) {
                    str3 = "live";
                } else {
                    str3 = "ad_video_entrance";
                }
                jSONObject.put("entrance_form", str3);
                if (!z) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str5 = "other";
                            } else {
                                str5 = "finish";
                            }
                        } else {
                            str5 = "button";
                        }
                    } else {
                        str5 = "title";
                    }
                    jSONObject.put("click_area", str5);
                }
                jSONObject.put("follow_status", AwemeExtKt.getFollowStatus(aweme));
                for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                    jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                }
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                if (z) {
                    str4 = "tiktokec_product_show";
                } else {
                    str4 = "tiktokec_product_click";
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL(str4, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String modifySchemaOfNotice(String str, String str2, String str3, String str4, View view) throws JSONException {
        AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(str);
        if (str3 == null) {
            str3 = "notification_page";
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str3), new Pair("start_click_time", String.valueOf(System.currentTimeMillis())));
        if (str2 != null) {
            mapLJIIJ.put("previous_page", str2);
        }
        anonymousClass0181.LJFF(3, mapLJIIJ);
        anonymousClass0181.LJ(2, "enter_from_info", str3);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("enter_from_info", str3), new Pair("enter_from", str3));
        if (str2 != null) {
            mapLJIIJ2.put("previous_page", str2);
        }
        anonymousClass0181.LIZLLL(2, 2, mapLJIIJ2);
        if (C770702zh.LIZIZ(str4)) {
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(str4, PageFinder.via(view), null);
            if (C770702zh.LIZIZ(strCreateJumpSourceBtmToken)) {
                anonymousClass0181.LJ(3, "source_btm_token", strCreateJumpSourceBtmToken);
            }
        }
        return anonymousClass0181.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdpResource(String str, Context context, int i, boolean z, Fragment fragment) {
        IPdpResourceService iPdpResourceService;
        Object objLIZ = C04TD.LIZ(IPdpResourceService.class, false);
        if (objLIZ != null) {
            iPdpResourceService = (IPdpResourceService) objLIZ;
        } else {
            if (C04TD.LLZILL == null) {
                synchronized (IPdpResourceService.class) {
                    if (C04TD.LLZILL == null) {
                        C04TD.LLZILL = new PdpResourcePreloadService();
                    }
                }
            }
            iPdpResourceService = C04TD.LLZILL;
        }
        iPdpResourceService.LIZ(context, i, z, fragment, 1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Object shootCart(float f, float f2, View view, View view2, Integer num, Function0<Unit> function0, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int iIntValue;
        float f3;
        if (view2 == null) {
            return Unit.LIZ;
        }
        if (view != null) {
            if (num != null && num.intValue() != 0) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.drawable.b93;
            }
            ImageView imageView = new ImageView(view.getContext());
            imageView.setImageResource(iIntValue);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(imageView, new ViewGroup.LayoutParams((int) C0H9H.LIZ(64.0f), (int) C0H9H.LIZ(64.0f)));
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            if (iArr2[1] < 0) {
                iArr2[1] = 0;
            }
            int iLIZ = (int) C0H9H.LIZ(32.0f);
            float f4 = iLIZ;
            float f5 = (f - iArr[0]) - f4;
            float f6 = (f2 - iArr[1]) - f4;
            float width = ((iArr2[0] - r5) - iLIZ) + (view2.getWidth() / 2.0f);
            float height = ((iArr2[1] - iArr[1]) - iLIZ) + (view2.getHeight() / 2.0f);
            Path path = new Path();
            path.moveTo(f5, f6);
            path.quadTo(f5, height, width, height);
            PathMeasure pathMeasure = new PathMeasure(path, false);
            float length = pathMeasure.getLength();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, length);
            float fAbs = Math.abs(height - f6);
            DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                f3 = displayMetrics.density;
            } else {
                f3 = 1.0f;
            }
            valueAnimatorOfFloat.setDuration((long) (fAbs / f3));
            valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
            CoroutineContext context = interfaceC1364105Vn.getContext();
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0400001_6(context, valueAnimatorOfFloat, imageView, length, pathMeasure, 0));
            valueAnimatorOfFloat.start();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt.LJIJJ();
            valueAnimatorOfFloat.addListener(new ALAdapterS0S0500000_2(context, c2252611DEt, view, imageView, function0, 0));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == C099R.LJFF()) {
                return objLJIJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void doNewCartAnimation(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z, Integer num, View view, ViewGroup viewGroup, ViewGroup viewGroup2, Function1<? super Boolean, Unit> function1) {
        C428070GqT.LIZ(context, lifecycleCoroutineScope, str, z, num, view, viewGroup, viewGroup2, function1);
    }
}
