package com.ss.android.ugc.aweme.feed.assem.ffpbutton;

import X.C2002807sw;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FollowButtonFFPViewModel extends FeedBaseViewModel<C2002807sw> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2002807sw(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return new C2002807sw(true);
    }

    public final void vQ2(Aweme aweme, FollowStatus followStatus) {
        boolean z;
        if (!Intrinsics.LJFF(followStatus.getUserId(), AwemeExtKt.getAuthorUid(aweme))) {
            return;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            author.setFollowStatus(followStatus.getFollowStatus());
        }
        if (followStatus.getFollowStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        setState(new AwS26S0010000_11(z, 0));
    }
}
