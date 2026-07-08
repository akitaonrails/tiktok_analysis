package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.AlgoRaw;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.tools.utils.FileIdentifierModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCTemplateModel implements Parcelable {
    public static final Parcelable.Creator<EditorProAIGCTemplateModel> CREATOR = new Parcelable.Creator<EditorProAIGCTemplateModel>() { // from class: X.0EsB
        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCTemplateModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AlgoRaw algoRawCreateFromParcel = AlgoRaw.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EditorProAIGCTemplateModel.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(EditorProAIGCStylizedAiStage.CREATOR.createFromParcel(parcel));
            }
            return new EditorProAIGCTemplateModel(string, string2, string3, algoRawCreateFromParcel, arrayList, arrayListCreateStringArrayList, string4, i3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCTemplateModel[] newArray(int i) {
            return new EditorProAIGCTemplateModel[i];
        }
    };

    @C09CT("stylized_ai_tag")
    public final int aiCreateStylizedType;

    @C09CT("algo_raw")
    public final AlgoRaw algoRaw;

    @C09CT("business_scene")
    public final String bizScene;

    @C09CT("extra")
    public final String extra;

    @C09CT("image_fds")
    public final List<FileIdentifierModel> imageFds;

    @C09CT("image_paths")
    public final List<String> imagePaths;

    @C09CT("prompt_text")
    public final String prompt;

    @C09CT("stylized_ai_stages")
    public final List<EditorProAIGCStylizedAiStage> stylizedAiStages;

    @C09CT("task_type")
    public final String taskType;

    public EditorProAIGCTemplateModel() {
        this(null, null, null, null, null, null, null, 0, null, 511, null);
    }

    public final EditorProAIGCTemplateModel copy(String str, String str2, String str3, AlgoRaw algoRaw, List<FileIdentifierModel> list, List<String> list2, String str4, int i, List<EditorProAIGCStylizedAiStage> list3) {
        return new EditorProAIGCTemplateModel(str, str2, str3, algoRaw, list, list2, str4, i, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProAIGCTemplateModel)) {
            return false;
        }
        EditorProAIGCTemplateModel editorProAIGCTemplateModel = (EditorProAIGCTemplateModel) obj;
        return Intrinsics.LJFF(this.bizScene, editorProAIGCTemplateModel.bizScene) && Intrinsics.LJFF(this.taskType, editorProAIGCTemplateModel.taskType) && Intrinsics.LJFF(this.extra, editorProAIGCTemplateModel.extra) && Intrinsics.LJFF(this.algoRaw, editorProAIGCTemplateModel.algoRaw) && Intrinsics.LJFF(this.imageFds, editorProAIGCTemplateModel.imageFds) && Intrinsics.LJFF(this.imagePaths, editorProAIGCTemplateModel.imagePaths) && Intrinsics.LJFF(this.prompt, editorProAIGCTemplateModel.prompt) && this.aiCreateStylizedType == editorProAIGCTemplateModel.aiCreateStylizedType && Intrinsics.LJFF(this.stylizedAiStages, editorProAIGCTemplateModel.stylizedAiStages);
    }

    public int hashCode() {
        return (((((((((((((((this.bizScene.hashCode() * 31) + this.taskType.hashCode()) * 31) + this.extra.hashCode()) * 31) + this.algoRaw.hashCode()) * 31) + this.imageFds.hashCode()) * 31) + this.imagePaths.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.aiCreateStylizedType) * 31) + this.stylizedAiStages.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCTemplateModel(bizScene=");
        sbLIZ.append(this.bizScene);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", algoRaw=");
        sbLIZ.append(this.algoRaw);
        sbLIZ.append(", imageFds=");
        sbLIZ.append(this.imageFds);
        sbLIZ.append(", imagePaths=");
        sbLIZ.append(this.imagePaths);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", aiCreateStylizedType=");
        sbLIZ.append(this.aiCreateStylizedType);
        sbLIZ.append(", stylizedAiStages=");
        sbLIZ.append(this.stylizedAiStages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizScene);
        parcel.writeString(this.taskType);
        parcel.writeString(this.extra);
        this.algoRaw.writeToParcel(parcel, i);
        List<FileIdentifierModel> list = this.imageFds;
        parcel.writeInt(list.size());
        Iterator<FileIdentifierModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.imagePaths);
        parcel.writeString(this.prompt);
        parcel.writeInt(this.aiCreateStylizedType);
        List<EditorProAIGCStylizedAiStage> list2 = this.stylizedAiStages;
        parcel.writeInt(list2.size());
        Iterator<EditorProAIGCStylizedAiStage> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public final int getAiCreateStylizedType() {
        return this.aiCreateStylizedType;
    }

    public final AlgoRaw getAlgoRaw() {
        return this.algoRaw;
    }

    public final String getBizScene() {
        return this.bizScene;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final List<FileIdentifierModel> getImageFds() {
        return this.imageFds;
    }

    public final List<String> getImagePaths() {
        return this.imagePaths;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final List<EditorProAIGCStylizedAiStage> getStylizedAiStages() {
        return this.stylizedAiStages;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public EditorProAIGCTemplateModel(String str, String str2, String str3, AlgoRaw algoRaw, List<FileIdentifierModel> list, List<String> list2, String str4, int i, List<EditorProAIGCStylizedAiStage> list3) {
        this.bizScene = str;
        this.taskType = str2;
        this.extra = str3;
        this.algoRaw = algoRaw;
        this.imageFds = list;
        this.imagePaths = list2;
        this.prompt = str4;
        this.aiCreateStylizedType = i;
        this.stylizedAiStages = list3;
    }

    public EditorProAIGCTemplateModel(String str, String str2, String str3, AlgoRaw algoRaw, List list, List list2, String str4, int i, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new AlgoRaw("", "") : algoRaw, (i2 & 16) != 0 ? C13BV.INSTANCE : list, (i2 & 32) != 0 ? C13BV.INSTANCE : list2, (i2 & 64) == 0 ? str4 : "", (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? C13BV.INSTANCE : list3);
    }
}
