package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.C16F5;
import X.C1838060xvo;
import X.C430210Gtv;
import X.C497740JfY;
import X.C786410Ut5;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class DescriptionCell extends PowerCell<C1838060xvo> {
    public LinearLayout LL;
    public C16F5 LLILLJJLI;
    public View LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public LinearLayout LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C430210Gtv LLJ;
    public View LLJI;
    public boolean LLJIJIL;

    public final C16F5 I5() {
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.ev3);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final void L5(final String str) {
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        String strLJIJI = C497740JfY.LJIJI(2131834551);
        final C16F5 c16f5I5 = I5();
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.ev6);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        final C16F5 c16f5 = (C16F5) callbackFindViewById;
        if (c16f5I5 != null) {
            c16f5I5.setText(str);
        }
        if (c16f5 != null) {
            c16f5.setText(strLJIJI);
        }
        if (c16f5I5 != null) {
            C786410Ut5.x3(c16f5I5.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0DeP
                public final /* synthetic */ int LLILLJJLI = 2;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C786410Ut5.C3(c16f5I5.getViewTreeObserver(), this);
                    if (c16f5I5.getLineCount() <= this.LLILLJJLI) {
                        C16F5 c16f52 = c16f5;
                        if (c16f52 != null) {
                            C500260Jjc.LJIILIIL(c16f52);
                            return;
                        }
                        return;
                    }
                    c16f5I5.setText(str);
                    c16f5I5.setMaxLines(this.LLILLJJLI);
                    c16f5I5.setEllipsize(TextUtils.TruncateAt.END);
                    C16F5 c16f53 = c16f5;
                    if (c16f53 != null) {
                        C500260Jjc.LLFFF(c16f53);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0132 A[PHI: r3
      0x0132: PHI (r3v8 android.view.View) = (r3v7 android.view.View), (r3v25 android.view.View) binds: [B:50:0x0128, B:52:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143 A[PHI: r4
      0x0143: PHI (r4v15 android.view.View) = (r4v14 android.view.View), (r4v21 android.view.View) binds: [B:55:0x0139, B:57:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c A[PHI: r4
      0x015c: PHI (r4v17 android.view.View) = (r4v16 android.view.View), (r4v20 android.view.View) binds: [B:63:0x0152, B:65:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b A[PHI: r5
      0x017b: PHI (r5v6 android.view.View) = (r5v5 android.view.View), (r5v7 android.view.View) binds: [B:68:0x016e, B:70:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r20) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.DescriptionCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dc2, false, 4, null);
    }
}
