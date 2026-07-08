package com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer;

import X.AbstractC20607715kR;
import X.C01GW;
import X.C0P6P;
import X.C1390410mHn;
import X.C13LE;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.C20742916Ex;
import X.C20748516Hb;
import X.C21681819tI;
import X.C2217381BqS;
import X.C326820CrY;
import X.C452501pT;
import X.C627300Oj2;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class SearchListFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public C627300Oj2 LL;
    public final C20748516Hb LLILLJJLI = new C20748516Hb(this, 3);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1002));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1001));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchListFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/search/pages/result/photosearch/ui/cell/IFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 8);
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 0);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public void onBindItemView(C20605115k1 c20605115k1) {
        RecyclerView recyclerView;
        AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            N5();
            return;
        }
        if (abstractC20607715kR instanceof C20607815kS) {
            if (C326820CrY.LIZ[abstractC20607715kR.LIZ.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LLILLL.getValue()) == null) {
                return;
            }
            View view = this.itemView;
            ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
            C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 8);
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
            C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zmm), null);
            ((TextView) view.findViewById(R.id.zmm)).setText(view.getContext().getString(2131845625));
            if (this.LL == null) {
                this.LL = new C627300Oj2(recyclerView, (C0P6P) this.LLILZ.getValue());
            }
            C627300Oj2 c627300Oj2 = this.LL;
            if (c627300Oj2 == null) {
                return;
            }
            c627300Oj2.LLILLL = true;
            return;
        }
        if (!(abstractC20607715kR instanceof C20607915kT)) {
            return;
        }
        P5(abstractC20607715kR.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P5(X.EnumC323450Cm7 r7) {
        /*
            r6 = this;
            android.view.View r5 = r6.itemView
            r1 = 2131370616(0x7f0a2278, float:1.8361244E38)
            android.view.View r0 = r5.findViewById(r1)
            X.0mHn r0 = (X.C1390410mHn) r0
            r0.LIZLLL()
            android.view.View r0 = r5.findViewById(r1)
            X.0mHn r0 = (X.C1390410mHn) r0
            r4 = 8
            X.C786410Ut5.LLLZZIL(r0, r4)
            X.16Hb r1 = r6.LLILLJJLI
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell.LLILZIL
            r3 = 0
            r0 = r0[r3]
            java.lang.Object r0 = r1.getValue(r6, r0)
            X.15lm r0 = (X.InterfaceC20616015lm) r0
            if (r0 == 0) goto L3e
            boolean r1 = r0.px2()
            r0 = 1
            if (r1 != r0) goto L3e
        L2f:
            r2 = 2131397050(0x7f0a89ba, float:1.8414858E38)
            if (r0 == 0) goto L40
            android.view.View r0 = r5.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            X.C786410Ut5.LLLLZLL(r0, r4)
            return
        L3e:
            r0 = 0
            goto L2f
        L40:
            android.view.View r0 = r5.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            X.C786410Ut5.LLLLZLL(r0, r3)
            android.view.View r1 = r5.findViewById(r2)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 0
            X.C786410Ut5.h9(r1, r0)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r5.getContext()
            r0 = 2131836755(0x7f113f53, float:1.9306686E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell.P5(X.0Cm7):void");
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C20742916Ex.LIZ(viewGroup.getContext(), R.layout.f1y, viewGroup, false, -1);
    }
}
