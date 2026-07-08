package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C1573890r3j;
import X.C1612900s4e;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.text.u;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPanelSquareItemCell extends PowerCell<C1612900s4e> {
    public View LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 740));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 741));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = this.itemView.findViewById(R.id.us2);
        this.LLILLJJLI = this.itemView.findViewById(R.id.us5);
        int iId = EnumC1578890rBn.ICON_UNLOCK.id();
        if (iId != R.drawable.d5w) {
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            if (miniDramaHostServiceLIZ != null) {
                miniDramaHostServiceLIZ.LIZ();
            }
            ((TuxIconView) this.itemView.findViewById(R.id.us6)).setIconRes(iId);
        }
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.us4);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.us3);
        this.LLILZ = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_VERTICAL_BARS.id());
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0s4b
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1165700gRM
            public final void LIZ(View view) {
                C1612900s4e item;
                String curUserId;
                String str;
                C1612860s4a c1612860s4a;
                boolean z;
                if (view != null && (item = this.LLILZ.getItem()) != null) {
                    MiniDramaPlayListService.LIZ.getClass();
                    MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
                    if (miniDramaPlayListServiceLIZ != null) {
                        String str2 = (String) this.LLILZ.LLILZLL.getValue();
                        C1612860s4a c1612860s4a2 = (C1612860s4a) this.LLILZ.LLILZIL.getValue();
                        if (c1612860s4a2 != null) {
                            z = c1612860s4a2.LLILLL;
                        } else {
                            z = false;
                        }
                        miniDramaPlayListServiceLIZ.Xn(str2, new C1613520s5e(item.LL, item.LLILLJJLI, z));
                    }
                    C1612860s4a c1612860s4a3 = (C1612860s4a) this.LLILZ.LLILZIL.getValue();
                    if (c1612860s4a3 != null) {
                        MiniDramaAccountService.LIZ.getClass();
                        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
                        if (miniDramaAccountServiceLIZ != null) {
                            curUserId = miniDramaAccountServiceLIZ.getCurUserId();
                        } else {
                            curUserId = null;
                        }
                        boolean zLJIJI = u.LJIJI(curUserId, item.LLILLJJLI, false);
                        if (item.LL.isPaid() && !item.LL.isIntro() && !zLJIJI && !item.LL.isLimitedFree()) {
                            if (item.LL.hasPurchased || ((c1612860s4a = (C1612860s4a) this.LLILZ.LLILZIL.getValue()) != null && c1612860s4a.LLILLL)) {
                                str = "paid_episode";
                            } else {
                                str = "locked_episode";
                            }
                        } else {
                            str = "free_episode";
                        }
                        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                        long j = c1612860s4a3.LLILZLL;
                        String str3 = c1612860s4a3.LLJIJIL;
                        String str4 = c1612860s4a3.LLILZIL;
                        boolean z2 = c1612860s4a3.LLJILJIL;
                        boolean z3 = c1612860s4a3.LLJILLL;
                        boolean z4 = c1612860s4a3.LLJILJILJ;
                        c1581520rG2.LJJJIL(j, str3, str4, Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z3), c1612860s4a3.LLJJ, str, String.valueOf(item.LL.num), null, c1612860s4a3.LLJ, Boolean.valueOf(c1612860s4a3.LLJJI), Boolean.valueOf(c1612860s4a3.LLJJIII), c1612860s4a3.LLJJIJI, c1612860s4a3.LLJJIJIIJIL, c1612860s4a3.LLJJIJIL, c1612860s4a3.LLJJJ);
                    }
                }
            }
        }, this.itemView);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.C1612900s4e r7) {
        /*
            r6 = this;
            com.bytedance.tux.input.TuxTextView r1 = r6.LLILLL
            if (r1 == 0) goto Lf
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r0 = r7.LL
            int r0 = r0.num
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
        Lf:
            com.bytedance.tux.input.TuxTextView r1 = r6.LLILLL
            if (r1 == 0) goto L18
            boolean r0 = r7.LLILLL
            r1.setSelected(r0)
        L18:
            X.0rBQ r0 = com.ss.android.ugc.aweme.service.MiniDramaAccountService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaAccountService r0 = X.C1578660rBQ.LIZ()
            if (r0 == 0) goto Lb0
            java.lang.String r1 = r0.getCurUserId()
        L27:
            java.lang.String r0 = r7.LLILLJJLI
            r2 = 0
            boolean r5 = kotlin.text.u.LJIJI(r1, r0, r2)
            android.view.View r4 = r6.LL
            r3 = 1
            if (r4 == 0) goto L6a
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r0 = r7.LL
            boolean r0 = r0.isPaid()
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r1 = r7.LL
            boolean r0 = r1.hasPurchased
            if (r0 != 0) goto L65
            if (r5 != 0) goto L65
            boolean r0 = r1.isLimitedFree()
            if (r0 != 0) goto L65
            X.0r3j r0 = com.ss.android.ugc.aweme.service.MiniDramaHostService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaHostService r0 = X.C1573890r3j.LIZ()
            if (r0 == 0) goto L57
            r0.LIZ()
        L57:
            X.01GW r0 = r6.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.0s4a r0 = (X.C1612860s4a) r0
            if (r0 == 0) goto Lae
            boolean r0 = r0.LLILLL
            if (r0 != r3) goto Lae
        L65:
            r0 = 8
        L67:
            X.C786410Ut5.LJLLLLLL(r0, r4)
        L6a:
            android.view.View r1 = r6.LLILLJJLI
            if (r1 == 0) goto L96
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r0 = r7.LL
            boolean r0 = r0.isPaid()
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r0 = r7.LL
            boolean r0 = r0.isLimitedFree()
            if (r0 != 0) goto Lab
            com.ss.android.ugc.aweme.model.PaidCollectionEpisode r0 = r7.LL
            boolean r0 = r0.hasPurchased
            if (r0 != 0) goto L92
            X.01GW r0 = r6.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.0s4a r0 = (X.C1612860s4a) r0
            if (r0 == 0) goto Lab
            boolean r0 = r0.LLILLL
            if (r0 != r3) goto Lab
        L92:
            r0 = 0
        L93:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L96:
            com.bytedance.tux.icon.TuxIconView r1 = r6.LLILZ
            if (r1 == 0) goto La3
            boolean r0 = r7.LLILLL
            if (r0 != 0) goto La0
            r2 = 8
        La0:
            X.C786410Ut5.LJLLLLLL(r2, r1)
        La3:
            android.view.View r1 = r6.itemView
            boolean r0 = r7.LLILLL
            r1.setSelected(r0)
            return
        Lab:
            r0 = 8
            goto L93
        Lae:
            r0 = 0
            goto L67
        Lb0:
            r1 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell.SeriesPanelSquareItemCell.I5(X.0s4e):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C1612900s4e) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bby, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        I5((C1612900s4e) interfaceC1891350zJl);
    }
}
