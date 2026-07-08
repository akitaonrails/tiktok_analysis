package com.ss.android.ugc.aweme.pipo.cashier.cashier;

import X.C098200Yq;
import X.C0PEM;
import X.C1435105jZ;
import X.C1707770uXf;
import X.C1708600uZ0;
import X.C1708610uZ1;
import X.C1708710uZB;
import X.C1709430uaL;
import X.C1709570uaZ;
import X.C1710990ucr;
import X.C1711000ucs;
import X.C1711340udQ;
import X.C1711440uda;
import X.C1711510udh;
import X.C1711580udo;
import X.C1711600udq;
import X.C1711610udr;
import X.C1711790ue9;
import X.C1715620ukK;
import X.C1724180uy8;
import X.C189200o6;
import X.C1BWL;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C2224808ne;
import X.C23250099c;
import X.C817503Hh;
import X.C844470XAv;
import X.C932203ke;
import X.EnumC1709270ua5;
import X.EnumC586150Myr;
import X.InterfaceC1063710dmr;
import X.InterfaceC1715630ukL;
import X.InterfaceC1724090uxz;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.AddressInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.common.bind.utils.BindRouteInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.common.bind.utils.BindRouteV2Interceptor;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.PayRouteInterceptor;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.PayRouteV2Interceptor;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierViewShadowNode;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.router.RefundCashierRouterInterceptor;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import go5.c;
import j27.s;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPOCashierServiceImpl implements IPIPOCashierService {
    public volatile boolean LIZ;
    public final List<WeakReference<C1709430uaL>> LIZIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final List<IInterceptor> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PayRouteInterceptor());
        arrayList.add(new PayRouteV2Interceptor());
        arrayList.add(new BindRouteInterceptor());
        arrayList.add(new BindRouteV2Interceptor());
        arrayList.add(new CashierRouterInterceptor());
        arrayList.add(new RefundCashierRouterInterceptor());
        arrayList.add(new AddressInterceptor());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final LynxTtlsPdpCashierViewShadowNode LJIIL() {
        return new LynxTtlsPdpCashierViewShadowNode();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final List<Class<? extends InterfaceC1063710dmr>> LJIJI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1711790ue9.class);
        arrayList.add(C1711580udo.class);
        arrayList.add(C1711610udr.class);
        arrayList.add(C1711600udq.class);
        arrayList.add(C1711510udh.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final void LJIJJ() {
        IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        if (iPipoCcdcService != null && iPipoCcdcService.LJIIJ("ttls")) {
            try {
                C2222691Bz1.LIZ.getClass();
                String str = C2222691Bz1.LJIIL() ? "https://fp.pipopayment.us" : !C2222691Bz1.LJIIIIZZ() ? "https://f-p-va.isnssdk.com" : "https://f-p.sgsnssdk.com";
                C844470XAv.LIZ.getClass();
                a$a a_a = new a$a(String.valueOf(C844470XAv.LJ()), String.valueOf(C844470XAv.LIZLLL()));
                C1724180uy8 c1724180uy8 = new C1724180uy8(C1BWL.LIZ());
                c1724180uy8.LJJ = a_a;
                c1724180uy8.LIZIZ = str;
                c1724180uy8.LJIL = new c() { // from class: X.0uct
                    @Override // go5.c
                    public final String getValue(String str2) {
                        return C928803k6.LIZ(str2, new String[0]);
                    }
                };
                c1724180uy8.LJIIL = new InterfaceC1724090uxz() { // from class: X.0pHp
                    @Override // X.InterfaceC1724090uxz
                    public final void onEventV3(String str2, JSONObject jSONObject) throws JSONException {
                        if (jSONObject != null) {
                            jSONObject.put("app_region", C2222691Bz1.LIZIZ());
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            linkedHashMap.put(next, jSONObject.optString(next));
                        }
                        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
                        if (str2 == null) {
                            str2 = "";
                        }
                        interfaceC1709310ua9LIZ.LIZ(str2, linkedHashMap);
                    }
                };
                c1724180uy8.LJIILIIL = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
                c1724180uy8.LJIIJ = UUID.randomUUID().toString();
                c1724180uy8.LJIJI = TokenCert.Companion.with("bpea-pipo_ocr_local");
                C189200o6.m2constructorimpl(C932203ke.LIZ.LJFF(c1724180uy8.LIZ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final void LJIJJLI() {
        C1711440uda.LIZ.getClass();
        if (C1711000ucs.LIZ().preloadEnable == 1) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2224808ne("ttls", null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final void initialize() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C1710990ucr.LIZ.put("CASHIER", new C1715620ukK(new InterfaceC1715630ukL() { // from class: X.0uaJ
            @Override // X.InterfaceC1715630ukL
            public final String LIZ() {
                return "tiktokls_input_click";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LIZIZ() {
                return "tiktokls_module_show";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LIZJ() {
                return "tiktokls_button_click";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LIZLLL() {
                return "tiktokls_input_staytime";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJ() {
                return "tiktokls_button_show";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJFF() {
                return "tiktokls_popup_click";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJI() {
                return "tiktokls_input_result";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJII() {
                return "tiktokls_enter_page";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJIIIIZZ() {
                return "tiktokls_popup_show";
            }

            @Override // X.InterfaceC1715630ukL
            public final String LJIIIZ() {
                return "tiktokls_stay_page";
            }

            @Override // X.InterfaceC1715630ukL
            public final Map<String, String> getCommonParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
                linkedHashMap.put("universal_cashier_type", C1709000uZe.LIZ.LIZLLL);
                return linkedHashMap;
            }
        }));
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIIJJI("pipo_ttls_cashier");
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final String LJIJ() {
        initialize();
        n nVar = new n();
        nVar.LJJIFFI("configuration", new Configuration(null, null, null, null, null, null, null, null, C1707770uXf.LIZ() ? "true" : "false", Boolean.valueOf(C1707770uXf.LIZ()), 255, null).LIZ());
        nVar.LJJIIJ("risk_info", C1708600uZ0.LIZJ());
        return nVar.toString();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final LynxTtlsPdpCashierView LIZLLL(s sVar) {
        return new LynxTtlsPdpCashierView(sVar);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final C1709430uaL LJIIZILJ(String str, String str2) {
        Object next;
        CashierKey cashierKey;
        initialize();
        CashierKey cashierKey2 = new CashierKey(str, str2);
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1709430uaL c1709430uaL = (C1709430uaL) ((Reference) next).get();
                if (c1709430uaL != null) {
                    cashierKey = c1709430uaL.LLILLJJLI;
                } else {
                    cashierKey = null;
                }
                if (Intrinsics.LJFF(cashierKey, cashierKey2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Reference reference = (Reference) next;
        if (reference == null) {
            return null;
        }
        return (C1709430uaL) reference.get();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService
    public final C1709430uaL LJIL(Context context, String str, String str2, EnumC1709270ua5 enumC1709270ua5) {
        Object next;
        C1709430uaL c1709430uaL;
        Object next2;
        C1709430uaL c1709430uaL2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        initialize();
        LJIJJ();
        C1711340udQ c1711340udQ = C1711340udQ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createCashier: ");
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(" for: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1711340udQ.getClass();
        C1708710uZB.LIZ("Cashier").LIZ(4, strLIZIZ);
        CashierKey cashierKey = new CashierKey(str, str2);
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1709430uaL c1709430uaL3 = (C1709430uaL) ((Reference) next).get();
                if (c1709430uaL3 != null && Intrinsics.LJFF(c1709430uaL3.LLILLJJLI, cashierKey)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Reference reference = (Reference) next;
        if (reference != null) {
            c1709430uaL = (C1709430uaL) reference.get();
        } else {
            c1709430uaL = null;
        }
        if (c1709430uaL != null) {
            C1711340udQ c1711340udQ2 = C1711340udQ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createCashier: ");
            sbLIZ2.append(" find same cashier: ");
            c1711340udQ2.getClass();
            sbLIZ2.append(C1711340udQ.LIZJ(c1709430uaL));
            C1708710uZB.LIZ("Cashier").LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
            C1708610uZ1.LIZIZ(str).LIZ("rd_pipo_cashier_render", C2097908Jt.LIZJ(new Pair("duration_init", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis))));
            return c1709430uaL;
        }
        C1709430uaL c1709430uaL4 = new C1709430uaL(context, cashierKey, enumC1709270ua5);
        Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                C1709430uaL c1709430uaL5 = (C1709430uaL) ((Reference) next2).get();
                if (c1709430uaL5 != null && Intrinsics.LJFF(c1709430uaL5.LLILLJJLI.payRequestId, str)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        Reference reference2 = (Reference) next2;
        if (reference2 != null && (c1709430uaL2 = (C1709430uaL) reference2.get()) != null) {
            C1711340udQ c1711340udQ3 = C1711340udQ.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createCashier: ");
            sbLIZ3.append(" find same cashier with pay_request_id, ");
            c1711340udQ3.getClass();
            sbLIZ3.append(C1711340udQ.LIZJ(c1709430uaL2));
            C1708710uZB.LIZ("Cashier").LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
            C1709570uaZ c1709570uaZ = c1709430uaL2.LLILLL;
            EnumC586150Myr enumC586150Myr = EnumC586150Myr.REUSE_SAME_DATA_CASHIER;
            if (c1709570uaZ != null) {
                c1709570uaZ.LJJIFFI = c1709430uaL4.LLILLJJLI.payRequestId;
            }
            c1709430uaL4.LLILLL = c1709570uaZ;
            if (enumC586150Myr != null && c1709570uaZ != null) {
                c1709570uaZ.LJJ(enumC586150Myr);
            }
        }
        ((ArrayList) this.LIZIZ).add(new WeakReference(c1709430uaL4));
        EventBus.LIZLLL().LJIILL(new C1435105jZ(c1709430uaL4));
        C1708610uZ1.LIZIZ(str).LIZ("rd_pipo_cashier_render", C2097908Jt.LIZJ(new Pair("duration_init", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis))));
        return c1709430uaL4;
    }
}
