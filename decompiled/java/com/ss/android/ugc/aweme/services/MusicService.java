package com.ss.android.ugc.aweme.services;

import X.C08HM;
import X.C0CHQ;
import X.C0WZX;
import X.C1233040iBy;
import X.C13TC;
import X.C13TD;
import X.C1487190ont;
import X.C1490520otG;
import X.C15IK;
import X.C1701330uNH;
import X.C20496415Ic;
import X.C20498615Iy;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2428409fO;
import X.C633060OsK;
import X.InterfaceC1416890myV;
import X.InterfaceC1490530otH;
import X.InterfaceC633080OsM;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.DraftMusicAdapter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public class MusicService implements IMusicService {
    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public boolean isMusicTypeLocal(int i) {
        return i == 0 || i == 3;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public Map<String, String> getCreationMusicIdToLocalPathMap() {
        boolean z = C13TD.LIZIZ;
        return C13TC.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public void initCreationMusicCache() {
        boolean z = C13TD.LIZIZ;
        C13TC.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getCacheDir() {
        String path;
        C1490520otG c1490520otGLJFF = C1490520otG.LJFF();
        if (c1490520otGLJFF.LIZIZ == null) {
            c1490520otGLJFF.LJI();
        }
        InterfaceC1490530otH interfaceC1490530otH = c1490520otGLJFF.LIZIZ;
        return (interfaceC1490530otH == null || (path = interfaceC1490530otH.getPath()) == null) ? "" : path;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getDownloadDir() {
        return C1490520otG.LJFF().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getDownloadFileName(String str) {
        return C1487190ont.LIZJ(str);
    }

    public AVMusic getMusicModelAVMusic(Object obj) {
        if (obj != null) {
            return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).aVTransformModelService().transformMusicModel((MusicModel) obj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getRhythmMusicFilePath(String str) {
        String str2 = C2428409fO.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2428409fO.LIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08HM.LIZJ(str));
        sbLIZ2.append(".json");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public AVMusic transformFromAVMusic(String str) {
        try {
            return (AVMusic) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, AVMusic.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public AVMusic transformNewAVMusic(String str) {
        return DraftMusicAdapter.INSTANCE.transformNewAVMusic(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public void requestMusic(String str, final InterfaceC1416890myV interfaceC1416890myV) {
        boolean zLJI = MethodIDManager.LJI(137851);
        C633060OsK c633060OsK = new C633060OsK();
        c633060OsK.LLILLJJLI = new InterfaceC633080OsM() { // from class: com.ss.android.ugc.aweme.services.MusicService.1
            public void onLoadTerminatedUserPage() {
                if (interfaceC1416890myV != null) {
                    interfaceC1416890myV.LIZIZ(new RuntimeException("music should not be null"));
                }
            }

            @Override // X.InterfaceC633080OsM
            public void onLoadMusicDetailFail(Exception exc) {
                InterfaceC1416890myV interfaceC1416890myV2 = interfaceC1416890myV;
                if (interfaceC1416890myV2 != null) {
                    interfaceC1416890myV2.LIZIZ(exc);
                }
            }

            @Override // X.InterfaceC633080OsM
            public void onLoadMusicDetailSuccess(MusicDetail musicDetail) {
                AVMusic aVMusicTransformMusicModel;
                InterfaceC1416890myV interfaceC1416890myV2 = interfaceC1416890myV;
                if (interfaceC1416890myV2 != null) {
                    if (musicDetail.music != null) {
                        aVMusicTransformMusicModel = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).aVTransformModelService().transformMusicModel(musicDetail.music.convertToMusicModel());
                    } else {
                        aVMusicTransformMusicModel = null;
                    }
                    interfaceC1416890myV2.LIZLLL(aVMusicTransformMusicModel);
                }
            }
        };
        c633060OsK.LIZJ(str, 0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public boolean checkValidMusic(AVMusic aVMusic, Context context, boolean z) {
        if (aVMusic != null) {
            if (TextUtils.isEmpty(aVMusic.getPath()) || aVMusic.getMusicStatus() == 0) {
                String offlineDesc = aVMusic.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(2131837770);
                }
                if (z) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZJ(offlineDesc);
                    c1233040iBy.LIZLLL();
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public MusicModel buildMusicModelFromFile(File file, String str, String str2, boolean z, boolean z2) {
        return MusicUtils.buildMusicModelFromFile(file, str, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public void openChooseMusicPage(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, String str4, int i3, UrlModel urlModel, String str5, String str6, boolean z7, String str7, String str8) throws Throwable {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            IKidsMusicEntrance iKidsMusicEntrance = (IKidsMusicEntrance) PluggableExtentionKt.pluggableSpi(IKidsMusicEntrance.class);
            if (iKidsMusicEntrance != null) {
                iKidsMusicEntrance.LIZ(fragment, i, i2, musicModel, z, z2, bundle, str2, str3, z3, z4);
                return;
            }
            return;
        }
        C20496415Ic.LIZ.getClass();
        C20496415Ic.LIZ();
        C20498615Iy c20498615Iy = new C20498615Iy(str, i2, musicModel, z, z2, bundle, str2, str3, z3, z4, z5, z6, str4, urlModel, i3, str5, str6, z7, str7, str8);
        if (i2 == 2) {
            C15IK.LJIJI("video_shoot_page");
        } else {
            C15IK.LJIJI("video_edit_page");
        }
        C15IK.LJIILJJIL = str5;
        C15IK.LJIILL = str6;
        String string = fragment.getString(2131828635);
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ()) {
            string = fragment.getString(2131837748);
        }
        c20498615Iy.LIZ = string;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/home");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getCurChallenge();
        if (curChallenge != null) {
            smartRouteBuildRoute.withParam("challenge", curChallenge.cid);
        }
        if (musicModel != null) {
            smartRouteBuildRoute.withParam("music_model", musicModel);
        }
        smartRouteBuildRoute.withParam("title", c20498615Iy.LIZ);
        smartRouteBuildRoute.withParam("music_allow_clear", z);
        smartRouteBuildRoute.withParam("music_allow_cut", z6);
        smartRouteBuildRoute.withParam("music_is_photomv", z2);
        smartRouteBuildRoute.withParam("creation_id", str3);
        smartRouteBuildRoute.withParam("content_source", str7);
        smartRouteBuildRoute.withParam("content_type", str8);
        smartRouteBuildRoute.withParam("shoot_way", str2);
        smartRouteBuildRoute.withParam("hide_local_music", z4);
        smartRouteBuildRoute.withParam("extra_beat_music_sticker", z3);
        smartRouteBuildRoute.withParam("from_location", str5);
        smartRouteBuildRoute.withParam("type", str6);
        smartRouteBuildRoute.withParam("long_video", z5);
        smartRouteBuildRoute.withParam("reuse_original_sound_url", urlModel);
        smartRouteBuildRoute.withParam("reuse_original_sound_id", str4);
        smartRouteBuildRoute.withParam("reuse_original_sound_length", i3);
        smartRouteBuildRoute.withParam("is_mv_theme_music", z7);
        if (bundle != null) {
            smartRouteBuildRoute.withParam("arguments", bundle);
        }
        Intent intentBuildIntent = smartRouteBuildRoute.buildIntent();
        C1701330uNH.LIZ(intentBuildIntent, fragment);
        C2204961BRm.LLJL(fragment, intentBuildIntent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkic2EogGj/KyVc0vwpcT", null));
    }
}
