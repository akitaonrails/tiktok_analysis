package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C0V9Z;
import X.C0VA1;
import X.C0VA3;
import X.C793290V9z;
import X.C844470XAv;
import android.content.Context;
import com.ss.android.ugc.aweme.port.in.IToolsCPUDataService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class ToolsCPUDataServiceImpl implements IToolsCPUDataService {
    public C0V9Z assistStat;
    public final ToolOtisCpuHelper toolOtisCpuHelper = ToolOtisCpuHelper.Companion.create();

    private final HashMap<String, Double> getCpuDataWithOtis() {
        HashMap<String, Double> map = new HashMap<>();
        this.toolOtisCpuHelper.getOtisCpu().LIZ();
        map.put("proc_cpu_usage", Double.valueOf(this.toolOtisCpuHelper.getOtisCpu().LJI.LIZ));
        map.put("proc_cpu_speed", Double.valueOf(this.toolOtisCpuHelper.getOtisCpu().LJI.LIZIZ));
        ToolOtisCpuHelper toolOtisCpuHelper = this.toolOtisCpuHelper;
        map.put("proc_cpu_usage_gc", Double.valueOf(toolOtisCpuHelper.getThreadCpuUsage(toolOtisCpuHelper.getThreadIdGc())));
        ToolOtisCpuHelper toolOtisCpuHelper2 = this.toolOtisCpuHelper;
        map.put("proc_cpu_speed_gc", Double.valueOf(toolOtisCpuHelper2.getThreadCpuSpeed(toolOtisCpuHelper2.getThreadIdGc())));
        ToolOtisCpuHelper toolOtisCpuHelper3 = this.toolOtisCpuHelper;
        map.put("proc_cpu_usage_render", Double.valueOf(toolOtisCpuHelper3.getThreadCpuUsage(toolOtisCpuHelper3.getThreadIdRender())));
        ToolOtisCpuHelper toolOtisCpuHelper4 = this.toolOtisCpuHelper;
        map.put("proc_cpu_usage_render", Double.valueOf(toolOtisCpuHelper4.getThreadCpuSpeed(toolOtisCpuHelper4.getThreadIdRender())));
        return map;
    }

    private final HashMap<String, Double> getCpuDataWithWatson() {
        Double dValueOf;
        HashMap<String, Double> map = new HashMap<>();
        C0V9Z c0v9z = this.assistStat;
        if (c0v9z != null) {
            ((C0VA1) c0v9z).LIZLLL.LIZ();
        }
        C0V9Z c0v9z2 = this.assistStat;
        Double dValueOf2 = null;
        if (c0v9z2 != null) {
            C0VA3 c0va3 = ((C0VA1) c0v9z2).LIZLLL;
            dValueOf = Double.valueOf(((C0VA1) c0va3.LIZ).LJFF.LIZ ? c0va3.LJIIIZ.LJIILL : 0.0d);
        } else {
            dValueOf = null;
        }
        map.put("proc_cpu_usage", dValueOf);
        C0V9Z c0v9z3 = this.assistStat;
        if (c0v9z3 != null) {
            C0VA3 c0va32 = ((C0VA1) c0v9z3).LIZLLL;
            ((C0VA1) c0va32.LIZ).LJFF.getClass();
            dValueOf2 = Double.valueOf(((C0VA1) c0va32.LIZ).LJFF.LIZ ? c0va32.LJIIIZ.LJIILLIIL : 0.0d);
        }
        map.put("proc_cpu_speed", dValueOf2);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public void end() {
        C0V9Z c0v9z = this.assistStat;
        if (c0v9z != null) {
            ((C0VA1) c0v9z).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public HashMap<String, String> getThermalData() {
        String string;
        HashMap<String, String> map = new HashMap<>();
        C0V9Z c0v9z = this.assistStat;
        if (c0v9z == null || (string = Integer.valueOf(((C0VA1) c0v9z).LIZLLL()).toString()) == null) {
            string = "-1";
        }
        map.put("thermal", string);
        C0V9Z c0v9z2 = this.assistStat;
        map.put("thermal_temp", c0v9z2 != null ? Float.valueOf(((C0VA1) c0v9z2).LIZIZ.LJFF).toString() : null);
        return map;
    }

    public void init() {
        C793290V9z c793290V9z = new C793290V9z();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0VA1 c0va1 = contextLIZ == null ? null : new C0VA1(contextLIZ, c793290V9z);
        this.assistStat = c0va1;
        if (c0va1 != null) {
            c0va1.LJI();
        }
        this.toolOtisCpuHelper.getOtisCpu().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public int isSavePowerEnable() {
        C0V9Z c0v9z = this.assistStat;
        if (c0v9z != null) {
            return ((C0VA1) c0v9z).LJFF();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public void start() {
        this.toolOtisCpuHelper.getOtisCpu().LIZ();
        C0V9Z c0v9z = this.assistStat;
        if (c0v9z != null) {
            ((C0VA1) c0v9z).LJI();
        } else {
            init();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public HashMap<String, Double> getCpuData() {
        return getCpuDataWithOtis();
    }

    public static IToolsCPUDataService createIToolsCPUDataServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IToolsCPUDataService.class, z);
        if (objLIZ != null) {
            return (IToolsCPUDataService) objLIZ;
        }
        if (C04TD.H4 == null) {
            synchronized (IToolsCPUDataService.class) {
                if (C04TD.H4 == null) {
                    C04TD.H4 = new ToolsCPUDataServiceImpl();
                }
            }
        }
        return C04TD.H4;
    }
}
