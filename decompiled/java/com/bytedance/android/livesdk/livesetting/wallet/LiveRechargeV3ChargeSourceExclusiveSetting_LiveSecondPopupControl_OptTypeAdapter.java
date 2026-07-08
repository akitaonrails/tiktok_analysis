package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeV3ChargeSourceExclusiveSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRechargeV3ChargeSourceExclusiveSetting_LiveSecondPopupControl_OptTypeAdapter extends TypeAdapter<LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl> {
    public final Gson LIZ;

    public LiveRechargeV3ChargeSourceExclusiveSetting_LiveSecondPopupControl_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl liveSecondPopupControl = new LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "skip_charge_sources")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveSecondPopupControl.skipChargeSources = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveSecondPopupControl;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl liveSecondPopupControl) {
        LiveRechargeV3ChargeSourceExclusiveSetting.LiveSecondPopupControl liveSecondPopupControl2 = liveSecondPopupControl;
        if (liveSecondPopupControl2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("skip_charge_sources");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveSecondPopupControl2.skipChargeSources, Integer.TYPE);
        c09dl.LJII();
    }
}
