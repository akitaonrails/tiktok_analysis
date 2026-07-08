package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FilterModel;

/* JADX INFO: loaded from: classes23.dex */
public final class FilterModel implements Parcelable {
    public static final Parcelable.Creator<FilterModel> CREATOR = new Parcelable.Creator<FilterModel>() { // from class: X.0nWS
        @Override // android.os.Parcelable.Creator
        public final FilterModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FilterModel(z, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FilterModel[] newArray(int i) {
            return new FilterModel[i];
        }
    };

    @C09CT("is_use_composer_filter_in_edit_page")
    public boolean isUseComposerFilterInEditPage;

    @C09CT("selected_filter_category_key")
    public String selectedFilterCategoryKey;

    @C040H
    public String selectedFilterFrom;

    @C040H
    public String selectedFilterId;

    @C040H
    public float selectedFilterIntensity;

    @C040H
    public String selectedFilterLabel;

    @C040H
    public String selectedFilterResId;

    @C040H
    public int selectedId;

    public FilterModel() {
        this(false, 0, null, null, null, null, -1.0f, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUseComposerFilterInEditPage ? 1 : 0);
        parcel.writeInt(this.selectedId);
        parcel.writeString(this.selectedFilterFrom);
        parcel.writeString(this.selectedFilterId);
        parcel.writeString(this.selectedFilterLabel);
        parcel.writeString(this.selectedFilterResId);
        parcel.writeFloat(this.selectedFilterIntensity);
        parcel.writeString(this.selectedFilterCategoryKey);
    }

    public FilterModel(boolean z, int i, String str, String str2, String str3, String str4, float f, String str5) {
        this.isUseComposerFilterInEditPage = z;
        this.selectedId = i;
        this.selectedFilterFrom = str;
        this.selectedFilterId = str2;
        this.selectedFilterLabel = str3;
        this.selectedFilterResId = str4;
        this.selectedFilterIntensity = f;
        this.selectedFilterCategoryKey = str5;
    }
}
