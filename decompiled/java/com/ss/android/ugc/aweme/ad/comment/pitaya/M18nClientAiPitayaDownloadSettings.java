package com.ss.android.ugc.aweme.ad.comment.pitaya;

import X.C09CT;
import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class M18nClientAiPitayaDownloadSettings {
    public static final PitayaKeyNameModel LIZ() {
        try {
            return (PitayaKeyNameModel) SettingsManager.LIZLLL().LJIIIIZZ("app_m10n_client_ai_pitaya_download_settings", PitayaKeyNameModel.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    public static final class PitayaKeyNameModel {

        @C09CT("client_ai_download_names")
        public final List<String> keyNameList;

        public PitayaKeyNameModel(List<String> list) {
            this.keyNameList = list;
        }
    }
}
