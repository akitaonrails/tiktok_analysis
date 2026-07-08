package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681880Qos;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS77S0300000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicHistoryCellNew extends PowerCell<C681880Qos> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C681880Qos c681880Qos = (C681880Qos) interfaceC1891350zJl;
        super.onBindItemView(c681880Qos);
        MusicSearchHistory musicSearchHistory = c681880Qos.LL;
        ((TextView) this.itemView.findViewById(R.id.jq2)).setText(musicSearchHistory.keyword);
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.jp_), new ACListenerS77S0300000_10((Object) c681880Qos, (View) this, (Map<String, String>) musicSearchHistory, (View) 7));
        C786410Ut5.R7((LinearLayout) this.itemView.findViewById(R.id.jpa), new ACListenerS77S0300000_10((Object) c681880Qos, (View) this, (Map<String, String>) musicSearchHistory, (View) 8));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ezt, viewGroup, false);
    }
}
