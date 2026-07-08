package com.ss.android.ugc.aweme.notification.utils;

import X.C09CT;
import X.C1388190mED;
import X.C1389890mGx;
import X.C15O7;
import X.C1907940zkW;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC2385309Wh;
import X.InterfaceC580670Mq1;
import X.ProgressDialogC1397770mTf;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;

/* JADX INFO: loaded from: classes9.dex */
public final class ShareFromWebHelper {
    public static final ShareFromWebHelper LIZ = new ShareFromWebHelper();
    public static final InterfaceC580670Mq1 LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (InterfaceC580670Mq1) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC580670Mq1.class);
    }

    public static final class ShareVideoInfo {

        @C09CT("cdn_url")
        public final String cdnUrl;

        public ShareVideoInfo(String str) {
            this.cdnUrl = str;
        }
    }

    public static void LIZ(Context context) {
        C1389890mGx c1389890mGx = new C1389890mGx(C1388190mED.LIZ(context));
        c1389890mGx.LJIIJ(context.getResources().getString(2131847886));
        c1389890mGx.LJIIJJI();
    }

    public static final class ShareVideoInfoResponse {

        @C09CT("status_code")
        public final int statusCode;

        @C09CT("video_info")
        public final ShareVideoInfo videoInfo;

        public ShareVideoInfoResponse(int i, ShareVideoInfo shareVideoInfo) {
            this.statusCode = i;
            this.videoInfo = shareVideoInfo;
        }
    }

    public static void LIZIZ(final Context context, String str) {
        Uri uri = UriProtector.parse(str);
        final String strLIZIZ = C1907940zkW.LIZIZ(uri, "video_id");
        final String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "client_name");
        final String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "share_id");
        final String strLIZIZ4 = C1907940zkW.LIZIZ(uri, "shoot_way");
        if (strLIZIZ4 == null) {
            strLIZIZ4 = "share_video_web";
        }
        final String strLIZIZ5 = C1907940zkW.LIZIZ(uri, "client_key");
        if (context != null) {
            LIZ.getClass();
            final ProgressDialogC1397770mTf progressDialogC1397770mTfLIZIZ = ProgressDialogC1397770mTf.LIZIZ(context, context.getResources().getString(2131841075));
            progressDialogC1397770mTfLIZIZ.setIndeterminate(true);
            progressDialogC1397770mTfLIZIZ.setProgress(0);
            LIZIZ.LIZ(strLIZIZ).LJ(new InterfaceC2385309Wh() { // from class: X.0Mq0
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("ShareFromWebHelper@b261.downloadVideo$1");
                    ShareFromWebHelper.ShareVideoInfoResponse shareVideoInfoResponse = (ShareFromWebHelper.ShareVideoInfoResponse) c15o7.LJIIL();
                    if (shareVideoInfoResponse != null) {
                        String str2 = strLIZIZ;
                        final ProgressDialogC1397770mTf progressDialogC1397770mTf = progressDialogC1397770mTfLIZIZ;
                        final Context context2 = context;
                        final String str3 = strLIZIZ4;
                        final String str4 = strLIZIZ3;
                        final String str5 = strLIZIZ5;
                        final String str6 = strLIZIZ2;
                        if (shareVideoInfoResponse.statusCode == 0) {
                            String str7 = shareVideoInfoResponse.videoInfo.cdnUrl;
                            final CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo));
                            sbLIZ.append("record");
                            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append(".mp4");
                            String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ2);
                            C580800MqE c580800MqE = new C580800MqE(new AbstractC580490Mpj() { // from class: X.0Mpi
                                @Override // X.AbstractC580490Mpj
                                public final void LIZ() {
                                    C786410Ut5.LJIILL(progressDialogC1397770mTf);
                                    ShareFromWebHelper shareFromWebHelper = ShareFromWebHelper.LIZ;
                                    Context context3 = context2;
                                    shareFromWebHelper.getClass();
                                    ShareFromWebHelper.LIZ(context3);
                                }

                                @Override // X.AbstractC580490Mpj
                                public final void LIZIZ(int i) {
                                    ProgressDialogC1397770mTf progressDialogC1397770mTf2 = progressDialogC1397770mTf;
                                    if (i >= 100) {
                                        i = 100;
                                    }
                                    progressDialogC1397770mTf2.setProgress(i);
                                }

                                @Override // X.AbstractC580490Mpj
                                public final void LIZJ(String str8) {
                                    C786410Ut5.LJIILL(progressDialogC1397770mTf);
                                    EditConfig.Builder builder = new EditConfig.Builder();
                                    builder.mediaInfo(new VideoMedia(str8));
                                    builder.shootWay(str3);
                                    builder.shareID(str4);
                                    builder.channel(str5);
                                    builder.hashtag(str6);
                                    builder.creationId(creativeInfo.getCreationId());
                                    IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
                                    Context context3 = context2;
                                    iExternalService.asyncService(context3, "upload", new C580820MqG(context3, builder, 0));
                                }
                            }, 0);
                            DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
                            AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(str7);
                            abstractC2199801B7qWith.LIZJ = strLIZIZ7;
                            abstractC2199801B7qWith.LJ = strLIZIZ6;
                            abstractC2199801B7qWith.LJII = 3;
                            abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
                            abstractC2199801B7qWith.LJIIL = c580800MqE;
                            abstractC2199801B7qWith.LIZJ();
                        } else {
                            C786410Ut5.LJIILL(progressDialogC1397770mTf);
                            ShareFromWebHelper.LIZ.getClass();
                            ShareFromWebHelper.LIZ(context2);
                        }
                    } else {
                        ShareFromWebHelper shareFromWebHelper = ShareFromWebHelper.LIZ;
                        ProgressDialogC1397770mTf progressDialogC1397770mTf2 = progressDialogC1397770mTfLIZIZ;
                        Context context3 = context;
                        C786410Ut5.LJIILL(progressDialogC1397770mTf2);
                        ShareFromWebHelper.LIZ.getClass();
                        ShareFromWebHelper.LIZ(context3);
                    }
                    C1C7U.LIZIZ("ShareFromWebHelper@b261.downloadVideo$1");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }
}
