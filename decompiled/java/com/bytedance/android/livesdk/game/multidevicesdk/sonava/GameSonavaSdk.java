package com.bytedance.android.livesdk.game.multidevicesdk.sonava;

import X.C204529151j;
import X.InterfaceC204530151k;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes32.dex */
public final class GameSonavaSdk {
    public InterfaceC204530151k listener;
    public final String path;

    private final native void initPCMFormat(int i, int i2);

    private final native int nativeInit(String str);

    private final native void onData(Buffer buffer, int i, double d);

    private final native void release();

    public final int initSdk() {
        return nativeInit(this.path);
    }

    public final void releaseSdk() {
        release();
        this.listener = null;
    }

    public static void INVOKESTATIC_com_bytedance_android_livesdk_game_multidevicesdk_sonava_GameSonavaSdk_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public GameSonavaSdk(String str, InterfaceC204530151k interfaceC204530151k) {
        this.path = str;
        this.listener = interfaceC204530151k;
        INVOKESTATIC_com_bytedance_android_livesdk_game_multidevicesdk_sonava_GameSonavaSdk_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vegasdk");
    }

    public final void initFormat(int i, int i2) {
        initPCMFormat(i, i2);
    }

    public final void onPCMData(Buffer buffer, int i, double d) {
        onData(buffer, i, d);
    }

    public final void onCallback(String str, String str2, double d, double d2, int i, int i2) {
        C204529151j c204529151j = new C204529151j(str);
        InterfaceC204530151k interfaceC204530151k = this.listener;
        if (interfaceC204530151k != null) {
            interfaceC204530151k.LIZ(c204529151j);
        }
    }
}
