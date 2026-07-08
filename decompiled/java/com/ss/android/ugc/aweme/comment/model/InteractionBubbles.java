package com.ss.android.ugc.aweme.comment.model;

import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionBubbles implements Serializable {
    public final InteractionBubbleCacheState cacheState;
    public final long commentCursor;
    public final List<Comment> commentData;
    public final long likeCursor;
    public final List<User> likeData;
    public final boolean likeHasMore;
    public final long likeOffset;

    public static final class Builder {
        public InteractionBubbleCacheState cacheState;
        public long commentCursor;
        public List<? extends Comment> commentData;
        public long likeCursor;
        public List<? extends User> likeData;
        public boolean likeHasMore;
        public long likeOffset;

        public final InteractionBubbles build() {
            return new InteractionBubbles(this.commentData, this.commentCursor, this.likeData, this.likeHasMore, this.likeCursor, this.likeOffset, this.cacheState);
        }

        public Builder(InteractionBubbles interactionBubbles) {
            List<Comment> list;
            long j;
            long j2;
            boolean z;
            InteractionBubbleCacheState interactionBubbleCacheState;
            if (interactionBubbles != null) {
                list = interactionBubbles.commentData;
            } else {
                list = null;
            }
            this.commentData = list;
            if (interactionBubbles != null) {
                j = interactionBubbles.commentCursor;
            } else {
                j = 0;
            }
            this.commentCursor = j;
            this.likeData = interactionBubbles != null ? interactionBubbles.likeData : null;
            if (interactionBubbles != null) {
                j2 = interactionBubbles.likeCursor;
            } else {
                j2 = 0;
            }
            this.likeCursor = j2;
            if (interactionBubbles != null) {
                z = interactionBubbles.likeHasMore;
            } else {
                z = false;
            }
            this.likeHasMore = z;
            this.likeOffset = interactionBubbles != null ? interactionBubbles.likeOffset : 0L;
            this.cacheState = (interactionBubbles == null || (interactionBubbleCacheState = interactionBubbles.cacheState) == null) ? InteractionBubbleCacheState.NO_CACHE : interactionBubbleCacheState;
        }

        public final Builder cacheState(InteractionBubbleCacheState interactionBubbleCacheState) {
            this.cacheState = interactionBubbleCacheState;
            return this;
        }

        public final Builder commentData(List<? extends Comment> list, long j) {
            this.commentData = list;
            this.commentCursor = j;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        /* JADX WARN: Type inference failed for: r0v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ss.android.ugc.aweme.comment.model.InteractionBubbles.Builder handleLike(boolean r6, com.ss.android.ugc.aweme.profile.model.User r7) {
            /*
                r5 = this;
                java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r5.likeData
                if (r1 == 0) goto L35
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
                java.util.Iterator r4 = r0.iterator()
            Ld:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L4b
                java.lang.Object r3 = r4.next()
                r1 = r3
                com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
                java.lang.String r2 = r1.getUid()
                java.lang.String r1 = r7.getUid()
                boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
                if (r1 == 0) goto Ld
            L28:
                if (r6 == 0) goto L41
                if (r3 != 0) goto L3b
                r0.add(r7)
                java.util.List r0 = X.C13LP.LLIIII(r0)
            L33:
                if (r0 != 0) goto L3b
            L35:
                if (r6 == 0) goto L3e
                java.util.List r0 = java.util.Collections.singletonList(r7)
            L3b:
                r5.likeData = r0
                return r5
            L3e:
                X.13BV r0 = X.C13BV.INSTANCE
                goto L3b
            L41:
                if (r3 == 0) goto L3b
                r0.remove(r3)
                java.util.List r0 = X.C13LP.LLIIII(r0)
                goto L33
            L4b:
                r3 = 0
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.model.InteractionBubbles.Builder.handleLike(boolean, com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.comment.model.InteractionBubbles$Builder");
        }

        public final Builder likeData(List<? extends User> list, boolean z, long j, long j2) {
            this.likeData = list;
            this.likeHasMore = z;
            this.likeCursor = j;
            this.likeOffset = j2;
            return this;
        }
    }

    public InteractionBubbles() {
        this(null, 0L, null, false, 0L, 0L, InteractionBubbleCacheState.NO_CACHE);
    }

    public final InteractionBubbles copy(List<? extends Comment> list, long j, List<? extends User> list2, boolean z, long j2, long j3, InteractionBubbleCacheState interactionBubbleCacheState) {
        return new InteractionBubbles(list, j, list2, z, j2, j3, interactionBubbleCacheState);
    }

    public final Builder copy() {
        return new Builder(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionBubbles(List<? extends Comment> list, long j, List<? extends User> list2, boolean z, long j2, long j3, InteractionBubbleCacheState interactionBubbleCacheState) {
        this.commentData = list;
        this.commentCursor = j;
        this.likeData = list2;
        this.likeHasMore = z;
        this.likeCursor = j2;
        this.likeOffset = j3;
        this.cacheState = interactionBubbleCacheState;
    }
}
