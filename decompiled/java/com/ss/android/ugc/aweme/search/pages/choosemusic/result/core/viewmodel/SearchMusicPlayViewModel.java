package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel;

import X.C0EM1;
import X.C0RD4;
import X.C15H0;
import X.C15HO;
import X.C15IK;
import X.C15IZ;
import X.C1ER1;
import X.C681230Qnp;
import X.InterfaceC0148002o;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSearchPageMonitor;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicPlayViewModel extends AssemViewModel<C681230Qnp> implements Observer<C0RD4>, C15H0 {
    public DataCenter LL;
    public boolean LLILLJJLI;
    public final boolean LLILLL = true;
    public ChooseMusicDownloadPlayHelper LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C681230Qnp(0);
    }

    @Override // X.C15H0
    public final void Dl0(C15IZ c15iz) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILZ;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.Tf(c15iz);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str = c0rd4.LIZ;
        if (str.hashCode() == 502104354 && str.equals("music_loading")) {
            withState(new AwS589S0100000_10(this, 466));
        }
    }

    @Override // X.C15H0
    public final void p8(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILZ;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // X.C15H0
    public final void ru(MusicModel musicModel) {
        String musicId;
        boolean z;
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILZ;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LLJI = "search_result";
        }
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        SelectMusicFromSelectSearchPageMonitor selectMusicFromSelectSearchPageMonitor = SelectMusicFromSelectSearchPageMonitor.INSTANCE;
        if (musicId != null) {
            HashMap<String, PerformanceMonitor> map = C0EM1.LIZ;
            map.clear();
            map.put(musicId, selectMusicFromSelectSearchPageMonitor);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start(selectMusicFromSelectSearchPageMonitor, "click use music from search");
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLILZ;
        if (chooseMusicDownloadPlayHelper2 != null) {
            boolean z2 = this.LLILLJJLI;
            boolean z3 = true;
            if ((((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() && Intrinsics.LJFF(C15IK.LJIIJJI, "direct_shoot")) || (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && !Intrinsics.LJFF(C15IK.LJIIJJI, "direct_shoot"))) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel == null || !musicModel.isFullSong) {
                z3 = false;
            }
            chooseMusicDownloadPlayHelper2.ag(2, musicModel, true, z2, z ^ z3);
        }
    }

    @Override // X.C15H0
    public final void cJ(MusicModel musicModel, C15HO c15ho) {
        C1ER1.LIZIZ.LJLIIIL();
        DataCenter dataCenter = this.LL;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "music_loading");
        }
        if (this.LLILLL) {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILZ;
            if (chooseMusicDownloadPlayHelper != null) {
                chooseMusicDownloadPlayHelper.LLJJL = c15ho;
                chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, 2);
                return;
            }
            return;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLILZ;
        if (chooseMusicDownloadPlayHelper2 == null) {
            return;
        }
        chooseMusicDownloadPlayHelper2.Uf(2, musicModel, true, this.LLILLJJLI);
    }
}
