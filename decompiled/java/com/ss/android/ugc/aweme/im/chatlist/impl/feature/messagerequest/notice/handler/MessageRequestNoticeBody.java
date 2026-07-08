package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageRequestNoticeBody {

    @C09CT("popup_business_scene_list")
    public final List<Integer> scenes;

    public MessageRequestNoticeBody() {
        this(null);
    }

    public MessageRequestNoticeBody(List<Integer> list) {
        this.scenes = list;
    }
}
