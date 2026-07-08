package com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm;

import X.C0JH7;
import X.C0JHA;
import X.C0JHI;
import X.C0JHK;
import X.C13LP;
import X.C1443310nf7;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import Y.ARunnableS76S0200000_7;
import android.os.Looper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVideoPublishVM extends AssemViewModel<C0JHK> implements IPcsCoursePublishAbility {
    @Override // com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.IPcsCoursePublishAbility
    public final PcsVideoPublishVM aG0() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JHK(0);
    }

    public static C0JH7 vQ2(String str) {
        return (C0JH7) ((Map) C0JHA.LIZIZ.getValue()).get(str);
    }

    public static void wQ2(String str) {
        Object obj = C0JHA.LIZLLL;
        synchronized (obj) {
            try {
                Set<String> set = C0JHA.LIZJ;
                if (C13LP.LJJJJ(str, set)) {
                    return;
                }
                C0JHI c0jhiLIZ = C1443310nf7.LIZIZ.LIZ();
                if (str == null) {
                    str = "";
                }
                String strLIZIZ = c0jhiLIZ.LIZIZ(str, C0JHA.LJI);
                if (strLIZIZ != null) {
                    synchronized (obj) {
                        try {
                            set.add(strLIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.IPcsCoursePublishAbility
    public final void Td1(String str) {
        boolean z;
        BPEAHandler bPEAHandler = C0JHA.LIZ;
        synchronized (C0JHA.LJFF) {
            try {
                if (C0JHA.LJ.remove(str) != null) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeObserver: creationId=");
                sbLIZ.append(str);
                sbLIZ.append(", removed=");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.IPcsCoursePublishAbility
    public final void N02(String str, Function1<? super C0JH7, Unit> function1) {
        synchronized (C0JHA.LJFF) {
            try {
                Map<String, Function1<C0JH7, Unit>> map = C0JHA.LJ;
                boolean zContainsKey = map.containsKey(str);
                map.put(str, function1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("observeProgress: creationId=");
                sbLIZ.append(str);
                sbLIZ.append(", replacedPrevious=");
                sbLIZ.append(zContainsKey);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0JH7 c0jh7 = (C0JH7) ((Map) C0JHA.LIZIZ.getValue()).get(str);
        if (c0jh7 != null) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                function1.invoke(c0jh7);
            } else {
                C786410Ut5.LJJZZIII(C0JHA.LIZ, new ARunnableS76S0200000_7(function1, c0jh7, 61));
            }
        }
    }
}
