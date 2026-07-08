package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C0FQ0;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.VideoAnimModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditEffectModel implements C0FQ0, Parcelable {
    public static final Parcelable.Creator<EditEffectModel> CREATOR = new Parcelable.Creator<EditEffectModel>() { // from class: X.0FPz
        @Override // android.os.Parcelable.Creator
        public final EditEffectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EditEffectModel.class.getClassLoader()));
            }
            EffectPointModel effectPointModel = (EffectPointModel) parcel.readParcelable(EditEffectModel.class.getClassLoader());
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(parcel.readParcelable(EditEffectModel.class.getClassLoader()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList3.add(parcel.readParcelable(EditEffectModel.class.getClassLoader()));
            }
            return new EditEffectModel(arrayList, effectPointModel, i3, z, string, z2, z3, arrayListCreateStringArrayList, arrayList2, arrayList3, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EditEffectModel[] newArray(int i) {
            return new EditEffectModel[i];
        }
    };

    @C09CT("count_search_session")
    public int countSearchSession;

    @C09CT("creator_search_info")
    public List<String> creatorSearchInfo;

    @C040H
    public List<Effect> defaultEffectList;

    @C09CT("editing_effect_search_from")
    public List<String> editingEffectSearchFrom;

    @C09CT("effect_from_path")
    public List<String> effectFromPaths;

    @C09CT("effect_list")
    public ArrayList<EffectPointModel> effectList;

    @C09CT("selected_effect_pro")
    public int effectSource;

    @C09CT("force_enter_multi_track")
    public boolean forceEnterMultiTrack;

    @C09CT("is_edit_effect_duration")
    public boolean hasClippedEffect;

    @C09CT("has_multi_track_effect")
    public boolean hasMultiTrackEffect;

    @C09CT("prop_selected_from")
    public String propSelectedFrom;

    @C09CT("search_id")
    public List<String> searchId;

    @C09CT("search_keyword")
    public List<String> searchKeyword;

    @C09CT("search_result_id")
    public List<String> searchResultId;

    @C09CT("search_universal_rank")
    public List<String> searchUniversalRank;

    @C09CT("time_effect")
    public EffectPointModel timeEffect;

    @C09CT("anim_list")
    public ArrayList<VideoAnimModel> videoAnimModel;

    public EditEffectModel() {
        this(new ArrayList(), null, -1, false, "", false, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditEffectModel)) {
            return false;
        }
        EditEffectModel editEffectModel = (EditEffectModel) obj;
        return Intrinsics.LJFF(this.effectList, editEffectModel.effectList) && Intrinsics.LJFF(this.timeEffect, editEffectModel.timeEffect) && this.effectSource == editEffectModel.effectSource && this.hasMultiTrackEffect == editEffectModel.hasMultiTrackEffect && Intrinsics.LJFF(this.propSelectedFrom, editEffectModel.propSelectedFrom) && this.forceEnterMultiTrack == editEffectModel.forceEnterMultiTrack && this.hasClippedEffect == editEffectModel.hasClippedEffect && Intrinsics.LJFF(this.effectFromPaths, editEffectModel.effectFromPaths) && Intrinsics.LJFF(this.defaultEffectList, editEffectModel.defaultEffectList) && Intrinsics.LJFF(this.videoAnimModel, editEffectModel.videoAnimModel) && Intrinsics.LJFF(this.editingEffectSearchFrom, editEffectModel.editingEffectSearchFrom) && Intrinsics.LJFF(this.searchId, editEffectModel.searchId) && Intrinsics.LJFF(this.searchKeyword, editEffectModel.searchKeyword) && Intrinsics.LJFF(this.searchResultId, editEffectModel.searchResultId) && Intrinsics.LJFF(this.searchUniversalRank, editEffectModel.searchUniversalRank) && Intrinsics.LJFF(this.creatorSearchInfo, editEffectModel.creatorSearchInfo) && this.countSearchSession == editEffectModel.countSearchSession;
    }

    public final int hashCode() {
        int iHashCode = this.effectList.hashCode() * 31;
        EffectPointModel effectPointModel = this.timeEffect;
        return ((((((((((((((((((((((((((((((iHashCode + (effectPointModel == null ? 0 : effectPointModel.hashCode())) * 31) + this.effectSource) * 31) + C786410Ut5.Z2(this.hasMultiTrackEffect)) * 31) + this.propSelectedFrom.hashCode()) * 31) + C786410Ut5.Z2(this.forceEnterMultiTrack)) * 31) + C786410Ut5.Z2(this.hasClippedEffect)) * 31) + this.effectFromPaths.hashCode()) * 31) + this.defaultEffectList.hashCode()) * 31) + this.videoAnimModel.hashCode()) * 31) + this.editingEffectSearchFrom.hashCode()) * 31) + this.searchId.hashCode()) * 31) + this.searchKeyword.hashCode()) * 31) + this.searchResultId.hashCode()) * 31) + this.searchUniversalRank.hashCode()) * 31) + this.creatorSearchInfo.hashCode()) * 31) + this.countSearchSession;
    }

    public final String toString() {
        return "EditEffectModel(effectList=" + this.effectList + ", timeEffect=" + this.timeEffect + ", effectSource=" + this.effectSource + ", hasMultiTrackEffect=" + this.hasMultiTrackEffect + ", propSelectedFrom=" + this.propSelectedFrom + ", forceEnterMultiTrack=" + this.forceEnterMultiTrack + ", hasClippedEffect=" + this.hasClippedEffect + ", effectFromPaths=" + this.effectFromPaths + ", defaultEffectList=" + this.defaultEffectList + ", videoAnimModel=" + this.videoAnimModel + ", editingEffectSearchFrom=" + this.editingEffectSearchFrom + ", searchId=" + this.searchId + ", searchKeyword=" + this.searchKeyword + ", searchResultId=" + this.searchResultId + ", searchUniversalRank=" + this.searchUniversalRank + ", creatorSearchInfo=" + this.creatorSearchInfo + ", countSearchSession=" + this.countSearchSession + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<EffectPointModel> arrayList = this.effectList;
        parcel.writeInt(arrayList.size());
        Iterator<EffectPointModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeParcelable(this.timeEffect, i);
        parcel.writeInt(this.effectSource);
        parcel.writeInt(this.hasMultiTrackEffect ? 1 : 0);
        parcel.writeString(this.propSelectedFrom);
        parcel.writeInt(this.forceEnterMultiTrack ? 1 : 0);
        parcel.writeInt(this.hasClippedEffect ? 1 : 0);
        parcel.writeStringList(this.effectFromPaths);
        List<Effect> list = this.defaultEffectList;
        parcel.writeInt(list.size());
        Iterator<Effect> it3 = list.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        ArrayList<VideoAnimModel> arrayList2 = this.videoAnimModel;
        parcel.writeInt(arrayList2.size());
        Iterator<VideoAnimModel> it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
        parcel.writeStringList(this.editingEffectSearchFrom);
        parcel.writeStringList(this.searchId);
        parcel.writeStringList(this.searchKeyword);
        parcel.writeStringList(this.searchResultId);
        parcel.writeStringList(this.searchUniversalRank);
        parcel.writeStringList(this.creatorSearchInfo);
        parcel.writeInt(this.countSearchSession);
    }

    public static EditEffectModel LIZ(EditEffectModel editEffectModel, boolean z) {
        ArrayList<EffectPointModel> arrayList = editEffectModel.effectList;
        EffectPointModel effectPointModel = editEffectModel.timeEffect;
        int i = editEffectModel.effectSource;
        boolean z2 = editEffectModel.hasMultiTrackEffect;
        String str = editEffectModel.propSelectedFrom;
        boolean z3 = editEffectModel.forceEnterMultiTrack;
        List<String> list = editEffectModel.effectFromPaths;
        List<Effect> list2 = editEffectModel.defaultEffectList;
        ArrayList<VideoAnimModel> arrayList2 = editEffectModel.videoAnimModel;
        List<String> list3 = editEffectModel.editingEffectSearchFrom;
        List<String> list4 = editEffectModel.searchId;
        List<String> list5 = editEffectModel.searchKeyword;
        List<String> list6 = editEffectModel.searchResultId;
        List<String> list7 = editEffectModel.searchUniversalRank;
        List<String> list8 = editEffectModel.creatorSearchInfo;
        int i2 = editEffectModel.countSearchSession;
        editEffectModel.getClass();
        return new EditEffectModel(arrayList, effectPointModel, i, z2, str, z3, z, list, list2, arrayList2, list3, list4, list5, list6, list7, list8, i2);
    }

    public EditEffectModel(ArrayList<EffectPointModel> arrayList, EffectPointModel effectPointModel, int i, boolean z, String str, boolean z2, boolean z3, List<String> list, List<Effect> list2, ArrayList<VideoAnimModel> arrayList2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, int i2) {
        this.effectList = arrayList;
        this.timeEffect = effectPointModel;
        this.effectSource = i;
        this.hasMultiTrackEffect = z;
        this.propSelectedFrom = str;
        this.forceEnterMultiTrack = z2;
        this.hasClippedEffect = z3;
        this.effectFromPaths = list;
        this.defaultEffectList = list2;
        this.videoAnimModel = arrayList2;
        this.editingEffectSearchFrom = list3;
        this.searchId = list4;
        this.searchKeyword = list5;
        this.searchResultId = list6;
        this.searchUniversalRank = list7;
        this.creatorSearchInfo = list8;
        this.countSearchSession = i2;
    }
}
