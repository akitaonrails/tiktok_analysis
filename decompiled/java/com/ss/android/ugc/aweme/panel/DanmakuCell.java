package com.ss.android.ugc.aweme.panel;

import X.C0OBG;
import X.C1158140gFA;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C1384030m7V;
import X.C13LE;
import X.C1402240mas;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC1384020m7U;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuCell extends PowerCell<C1158140gFA> implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C1402240mas LL = new C1402240mas(this, 0);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/panel/IDanmakuItemControl;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        InterfaceC1384020m7U interfaceC1384020m7U = (InterfaceC1384020m7U) this.LL.getValue(this, LLILLJJLI[0]);
        if (interfaceC1384020m7U != null) {
            interfaceC1384020m7U.eL0(getItem());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1360500lVY c1360500lVY;
        C1158140gFA c1158140gFA = (C1158140gFA) interfaceC1891350zJl;
        super.onBindItemView(c1158140gFA);
        final TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tvw_content);
        if (tuxTextView != null) {
            CharSequence charSequence = c1158140gFA.LL.LIZIZ;
            if (charSequence != null) {
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append(charSequence);
                c1360500lVY = c1360520lVa.LIZ;
            } else {
                c1360500lVY = null;
            }
            tuxTextView.setText(c1360500lVY);
            tuxTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.06WD
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    Number numberValueOf;
                    tuxTextView.removeOnLayoutChangeListener(this);
                    View viewFindViewById = this.itemView.findViewById(R.id.kgy);
                    TuxTextView tuxTextView2 = tuxTextView;
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        if (tuxTextView2.getLineCount() > 1) {
                            numberValueOf = Double.valueOf(3.5d);
                        } else {
                            numberValueOf = 6;
                        }
                        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
                    }
                    viewFindViewById.requestLayout();
                }
            });
        }
        ((C1384030m7V) this.itemView.findViewById(R.id.kgy)).setSelected(c1158140gFA.LL.LJJI);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || C0OBG.LIZ(800L, view)) {
            return;
        }
        if (view.getId() == R.id.kgy) {
            InterfaceC1384020m7U interfaceC1384020m7U = (InterfaceC1384020m7U) this.LL.getValue(this, LLILLJJLI[0]);
            if (interfaceC1384020m7U != null) {
                interfaceC1384020m7U.bt2(getItem(), view);
                return;
            }
            return;
        }
        InterfaceC1384020m7U interfaceC1384020m7U2 = (InterfaceC1384020m7U) this.LL.getValue(this, LLILLJJLI[0]);
        if (interfaceC1384020m7U2 == null) {
            return;
        }
        interfaceC1384020m7U2.RO0(getItem(), view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bj7, viewGroup, false);
        C786410Ut5.I7(this, viewTd.findViewById(R.id.tvw_content));
        C786410Ut5.I7(this, viewTd.findViewById(R.id.kgy));
        return viewTd;
    }
}
