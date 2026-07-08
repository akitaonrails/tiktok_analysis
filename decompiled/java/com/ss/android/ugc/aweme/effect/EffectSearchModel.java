package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EffectSearchModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectSearchModel> CREATOR = new Parcelable.Creator<EffectSearchModel>() { // from class: X.08zh
        @Override // android.os.Parcelable.Creator
        public final EffectSearchModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z3 = true;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new EffectSearchModel(string, string2, string3, string4, string5, string6, string7, boolValueOf, boolValueOf2, boolValueOf3, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectSearchModel[] newArray(int i) {
            return new EffectSearchModel[i];
        }
    };

    @C09CT("applied_from_search_panel")
    public Boolean appliedFromSearchPanel;

    @C09CT("apply_time")
    public Long applyTime;

    @C09CT("creator_search_info")
    public final String creatorSearchInfo;

    @C09CT("inserted_from_search_panel")
    public Boolean insertedFromSearchPanel;

    @C09CT("is_first_screen")
    public final Boolean isFirstScreen;

    @C09CT("search_from")
    public final String searchFrom;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("search_keyword")
    public final String searchKeyword;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("search_universal_rank")
    public final String searchUniversalRank;

    @C09CT("token_type")
    public final String tokenType;

    public final EffectSearchModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, Long l) {
        return new EffectSearchModel(str, str2, str3, str4, str5, str6, str7, bool, bool2, bool3, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectSearchModel)) {
            return false;
        }
        EffectSearchModel effectSearchModel = (EffectSearchModel) obj;
        return Intrinsics.LJFF(this.searchFrom, effectSearchModel.searchFrom) && Intrinsics.LJFF(this.tokenType, effectSearchModel.tokenType) && Intrinsics.LJFF(this.searchId, effectSearchModel.searchId) && Intrinsics.LJFF(this.searchKeyword, effectSearchModel.searchKeyword) && Intrinsics.LJFF(this.searchResultId, effectSearchModel.searchResultId) && Intrinsics.LJFF(this.searchUniversalRank, effectSearchModel.searchUniversalRank) && Intrinsics.LJFF(this.creatorSearchInfo, effectSearchModel.creatorSearchInfo) && Intrinsics.LJFF(this.isFirstScreen, effectSearchModel.isFirstScreen) && Intrinsics.LJFF(this.insertedFromSearchPanel, effectSearchModel.insertedFromSearchPanel) && Intrinsics.LJFF(this.appliedFromSearchPanel, effectSearchModel.appliedFromSearchPanel) && Intrinsics.LJFF(this.applyTime, effectSearchModel.applyTime);
    }

    public int hashCode() {
        String str = this.searchFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchKeyword;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.searchResultId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.searchUniversalRank;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.creatorSearchInfo;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isFirstScreen;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.insertedFromSearchPanel;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.appliedFromSearchPanel;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.applyTime;
        return iHashCode10 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "EffectSearchModel(searchFrom=" + this.searchFrom + ", tokenType=" + this.tokenType + ", searchId=" + this.searchId + ", searchKeyword=" + this.searchKeyword + ", searchResultId=" + this.searchResultId + ", searchUniversalRank=" + this.searchUniversalRank + ", creatorSearchInfo=" + this.creatorSearchInfo + ", isFirstScreen=" + this.isFirstScreen + ", insertedFromSearchPanel=" + this.insertedFromSearchPanel + ", appliedFromSearchPanel=" + this.appliedFromSearchPanel + ", applyTime=" + this.applyTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.searchFrom);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.searchId);
        parcel.writeString(this.searchKeyword);
        parcel.writeString(this.searchResultId);
        parcel.writeString(this.searchUniversalRank);
        parcel.writeString(this.creatorSearchInfo);
        Boolean bool = this.isFirstScreen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.insertedFromSearchPanel;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.appliedFromSearchPanel;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l = this.applyTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final Boolean getAppliedFromSearchPanel() {
        return this.appliedFromSearchPanel;
    }

    public final Long getApplyTime() {
        return this.applyTime;
    }

    public final String getCreatorSearchInfo() {
        return this.creatorSearchInfo;
    }

    public final Boolean getInsertedFromSearchPanel() {
        return this.insertedFromSearchPanel;
    }

    public final String getSearchFrom() {
        return this.searchFrom;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public final String getSearchResultId() {
        return this.searchResultId;
    }

    public final String getSearchUniversalRank() {
        return this.searchUniversalRank;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final Boolean isFirstScreen() {
        return this.isFirstScreen;
    }

    public final void setAppliedFromSearchPanel(Boolean bool) {
        this.appliedFromSearchPanel = bool;
    }

    public final void setApplyTime(Long l) {
        this.applyTime = l;
    }

    public final void setInsertedFromSearchPanel(Boolean bool) {
        this.insertedFromSearchPanel = bool;
    }

    public EffectSearchModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, Long l) {
        this.searchFrom = str;
        this.tokenType = str2;
        this.searchId = str3;
        this.searchKeyword = str4;
        this.searchResultId = str5;
        this.searchUniversalRank = str6;
        this.creatorSearchInfo = str7;
        this.isFirstScreen = bool;
        this.insertedFromSearchPanel = bool2;
        this.appliedFromSearchPanel = bool3;
        this.applyTime = l;
    }
}
