package com.ss.android.ugc.aweme.ab;

import X.C0C46;
import X.C0C6R;
import X.C0C6T;
import X.C0CCZ;
import X.C0VZ0;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ABMockEventRepoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABMockEventRepoTask";
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
    public final int targetProcess() {
        return 1;
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
        final C0C6R c0c6rLIZ = C0C46.LIZ();
        final AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(11);
        try {
            new C0C6T() { // from class: X.0C6O
                @Override // X.C0C6T
                public final Object call() throws JSONException {
                    C0C6R c0c6r = c0c6rLIZ;
                    Function1 function1 = aFwS232S0000000_4;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("abmock_manager");
                    sbLIZ.append(c0c6r.LJIILIIL);
                    Keva repoSync = KevaImpl.getRepoSync(C2188811AlT.LIZIZ(sbLIZ), 0);
                    if (repoSync.count() == 0) {
                        return Unit.LIZ;
                    }
                    String string = repoSync.getString(c0c6r.LJ, null);
                    String string2 = repoSync.getString(c0c6r.LJIIIIZZ, null);
                    String string3 = repoSync.getString(c0c6r.LJIIIZ, null);
                    JSONObject jSONObject = new JSONObject();
                    String str = c0c6r.LIZJ;
                    jSONObject.put(str, repoSync.getInt(str, 0));
                    String str2 = c0c6r.LJFF;
                    jSONObject.put(str2, repoSync.getInt(str2, 0));
                    String str3 = c0c6r.LJI;
                    jSONObject.put(str3, repoSync.getInt(str3, 0));
                    if (string != null) {
                        jSONObject.put(c0c6r.LJ, new JSONArray(string));
                    }
                    if (string2 != null) {
                        jSONObject.put(c0c6r.LJIIIIZZ, new JSONObject(string2));
                    }
                    if (string3 != null) {
                        jSONObject.put(string3, new JSONObject(string3));
                    }
                    function1.invoke(jSONObject);
                    repoSync.clear();
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append((String) null);
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        C0C6R c0c6rLIZ2 = C0C46.LIZ();
        try {
            ScheduledExecutorService scheduledExecutorService = c0c6rLIZ2.LIZ;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.scheduleWithFixedDelay(new ARunnableS104S0100000_4(c0c6rLIZ2, 132), 0L, 3L, TimeUnit.MINUTES);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th2);
            sbLIZ2.append("--message: ");
            sbLIZ2.append("setScheduleWithFixedDelay");
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th2));
        }
    }
}
