package com.bytedance.globalpayment.iap.google.state;

import X.C0NCG;
import X.C1152610g6F;
import X.C1792840wks;
import X.C1794240wn8;
import X.C1794390wnN;
import X.C1794740wnw;
import X.C1794770wnz;
import X.C1795020woO;
import X.C1795210woh;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC1794750wnx;
import X.EnumC1794760wny;
import X.InterfaceC1795750wpZ;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class GooglePaymentHandlerV2 {
    public static final GooglePaymentHandlerV2 LIZ = new GooglePaymentHandlerV2();
    public static final Long LIZIZ;
    public static GooglePaymentHandlerV2$sendMsg$1 LIZJ;
    public static EnumC1794760wny LIZLLL;
    public static final C1794740wnw LJ;
    public static InterfaceC1795750wpZ LJFF;
    public static List<Long> LJI;
    public static String LJII;

    static {
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        LIZIZ = c1152610g6F.LIZJ.iap_activity_delay_timestamp;
        LIZLLL = EnumC1794760wny.NONE;
        LJ = C1794740wnw.LIZ;
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        do {
            arrayList.add(0L);
            i++;
        } while (i < 5);
        LJI = arrayList;
        LJII = "";
    }

    public static void LIZ(EnumC1794760wny enumC1794760wny) {
        GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$1;
        GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$12;
        int i = C1794770wnz.LIZ[enumC1794760wny.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            int iOrdinal = C0NCG.BILLING_CASHIER_DESTROY.ordinal();
                            GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$13 = LIZJ;
                            if (googlePaymentHandlerV2$sendMsg$13 != null && googlePaymentHandlerV2$sendMsg$13.hasMessages(iOrdinal) && (googlePaymentHandlerV2$sendMsg$12 = LIZJ) != null) {
                                googlePaymentHandlerV2$sendMsg$12.removeMessages(iOrdinal);
                            }
                            ListProtector.set(LJI, EnumC1794750wnx.PURCHASE_COMPLETED.ordinal(), Long.valueOf(System.currentTimeMillis()));
                            LJ.getClass();
                            C1794740wnw.LIZLLL = 0L;
                            C1794740wnw.LIZJ = 0;
                            C1794390wnN c1794390wnN = C1794740wnw.LJI;
                            if (c1794390wnN != null) {
                                boolean z = C1794740wnw.LIZIZ.get();
                                c1794390wnN.LIZLLL(Integer.valueOf(C1794740wnw.LIZJ), Integer.valueOf(C1794740wnw.LJFF), Boolean.valueOf(z), "livesdk_iap_google_pay_release_purchase_lock");
                            }
                            C1794740wnw.LJI = null;
                            C1794740wnw.LIZIZ.compareAndSet(true, false);
                        }
                    } else {
                        if (LIZLLL == EnumC1794760wny.CASHIER_RESUME) {
                            LIZIZ(C0NCG.BILLING_CASHIER_DESTROY.ordinal());
                        }
                        ListProtector.set(LJI, EnumC1794750wnx.CASHIER_DESTROY.ordinal(), Long.valueOf(System.currentTimeMillis()));
                    }
                } else {
                    int iOrdinal2 = C0NCG.BILLING_CASHIER_RESUME.ordinal();
                    GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$14 = LIZJ;
                    if (googlePaymentHandlerV2$sendMsg$14 != null && googlePaymentHandlerV2$sendMsg$14.hasMessages(iOrdinal2) && (googlePaymentHandlerV2$sendMsg$1 = LIZJ) != null) {
                        googlePaymentHandlerV2$sendMsg$1.removeMessages(iOrdinal2);
                    }
                    ListProtector.set(LJI, EnumC1794750wnx.CASHIER_RESUME.ordinal(), Long.valueOf(System.currentTimeMillis()));
                }
            } else {
                LIZIZ(C0NCG.BILLING_CASHIER_RESUME.ordinal());
                ListProtector.set(LJI, EnumC1794750wnx.LAUNCH_CASHIER_API.ordinal(), Long.valueOf(System.currentTimeMillis()));
            }
        } else {
            LJ.getClass();
            C1794740wnw.LIZJ = 0;
            C1794740wnw.LIZLLL = System.currentTimeMillis();
            C1794390wnN c1794390wnN2 = C1794740wnw.LJI;
            if (c1794390wnN2 != null) {
                boolean z2 = C1794740wnw.LIZIZ.get();
                c1794390wnN2.LIZLLL(Integer.valueOf(C1794740wnw.LIZJ), Integer.valueOf(C1794740wnw.LJFF), Boolean.valueOf(z2), "livesdk_iap_google_pay_start_purchase_lock");
            }
            C1794740wnw.LIZIZ.compareAndSet(false, true);
            LJFF = null;
            LJII = "";
            LIZLLL = EnumC1794760wny.START_CASHIER;
            ArrayList arrayList = new ArrayList(5);
            do {
                arrayList.add(0L);
                i2++;
            } while (i2 < 5);
            LJI = arrayList;
            ListProtector.set(arrayList, EnumC1794750wnx.START_CASHIER.ordinal(), Long.valueOf(System.currentTimeMillis()));
        }
        if (LIZLLL.ordinal() < enumC1794760wny.ordinal()) {
            LIZLLL = enumC1794760wny;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2$sendMsg$1] */
    public static void LIZIZ(int i) {
        GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$1;
        Message messageObtainMessage;
        if (LIZJ == null) {
            final Looper mainLooper = Looper.getMainLooper();
            LIZJ = new BPEAHandler(mainLooper) { // from class: com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2$sendMsg$1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("GooglePaymentHandlerV2@f39.sendMsg$1");
                    String string = message.getData().getString("unique_payment_id", "");
                    GooglePaymentHandlerV2 googlePaymentHandlerV2 = GooglePaymentHandlerV2.LIZ;
                    int i2 = message.what;
                    if (Intrinsics.LJFF(string, GooglePaymentHandlerV2.LJII)) {
                        if (i2 == C0NCG.BILLING_CASHIER_RESUME.ordinal() && GooglePaymentHandlerV2.LIZLLL == EnumC1794760wny.LAUNCH_CASHIER_API) {
                            C1792840wks c1792840wksLIZIZ = C1795020woO.LIZIZ(2034, 2034, "cashier shown timeout");
                            InterfaceC1795750wpZ interfaceC1795750wpZ = GooglePaymentHandlerV2.LJFF;
                            if (interfaceC1795750wpZ != null) {
                                interfaceC1795750wpZ.LJ(c1792840wksLIZIZ, null, null);
                            }
                            GooglePaymentHandlerV2.LIZ(EnumC1794760wny.PURCHASE_COMPLETED);
                        }
                        if (i2 == C0NCG.BILLING_CASHIER_DESTROY.ordinal() && GooglePaymentHandlerV2.LIZLLL == EnumC1794760wny.CASHIER_DESTROY) {
                            C1792840wks c1792840wksLIZIZ2 = C1795020woO.LIZIZ(2035, 2035, "gp cashier callback timeout");
                            InterfaceC1795750wpZ interfaceC1795750wpZ2 = GooglePaymentHandlerV2.LJFF;
                            if (interfaceC1795750wpZ2 != null) {
                                interfaceC1795750wpZ2.LJ(c1792840wksLIZIZ2, null, null);
                            }
                            GooglePaymentHandlerV2.LIZ(EnumC1794760wny.PURCHASE_COMPLETED);
                        }
                    }
                    C1C7U.LIZIZ("GooglePaymentHandlerV2@f39.sendMsg$1");
                }
            };
        }
        if (LJII != null && (googlePaymentHandlerV2$sendMsg$1 = LIZJ) != null && (messageObtainMessage = googlePaymentHandlerV2$sendMsg$1.obtainMessage()) != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("unique_payment_id", LJII, bundle);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.what = i;
            GooglePaymentHandlerV2$sendMsg$1 googlePaymentHandlerV2$sendMsg$12 = LIZJ;
            if (googlePaymentHandlerV2$sendMsg$12 != null) {
                C786410Ut5.LJLJLJ(googlePaymentHandlerV2$sendMsg$12, messageObtainMessage, LIZIZ.longValue());
            }
        }
    }
}
