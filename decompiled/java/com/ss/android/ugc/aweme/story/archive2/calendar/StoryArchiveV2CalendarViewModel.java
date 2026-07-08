package com.ss.android.ugc.aweme.story.archive2.calendar;

import X.AbstractC1156990gDJ;
import X.C1173390gdl;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C627660Ojc;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1173760geM;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2CalendarViewModel extends StoryArchiveV2FeedSharedViewModel<C1173390gdl, AbstractC1156990gDJ> {
    public final C736950SvV LLILZLL;

    @Override // com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel
    public final boolean DQ2() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1173390gdl(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryArchiveV2CalendarViewModel() {
        this.LLILZLL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS256S0000000_18.get$arr$(769), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel
    public final InterfaceC1173760geM BQ2(InterfaceC1173760geM interfaceC1173760geM, C627660Ojc c627660Ojc, String str, String str2, String str3, String str4) {
        interfaceC1173760geM.getClass();
        return new C1173390gdl(c627660Ojc, str, str2, str3, str4);
    }
}
