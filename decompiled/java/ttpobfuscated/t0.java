package ttpobfuscated;

import ttp.orbu.sdk.TTPOrbuUtil;

/* JADX INFO: loaded from: classes24.dex */
public abstract class t0 {
    public final TTPOrbuUtil.TTPCleanupResult a;

    public static final class a extends t0 {
        public static final a b = new a();

        public a() {
            super(TTPOrbuUtil.TTPCleanupResult.INVALID_SEQUENCE);
        }
    }

    public static final class b extends t0 {
        public static final b b = new b();

        public b() {
            super(TTPOrbuUtil.TTPCleanupResult.SUCCESS);
        }
    }

    public final TTPOrbuUtil.TTPCleanupResult a() {
        return this.a;
    }

    public t0(TTPOrbuUtil.TTPCleanupResult tTPCleanupResult) {
        this.a = tTPCleanupResult;
    }
}
