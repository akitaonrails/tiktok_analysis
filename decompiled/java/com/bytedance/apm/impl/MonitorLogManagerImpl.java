package com.bytedance.apm.impl;

import X.C792240V5y;
import X.InterfaceC792250V5z;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorLogManagerImpl implements IMonitorLogManager {
    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j, long j2, String str, InterfaceC792250V5z interfaceC792250V5z) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        return C792240V5y.LIZ().LIZ.LIZ;
    }
}
