package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C1377070lwH;
import X.C1377600lx8;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class SystemChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "more";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        Function1<String, String> function1;
        String strInvoke;
        if (c1377070lwH == null || (function1 = c1377070lwH.LIZIZ) == null || (strInvoke = function1.invoke("more")) == null) {
            return null;
        }
        return new C1377600lx8(strInvoke);
    }
}
