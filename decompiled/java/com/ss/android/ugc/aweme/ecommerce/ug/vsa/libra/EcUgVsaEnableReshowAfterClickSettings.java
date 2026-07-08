package com.ss.android.ugc.aweme.ecommerce.ug.vsa.libra;

import X.C09CT;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcUgVsaEnableReshowAfterClickSettings {
    public static final EcUgVsaEnableReshowAfterClickModel LIZ = new EcUgVsaEnableReshowAfterClickModel(null);

    public static final class EcUgVsaEnableReshowAfterClickModel {

        @C09CT("enable_host_path")
        public final List<String> enableHostPath;

        public EcUgVsaEnableReshowAfterClickModel() {
            this(null);
        }

        public EcUgVsaEnableReshowAfterClickModel(List<String> list) {
            this.enableHostPath = list;
        }
    }

    public static boolean LIZ(String str) {
        EcUgVsaEnableReshowAfterClickModel ecUgVsaEnableReshowAfterClickModel;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ecUgVsaEnableReshowAfterClickModel = LIZ;
            EcUgVsaEnableReshowAfterClickModel ecUgVsaEnableReshowAfterClickModel2 = (EcUgVsaEnableReshowAfterClickModel) settingsManagerLIZLLL.LJIIIIZZ("ec_ug_vsa_enable_reshow_after_click", EcUgVsaEnableReshowAfterClickModel.class, ecUgVsaEnableReshowAfterClickModel);
            if (ecUgVsaEnableReshowAfterClickModel2 != null) {
                ecUgVsaEnableReshowAfterClickModel = ecUgVsaEnableReshowAfterClickModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecUgVsaEnableReshowAfterClickModel = LIZ;
        }
        List<String> list = ecUgVsaEnableReshowAfterClickModel.enableHostPath;
        if (list == null || list.isEmpty()) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            return list.contains(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }
}
