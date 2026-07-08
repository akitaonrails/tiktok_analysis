package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedConfigParams_OptTypeAdapter extends TypeAdapter<FeedConfigParams> {
    public final Gson LIZ;

    public FeedConfigParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FeedConfigParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeedConfigParams feedConfigParams = new FeedConfigParams(60, false, 7200L, 3000L, 2500L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1085529365:
                        if (strLJJJJ.equals("animation_delay_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedConfigParams.animationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -955085814:
                        if (strLJJJJ.equals("time_interval_for_request_next_task_info")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedConfigParams.refreshDelayRange = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -691844710:
                        if (strLJJJJ.equals("first_animation_delay_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedConfigParams.firstAnimationDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 782888003:
                        if (strLJJJJ.equals("seconds_to_start_request_next_day_task")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedConfigParams.canRequestNextTaskInfoTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 967712804:
                        if (strLJJJJ.equals("enable_leave_room_refresh_task_info")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedConfigParams.enableRequestWhenLeaveRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return feedConfigParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeedConfigParams feedConfigParams) throws IOException {
        FeedConfigParams feedConfigParams2 = feedConfigParams;
        if (feedConfigParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("time_interval_for_request_next_task_info");
        c09dl.LJJJJ(Integer.valueOf(feedConfigParams2.refreshDelayRange));
        c09dl.LJIILLIIL("enable_leave_room_refresh_task_info");
        c09dl.LJJJJJL(feedConfigParams2.enableRequestWhenLeaveRoom);
        c09dl.LJIILLIIL("seconds_to_start_request_next_day_task");
        c09dl.LJJIZ(feedConfigParams2.canRequestNextTaskInfoTime);
        c09dl.LJIILLIIL("animation_delay_duration");
        c09dl.LJJIZ(feedConfigParams2.animationDelay);
        c09dl.LJIILLIIL("first_animation_delay_duration");
        c09dl.LJJIZ(feedConfigParams2.firstAnimationDelay);
        c09dl.LJII();
    }
}
