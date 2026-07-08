package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.divider;

import X.C048300Fl;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesCenterDividerCell extends PowerCell<C048300Fl> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C048300Fl c048300Fl = (C048300Fl) interfaceC1891350zJl;
        super.onBindItemView(c048300Fl);
        if (c048300Fl.LL.length() > 0) {
            ((TextView) this.itemView.findViewById(R.id.ziz)).setText(c048300Fl.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cy_, viewGroup, false);
    }
}
