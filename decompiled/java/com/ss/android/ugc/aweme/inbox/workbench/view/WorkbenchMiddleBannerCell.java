package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C01GW;
import X.C1196320hEk;
import X.C1876807Ws;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.workbench.scope.WorkbenchCardCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkbenchMiddleBannerCell extends PowerCell<C1876807Ws> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(203));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 848));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{WorkbenchCardCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f870aa3;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WorkbenchCardCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 58), this.itemView);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r6) {
        /*
            r5 = this;
            X.07Ws r6 = (X.C1876807Ws) r6
            super.onBindItemView(r6)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BannerImageStruct r0 = r6.LL
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.imageUrl
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r0)
            X.0kl3 r4 = X.C1331660kl2.LJIIIIZZ(r0)
            android.view.View r1 = r5.itemView
            r0 = 2131400739(0x7f0a9823, float:1.842234E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.LJJI(r0)
            X.0klB r2 = new X.0klB
            r2.<init>()
            r3 = 0
            r2.LIZ = r3
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r2.LJ = r0
            X.0kl9 r0 = r2.LIZ()
            r4.LJJI = r0
            X.0P43 r1 = new X.0P43
            r0 = 1
            r1.<init>(r5, r0)
            r4.LJIIJ(r1)
            android.view.View r1 = r5.itemView
            r0 = 2131400745(0x7f0a9829, float:1.8422352E38)
            android.view.View r1 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L56
            com.ss.android.ugc.aweme.notice.repo.list.bean.BannerImageStruct r0 = r6.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct r0 = r0.maskingText
            X.C635240Ovq.LIZIZ(r1, r0)
        L56:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BannerImageStruct r0 = r6.LL
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct> r0 = r0.textList
            r2 = 2131400743(0x7f0a9827, float:1.8422348E38)
            if (r0 == 0) goto L78
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r3, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct) r1
            if (r1 == 0) goto L78
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            if (r0 == 0) goto L78
            X.C635240Ovq.LIZIZ(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L83
        L78:
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L83
            X.C0DTR.LIZIZ(r0)
        L83:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BannerImageStruct r0 = r6.LL
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct> r1 = r0.textList
            r2 = 2131400744(0x7f0a9828, float:1.842235E38)
            if (r1 == 0) goto La6
            r0 = 1
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct) r1
            if (r1 == 0) goto La6
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            if (r0 == 0) goto La6
            X.C635240Ovq.LIZIZ(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto Lb1
        La6:
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto Lb1
            X.C0DTR.LIZIZ(r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerCell.onBindItemView(X.0zJl):void");
    }
}
