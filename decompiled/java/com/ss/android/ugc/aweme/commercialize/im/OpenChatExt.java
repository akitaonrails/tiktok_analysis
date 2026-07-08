package com.ss.android.ugc.aweme.commercialize.im;

import X.C0XQ7;
import X.C1388190mED;
import X.C1910200zoA;
import X.C844470XAv;
import X.InterfaceC19725812Fs;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.BaseRoute;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class OpenChatExt extends BaseRoute implements InterfaceC19725812Fs {
    public static final OpenChatExt LL = new OpenChatExt();

    public static final boolean LIZIZ(String str) {
        String host;
        if (str == null) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String path = null;
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        if (!u.LJIJI("chatting", host, true)) {
            return false;
        }
        if (uri != null) {
            path = uri.getPath();
        }
        if (!u.LJIJI("/message", path, true)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        Activity activityLIZ;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        LIZ(activityLIZ, getUrl());
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean open(String str) {
        return LIZ(null, str);
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean LIZ(Activity activity, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        Context contextLIZ = activity;
        if (activity == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        if (u.LJIJI("chatting", uri.getHost(), true) && u.LJIJI("/message", uri.getPath(), true)) {
            LIZJ(contextLIZ, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "uid"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ext"));
            return true;
        }
        return false;
    }

    public static final void LIZJ(Context context, String str, String str2) {
        if (C0XQ7.LJFF().isLogin()) {
            new C1910200zoA(context, str, str2).LIZIZ();
            return;
        }
        String str3 = ChatCheckLoginActivity._pnsPageId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main/im/check_login");
        smartRouteBuildRoute.withParam("extra_uid", str);
        smartRouteBuildRoute.withParam("extra_ext", str2);
        smartRouteBuildRoute.open();
    }
}
