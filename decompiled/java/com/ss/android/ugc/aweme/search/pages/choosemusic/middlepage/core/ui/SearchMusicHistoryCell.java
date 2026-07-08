package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681870Qor;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS77S0300000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicHistoryCell extends PowerCell<C681870Qor> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C681870Qor c681870Qor = (C681870Qor) interfaceC1891350zJl;
        super.onBindItemView(c681870Qor);
        MusicSearchHistory musicSearchHistory = c681870Qor.LL;
        ((TextView) this.itemView.findViewById(R.id.zpn)).setText(musicSearchHistory.keyword);
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.lbw), new ACListenerS77S0300000_10((Object) c681870Qor, (View) this, (Map<String, String>) musicSearchHistory, (View) 5));
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.zpn), new ACListenerS77S0300000_10((Object) c681870Qor, (View) this, (Map<String, String>) musicSearchHistory, (View) 6));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ezs, viewGroup, false);
    }
}
