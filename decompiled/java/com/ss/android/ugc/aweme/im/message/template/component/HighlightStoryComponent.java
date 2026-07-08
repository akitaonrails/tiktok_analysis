package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2240071Clx;
import X.C2242671Cq9;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class HighlightStoryComponent implements BaseComponent<C2240071Clx> {
    public final String highlightStoryCollectionId;
    public static final C2242671Cq9 Companion = new Object() { // from class: X.1Cq9
    };
    public static final Parcelable.Creator<HighlightStoryComponent> CREATOR = new Parcelable.Creator<HighlightStoryComponent>() { // from class: X.1Cq8
        @Override // android.os.Parcelable.Creator
        public final HighlightStoryComponent createFromParcel(Parcel parcel) {
            return new HighlightStoryComponent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HighlightStoryComponent[] newArray(int i) {
            return new HighlightStoryComponent[i];
        }
    };
    public static final C01GW<HighlightStoryComponent> EMPTY_HIGHLIGHT_STORY_COMPONENT$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(73));

    public HighlightStoryComponent() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HighlightStoryComponent) && Intrinsics.LJFF(this.highlightStoryCollectionId, ((HighlightStoryComponent) obj).highlightStoryCollectionId);
    }

    public final int hashCode() {
        String str = this.highlightStoryCollectionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightStoryComponent(highlightStoryCollectionId=");
        sbLIZ.append(this.highlightStoryCollectionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.highlightStoryCollectionId);
    }

    public HighlightStoryComponent(String str) {
        this.highlightStoryCollectionId = str;
    }
}
