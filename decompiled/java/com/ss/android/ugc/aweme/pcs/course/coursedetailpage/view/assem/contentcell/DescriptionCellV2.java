package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C16F5;
import X.C1723706p1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DescriptionCellV2 extends PowerCell<C1723706p1> {
    public View LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[PHI: r3
      0x0016: PHI (r3v1 android.view.View) = (r3v0 android.view.View), (r3v2 android.view.View) binds: [B:3:0x0009, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r5) {
        /*
            r4 = this;
            X.06p1 r5 = (X.C1723706p1) r5
            super.onBindItemView(r5)
            android.view.View r1 = r4.itemView
            android.view.View r3 = r4.LL
            if (r3 != 0) goto L16
            r0 = 2131368949(0x7f0a1bf5, float:1.8357862E38)
            android.view.View r3 = r1.findViewById(r0)
            r4.LL = r3
            if (r3 == 0) goto L46
        L16:
            X.0F3z r2 = new X.0F3z
            r2.<init>()
            X.0qL5 r1 = X.C1546210qL5.LIZ
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.getClass()
            float r0 = X.C1546210qL5.LIZ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LIZJ = r0
            r0 = 2131107333(0x7f061e05, float:1.7827242E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LIZIZ = r0
            android.view.View r0 = r4.itemView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = r2.LIZ(r0)
            r3.setBackground(r0)
        L46:
            android.view.View r2 = r4.itemView
            X.16F5 r1 = r4.LLILLJJLI
            if (r1 != 0) goto L58
            r0 = 2131368952(0x7f0a1bf8, float:1.8357869E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = r1
            X.16F5 r0 = (X.C16F5) r0
            r4.LLILLJJLI = r0
        L58:
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L61
            java.lang.String r0 = r5.LL
            r1.setText(r0)
        L61:
            java.lang.String r0 = r5.LLILLJJLI
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            r2 = 2131368940(0x7f0a1bec, float:1.8357844E38)
            if (r0 == 0) goto L87
            android.view.View r0 = r4.itemView
            X.16F5 r1 = r4.LLILLL
            if (r1 != 0) goto L7d
            android.view.View r1 = r0.findViewById(r2)
            r0 = r1
            X.16F5 r0 = (X.C16F5) r0
            r4.LLILLL = r0
        L7d:
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L86
            java.lang.String r0 = r5.LLILLJJLI
            r1.setText(r0)
        L86:
            return
        L87:
            android.view.View r0 = r4.itemView
            X.16F5 r1 = r4.LLILLL
            if (r1 != 0) goto L98
            android.view.View r1 = r0.findViewById(r2)
            r0 = r1
            X.16F5 r0 = (X.C16F5) r0
            r4.LLILLL = r0
            if (r1 == 0) goto L86
        L98:
            X.C500260Jjc.LJIILIIL(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.DescriptionCellV2.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dc3, false, 4, null);
    }
}
