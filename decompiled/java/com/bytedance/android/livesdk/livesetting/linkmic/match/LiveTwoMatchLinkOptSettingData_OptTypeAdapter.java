package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveTwoMatchLinkOptSettingData_OptTypeAdapter extends TypeAdapter<LiveTwoMatchLinkOptSettingData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTwoMatchLinkOptSettingData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData = new LiveTwoMatchLinkOptSettingData(2000, 6000, 2000, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, 3, 3, LSPassThroughRecordSizeConfig.DEFAULT);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1954395717:
                        if (strLJJJJ.equals("permission_retry_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.permission_retry_duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1523311032:
                        if (strLJJJJ.equals("permission_retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.permission_retry_count = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 26042609:
                        if (strLJJJJ.equals("invitee_open_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.invitee_open_delay = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1014360984:
                        if (strLJJJJ.equals("inviter_battle_info_retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.inviter_battle_info_retry_count = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1129863832:
                        if (strLJJJJ.equals("invitee_battle_info_retry_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.invitee_battle_info_retry_duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1331092395:
                        if (strLJJJJ.equals("cancel_invite_info_retry_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.cancel_invite_info_retry_duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1704117956:
                        if (strLJJJJ.equals("inviter_open_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.inviter_open_delay = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2113256043:
                        if (strLJJJJ.equals("inviter_battle_info_retry_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTwoMatchLinkOptSettingData.inviter_battle_info_retry_duration = c09cu.LJJIZ();
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
        return liveTwoMatchLinkOptSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData) {
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData2 = liveTwoMatchLinkOptSettingData;
        if (liveTwoMatchLinkOptSettingData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("invitee_open_delay");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.invitee_open_delay));
        c09dl.LJIILLIIL("inviter_open_delay");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.inviter_open_delay));
        c09dl.LJIILLIIL("inviter_battle_info_retry_duration");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.inviter_battle_info_retry_duration));
        c09dl.LJIILLIIL("invitee_battle_info_retry_duration");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.invitee_battle_info_retry_duration));
        c09dl.LJIILLIIL("cancel_invite_info_retry_duration");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.cancel_invite_info_retry_duration));
        c09dl.LJIILLIIL("inviter_battle_info_retry_count");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.inviter_battle_info_retry_count));
        c09dl.LJIILLIIL("permission_retry_count");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.permission_retry_count));
        c09dl.LJIILLIIL("permission_retry_duration");
        c09dl.LJJJJ(Integer.valueOf(liveTwoMatchLinkOptSettingData2.permission_retry_duration));
        c09dl.LJII();
    }
}
