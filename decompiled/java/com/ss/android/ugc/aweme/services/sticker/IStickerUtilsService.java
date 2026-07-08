package com.ss.android.ugc.aweme.services.sticker;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes30.dex */
public interface IStickerUtilsService {
    boolean hasUnlocked(Effect effect);

    boolean idUnlocked(String str);

    boolean isLockSticker(Effect effect);

    boolean isScanUnLockType(String str);

    boolean isStickerPreviewable(Effect effect);
}
