package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C11S5;
import X.C1701940uOG;
import X.C1C7U;
import X.C2341109Fh;
import X.C877403bo;
import X.C921103ir;
import X.InterfaceC919403ia;
import Y.AfS170S0100000_1;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusRequest;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBindingPollingManager {
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL;
    public final InterfaceC919403ia LJ;
    public boolean LJFF;
    public final PaymentBindingPollingManager$mHandler$1 LJI;

    public final void LIZ() {
        System.currentTimeMillis();
        sendEmptyMessage(1);
        sendEmptyMessageDelayed(2, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindingPollingManager$mHandler$1] */
    public PaymentBindingPollingManager(String str, String str2, Boolean bool, String str3, InterfaceC919403ia interfaceC919403ia) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bool;
        this.LIZLLL = str3;
        this.LJ = interfaceC919403ia;
        final Looper mainLooper = Looper.getMainLooper();
        this.LJI = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindingPollingManager$mHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("PaymentBindingPollingManager@a081.mHandler$1");
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        InterfaceC919403ia interfaceC919403ia2 = this.LL.LJ;
                        if (interfaceC919403ia2 != null) {
                            interfaceC919403ia2.LIZJ();
                        }
                        PaymentBindingPollingManager paymentBindingPollingManager = this.LL;
                        paymentBindingPollingManager.LJI.removeCallbacksAndMessages(null);
                        paymentBindingPollingManager.LJFF = true;
                    }
                } else {
                    PaymentBindingPollingManager paymentBindingPollingManager2 = this.LL;
                    paymentBindingPollingManager2.getClass();
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("queryBindStatus");
                    List listSingletonList = Collections.singletonList(paymentBindingPollingManager2.LIZ);
                    String str4 = paymentBindingPollingManager2.LIZIZ;
                    C921103ir c921103ir = C921103ir.LIZ;
                    String str5 = paymentBindingPollingManager2.LIZLLL;
                    c921103ir.getClass();
                    BindStatusRequest bindStatusRequest = new BindStatusRequest(listSingletonList, str4, C921103ir.LIZ(str5, "binding"));
                    PaymentApi.LIZ.getClass();
                    ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LIZIZ(bindStatusRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS170S0100000_1(paymentBindingPollingManager2, 14), new AfS170S0100000_1(paymentBindingPollingManager2, 15));
                }
                C1C7U.LIZIZ("PaymentBindingPollingManager@a081.mHandler$1");
            }
        };
    }
}
