package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SaveDraftTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("results")
    public final List<String> results;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("source")
    public final Source source;

    public SaveDraftTaskInput() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveDraftTaskInput)) {
            return false;
        }
        SaveDraftTaskInput saveDraftTaskInput = (SaveDraftTaskInput) obj;
        return this.source == saveDraftTaskInput.source && Intrinsics.LJFF(this.commonParentTaskInput, saveDraftTaskInput.commonParentTaskInput) && Intrinsics.LJFF(this.serverTaskId, saveDraftTaskInput.serverTaskId) && Intrinsics.LJFF(this.results, saveDraftTaskInput.results);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return ((((iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0)) * 31) + this.serverTaskId.hashCode()) * 31) + this.results.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveDraftTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SaveDraftTaskInput(Source source, CommonParentTaskInput commonParentTaskInput, String str, List<String> list) {
        this.source = source;
        this.commonParentTaskInput = commonParentTaskInput;
        this.serverTaskId = str;
        this.results = list;
    }

    public SaveDraftTaskInput(Source source, CommonParentTaskInput commonParentTaskInput, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? null : commonParentTaskInput, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
