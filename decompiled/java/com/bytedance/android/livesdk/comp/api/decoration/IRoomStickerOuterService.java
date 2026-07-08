package com.bytedance.android.livesdk.comp.api.decoration;

import X.C006A;
import Y.AObjectS387S0100000_12;
import Y.AObjectS528S0100000_12;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public interface IRoomStickerOuterService extends C006A {
    LiveStickerPropsDialog GC0(boolean z);

    void Kc(Map map);

    void LLZZZIL(DataChannel dataChannel);

    void Lb1();

    SinglePropsSelectorDialog Rh0(String str, AObjectS387S0100000_12 aObjectS387S0100000_12, AObjectS528S0100000_12 aObjectS528S0100000_12);

    void WC();

    Class<? extends LiveRecyclableWidget> XB0();

    Class<? extends Event<RoomSticker>> dF2();

    void ff2(String str, String str2, String str3, Function2<? super Boolean, ? super String, Unit> function2);

    RoomStickerWrapperWidget n50();

    RoomSticker ry1(DataChannel dataChannel);
}
