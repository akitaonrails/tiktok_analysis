package com.ss.android.ugc.aweme.ttsvoice.repo;

import X.AbstractC848400XPy;
import X.AnonymousClass1121;
import X.C01GW;
import X.C04TD;
import X.C0C64;
import X.C0FNV;
import X.C0XQ7;
import X.C1389890mGx;
import X.C15L9;
import X.C15LG;
import X.C1867290ygx;
import X.C452501pT;
import X.ProgressDialogC1399760mWs;
import Y.ARunnableS62S0300000_29;
import android.app.Activity;
import android.content.Intent;
import android.util.LruCache;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSVoiceRecordService implements IVoiceReuseService {
    public ProgressDialogC1399760mWs LIZ;
    public boolean LIZJ;
    public C15L9 LIZLLL;
    public SafeHandler LJ;
    public boolean LIZIZ = true;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(244));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(246));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(245));
    public final TTSVoiceRecordService$destroyObserver$1 LJIIIIZZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService$destroyObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            TTSVoiceRecordService tTSVoiceRecordService = this.LL;
            tTSVoiceRecordService.LIZIZ = false;
            C15L9 c15l9 = tTSVoiceRecordService.LIZLLL;
            if (c15l9 != null) {
                c15l9.LIZIZ();
            }
        }
    };

    public static IVoiceReuseService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IVoiceReuseService.class, false);
        return objLIZ != null ? (IVoiceReuseService) objLIZ : new TTSVoiceRecordService();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final void LIZJ() {
        LruCache<String, AnonymousClass1121> lruCache = C1867290ygx.LIZ;
        C1867290ygx.LIZ.evictAll();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_tts_voice_anchor_display", true, true);
    }

    public final void LJ(String str, final String str2, final String str3, final MusicModel musicModel, final Activity activity, final boolean z) {
        ((IExternalService) this.LJII.getValue()).asyncService(str, new IExternalService.ServiceLoadCallback() { // from class: X.120M
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                String musicId;
                String localPath;
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.shootWay("anchor_combine_tts");
                builder.voiceEffectId(str2);
                builder.voiceEffectName(str3);
                builder.musicModel(musicModel);
                builder.enterFrom("tts_page");
                if (z) {
                    MusicModel musicModel2 = musicModel;
                    String str4 = "";
                    if (musicModel2 == null || (musicId = musicModel2.getMusicId()) == null) {
                        musicId = "";
                    }
                    builder.musicId(musicId);
                    if (musicModel2 != null && (localPath = musicModel2.getLocalPath()) != null) {
                        str4 = localPath;
                    }
                    builder.musicPath(str4);
                }
                asyncAVService.uiService().recordService().startRecord(activity, builder.build());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, final Activity activity, Music music, MusicModel musicModel, final String str, final String str2, final String str3) {
        String ownerBanShowInfo;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, "anchor_combine_tts", true)) {
            final boolean zDownloadEffectOrMusicAfterEnterCamera = ((IConfigService) this.LJFF.getValue()).avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            final boolean zIsRecording = ((IConfigService) this.LJFF.getValue()).shortVideoConfig().isRecording();
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isLive()) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131836250);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (!((IAVPublishService) this.LJI.getValue()).checkIsAlreadyPublished(activity)) {
                return;
            }
            if (musicModel != null && !((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModel, activity, true)) {
                return;
            }
            if (music != null && (ownerBanShowInfo = music.getOwnerBanShowInfo()) != null && ownerBanShowInfo.length() > 0) {
                if (zDownloadEffectOrMusicAfterEnterCamera) {
                    this.LIZJ = false;
                    ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LIZ;
                    if (progressDialogC1399760mWs != null) {
                        C0FNV.LIZ(progressDialogC1399760mWs);
                    }
                    this.LIZ = null;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                c1389890mGx2.LJIIJ(music.getOwnerBanShowInfo());
                c1389890mGx2.LJIIJJI();
                return;
            }
            this.LIZLLL = new C15L9(activity, new C15LG() { // from class: X.120N
                @Override // X.C15LG
                public final void Sx(MusicModel musicModel2) {
                }

                @Override // X.C15LG
                public final boolean h4() {
                    return this.LIZIZ;
                }

                @Override // X.C15LG
                public final void k8() {
                    Activity activity2 = activity;
                    String str4 = str3;
                    C0XPD.LIZIZ(activity2, str4, str4, null, null);
                }

                @Override // X.C15LG
                public final void Nw(MusicModel musicModel2, boolean z) {
                    if (z && (activity instanceof LifecycleOwner)) {
                        TTSVoiceRecordService tTSVoiceRecordService = this;
                        tTSVoiceRecordService.LIZJ = true;
                        tTSVoiceRecordService.LJ = new SafeHandler((LifecycleOwner) activity);
                        TTSVoiceRecordService tTSVoiceRecordService2 = this;
                        SafeHandler safeHandler = tTSVoiceRecordService2.LJ;
                        if (safeHandler != null) {
                            safeHandler.postDelayed(new ARunnableS62S0300000_29(tTSVoiceRecordService2, activity, musicModel2, 1), 300L);
                        }
                    }
                }

                @Override // X.C15LG
                public final void fB(Effect effect, MusicModel musicModel2) {
                    TTSVoiceRecordService tTSVoiceRecordService = this;
                    tTSVoiceRecordService.LIZJ = false;
                    ProgressDialogC1399760mWs progressDialogC1399760mWs2 = tTSVoiceRecordService.LIZ;
                    if (progressDialogC1399760mWs2 != null) {
                        C0FNV.LIZ(progressDialogC1399760mWs2);
                    }
                    tTSVoiceRecordService.LIZ = null;
                    this.LJ(str3, str2, str, musicModel2, activity, true);
                }

                @Override // X.C15LG
                public final void hb(boolean z, boolean z2) {
                    if (z) {
                        TTSVoiceRecordService tTSVoiceRecordService = this;
                        tTSVoiceRecordService.LIZJ = false;
                        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = tTSVoiceRecordService.LIZ;
                        if (progressDialogC1399760mWs2 != null) {
                            C0FNV.LIZ(progressDialogC1399760mWs2);
                        }
                        tTSVoiceRecordService.LIZ = null;
                        return;
                    }
                    this.getClass();
                }

                @Override // X.C15LG
                public final void sa(int i, boolean z) {
                    if (!zDownloadEffectOrMusicAfterEnterCamera) {
                        this.getClass();
                    }
                }

                @Override // X.C15LG
                public final void eL(int i, MusicModel musicModel2, String str4) throws Throwable {
                    boolean z = zDownloadEffectOrMusicAfterEnterCamera;
                    TTSVoiceRecordService tTSVoiceRecordService = this;
                    if (z) {
                        tTSVoiceRecordService.LIZJ = false;
                        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = tTSVoiceRecordService.LIZ;
                        if (progressDialogC1399760mWs2 != null) {
                            C0FNV.LIZ(progressDialogC1399760mWs2);
                        }
                        tTSVoiceRecordService.LIZ = null;
                    } else {
                        tTSVoiceRecordService.getClass();
                    }
                    this.getClass();
                    if (zIsRecording) {
                        ((IAVPublishService) this.LJI.getValue()).addMusic(musicModel2, 0);
                        Intent intent = new Intent();
                        intent.putExtra("path", str4);
                        intent.putExtra("music_model", musicModel2);
                        C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP68cInB1TESNH17AIxJLbpIZ6J/5DG1+Pe73D/OcePaknFW", null));
                        activity.finish();
                        return;
                    }
                    TTSVoiceRecordService tTSVoiceRecordService2 = this;
                    String str5 = str3;
                    String str6 = str2;
                    String str7 = str;
                    musicModel2.setLocalPath(str4);
                    tTSVoiceRecordService2.LJ(str5, str6, str7, musicModel2, activity, true);
                }
            }, true);
            lifecycleOwner.getLifecycle().addObserver(this.LJIIIIZZ);
            LJ(str3, str2, str, null, activity, false);
        }
    }
}
