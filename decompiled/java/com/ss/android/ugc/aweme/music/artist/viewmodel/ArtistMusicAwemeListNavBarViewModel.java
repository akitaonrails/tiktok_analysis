package com.ss.android.ugc.aweme.music.artist.viewmodel;

import X.C09R9;
import X.C1164770gPr;
import X.C11NJ;
import X.C13LE;
import X.C1559260qg8;
import X.C614640O8w;
import X.C723600SZy;
import X.C995830c1N;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes19.dex */
public final class ArtistMusicAwemeListNavBarViewModel extends AssemViewModel<C995830c1N> {
    public final C11NJ LL = new C11NJ();
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C614640O8w.class));
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C1164770gPr.class, "hierarchy_data_artist_music"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995830c1N(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL.dispose();
        super.onCleared();
    }
}
