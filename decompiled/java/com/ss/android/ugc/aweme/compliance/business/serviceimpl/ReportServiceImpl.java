package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C06UM;
import X.C0C64;
import X.C1380270m1R;
import X.C20684815ws;
import X.C589830NBl;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC1381130m2p;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class ReportServiceImpl implements IReportService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String LIZLLL(Aweme aweme) {
        C1380270m1R.LIZ.getClass();
        if (aweme == null) {
            return "";
        }
        if (AwemeSaaSExtKt.isForwardAweme(aweme)) {
            return "forward";
        }
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return "image";
        }
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJFF(Map<String, String> map) {
        C1380270m1R.LIZ.getClass();
        C20684815ws.LJIILLIIL("tip_off", map);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String LJI(String str) {
        C1380270m1R.LIZ.getClass();
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    @InterfaceC1294060jmO
    public final void LIZIZ(Activity activity, Uri.Builder builder) {
        report(activity, builder, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    @InterfaceC1294060jmO
    public final void LIZJ(Activity activity, Uri.Builder builder) {
        boolean z;
        C1380270m1R.LIZ.getClass();
        C589830NBl c589830NBl = C589830NBl.LIZ;
        if (builder != null) {
            z = true;
        } else {
            z = false;
        }
        c589830NBl.getClass();
        C589830NBl.LIZ("report_url_null_check_rad", null, z);
        if (builder != null && activity != null) {
            C1380270m1R.LIZ(builder, C1380270m1R.LIZIZ);
            builder.appendQueryParameter("dst_hertz", String.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "commerce_request_api_update", true)));
            Uri uriBuild = builder.build();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("url", uriBuild.toString(), bundle);
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("hide_nav_bar", true);
            C786410Ut5.LJJJI("status_bar_color", u.LJJIFFI(activity.getResources().getString(R.color.ao), "#", "", false), bundle);
            bundle.putLong("enter_time", System.currentTimeMillis());
            InterfaceC1381130m2p interfaceC1381130m2pConvertToReportConfig = ReportConfigUtils.INSTANCE.convertToReportConfig(builder, bundle);
            com.ss.android.ugc.tiktok.report.interfaces.IReportService.LIZ.getClass();
            C06UM.LIZ().report(new AwS600S0100000_21(interfaceC1381130m2pConvertToReportConfig, 435));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.app.Activity r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl.LJ(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    @InterfaceC1294060jmO
    public final void report(Activity activity, Uri.Builder builder, Bundle bundle) {
        if (activity == null) {
            return;
        }
        C1380270m1R.LIZ.getClass();
        C1380270m1R.LIZIZ(activity, builder, bundle);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6) {
        C1380270m1R.LIZ.getClass();
        C1380270m1R.LIZJ(str, str2, str3, str4, str5, str6, null, null, null, "", null, "", 0, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i, String str11) {
        C1380270m1R.LIZ.getClass();
        C1380270m1R.LIZJ(str, str2, str3, str4, str5, str6, aweme, str7, str8, str9, context, str10, i, str11);
    }
}
