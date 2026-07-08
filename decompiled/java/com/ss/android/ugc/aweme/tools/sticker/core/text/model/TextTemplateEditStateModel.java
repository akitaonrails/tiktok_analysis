package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C19719512Dh;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateEditStateModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextTemplateEditStateModel implements Parcelable, Serializable {

    @C09CT("use_default_aligns_state")
    public final List<Boolean> useDefaultAligns;

    @C09CT("use_default_colors_state")
    public final List<Boolean> useDefaultColors;

    @C09CT("use_default_fonts_state")
    public final List<Boolean> useDefaultFonts;
    public static final Parcelable.Creator<TextTemplateEditStateModel> CREATOR = new Parcelable.Creator<TextTemplateEditStateModel>() { // from class: X.0FAT
        @Override // android.os.Parcelable.Creator
        public final TextTemplateEditStateModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 == i) {
                    break;
                }
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                arrayList.add(Boolean.valueOf(z3));
                i2++;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.add(Boolean.valueOf(z2));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList3.add(Boolean.valueOf(z));
            }
            return new TextTemplateEditStateModel(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final TextTemplateEditStateModel[] newArray(int i) {
            return new TextTemplateEditStateModel[i];
        }
    };
    public static final int $stable = 8;

    public final TextTemplateEditStateModel copy(List<Boolean> list, List<Boolean> list2, List<Boolean> list3) {
        return new TextTemplateEditStateModel(list, list2, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTemplateEditStateModel)) {
            return false;
        }
        TextTemplateEditStateModel textTemplateEditStateModel = (TextTemplateEditStateModel) obj;
        return Intrinsics.LJFF(this.useDefaultColors, textTemplateEditStateModel.useDefaultColors) && Intrinsics.LJFF(this.useDefaultFonts, textTemplateEditStateModel.useDefaultFonts) && Intrinsics.LJFF(this.useDefaultAligns, textTemplateEditStateModel.useDefaultAligns);
    }

    public int hashCode() {
        return (((this.useDefaultColors.hashCode() * 31) + this.useDefaultFonts.hashCode()) * 31) + this.useDefaultAligns.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextTemplateEditStateModel(useDefaultColors=");
        sbLIZ.append(this.useDefaultColors);
        sbLIZ.append(", useDefaultFonts=");
        sbLIZ.append(this.useDefaultFonts);
        sbLIZ.append(", useDefaultAligns=");
        sbLIZ.append(this.useDefaultAligns);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Boolean> list = this.useDefaultColors;
        parcel.writeInt(list.size());
        Iterator<Boolean> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().booleanValue() ? 1 : 0);
        }
        List<Boolean> list2 = this.useDefaultFonts;
        parcel.writeInt(list2.size());
        Iterator<Boolean> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(it3.next().booleanValue() ? 1 : 0);
        }
        List<Boolean> list3 = this.useDefaultAligns;
        parcel.writeInt(list3.size());
        Iterator<Boolean> it4 = list3.iterator();
        while (it4.hasNext()) {
            parcel.writeInt(it4.next().booleanValue() ? 1 : 0);
        }
    }

    public TextTemplateEditStateModel() {
        this(new ArrayList(), new ArrayList(), new ArrayList());
    }

    public final void resetDefaultState() {
        List<Boolean> list = this.useDefaultColors;
        if (C19719512Dh.LJI(list) && list != null) {
            list.clear();
        }
        List<Boolean> list2 = this.useDefaultFonts;
        if (C19719512Dh.LJI(list2) && list2 != null) {
            list2.clear();
        }
        List<Boolean> list3 = this.useDefaultAligns;
        if (!C19719512Dh.LJI(list3) || list3 == null) {
            return;
        }
        list3.clear();
    }

    public final List<Boolean> getUseDefaultAligns() {
        return this.useDefaultAligns;
    }

    public final List<Boolean> getUseDefaultColors() {
        return this.useDefaultColors;
    }

    public final List<Boolean> getUseDefaultFonts() {
        return this.useDefaultFonts;
    }

    public TextTemplateEditStateModel(List<Boolean> list, List<Boolean> list2, List<Boolean> list3) {
        this.useDefaultColors = list;
        this.useDefaultFonts = list2;
        this.useDefaultAligns = list3;
    }
}
