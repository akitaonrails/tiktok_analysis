package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CanvasComposer;
import com.ss.ugc.aweme.creation.base.SimpleCanvasComposer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class CanvasComposer implements Parcelable, Serializable {
    public static final Parcelable.Creator<CanvasComposer> CREATOR = new Parcelable.Creator<CanvasComposer>() { // from class: X.0MSy
        @Override // android.os.Parcelable.Creator
        public final CanvasComposer createFromParcel(Parcel parcel) {
            return new CanvasComposer((SimpleCanvasComposer) parcel.readParcelable(CanvasComposer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CanvasComposer[] newArray(int i) {
            return new CanvasComposer[i];
        }
    };

    @C09CT("simple_canvas_composer")
    public SimpleCanvasComposer simpleCanvasComposer;

    public CanvasComposer() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.simpleCanvasComposer, i);
    }

    public final SimpleCanvasComposer getSimpleCanvasComposer() {
        return this.simpleCanvasComposer;
    }

    public CanvasComposer(SimpleCanvasComposer simpleCanvasComposer) {
        this.simpleCanvasComposer = simpleCanvasComposer;
    }

    public final void setSimpleCanvasComposer(SimpleCanvasComposer simpleCanvasComposer) {
        this.simpleCanvasComposer = simpleCanvasComposer;
    }
}
