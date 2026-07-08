package com.ss.android.ugc.aweme.im.chatlist.api.service;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class PhotoSwapInlineSingleVariableConfig implements Serializable {

    @C09CT("photo_swap_action_bar_first")
    public final int isPhotoSwapActionBarFirst;

    @C09CT("photo_swap_preview")
    public final int photoSwapPreviewEnabled;

    public PhotoSwapInlineSingleVariableConfig() {
        this(0, 0);
    }

    public final int isPhotoSwapActionBarFirst() {
        return this.isPhotoSwapActionBarFirst;
    }

    public PhotoSwapInlineSingleVariableConfig(int i, int i2) {
        this.photoSwapPreviewEnabled = i;
        this.isPhotoSwapActionBarFirst = i2;
    }
}
