package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C21300618Xk;
import X.C2188811AlT;
import X.C2241841Coo;
import X.C2241861Coq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetPictureStructComponent implements BaseComponent<C2241841Coo> {
    public final ImageComponent image;
    public final ImageComponent thumbnail;
    public static final C21300618Xk Companion = new Object() { // from class: X.18Xk
    };
    public static final Parcelable.Creator<VisualPoetPictureStructComponent> CREATOR = new Parcelable.Creator<VisualPoetPictureStructComponent>() { // from class: X.18ZT
        @Override // android.os.Parcelable.Creator
        public final VisualPoetPictureStructComponent createFromParcel(Parcel parcel) {
            Parcelable.Creator<ImageComponent> creator = ImageComponent.CREATOR;
            return new VisualPoetPictureStructComponent(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetPictureStructComponent[] newArray(int i) {
            return new VisualPoetPictureStructComponent[i];
        }
    };
    public static final VisualPoetPictureStructComponent EMPTY_VISUAL_POET_PICTURE_STRUCT = new VisualPoetPictureStructComponent((ImageComponent) null, 3);

    public VisualPoetPictureStructComponent() {
        this((ImageComponent) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetPictureStructComponent)) {
            return false;
        }
        VisualPoetPictureStructComponent visualPoetPictureStructComponent = (VisualPoetPictureStructComponent) obj;
        return Intrinsics.LJFF(this.image, visualPoetPictureStructComponent.image) && Intrinsics.LJFF(this.thumbnail, visualPoetPictureStructComponent.thumbnail);
    }

    public final int hashCode() {
        return (this.image.hashCode() * 31) + this.thumbnail.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetPictureStructComponent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", thumbnail=");
        sbLIZ.append(this.thumbnail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        this.thumbnail.writeToParcel(parcel, i);
    }

    public final C2241841Coo LIZ() {
        C2241861Coq c2241861Coq = new C2241861Coq();
        c2241861Coq.LIZLLL = this.image.LIZIZ();
        c2241861Coq.LJ = this.thumbnail.LIZIZ();
        return c2241861Coq.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VisualPoetPictureStructComponent(ImageComponent imageComponent, int i) {
        ImageComponent imageComponentLIZ;
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponent = C18ZU.LIZ();
        }
        if ((i & 2) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        } else {
            imageComponentLIZ = null;
        }
        this(imageComponent, imageComponentLIZ);
    }

    public VisualPoetPictureStructComponent(ImageComponent imageComponent, ImageComponent imageComponent2) {
        this.image = imageComponent;
        this.thumbnail = imageComponent2;
    }
}
