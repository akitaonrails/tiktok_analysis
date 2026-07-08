package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.AbstractC885530YoZ;
import X.AbstractC885540Yoa;
import X.C01GW;
import X.C0YRM;
import X.C0YUD;
import X.C13BV;
import X.C13LP;
import X.C1559260qg8;
import X.C1729806q0;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C723600SZy;
import X.C865690Xxf;
import X.C876590Ya9;
import X.C878630YdR;
import X.C878960Ydy;
import X.C879580Yey;
import X.C880430YgL;
import X.C880690Ygl;
import X.C880790Ygv;
import X.C880960YhC;
import X.C884160YmM;
import X.C885260Yo8;
import X.C885310YoD;
import X.C885430YoP;
import X.C885450YoR;
import X.C885630Yoj;
import X.C885760Yow;
import X.C886410Ypz;
import X.C886420Yq0;
import X.C887750Ys9;
import X.EnumC871430YGn;
import X.EnumC877640Ybq;
import X.EnumC880520YgU;
import X.EnumC880850Yh1;
import X.InterfaceC1491305sd;
import X.InterfaceC497601wk;
import X.InterfaceC878620YdQ;
import X.InterfaceC883880Ylu;
import X.InterfaceC884020Ym8;
import X.InterfaceC885440YoQ;
import X.InterfaceC885460YoS;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS29S0010000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestListVMV2 extends BaseMessageRequestListVM {
    public static final /* synthetic */ int LLJILLL = 0;
    public final InterfaceC885440YoQ LL;
    public final InterfaceC885460YoS LLILLJJLI;
    public C0YUD LLILZ;
    public volatile boolean LLIZLLLIL;
    public boolean LLJ;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C887750Ys9.class, "message_request_fragment_config"), true);
    public final Set<InterfaceC878620YdQ> LLILZIL = new LinkedHashSet();
    public final Map<C878960Ydy, InterfaceC884020Ym8> LLILZLL = new LinkedHashMap();
    public final Map<C878960Ydy, Boolean> LLIZ = new LinkedHashMap();
    public final Map<C878960Ydy, String> LLJI = new LinkedHashMap();
    public final Set<String> LLJIJIL = new LinkedHashSet();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 406));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 405));

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void EQ2() {
        this.LLJ = true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final List<C878960Ydy> C40() {
        List<C878960Ydy> listC40;
        InterfaceC885440YoQ interfaceC885440YoQ = this.LL;
        return (interfaceC885440YoQ == null || (listC40 = interfaceC885440YoQ.C40()) == null) ? C13BV.INSTANCE : listC40;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void LJJJJLI() {
        setState(AFwS248S0000000_14.get$arr$(117));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final boolean Ro() {
        InterfaceC885440YoQ interfaceC885440YoQ = this.LL;
        if (interfaceC885440YoQ != null) {
            return interfaceC885440YoQ.Ro();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final EnumC871430YGn a1() {
        EnumC871430YGn enumC871430YGnA1;
        InterfaceC885440YoQ interfaceC885440YoQ = this.LL;
        return (interfaceC885440YoQ == null || (enumC871430YGnA1 = interfaceC885440YoQ.a1()) == null) ? EnumC871430YGn.ALL_STRANGER : enumC871430YGnA1;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void vQ2() {
        ((C885760Yow) this.LLJILJIL.getValue()).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void wQ2() {
        ((C885760Yow) this.LLJILJIL.getValue()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void xQ2() {
        ((C885760Yow) this.LLJILJIL.getValue()).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final String zQ2() {
        C880790Ygv c880790Ygv = C880790Ygv.LIZ;
        C878960Ydy c878960Ydy = getState().LLILLL;
        EnumC880520YgU enumC880520YgU = c878960Ydy != null ? c878960Ydy.LLILLL : null;
        EnumC871430YGn enumC871430YGnA1 = a1();
        c880790Ygv.getClass();
        return enumC880520YgU == EnumC880520YgU.MESSAGE_REQUEST_SPAM ? "message_request_spam" : enumC871430YGnA1 == EnumC871430YGn.ALL_RISKY ? "filtered_message_request" : "non_filtered_message_request";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final String BQ2() {
        C878960Ydy c878960Ydy;
        EnumC880520YgU enumC880520YgU;
        if (!Ro() || (c878960Ydy = getState().LLILLL) == null || (enumC880520YgU = c878960Ydy.LLILLL) == null) {
            return null;
        }
        return enumC880520YgU.getMobValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final boolean CQ2() {
        List<AbstractC885540Yoa<?>> listLQ2 = LQ2();
        if (listLQ2.isEmpty()) {
            return false;
        }
        Iterator<AbstractC885540Yoa<?>> it2 = listLQ2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZLLL(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final List<AbstractC885540Yoa<?>> LQ2() {
        Collection collection = getState().LLILLJJLI;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterable iterable = getState().LLILZIL;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LJLIL(iterable, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM, com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C880960YhC c880960YhC = C880960YhC.LIZ;
        Set<String> set = this.LLJIJIL;
        c880960YhC.getClass();
        if (!set.isEmpty()) {
            C23250099c.LIZLLL((InterfaceC497601wk) C880960YhC.LIZIZ.getValue(), null, null, new C865690Xxf(set, null), 3);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZLL).entrySet()) {
            IChatListEngine.LIZ.getClass();
            C884160YmM.LIZ().LJIIIIZZ(((InterfaceC884020Ym8) entry.getValue()).getConfig());
        }
        C0YUD c0yud = this.LLILZ;
        if (c0yud != null) {
            c0yud.LIZJ();
        }
        Iterator<InterfaceC878620YdQ> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C876590Ya9 c876590Ya9 = C876590Ya9.LIZ;
        EnumC871430YGn enumC871430YGnA1 = a1();
        c876590Ya9.getClass();
        C0YUD c0yudLIZIZ = C876590Ya9.LIZIZ(enumC871430YGnA1);
        if (c0yudLIZIZ == null) {
            c0yudLIZIZ = C0YRM.LIZ(a1());
        }
        this.LLILZ = c0yudLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void refreshData() {
        C878960Ydy c878960Ydy;
        EnumC880520YgU enumC880520YgULIZ = C880690Ygl.LIZ();
        C878960Ydy c878960Ydy2 = null;
        if (a1() == EnumC871430YGn.ALL_RISKY) {
            Iterator<C878960Ydy> it2 = C40().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C878960Ydy next = it2.next();
                if (next.LLILLL == EnumC880520YgU.RISKY) {
                    c878960Ydy2 = next;
                    break;
                }
            }
            c878960Ydy = c878960Ydy2;
        } else {
            Iterator<C878960Ydy> it3 = C40().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C878960Ydy next2 = it3.next();
                if (next2.LLILLL == enumC880520YgULIZ) {
                    c878960Ydy2 = next2;
                    break;
                }
            }
            c878960Ydy = c878960Ydy2;
        }
        if (c878960Ydy == null) {
            return;
        }
        FQ2(c878960Ydy, "default_land");
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final boolean AQ2() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final boolean DQ2(List<? extends AbstractC885540Yoa<?>> list) {
        if (list == null) {
            list = LQ2();
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator<? extends AbstractC885540Yoa<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().LIZLLL(), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void HQ2(String str) {
        this.LLJIJIL.add(str);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void IQ2(int i) {
        List<AbstractC885540Yoa<?>> list;
        C878960Ydy c878960Ydy = getState().LLILLL;
        if (c878960Ydy != null && (list = getState().LLILLJJLI) != null) {
            int size = list.size();
            Object obj = ((LinkedHashMap) this.LLIZ).get(c878960Ydy);
            Boolean bool = Boolean.FALSE;
            if (!Intrinsics.LJFF(obj, bool) && size - i <= 10) {
                this.LLIZ.put(c878960Ydy, bool);
                InterfaceC883880Ylu interfaceC883880Ylu = (InterfaceC883880Ylu) ((LinkedHashMap) this.LLILZLL).get(c878960Ydy);
                if (interfaceC883880Ylu != null) {
                    interfaceC883880Ylu.c5("pre_load_more_on_cell_attached");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void JQ2(InterfaceC1491305sd interfaceC1491305sd) {
        Boolean boolValueOf;
        String key;
        boolean zLJFF;
        C886410Ypz c886410Ypz;
        C879580Yey key2;
        String conversationId;
        C886420Yq0 c886420Yq0;
        C878630YdR key3;
        String conversationId2;
        C886420Yq0 c886420Yq02;
        C878630YdR key4;
        C885430YoP state = getState();
        List<AbstractC885540Yoa<?>> list = state.LLILLJJLI;
        int i = -1;
        List<AbstractC885540Yoa<?>> arrayList = null;
        Boolean boolValueOf2 = null;
        if (list == null) {
            list = null;
        } else {
            Iterator<AbstractC885540Yoa<?>> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    AbstractC885540Yoa<?> next = it2.next();
                    if (interfaceC1491305sd instanceof C878630YdR) {
                        AbstractC885530YoZ abstractC885530YoZLIZIZ = next.LIZIZ();
                        if ((abstractC885530YoZLIZIZ instanceof C886420Yq0) && (c886420Yq0 = (C886420Yq0) abstractC885530YoZLIZIZ) != null && (key3 = c886420Yq0.getKey()) != null) {
                            conversationId = key3.getConversationId();
                        } else {
                            conversationId = null;
                        }
                        zLJFF = Intrinsics.LJFF(conversationId, ((C878630YdR) interfaceC1491305sd).getConversationId());
                    } else if (interfaceC1491305sd instanceof C879580Yey) {
                        AbstractC885530YoZ abstractC885530YoZLIZIZ2 = next.LIZIZ();
                        if ((abstractC885530YoZLIZIZ2 instanceof C886410Ypz) && (c886410Ypz = (C886410Ypz) abstractC885530YoZLIZIZ2) != null && (key2 = c886410Ypz.getKey()) != null) {
                            key = key2.getKey();
                        } else {
                            key = null;
                        }
                        zLJFF = Intrinsics.LJFF(key, ((C879580Yey) interfaceC1491305sd).getKey());
                    } else {
                        continue;
                        i2++;
                    }
                    if (zLJFF) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                AbstractC885540Yoa abstractC885540Yoa = (AbstractC885540Yoa) ListProtector.get(list, iIntValue);
                if (abstractC885540Yoa.LIZLLL() != null) {
                    boolValueOf = Boolean.valueOf(!r0.booleanValue());
                } else {
                    boolValueOf = null;
                }
                AbstractC885540Yoa abstractC885540YoaLIZ = abstractC885540Yoa.LIZ(boolValueOf);
                ArrayList arrayList2 = new ArrayList(list);
                ListProtector.set(arrayList2, iIntValue, abstractC885540YoaLIZ);
                list = arrayList2;
            }
        }
        List<AbstractC885540Yoa<?>> list2 = state.LLILZIL;
        if (list2 != null) {
            Iterator<AbstractC885540Yoa<?>> it3 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC885540Yoa<?> next2 = it3.next();
                if (interfaceC1491305sd instanceof C878630YdR) {
                    AbstractC885530YoZ abstractC885530YoZLIZIZ3 = next2.LIZIZ();
                    if ((abstractC885530YoZLIZIZ3 instanceof C886420Yq0) && (c886420Yq02 = (C886420Yq0) abstractC885530YoZLIZIZ3) != null && (key4 = c886420Yq02.getKey()) != null) {
                        conversationId2 = key4.getConversationId();
                    } else {
                        conversationId2 = null;
                    }
                    if (Intrinsics.LJFF(conversationId2, ((C878630YdR) interfaceC1491305sd).getConversationId())) {
                        i = i3;
                        break;
                    }
                }
                i3++;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            if (numValueOf2.intValue() >= 0) {
                int iIntValue2 = numValueOf2.intValue();
                AbstractC885540Yoa abstractC885540Yoa2 = (AbstractC885540Yoa) ListProtector.get(list2, iIntValue2);
                if (abstractC885540Yoa2.LIZLLL() != null) {
                    boolValueOf2 = Boolean.valueOf(!r0.booleanValue());
                }
                AbstractC885540Yoa abstractC885540YoaLIZ2 = abstractC885540Yoa2.LIZ(boolValueOf2);
                arrayList = new ArrayList<>(list2);
                ListProtector.set(arrayList, iIntValue2, abstractC885540YoaLIZ2);
            } else {
                arrayList = list2;
            }
        }
        setState(new AwS380S0200000_14(list, arrayList, (List<? extends AbstractC885540Yoa<?>>) 28));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void KQ2(boolean z) {
        setState(new AwS29S0010000_14(z, 3));
        this.LLIZLLLIL = z;
        if (z) {
            withState(new AwS593S0100000_14(this, 44));
            C885310YoD c885310YoD = C885310YoD.LIZ;
            String strZQ2 = zQ2();
            String strBQ2 = BQ2();
            c885310YoD.getClass();
            C885310YoD.LJJIIJ(strZQ2, strBQ2);
        }
    }

    public final void MQ2(EnumC880850Yh1 enumC880850Yh1) {
        this.LLIZLLLIL = false;
        setState(new AwS380S0200000_14(enumC880850Yh1, this, 27));
    }

    public MessageRequestListVMV2(InterfaceC885440YoQ interfaceC885440YoQ, InterfaceC885460YoS interfaceC885460YoS) {
        this.LL = interfaceC885440YoQ;
        this.LLILLJJLI = interfaceC885460YoS;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void FQ2(C878960Ydy c878960Ydy, String str) {
        C878960Ydy c878960Ydy2 = getState().LLILLL;
        if (Intrinsics.LJFF(c878960Ydy, c878960Ydy2)) {
            return;
        }
        InterfaceC884020Ym8 interfaceC884020Ym8 = (InterfaceC884020Ym8) ((LinkedHashMap) this.LLILZLL).get(c878960Ydy);
        InterfaceC883880Ylu interfaceC883880Ylu = (InterfaceC883880Ylu) ((LinkedHashMap) this.LLILZLL).get(c878960Ydy2);
        if (interfaceC883880Ylu != null) {
            interfaceC883880Ylu.LJLLLLLL();
        }
        if (interfaceC884020Ym8 == null) {
            setStateImmediate(new AwS593S0100000_14(c878960Ydy, 43));
            C1729806q0.LIZIZ(new AwS415S0200000_14(c878960Ydy, this, 72), true);
        } else {
            setState(new AwS223S0300000_14(interfaceC884020Ym8, this, c878960Ydy, 2));
        }
        yQ2(C885630Yoj.LIZLLL().prioritySettingState, c878960Ydy);
        if (interfaceC884020Ym8 != null) {
            if (Ro()) {
                C885260Yo8.LIZ(c878960Ydy, interfaceC884020Ym8.LIZIZ(false), interfaceC884020Ym8.LJIIJJI(), str);
                return;
            }
            return;
        }
        this.LLJI.put(c878960Ydy, str);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void GQ2(EnumC880520YgU enumC880520YgU, String str) {
        C878960Ydy c878960Ydy = getState().LLILLL;
        if (c878960Ydy == null) {
            return;
        }
        C880430YgL c880430YgL = c878960Ydy.LLILLJJLI;
        FQ2(C878960Ydy.LIZ(c878960Ydy, c880430YgL.copy(enumC880520YgU, c880430YgL.LLILLJJLI), enumC880520YgU, null, 25), str);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM
    public final void yQ2(boolean z, C878960Ydy c878960Ydy) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cur priority is ");
        sbLIZ.append(z);
        sbLIZ.append(" and pageKey can show is ");
        Object obj = null;
        if (c878960Ydy != null) {
            boolValueOf = Boolean.valueOf(C885450YoR.LIZ(c878960Ydy));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z && c878960Ydy != null && C885450YoR.LIZ(c878960Ydy)) {
            EnumC877640Ybq enumC877640Ybq = c878960Ydy.LLILZ;
            EnumC880520YgU enumC880520YgU = EnumC880520YgU.PRIORITY;
            C878960Ydy c878960Ydy2 = new C878960Ydy(new C880430YgL(enumC880520YgU, c878960Ydy.LLILLJJLI.getFilterOptions()), enumC880520YgU, enumC877640Ybq, SystemClock.elapsedRealtime(), 1);
            Iterator it2 = ((LinkedHashMap) this.LLILZLL).entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Map.Entry entry = (Map.Entry) next;
                if (((C878960Ydy) entry.getKey()).LLILLL == c878960Ydy2.LLILLL && ((C878960Ydy) entry.getKey()).LLILZ == c878960Ydy2.LLILZ && Intrinsics.LJFF(((C878960Ydy) entry.getKey()).LLILLJJLI, c878960Ydy2.LLILLJJLI)) {
                    obj = next;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                setState(new AwS380S0200000_14(entry2, (Map.Entry<C878960Ydy, InterfaceC884020Ym8>) this, (MessageRequestListVMV2) 26));
                return;
            } else {
                setStateImmediate(new AwS593S0100000_14(c878960Ydy2, 42));
                C1729806q0.LIZIZ(new AwS415S0200000_14(c878960Ydy2, this, 31), true);
                return;
            }
        }
        setState(AFwS248S0000000_14.get$arr$(116));
    }
}
