package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.C047Z;
import X.C049X;
import X.C04EM;
import X.C04EP;
import X.C11EA;
import X.C1748720vbi;
import X.C19ME;
import X.C2217381BqS;
import X.C23271099x;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.C950403na;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuWidget extends SkuPanelBaseWidget {
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final SeaSkuPanelFragment LLJI;
    public final int LLJIJIL = R.layout.axs;
    public LinearLayout LLJILJIL;
    public C04EM LLJILJILJ;
    public C950403na LLJILLL;

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        this.LLILLJJLI = true;
        C950403na c950403na = this.LLJILLL;
        if (c950403na != null) {
            c950403na.LIZJ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        C04EM c04em = this.LLJILJILJ;
        if (c04em == null) {
            c04em = null;
        }
        c04em.setCheckedChangeListener(new C04EP() { // from class: X.044Y
            @Override // X.C04EP
            public final void LIZ(String[] strArr) {
                this.LIZ.LJII().dc(false, strArr);
            }

            @Override // X.C04EP
            public final void LIZIZ(C047Y c047y) {
                this.LIZ.LJII().LLJJIJIIJIL = c047y.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0216  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x02ef  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x02f5  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x02f8  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x02fb  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x02fe  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x0304  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
            @Override // X.C04EP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(int r21, int r22, X.C042Y r23, boolean r24) {
                /*
                    Method dump skipped, instruction units count: 937
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C044Y.LIZJ(int, int, X.042Y, boolean):void");
            }
        });
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.0428
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS615S0100000_1(this, 73));
        C11EA.LJIIIIZZ(this, LJII(), new C2217381BqS() { // from class: X.042D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new C2217381BqS() { // from class: X.042A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new AwS650S0100000_1(this, 7));
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.0426
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuPanelWaistBanner();
            }
        }, new AwS615S0100000_1(this, 74));
        C948503nH.LJFF(LJII(), C23271099x.INSTANCE, new C047Z(this, null));
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.0429
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getLocalSizeSalePropList();
            }
        }, new AwS615S0100000_1(this, 72));
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        C950403na c950403na = this.LLJILLL;
        if (c950403na != null) {
            c950403na.LIZJ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        this.LLJILJIL = (LinearLayout) LJI(R.id.vi7);
        C04EM c04em = new C04EM(LIZIZ().getContext());
        this.LLJILJILJ = c04em;
        c04em.setId(R.id.ej8);
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        LinearLayout linearLayout2 = this.LLJILJIL;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C04EM c04em2 = this.LLJILJILJ;
        linearLayout2.addView(c04em2 != null ? c04em2 : null);
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        withState(LJII(), new AwS580S0100000_1(this, 298));
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJIJIL;
    }

    public SkuWidget(SeaSkuPanelFragment seaSkuPanelFragment) {
        this.LLJI = seaSkuPanelFragment;
    }

    public final Integer LJIIJ(String str, ViewGroup viewGroup) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        ProductPackStruct productPackStruct = LJII().LLJILJILJ;
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (sizeGuide = productBase.sizeGuide) == null || ((!LJII().Hc0() && (!Intrinsics.LJFF(sizeGuide.isOutstanding, Boolean.TRUE) || sizeGuide.sizeGuideImage == null)) || str == null || a0.LJJJIL(str) || !Intrinsics.LJFF(str, sizeGuide.showSalePropId))) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTag(R.id.en4, this.LLJI);
        tuxTextView.setId(View.generateViewId());
        tuxTextView.setText(sizeGuide.skuSizeGuideTitle);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1n);
        C19ME c19me = new C19ME(-2, -2);
        c19me.topToTop = 0;
        c19me.endToEnd = 0;
        c19me.bottomToBottom = 0;
        viewGroup.addView(tuxTextView, c19me);
        C786410Ut5.I7(new AjS40S0200000_1(this, tuxTextView, 94), tuxTextView);
        C1748720vbi.LJFF(tuxTextView, new C049X(), AFwS185S0000000_1.get$arr$(511), new AwS580S0100000_1(this, 928));
        return Integer.valueOf(tuxTextView.getId());
    }
}
