package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInnerFlowHotRefreshSetting_LiveInnerFlowHotRefreshConfig_OptTypeAdapter extends TypeAdapter<LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig> {
    public final Gson LIZ;

    public LiveInnerFlowHotRefreshSetting_LiveInnerFlowHotRefreshConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig liveInnerFlowHotRefreshConfig = new LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig(new LinkedHashMap(), false, false, 0, 0, 5L, 30L, false, false, new LinkedHashMap(), false, false, false, 0L, 1, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1888246353:
                        if (strLJJJJ.equals("enable_negative_signal_trigger")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setEnableNegativeSignalTrigger(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1591573360:
                        if (strLJJJJ.equals("entries")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setEntryConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, LiveInnerFlowHotRefreshSetting.EntryConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -909211829:
                        if (strLJJJJ.equals("hot_refresh_unread_report_key_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setHotRefreshUnreadReportKeyType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -861553533:
                        if (strLJJJJ.equals("expired_retry_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setExpiredRetryMaxCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -826835331:
                        if (strLJJJJ.equals("unread_trigger_opt_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setUnreadTriggerOptType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -623432331:
                        if (strLJJJJ.equals("enable_feed_timeout_trigger")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setEnableFeedTimeoutTrigger(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -356421096:
                        if (strLJJJJ.equals("enable_online_drop_trigger")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setEnableOnlineDropTrigger(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -328390920:
                        if (strLJJJJ.equals("enable_foreground_trigger")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setEnableForegroundTrigger(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 425964849:
                        if (strLJJJJ.equals("is_unread_trigger_opt_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setUnreadTriggerOptEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 488984447:
                        if (strLJJJJ.equals("negative_signal_skip_recent_feed_protect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setNegativeSignalSkipRecentFeedProtect(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 943081262:
                        if (strLJJJJ.equals("expired_retry_max_backoff_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setExpiredRetryMaxBackoffSec(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1218309597:
                        if (strLJJJJ.equals("hot_refresh_unread_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setHotRefreshUnreadMode(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1354864314:
                        if (strLJJJJ.equals("negative_signal_type_switches")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setNegativeSignalTypeSwitches(C473040Igo.LIZIZ(this.LIZ, c09cu, Boolean.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1453868413:
                        if (strLJJJJ.equals("cooldown_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setCooldownSec(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2064767325:
                        if (strLJJJJ.equals("expired_retry_base_backoff_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setExpiredRetryBaseBackoffSec(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2081127148:
                        if (strLJJJJ.equals("fix_remove_current_room_issue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerFlowHotRefreshConfig.setRemoveCurrentRoomIssueEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveInnerFlowHotRefreshConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig liveInnerFlowHotRefreshConfig) throws IOException {
        LiveInnerFlowHotRefreshSetting.LiveInnerFlowHotRefreshConfig liveInnerFlowHotRefreshConfig2 = liveInnerFlowHotRefreshConfig;
        if (liveInnerFlowHotRefreshConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("entries");
        C473040Igo.LJ(this.LIZ, c09dl, liveInnerFlowHotRefreshConfig2.getEntryConfigs(), LiveInnerFlowHotRefreshSetting.EntryConfig.class);
        c09dl.LJIILLIIL("fix_remove_current_room_issue");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getRemoveCurrentRoomIssueEnable());
        c09dl.LJIILLIIL("is_unread_trigger_opt_enable");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.isUnreadTriggerOptEnable());
        c09dl.LJIILLIIL("unread_trigger_opt_type");
        c09dl.LJJJJ(Integer.valueOf(liveInnerFlowHotRefreshConfig2.getUnreadTriggerOptType()));
        c09dl.LJIILLIIL("expired_retry_max_count");
        c09dl.LJJJJ(Integer.valueOf(liveInnerFlowHotRefreshConfig2.getExpiredRetryMaxCount()));
        c09dl.LJIILLIIL("expired_retry_base_backoff_sec");
        c09dl.LJJIZ(liveInnerFlowHotRefreshConfig2.getExpiredRetryBaseBackoffSec());
        c09dl.LJIILLIIL("expired_retry_max_backoff_sec");
        c09dl.LJJIZ(liveInnerFlowHotRefreshConfig2.getExpiredRetryMaxBackoffSec());
        c09dl.LJIILLIIL("enable_negative_signal_trigger");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getEnableNegativeSignalTrigger());
        c09dl.LJIILLIIL("enable_online_drop_trigger");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getEnableOnlineDropTrigger());
        c09dl.LJIILLIIL("negative_signal_type_switches");
        C473040Igo.LJ(this.LIZ, c09dl, liveInnerFlowHotRefreshConfig2.getNegativeSignalTypeSwitches(), Boolean.TYPE);
        c09dl.LJIILLIIL("negative_signal_skip_recent_feed_protect");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getNegativeSignalSkipRecentFeedProtect());
        c09dl.LJIILLIIL("enable_feed_timeout_trigger");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getEnableFeedTimeoutTrigger());
        c09dl.LJIILLIIL("enable_foreground_trigger");
        c09dl.LJJJJJL(liveInnerFlowHotRefreshConfig2.getEnableForegroundTrigger());
        c09dl.LJIILLIIL("cooldown_sec");
        c09dl.LJJIZ(liveInnerFlowHotRefreshConfig2.getCooldownSec());
        c09dl.LJIILLIIL("hot_refresh_unread_mode");
        c09dl.LJJJJ(Integer.valueOf(liveInnerFlowHotRefreshConfig2.getHotRefreshUnreadMode()));
        c09dl.LJIILLIIL("hot_refresh_unread_report_key_type");
        c09dl.LJJJJ(Integer.valueOf(liveInnerFlowHotRefreshConfig2.getHotRefreshUnreadReportKeyType()));
        c09dl.LJII();
    }
}
