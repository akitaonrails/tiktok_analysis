package com.ss.android.ugc.aweme.voiceconversion.repo;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0C64;
import X.C0FNV;
import X.C0XQ7;
import X.C120V;
import X.C1389890mGx;
import X.C1401680mZy;
import X.C1401690mZz;
import X.C15L9;
import X.C15LG;
import X.C1663790tOj;
import X.C452501pT;
import X.DialogC1389620mGW;
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
import com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class VoiceConversionRecordService implements IVoiceConversionReuseService {
    public ProgressDialogC1399760mWs LIZ;
    public boolean LIZJ;
    public C15L9 LIZLLL;
    public SafeHandler LJ;
    public DialogC1389620mGW LJFF;
    public boolean LIZIZ = true;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(253));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(255));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(254));
    public final VoiceConversionRecordService$destroyObserver$1 LJIIIZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService$destroyObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            VoiceConversionRecordService voiceConversionRecordService = this.LL;
            voiceConversionRecordService.LIZIZ = false;
            C15L9 c15l9 = voiceConversionRecordService.LIZLLL;
            if (c15l9 != null) {
                c15l9.LIZIZ();
            }
        }
    };

    public static IVoiceConversionReuseService LJ() {
        Object objLIZ = C04TD.LIZ(IVoiceConversionReuseService.class, false);
        return objLIZ != null ? (IVoiceConversionReuseService) objLIZ : new VoiceConversionRecordService();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final void LIZLLL() {
        LruCache<String, C1401690mZz> lruCache = C1401680mZy.LIZ;
        C1401680mZy.LIZ.evictAll();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_vc_filter_anchor_display", true, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_vc_filter_anchor_display_publish", true, false);
    }

    public final void LJFF(String str, final String str2, final String str3, final MusicModel musicModel, final Activity activity, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ((IExternalService) this.LJIIIIZZ.getValue()).asyncService(str, new IExternalService.ServiceLoadCallback() { // from class: X.120L
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
                builder.shootWay("vc_page");
                builder.vcVoiceEffectId(str2);
                builder.vcVoiceEffectName(str3);
                builder.vcVoiceIDs(arrayList);
                builder.musicModel(musicModel);
                builder.enterFrom("vc_page");
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

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, final Activity activity, Music music, MusicModel musicModel, final String str, final String str2, final String str3) {
        String ownerBanShowInfo;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, "vc_page", true)) {
            final boolean zDownloadEffectOrMusicAfterEnterCamera = ((IConfigService) this.LJI.getValue()).avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            final boolean zIsRecording = ((IConfigService) this.LJI.getValue()).shortVideoConfig().isRecording();
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isLive()) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131836250);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (!((IAVPublishService) this.LJII.getValue()).checkIsAlreadyPublished(activity)) {
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
            this.LIZLLL = new C15L9(activity, new C15LG() { // from class: X.120R
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
                        VoiceConversionRecordService voiceConversionRecordService = this;
                        voiceConversionRecordService.LIZJ = true;
                        voiceConversionRecordService.LJ = new SafeHandler((LifecycleOwner) activity);
                        VoiceConversionRecordService voiceConversionRecordService2 = this;
                        SafeHandler safeHandler = voiceConversionRecordService2.LJ;
                        if (safeHandler != null) {
                            safeHandler.postDelayed(new ARunnableS62S0300000_29(voiceConversionRecordService2, activity, musicModel2, 2), 300L);
                        }
                    }
                }

                @Override // X.C15LG
                public final void fB(Effect effect, MusicModel musicModel2) {
                    VoiceConversionRecordService voiceConversionRecordService = this;
                    voiceConversionRecordService.LIZJ = false;
                    ProgressDialogC1399760mWs progressDialogC1399760mWs2 = voiceConversionRecordService.LIZ;
                    if (progressDialogC1399760mWs2 != null) {
                        C0FNV.LIZ(progressDialogC1399760mWs2);
                    }
                    voiceConversionRecordService.LIZ = null;
                    this.LJFF(str3, str2, str, musicModel2, activity, true);
                }

                @Override // X.C15LG
                public final void hb(boolean z, boolean z2) {
                    if (z) {
                        VoiceConversionRecordService voiceConversionRecordService = this;
                        voiceConversionRecordService.LIZJ = false;
                        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = voiceConversionRecordService.LIZ;
                        if (progressDialogC1399760mWs2 != null) {
                            C0FNV.LIZ(progressDialogC1399760mWs2);
                        }
                        voiceConversionRecordService.LIZ = null;
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
                    VoiceConversionRecordService voiceConversionRecordService = this;
                    if (z) {
                        voiceConversionRecordService.LIZJ = false;
                        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = voiceConversionRecordService.LIZ;
                        if (progressDialogC1399760mWs2 != null) {
                            C0FNV.LIZ(progressDialogC1399760mWs2);
                        }
                        voiceConversionRecordService.LIZ = null;
                    } else {
                        voiceConversionRecordService.getClass();
                    }
                    this.getClass();
                    if (zIsRecording) {
                        ((IAVPublishService) this.LJII.getValue()).addMusic(musicModel2, 0);
                        Intent intent = new Intent();
                        intent.putExtra("path", str4);
                        intent.putExtra("music_model", musicModel2);
                        C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPynapzL3z3zGCm58q0Z2JrB1pxgYFSZCVS+C+rHri8RiF/zKc8idYtIUXodjhoJ7qY=", null));
                        activity.finish();
                        return;
                    }
                    VoiceConversionRecordService voiceConversionRecordService2 = this;
                    String str5 = str3;
                    String str6 = str2;
                    String str7 = str;
                    musicModel2.setLocalPath(str4);
                    voiceConversionRecordService2.LJFF(str5, str6, str7, musicModel2, activity, true);
                }
            }, true);
            C1663790tOj.LIZ().LIZ(new C120V() { // from class: X.120Q
                @Override // X.C120V
                public final void LIZJ() {
                    DialogC1389620mGW dialogC1389620mGW;
                    VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
                    DialogC1389620mGW dialogC1389620mGW2 = voiceConversionRecordService.LJFF;
                    if (dialogC1389620mGW2 != null) {
                        if (dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LIZ.LJFF) == null) {
                            return;
                        }
                        C786410Ut5.J4(dialogC1389620mGW);
                        return;
                    }
                    DialogC1389620mGW dialogC1389620mGW3 = new DialogC1389620mGW(activity);
                    dialogC1389620mGW3.LJJLJLI(C20642515q3.LJI(2131826442));
                    dialogC1389620mGW3.LJJLL(true);
                    voiceConversionRecordService.LJFF = dialogC1389620mGW3;
                    DialogC1389620mGW dialogC1389620mGW4 = this.LIZ.LJFF;
                    if (dialogC1389620mGW4 != null) {
                        C0FNV.LIZJ(dialogC1389620mGW4);
                    }
                }

                @Override // X.C120V
                public final void LIZ(CategoryPageModel categoryPageModel) {
                    DialogC1389620mGW dialogC1389620mGW;
                    VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
                    DialogC1389620mGW dialogC1389620mGW2 = voiceConversionRecordService.LJFF;
                    if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = voiceConversionRecordService.LJFF) != null) {
                        dialogC1389620mGW.dismiss();
                        C785410UrT.LIZ(dialogC1389620mGW);
                    }
                    this.LIZ.LJFF(str3, str2, str, null, activity, false);
                }

                @Override // X.C120V
                public final void LIZIZ(int i, String str4) {
                    DialogC1389620mGW dialogC1389620mGW;
                    VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
                    DialogC1389620mGW dialogC1389620mGW2 = voiceConversionRecordService.LJFF;
                    if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = voiceConversionRecordService.LJFF) != null) {
                        dialogC1389620mGW.dismiss();
                        C785410UrT.LIZ(dialogC1389620mGW);
                    }
                }
            });
            lifecycleOwner.getLifecycle().addObserver(this.LJIIIZ);
        }
    }
}
