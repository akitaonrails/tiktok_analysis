package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1954807lC;
import X.C2097608Jq;
import X.C452501pT;
import X.C636570Oxz;
import X.C636640Oy6;
import X.C636660Oy8;
import X.EnumC636670Oy9;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.DisplayTranslatedText;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchProsConsJSBRequestModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchProsConsJSBRequestModel implements Parcelable {

    @C09CT("all")
    public final List<Tag> all;
    public final transient C01GW allPageMeta$delegate;

    @C09CT("columnText")
    public final DisplayTranslatedText columnText;

    @C09CT("cons")
    public final List<Tag> cons;
    public final transient C01GW consPageMeta$delegate;

    @C09CT("initialIndex")
    public final int initialIndex;

    @C09CT("initialTagString")
    public final String initialTagString;
    public Map<String, String> logParams;

    @C09CT("pros")
    public final List<Tag> pros;
    public final transient C01GW prosPageMeta$delegate;

    @C09CT("request_params")
    public final Map<String, String> requestParams;

    @C09CT("request_path")
    public final String requestPath;

    @C09CT("sessionID")
    public final String sessionID;

    @C09CT("shouldShowTrailingText")
    public final Boolean shouldShowTrailingText;

    @C09CT("showTabs")
    public final List<String> showTabs;
    public Map<String, String> takoMediaParams;
    public Map<String, String> userContentMap;
    public static final C636640Oy6 Companion = new C636640Oy6();
    public static final Parcelable.Creator<SearchProsConsJSBRequestModel> CREATOR = new Parcelable.Creator<SearchProsConsJSBRequestModel>() { // from class: X.0Oy5
        @Override // android.os.Parcelable.Creator
        public final SearchProsConsJSBRequestModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            DisplayTranslatedText displayTranslatedTextCreateFromParcel = DisplayTranslatedText.CREATOR.createFromParcel(parcel);
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(Tag.CREATOR.createFromParcel(parcel));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList2.add(Tag.CREATOR.createFromParcel(parcel));
            }
            int i8 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList3.add(Tag.CREATOR.createFromParcel(parcel));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
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
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap4.put(parcel.readString(), parcel.readString());
            }
            return new SearchProsConsJSBRequestModel(string, linkedHashMap, string2, i3, displayTranslatedTextCreateFromParcel, arrayList, arrayList2, arrayList3, arrayListCreateStringArrayList, string3, boolValueOf, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchProsConsJSBRequestModel[] newArray(int i) {
            return new SearchProsConsJSBRequestModel[i];
        }
    };
    public static final int $stable = 8;

    public SearchProsConsJSBRequestModel() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchProsConsJSBRequestModel)) {
            return false;
        }
        SearchProsConsJSBRequestModel searchProsConsJSBRequestModel = (SearchProsConsJSBRequestModel) obj;
        return Intrinsics.LJFF(this.requestPath, searchProsConsJSBRequestModel.requestPath) && Intrinsics.LJFF(this.requestParams, searchProsConsJSBRequestModel.requestParams) && Intrinsics.LJFF(this.sessionID, searchProsConsJSBRequestModel.sessionID) && this.initialIndex == searchProsConsJSBRequestModel.initialIndex && Intrinsics.LJFF(this.columnText, searchProsConsJSBRequestModel.columnText) && Intrinsics.LJFF(this.all, searchProsConsJSBRequestModel.all) && Intrinsics.LJFF(this.pros, searchProsConsJSBRequestModel.pros) && Intrinsics.LJFF(this.cons, searchProsConsJSBRequestModel.cons) && Intrinsics.LJFF(this.showTabs, searchProsConsJSBRequestModel.showTabs) && Intrinsics.LJFF(this.initialTagString, searchProsConsJSBRequestModel.initialTagString) && Intrinsics.LJFF(this.shouldShowTrailingText, searchProsConsJSBRequestModel.shouldShowTrailingText) && Intrinsics.LJFF(this.logParams, searchProsConsJSBRequestModel.logParams) && Intrinsics.LJFF(this.takoMediaParams, searchProsConsJSBRequestModel.takoMediaParams) && Intrinsics.LJFF(this.userContentMap, searchProsConsJSBRequestModel.userContentMap);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.requestPath.hashCode() * 31) + this.requestParams.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.initialIndex) * 31) + this.columnText.hashCode()) * 31) + this.all.hashCode()) * 31) + this.pros.hashCode()) * 31) + this.cons.hashCode()) * 31) + this.showTabs.hashCode()) * 31;
        String str = this.initialTagString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shouldShowTrailingText;
        return ((((((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.logParams.hashCode()) * 31) + this.takoMediaParams.hashCode()) * 31) + this.userContentMap.hashCode();
    }

    public final String toString() {
        return "SearchProsConsJSBRequestModel(requestPath=" + this.requestPath + ", requestParams=" + this.requestParams + ", sessionID=" + this.sessionID + ", initialIndex=" + this.initialIndex + ", columnText=" + this.columnText + ", all=" + this.all + ", pros=" + this.pros + ", cons=" + this.cons + ", showTabs=" + this.showTabs + ", initialTagString=" + this.initialTagString + ", shouldShowTrailingText=" + this.shouldShowTrailingText + ", logParams=" + this.logParams + ", takoMediaParams=" + this.takoMediaParams + ", userContentMap=" + this.userContentMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.requestPath);
        Map<String, String> map = this.requestParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.sessionID);
        parcel.writeInt(this.initialIndex);
        this.columnText.writeToParcel(parcel, i);
        List<Tag> list = this.all;
        parcel.writeInt(list.size());
        Iterator<Tag> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<Tag> list2 = this.pros;
        parcel.writeInt(list2.size());
        Iterator<Tag> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<Tag> list3 = this.cons;
        parcel.writeInt(list3.size());
        Iterator<Tag> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.showTabs);
        parcel.writeString(this.initialTagString);
        Boolean bool = this.shouldShowTrailingText;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        Map<String, String> map2 = this.logParams;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        Map<String, String> map3 = this.takoMediaParams;
        parcel.writeInt(map3.size());
        for (Map.Entry<String, String> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeString(entry3.getValue());
        }
        Map<String, String> map4 = this.userContentMap;
        parcel.writeInt(map4.size());
        for (Map.Entry<String, String> entry4 : map4.entrySet()) {
            parcel.writeString(entry4.getKey());
            parcel.writeString(entry4.getValue());
        }
    }

    public final C636570Oxz LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 96673) {
            if (iHashCode != 3059505) {
                if (iHashCode == 3449702 && str.equals("pros")) {
                    return (C636570Oxz) this.prosPageMeta$delegate.getValue();
                }
                return null;
            }
            if (str.equals("cons")) {
                return (C636570Oxz) this.consPageMeta$delegate.getValue();
            }
            return null;
        }
        if (str.equals("all")) {
            return (C636570Oxz) this.allPageMeta$delegate.getValue();
        }
        return null;
    }

    public final C636570Oxz LIZIZ(EnumC636670Oy9 enumC636670Oy9) {
        Iterable iterable;
        Iterable iterable2;
        Pair pair;
        int i = C636660Oy8.LIZ[enumC636670Oy9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    pair = new Pair(this.columnText.cons, this.cons);
                } else {
                    throw new C1954807lC();
                }
            } else {
                pair = new Pair(this.columnText.pros, this.pros);
            }
        } else {
            String str = this.columnText.all;
            List<Tag> list = this.all;
            C636570Oxz c636570Oxz = (C636570Oxz) this.prosPageMeta$delegate.getValue();
            if (c636570Oxz == null || (iterable = c636570Oxz.LIZJ) == null) {
                iterable = C13BV.INSTANCE;
            }
            List listLJLIL = C13LP.LJLIL(iterable, list);
            C636570Oxz c636570Oxz2 = (C636570Oxz) this.consPageMeta$delegate.getValue();
            if (c636570Oxz2 == null || (iterable2 = c636570Oxz2.LIZJ) == null) {
                iterable2 = C13BV.INSTANCE;
            }
            pair = new Pair(str, C13LP.LJLIL(iterable2, listLJLIL));
        }
        String str2 = (String) pair.getFirst();
        List<Tag> list2 = (List) pair.getSecond();
        ArrayList arrayList = new ArrayList();
        Tag tag = null;
        for (Tag tag2 : list2) {
            if (Intrinsics.LJFF(tag2.text, enumC636670Oy9.getText())) {
                tag = tag2;
            } else {
                arrayList.add(tag2);
            }
        }
        if (tag == null) {
            return null;
        }
        return new C636570Oxz(str2, tag, arrayList);
    }

    public SearchProsConsJSBRequestModel(String str, Map<String, String> map, String str2, int i, DisplayTranslatedText displayTranslatedText, List<Tag> list, List<Tag> list2, List<Tag> list3, List<String> list4, String str3, Boolean bool, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        this.requestPath = str;
        this.requestParams = map;
        this.sessionID = str2;
        this.initialIndex = i;
        this.columnText = displayTranslatedText;
        this.all = list;
        this.pros = list2;
        this.cons = list3;
        this.showTabs = list4;
        this.initialTagString = str3;
        this.shouldShowTrailingText = bool;
        this.logParams = map2;
        this.takoMediaParams = map3;
        this.userContentMap = map4;
        this.allPageMeta$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1460));
        this.prosPageMeta$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1462));
        this.consPageMeta$delegate = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1461));
    }

    public SearchProsConsJSBRequestModel(String str, Map map, String str2, int i, DisplayTranslatedText displayTranslatedText, List list, List list2, List list3, List list4, String str3, Boolean bool, Map map2, Map map3, Map map4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C2097608Jq.LJ() : map, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new DisplayTranslatedText("", "", "") : displayTranslatedText, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) != 0 ? C13BV.INSTANCE : list2, (i2 & 128) != 0 ? C13BV.INSTANCE : list3, (i2 & 256) != 0 ? C13BV.INSTANCE : list4, (i2 & 512) != 0 ? null : str3, (i2 & 1024) == 0 ? bool : null, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : map2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : map3, (i2 & 8192) != 0 ? C2097608Jq.LJ() : map4);
    }
}
