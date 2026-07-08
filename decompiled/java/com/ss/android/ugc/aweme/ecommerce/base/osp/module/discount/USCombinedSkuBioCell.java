package com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C10515049h;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719602rS;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C812903Fn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS15S0000000_33;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USCombinedSkuBioCell extends ECPowerCell<C719602rS> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombinedSkuBioCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19yr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 63), 6);
    }

    public USCombinedSkuBioCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 880);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(50);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 863), awS577S0100000_33, AFwS224S0000000_33.get$arr$(137), new AwS577S0100000_33((C03K6) this, 866), new AwS577S0100000_33((C03K6) this, 868), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 870), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 872), null, new AwS577S0100000_33((C03K6) this, 873));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 867);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 869);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 871);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 32));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 874);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 875);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 876);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 877);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 878);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 879), awS577S0100000_33, AFwS224S0000000_33.get$arr$(138), new AwS577S0100000_33((C03K6) this, 881), new AwS577S0100000_33((C03K6) this, 882), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 883), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 884), null, new AwS577S0100000_33((C03K6) this, 885));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 886), awS577S0100000_33, AFwS224S0000000_33.get$arr$(139), new AwS577S0100000_33((C03K6) this, 887), new AwS577S0100000_33((C03K6) this, 888), new AwS577S0100000_33((C03K6) this, 889), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 890));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 865));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 864));
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        C719602rS c719602rS = (C719602rS) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        super.onBindItemView(c719602rS);
        View view = this.itemView;
        ProductSafetyModule productSafetyModule = c719602rS.LLILZLL;
        if (productSafetyModule != null) {
            HashMap<String, Object> map = L5().LLLIL;
            if (map != null) {
                obj = map.get("previous_page");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> map2 = L5().LLLIL;
            if (map2 != null) {
                obj2 = map2.get("entrance_info");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            ((C812903Fn) this.LLJIJIL.getValue()).e0(productSafetyModule, "order_submit", str2, L5().LLLIL, str);
            ((C812903Fn) this.LLJIJIL.getValue()).i0();
            C1748720vbi.LJFF(view.getRootView(), new C10515049h(), AFwS215S0000000_26.get$arr$(544), AFwS268S0000000_26.get$arr$(770));
        }
        if (this.LLILLL) {
            ((C812903Fn) this.LLJIJIL.getValue()).h0();
            C786410Ut5.I7(new AjS15S0000000_33(11), (View) this.LLJI.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.ald, viewGroup, false);
    }
}
