package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.C0IJO;
import X.C1037520d6c;
import X.C1968907nT;
import X.C1AF0;
import X.C786410Ut5;
import X.InterfaceC1037470d6X;
import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DownloadBusinessServiceImpl implements IDownloadBusinessService {
    @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.IDownloadBusinessService
    public final void LIZIZ(C1968907nT c1968907nT, Activity activity) {
        c1968907nT.LIZ(DownloadBusiness.class).getClass();
        activity.findViewById(R.id.a81);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.IDownloadBusinessService
    public final void LIZ(C1968907nT c1968907nT, Activity activity, InterfaceC1037470d6X interfaceC1037470d6X) {
        DownloadBusiness downloadBusiness = (DownloadBusiness) c1968907nT.LIZ(DownloadBusiness.class);
        downloadBusiness.getClass();
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.a81);
        C786410Ut5.LJZ(8, frameLayout);
        C1037520d6c c1037520d6c = downloadBusiness.LIZLLL;
        Bundle bundle = downloadBusiness.LIZIZ.LIZ.LIZ;
        c1037520d6c.getClass();
        if (bundle != null) {
            c1037520d6c.LIZ = bundle.getString("aweme_creative_id", "");
            bundle.getString("aweme_group_id", "");
            bundle.getString("bundle_download_app_log_extra");
            bundle.getString("aweme_package_name");
            bundle.getString("bundle_download_url");
            bundle.getString("bundle_download_app_name");
            bundle.getInt("bundle_app_ad_from", 0);
            bundle.getString("bundle_download_app_extra");
            bundle.getInt("bundle_download_mode");
            bundle.getBoolean("bundle_support_multiple_download");
            try {
                new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            bundle.getString("bundle_ad_quick_app_url");
            try {
                CastLongProtector.parseLong(c1037520d6c.LIZ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        }
        C786410Ut5.O7(frameLayout, new C0IJO());
        interfaceC1037470d6X.LIZ().LJFF();
    }
}
