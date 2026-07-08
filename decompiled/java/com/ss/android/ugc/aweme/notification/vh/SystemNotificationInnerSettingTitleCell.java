package com.ss.android.ugc.aweme.notification.vh;

import X.C00XD;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class SystemNotificationInnerSettingTitleCell extends PowerCell<C00XD> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        TuxTextView tuxTextView;
        C00XD c00xd = (C00XD) interfaceC1891350zJl;
        super.onBindItemView(c00xd);
        Context context = getContext();
        if (context != null && (string = context.getString(c00xd.LL)) != null && (tuxTextView = this.LL) != null) {
            tuxTextView.setText(string);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abi, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.z7j);
        return viewTd;
    }
}
