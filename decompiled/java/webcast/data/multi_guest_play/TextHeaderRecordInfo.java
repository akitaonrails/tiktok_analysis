package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderRecordInfo {

    @C09CT("media_node_id")
    public String mediaNodeId = "";

    @C09CT("origin_media_node_id")
    public String originMediaNodeId = "";

    @C09CT("origin_record_id")
    public long originRecordId;

    @C09CT("record_id")
    public long recordId;

    @C09CT("review_status")
    public int reviewStatus;

    @C09CT("text_header_material_info")
    public TextHeaderMaterialInfo textHeaderMaterialInfo;

    public final int hashCode() {
        int iY2 = ((this.reviewStatus * 31) + C786410Ut5.Y2(this.recordId)) * 31;
        TextHeaderMaterialInfo textHeaderMaterialInfo = this.textHeaderMaterialInfo;
        return ((iY2 + (textHeaderMaterialInfo != null ? textHeaderMaterialInfo.hashCode() : 0)) * 31) + this.mediaNodeId.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(TextHeaderRecordInfo.class, cls)) {
            return false;
        }
        TextHeaderRecordInfo textHeaderRecordInfo = (TextHeaderRecordInfo) obj;
        if (this.reviewStatus == textHeaderRecordInfo.reviewStatus && this.recordId == textHeaderRecordInfo.recordId && Intrinsics.LJFF(this.textHeaderMaterialInfo, textHeaderRecordInfo.textHeaderMaterialInfo) && Intrinsics.LJFF(this.mediaNodeId, textHeaderRecordInfo.mediaNodeId)) {
            return true;
        }
        return false;
    }
}
