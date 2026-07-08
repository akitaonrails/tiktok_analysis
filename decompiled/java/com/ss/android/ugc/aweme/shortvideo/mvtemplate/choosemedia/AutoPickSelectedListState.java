package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoPickSelectedListState implements C004I {
    public static final int $stable = 8;
    public final ArrayList<TikTokMediaModel> mediaList;
    public final long value;

    public final AutoPickSelectedListState copy(ArrayList<TikTokMediaModel> arrayList, long j) {
        return new AutoPickSelectedListState(arrayList, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPickSelectedListState)) {
            return false;
        }
        AutoPickSelectedListState autoPickSelectedListState = (AutoPickSelectedListState) obj;
        return Intrinsics.LJFF(this.mediaList, autoPickSelectedListState.mediaList) && this.value == autoPickSelectedListState.value;
    }

    public int hashCode() {
        return (this.mediaList.hashCode() * 31) + C786410Ut5.Y2(this.value);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickSelectedListState(mediaList=");
        sbLIZ.append(this.mediaList);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoPickSelectedListState() {
        this(new ArrayList(), 0L);
    }

    public final ArrayList<TikTokMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final long getValue() {
        return this.value;
    }

    public AutoPickSelectedListState(ArrayList<TikTokMediaModel> arrayList, long j) {
        this.mediaList = arrayList;
        this.value = j;
    }
}
