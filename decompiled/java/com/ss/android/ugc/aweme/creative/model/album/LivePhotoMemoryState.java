package com.ss.android.ugc.aweme.creative.model.album;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;

/* JADX INFO: loaded from: classes9.dex */
public final class LivePhotoMemoryState implements Parcelable {
    public static final Parcelable.Creator<LivePhotoMemoryState> CREATOR = new Parcelable.Creator<LivePhotoMemoryState>() { // from class: X.0KxQ
        @Override // android.os.Parcelable.Creator
        public final LivePhotoMemoryState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z4 = false;
            }
            return new LivePhotoMemoryState(z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final LivePhotoMemoryState[] newArray(int i) {
            return new LivePhotoMemoryState[i];
        }
    };

    @C09CT("memory_applied_on_enter")
    public boolean memoryAppliedOnEnter;

    @C09CT("live_memory_enabled")
    public boolean memoryEnabled;

    @C09CT("switched_in_album")
    public boolean switchedInAlbum;

    @C09CT("switched_in_editor")
    public boolean switchedInEditor;

    public LivePhotoMemoryState() {
        this(false, false, false, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoMemoryState)) {
            return false;
        }
        LivePhotoMemoryState livePhotoMemoryState = (LivePhotoMemoryState) obj;
        return this.switchedInAlbum == livePhotoMemoryState.switchedInAlbum && this.memoryAppliedOnEnter == livePhotoMemoryState.memoryAppliedOnEnter && this.switchedInEditor == livePhotoMemoryState.switchedInEditor && this.memoryEnabled == livePhotoMemoryState.memoryEnabled;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.switchedInAlbum) * 31) + C786410Ut5.Z2(this.memoryAppliedOnEnter)) * 31) + C786410Ut5.Z2(this.switchedInEditor)) * 31) + C786410Ut5.Z2(this.memoryEnabled);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoMemoryState(switchedInAlbum=");
        sbLIZ.append(this.switchedInAlbum);
        sbLIZ.append(", memoryAppliedOnEnter=");
        sbLIZ.append(this.memoryAppliedOnEnter);
        sbLIZ.append(", switchedInEditor=");
        sbLIZ.append(this.switchedInEditor);
        sbLIZ.append(", memoryEnabled=");
        sbLIZ.append(this.memoryEnabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.switchedInAlbum ? 1 : 0);
        parcel.writeInt(this.memoryAppliedOnEnter ? 1 : 0);
        parcel.writeInt(this.switchedInEditor ? 1 : 0);
        parcel.writeInt(this.memoryEnabled ? 1 : 0);
    }

    public LivePhotoMemoryState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.switchedInAlbum = z;
        this.memoryAppliedOnEnter = z2;
        this.switchedInEditor = z3;
        this.memoryEnabled = z4;
    }
}
