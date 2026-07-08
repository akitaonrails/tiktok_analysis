package com.ss.android.ugc.aweme.tools.sticker.core;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.Keyframe;
import com.ss.android.ugc.aweme.tools.sticker.core.KeyframeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class KeyframeInfo implements Cloneable, Parcelable, Serializable {

    @C09CT("frames")
    public final List<Keyframe> frames;

    @C09CT("property")
    public final String property;

    @C09CT("type")
    public final String type;
    public static final Parcelable.Creator<KeyframeInfo> CREATOR = new Parcelable.Creator<KeyframeInfo>() { // from class: X.0EKC
        @Override // android.os.Parcelable.Creator
        public final KeyframeInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Keyframe.CREATOR.createFromParcel(parcel));
                }
            }
            return new KeyframeInfo(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final KeyframeInfo[] newArray(int i) {
            return new KeyframeInfo[i];
        }
    };
    public static final int $stable = 8;

    public final KeyframeInfo copy(String str, String str2, List<Keyframe> list) {
        return new KeyframeInfo(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyframeInfo)) {
            return false;
        }
        KeyframeInfo keyframeInfo = (KeyframeInfo) obj;
        return Intrinsics.LJFF(this.type, keyframeInfo.type) && Intrinsics.LJFF(this.property, keyframeInfo.property) && Intrinsics.LJFF(this.frames, keyframeInfo.frames);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.property;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Keyframe> list = this.frames;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyframeInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", property=");
        sbLIZ.append(this.property);
        sbLIZ.append(", frames=");
        sbLIZ.append(this.frames);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.property);
        List<Keyframe> list = this.frames;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Keyframe> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public Object clone() {
        return super.clone();
    }

    public final List<Keyframe> getFrames() {
        return this.frames;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getType() {
        return this.type;
    }

    public KeyframeInfo(String str, String str2, List<Keyframe> list) {
        this.type = str;
        this.property = str2;
        this.frames = list;
    }
}
