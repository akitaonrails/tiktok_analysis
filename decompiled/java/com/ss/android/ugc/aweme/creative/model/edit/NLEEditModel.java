package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.NLEEditModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class NLEEditModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<NLEEditModel> CREATOR = new Parcelable.Creator<NLEEditModel>() { // from class: X.0nWC
        @Override // android.os.Parcelable.Creator
        public final NLEEditModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new NLEEditModel(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final NLEEditModel[] newArray(int i) {
            return new NLEEditModel[i];
        }
    };

    @C09CT("is_nle_canvas")
    public boolean isNLECanvas;

    @C09CT("use_preview_size_in_canvas_mode")
    public boolean usePreviewSizeInCanvasMode;

    public NLEEditModel() {
        this(false, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void resetModel() {
        this.isNLECanvas = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isNLECanvas ? 1 : 0);
        parcel.writeInt(this.usePreviewSizeInCanvasMode ? 1 : 0);
    }

    public final boolean getUsePreviewSizeInCanvasMode() {
        return this.usePreviewSizeInCanvasMode;
    }

    public final boolean isNLECanvas() {
        return this.isNLECanvas;
    }

    public final void setNLECanvas(boolean z) {
        this.isNLECanvas = z;
    }

    public final void setUsePreviewSizeInCanvasMode(boolean z) {
        this.usePreviewSizeInCanvasMode = z;
    }

    public NLEEditModel(boolean z, boolean z2) {
        this.isNLECanvas = z;
        this.usePreviewSizeInCanvasMode = z2;
    }
}
