package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.C00XC;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ArtistProfileMusicTitleCell extends PowerCell<C00XC> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dqo;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C00XC c00xc = (C00XC) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c00xc.LL);
        }
    }
}
