package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C186800ni;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnClickListenerC512201z6;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class ArtistMusicStartRecordCell extends PowerCell<C186800ni> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dpq;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C186800ni c186800ni = (C186800ni) interfaceC1891350zJl;
        super.onBindItemView(c186800ni);
        C786410Ut5.I7(new ViewOnClickListenerC512201z6(c186800ni, 42), this.itemView);
    }
}
