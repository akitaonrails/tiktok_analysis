package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.FreshContentCount;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserAllStoryMetadata implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("disable_story_circle_scenes")
    public List<Integer> disableStoryCircleScenes;

    @C09CT("latest_story_view_time")
    public Long latestStoryViewTime;

    @C09CT("post_type_to_counts")
    public List<FreshContentCount> postTypeToCount;
    public transient Object postTypeToCountBlock;

    @C09CT("story_badge_url")
    public UrlModel storyBadgeUrl;

    @C09CT("story_celebration_list")
    public List<Integer> storyCelebrationList;

    @C09CT("story_lite_metadata")
    public List<StoryLiteMetadata> storyLiteMetadata;

    @C09CT("user_story_change_time")
    public Long userStoryChangeTime;

    public static final class Companion {
    }

    public UserAllStoryMetadata() {
        this(null, null, null, null, null, null, null);
    }

    public final UserAllStoryMetadata copy(List<StoryLiteMetadata> list, Long l, Long l2, UrlModel urlModel, List<Integer> list2, List<FreshContentCount> list3, List<Integer> list4) {
        return new UserAllStoryMetadata(list, l, l2, urlModel, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAllStoryMetadata)) {
            return false;
        }
        UserAllStoryMetadata userAllStoryMetadata = (UserAllStoryMetadata) obj;
        return Intrinsics.LJFF(this.storyLiteMetadata, userAllStoryMetadata.storyLiteMetadata) && Intrinsics.LJFF(this.latestStoryViewTime, userAllStoryMetadata.latestStoryViewTime) && Intrinsics.LJFF(this.userStoryChangeTime, userAllStoryMetadata.userStoryChangeTime) && Intrinsics.LJFF(this.storyBadgeUrl, userAllStoryMetadata.storyBadgeUrl) && Intrinsics.LJFF(this.storyCelebrationList, userAllStoryMetadata.storyCelebrationList) && Intrinsics.LJFF(this.postTypeToCount, userAllStoryMetadata.postTypeToCount) && Intrinsics.LJFF(this.disableStoryCircleScenes, userAllStoryMetadata.disableStoryCircleScenes);
    }

    public int hashCode() {
        List<StoryLiteMetadata> list = this.storyLiteMetadata;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.latestStoryViewTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.userStoryChangeTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        UrlModel urlModel = this.storyBadgeUrl;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        List<Integer> list2 = this.storyCelebrationList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FreshContentCount> list3 = this.postTypeToCount;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.disableStoryCircleScenes;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserAllStoryMetadata(storyLiteMetadata=");
        sbLIZ.append(this.storyLiteMetadata);
        sbLIZ.append(", latestStoryViewTime=");
        sbLIZ.append(this.latestStoryViewTime);
        sbLIZ.append(", userStoryChangeTime=");
        sbLIZ.append(this.userStoryChangeTime);
        sbLIZ.append(", storyBadgeUrl=");
        sbLIZ.append(this.storyBadgeUrl);
        sbLIZ.append(", storyCelebrationList=");
        sbLIZ.append(this.storyCelebrationList);
        sbLIZ.append(", postTypeToCount=");
        sbLIZ.append(this.postTypeToCount);
        sbLIZ.append(", disableStoryCircleScenes=");
        sbLIZ.append(this.disableStoryCircleScenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void inspectPostTypeToCountInternally() {
        synchronized (this.postTypeToCountBlock) {
            try {
                List<StoryLiteMetadata> list = this.storyLiteMetadata;
                if (list == null) {
                    return;
                }
                if (this.postTypeToCount != null) {
                    return;
                }
                long j = 0;
                Iterator<StoryLiteMetadata> it2 = list.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    int i = it2.next().postType;
                    if (i == 1) {
                        j++;
                    } else if (i == 2) {
                        j2++;
                    }
                }
                this.postTypeToCount = C1697810uHb.LJIILJJIL(new FreshContentCount(1, j), new FreshContentCount(2, j2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final UserAllStoryMetadata clone() {
        return new UserAllStoryMetadata(this.storyLiteMetadata, this.latestStoryViewTime, this.userStoryChangeTime, this.storyBadgeUrl, this.storyCelebrationList, this.postTypeToCount, this.disableStoryCircleScenes);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long storyCount() {
        /*
            r5 = this;
            java.lang.Object r4 = r5.postTypeToCountBlock
            monitor-enter(r4)
            r5.inspectPostTypeToCountInternally()     // Catch: java.lang.Throwable -> L2d
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.FreshContentCount> r0 = r5.postTypeToCount     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L29
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L27
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L2d
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.story.FreshContentCount r0 = (com.ss.android.ugc.aweme.feed.model.story.FreshContentCount) r0     // Catch: java.lang.Throwable -> L2d
            int r1 = r0.postType     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            if (r1 != r0) goto Le
        L20:
            com.ss.android.ugc.aweme.feed.model.story.FreshContentCount r2 = (com.ss.android.ugc.aweme.feed.model.story.FreshContentCount) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L29
            long r0 = r2.count     // Catch: java.lang.Throwable -> L2d
            goto L2b
        L27:
            r2 = 0
            goto L20
        L29:
            r0 = 0
        L2b:
            monitor-exit(r4)
            return r0
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata.storyCount():long");
    }

    public final long version() {
        Long l = this.latestStoryViewTime;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = this.userStoryChangeTime;
        return Math.max(jLongValue, l2 != null ? l2.longValue() : -1L);
    }

    public final void setLatestStoryViewTime(Long l) {
        this.latestStoryViewTime = l;
    }

    public final void setPostTypeToCount(List<FreshContentCount> list) {
        this.postTypeToCount = list;
    }

    public final void setStoryLiteMetadata(List<StoryLiteMetadata> list) {
        this.storyLiteMetadata = list;
    }

    public final void setUserStoryChangeTime(Long l) {
        this.userStoryChangeTime = l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r19.storyLiteMetadata != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r19.storyLiteMetadata = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r1 = r19.storyLiteMetadata;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r1 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r0 = r5.getStory();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r10 = r0.viewed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r1.add(new com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata(com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5.getAid()), r10, 0, false, 0, 0, 1, "default"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateByUserStory(com.ss.android.ugc.aweme.feed.model.story.UserStory r20) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata.updateByUserStory(com.ss.android.ugc.aweme.feed.model.story.UserStory):void");
    }

    public final void updateStoryChangeTime(long j) {
        this.userStoryChangeTime = Long.valueOf(j);
    }

    public final void updateStoryViewTime(long j) {
        this.latestStoryViewTime = Long.valueOf(j);
        this.userStoryChangeTime = Long.valueOf(j);
    }

    public UserAllStoryMetadata(List<StoryLiteMetadata> list, Long l, Long l2, UrlModel urlModel, List<Integer> list2, List<FreshContentCount> list3, List<Integer> list4) {
        this.storyLiteMetadata = list;
        this.latestStoryViewTime = l;
        this.userStoryChangeTime = l2;
        this.storyBadgeUrl = urlModel;
        this.storyCelebrationList = list2;
        this.postTypeToCount = list3;
        this.disableStoryCircleScenes = list4;
        this.postTypeToCountBlock = new Object();
    }
}
