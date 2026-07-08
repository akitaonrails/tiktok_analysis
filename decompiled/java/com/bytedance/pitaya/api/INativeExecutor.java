package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes33.dex */
public interface INativeExecutor extends ReflectionCall {
    void releaseNativeEngine(String str);

    void runNativeTask(String str, PTYNativeTaskData pTYNativeTaskData, PTYNativeTaskConfig pTYNativeTaskConfig, PTYTaskResultCallback pTYTaskResultCallback);
}
