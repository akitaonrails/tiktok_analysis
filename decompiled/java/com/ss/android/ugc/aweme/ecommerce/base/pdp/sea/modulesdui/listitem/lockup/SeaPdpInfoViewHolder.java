package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup;

import X.C01GW;
import X.C04H0;
import X.C04H1;
import X.C1008503wx;
import X.C1070604Gq;
import X.C13LE;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC10322041w;
import X.InterfaceC1071304Gx;
import X.InterfaceC1071404Gy;
import X.InterfaceC1071504Gz;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BNPLTopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS121S0110000_1;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpInfoViewHolder extends AbsFullSpanVH<C1008503wx> {
    public final Fragment LLJJIJIL;
    public final CommerceProductInfoView LLJJJ;
    public final C01GW LLJJJIL;
    public long LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return ((C1008503wx) this.LLILLJJLI).LJII;
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        SeaPdpViewModel seaPdpViewModelD6 = d6();
        AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(this, 240);
        if (((ArrayList) seaPdpViewModelD6.LLJJ).contains(awS580S0100000_1)) {
            return;
        }
        ((ArrayList) seaPdpViewModelD6.LLJJ).add(awS580S0100000_1);
    }

    public static boolean c6(PdpPaymentModule pdpPaymentModule) {
        boolean z;
        BNPLTopWidget bNPLTopWidget;
        Integer num;
        if (pdpPaymentModule != null && (bNPLTopWidget = pdpPaymentModule.bnplTopWidget) != null && (num = bNPLTopWidget.actionType) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1008503wx c1008503wx = (C1008503wx) obj;
        CommerceProductInfoView commerceProductInfoView = this.LLJJJ;
        ViewGroup.LayoutParams layoutParams = commerceProductInfoView.getLayoutParams();
        String str = null;
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            layoutParams2.width = -1;
            C786410Ut5.W5(commerceProductInfoView, layoutParams2);
        }
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.LayoutParams) && layoutParams3 != null) {
            layoutParams3.height = -2;
            layoutParams3.width = -1;
            C786410Ut5.W5(view, layoutParams3);
        }
        if (!d6().LLIZLLLIL && c6(c1008503wx.LJIIIZ)) {
            C786410Ut5.LJLLLLLL(8, this.LLJJJ.LLIZLLLIL);
            CommerceProductInfoView commerceProductInfoView2 = this.LLJJJ;
            IPdpStarter.PdpEnterParam pdpEnterParam = d6().LLIZ;
            if (pdpEnterParam != null) {
                str = pdpEnterParam.trackId;
            }
            commerceProductInfoView2.LIZJ(c1008503wx, 1, str);
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLJJJ.LLIZLLLIL);
        CommerceProductInfoView commerceProductInfoView3 = this.LLJJJ;
        IPdpStarter.PdpEnterParam pdpEnterParam2 = d6().LLIZ;
        if (pdpEnterParam2 != null) {
            str = pdpEnterParam2.trackId;
        }
        commerceProductInfoView3.LIZJ(c1008503wx, 2, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpInfoViewHolder(final ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awh, context, viewGroup, false, true));
        this.LLJJIJIL = eCBaseFragment;
        CommerceProductInfoView commerceProductInfoView = (CommerceProductInfoView) this.itemView.findViewById(R.id.ry5);
        this.LLJJJ = commerceProductInfoView;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 112));
        this.LLJJJJ = -1L;
        InterfaceC1071504Gz interfaceC1071504Gz = new InterfaceC1071504Gz() { // from class: X.04Ed
            @Override // X.InterfaceC1071504Gz
            public final void LIZ() {
                C1073204Hq c1073204Hq = this.LIZ.d6().LLLLLJLJLL;
                SeaPdpInfoViewHolder seaPdpInfoViewHolder = this.LIZ;
                View view = seaPdpInfoViewHolder.itemView;
                C1053804Ae c1053804Ae = seaPdpInfoViewHolder.d6().LLLLL;
                c1053804Ae.getClass();
                C1073204Hq.LIZIZ(c1073204Hq, view, "rate", null, 1, null, c1053804Ae.LJI("c7829.d5614", null), null, 192);
            }

            @Override // X.InterfaceC1071504Gz
            public final void LIZIZ() {
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah == null || c1054104Ah.LJJIJIIJIL) {
                    return;
                }
                c1054104Ah.LJJIJIIJIL = true;
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                if (interfaceC1748810vbrLJJIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10515049h(), new AwS580S0100000_1(c1054104Ah, 475));
                }
            }
        };
        InterfaceC1071404Gy interfaceC1071404Gy = new InterfaceC1071404Gy() { // from class: X.04Gt
            @Override // X.InterfaceC1071404Gy
            public final void LIZ() {
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah == null || c1054104Ah.LJJIJIL) {
                    return;
                }
                c1054104Ah.LJJIJIL = true;
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                if (interfaceC1748810vbrLJJIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049X(), new AwS580S0100000_1(c1054104Ah, 476));
                }
            }

            @Override // X.InterfaceC1071404Gy
            public final void LIZIZ(boolean z) {
                C03U5.LIZ(new AwS121S0110000_1(this.LIZ, z, 2), C1745060vVo.LIZ(this.LIZ), null);
            }
        };
        InterfaceC10322041w interfaceC10322041w = new InterfaceC10322041w() { // from class: X.041v
            public boolean LIZ;

            @Override // X.InterfaceC10322041w
            public final void LIZ(View view) {
                if (!this.LIZ) {
                    if (view != null) {
                        C1748720vbi.LIZLLL(view, new C10515049h(), new AwS580S0100000_1(this.LIZIZ, 445));
                    }
                    this.LIZ = true;
                }
            }

            @Override // X.InterfaceC10322041w
            public final void LIZIZ(CommerceProductInfoView commerceProductInfoView2, String str, PdpPaymentModule pdpPaymentModule) {
                SeaPdpInfoViewHolder seaPdpInfoViewHolder = this.LIZIZ;
                seaPdpInfoViewHolder.withState(seaPdpInfoViewHolder.d6(), new AwS43S1300000_1(this.LIZIZ, pdpPaymentModule, commerceProductInfoView2, str, this, 11));
            }
        };
        InterfaceC1071304Gx interfaceC1071304Gx = new InterfaceC1071304Gx() { // from class: X.048f
            @Override // X.InterfaceC1071304Gx
            public final void LIZ(CommerceProductInfoView commerceProductInfoView2, SEACCIPaymentModule sEACCIPaymentModule) {
                C19EG c19egLIZIZ;
                FragmentManager supportFragmentManager;
                SeaPaymentPanelInfo seaPaymentPanelInfo;
                SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget;
                if (seaPaymentInstallmentPlan != null) {
                    if (commerceProductInfoView2 != null) {
                        C1748720vbi.LIZLLL(commerceProductInfoView2, new C10516049i(), new AwS580S0100000_1(seaPaymentInstallmentPlan, 446));
                    } else {
                        return;
                    }
                } else if (commerceProductInfoView2 == null) {
                    return;
                }
                Context context2 = commerceProductInfoView2.getContext();
                if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (seaPaymentPanelInfo = sEACCIPaymentModule.cciInfo) != null) {
                    C042R.LIZ(supportFragmentManager, seaPaymentPanelInfo, null, null, 28);
                }
            }

            @Override // X.InterfaceC1071304Gx
            public final void LIZIZ(CommerceProductInfoView commerceProductInfoView2, SEACCIPaymentModule sEACCIPaymentModule) {
                SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget;
                if (seaPaymentInstallmentPlan != null && commerceProductInfoView2 != null) {
                    C1748720vbi.LIZLLL(commerceProductInfoView2, new C10515049h(), new AwS580S0100000_1(seaPaymentInstallmentPlan, 447));
                }
            }
        };
        C1070604Gq c1070604Gq = new C1070604Gq(this);
        C04H1 c04h1 = new C04H1() { // from class: X.03wY
            @Override // X.C04H1
            public final void LIZ() {
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ;
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah == null || (interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ()) == null) {
                    return;
                }
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10516049i(), new AwS580S0100000_1(c1054104Ah, 479));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C04H1
            public final void LIZIZ() {
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ;
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah != null && (interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ()) != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10515049h(), new AwS580S0100000_1(c1054104Ah, 480));
                }
                SeaPdpInfoViewHolder seaPdpInfoViewHolder = this.LIZ;
                List<PromotionLogo> list = ((C1008503wx) seaPdpInfoViewHolder.LLILLJJLI).LJ;
                if (list != null) {
                    int i = 0;
                    for (PromotionLogo promotionLogo : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        PromotionLogo promotionLogo2 = promotionLogo;
                        C1053804Ae c1053804Ae = seaPdpInfoViewHolder.d6().LLLLL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("c7829.d73429_i");
                        sbLIZ.append(i);
                        Map<String, Object> mapLJ = c1053804Ae.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        C1054104Ah c1054104Ah2 = seaPdpInfoViewHolder.d6().LLJLIL;
                        if (c1054104Ah2 != null) {
                            String str = promotionLogo2.promotionId;
                            Integer num = promotionLogo2.promotionLogoType;
                            String str2 = promotionLogo2.daInfo;
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = c1054104Ah2.LJJIZ();
                            if (interfaceC1748810vbrLJJIZ2 != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ2, new C048X(), new AwS17S2200000_1(str, (String) num, (Integer) mapLJ, (Map<String, ? extends Object>) str2, (String) 6));
                            }
                        }
                        i = i2;
                    }
                }
            }
        };
        C04H0 c04h0 = new C04H0() { // from class: X.04Gr
            @Override // X.C04H0
            public final void LIZ() {
                ProductBase productBase;
                CombinedSalesVolume combinedSalesVolume;
                String str;
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ;
                Object obj;
                Object obj2;
                String str2;
                HashMap<String, Object> mapLJIIJ;
                Object obj3;
                Map<String, Object> map;
                Map<String, Object> map2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SeaPdpInfoViewHolder seaPdpInfoViewHolder = this.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpInfoViewHolder.d6().LLIZ;
                if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                    Object obj4 = map2.get("EVENT_ORIGIN_FEATURE");
                    if (obj4 == null) {
                        obj4 = "TEMAI";
                    }
                    linkedHashMap.put("EVENT_ORIGIN_FEATURE", obj4);
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = seaPdpInfoViewHolder.d6().LLIZ;
                if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
                    Object obj5 = map.get("entrance_info");
                    if (obj5 == null) {
                        obj5 = "";
                    }
                    linkedHashMap.put("entrance_info", obj5);
                }
                linkedHashMap.put("page_name", "sold_info");
                linkedHashMap.put("previous_page", "product_detail");
                ProductPackStruct productPackStruct = seaPdpInfoViewHolder.d6().LLJIJIL;
                if (productPackStruct != null && (str2 = productPackStruct.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null && (obj3 = mapLJIIJ.get("volume")) != null) {
                    linkedHashMap.put("volume", obj3);
                }
                ProductPackStruct productPackStruct2 = seaPdpInfoViewHolder.d6().LLJIJIL;
                HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(productPackStruct2 != null ? productPackStruct2.daInfo : null);
                if (mapLJIIJ2 != null && (obj2 = mapLJIIJ2.get("inherited_volume")) != null) {
                    linkedHashMap.put("inherited_volume", obj2);
                }
                ProductPackStruct productPackStruct3 = seaPdpInfoViewHolder.d6().LLJIJIL;
                HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(productPackStruct3 != null ? productPackStruct3.daInfo : null);
                if (mapLJIIJ3 != null && (obj = mapLJIIJ3.get("volume_type")) != null) {
                    linkedHashMap.put("volume_type", obj);
                }
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah != null && (interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ()) != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049Y(), AFwS228S0000000_1.get$arr$(549));
                }
                ProductPackStruct productPackStruct4 = this.LIZ.d6().LLJIJIL;
                if (productPackStruct4 != null && (productBase = productPackStruct4.baseInfo) != null && (combinedSalesVolume = productBase.combinedSalesVolume) != null && (str = combinedSalesVolume.sales_specification_schema) != null) {
                    Context context2 = viewGroup.getContext();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
                    C919503ib.LIZIZ(context2, str, linkedHashMap2, false).open();
                    return;
                }
                boolean zLJIILLIIL = C041G.LJIILLIIL(this.LIZ.d6().LLJIJIL);
                Integer numFR2 = this.LIZ.d6().FR2();
                try {
                    C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LJ(this.LIZ.itemView.getContext(), R.attr.a1j, 41, viewGroup.getContext().getString((zLJIILLIIL && numFR2 != null && numFR2.intValue() == 0) ? 2131832970 : 2131839188)), viewGroup.getContext().getString(2131839189), false, new AwS650S0100000_1(this.LIZ, 17), 20), this.LIZ.LLJJIJIL.getChildFragmentManager(), null, new AwS545S0100000_1(this.LIZ, 1532), 4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }

            @Override // X.C04H0
            public final void LIZIZ() {
                C1054104Ah c1054104Ah = this.LIZ.d6().LLJLIL;
                if (c1054104Ah != null && !c1054104Ah.LJJIJLIJ) {
                    c1054104Ah.LJJIJLIJ = true;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                    if (interfaceC1748810vbrLJJIZ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049X(), AFwS228S0000000_1.get$arr$(550));
                    }
                }
                this.LIZ.LLJJJJ = SystemClock.elapsedRealtime();
            }
        };
        commerceProductInfoView.setRatingListener(interfaceC1071504Gz);
        commerceProductInfoView.setSalesInfoListener(c04h0);
        commerceProductInfoView.setFavoriteListener(interfaceC1071404Gy);
        commerceProductInfoView.setBNPLListener(interfaceC10322041w);
        commerceProductInfoView.setCCIListener(interfaceC1071304Gx);
        commerceProductInfoView.setPromotionLabelsListener(c1070604Gq);
        commerceProductInfoView.setTitleListener(c04h1);
    }
}
