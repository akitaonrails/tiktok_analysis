package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC309290CAl;
import X.C07FG;
import X.C08Q0;
import X.C0CAW;
import X.C0CB3;
import X.C0CB9;
import X.C0CCZ;
import X.C0V60;
import X.C0VZ0;
import X.C0X35;
import X.C1252304vB;
import X.C13LP;
import X.C13LQ;
import X.C1491980ovc;
import X.C15438062q;
import X.C1BWL;
import X.C1E21;
import X.C20596085a;
import X.C2097908Jt;
import X.C2124308Tx;
import X.C2162308dZ;
import X.C2236808pa;
import X.C277230Atl;
import X.C282730B6h;
import X.C285090BFj;
import X.C291860BcG;
import X.C303060BuK;
import X.C309220CAe;
import X.C309250CAh;
import X.C309260CAi;
import X.C309350CAr;
import X.C309370CAt;
import X.C309380CAu;
import X.C309410CAx;
import X.C309420CAy;
import X.C309430CAz;
import X.C786420Ut6;
import X.C786450Ut9;
import X.C799570VYd;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.RunnableC2206381BWy;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.IResourceChecker;
import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class ColdBootSystemOptTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ColdBootSystemOptTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        if ((!((Boolean) C1E21.LJII.getValue()).booleanValue() || C2162308dZ.LJI(C1BWL.LIZ())) && !C309220CAe.LIZLLL()) {
            C309260CAi c309260CAi = new C309260CAi();
            AbstractC309290CAl[] abstractC309290CAlArr = {C309370CAt.LJII, C309380CAu.LJII, C309350CAr.LIZ, C309420CAy.LIZ};
            if (c309260CAi.LIZJ.compareAndSet(false, true)) {
                c309260CAi.LIZIZ = C13LP.LLIIII(C13LQ.LJIJI(abstractC309290CAlArr));
            }
            AbsABValueOptimizer[] absABValueOptimizerArr = new AbsABValueOptimizer[3];
            absABValueOptimizerArr[0] = C0CAW.LJII;
            absABValueOptimizerArr[1] = C1252304vB.LIZ() ? new AbsABValueOptimizer() { // from class: X.0CAw
                @Override // com.ss.android.ugc.aweme.ab.AbsABValueOptimizer
                public final String LIZIZ() {
                    return "system_launch_ab_preload_experiment";
                }

                @Override // com.ss.android.ugc.aweme.ab.AbsABValueOptimizer
                public final boolean LIZJ() {
                    return false;
                }
            } : null;
            absABValueOptimizerArr[2] = C309410CAx.LIZ;
            if (c309260CAi.LIZLLL.compareAndSet(false, true)) {
                c309260CAi.LIZ = C13LP.LLIIII(C13LQ.LJIJI(absABValueOptimizerArr));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<? extends AbstractC309290CAl> list = c309260CAi.LIZIZ;
            if (list != null && (!list.isEmpty())) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                for (AbstractC309290CAl abstractC309290CAl : list) {
                    linkedHashMap3.put(abstractC309290CAl.LIZJ(), abstractC309290CAl);
                }
                if (linkedHashMap3.size() != list.size()) {
                    throw new IllegalStateException("Some AbsKevaRepoPreload are with same scene.");
                }
                linkedHashMap2.putAll(linkedHashMap3);
            }
            List<? extends AbsABValueOptimizer> list2 = c309260CAi.LIZ;
            if (list2 != null && (!list2.isEmpty())) {
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iLIZIZ2 >= 16 ? iLIZIZ2 : 16);
                for (AbsABValueOptimizer absABValueOptimizer : list2) {
                    linkedHashMap4.put(absABValueOptimizer.LIZIZ(), absABValueOptimizer);
                }
                if (linkedHashMap4.size() != list2.size()) {
                    throw new IllegalStateException("Some AbsABValueOptimizer are with same scene.");
                }
                linkedHashMap.putAll(linkedHashMap4);
            }
            C309250CAh c309250CAh = new C309250CAh(linkedHashMap, linkedHashMap2);
            C309220CAe.LIZJ = Looper.getMainLooper().getThread();
            C309220CAe.LIZIZ = c309250CAh;
            C309220CAe.LIZ.compareAndSet(false, true);
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public static void LJ(Context context) {
        C0X35.LIZ("application_initbefore_part2_init", false);
        if (Build.VERSION.SDK_INT < 31 && C08Q0.LJ(context, "get_thread_tid_opt", false)) {
            C0X35.LJI = 16;
        }
        boolean zBooleanValue = ((Boolean) C285090BFj.LJJII.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C285090BFj.LJJIFFI.getValue()).booleanValue();
        if (!zBooleanValue) {
            C0X35.LIZ("application_initbefore_part2_init_inner_1", false);
            C2236808pa.LIZ(C1BWL.LIZ(), C2162308dZ.LJI(context));
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_1", false);
            C0X35.LIZ("application_initbefore_part2_init_inner_7", false);
            if (((Number) C303060BuK.LIZ.getValue()).intValue() > 0) {
                C786420Ut6.LJIIIZ = true;
                C786420Ut6.LJIIIIZZ = LivePreCreateNextRoomPlayer.ENABLE;
                C786450Ut9.LJ = true;
            }
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_7", false);
        }
        if (!zBooleanValue2) {
            C0X35.LIZ("application_initbefore_part2_init_inner_2", false);
            C0V60.LIZ();
            if (((Boolean) C282730B6h.LIZ.getValue()).booleanValue()) {
                C0CB3.LIZ = new C0CB9();
            }
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_2", false);
            C0X35.LIZ("application_initbefore_part2_init_inner_4", false);
            ReDexExperimentOpt.load();
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_4", false);
            C0X35.LIZ("application_initbefore_part2_init_inner_6", false);
            C2124308Tx.LIZ();
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_6", false);
            C0X35.LIZ("application_initbefore_part2_init_inner_10", false);
            if (((Boolean) C07FG.LJI.getValue()).booleanValue()) {
                C309430CAz.LIZ = 9150;
            }
            C0X35.LJIIJJI("application_initbefore_part2_init_inner_10", false);
            if (!zBooleanValue) {
                C0X35.LIZ("application_initbefore_part2_init_inner_3", false);
                try {
                    ((Number) C277230Atl.LIZ.getValue()).intValue();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C0X35.LJIIJJI("application_initbefore_part2_init_inner_3", false);
                C0X35.LIZ("application_initbefore_part2_init_inner_5", false);
                if (((Boolean) C291860BcG.LIZ.getValue()).booleanValue()) {
                    C20596085a.LLILLL = true;
                }
                C0X35.LJIIJJI("application_initbefore_part2_init_inner_5", false);
            }
        }
        C0X35.LIZ("application_initbefore_part2_init_inner_8", false);
        C1491980ovc c1491980ovc = C1491980ovc.LIZ;
        Handler handlerLIZIZ = C799570VYd.LIZIZ();
        c1491980ovc.getClass();
        C1491980ovc.LJ = handlerLIZIZ;
        C823050WQl.LIZIZ().execute(RunnableC2206381BWy.LL);
        C0X35.LJIIJJI("application_initbefore_part2_init_inner_8", false);
        C0X35.LIZ("application_initbefore_part2_init_inner_9", false);
        LIZ();
        C0X35.LJIIJJI("application_initbefore_part2_init_inner_9", false);
        C0X35.LIZ("application_initbefore_part2_init_inner_12", false);
        if (Build.VERSION.SDK_INT >= 27) {
            try {
                int iLIZIZ = C08Q0.LIZIZ(context, 0, "coldboot_eglinit_fix");
                if (iLIZIZ > 0) {
                    ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIIJJI(iLIZIZ, context);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0X35.LJIIJJI("application_initbefore_part2_init_inner_12", false);
        C0X35.LJIIJJI("application_initbefore_part2_init", false);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LJ(context);
    }
}
