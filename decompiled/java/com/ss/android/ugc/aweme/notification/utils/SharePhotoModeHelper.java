package com.ss.android.ugc.aweme.notification.utils;

import X.C09CT;
import X.C1388190mED;
import X.C1389890mGx;
import X.C15O7;
import X.C1907940zkW;
import X.C1909620znE;
import X.C19335210kg;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1909610znD;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SharePhotoModeHelper {
    public static final SharePhotoModeHelper LIZ = new SharePhotoModeHelper();
    public static final InterfaceC1909610znD LIZIZ = (InterfaceC1909610znD) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1909610znD.class);

    public static void LIZ(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(context.getResources().getString(2131847886));
            c1389890mGx.LJIIJJI();
        }
    }

    public static final class SharePhotoModeInfoResponse {

        @C09CT("photo_info")
        public final SharePhotoModeInfo photoModeInfo;

        @C09CT("status_code")
        public final int statusCode;

        public SharePhotoModeInfoResponse(int i, SharePhotoModeInfo sharePhotoModeInfo) {
            this.statusCode = i;
            this.photoModeInfo = sharePhotoModeInfo;
        }
    }

    public static void LIZIZ(Context context, String str, String str2) {
        Uri uri = UriProtector.parse(str);
        String strLIZIZ = C1907940zkW.LIZIZ(uri, "photo_id");
        String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "shoot_way");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "ttop_photo_share";
        }
        String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "open_platform_share_id");
        String str3 = "";
        if (strLIZIZ3 == null) {
            strLIZIZ3 = "";
        }
        String strLIZIZ4 = C1907940zkW.LIZIZ(uri, "open_platform_key");
        if (strLIZIZ4 != null) {
            str3 = strLIZIZ4;
        }
        if (context != null) {
            LIZ.getClass();
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJ(2131858117);
            dialogC1389620mGW.LJJLIIJ(false);
            dialogC1389620mGW.LJJLL(false);
            C786410Ut5.B4(dialogC1389620mGW);
            dialogC1389620mGW.setCanceledOnTouchOutside(true);
            LIZIZ.LIZ(strLIZIZ).LJ(new C19335210kg(context, new C1909620znE(context, str2, strLIZIZ2, strLIZIZ3, str3, dialogC1389620mGW), 0), C15O7.LJIIIIZZ, null);
        }
    }

    public static final class SharePhotoModeInfo {

        @C09CT("photo_cover_index")
        public final int coverIndex;

        @C09CT("description")
        public final String description;

        @C09CT("photo_urls")
        public final List<String> photoUrls;

        @C09CT("title")
        public final String title;

        public SharePhotoModeInfo(List<String> list, int i, String str, String str2) {
            this.photoUrls = list;
            this.coverIndex = i;
            this.title = str;
            this.description = str2;
        }
    }
}
