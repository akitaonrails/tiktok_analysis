package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectTextBgNinePatch implements Parcelable {
    public static final Parcelable.Creator<EffectTextBgNinePatch> CREATOR = new Parcelable.Creator<EffectTextBgNinePatch>() { // from class: X.1268
        @Override // android.os.Parcelable.Creator
        public final EffectTextBgNinePatch createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
            }
            return new EffectTextBgNinePatch(arrayList, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectTextBgNinePatch[] newArray(int i) {
            return new EffectTextBgNinePatch[i];
        }
    };

    @C09CT("divX")
    public final List<NinePatchDiv> divX;

    @C09CT("divY")
    public final List<NinePatchDiv> divY;

    @C09CT("padding_bottom")
    public final int paddingBottom;

    @C09CT("padding_left")
    public final int paddingLeft;

    @C09CT("padding_right")
    public final int paddingRight;

    @C09CT("padding_top")
    public final int paddingTop;

    public final EffectTextBgNinePatch copy(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i, int i2, int i3, int i4) {
        return new EffectTextBgNinePatch(list, list2, i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectTextBgNinePatch)) {
            return false;
        }
        EffectTextBgNinePatch effectTextBgNinePatch = (EffectTextBgNinePatch) obj;
        return Intrinsics.LJFF(this.divX, effectTextBgNinePatch.divX) && Intrinsics.LJFF(this.divY, effectTextBgNinePatch.divY) && this.paddingLeft == effectTextBgNinePatch.paddingLeft && this.paddingRight == effectTextBgNinePatch.paddingRight && this.paddingTop == effectTextBgNinePatch.paddingTop && this.paddingBottom == effectTextBgNinePatch.paddingBottom;
    }

    public int hashCode() {
        return (((((((((this.divX.hashCode() * 31) + this.divY.hashCode()) * 31) + this.paddingLeft) * 31) + this.paddingRight) * 31) + this.paddingTop) * 31) + this.paddingBottom;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectTextBgNinePatch(divX=");
        sbLIZ.append(this.divX);
        sbLIZ.append(", divY=");
        sbLIZ.append(this.divY);
        sbLIZ.append(", paddingLeft=");
        sbLIZ.append(this.paddingLeft);
        sbLIZ.append(", paddingRight=");
        sbLIZ.append(this.paddingRight);
        sbLIZ.append(", paddingTop=");
        sbLIZ.append(this.paddingTop);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.paddingBottom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<NinePatchDiv> list = this.divX;
        parcel.writeInt(list.size());
        Iterator<NinePatchDiv> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<NinePatchDiv> list2 = this.divY;
        parcel.writeInt(list2.size());
        Iterator<NinePatchDiv> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.paddingLeft);
        parcel.writeInt(this.paddingRight);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
    }

    public EffectTextBgNinePatch() {
        this(new ArrayList(), new ArrayList(), 0, 0, 0, 0);
    }

    public final List<NinePatchDiv> getDivX() {
        return this.divX;
    }

    public final List<NinePatchDiv> getDivY() {
        return this.divY;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public EffectTextBgNinePatch(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i, int i2, int i3, int i4) {
        this.divX = list;
        this.divY = list2;
        this.paddingLeft = i;
        this.paddingRight = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
    }
}
