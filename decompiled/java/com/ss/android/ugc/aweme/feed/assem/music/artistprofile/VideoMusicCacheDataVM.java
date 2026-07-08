package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoMusicCacheDataVM extends FeedBaseViewModel<InterfaceC0148002o> {
    public final ConcurrentHashMap<String, List<MusicOwnerInfo>> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0P1O
        };
    }
}
