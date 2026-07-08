package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public interface IDMPushInlineMsgManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final C01GW<IDMPushInlineMsgManager> inst$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(632));

        public final IDMPushInlineMsgManager getInst() {
            return inst$delegate.getValue();
        }
    }

    boolean checkUnifiedFreCtl();
}
