package com.ss.android.ugc.gamora.recorder.configs;

import X.C0C64;
import X.C0CHQ;

/* JADX INFO: loaded from: classes5.dex */
public final class UpdateAlbumUploadButtonPlaceholderImage {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final UpdateAlbumUploadButtonPlaceholderImage INSTANCE = new UpdateAlbumUploadButtonPlaceholderImage();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "update_album_button_image", true, false) && !C0CHQ.LIZ().getAccountService().LIZ();
    }
}
