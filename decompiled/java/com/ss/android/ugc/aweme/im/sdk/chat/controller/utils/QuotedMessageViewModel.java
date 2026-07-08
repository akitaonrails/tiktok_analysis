package com.ss.android.ugc.aweme.im.sdk.chat.controller.utils;

import X.C051M;
import X.C099R;
import X.C0I82;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y3R;
import X.C0YNY;
import X.C13BV;
import X.C13DV;
import X.C13LP;
import X.C1697820uHc;
import X.C2097908Jt;
import X.C2286608xc;
import X.C23250099c;
import X.C460890I5n;
import X.C463090IDz;
import X.C869590Y9l;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC874680YTa;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedMessageViewModel extends AssemViewModel<InterfaceC0148002o> {
    public static final /* synthetic */ int LLILZIL = 0;
    public final ConcurrentHashMap<Long, C869590Y9l> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, QuotedMessageInfo> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, List<C869590Y9l>> LLILLL = new ConcurrentHashMap<>();
    public final List<Integer> LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(7);
    }

    public QuotedMessageViewModel() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(7);
        c13dvLIZIZ.add(40);
        c13dvLIZIZ.add(1803);
        c13dvLIZIZ.add(1802);
        c13dvLIZIZ.add(1805);
        c13dvLIZIZ.add(1811);
        c13dvLIZIZ.add(1812);
        c13dvLIZIZ.add(1813);
        c13dvLIZIZ.add(1817);
        c13dvLIZIZ.add(2000);
        c13dvLIZIZ.add(1818);
        c13dvLIZIZ.add(1814);
        c13dvLIZIZ.add(1823);
        c13dvLIZIZ.add(1822);
        this.LLILZ = C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public static Pair vQ2(C869590Y9l c869590Y9l, String str) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("REPLIED_TEMPLATE"), str)) {
            return null;
        }
        c869590Y9l.getLocalExt().put("REPLIED_TEMPLATE", str);
        return new Pair(c869590Y9l, C2097908Jt.LIZJ(new Pair("REPLIED_TEMPLATE", new C0Y3R(str))));
    }

    public final <T extends QuotedMessageInfo> T wQ2(C869590Y9l c869590Y9l, Class<T> cls) {
        Long l;
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.referenced_message_id) != null) {
            try {
                QuotedMessageInfo quotedMessageInfo = this.LLILLJJLI.get(Long.valueOf(l.longValue()));
                if (quotedMessageInfo instanceof QuotedMessageInfo) {
                    T t = (T) quotedMessageInfo;
                    if (t != null) {
                        return t;
                    }
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String str = c869590Y9l.getLocalExt().get("REPLIED_TEMPLATE");
            if (str != null) {
                try {
                    return (T) C051M.LIZ(cls, str);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return null;
    }

    public final Object yQ2(List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String conversationId;
        Object objXQ2;
        Long l;
        String strLJ;
        Long l2;
        Integer numLJ;
        if (list.isEmpty()) {
            return Unit.LIZ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<C869590Y9l> arrayList2 = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
            if (referenceInfo != null && (l2 = referenceInfo.ref_message_type) != null && (numLJ = C2286608xc.LJ((int) l2.longValue())) != null && this.LLILZ.contains(numLJ)) {
                arrayList2.add(c869590Y9l);
            }
        }
        for (C869590Y9l c869590Y9l2 : arrayList2) {
            ReferenceInfo referenceInfo2 = c869590Y9l2.getReferenceInfo();
            if (referenceInfo2 != null && (l = referenceInfo2.referenced_message_id) != null) {
                long jLongValue = l.longValue();
                ConcurrentHashMap<Long, List<C869590Y9l>> concurrentHashMap = this.LLILLL;
                Long lLJFF = C2286608xc.LJFF(jLongValue);
                List<C869590Y9l> list2 = this.LLILLL.get(C2286608xc.LJFF(jLongValue));
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                concurrentHashMap.put(lLJFF, C13LP.LJLILLLLZI(c869590Y9l2, list2));
                QuotedMessageInfo quotedMessageInfo = this.LLILLJJLI.get(C2286608xc.LJFF(jLongValue));
                if (quotedMessageInfo != null && (strLJ = C051M.LJ(quotedMessageInfo, false)) != null) {
                    Pair pairVQ2 = vQ2(c869590Y9l2, strLJ);
                    if (pairVQ2 != null) {
                        C869590Y9l c869590Y9l3 = (C869590Y9l) pairVQ2.getFirst();
                        linkedHashMap.put(c869590Y9l3.getUuid(), new Pair(c869590Y9l3, pairVQ2.getSecond()));
                    }
                } else {
                    Boolean.valueOf(arrayList.add(C2286608xc.LJFF(jLongValue)));
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap.values()), true, new C0Y3I("QuotedTemplateViewModel"));
        }
        C869590Y9l c869590Y9l4 = (C869590Y9l) C13LP.LJJJLL(list);
        if (c869590Y9l4 != null && (conversationId = c869590Y9l4.getConversationId()) != null && (objXQ2 = xQ2(conversationId, arrayList, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objXQ2;
        }
        return Unit.LIZ;
    }

    public final void zQ2(List<? extends C869590Y9l> list, Function1<? super Long, Unit> function1) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C869590Y9l c869590Y9l : list) {
            if (function1 != null) {
                function1.invoke(Long.valueOf(c869590Y9l.getMsgId()));
            }
            this.LL.put(Long.valueOf(c869590Y9l.getMsgId()), c869590Y9l);
            QuotedMessageInfo.Companion.getClass();
            QuotedMessageInfo quotedMessageInfoLIZ = C0I82.LIZ(c869590Y9l);
            if (quotedMessageInfoLIZ != null) {
                this.LLILLJJLI.put(Long.valueOf(c869590Y9l.getMsgId()), quotedMessageInfoLIZ);
                String strLJ = C051M.LJ(quotedMessageInfoLIZ, false);
                List<C869590Y9l> list2 = this.LLILLL.get(Long.valueOf(c869590Y9l.getMsgId()));
                if (list2 != null) {
                    Iterator<C869590Y9l> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Pair pairVQ2 = vQ2(it2.next(), strLJ);
                        if (pairVQ2 != null) {
                            C869590Y9l c869590Y9l2 = (C869590Y9l) pairVQ2.getFirst();
                            linkedHashMap.put(c869590Y9l2.getUuid(), new Pair(c869590Y9l2, pairVQ2.getSecond()));
                        }
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap.values()), true, new C0Y3I("QuotedTemplateViewModel"));
        }
    }

    public final Object xQ2(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        if (list.isEmpty()) {
            return Unit.LIZ;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C460890I5n(list, this, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
