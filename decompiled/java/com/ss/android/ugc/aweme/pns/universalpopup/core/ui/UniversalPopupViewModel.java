package com.ss.android.ugc.aweme.pns.universalpopup.core.ui;

import X.AbstractC1556140qb6;
import X.C0NRE;
import X.C13LP;
import X.C1519370pdn;
import X.C1556120qb4;
import X.C1556130qb5;
import X.C1556150qb7;
import X.C1556160qb8;
import X.C15O7;
import X.C1914200zuc;
import X.C19335410ki;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC1914120zuU;
import X.InterfaceC1085710eML;
import X.InterfaceC1914160zuY;
import X.InterfaceC1914220zue;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupViewModel extends ViewModel implements InterfaceC1085710eML {
    public final UniversalPopupResponse LL;
    public final InterfaceC1914160zuY LLILLJJLI;
    public final C0NRE LLILLL;
    public final InterfaceC1914220zue LLILZ;
    public final MediatorLiveData<Stack<UniversalPopup>> LLILZIL;
    public final MutableLiveData<Stack<UniversalPopup>> LLILZLL;
    public final SingleLiveEvent<AbstractC1556140qb6> LLIZ;
    public final LinkedList<UniversalPopup> LLIZLLLIL;
    public final Map<String, UniversalPopup> LLJ;
    public C1519370pdn LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public final Gson LLJILLL;

    @Override // X.InterfaceC1085710eML
    public final void Ay() {
        InterfaceC1914220zue interfaceC1914220zue = this.LLILZ;
        if (interfaceC1914220zue != null) {
            interfaceC1914220zue.LJFF(this.LLJI);
        }
    }

    @Override // X.InterfaceC1085710eML
    public final void Sj1() {
        UniversalPopup universalPopup;
        Stack<UniversalPopup> value = this.LLILZLL.getValue();
        if (value == null || (universalPopup = (UniversalPopup) yQ2(value)) == null) {
            return;
        }
        C0NRE c0nre = this.LLILLL;
        String str = universalPopup.business;
        String str2 = universalPopup.style;
        String str3 = universalPopup.popupId;
        c0nre.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("business", str);
        linkedHashMap.put("style", str2);
        linkedHashMap.put("popup_id", str3);
        c0nre.LIZ("pns_popup_bottom_pinned_not_visible", linkedHashMap);
    }

    public final void vQ2() {
        InterfaceC1914220zue interfaceC1914220zue = this.LLILZ;
        if (interfaceC1914220zue != null) {
            interfaceC1914220zue.LIZ(this.LLJI);
        }
        MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LLILZLL;
        Stack<UniversalPopup> value = mutableLiveData.getValue();
        if (value != null) {
            value.clear();
        }
        mutableLiveData.setValue(mutableLiveData.getValue());
        Stack<UniversalPopup> value2 = this.LLILZLL.getValue();
        if (value2 == null || value2.size() != 0) {
            return;
        }
        zQ2();
    }

    public final void zQ2() {
        if (!this.LLIZLLLIL.isEmpty()) {
            UniversalPopup universalPopupPop = this.LLIZLLLIL.pop();
            this.LLJI = wQ2(universalPopupPop);
            MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LLILZLL;
            Stack<UniversalPopup> value = mutableLiveData.getValue();
            if (value != null) {
                value.add(universalPopupPop);
            }
            mutableLiveData.setValue(mutableLiveData.getValue());
            return;
        }
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        InterfaceC1914220zue interfaceC1914220zue = this.LLILZ;
        if (interfaceC1914220zue != null) {
            interfaceC1914220zue.LIZ(this.LLJI);
        }
        this.LLIZ.setValue(C1556150qb7.LIZ);
    }

    public static C1519370pdn wQ2(UniversalPopup universalPopup) {
        if (universalPopup != null) {
            String str = universalPopup.business;
            String str2 = universalPopup.style;
            String str3 = universalPopup.policyVersion;
            Map<String, String> mapLJ = universalPopup.extra;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            return new C1519370pdn(str, str2, str3, mapLJ, 16);
        }
        return new C1519370pdn(null, null, null, null, 31);
    }

    public static Object yQ2(Stack stack) {
        if (!(!stack.empty())) {
            return null;
        }
        return stack.peek();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0151 A[Catch: Exception -> 0x0194, PHI: r4
      0x0151: PHI (r4v1 java.util.LinkedHashMap) = (r4v0 java.util.LinkedHashMap), (r4v3 java.util.LinkedHashMap) binds: [B:28:0x00c1, B:50:0x014e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0194, blocks: (B:11:0x0026, B:13:0x002b, B:14:0x0040, B:16:0x0046, B:17:0x006e, B:18:0x007b, B:20:0x0081, B:22:0x0095, B:24:0x00a3, B:25:0x00a8, B:27:0x00b7, B:29:0x00c3, B:31:0x00c9, B:32:0x00cd, B:34:0x00d3, B:35:0x00e1, B:37:0x00e7, B:38:0x00fc, B:39:0x0112, B:41:0x0118, B:43:0x012f, B:45:0x0133, B:49:0x014a, B:48:0x0144, B:53:0x0154, B:54:0x0161, B:52:0x0151), top: B:59:0x0026 }] */
    @Override // X.InterfaceC1085710eML
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZI(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction r24, java.util.List<java.lang.String> r25) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel.ZI(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, java.util.List):void");
    }

    @Override // X.InterfaceC1085710eML
    public final void mj2(String str, Map map) {
        UniversalPopup universalPopupPop;
        Map mapLJ;
        InterfaceC1914220zue interfaceC1914220zue;
        MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LLILZLL;
        Stack<UniversalPopup> value = mutableLiveData.getValue();
        if (value != null && !value.isEmpty()) {
            universalPopupPop = value.pop();
        } else {
            universalPopupPop = null;
        }
        mutableLiveData.setValue(mutableLiveData.getValue());
        if (universalPopupPop != null) {
            this.LLILLL.LIZIZ(System.currentTimeMillis() - this.LLJILJIL, universalPopupPop.business, universalPopupPop.style, universalPopupPop.popupId, str);
        }
        C1519370pdn c1519370pdn = this.LLJI;
        if (map == null) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = map;
        }
        c1519370pdn.LJ = C2097608Jq.LJIIL(mapLJ, C2097908Jt.LIZJ(new Pair("operation", "dismiss_other")));
        if (map != null && (interfaceC1914220zue = this.LLILZ) != null) {
            interfaceC1914220zue.LIZIZ("submit_data", this.LLJI);
        }
        Stack<UniversalPopup> value2 = this.LLILZLL.getValue();
        if (value2 != null && value2.size() == 0) {
            zQ2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    @Override // X.InterfaceC1085710eML
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xv1(java.lang.String r10, java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel.xv1(java.lang.String, java.util.Map):void");
    }

    public final void xQ2(UniversalPopupAction universalPopupAction, Map<String, ? extends Object> map, boolean z) {
        Stack<UniversalPopup> value;
        UniversalPopup universalPopup;
        int i;
        Object string;
        Object first;
        Pair pair;
        UniversalPopup universalPopup2;
        C15O7<Unit> c15o7LIZ;
        Map<String, ? extends Object> mapLJ = map;
        Stack<UniversalPopup> value2 = this.LLILZLL.getValue();
        if ((value2 == null || !value2.isEmpty()) && (value = this.LLILZLL.getValue()) != null && (universalPopup = (UniversalPopup) yQ2(value)) != null) {
            C1519370pdn c1519370pdn = this.LLJI;
            String strValueOf = String.valueOf(universalPopupAction.operation);
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c1519370pdn.LJ = C2097608Jq.LJIIL(mapLJ, C2097908Jt.LIZJ(new Pair("operation", strValueOf)));
            InterfaceC1914220zue interfaceC1914220zue = this.LLILZ;
            if (interfaceC1914220zue != null) {
                interfaceC1914220zue.LJ(universalPopupAction, this.LLJI);
            }
            if (universalPopupAction.approve) {
                C1519370pdn c1519370pdn2 = this.LLJI;
                Stack<UniversalPopup> value3 = this.LLILZLL.getValue();
                if (value3 != null && (universalPopup2 = (UniversalPopup) yQ2(value3)) != null) {
                    C0NRE c0nre = this.LLILLL;
                    String str = universalPopup2.business;
                    String str2 = universalPopup2.popupId;
                    String str3 = universalPopupAction.actionId;
                    String string2 = universalPopupAction.customizedActions.toString();
                    c0nre.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("business", str);
                    linkedHashMap.put("popup_id", str2);
                    linkedHashMap.put("action_id", str3);
                    linkedHashMap.put("action", string2);
                    c0nre.LIZ("pns_popup_approve", linkedHashMap);
                    InterfaceC1914160zuY interfaceC1914160zuY = this.LLILLJJLI;
                    if (interfaceC1914160zuY == null || (c15o7LIZ = interfaceC1914160zuY.LIZ(universalPopup2.business, C2097608Jq.LJIIIIZZ(new Pair("policy_version", universalPopup2.policyVersion), new Pair("style", universalPopup2.style), new Pair("extra", universalPopupAction.extra), new Pair("operation", String.valueOf(universalPopupAction.operation))))) == null || c15o7LIZ.LJ(new C19335410ki(universalPopupAction, this, c1519370pdn2, 0), C15O7.LJIIIIZZ, null) == null) {
                        new AwS272S0300000_28(universalPopupAction, this, c1519370pdn2, 21);
                    }
                }
            } else {
                for (String str4 : universalPopupAction.customizedActions) {
                    InterfaceC1914220zue interfaceC1914220zue2 = this.LLILZ;
                    if (interfaceC1914220zue2 != null) {
                        interfaceC1914220zue2.LIZIZ(str4, this.LLJI);
                    }
                }
            }
            Boolean bool = universalPopupAction.dismiss;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                MutableLiveData<Stack<UniversalPopup>> mutableLiveData = this.LLILZLL;
                Stack<UniversalPopup> value4 = mutableLiveData.getValue();
                if (value4 != null) {
                    value4.pop();
                }
                mutableLiveData.setValue(mutableLiveData.getValue());
                this.LLILLL.LIZIZ(System.currentTimeMillis() - this.LLJILJIL, universalPopup.business, universalPopup.style, universalPopup.popupId, universalPopupAction.actionId);
            }
            if (Intrinsics.LJFF(universalPopupAction.dismissAll, bool2)) {
                vQ2();
            }
            String str5 = universalPopupAction.linkType;
            if (Intrinsics.LJFF(str5, EnumC1914120zuU.LINK_TYPE_EXTERNAL.getValue())) {
                this.LLIZ.setValue(new C1556130qb5(universalPopupAction.link));
            } else if (Intrinsics.LJFF(str5, EnumC1914120zuU.LINK_TYPE_INTERNAL.getValue())) {
                this.LLIZ.setValue(new C1556120qb4(universalPopupAction.link, z));
            } else if (Intrinsics.LJFF(str5, EnumC1914120zuU.LINK_TYPE_POP.getValue())) {
                String str6 = universalPopupAction.nextPopUp;
                if (str6 == null) {
                    str6 = universalPopupAction.link;
                }
                Object obj = ((LinkedHashMap) this.LLJ).get(str6);
                if (obj != null) {
                    MutableLiveData<Stack<UniversalPopup>> mutableLiveData2 = this.LLILZLL;
                    Vector value5 = mutableLiveData2.getValue();
                    if (value5 != null) {
                        value5.add(obj);
                    }
                    mutableLiveData2.setValue(mutableLiveData2.getValue());
                }
            } else if (Intrinsics.LJFF(str5, EnumC1914120zuU.LINK_TYPE_UPGRADE.getValue())) {
                this.LLIZ.setValue(C1556160qb8.LIZ);
            }
            Stack<UniversalPopup> value6 = this.LLILZLL.getValue();
            if (value6 != null && value6.size() == 0 && (universalPopupAction.approve || Intrinsics.LJFF(universalPopupAction.dismiss, bool2))) {
                zQ2();
            }
            if (Intrinsics.LJFF(universalPopupAction.dismissOnResume, bool2)) {
                i = 1;
                this.LLJILJILJ = true;
            } else {
                i = 1;
            }
            C0NRE c0nre2 = this.LLILLL;
            if (universalPopupAction.customizedActions.size() == i) {
                string = ListProtector.get(universalPopupAction.customizedActions, 0);
            } else {
                string = universalPopupAction.customizedActions.toString();
            }
            String str7 = universalPopupAction.actionId;
            String str8 = universalPopup.business;
            String str9 = universalPopup.popupId;
            String str10 = universalPopup.style;
            Integer numValueOf = Integer.valueOf(universalPopupAction.operation);
            Map<String, ? extends Object> map2 = this.LLJI.LJ;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                Object value7 = entry.getValue();
                if ((value7 instanceof Pair) && (pair = (Pair) value7) != null) {
                    first = pair.getFirst();
                } else {
                    first = null;
                }
                if (Intrinsics.LJFF(first, "true")) {
                    arrayList.add(entry.getKey());
                }
            }
            c0nre2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("business", str8);
            linkedHashMap2.put("popup_id", str9);
            linkedHashMap2.put("style", str10);
            linkedHashMap2.put("operation", String.valueOf(numValueOf));
            linkedHashMap2.put("action", string);
            linkedHashMap2.put("action_id", str7);
            linkedHashMap2.put("selected_options", arrayList.toString());
            c0nre2.LIZ("pns_popup_click", linkedHashMap2);
        }
    }

    public UniversalPopupViewModel(UniversalPopupResponse universalPopupResponse, InterfaceC1914160zuY interfaceC1914160zuY, C0NRE c0nre, InterfaceC1914220zue interfaceC1914220zue) {
        UniversalPopup universalPopup;
        List<UniversalPopup> list;
        List<UniversalPopup> list2;
        List<UniversalPopup> list3;
        this.LL = universalPopupResponse;
        this.LLILLJJLI = interfaceC1914160zuY;
        this.LLILLL = c0nre;
        this.LLILZ = interfaceC1914220zue;
        MediatorLiveData<Stack<UniversalPopup>> mediatorLiveData = new MediatorLiveData<>();
        this.LLILZIL = mediatorLiveData;
        MutableLiveData<Stack<UniversalPopup>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new Stack<>());
        this.LLILZLL = mutableLiveData;
        this.LLIZ = new SingleLiveEvent<>();
        this.LLIZLLLIL = new LinkedList<>();
        this.LLJ = new LinkedHashMap();
        if (universalPopupResponse != null && (list3 = universalPopupResponse.popups) != null) {
            universalPopup = (UniversalPopup) C13LP.LJJJLZIJ(0, list3);
        } else {
            universalPopup = null;
        }
        this.LLJI = wQ2(universalPopup);
        e eVar = new e();
        eVar.LIZJ(new r<Double>() { // from class: com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel$gson$1
            @Override // com.google.gson.r
            public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
                double dDoubleValue = ((Number) obj).doubleValue();
                long j = (long) dDoubleValue;
                if (dDoubleValue == j) {
                    return new q((Number) Long.valueOf(j));
                }
                return new q((Number) Double.valueOf(dDoubleValue));
            }
        }, Double.class);
        this.LLJILLL = eVar.LIZ();
        mediatorLiveData.addSource(mutableLiveData, new C1914200zuc(this));
        if (universalPopupResponse != null && (list2 = universalPopupResponse.popups) != null) {
            ArrayList arrayList = new ArrayList();
            for (UniversalPopup universalPopup2 : list2) {
                if (Intrinsics.LJFF(universalPopup2.isSubPopUp(), Boolean.FALSE)) {
                    arrayList.add(universalPopup2);
                }
            }
            this.LLIZLLLIL.addAll(arrayList);
        }
        UniversalPopupResponse universalPopupResponse2 = this.LL;
        if (universalPopupResponse2 != null && (list = universalPopupResponse2.popups) != null) {
            ArrayList<UniversalPopup> arrayList2 = new ArrayList();
            for (UniversalPopup universalPopup3 : list) {
                if (Intrinsics.LJFF(universalPopup3.isSubPopUp(), Boolean.TRUE)) {
                    arrayList2.add(universalPopup3);
                }
            }
            for (UniversalPopup universalPopup4 : arrayList2) {
                if (universalPopup4.isDispatchBlocks()) {
                    this.LLJ.put(universalPopup4.popupId, universalPopup4);
                } else {
                    this.LLJ.put(universalPopup4.business, universalPopup4);
                }
            }
        }
        zQ2();
    }
}
