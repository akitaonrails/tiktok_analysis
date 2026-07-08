package com.ss.android.ugc.aweme.notification.lego;

import X.C01GW;
import X.C076D;
import X.C0CO3;
import X.C1789906zh;
import X.C800010VZv;
import X.C848040XOo;
import X.C848230XPh;
import X.EnumC799980VZs;
import X.InterfaceC427710Gpt;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeReportBootRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NoticeReportBootRequest";
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
        return ((Boolean) C1789906zh.LIZ.getValue()).booleanValue() ? C0CO3.BOOT_FINISH : C0CO3.NORMAL;
    }

    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(202515);
        C848230XPh c848230XPh = C848230XPh.LL;
        String strLIZLLL = C848230XPh.LIZLLL();
        if (TextUtils.isEmpty(strLIZLLL) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strLIZLLL)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Keva repo = Keva.getRepo("cold_boot_repo");
        long j = repo != null ? repo.getLong(strLIZLLL, 0L) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = C076D.LIZ;
        if (((Number) c01gw.getValue()).intValue() <= 0 || jCurrentTimeMillis - j <= ((long) ((Number) c01gw.getValue()).intValue()) * 3600000) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            Keva.getRepo("cold_boot_repo").storeLong(strLIZLLL, jCurrentTimeMillis);
            MusNotificationApiManager.LJI();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C848040XOo c848040XOo = C848040XOo.LIZ;
        InterfaceC427710Gpt interfaceC427710Gpt = new InterfaceC427710Gpt() { // from class: X.10fx
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                this.LL.LIZ();
            }
        };
        c848040XOo.getClass();
        C848040XOo.LIZ(interfaceC427710Gpt);
        LIZ();
    }
}
