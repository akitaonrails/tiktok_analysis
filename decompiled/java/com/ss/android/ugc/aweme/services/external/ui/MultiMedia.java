package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiMedia implements MediaInfo {
    public Bundle extraBundle;
    public final ArrayList<MediaModel> medias;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getMedias() {
        return this.medias;
    }

    public MultiMedia(ArrayList<MediaModel> arrayList) {
        this.medias = arrayList;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }
}
