package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.C01GW;
import X.C03DZ;
import X.C04CU;
import X.C04E4;
import X.C04EI;
import X.C04ET;
import X.C0PEM;
import X.C1023203zK;
import X.C10503048v;
import X.C10504048w;
import X.C1077704Jj;
import X.C1308910kAL;
import X.C1389880mGw;
import X.C13LE;
import X.C13LQ;
import X.C1741890vQh;
import X.C1743750vTh;
import X.C1745060vVo;
import X.C1759470vt3;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426770GoN;
import X.C430110Gtl;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C893803eS;
import X.C948503nH;
import X.C960903pH;
import X.InterfaceC1743770vTj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS39S0300000_6;
import Y.ATListenerS437S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomNavBarWidgetNew extends JediBaseWidget implements InterfaceC1743770vTj {
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
    public final SeaPdpFragment LLJ;
    public View LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1369));
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public C426770GoN LLJJI;
    public TuxTextView LLJJIII;
    public C04E4 LLJJIJI;
    public C10503048v LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final int LLJJL;

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C04E4 c04e4;
        C10503048v c10503048v;
        LinearLayout.LayoutParams layoutParams;
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null) {
            view.setTag(R.id.gib, this.LLJ);
        }
        int iLIZ = C04CU.LIZ();
        View view2 = this.LLILZ;
        C10503048v c10503048v2 = null;
        if (view2 == null || (viewFindViewById = view2.findViewById(R.id.ch1)) == null) {
            viewFindViewById = null;
        } else {
            View viewFindViewById4 = viewFindViewById.findViewById(R.id.view_btn_buy_skeleton);
            if (viewFindViewById4 != null) {
                int i = C10503048v.LLILZLL;
                viewFindViewById4.setBackground(C10504048w.LIZ(iLIZ, C1745060vVo.LIZ(this)));
            }
        }
        this.LLJI = viewFindViewById;
        View view3 = this.LLILZ;
        this.LLJIJIL = view3 != null ? (LinearLayout) view3.findViewById(R.id.xzg) : null;
        View view4 = this.LLILZ;
        this.LLJILJILJ = view4 != null ? view4.findViewById(R.id.bsm) : null;
        if (this.LLILZ != null && C04EI.LIZ()) {
            for (View view5 : (ArrayList) C13LQ.LJIJI(new View[]{this.LLJI, this.LLJILJILJ})) {
                int i2 = LLJJLIIIJLLLLLLLZ;
                view5.setPadding(i2, i2, i2, i2);
                view5.getLayoutParams().height = LLJL;
                view5.requestLayout();
            }
        }
        View view6 = this.LLJILJILJ;
        if (view6 == null || (viewFindViewById2 = view6.findViewById(R.id.uoy)) == null) {
            viewFindViewById2 = null;
        } else {
            C786410Ut5.I7(new AjS60S0100000_1(this, 37), viewFindViewById2);
        }
        this.LLJILLL = viewFindViewById2;
        View view7 = this.LLJILJILJ;
        if (view7 == null || (viewFindViewById3 = view7.findViewById(R.id.k87)) == null) {
            viewFindViewById3 = null;
        } else {
            this.LLJJI = (C426770GoN) viewFindViewById3.findViewById(R.id.k6l);
            this.LLJJIII = (TuxTextView) viewFindViewById3.findViewById(R.id.k89);
            C786410Ut5.I7(new AjS70S0100000_26(this, 36), viewFindViewById3);
        }
        this.LLJJ = viewFindViewById3;
        View view8 = this.LLJILJILJ;
        if (view8 == null || (c04e4 = (C04E4) view8.findViewById(R.id.afo)) == null) {
            c04e4 = null;
        } else {
            c04e4.setMaxLines(2);
            c04e4.setSupportClickWhenDisable(true);
            c04e4.setStyle(Integer.valueOf(iLIZ));
            if (((Number) C04ET.LIZ.getValue()).intValue() != 3) {
                ViewGroup.LayoutParams layoutParams2 = c04e4.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04e4);
                    c04e4.setLayoutParams(layoutParams);
                }
                c04e4.setText((CharSequence) null);
                c04e4.setCustomBgColor(iLIZ == 3 ? null : C1308910kAL.LIZJ(R.attr.a07, C1745060vVo.LIZ(this)));
                c04e4.setButtonStartIcon(Integer.valueOf(R.raw.icon_add_shopping_cart_ltr));
                c04e4.setIconTintColorRes(iLIZ == 3 ? R.attr.hd : R.attr.a1q);
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, c04e4, 24), c04e4);
        }
        this.LLJJIJI = c04e4;
        View view9 = this.LLJILJILJ;
        if (view9 != null && (c10503048v = (C10503048v) view9.findViewById(R.id.cnx)) != null) {
            c10503048v.setSupportClickWhenDisable(true);
            c10503048v.LIZLLL(iLIZ);
            c10503048v.setOnTouchListener(new ATListenerS437S0100000_1(this, 4));
            C786410Ut5.I7(new AjS40S0200000_1(this, c10503048v, 23), c10503048v);
            c10503048v2 = c10503048v;
        }
        this.LLJJIJIIJIL = c10503048v2;
        this.LLJJJJLIIL = false;
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vhM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getLoadingStatus());
            }
        }, new AwS580S0100000_1(this, 359));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.04E9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getBottomBarVO();
            }
        }, new AwS580S0100000_1(this, 362));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vsX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getLynxPopupState();
            }
        }, new AwS605S0100000_26(this, 449));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.04EK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getBottomMynaBannerState();
            }
        }, new AwS580S0100000_1(this, 363));
        C1743750vTh.LIZIZ(this, "ec_clear_unread_msg", "ec_pdp_bottom_banner_data_updated");
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJJJJJIL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.sx(this, "pdp_sea_destroy_bottom_myna_banner", new C1077704Jj(this, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel LJIIIIZZ() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    public final String LJII() {
        return (String) withState(LJIIIIZZ(), new AwS580S0100000_1(this, 243));
    }

    public final boolean LJIIJ() {
        Integer num;
        ProductPackStruct productPackStruct = LJIIIIZZ().LLJIJIL;
        return (productPackStruct == null || (num = productPackStruct.status) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJJJJJIL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.U0(this, "pdp_sea_destroy_bottom_myna_banner");
        }
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJJL;
    }

    public SeaPdpBottomNavBarWidgetNew(SeaPdpFragment seaPdpFragment) {
        this.LLJ = seaPdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 10));
        this.LLJJJ = -1;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1370));
        this.LLJJL = R.layout.avf;
    }

    public final boolean LJIIIZ(View view) {
        if (LJIIIIZZ().LLLFFI) {
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LJIIIZ(C1745060vVo.LIZ(this).getString(2131832572));
            c1389880mGw.LJIIJ();
            return true;
        }
        return false;
    }

    public final void LJIIJJI(boolean z) {
        boolean z2;
        LinearLayout linearLayout = this.LLJIJIL;
        int height = 0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            SeaPdpViewModel.GS2(LJIIIIZZ(), null, 0, 1);
            return;
        }
        if (z) {
            C430110Gtl.LIZ(this.LLJIJIL, new AwS545S0100000_1(this, 1371));
            return;
        }
        SeaPdpViewModel seaPdpViewModelLJIIIIZZ = LJIIIIZZ();
        LinearLayout linearLayout2 = this.LLJIJIL;
        if (linearLayout2 != null) {
            height = linearLayout2.getHeight();
        }
        SeaPdpViewModel.GS2(seaPdpViewModelLJIIIIZZ, null, Integer.valueOf(height), 1);
    }

    public final HashMap<String, Object> LJI(boolean z, boolean z2) {
        String str;
        Object obj;
        PurchaseLimit purchaseLimit;
        Map<String, Object> mapLIZ;
        SkuPrice skuPrice;
        HashMap<String, Object> map = new HashMap<>();
        map.put("pdp_unique_id", LJIIIIZZ().LLLZZIL);
        if (z) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        map.put("button_type", str);
        map.put("is_clickable", C893803eS.LIZ(z));
        SkuItem skuItemIR2 = LJIIIIZZ().IR2();
        if (skuItemIR2 == null || (skuPrice = skuItemIR2.price) == null || (obj = skuPrice.discount) == null) {
            obj = 0;
        }
        map.put("discount_percentage", obj);
        C1023203zK c1023203zK = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct = LJIIIIZZ().LLJIJIL;
        if (productPackStruct != null) {
            purchaseLimit = productPackStruct.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        String skuId = LJIIIIZZ().getSkuId();
        c1023203zK.getClass();
        map.put("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit, skuId));
        if (z2 && (mapLIZ = LJIIIIZZ().XR2().LIZ()) != null) {
            map.putAll(mapLIZ);
        }
        return map;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        SellerInfo sellerInfo;
        String str3;
        Object obj;
        if (Intrinsics.LJFF(str, "ec_clear_unread_msg")) {
            ProductPackStruct productPackStruct = LJIIIIZZ().LLJIJIL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str3 = sellerInfo.sellerId) != null && !a0.LJJJIL(str3)) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
                if (mapLJIIJ != null) {
                    obj = mapLJIIJ.get("seller_id");
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(obj, str3)) {
                    C426770GoN c426770GoN = this.LLJJI;
                    if (c426770GoN != null) {
                        C03DZ.LIZ(c426770GoN);
                    }
                    SeaPdpViewModel seaPdpViewModelLJIIIIZZ = LJIIIIZZ();
                    seaPdpViewModelLJIIIIZZ.getClass();
                    C948503nH.LJFF(seaPdpViewModelLJIIIIZZ, C0PEM.LIZJ, new C960903pH(seaPdpViewModelLJIIIIZZ, null));
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_pdp_bottom_banner_data_updated")) {
            return;
        }
        C1759470vt3 c1759470vt3 = LJIIIIZZ().LLLLLIL;
        LinearLayout linearLayout = this.LLJIJIL;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1372);
        c1759470vt3.getClass();
        if (linearLayout == null) {
            return;
        }
        HandlerHook.viewPost(linearLayout, new ARunnableS39S0300000_6(linearLayout, c1759470vt3, awS545S0100000_1, 26));
    }
}
