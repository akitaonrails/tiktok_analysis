package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoPickTaskResponse {

    @C09CT("av_music")
    public final AVMusic avMusic;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("nle_draft")
    public final String nleDraft;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("title")
    public final String title;

    public AutoPickTaskResponse() {
        this("", "", "", null, "");
    }

    public final AutoPickTaskResponse copy(String str, String str2, String str3, AVMusic aVMusic, String str4) {
        return new AutoPickTaskResponse(str, str2, str3, aVMusic, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPickTaskResponse)) {
            return false;
        }
        AutoPickTaskResponse autoPickTaskResponse = (AutoPickTaskResponse) obj;
        return Intrinsics.LJFF(this.taskId, autoPickTaskResponse.taskId) && Intrinsics.LJFF(this.nleDraft, autoPickTaskResponse.nleDraft) && Intrinsics.LJFF(this.musicId, autoPickTaskResponse.musicId) && Intrinsics.LJFF(this.avMusic, autoPickTaskResponse.avMusic) && Intrinsics.LJFF(this.title, autoPickTaskResponse.title);
    }

    public int hashCode() {
        int iHashCode = ((((this.taskId.hashCode() * 31) + this.nleDraft.hashCode()) * 31) + this.musicId.hashCode()) * 31;
        AVMusic aVMusic = this.avMusic;
        return ((iHashCode + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31) + this.title.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTaskResponse(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", avMusic=");
        sbLIZ.append(this.avMusic);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoPickTaskResponse(String str, String str2, String str3, AVMusic aVMusic, String str4) {
        this.taskId = str;
        this.nleDraft = str2;
        this.musicId = str3;
        this.avMusic = aVMusic;
        this.title = str4;
    }
}
