package com.ss.android.ugc.aweme.services.external.ui;

import X.AbstractBinderC539700LEq;
import X.C0MPJ;
import X.C19EG;
import X.C2344009Gk;
import X.C573660Mei;
import X.C573840Mf0;
import X.C575860MiG;
import X.EnumC1429610nJ1;
import X.InterfaceC1364105Vn;
import X.InterfaceC20658015sY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.config.PhotoModeTemplateAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public interface IRecordService {
    void checkPUGCI2VQuota(Activity activity, TemplateAnchorConfig templateAnchorConfig, Function1<? super Boolean, Unit> function1);

    void clickMvAnchorOpenAlbumDirectly(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig, String str, String str2);

    void enterRecordPageInTemplate(Context context, RecordConfig recordConfig);

    Intent getRecordBasicIntent(RecordConfig recordConfig);

    void gotoAlbumForAutoCutFromMDP(Activity activity, C575860MiG c575860MiG);

    boolean isBroadcastSmoothGoLive();

    boolean isVideoRecordNewActivityInStack();

    void openAlbumWithMusic(Activity activity, RecordConfig recordConfig, MusicModel musicModel);

    void openBulletinAlbum(Activity activity);

    void openBulletinAlbumForSingleMedia(Activity activity);

    void openDMAlbum(Activity activity, DMAlbumParams dMAlbumParams);

    void preloadDuetLayout(int i, int i2, Function1<? super Effect, Unit> function1);

    void preloadFilterResource(String str, String str2, long j);

    void recordActivityResult(Activity activity, int i, int i2, Intent intent);

    void showCameraWidgetGuide(C19EG c19eg, LifecycleOwner lifecycleOwner, String str, String str2, String str3, boolean z, InterfaceC20658015sY interfaceC20658015sY);

    void starNLETemplateDebugAlbum(Context context, String str);

    void startAiSelfScanFace(String str, String str2, Context context, String str3, String str4);

    void startAlbum(Activity activity, C575860MiG c575860MiG, boolean z);

    void startAlbum(Context context, RecordConfig recordConfig, EnumC1429610nJ1 enumC1429610nJ1, EditEffectAnchorManager editEffectAnchorManager);

    void startAlbumForExtractMusic(Activity activity, Bundle bundle);

    void startAutoCutAnchorAlbum(Activity activity, AutoCutAnchorConfig autoCutAnchorConfig);

    void startChangeBanMusic(Aweme aweme, Activity activity, long j, ChangeBanMusicConfig changeBanMusicConfig, UIServiceCallback uIServiceCallback, String str, String str2);

    void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UIServiceCallback uIServiceCallback, String str, String str2);

    void startExteriorVideoRecordScene(Context context, ExteriorRecordModel exteriorRecordModel, AbstractBinderC539700LEq abstractBinderC539700LEq, String str, Bundle bundle, Bundle bundle2, String str2, String str3);

    IRecordPageLifecycle startFragment();

    void startImageEffectTemplateAlbum(Context context, RecordConfig recordConfig);

    void startIndependentLiveActivity(Context context, RecordConfig recordConfig);

    void startMemeSongPage(Activity activity, String str, List<MemeSongModel> list, Function2<? super List<MemeSongModel>, ? super String, Unit> function2);

    void startPhotoModeTemplateAlbum(Activity activity, PhotoModeTemplateAnchorConfig photoModeTemplateAnchorConfig);

    void startPugcAlbum(Activity activity, C573660Mei c573660Mei);

    void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z);

    void startRecord(Context context, Intent intent);

    void startRecord(Context context, RecordConfig recordConfig);

    void startRecord(Context context, RecordConfig recordConfig, Uri uri);

    void startRecord(Context context, RecordConfig recordConfig, Challenge challenge);

    void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startReusePugcTemplateAlbum(Activity activity, C573840Mf0 c573840Mf0);

    void startSoundSyncAlbum(Activity activity, SoundSyncAnchorConfig soundSyncAnchorConfig);

    void startSpecialPlusEntrance(Context context, RecordConfig recordConfig);

    void startStitch(Context context, Intent intent, StitchParams stitchParams, boolean z);

    Object startStripMusicPreview(Aweme aweme, Activity activity, long j, ChangeBanMusicConfig changeBanMusicConfig, UIServiceCallback uIServiceCallback, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void startTemplateAnchorAlbum(Activity activity, TemplateAnchorConfig templateAnchorConfig);

    void startTemplatePreviewActivity(Activity activity, C0MPJ c0mpj);

    void startUgcTemplateAnchorAlbum(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig);

    void startUgcTemplatePreviewActivity(Activity activity, UgcTemplateAnchorConfig ugcTemplateAnchorConfig, C2344009Gk c2344009Gk);

    public static final class DefaultImpls {
        public static /* synthetic */ void startAlbum$default(IRecordService iRecordService, Activity activity, C575860MiG c575860MiG, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                iRecordService.startAlbum(activity, c575860MiG, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAlbum");
        }
    }
}
