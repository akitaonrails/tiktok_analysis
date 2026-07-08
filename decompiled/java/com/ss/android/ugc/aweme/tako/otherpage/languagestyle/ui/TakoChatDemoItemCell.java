package com.ss.android.ugc.aweme.tako.otherpage.languagestyle.ui;

import X.C14J2;
import X.C1857690yRT;
import X.C1875907Wj;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoChatDemoItemCell extends PowerCell<C1875907Wj> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1875907Wj c1875907Wj = (C1875907Wj) interfaceC1891350zJl;
        C14J2 c14j2 = (C14J2) this.itemView.findViewById(R.id.dp4);
        if (c1875907Wj.LLILLJJLI) {
            c14j2.setHasRightTail(true);
            c14j2.setBackgroundDrawColor(C1857690yRT.LJIIJ(R.attr.a0d));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14j2);
            c14j2.setLayoutParams(layoutParams);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C426750GoL.LJIIIZ(c14j2, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(iLIZIZ2), 0, false, 16);
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C426750GoL.LJIIL(c14j2, Integer.valueOf(iLIZIZ3), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(iLIZIZ4), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        } else {
            c14j2.setHasLeftTail(true);
            c14j2.setBackgroundDrawColor(C1857690yRT.LJIIJ(R.attr.a1b));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388611;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14j2);
            c14j2.setLayoutParams(layoutParams2);
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C426750GoL.LJIIIZ(c14j2, Integer.valueOf(iLIZIZ5), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ6), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), false, 16);
            int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C426750GoL.LJIIL(c14j2, Integer.valueOf(iLIZIZ7), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(iLIZIZ8), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.dp5);
        tuxTextView.setText(c1875907Wj.LL);
        tuxTextView.setTuxFont(111);
        if (c1875907Wj.LLILLJJLI) {
            i = R.attr.a0r;
        } else {
            i = R.attr.a1h;
        }
        tuxTextView.setTextColor(C1857690yRT.LJIIJ(i));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fmq, false, 4, null);
    }
}
