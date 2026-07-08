package com.bytedance.pitaya.api;

import android.content.Context;
import com.bytedance.pitaya.api.bean.PTYCleanStrategy;
import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;

/* JADX INFO: loaded from: classes33.dex */
public interface IPitayaCore extends PitayaFE {
    void cleanStorage(Context context, PTYCleanStrategy pTYCleanStrategy, PTYNormalCallback pTYNormalCallback);

    void downloadPackage(String str, PTYPackageCallback pTYPackageCallback);

    void ensurePackageReady(String str, double d, boolean z, PTYPackageCallback pTYPackageCallback);

    String getAid();

    boolean isPreloadReady();

    boolean isReady();

    void preCreateLLMEngine(String str);

    void preDownloadAllPackage();

    void queryPackage(String str, PTYPackageCallback pTYPackageCallback);

    void registerCustomTaskHandler(String str, PTYTaskResultCallback pTYTaskResultCallback);

    void releaseAllEngines();

    void releaseEngine(String str);

    void releaseLLMEngine(String str);

    void releaseNativeEngine(String str);

    void removeCustomTaskHandler(String str);

    void requestUpdate(String str, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback);

    void requestUpdateAll();

    void runLLMTask(String str, String str2, String str3, PTYTaskData pTYTaskData, PTYTaskResultCallback pTYTaskResultCallback);

    void runNativeTask(String str, PTYNativeTaskData pTYNativeTaskData, PTYNativeTaskConfig pTYNativeTaskConfig, PTYTaskResultCallback pTYTaskResultCallback);

    void runTask(String str, PTYTaskData pTYTaskData, PTYTaskConfig pTYTaskConfig, PTYTaskResultCallback pTYTaskResultCallback);

    void runTask(String str, PTYTaskData pTYTaskData, PTYTaskConfig pTYTaskConfig, PTYTaskResultCallback pTYTaskResultCallback, PTYTaskResultCallback pTYTaskResultCallback2);

    void setAid(String str);

    void setup(Context context, PTYSetupInfo pTYSetupInfo, PTYSetupCallback pTYSetupCallback);

    void socketLogError(String str);

    void socketLogInfo(String str);

    void socketLogWarn(String str);

    void stopAllDownloadTask();
}
