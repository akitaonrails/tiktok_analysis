package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar;

import X.C01GW;
import X.C04CU;
import X.C04EC;
import X.C04EI;
import X.C10503048v;
import X.C10504048w;
import X.C1077704Jj;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1743750vTh;
import X.C1745060vVo;
import X.C1759470vt3;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C430110Gtl;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC1743770vTj;
import Y.ARunnableS39S0300000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomNavBarWidgetBff extends JediBaseWidget implements InterfaceC1743770vTj {
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
    public final SeaPdpFragment LLJ;
    public View LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1351));
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C04EC LLJJ;
    public final Map<String, Boolean> LLJJI;
    public final C01GW LLJJIII;
    public final int LLJJIJI;

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null) {
            view.setTag(R.id.gib, this.LLJ);
        }
        View view2 = this.LLILZ;
        this.LLJIJIL = view2 != null ? (LinearLayout) view2.findViewById(R.id.xzg) : null;
        View view3 = this.LLILZ;
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.ch1)) == null) {
            viewFindViewById = null;
        } else {
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.view_btn_buy_skeleton);
            if (viewFindViewById2 != null) {
                int i = C10503048v.LLILZLL;
                viewFindViewById2.setBackground(C10504048w.LIZ(C04CU.LIZ(), C1745060vVo.LIZ(this)));
            }
        }
        this.LLJI = viewFindViewById;
        View view4 = this.LLILZ;
        this.LLJJ = view4 != null ? (C04EC) view4.findViewById(R.id.cbm) : null;
        if (this.LLILZ != null && C04EI.LIZ()) {
            for (View view5 : C1697810uHb.LJIIL(this.LLJI)) {
                int i2 = LLJJIJIIJIL;
                view5.setPadding(i2, i2, i2, i2);
                view5.getLayoutParams().height = LLJJIJIL;
                view5.requestLayout();
            }
            C04EC c04ec = this.LLJJ;
            if (c04ec != null) {
                ViewGroup.LayoutParams layoutParams = c04ec.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = LLJJIJIL;
                }
                c04ec.requestLayout();
            }
        }
        LJI().hR2(new C2217381BqS() { // from class: X.0vhN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getLoadingStatus());
            }
        }, new AwS580S0100000_1(this, 874));
        LJI().hR2(new C2217381BqS() { // from class: X.04EJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getBottomBarData();
            }
        }, new AwS580S0100000_1(this, 876));
        LJI().hR2(new C2217381BqS() { // from class: X.04EB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getBottomBarVO();
            }
        }, new AwS580S0100000_1(this, 877));
        LJI().hR2(new C2217381BqS() { // from class: X.0vsY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getLynxPopupState();
            }
        }, new AwS605S0100000_26(this, 804));
        LJI().hR2(new C2217381BqS() { // from class: X.04EL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getBottomMynaBannerState();
            }
        }, new AwS580S0100000_1(this, 873));
        C1743750vTh.LIZIZ(this, "ec_clear_unread_msg", "ec_pdp_bottom_banner_data_updated");
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJILLL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.sx(this, "pdp_sea_destroy_bottom_myna_banner", new C1077704Jj(this, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel LJI() {
        return (SeaPdpViewModel) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJILLL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.U0(this, "pdp_sea_destroy_bottom_myna_banner");
        }
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJJIJI;
    }

    public SeaPdpBottomNavBarWidgetBff(SeaPdpFragment seaPdpFragment) {
        this.LLJ = seaPdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 8));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1352));
        this.LLJJI = new LinkedHashMap();
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1353));
        this.LLJJIJI = R.layout.ave;
    }

    public final void LJII(boolean z) {
        boolean z2;
        LinearLayout linearLayout = this.LLJIJIL;
        int height = 0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            SeaPdpViewModel.GS2(LJI(), null, 0, 1);
            return;
        }
        if (z) {
            C430110Gtl.LIZ(this.LLJIJIL, new AwS545S0100000_1(this, 1354));
            return;
        }
        SeaPdpViewModel seaPdpViewModelLJI = LJI();
        LinearLayout linearLayout2 = this.LLJIJIL;
        if (linearLayout2 != null) {
            height = linearLayout2.getHeight();
        }
        SeaPdpViewModel.GS2(seaPdpViewModelLJI, null, Integer.valueOf(height), 1);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        SellerInfo sellerInfo;
        String str3;
        if (Intrinsics.LJFF(str, "ec_clear_unread_msg")) {
            ProductPackStruct productPackStruct = LJI().LLJIJIL;
            Object obj = null;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str3 = sellerInfo.sellerId) != null && !a0.LJJJIL(str3)) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
                if (mapLJIIJ != null) {
                    obj = mapLJIIJ.get("seller_id");
                }
                if (Intrinsics.LJFF(obj, str3)) {
                    LJI().iR2(new AwS580S0100000_1(this, 238));
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_pdp_bottom_banner_data_updated")) {
            return;
        }
        C1759470vt3 c1759470vt3 = LJI().LLLLLIL;
        LinearLayout linearLayout = this.LLJIJIL;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1355);
        c1759470vt3.getClass();
        if (linearLayout == null) {
            return;
        }
        HandlerHook.viewPost(linearLayout, new ARunnableS39S0300000_6(linearLayout, c1759470vt3, awS545S0100000_1, 26));
    }
}
