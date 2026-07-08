package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLinkMicMatchConfigSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLinkMicMatchConfigSettings_MultiGuestRecommendRoomsConfigBean_OptTypeAdapter extends TypeAdapter<MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean multiGuestRecommendRoomsConfigBean = new MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean(0L, 5L, 300L, 3, 3, 10L, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1857374268:
                        if (strLJJJJ.equals("audience_wait_time_auto_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audienceWaitTimeAutoSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1643261850:
                        if (strLJJJJ.equals("audience_click_avatar_show_dialog_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audienceClickAvatarShowDialogCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1216310016:
                        if (strLJJJJ.equals("anchor_report_time_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.anchorReportTimeSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1075048585:
                        if (strLJJJJ.equals("audience_wait_time_click_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audienceWaitTimeClickSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -962681370:
                        if (strLJJJJ.equals("audience_panel_dismiss_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audiencePanelDismissSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 455374200:
                        if (strLJJJJ.equals("audience_click_request_show_dialog_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audienceClickRequestShowDialogCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1482062224:
                        if (strLJJJJ.equals("audience_panel_show_frequency")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestRecommendRoomsConfigBean.audiencePanelShowFrequency = c09cu.LJJIZ();
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
        return multiGuestRecommendRoomsConfigBean;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean multiGuestRecommendRoomsConfigBean) throws IOException {
        MultiGuestLinkMicMatchConfigSettings.MultiGuestRecommendRoomsConfigBean multiGuestRecommendRoomsConfigBean2 = multiGuestRecommendRoomsConfigBean;
        if (multiGuestRecommendRoomsConfigBean2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("audience_wait_time_click_sec");
        c09dl.LJJIZ(multiGuestRecommendRoomsConfigBean2.audienceWaitTimeClickSec);
        c09dl.LJIILLIIL("audience_wait_time_auto_sec");
        c09dl.LJJIZ(multiGuestRecommendRoomsConfigBean2.audienceWaitTimeAutoSec);
        c09dl.LJIILLIIL("anchor_report_time_sec");
        c09dl.LJJIZ(multiGuestRecommendRoomsConfigBean2.anchorReportTimeSec);
        c09dl.LJIILLIIL("audience_click_avatar_show_dialog_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestRecommendRoomsConfigBean2.audienceClickAvatarShowDialogCount));
        c09dl.LJIILLIIL("audience_click_request_show_dialog_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestRecommendRoomsConfigBean2.audienceClickRequestShowDialogCount));
        c09dl.LJIILLIIL("audience_panel_dismiss_sec");
        c09dl.LJJIZ(multiGuestRecommendRoomsConfigBean2.audiencePanelDismissSec);
        c09dl.LJIILLIIL("audience_panel_show_frequency");
        c09dl.LJJJJ(Integer.valueOf(multiGuestRecommendRoomsConfigBean2.audiencePanelShowFrequency));
        c09dl.LJII();
    }
}
