package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C049X;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C908703gr;
import X.C993640bxq;
import X.EnumC1011903xV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SeaSkuTextViewMoreCell extends ECPowerCell<C993640bxq> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuTextViewMoreCell.class, "specViewModel", "getSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaSkuTextViewMoreCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 511);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(74);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 522), awS575S0100000_31, AFwS221S0000000_31.get$arr$(149), new AwS575S0100000_31((C03K6) this, 497), new AwS575S0100000_31((C03K6) this, 499), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 501), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 503), null, new AwS575S0100000_31((C03K6) this, 504));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 498);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 500);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 502);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 45));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 505);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 506);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 507);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 508);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 509);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 510), awS575S0100000_31, AFwS221S0000000_31.get$arr$(147), new AwS575S0100000_31((C03K6) this, 512), new AwS575S0100000_31((C03K6) this, 513), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 514), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 515), null, new AwS575S0100000_31((C03K6) this, 516));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 517), awS575S0100000_31, AFwS221S0000000_31.get$arr$(148), new AwS575S0100000_31((C03K6) this, 518), new AwS575S0100000_31((C03K6) this, 519), new AwS575S0100000_31((C03K6) this, 520), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 521));
        }
        this.LLJ = assemVMLazy;
    }

    public final SeaSkuSpecViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final String str;
        C908703gr c908703gr;
        int i;
        int i2;
        final C993640bxq c993640bxq = (C993640bxq) interfaceC1891350zJl;
        super.onBindItemView(c993640bxq);
        if (c993640bxq.LLILLJJLI) {
            str = "see_less";
        } else {
            str = "see_more";
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            Context context = this.itemView.getContext();
            if (c993640bxq.LLILLJJLI) {
                i2 = 2131832983;
            } else {
                i2 = 2131832984;
            }
            tuxTextView.setText(context.getString(i2));
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            if (c993640bxq.LLILLJJLI) {
                i = R.raw.icon_chevron_up;
            } else {
                i = R.raw.icon_chevron_down;
            }
            tuxIconView.setIconRes(i);
        }
        if (c993640bxq.LLILLL && (c908703gr = L5().LLJILJILJ) != null) {
            C049X c049x = new C049X();
            EnumC1011903xV enumC1011903xV = EnumC1011903xV.LOG_WHEN_SHOW;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sku_button_show_text_view_more_");
            sbLIZ.append(c993640bxq.LL);
            sbLIZ.append('_');
            sbLIZ.append(str);
            c908703gr.LIZLLL("tiktokec_button_show", c049x, new AwS180S1100000_31(this, str, 3), enumC1011903xV, this.LLJI, C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.15Nz
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                C908703gr c908703gr2 = this.LLILZ.L5().LLJILJILJ;
                if (c908703gr2 != null) {
                    c908703gr2.LIZLLL("tiktokec_button_click", new C049Y(), new AwS180S1100000_31(this.LLILZ, str, 4), EnumC1011903xV.LOG_VIEW, this.LLILZ.itemView, null);
                }
                SeaSkuSpecViewModel seaSkuSpecViewModelL5 = this.LLILZ.L5();
                String str2 = c993640bxq.LL;
                ((HashMap) seaSkuSpecViewModelL5.LLIZ).put(str2, Boolean.valueOf(!Intrinsics.LJFF(((HashMap) seaSkuSpecViewModelL5.LLIZ).get(str2), Boolean.TRUE)));
                seaSkuSpecViewModelL5.setState(new AwS52S1000000_1(str2, 48));
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(71);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.M6(tuxIconView, layoutParams);
        tuxIconView.setTintColorRes(R.attr.a1j);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(tuxIconView);
        this.LLJI = tuxTextView;
        this.LLJIJIL = tuxIconView;
        return linearLayout;
    }
}
