package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OKG;
import X.C0OS8;
import X.C12ES;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinTipsCell extends PowerCell<C0OKG> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a74;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OKG c0okg = (C0OKG) interfaceC1891350zJl;
        super.onBindItemView(c0okg);
        TextView textView = this.LL;
        if (textView == null) {
            textView = (TextView) this.itemView.findViewById(R.id.d5s);
        }
        textView.setText(c0okg.LLILZLL);
        C12ES.LJIILL(0, textView);
        this.itemView.setPadding(0, 0, 0, c0okg.LLIZ);
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
        tuxTextView.setId(R.id.d5s);
        tuxTextView.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
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
