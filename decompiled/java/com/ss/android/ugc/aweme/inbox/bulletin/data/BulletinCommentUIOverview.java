package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.AbstractC619610ORz;
import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentUIOverview {
    public static final int $stable = 8;

    @C09CT("comments")
    public final List<AbstractC619610ORz> comments;

    @C09CT("enable_comment")
    public final Boolean enableComment;

    @C09CT("total")
    public final Integer total;
    public final transient int version;

    public BulletinCommentUIOverview() {
        this(null, null, null, 0);
    }

    public final BulletinCommentUIOverview copy(Boolean bool, List<? extends AbstractC619610ORz> list, Integer num, int i) {
        return new BulletinCommentUIOverview(bool, list, num, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinCommentUIOverview)) {
            return false;
        }
        BulletinCommentUIOverview bulletinCommentUIOverview = (BulletinCommentUIOverview) obj;
        return Intrinsics.LJFF(this.enableComment, bulletinCommentUIOverview.enableComment) && Intrinsics.LJFF(this.comments, bulletinCommentUIOverview.comments) && Intrinsics.LJFF(this.total, bulletinCommentUIOverview.total) && this.version == bulletinCommentUIOverview.version;
    }

    public int hashCode() {
        Boolean bool = this.enableComment;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<AbstractC619610ORz> list = this.comments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.total;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.version;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentUIOverview(enableComment=");
        sbLIZ.append(this.enableComment);
        sbLIZ.append(", comments=");
        sbLIZ.append(this.comments);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinCommentUIOverview(Boolean bool, List<? extends AbstractC619610ORz> list, Integer num, int i) {
        this.enableComment = bool;
        this.comments = list;
        this.total = num;
        this.version = i;
    }
}
