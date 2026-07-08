package com.bytedance.android.livesdk.livesetting.gecko;

import X.C1161920gLG;
import X.C15438062q;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "tt_live_gecko_cdn_base_path_opt")
public final class TtLiveGeckoCdnBasePathOptSetting {
    public static final TtLiveGeckoCdnBasePathOptSetting INSTANCE = new TtLiveGeckoCdnBasePathOptSetting();
    public static final URLConfig DEFAULT = new URLConfig();

    public final URLConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        URLConfig uRLConfig = DEFAULT;
        URLConfig uRLConfig2 = (URLConfig) settingsManager.getValueSafely("tt_live_gecko_cdn_base_path_opt", uRLConfig);
        return uRLConfig2 != null ? uRLConfig2 : uRLConfig;
    }

    public final List<String> getUrlList(String str, String str2) {
        List<String> listSingletonList;
        String[] strArr;
        URLConfig value = getValue();
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId() == 1180) {
                strArr = value.internalTestT;
            } else {
                strArr = value.internalTestM;
            }
            listSingletonList = Arrays.asList(strArr);
        } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId() == 1180) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIDCTypeUpperCase().equals("US")) {
                listSingletonList = Collections.singletonList(value.onlineT[1]);
            } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIDCTypeUpperCase().equals("EU")) {
                listSingletonList = Collections.singletonList(value.onlineT[2]);
            } else {
                listSingletonList = Collections.singletonList(value.onlineT[0]);
            }
        } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIDCTypeUpperCase().equals("US")) {
            listSingletonList = Collections.singletonList(value.onlineM[1]);
        } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIDCTypeUpperCase().equals("EU")) {
            listSingletonList = Collections.singletonList(value.onlineM[2]);
        } else {
            listSingletonList = Collections.singletonList(value.onlineM[0]);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
        for (String str3 : listSingletonList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append('/');
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(str2);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return arrayList;
    }
}
