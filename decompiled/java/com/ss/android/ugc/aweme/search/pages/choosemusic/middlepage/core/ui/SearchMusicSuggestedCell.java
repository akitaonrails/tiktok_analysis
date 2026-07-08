package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681330Qnz;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicSuggestedCell extends PowerCell<C681330Qnz> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C681330Qnz c681330Qnz = (C681330Qnz) interfaceC1891350zJl;
        super.onBindItemView(c681330Qnz);
        ((TextView) this.itemView.findViewById(R.id.word_text)).setText(c681330Qnz.LL);
        C786410Ut5.Y7((ConstraintLayout) this.itemView.findViewById(R.id.wo5), new ACListenerS145S0100000_10(c681330Qnz, 52));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eyq, viewGroup, false);
    }
}
