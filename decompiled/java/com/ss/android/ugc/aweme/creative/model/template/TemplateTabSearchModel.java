package com.ss.android.ugc.aweme.creative.model.template;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.template.TemplateTabSearchModel;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateTabSearchModel implements Parcelable {
    public static final Parcelable.Creator<TemplateTabSearchModel> CREATOR = new Parcelable.Creator<TemplateTabSearchModel>() { // from class: X.0mc4
        @Override // android.os.Parcelable.Creator
        public final TemplateTabSearchModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TemplateTabSearchModel(string, string2, string3, string4, string5, string6, string7, string8, string9, i, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateTabSearchModel[] newArray(int i) {
            return new TemplateTabSearchModel[i];
        }
    };

    @C09CT("create_tab_search_location")
    public String createTabSearchLocation;

    @C09CT("creator_search_info")
    public String creatorSearchInfo;

    @C09CT("is_quick_search")
    public int isQuickSearch;

    @C09CT("search_id")
    public String searchId;

    @C09CT("search_keyword")
    public String searchKeyword;

    @C09CT("search_result_id")
    public String searchResultId;

    @C09CT("search_type")
    public String searchType;

    @C09CT("search_universal_rank")
    public String searchUniversalRank;

    @C09CT("tab_search_enter_method")
    public String tabSearchEnterMethod;

    @C09CT("template_search_enter_from")
    public String templateSearchEnterFrom;

    @C09CT("words_position")
    public Integer wordsPosition;

    public TemplateTabSearchModel() {
        this(null, null, null, null, null, null, null, null, null, 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.templateSearchEnterFrom);
        parcel.writeString(this.creatorSearchInfo);
        parcel.writeString(this.searchId);
        parcel.writeString(this.searchType);
        parcel.writeString(this.searchKeyword);
        parcel.writeString(this.searchResultId);
        parcel.writeString(this.searchUniversalRank);
        parcel.writeString(this.createTabSearchLocation);
        parcel.writeString(this.tabSearchEnterMethod);
        parcel.writeInt(this.isQuickSearch);
        Integer num = this.wordsPosition;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public TemplateTabSearchModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Integer num) {
        this.templateSearchEnterFrom = str;
        this.creatorSearchInfo = str2;
        this.searchId = str3;
        this.searchType = str4;
        this.searchKeyword = str5;
        this.searchResultId = str6;
        this.searchUniversalRank = str7;
        this.createTabSearchLocation = str8;
        this.tabSearchEnterMethod = str9;
        this.isQuickSearch = i;
        this.wordsPosition = num;
    }
}
