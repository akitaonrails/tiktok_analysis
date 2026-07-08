package com.ss.android.ugc.aweme.notification.vh;

import X.C423440Gj0;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemNotificationDetailTitleCell extends PowerCell<C423440Gj0> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        TuxTextView tuxTextView;
        C423440Gj0 c423440Gj0 = (C423440Gj0) interfaceC1891350zJl;
        super.onBindItemView(c423440Gj0);
        if (c423440Gj0.LLILLL) {
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c423440Gj0.LLILLJJLI);
            }
        } else {
            Integer num = c423440Gj0.LL;
            if (num != null) {
                num.intValue();
                Context context = getContext();
                if (context != null && (string = context.getString(c423440Gj0.LL.intValue())) != null && (tuxTextView = this.LL) != null) {
                    tuxTextView.setText(string);
                }
            }
        }
        Integer num2 = c423440Gj0.LLILZ;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            TuxTextView tuxTextView3 = this.LL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(iIntValue);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ab_, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.z7j);
        return viewTd;
    }
}
