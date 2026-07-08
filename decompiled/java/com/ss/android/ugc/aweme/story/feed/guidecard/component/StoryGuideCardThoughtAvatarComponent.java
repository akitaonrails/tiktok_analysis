package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C1256560inu;
import X.C20584815gk;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1256590inx;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardThoughtAbility;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardThoughtAvatarComponent extends StoryGuideCardSingleAvatarComponent {
    public final C630740Ooa LLLIIIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 674));

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardSingleAvatarComponent
    /* JADX INFO: renamed from: Vp */
    public final void rr(VideoItemParams videoItemParams) {
        C20584815gk c20584815gkYL1;
        String uid;
        super.rr(videoItemParams);
        StoryGuideCardThoughtAbility storyGuideCardThoughtAbility = (StoryGuideCardThoughtAbility) this.LLLIIIIL.getValue();
        String uid2 = null;
        if (storyGuideCardThoughtAbility != null) {
            c20584815gkYL1 = storyGuideCardThoughtAbility.YL1();
        } else {
            c20584815gkYL1 = null;
        }
        User author = videoItemParams.getAweme().getAuthor();
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (author != null) {
            uid2 = author.getUid();
        }
        boolean zLJFF = Intrinsics.LJFF(uid, uid2);
        if (!zLJFF) {
            currentUser = author;
        }
        StoryNoteDataCollection storyNoteDataCollection = StoryNoteDataCollectionKt.toStoryNoteDataCollection(videoItemParams.getAweme());
        if (c20584815gkYL1 != null) {
            C1256560inu c1256560inu = C1256560inu.LIZ;
            EnumC1256590inx enumC1256590inx = EnumC1256590inx.IMMERSIVE_FEED;
            c1256560inu.getClass();
            c20584815gkYL1.setEnableStarSticker(C1256560inu.LJFF(storyNoteDataCollection, enumC1256590inx, zLJFF, false));
        }
        AvatarComponentView avatarComponentViewQp = Qp();
        if (avatarComponentViewQp != null) {
            C1256560inu.LIZ(C1256560inu.LIZ, avatarComponentViewQp, c20584815gkYL1, this, zLJFF, null, storyNoteDataCollection, false, currentUser, EnumC1256590inx.IMMERSIVE_FEED, null, null, null, 14760);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardSingleAvatarComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        rr(videoItemParams);
    }
}
