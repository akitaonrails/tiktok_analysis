package com.ss.android.ugc.aweme.vibefeed.serviceimpl;

import X.C1383370m6R;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.BaseText;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeDMService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class VibeDMServiceImpl implements IVibeDMService {
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeDMService
    public final BaseHeader LIZ(String str, boolean z) {
        BaseText baseText;
        BaseText baseText2;
        if (z) {
            if (Intrinsics.LJFF(str, "shared_feed_like_history")) {
                baseText2 = new BaseText(C1383370m6R.LJIIJ(2131835292), null, null);
            } else {
                baseText2 = new BaseText(C1383370m6R.LJIIJ(2131835291), null, null);
            }
            return new BaseHeader(baseText2);
        }
        if (Intrinsics.LJFF(str, "shared_feed_like_history")) {
            baseText = new BaseText(C1383370m6R.LJIIJ(2131847979), "sharedFeed_chat_linked_fromSharedLikes", "sharedFeed_chat_linked_fromSharedLikes");
        } else {
            baseText = new BaseText(C1383370m6R.LJIIJ(2131847978), "sharedFeed_chat_linked_fromSharedFeed", "sharedFeed_chat_linked_fromSharedFeed");
        }
        return new BaseHeader(baseText);
    }
}
