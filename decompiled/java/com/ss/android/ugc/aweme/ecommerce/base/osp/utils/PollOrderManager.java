package com.ss.android.ugc.aweme.ecommerce.base.osp.utils;

import X.C03WX;
import X.C0PEM;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C817503Hh;
import X.C829403Lw;
import X.InterfaceC829603Ly;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class PollOrderManager {
    public WorkHandler LIZ;
    public C03WX LIZIZ;
    public PollOrderStatusRequest LIZJ;
    public InterfaceC829603Ly LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        WorkHandler workHandler = this.LIZ;
        if (workHandler != null) {
            workHandler.removeMessages(101);
        }
        WorkHandler workHandler2 = this.LIZ;
        if (workHandler2 != null) {
            workHandler2.removeMessages(201);
        }
        WorkHandler workHandler3 = this.LIZ;
        if (workHandler3 != null) {
            workHandler3.removeMessages(301);
        }
        C03WX c03wx = this.LIZIZ;
        if (c03wx != null) {
            c03wx.LJJIJL();
        }
    }

    public static final class WorkHandler extends BPEAHandler {
        public final PollOrderManager LL;

        public WorkHandler(PollOrderManager pollOrderManager) {
            super(Looper.getMainLooper());
            this.LL = pollOrderManager;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            InterfaceC829603Ly interfaceC829603Ly;
            C1C7U.LIZ("PollOrderManager$WorkHandler@50be.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            if (i == 101) {
                PollOrderManager pollOrderManager = this.LL;
                InterfaceC829603Ly interfaceC829603Ly2 = pollOrderManager.LIZLLL;
                if (interfaceC829603Ly2 != null) {
                    interfaceC829603Ly2.LIZJ();
                }
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C829403Lw(pollOrderManager, null), 2);
            } else if (i == 201) {
                InterfaceC829603Ly interfaceC829603Ly3 = this.LL.LIZLLL;
                if (interfaceC829603Ly3 != null) {
                    interfaceC829603Ly3.LJFF();
                }
            } else if (i == 301 && (interfaceC829603Ly = this.LL.LIZLLL) != null) {
                interfaceC829603Ly.LIZIZ();
            }
            C1C7U.LIZIZ("PollOrderManager$WorkHandler@50be.handleMessage");
        }
    }

    public final void LIZIZ(C03WX c03wx, InterfaceC829603Ly interfaceC829603Ly) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZIZ = c03wx;
        this.LIZ = new WorkHandler(this);
        this.LIZLLL = interfaceC829603Ly;
        LIZ();
    }

    public final void LIZJ(long j, PollOrderStatusRequest pollOrderStatusRequest) {
        WorkHandler workHandler;
        this.LIZJ = pollOrderStatusRequest;
        WorkHandler workHandler2 = this.LIZ;
        if (workHandler2 != null) {
            workHandler2.sendEmptyMessage(101);
        }
        if (j > 0 && (workHandler = this.LIZ) != null) {
            workHandler.sendEmptyMessageDelayed(201, j);
        }
    }
}
