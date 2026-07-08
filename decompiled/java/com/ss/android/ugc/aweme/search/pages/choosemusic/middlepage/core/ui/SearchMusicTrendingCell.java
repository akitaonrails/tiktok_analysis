package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681340Qo0;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicTrendingCell extends PowerCell<C681340Qo0> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C681340Qo0 c681340Qo0 = (C681340Qo0) interfaceC1891350zJl;
        super.onBindItemView(c681340Qo0);
        ((TextView) this.itemView.findViewById(R.id.word)).setText(c681340Qo0.LL.getShowWord());
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.g39);
        int i2 = c681340Qo0.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = R.drawable.d4l;
                } else {
                    i = R.drawable.d4o;
                }
            } else {
                i = R.drawable.d4m;
            }
        } else {
            i = R.drawable.d4n;
        }
        tuxIconView.setIconRes(i);
        C786410Ut5.Y7((ConstraintLayout) this.itemView.findViewById(R.id.yk7), new ACListenerS145S0100000_10(c681340Qo0, 54));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eyt, viewGroup, false);
    }
}
