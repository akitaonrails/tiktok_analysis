package com.bytedance.android.livesdk.comp.impl.linkcore.utils;

import X.C123100dR;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC772190UQv;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulateRoomId;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulationEnable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class LinkMicHighHotRoomMockUtils {
    public static final LinkMicHighHotRoomMockUtils INSTANCE = new LinkMicHighHotRoomMockUtils();

    private final boolean enableMock() {
        return LiveHostSimulationEnable.enable() && C123100dR.LIZ(getMockRoomId());
    }

    private final String getMockRoomId() {
        return !LiveHostSimulationEnable.enable() ? "" : TextUtils.isEmpty(LiveHostSimulateRoomId.value()) ? InterfaceC772190UQv.f125a3.LIZIZ() : LiveHostSimulateRoomId.value();
    }

    private final void mockMessageImpl(Object obj, IMessage iMessage, long j, long j2, long j3, int i) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mockMessage[");
        if (iMessage != null) {
            lValueOf = Long.valueOf(iMessage.getMessageId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append("], do nothing");
        C20441214yg.LIZIZ("LinkMicHighHotRoomMockUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void mockMessage(Object obj, IMessage iMessage, long j, long j2, long j3, int i) {
        if (!enableMock()) {
            return;
        }
        try {
            mockMessageImpl(obj, iMessage, j, j2, j3, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZIZ("LinkMicHighHotRoomMockUtils", "ignore this exception");
        }
    }
}
