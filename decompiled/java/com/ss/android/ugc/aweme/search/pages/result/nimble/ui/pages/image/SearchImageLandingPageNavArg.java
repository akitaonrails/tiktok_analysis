package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.C0QA8;
import X.C0QC8;
import X.C2097608Jq;
import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingPageNavArg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageLandingPageNavArg implements IRouteArg {
    public final String feedbackType;
    public final Boolean inflowDetailPageOpt;
    public final C0QA8 loadMoreConfig;
    public final Map<String, String> logParams;
    public final String sceneType;
    public final int selectIndex;
    public final String sharedVMKey;
    public final Boolean showDotIndicatorBottom;
    public static final C0QC8 Companion = new Object() { // from class: X.0QC8
    };
    public static final Parcelable.Creator<SearchImageLandingPageNavArg> CREATOR = new Parcelable.Creator<SearchImageLandingPageNavArg>() { // from class: X.0QC6
        @Override // android.os.Parcelable.Creator
        public final SearchImageLandingPageNavArg createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            boolean z2 = false;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String string = parcel.readString();
            int i3 = parcel.readInt();
            C0QA8 c0qa8 = (C0QA8) parcel.readSerializable();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new SearchImageLandingPageNavArg(linkedHashMap, string, i3, c0qa8, string2, boolValueOf, boolValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchImageLandingPageNavArg[] newArray(int i) {
            return new SearchImageLandingPageNavArg[i];
        }
    };
    public static final int $stable = 8;

    public SearchImageLandingPageNavArg() {
        this(C2097608Jq.LJ(), "", 0, null, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public final SearchImageLandingPageNavArg copy(Map<String, String> map, String str, int i, C0QA8 c0qa8, String str2, Boolean bool, Boolean bool2, String str3) {
        return new SearchImageLandingPageNavArg(map, str, i, c0qa8, str2, bool, bool2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchImageLandingPageNavArg)) {
            return false;
        }
        SearchImageLandingPageNavArg searchImageLandingPageNavArg = (SearchImageLandingPageNavArg) obj;
        return Intrinsics.LJFF(this.logParams, searchImageLandingPageNavArg.logParams) && Intrinsics.LJFF(this.sharedVMKey, searchImageLandingPageNavArg.sharedVMKey) && this.selectIndex == searchImageLandingPageNavArg.selectIndex && Intrinsics.LJFF(this.loadMoreConfig, searchImageLandingPageNavArg.loadMoreConfig) && Intrinsics.LJFF(this.feedbackType, searchImageLandingPageNavArg.feedbackType) && Intrinsics.LJFF(this.inflowDetailPageOpt, searchImageLandingPageNavArg.inflowDetailPageOpt) && Intrinsics.LJFF(this.showDotIndicatorBottom, searchImageLandingPageNavArg.showDotIndicatorBottom) && Intrinsics.LJFF(this.sceneType, searchImageLandingPageNavArg.sceneType);
    }

    public int hashCode() {
        int iHashCode = ((((this.logParams.hashCode() * 31) + this.sharedVMKey.hashCode()) * 31) + this.selectIndex) * 31;
        C0QA8 c0qa8 = this.loadMoreConfig;
        int iHashCode2 = (iHashCode + (c0qa8 == null ? 0 : c0qa8.hashCode())) * 31;
        String str = this.feedbackType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.inflowDetailPageOpt;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showDotIndicatorBottom;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.sceneType;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImageLandingPageNavArg(logParams=");
        sbLIZ.append(this.logParams);
        sbLIZ.append(", sharedVMKey=");
        sbLIZ.append(this.sharedVMKey);
        sbLIZ.append(", selectIndex=");
        sbLIZ.append(this.selectIndex);
        sbLIZ.append(", loadMoreConfig=");
        sbLIZ.append(this.loadMoreConfig);
        sbLIZ.append(", feedbackType=");
        sbLIZ.append(this.feedbackType);
        sbLIZ.append(", inflowDetailPageOpt=");
        sbLIZ.append(this.inflowDetailPageOpt);
        sbLIZ.append(", showDotIndicatorBottom=");
        sbLIZ.append(this.showDotIndicatorBottom);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.sceneType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, String> map = this.logParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.sharedVMKey);
        parcel.writeInt(this.selectIndex);
        parcel.writeSerializable(this.loadMoreConfig);
        parcel.writeString(this.feedbackType);
        Boolean bool = this.inflowDetailPageOpt;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showDotIndicatorBottom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.sceneType);
    }

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final Boolean getInflowDetailPageOpt() {
        return this.inflowDetailPageOpt;
    }

    public final C0QA8 getLoadMoreConfig() {
        return this.loadMoreConfig;
    }

    public final Map<String, String> getLogParams() {
        return this.logParams;
    }

    public final String getSceneType() {
        return this.sceneType;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    public final String getSharedVMKey() {
        return this.sharedVMKey;
    }

    public final Boolean getShowDotIndicatorBottom() {
        return this.showDotIndicatorBottom;
    }

    public SearchImageLandingPageNavArg(Map<String, String> map) {
        this(map, "", 0, null, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public static SearchImageLandingPageNavArg __fromBundle(Bundle bundle) {
        int i;
        Map mapLJ;
        String str;
        Integer num;
        C0QA8 c0qa8;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        int iIntValue = 0;
        if (bundle.containsKey("log_params_hashmap")) {
            mapLJ = (Map) RouteParser.INSTANCE.parse(bundle.get("log_params_hashmap"), Map.class);
            i = 0;
        } else {
            i = 1;
            mapLJ = null;
        }
        if (bundle.containsKey("shared_vm_key")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("shared_vm_key"), String.class);
        } else {
            i += 2;
            str = null;
        }
        if (bundle.containsKey("select_index")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("select_index"), Integer.class);
            if (num == null) {
                i += 4;
            }
        } else {
            i += 4;
            num = null;
        }
        if (bundle.containsKey("load_more_config")) {
            c0qa8 = (C0QA8) RouteParser.INSTANCE.parse(bundle.get("load_more_config"), C0QA8.class);
        } else {
            i += 8;
            c0qa8 = null;
        }
        if (bundle.containsKey("feedback_type")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("feedback_type"), String.class);
        } else {
            i += 16;
            str2 = null;
        }
        if (bundle.containsKey("inflow_detail_page_opt")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("inflow_detail_page_opt"), Boolean.class);
        } else {
            i += 32;
            bool = null;
        }
        if (bundle.containsKey("show_dot_indicator_bottom")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("show_dot_indicator_bottom"), Boolean.class);
        } else {
            i += 64;
            bool2 = null;
        }
        if (bundle.containsKey("scene_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("scene_type"), String.class);
        } else {
            i += 128;
        }
        if (num != null) {
            iIntValue = num.intValue();
        }
        String str4 = null;
        if ((i & 1) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            iIntValue = 0;
        }
        String str5 = null;
        if ((i & 8) != 0) {
            c0qa8 = null;
        }
        if ((i & 16) == 0) {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 64) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 128) == 0) {
            str5 = str3;
        }
        return new SearchImageLandingPageNavArg(mapLJ, str, iIntValue, c0qa8, str4, bool, bool2, str5);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str) {
        this(map, str, 0, null, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i) {
        this(map, str, i, null, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i, C0QA8 c0qa8) {
        this(map, str, i, c0qa8, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i, C0QA8 c0qa8, String str2) {
        this(map, str, i, c0qa8, str2, Boolean.FALSE, Boolean.FALSE, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i, C0QA8 c0qa8, String str2, Boolean bool) {
        this(map, str, i, c0qa8, str2, bool, Boolean.FALSE, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i, C0QA8 c0qa8, String str2, Boolean bool, Boolean bool2) {
        this(map, str, i, c0qa8, str2, bool, bool2, null);
    }

    public SearchImageLandingPageNavArg(Map<String, String> map, String str, int i, C0QA8 c0qa8, String str2, Boolean bool, Boolean bool2, String str3) {
        this.logParams = map;
        this.sharedVMKey = str;
        this.selectIndex = i;
        this.loadMoreConfig = c0qa8;
        this.feedbackType = str2;
        this.inflowDetailPageOpt = bool;
        this.showDotIndicatorBottom = bool2;
        this.sceneType = str3;
    }
}
