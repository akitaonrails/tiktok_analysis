package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CampaignSchemaData_OptTypeAdapter extends TypeAdapter<CampaignSchemaData> {
    @Override // com.google.gson.TypeAdapter
    public final CampaignSchemaData read(C09CU c09cu) {
        CampaignSchemaData campaignSchemaData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            campaignSchemaData = new CampaignSchemaData("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "full")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        campaignSchemaData.full = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "popup")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        campaignSchemaData.popup = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return campaignSchemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CampaignSchemaData campaignSchemaData) {
        CampaignSchemaData campaignSchemaData2 = campaignSchemaData;
        if (campaignSchemaData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("full");
        c09dl.LJJJJJ(campaignSchemaData2.full);
        c09dl.LJIILLIIL("popup");
        c09dl.LJJJJJ(campaignSchemaData2.popup);
        c09dl.LJII();
    }
}
