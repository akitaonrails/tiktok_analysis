package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C1636320sgQ;
import X.C1636520sgk;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625970sPj;
import X.InterfaceC1631100sY0;
import X.InterfaceC1631540sYi;
import X.InterfaceC1635560sfC;
import X.InterfaceC1636390sgX;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class OriginalFragment extends StickerCategoryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiPyY2P2HELIOSslJzs2OistJWEjKSIpO2EjKSIpOmEcOiwrICEyJAM+KCg+LSs4";
    public InterfaceC1631100sY0 LLJJJJLIIL;
    public Effect LLJJL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final String SR() {
        return "original";
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final InterfaceC1631540sYi<Effect> rS() {
        InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
        InterfaceC1625410sOp interfaceC1625410sOp = PR().LIZIZ;
        InterfaceC1635560sfC interfaceC1635560sfCUR = UR();
        InterfaceC1631100sY0 interfaceC1631100sY0 = this.LLJJJJLIIL;
        if (interfaceC1631100sY0 == null) {
            interfaceC1631100sY0 = null;
        }
        Effect effect = this.LLJJL;
        if (effect == null) {
            effect = null;
        }
        return new OriginalStickerViewModel(this, interfaceC1624480sNKRR, interfaceC1625410sOp, interfaceC1635560sfCUR, interfaceC1631100sY0, effect, PR().LJI);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final C1636320sgQ sS() {
        final InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
        final InterfaceC1635560sfC interfaceC1635560sfCUR = UR();
        final InterfaceC1631540sYi<Effect> interfaceC1631540sYiIS = iS();
        final C1636520sgk c1636520sgk = PR().LJFF;
        final InterfaceC1625970sPj interfaceC1625970sPj = OR().LIZLLL;
        final InterfaceC1636390sgX interfaceC1636390sgX = OR().LIZIZ;
        final AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 313);
        return new C1636320sgQ(interfaceC1624480sNKRR, interfaceC1635560sfCUR, interfaceC1631540sYiIS, c1636520sgk, interfaceC1625970sPj, interfaceC1636390sgX, awS604S0100000_25) { // from class: X.0sgR
            public final Function1<C1636260sgK<Effect>, Unit> LLJJJ;

            @Override // X.C1636320sgQ, X.AbstractC1636650sgx
            public final void LLLJ(C1636690sh1 c1636690sh1) {
                super.LLLJ(c1636690sh1);
            }

            @Override // X.C1636320sgQ
            /* JADX INFO: renamed from: LLLL */
            public final void onViewAttachedToWindow(C1636260sgK<Effect> c1636260sgK) {
                super.onViewAttachedToWindow(c1636260sgK);
                this.LLJJJ.invoke(c1636260sgK);
            }

            @Override // X.C1636320sgQ
            public final void LLLLIIIILLL(C1636690sh1 c1636690sh1) {
                c1636690sh1.LIZ(AFwS229S0000000_2.get$arr$(874), new AwS604S0100000_25(this, 855));
            }

            @Override // X.C1636320sgQ, X.AbstractC21673619ry
            public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                onViewAttachedToWindow((C1636260sgK) viewHolder);
            }

            {
                C1631250sYF c1631250sYF = new C1631250sYF(null, null, null, null, 1023);
                this.LLJJJ = awS604S0100000_25;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void ZR() {
        iS().XH2("mCategoryKey");
    }
}
