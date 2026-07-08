package com.bytedance.globalpayment.iap.google.state;

import X.AbstractC1794360wnK;
import X.C1792170wjn;
import X.C1792910wkz;
import X.C1793950wmf;
import X.C1793980wmi;
import X.C1794240wn8;
import X.C1794310wnF;
import X.C1794390wnN;
import X.C1794480wnW;
import X.C1794660wno;
import X.C1794670wnp;
import X.C1794740wnw;
import X.C1794820wo4;
import X.C1795210woh;
import X.C1795340wou;
import X.C1C7U;
import X.C2085008Eu;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC1791830wjF;
import X.EnumC1794330wnH;
import X.EnumC1794620wnk;
import X.InterfaceC1794350wnJ;
import X.InterfaceC1794400wnO;
import X.InterfaceC1795240wok;
import X.InterfaceC1796310wqT;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class GooglePayState extends AbstractC1794360wnK {
    public Activity LIZLLL;
    public final WorkHandler LJ;

    public static class WorkHandler extends BPEAHandler {
        public WorkHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("GooglePayState$WorkHandler@2af0.handleMessage");
            super.handleMessage(message);
            if (message.what == 1435) {
                PaymentServiceManager.get().getIapExternalService().onOrderTimeout((C1793950wmf) HandlerHook.getMessageObj(message.obj));
            }
            C1C7U.LIZIZ("GooglePayState$WorkHandler@2af0.handleMessage");
        }
    }

    @Override // X.AbstractC1794360wnK
    public final EnumC1794620wnk LIZJ() {
        return EnumC1794620wnk.PerformPay;
    }

    @Override // X.AbstractC1794360wnK
    public final void LIZ(C1794480wnW c1794480wnW) {
        long j;
        String strJ3;
        this.LIZ = c1794480wnW;
        c1794480wnW.getClass();
        if (c1794480wnW.LJIJJ) {
            return;
        }
        final Activity activity = this.LIZLLL;
        String str = c1794480wnW.LIZJ;
        String strLIZLLL = c1794480wnW.LIZLLL();
        C1792170wjn c1792170wjn = c1794480wnW.LIZ;
        String str2 = c1792170wjn.LIZIZ;
        String str3 = c1794480wnW.LJIIL.LJII;
        String str4 = c1792170wjn.LJIILIIL;
        boolean z = c1792170wjn.LJII;
        C1794660wno c1794660wno = new C1794660wno(str, strLIZLLL, str2, str3, str4, z, this.LIZ.LJIILIIL, c1792170wjn.LJI, c1794480wnW.LIZIZ);
        c1794480wnW.LJIILL = SystemClock.uptimeMillis();
        c1794660wno.LIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("payment_attempt_id", c1794660wno.LJIIJJI, jSONObject);
        C1793980wmi.LIZIZ("client_flow", c1794660wno.LJIIL, jSONObject);
        C1793980wmi.LIZIZ("product_id", str, jSONObject);
        C1793980wmi.LIZIZ("request_id", strLIZLLL, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("pay_type", c1794660wno.LJIIIIZZ, jSONObject2);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        C1793980wmi.LIZ("is_subscription", j, jSONObject2);
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject2);
        C1793980wmi.LIZIZ("merchant_id", c1794660wno.LJI, jSONObject2);
        C1793980wmi.LIZIZ("biz_content", c1794660wno.LJIIJ, jSONObject2);
        C1793980wmi.LIZIZ("channel_api_version", C1792910wkz.LIZ, jSONObject2);
        C1793980wmi.LIZIZ("channel_sdk_version", C1792910wkz.LIZIZ, jSONObject2);
        C1794660wno.LIZLLL(jSONObject2);
        HashMap<String, ?> map = c1794660wno.LJIIIZ;
        if (map != null) {
            c1794660wno.LIZJ(map, jSONObject2);
        }
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_add_payment", jSONObject2, null, jSONObject);
        Application application = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ;
        if (application != null) {
            String strLIZLLL2 = c1794480wnW.LIZLLL();
            C1792170wjn c1792170wjn2 = c1794480wnW.LIZ;
            String str5 = c1792170wjn2.LIZIZ;
            String str6 = c1792170wjn2.LJ;
            String str7 = c1792170wjn2.LJIIJ;
            if (C1794820wo4.LIZ == null) {
                C1794820wo4.LIZ = C810670Vr7.LIZJ(application, 0, "payload_prefs");
            }
            SharedPreferences.Editor editorEdit = C1794820wo4.LIZ.edit();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_google_pay_");
            sbLIZ.append(strLIZLLL2);
            String strLIZ = C2085008Eu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(C2085008Eu.LIZ("order_id"), C1794820wo4.LIZIZ(strLIZLLL2));
                jSONObject3.put(C2085008Eu.LIZ("merchant_id"), C1794820wo4.LIZIZ(str5));
                jSONObject3.put(C2085008Eu.LIZ("user_id"), C1794820wo4.LIZIZ(str6));
                jSONObject3.put(C2085008Eu.LIZ("extra_payload"), C1794820wo4.LIZIZ(str7));
                strJ3 = C786410Ut5.J3(jSONObject3);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                strJ3 = "";
            }
            editorEdit.putString(strLIZ, strJ3).apply();
        }
        InterfaceC1795240wok interfaceC1795240wokLJI = C1795340wou.LJI();
        final String str8 = c1794480wnW.LIZJ;
        final boolean z2 = c1794480wnW.LIZ.LJII;
        final C1794480wnW c1794480wnW2 = this.LIZ;
        final C1794670wnp c1794670wnp = new C1794670wnp(this, c1794660wno, c1794480wnW2);
        final C1795340wou c1795340wou = (C1795340wou) interfaceC1795240wokLJI;
        c1795340wou.LJIIIIZZ.getClass();
        C1794390wnN c1794390wnN = new C1794390wnN(c1794480wnW2, z2);
        GooglePaymentHandlerV2.LJ.getClass();
        if (C1794740wnw.LJI == null) {
            C1794740wnw.LJI = c1794390wnN;
        }
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0wnr
            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                c1795340wou.LJIIIIZZ.getClass();
                GooglePaymentHandlerV2.LJ.getClass();
                C1794390wnN c1794390wnN2 = C1794740wnw.LJI;
                if (c1794390wnN2 != null) {
                    boolean z3 = C1794740wnw.LIZIZ.get();
                    c1794390wnN2.LIZLLL(Integer.valueOf(C1794740wnw.LIZJ), Integer.valueOf(C1794740wnw.LJFF), Boolean.valueOf(z3), "livesdk_iap_google_pay_check_can_purchase");
                }
                boolean z4 = true;
                if (C1794740wnw.LIZIZ.get()) {
                    if (C1794740wnw.LIZJ < C1794740wnw.LJFF || System.currentTimeMillis() - C1794740wnw.LIZLLL <= C1794740wnw.LJ) {
                        C1794740wnw.LIZJ++;
                        z4 = false;
                    } else {
                        C1794700wns.LJ().getClass();
                        InterfaceC1794350wnJ interfaceC1794350wnJLJ2 = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
                        EnumC1794330wnH enumC1794330wnH2 = EnumC1794330wnH.BOTH;
                        C1794310wnF c1794310wnF2 = (C1794310wnF) interfaceC1794350wnJLJ2;
                        c1794310wnF2.getClass();
                        c1794310wnF2.LIZ(enumC1794330wnH2, "livesdk_iap_release_retry_lock", null, null, null);
                    }
                }
                if (!z4) {
                    C1794700wns c1794700wnsLJ = C1794700wns.LJ();
                    C1794480wnW c1794480wnW3 = c1794480wnW2;
                    c1794700wnsLJ.getClass();
                    JSONObject jSONObject4 = new JSONObject();
                    C1793980wmi.LIZIZ("request_id", c1794480wnW3.LIZLLL(), jSONObject4);
                    C1793980wmi.LIZIZ("product_id", c1794480wnW3.LIZJ, jSONObject4);
                    C1793980wmi.LIZ("pay_type", EnumC1794260wnA.NOMAL.getValue(), jSONObject4);
                    C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject4);
                    C1793980wmi.LIZIZ("channel_api_version", C1792910wkz.LIZ, jSONObject4);
                    C1793980wmi.LIZIZ("channel_sdk_version", C1792910wkz.LIZIZ, jSONObject4);
                    C1792170wjn c1792170wjn3 = c1794480wnW3.LIZ;
                    if (c1792170wjn3 != null) {
                        c1794700wnsLJ.LIZJ(c1792170wjn3.LJI, jSONObject4);
                    }
                    InterfaceC1794350wnJ interfaceC1794350wnJLJ3 = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
                    EnumC1794330wnH enumC1794330wnH3 = EnumC1794330wnH.BOTH;
                    C1794310wnF c1794310wnF3 = (C1794310wnF) interfaceC1794350wnJLJ3;
                    c1794310wnF3.getClass();
                    C1794940woG.LIZ(c1794310wnF3, enumC1794330wnH3, "livesdk_iap_add_payment_failure", jSONObject4);
                    c1794670wnp.LJ(C1795020woO.LIZIZ(2030, 2030, "purchase failure due to lock"), null, null);
                    return;
                }
                GooglePaymentHandlerV2 googlePaymentHandlerV2 = c1795340wou.LJIIIIZZ;
                EnumC1794760wny enumC1794760wny = EnumC1794760wny.START_CASHIER;
                googlePaymentHandlerV2.getClass();
                GooglePaymentHandlerV2.LIZ(enumC1794760wny);
                try {
                    c1795340wou.LJIIIZ(activity, str8, z2, c1794480wnW2, c1794670wnp);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1792840wks c1792840wksLIZIZ = C1795020woO.LIZIZ(2031, 2031, e2.toString());
                    GooglePaymentHandlerV2 googlePaymentHandlerV22 = c1795340wou.LJIIIIZZ;
                    InterfaceC1795750wpZ interfaceC1795750wpZ = c1794670wnp;
                    String strLJ = c1794480wnW2.LJ();
                    googlePaymentHandlerV22.getClass();
                    GooglePaymentHandlerV2.LJFF = interfaceC1795750wpZ;
                    GooglePaymentHandlerV2.LJII = strLJ;
                    c1795340wou.LJIIIIZZ.getClass();
                    InterfaceC1795750wpZ interfaceC1795750wpZ2 = GooglePaymentHandlerV2.LJFF;
                    if (interfaceC1795750wpZ2 != null) {
                        interfaceC1795750wpZ2.LJ(c1792840wksLIZIZ, null, null);
                    }
                    c1795340wou.LJIIIIZZ.getClass();
                    GooglePaymentHandlerV2.LIZ(EnumC1794760wny.PURCHASE_COMPLETED);
                }
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                InterfaceC1795750wpZ interfaceC1795750wpZ = c1794670wnp;
                if (interfaceC1795750wpZ != null) {
                    interfaceC1795750wpZ.LJ(c1792840wks, null, null);
                }
            }
        });
    }

    public GooglePayState(InterfaceC1794400wnO interfaceC1794400wnO, Activity activity) {
        super(interfaceC1794400wnO);
        this.LIZLLL = activity;
        this.LJ = new WorkHandler();
    }
}
