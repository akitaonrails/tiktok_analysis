package com.ss.android.ugc.aweme.utils;

import X.C2188811AlT;
import X.C859080Xn0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PerformanceMonitorCallbacks implements LifecycleEventObserver {
    public final LifecycleOwner LL;
    public final Function0<Integer> LLILLJJLI;
    public final Function0<VideoPublishEditModel> LLILLL;
    public final Function0<HashMap<String, String>> LLILZ;
    public Function0<Unit> LLILZIL;

    public PerformanceMonitorCallbacks() {
        throw null;
    }

    public PerformanceMonitorCallbacks(LifecycleOwner lifecycleOwner, C859080Xn0 c859080Xn0) {
        this(lifecycleOwner, c859080Xn0, null, null, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMonitorCallbacks)) {
            return false;
        }
        PerformanceMonitorCallbacks performanceMonitorCallbacks = (PerformanceMonitorCallbacks) obj;
        return Intrinsics.LJFF(this.LL, performanceMonitorCallbacks.LL) && Intrinsics.LJFF(this.LLILLJJLI, performanceMonitorCallbacks.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, performanceMonitorCallbacks.LLILLL) && Intrinsics.LJFF(this.LLILZ, performanceMonitorCallbacks.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Function0<Integer> function0 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<VideoPublishEditModel> function02 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<HashMap<String, String>> function03 = this.LLILZ;
        return iHashCode3 + (function03 != null ? function03.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceMonitorCallbacks(lifecycleOwner=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", callBack=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoPublishEditModelProvider=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraInfoProvider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.LL.getLifecycle().removeObserver(this);
            Function0<Unit> function0 = this.LLILZIL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public PerformanceMonitorCallbacks(LifecycleOwner lifecycleOwner, C859080Xn0 c859080Xn0, AwS566S0100000_22 awS566S0100000_22, AwS566S0100000_22 awS566S0100000_222, int i) {
        Function0<Integer> function0 = (i & 2) != 0 ? AFwS189S0000000_3.get$arr$(577) : c859080Xn0;
        awS566S0100000_22 = (i & 4) != 0 ? null : awS566S0100000_22;
        awS566S0100000_222 = (i & 8) != 0 ? null : awS566S0100000_222;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = function0;
        this.LLILLL = awS566S0100000_22;
        this.LLILZ = awS566S0100000_222;
    }
}
