package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SlotBizTypeDisallow_OptTypeAdapter extends TypeAdapter<SlotBizTypeDisallow> {
    public final Gson LIZ;

    public SlotBizTypeDisallow_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlotBizTypeDisallow read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SlotBizTypeDisallow slotBizTypeDisallow = new SlotBizTypeDisallow(false, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -429835555) {
                    if (iHashCode != 260817523) {
                        if (iHashCode == 1444699111 && strLJJJJ.equals("icon_slot_disallow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slotBizTypeDisallow.setIconSlotDisallowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("frame_slot_disallow_list")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            slotBizTypeDisallow.setFrameSlotDisallowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("disallow_all")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        slotBizTypeDisallow.setDisallowAll(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return slotBizTypeDisallow;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SlotBizTypeDisallow slotBizTypeDisallow) throws IOException {
        SlotBizTypeDisallow slotBizTypeDisallow2 = slotBizTypeDisallow;
        if (slotBizTypeDisallow2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disallow_all");
        c09dl.LJJJJJL(slotBizTypeDisallow2.getDisallowAll());
        c09dl.LJIILLIIL("icon_slot_disallow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, slotBizTypeDisallow2.getIconSlotDisallowList(), String.class);
        c09dl.LJIILLIIL("frame_slot_disallow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, slotBizTypeDisallow2.getFrameSlotDisallowList(), String.class);
        c09dl.LJII();
    }
}
