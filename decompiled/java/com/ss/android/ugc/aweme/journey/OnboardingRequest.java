package com.ss.android.ugc.aweme.journey;

import X.C01GW;
import X.C0CO3;
import X.C10R5;
import X.C10RS;
import X.C10TT;
import X.C19250210Su;
import X.C452501pT;
import X.C800010VZv;
import X.EnumC452301pR;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class OnboardingRequest implements InterfaceC800130Va7 {
    public static final C01GW<OnboardingRequest> LLILZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C10TT());
    public final C10R5 LL;
    public boolean LLILLJJLI;
    public C19250210Su LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OnboardingRequest";
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

    public OnboardingRequest() {
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        this.LL = C10RS.LIZ();
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (this.LL.LIZJ() != 0 && !this.LL.LIZ && !this.LLILLJJLI) {
            this.LLILLJJLI = true;
            this.LLILLL = new C19250210Su();
        }
    }
}
