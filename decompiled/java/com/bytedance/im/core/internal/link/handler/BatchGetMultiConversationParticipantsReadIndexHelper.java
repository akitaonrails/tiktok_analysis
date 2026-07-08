package com.bytedance.im.core.internal.link.handler;

import X.C0YD0;
import X.C0YEM;
import X.C0YJ9;
import X.C1C7U;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C870180YBs;
import X.C870470YCv;
import X.C870500YCy;
import X.C914130Ztb;
import X.C914150Ztd;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchGetMultiConversationParticipantsReadIndexHelper {
    public long LIZ;
    public long LIZIZ;
    public final C0YEM LIZJ;
    public final List<C869590Y9l> LIZLLL = new CopyOnWriteArrayList();
    public final Handler LJ = new AnonymousClass1(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.bytedance.im.core.internal.link.handler.BatchGetMultiConversationParticipantsReadIndexHelper$1, reason: invalid class name */
    public class AnonymousClass1 extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("BatchGetMultiConversationParticipantsReadIndexHelper@dd8f.<field>$1");
            if (message.what == 100) {
                C870180YBs c870180YBsLIZ = BatchGetMultiConversationParticipantsReadIndexHelper.this.LIZJ.LJIIZILJ().getDomain().LIZ();
                List<C869590Y9l> list = BatchGetMultiConversationParticipantsReadIndexHelper.this.LIZLLL;
                c870180YBsLIZ.LLILLL.LJIIZILJ().LIZ().LJ().LIZ(new C914150Ztd(this, 1), "on_get_ws_msg", list);
                ((CopyOnWriteArrayList) BatchGetMultiConversationParticipantsReadIndexHelper.this.LIZLLL).clear();
            }
            C1C7U.LIZIZ("BatchGetMultiConversationParticipantsReadIndexHelper@dd8f.<field>$1");
        }

        public AnonymousClass1(Looper looper) {
            super(looper);
        }
    }

    public BatchGetMultiConversationParticipantsReadIndexHelper(C0YEM c0yem) {
        this.LIZJ = c0yem;
    }

    public final void LIZIZ(long j) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("qos_read_receipt_perf");
        c0yj9.LIZ("-1", "mark_read_cost");
        c0yj9.LIZ(String.valueOf(j), "display_cost");
        c0yj9.LIZ("-1", "server_cost");
        c0yj9.LIZLLL();
    }

    public final void LIZ(C914150Ztd c914150Ztd, String str, List list) {
        ArrayList arrayList;
        C0YEM c0yem = this.LIZJ;
        C870500YCy c870500YCy = new C870500YCy(c0yem);
        C914130Ztb c914130Ztb = new C914130Ztb(c914150Ztd, new ArrayList(), c870500YCy, 3);
        ArrayList<List> arrayList2 = new ArrayList();
        int i = c0yem.LJIIIZ().LJJJJIZL.LIZIZ;
        int i2 = c0yem.LJIIIZ().LJJJJIZL.LIZJ;
        Iterator it2 = list.iterator();
        boolean z = false;
        loop0: while (true) {
            arrayList = null;
            while (it2.hasNext()) {
                C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                if (!str.equals("conv_update") && !str.equals("sdk_init")) {
                    if (!str.equals("message_model")) {
                        str.equals("on_get_ws_msg");
                    }
                } else if (c869590Y9l.getSender() != c870500YCy.LIZIZ.getUid()) {
                    continue;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c869590Y9l);
                if (i > 0 && !z) {
                    if (arrayList.size() == i) {
                        new C870470YCv(c870500YCy.LIZIZ, c914130Ztb).LJIIJJI(str, true, arrayList);
                        z = true;
                    }
                } else if (arrayList.size() == i2) {
                    arrayList2.add(arrayList);
                }
            }
            break loop0;
        }
        for (List list2 : arrayList2) {
            c870500YCy.LIZ++;
            new C870470YCv(c870500YCy.LIZIZ, c914130Ztb).LJIIJJI(str, false, list2);
        }
        if (arrayList != null) {
            c870500YCy.LIZ++;
            new C870470YCv(c870500YCy.LIZIZ, c914130Ztb).LJIIJJI(str, false, arrayList);
        }
    }

    public final void LIZJ(long j, long j2, String str, long j3, boolean z) {
        C869590Y9l c869590Y9lLJJJ;
        if (j > 0) {
            if (j2 > 0 && j3 > 0 && (this.LIZJ.LJIIIZ().LJJJJIZL.LIZ || z)) {
                Iterator it2 = ((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZ.LJIIJJI).iterator();
                while (it2.hasNext()) {
                    ((C0YD0) it2.next()).LIZ();
                }
            } else if (j2 > 0 && (c869590Y9lLJJJ = this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJ(j2)) != null) {
                ((CopyOnWriteArrayList) this.LIZLLL).add(c869590Y9lLJJJ);
                this.LIZ = SystemClock.elapsedRealtime();
                if (!this.LJ.hasMessages(100)) {
                    C786410Ut5.LJLJJI(100, this.LIZJ.LJIIIZ().LJJIJIIJIL, this.LJ);
                }
            }
        }
    }
}
