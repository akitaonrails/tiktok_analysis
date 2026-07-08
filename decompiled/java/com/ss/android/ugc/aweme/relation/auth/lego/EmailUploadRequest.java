package com.ss.android.ugc.aweme.relation.auth.lego;

import X.C0CO3;
import X.C0PEM;
import X.C0TNP;
import X.C1056120dac;
import X.C1071540dzU;
import X.C1076010e6h;
import X.C2296808zG;
import X.C23250099c;
import X.C2452109jD;
import X.C338980DQq;
import X.C800010VZv;
import X.EnumC1070340dxY;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final class EmailUploadRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "EmailUploadRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.IDLE;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C2452109jD.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C2452109jD.LIZLLL.getLong("last_email_upload_time", 0L);
        if ((j == 0 || jCurrentTimeMillis - j >= TimeUnit.DAYS.toMillis(90L)) && C1076010e6h.LIZJ.LJIIJ().LJ()) {
            C0TNP.LIZ.getClass();
            if (!C0TNP.LIZ() || !C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LIZIZ()) {
                C338980DQq.LIZ.getClass();
                if (!C338980DQq.LIZIZ() || !C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.CONTACT).LIZIZ()) {
                    return;
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1056120dac(null), 3);
        }
    }
}
