package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTooltip_OptTypeAdapter extends TypeAdapter<LiveTooltip> {
    @Override // com.google.gson.TypeAdapter
    public final LiveTooltip read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTooltip liveTooltip = new LiveTooltip();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -581842147) {
                    if (iHashCode != -57570566) {
                        if (iHashCode == 1384360852 && strLJJJJ.equals("tooltip_activity_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltip.tooltipActivityCheck = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("share_toolbar_behavior_delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveTooltip.shareToolbarBehaviorDelay = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("tooltip_alog_control")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveTooltip.tooltipAlogControl = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveTooltip;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTooltip liveTooltip) {
        LiveTooltip liveTooltip2 = liveTooltip;
        if (liveTooltip2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("tooltip_alog_control");
        c09dl.LJJJJ(Integer.valueOf(liveTooltip2.tooltipAlogControl));
        c09dl.LJIILLIIL("tooltip_activity_check");
        c09dl.LJJJJ(Integer.valueOf(liveTooltip2.tooltipActivityCheck));
        c09dl.LJIILLIIL("share_toolbar_behavior_delay");
        c09dl.LJJJJ(Integer.valueOf(liveTooltip2.shareToolbarBehaviorDelay));
        c09dl.LJII();
    }
}
