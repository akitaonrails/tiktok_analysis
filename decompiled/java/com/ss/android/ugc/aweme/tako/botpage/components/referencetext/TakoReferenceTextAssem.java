package com.ss.android.ugc.aweme.tako.botpage.components.referencetext;

import X.C01GW;
import X.C0HAD;
import X.C1153090g71;
import X.C1857270yQn;
import X.C21415018rM;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoReferenceTextAssem extends ReusedUISlotAssem<TakoReferenceTextAssem> implements InterfaceC712990Rxx<C0HAD> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 743));
    public TuxIconView LLJL;
    public TuxTextView LLJLIL;
    public C21415018rM LLJLILLLLZIIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        C1153090g71.LIZ.getClass();
        return C1153090g71.LIZIZ(0, C1857270yQn.class) == 1 ? R.layout.fll : R.layout.flk;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxIconView) view.findViewById(R.id.x53);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.x52);
        this.LLJLILLLLZIIL = (C21415018rM) view.findViewById(R.id.x54);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0HAD r7) {
        /*
            r6 = this;
            X.0HAD r7 = (X.C0HAD) r7
            X.0g71 r1 = X.C1153090g71.LIZ
            java.lang.Class<X.0yQn> r0 = X.C1857270yQn.class
            r1.getClass()
            r2 = 0
            int r0 = X.C1153090g71.LIZIZ(r2, r0)
            r3 = 1
            if (r0 != r3) goto Laa
            X.01GW r0 = r6.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility r0 = (com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility) r0
            if (r0 == 0) goto L9a
            int r5 = r0.IJ0()
        L1f:
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r5 = r5 - r0
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLJL
            if (r0 == 0) goto L98
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L98
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L40:
            int r5 = r5 - r0
            X.0HcP r4 = new X.0HcP
            r4.<init>()
            java.lang.String r0 = r7.LIZ()
            r4.LJIILIIL(r0)
            r0 = 3
            r4.LJIIIZ(r0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            X.0HcQ r0 = r4.LIZIZ
            r0.LJII = r1
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L6a
            r0 = 2131100625(0x7f0603d1, float:1.7813637E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L6a
            int r2 = r0.intValue()
        L6a:
            r4.LJIILJJIL(r2)
            r0 = 51
            r4.LJII(r0)
            X.0HcQ r0 = r4.LIZIZ
            r0.LJ = r5
            r2 = 0
            r1 = 29
            r0 = 0
            android.text.Layout r1 = X.C444830HcP.LIZJ(r4, r0, r3, r2, r1)
            X.18rM r0 = r6.LLJLILLLLZIIL
            if (r0 == 0) goto L85
            r0.setTextLayout(r1)
        L85:
            com.bytedance.tux.icon.TuxIconView r1 = r6.LLJL
            if (r1 == 0) goto L94
            boolean r0 = X.C426750GoL.LJFF()
            if (r0 == 0) goto L95
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L91:
            X.C786410Ut5.hc(r1, r0)
        L94:
            return
        L95:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L91
        L98:
            r0 = 0
            goto L40
        L9a:
            r0 = 288(0x120, float:4.04E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r5 = X.C814420VxA.LIZIZ(r0)
            goto L1f
        Laa:
            com.bytedance.tux.input.TuxTextView r1 = r6.LLJLIL
            if (r1 == 0) goto L85
            java.lang.String r0 = r7.LIZ()
            r1.setText(r0)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.referencetext.TakoReferenceTextAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0HAD c0had) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0HAD c0had) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
