package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public interface IReadUpdateTagListener extends IEffectPlatformBaseListener<HashMap<String, String>> {
    void onFailed(ExceptionResult exceptionResult);
}
