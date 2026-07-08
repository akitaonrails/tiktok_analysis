package com.ss.android.ugc.aweme.tako.botpage.components.shortcut;

import X.C1857690yRT;
import X.C418440Gaw;
import X.InterfaceC1587906Jp;
import X.InterfaceC1845490y7n;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoShortcutImageAssem extends ReusedUISlotAssem<TakoShortcutImageAssem> implements InterfaceC712990Rxx<InterfaceC1845490y7n> {
    public SmartImageView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flr;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.xci);
        this.LLJJLIIIJLLLLLLLZ = smartImageView;
        if (smartImageView != null) {
            C1857690yRT.LJIILJJIL(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(8)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC1845490y7n r7) {
        /*
            r6 = this;
            X.0y7n r7 = (X.InterfaceC1845490y7n) r7
            com.bytedance.lighten.loader.SmartImageView r4 = r6.LLJJLIIIJLLLLLLLZ
            if (r4 == 0) goto L4c
            java.util.List r2 = r7.LLJJJJLIIL()
            if (r2 == 0) goto L4c
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            if (r0 == 0) goto L78
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L78
        L19:
            r5 = 0
            if (r0 == 0) goto L4f
            java.util.Iterator r3 = r2.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage) r0
            java.lang.String r1 = r0.imageId
            java.lang.String r0 = "dark"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L20
        L37:
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r2 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage) r2
            if (r2 == 0) goto L4c
            X.03IT r1 = new X.03IT
            java.util.List<java.lang.String> r0 = r2.urlList
            r1.<init>(r0)
        L42:
            X.0kl3 r0 = X.C1331660kl2.LJIIJ(r1)
            r0.LJJ(r4)
            X.C786410Ut5.h3(r0)
        L4c:
            return
        L4d:
            r2 = r5
            goto L37
        L4f:
            java.util.Iterator r3 = r2.iterator()
        L53:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage) r0
            java.lang.String r1 = r0.imageId
            java.lang.String r0 = "light"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
        L6a:
            com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage r2 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage) r2
            if (r2 == 0) goto L4c
            X.03IT r1 = new X.03IT
            java.util.List<java.lang.String> r0 = r2.urlList
            r1.<init>(r0)
            goto L42
        L76:
            r2 = r5
            goto L6a
        L78:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.shortcut.TakoShortcutImageAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1845490y7n interfaceC1845490y7n) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1845490y7n interfaceC1845490y7n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
