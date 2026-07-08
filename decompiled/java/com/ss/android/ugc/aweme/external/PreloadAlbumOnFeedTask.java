package com.ss.android.ugc.aweme.external;

import X.C0CCZ;
import X.C0CHQ;
import X.C0MNJ;
import X.C0VZ0;
import X.C1361400lX0;
import X.C201955140j;
import X.C21146717pB;
import X.C2188811AlT;
import X.C297760Blm;
import X.C297780Blo;
import X.C300010BpP;
import X.C300110BpZ;
import X.C485840J3m;
import X.C523380Kfo;
import X.C533790Kwb;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class PreloadAlbumOnFeedTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadAlbumOnFeedTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int i;
        if (C300010BpP.LIZ() && C300110BpZ.LIZ() && C297760Blm.LIZ()) {
            boolean zLIZ = C297780Blo.LIZ();
            C485840J3m c485840J3m = new C485840J3m(new C1361400lX0(C0CHQ.LIZ, R.style.xm));
            C523380Kfo.LIZ(c485840J3m, zLIZ);
            C0MNJ.LIZ();
            C0MNJ.LIZIZ(zLIZ);
            if (zLIZ) {
                i = R.layout.csv;
            } else {
                i = R.layout.csu;
            }
            ArrayList arrayList = new ArrayList(16);
            int i2 = 0;
            do {
                arrayList.add(Integer.valueOf(i));
                i2++;
            } while (i2 < 16);
            C21146717pB.LJFF(c485840J3m, "album", arrayList);
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("run lazyLayout=");
            sbLIZ.append(zLIZ);
            C201955140j.LIZLLL(c533790Kwb, "PreloadAlbumOnFeedTask", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
