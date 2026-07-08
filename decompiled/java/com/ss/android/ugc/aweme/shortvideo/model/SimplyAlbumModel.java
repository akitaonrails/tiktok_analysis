package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class SimplyAlbumModel {
    public final Uri firstCoverUri;
    public final String id;
    public final String name;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.id);
        sbLIZ.append(", ");
        sbLIZ.append(this.name);
        sbLIZ.append(", ");
        sbLIZ.append(this.firstCoverUri);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SimplyAlbumModel(String str, String str2, Uri uri) {
        this.id = str;
        this.name = str2;
        this.firstCoverUri = uri;
    }
}
