package com.ss.android.ugc.aweme.audiomode.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C308360C6w;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreAbConfigType;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.structures.SAMICoreAbCallback;
import com.mammon.audiosdk.structures.SAMICoreAbContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSDKABLegoTask implements C0CCZ {
    public static final AudioSDKABLegoTask LL = new AudioSDKABLegoTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AudioSDKABLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        System.currentTimeMillis();
        if (C308360C6w.LIZ) {
            SAMICoreAbContext.getInstance().init(new SAMICoreAbCallback() { // from class: X.09rU
                @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
                public final Object getSAMICoreAbConfig(String str, SAMICoreAbConfigType sAMICoreAbConfigType) {
                    return null;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
                public final Boolean getSAMICoreAbBoolConfig(String str) {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && str != null) {
                        switch (str.hashCode()) {
                            case -1885767454:
                                if (str.equals("sami_test_bool")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "sami_test_bool", true, false));
                                }
                                break;
                            case -242503762:
                                if (str.equals("sami_enable_limiter_make_up")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "sami_enable_limiter_make_up", true, false));
                                }
                                break;
                            case -192587044:
                                if (str.equals("sami_audio_monitor")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "sami_audio_monitor", true, false));
                                }
                                break;
                            case 887461982:
                                if (str.equals("sami_tiga_ab_all")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "sami_tiga_ab_all", true, false));
                                }
                                break;
                            case 1335574548:
                                if (str.equals("speech_ratio_loudness_adjust")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "speech_ratio_loudness_adjust", true, false));
                                }
                                break;
                            case 1791416799:
                                if (str.equals("sami_enable_tracker_print")) {
                                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "sami_enable_tracker_print", true, false));
                                }
                                break;
                        }
                    }
                    return null;
                }

                @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
                public final Float getSAMICoreAbFloatConfig(String str) {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || str == null) {
                        return null;
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1167051049) {
                        if (iHashCode != 1674355556) {
                            if (iHashCode != 1907393387 || !str.equals("sami_max_lra")) {
                                return null;
                            }
                            return Float.valueOf(C0C64.LJIILLIIL().LJIILL(31744, "sami_max_lra", true, 100.0f));
                        }
                        if (!str.equals("sami_test_float")) {
                            return null;
                        }
                        return Float.valueOf(C0C64.LJIILLIIL().LJIILL(31744, "sami_test_float", true, -0.999f));
                    }
                    if (!str.equals("sami_left_right_diff_threshold")) {
                        return null;
                    }
                    return Float.valueOf(C0C64.LJIILLIIL().LJIILL(31744, "sami_left_right_diff_threshold", true, 0.0f));
                }

                @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
                public final Integer getSAMICoreAbIntConfig(String str) {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || str == null) {
                        return null;
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1723571797) {
                        if (iHashCode != -1378578587) {
                            if (iHashCode != 1740290807 || !str.equals("sami_test_int")) {
                                return null;
                            }
                            return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, -999, "sami_test_int", true));
                        }
                        if (!str.equals("sami_tiga_ab_config")) {
                            return null;
                        }
                        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "sami_tiga_ab_config", true));
                    }
                    if (!str.equals("sami_ttplayer_trachker_interval")) {
                        return null;
                    }
                    return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 100, "sami_ttplayer_trachker_interval", true));
                }

                @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
                public final String getSAMICoreAbStringConfig(String str) {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    if (Intrinsics.LJFF(str, "sami_test_string")) {
                        return C0C64.LJIILLIIL().LJJ(31744, "sami_test_string", "sami_test_string default", true);
                    }
                    if (!Intrinsics.LJFF(str, "sami_test_string4")) {
                        return null;
                    }
                    return C0C64.LJIILLIIL().LJJ(31744, "sami_test_string4", "test_default2", true);
                }
            });
            SAMICore.InitContext(null, null, SAMICoreContextType.SAMICoreContextType_AbConfig, null);
        }
    }
}
