package com.ss.android.ugc.aweme.cell;

import X.AbstractC2211791BhR;
import X.C11G4;
import X.C127M;
import X.C20694015yM;
import X.C2211751BhN;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExposeCell extends TuxCell<C20694015yM, C11G4> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR() { // from class: X.15yN
            public final AwS575S0100000_31 LJ;
            public Function0<String> LJFF;
            public final boolean LJI = true;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC2211791BhR
            public final Map<String, String> LJII() {
                Map<String, String> map;
                String str;
                C20694015yM c20694015yM = (C20694015yM) this.LJII.getItem();
                String str2 = c20694015yM != null ? c20694015yM.LLJLL : null;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                Pair pair = new Pair("enter_from", str2);
                C20694015yM c20694015yM2 = (C20694015yM) this.LJII.getItem();
                if (c20694015yM2 != null && (str = c20694015yM2.LLJLLIL) != null) {
                    str3 = str;
                }
                Pair pair2 = new Pair("action_type", str3);
                C20694015yM c20694015yM3 = (C20694015yM) this.LJII.getItem();
                return (c20694015yM3 == null || (map = c20694015yM3.LLJLILLLLZIIL) == null) ? C2097608Jq.LJI(pair, pair2) : map;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJI;
            }

            {
                this.LJ = new AwS575S0100000_31(this.LJII, 326);
                this.LJFF = new AwS575S0100000_31(this.LJII, 327);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        C11G4 c11g4 = new C11G4(context, null);
        c11g4.LJIILL(new ACListenerS165S0100000_31(this, 205));
        return c11g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C20694015yM r5) {
        /*
            r4 = this;
            super.onBindItemView(r5)
            android.view.View r2 = r5.LLJJJJLIIL
            r3 = 0
            if (r2 == 0) goto L24
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L17
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L17
            X.C786410Ut5.LJJJLZIJ(r2, r1)
        L17:
            S extends X.127M r0 = r4.LL
            X.11G4 r0 = (X.C11G4) r0
            if (r0 == 0) goto L24
            r0.LJIILIIL(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L41
        L24:
            S extends X.127M r1 = r4.LL
            X.11G4 r1 = (X.C11G4) r1
            if (r1 == 0) goto L2f
            java.lang.String r0 = r5.LLJJL
            r1.LJIILJJIL(r0)
        L2f:
            S extends X.127M r2 = r4.LL
            r1 = r2
            X.11G4 r1 = (X.C11G4) r1
            if (r1 == 0) goto L3a
            java.lang.CharSequence r0 = r5.LLLIIII
            r1.LJFF = r0
        L3a:
            X.11G4 r2 = (X.C11G4) r2
            if (r2 == 0) goto L41
            r2.LJIILIIL(r3)
        L41:
            S extends X.127M r1 = r4.LL
            X.11G4 r1 = (X.C11G4) r1
            if (r1 == 0) goto L4c
            boolean r0 = r5.LLJJLIIIJLLLLLLLZ
            r1.LJIILLIIL(r0)
        L4c:
            android.view.View r0 = r4.itemView
            r2 = 2131366889(0x7f0a13e9, float:1.8353684E38)
            android.view.View r1 = r0.findViewById(r2)
            X.127K r1 = (X.C127K) r1
            boolean r0 = r5.LLJL
            r1.setShowAlertBadge(r0)
            android.graphics.drawable.Drawable r1 = r5.LLJLLL
            if (r1 == 0) goto L69
            android.view.View r0 = r4.itemView
            android.view.View r0 = r0.findViewById(r2)
            r0.setBackground(r1)
        L69:
            java.lang.Object r0 = r5.LLJJJJ
            if (r0 == 0) goto L78
            android.view.View r0 = r4.itemView
            android.view.View r1 = r0.findViewById(r2)
            java.lang.Object r0 = r5.LLJJJJ
            r1.setTag(r0)
        L78:
            java.lang.String r3 = r5.LLLII
            if (r3 == 0) goto L8d
            android.view.View r0 = r4.itemView
            android.view.View r2 = r0.findViewById(r2)
            X.127K r2 = (X.C127K) r2
            kotlin.jvm.internal.AwS81S1000000_31 r1 = new kotlin.jvm.internal.AwS81S1000000_31
            r0 = 7
            r1.<init>(r3, r0)
            r2.setIcon(r1)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cell.ExposeCell.onBindItemView(X.15yM):void");
    }
}
