package com.bytedance.ies.im.core.api.model;

import X.C09CT;
import X.C0ZDV;
import X.C0ZDW;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class RichTextInfo implements Serializable {
    public static final C0ZDW Companion = new Object() { // from class: X.0ZDW
    };
    public int anonymousStartPosition = -1;

    @C09CT("length")
    public final int length;

    @C09CT("link")
    public final String link;

    @C09CT("mentioned_uid")
    public final String mentionedUid;
    public boolean needToBeAnonymous;

    @C09CT("position")
    public final int position;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("rich_text_type")
    public final int type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextInfo)) {
            return false;
        }
        RichTextInfo richTextInfo = (RichTextInfo) obj;
        return this.position == richTextInfo.position && this.length == richTextInfo.length && this.type == richTextInfo.type && Intrinsics.LJFF(this.mentionedUid, richTextInfo.mentionedUid) && Intrinsics.LJFF(this.link, richTextInfo.link) && this.status == richTextInfo.status;
    }

    public int hashCode() {
        int i = ((((this.position * 31) + this.length) * 31) + this.type) * 31;
        String str = this.mentionedUid;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.status;
    }

    public final void resetAnonymous() {
        this.needToBeAnonymous = false;
        this.anonymousStartPosition = -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichTextInfo(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", length=");
        sbLIZ.append(this.length);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", mentionedUid=");
        sbLIZ.append(this.mentionedUid);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getStartPosition() {
        Integer numValueOf = Integer.valueOf(this.anonymousStartPosition);
        return numValueOf.intValue() >= 0 ? numValueOf.intValue() : this.position;
    }

    public final C0ZDV getStatus() {
        int i = this.status;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? C0ZDV.UNKNOWN : C0ZDV.SUSPICIOUS : C0ZDV.REJECT : C0ZDV.PASS : C0ZDV.AUDITING : C0ZDV.UNKNOWN;
    }

    public final void setAnonymousStartPosition(int i) {
        this.anonymousStartPosition = i;
    }

    public final void setNeedToBeAnonymous(boolean z) {
        this.needToBeAnonymous = z;
    }

    public RichTextInfo(int i, int i2, int i3, String str, String str2, int i4) {
        this.position = i;
        this.length = i2;
        this.type = i3;
        this.mentionedUid = str;
        this.link = str2;
        this.status = i4;
    }
}
