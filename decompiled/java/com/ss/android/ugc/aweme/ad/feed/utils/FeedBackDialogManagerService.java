package com.ss.android.ugc.aweme.ad.feed.utils;

import X.C0DHG;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C20684815ws;
import X.C341240DZi;
import X.C632670Orh;
import X.C985403tE;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.AdFeedBackUrlSetting;
import com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedBackDialogManagerService implements IFeedBackDialogManager {
    public static volatile long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        new Object() { // from class: X.0DZj
        };
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZ(String str) {
        if (LIZIZ(str) && LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final boolean LIZIZ(String str) {
        Uri uri;
        String host;
        String path;
        if (str == null || (uri = UriProtector.parse(str)) == null || (host = uri.getHost()) == null || (path = uri.getPath()) == null || AdFeedBackUrlSetting.LIZ().url == null) {
            return false;
        }
        for (String str2 : AdFeedBackUrlSetting.LIZ().url) {
            Uri uri2 = UriProtector.parse(str2);
            if (uri2 != null && Intrinsics.LJFF(uri2.getHost(), host) && Intrinsics.LJFF(uri2.getPath(), path) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_type"), "feed")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZJ(Context context, Aweme aweme) {
        String webUrl;
        AwemeRawAd awemeRawAd;
        if (context == null) {
            return;
        }
        long j = LIZ;
        LIZ = 0L;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        if (LIZIZ(webUrl) && j != 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            SettingsManager.LIZLLL().getClass();
            if (jCurrentTimeMillis >= SettingsManager.LJ("ad_feedback_dialog_time", 10)) {
                if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                    C632670Orh.LIZIZ(context, C341240DZi.LIZ);
                } else {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJFF(2131820544);
                    c1397580mTM.LIZ(2131820545);
                    C985403tE.LIZ(c1397580mTM, AFwS232S0000000_4.get$arr$(13));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
                C20684815ws.onEventV3("your_ad_activity_page_back_toast_show");
            }
        }
    }
}
