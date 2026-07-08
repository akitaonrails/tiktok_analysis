package com.bytedance.assem.arch.core;

import X.AbstractC694060RKi;
import X.AbstractC724210Sax;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C062P;
import X.C09R7;
import X.C0RTA;
import X.C0RTB;
import X.C0RTC;
import X.C0RTR;
import X.C0RTU;
import X.C0RTV;
import X.C0RTY;
import X.C0RUS;
import X.C0RUV;
import X.C0SZ5;
import X.C13IQ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558420qem;
import X.C211200re;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C443120HZe;
import X.C634030Ott;
import X.C694070RKj;
import X.C696590RUb;
import X.C723610SZz;
import X.C723620Sa0;
import X.C723640Sa2;
import X.C723660Sa4;
import X.C723670Sa5;
import X.C723680Sa6;
import X.C723710Sa9;
import X.C723770SaF;
import X.C723780SaG;
import X.C723850SaN;
import X.C724710Sbl;
import X.C725080ScM;
import X.C725210ScZ;
import X.C725410Sct;
import X.C725430Scv;
import X.C725450Scx;
import X.C725480Sd0;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import X.InterfaceC447510Hgj;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import X.InterfaceC723720SaA;
import X.InterfaceC723730SaB;
import X.InterfaceC724720Sbm;
import X.InterfaceC725440Scw;
import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class Assembler extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final C723660Sa4 LL = new C723660Sa4();
    public C723780SaG LLILLJJLI;
    public C0RTR LLILLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Assembler onCleared: ");
                sbLIZ.append(this);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Assembler onCleared: ");
                sbLIZ2.append(this);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        C723660Sa4 c723660Sa4 = this.LL;
        ((ConcurrentHashMap) c723660Sa4.LIZIZ).clear();
        ((ConcurrentHashMap) c723660Sa4.LIZ).clear();
        ((ConcurrentHashMap) c723660Sa4.LIZJ).clear();
        ((ConcurrentHashMap) c723660Sa4.LIZLLL).clear();
    }

    public final AbstractC724210Sax AQ2(LifecycleOwner lifecycleOwner) {
        return (AbstractC724210Sax) ((ConcurrentHashMap) this.LL.LIZLLL).get(lifecycleOwner);
    }

    public final AssemSupervisor CQ2(LifecycleOwner lifecycleOwner) {
        return (AssemSupervisor) ((ConcurrentHashMap) this.LL.LIZ).get(lifecycleOwner);
    }

    public final void xQ2(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null) {
                if (!C725080ScM.LJIILJJIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Assembler clearAsLifecycleOwner: ");
                    sbLIZ.append(lifecycleOwner);
                    sbLIZ.append(", ");
                    sbLIZ.append(this);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                } else if (C725080ScM.LIZLLL) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Assembler clearAsLifecycleOwner: ");
                    sbLIZ2.append(lifecycleOwner);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(this);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    int i2 = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ2);
                }
            }
            C723660Sa4 c723660Sa4 = this.LL;
            ((ConcurrentHashMap) c723660Sa4.LIZIZ).remove(lifecycleOwner);
            ((ConcurrentHashMap) c723660Sa4.LIZJ).remove(lifecycleOwner);
            ((ConcurrentHashMap) c723660Sa4.LIZ).remove(lifecycleOwner);
            ((ConcurrentHashMap) c723660Sa4.LIZLLL).remove(lifecycleOwner);
        }
    }

    public final C0RTY zQ2(LifecycleOwner lifecycleOwner) {
        return C723660Sa4.LIZ(this.LL, lifecycleOwner);
    }

    public static C724710Sbl BQ2(Assembler assembler, LifecycleOwner lifecycleOwner) {
        C723660Sa4 c723660Sa4 = assembler.LL;
        C724710Sbl c724710Sbl = (C724710Sbl) ((ConcurrentHashMap) c723660Sa4.LIZJ).get(lifecycleOwner);
        if (c724710Sbl == null) {
            AssemSupervisor assemSupervisor = (AssemSupervisor) ((ConcurrentHashMap) c723660Sa4.LIZ).get(lifecycleOwner);
            if (assemSupervisor != null) {
                return assemSupervisor.LJFF();
            }
            return null;
        }
        return c724710Sbl;
    }

    public static C0RTC HQ2(AssemSupervisor assemSupervisor, Function1 function1) {
        String strValueOf = String.valueOf(function1.hashCode());
        C725210ScZ c725210ScZ = C725210ScZ.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725210ScZ);
                }
            }
            if (C725480Sd0.LIZ(c725210ScZ)) {
                C725430Scv.LIZ(new C723670Sa5(c725210ScZ, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        C0RTC c0rtc = (C0RTC) function1.invoke(assemSupervisor);
        C725210ScZ c725210ScZ2 = C725210ScZ.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725210ScZ2);
                }
            }
            if (C725480Sd0.LIZ(c725210ScZ2)) {
                C725430Scv.LIZ(new C723610SZz(c725210ScZ2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())));
            }
        }
        return c0rtc;
    }

    public final void DQ2(Fragment fragment, Function1<? super C062P<InterfaceC111300bX>, Unit> function1) {
        C062P c062p = new C062P();
        function1.invoke(c062p);
        C443120HZe c443120HZeLIZ = c062p.LIZ();
        String str = (String) c443120HZeLIZ.getFirst();
        InterfaceC111300bX interfaceC111300bX = (InterfaceC111300bX) c443120HZeLIZ.getSecond();
        C13IQ c13iq = (C13IQ) c443120HZeLIZ.getThird();
        if (C725080ScM.LJIIJ) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
            C723710Sa9 c723710Sa9 = new C723710Sa9(interfaceC111300bX);
            String strLIZ = C211200re.LIZ(C09R7.LIZ(c13iq), str);
            if (strLIZ == null) {
                strLIZ = "source_default_key";
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJFF, c723710Sa9, C723710Sa9.class, strLIZ);
            return;
        }
        C0RTY c0rtyLIZ = C723660Sa4.LIZ(this.LL, fragment);
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store hierarchy data in Fragment: ");
                    sbLIZ.append(fragment);
                    sbLIZ.append(", key is ");
                    sbLIZ.append(str);
                    sbLIZ.append(", data is ");
                    sbLIZ.append(interfaceC111300bX);
                    sbLIZ.append(", container[this] is ");
                    sbLIZ.append(c0rtyLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c0rtyLIZ == null) {
            return;
        }
        c0rtyLIZ.LIZLLL(interfaceC111300bX, str, C09R7.LIZ(c13iq));
    }

    public final void EQ2(AbstractC738140SxQ abstractC738140SxQ, Function1<? super C062P<InterfaceC111300bX>, Unit> function1) {
        C062P c062p = new C062P();
        function1.invoke(c062p);
        C443120HZe c443120HZeLIZ = c062p.LIZ();
        String str = (String) c443120HZeLIZ.getFirst();
        InterfaceC111300bX interfaceC111300bX = (InterfaceC111300bX) c443120HZeLIZ.getSecond();
        C13IQ c13iq = (C13IQ) c443120HZeLIZ.getThird();
        if (C725080ScM.LJIIJ) {
            C723710Sa9 c723710Sa9 = new C723710Sa9(interfaceC111300bX);
            String strLIZ = C211200re.LIZ(C09R7.LIZ(c13iq), str);
            if (strLIZ == null) {
                strLIZ = "source_default_key";
            }
            C1554960qZC.LIZ(abstractC738140SxQ, c723710Sa9, C723710Sa9.class, strLIZ);
            return;
        }
        C0RTY c0rtyLIZ = C723660Sa4.LIZ(this.LL, abstractC738140SxQ);
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store hierarchy data in Assem: ");
                    sbLIZ.append(abstractC738140SxQ);
                    sbLIZ.append(", key is ");
                    sbLIZ.append(str);
                    sbLIZ.append(", data is ");
                    sbLIZ.append(interfaceC111300bX);
                    sbLIZ.append(", container[this] is ");
                    sbLIZ.append(c0rtyLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c0rtyLIZ == null) {
            return;
        }
        c0rtyLIZ.LIZLLL(interfaceC111300bX, str, C09R7.LIZ(c13iq));
    }

    public final void FQ2(BaseActivity baseActivity, Function1 function1) {
        C062P c062p = new C062P();
        function1.invoke(c062p);
        C443120HZe c443120HZeLIZ = c062p.LIZ();
        String str = (String) c443120HZeLIZ.getFirst();
        InterfaceC111300bX interfaceC111300bX = (InterfaceC111300bX) c443120HZeLIZ.getSecond();
        C13IQ c13iq = (C13IQ) c443120HZeLIZ.getThird();
        if (C725080ScM.LJIIJ) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(baseActivity, null);
            C723710Sa9 c723710Sa9 = new C723710Sa9(interfaceC111300bX);
            String strLIZ = C211200re.LIZ(C09R7.LIZ(c13iq), str);
            if (strLIZ == null) {
                strLIZ = "source_default_key";
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, c723710Sa9, C723710Sa9.class, strLIZ);
            return;
        }
        C0RTY c0rtyLIZ = C723660Sa4.LIZ(this.LL, baseActivity);
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store hierarchy data in Activity: ");
                    sbLIZ.append(baseActivity);
                    sbLIZ.append(", key is ");
                    sbLIZ.append(str);
                    sbLIZ.append(", data is ");
                    sbLIZ.append(interfaceC111300bX);
                    sbLIZ.append(", container[this] is ");
                    sbLIZ.append(c0rtyLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c0rtyLIZ == null) {
            return;
        }
        c0rtyLIZ.LIZLLL(interfaceC111300bX, str, C09R7.LIZ(c13iq));
    }

    public final void GQ2(InterfaceC719640SKs interfaceC719640SKs, Function1<? super C062P<InterfaceC111300bX>, Unit> function1) {
        C062P c062p = new C062P();
        function1.invoke(c062p);
        C443120HZe c443120HZeLIZ = c062p.LIZ();
        String str = (String) c443120HZeLIZ.getFirst();
        InterfaceC111300bX interfaceC111300bX = (InterfaceC111300bX) c443120HZeLIZ.getSecond();
        C13IQ c13iq = (C13IQ) c443120HZeLIZ.getThird();
        if (C725080ScM.LJIIJ) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC719640SKs);
            C723710Sa9 c723710Sa9 = new C723710Sa9(interfaceC111300bX);
            String strLIZ = C211200re.LIZ(C09R7.LIZ(c13iq), str);
            if (strLIZ == null) {
                strLIZ = "source_default_key";
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLIZIZ, c723710Sa9, C723710Sa9.class, strLIZ);
            return;
        }
        C0RTY c0rtyLIZ = C723660Sa4.LIZ(this.LL, interfaceC719640SKs);
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store hierarchy data in Assem: ");
                    sbLIZ.append(interfaceC719640SKs);
                    sbLIZ.append(", key is ");
                    sbLIZ.append(str);
                    sbLIZ.append(", data is ");
                    sbLIZ.append(interfaceC111300bX);
                    sbLIZ.append(", container[this] is ");
                    sbLIZ.append(c0rtyLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("assem_hierarchy_data", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c0rtyLIZ == null) {
            return;
        }
        c0rtyLIZ.LIZLLL(interfaceC111300bX, str, C09R7.LIZ(c13iq));
    }

    public final void IQ2(ReusedAssem reusedAssem, Function1 function1) {
        AssemSupervisor assemSupervisorCQ2 = CQ2(reusedAssem);
        if (assemSupervisorCQ2 == null) {
            return;
        }
        C0RTC<?> c0rtcHQ2 = HQ2(assemSupervisorCQ2, function1);
        C694070RKj c694070RKj = c0rtcHQ2.LLILZIL;
        if (Intrinsics.LJFF(c694070RKj, C694070RKj.LIZ) && !C0RTV.LIZ(reusedAssem.getLifecycle()) && C723770SaF.LIZIZ(reusedAssem, c0rtcHQ2, this, assemSupervisorCQ2)) {
            reusedAssem.getSupervisor();
            return;
        }
        if (Intrinsics.LJFF(c694070RKj, C694070RKj.LIZIZ)) {
            assemSupervisorCQ2.LLJJ.put(c0rtcHQ2.LIZLLL(), c0rtcHQ2);
            reusedAssem.getSupervisor();
        } else {
            if (c694070RKj instanceof AbstractC694060RKi) {
                ((AbstractC694060RKi) c694070RKj).LIZ(reusedAssem, assemSupervisorCQ2, c0rtcHQ2);
                reusedAssem.getSupervisor();
                return;
            }
            if (!C0RTV.LIZ(reusedAssem.getLifecycle())) {
                List<ReusedAssem<?>> listYQ2 = yQ2(c0rtcHQ2, assemSupervisorCQ2);
                C723780SaG c723780SaG = this.LLILLJJLI;
                if (c723780SaG != null) {
                    c723780SaG.LIZ(listYQ2);
                    return;
                }
                C723850SaN.LJI(new C0RTU(reusedAssem, listYQ2, assemSupervisorCQ2, c0rtcHQ2));
            }
            reusedAssem.getSupervisor();
        }
    }

    public final void JQ2(LifecycleOwner lifecycleOwner, Function1<? super AssemSupervisor, ? extends C0RTC<?>> function1) {
        AssemSupervisor assemSupervisorCQ2 = CQ2(lifecycleOwner);
        if (assemSupervisorCQ2 == null) {
            return;
        }
        C0RTC<?> c0rtcHQ2 = HQ2(assemSupervisorCQ2, function1);
        if (!C0RTV.LIZ(lifecycleOwner.getLifecycle())) {
            List<ReusedAssem<?>> listYQ2 = yQ2(c0rtcHQ2, assemSupervisorCQ2);
            C723780SaG c723780SaG = this.LLILLJJLI;
            if (c723780SaG != null) {
                c723780SaG.LIZ(listYQ2);
            }
        }
    }

    public final void KQ2(final ReusedUIAssem reusedUIAssem, final Function1 function1) {
        Runnable runnable = new Runnable() { // from class: X.0RTN
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.reusedLogicAssem$1");
                try {
                    this.LL.IQ2(reusedUIAssem, new C0RTM(function1));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.reusedLogicAssem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final <REUSED extends ReusedUIAssem<? extends C03H5>> void LQ2(final REUSED reused, final Function1<? super C0RTA, Unit> function1) {
        Runnable runnable = new Runnable() { // from class: X.0RKs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.reusedUiContentAssem$1");
                try {
                    this.LL.IQ2(reused, new C694170RKt(function1));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.reusedUiContentAssem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final <REUSED extends ReusedUIAssem<? extends C03H5>> void MQ2(final REUSED reused, final Function1<? super C0RTB, Unit> function1) {
        Runnable runnable = new Runnable() { // from class: X.0RKr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.reusedUiSlotAssem$1");
                try {
                    Assembler assembler = this.LL;
                    ReusedUIAssem reusedUIAssem = reused;
                    Function1<C0RTB, Unit> function12 = function1;
                    assembler.getClass();
                    assembler.IQ2(reusedUIAssem, new C694140RKq(assembler, reusedUIAssem, function12));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.reusedUiSlotAssem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final void NQ2(LifecycleOwner lifecycleOwner, C0RTY c0rty) {
        C723660Sa4 c723660Sa4 = this.LL;
        c723660Sa4.getClass();
        if (lifecycleOwner != null) {
            ((ConcurrentHashMap) c723660Sa4.LIZIZ).put(lifecycleOwner, c0rty);
        }
    }

    public final void OQ2(LifecycleOwner lifecycleOwner, C724710Sbl c724710Sbl) {
        C723660Sa4 c723660Sa4 = this.LL;
        c723660Sa4.getClass();
        if (lifecycleOwner != null && c724710Sbl != null) {
            ((ConcurrentHashMap) c723660Sa4.LIZJ).put(lifecycleOwner, c724710Sbl);
        }
    }

    public final void PQ2(LifecycleOwner lifecycleOwner, AssemSupervisor assemSupervisor) {
        C723660Sa4 c723660Sa4 = this.LL;
        c723660Sa4.getClass();
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("new setAssemSupervisor: ");
                    sbLIZ.append(lifecycleOwner);
                    sbLIZ.append(", ");
                    sbLIZ.append(assemSupervisor);
                    sbLIZ.append(", ");
                    sbLIZ.append(C786410Ut5.u3());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (lifecycleOwner != null && assemSupervisor != null) {
            ((ConcurrentHashMap) c723660Sa4.LIZ).put(lifecycleOwner, assemSupervisor);
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("after setAssemSupervisor: ");
                        sbLIZ2.append(((ConcurrentHashMap) c723660Sa4.LIZ).get(lifecycleOwner));
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        int i2 = C2187451AjH.LIZ;
                        interfaceC723720SaA2.log("AssemList", strLIZIZ2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public final void QQ2(final LifecycleOwner lifecycleOwner, final Function1<? super C696590RUb, Unit> function1) {
        Runnable runnable = new Runnable() { // from class: X.0SZr
            public final void LIZ() {
                AbstractC738140SxQ abstractC738140SxQ;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if (!(lifecycleOwner2 instanceof Activity) && !(lifecycleOwner2 instanceof Fragment) && !(lifecycleOwner2 instanceof AbstractC738140SxQ) && !(lifecycleOwner2 instanceof InterfaceC719640SKs) && !(lifecycleOwner2 instanceof AbstractC724890Sc3)) {
                    "You can only assemble UIContentAssem in Activity/Fragment/UIAssem/IAssembleContainer".toString();
                    throw new IllegalStateException("You can only assemble UIContentAssem in Activity/Fragment/UIAssem/IAssembleContainer");
                }
                AssemSupervisor assemSupervisorCQ2 = this.CQ2(lifecycleOwner2);
                if (assemSupervisorCQ2 == null) {
                    return;
                }
                Function1<C696590RUb, Unit> function12 = function1;
                C696590RUb c696590RUb = new C696590RUb();
                function12.invoke(c696590RUb);
                LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                if ((lifecycleOwner3 instanceof AbstractC724890Sc3) || !C723770SaF.LIZ(lifecycleOwner3, c696590RUb, this, assemSupervisorCQ2)) {
                    AbstractC724210Sax abstractC724210SaxAQ2 = this.AQ2(lifecycleOwner);
                    Assembler assembler = this;
                    assembler.getClass();
                    C725210ScZ c725210ScZ = C725210ScZ.LIZ;
                    String strValueOf = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                        if (arrayList.size() > 0) {
                            Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().onEventBegin(c725210ScZ);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ)) {
                            C725430Scv.LIZ(new AwS13S1100100_11(c725210ScZ, strValueOf, SystemClock.elapsedRealtimeNanos(), 4));
                        }
                    }
                    UIContentAssem uIContentAssem = c696590RUb.LLJI;
                    AbstractC738140SxQ abstractC738140SxQ2 = null;
                    if (uIContentAssem != null) {
                        Iterator<AbstractC738140SxQ> it3 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next = it3.next();
                            AbstractC738140SxQ abstractC738140SxQ3 = next;
                            if ((abstractC738140SxQ3 instanceof UIContentAssem) && abstractC738140SxQ3.getClass() == uIContentAssem.getClass()) {
                                int id = ((UIAssem) abstractC738140SxQ3).LJJIJL().getId();
                                View view = c696590RUb.LLJ;
                                if (id == (view != null ? view.getId() : c696590RUb.LLIZLLLIL) && Intrinsics.LJFF(abstractC738140SxQ3.assemTagInternal, c696590RUb.LLILLJJLI)) {
                                    abstractC738140SxQ2 = next;
                                    break;
                                }
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ2;
                    } else {
                        Iterator<AbstractC738140SxQ> it4 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next2 = it4.next();
                            AbstractC738140SxQ abstractC738140SxQ4 = next2;
                            if ((abstractC738140SxQ4 instanceof UIContentAssem) && Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ4.getClass()), c696590RUb.LL)) {
                                int id2 = ((UIAssem) abstractC738140SxQ4).LJJIJL().getId();
                                View view2 = c696590RUb.LLJ;
                                if (id2 == (view2 != null ? view2.getId() : c696590RUb.LLIZLLLIL) && Intrinsics.LJFF(abstractC738140SxQ4.assemTagInternal, c696590RUb.LLILLJJLI)) {
                                    abstractC738140SxQ2 = next2;
                                    break;
                                }
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ2;
                    }
                    C725210ScZ c725210ScZ2 = C725210ScZ.LIZ;
                    String strValueOf2 = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                it5.next().onEventEnd(c725210ScZ2);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ2)) {
                            C725430Scv.LIZ(new AwS2S1210100_11(c725210ScZ2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c696590RUb, 2));
                        }
                    }
                    this.SQ2(assemSupervisorCQ2, abstractC738140SxQ, c696590RUb, abstractC724210SaxAQ2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.uiContentAssem$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.uiContentAssem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final void RQ2(final LifecycleOwner lifecycleOwner, final Function1<? super C0SZ5, Unit> function1) {
        Runnable runnable = new Runnable() { // from class: X.0SZv
            public final void LIZ() {
                AbstractC738140SxQ abstractC738140SxQ;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if (!(lifecycleOwner2 instanceof Activity) && !(lifecycleOwner2 instanceof Fragment) && !(lifecycleOwner2 instanceof AbstractC738140SxQ) && !(lifecycleOwner2 instanceof InterfaceC719640SKs) && !(lifecycleOwner2 instanceof AbstractC724890Sc3)) {
                    "You can only assemble UISlotAssems in Activity/Fragment/UIAssem/IAssembleContainer".toString();
                    throw new IllegalStateException("You can only assemble UISlotAssems in Activity/Fragment/UIAssem/IAssembleContainer");
                }
                AssemSupervisor assemSupervisorCQ2 = this.CQ2(lifecycleOwner2);
                if (assemSupervisorCQ2 == null) {
                    return;
                }
                Function1<C0SZ5, Unit> function12 = function1;
                C0SZ5 c0sz5 = new C0SZ5();
                function12.invoke(c0sz5);
                LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                if ((lifecycleOwner3 instanceof AbstractC724890Sc3) || !C723770SaF.LIZ(lifecycleOwner3, c0sz5, this, assemSupervisorCQ2)) {
                    AbstractC724210Sax abstractC724210SaxAQ2 = this.AQ2(lifecycleOwner);
                    Assembler assembler = this;
                    assembler.getClass();
                    C725210ScZ c725210ScZ = C725210ScZ.LIZ;
                    String strValueOf = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                        if (arrayList.size() > 0) {
                            Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().onEventBegin(c725210ScZ);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ)) {
                            C725430Scv.LIZ(new AwS13S1100100_11(c725210ScZ, strValueOf, SystemClock.elapsedRealtimeNanos(), 5));
                        }
                    }
                    UISlotAssem uISlotAssem = c0sz5.LLJILJIL;
                    AbstractC738140SxQ abstractC738140SxQ2 = null;
                    if (uISlotAssem != null) {
                        Iterator<AbstractC738140SxQ> it3 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next = it3.next();
                            AbstractC738140SxQ abstractC738140SxQ3 = next;
                            if ((abstractC738140SxQ3 instanceof UISlotAssem) && abstractC738140SxQ3.getClass() == uISlotAssem.getClass() && ((UISlotAssem) abstractC738140SxQ3).LLIZ == c0sz5.LLIZLLLIL && Intrinsics.LJFF(abstractC738140SxQ3.assemTagInternal, c0sz5.LLILLJJLI)) {
                                abstractC738140SxQ2 = next;
                                break;
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ2;
                    } else {
                        Iterator<AbstractC738140SxQ> it4 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next2 = it4.next();
                            AbstractC738140SxQ abstractC738140SxQ4 = next2;
                            if ((abstractC738140SxQ4 instanceof UISlotAssem) && Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ4.getClass()), c0sz5.LL) && ((UISlotAssem) abstractC738140SxQ4).LLIZ == c0sz5.LLIZLLLIL && Intrinsics.LJFF(abstractC738140SxQ4.assemTagInternal, c0sz5.LLILLJJLI)) {
                                abstractC738140SxQ2 = next2;
                                break;
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ2;
                    }
                    C725210ScZ c725210ScZ2 = C725210ScZ.LIZ;
                    String strValueOf2 = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                it5.next().onEventEnd(c725210ScZ2);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ2)) {
                            C725430Scv.LIZ(new AwS2S1210100_11(c725210ScZ2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c0sz5, 1));
                        }
                    }
                    this.SQ2(assemSupervisorCQ2, abstractC738140SxQ, c0sz5, abstractC724210SaxAQ2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.uiSlotAssem$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.uiSlotAssem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final void vQ2(final LifecycleOwner lifecycleOwner, final Function1<? super C0RUS, Unit> function1) {
        Runnable runnable = new Runnable() { // from class: X.0SZs
            public final void LIZ() {
                AbstractC738140SxQ abstractC738140SxQ;
                AssemSupervisor assemSupervisorCQ2 = this.CQ2(lifecycleOwner);
                if (assemSupervisorCQ2 == null) {
                    return;
                }
                Function1<C0RUS, Unit> function12 = function1;
                C0RUS c0rus = new C0RUS();
                function12.invoke(c0rus);
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if ((lifecycleOwner2 instanceof AbstractC724890Sc3) || !C723770SaF.LIZ(lifecycleOwner2, c0rus, this, assemSupervisorCQ2)) {
                    AbstractC724210Sax abstractC724210SaxAQ2 = this.AQ2(lifecycleOwner);
                    Assembler assembler = this;
                    assembler.getClass();
                    C725210ScZ c725210ScZ = C725210ScZ.LIZ;
                    String strValueOf = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                        if (arrayList.size() > 0) {
                            Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().onEventBegin(c725210ScZ);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ)) {
                            C725430Scv.LIZ(new C723560SZu(c725210ScZ, strValueOf, SystemClock.elapsedRealtimeNanos()));
                        }
                    }
                    AbstractC738140SxQ abstractC738140SxQ2 = c0rus.LLILZIL;
                    AbstractC738140SxQ abstractC738140SxQ3 = null;
                    if (abstractC738140SxQ2 != null) {
                        Iterator<AbstractC738140SxQ> it3 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next = it3.next();
                            if (Intrinsics.LJFF(next, abstractC738140SxQ2)) {
                                abstractC738140SxQ3 = next;
                                break;
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ3;
                    } else {
                        Iterator<AbstractC738140SxQ> it4 = assemSupervisorCQ2.LLJILLL.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            AbstractC738140SxQ next2 = it4.next();
                            AbstractC738140SxQ abstractC738140SxQ4 = next2;
                            if (Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ4.getClass()), c0rus.LL) && Intrinsics.LJFF(abstractC738140SxQ4.assemTagInternal, c0rus.LLILLJJLI)) {
                                abstractC738140SxQ3 = next2;
                                break;
                            }
                        }
                        abstractC738140SxQ = abstractC738140SxQ3;
                    }
                    C725210ScZ c725210ScZ2 = C725210ScZ.LIZ;
                    String strValueOf2 = String.valueOf(assembler.hashCode());
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                it5.next().onEventEnd(c725210ScZ2);
                            }
                        }
                        if (C725480Sd0.LIZ(c725210ScZ2)) {
                            C725430Scv.LIZ(new C723550SZt(c725210ScZ2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c0rus));
                        }
                    }
                    this.SQ2(assemSupervisorCQ2, abstractC738140SxQ, c0rus, abstractC724210SaxAQ2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Assembler@49f9.assem$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Assembler@49f9.assem$1");
            }
        };
        C0RTR c0rtr = this.LLILLL;
        if (c0rtr != null) {
            c0rtr.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public final AssemSupervisor wQ2(LifecycleOwner lifecycleOwner, List list) {
        AbstractC738140SxQ next;
        AssemSupervisor assemSupervisorCQ2 = CQ2(lifecycleOwner);
        if (assemSupervisorCQ2 == null) {
            return null;
        }
        AbstractC724210Sax abstractC724210SaxAQ2 = AQ2(lifecycleOwner);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0RUV c0ruv = (C0RUV) it2.next();
            Iterator<AbstractC738140SxQ> it3 = assemSupervisorCQ2.LLJILLL.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    AbstractC738140SxQ abstractC738140SxQ = next;
                    if (!Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ.getClass()), c0ruv.LL) || !Intrinsics.LJFF(abstractC738140SxQ.assemTagInternal, c0ruv.LLILLJJLI)) {
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c0ruv.getClass();
            SQ2(assemSupervisorCQ2, next, c0ruv, abstractC724210SaxAQ2);
        }
        return assemSupervisorCQ2;
    }

    public final List<ReusedAssem<?>> yQ2(C0RTC<?> c0rtc, AssemSupervisor assemSupervisor) {
        C725410Sct c725410Sct = C725410Sct.LIZ;
        String strValueOf = String.valueOf(hashCode());
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725410Sct);
                }
            }
            if (C725480Sd0.LIZ(c725410Sct)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725410Sct, strValueOf, SystemClock.elapsedRealtimeNanos(), 3));
            }
        }
        List<T> listLIZIZ = c0rtc.LIZIZ(assemSupervisor.LLIZLLLIL.LL);
        C725410Sct c725410Sct2 = C725410Sct.LIZ;
        String strValueOf2 = String.valueOf(hashCode());
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725410Sct2);
                }
            }
            if (C725480Sd0.LIZ(c725410Sct2)) {
                C725430Scv.LIZ(new C723620Sa0(c725410Sct2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())));
            }
        }
        return listLIZIZ;
    }

    public final void SQ2(AssemSupervisor assemSupervisor, AbstractC738140SxQ abstractC738140SxQ, C0RUV c0ruv, AbstractC724210Sax abstractC724210Sax) {
        if (abstractC738140SxQ == null) {
            String strValueOf = String.valueOf(assemSupervisor.hashCode());
            C725410Sct c725410Sct = C725410Sct.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c725410Sct);
                    }
                }
                if (C725480Sd0.LIZ(c725410Sct)) {
                    C725430Scv.LIZ(new C723680Sa6(c725410Sct, strValueOf, SystemClock.elapsedRealtimeNanos()));
                }
            }
            List<InterfaceC665370Q7z> listLIZIZ = c0ruv.LIZIZ(assemSupervisor.LLIZLLLIL.LL);
            for (InterfaceC665370Q7z interfaceC665370Q7z : listLIZIZ) {
                List<C634030Ott> list = c0ruv.LLILLL;
                C724710Sbl c724710SblLJFF = assemSupervisor.LJFF();
                if (list != null && !list.isEmpty()) {
                    for (C634030Ott c634030Ott : list) {
                        if (c634030Ott.LIZ.isAssignableFrom(interfaceC665370Q7z.getClass())) {
                            InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) interfaceC665370Q7z;
                            c724710SblLJFF.getClass();
                            Class<?> cls = c634030Ott.LIZ;
                            if ((Intrinsics.LJFF(cls, InterfaceC723730SaB.class) || Intrinsics.LJFF(cls, InterfaceC724720Sbm.class)) && C725080ScM.LIZ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append('{');
                                sbLIZ.append(cls);
                                sbLIZ.append(" - ");
                                sbLIZ.append(interfaceC723730SaB);
                                sbLIZ.append("}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (c724710SblLJFF.LIZIZ.containsKey(c634030Ott) && interfaceC723730SaB != ((LinkedHashMap) c724710SblLJFF.LIZIZ).get(c634030Ott)) {
                                if (!C725080ScM.LIZ) {
                                    c724710SblLJFF.LIZIZ.remove(c634030Ott);
                                    c724710SblLJFF.LIZJ.remove(c634030Ott);
                                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                                    if (interfaceC723720SaA != null) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("(service=");
                                        sbLIZ2.append(cls);
                                        sbLIZ2.append(", serviceKey =");
                                        sbLIZ2.append(interfaceC723730SaB.LIZ());
                                        sbLIZ2.append(") has been already registered on service store. the service real instance is ");
                                        sbLIZ2.append(interfaceC723730SaB);
                                        sbLIZ2.append(", the registered service real instance is ");
                                        sbLIZ2.append(((LinkedHashMap) c724710SblLJFF.LIZIZ).get(c634030Ott));
                                        sbLIZ2.append(", currentMap info is ");
                                        sbLIZ2.append(c724710SblLJFF.LIZIZ);
                                        sbLIZ2.append("\",");
                                        interfaceC723720SaA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), new IllegalStateException());
                                    }
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("(service=");
                                    sbLIZ3.append(cls);
                                    sbLIZ3.append(", serviceKey =");
                                    sbLIZ3.append(interfaceC723730SaB.LIZ());
                                    sbLIZ3.append(") has been already registered on service store. the service real instance is ");
                                    sbLIZ3.append(interfaceC723730SaB);
                                    sbLIZ3.append(", the registered service real instance is ");
                                    sbLIZ3.append(((LinkedHashMap) c724710SblLJFF.LIZIZ).get(c634030Ott));
                                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            }
                            c724710SblLJFF.LIZIZ.put(c634030Ott, interfaceC723730SaB);
                            if (interfaceC723730SaB instanceof InterfaceC724720Sbm) {
                                InterfaceC447510Hgj interfaceC447510HgjLt = ((InterfaceC724720Sbm) interfaceC723730SaB).lt();
                                LiveData mutableLiveData = (LiveData) ((LinkedHashMap) c724710SblLJFF.LIZJ).get(c634030Ott);
                                if (mutableLiveData == null) {
                                    mutableLiveData = new MutableLiveData();
                                    c724710SblLJFF.LIZJ.put(c634030Ott, (MutableLiveData<? extends InterfaceC447510Hgj>) mutableLiveData);
                                }
                                if (mutableLiveData.getValue() == null) {
                                    if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                                        mutableLiveData.setValue(interfaceC447510HgjLt);
                                    } else {
                                        mutableLiveData.postValue(interfaceC447510HgjLt);
                                    }
                                }
                            }
                        } else {
                            "The serviceClazz must be super interface of this Assem".toString();
                            throw new IllegalStateException("The serviceClazz must be super interface of this Assem");
                        }
                    }
                } else if (interfaceC665370Q7z instanceof InterfaceC723730SaB) {
                    InterfaceC723730SaB interfaceC723730SaB2 = (InterfaceC723730SaB) interfaceC665370Q7z;
                    Class<?> superclass = interfaceC723730SaB2.getClass();
                    while (superclass != Object.class) {
                        Class<?>[] interfaces = superclass.getInterfaces();
                        ArrayList arrayList2 = new ArrayList();
                        for (Class<?> cls2 : interfaces) {
                            if (InterfaceC723730SaB.class.isAssignableFrom(cls2)) {
                                arrayList2.add(cls2);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            c724710SblLJFF.LIZLLL((Class) it3.next(), interfaceC723730SaB2);
                        }
                        superclass = superclass.getSuperclass();
                        if (superclass == null) {
                            break;
                        }
                    }
                }
            }
            C725410Sct c725410Sct2 = C725410Sct.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                if (arrayList3.size() > 0) {
                    Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().onEventEnd(c725410Sct2);
                    }
                }
                if (C725480Sd0.LIZ(c725410Sct2)) {
                    C725430Scv.LIZ(new C723640Sa2(c725410Sct2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), listLIZIZ));
                }
            }
            C723780SaG c723780SaG = this.LLILLJJLI;
            if (c723780SaG != null) {
                c723780SaG.LIZ(listLIZIZ);
                return;
            }
            Iterator it5 = listLIZIZ.iterator();
            while (it5.hasNext()) {
                AbstractC738140SxQ abstractC738140SxQ2 = (AbstractC738140SxQ) it5.next();
                assemSupervisor.LJII(abstractC738140SxQ2, null);
                if (abstractC724210Sax != null) {
                    abstractC724210Sax.LIZ(abstractC738140SxQ2);
                } else {
                    assemSupervisor.LIZIZ(abstractC738140SxQ2);
                }
            }
            return;
        }
        C0RUV<? extends AbstractC738140SxQ> config = abstractC738140SxQ.getConfig();
        abstractC738140SxQ.setConfig(c0ruv);
        abstractC738140SxQ.didUpdateConfig(config);
    }
}
