package com.ss.android.ugc.aweme.channel.share.model;

import X.C1376080lug;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareChannelService implements IChannelApi {
    public final ShareChannelInfo LL;

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return this.LL.channelKey;
    }

    public ShareChannelService(ShareChannelInfo shareChannelInfo) {
        this.LL = shareChannelInfo;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new C1376080lug(this.LL);
    }
}
