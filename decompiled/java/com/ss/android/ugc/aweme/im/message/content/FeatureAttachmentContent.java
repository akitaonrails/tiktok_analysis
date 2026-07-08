package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class FeatureAttachmentContent implements Serializable {

    @C09CT("content")
    public final BaseText content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("original_create_time")
    public final Long originalCreateTime;

    @C09CT("type")
    public final int type;

    @C09CT("uid")
    public final Long uid;

    public FeatureAttachmentContent() {
        this(0, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureAttachmentContent)) {
            return false;
        }
        FeatureAttachmentContent featureAttachmentContent = (FeatureAttachmentContent) obj;
        return this.type == featureAttachmentContent.type && Intrinsics.LJFF(this.id, featureAttachmentContent.id) && Intrinsics.LJFF(this.uid, featureAttachmentContent.uid) && Intrinsics.LJFF(this.originalCreateTime, featureAttachmentContent.originalCreateTime) && Intrinsics.LJFF(this.content, featureAttachmentContent.content);
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.id;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.uid;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.originalCreateTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BaseText baseText = this.content;
        return iHashCode3 + (baseText != null ? baseText.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureAttachmentContent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", originalCreateTime=");
        sbLIZ.append(this.originalCreateTime);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeatureAttachmentContent(int i, String str, Long l, Long l2, BaseText baseText) {
        this.type = i;
        this.id = str;
        this.uid = l;
        this.originalCreateTime = l2;
        this.content = baseText;
    }
}
