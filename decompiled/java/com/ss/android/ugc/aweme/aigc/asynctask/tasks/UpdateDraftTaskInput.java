package com.ss.android.ugc.aweme.aigc.asynctask.tasks;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UpdateDraftTaskInput extends C09JG {

    @C09CT("autopick_template_infos")
    public final List<AutoPickTaskResponse> autoPickTaskResponses;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("mae_request_id")
    public final String maeRequestId;

    @C09CT("music_model")
    public final MusicInfo musicModel;

    @C09CT("nle_model_json")
    public final String nleModelJson;

    @C09CT("uploaded_vid")
    public final String uploadedVid;

    public UpdateDraftTaskInput() {
        this("", "", null, null, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateDraftTaskInput)) {
            return false;
        }
        UpdateDraftTaskInput updateDraftTaskInput = (UpdateDraftTaskInput) obj;
        return Intrinsics.LJFF(this.creationId, updateDraftTaskInput.creationId) && Intrinsics.LJFF(this.nleModelJson, updateDraftTaskInput.nleModelJson) && Intrinsics.LJFF(this.musicModel, updateDraftTaskInput.musicModel) && Intrinsics.LJFF(this.autoPickTaskResponses, updateDraftTaskInput.autoPickTaskResponses) && Intrinsics.LJFF(this.uploadedVid, updateDraftTaskInput.uploadedVid) && Intrinsics.LJFF(this.maeRequestId, updateDraftTaskInput.maeRequestId);
    }

    public final int hashCode() {
        int iHashCode = ((this.creationId.hashCode() * 31) + this.nleModelJson.hashCode()) * 31;
        MusicInfo musicInfo = this.musicModel;
        int iHashCode2 = (iHashCode + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31;
        List<AutoPickTaskResponse> list = this.autoPickTaskResponses;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.uploadedVid.hashCode()) * 31) + this.maeRequestId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateDraftTaskInput(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", nleModelJson=");
        sbLIZ.append(this.nleModelJson);
        sbLIZ.append(", musicModel=");
        sbLIZ.append(this.musicModel);
        sbLIZ.append(", autoPickTaskResponses=");
        sbLIZ.append(this.autoPickTaskResponses);
        sbLIZ.append(", uploadedVid=");
        sbLIZ.append(this.uploadedVid);
        sbLIZ.append(", maeRequestId=");
        sbLIZ.append(this.maeRequestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpdateDraftTaskInput(String str, String str2, MusicInfo musicInfo, List<AutoPickTaskResponse> list, String str3, String str4) {
        this.creationId = str;
        this.nleModelJson = str2;
        this.musicModel = musicInfo;
        this.autoPickTaskResponses = list;
        this.uploadedVid = str3;
        this.maeRequestId = str4;
    }
}
