package com.ss.android.ugc.aweme.share;

import X.C0WZX;
import X.C1402840mbq;
import X.C1701330uNH;
import X.C1720106oR;
import X.C1B45;
import X.C1B46;
import X.C1B4F;
import X.C2187451AjH;
import X.C2198841B3y;
import X.C2204961BRm;
import X.C2429209fW;
import X.C839020Wvk;
import X.C844470XAv;
import X.InterfaceC1413210msZ;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.openshare.Share$Response;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareRespSendServiceImpl implements IShareRespSendService {
    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final InterfaceC1413210msZ LIZJ() {
        return new InterfaceC1413210msZ() { // from class: X.0msX
            @Override // X.InterfaceC1413210msZ
            public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
            }

            @Override // X.InterfaceC1413210msZ
            public final void LIZ(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
                C1402840mbq c1402840mbqLIZLLL = C1B46.LIZLLL(baseShortVideoContext);
                if (c1402840mbqLIZLLL != null) {
                    if (c1402840mbqLIZLLL.mClientKey != null && !linkedHashMap.containsKey("open_platform_key")) {
                        linkedHashMap.put("open_platform_key", c1402840mbqLIZLLL.mClientKey);
                    }
                    if (c1402840mbqLIZLLL.mOpenPlatformExtra != null && !linkedHashMap.containsKey("open_platform_extra")) {
                        linkedHashMap.put("open_platform_extra", c1402840mbqLIZLLL.mOpenPlatformExtra);
                    }
                    String str = c1402840mbqLIZLLL.mState;
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("open_platform_share_id", str);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZ(Activity activity) {
        if (activity instanceof SystemShareActivity) {
            ((SystemShareActivity) activity).finish();
        }
    }

    public static void LJI(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkgF7rojJinG8zW5D0l33msgAGTgWpaf3ag==", null));
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZLLL(Activity activity, C1B45 c1b45) {
        C1402840mbq c1402840mbq;
        String str;
        C1B46 c1b46 = C1B46.LIZ;
        Intent intent = activity.getIntent();
        c1b46.getClass();
        if (intent.hasExtra("extra_share_context") && (c1402840mbq = (C1402840mbq) intent.getSerializableExtra("extra_share_context")) != null) {
            if (TextUtils.isEmpty(c1402840mbq.mClientKey)) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("ShareRespSendServiceImpl", "sendResponseWithDmStatus has empty clientKey");
                return;
            }
            String str2 = c1402840mbq.mClientKey;
            if (str2 != null && str2.length() != 0) {
                str = "sdk";
            } else {
                str = "system_share";
            }
            C2198841B3y.LJI(str2, str, c1402840mbq.getSdkNameForServer(), c1402840mbq.mSdkVersion, c1b45);
            Share$Request share$RequestLJ = C1B46.LJ(c1402840mbq.getShareRequestBundle());
            if (share$RequestLJ == null) {
                return;
            }
            Share$Response share$Response = new Share$Response();
            share$Response.errorCode = c1b45.LIZ;
            share$Response.setSubErrorCode(c1b45.LIZIZ);
            share$Response.setState(share$RequestLJ.getMState());
            share$Response.errorMsg = c1b45.LIZJ;
            LJII(this, activity, share$RequestLJ, share$Response);
        }
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LJFF(Activity activity, C1402840mbq c1402840mbq) {
        int i = C2187451AjH.LIZ;
        if (TextUtils.isEmpty(c1402840mbq.mClientKey)) {
            C1720106oR.LJI("ShareRespSendServiceImpl", "SendSuccessResponse has empty clientKey");
            return;
        }
        C1B46 c1b46 = C1B46.LIZ;
        Bundle shareRequestBundle = c1402840mbq.getShareRequestBundle();
        c1b46.getClass();
        Share$Request share$RequestLJ = C1B46.LJ(shareRequestBundle);
        if (share$RequestLJ == null) {
            C1720106oR.LIZ("ShareRespSendServiceImpl", "getting shareRequest from shareRequestBundle is null");
            return;
        }
        Share$Response share$Response = new Share$Response();
        share$Response.errorCode = 0;
        share$Response.setState(share$RequestLJ.getMState());
        share$Response.setSubErrorCode(20000);
        share$Response.setRequestId(c1402840mbq.requestId);
        LJII(this, activity, share$RequestLJ, share$Response);
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZIZ(Activity activity, C1402840mbq c1402840mbq, C1B4F c1b4f) {
        int i = C2187451AjH.LIZ;
        if (TextUtils.isEmpty(c1402840mbq.mClientKey)) {
            C1720106oR.LJI("ShareRespSendServiceImpl", "SendFailResponse has empty clientKey");
            return;
        }
        C1B46 c1b46 = C1B46.LIZ;
        Bundle shareRequestBundle = c1402840mbq.getShareRequestBundle();
        c1b46.getClass();
        Share$Request share$RequestLJ = C1B46.LJ(shareRequestBundle);
        if (share$RequestLJ == null) {
            return;
        }
        Share$Response share$Response = new Share$Response();
        share$Response.setSubErrorCode(c1b4f.LIZIZ);
        share$Response.errorCode = c1b4f.LIZ;
        share$Response.setState(share$RequestLJ.getMState());
        share$Response.errorMsg = c1b4f.LIZJ;
        share$Response.setRequestId(c1402840mbq.requestId);
        LJII(this, activity, share$RequestLJ, share$Response);
    }

    public static void LJII(ShareRespSendServiceImpl shareRespSendServiceImpl, Activity activity, Share$Request share$Request, Share$Response share$Response) {
        shareRespSendServiceImpl.getClass();
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207969288, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            boolean z = AutoDFIDManager.LIZIZ;
            String callerPackage = share$Request.getCallerPackage();
            C844470XAv.LIZ.getClass();
            String packageName = C844470XAv.LIZ().getPackageName();
            if (callerPackage != null && !TextUtils.equals(packageName, callerPackage)) {
                String callerLocalEntry = share$Request.getCallerLocalEntry();
                if (callerPackage.length() != 0 && callerLocalEntry != null && callerLocalEntry.length() != 0) {
                    Bundle bundle = new Bundle();
                    share$Response.toBundle(bundle);
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(callerPackage, callerLocalEntry));
                    intent.putExtras(bundle);
                    if (Build.VERSION.SDK_INT >= 29) {
                        intent.setIdentifier("third_party_app_identifier");
                    }
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207969288);
                    intent.putExtra("enableAutoDFID", z);
                    try {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LIZ("ShareRespSendServiceImpl", "sendResponse#startActivity callerPackageName: " + callerPackage + " callerLocalActivityClass: " + callerLocalEntry);
                        LJI(activity, intent);
                        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                        if (iCreativeSAAService != null) {
                            iCreativeSAAService.finishCurrentPage(activity);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LIZ("ShareRespSendServiceImpl", "sendResponse#startActivity exception: " + e + ": " + e.getMessage());
                        ICreativeSAAService iCreativeSAAService2 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                        if (iCreativeSAAService2 != null) {
                            iCreativeSAAService2.finishCurrentPage(activity);
                        }
                    }
                    AutoDFIDManager.LIZIZ();
                    return;
                }
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("ShareRespSendServiceImpl", "sendResponse callerLocalActivityClass is null or empty or callerPackageName is empty");
                ICreativeSAAService iCreativeSAAService3 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService3 != null) {
                    iCreativeSAAService3.finishCurrentPage(activity);
                }
                AutoDFIDManager.LIZIZ();
                return;
            }
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("ShareRespSendServiceImpl", "sendResponse callerPackageName is null or callerPackName is pkgName");
            ICreativeSAAService iCreativeSAAService4 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService4 != null) {
                iCreativeSAAService4.finishCurrentPage(activity);
            }
            AutoDFIDManager.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LJ(Activity activity, C1402840mbq c1402840mbq, Share$Request share$Request, Share$Response share$Response) {
        int i = C2187451AjH.LIZ;
        if (!TextUtils.isEmpty(c1402840mbq.mClientKey)) {
            C1B46 c1b46 = C1B46.LIZ;
            Bundle shareRequestBundle = c1402840mbq.getShareRequestBundle();
            c1b46.getClass();
            if (C1B46.LJ(shareRequestBundle) != null) {
                LJII(this, activity, share$Request, share$Response);
                return;
            }
        }
        C1720106oR.LIZ("ShareRespSendServiceImpl", "SendFailResponse has empty clientKey or shareRequest is null");
    }
}
