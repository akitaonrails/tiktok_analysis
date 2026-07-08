package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm;

import X.AbstractC1727320v3C;
import X.C08QT;
import X.C08QU;
import X.C09JN;
import X.C09RB;
import X.C09YA;
import X.C0JT6;
import X.C0KPJ;
import X.C1271904yL;
import X.C15438062q;
import X.C1727990v4H;
import X.C1734440vEg;
import X.C1734460vEi;
import X.C1734530vEp;
import X.C1734660vF2;
import X.C1734700vF6;
import X.C1734810vFH;
import X.C1899407cG;
import X.C2097608Jq;
import X.C2097808Js;
import X.C2097908Jt;
import X.C518710KVx;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1734720vF8;
import X.EnumC1734740vFA;
import X.EnumC1734750vFB;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC518690KVv;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormPrefillSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsFormVm extends AssemViewModel<C1734460vEi> implements IPcsFormVmAbility {
    public int LL;
    public boolean LLJI;
    public long LLJILJIL;
    public long LLJJ;
    public boolean LLJJJ;
    public Long LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C09YA LLILLJJLI = new C09YA(this, new C518710KVx());
    public int LLILLL = -1;
    public final Map<String, String> LLILZ = new LinkedHashMap();
    public final Map<String, String> LLILZIL = new LinkedHashMap();
    public final Map<String, EnumC1734720vF8> LLILZLL = new LinkedHashMap();
    public final Set<String> LLIZ = new LinkedHashSet();
    public final Map<String, Boolean> LLIZLLLIL = new LinkedHashMap();
    public final Set<String> LLJ = new LinkedHashSet();
    public final C1734810vFH LLJIJIL = new C1734810vFH();
    public String LLJILJILJ = "";
    public String LLJILLL = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public String LLJJJIL = "";
    public EnumC1734740vFA LLJJL = EnumC1734740vFA.NO_SUBMIT;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1734460vEi(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (LivePcsFormPrefillSetting.INSTANCE.enableLocalStoragePrefill()) {
            HashMap<String, Long> mapLIZIZ = C0KPJ.xf.LIZ.LIZIZ();
            C08QU c08quLJIIIZ = C09RB.LJIIIZ(C2097808Js.LJIJJLI(mapLIZIZ), new C1899407cG());
            HashSet hashSet = new HashSet();
            C08QT c08qt = new C08QT(c08quLJIIIZ);
            while (c08qt.hasNext()) {
                hashSet.add(((Map.Entry) c08qt.next()).getKey());
            }
            if (mapLIZIZ.keySet().retainAll(hashSet)) {
                C0KPJ.xf.LIZ.LJFF(mapLIZIZ);
            }
            C0JT6<HashMap<String, String>> c0jt6 = C0KPJ.yf;
            HashMap<String, HashMap<String, String>> mapLIZIZ2 = c0jt6.LIZ.LIZIZ();
            if (mapLIZIZ2.keySet().retainAll(hashSet)) {
                c0jt6.LIZ.LJFF(mapLIZIZ2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final String vQ2() throws JSONException {
        ?? LJ;
        String str;
        List<AbstractC1727320v3C> listYQ2 = yQ2();
        if (listYQ2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listYQ2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (AbstractC1727320v3C abstractC1727320v3C : listYQ2) {
                Pair pair = new Pair(abstractC1727320v3C.LIZ().LIZ, abstractC1727320v3C.LIZ());
                LJ.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZLL).entrySet()) {
            Object key = entry.getKey();
            EnumC1734720vF8 enumC1734720vF8 = (EnumC1734720vF8) entry.getValue();
            C1727990v4H c1727990v4H = (C1727990v4H) LJ.get(key);
            if (c1727990v4H != null && (str = c1727990v4H.LJIIJJI) != null && (!a0.LJJJIL(str))) {
                jSONObject.put(str, enumC1734720vF8.getValue());
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String wQ2() {
        List<AbstractC1727320v3C> listYQ2 = yQ2();
        if (listYQ2 == null) {
            return "";
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listYQ2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (AbstractC1727320v3C abstractC1727320v3C : listYQ2) {
            Pair pair = new Pair(abstractC1727320v3C.LIZ().LIZ, abstractC1727320v3C.LIZ());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : this.LLIZ) {
            C1727990v4H c1727990v4H = (C1727990v4H) linkedHashMap.get(str);
            if (!Intrinsics.LJFF(((LinkedHashMap) this.LLILZ).get(str), c1727990v4H != null ? c1727990v4H.LJ : null)) {
                C1727990v4H c1727990v4H2 = (C1727990v4H) linkedHashMap.get(str);
                jSONArray.put(c1727990v4H2 != null ? c1727990v4H2.LJIIJJI : null);
            }
        }
        return jSONArray.toString();
    }

    public final List<AbstractC1727320v3C> yQ2() {
        InterfaceC1891350zJl next;
        Iterator<InterfaceC1891350zJl> it2 = getState().LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C1271904yL) {
                break;
            }
        }
        C1271904yL c1271904yL = (C1271904yL) next;
        if (c1271904yL != null) {
            return c1271904yL.LL;
        }
        return null;
    }

    public final void zQ2() {
        C766270U4b.LIZLLL(2131856185);
        setState(new C1734440vEg());
        C1734700vF6.LIZJ(this, false);
    }

    public final boolean AQ2(String str) {
        if (!LivePcsFormPrefillSetting.INSTANCE.enableProfilePrefill() || ((LinkedHashMap) this.LLILZLL).get(str) != EnumC1734720vF8.PROFILE || this.LLIZ.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String CQ2(X.C1727990v4H r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm.CQ2(X.0v4H):java.lang.String");
    }

    public final boolean BQ2(C1727990v4H c1727990v4H, String str) {
        int iLJJIZ;
        if (c1727990v4H == null || !AQ2(c1727990v4H.LIZ) || Intrinsics.LJFF(str, c1727990v4H.LJ)) {
            return false;
        }
        if (c1727990v4H.LIZLLL == EnumC1734750vFB.PHONE && (iLJJIZ = a0.LJJIZ(str, '/', 0, false, 6)) != -1 && (iLJJIZ == 0 || iLJJIZ == str.length() - 1)) {
            return false;
        }
        this.LLIZ.add(c1727990v4H.LIZ);
        this.LLILZ.put(c1727990v4H.LIZ, "");
        return true;
    }

    public final void xQ2(long j, String str) {
        this.LLJILJIL = j;
        this.LLJILJILJ = str;
        ((LinkedHashMap) this.LLILZ).clear();
        this.LLIZ.clear();
        this.LLJI = false;
        setState(new C1734530vEp());
        C1734660vF2.LIZ.getClass();
        if (LivePcsFormUxOptSetting.INSTANCE.isAutofillEnabled()) {
            C1734660vF2.LIZIZ = null;
            C1734660vF2.LIZJ = 0L;
            C1734660vF2.LIZLLL = false;
            C1734660vF2.LIZIZ();
        }
        disposeOnClear(((InterfaceC518690KVv) this.LLILLJJLI.getValue().getOperator()).LLLL(j, str).LJJLL(new C09JN() { // from class: X.0vF3
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:139:0x028c  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x041c  */
            /* JADX WARN: Removed duplicated region for block: B:230:0x0430  */
            /* JADX WARN: Removed duplicated region for block: B:233:0x0435  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x0469  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r41) {
                /*
                    Method dump skipped, instruction units count: 1374
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1734670vF3.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0vEo
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsFormVm@8cf5.fetchFormData$3");
                this.LL.setState(new C1734510vEn((Throwable) obj));
                C1C7U.LIZIZ("PcsFormVm@8cf5.fetchFormData$3");
            }
        }));
    }
}
