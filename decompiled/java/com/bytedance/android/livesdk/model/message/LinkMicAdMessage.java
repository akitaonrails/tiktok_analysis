package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LinkMicAdContent;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicAdMessage extends AbstractC1136060ffY {

    @C09CT("link_ad_contents")
    public List<LinkMicAdContent> linkAdContents;

    @C09CT("message_type")
    public int messageType;

    public LinkMicAdMessage() {
        this.type = C001A.LINK_MIC_AD_MESSAGE;
        this.linkAdContents = new ArrayList();
    }
}
