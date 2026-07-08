package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OKH;
import X.C0OS8;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTimeStampCell extends PowerCell<C0OKH> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a6d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r5) {
        /*
            r4 = this;
            X.0OKH r5 = (X.C0OKH) r5
            super.onBindItemView(r5)
            com.bytedance.tux.input.TuxTextView r3 = r4.LL
            if (r3 != 0) goto L14
            android.view.View r1 = r4.itemView
            r0 = 2131366036(0x7f0a1094, float:1.8351954E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
        L14:
            boolean r0 = X.C296740Bk8.LIZ()
            r2 = 0
            if (r0 == 0) goto L3c
            X.0OS8 r0 = X.C0OS8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration r0 = X.C0OS8.LJII()
            java.lang.Integer r0 = r0.enableBindOptimization
            if (r0 == 0) goto L3c
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L3c
            java.lang.String r0 = r5.LLJ
        L31:
            r3.setText(r0)
            android.view.View r1 = r4.itemView
            int r0 = r5.LLIZLLLIL
            r1.setPadding(r2, r2, r2, r0)
            return
        L3c:
            long r0 = r5.LLILZLL
            java.lang.String r0 = X.C2215101Bmm.LIZLLL(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinTimeStampCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C0OS8.LJI()) {
            return super.onCreateItemView(viewGroup);
        }
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.czc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setTuxFont(71);
        frameLayout.addView(tuxTextView);
        this.LL = tuxTextView;
        return frameLayout;
    }
}
