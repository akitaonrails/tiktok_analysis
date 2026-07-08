package com.ss.android.ugc.aweme.notification.frequency;

import X.C050T;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC1902550zbp;
import X.InterfaceC1902560zbq;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeReportBehaviorModel implements InterfaceC1902550zbp, InterfaceC1902560zbq {
    public final C050T LIZ;
    public HandlerThread LIZLLL;
    public Handler LJ;
    public volatile boolean LJFF;
    public final CopyOnWriteArrayList<Pair<BaseNotice, NoticeFrequencyControlConfig>> LIZIZ = new CopyOnWriteArrayList<>();
    public final String LIZJ = "Report";
    public String LJI = "";

    public static class ReportHandler extends BPEAHandler {
        public final Function0<Unit> LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("NoticeReportBehaviorModel$ReportHandler@c8f3.handleMessage");
            super.handleMessage(message);
            this.LL.invoke();
            C1C7U.LIZIZ("NoticeReportBehaviorModel$ReportHandler@c8f3.handleMessage");
        }

        public ReportHandler(Looper looper, AwS572S0100000_28 awS572S0100000_28) {
            super(looper);
            this.LL = awS572S0100000_28;
        }
    }

    public NoticeReportBehaviorModel(C050T c050t) {
        this.LIZ = c050t;
    }

    public final void LIZ(boolean z) {
        Handler handler;
        long j;
        if (!this.LIZIZ.isEmpty() && !this.LJFF) {
            Handler handler2 = this.LJ;
            if (handler2 != null && !handler2.hasMessages(1) && (handler = this.LJ) != null) {
                if (z) {
                    j = 0;
                } else {
                    j = 2000;
                }
                C786410Ut5.LJLJJI(1, j, handler);
                return;
            }
            return;
        }
        Handler handler3 = this.LJ;
        if (handler3 != null) {
            handler3.removeMessages(1);
        }
    }
}
