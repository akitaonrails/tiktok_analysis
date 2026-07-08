package com.bytedance.router.monitor.page;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class PageRouterDumper {
    public static final Companion Companion = new Companion();
    public Function1<? super StringBuilder, Unit> appendDump;
    public List<Object> ops = new ArrayList();
    public final Handler handler = new BPEAHandler(Looper.getMainLooper());
    public final Runnable dumpTask = new Runnable() { // from class: com.bytedance.router.monitor.page.PageRouterDumper$dumpTask$1
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("PageRouterDumper@e914.dumpTask$1");
            com_bytedance_router_monitor_page_PageRouterDumper$dumpTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("PageRouterDumper@e914.dumpTask$1");
        }

        public final void com_bytedance_router_monitor_page_PageRouterDumper$dumpTask$1__run$___twin___() {
            this.this$0.dumpOps();
        }

        public static void com_bytedance_router_monitor_page_PageRouterDumper$dumpTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(PageRouterDumper$dumpTask$1 pageRouterDumper$dumpTask$1) {
            try {
                pageRouterDumper$dumpTask$1.com_bytedance_router_monitor_page_PageRouterDumper$dumpTask$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };

    public static final class Companion {
    }

    public final void dumpOps() {
        List<Object> list = this.ops;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ActivityRouter) {
                arrayList.add(obj);
            }
        }
        List<Object> list2 = this.ops;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof ActivityOp) {
                arrayList2.add(obj2);
            }
        }
        List<Object> list3 = this.ops;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof FragmentRouter) {
                arrayList3.add(obj3);
            }
        }
        List<Object> list4 = this.ops;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list4) {
            if (obj4 instanceof FragmentOp) {
                arrayList4.add(obj4);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n| OPS Start: >>>>>>>>>>>>> ");
        List<Object> list5 = this.ops;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list5) {
            if ((obj5 instanceof ActivityOp) || (obj5 instanceof FragmentOp)) {
                arrayList5.add(obj5);
            }
        }
        for (Object obj6 : arrayList5) {
            String str = obj6 instanceof FragmentOp ? "f" : "a";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n\t > ");
            sbLIZ.append(str);
            sbLIZ.append("_op: ");
            sbLIZ.append(obj6);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append("\n| OPS End..: >>>>>>>>>>>>> \n| A/F Start: >>>>>>>>>>>>> ");
        for (Object obj7 : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\n\t > a: ");
            sbLIZ2.append(obj7);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        for (Object obj8 : arrayList3) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("\n\t > f: ");
            sbLIZ3.append(obj8);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        sb.append("\n| A/F End..: >>>>>>>>>>>>> ");
        Function1<? super StringBuilder, Unit> function1 = this.appendDump;
        if (function1 != null) {
            function1.invoke(sb);
        }
        C786410Ut5.LJLIIL(120000L, this.handler, this.dumpTask);
    }

    public final void startDump() {
        C786410Ut5.LJLIIL(120000L, this.handler, this.dumpTask);
    }

    public final Function1<StringBuilder, Unit> getAppendDump() {
        return this.appendDump;
    }

    public final void addOp(Object obj) {
        if (!RouterPageEventDispatcher.Companion.getSDebug()) {
            return;
        }
        this.ops.add(obj);
    }

    public final void setAppendDump(Function1<? super StringBuilder, Unit> function1) {
        this.appendDump = function1;
    }
}
