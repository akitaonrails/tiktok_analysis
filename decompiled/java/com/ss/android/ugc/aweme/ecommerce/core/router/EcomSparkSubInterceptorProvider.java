package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C13LP;
import X.C1508080pLa;
import X.InterfaceC1769890w9r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.GlobalOrderListPreLoad;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.OrderListPreLoad;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressCacheService;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoFrontUpdateModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressCacheService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomSparkSubInterceptorProvider implements IEcomSparkChannelInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService
    public final List<InterfaceC1769890w9r> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1769890w9r() { // from class: X.0vRK
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return Intrinsics.LJFF(str, "fe_tiktok_ecommerce_shop_cart");
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, String str2) {
                AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                boolean z;
                String name;
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
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cart_cache_");
                sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
                List listSingletonList = Collections.singletonList(C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "cart_cache"), new Pair("key", C2188811AlT.LIZIZ(sbLIZ))));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("&lru_cache_init=");
                sbLIZ2.append(C1741890vQh.LJIIIIZZ(listSingletonList));
                sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (sparkContext.usePreload) {
                    return;
                }
                if (C1742220vRE.LIZ) {
                    C1742190vRB.LIZ.getClass();
                    C1191504lN c1191504lN = C1191504lN.LIZ;
                    EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.CART_PRODUCT;
                    String value = enumC1769850w9n.getValue();
                    c1191504lN.getClass();
                    Map<String, AbstractC1742310vRN> map = C1191504lN.LIZJ;
                    if (((LinkedHashMap) map).get(value) == null) {
                        final String value2 = enumC1769850w9n.getValue();
                        map.put(value2, new AbstractC1742310vRN(value2) { // from class: X.0vRL
                            @Override // X.AbstractC1742310vRN
                            public final List<C1763450vzT> LIZ() {
                                CopyOnWriteArrayList<String> copyOnWriteArrayList = C1742190vRB.LIZIZ;
                                if (copyOnWriteArrayList.isEmpty() && C1742190vRB.LIZJ.isEmpty()) {
                                    C1742190vRB.LIZ.getClass();
                                    C1742190vRB.LJFF(C1742190vRB.LIZIZ());
                                }
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
                                Iterator<String> it2 = copyOnWriteArrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new C1763450vzT(EnumC1769850w9n.CART_PRODUCT.getValue(), it2.next()));
                                }
                                return arrayList2;
                            }
                        });
                    }
                    EnumC1769850w9n enumC1769850w9n2 = EnumC1769850w9n.CART_SELLER;
                    if (((LinkedHashMap) map).get(enumC1769850w9n2.getValue()) == null) {
                        final String value3 = enumC1769850w9n2.getValue();
                        map.put(value3, new AbstractC1742310vRN(value3) { // from class: X.0vRM
                            @Override // X.AbstractC1742310vRN
                            public final List<C1763450vzT> LIZ() {
                                if (C1742190vRB.LIZIZ.isEmpty() && C1742190vRB.LIZJ.isEmpty()) {
                                    C1742190vRB.LIZ.getClass();
                                    C1742190vRB.LJFF(C1742190vRB.LIZIZ());
                                }
                                CopyOnWriteArrayList<String> copyOnWriteArrayList = C1742190vRB.LIZJ;
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
                                Iterator<String> it2 = copyOnWriteArrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new C1763450vzT(EnumC1769850w9n.CART_SELLER.getValue(), it2.next()));
                                }
                                return arrayList2;
                            }
                        });
                    }
                    String value4 = enumC1769850w9n.getValue();
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C23250099c.LIZLLL(c817503Hh, null, null, new C1742340vRQ(value4, "cart", "a2270.b4197", null), 3);
                    C23250099c.LIZLLL(c817503Hh, null, null, new C1742340vRQ(enumC1769850w9n2.getValue(), "cart", "a2270.b4197", null), 3);
                }
                C1417405gi.LIZ.getClass();
                if (C1417405gi.LIZIZ) {
                    sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.05Qs
                        public AnonymousClass0956 LL;

                        @Override // X.InterfaceC2217701Bqy
                        public final Context LIZJ(Context context) {
                            return context;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIILLIIL(boolean z2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIL(Activity activity, Context context) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIII(SparkActivity sparkActivity, boolean z2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIJIIJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJZI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                            return false;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLJLI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void finish() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onActivityResult(int i, int i2, Intent intent) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onRestoreInstanceState(Bundle bundle) {
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJ(SparkActivity sparkActivity) {
                            AnonymousClass0956 anonymousClass0956 = this.LL;
                            if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                                anonymousClass0956.LIZIZ(null);
                            }
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                            C1417405gi.LIZ.getClass();
                            if (!C1417405gi.LIZJ) {
                                C817503Hh c817503Hh2 = C817503Hh.LL;
                                C1DFH c1dfh = C0PEM.LIZ;
                                this.LL = C23250099c.LIZLLL(c817503Hh2, C2107308Nj.LIZ, null, new C1351505Qr(null), 2);
                            }
                        }
                    });
                    if (!C2190461Ao8.LIZIZ()) {
                        sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz() { // from class: X.05Qt
                            public AnonymousClass0956 LL;

                            @Override // X.InterfaceC2217711Bqz
                            public final Context LIZJ(Context context) {
                                return context;
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LIZLLL() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJII() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIIIZZ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIIZ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIJJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIL() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIILLIIL(boolean z2) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIZILJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIJIL() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJLIIIJLJLI(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void finish() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void onActivityResult(int i, int i2, Intent intent) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void onRestoreInstanceState(Bundle bundle) {
                            }

                            @Override // X.InterfaceC1163130gND
                            public final void release() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIJJLI() {
                                C1417405gi.LIZ.getClass();
                                if (C1417405gi.LIZJ) {
                                    return;
                                }
                                C817503Hh c817503Hh2 = C817503Hh.LL;
                                C1DFH c1dfh = C0PEM.LIZ;
                                this.LL = C23250099c.LIZLLL(c817503Hh2, C2107308Nj.LIZ, null, new C1351405Qq(null), 2);
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJLIIIIJ() {
                                AnonymousClass0956 anonymousClass0956 = this.LL;
                                if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                                    return;
                                }
                                anonymousClass0956.LIZIZ(null);
                            }
                        });
                    }
                }
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel = C1546460qLU.LIZ;
                PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel2 = (PdpIntegrateLynxAirModel) c0c64LJIILLIIL.LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel, "ec_anchor_pdp_integrate_lynx_air", true);
                if (pdpIntegrateLynxAirModel2 != null) {
                    pdpIntegrateLynxAirModel = pdpIntegrateLynxAirModel2;
                }
                if (pdpIntegrateLynxAirModel.totalSwitch == 1) {
                    sparkContext.LJJJJZ(new C1776230wK5(0));
                }
            }
        });
        arrayList.add(new InterfaceC1769890w9r() { // from class: X.13ug
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return Intrinsics.LJFF(str, "fe_teu_lynx_order_center");
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, String str2) {
                Integer numLJIIJJI;
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.13uh
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        C1537910q7h c1537910q7h;
                        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                            c1537910q7h.LJJI = true;
                        }
                    }
                });
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "tab");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } else {
                    numLJIIJJI = null;
                }
                C20161813ui.LIZ.getClass();
                if (Intrinsics.LJFF(C20161813ui.LIZ(), "sea")) {
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "order_list_dataprocessor_enable", true) > 0) {
                        sparkContext.LJJ(AbstractC1539010q9T.class, new C1546790qM1(null, C23250099c.LIZIZ(C817503Hh.LL, null, null, new C01YO(new AwS609S0100000_30(numLJIIJJI, sparkContext, 29), null), 3)));
                    }
                } else {
                    OrderListPreLoad.Companion.getClass();
                    C20161513uf.LIZ(numLJIIJJI, null);
                }
                if (Intrinsics.LJFF(C20161813ui.LIZ(), "global")) {
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "order_list_dataprocessor_enable", true) > 0) {
                        sparkContext.LJJ(AbstractC1539010q9T.class, new C1546790qM1(null, C23250099c.LIZIZ(C817503Hh.LL, null, null, new C01YO(new AwS609S0100000_30(numLJIIJJI, sparkContext, 30), null), 3)));
                    } else {
                        GlobalOrderListPreLoad.Companion.getClass();
                        C20161413ue.LIZ(numLJIIJJI, null);
                    }
                }
            }
        });
        arrayList.add(new InterfaceC1769890w9r() { // from class: X.0pkG
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, String str2) {
                IECommerceAddressCacheService iECommerceAddressCacheService;
                if (sparkContext.extraRuntimeInfo.get((Object) "enable_geo_selected") != null) {
                    Object objLIZ = C04TD.LIZ(IECommerceAddressCacheService.class, false);
                    if (objLIZ != null) {
                        iECommerceAddressCacheService = (IECommerceAddressCacheService) objLIZ;
                    } else {
                        if (C04TD.LLZ == null) {
                            synchronized (IECommerceAddressCacheService.class) {
                                if (C04TD.LLZ == null) {
                                    C04TD.LLZ = new ECAddressCacheService();
                                }
                            }
                        }
                        iECommerceAddressCacheService = C04TD.LLZ;
                    }
                    String strLIZ = iECommerceAddressCacheService.LIZ();
                    if (strLIZ != null) {
                        sparkContext.LJJLIIIJ(strLIZ, "ec_selected_area");
                    }
                    String strLIZIZ = iECommerceAddressCacheService.LIZIZ();
                    if (strLIZIZ != null) {
                        sparkContext.LJJLIIIJ(strLIZIZ, "ec_selected_address_id");
                    }
                }
            }
        });
        if (C1508080pLa.LIZ().enable) {
            arrayList.add(new InterfaceC1769890w9r() { // from class: X.0pMb
                @Override // X.InterfaceC1769890w9r
                public final boolean LIZIZ(String str) {
                    EcomGeckoUpdateInterceptor.LL.getClass();
                    for (Object obj : ((Map) EcomGeckoUpdateInterceptor.LLILLJJLI.getValue()).values()) {
                        if (a0.LJJIIZI(((EcomGeckoFrontUpdateModel) obj).update, str, false)) {
                            if (obj == null) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC1769890w9r
                public final void LIZ(SparkContext sparkContext, String str, String str2) throws JSONException {
                    AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
                    String name;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        boolean z = false;
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        }
                        String name2 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    boolean zIsGeckoBundleExists = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).isGeckoBundleExists(str2);
                    if (C1507890pLH.LIZJ.LIZ() != null) {
                        C1507890pLH.LJ("", str2, "gecko", str2, zIsGeckoBundleExists);
                    }
                }
            });
        }
        return C13LP.LLIIII(arrayList);
    }
}
