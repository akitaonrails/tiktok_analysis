package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageUploadTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("image_url_list")
    public final List<String> imageUriList;

    @C09CT("resource_list")
    public final List<AIGCInputItem> resourceList;

    @C09CT("source")
    public final Source source;

    public ImageUploadTaskInput() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUploadTaskInput)) {
            return false;
        }
        ImageUploadTaskInput imageUploadTaskInput = (ImageUploadTaskInput) obj;
        return this.source == imageUploadTaskInput.source && Intrinsics.LJFF(this.imageUriList, imageUploadTaskInput.imageUriList) && Intrinsics.LJFF(this.creationId, imageUploadTaskInput.creationId) && Intrinsics.LJFF(this.commonParentTaskInput, imageUploadTaskInput.commonParentTaskInput) && Intrinsics.LJFF(this.resourceList, imageUploadTaskInput.resourceList);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((source == null ? 0 : source.hashCode()) * 31) + this.imageUriList.hashCode()) * 31) + this.creationId.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return ((iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0)) * 31) + this.resourceList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageUploadTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", imageUriList=");
        sbLIZ.append(this.imageUriList);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(", resourceList=");
        sbLIZ.append(this.resourceList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageUploadTaskInput(Source source, List<String> list, String str, CommonParentTaskInput commonParentTaskInput, List<AIGCInputItem> list2) {
        this.source = source;
        this.imageUriList = list;
        this.creationId = str;
        this.commonParentTaskInput = commonParentTaskInput;
        this.resourceList = list2;
    }

    public ImageUploadTaskInput(Source source, List list, String str, CommonParentTaskInput commonParentTaskInput, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? commonParentTaskInput : null, (i & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
