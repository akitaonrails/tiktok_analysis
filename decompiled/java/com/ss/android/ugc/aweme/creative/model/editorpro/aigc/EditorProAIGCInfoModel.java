package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorTabAlbumAICreate;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCInfoModel implements Parcelable {
    public static final Parcelable.Creator<EditorProAIGCInfoModel> CREATOR = new Parcelable.Creator<EditorProAIGCInfoModel>() { // from class: X.0Eoo
        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCInfoModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EditorProAIGCMediaItemModel.CREATOR.createFromParcel(parcel));
            }
            TaskInfoInCreativeModel taskInfoInCreativeModelCreateFromParcel = TaskInfoInCreativeModel.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            HashMap map = new HashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                map.put(parcel.readString(), AIGCGenerationParam.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            HashMap map2 = new HashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                map2.put(parcel.readString(), MagicI2InfoModel.CREATOR.createFromParcel(parcel));
            }
            return new EditorProAIGCInfoModel(arrayList, taskInfoInCreativeModelCreateFromParcel, map, map2, EditorTabAlbumAICreate.CREATOR.createFromParcel(parcel), AiPlaygroundCameraModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCInfoModel[] newArray(int i) {
            return new EditorProAIGCInfoModel[i];
        }
    };

    @C09CT("ai_playground_camera_model")
    public AiPlaygroundCameraModel aiPlaygroundCameraModel;

    @C09CT("editor_pro_aigc_generation_param_type_map")
    public final HashMap<String, AIGCGenerationParam> editorProAIGCGenerationParamTypeMap;

    @C09CT("editorpro_aigc_media_item_model_list")
    public final ArrayList<EditorProAIGCMediaItemModel> editorProAIGCMediaItemModelList;

    @C09CT("editor_tab_album_ai_create")
    public final EditorTabAlbumAICreate editorTabAlbumAICreate;

    @C09CT("magic_i2i_info_model")
    public final HashMap<String, MagicI2InfoModel> magicI2IInfoModelMap;

    @C09CT("task_info_in_creative_model")
    public final TaskInfoInCreativeModel taskInfoInCreativeModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProAIGCInfoModel)) {
            return false;
        }
        EditorProAIGCInfoModel editorProAIGCInfoModel = (EditorProAIGCInfoModel) obj;
        return Intrinsics.LJFF(this.editorProAIGCMediaItemModelList, editorProAIGCInfoModel.editorProAIGCMediaItemModelList) && Intrinsics.LJFF(this.taskInfoInCreativeModel, editorProAIGCInfoModel.taskInfoInCreativeModel) && Intrinsics.LJFF(this.editorProAIGCGenerationParamTypeMap, editorProAIGCInfoModel.editorProAIGCGenerationParamTypeMap) && Intrinsics.LJFF(this.magicI2IInfoModelMap, editorProAIGCInfoModel.magicI2IInfoModelMap) && Intrinsics.LJFF(this.editorTabAlbumAICreate, editorProAIGCInfoModel.editorTabAlbumAICreate) && Intrinsics.LJFF(this.aiPlaygroundCameraModel, editorProAIGCInfoModel.aiPlaygroundCameraModel);
    }

    public final int hashCode() {
        return (((((((((this.editorProAIGCMediaItemModelList.hashCode() * 31) + this.taskInfoInCreativeModel.hashCode()) * 31) + this.editorProAIGCGenerationParamTypeMap.hashCode()) * 31) + this.magicI2IInfoModelMap.hashCode()) * 31) + this.editorTabAlbumAICreate.hashCode()) * 31) + this.aiPlaygroundCameraModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCInfoModel(editorProAIGCMediaItemModelList=");
        sbLIZ.append(this.editorProAIGCMediaItemModelList);
        sbLIZ.append(", taskInfoInCreativeModel=");
        sbLIZ.append(this.taskInfoInCreativeModel);
        sbLIZ.append(", editorProAIGCGenerationParamTypeMap=");
        sbLIZ.append(this.editorProAIGCGenerationParamTypeMap);
        sbLIZ.append(", magicI2IInfoModelMap=");
        sbLIZ.append(this.magicI2IInfoModelMap);
        sbLIZ.append(", editorTabAlbumAICreate=");
        sbLIZ.append(this.editorTabAlbumAICreate);
        sbLIZ.append(", aiPlaygroundCameraModel=");
        sbLIZ.append(this.aiPlaygroundCameraModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditorProAIGCInfoModel() {
        this(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0), new HashMap(), new HashMap(), new EditorTabAlbumAICreate("", "", ""), new AiPlaygroundCameraModel("", "", false, false, false, false, false, false, false, new AIPlaygroundSchemaModel(0, 0, ""), false));
    }

    public static EditorProAIGCInfoModel LIZ(EditorProAIGCInfoModel editorProAIGCInfoModel) {
        return new EditorProAIGCInfoModel(editorProAIGCInfoModel.editorProAIGCMediaItemModelList, editorProAIGCInfoModel.taskInfoInCreativeModel, editorProAIGCInfoModel.editorProAIGCGenerationParamTypeMap, editorProAIGCInfoModel.magicI2IInfoModelMap, editorProAIGCInfoModel.editorTabAlbumAICreate, editorProAIGCInfoModel.aiPlaygroundCameraModel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<EditorProAIGCMediaItemModel> arrayList = this.editorProAIGCMediaItemModelList;
        parcel.writeInt(arrayList.size());
        Iterator<EditorProAIGCMediaItemModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.taskInfoInCreativeModel.writeToParcel(parcel, i);
        HashMap<String, AIGCGenerationParam> map = this.editorProAIGCGenerationParamTypeMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, AIGCGenerationParam> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
        HashMap<String, MagicI2InfoModel> map2 = this.magicI2IInfoModelMap;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, MagicI2InfoModel> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue().filePath);
        }
        this.editorTabAlbumAICreate.writeToParcel(parcel, i);
        this.aiPlaygroundCameraModel.writeToParcel(parcel, i);
    }

    public EditorProAIGCInfoModel(ArrayList<EditorProAIGCMediaItemModel> arrayList, TaskInfoInCreativeModel taskInfoInCreativeModel, HashMap<String, AIGCGenerationParam> map, HashMap<String, MagicI2InfoModel> map2, EditorTabAlbumAICreate editorTabAlbumAICreate, AiPlaygroundCameraModel aiPlaygroundCameraModel) {
        this.editorProAIGCMediaItemModelList = arrayList;
        this.taskInfoInCreativeModel = taskInfoInCreativeModel;
        this.editorProAIGCGenerationParamTypeMap = map;
        this.magicI2IInfoModelMap = map2;
        this.editorTabAlbumAICreate = editorTabAlbumAICreate;
        this.aiPlaygroundCameraModel = aiPlaygroundCameraModel;
    }
}
