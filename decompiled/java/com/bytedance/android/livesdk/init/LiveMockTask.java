package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C01GW;
import X.C1161920gLG;
import X.C292401Bi;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.repo.MockSettingsRepo;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.google.gson.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMockTask extends AbstractC20513081v {
    public final C01GW liveSettingsModelMap$delegate = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(51));

    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "LiveMockTask";
    }

    private final Map<String, LiveSettingModel> getLiveSettingsModelMap() {
        return (Map) this.liveSettingsModelMap$delegate.getValue();
    }

    @Override // X.AbstractC20513081v
    public void run() {
        Map<String, k> mapLIZ = ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().LIZ();
        if (mapLIZ == null) {
            return;
        }
        setSettings(mapLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setSettings(Map<String, ? extends k> map) {
        String fieldTypeName;
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            LiveSettingModel liveSettingModel = getLiveSettingsModelMap().get(entry.getKey());
            if (liveSettingModel != null && (fieldTypeName = liveSettingModel.getFieldTypeName()) != null) {
                switch (fieldTypeName.hashCode()) {
                    case -1325958191:
                        if (fieldTypeName.equals("double")) {
                            MockSettingsRepo.INSTANCE.storeDoubleValue((String) entry.getKey(), ((k) entry.getValue()).LJIIIZ());
                        }
                        break;
                    case 104431:
                        if (fieldTypeName.equals("int")) {
                            MockSettingsRepo.INSTANCE.storeIntValue((String) entry.getKey(), ((k) entry.getValue()).LJIIJJI());
                        }
                        break;
                    case 3327612:
                        if (fieldTypeName.equals("long")) {
                            MockSettingsRepo.INSTANCE.storeLongValue((String) entry.getKey(), ((k) entry.getValue()).LJIIZILJ());
                        }
                        break;
                    case 64711720:
                        if (fieldTypeName.equals("boolean")) {
                            MockSettingsRepo.INSTANCE.storeBooleanValue((String) entry.getKey(), ((k) entry.getValue()).LJ());
                        }
                        break;
                    case 97526364:
                        if (fieldTypeName.equals("float")) {
                            MockSettingsRepo.INSTANCE.storeFloatValue((String) entry.getKey(), ((k) entry.getValue()).LJIIJ());
                        }
                        break;
                    case 1195259493:
                        if (fieldTypeName.equals("java.lang.String")) {
                            MockSettingsRepo.INSTANCE.storeStringValue((String) entry.getKey(), ((k) entry.getValue()).LJIL());
                        }
                        break;
                }
            }
            MockSettingsRepo.INSTANCE.storeStringValue((String) entry.getKey(), ((k) entry.getValue()).LJIL());
        }
    }
}
