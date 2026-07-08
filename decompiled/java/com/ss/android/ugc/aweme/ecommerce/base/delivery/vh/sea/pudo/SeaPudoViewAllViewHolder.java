package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo;

import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPudoViewAllViewHolder extends ECJediViewHolder<ViewAllLocation> {
    public final C01GW LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxTextView LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SeaPudoViewAllViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.anu, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 37));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[PHI: r2
      0x0086: PHI (r2v5 android.view.View) = (r2v4 android.view.View), (r2v7 android.view.View) binds: [B:20:0x0072, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r3
      0x0019: PHI (r3v1 android.view.View) = (r3v0 android.view.View), (r3v4 android.view.View) binds: [B:3:0x0005, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation r10 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation) r10
            android.widget.FrameLayout r3 = r9.LLJILJILJ
            r4 = 0
            if (r3 != 0) goto L19
            android.view.View r1 = r9.itemView
            if (r1 == 0) goto Lb3
            r0 = 2131367729(0x7f0a1731, float:1.8355388E38)
            android.view.View r3 = r1.findViewById(r0)
        L12:
            r0 = r3
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.LLJILJILJ = r0
            if (r3 == 0) goto L51
        L19:
            X.0F3z r2 = new X.0F3z
            r2.<init>()
            android.view.View r0 = r9.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131296261(0x7f090005, float:1.8210434E38)
            float r1 = r1.getDimension(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.LJIIJ = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.LJIIJJI = r0
            r0 = 2131100619(0x7f0603cb, float:1.7813625E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZIZ = r0
            android.view.View r0 = r9.itemView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = r2.LIZ(r0)
            r3.setBackground(r0)
        L51:
            com.bytedance.tux.input.TuxTextView r2 = r9.LLJILLL
            r1 = 2131396462(0x7f0a876e, float:1.8413665E38)
            if (r2 != 0) goto L67
            android.view.View r0 = r9.LJJIJL()
            if (r0 == 0) goto Lb1
            android.view.View r2 = r0.findViewById(r1)
        L62:
            r0 = r2
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r9.LLJILLL = r0
        L67:
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L70
            java.lang.String r0 = r10.title
            r2.setText(r0)
        L70:
            com.bytedance.tux.input.TuxTextView r2 = r9.LLJILLL
            if (r2 != 0) goto L86
            android.view.View r0 = r9.LJJIJL()
            if (r0 == 0) goto L7e
            android.view.View r4 = r0.findViewById(r1)
        L7e:
            r0 = r4
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r9.LLJILLL = r0
            r2 = r4
            if (r4 == 0) goto L90
        L86:
            g1c.AjS40S0200000_1 r1 = new g1c.AjS40S0200000_1
            r0 = 9
            r1.<init>(r9, r10, r0)
            X.C786410Ut5.I7(r1, r2)
        L90:
            java.util.Set<java.lang.String> r0 = X.C03FA.LIZ
            java.lang.String r2 = "tiktokec_button_show"
            r3 = 0
            X.01GW r0 = r9.LLJILJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel) r0
            java.lang.String r1 = r0.sR2()
            java.lang.String r0 = "view_all_locations"
            java.util.Map r5 = X.C03FA.LIZIZ(r0, r1)
            java.lang.String r6 = "button_show_view_all"
            r7 = 0
            r8 = 38
            r4 = r3
            X.C03FA.LJII(r2, r3, r4, r5, r6, r7, r8)
            return
        Lb1:
            r2 = r4
            goto L62
        Lb3:
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo.SeaPudoViewAllViewHolder.rr(java.lang.Object):void");
    }
}
