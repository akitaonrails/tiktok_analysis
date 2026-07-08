package com.ss.android.ugc.now.interaction.assem;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentItem implements InterfaceC1891350zJl {
    public static final int $stable = 8;
    public final Aweme aweme;
    public final Comment comment;
    public final NowFeedMobHierarchyData interactionHierarchyData;

    public final CommentItem copy(Comment comment, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        return new CommentItem(comment, aweme, nowFeedMobHierarchyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentItem)) {
            return false;
        }
        CommentItem commentItem = (CommentItem) obj;
        return Intrinsics.LJFF(this.comment, commentItem.comment) && Intrinsics.LJFF(this.aweme, commentItem.aweme) && Intrinsics.LJFF(this.interactionHierarchyData, commentItem.interactionHierarchyData);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int iHashCode = this.comment.hashCode() * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.interactionHierarchyData;
        return iHashCode2 + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentItem(comment=");
        sbLIZ.append(this.comment);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", interactionHierarchyData=");
        sbLIZ.append(this.interactionHierarchyData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Comment getComment() {
        return this.comment;
    }

    public final NowFeedMobHierarchyData getInteractionHierarchyData() {
        return this.interactionHierarchyData;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public CommentItem(Comment comment, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.comment = comment;
        this.aweme = aweme;
        this.interactionHierarchyData = nowFeedMobHierarchyData;
    }
}
