package com.ss.android.ugc.aweme.services.config;

import X.C0C64;
import X.C1403010mc7;
import X.C20642515q3;
import X.C538540LAe;
import X.C790290UzL;
import X.InterfaceC20011613Rq;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes32.dex */
public abstract class ShortVideoConfigBaseImpl implements IShortVideoConfig {
    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long extendedDuetOrStitchTime() {
        return 600500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isHookLibrary() {
        return C790290UzL.LIZ.getBoolean("key_ve_hook_switch", false);
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxConsumerDuetOrStitchVideoTime() {
        C1403010mc7.LIZ.LJI().getClass();
        return ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIIL() ? 600500L : 180500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean getUsingOnline() {
        return Intrinsics.LJFF(C0C64.LJIILLIIL().LJJ(31744, "localtest_effect_inhouse_property", "1,2,3,4,5", true), "");
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecording() {
        return o.LJI();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxCreatorDuetOrStitchVideoTime() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("allow_3m_to_10m_video_duet_and_stitch_creator", true) ? 600500L : 180500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public void enableHookLibrary(boolean z) {
        C790290UzL.LIZ.storeBoolean("key_ve_hook_switch", z);
        if (z) {
            C790290UzL.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public String getErrorHintWhenDisableDuetOrStitch(int i) {
        int iMaxCreatorDuetOrStitchVideoTime = (int) ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime();
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return C20642515q3.LIZ().getString(2131830048, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
        }
        return C20642515q3.LIZ().getString(2131829828, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecordSessionUI(Activity activity) {
        return activity instanceof InterfaceC20011613Rq;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecordSessionUIPage(Object obj) {
        return obj instanceof InterfaceC20011613Rq;
    }
}
