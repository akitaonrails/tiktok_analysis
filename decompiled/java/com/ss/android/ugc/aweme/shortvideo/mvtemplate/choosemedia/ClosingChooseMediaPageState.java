package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ClosingChooseMediaPageState implements C004I {
    public static final int $stable = 0;

    public static final class Closed extends ClosingChooseMediaPageState {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
    }

    public static final class Closing extends ClosingChooseMediaPageState {
        public static final int $stable = 0;
        public static final Closing INSTANCE = new Closing();
    }

    public static final class Ready extends ClosingChooseMediaPageState {
        public static final int $stable = 0;
        public static final Ready INSTANCE = new Ready();
    }
}
