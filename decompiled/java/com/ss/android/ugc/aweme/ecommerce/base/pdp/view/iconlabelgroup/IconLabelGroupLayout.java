package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroupLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class IconLabelGroupLayout implements Parcelable {
    public static final int $stable = 0;

    public static final class HorizontalGrid extends IconLabelGroupLayout {
        public final String bgColor;
        public final List<IconLabelItem> items;
        public static final Parcelable.Creator<HorizontalGrid> CREATOR = new Parcelable.Creator<HorizontalGrid>() { // from class: X.0mhG
            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.HorizontalGrid createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(IconLabelItem.CREATOR.createFromParcel(parcel));
                    }
                }
                return new IconLabelGroupLayout.HorizontalGrid(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.HorizontalGrid[] newArray(int i) {
                return new IconLabelGroupLayout.HorizontalGrid[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalGrid)) {
                return false;
            }
            HorizontalGrid horizontalGrid = (HorizontalGrid) obj;
            return Intrinsics.LJFF(this.items, horizontalGrid.items) && Intrinsics.LJFF(this.bgColor, horizontalGrid.bgColor);
        }

        public final int hashCode() {
            List<IconLabelItem> list = this.items;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.bgColor;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HorizontalGrid(items=");
            sbLIZ.append(this.items);
            sbLIZ.append(", bgColor=");
            sbLIZ.append(this.bgColor);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<IconLabelItem> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<IconLabelItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.bgColor);
        }

        public HorizontalGrid(List<IconLabelItem> list, String str) {
            this.items = list;
            this.bgColor = str;
        }
    }

    public static final class Vertical extends IconLabelGroupLayout {
        public final List<IconLabelItem> items;
        public final int maxDisplayLines;
        public final ECRichText title;
        public static final Parcelable.Creator<Vertical> CREATOR = new Parcelable.Creator<Vertical>() { // from class: X.0mhF
            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.Vertical createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ECRichText eCRichText = (ECRichText) parcel.readParcelable(IconLabelGroupLayout.Vertical.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(IconLabelItem.CREATOR.createFromParcel(parcel));
                    }
                }
                return new IconLabelGroupLayout.Vertical(parcel.readInt(), eCRichText, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.Vertical[] newArray(int i) {
                return new IconLabelGroupLayout.Vertical[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return Intrinsics.LJFF(this.title, vertical.title) && Intrinsics.LJFF(this.items, vertical.items) && this.maxDisplayLines == vertical.maxDisplayLines;
        }

        public final int hashCode() {
            ECRichText eCRichText = this.title;
            int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
            List<IconLabelItem> list = this.items;
            return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.maxDisplayLines;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Vertical(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", items=");
            sbLIZ.append(this.items);
            sbLIZ.append(", maxDisplayLines=");
            sbLIZ.append(this.maxDisplayLines);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.title, i);
            List<IconLabelItem> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<IconLabelItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.maxDisplayLines);
        }

        public Vertical(int i, ECRichText eCRichText, List list) {
            this.title = eCRichText;
            this.items = list;
            this.maxDisplayLines = i;
        }
    }

    public static final class Horizontal extends IconLabelGroupLayout {
        public final List<IconLabelItem> items;
        public final int maxDisplayLines;
        public final List<MaxWidthRule> maxWidthRules;
        public final ECRichText title;
        public static final Parcelable.Creator<Horizontal> CREATOR = new Parcelable.Creator<Horizontal>() { // from class: X.0mhH
            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.Horizontal createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ECRichText eCRichText = (ECRichText) parcel.readParcelable(IconLabelGroupLayout.Horizontal.class.getClassLoader());
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(IconLabelItem.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(MaxWidthRule.CREATOR.createFromParcel(parcel));
                    }
                }
                return new IconLabelGroupLayout.Horizontal(eCRichText, arrayList, arrayList2, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final IconLabelGroupLayout.Horizontal[] newArray(int i) {
                return new IconLabelGroupLayout.Horizontal[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return Intrinsics.LJFF(this.title, horizontal.title) && Intrinsics.LJFF(this.items, horizontal.items) && Intrinsics.LJFF(this.maxWidthRules, horizontal.maxWidthRules) && this.maxDisplayLines == horizontal.maxDisplayLines;
        }

        public final int hashCode() {
            ECRichText eCRichText = this.title;
            int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
            List<IconLabelItem> list = this.items;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<MaxWidthRule> list2 = this.maxWidthRules;
            return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.maxDisplayLines;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Horizontal(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", items=");
            sbLIZ.append(this.items);
            sbLIZ.append(", maxWidthRules=");
            sbLIZ.append(this.maxWidthRules);
            sbLIZ.append(", maxDisplayLines=");
            sbLIZ.append(this.maxDisplayLines);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.title, i);
            List<IconLabelItem> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<IconLabelItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            List<MaxWidthRule> list2 = this.maxWidthRules;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<MaxWidthRule> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.maxDisplayLines);
        }

        public Horizontal(ECRichText eCRichText, List<IconLabelItem> list, List<MaxWidthRule> list2, int i) {
            this.title = eCRichText;
            this.items = list;
            this.maxWidthRules = list2;
            this.maxDisplayLines = i;
        }
    }
}
