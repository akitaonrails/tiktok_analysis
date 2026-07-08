package com.bytedance.business.base;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public interface IBusinessToolsService extends IBugReportService {
    void initialize(Application application, BusinessToolsConfig businessToolsConfig);
}
