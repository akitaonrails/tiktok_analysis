package com.ss.android.ugc.aweme.footnote.detail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes5.dex */
public final class FootNoteDetailFeedRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri;
        if (str == null || (uri = UriProtector.parse(str)) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        smartRouteBuildRoute.withParam("video_type", 124);
        smartRouteBuildRoute.withParam("video_from", "from_footnote_feed");
        smartRouteBuildRoute.withParam("enter_from", "footnote_feed_list_vm_key");
        smartRouteBuildRoute.withParam("refer", "footnote_feed");
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }
}
