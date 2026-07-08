package com.ss.android.ugc.aweme.topic.book.recommend;

import X.AbstractC2211791BhR;
import X.C0O4K;
import X.C0O4L;
import X.C0OAT;
import X.C2211751BhN;
import X.C627170Oip;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BookRecommendSearchCell extends PowerCell<C0OAT> {
    public C627170Oip LL;
    public TopicRecommendListVM LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C0O4L.LIZJ(C0O4K.BOOK, this.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0Oil
            public Function0<String> LJ;
            public final float LJFF = 0.001f;
            public final C638890P4d LJI;

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS553S0100000_9(this, 1542);
                this.LJI = new C638890P4d(this, 3);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0O4M, X.0Oip] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r12) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fw3, viewGroup, false);
    }
}
