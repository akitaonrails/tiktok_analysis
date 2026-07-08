package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C908850Zl5;
import X.C908870Zl7;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes15.dex */
public class TitleOnlyCell<T extends C908870Zl7> extends ActionBarCell<T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ce_;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(T t) {
        super.onBindItemView(t);
        C908850Zl5 c908850Zl5 = t.LLILLL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.a1z);
        if (textView != null) {
            textView.setText(c908850Zl5.LIZ);
            c908850Zl5.LIZIZ.invoke((TuxTextView) textView);
        }
    }
}
