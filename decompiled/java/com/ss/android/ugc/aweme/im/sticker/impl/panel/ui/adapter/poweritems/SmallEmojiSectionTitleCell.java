package com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.poweritems;

import X.C1954807lC;
import X.C424220GkG;
import X.C424230GkH;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SmallEmojiSectionTitleCell extends PowerCell<C424230GkH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        String string;
        C424230GkH c424230GkH = (C424230GkH) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            int i = C424220GkG.LIZ[c424230GkH.LL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    string = this.itemView.getContext().getString(2131832053);
                } else {
                    throw new C1954807lC();
                }
            } else {
                string = this.itemView.getContext().getString(2131832061);
            }
            textView.setText(string);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.a1k);
        return tuxTextView;
    }
}
