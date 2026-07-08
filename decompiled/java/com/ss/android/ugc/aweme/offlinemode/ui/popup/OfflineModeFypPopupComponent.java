package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.C0ON5;
import X.C1954807lC;
import X.C19EG;
import X.C419910GdJ;
import X.C624800Of0;
import X.C724240Sb0;
import X.EnumC624780Oey;
import X.EnumC624830Of3;
import androidx.fragment.app.Fragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeFypPopupComponent extends OfflineModePopupComponent {
    @Override // com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent
    /* JADX INFO: renamed from: do */
    public final void mo300do(EnumC624830Of3 enumC624830Of3) {
        int i;
        if (bo().getState().LLIZ != null && enumC624830Of3 != null && (i = C624800Of0.LIZIZ[enumC624830Of3.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        mo();
                        return;
                    }
                    throw new C1954807lC();
                }
                ho();
                return;
            }
            ko();
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent
    public final void fo(EnumC624780Oey enumC624780Oey) {
        if (enumC624780Oey != null) {
            switch (C624800Of0.LIZ[enumC624780Oey.ordinal()]) {
                case -1:
                case 6:
                case 7:
                case 8:
                    return;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    C0ON5 c0on5 = C0ON5.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_cloud_play_fill;
                    c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1h);
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    C0ON5.LIZ(c0on5, c19egLIZ, fragmentLJI, 2131838575, null, c419910GdJ, 2131838574, null, new AwS553S0100000_9((OfflineModePopupComponent) this, 1772), 64);
                    return;
                case 2:
                    C0ON5 c0on52 = C0ON5.LIZ;
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    c0on52.getClass();
                    C0ON5.LIZJ(c19egLIZ2, 2131838602, null);
                    return;
                case 3:
                    ko();
                    return;
                case 4:
                    ho();
                    return;
                case 5:
                    mo();
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                    lo();
                    return;
            }
        }
    }
}
