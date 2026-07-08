package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C1376130lul;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* JADX INFO: loaded from: classes22.dex */
public final class VkChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "vk";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new C1376130lul();
    }
}
