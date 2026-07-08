package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveEnterRoomSuccessMsgOptExp_LiveEnterRoomSuccessMsgOptConfig_OptTypeAdapter extends TypeAdapter<LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig> {
    public final Gson LIZ;

    public LiveEnterRoomSuccessMsgOptExp_LiveEnterRoomSuccessMsgOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig liveEnterRoomSuccessMsgOptConfig = new LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig(false, false, false, false, false, false, 0.05f, 0.02f, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1956342493:
                        if (strLJJJJ.equals("scroll_enter_room_start_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setScrollEnterRoomStartThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1079834375:
                        if (strLJJJJ.equals("enable_core_msg_sent_skip_unload_scatter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableCoreMsgSentSkipUnloadScatter(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -828910930:
                        if (strLJJJJ.equals("enable_core_msg_sent_notify")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableCoreMsgSentNotify(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -517349042:
                        if (strLJJJJ.equals("enable_frame_view_do_frame_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableFrameViewDoFrameCheck(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -303115388:
                        if (strLJJJJ.equals("enable_first_frame_msg_for_click_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableFirstFrameMsgForClickV2(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 687531186:
                        if (strLJJJJ.equals("disable_opt_for_preview_enter_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setDisableOptForPreviewEnterRoom(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1082444319:
                        if (strLJJJJ.equals("enable_early_enter_room_for_draw")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableEarlyEnterRoomForDraw(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1135533966:
                        if (strLJJJJ.equals("enable_flush_direct_first_frame_msg_on_attach_conditional")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableFlushDirectFirstFrameMsgOnAttachConditional(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1442668275:
                        if (strLJJJJ.equals("enable_enter_room_msg_for_click")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableEnterRoomMsgForClick(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1623163002:
                        if (strLJJJJ.equals("pre_pull_stream_scroll_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setPrePullStreamScrollThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1840495264:
                        if (strLJJJJ.equals("enable_core_msg_sent_skip_load_scatter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomSuccessMsgOptConfig.setEnableCoreMsgSentSkipLoadScatter(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return liveEnterRoomSuccessMsgOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig liveEnterRoomSuccessMsgOptConfig) throws IOException {
        LiveEnterRoomSuccessMsgOptExp.LiveEnterRoomSuccessMsgOptConfig liveEnterRoomSuccessMsgOptConfig2 = liveEnterRoomSuccessMsgOptConfig;
        if (liveEnterRoomSuccessMsgOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_enter_room_msg_for_click");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableEnterRoomMsgForClick());
        c09dl.LJIILLIIL("enable_early_enter_room_for_draw");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableEarlyEnterRoomForDraw());
        c09dl.LJIILLIIL("disable_opt_for_preview_enter_room");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getDisableOptForPreviewEnterRoom());
        c09dl.LJIILLIIL("enable_first_frame_msg_for_click_v2");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableFirstFrameMsgForClickV2());
        c09dl.LJIILLIIL("enable_frame_view_do_frame_check");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableFrameViewDoFrameCheck());
        c09dl.LJIILLIIL("enable_flush_direct_first_frame_msg_on_attach_conditional");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableFlushDirectFirstFrameMsgOnAttachConditional());
        c09dl.LJIILLIIL("pre_pull_stream_scroll_threshold");
        c09dl.LJJJJ(Float.valueOf(liveEnterRoomSuccessMsgOptConfig2.getPrePullStreamScrollThreshold()));
        c09dl.LJIILLIIL("scroll_enter_room_start_threshold");
        c09dl.LJJJJ(Float.valueOf(liveEnterRoomSuccessMsgOptConfig2.getScrollEnterRoomStartThreshold()));
        c09dl.LJIILLIIL("enable_core_msg_sent_notify");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableCoreMsgSentNotify());
        c09dl.LJIILLIIL("enable_core_msg_sent_skip_load_scatter");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableCoreMsgSentSkipLoadScatter());
        c09dl.LJIILLIIL("enable_core_msg_sent_skip_unload_scatter");
        c09dl.LJJJJJL(liveEnterRoomSuccessMsgOptConfig2.getEnableCoreMsgSentSkipUnloadScatter());
        c09dl.LJII();
    }
}
