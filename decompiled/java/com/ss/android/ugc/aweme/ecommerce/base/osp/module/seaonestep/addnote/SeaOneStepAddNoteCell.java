package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.addnote;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C10515049h;
import X.C123100dR;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7814033k;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SeaOneStepAddNoteCell extends ECPowerCell<C7814033k> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;
    public C7814033k LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepAddNoteCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f876avg;
    }

    public SeaOneStepAddNoteCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1147);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(60);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1158), awS577S0100000_33, AFwS224S0000000_33.get$arr$(169), new AwS577S0100000_33((C03K6) this, 1133), new AwS577S0100000_33((C03K6) this, 1135), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1137), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1139), null, new AwS577S0100000_33((C03K6) this, 1140));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1134);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1136);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1138);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 42));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1141);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1142);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1143);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1144);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1145);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1146), awS577S0100000_33, AFwS224S0000000_33.get$arr$(167), new AwS577S0100000_33((C03K6) this, 1148), new AwS577S0100000_33((C03K6) this, 1149), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1150), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1151), null, new AwS577S0100000_33((C03K6) this, 1152));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1153), awS577S0100000_33, AFwS224S0000000_33.get$arr$(168), new AwS577S0100000_33((C03K6) this, 1154), new AwS577S0100000_33((C03K6) this, 1155), new AwS577S0100000_33((C03K6) this, 1156), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1157));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    public final void N5(C7814033k c7814033k) {
        String str;
        String str2;
        TextView textView = (TextView) this.itemView.findViewById(R.id.u43);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.u42);
        String str3 = c7814033k.LLILZLL;
        if (str3 != null) {
            str = L5().LLL.get(str3);
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            str2 = c7814033k.LLIZLLLIL;
        } else {
            str2 = c7814033k.LLIZ;
        }
        C0H1U.LJIIL(textView, str2, true);
        if (!C123100dR.LIZ(str)) {
            str = "";
        }
        C0H1U.LJIIL(textView2, str, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C7814033k c7814033k = (C7814033k) interfaceC1891350zJl;
        super.onBindItemView(c7814033k);
        if (!this.LLJI) {
            this.LLJI = true;
            C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19yk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLJ;
                }
            }, null, new AwS647S0100000_33(this, 41), 6);
        }
        this.LLJIJIL = c7814033k;
        N5(c7814033k);
        C786410Ut5.I7(new AjS40S0200000_1(c7814033k, this, 75), this.itemView);
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS224S0000000_33.get$arr$(595), new AwS580S0100000_1(this, 797));
    }
}
