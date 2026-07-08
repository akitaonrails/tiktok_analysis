package com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel;

import X.C09JN;
import X.C11NZ;
import X.C1413305g3;
import X.C2189821An6;
import X.C23250099c;
import X.C728370Shf;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsFeedViewModel extends StoryFeedViewModel {
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

    public StoryHighlightsFeedViewModel(LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        super(lifecycleOwner, c2189821An6);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1413305g3(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel
    public final C11NZ<UserStoryResponse> bR2(String str, String str2, long j, boolean z, UserStory userStory, C2189821An6 c2189821An6) {
        String aid;
        C728370Shf c728370Shf = C728370Shf.LIZ;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c728370Shf.getClass();
        return StoryApi.LIZIZ.highlightGetAwemesObservable(aid, Long.valueOf(j), z).LJJIJIIJIL(new C09JN() { // from class: X.06WW
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StoryApiHelper@d003.getStoryHighlightUserStory$1");
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C06WV((UserStoryResponse) obj, null), 2);
                C1C7U.LIZIZ("StoryApiHelper@d003.getStoryHighlightUserStory$1");
            }
        });
    }
}
