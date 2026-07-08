package com.ss.android.ugc.aweme.services.onthisday;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class RefreshLocalMediasEvent {
    public final List<MediaModel> localMedias;

    public final List<MediaModel> getLocalMedias() {
        return this.localMedias;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshLocalMediasEvent(List<? extends MediaModel> list) {
        this.localMedias = list;
    }
}
