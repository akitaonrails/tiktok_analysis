package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectionBar implements Parcelable {

    @C09CT("appendix_area")
    public AppendixArea appendixArea;

    @C09CT("logistic_area")
    public LogisticArea logisticArea;

    @C09CT("selection_type")
    public Integer selectionType;

    @C09CT("title")
    public String title;

    @C09CT("title_appendix")
    public List<ECRichText> titleAppendix;
    public static final Parcelable.Creator<SelectionBar> CREATOR = new Parcelable.Creator<SelectionBar>() { // from class: X.02kt
        @Override // android.os.Parcelable.Creator
        public final SelectionBar createFromParcel(Parcel parcel) {
            Integer numValueOf;
            LogisticArea logisticAreaCreateFromParcel;
            AppendixArea appendixAreaCreateFromParcel;
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                logisticAreaCreateFromParcel = null;
            } else {
                logisticAreaCreateFromParcel = LogisticArea.CREATOR.createFromParcel(parcel);
            }
            LogisticArea logisticArea = logisticAreaCreateFromParcel;
            if (parcel.readInt() == 0) {
                appendixAreaCreateFromParcel = null;
            } else {
                appendixAreaCreateFromParcel = AppendixArea.CREATOR.createFromParcel(parcel);
            }
            AppendixArea appendixArea = appendixAreaCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SelectionBar.class.getClassLoader()));
                }
            }
            return new SelectionBar(string, numValueOf, logisticArea, appendixArea, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionBar[] newArray(int i) {
            return new SelectionBar[i];
        }
    };
    public static final int $stable = 8;

    public SelectionBar() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionBar)) {
            return false;
        }
        SelectionBar selectionBar = (SelectionBar) obj;
        return Intrinsics.LJFF(this.title, selectionBar.title) && Intrinsics.LJFF(this.selectionType, selectionBar.selectionType) && Intrinsics.LJFF(this.logisticArea, selectionBar.logisticArea) && Intrinsics.LJFF(this.appendixArea, selectionBar.appendixArea) && Intrinsics.LJFF(this.titleAppendix, selectionBar.titleAppendix);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.selectionType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LogisticArea logisticArea = this.logisticArea;
        int iHashCode3 = (iHashCode2 + (logisticArea == null ? 0 : logisticArea.hashCode())) * 31;
        AppendixArea appendixArea = this.appendixArea;
        int iHashCode4 = (iHashCode3 + (appendixArea == null ? 0 : appendixArea.hashCode())) * 31;
        List<ECRichText> list = this.titleAppendix;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionBar(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", selectionType=");
        sbLIZ.append(this.selectionType);
        sbLIZ.append(", logisticArea=");
        sbLIZ.append(this.logisticArea);
        sbLIZ.append(", appendixArea=");
        sbLIZ.append(this.appendixArea);
        sbLIZ.append(", titleAppendix=");
        sbLIZ.append(this.titleAppendix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Integer num = this.selectionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        LogisticArea logisticArea = this.logisticArea;
        if (logisticArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticArea.writeToParcel(parcel, i);
        }
        AppendixArea appendixArea = this.appendixArea;
        if (appendixArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appendixArea.writeToParcel(parcel, i);
        }
        List<ECRichText> list = this.titleAppendix;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ECRichText> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public SelectionBar(String str, Integer num, LogisticArea logisticArea, AppendixArea appendixArea, List<ECRichText> list) {
        this.title = str;
        this.selectionType = num;
        this.logisticArea = logisticArea;
        this.appendixArea = appendixArea;
        this.titleAppendix = list;
    }
}
