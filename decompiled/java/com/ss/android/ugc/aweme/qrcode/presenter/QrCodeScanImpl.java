package com.ss.android.ugc.aweme.qrcode.presenter;

import X.C1394200mNu;
import X.C1697810uHb;
import X.InterfaceC1389750mGj;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeScanImpl implements QrCodeScanService {
    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final String getSecurityUrl(String str) {
        return ((IMainService) ServiceManager.get().getService(IMainService.class)).getSecurityUrl(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJ(Context context, String str) {
        if (context == null) {
            return;
        }
        SmartRoute smartRouteLIZ = C1394200mNu.LIZ.LIZ(context, str, "scan");
        smartRouteLIZ.withParam("extra_stickers", C1697810uHb.LJ(str));
        smartRouteLIZ.withParam("extra_sticker_from", "reuse");
        smartRouteLIZ.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJII(Context context, String str) {
        ((IMainService) ServiceManager.get().getService(IMainService.class)).openDeepLinkActivity(context, str, "QrCode");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZ(String str, Activity activity, InterfaceC1389750mGj interfaceC1389750mGj) {
        MovieReuseServiceImpl.LJ().LIZ(str, activity, interfaceC1389750mGj);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZJ(Context context, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
        smartRouteBuildRoute.withParam("refer", str2);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJFF(Context context, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//challenge/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
        smartRouteBuildRoute.withParam("extra_challenge_from", str2);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJI(Context context, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//music/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
        smartRouteBuildRoute.withParam("extra_music_from", str2);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2) {
        return ((IMainService) ServiceManager.get().getService(IMainService.class)).checkIsMinAppVersionNotSatisfied(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void downloadStickerHelper(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener) {
        ((IMainService) ServiceManager.get().getService(IMainService.class)).downloadStickerHelper(str, str2, activity, z, downLoadFinishListener);
    }
}
