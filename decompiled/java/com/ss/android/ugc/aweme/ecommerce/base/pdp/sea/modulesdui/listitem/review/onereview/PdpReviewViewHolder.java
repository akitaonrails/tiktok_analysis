package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview;

import X.AbstractC1075804Iq;
import X.AbstractC1076004Is;
import X.C01GW;
import X.C1074804Ig;
import X.C1075404Im;
import X.C1075604Io;
import X.C13LE;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C1761470vwH;
import X.C1842040y2E;
import X.C19719912Dl;
import X.C426160GnO;
import X.C452501pT;
import X.InterfaceC1075904Ir;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpReviewViewHolder extends AbsFullSpanVH<ReviewItemVO> {
    public static final /* synthetic */ int LLJLIL = 0;
    public FrameLayout LLJJIJIL;
    public C1075604Io LLJJJ;
    public C1761470vwH LLJJJIL;
    public C426160GnO LLJJJJ;
    public final View LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public final C1075404Im LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public AbstractC1075804Iq LLJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return ((ReviewItemVO) this.LLILLJJLI).needDivider;
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(((ReviewItemVO) this.LLILLJJLI).reviewItemStruct));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.04Im] */
    public PdpReviewViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awz, context, viewGroup, false, true));
        this.LLJJJJJIL = this.itemView.findViewById(R.id.mef);
        this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.tv_review_tip);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 72));
        View view = this.itemView;
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        AbstractC1076004Is abstractC1076004Is = (AbstractC1076004Is) ViewDataBinding.LIZIZ(R.layout.awz, view);
        final boolean zLIZ = C1074804Ig.LIZ();
        ?? r1 = new InterfaceC1075904Ir(zLIZ) { // from class: X.04Im
            public final boolean LIZ;

            @Override // X.InterfaceC1075904Ir
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1075904Ir
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1075904Ir
            public final void LJJIII() {
            }

            @Override // X.InterfaceC1075904Ir
            public final Integer LIZ() {
                return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 0 : 8))));
            }

            @Override // X.InterfaceC1075904Ir
            public final int LIZIZ() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }

            @Override // X.InterfaceC1075904Ir
            public final Integer LIZJ() {
                return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 6 : 0))));
            }

            @Override // X.InterfaceC1075904Ir
            public final int LJII() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }

            @Override // X.InterfaceC1075904Ir
            public final int LJIILIIL() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 24 : 22)));
            }

            @Override // X.InterfaceC1075904Ir
            public final int LJIILJJIL() {
                return this.LIZ ? 71 : 61;
            }

            @Override // X.InterfaceC1075904Ir
            public final int LJIJI() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 24 : 22)));
            }

            @Override // X.InterfaceC1075904Ir
            public final Integer LJJIFFI() {
                return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }

            {
                this.LIZ = zLIZ;
            }
        };
        this.LLJJL = r1;
        abstractC1076004Is.LJIILLIIL(r1);
        if (C1074804Ig.LIZ()) {
            abstractC1076004Is.LJFF();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder.rr(java.lang.Object):void");
    }
}
