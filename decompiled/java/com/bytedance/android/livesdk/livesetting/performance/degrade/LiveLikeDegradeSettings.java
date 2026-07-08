package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C0TZM;
import X.C1077790e9Z;
import X.EnumC1087640ePS;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_like_degrade")
public final class LiveLikeDegradeSettings {
    public static final LiveLikeDegrade DEFAULT;
    public static final LiveLikeDegradeSettings INSTANCE = new LiveLikeDegradeSettings();

    static {
        TypeAdapter typeAdapter = LiveLikeDegrade.ADAPTER;
        DEFAULT = new LiveLikeDegrade();
    }

    public final LiveLikeDegrade getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveLikeDegrade liveLikeDegrade = DEFAULT;
        LiveLikeDegrade liveLikeDegrade2 = (LiveLikeDegrade) settingsManager.getValueSafely("live_like_degrade", liveLikeDegrade);
        return liveLikeDegrade2 != null ? liveLikeDegrade2 : liveLikeDegrade;
    }

    public final LiveLikeDegrade getDEFAULT() {
        return DEFAULT;
    }

    private final boolean isSelfLikeDowngrade(DataChannel dataChannel) {
        EnumC1087640ePS enumC1087640ePS;
        C1077790e9Z c1077790e9Z;
        if (!ScalableDowngradeSetting.disableSelfLike()) {
            return false;
        }
        if (dataChannel != null && (c1077790e9Z = (C1077790e9Z) dataChannel.gg0(LowDevicePerfScalableChannel.class)) != null) {
            enumC1087640ePS = c1077790e9Z.LIZIZ;
        } else {
            enumC1087640ePS = null;
        }
        if (enumC1087640ePS != EnumC1087640ePS.LEVEL_CRITICAL) {
            return false;
        }
        return true;
    }

    private final boolean userIsAudience(DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return !zBooleanValue;
    }

    public final boolean disableAvatarAnim(DataChannel dataChannel) {
        if (userIsAudience(dataChannel)) {
            if (!getValue().enableAvatarAnim || isSelfLikeDowngrade(dataChannel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean disableBottomView(DataChannel dataChannel) {
        boolean zLJFF;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        return !zLJFF;
    }

    public final boolean disableEasterEggs(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableEasterEggs) {
            return true;
        }
        return false;
    }

    public final boolean disableLikeFunc(DataChannel dataChannel) {
        if (disableOtherLike(dataChannel) && disableSelfLike(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean disableLottieAnim(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableLottieAnim) {
            return true;
        }
        return false;
    }

    public final boolean disableOtherLike(DataChannel dataChannel) {
        if ((!userIsAudience(dataChannel) || getValue().enableOtherlike) && !isScalableDowngrade(dataChannel)) {
            return false;
        }
        return true;
    }

    public final boolean disableSelfLike(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableSelflike) {
            return true;
        }
        return false;
    }

    public final boolean isScalableDowngrade(DataChannel dataChannel) {
        C1077790e9Z c1077790e9Z;
        EnumC1087640ePS enumC1087640ePS;
        if (dataChannel == null || (c1077790e9Z = (C1077790e9Z) dataChannel.gg0(LowDevicePerfScalableChannel.class)) == null || (enumC1087640ePS = c1077790e9Z.LIZIZ) == null) {
            return false;
        }
        int iOrdinal = enumC1087640ePS.ordinal();
        if (!ScalableDowngradeSetting.disableOtherLikeAnim() || iOrdinal >= EnumC1087640ePS.LEVEL_HIGH.ordinal()) {
            return false;
        }
        return true;
    }
}
