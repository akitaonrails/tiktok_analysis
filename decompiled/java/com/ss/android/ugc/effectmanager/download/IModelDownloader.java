package com.ss.android.ugc.effectmanager.download;

import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;

/* JADX INFO: loaded from: classes31.dex */
public interface IModelDownloader {
    long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace);
}
