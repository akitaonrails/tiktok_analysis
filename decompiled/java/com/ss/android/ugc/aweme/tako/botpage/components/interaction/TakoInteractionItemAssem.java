package com.ss.android.ugc.aweme.tako.botpage.components.interaction;

import X.C1858280ySQ;
import X.C1919007fQ;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInteractionItemAssem extends ReusedUISlotAssem<TakoInteractionItemAssem> implements InterfaceC712990Rxx<C1858280ySQ> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxSpinner LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flc;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        int iLIZIZ2;
        View viewFindViewById = view.findViewById(R.id.kvr);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        layoutParams.width = iLIZIZ;
        if (C1919007fQ.LIZIZ()) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        layoutParams.height = iLIZIZ2;
        C786410Ut5.W5(viewFindViewById, layoutParams);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.kvq);
        this.LLJL = (TuxSpinner) view.findViewById(R.id.kvu);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1858280ySQ r4) {
        /*
            r3 = this;
            X.0ySQ r4 = (X.C1858280ySQ) r4
            X.12Ez r0 = r4.LLILLJJLI
            if (r0 == 0) goto L11
            X.0GdJ r1 = r0.LJ
            if (r1 == 0) goto L11
            com.bytedance.tux.icon.TuxIconView r0 = r3.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L11
            r0.setTuxIcon(r1)
        L11:
            X.12Ez r0 = r4.LLILLJJLI
            r2 = 0
            if (r0 == 0) goto L4b
            boolean r1 = r0.LJIIIZ
            r0 = 1
            if (r1 != r0) goto L4b
        L1b:
            r1 = 8
            if (r0 == 0) goto L3c
            com.bytedance.tux.icon.TuxIconView r0 = r3.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L26
            X.C786410Ut5.LLLLLLZZ(r0, r1)
        L26:
            com.bytedance.tux.status.loading.TuxSpinner r0 = r3.LLJL
            if (r0 == 0) goto L2d
            X.C786410Ut5.LLZILL(r0, r2)
        L2d:
            android.view.View r2 = r3.LJJIJL()
            Y.ACListenerS161S0100000_27 r1 = new Y.ACListenerS161S0100000_27
            r0 = 174(0xae, float:2.44E-43)
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
            return
        L3c:
            com.bytedance.tux.icon.TuxIconView r0 = r3.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L43
            X.C786410Ut5.LLLLLLZZ(r0, r2)
        L43:
            com.bytedance.tux.status.loading.TuxSpinner r0 = r3.LLJL
            if (r0 == 0) goto L2d
            X.C786410Ut5.LLZILL(r0, r1)
            goto L2d
        L4b:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoInteractionItemAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858280ySQ c1858280ySQ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858280ySQ c1858280ySQ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
