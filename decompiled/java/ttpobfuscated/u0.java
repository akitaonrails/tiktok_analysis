package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.C1954807lC;
import X.C2197108jB;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import ttp.orbu.sdk.app.domain.entity.cleanup.CleanUpSystemErrorType;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttpobfuscated.q0;
import ttpobfuscated.s0;
import ttpobfuscated.t0;

/* JADX INFO: loaded from: classes24.dex */
public final class u0 implements l<p0, t0, s0> {
    public final q0 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CleanUpSystemErrorType.values().length];
            try {
                iArr[CleanUpSystemErrorType.DeleteDatabase.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[CleanUpSystemErrorType.ClearConfigPreferences.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[CleanUpSystemErrorType.ClearCrashLogPreferences.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[CleanUpSystemErrorType.CancelActiveCoroutines.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[CleanUpSystemErrorType.ResetGeneralConfig.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[CleanUpSystemErrorType.ResetOrbucodeConfig.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[CleanUpSystemErrorType.ClearRuntime.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[CleanUpSystemErrorType.CleanOldComponentInstance.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[CleanUpSystemErrorType.CleanNewComponentInstance.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr[CleanUpSystemErrorType.Unknown.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            a = iArr;
        }
    }

    public final q0 a() {
        return this.a;
    }

    public u0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // ttpobfuscated.l
    public Object a(p0 p0Var, InterfaceC1364105Vn<? super UseCaseResult<t0, s0>> interfaceC1364105Vn) {
        try {
            if (p0Var.a) {
                return new UseCaseResult.b(t0.a.b);
            }
            this.a.a();
            return new UseCaseResult.b(t0.b.b);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                if (thM5exceptionOrNullimpl instanceof q0.a) {
                    switch (a.a[((q0.a) thM5exceptionOrNullimpl).a.ordinal()]) {
                        case 1:
                            return new UseCaseResult.a(s0.d.b);
                        case 2:
                        case 3:
                            return new UseCaseResult.a(s0.b.b);
                        case 4:
                            return new UseCaseResult.a(s0.a.b);
                        case 5:
                            return new UseCaseResult.a(s0.f.b);
                        case 6:
                            return new UseCaseResult.a(s0.g.b);
                        case 7:
                            return new UseCaseResult.a(s0.c.b);
                        case 8:
                            return new UseCaseResult.a(s0.e.b);
                        case BdTuring.TYPE_ECAF /* 9 */:
                            return new UseCaseResult.a(s0.h.b);
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            return new UseCaseResult.a(s0.i.b);
                        default:
                            throw new C1954807lC();
                    }
                }
                return new UseCaseResult.a(s0.i.b);
            }
            throw new C2197108jB();
        }
    }
}
