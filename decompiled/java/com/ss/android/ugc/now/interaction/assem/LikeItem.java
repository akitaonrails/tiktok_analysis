package com.ss.android.ugc.now.interaction.assem;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeItem implements InterfaceC1891350zJl {
    public static final int $stable = 8;
    public final Aweme aweme;
    public final NowFeedMobHierarchyData interactionHierarchyData;
    public final User user;

    public final LikeItem copy(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        return new LikeItem(user, aweme, nowFeedMobHierarchyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeItem)) {
            return false;
        }
        LikeItem likeItem = (LikeItem) obj;
        return Intrinsics.LJFF(this.user, likeItem.user) && Intrinsics.LJFF(this.aweme, likeItem.aweme) && Intrinsics.LJFF(this.interactionHierarchyData, likeItem.interactionHierarchyData);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.interactionHierarchyData;
        return iHashCode2 + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeItem(user=");
        sbLIZ.append(this.user);
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

    public final NowFeedMobHierarchyData getInteractionHierarchyData() {
        return this.interactionHierarchyData;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof LikeItem) {
            return Intrinsics.LJFF(this.user.getUid(), ((LikeItem) interfaceC1891350zJl).user.getUid());
        }
        return false;
    }

    public LikeItem(User user, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.user = user;
        this.aweme = aweme;
        this.interactionHierarchyData = nowFeedMobHierarchyData;
    }
}
