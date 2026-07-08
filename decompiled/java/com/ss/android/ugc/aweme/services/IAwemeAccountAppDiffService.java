package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C10WS;
import X.C452501pT;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public interface IAwemeAccountAppDiffService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final C01GW<IAwemeAccountAppDiffService> singleton$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(359));

        private final IAwemeAccountAppDiffService getSingleton() {
            return singleton$delegate.getValue();
        }

        public final IAwemeAccountAppDiffService get() {
            return getSingleton();
        }
    }

    boolean forceHideLoginViewInAgeGate();

    C10WS getAppDiffAgeGateFragment(boolean z, Function0<? extends C10WS> function0);

    boolean isQuitApp(String str);

    boolean shouldHandleUserLogicDeleteEvent();

    public static final class DowngradeInstance implements IAwemeAccountAppDiffService {
        @Override // com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService
        public boolean forceHideLoginViewInAgeGate() {
            return DefaultImpls.forceHideLoginViewInAgeGate(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService
        public boolean shouldHandleUserLogicDeleteEvent() {
            return DefaultImpls.shouldHandleUserLogicDeleteEvent(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService
        public boolean isQuitApp(String str) {
            return DefaultImpls.isQuitApp(this, str);
        }

        @Override // com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService
        public C10WS getAppDiffAgeGateFragment(boolean z, Function0<? extends C10WS> function0) {
            return DefaultImpls.getAppDiffAgeGateFragment(this, z, function0);
        }
    }

    public static final class DefaultImpls {
        public static boolean forceHideLoginViewInAgeGate(IAwemeAccountAppDiffService iAwemeAccountAppDiffService) {
            return false;
        }

        public static boolean isQuitApp(IAwemeAccountAppDiffService iAwemeAccountAppDiffService, String str) {
            return false;
        }

        public static boolean shouldHandleUserLogicDeleteEvent(IAwemeAccountAppDiffService iAwemeAccountAppDiffService) {
            return true;
        }

        public static C10WS getAppDiffAgeGateFragment(IAwemeAccountAppDiffService iAwemeAccountAppDiffService, boolean z, Function0<? extends C10WS> function0) {
            return function0.invoke();
        }
    }
}
