package com.ss.android.ugc.aweme.shortvideo.edit.videolength;

import X.AbstractC1453750nvx;
import X.AbstractC214814194y;
import X.C123100dR;
import X.C1439620nZA;
import X.C1452640nuA;
import X.C384190F4n;
import X.InterfaceC1446740nke;
import X.InterfaceC1455860nzM;
import Y.AObserverS170S0200000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS16S0101000_5;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoLengthChecker implements IVideoLengthChecker {
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZIZ(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
        if (C384190F4n.LIZ(videoPublishEditModel) && zYi2 && aVMusicExtractAVMusic != null && !aVMusicExtractAVMusic.isCommerceMusic()) {
            C1452640nuA.LJII(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
            videoPublishEditModel.setMMusicPath(null);
            videoPublishEditModel.setMMusicStart(0);
            videoPublishEditModel.setIsSoundLoop(Boolean.FALSE);
            videoPublishEditModel.setMusicVolume(0.5f);
            HandlerHook.viewPost(activity.getWindow().getDecorView(), new ARunnableS105S0100000_5(activity, 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZ(InterfaceC1455860nzM interfaceC1455860nzM, LifecycleOwner lifecycleOwner, FTCEditToolbarViewModel fTCEditToolbarViewModel) {
        if (interfaceC1455860nzM == null) {
            return;
        }
        interfaceC1455860nzM.g().observe(lifecycleOwner, new AObserverS170S0200000_5(fTCEditToolbarViewModel, interfaceC1455860nzM, 0));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZLLL(LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM) {
        if (interfaceC1455860nzM == null) {
            return;
        }
        interfaceC1455860nzM.g().observe(lifecycleOwner, new AObserverS170S0200000_5(videoPublishEditModel, this, 40));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZJ(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, AbstractC1453750nvx abstractC1453750nvx) {
        String string;
        Activity activity = abstractC214814194y.mActivity;
        if (activity == null) {
            return;
        }
        Bundle argumentsSafely = abstractC214814194y.getArgumentsSafely();
        if (argumentsSafely != null) {
            string = argumentsSafely.getString("extra_edit_effect_uid");
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            return;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
        if (C384190F4n.LIZ(videoPublishEditModel) && zYi2 && aVMusicExtractAVMusic != null && (!aVMusicExtractAVMusic.isCommerceMusic() || C384190F4n.LIZJ(aVMusicExtractAVMusic))) {
            LJ(activity, videoPublishEditModel, interfaceC1455860nzM, abstractC1453750nvx, 2131837781);
        } else if (C384190F4n.LIZ(videoPublishEditModel) && aVMusicExtractAVMusic != null && C384190F4n.LIZJ(aVMusicExtractAVMusic) && !videoPublishEditModel.isDuet()) {
            LJ(activity, videoPublishEditModel, interfaceC1455860nzM, abstractC1453750nvx, 2131836891);
        }
    }

    public static void LJ(Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, AbstractC1453750nvx abstractC1453750nvx, int i) {
        long j;
        InterfaceC1446740nke interfaceC1446740nke;
        LiveData<Unit> liveDataA62;
        C1452640nuA.LJII(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
        videoPublishEditModel.setMMusicPath(null);
        videoPublishEditModel.setMMusicStart(0);
        videoPublishEditModel.setIsSoundLoop(Boolean.FALSE);
        videoPublishEditModel.setMusicVolume(0.5f);
        abstractC1453750nvx.LLLLLIL().lr(true);
        SafeHandler safeHandler = new SafeHandler(abstractC1453750nvx);
        ARunnableS16S0101000_5 aRunnableS16S0101000_5 = new ARunnableS16S0101000_5(i, activity, 0);
        if (C1439620nZA.LIZIZ(videoPublishEditModel)) {
            j = 4000;
        } else {
            j = 0;
        }
        safeHandler.removeCallbacksAndMessages(null);
        safeHandler.postDelayed(aRunnableS16S0101000_5, j);
        if ((interfaceC1455860nzM instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzM) != null && (liveDataA62 = interfaceC1446740nke.a62()) != null) {
            liveDataA62.observe(abstractC1453750nvx, new AObserverS170S0200000_5(aRunnableS16S0101000_5, safeHandler, 1));
        }
    }
}
