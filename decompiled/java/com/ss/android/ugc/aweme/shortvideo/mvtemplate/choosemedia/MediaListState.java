package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaListState implements C004I {
    public static final int $stable = 8;
    public final ArrayList<TikTokMediaModel> mediaList;
    public final String photoSearchType;
    public final long value;

    public final MediaListState copy(ArrayList<TikTokMediaModel> arrayList, long j, String str) {
        return new MediaListState(arrayList, j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaListState)) {
            return false;
        }
        MediaListState mediaListState = (MediaListState) obj;
        return Intrinsics.LJFF(this.mediaList, mediaListState.mediaList) && this.value == mediaListState.value && Intrinsics.LJFF(this.photoSearchType, mediaListState.photoSearchType);
    }

    public int hashCode() {
        int iHashCode = ((this.mediaList.hashCode() * 31) + C786410Ut5.Y2(this.value)) * 31;
        String str = this.photoSearchType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaListState(mediaList=");
        sbLIZ.append(this.mediaList);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", photoSearchType=");
        sbLIZ.append(this.photoSearchType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ArrayList<TikTokMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final String getPhotoSearchType() {
        return this.photoSearchType;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaListState(ArrayList<TikTokMediaModel> arrayList, long j, String str) {
        this.mediaList = arrayList;
        this.value = j;
        this.photoSearchType = str;
    }
}
