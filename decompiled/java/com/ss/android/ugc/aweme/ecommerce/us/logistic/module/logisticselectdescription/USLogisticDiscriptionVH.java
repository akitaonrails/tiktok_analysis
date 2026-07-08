package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectdescription;

import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C7949038p;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class USLogisticDiscriptionVH extends ECJediViewHolder<C7949038p> {
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USLogisticDiscriptionVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1h, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 90));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v1 android.view.View) = (r2v0 android.view.View), (r2v5 android.view.View) binds: [B:3:0x0008, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r7) {
        /*
            r6 = this;
            X.038p r7 = (X.C7949038p) r7
            android.widget.LinearLayout r2 = r6.LLJILJIL
            r1 = 2131369771(0x7f0a1f2b, float:1.835953E38)
            r5 = 0
            if (r2 != 0) goto L1b
            android.view.View r0 = r6.LJJIJL()
            if (r0 == 0) goto L90
            android.view.View r2 = r0.findViewById(r1)
        L14:
            r0 = r2
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.LLJILJIL = r0
            if (r2 == 0) goto L1e
        L1b:
            X.C03DZ.LIZJ(r2)
        L1e:
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r0 = r7.LIZIZ
            r4 = 2131369739(0x7f0a1f0b, float:1.8359465E38)
            if (r0 == 0) goto L54
            android.view.View r2 = r6.itemView
            Y.ARunnableS70S0200000_1 r1 = new Y.ARunnableS70S0200000_1
            r0 = 0
            r1.<init>(r7, r6, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            com.bytedance.tux.input.TuxTextView r3 = r6.LLJILJILJ
            if (r3 != 0) goto L44
            android.view.View r0 = r6.LJJIJL()
            if (r0 == 0) goto L3e
            android.view.View r5 = r0.findViewById(r4)
        L3e:
            r0 = r5
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r6.LLJILJILJ = r0
            r3 = r5
        L44:
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r2 = r7.LIZIZ
            kotlin.jvm.internal.AwS650S0100000_1 r1 = new kotlin.jvm.internal.AwS650S0100000_1
            r0 = 0
            r1.<init>(r6, r0)
            java.lang.String r0 = "logisticsDescriptions"
            X.C03C8.LIZJ(r3, r2, r0, r1)
        L53:
            return
        L54:
            java.lang.String r0 = r7.LIZ
            if (r0 == 0) goto L76
            com.bytedance.tux.input.TuxTextView r1 = r6.LLJILJILJ
            if (r1 != 0) goto L6c
            android.view.View r0 = r6.LJJIJL()
            if (r0 == 0) goto L66
            android.view.View r5 = r0.findViewById(r4)
        L66:
            r0 = r5
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r6.LLJILJILJ = r0
            r1 = r5
        L6c:
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L53
            java.lang.String r0 = r7.LIZ
            r1.setText(r0)
            return
        L76:
            android.widget.LinearLayout r0 = r6.LLJILJIL
            if (r0 != 0) goto L8c
            android.view.View r0 = r6.LJJIJL()
            if (r0 == 0) goto L84
            android.view.View r5 = r0.findViewById(r1)
        L84:
            r0 = r5
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.LLJILJIL = r0
            r0 = r5
            if (r5 == 0) goto L53
        L8c:
            X.C03DZ.LIZ(r0)
            return
        L90:
            r2 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectdescription.USLogisticDiscriptionVH.rr(java.lang.Object):void");
    }
}
