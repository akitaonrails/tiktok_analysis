package com.ss.android.ugc.aweme.notification.lego;

import X.C0CO3;
import X.C1720106oR;
import X.C1789906zh;
import X.C2187451AjH;
import X.C2252408s6;
import X.C800010VZv;
import X.C848040XOo;
import X.C848230XPh;
import X.EnumC799980VZs;
import X.InterfaceC427710Gpt;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ReportColdStartRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReportColdStartRequest";
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

    public final void LIZ() {
        C848230XPh c848230XPh = C848230XPh.LL;
        String strLIZLLL = C848230XPh.LIZLLL();
        if (TextUtils.isEmpty(strLIZLLL) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strLIZLLL)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ReportColdStartRequest", "report filter. User info is empty");
        } else {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("ReportColdStartRequest", "report");
            C2252408s6.LIZ(new AwS112S1000000_28(strLIZLLL, 2));
        }
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return ((Boolean) C1789906zh.LIZ.getValue()).booleanValue() ? C0CO3.BOOT_FINISH : C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C848040XOo c848040XOo = C848040XOo.LIZ;
        InterfaceC427710Gpt interfaceC427710Gpt = new InterfaceC427710Gpt() { // from class: X.10fy
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
