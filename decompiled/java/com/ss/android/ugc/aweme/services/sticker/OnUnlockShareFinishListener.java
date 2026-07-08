package com.ss.android.ugc.aweme.services.sticker;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public interface OnUnlockShareFinishListener {
    void onShareAppFailed();

    void onShareAppSucceed(Effect effect);

    void onVKShareSucceed(Effect effect);
}
