package com.ss.android.ugc.aweme.services.ttep;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes31.dex */
public interface IDownloadCallback {
    void onFail(int i, String str, Exception exc);

    void onSuccess(Effect effect);
}
