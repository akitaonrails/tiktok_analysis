package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C1004203wG;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C13LE;
import X.C19719912Dl;
import X.C21714919yd;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS15S0000000_33;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class OspSkuItemCell extends ECPowerCell<C1004203wG> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C21714919yd LLJ = new C21714919yd();
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspSkuItemCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aps;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.19yq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 52), 6);
    }

    public OspSkuItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 799);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(47);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 810), awS577S0100000_33, AFwS224S0000000_33.get$arr$(130), new AwS577S0100000_33((C03K6) this, 785), new AwS577S0100000_33((C03K6) this, 787), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 789), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 791), null, new AwS577S0100000_33((C03K6) this, 792));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 786);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 788);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 790);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 29));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 793);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 794);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 795);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 796);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 797);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 798), awS577S0100000_33, AFwS224S0000000_33.get$arr$(128), new AwS577S0100000_33((C03K6) this, 800), new AwS577S0100000_33((C03K6) this, 801), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 802), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 803), null, new AwS577S0100000_33((C03K6) this, 804));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 805), awS577S0100000_33, AFwS224S0000000_33.get$arr$(129), new AwS577S0100000_33((C03K6) this, 806), new AwS577S0100000_33((C03K6) this, 807), new AwS577S0100000_33((C03K6) this, StrategyCenter.ENABLE_SMART_SERVICE), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 809));
        }
        this.LLJI = assemVMLazy;
    }

    public final void L5() {
        View viewFindViewById = this.itemView.findViewById(R.id.vh3);
        if (viewFindViewById == null) {
            return;
        }
        ((TuxTextView) viewFindViewById.findViewById(R.id.vt5)).setTextColorRes(R.attr.a1p);
        ((TuxTextView) viewFindViewById.findViewById(R.id.vt7)).setTextColorRes(R.attr.a1p);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.findViewById(R.id.i_r);
        Iterator it2 = new C1077420e8y(viewGroup, 41).iterator();
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                C786410Ut5.I7(new AjS15S0000000_33(10), viewGroup);
                return;
            } else {
                View view = (View) c1077410e8x.next();
                if (view instanceof TuxTextView) {
                    ((TuxTextView) view).setTextColorRes(R.attr.a1p);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0211  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r48) {
        /*
            Method dump skipped, instruction units count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspSkuItemCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.aps, viewGroup, false);
    }
}
