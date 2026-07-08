package com.bytedance.android.livesdk.comp.api.decoration;

import X.C006A;
import X.C261600zm;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface IDonationStickerOuterService extends C006A {
    void LLZZZIL(DataChannel dataChannel);

    void Mo2(Context context, int i, Map<String, String> map);

    DonationStickerWrapperWidget bO2();

    Class<? extends Event<List<RoomDecoration>>> oV0();

    C261600zm v62(DataChannel dataChannel);

    void vO0(LifecycleOwner lifecycleOwner, DataChannel dataChannel);
}
