package com.bytedance.android.livesdk.comp.impl.decoration;

import X.C01S3;
import X.C0UN7;
import X.C1097290ef1;
import X.C1105280eru;
import X.C13LQ;
import X.C342601Uq;
import X.C482260Ivg;
import Y.AObjectS387S0100000_12;
import Y.AObjectS528S0100000_12;
import com.bytedance.android.live.decoration.RoomStickerDecorationsEvent;
import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class RoomStickerOuterService implements IRoomStickerOuterService {
    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final void Lb1() {
        C342601Uq.LIZ = null;
        C342601Uq.LIZIZ = null;
    }

    public final void onInit() {
        C1105280eru.LIZIZ(null, C13LQ.LJLIIL(new Integer[]{Integer.valueOf(R.layout.hl4), Integer.valueOf(R.layout.g49)}));
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final void WC() {
        ((ArrayList) C1097290ef1.LIZ).clear();
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final RoomStickerWrapperWidget n50() {
        return new RoomStickerWrapperWidget();
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final Class<? extends LiveRecyclableWidget> XB0() {
        return StickerContainerWidget.class;
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final Class<? extends Event<RoomSticker>> dF2() {
        return RoomStickerDecorationsEvent.class;
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final LiveStickerPropsDialog GC0(boolean z) {
        return new LiveStickerPropsDialog(z);
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final void Kc(Map map) {
        if (Intrinsics.LJFF(map.get("category"), "sticker")) {
            String str = (String) map.get("sticker_id");
            if (str == null) {
                str = "";
            }
            C01S3.LIZ(str, (String) map.get("content"), (String) map.get("source"), null);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final void LLZZZIL(DataChannel dataChannel) {
        C482260Ivg.LIZLLL(RoomStickerApi.class, new RoomStickerApi() { // from class: X.0UNA
            @Override // com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi
            public final C11NZ<C470590Icr<StickerCheckResponse>> checkEditable(String str) {
                C480460Ism.LIZ().getClass();
                return ((RoomStickerApi) C480460Ism.LIZLLL(RoomStickerApi.class)).checkEditable(str);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [T, com.bytedance.android.livesdk.model.StickersSetResponse] */
            @Override // com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi
            public final C11NZ<C470590Icr<StickersSetResponse>> setRoomStickers(Map<String, Object> map) {
                C470590Icr c470590Icr = new C470590Icr();
                ?? stickersSetResponse = new StickersSetResponse();
                stickersSetResponse.status = 2;
                c470590Icr.data = stickersSetResponse;
                return C11NZ.LJJJJZ(c470590Icr);
            }

            @Override // com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi
            public final C11NZ<C470590Icr<Object>> deleteRoomStickers(long j, long j2) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final RoomSticker ry1(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (RoomSticker) dataChannel.gg0(C0UN7.class);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final SinglePropsSelectorDialog Rh0(String str, AObjectS387S0100000_12 aObjectS387S0100000_12, AObjectS528S0100000_12 aObjectS528S0100000_12) {
        return new SinglePropsSelectorDialog(str, aObjectS387S0100000_12, aObjectS528S0100000_12);
    }

    @Override // com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService
    public final void ff2(String str, String str2, String str3, Function2<? super Boolean, ? super String, Unit> function2) {
        C01S3.LIZ(str, str2, str3, function2);
    }
}
