package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.EffectMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.UploadAssetsParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingModel implements Parcelable {
    public static final Parcelable.Creator<MixEditingModel> CREATOR = new Parcelable.Creator<MixEditingModel>() { // from class: X.0mrk
        @Override // android.os.Parcelable.Creator
        public final MixEditingModel createFromParcel(Parcel parcel) {
            SelectedMaterialItem selectedMaterialItemCreateFromParcel;
            TemplateMobParams templateMobParamsCreateFromParcel;
            ArrayList arrayList;
            ReusedMusicInfo reusedMusicInfoCreateFromParcel;
            boolean z;
            UploadAssetsParams uploadAssetsParamsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                selectedMaterialItemCreateFromParcel = null;
            } else {
                selectedMaterialItemCreateFromParcel = SelectedMaterialItem.CREATOR.createFromParcel(parcel);
            }
            SelectedMaterialItem selectedMaterialItem = selectedMaterialItemCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(EffectMobParams.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                templateMobParamsCreateFromParcel = null;
            } else {
                templateMobParamsCreateFromParcel = TemplateMobParams.CREATOR.createFromParcel(parcel);
            }
            TemplateMobParams templateMobParams = templateMobParamsCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(FeatureExtraction.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                reusedMusicInfoCreateFromParcel = null;
            } else {
                reusedMusicInfoCreateFromParcel = ReusedMusicInfo.CREATOR.createFromParcel(parcel);
            }
            ReusedMusicInfo reusedMusicInfo = reusedMusicInfoCreateFromParcel;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                uploadAssetsParamsCreateFromParcel = UploadAssetsParams.CREATOR.createFromParcel(parcel);
            }
            UploadAssetsParams uploadAssetsParams = uploadAssetsParamsCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MixEditingModel(selectedMaterialItem, arrayList2, templateMobParams, arrayList, string, string2, reusedMusicInfo, string3, uploadAssetsParams, z);
        }

        @Override // android.os.Parcelable.Creator
        public final MixEditingModel[] newArray(int i) {
            return new MixEditingModel[i];
        }
    };

    @C040H
    public final List<EffectMobParams> effectMobParamsList;

    @C040H
    public String enterMixEditingMethod;

    @C09CT("mix_editing_first_enter_from")
    public String firstEnterFrom;

    @C09CT("has_modified_media_list_in_ep")
    public boolean hasModifiedMediaListInEP;

    @C09CT("mix_editing_feature_extraction")
    public List<FeatureExtraction> mixEditingFeatureExtraction;

    @C040H
    public String requestId;

    @C09CT("mix_editing_reused_music_info")
    public ReusedMusicInfo reusedMusicInfo;

    @C09CT("selected_material_item")
    public SelectedMaterialItem selectedMaterialItem;

    @C09CT("template_material_item")
    public TemplateMobParams templateMobParams;

    @C09CT("mix_editing_upload_assets_params")
    public UploadAssetsParams uploadAssetsParams;

    public MixEditingModel() {
        this(null, new ArrayList(), null, null, "", "", null, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixEditingModel)) {
            return false;
        }
        MixEditingModel mixEditingModel = (MixEditingModel) obj;
        return Intrinsics.LJFF(this.selectedMaterialItem, mixEditingModel.selectedMaterialItem) && Intrinsics.LJFF(this.effectMobParamsList, mixEditingModel.effectMobParamsList) && Intrinsics.LJFF(this.templateMobParams, mixEditingModel.templateMobParams) && Intrinsics.LJFF(this.mixEditingFeatureExtraction, mixEditingModel.mixEditingFeatureExtraction) && Intrinsics.LJFF(this.requestId, mixEditingModel.requestId) && Intrinsics.LJFF(this.enterMixEditingMethod, mixEditingModel.enterMixEditingMethod) && Intrinsics.LJFF(this.reusedMusicInfo, mixEditingModel.reusedMusicInfo) && Intrinsics.LJFF(this.firstEnterFrom, mixEditingModel.firstEnterFrom) && Intrinsics.LJFF(this.uploadAssetsParams, mixEditingModel.uploadAssetsParams) && this.hasModifiedMediaListInEP == mixEditingModel.hasModifiedMediaListInEP;
    }

    public final int hashCode() {
        SelectedMaterialItem selectedMaterialItem = this.selectedMaterialItem;
        int iHashCode = (((selectedMaterialItem == null ? 0 : selectedMaterialItem.hashCode()) * 31) + this.effectMobParamsList.hashCode()) * 31;
        TemplateMobParams templateMobParams = this.templateMobParams;
        int iHashCode2 = (iHashCode + (templateMobParams == null ? 0 : templateMobParams.hashCode())) * 31;
        List<FeatureExtraction> list = this.mixEditingFeatureExtraction;
        int iHashCode3 = (((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.requestId.hashCode()) * 31) + this.enterMixEditingMethod.hashCode()) * 31;
        ReusedMusicInfo reusedMusicInfo = this.reusedMusicInfo;
        int iHashCode4 = (iHashCode3 + (reusedMusicInfo == null ? 0 : reusedMusicInfo.hashCode())) * 31;
        String str = this.firstEnterFrom;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        UploadAssetsParams uploadAssetsParams = this.uploadAssetsParams;
        return ((iHashCode5 + (uploadAssetsParams != null ? uploadAssetsParams.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hasModifiedMediaListInEP);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingModel(selectedMaterialItem=");
        sbLIZ.append(this.selectedMaterialItem);
        sbLIZ.append(", effectMobParamsList=");
        sbLIZ.append(this.effectMobParamsList);
        sbLIZ.append(", templateMobParams=");
        sbLIZ.append(this.templateMobParams);
        sbLIZ.append(", mixEditingFeatureExtraction=");
        sbLIZ.append(this.mixEditingFeatureExtraction);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", enterMixEditingMethod=");
        sbLIZ.append(this.enterMixEditingMethod);
        sbLIZ.append(", reusedMusicInfo=");
        sbLIZ.append(this.reusedMusicInfo);
        sbLIZ.append(", firstEnterFrom=");
        sbLIZ.append(this.firstEnterFrom);
        sbLIZ.append(", uploadAssetsParams=");
        sbLIZ.append(this.uploadAssetsParams);
        sbLIZ.append(", hasModifiedMediaListInEP=");
        sbLIZ.append(this.hasModifiedMediaListInEP);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SelectedMaterialItem selectedMaterialItem = this.selectedMaterialItem;
        if (selectedMaterialItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectedMaterialItem.writeToParcel(parcel, i);
        }
        List<EffectMobParams> list = this.effectMobParamsList;
        parcel.writeInt(list.size());
        Iterator<EffectMobParams> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        TemplateMobParams templateMobParams = this.templateMobParams;
        if (templateMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateMobParams.writeToParcel(parcel, i);
        }
        List<FeatureExtraction> list2 = this.mixEditingFeatureExtraction;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<FeatureExtraction> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.requestId);
        parcel.writeString(this.enterMixEditingMethod);
        ReusedMusicInfo reusedMusicInfo = this.reusedMusicInfo;
        if (reusedMusicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reusedMusicInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.firstEnterFrom);
        UploadAssetsParams uploadAssetsParams = this.uploadAssetsParams;
        if (uploadAssetsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uploadAssetsParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasModifiedMediaListInEP ? 1 : 0);
    }

    public MixEditingModel(SelectedMaterialItem selectedMaterialItem, List<EffectMobParams> list, TemplateMobParams templateMobParams, List<FeatureExtraction> list2, String str, String str2, ReusedMusicInfo reusedMusicInfo, String str3, UploadAssetsParams uploadAssetsParams, boolean z) {
        this.selectedMaterialItem = selectedMaterialItem;
        this.effectMobParamsList = list;
        this.templateMobParams = templateMobParams;
        this.mixEditingFeatureExtraction = list2;
        this.requestId = str;
        this.enterMixEditingMethod = str2;
        this.reusedMusicInfo = reusedMusicInfo;
        this.firstEnterFrom = str3;
        this.uploadAssetsParams = uploadAssetsParams;
        this.hasModifiedMediaListInEP = z;
    }
}
