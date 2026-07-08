package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_multi_guest_flying_gift_config")
public final class LivesdkMultiGuestFlyingGiftConfigSetting {
    public static final FlyingGiftConfig[] DEFAULT;
    public static final LivesdkMultiGuestFlyingGiftConfigSetting INSTANCE;

    static {
        LivesdkMultiGuestFlyingGiftConfigSetting livesdkMultiGuestFlyingGiftConfigSetting = new LivesdkMultiGuestFlyingGiftConfigSetting();
        INSTANCE = livesdkMultiGuestFlyingGiftConfigSetting;
        DEFAULT = new FlyingGiftConfig[]{livesdkMultiGuestFlyingGiftConfigSetting.loverLockConfig(), livesdkMultiGuestFlyingGiftConfigSetting.magicRhythmConfig()};
    }

    private final FlyingGiftConfig loverLockConfig() {
        FlyingGiftPathConfig flyingGiftPathConfig = new FlyingGiftPathConfig(1L, Float.valueOf(0.378f), Float.valueOf(0.97f), Float.valueOf(0.856f), Float.valueOf(0.086f), Float.valueOf(0.57f), Float.valueOf(0.69f), 0, 10000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(flyingGiftPathConfig);
        return new FlyingGiftConfig(9824L, arrayList);
    }

    private final FlyingGiftConfig magicRhythmConfig() {
        FlyingGiftPathConfig flyingGiftPathConfig = new FlyingGiftPathConfig(1L, Float.valueOf(0.378f), Float.valueOf(0.97f), Float.valueOf(0.856f), Float.valueOf(0.086f), Float.valueOf(0.57f), Float.valueOf(0.69f), 0, 10000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(flyingGiftPathConfig);
        return new FlyingGiftConfig(9825L, arrayList);
    }

    public final FlyingGiftConfig[] getValue() {
        return (FlyingGiftConfig[]) SettingsManager.INSTANCE.getValueSafely("livesdk_multi_guest_flying_gift_config", DEFAULT);
    }

    private final boolean isInRange(FlyingGiftPathConfig flyingGiftPathConfig, int i, int i2, Pair<Integer, Integer> pair) {
        Float f = flyingGiftPathConfig.posX;
        if (f == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        Float f2 = flyingGiftPathConfig.posY;
        if (f2 == null) {
            return false;
        }
        float fFloatValue2 = f2.floatValue();
        Integer num = flyingGiftPathConfig.rangeL;
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        Integer num2 = flyingGiftPathConfig.rangeR;
        if (num2 == null) {
            return false;
        }
        int iIntValue2 = num2.intValue();
        double dSqrt = Math.sqrt(Math.pow(((double) (fFloatValue * i)) - ((double) pair.getFirst().intValue()), 2.0d) + Math.pow(((double) (fFloatValue2 * i2)) - ((double) pair.getSecond().intValue()), 2.0d));
        if (dSqrt < iIntValue || dSqrt >= iIntValue2) {
            return false;
        }
        return true;
    }

    public final FlyingGiftPathConfig getSelectedConfig(int i, int i2, long j, Pair<Integer, Integer> pair) {
        FlyingGiftConfig[] value = getValue();
        FlyingGiftPathConfig flyingGiftPathConfig = null;
        if (value == null) {
            return null;
        }
        for (FlyingGiftConfig flyingGiftConfig : value) {
            Long l = flyingGiftConfig.giftId;
            if (l != null && l.longValue() == j) {
                List<FlyingGiftPathConfig> list = flyingGiftConfig.configs;
                if (list == null) {
                    return null;
                }
                Iterator<FlyingGiftPathConfig> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    FlyingGiftPathConfig next = it2.next();
                    if (INSTANCE.isInRange(next, i, i2, pair)) {
                        flyingGiftPathConfig = next;
                        break;
                    }
                }
                return flyingGiftPathConfig;
            }
        }
        return null;
    }
}
