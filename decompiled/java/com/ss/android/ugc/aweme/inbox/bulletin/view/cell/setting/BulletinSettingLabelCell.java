package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C01BP;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinSettingLabelCell extends PowerCell<C01BP> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C01BP c01bp = (C01BP) interfaceC1891350zJl;
        super.onBindItemView(c01bp);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            String str = c01bp.LL;
            if (str != null) {
                tuxTextView.setText(str);
                return;
            }
            Integer num = c01bp.LLILLJJLI;
            if (num == null) {
                return;
            }
            tuxTextView.setText(num.intValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8_, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.xrk);
        return viewTd;
    }
}
