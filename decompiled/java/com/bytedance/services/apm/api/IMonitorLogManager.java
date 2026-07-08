package com.bytedance.services.apm.api;

import X.InterfaceC792250V5z;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IMonitorLogManager extends IService {
    void deleteLegacyLogByIds(String str, String str2);

    void getLegacyLog(long j, long j2, String str, InterfaceC792250V5z interfaceC792250V5z);

    List<JSONObject> getRecentUiActionRecords();
}
