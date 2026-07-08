package com.tiktok.ttf.absettings.task;

import X.AbstractC19483511Kn;
import X.C0CCZ;
import X.C0CJ2;
import X.C0VZ0;
import X.C0X52;
import X.C11NJ;
import X.C11S5;
import X.C311520CJa;
import X.C311600CJi;
import X.C311660CJo;
import X.C311760CJy;
import X.EnumC311620CJk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1487280oo2;
import X.InterfaceC19483011Ki;
import X.InterfaceC781210Ukh;
import Y.AfS140S0200000_4;
import Y.AfS173S0100000_4;
import Y.AkS469S0100000_4;
import android.content.Context;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS287S0000000_4;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchABSettingsTask implements C0CCZ {
    public final C11NJ LL = new C11NJ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchABSettingsTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws JSONException {
        if (context != null) {
            C311520CJa c311520CJa = C311520CJa.LIZ;
            if (c311520CJa.LJIIIIZZ()) {
                long jNanoTime = System.nanoTime();
                boolean zLJ = C0CJ2.LJ();
                AbstractC19483511Kn<C0X52<k>> abstractC19483511KnLIZIZ = C311760CJy.LIZIZ.LIZIZ(context, "");
                C311600CJi c311600CJiLIZ = C311660CJo.LIZ(0, 0L, true, zLJ, AFwS287S0000000_4.get$arr$(22));
                if (c311600CJiLIZ != null) {
                    c311600CJiLIZ.LIZLLL((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                } else {
                    c311600CJiLIZ = null;
                }
                if (abstractC19483511KnLIZIZ == null) {
                    if (c311600CJiLIZ != null) {
                        c311600CJiLIZ.LJI(EnumC311620CJk.REQUEST_BUILD_FAILED);
                        c311600CJiLIZ.LIZJ();
                    }
                    c311520CJa.LIZJ();
                    return;
                }
                this.LL.LIZ(abstractC19483511KnLIZIZ.LJIJJ(C11S5.LIZ()).LJIILIIL(C11S5.LIZ()).LJIIL(new AkS469S0100000_4(c311600CJiLIZ, 3)).LJIIIZ(new InterfaceC19483011Ki() { // from class: X.0CK1
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        return ((C0CKP) obj).LIZIZ instanceof n;
                    }
                }).LJIIL(new InterfaceC1487280oo2() { // from class: X.0CK2
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return new C0CKO((n) ((C0CKP) obj).LIZIZ);
                    }
                }).LJIILJJIL(1L, new InterfaceC19483011Ki() { // from class: X.0CKE
                    @Override // X.InterfaceC19483011Ki
                    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
                        return false;
                    }
                }).LJFF(new InterfaceC781210Ukh() { // from class: X.0CKJ
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C311520CJa.LIZ.LIZJ();
                    }
                }).LJIIZILJ(new AfS140S0200000_4(c311600CJiLIZ, context, 5), new AfS173S0100000_4(c311600CJiLIZ, 14)));
            }
        }
    }
}
