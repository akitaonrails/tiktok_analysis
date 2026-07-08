package com.ss.android.ugc.aweme.settingsrequest;

import X.C0C4R;
import X.C0C58;
import X.C0C5A;
import X.C0C76;
import X.C0C77;
import X.C0C7T;
import X.C0C7U;
import X.C0CJ2;
import X.C1259804wO;
import X.C2502809rO;
import X.C2502909rP;
import X.C274620ApY;
import X.C279100Awm;
import X.C296760BkA;
import X.C307730C4l;
import X.C799890VZj;
import X.C799900VZk;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingManagerServiceImpl implements ISettingManagerService {
    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void LIZ() {
        C0C58 c0c58 = C0C58.LIZJ;
        c0c58.LIZ.LIZIZ().clear();
        c0c58.LIZ.LJ().clear();
        C0C5A.LIZJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void LIZIZ(int i) {
        ConfigItem configItem;
        boolean zBooleanValue = ((Boolean) C274620ApY.LIZ.getValue()).booleanValue();
        ((Boolean) C0C77.LIZ.getValue()).booleanValue();
        if (C0C76.LIZ() != null) {
            C0C76.LIZ().isOpen();
        }
        if (zBooleanValue) {
            C0C7T c0c7t = new C0C7T();
            if (i == 1 || i == 2) {
                C0C7U c0c7u = c0c7t.LJ;
                c0c7u.getClass();
                System.currentTimeMillis();
                c0c7u.LIZIZ().storeBoolean(c0c7u.LJIIIIZZ, true);
                List<String> list = C2502909rP.LIZ;
                Map<String, ConfigItem> map = C2502809rO.LIZ;
                Map<String, ConfigItem> map2 = C2502809rO.LIZIZ;
                for (String str : (ArrayList) list) {
                    C307730C4l c307730C4l = C307730C4l.LIZLLL;
                    if (c307730C4l.contains(str) && ((configItem = (ConfigItem) ((HashMap) map).get(str)) != null || (configItem = (ConfigItem) ((HashMap) map2).get(str)) != null)) {
                        SaveConfigType$ConfigType saveConfigType$ConfigType = configItem.type;
                        if (saveConfigType$ConfigType != null) {
                            switch (C0C4R.LIZ[saveConfigType$ConfigType.ordinal()]) {
                                case 1:
                                    c0c7u.LIZ.put(str, Boolean.valueOf(c307730C4l.LIZJ(str, false)));
                                    break;
                                case 2:
                                    c0c7u.LIZ.put(str, Integer.valueOf(c307730C4l.LIZ(str, 0)));
                                    break;
                                case 3:
                                    c0c7u.LIZ.put(str, Long.valueOf(c307730C4l.LJ(str, 0L)));
                                    break;
                                case 4:
                                    c0c7u.LIZ.put(str, Double.valueOf(c307730C4l.LJI(str, 0.0d)));
                                    break;
                                case 5:
                                case 6:
                                    c0c7u.LIZ.put(str, c307730C4l.LIZIZ(str, null));
                                    break;
                                case 7:
                                    c0c7u.LIZ.put(str, c307730C4l.LJFF(str));
                                    break;
                                case 8:
                                    c0c7u.LIZ.put(str, Float.valueOf(c307730C4l.LIZLLL(str, 0.0f)));
                                    break;
                            }
                        }
                    }
                }
                System.currentTimeMillis();
                C2502909rP.LIZ();
            }
            if (C279100Awm.LIZ()) {
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new FetchABTestCommonOptimizedChunkTask(i, c0c7t));
                c799890VZj.LIZIZ();
                return;
            }
            if (C296760BkA.LIZIZ()) {
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj2 = new C799890VZj();
                c799890VZj2.LIZ(new FetchABTestCommonOptimizedTask(i, c0c7t));
                c799890VZj2.LIZIZ();
                return;
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj3 = new C799890VZj();
            c799890VZj3.LIZ(new FetchABTestCommonOptimizedRequest(i, c0c7t));
            c799890VZj3.LIZIZ();
            return;
        }
        if (i == 1 || i == 2) {
            C2502909rP.LIZ();
        }
        boolean zLJ = C0CJ2.LJ();
        int iLIZ = C1259804wO.LIZ();
        if (zLJ && iLIZ == 2) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj4 = new C799890VZj();
            c799890VZj4.LIZ(new FetchABTestCommonChunkTask(i));
            c799890VZj4.LIZIZ();
            return;
        }
        if (C279100Awm.LIZ()) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj5 = new C799890VZj();
            c799890VZj5.LIZ(new FetchABTestCommonChunkTask(i));
            c799890VZj5.LIZIZ();
            return;
        }
        if (C296760BkA.LIZIZ()) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj6 = new C799890VZj();
            c799890VZj6.LIZ(new FetchABTestCommonTask(i));
            c799890VZj6.LIZIZ();
            return;
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj7 = new C799890VZj();
        c799890VZj7.LIZ(new FetchABTestCommonRequest(i));
        c799890VZj7.LIZIZ();
    }
}
