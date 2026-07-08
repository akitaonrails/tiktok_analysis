package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C21299818Xc;
import X.C2188811AlT;
import X.C2241801Cok;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetUserComponent implements BaseComponent<C2241801Cok> {
    public final List<VisualPoetPictureStructComponent> images;
    public final String promptUri;
    public final String text;
    public static final C21299818Xc Companion = new Object() { // from class: X.18Xc
    };
    public static final Parcelable.Creator<VisualPoetUserComponent> CREATOR = new Parcelable.Creator<VisualPoetUserComponent>() { // from class: X.18Xb
        @Override // android.os.Parcelable.Creator
        public final VisualPoetUserComponent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VisualPoetPictureStructComponent.CREATOR.createFromParcel(parcel));
            }
            return new VisualPoetUserComponent(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetUserComponent[] newArray(int i) {
            return new VisualPoetUserComponent[i];
        }
    };
    public static final VisualPoetUserComponent EMPTY_VISUAL_POET_USER = new VisualPoetUserComponent(0);
    public static final String VISUAL_POET_USER_COMPONENT_KEY = "visual_poet_user_component";

    public VisualPoetUserComponent() {
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
        if (!(obj instanceof VisualPoetUserComponent)) {
            return false;
        }
        VisualPoetUserComponent visualPoetUserComponent = (VisualPoetUserComponent) obj;
        return Intrinsics.LJFF(this.text, visualPoetUserComponent.text) && Intrinsics.LJFF(this.images, visualPoetUserComponent.images) && Intrinsics.LJFF(this.promptUri, visualPoetUserComponent.promptUri);
    }

    public final int hashCode() {
        return (((this.text.hashCode() * 31) + this.images.hashCode()) * 31) + this.promptUri.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetUserComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", promptUri=");
        sbLIZ.append(this.promptUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        List<VisualPoetPictureStructComponent> list = this.images;
        parcel.writeInt(list.size());
        Iterator<VisualPoetPictureStructComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.promptUri);
    }

    public VisualPoetUserComponent(int i) {
        this("", C13BV.INSTANCE, "");
    }

    public VisualPoetUserComponent(String str, List<VisualPoetPictureStructComponent> list, String str2) {
        this.text = str;
        this.images = list;
        this.promptUri = str2;
    }
}
