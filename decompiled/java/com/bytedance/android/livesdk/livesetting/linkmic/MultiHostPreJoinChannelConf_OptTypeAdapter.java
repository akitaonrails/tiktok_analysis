package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiHostPreJoinChannelConf_OptTypeAdapter extends TypeAdapter<MultiHostPreJoinChannelConf> {
    public final Gson LIZ;

    public MultiHostPreJoinChannelConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiHostPreJoinChannelConf read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf = new MultiHostPreJoinChannelConf(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -576019683) {
                    if (iHashCode != 1824029442) {
                        if (iHashCode == 2100731595 && strLJJJJ.equals("send_apply_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiHostPreJoinChannelConf.sendApplyEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("send_invite_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiHostPreJoinChannelConf.sendInviteEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("receive_invite_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiHostPreJoinChannelConf.receiveInviteEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiHostPreJoinChannelConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiHostPreJoinChannelConf multiHostPreJoinChannelConf) throws IOException {
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf2 = multiHostPreJoinChannelConf;
        if (multiHostPreJoinChannelConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("send_invite_enable");
        c09dl.LJJJJJL(multiHostPreJoinChannelConf2.sendInviteEnable);
        c09dl.LJIILLIIL("receive_invite_enable");
        c09dl.LJJJJJL(multiHostPreJoinChannelConf2.receiveInviteEnable);
        c09dl.LJIILLIIL("send_apply_enable");
        c09dl.LJJJJJL(multiHostPreJoinChannelConf2.sendApplyEnable);
        c09dl.LJII();
    }
}
