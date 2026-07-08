package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipfrom;

import X.C786410Ut5;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class USShipFromVH extends ECJediViewHolder<DispatchFrom> {
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USShipFromVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1i, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r1
      0x0034: PHI (r1v3 android.view.View) = (r1v2 android.view.View), (r1v7 android.view.View) binds: [B:11:0x0020, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[PHI: r2
      0x004f: PHI (r2v1 android.view.View) = (r2v0 android.view.View), (r2v3 android.view.View) binds: [B:19:0x003c, B:24:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom r6 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom) r6
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.LLJILJIL
            r4 = 0
            if (r1 != 0) goto L17
            android.view.View r1 = r5.itemView
            if (r1 == 0) goto L72
            r0 = 2131390893(0x7f0a71ad, float:1.840237E38)
            android.view.View r1 = r1.findViewById(r0)
        L12:
            r0 = r1
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r5.LLJILJIL = r0
        L17:
            X.C03DZ.LIZJ(r1)
            java.lang.String r3 = r6.text
            if (r3 == 0) goto L6d
            com.bytedance.tux.input.TuxTextView r1 = r5.LLJILJILJ
            if (r1 != 0) goto L34
            android.view.View r1 = r5.itemView
            if (r1 == 0) goto L70
            r0 = 2131390901(0x7f0a71b5, float:1.8402386E38)
            android.view.View r1 = r1.findViewById(r0)
        L2d:
            r0 = r1
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r5.LLJILJILJ = r0
            if (r1 == 0) goto L37
        L34:
            X.C03DZ.LIZJ(r1)
        L37:
            com.bytedance.tux.input.TuxTextView r2 = r5.LLJILLL
            r1 = 2131390900(0x7f0a71b4, float:1.8402384E38)
            if (r2 != 0) goto L4f
            android.view.View r0 = r5.LJJIJL()
            if (r0 == 0) goto L6e
            android.view.View r2 = r0.findViewById(r1)
        L48:
            r0 = r2
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r5.LLJILLL = r0
            if (r2 == 0) goto L52
        L4f:
            X.C03DZ.LIZJ(r2)
        L52:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJILLL
            if (r0 != 0) goto L66
            android.view.View r0 = r5.LJJIJL()
            if (r0 == 0) goto L60
            android.view.View r4 = r0.findViewById(r1)
        L60:
            r0 = r4
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r5.LLJILLL = r0
            r0 = r4
        L66:
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L6d
            r0.setText(r3)
        L6d:
            return
        L6e:
            r2 = r4
            goto L48
        L70:
            r1 = r4
            goto L2d
        L72:
            r1 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipfrom.USShipFromVH.rr(java.lang.Object):void");
    }
}
