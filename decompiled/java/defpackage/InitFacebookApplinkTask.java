package defpackage;

import X.C0CCZ;
import X.C0VZ0;
import X.C0W7K;
import X.C1602860roS;
import X.C1BJO;
import X.C20144713rx;
import X.C786410Ut5;
import X.C820350WGb;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS18S1200000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class InitFacebookApplinkTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFacebookApplinkTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context == null) {
            return;
        }
        C0W7K.LIZIZ("597615686992125", "applicationId");
        FacebookSdk.LIZJ = "597615686992125";
        if (!FacebookSdk.LJII()) {
            try {
                C844470XAv.LIZ.getClass();
                FacebookSdk.LJIIJ(C844470XAv.LIZ());
                C820350WGb.LIZ(new String[]{"LDU"}, new C20144713rx(939524609));
            } catch (C1BJO e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0W7K.LIZLLL(context, "context");
        String strLIZLLL = FacebookSdk.LIZLLL();
        FacebookSdk.LJ().execute(new ARunnableS18S1200000_13(C786410Ut5.N3(context), strLIZLLL, 16));
    }
}
