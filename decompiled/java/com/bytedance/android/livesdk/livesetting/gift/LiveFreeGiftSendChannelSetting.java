package com.bytedance.android.livesdk.livesetting.gift;

import X.C1161920gLG;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_enable_free_gift_with_channel")
public final class LiveFreeGiftSendChannelSetting {
    public static final HashMap<String, Boolean> DEFAULT;
    public static final LiveFreeGiftSendChannelSetting INSTANCE = new LiveFreeGiftSendChannelSetting();

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT = C2097608Jq.LJI(new Pair("local_test", Boolean.TRUE), new Pair("lark_inhouse", bool), new Pair("google_play", bool));
    }

    private final Map<String, Boolean> getValue() {
        try {
            Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveFreeGiftSendChannelSetting.class);
            return map == null ? DEFAULT : map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }

    public final boolean canFreeSendInCurrentChannel() {
        try {
            return Intrinsics.LJFF(getValue().get(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel()), Boolean.TRUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final HashMap<String, Boolean> getDEFAULT() {
        return DEFAULT;
    }
}
