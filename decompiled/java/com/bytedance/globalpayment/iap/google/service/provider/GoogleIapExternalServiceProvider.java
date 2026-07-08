package com.bytedance.globalpayment.iap.google.service.provider;

import X.AbstractC1791620wiu;
import X.AbstractC1794360wnK;
import X.C1792050wjb;
import X.C1792840wks;
import X.C1792910wkz;
import X.C1794240wn8;
import X.C1794310wnF;
import X.C1795000woM;
import X.C1795060woS;
import X.C1795070woT;
import X.C1795090woV;
import X.C1795210woh;
import X.C1795340wou;
import X.C1795410wp1;
import X.C1795440wp4;
import X.C1795710wpV;
import X.C1795950wpt;
import X.C1795990wpx;
import X.C1796000wpy;
import X.C1796080wq6;
import X.C1796140wqC;
import X.C1796240wqM;
import X.C1797800wss;
import X.C19885612rG;
import X.C1AF0;
import X.C1BAY;
import X.C786410Ut5;
import X.EnumC1794330wnH;
import X.InterfaceC1792890wkx;
import X.InterfaceC1794400wnO;
import X.InterfaceC1794730wnv;
import X.InterfaceC1794840wo6;
import X.InterfaceC1795130woZ;
import X.InterfaceC1795140woa;
import X.InterfaceC1795150wob;
import X.InterfaceC1795160woc;
import X.InterfaceC1796280wqQ;
import X.InterfaceC1796310wqT;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.service.PayloadPreferencesServiceImpl;
import com.bytedance.globalpayment.iap.google.state.GooglePayState;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class GoogleIapExternalServiceProvider implements GoogleIapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public String getBillingCountryCode() {
        C1796080wq6 c1796080wq6 = ((C1795340wou) C1795340wou.LJI()).LJIIIZ;
        return c1796080wq6 == null ? "" : c1796080wq6.LIZ;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return PayloadPreferencesServiceImpl.getInstance();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return RestoreOrderService.getIns(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        Boolean boolValueOf;
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        if (!c1795340wou.LJIILLIIL) {
            return false;
        }
        C1BAY c1bay = c1795340wou.LJIILIIL;
        if (c1bay == null) {
            boolValueOf = Boolean.FALSE;
        } else {
            boolValueOf = Boolean.valueOf(c1bay.LJII("fff").LIZ != -2);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void loadBillingConfig() {
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0wq2
            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                c1795340wou.LJIIJ(true, null);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0wpI] */
    private void initGoogleBilling(final InterfaceC1796280wqQ interfaceC1796280wqQ) {
        final ?? r4 = new InterfaceC1796280wqQ() { // from class: X.0wpI
            @Override // X.InterfaceC1796280wqQ
            public final void LIZ(String str) {
                interfaceC1796280wqQ.LIZ(str);
            }

            @Override // X.InterfaceC1796280wqQ
            public final void LIZIZ(C1792840wks c1792840wks) {
                boolean z;
                Boolean boolValueOf;
                C1795340wou.LJI().getClass();
                if (c1792840wks.LIZ == 0) {
                    C1BAY c1bay = ((C1795340wou) C1795340wou.LJI()).LJIILIIL;
                    if (c1bay == null) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        if (c1bay.LJII("fff").LIZ != -2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    if (boolValueOf.booleanValue()) {
                        this.LIZIZ.setBillingVersionTracking("billing_success", C1527930prb.LIZ);
                    } else {
                        this.LIZIZ.setBillingVersionTracking("billing_feature_not_supported", C1527930prb.LIZ);
                    }
                } else {
                    this.LIZIZ.setBillingVersionTracking("billing_unavailable", C1527930prb.LIZ);
                }
                interfaceC1796280wqQ.LIZIZ(c1792840wks);
            }
        };
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        c1795340wou.LJIIJ = Boolean.valueOf(C1795410wp1.LIZLLL("live_iap_google_auto_service_reconnection").equals("true"));
        if (c1795340wou.LJIILIIL == null) {
            C1795990wpx c1795990wpx = new C1795990wpx();
            c1795990wpx.LIZ = true;
            C1796240wqM c1796240wqMLIZ = c1795990wpx.LIZ();
            C1797800wss c1797800wss = new C1797800wss(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ);
            c1797800wss.LIZIZ();
            c1797800wss.LIZJ = c1795340wou;
            c1797800wss.LIZ = c1796240wqMLIZ;
            if (c1795340wou.LJIIJ.booleanValue()) {
                c1797800wss.LJII = true;
            }
            c1795340wou.LJIILIIL = c1797800wss.LIZ();
        }
        C1795340wou.LJIIZILJ = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZ;
        c1795340wou.LJFF.add(c1795340wou.LJIIJJI);
        InterfaceC1796310wqT interfaceC1796310wqT = new InterfaceC1796310wqT() { // from class: X.0wpn
            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                C1795340wou c1795340wou2 = c1795340wou;
                c1795340wou2.LJIILLIIL = true;
                c1795340wou2.LJIIJ(true, r4);
                C1792840wks c1792840wks = new C1792840wks();
                c1792840wks.LIZ = 0;
                r4.LIZIZ(c1792840wks);
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                r4.LIZIZ(c1792840wks);
            }
        };
        if (c1795340wou.LJIIJ.booleanValue()) {
            c1795340wou.LJFF.add(interfaceC1796310wqT);
            if (!c1795340wou.LJIILL.getAndSet(true)) {
                c1795340wou.LJIILIIL.LJIILIIL(c1795340wou.LJIIL);
                return;
            }
            return;
        }
        c1795340wou.LIZ(interfaceC1796310wqT);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void checkExternalLinkEligibility(final InterfaceC1795130woZ interfaceC1795130woZ) {
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0woq
            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                final C1795340wou c1795340wou2 = c1795340wou;
                final InterfaceC1795130woZ interfaceC1795130woZ2 = interfaceC1795130woZ;
                c1795340wou2.getClass();
                c1795340wou2.LJIILIIL.LJI(new InterfaceC2200191B9d() { // from class: X.0wop
                    @Override // X.InterfaceC2200191B9d
                    public final void LIZ(C19885612rG c19885612rG) {
                        C1792840wks c1792840wks;
                        C1795340wou c1795340wou3 = c1795340wou2;
                        InterfaceC1795130woZ interfaceC1795130woZ3 = interfaceC1795130woZ2;
                        c1795340wou3.getClass();
                        int i = c19885612rG.LIZ;
                        if (i != 0) {
                            c1792840wks = new C1792840wks(401, i, C1792840wks.LIZLLL(i, c19885612rG.LIZJ), c19885612rG.LIZJ);
                            C1795340wou.LJIIL(c1792840wks);
                        } else {
                            c1792840wks = new C1792840wks(0, i, c19885612rG.LIZJ);
                        }
                        interfaceC1795130woZ3.LIZ(c1792840wks);
                    }
                });
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                int i = c1792840wks.LIZ;
                C1792840wks c1792840wks2 = new C1792840wks(401, i, C1792840wks.LIZLLL(i, c1792840wks.LJ), c1792840wks.LJ);
                c1795340wou.getClass();
                C1795340wou.LJIIL(c1792840wks2);
                interfaceC1795130woZ.LIZ(c1792840wks2);
            }
        });
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void getExternalLinkToken(InterfaceC1795140woa interfaceC1795140woa) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new C1795710wpV(c1795340wou, interfaceC1795140woa));
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(InterfaceC1796280wqQ interfaceC1796280wqQ) {
        initGoogleBilling(interfaceC1796280wqQ);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void isFeatureSupported(final InterfaceC1795160woc interfaceC1795160woc) {
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0woU
            public final /* synthetic */ String LIZ = "fff";

            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                C1792840wks c1792840wks;
                C1BAY c1bay = c1795340wou.LJIILIIL;
                if (c1bay == null) {
                    C1AF0.LIZJ("Billing Client is null");
                    return;
                }
                C19885612rG c19885612rGLJII = c1bay.LJII(this.LIZ);
                int i = c19885612rGLJII.LIZ;
                if (i == 0) {
                    c1792840wks = new C1792840wks(0, i, c19885612rGLJII.LIZJ);
                } else {
                    c1792840wks = new C1792840wks(200, i, c19885612rGLJII.LIZJ);
                    ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
                    if (C1795410wp1.LJFF()) {
                        C1792050wjb.LIZ(c1792840wks);
                    }
                }
                interfaceC1795160woc.LIZ(c1792840wks);
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                int i = c1792840wks.LIZ;
                C1792840wks c1792840wks2 = new C1792840wks(200, i, C1792840wks.LIZLLL(i, c1792840wks.LJ), c1792840wks.LJ);
                ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
                if (C1795410wp1.LJFF()) {
                    C1792050wjb.LIZ(c1792840wks2);
                }
                interfaceC1795160woc.LIZ(c1792840wks2);
            }
        });
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts(InterfaceC1794730wnv interfaceC1794730wnv) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        C1795090woV c1795090woV = new C1795090woV();
        c1795090woV.LIZ = "subs";
        c1795340wou.LIZ(new C1795060woS(c1795340wou, c1795090woV.LIZ(), interfaceC1794730wnv));
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(InterfaceC1794840wo6 interfaceC1794840wo6) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        if (c1795340wou.LJIILJJIL == null) {
            c1795340wou.LJIILJJIL = interfaceC1794840wo6;
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void checkPaymentEnvironment(InterfaceC1795160woc interfaceC1795160woc, Context context) {
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 1);
            if (C786410Ut5.b4(GoogleApiAvailability.getInstance(), context) != 0) {
                C1792840wks c1792840wks = new C1792840wks(200, 2001, "failure due to no google play services");
                ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
                if (C1795410wp1.LJFF()) {
                    C1792050wjb.LIZ(c1792840wks);
                }
                interfaceC1795160woc.LIZ(c1792840wks);
                return;
            }
            isFeatureSupported(interfaceC1795160woc);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C1792840wks c1792840wks2 = new C1792840wks(200, 2000, "failure due to no google play store package");
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
            if (C1795410wp1.LJFF()) {
                C1792050wjb.LIZ(c1792840wks2);
            }
            interfaceC1795160woc.LIZ(c1792840wks2);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC1794360wnK getGoogleState(InterfaceC1794400wnO interfaceC1794400wnO, Activity activity) {
        return new GooglePayState(interfaceC1794400wnO, activity);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC1794840wo6 interfaceC1794840wo6, String str) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new C1795070woT(c1795340wou, interfaceC1794840wo6, str));
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setBillingVersionTracking(String str, String str2) {
        C1792910wkz.LIZ = str;
        C1792910wkz.LIZIZ = str2;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void triggerInAppMessages(Activity activity, String str) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inapp_message_trigger_entrance", str);
            jSONObject.put("inapp_message_trigger_id", UUID.randomUUID().toString());
            ((C1794310wnF) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ()).LIZ(EnumC1794330wnH.BOTH, "livesdk_iap_inapp_message_trigger", jSONObject, null, null);
            C1796000wpy c1796000wpy = new C1796000wpy();
            ((HashSet) c1796000wpy.LIZ).add(2);
            C19885612rG c19885612rGLJIILL = c1795340wou.LJIILIIL.LJIILL(activity, new C1795950wpt(c1796000wpy.LIZ), new C1796140wqC(jSONObject));
            try {
                jSONObject.put("result_code", c19885612rGLJIILL.LIZ);
                jSONObject.put("detail_code", c19885612rGLJIILL.LIZJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("");
            }
            ((C1794310wnF) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ()).LIZ(EnumC1794330wnH.BOTH, "livesdk_iap_inapp_message_response", jSONObject, null, null);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        if (!((ConcurrentHashMap) c1795340wou.LIZLLL).containsKey(str)) {
            c1795340wou.LIZ(new C1795440wp4(c1795340wou, z, str, consumeIapProductListener));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void launchExternalLink(final Activity activity, final C1795000woM c1795000woM, final InterfaceC1795150wob interfaceC1795150wob) {
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0wom
            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                String str;
                final C1795340wou c1795340wou2 = c1795340wou;
                Activity activity2 = activity;
                final C1795000woM c1795000woM2 = c1795000woM;
                final InterfaceC1795150wob interfaceC1795150wob2 = interfaceC1795150wob;
                c1795340wou2.getClass();
                try {
                    Uri.Builder builderBuildUpon = UriProtector.parse(c1795000woM2.LIZ).buildUpon();
                    ((C1795410wp1) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL()).getClass();
                    if (C1795410wp1.LIZJ("iap_external_link_append_transaction_token", 1) == 1 && (str = c1795000woM2.LIZIZ) != null && !str.isEmpty()) {
                        builderBuildUpon.appendQueryParameter("transaction_token", c1795000woM2.LIZIZ);
                    }
                    Uri uriBuild = builderBuildUpon.build();
                    C1795280woo c1795280woo = new C1795280woo();
                    c1795280woo.LIZLLL = 1;
                    c1795280woo.LIZ = uriBuild;
                    c1795280woo.LIZJ = 1;
                    c1795280woo.LIZIZ = 2;
                    c1795340wou2.LJIILIIL.LJIIJ(activity2, c1795280woo.LIZ(), new C1B9T() { // from class: X.0wol
                        @Override // X.C1B9T
                        public final void LIZ(C19885612rG c19885612rG) {
                            C1794920woE c1794920woE;
                            C1795340wou c1795340wou3 = c1795340wou2;
                            C1795000woM c1795000woM3 = c1795000woM2;
                            InterfaceC1795150wob interfaceC1795150wob3 = interfaceC1795150wob2;
                            c1795340wou3.getClass();
                            int i = c19885612rG.LIZ;
                            if (i != 0) {
                                String str2 = c19885612rG.LIZJ;
                                c1794920woE = new C1794920woE(403, str2, c1795000woM3.LIZIZ, i, C1792840wks.LIZLLL(i, str2));
                                C1795340wou.LJIIL(c1794920woE);
                            } else {
                                c1794920woE = new C1794920woE(0, c19885612rG.LIZJ, c1795000woM3.LIZIZ, i);
                            }
                            interfaceC1795150wob3.LIZ(c1794920woE);
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    interfaceC1795150wob2.LIZ(new C1794920woE(403, e.getMessage(), c1795000woM2.LIZIZ));
                }
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                C1794920woE c1794920woE = new C1794920woE(403, c1792840wks.LJ, null, c1792840wks.LIZ);
                c1795340wou.getClass();
                C1795340wou.LJIIL(c1794920woE);
                interfaceC1795150wob.LIZ(c1794920woE);
            }
        });
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(final List<String> list, final boolean z, final InterfaceC1792890wkx<AbstractC1791620wiu> interfaceC1792890wkx) {
        final C1795340wou c1795340wou = (C1795340wou) C1795340wou.LJI();
        c1795340wou.getClass();
        c1795340wou.LIZ(new InterfaceC1796310wqT() { // from class: X.0woz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [X.0wpN] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
            @Override // X.InterfaceC1796310wqT
            public final void LIZIZ() {
                ?? arrayList;
                final C1795340wou c1795340wou2 = c1795340wou;
                List<String> list2 = list;
                Boolean boolValueOf = Boolean.valueOf(z);
                final InterfaceC1792890wkx interfaceC1792890wkx2 = interfaceC1792890wkx;
                c1795340wou2.getClass();
                final String str = boolValueOf.booleanValue() ? "subs" : "inapp";
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList = (List) list2.stream().map(new Function() { // from class: X.0wpu
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String str2 = str;
                            C1795940wps c1795940wps = new C1795940wps();
                            c1795940wps.LIZ = (String) obj;
                            c1795940wps.LIZIZ = str2;
                            return c1795940wps.LIZ();
                        }
                    }).collect(Collectors.toList());
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : list2) {
                        C1795940wps c1795940wps = new C1795940wps();
                        c1795940wps.LIZ = str2;
                        c1795940wps.LIZIZ = str;
                        arrayList.add(c1795940wps.LIZ());
                    }
                }
                ?? c1795630wpN = new C1795630wpN();
                c1795630wpN.LIZIZ(arrayList);
                c1795340wou2.LJIILIIL.LJIIJJI(c1795630wpN.LIZ(), new InterfaceC1797860wsy() { // from class: X.0wp9
                    @Override // X.InterfaceC1797860wsy
                    public final void LIZ(C19885612rG c19885612rG, C1796230wqL c1796230wqL) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C1792740wki c1792740wki : c1796230wqL.LIZ) {
                            arrayList2.add(new C1792590wkT(c1792740wki));
                            if (!((HashMap) c1795340wou2.LJI).containsKey(c1792740wki.LIZJ)) {
                                ((HashMap) c1795340wou2.LJI).put(c1792740wki.LIZJ, c1792740wki);
                            }
                        }
                        interfaceC1792890wkx2.LIZ(C1795020woO.LIZ(c19885612rG), arrayList2);
                    }
                });
            }

            @Override // X.InterfaceC1796310wqT
            public final void LIZ(C1792840wks c1792840wks) {
                interfaceC1792890wkx.LIZ(c1792840wks, null);
            }
        });
    }
}
