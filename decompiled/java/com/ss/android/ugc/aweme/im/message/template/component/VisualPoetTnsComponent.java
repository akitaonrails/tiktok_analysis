package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C21372618kW;
import X.C2188811AlT;
import X.C2238691Cjj;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetActionTemplateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetTnsComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetTnsComponent implements BaseComponent<C2238691Cjj> {
    public final String text;
    public final List<VisualPoetActionTemplateComponent> visualPoetActionTemplateComponent;
    public static final C21372618kW Companion = new Object() { // from class: X.18kW
    };
    public static final Parcelable.Creator<VisualPoetTnsComponent> CREATOR = new Parcelable.Creator<VisualPoetTnsComponent>() { // from class: X.18kV
        @Override // android.os.Parcelable.Creator
        public final VisualPoetTnsComponent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VisualPoetActionTemplateComponent.CREATOR.createFromParcel(parcel));
            }
            return new VisualPoetTnsComponent(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetTnsComponent[] newArray(int i) {
            return new VisualPoetTnsComponent[i];
        }
    };
    public static final VisualPoetTnsComponent EMPTY_VISUAL_POET_TNS_COMPONENT = new VisualPoetTnsComponent(0);

    public VisualPoetTnsComponent() {
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
        if (!(obj instanceof VisualPoetTnsComponent)) {
            return false;
        }
        VisualPoetTnsComponent visualPoetTnsComponent = (VisualPoetTnsComponent) obj;
        return Intrinsics.LJFF(this.text, visualPoetTnsComponent.text) && Intrinsics.LJFF(this.visualPoetActionTemplateComponent, visualPoetTnsComponent.visualPoetActionTemplateComponent);
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.visualPoetActionTemplateComponent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetTnsComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", visualPoetActionTemplateComponent=");
        sbLIZ.append(this.visualPoetActionTemplateComponent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        List<VisualPoetActionTemplateComponent> list = this.visualPoetActionTemplateComponent;
        parcel.writeInt(list.size());
        Iterator<VisualPoetActionTemplateComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public VisualPoetTnsComponent(int i) {
        this("", C13BV.INSTANCE);
    }

    public VisualPoetTnsComponent(String str, List<VisualPoetActionTemplateComponent> list) {
        this.text = str;
        this.visualPoetActionTemplateComponent = list;
    }
}
