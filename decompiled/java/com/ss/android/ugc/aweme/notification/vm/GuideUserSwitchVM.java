package com.ss.android.ugc.aweme.notification.vm;

import X.C1697810uHb;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class GuideUserSwitchVM extends ViewModel {
    public final MutableLiveData<Pair<String, Boolean>> LL = new MutableLiveData<>();
    public final List<String> LLILLJJLI = C1697810uHb.LJIILJJIL("digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push", "im_push", "follow_new_video_push");
    public final List<String> LLILLL = C1697810uHb.LJIILJJIL("friends_comment_push");
}
