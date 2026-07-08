package com.ss.android.ugc.aweme.performanceopt.api;

import X.EnumC1618420sDY;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public interface PerfMonitorService {
    void LIZ(Function0 function0, Function0 function02);

    void LIZIZ(String str, String str2, String str3);

    void LIZJ(String str, EnumC1618420sDY enumC1618420sDY, View view, Function0<Unit> function0, Function0<Unit> function02);

    void LIZLLL(String str);

    void LJ(RecyclerView recyclerView, String str);

    void LJFF(String str);

    void stopFpsMonitor(String str);
}
