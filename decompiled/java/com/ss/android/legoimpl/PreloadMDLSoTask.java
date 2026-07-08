package com.ss.android.legoimpl;

import X.C08TK;
import X.C0CCZ;
import X.C0CD2;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class PreloadMDLSoTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadMDLSoTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (((Boolean) C0CD2.LJJZ.getValue()).booleanValue()) {
                Librarian.LJFF("libconfigcenter");
            }
            int iIntValue = ((Number) C0CD2.LJJIIJZLJL.getValue()).intValue();
            if (iIntValue != -1) {
                Map<Integer, String[]> map = C08TK.LIZ;
                String[] strArr = C08TK.LIZ.get(Integer.valueOf(iIntValue));
                if (strArr == null) {
                    strArr = new String[0];
                }
                for (String str : strArr) {
                    Librarian.LJFF(str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
