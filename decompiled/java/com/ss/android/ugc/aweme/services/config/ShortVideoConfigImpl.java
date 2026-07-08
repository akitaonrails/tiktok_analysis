package com.ss.android.ugc.aweme.services.config;

import X.C13BV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ShortVideoConfigImpl extends ShortVideoConfigBaseImpl {
    public static ShortVideoConfigImpl sInstance;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {
        public final ShortVideoConfigImpl getInstance() {
            if (ShortVideoConfigImpl.sInstance == null) {
                synchronized (ShortVideoConfigBaseImpl.class) {
                    try {
                        if (ShortVideoConfigImpl.sInstance == null) {
                            ShortVideoConfigImpl.sInstance = new ShortVideoConfigImpl();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return ShortVideoConfigImpl.sInstance;
        }
    }

    public static final ShortVideoConfigImpl getInstance() {
        return Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public String cutsameSdkVersion() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public List<String> getBOEBypassHostList() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public List<String> getBOEBypassPathList() {
        return C13BV.INSTANCE;
    }
}
