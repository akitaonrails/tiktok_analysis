package com.bytedance.android.livesdk.game.gamelist;

import X.AnonymousClass1683;
import X.AnonymousClass1684;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;

/* JADX INFO: loaded from: classes13.dex */
public final class DataChannelAbilityImply implements DataChannelAbility {
    public final DataChannel LL;

    public DataChannelAbilityImply(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.game.gamelist.DataChannelAbility
    public final <T extends AnonymousClass1683<O>, O> O gg0(Class<T> cls) {
        return (O) this.LL.gg0(cls);
    }

    @Override // com.bytedance.android.livesdk.game.gamelist.DataChannelAbility
    public final <T extends Event<O>, O> DataChannel LC0(Class<T> cls, O o) {
        DataChannel dataChannel = this.LL;
        dataChannel.LC0(cls, o);
        return dataChannel;
    }

    @Override // com.bytedance.android.livesdk.game.gamelist.DataChannelAbility
    public final <T extends AnonymousClass1684<O>, O> DataChannel SX0(Class<T> cls, O o) {
        DataChannel dataChannel = this.LL;
        dataChannel.SX0(cls, o);
        return dataChannel;
    }

    @Override // com.bytedance.android.livesdk.game.gamelist.DataChannelAbility
    public final <T extends Channel<O>, O> DataChannel zW(Class<T> cls, O o) {
        DataChannel dataChannel = this.LL;
        dataChannel.zW(cls, o);
        return dataChannel;
    }
}
