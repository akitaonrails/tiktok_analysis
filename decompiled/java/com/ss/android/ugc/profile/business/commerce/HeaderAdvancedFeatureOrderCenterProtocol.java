package com.ss.android.ugc.profile.business.commerce;

import X.C0PEM;
import X.C1242820iRk;
import X.C1242900iRs;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1251190ifF;
import X.C1720106oR;
import X.C1721460utk;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C299980BpM;
import X.C413301j9;
import X.C698190Ra5;
import X.InterfaceC1249740icu;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderAdvancedFeatureOrderCenterProtocol extends AdvancedFeatureProtocol implements GenericLifecycleObserver {
    public static final Object LLJZIJLIL = new Object();
    public static boolean LLL;
    public boolean LLJL;
    public String LLJLIL;
    public OrderCenterData LLJLILLLLZIIL;
    public OrderCenterGuidanceDialog LLJLL;
    public Map<String, ? extends Object> LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_order_center";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLJL = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 301));
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 302));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        C1242900iRs.LIZ.getClass();
        return C1242900iRs.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJLIIL() {
        ProfileComponents profileComponents;
        n nVar;
        C1248950ibd c1248950ibd = this.LLIZ;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (nVar = profileComponents.bizData) == null) {
            return true;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C413301j9(this, nVar, new AwS563S0100000_19(this, 2077), null), 3);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        C1242820iRk.LIZ.getClass();
        int iLIZ = C1242820iRk.LIZ().LIZ();
        IECommerceService.LIZ.getClass();
        return iLIZ == 2;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        String str;
        Integer numValueOf;
        TuxIconView tuxIconView;
        ProfileComponents profileComponents;
        Icon icon;
        AwS563S0100000_19 awS563S0100000_19;
        boolean zLJI = MethodIDManager.LJI(202238);
        if (C268330AfP.LJ() || C2537109wv.LIZIZ() || C2532609wC.LIZ()) {
            Context context = getContext();
            if (context != null) {
                Map<Integer, Integer> map = C1721460utk.LIZ;
                OrderCenterData orderCenterData = this.LLJLILLLLZIIL;
                String localIcon = (orderCenterData == null || (icon = orderCenterData.getIcon()) == null) ? null : icon.getLocalIcon();
                C1248950ibd c1248950ibd = this.LLIZ;
                if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
                    str = "";
                }
                C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(context, localIcon, "UIText1", str, "");
                if (c698190Ra5LIZJ != null && (numValueOf = Integer.valueOf(c698190Ra5LIZJ.LIZ)) != null) {
                    int iIntValue = numValueOf.intValue();
                    View view = this.LLILZLL;
                    if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.aiz)) != null) {
                        tuxIconView.setIconRes(iIntValue);
                    }
                }
            }
        } else {
            OrderCenterData orderCenterData2 = this.LLJLILLLLZIIL;
            Icon icon2 = orderCenterData2 != null ? orderCenterData2.getIcon() : null;
            View view2 = this.LLILZLL;
            TuxIconView tuxIconView2 = view2 != null ? (TuxIconView) view2.findViewById(R.id.aiz) : null;
            if (icon2 != null && tuxIconView2 != null) {
                Icon.setIconToImageView$default(icon2, tuxIconView2, null, Integer.valueOf(R.raw.icon_shopping_bag_tick), Integer.valueOf(R.attr.a04), null, null, true, null, 178, null);
            }
        }
        C1242900iRs.LIZ.getClass();
        LJLI(C1242900iRs.LIZIZ(null));
        if (C299980BpM.LIZ() && (awS563S0100000_19 = this.LLJJL) != null) {
            awS563S0100000_19.invoke();
        }
        if (!zLJI) {
            return true;
        }
        MethodIDManager.LJ();
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        OrderCenterGuideData orderCenterGuideData;
        String orderCenterGuideSchema;
        String str;
        String orderCenterGuideSchema2;
        OrderCenterGuideData orderCenterGuideData2;
        FragmentManager childFragmentManager;
        OrderCenterGuidanceDialog orderCenterGuidanceDialog;
        TuxSheet tuxSheet;
        OrderCenterData orderCenterData = this.LLJLILLLLZIIL;
        Boolean boolValueOf = null;
        if (orderCenterData != null) {
            orderCenterGuideData = orderCenterData.getOrderCenterGuideData();
        } else {
            orderCenterGuideData = null;
        }
        String str2 = "red_dot";
        if (orderCenterGuideData != null && !this.LLJZ && ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab()) {
            OrderCenterData orderCenterData2 = this.LLJLILLLLZIIL;
            if (orderCenterData2 != null && (orderCenterGuideData2 = orderCenterData2.getOrderCenterGuideData()) != null) {
                try {
                    Context context = getContext();
                    if (context != null) {
                        this.LLJLL = new OrderCenterGuidanceDialog(context, this.LLJJIJIL, orderCenterGuideData2);
                        Fragment fragment = this.LLILZ;
                        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (orderCenterGuidanceDialog = this.LLJLL) != null && (tuxSheet = orderCenterGuidanceDialog.LIZLLL) != null) {
                            tuxSheet.show(childFragmentManager, "your orders entrance");
                        }
                        C1251190ifF c1251190ifF = C1251190ifF.LIZ;
                        String str3 = this.LLJJIJIL;
                        String description = orderCenterGuideData2.getDescription();
                        if (description == null) {
                            description = "";
                        }
                        c1251190ifF.getClass();
                        C1251190ifF.LJ(str3, description);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLJZ = true;
            C1251190ifF c1251190ifF2 = C1251190ifF.LIZ;
            C1242900iRs.LIZ.getClass();
            String strLIZ = C1242900iRs.LIZ();
            OrderCenterData orderCenterData3 = this.LLJLILLLLZIIL;
            if (orderCenterData3 == null || !orderCenterData3.getShowRedDot()) {
                str2 = "";
            }
            String str4 = this.LLJJIJIL;
            c1251190ifF2.getClass();
            C1251190ifF.LIZLLL(strLIZ, "order_center_shoptab_diversion_guide", str2, str4);
            return true;
        }
        OrderCenterData orderCenterData4 = this.LLJLILLLLZIIL;
        if (orderCenterData4 != null) {
            orderCenterGuideSchema = orderCenterData4.getOrderCenterGuideSchema();
        } else {
            orderCenterGuideSchema = null;
        }
        if (orderCenterGuideSchema != null && ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab()) {
            try {
                OrderCenterData orderCenterData5 = this.LLJLILLLLZIIL;
                if (orderCenterData5 != null && (orderCenterGuideSchema2 = orderCenterData5.getOrderCenterGuideSchema()) != null) {
                    SmartRouter.buildRoute(getContext(), UriProtector.parse(orderCenterGuideSchema2).buildUpon().appendQueryParameter("page_name", "personal_home_page").appendQueryParameter("enter_from", this.LLJJIJIL).appendQueryParameter("previous_page", this.LLJJIJIL).toString()).open();
                }
                C1251190ifF c1251190ifF3 = C1251190ifF.LIZ;
                C1242900iRs.LIZ.getClass();
                String strLIZ2 = C1242900iRs.LIZ();
                String str5 = this.LLJJIJIL;
                OrderCenterData orderCenterData6 = this.LLJLILLLLZIIL;
                if (orderCenterData6 != null) {
                    boolValueOf = Boolean.valueOf(orderCenterData6.getShowRedDot());
                }
                Map<String, ? extends Object> map = this.LLJLLIL;
                c1251190ifF3.getClass();
                C1251190ifF.LIZJ(boolValueOf, strLIZ2, str5, map);
                return true;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1251190ifF c1251190ifF4 = C1251190ifF.LIZ;
        C1242900iRs.LIZ.getClass();
        String strLIZ3 = C1242900iRs.LIZ();
        OrderCenterData orderCenterData7 = this.LLJLILLLLZIIL;
        if (orderCenterData7 != null && orderCenterData7.getShowRedDot()) {
            str = "red_dot";
        } else {
            str = "";
        }
        String str6 = this.LLJJIJIL;
        c1251190ifF4.getClass();
        C1251190ifF.LIZLLL(strLIZ3, "order_center", str, str6);
        OrderCenterData orderCenterData8 = this.LLJLILLLLZIIL;
        if (orderCenterData8 != null && orderCenterData8.getShowRedDot()) {
            this.LLJLLL = true;
        }
        Context context2 = getContext();
        if (context2 != null) {
            C1242820iRk.LIZ.getClass();
            InterfaceC1249740icu interfaceC1249740icuLIZ = C1242820iRk.LIZ();
            String strLIZ4 = C1242900iRs.LIZ();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("page_name", "personal_home_page"), new Pair("previous_page", this.LLJJIJIL));
            OrderCenterData orderCenterData9 = this.LLJLILLLLZIIL;
            if (orderCenterData9 == null || !orderCenterData9.getShowRedDot()) {
                str2 = "";
            }
            mapLJIIJ.put("notice_type", str2);
            Map<String, ? extends Object> map2 = this.LLJLLIL;
            if (map2 != null) {
                mapLJIIJ.putAll(map2);
            }
            interfaceC1249740icuLIZ.LJFF(context2, strLIZ4, this.LLJLIL, mapLJIIJ);
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        String orderCenterSchema;
        String orderCenterTitle;
        String string;
        try {
            synchronized (LLJZIJLIL) {
                try {
                    string = nVar.toString();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            OrderCenterData orderCenterData = (OrderCenterData) C1250210idf.LIZ(string, OrderCenterData.class);
            this.LLJLILLLLZIIL = orderCenterData;
            this.LLJJJJ = orderCenterData;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseComponentBizData error: ");
            sbLIZ.append(th2.getMessage());
            C1720106oR.LJI("HeaderAdvancedFeatureOrderCenterComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        OrderCenterData orderCenterData2 = this.LLJLILLLLZIIL;
        String entryName = null;
        if (orderCenterData2 != null) {
            orderCenterSchema = orderCenterData2.getOrderCenterSchema();
        } else {
            orderCenterSchema = null;
        }
        this.LLJLIL = orderCenterSchema;
        C1242820iRk.LIZ.getClass();
        C1242820iRk.LIZ().LIZIZ(this.LLJLIL);
        C1251190ifF c1251190ifF = C1251190ifF.LIZ;
        OrderCenterData orderCenterData3 = this.LLJLILLLLZIIL;
        c1251190ifF.getClass();
        this.LLJLLIL = C1251190ifF.LIZ(orderCenterData3);
        C1242900iRs c1242900iRs = C1242900iRs.LIZ;
        OrderCenterData orderCenterData4 = this.LLJLILLLLZIIL;
        if (orderCenterData4 != null) {
            orderCenterTitle = orderCenterData4.getOrderCenterTitle();
        } else {
            orderCenterTitle = null;
        }
        OrderCenterData orderCenterData5 = this.LLJLILLLLZIIL;
        if (orderCenterData5 != null) {
            entryName = orderCenterData5.getEntryName();
        }
        c1242900iRs.getClass();
        C1242900iRs.LIZIZ = orderCenterTitle;
        C1242900iRs.LIZJ = entryName;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        if (!LJJJZ()) {
            return true;
        }
        LJLIIIL();
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C413301j9(this, nVar, new AwS563S0100000_19(this, 2078), null), 3);
        }
        return true;
    }
}
