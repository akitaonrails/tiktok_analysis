package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostInviteListBtnStatusMonitorConfigs_OptTypeAdapter extends TypeAdapter<CoHostInviteListBtnStatusMonitorConfigs> {
    public final Gson LIZ;

    public CoHostInviteListBtnStatusMonitorConfigs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostInviteListBtnStatusMonitorConfigs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoHostInviteListBtnStatusMonitorConfigs coHostInviteListBtnStatusMonitorConfigs = new CoHostInviteListBtnStatusMonitorConfigs();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1909310018) {
                    if (iHashCode != -1484084206) {
                        if (iHashCode == 926849868 && strLJJJJ.equals("hit_statuses")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostInviteListBtnStatusMonitorConfigs.hitStatuses = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("invitee_lists")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            coHostInviteListBtnStatusMonitorConfigs.inviteeLists = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("transitions")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        coHostInviteListBtnStatusMonitorConfigs.transitions = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<Integer, ? extends List<? extends Integer>>>() { // from class: X.00VX
                        }).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return coHostInviteListBtnStatusMonitorConfigs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostInviteListBtnStatusMonitorConfigs coHostInviteListBtnStatusMonitorConfigs) {
        CoHostInviteListBtnStatusMonitorConfigs coHostInviteListBtnStatusMonitorConfigs2 = coHostInviteListBtnStatusMonitorConfigs;
        if (coHostInviteListBtnStatusMonitorConfigs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("hit_statuses");
        Gson gson = this.LIZ;
        List<Integer> list = coHostInviteListBtnStatusMonitorConfigs2.hitStatuses;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("transitions");
        this.LIZ.LJIIIZ(new TypeToken<Map<Integer, ? extends List<? extends Integer>>>() { // from class: X.00VY
        }).write(c09dl, coHostInviteListBtnStatusMonitorConfigs2.transitions);
        c09dl.LJIILLIIL("invitee_lists");
        C473040Igo.LIZLLL(this.LIZ, c09dl, coHostInviteListBtnStatusMonitorConfigs2.inviteeLists, cls);
        c09dl.LJII();
    }
}
