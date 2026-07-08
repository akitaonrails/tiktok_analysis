package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18U6;
import X.C2188811AlT;
import X.C2241301Cnw;
import X.EnumC21290318Tl;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotPictureComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetProcessComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetBotPictureComponent implements BaseComponent<C2241301Cnw> {
    public final VisualPoetErrorInfoComponent errorInfoComponent;
    public final VisualPoetPictureStructComponent pictureStructComponent;
    public final int progress;
    public final VisualPoetProcessComponent taskProgressComponent;
    public final EnumC21290318Tl taskStatusComponent;
    public static final C18U6 Companion = new Object() { // from class: X.18U6
    };
    public static final Parcelable.Creator<VisualPoetBotPictureComponent> CREATOR = new Parcelable.Creator<VisualPoetBotPictureComponent>() { // from class: X.18Xd
        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotPictureComponent createFromParcel(Parcel parcel) {
            VisualPoetProcessComponent visualPoetProcessComponentCreateFromParcel;
            VisualPoetPictureStructComponent visualPoetPictureStructComponentCreateFromParcel = VisualPoetPictureStructComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            EnumC21290318Tl enumC21290318TlValueOf = EnumC21290318Tl.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                visualPoetProcessComponentCreateFromParcel = null;
            } else {
                visualPoetProcessComponentCreateFromParcel = VisualPoetProcessComponent.CREATOR.createFromParcel(parcel);
            }
            return new VisualPoetBotPictureComponent(visualPoetPictureStructComponentCreateFromParcel, i, enumC21290318TlValueOf, visualPoetProcessComponentCreateFromParcel, VisualPoetErrorInfoComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotPictureComponent[] newArray(int i) {
            return new VisualPoetBotPictureComponent[i];
        }
    };
    public static final VisualPoetBotPictureComponent EMPTY_VISUAL_POET_BOT_PICTURE = new VisualPoetBotPictureComponent(0);

    public VisualPoetBotPictureComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualPoetBotPictureComponent)) {
            return false;
        }
        VisualPoetBotPictureComponent visualPoetBotPictureComponent = (VisualPoetBotPictureComponent) obj;
        return Intrinsics.LJFF(this.pictureStructComponent, visualPoetBotPictureComponent.pictureStructComponent) && this.progress == visualPoetBotPictureComponent.progress && this.taskStatusComponent == visualPoetBotPictureComponent.taskStatusComponent && Intrinsics.LJFF(this.taskProgressComponent, visualPoetBotPictureComponent.taskProgressComponent) && Intrinsics.LJFF(this.errorInfoComponent, visualPoetBotPictureComponent.errorInfoComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((this.pictureStructComponent.hashCode() * 31) + this.progress) * 31) + this.taskStatusComponent.hashCode()) * 31;
        VisualPoetProcessComponent visualPoetProcessComponent = this.taskProgressComponent;
        return ((iHashCode + (visualPoetProcessComponent == null ? 0 : visualPoetProcessComponent.hashCode())) * 31) + this.errorInfoComponent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetBotPictureComponent(pictureStructComponent=");
        sbLIZ.append(this.pictureStructComponent);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", taskStatusComponent=");
        sbLIZ.append(this.taskStatusComponent);
        sbLIZ.append(", taskProgressComponent=");
        sbLIZ.append(this.taskProgressComponent);
        sbLIZ.append(", errorInfoComponent=");
        sbLIZ.append(this.errorInfoComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.pictureStructComponent.writeToParcel(parcel, i);
        parcel.writeInt(this.progress);
        parcel.writeString(this.taskStatusComponent.name());
        VisualPoetProcessComponent visualPoetProcessComponent = this.taskProgressComponent;
        if (visualPoetProcessComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            visualPoetProcessComponent.writeToParcel(parcel, i);
        }
        this.errorInfoComponent.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisualPoetBotPictureComponent(int i) {
        this(VisualPoetPictureStructComponent.EMPTY_VISUAL_POET_PICTURE_STRUCT, 0, EnumC21290318Tl.CREATED, null, new VisualPoetErrorInfoComponent(0));
        VisualPoetPictureStructComponent.Companion.getClass();
    }

    public VisualPoetBotPictureComponent(VisualPoetPictureStructComponent visualPoetPictureStructComponent, int i, EnumC21290318Tl enumC21290318Tl, VisualPoetProcessComponent visualPoetProcessComponent, VisualPoetErrorInfoComponent visualPoetErrorInfoComponent) {
        this.pictureStructComponent = visualPoetPictureStructComponent;
        this.progress = i;
        this.taskStatusComponent = enumC21290318Tl;
        this.taskProgressComponent = visualPoetProcessComponent;
        this.errorInfoComponent = visualPoetErrorInfoComponent;
    }
}
