package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordPresetResource implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordPresetResource> CREATOR = new Creator();
    public Effect effect;
    public String effectId;
    public String musicId;
    public MusicModel musicModel;

    public static final class Creator implements Parcelable.Creator<RecordPresetResource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource createFromParcel(Parcel parcel) {
            return new RecordPresetResource(parcel.readString(), (Effect) parcel.readParcelable(RecordPresetResource.class.getClassLoader()), parcel.readString(), (MusicModel) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource[] newArray(int i) {
            return new RecordPresetResource[i];
        }
    }

    public RecordPresetResource() {
        this(null, null, null, null);
    }

    public final RecordPresetResource copy(String str, Effect effect, String str2, MusicModel musicModel) {
        return new RecordPresetResource(str, effect, str2, musicModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResource)) {
            return false;
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) obj;
        return Intrinsics.LJFF(this.effectId, recordPresetResource.effectId) && Intrinsics.LJFF(this.effect, recordPresetResource.effect) && Intrinsics.LJFF(this.musicId, recordPresetResource.musicId) && Intrinsics.LJFF(this.musicModel, recordPresetResource.musicModel);
    }

    public int hashCode() {
        String str = this.effectId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Effect effect = this.effect;
        int iHashCode2 = (iHashCode + (effect == null ? 0 : effect.hashCode())) * 31;
        String str2 = this.musicId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MusicModel musicModel = this.musicModel;
        return iHashCode3 + (musicModel != null ? musicModel.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.effect, i);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.musicModel);
    }

    public final boolean preSetEffect() {
        String effectId;
        String str = this.effectId;
        if (str != null && str.length() != 0) {
            return true;
        }
        Effect effect = this.effect;
        return (effect == null || (effectId = effect.getEffectId()) == null || effectId.length() == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectId: ");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", musicId: ");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", effect: ");
        sbLIZ.append(this.effect);
        sbLIZ.append(", musicModel: ");
        sbLIZ.append(this.musicModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public RecordPresetResource(String str, Effect effect, String str2, MusicModel musicModel) {
        this.effectId = str;
        this.effect = effect;
        this.musicId = str2;
        this.musicModel = musicModel;
    }
}
