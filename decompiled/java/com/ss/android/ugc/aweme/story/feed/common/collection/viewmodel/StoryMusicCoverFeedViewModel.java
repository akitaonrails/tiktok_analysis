package com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel;

import X.C01GW;
import X.C2095008Iq;
import X.C2189821An6;
import X.C23250099c;
import X.C452501pT;
import X.C630630OoP;
import X.C630650OoR;
import X.EnumC630660OoS;
import X.InterfaceC497601wk;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.v2.assem.story.IMusicDetailStoryService;
import com.ss.android.ugc.aweme.services.IMusicExService;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryMusicCoverFeedViewModel extends StoryFeedViewModel {
    public String LLJJJ;
    public final C01GW LLJJJIL;

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final boolean GQ2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final boolean HQ2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final String LQ2(Aweme aweme) {
        return aweme.getAid();
    }

    public StoryMusicCoverFeedViewModel(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        super(lifecycleOwner, c2189821An6);
        this.LLJJJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(313));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final void dR2(int i, String str, Integer num, String str2) {
        UserStory userStory;
        int iIntValue;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            List<C630650OoR> listPQ2 = (List) ((LinkedHashMap) this.LLJILJILJ).get(str);
            if (listPQ2 == null) {
                listPQ2 = PQ2(str, "");
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount()) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                if (i + iIntValue >= userStory.getCurrentPosition() + ((long) userStory.getStories().size()) && userStory.getHasMoreAfter() && ((int) userStory.getCurrentPosition()) + userStory.getStories().size() < listPQ2.size() && ((C630650OoR) ListProtector.get(listPQ2, ((int) userStory.getCurrentPosition()) + userStory.getStories().size())).LIZIZ == EnumC630660OoS.UNLOADING) {
                    YQ2(str, str2, userStory.getMaxCursor(), false, userStory);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final void YQ2(String str, String str2, long j, boolean z, UserStory userStory) {
        IMusicDetailStoryService iMusicDetailStoryService;
        int iIntValue;
        IMusicExService iMusicExService = (IMusicExService) PluggableExtentionKt.pluggableSpi$default(IMusicExService.class, false, false, false, 14, null);
        if (iMusicExService != null && (iMusicDetailStoryService = (IMusicDetailStoryService) PluggableExtentionKt.pluggableSpi$default(IMusicDetailStoryService.class, false, false, false, 14, null)) != null) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = -1;
            }
            MusicEntranceResult musicEntranceResultLIZ = iMusicDetailStoryService.LIZ(iIntValue);
            if (musicEntranceResultLIZ == null || Intrinsics.LJFF(this.LLJJJ, musicEntranceResultLIZ.pageToken)) {
                return;
            }
            this.LLJJJ = musicEntranceResultLIZ.pageToken;
            fR2(str, "", z);
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLJJJIL.getValue(), null, null, new C630630OoP(iMusicExService, musicEntranceResultLIZ, this, str, userStory, str2, null), 3);
        }
    }
}
