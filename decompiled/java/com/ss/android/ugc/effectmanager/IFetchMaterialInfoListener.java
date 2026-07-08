package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public interface IFetchMaterialInfoListener extends IEffectPlatformBaseListener<List<? extends MaterialResource>> {
    void onFail(ExceptionResult exceptionResult);

    void onSuccess(List<MaterialResource> list);
}
