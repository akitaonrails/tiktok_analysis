package com.ss.android.ugc.aweme.toptab.ui;

import X.AbstractC20607715kR;
import X.C1390410mHn;
import X.C20605115k1;
import X.C20606915kJ;
import X.C21681819tI;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.page.PowerPageState;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveDualFeedFooterCell extends PowerLoadingCell {
    public static int LL;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 8);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zmm), null);
        ((TextView) view.findViewById(R.id.zmm)).setText(view.getContext().getString(2131836755));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        View view = this.itemView;
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 8);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zmm), new ACListenerS153S0100000_18(this, 130));
        ((TextView) view.findViewById(R.id.zmm)).setText(view.getContext().getString(2131836754));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 8);
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 0);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        LL = 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C20606915kJ c20606915kJ;
        AbstractC20607715kR abstractC20607715kR;
        C20606915kJ c20606915kJ2;
        AbstractC20607715kR abstractC20607715kR2;
        super.onViewAttachedToWindow();
        LL++;
        C20605115k1 item = getItem();
        PowerPageState powerPageState = null;
        if (((item == null || (c20606915kJ2 = item.LLILLL) == null || (abstractC20607715kR2 = c20606915kJ2.LIZIZ) == null) ? null : abstractC20607715kR2.LIZJ) == PowerPageState.Loading) {
            N5();
            return;
        }
        if (LL == 1) {
            C20605115k1 item2 = getItem();
            if (item2 != null && (c20606915kJ = item2.LLILLL) != null && (abstractC20607715kR = c20606915kJ.LIZIZ) != null) {
                powerPageState = abstractC20607715kR.LIZJ;
            }
            if (powerPageState == PowerPageState.Error) {
                retry();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        LL--;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        super.onBindItemView(c20605115k1);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
        C786410Ut5.W5(this.itemView, layoutParams);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dj5, viewGroup, false);
    }
}
