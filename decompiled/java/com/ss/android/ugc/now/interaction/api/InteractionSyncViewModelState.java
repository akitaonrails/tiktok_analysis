package com.ss.android.ugc.now.interaction.api;

import X.C1353760lKg;
import X.C2188811AlT;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionSyncViewModelState implements InterfaceC0148002o {
    public final PostActiveState activePost;
    public final CommentCountState commentCountState;
    public final CommentDeleteState commentDeleteState;
    public final C291001Au<CommentLatestState> commentLatestState;
    public final CommentPublishState commentPublishState;
    public final LikeState likeState;
    public final User user;
    public final C1353760lKg viewState;

    public InteractionSyncViewModelState() {
        this(null, null, null, null, null, null, new User(), null);
    }

    public final C1353760lKg component2() {
        return null;
    }

    public final InteractionSyncViewModelState copy(LikeState likeState, C1353760lKg c1353760lKg, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C291001Au<CommentLatestState> c291001Au, User user, PostActiveState postActiveState) {
        return new InteractionSyncViewModelState(likeState, c1353760lKg, commentCountState, commentPublishState, commentDeleteState, c291001Au, user, postActiveState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionSyncViewModelState)) {
            return false;
        }
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        return Intrinsics.LJFF(this.likeState, interactionSyncViewModelState.likeState) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.commentCountState, interactionSyncViewModelState.commentCountState) && Intrinsics.LJFF(this.commentPublishState, interactionSyncViewModelState.commentPublishState) && Intrinsics.LJFF(this.commentDeleteState, interactionSyncViewModelState.commentDeleteState) && Intrinsics.LJFF(this.commentLatestState, interactionSyncViewModelState.commentLatestState) && Intrinsics.LJFF(this.user, interactionSyncViewModelState.user) && Intrinsics.LJFF(this.activePost, interactionSyncViewModelState.activePost);
    }

    public final C1353760lKg getViewState() {
        return null;
    }

    public int hashCode() {
        LikeState likeState = this.likeState;
        int iHashCode = (likeState == null ? 0 : likeState.hashCode()) * 31 * 31;
        CommentCountState commentCountState = this.commentCountState;
        int iHashCode2 = (iHashCode + (commentCountState == null ? 0 : commentCountState.hashCode())) * 31;
        CommentPublishState commentPublishState = this.commentPublishState;
        int iHashCode3 = (iHashCode2 + (commentPublishState == null ? 0 : commentPublishState.hashCode())) * 31;
        CommentDeleteState commentDeleteState = this.commentDeleteState;
        int iHashCode4 = (iHashCode3 + (commentDeleteState == null ? 0 : commentDeleteState.hashCode())) * 31;
        C291001Au<CommentLatestState> c291001Au = this.commentLatestState;
        int iHashCode5 = (((iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.user.hashCode()) * 31;
        PostActiveState postActiveState = this.activePost;
        return iHashCode5 + (postActiveState != null ? postActiveState.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionSyncViewModelState(likeState=");
        sbLIZ.append(this.likeState);
        sbLIZ.append(", viewState=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", commentCountState=");
        sbLIZ.append(this.commentCountState);
        sbLIZ.append(", commentPublishState=");
        sbLIZ.append(this.commentPublishState);
        sbLIZ.append(", commentDeleteState=");
        sbLIZ.append(this.commentDeleteState);
        sbLIZ.append(", commentLatestState=");
        sbLIZ.append(this.commentLatestState);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", activePost=");
        sbLIZ.append(this.activePost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PostActiveState getActivePost() {
        return this.activePost;
    }

    public final CommentCountState getCommentCountState() {
        return this.commentCountState;
    }

    public final CommentDeleteState getCommentDeleteState() {
        return this.commentDeleteState;
    }

    public final C291001Au<CommentLatestState> getCommentLatestState() {
        return this.commentLatestState;
    }

    public final CommentPublishState getCommentPublishState() {
        return this.commentPublishState;
    }

    public final LikeState getLikeState() {
        return this.likeState;
    }

    public final User getUser() {
        return this.user;
    }

    public InteractionSyncViewModelState(LikeState likeState, C1353760lKg c1353760lKg, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C291001Au<CommentLatestState> c291001Au, User user, PostActiveState postActiveState) {
        this.likeState = likeState;
        this.commentCountState = commentCountState;
        this.commentPublishState = commentPublishState;
        this.commentDeleteState = commentDeleteState;
        this.commentLatestState = c291001Au;
        this.user = user;
        this.activePost = postActiveState;
    }
}
