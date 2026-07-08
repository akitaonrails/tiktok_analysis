package ttpobfuscated;

import X.C08FF;
import X.C1954807lC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttp.orbu.sdk.TTPOrbuSdk;

/* JADX INFO: loaded from: classes24.dex */
public enum la {
    PreActive("preactive"),
    Active("active"),
    InActive("inactive");

    public static final a b = new a();
    public final String a;

    public static final class a {

        /* JADX INFO: renamed from: ttpobfuscated.la$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes14.dex */
        public /* synthetic */ class C0062a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[TTPOrbuSdk.OrbuState.values().length];
                try {
                    iArr[TTPOrbuSdk.OrbuState.PRE_ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[TTPOrbuSdk.OrbuState.ENABLE.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[TTPOrbuSdk.OrbuState.DISABLE.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                a = iArr;
            }
        }

        public final la a(TTPOrbuSdk.OrbuState orbuState) {
            int i = C0062a.a[orbuState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return la.InActive;
                    }
                    throw new C1954807lC();
                }
                return la.Active;
            }
            return la.PreActive;
        }
    }

    public static final /* synthetic */ la[] a() {
        return new la[]{PreActive, Active, InActive};
    }

    public final String b() {
        return this.a;
    }

    public static la valueOf(String str) {
        return (la) C08FF.LIZ(la.class, str);
    }

    la(String str) {
        this.a = str;
    }
}
