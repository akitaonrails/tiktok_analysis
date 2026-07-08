package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.DraftPanelModel;

/* JADX INFO: loaded from: classes23.dex */
public final class DraftPanelModel implements Parcelable {
    public static final Parcelable.Creator<DraftPanelModel> CREATOR = new Parcelable.Creator<DraftPanelModel>() { // from class: X.0mdk
        @Override // android.os.Parcelable.Creator
        public final DraftPanelModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            float f = parcel.readFloat();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new DraftPanelModel(z, f, string, z2, parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftPanelModel[] newArray(int i) {
            return new DraftPanelModel[i];
        }
    };

    @C040H
    public long currentDraftSize;

    @C040H
    public long draftBoxSize;

    @C040H
    public boolean draftIconHidden;

    @C040H
    public String draftPanelSelectedVisibility;

    @C040H
    public float draftPublishButtonHeight;

    @C040H
    public boolean isFromSaveDraftPopup;

    public DraftPanelModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.draftIconHidden ? 1 : 0);
        parcel.writeFloat(this.draftPublishButtonHeight);
        parcel.writeString(this.draftPanelSelectedVisibility);
        parcel.writeInt(this.isFromSaveDraftPopup ? 1 : 0);
        parcel.writeLong(this.currentDraftSize);
        parcel.writeLong(this.draftBoxSize);
    }

    public /* synthetic */ DraftPanelModel(int i) {
        this(false, 44.0f, "", false, 0L, 0L);
    }

    public DraftPanelModel(boolean z, float f, String str, boolean z2, long j, long j2) {
        this.draftIconHidden = z;
        this.draftPublishButtonHeight = f;
        this.draftPanelSelectedVisibility = str;
        this.isFromSaveDraftPopup = z2;
        this.currentDraftSize = j;
        this.draftBoxSize = j2;
    }
}
