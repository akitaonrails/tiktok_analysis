package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchInviteMockConfig_OptTypeAdapter extends TypeAdapter<LiveMatchInviteMockConfig> {
    public final Gson LIZ;

    public LiveMatchInviteMockConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchInviteMockConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchInviteMockConfig liveMatchInviteMockConfig = new LiveMatchInviteMockConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 1488405583) {
                    if (iHashCode != 1886268605) {
                        if (iHashCode == 2057204260 && strLJJJJ.equals("vm_cleared")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchInviteMockConfig.vmCleared = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("duplicate_invite")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMatchInviteMockConfig.duplicateInvite = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("orphan_battle")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchInviteMockConfig.orphanBattle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchInviteMockConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchInviteMockConfig liveMatchInviteMockConfig) throws IOException {
        LiveMatchInviteMockConfig liveMatchInviteMockConfig2 = liveMatchInviteMockConfig;
        if (liveMatchInviteMockConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("orphan_battle");
        c09dl.LJJJJJL(liveMatchInviteMockConfig2.orphanBattle);
        c09dl.LJIILLIIL("vm_cleared");
        c09dl.LJJJJJL(liveMatchInviteMockConfig2.vmCleared);
        c09dl.LJIILLIIL("duplicate_invite");
        c09dl.LJJJJJL(liveMatchInviteMockConfig2.duplicateInvite);
        c09dl.LJII();
    }
}
