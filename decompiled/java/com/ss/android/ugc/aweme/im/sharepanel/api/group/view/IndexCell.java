package com.ss.android.ugc.aweme.im.sharepanel.api.group.view;

import X.C0131001x;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class IndexCell extends PowerCell<C0131001x> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView = (TextView) this.itemView.findViewById(R.id.kky);
        interfaceC1891350zJl.getClass();
        textView.setText((CharSequence) null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cku, viewGroup, false);
    }
}
