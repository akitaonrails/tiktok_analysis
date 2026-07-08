package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.ClipsModel;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiSegmentPropExtra implements Serializable, Parcelable {
    public static final Parcelable.Creator<MultiSegmentPropExtra> CREATOR = new Parcelable.Creator<MultiSegmentPropExtra>() { // from class: X.0L9e
        @Override // android.os.Parcelable.Creator
        public final MultiSegmentPropExtra createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ClipsModel.CREATOR.createFromParcel(parcel));
            }
            return new MultiSegmentPropExtra(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiSegmentPropExtra[] newArray(int i) {
            return new MultiSegmentPropExtra[i];
        }
    };

    @C09CT("clips")
    public final List<ClipsModel> clips;

    public final MultiSegmentPropExtra copy(List<ClipsModel> list) {
        return new MultiSegmentPropExtra(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiSegmentPropExtra) && Intrinsics.LJFF(this.clips, ((MultiSegmentPropExtra) obj).clips);
    }

    public int hashCode() {
        return this.clips.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiSegmentPropExtra(clips=");
        sbLIZ.append(this.clips);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ClipsModel> list = this.clips;
        parcel.writeInt(list.size());
        Iterator<ClipsModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final boolean checkValid() {
        boolean z = this.clips.size() <= 6;
        double duration = 0.0d;
        for (ClipsModel clipsModel : this.clips) {
            duration += (double) clipsModel.getDuration();
            z = z && ((double) clipsModel.getDuration()) > 0.0d;
        }
        return z && duration <= 60.0d;
    }

    public final List<ClipsModel> getClips() {
        return this.clips;
    }

    public MultiSegmentPropExtra(List<ClipsModel> list) {
        this.clips = list;
    }
}
