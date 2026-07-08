package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C00XB;
import X.C01GW;
import X.C452501pT;
import X.C5182020e;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ArtistMusicAwemeLisHintCell extends PowerCell<C00XB> {
    public final C01GW LL = C452501pT.LIZIZ(new C5182020e(this, 143));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dps;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ((TextView) this.LL.getValue()).setText(C786410Ut5.j4(this.itemView.getContext().getString(2131834513), Arrays.copyOf(new Object[]{((C00XB) interfaceC1891350zJl).LL}, 1)));
    }
}
