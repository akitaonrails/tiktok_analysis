package com.ss.android.ugc.aweme.im.sharepanel.impl.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class ScreenshotBlockedPagesSetting {
    public static final int $stable = 8;

    @C09CT("blocked_fragment_tags")
    public final List<String> blockedFragmentTags;

    @C09CT("blocked_classes")
    public final List<String> blockedPages;

    public ScreenshotBlockedPagesSetting() {
        this(C1697810uHb.LJIIJJI("InboxFragment", "InboxFragmentV2", "SessionListFragmentV2", "ChatRootFragment", "GroupChatDetailActivity", "FriendChatDetailActivity", "SelectChatMsgFragment", "IMSearchFragment", "MvChoosePhotoActivity", "SAAActivity", "LivePlayActivity"), C1697810uHb.LJIIJJI("report_page_sheet", "quick_chat_sheet"));
    }

    public ScreenshotBlockedPagesSetting(List<String> list, List<String> list2) {
        this.blockedPages = list;
        this.blockedFragmentTags = list2;
    }
}
