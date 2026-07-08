package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter extends TypeAdapter<LiveCoHostFriendNoticeOptMock.MockParams> {
    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostFriendNoticeOptMock.MockParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCoHostFriendNoticeOptMock.MockParams mockParams = new LiveCoHostFriendNoticeOptMock.MockParams(0, 60, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1395851432) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1952845904 && strLJJJJ.equals("next_execution_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mockParams.nextExecutionDelay = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            mockParams.enable = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("should_request_for_the_notice")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        mockParams.shouldRequestForTheNotice = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return mockParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoHostFriendNoticeOptMock.MockParams mockParams) {
        LiveCoHostFriendNoticeOptMock.MockParams mockParams2 = mockParams;
        if (mockParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.enable));
        c09dl.LJIILLIIL("next_execution_delay");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.nextExecutionDelay));
        c09dl.LJIILLIIL("should_request_for_the_notice");
        c09dl.LJJJJ(Integer.valueOf(mockParams2.shouldRequestForTheNotice));
        c09dl.LJII();
    }
}
