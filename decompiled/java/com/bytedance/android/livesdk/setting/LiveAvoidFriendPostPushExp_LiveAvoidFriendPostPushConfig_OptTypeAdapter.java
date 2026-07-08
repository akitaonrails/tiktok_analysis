package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.setting.LiveAvoidFriendPostPushExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAvoidFriendPostPushExp_LiveAvoidFriendPostPushConfig_OptTypeAdapter extends TypeAdapter<LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig> {
    public final Gson LIZ;

    public LiveAvoidFriendPostPushExp_LiveAvoidFriendPostPushConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig liveAvoidFriendPostPushConfig = new LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig(false, null, null, null, null, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -766978277:
                        if (strLJJJJ.equals("friend_post_push_show_with_multi_watch_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setShowWithMultiWatchCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -578430143:
                        if (strLJJJJ.equals("friend_post_push_show_with_multi_watch_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setShowWithMultiWatchTime(Long.valueOf(c09cu.LJJJ()));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -418177684:
                        if (strLJJJJ.equals("friend_post_push_show_with_perf_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setShowPerfLevel(Integer.valueOf(c09cu.LJJIZ()));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -22974617:
                        if (strLJJJJ.equals("friend_post_push_show_with_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setShowPosition(Integer.valueOf(c09cu.LJJIZ()));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1291392022:
                        if (strLJJJJ.equals("friend_post_push_show_with_single_watch_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAvoidFriendPostPushConfig.setShowWithSingleWatchTime(Long.valueOf(c09cu.LJJJ()));
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
        return liveAvoidFriendPostPushConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig liveAvoidFriendPostPushConfig) throws IOException {
        LiveAvoidFriendPostPushExp.LiveAvoidFriendPostPushConfig liveAvoidFriendPostPushConfig2 = liveAvoidFriendPostPushConfig;
        if (liveAvoidFriendPostPushConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveAvoidFriendPostPushConfig2.getEnable());
        c09dl.LJIILLIIL("friend_post_push_show_with_position");
        c09dl.LJJJJ(liveAvoidFriendPostPushConfig2.getShowPosition());
        c09dl.LJIILLIIL("friend_post_push_show_with_perf_level");
        c09dl.LJJJJ(liveAvoidFriendPostPushConfig2.getShowPerfLevel());
        c09dl.LJIILLIIL("friend_post_push_show_with_single_watch_time");
        c09dl.LJJJJ(liveAvoidFriendPostPushConfig2.getShowWithSingleWatchTime());
        c09dl.LJIILLIIL("friend_post_push_show_with_multi_watch_time");
        c09dl.LJJJJ(liveAvoidFriendPostPushConfig2.getShowWithMultiWatchTime());
        c09dl.LJIILLIIL("friend_post_push_show_with_multi_watch_count");
        c09dl.LJJJJ(Integer.valueOf(liveAvoidFriendPostPushConfig2.getShowWithMultiWatchCount()));
        c09dl.LJII();
    }
}
