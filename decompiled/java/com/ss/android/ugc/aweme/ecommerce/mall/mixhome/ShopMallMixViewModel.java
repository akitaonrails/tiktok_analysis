package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.AbstractC1772270wDh;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C09R9;
import X.C0PEM;
import X.C0R21;
import X.C1120604Zw;
import X.C1150504el;
import X.C1389890mGx;
import X.C13LE;
import X.C1515940pYG;
import X.C1522560piw;
import X.C1571460qzo;
import X.C1571550qzx;
import X.C1584390rKf;
import X.C1623606Xi;
import X.C1767790w6T;
import X.C1767800w6U;
import X.C1767830w6X;
import X.C1767950w6j;
import X.C1767980w6m;
import X.C1768050w6t;
import X.C1768340w7M;
import X.C1769810w9j;
import X.C1770870wBR;
import X.C1770900wBU;
import X.C1771040wBi;
import X.C1771440wCM;
import X.C1772750wET;
import X.C1773900wGK;
import X.C1774880wHu;
import X.C189200o6;
import X.C1AF0;
import X.C1AQS;
import X.C2097608Jq;
import X.C21176017tu;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C341940Daq;
import X.C452501pT;
import X.C497820Jfg;
import X.C586750Mzp;
import X.C599820Nfo;
import X.C687360Qxi;
import X.C724240Sb0;
import X.C7879035x;
import X.C844470XAv;
import X.C948503nH;
import X.EnumC1522550piv;
import X.EnumC1741270vPh;
import X.EnumC1768230w7B;
import X.EnumC1768240w7C;
import X.EnumC586720Mzm;
import X.EnumC599720Nfe;
import X.InterfaceC0148002o;
import X.InterfaceC599750Nfh;
import X.InterfaceC687370Qxj;
import android.content.res.Configuration;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopMallMixViewModel extends AssemViewModel<C1571460qzo> {
    public C1571550qzx LL;
    public final C1768050w6t LLILLJJLI = new C1768050w6t(null);
    public final C1772750wET LLILLL;
    public final C21176017tu LLILZ;
    public final MutableLiveData<Configuration> LLILZIL;
    public final C01GW LLILZLL;
    public C0R21 LLIZ;
    public EnumC1741270vPh LLIZLLLIL;
    public final C09R9 LLJ;
    public final String LLJI;
    public final InterfaceC599750Nfh globalContext;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1571460qzo(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZLLL();
        this.globalContext.release();
        C21176017tu c21176017tu = this.LLILZ;
        ((ConcurrentHashMap) c21176017tu.LIZ.getValue()).clear();
        c21176017tu.LJIILJJIL().clear();
        c21176017tu.LJIILIIL().clear();
        if (C1773900wGK.LIZ()) {
            List<InterfaceC687370Qxj> list = C687360Qxi.LIZ;
            ((ArrayList) C687360Qxi.LIZ).remove(c21176017tu.LJIIIZ.getValue());
        }
        if (C1773900wGK.LIZJ()) {
            synchronized (MMKStorageUtil.LIZ) {
                MMKStorageUtil.LIZJ = null;
            }
        }
        C1515940pYG.LIZ.clear();
        C1515940pYG.LIZIZ.clear();
    }

    public ShopMallMixViewModel(ShopMallMixFragment shopMallMixFragment) {
        C1772750wET c1772750wET;
        String str;
        IECommerceHostService iECommerceHostService;
        boolean z;
        C1767830w6X c1767830w6X;
        EnumC1768240w7C enumC1768240w7C;
        C1767830w6X c1767830w6X2;
        EnumC1768230w7B enumC1768230w7B;
        C1770900wBU c1770900wBU = C1770900wBU.LIZ;
        synchronized (c1770900wBU) {
            c1772750wET = C1770900wBU.LJIIIIZZ;
            C1770900wBU.LJIIIIZZ = null;
        }
        c1772750wET = c1772750wET == null ? new C1772750wET(0) : c1772750wET;
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        c1772750wET.LJJJJZI = MMKStorageUtil.LIZLLL();
        C1768340w7M c1768340w7M = C1768340w7M.LIZ;
        c1768340w7M.getClass();
        c1772750wET.LJJJLL = c1768340w7M.LJFF("tiktok_ecom_hybrid_mall");
        c1772750wET.LJJJLZIJ = MMKStorageUtil.LIZLLL();
        c1772750wET.LJZ = C1150504el.LIZ().LJJII;
        C1769810w9j.LIZ.getClass();
        c1772750wET.LL = C1769810w9j.LIZIZ();
        C1767950w6j.LIZ.getClass();
        c1772750wET.LLF = C1767950w6j.LJFF();
        c1772750wET.LLIILII = shopMallMixFragment.LLJJJ.LIZ;
        c1772750wET.LLIILZL = C1767980w6m.LJIIJ;
        this.LLILLL = c1772750wET;
        this.LLILZ = new C21176017tu();
        this.LLILZIL = new MutableLiveData<>();
        InterfaceC599750Nfh interfaceC599750NfhLJIILJJIL = c1770900wBU.LJIILJJIL();
        interfaceC599750NfhLJIILJJIL = interfaceC599750NfhLJIILJJIL == null ? C586750Mzp.LIZ(EnumC586720Mzm.EC_MMK_IMPL) : interfaceC599750NfhLJIILJJIL;
        interfaceC599750NfhLJIILJJIL.LJ("mix_mall_page_state", "init", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("page_visible", Boolean.FALSE, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("mall_tab_position", Integer.valueOf(C1584390rKf.LIZ()), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("mall_tab_index", Integer.valueOf(C1584390rKf.LIZIZ(shopMallMixFragment.getActivity())), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        shopMallMixFragment.LLJJJ.getClass();
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1767790w6T != null) {
            str = c1767790w6T.LJIIZILJ;
        } else {
            str = null;
        }
        interfaceC599750NfhLJIILJJIL.LJ("shoptab_index", str, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("top_tab_height", String.valueOf(C1770900wBU.LJJI), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        C844470XAv.LIZ.getClass();
        interfaceC599750NfhLJIILJJIL.LJ("status_bar_height", String.valueOf(C341940Daq.LIZIZ(C497820Jfg.LIZJ(C844470XAv.LIZ()))), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        shopMallMixFragment.LLJJJ.getClass();
        C1767790w6T c1767790w6T2 = C1767980w6m.LJII;
        interfaceC599750NfhLJIILJJIL.LJ("shoptab_ui_status", ((c1767790w6T2 == null || (c1767830w6X2 = c1767790w6T2.LJIIJJI) == null || (enumC1768230w7B = c1767830w6X2.LIZ) == null) ? EnumC1768230w7B.DEFAULT : enumC1768230w7B).getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        shopMallMixFragment.LLJJJ.getClass();
        C1767790w6T c1767790w6T3 = C1767980w6m.LJII;
        interfaceC599750NfhLJIILJJIL.LJ("handle_on_ui_sub_stage", ((c1767790w6T3 == null || (c1767830w6X = c1767790w6T3.LJIIJJI) == null || (enumC1768240w7C = c1767830w6X.LIZIZ) == null) ? EnumC1768240w7C.DEFAULT : enumC1768240w7C).getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("reload_reason", "", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("request_type", "cold_start", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("enable_native_generate_traffic_diversion_info", C1771440wCM.LIZLLL().enableNativeGenerateTdi, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("tt_mall_enter_page_exp", 0, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("page_name", "mall", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        interfaceC599750NfhLJIILJJIL.LJ("mall_instance_index", Integer.valueOf(shopMallMixFragment.LLJJJ.LIZ), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        try {
            C01GW c01gw = C1774880wHu.LIZIZ;
            if (!((ConcurrentHashMap) c01gw.getValue()).isEmpty()) {
                for (Map.Entry entry : ((ConcurrentHashMap) c01gw.getValue()).entrySet()) {
                    interfaceC599750NfhLJIILJJIL.LJ((String) entry.getKey(), entry.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                }
            }
            C01GW c01gw2 = C1774880wHu.LIZ;
            if (!((ConcurrentHashMap) c01gw2.getValue()).isEmpty()) {
                Iterator it2 = ((ConcurrentHashMap) c01gw2.getValue()).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    interfaceC599750NfhLJIILJJIL.LJ((String) entry2.getKey(), entry2.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                    it2.remove();
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallMixViewModel init globalContext=");
        sbLIZ.append(interfaceC599750NfhLJIILJJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            C1770900wBU c1770900wBU2 = C1770900wBU.LIZ;
            new WeakReference(interfaceC599750NfhLJIILJJIL);
            c1770900wBU2.getClass();
        }
        this.globalContext = interfaceC599750NfhLJIILJJIL;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 637));
        this.LLJ = new C09R9(this, C13LE.LIZ(C1771040wBi.class));
        C1767980w6m c1767980w6m = shopMallMixFragment.LLJJJ;
        InterfaceC599750Nfh interfaceC599750Nfh = this.globalContext;
        c1767980w6m.getClass();
        C1767980w6m.LJIIJJI = new WeakReference<>(interfaceC599750Nfh);
        this.LLJI = "sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js";
    }

    public final void xQ2(AbstractC1772270wDh abstractC1772270wDh) {
        if (getState().LL instanceof C1623606Xi) {
            C1389890mGx c1389890mGx = new C1389890mGx(abstractC1772270wDh);
            c1389890mGx.LJIIIZ(2131840205);
            c1389890mGx.LJIIJJI();
            EnumC1522550piv enumC1522550piv = EnumC1522550piv.DATA_NULL;
            TemplateData templateData = new TemplateData();
            for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIJ(new Pair("error_code", String.valueOf(enumC1522550piv.getCode())), new Pair("error_message", enumC1522550piv.getMsg()))).entrySet()) {
                templateData.LJIILIIL((String) entry.getKey(), entry.getValue());
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("LynxDataUpdate");
            C2341109Fh.LIZ("ShopTabV3 DataUpdate onDataFail stateForReqErr withCache");
            C1571550qzx c1571550qzx = this.LL;
            if (c1571550qzx != null) {
                ShopMallMixAssem shopMallMixAssem = c1571550qzx.LIZ;
                shopMallMixAssem.getClass();
                Fragment fragmentLJI = C724240Sb0.LJI(shopMallMixAssem);
                if (fragmentLJI != null && fragmentLJI.isAdded() && !fragmentLJI.isDetached()) {
                    c1571550qzx.LIZ.Lo().LLILLJJLI.LJFF = 2;
                    C2341109Fh.LIZ("mixhome ShopTabV3 DataUpdate OnLynxDataCallback onDataFail");
                    ShopMallMixAssem shopMallMixAssem2 = c1571550qzx.LIZ;
                    shopMallMixAssem2.getClass();
                    if (C7879035x.LIZLLL()) {
                        if (shopMallMixAssem2.Lo().LLILLJJLI.LIZJ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("mixhome ShopTabV3 DataUpdate setDataError data_from: ");
                            sbLIZ.append(shopMallMixAssem2.Lo().LLILLJJLI.LIZ);
                            C2341109Fh.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return;
                    }
                    try {
                        if (shopMallMixAssem2.Lo().LLILLJJLI.LIZJ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("mixhome ShopTabV3 DataUpdate setDataError data_from: ");
                            sbLIZ2.append(shopMallMixAssem2.Lo().LLILLJJLI.LIZ);
                            C2341109Fh.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return;
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                return;
            }
            return;
        }
        Throwable thLIZ = C1522560piw.LIZ(EnumC1522550piv.DATA_NULL);
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("LynxDataUpdate");
        C2341109Fh.LIZ("ShopTabV3 DataUpdate onDataFail stateForReqErr withoutCache");
        setState(new AwS603S0100000_24(thLIZ, 435));
    }

    public final void yQ2(String str) {
        if (C1767800w6U.LJ()) {
            C948503nH.LJI(this, C0PEM.LIZJ, new C1770870wBR(this, str, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(com.google.gson.n r7, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C331410Cyx
            if (r0 == 0) goto L43
            r5 = r8
            X.0Cyx r5 = (X.C331410Cyx) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L49
            X.C155000ia.LIZIZ(r4)
        L23:
            X.0X52 r4 = (X.C0X52) r4
            if (r4 == 0) goto L2f
            T r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L2f
            T r2 = r0.data
        L2f:
            return r2
        L30:
            X.C155000ia.LIZIZ(r4)
            X.0Cyv r1 = new X.0Cyv
            r1.<init>(r6, r7, r2)
            r5.LLILLL = r0
            java.lang.String r0 = "mall"
            java.lang.Object r4 = X.C2381909Uz.LIZJ(r0, r2, r5, r1)
            if (r4 != r3) goto L23
            return r3
        L43:
            X.0Cyx r5 = new X.0Cyx
            r5.<init>(r6, r8)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel.wQ2(com.google.gson.n, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r31, com.google.gson.n r32, X.C1771590wCb r33, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r34) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel.vQ2(boolean, com.google.gson.n, X.0wCb, X.05Vn):java.lang.Object");
    }
}
