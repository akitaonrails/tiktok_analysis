package com.bytedance.globalpayment.iap.state;

import X.AbstractC1794360wnK;
import X.C1794160wn0;
import X.C1794240wn8;
import X.C1794250wn9;
import X.C1C7U;
import X.InterfaceC1794400wnO;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.globalpayment.iap.manager.QueryOrderStateManager;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* JADX INFO: loaded from: classes28.dex */
public abstract class BaseQueryOrderState extends AbstractC1794360wnK {
    public int LIZLLL;
    public QueryOrderStateManager LJ;
    public final C1794160wn0 LJFF;
    public final WorkHandler LJI;
    public boolean LJII;

    public final void LIZLLL() {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        AbstractC1794360wnK nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
        if (nextState != null) {
            nextState.LIZ(this.LIZ);
        }
    }

    public static class WorkHandler extends BPEAHandler {
        public final BaseQueryOrderState LL;

        public WorkHandler(BaseQueryOrderState baseQueryOrderState) {
            super(Looper.getMainLooper());
            this.LL = baseQueryOrderState;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("BaseQueryOrderState$WorkHandler@c22d.handleMessage");
            super.handleMessage(message);
            if (message.what == 1659) {
                this.LL.LIZLLL();
            }
            C1C7U.LIZIZ("BaseQueryOrderState$WorkHandler@c22d.handleMessage");
        }
    }

    public BaseQueryOrderState(InterfaceC1794400wnO interfaceC1794400wnO) {
        super(interfaceC1794400wnO);
        this.LIZLLL = 3;
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII();
        PaymentOnlineSettings paymentOnlineSettingsLIZIZ = C1794250wn9.LIZIZ();
        this.LJFF = new C1794160wn0(paymentOnlineSettingsLIZIZ.LJJII(), paymentOnlineSettingsLIZIZ.LIZLLL());
        this.LJI = new WorkHandler(this);
    }
}
