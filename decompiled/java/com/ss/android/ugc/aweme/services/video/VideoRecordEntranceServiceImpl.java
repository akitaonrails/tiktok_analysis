package com.ss.android.ugc.aweme.services.video;

import X.C01GW;
import X.C452501pT;
import X.C535670Kzd;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS1S0230000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final C01GW<VideoRecordEntranceServiceImpl> INSTANCE$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(118));

    public static final class Companion {
        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }
    }

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChangeBanMusicEditActivity(Context context, Intent intent) {
        executeEntryIfPluginReadyOrSkip(context, intent, new AwS409S0200000_8(context, intent, 23));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        executeEntryIfPluginReadyOrSkip(activity, intent, new AwS409S0200000_8(activity, intent, 24));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Activity activity, Intent intent) {
        executeEntryIfPluginReadyOrSkip(activity, intent, new AwS409S0200000_8(activity, intent, 25));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Context context, Intent intent) {
        executeEntryIfPluginReadyOrSkip(context, intent, new AwS409S0200000_8(context, intent, 26));
    }

    private final void executeEntryIfPluginReadyOrSkip(Context context, Intent intent, Function0<Unit> function0) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (intent == null || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "shoot_way")) == null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
        }
        C535670Kzd.LIZ().LIZLLL(context, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_services_video_VideoRecordEntranceServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, function0);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChoosePhotoActivity(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        executeEntryIfPluginReadyOrSkip(activity, intent, new AwS252S0300000_8(activity, intent, photoMvAnchorConfig, 7));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChoosePhotoActivityWithMusic(Activity activity, Intent intent, MusicModel musicModel) {
        executeEntryIfPluginReadyOrSkip(activity, intent, new AwS252S0300000_8(activity, intent, musicModel, 8));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        executeEntryIfPluginReadyOrSkip(context, intent, new AwS1S0230000_8(context, intent, z, z2, z3, 0));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        executeEntryIfPluginReadyOrSkip(activity, intent, new AwS1S0230000_8(activity, intent, z, z2, z3, 1));
    }
}
