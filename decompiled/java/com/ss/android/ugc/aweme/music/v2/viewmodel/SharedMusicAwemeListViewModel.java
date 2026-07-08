package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C1215290hjL;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class SharedMusicAwemeListViewModel extends AssemViewModel<C1215290hjL> implements IMDPAwemeListAbility {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215290hjL(null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility
    public final List<Aweme> hD2() {
        C291001Au<List<Aweme>> c291001Au = getState().LLILLL;
        if (c291001Au != null) {
            return c291001Au.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility
    public final MusicAwemeList nC2() {
        C291001Au<MusicAwemeList> c291001Au = getState().LL;
        if (c291001Au != null) {
            return c291001Au.LIZ;
        }
        return null;
    }
}
