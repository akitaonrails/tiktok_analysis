package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic;

import X.C0RD4;
import X.C621100OXs;
import X.InterfaceC0148002o;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicPlayViewModel extends AssemViewModel<C621100OXs> implements Observer<C0RD4> {
    public MusicDownloadPlayHelper LL;
    public DataCenter LLILLJJLI;
    public MusicModel LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C621100OXs(0);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str = c0rd4.LIZ;
        if (str.hashCode() == -489401013 && str.equals("bulletin_share_music_play_status")) {
            withState(new AwS588S0100000_9(this, 592));
        }
    }
}
