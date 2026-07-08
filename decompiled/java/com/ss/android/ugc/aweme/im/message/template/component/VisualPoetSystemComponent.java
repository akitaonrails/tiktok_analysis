package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18Y7;
import X.C2188811AlT;
import X.C2241761Cog;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetSystemComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetSystemComponent implements BaseComponent<C2241761Cog> {
    public final VisualPoetPictureStructComponent image;
    public final String text;
    public static final C18Y7 Companion = new Object() { // from class: X.18Y7
    };
    public static final Parcelable.Creator<VisualPoetSystemComponent> CREATOR = new Parcelable.Creator<VisualPoetSystemComponent>() { // from class: X.18Y6
        @Override // android.os.Parcelable.Creator
        public final VisualPoetSystemComponent createFromParcel(Parcel parcel) {
            VisualPoetPictureStructComponent visualPoetPictureStructComponentCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                visualPoetPictureStructComponentCreateFromParcel = null;
            } else {
                visualPoetPictureStructComponentCreateFromParcel = VisualPoetPictureStructComponent.CREATOR.createFromParcel(parcel);
            }
            return new VisualPoetSystemComponent(string, visualPoetPictureStructComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetSystemComponent[] newArray(int i) {
            return new VisualPoetSystemComponent[i];
        }
    };
    public static final VisualPoetSystemComponent EMPTY_VISUAL_POET_SYSTEM = new VisualPoetSystemComponent((String) null, 3);

    public VisualPoetSystemComponent() {
        this((String) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetSystemComponent)) {
            return false;
        }
        VisualPoetSystemComponent visualPoetSystemComponent = (VisualPoetSystemComponent) obj;
        return Intrinsics.LJFF(this.text, visualPoetSystemComponent.text) && Intrinsics.LJFF(this.image, visualPoetSystemComponent.image);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        VisualPoetPictureStructComponent visualPoetPictureStructComponent = this.image;
        return iHashCode + (visualPoetPictureStructComponent == null ? 0 : visualPoetPictureStructComponent.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetSystemComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        VisualPoetPictureStructComponent visualPoetPictureStructComponent = this.image;
        if (visualPoetPictureStructComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            visualPoetPictureStructComponent.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VisualPoetSystemComponent(String str, int i) {
        this((i & 1) != 0 ? "" : str, (VisualPoetPictureStructComponent) null);
    }

    public VisualPoetSystemComponent(String str, VisualPoetPictureStructComponent visualPoetPictureStructComponent) {
        this.text = str;
        this.image = visualPoetPictureStructComponent;
    }
}
