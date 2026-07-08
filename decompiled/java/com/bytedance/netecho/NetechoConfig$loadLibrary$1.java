package com.bytedance.netecho;

import X.C13LE;
import X.C2217441BqY;
import X.InterfaceC329330Cvb;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class NetechoConfig$loadLibrary$1 extends C2217441BqY implements Function1<String, Unit> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    public NetechoConfig$loadLibrary$1() {
        super(1);
    }

    @Override // X.AbstractC2217471Bqb, X.InterfaceC2217491Bqd
    public final String getName() {
        return "loadLibrary";
    }

    @Override // X.AbstractC2217471Bqb
    public final InterfaceC329330Cvb getOwner() {
        return C13LE.LIZ(System.class);
    }

    @Override // X.AbstractC2217471Bqb
    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    public static void INVOKESTATIC_com_bytedance_netecho_NetechoConfig$loadLibrary$1_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.LIZ;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        INVOKESTATIC_com_bytedance_netecho_NetechoConfig$loadLibrary$1_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
    }
}
