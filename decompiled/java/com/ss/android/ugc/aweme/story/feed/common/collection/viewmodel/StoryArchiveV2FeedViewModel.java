package com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel;

import X.C11NZ;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2189821An6;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C728370Shf;
import X.C736950SvV;
import X.EnumC332601Qu;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryArchiveV2FeedViewModel extends StoryFeedViewModel {
    public final C736950SvV LLJJJ;

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final String LQ2(Aweme aweme) {
        return aweme.getAid();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final void ZQ2(UserStoryResponse userStoryResponse) {
        ((AssemViewModel) this.LLJJJ.getValue()).setState(new AwS597S0100000_18(userStoryResponse, 679));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryArchiveV2FeedViewModel(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        super(lifecycleOwner, c2189821An6);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(503);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLJJJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS229S0000000_2, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final C11NZ<UserStoryResponse> bR2(String str, String str2, long j, boolean z, UserStory userStory, C2189821An6 c2189821An6) {
        String aid;
        EnumC332601Qu enumC332601Qu;
        if (userStory.getStories().isEmpty()) {
            aid = "";
        } else if (z) {
            aid = ((Aweme) C13LP.LJJJJZI(userStory.getStories())).getAid();
        } else {
            aid = ((Aweme) C13LP.LJJLIIIJJI(userStory.getStories())).getAid();
        }
        C728370Shf.LIZ.getClass();
        boolean z2 = false;
        IStoryArchiveV2Service iStoryArchiveV2Service = (IStoryArchiveV2Service) PluggableExtentionKt.pluggableSpi$default(IStoryArchiveV2Service.class, false, false, false, 14, null);
        if (iStoryArchiveV2Service != null && iStoryArchiveV2Service.LIZJ(c2189821An6)) {
            z2 = true;
        }
        StoryApi storyApi = StoryApi.LIZIZ;
        if (z2) {
            enumC332601Qu = EnumC332601Qu.THOUGHT_TAB;
        } else {
            enumC332601Qu = EnumC332601Qu.STORY_TAB;
        }
        return storyApi.getArchivedStoryInDay(aid, enumC332601Qu.getValue(), j, z);
    }
}
