package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes16.dex */
public @interface RustStateType {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final boolean isState(int i, @RustStateType int i2) {
            return (i & i2) == i2;
        }

        public final int toLinkMicSateType(int i) {
            if (isState(i, 1)) {
                return 2;
            }
            if (isState(i, 2)) {
                return 1;
            }
            if (isState(i, 4)) {
                return 4;
            }
            if (isState(i, 8)) {
                return 3;
            }
            if (isState(i, 16)) {
                return 5;
            }
            if (isState(i, 32)) {
                return 6;
            }
            if (isState(i, 64)) {
                return 7;
            }
            if (isState(i, 512)) {
                return 9;
            }
            return 0;
        }
    }
}
