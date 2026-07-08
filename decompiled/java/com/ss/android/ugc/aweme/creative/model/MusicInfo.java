package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0L80;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FusedMusic;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicInfo implements Parcelable, Serializable {
    public static final C0L80 CREATOR = new Parcelable.Creator<MusicInfo>() { // from class: X.0L80
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        @Override // android.os.Parcelable.Creator
        public final MusicInfo createFromParcel(Parcel parcel) {
            ?? arrayList;
            int i;
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            int i2 = parcel.readInt();
            float f = parcel.readFloat();
            if (parcel.dataAvail() > 0 && (i = parcel.readInt()) > 0) {
                arrayList = new ArrayList(i);
                int i3 = 0;
                do {
                    FusedMusic.CREATOR.getClass();
                    arrayList.add(C0L81.LIZ(parcel));
                    i3++;
                } while (i3 < i);
            } else {
                arrayList = C13BV.INSTANCE;
            }
            return new MusicInfo(string, i2, f, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicInfo[] newArray(int i) {
            return new MusicInfo[i];
        }
    };

    @C09CT("fused_musics")
    public final List<FusedMusic> fusedMusics;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_start")
    public final int musicStart;

    @C09CT("music_volume")
    public final float musicVolume;

    public MusicInfo() {
        this(null, 0, 0.0f, null, 15, null);
    }

    public final MusicInfo copy(String str, int i, float f, List<FusedMusic> list) {
        return new MusicInfo(str, i, f, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) obj;
        return Intrinsics.LJFF(this.musicId, musicInfo.musicId) && this.musicStart == musicInfo.musicStart && Float.compare(this.musicVolume, musicInfo.musicVolume) == 0 && Intrinsics.LJFF(this.fusedMusics, musicInfo.fusedMusics);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicInfo(musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", musicStart=");
        sbLIZ.append(this.musicStart);
        sbLIZ.append(", musicVolume=");
        sbLIZ.append(this.musicVolume);
        sbLIZ.append(", fusedMusics=");
        sbLIZ.append(this.fusedMusics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((this.musicId.hashCode() * 31) + this.musicStart) * 31) + Float.floatToIntBits(this.musicVolume)) * 31) + this.fusedMusics.hashCode();
    }

    public final List<FusedMusic> getFusedMusics() {
        return this.fusedMusics;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final float getMusicVolume() {
        return this.musicVolume;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size;
        List<FusedMusic> list;
        parcel.writeString(this.musicId);
        parcel.writeInt(this.musicStart);
        parcel.writeFloat(this.musicVolume);
        List<FusedMusic> list2 = this.fusedMusics;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        parcel.writeInt(size);
        List<FusedMusic> list3 = this.fusedMusics;
        if (list3 != null && list3.size() > 0 && (list = this.fusedMusics) != null) {
            Iterator<FusedMusic> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
    }

    public MusicInfo(String str, int i, float f, List<FusedMusic> list) {
        this.musicId = str;
        this.musicStart = i;
        this.musicVolume = f;
        this.fusedMusics = list;
    }

    public MusicInfo(String str, int i, float f, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
