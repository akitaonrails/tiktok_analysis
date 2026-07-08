package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight;

import X.C01GW;
import X.C038B;
import X.C1744700vVE;
import X.C452501pT;
import X.C954703oH;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SpotlightVH extends AbsFullSpanVH<SpotlightVO> {
    public C038B LLJJIJIL;
    public SmartImageView LLJJJ;
    public final C01GW LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C038B c6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uod) : null;
            this.LLJJIJIL = (C038B) viewFindViewById;
        }
        return (C038B) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer d6(java.lang.String r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto La
            int r0 = r3.length()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L25
            char r0 = r3.charAt(r1)     // Catch: java.lang.Exception -> L2e
            r1 = 35
            if (r0 == r1) goto L25
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L2e
            r0.append(r1)     // Catch: java.lang.Exception -> L2e
            r0.append(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Exception -> L2e
        L25:
            int r0 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L2e
            return r0
        L2e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "SpotlightVH processColor error"
            X.C1AF0.LJFF(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVH.d6(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpotlightVH(View view, ViewGroup viewGroup) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.ay8, viewGroup, false);
        }
        super(view);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1708));
    }

    public final void e6(TuxTextView tuxTextView, CommonColor commonColor) {
        String color;
        if (commonColor == null) {
            return;
        }
        if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
            color = commonColor.getDarkColor();
        } else {
            color = commonColor.getColor();
        }
        Integer numD6 = d6(color);
        if (numD6 != null) {
            tuxTextView.setTextColor(numD6.intValue());
        }
    }
}
