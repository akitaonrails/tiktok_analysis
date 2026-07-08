package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.shopify;

import X.AnonymousClass0316;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C04JI;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USCombinedSkuEmailAuthorizeCell extends ECPowerCell<AnonymousClass0316> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombinedSkuEmailAuthorizeCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.19yp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 39), 6);
    }

    public USCombinedSkuEmailAuthorizeCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 698);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(43);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 709), awS577S0100000_33, AFwS224S0000000_33.get$arr$(118), new AwS577S0100000_33((C03K6) this, 684), new AwS577S0100000_33((C03K6) this, 686), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 688), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 690), null, new AwS577S0100000_33((C03K6) this, 691));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 685);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 687);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 689);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 25));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 692);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 693);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 694);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 695);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 696);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 697), awS577S0100000_33, AFwS224S0000000_33.get$arr$(116), new AwS577S0100000_33((C03K6) this, 699), new AwS577S0100000_33((C03K6) this, OppoPermissionPopupMaskDelayExp.DEFAULT), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 701), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 702), null, new AwS577S0100000_33((C03K6) this, 703));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 704), awS577S0100000_33, AFwS224S0000000_33.get$arr$(117), new AwS577S0100000_33((C03K6) this, 705), new AwS577S0100000_33((C03K6) this, 706), new AwS577S0100000_33((C03K6) this, 707), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 708));
        }
        this.LLJ = assemVMLazy;
    }

    public final void L5() {
        ((TuxTextView) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_module_name)).setTextColorRes(R.attr.a1p);
        ((TuxTextView) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_module_desc)).setTextColorRes(R.attr.a1p);
        C786410Ut5.C7((C21411818qq) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_switch), null);
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AnonymousClass0316 anonymousClass0316 = (AnonymousClass0316) interfaceC1891350zJl;
        super.onBindItemView(anonymousClass0316);
        ((TextView) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_module_name)).setText(anonymousClass0316.LLILZLL.title);
        ((TextView) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_module_desc)).setText(anonymousClass0316.LLILZLL.description);
        C786410Ut5.C7((C21411818qq) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_switch), null);
        Boolean bool = anonymousClass0316.LLILZLL.isAuthorized;
        if (bool != null) {
            ((C21411818qq) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_switch)).setChecked(bool.booleanValue());
        }
        C786410Ut5.C7((C21411818qq) this.itemView.findViewById(R.id.us_combined_sku_order_submit_shopify_switch), new C04JI(this, anonymousClass0316, 1));
        if (!this.LLJI) {
            this.LLJI = true;
            C03O0 c03o0 = C03O0.LIZ;
            C03O0.LJJJZ(c03o0, "share_email_to_shopify", N5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, 1048572);
            C03O0.LJJJJZ(c03o0, "share_email_to_shopify", null, N5().hi1(false), null, "order_submit", null, null, null, null, null, null, null, null, null, null, null, null, 33554410);
        }
        if (this.LLILLL) {
            L5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0q, viewGroup, false);
    }
}
