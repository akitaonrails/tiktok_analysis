package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.AbstractC1223670hwr;
import X.AbstractC1223800hx4;
import X.AbstractC1223820hx6;
import X.AbstractC1387200mCc;
import X.AbstractC316870CbV;
import X.AbstractC595720NYc;
import X.C01GW;
import X.C08CX;
import X.C0I0B;
import X.C1153940g8O;
import X.C1157130gDX;
import X.C1218610hoh;
import X.C1222560hv4;
import X.C1223620hwm;
import X.C1223660hwq;
import X.C1223680hws;
import X.C1223790hx3;
import X.C1223990hxN;
import X.C1224190hxh;
import X.C1224280hxq;
import X.C1224760hyc;
import X.C1224840hyk;
import X.C13BV;
import X.C13LP;
import X.C1527905yX;
import X.C15438062q;
import X.C1559260qg8;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19719612Di;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C291001Au;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C452501pT;
import X.C491101vh;
import X.C627660Ojc;
import X.C723600SZy;
import X.C894660Z7w;
import X.EnumC1224390hy1;
import X.InterfaceC0148002o;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224180hxg;
import X.InterfaceC1224210hxj;
import X.InterfaceC1224750hyb;
import X.InterfaceC1891350zJl;
import X.InterfaceC897330ZId;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorTabContactListVM extends AssemListViewModel<C1218610hoh, AbstractC1223800hx4, Object> {
    public static final /* synthetic */ int LLJ = 0;
    public final InterfaceC1224160hxe LL;
    public final InterfaceC1224750hyb LLILLJJLI;
    public final InterfaceC1223330hwJ LLILLL;
    public final C01GW LLILZ = C1223620hwm.LJ(this);
    public final C1559260qg8 LLILZIL = new C1559260qg8(new C723600SZy(this, C1153940g8O.class, "tab_fragment_hierarchy_data"), true);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2676));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2677));
    public boolean LLIZLLLIL;

    public static C1218610hoh vQ2() {
        return new C1218610hoh(new C291001Au(new C1222560hv4(0, false)), new C627660Ojc(null, null, null, null, 15), C13BV.INSTANCE);
    }

    public final String getTabKey() {
        return (String) this.LLIZ.getValue();
    }

    public final C1224280hxq xQ2() {
        return (C1224280hxq) this.LLILZ.getValue();
    }

    public final InterfaceC1224210hxj yQ2() {
        return (InterfaceC1224210hxj) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return vQ2();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC1223800hx4> c627660Ojc) {
        ArrayList arrayList;
        InterfaceC897330ZId interfaceC897330ZIdIN2;
        Context contextLIZ;
        C627660Ojc<AbstractC1223800hx4> c627660OjcLIZ = c627660Ojc;
        if ((c627660OjcLIZ.LLILLJJLI instanceof C491101vh) && (c627660OjcLIZ.LL instanceof C1623606Xi) && !this.LLIZLLLIL) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                C0I0B.LJFF.LIZJ();
                contextLIZ = C894660Z7w.LIZ();
            }
            setStateImmediate(new AwS385S0200000_19(this, contextLIZ, 100));
            InterfaceC1224160hxe interfaceC1224160hxe = this.LL;
            if (interfaceC1224160hxe != null) {
                interfaceC1224160hxe.lz2(getTabKey());
            }
            this.LLIZLLLIL = true;
        }
        C1223620hwm.LIZJ(c627660OjcLIZ, this.LLILLL);
        if (yQ2().LIZIZ().LIZJ().LIZ()) {
            InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = yQ2().LIZIZ();
            List<? extends AbstractC1223800hx4> list = c627660OjcLIZ.LLILZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c627660OjcLIZ = C627660Ojc.LIZ(c627660OjcLIZ, null, null, null, interfaceC1224180hxgLIZIZ.LJIJJLI(list), 7);
        }
        List<AbstractC1223800hx4> list2 = c627660OjcLIZ.LLILZ;
        if (list2 != null && xQ2().LJ().LJJIZ().LIZLLL()) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC1223800hx4 abstractC1223800hx4 : list2) {
                if (abstractC1223800hx4 instanceof C1224840hyk) {
                    arrayList2.add(abstractC1223800hx4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC595720NYc abstractC595720NYcLIZIZ = C1223620hwm.LIZIZ((C1224840hyk) it2.next());
                if (abstractC595720NYcLIZIZ != null) {
                    arrayList3.add(abstractC595720NYcLIZIZ);
                }
            }
            InterfaceC1224750hyb interfaceC1224750hyb = this.LLILLJJLI;
            if (interfaceC1224750hyb != null && (interfaceC897330ZIdIN2 = interfaceC1224750hyb.IN2()) != null) {
                interfaceC897330ZIdIN2.LJFF(arrayList3);
            }
        }
        getTabKey();
        List<AbstractC1223800hx4> list3 = c627660OjcLIZ.LLILZ;
        if (list3 != null) {
            arrayList = new ArrayList();
            for (AbstractC1223800hx4 abstractC1223800hx42 : list3) {
                if (abstractC1223800hx42 instanceof C1224840hyk) {
                    arrayList.add(abstractC1223800hx42);
                }
            }
        } else {
            arrayList = null;
        }
        Objects.toString(arrayList);
        zQ2(c627660OjcLIZ, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Object>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1224130hxb
            if (r0 == 0) goto L9f
            r5 = r8
            X.0hxb r5 = (X.C1224130hxb) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L5f
            if (r0 != r4) goto La6
            X.C155000ia.LIZIZ(r2)
        L22:
            X.0hwr r2 = (X.AbstractC1223670hwr) r2
            X.0hxq r0 = r7.xQ2()
            X.0hyF r0 = r0.LJIIJJI
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L3b
            X.0hxq r0 = r7.xQ2()
            X.0hyA r0 = r0.LIZJ()
            if (r0 == 0) goto L3b
            r0.LJII()
        L3b:
            X.0hxq r0 = r7.xQ2()
            X.0hyF r0 = r0.LJIIJJI
            java.lang.String r1 = r0.LJFF
            java.lang.String r0 = r7.getTabKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5a
            X.0hxq r0 = r7.xQ2()
            X.0hyA r0 = r0.LIZJ()
            if (r0 == 0) goto L5a
            r0.LJ()
        L5a:
            X.0CbV r0 = r7.wQ2(r2)
            return r0
        L5f:
            X.C155000ia.LIZIZ(r2)
            X.0hxq r0 = r7.xQ2()
            X.0hyA r0 = r0.LIZJ()
            if (r0 == 0) goto L6f
            r0.LJI()
        L6f:
            X.0hxq r0 = r7.xQ2()
            X.0hyF r0 = r0.LJIIJJI
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L86
            X.0hxq r0 = r7.xQ2()
            X.0hyA r0 = r0.LIZJ()
            if (r0 == 0) goto L86
            r0.LIZJ()
        L86:
            X.0hxq r0 = r7.xQ2()
            X.0hyF r3 = r0.LJIIJJI
            java.lang.String r2 = r7.getTabKey()
            X.0hxc r1 = new X.0hxc
            r0 = 0
            r1.<init>(r7, r0)
            r5.LLILLL = r4
            java.lang.Object r2 = r3.LIZ(r2, r1, r5)
            if (r2 != r6) goto L22
            return r6
        L9f:
            X.0hxb r5 = new X.0hxb
            r5.<init>(r7, r8)
            goto L12
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0hx4] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final AbstractC316870CbV<Object> wQ2(AbstractC1223670hwr abstractC1223670hwr) {
        Collection arrayList;
        Set<C1224840hyk> setFt;
        Set<String> setLO;
        int i;
        Integer numValueOf;
        boolean z;
        boolean z2;
        Object next;
        Map<String, List<C1224840hyk>> mapTy2;
        if (abstractC1223670hwr instanceof C1223660hwq) {
            getTabKey();
            C1223660hwq c1223660hwq = (C1223660hwq) abstractC1223670hwr;
            List<AbstractC1223800hx4> list = c1223660hwq.LIZ;
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC1223800hx4 abstractC1223800hx4 : list) {
                if (abstractC1223800hx4 instanceof C1224840hyk) {
                    arrayList2.add(abstractC1223800hx4);
                }
            }
            if (c1223660hwq.LIZ.isEmpty()) {
                if (!c1223660hwq.LIZIZ) {
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    C13BV c13bv = C13BV.INSTANCE;
                    c317290CcB.getClass();
                    return new C316640Cb8(c13bv);
                }
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1223660hwq.LIZJ, C13BV.INSTANCE, 1);
            }
            EnumC1224390hy1 enumC1224390hy1LIZJ = xQ2().LJ().LJJIZ().LIZJ();
            InterfaceC1224160hxe interfaceC1224160hxe = this.LL;
            if (interfaceC1224160hxe != null && (mapTy2 = interfaceC1224160hxe.Ty2()) != null) {
                arrayList = new ArrayList();
                Iterator<Map.Entry<String, List<C1224840hyk>>> it2 = mapTy2.entrySet().iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().getValue(), arrayList);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            InterfaceC1224160hxe interfaceC1224160hxe2 = this.LL;
            if (interfaceC1224160hxe2 == null || (setFt = interfaceC1224160hxe2.Ft()) == null) {
                setFt = C08CX.INSTANCE;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                linkedHashSet.add(((C1224840hyk) it3.next()).LLILZ);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : setFt) {
                if (!linkedHashSet.contains(((C1224840hyk) obj).LLILZ)) {
                    arrayList3.add(obj);
                }
            }
            List listLJLIL = C13LP.LJLIL(arrayList3, arrayList);
            List<AbstractC1223800hx4> list2 = c1223660hwq.LIZ;
            ArrayList<??> arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (InterfaceC1891350zJl interfaceC1891350zJlLIZ : list2) {
                if (interfaceC1891350zJlLIZ instanceof C1224840hyk) {
                    Iterator it4 = ((ArrayList) listLJLIL).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(((C1224840hyk) next).LLILZ, ((C1224840hyk) interfaceC1891350zJlLIZ).LLILZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1224840hyk c1224840hyk = (C1224840hyk) next;
                    if (c1224840hyk != null) {
                        interfaceC1891350zJlLIZ = C1224840hyk.LIZ((C1224840hyk) interfaceC1891350zJlLIZ, null, null, c1224840hyk.LLJ, null, null, c1224840hyk.LLJILJIL, c1224840hyk.LLJILJILJ, c1224840hyk.LLJILLL, c1224840hyk.LLJJ, false, 34559);
                    }
                }
                arrayList4.add(interfaceC1891350zJlLIZ);
            }
            InterfaceC1224160hxe interfaceC1224160hxe3 = this.LL;
            if (interfaceC1224160hxe3 == null || (setLO = interfaceC1224160hxe3.LO()) == null) {
                setLO = C08CX.INSTANCE;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (obj2 instanceof C1224840hyk) {
                    arrayList5.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList<C1224840hyk> arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (hashSet.add(((C1224840hyk) obj3).LLILZ)) {
                    arrayList6.add(obj3);
                }
            }
            if (arrayList6.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (C1224840hyk c1224840hyk2 : arrayList6) {
                    if (c1224840hyk2.LLJILJIL && !c1224840hyk2.LLJILLL && !setLO.contains(c1224840hyk2.LLILZ) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            InterfaceC1224160hxe interfaceC1224160hxe4 = this.LL;
            if (interfaceC1224160hxe4 != null) {
                numValueOf = Integer.valueOf(interfaceC1224160hxe4.Vb());
            } else {
                numValueOf = null;
            }
            int iLIZ = C1527905yX.LIZ(numValueOf) + i;
            C1223990hxN c1223990hxNLJFF = xQ2().LJFF();
            if (c1223990hxNLJFF.LIZ.LJIIJ().LJJIZ().LIZJ() == EnumC1224390hy1.SINGLE && iLIZ > 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Your selectMode is SINGLE, the maxCount selectedSize is 1, but after latest data load, the selected count is ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", it's not allowed.");
                RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                c1223990hxNLJFF.LIZ.getTag();
                if (C1223620hwm.LJFF()) {
                    throw runtimeException;
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (?? LIZ : arrayList4) {
                if (LIZ instanceof C1224840hyk) {
                    C1223990hxN c1223990hxNLJFF2 = xQ2().LJFF();
                    LIZ = (C1224840hyk) LIZ;
                    c1223990hxNLJFF2.getClass();
                    if (!LIZ.LLJILJILJ && LIZ.LLJILLL) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("The item: id:");
                        sbLIZ2.append(LIZ.LLILZ);
                        sbLIZ2.append(", name:");
                        sbLIZ2.append(LIZ.LLILZLL);
                        sbLIZ2.append(" default enable but isDefaultAndAlwaysDisable is true ");
                        RuntimeException runtimeException2 = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                        c1223990hxNLJFF2.LIZ.getTag();
                        if (C1223620hwm.LJFF()) {
                            throw runtimeException2;
                        }
                    }
                    C1223990hxN c1223990hxNLJFF3 = xQ2().LJFF();
                    c1223990hxNLJFF3.getClass();
                    if (LIZ.LLJ && LIZ.LLJJ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("The item: id:");
                        sbLIZ3.append(LIZ.LLILZ);
                        sbLIZ3.append(", name:");
                        sbLIZ3.append(LIZ.LLILZLL);
                        sbLIZ3.append(" default show selectBox but isAlwaysHideSelectBox is true ");
                        RuntimeException runtimeException3 = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        c1223990hxNLJFF3.LIZ.getTag();
                        if (C1223620hwm.LJFF()) {
                            throw runtimeException3;
                        }
                    }
                    if (enumC1224390hy1LIZJ != EnumC1224390hy1.DISABLE && enumC1224390hy1LIZJ != EnumC1224390hy1.SINGLE) {
                        boolean z3 = LIZ.LLJILJIL;
                        boolean z4 = LIZ.LLJILJILJ;
                        if (!z3 && !z4) {
                            if (xQ2().LJ().LJJIZ().LIZIZ() <= iLIZ) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = z4;
                        }
                        if (!xQ2().LJ().LJJIZ().LIZ()) {
                            z2 = LIZ.LLJ;
                        } else if ((z && !z4) || LIZ.LLJJ) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        LIZ = C1224840hyk.LIZ(LIZ, null, null, z2, null, null, z3, z, false, false, false, 59135);
                    } else {
                        arrayList7.add(LIZ);
                    }
                } else if ((LIZ instanceof C1223790hx3) || (LIZ instanceof AbstractC1223820hx6)) {
                }
                if (LIZ != 0) {
                    arrayList7.add(LIZ);
                }
            }
            getTabKey();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : arrayList7) {
                if (obj4 instanceof C1224840hyk) {
                    arrayList8.add(obj4);
                }
            }
            if (!c1223660hwq.LIZIZ) {
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(arrayList7);
            }
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1223660hwq.LIZJ, arrayList7, 1);
        }
        if (abstractC1223670hwr instanceof C1223680hws) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc = ((C1223680hws) abstractC1223670hwr).LIZ;
            c317290CcB2.getClass();
            return new C316650Cb9(exc);
        }
        C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
        C13BV c13bv2 = C13BV.INSTANCE;
        c317290CcB3.getClass();
        return new C316640Cb8(c13bv2);
    }

    public static C1218610hoh AQ2(C1218610hoh c1218610hoh, List list) {
        LinkedHashMap linkedHashMap;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        List<C1224760hyc> list2 = c1218610hoh.LLILLL;
        if (list2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
            for (C1224760hyc c1224760hyc : list2) {
                linkedHashMap2.put(c1224760hyc.LL, c1224760hyc);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1224190hxh c1224190hxh = (C1224190hxh) it2.next();
            C1224760hyc c1224760hyc2 = (C1224760hyc) linkedHashMap.get(c1224190hxh.LIZ);
            if (c1224760hyc2 != null) {
                C1224760hyc c1224760hycLIZ = C1224760hyc.LIZ(c1224760hyc2, null, false, false, 127);
                Boolean bool = c1224190hxh.LIZJ;
                if (bool != null && c1224760hyc2.LLILZLL != (zBooleanValue2 = bool.booleanValue())) {
                    c1224760hycLIZ = C1224760hyc.LIZ(c1224760hycLIZ, null, zBooleanValue2, false, 95);
                }
                Boolean bool2 = c1224190hxh.LIZIZ;
                if (bool2 != null && c1224760hyc2.LLIZ != (zBooleanValue = bool2.booleanValue())) {
                    c1224760hycLIZ = C1224760hyc.LIZ(c1224760hycLIZ, null, false, zBooleanValue, 63);
                }
                String str = c1224190hxh.LIZLLL;
                if (str != null) {
                    c1224760hycLIZ = C1224760hyc.LIZ(c1224760hycLIZ, str, false, false, 119);
                }
                linkedHashMap.put(c1224190hxh.LIZ, c1224760hycLIZ);
            }
        }
        return C1218610hoh.LIZ(c1218610hoh, null, null, new ArrayList(linkedHashMap.values()), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.Object r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Object>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1224150hxd
            if (r0 == 0) goto L3d
            r4 = r7
            X.0hxd r4 = (X.C1224150hxd) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0hwr r3 = (X.AbstractC1223670hwr) r3
            X.0CbV r0 = r5.wQ2(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0hxj r0 = r5.yQ2()
            X.0hxg r0 = r0.LIZIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJJJI(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0hxd r4 = new X.0hxd
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM.onLoadMore(java.lang.Object, X.05Vn):java.lang.Object");
    }

    public final void zQ2(C627660Ojc<AbstractC1223800hx4> c627660Ojc, boolean z) {
        ArrayList arrayList;
        InterfaceC1224160hxe interfaceC1224160hxe;
        getTabKey();
        List<AbstractC1223800hx4> list = c627660Ojc.LLILZ;
        if (list != null) {
            arrayList = new ArrayList();
            for (AbstractC1223800hx4 abstractC1223800hx4 : list) {
                if (abstractC1223800hx4 instanceof C1224840hyk) {
                    arrayList.add(abstractC1223800hx4);
                }
            }
        } else {
            arrayList = null;
        }
        Objects.toString(arrayList);
        if (z && (interfaceC1224160hxe = this.LL) != null) {
            interfaceC1224160hxe.BL1(getTabKey(), c627660Ojc.LLILZ);
        }
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 509));
    }

    public SelectorTabContactListVM(InterfaceC1224160hxe interfaceC1224160hxe, InterfaceC1224750hyb interfaceC1224750hyb, InterfaceC1223330hwJ interfaceC1223330hwJ) {
        this.LL = interfaceC1224160hxe;
        this.LLILLJJLI = interfaceC1224750hyb;
        this.LLILLL = interfaceC1223330hwJ;
    }
}
