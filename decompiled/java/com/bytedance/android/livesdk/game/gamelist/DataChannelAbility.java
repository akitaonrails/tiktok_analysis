package com.bytedance.android.livesdk.game.gamelist;

import X.AnonymousClass1683;
import X.AnonymousClass1684;
import X.InterfaceC494301wD;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;

/* JADX INFO: loaded from: classes13.dex */
public interface DataChannelAbility extends InterfaceC494301wD {
    <T extends Event<O>, O> DataChannel LC0(Class<T> cls, O o);

    <T extends AnonymousClass1684<O>, O> DataChannel SX0(Class<T> cls, O o);

    <T extends AnonymousClass1683<O>, O> O gg0(Class<T> cls);

    <T extends Channel<O>, O> DataChannel zW(Class<T> cls, O o);
}
