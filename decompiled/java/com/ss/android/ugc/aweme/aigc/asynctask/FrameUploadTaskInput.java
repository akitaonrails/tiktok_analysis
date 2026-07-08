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
public final class FrameUploadTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("media_items")
    public final List<CompositionMediaItem> mediaItems;

    @C09CT("source")
    public final Source source;

    public FrameUploadTaskInput() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameUploadTaskInput)) {
            return false;
        }
        FrameUploadTaskInput frameUploadTaskInput = (FrameUploadTaskInput) obj;
        return this.source == frameUploadTaskInput.source && Intrinsics.LJFF(this.mediaItems, frameUploadTaskInput.mediaItems) && Intrinsics.LJFF(this.creationId, frameUploadTaskInput.creationId) && Intrinsics.LJFF(this.commonParentTaskInput, frameUploadTaskInput.commonParentTaskInput);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((source == null ? 0 : source.hashCode()) * 31) + this.mediaItems.hashCode()) * 31) + this.creationId.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameUploadTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", mediaItems=");
        sbLIZ.append(this.mediaItems);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrameUploadTaskInput(Source source, List<CompositionMediaItem> list, String str, CommonParentTaskInput commonParentTaskInput) {
        this.source = source;
        this.mediaItems = list;
        this.creationId = str;
        this.commonParentTaskInput = commonParentTaskInput;
    }

    public FrameUploadTaskInput(Source source, List list, String str, CommonParentTaskInput commonParentTaskInput, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : commonParentTaskInput);
    }
}
