package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C2344809Gs;
import X.C810650Vr5;
import X.C824390WVp;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class CheckNoticeTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CheckNoticeTask";
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
        String str;
        C2344809Gs.LJ("CheckNoticeTask");
        C844470XAv.LIZ.getClass();
        Boolean boolValueOf = Boolean.valueOf(C824390WVp.LIZJ(C844470XAv.LIZ()));
        Context contextLIZ = C844470XAv.LIZ();
        if (boolValueOf.booleanValue()) {
            str = "allow_on";
        } else {
            str = "allow_off";
        }
        C810650Vr5.LIZ(contextLIZ, "notice", str);
    }
}
