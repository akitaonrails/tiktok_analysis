package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_recharge_v3_charge_source_exclusive_setting")
public final class LiveRechargeV3ChargeSourceExclusiveSetting {
    public static final LiveRechargeV3ChargeSourceExclusiveSetting INSTANCE = new LiveRechargeV3ChargeSourceExclusiveSetting();
    public static final LiveSecondPopupControl DEFAULT = new LiveSecondPopupControl(Collections.singletonList(4));

    public final LiveSecondPopupControl getValue() {
        LiveSecondPopupControl liveSecondPopupControl = (LiveSecondPopupControl) SettingsManager.INSTANCE.getValueSafely(LiveRechargeV3ChargeSourceExclusiveSetting.class);
        return liveSecondPopupControl == null ? DEFAULT : liveSecondPopupControl;
    }

    public static final class LiveSecondPopupControl {
        public static final TypeAdapter ADAPTER = new LiveRechargeV3ChargeSourceExclusiveSetting_LiveSecondPopupControl_OptTypeAdapter(NormalGson.singleton());

        @C09CT("skip_charge_sources")
        public List<Integer> skipChargeSources;

        public LiveSecondPopupControl() {
            this(null, 1, null);
        }

        public LiveSecondPopupControl(List<Integer> list) {
            this.skipChargeSources = list;
        }

        public LiveSecondPopupControl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
