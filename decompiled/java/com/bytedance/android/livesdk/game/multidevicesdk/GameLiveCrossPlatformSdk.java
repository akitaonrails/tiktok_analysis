package com.bytedance.android.livesdk.game.multidevicesdk;

import X.C0TEB;
import X.C0TED;
import X.C0TEX;
import Y.ARunnableS18S0201000_12;
import Y.ARunnableS3S2000000_12;
import android.os.SystemClock;
import com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class GameLiveCrossPlatformSdk {
    public static final GameLiveCrossPlatformSdk LIZIZ = new GameLiveCrossPlatformSdk();
    public static final HashMap<Integer, List<C0TEX>> LIZJ = new HashMap<>();
    public static final ConcurrentHashMap<Integer, C0TED> LIZLLL = new ConcurrentHashMap<>();
    public static final List<C0TEB> LJ = new CopyOnWriteArrayList();
    public boolean LIZ;

    public interface IMessageCallback {
        String onGetMessage(int i);

        String onGetMessage(int i, String str);

        void onLog(String str, int i, String str2, String str3, String str4, int i2);

        void onMetricLog(String str, String str2);

        void onSendMessage(int i);

        void onSendMessage(int i, float f);

        void onSendMessage(int i, int i2);

        void onSendMessage(int i, String str);
    }

    private final native void initSDK(IMessageCallback iMessageCallback);

    private final native void releaseSDK();

    private final native String test();

    public GameLiveCrossPlatformSdk() {
        IMessageCallback iMessageCallback = new IMessageCallback() { // from class: X.0TEW
            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final String onGetMessage(int i) {
                String strLIZIZ;
                C0TED c0ted = GameLiveCrossPlatformSdk.LIZLLL.get(Integer.valueOf(i));
                if (c0ted == null || (strLIZIZ = c0ted.LIZIZ(i, null)) == null) {
                    return "";
                }
                return strLIZIZ;
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onSendMessage(int i) {
                LIZ(i, null);
            }

            public static void LIZ(int i, Object obj) {
                List<C0TEX> list = GameLiveCrossPlatformSdk.LIZJ.get(Integer.valueOf(i));
                if (list == null) {
                    return;
                }
                Iterator<C0TEX> it2 = list.iterator();
                while (it2.hasNext()) {
                    C823050WQl.LIZLLL().execute(new ARunnableS18S0201000_12(i, it2.next(), obj, 0));
                }
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final String onGetMessage(int i, String str) {
                String strLIZIZ;
                C0TED c0ted = GameLiveCrossPlatformSdk.LIZLLL.get(Integer.valueOf(i));
                if (c0ted == null || (strLIZIZ = c0ted.LIZIZ(i, str)) == null) {
                    return "";
                }
                return strLIZIZ;
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onMetricLog(String str, String str2) {
                C823050WQl.LIZLLL().execute(new ARunnableS3S2000000_12(str, str2, 0));
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onSendMessage(int i, float f) {
                LIZ(i, Float.valueOf(f));
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onSendMessage(int i, int i2) {
                LIZ(i, Integer.valueOf(i2));
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onSendMessage(int i, String str) {
                LIZ(i, str);
            }

            @Override // com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk.IMessageCallback
            public final void onLog(String str, int i, String str2, String str3, String str4, int i2) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C20441214yg.LIZIZ(str, str2);
                            return;
                        } else {
                            C20441214yg.LJ(str, str2);
                            return;
                        }
                    }
                    C20441214yg.LJIIL(str, str2);
                    return;
                }
                C20441214yg.LJIIIZ(str, str2);
            }
        };
        LoadSoLancet.LIZJ("vegasdk");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("vegasdk");
        LoadSoLancet.LJ(jUptimeMillis, "vegasdk");
        LoadSoLancet.LIZLLL(jUptimeMillis, "vegasdk");
        LoadSoLancet.LIZIZ("vegasdk");
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        initSDK(iMessageCallback);
    }
}
