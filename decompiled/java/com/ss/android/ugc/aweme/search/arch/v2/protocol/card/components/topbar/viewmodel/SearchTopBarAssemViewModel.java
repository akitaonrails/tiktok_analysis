package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel;

import X.C0PGR;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS9S0002000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTopBarAssemViewModel extends AssemViewModel<C0PGR> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0PGR(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct r8) {
        /*
            r7 = this;
            r5 = 0
            r6 = 1
            if (r8 == 0) goto L3f
            java.lang.Integer r1 = r8.topBarType
            if (r1 == 0) goto L3f
            X.002o r0 = r7.getState()
            X.0PGR r0 = (X.C0PGR) r0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct r0 = r0.LLILLL
            if (r0 == 0) goto L3d
            java.lang.Integer r0 = r0.topBarType
        L14:
            boolean r0 = r1.equals(r0)
            if (r0 != r6) goto L3f
            java.lang.String r1 = r8.topBarId
            if (r1 == 0) goto L3f
            X.002o r0 = r7.getState()
            X.0PGR r0 = (X.C0PGR) r0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct r0 = r0.LLILLL
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.topBarId
        L2a:
            boolean r0 = r1.equals(r0)
            if (r0 != r6) goto L3f
        L30:
            kotlin.jvm.internal.AwS589S0100000_10 r1 = new kotlin.jvm.internal.AwS589S0100000_10
            r0 = 137(0x89, float:1.92E-43)
            r1.<init>(r8, r0)
            r7.setStateImmediate(r1)
            return
        L3b:
            r0 = r5
            goto L2a
        L3d:
            r0 = r5
            goto L14
        L3f:
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r4 = X.C0Q3E.LJI()
            X.0PBw r3 = new X.0PBw
            if (r8 == 0) goto L74
            java.lang.Integer r2 = r8.topBarType
            java.lang.String r5 = r8.topBarId
        L4b:
            X.0PCY r0 = r4.Ph1()
            X.0sD9 r0 = r0.LIZJ()
            X.0PRC r0 = (X.C0PRC) r0
            java.lang.String r1 = r0.LLIZLLLIL
            if (r8 == 0) goto L72
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay r0 = r8.topBarDisplay
            if (r0 == 0) goto L72
            java.lang.Integer r0 = r0.fixedHeight
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            if (r0 <= 0) goto L72
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.<init>(r2, r5, r1, r0)
            r4.fe(r3)
            goto L30
        L72:
            r6 = 0
            goto L67
        L74:
            r2 = r5
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel.vQ2(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct):void");
    }

    public final void wQ2(int i, int i2) {
        setStateImmediate(new AwS9S0002000_10(i, i2, 0));
    }
}
