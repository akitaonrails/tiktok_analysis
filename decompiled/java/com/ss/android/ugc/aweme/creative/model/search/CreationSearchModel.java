package com.ss.android.ugc.aweme.creative.model.search;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.search.CreationSearchModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationSearchModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreationSearchModel> CREATOR = new Parcelable.Creator<CreationSearchModel>() { // from class: X.0MA1
        @Override // android.os.Parcelable.Creator
        public final CreationSearchModel createFromParcel(Parcel parcel) {
            return new CreationSearchModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreationSearchModel[] newArray(int i) {
            return new CreationSearchModel[i];
        }
    };

    @C09CT("search_enter_position")
    public final String searchEnterPosition;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("search_keyword")
    public final String searchKeyWord;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("search_type")
    public final String searchType;

    public final CreationSearchModel copy(String str, String str2, String str3, String str4, String str5) {
        return new CreationSearchModel(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationSearchModel)) {
            return false;
        }
        CreationSearchModel creationSearchModel = (CreationSearchModel) obj;
        return Intrinsics.LJFF(this.searchId, creationSearchModel.searchId) && Intrinsics.LJFF(this.searchKeyWord, creationSearchModel.searchKeyWord) && Intrinsics.LJFF(this.searchResultId, creationSearchModel.searchResultId) && Intrinsics.LJFF(this.searchType, creationSearchModel.searchType) && Intrinsics.LJFF(this.searchEnterPosition, creationSearchModel.searchEnterPosition);
    }

    public int hashCode() {
        return (((((((this.searchId.hashCode() * 31) + this.searchKeyWord.hashCode()) * 31) + this.searchResultId.hashCode()) * 31) + this.searchType.hashCode()) * 31) + this.searchEnterPosition.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationSearchModel(searchId=");
        sbLIZ.append(this.searchId);
        sbLIZ.append(", searchKeyWord=");
        sbLIZ.append(this.searchKeyWord);
        sbLIZ.append(", searchResultId=");
        sbLIZ.append(this.searchResultId);
        sbLIZ.append(", searchType=");
        sbLIZ.append(this.searchType);
        sbLIZ.append(", searchEnterPosition=");
        sbLIZ.append(this.searchEnterPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.searchId);
        parcel.writeString(this.searchKeyWord);
        parcel.writeString(this.searchResultId);
        parcel.writeString(this.searchType);
        parcel.writeString(this.searchEnterPosition);
    }

    public CreationSearchModel() {
        this("", "", "", "", "");
    }

    public final String getSearchEnterPosition() {
        return this.searchEnterPosition;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public final String getSearchResultId() {
        return this.searchResultId;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public CreationSearchModel(String str, String str2, String str3, String str4, String str5) {
        this.searchId = str;
        this.searchKeyWord = str2;
        this.searchResultId = str3;
        this.searchType = str4;
        this.searchEnterPosition = str5;
    }
}
