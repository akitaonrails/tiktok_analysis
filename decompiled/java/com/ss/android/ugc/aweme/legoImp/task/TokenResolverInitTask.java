package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CG6;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1BWL;
import X.C2162308dZ;
import X.C2215308m7;
import X.C285090BFj;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS93S0000000_16;
import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20234614Fk
public class TokenResolverInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TokenResolverInitTask";
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
        return 16777215;
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
    public final void run(Context context) {
        Application applicationLIZ = C1BWL.LIZ();
        C2162308dZ.LJI(C1BWL.LIZ());
        C2215308m7.LIZ(applicationLIZ);
        if (!((Boolean) C285090BFj.LJJJJLL.getValue()).booleanValue()) {
            C1492110ovp.LIZIZ("preloadGetNormalSplashFilePath", new Function0<Unit>() { // from class: X.0d31
                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    C823050WQl.LIZLLL().execute(new ARunnableS93S0000000_16(4));
                    return null;
                }
            }, ((Boolean) C0CG6.LIZIZ.getValue()).booleanValue());
        }
    }
}
