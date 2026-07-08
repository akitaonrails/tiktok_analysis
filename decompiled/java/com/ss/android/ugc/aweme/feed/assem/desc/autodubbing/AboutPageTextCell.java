package com.ss.android.ugc.aweme.feed.assem.desc.autodubbing;

import X.C0DV7;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AboutPageTextCell extends PowerCell<C0DV7> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0DV7 c0dv7 = (C0DV7) interfaceC1891350zJl;
        super.onBindItemView(c0dv7);
        Integer num = c0dv7.LLIZ;
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.title);
        if (tuxTextView != null) {
            CharSequence charSequence = c0dv7.LL;
            if (charSequence != null && charSequence.length() != 0) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(c0dv7.LL);
                Integer num2 = c0dv7.LLILLJJLI;
                if (num2 != null) {
                    num2.intValue();
                    tuxTextView.setTuxFont(num2.intValue());
                }
                Integer num3 = c0dv7.LLILLL;
                if (num3 != null) {
                    tuxTextView.setTextColor(num3.intValue());
                }
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.wgy);
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            CharSequence charSequence2 = c0dv7.LLILZ;
            if (charSequence2 != null && charSequence2.length() != 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                tuxTextView2.setText(c0dv7.LLILZ);
                Integer num4 = c0dv7.LLILZIL;
                if (num4 != null) {
                    num4.intValue();
                    tuxTextView2.setTuxFont(num4.intValue());
                }
                Integer num5 = c0dv7.LLILZLL;
                if (num5 != null) {
                    tuxTextView2.setTextColor(num5.intValue());
                    return;
                }
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6, viewGroup, false);
    }
}
