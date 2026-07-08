package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IFetchFavoriteList extends IEffectPlatformBaseListener<FetchFavoriteListResponse> {
    void onFailed(ExceptionResult exceptionResult);
}
