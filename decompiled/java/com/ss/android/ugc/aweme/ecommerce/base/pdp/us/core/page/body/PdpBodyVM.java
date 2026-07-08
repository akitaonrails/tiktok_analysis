package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body;

import X.AbstractC10377043z;
import X.C04BG;
import X.C04D4;
import X.C04DG;
import X.C04DX;
import X.C08JS;
import X.C1025503zh;
import X.C1056304Bd;
import X.C1057704Br;
import X.C1060104Cp;
import X.C1073304Hr;
import X.C1326490kch;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1754870vld;
import X.C1755400vmU;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import X.InterfaceC1053704Ad;
import X.InterfaceC1457505nB;
import X.InterfaceC1755020vls;
import X.InterfaceC1755040vlu;
import X.InterfaceC1755080vly;
import X.InterfaceC1755770vn5;
import X.InterfaceC1761670vwb;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.InterfaceC746802vq;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcPdpFilterOnCacheModuleList;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcPdpLockupFrameworkUpgradeConfig;
import com.ss.android.ugc.aweme.ecommerce.core.engine.module.ModuleId;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBodyVM extends AssemViewModel<C1754870vld> implements InterfaceC1755770vn5 {
    public final InterfaceC1053704Ad LL;
    public final InterfaceC1755080vly LLILLJJLI;
    public final InterfaceC1457505nB LLILLL;
    public final InterfaceC1761670vwb LLILZ;
    public final InterfaceC1755020vls LLILZIL;
    public final C04DG LLILZLL;
    public final InterfaceC1755040vlu LLIZ;
    public final PdpViewModel LLIZLLLIL;
    public volatile boolean LLJ;
    public final List<String> LLJI;
    public final boolean LLJIJIL;
    public final List<AbstractC10377043z> LLJILJIL;
    public final List<ModuleId> LLJILJILJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1754870vld(0);
    }

    @Override // X.InterfaceC1755770vn5
    public final InterfaceC497601wk zd() {
        return ViewModelKt.getViewModelScope(this);
    }

    public static JSONObject wQ2(PdpViewModel pdpViewModel) throws JSONException {
        C04BG c04bg = pdpViewModel.LLLLLZIL;
        String str = c04bg.LJI;
        String str2 = c04bg.LIZJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("loading_status", str);
        jSONObject.put("data", str2);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e A[PHI: r1
      0x003e: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:22:0x003b, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1549130qPn xQ2(java.lang.String r5) {
        /*
            java.lang.String r0 = "pdp_product_info"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            r4 = 1
            if (r0 != 0) goto L1f
            java.lang.String r0 = "pdp_product_info_top"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L1f
            boolean r0 = X.C1155800gBO.LIZJ()
            if (r0 == 0) goto L1d
            X.0qPn r0 = new X.0qPn
            r0.<init>(r4, r4)
            return r0
        L1d:
            r0 = 0
            return r0
        L1f:
            com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel r0 = X.C04IL.LIZIZ()
            com.ss.android.ugc.aweme.ecommerce.core.ab.LynxOptModel r3 = r0.opt
            X.0qPn r2 = new X.0qPn
            if (r3 == 0) goto L3a
            boolean r0 = r3.LIZIZ()
            if (r0 != r4) goto L3a
            r1 = 1
        L30:
            boolean r0 = r3.LIZ()
            if (r0 != r4) goto L3e
        L36:
            r2.<init>(r1, r4)
            return r2
        L3a:
            r1 = 0
            if (r3 == 0) goto L3e
            goto L30
        L3e:
            r4 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyVM.xQ2(java.lang.String):X.0qPn");
    }

    public static JSONObject yQ2(PdpViewModel pdpViewModel) throws JSONException {
        String strLIZLLL;
        String strLIZLLL2;
        String str = pdpViewModel.LLLLLILLIL.LJII;
        C1073304Hr c1073304Hr = pdpViewModel.LLLLLILLIL;
        Pair pair = new Pair(c1073304Hr.LIZLLL, c1073304Hr.LJ);
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("loading_status", str);
        if (first != null) {
            C1060104Cp c1060104Cp = pdpViewModel.LLLLLILLIL.LJI;
            if (c1060104Cp == null || (strLIZLLL2 = c1060104Cp.LIZ) == null) {
                strLIZLLL2 = C08JS.LIZLLL(first);
            }
            jSONObject.put("product_detail_review", strLIZLLL2);
        }
        if (second != null) {
            C1060104Cp c1060104Cp2 = pdpViewModel.LLLLLILLIL.LJI;
            if (c1060104Cp2 == null || (strLIZLLL = c1060104Cp2.LIZIZ) == null) {
                strLIZLLL = C08JS.LIZLLL(second);
            }
            jSONObject.put("shop_review_entry", strLIZLLL);
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1755770vn5
    public final void On2(String str) {
        setState(new AwS52S1000000_1(str, 17));
    }

    public final List<Object> vQ2(C1057704Br c1057704Br) {
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromCache: ");
        sbLIZ.append(c1057704Br.LJ);
        sbLIZ.append(", fromPreview: ");
        sbLIZ.append(c1057704Br.LIZLLL);
        sbLIZ.append(", loading: ");
        sbLIZ.append(c1057704Br.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        if (((ArrayList) this.LLJILJIL).isEmpty()) {
            Iterator<ModuleId> it2 = this.LLJILJILJ.iterator();
            while (it2.hasNext()) {
                Object objLIZIZ = C1025503zh.LIZIZ(AbstractC10377043z.class, new BizIdentity(it2.next().id, this.LLIZLLLIL.LLLJIL));
                if (objLIZIZ != null) {
                    ((ArrayList) this.LLJILJIL).add(objLIZIZ);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.LJFF(EcPdpLockupFrameworkUpgradeConfig.LIZ().moveLockupAboveHeader, Boolean.TRUE)) {
            arrayList.add(new UsPdpTopStoreIdentityModuleVO(0));
        }
        Iterator it3 = ((ArrayList) this.LLJILJIL).iterator();
        while (it3.hasNext()) {
            arrayList.addAll(((AbstractC10377043z) it3.next()).LIZ(this.LLIZLLLIL, c1057704Br));
        }
        return arrayList;
    }

    public final void zQ2(List<? extends Object> list) {
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start | content list(size: ");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        if (arrayList.isEmpty()) {
            C1326490kch.LIZ("content is empty");
            return;
        }
        if (!this.LLJ && ((Boolean) C04D4.LIZ.getValue()).booleanValue()) {
            list = C13LP.LJLIL(list, Collections.singletonList(new C04DX(this.LLILZIL.LIZ())));
        }
        for (Object obj : list) {
            if (!(obj instanceof InterfaceC1891350zJl)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Module need migration: ");
                sbLIZ2.append(obj.getClass());
                C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!(obj2 instanceof C1056304Bd) && (!(obj2 instanceof C1755400vmU) || ((C1755400vmU) obj2).getContentType() != 50000)) {
                arrayList2.add(obj2);
            }
        }
        setState(new AwS580S0100000_1(arrayList2, (List<InterfaceC746802vq>) 253));
        C1326490kch c1326490kch2 = C1326490kch.LIZ;
        StringBuilder sb = new StringBuilder("end | powerItem content list(size: ");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof InterfaceC1891350zJl) {
                arrayList3.add(obj3);
            }
        }
        sb.append(arrayList3.size());
        sb.append(')');
        String string = sb.toString();
        c1326490kch2.getClass();
        C1326490kch.LIZ(string);
    }

    public PdpBodyVM(InterfaceC1053704Ad interfaceC1053704Ad, InterfaceC1755080vly interfaceC1755080vly, InterfaceC1457505nB interfaceC1457505nB, InterfaceC1761670vwb interfaceC1761670vwb, InterfaceC1755020vls interfaceC1755020vls, C04DG c04dg, InterfaceC1755040vlu interfaceC1755040vlu) {
        this.LL = interfaceC1053704Ad;
        this.LLILLJJLI = interfaceC1755080vly;
        this.LLILLL = interfaceC1457505nB;
        this.LLILZ = interfaceC1761670vwb;
        this.LLILZIL = interfaceC1755020vls;
        this.LLILZLL = c04dg;
        this.LLIZ = interfaceC1755040vlu;
        this.LLIZLLLIL = interfaceC1761670vwb.lX();
        EcPdpFilterOnCacheModuleList.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPdpFilterOnCacheModuleList.PdpOnCacheList pdpOnCacheList = EcPdpFilterOnCacheModuleList.LIZIZ;
        EcPdpFilterOnCacheModuleList.PdpOnCacheList pdpOnCacheList2 = (EcPdpFilterOnCacheModuleList.PdpOnCacheList) settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_on_cache_lynx_module_list", EcPdpFilterOnCacheModuleList.PdpOnCacheList.class, pdpOnCacheList);
        List<String> list = (pdpOnCacheList2 == null ? pdpOnCacheList : pdpOnCacheList2).pageList;
        this.LLJI = list == null ? C13BV.INSTANCE : list;
        EcPdpFilterOnCacheModuleList.PdpOnCacheList pdpOnCacheList3 = (EcPdpFilterOnCacheModuleList.PdpOnCacheList) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_on_cache_lynx_module_list", EcPdpFilterOnCacheModuleList.PdpOnCacheList.class, pdpOnCacheList);
        this.LLJIJIL = (pdpOnCacheList3 != null ? pdpOnCacheList3 : pdpOnCacheList).enable;
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = C1697810uHb.LJIIJJI(new ModuleId("lockup_above_header"), new ModuleId("header"), new ModuleId("product_info"));
    }
}
