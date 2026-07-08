package com.ss.android.ugc.aweme.ecommerce.base.osp.bottom;

import X.AnonymousClass0317;
import X.C034S;
import X.C038N;
import X.C03MH;
import X.C03O0;
import X.C03QF;
import X.C1008603wy;
import X.C1025503zh;
import X.C1120604Zw;
import X.C1741890vQh;
import X.C197039127h;
import X.C1AQS;
import X.C2188811AlT;
import X.C2262851Dhb;
import X.C2327809Ae;
import X.C2371709Rb;
import X.C444920HcY;
import X.C722302rt;
import X.C7806033c;
import X.C786410Ut5;
import X.C987803tc;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.SpannableString;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes2.dex */
public final class OspBottomViewModel extends AssemViewModel<C2262851Dhb> implements InterfaceC1164530gPT {
    public OrderSubmitAssemViewModel LLILLL;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZLLLIL;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public Integer LL;
    public BizIdentity LLILLJJLI = C987803tc.LIZ(this.LL, "normal_checkout");
    public boolean LLILZ = true;
    public final Map<String, Object> LLIZ = new LinkedHashMap();
    public String LLJ = "";
    public final List<String> LLJI = new ArrayList();

    public final void BQ2() {
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLL;
        if (orderSubmitAssemViewModel != null) {
            orderSubmitAssemViewModel.withState(new AwS580S0100000_1(this, 91));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2262851Dhb(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL = null;
    }

    public final void xQ2() {
        ModuleManager moduleManager;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        ModuleManager moduleManager2;
        ModuleManager moduleManager3;
        ModuleManager moduleManager4;
        ModuleManager moduleManager5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLILZ) {
            this.LLJILJIL = System.currentTimeMillis();
        }
        if (this.LLILZ) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLL;
            if (orderSubmitAssemViewModel2 != null && (moduleManager5 = orderSubmitAssemViewModel2.LLZIL) != null) {
                moduleManager5.LJIIL("bottom_widget_done", true);
            }
            if (this.LLILZIL) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LLILLL;
                if (orderSubmitAssemViewModel3 != null && (moduleManager4 = orderSubmitAssemViewModel3.LLZIL) != null) {
                    moduleManager4.LJ(true);
                }
            } else {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LLILLL;
                if (orderSubmitAssemViewModel4 != null && (moduleManager3 = orderSubmitAssemViewModel4.LLZIL) != null) {
                    moduleManager3.LJ(false);
                }
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel5 = this.LLILLL;
            if (orderSubmitAssemViewModel5 != null) {
                orderSubmitAssemViewModel5.dR2(AFwS228S0000000_1.get$arr$(638));
            }
        }
        this.LLILZIL = false;
        C03MH c03mh = (C03MH) C1025503zh.LIZ(C03MH.class, this.LLILLJJLI, this);
        if (c03mh != null) {
            c03mh.zx1(this.LLILLL);
        }
        long j = this.LLJILJIL;
        if (this.LLILZ && (orderSubmitAssemViewModel = this.LLILLL) != null && (moduleManager2 = orderSubmitAssemViewModel.LLZIL) != null) {
            moduleManager2.LJIIJ(System.currentTimeMillis() - j, "bottom_module");
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel6 = this.LLILLL;
        if (orderSubmitAssemViewModel6 == null || (moduleManager = orderSubmitAssemViewModel6.LLZIL) == null) {
            return;
        }
        moduleManager.LJFF(System.currentTimeMillis() - jCurrentTimeMillis, "bottom_module");
    }

    public static HashMap vQ2(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        String string;
        String str;
        String string2;
        IECommerceHostService iECommerceHostService;
        boolean z;
        Object obj;
        StarlingKeyValue starlingKeyValue;
        Object obj2;
        HashMap map = new HashMap();
        HashMap<String, Object> map2 = orderSubmitAssemViewModel.LLLIL;
        C1008603wy.LIZ(map, new Pair("tab_name", "place_order"));
        C1008603wy.LIZ(map, new Pair("page_name", "order_submit"));
        HashMap mapLJ = C1741890vQh.LJ("entrance_info", map2);
        String name = null;
        if (mapLJ != null && (obj2 = mapLJ.get("enter_from")) != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        C1008603wy.LIZ(map, new Pair("enter_from", string));
        C1008603wy.LIZ(map, new Pair("enter_method", "click_order_submit_place_order_button"));
        C1008603wy.LIZ(map, new Pair("mall_entrance", "order_submit.place_order_button.in_app"));
        Pair[] pairArr = new Pair[1];
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (starlingKeyValue = billInfoData.placeOrderButtonText) != null) {
            str = starlingKeyValue.value;
        } else {
            str = null;
        }
        pairArr[0] = new Pair("direct_text", str);
        C1008603wy.LIZ(map, pairArr);
        if (map2 != null && (obj = map2.get("source_page_type")) != null) {
            string2 = obj.toString();
        } else {
            string2 = null;
        }
        C1008603wy.LIZ(map, new Pair("source_page_type", string2));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        map.put("is_login", Integer.valueOf(((IAccountDependencyService) iECommerceHostService).isLogin() ? 1 : 0));
        Pair[] pairArr2 = new Pair[1];
        HashMap map3 = new HashMap();
        map3.put("mall_out_source", "order_submit.place_order_button.in_app");
        map3.put("mall_landing_page", "mallhalforderpaysuccess");
        map3.put("mall_homepage_visited_type", "2");
        map3.put("material_id", "");
        map3.put("campaign_id", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (string == null) {
            string = "";
        }
        sbLIZ.append(string);
        sbLIZ.append('&');
        if (string2 == null) {
            string2 = "";
        }
        sbLIZ.append(string2);
        map3.put("track_id", C2188811AlT.LIZIZ(sbLIZ));
        pairArr2[0] = new Pair("mall_extra_info", C1741890vQh.LJIIIIZZ(map3));
        C1008603wy.LIZ(map, pairArr2);
        C038N.LIZ(map, orderSubmitAssemViewModel.LLLZLZ.LIZ("c7497.d4784"));
        return map;
    }

    public final void AQ2(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2;
        ModuleManager moduleManager;
        this.LLJILJIL = System.currentTimeMillis();
        this.LLILLL = orderSubmitAssemViewModel;
        this.LL = orderSubmitAssemViewModel.m;
        BizIdentity bizIdentity = orderSubmitAssemViewModel.o;
        this.LLILLJJLI = bizIdentity;
        this.LLILZIL = true;
        C03MH c03mh = (C03MH) C1025503zh.LIZ(C03MH.class, bizIdentity, this);
        if (c03mh != null) {
            c03mh.wZ1(orderSubmitAssemViewModel);
        }
        long j = this.LLJILJIL;
        if (this.LLILZ && (orderSubmitAssemViewModel2 = this.LLILLL) != null && (moduleManager = orderSubmitAssemViewModel2.LLZIL) != null) {
            moduleManager.LJIIJ(System.currentTimeMillis() - j, "bottom_module");
        }
    }

    public final SpannableString wQ2(int i) {
        IECommerceHostService iECommerceHostService;
        String quantityString;
        boolean z;
        String name;
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
        Resources resources = ((IApplicationDependencyService) iECommerceHostService).getApplication().getResources();
        if (resources == null || (quantityString = resources.getQuantityString(2131755294, i, Integer.valueOf(i))) == null) {
            quantityString = "";
        }
        SpannableString spannableString = new SpannableString(quantityString);
        int iLJJJ = a0.LJJJ(spannableString, e3.h, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(spannableString, ")", 0, false, 6) + 1;
        if (iLJJJ != -1 && iLJJJ2 != -1 && iLJJJ < iLJJJ2) {
            C786410Ut5.p2(spannableString, new C444920HcY(31, true), iLJJJ, iLJJJ2, 33);
        }
        return spannableString;
    }

    public static void yQ2(OrderSubmitAssemViewModel orderSubmitAssemViewModel, Function1 function1) {
        AnonymousClass0317 anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin;
        Object obj;
        String name;
        String string = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin = ECUgPayToMallDependencyService.createIECUgPayToMallDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IECUgPayToMallDependencyService.class.getName();
            if (anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECUgPayToMallDependencyService.class);
        }
        IECUgPayToMallDependencyService iECUgPayToMallDependencyService = (IECUgPayToMallDependencyService) anonymousClass0317CreateIECUgPayToMallDependencyServicebyMonsterPlugin;
        HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
        if (map != null && (obj = map.get("source_page_type")) != null) {
            string = obj.toString();
        }
        Integer payToMallMethodV3 = iECUgPayToMallDependencyService.getPayToMallMethodV3(string);
        if (payToMallMethodV3 != null && payToMallMethodV3.intValue() == 8) {
            function1.invoke(iECUgPayToMallDependencyService);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_trigger_place_order_check")) {
            BQ2();
        }
    }

    public static void zQ2(OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C197039127h c197039127h) {
        String string;
        String string2;
        String string3;
        String str;
        String strLIZLLL;
        StarlingKeyValue starlingKeyValue;
        String strLJIIJ;
        String priceVal;
        List<PaymentMethod> list;
        Float fLJIIIIZZ;
        Boolean bool;
        OspPlaceOrderButton ospPlaceOrderButton;
        Price price;
        String priceVal2;
        PaymentMethodsData paymentMethodsData;
        Price price2;
        PaymentMethod paymentMethod;
        ospBottomViewModel.getClass();
        String strValueOf = String.valueOf(c197039127h.getText());
        Context context = c197039127h.getContext();
        PlatformPromotion platformPromotion = null;
        if (context != null) {
            string = context.getString(2131833110);
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(strValueOf, string)) {
            strLIZLLL = "add_an_address";
        } else {
            Context context2 = c197039127h.getContext();
            if (context2 != null) {
                string2 = context2.getString(2131832789);
            } else {
                string2 = null;
            }
            if (Intrinsics.LJFF(strValueOf, string2)) {
                strLIZLLL = "select_an_item";
            } else {
                Context context3 = c197039127h.getContext();
                if (context3 != null) {
                    string3 = context3.getString(2131833111);
                } else {
                    string3 = null;
                }
                if (Intrinsics.LJFF(strValueOf, string3)) {
                    strLIZLLL = "select_a_payment";
                } else {
                    BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
                    if (billInfoData != null && (starlingKeyValue = billInfoData.placeOrderButtonText) != null) {
                        str = starlingKeyValue.key;
                    } else {
                        str = null;
                    }
                    strLIZLLL = C2371709Rb.LIZLLL(str, ospBottomViewModel.LLJIJIL);
                }
            }
        }
        PaymentInfo paymentInfo = orderSubmitAssemViewModel.getState().LLIZ;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJIIJ = paymentMethod.LJIIJ();
        } else {
            strLJIIJ = null;
        }
        boolean zLJFF = Intrinsics.LJFF(strLJIIJ, orderSubmitAssemViewModel.LLLZIIL);
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
        mapHi1.putAll(orderSubmitAssemViewModel.d0);
        C722302rt c722302rt = orderSubmitAssemViewModel.getState().LLILLL;
        if (c722302rt != null && (price2 = c722302rt.LLIZ) != null) {
            priceVal = price2.getPriceVal();
        } else {
            priceVal = null;
        }
        mapHi1.put("total_payment", String.valueOf(priceVal));
        String strPR2 = orderSubmitAssemViewModel.PR2();
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        HashMap<String, String> mapLJIIIZ = C7806033c.LJIIIZ(orderSubmitAssemViewModel.LLJJI);
        BillInfoData billInfoData2 = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData2 != null && (paymentMethodsData = billInfoData2.paymentMethods) != null) {
            list = paymentMethodsData.paymentMethods;
        } else {
            list = null;
        }
        Boolean boolValueOf2 = Boolean.valueOf(C03QF.LJI(list));
        C722302rt c722302rt2 = orderSubmitAssemViewModel.getState().LLILLL;
        if (c722302rt2 != null && (price = c722302rt2.LLIZLLLIL) != null && (priceVal2 = price.getPriceVal()) != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal2);
        } else {
            fLJIIIIZZ = null;
        }
        BillInfoData billInfoData3 = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData3 != null && (ospPlaceOrderButton = billInfoData3.ospPlaceOrderButton) != null) {
            bool = ospPlaceOrderButton.disable;
        } else {
            bool = null;
            if (billInfoData3 != null) {
            }
            c03o0.getClass();
            C03O0.LJJJJZ(c03o0, strLIZLLL, "place_order", mapHi1, strPR2, null, boolValueOf, mapLJIIIZ, null, null, null, boolValueOf2, fLJIIIIZZ, bool, C03O0.LJIIJJI(platformPromotion), C7806033c.LJIIJ(orderSubmitAssemViewModel), null, null, 29481968);
            yQ2(orderSubmitAssemViewModel, new AwS367S0200000_1(ospBottomViewModel, orderSubmitAssemViewModel, 256));
        }
        platformPromotion = billInfoData3.platformPromotion;
        c03o0.getClass();
        C03O0.LJJJJZ(c03o0, strLIZLLL, "place_order", mapHi1, strPR2, null, boolValueOf, mapLJIIIZ, null, null, null, boolValueOf2, fLJIIIIZZ, bool, C03O0.LJIIJJI(platformPromotion), C7806033c.LJIIJ(orderSubmitAssemViewModel), null, null, 29481968);
        yQ2(orderSubmitAssemViewModel, new AwS367S0200000_1(ospBottomViewModel, orderSubmitAssemViewModel, 256));
    }
}
