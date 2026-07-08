package com.ss.android.ugc.aweme.im.messagelist.ui;

import X.C01GW;
import X.C01S9;
import X.C05YD;
import X.C06Z5;
import X.C09IR;
import X.C0BQN;
import X.C0N7O;
import X.C0Q9R;
import X.C0Z53;
import X.C11NJ;
import X.C11NZ;
import X.C11RO;
import X.C11S5;
import X.C13BV;
import X.C13E8;
import X.C13LP;
import X.C1509305vX;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1721206oc;
import X.C1BNE;
import X.C2185208hG;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C356901a3;
import X.C869590Y9l;
import X.C904630ZeH;
import X.C914170Ztf;
import X.C914180Ztg;
import X.EnumC2252401DDy;
import X.InterfaceC1891350zJl;
import X.InterfaceC899940ZSe;
import X.InterfaceC902790ZbJ;
import X.InterfaceC904610ZeF;
import X.InterfaceC904620ZeG;
import X.InterfaceC904660ZeK;
import X.InterfaceC904700ZeO;
import X.InterfaceC904710ZeP;
import X.InterfaceC904730ZeR;
import X.InterfaceC904740ZeS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS171S0100000_2;
import Y.AfS183S0100000_14;
import Y.AsS41S0100000_14;
import android.os.HandlerThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListSubmitListAbility;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListSubmitListAbilityImpl implements MessageListSubmitListAbility, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C11NZ<InterfaceC904740ZeS> LL;
    public final C904630ZeH LLILLJJLI;
    public final InterfaceC904660ZeK LLILLL;
    public final LifecycleOwner LLILZ;
    public final C0N7O LLILZIL;
    public final InterfaceC904710ZeP LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C11RO LLJILJILJ = C11S5.LIZIZ;
    public final C01GW LLJILLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(148));
    public final C01GW LLJJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 571));
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 570));
    public final C914180Ztg LLJJIII;
    public final C11NJ LLJJIJI;
    public final LifecycleCoroutineScope LLJJIJIIJIL;
    public final Set<Enum<?>> LLJJIJIL;
    public final C2252331DDr LLJJJ;
    public final C13E8<Long> LLJJJIL;
    public final ConcurrentLinkedQueue<InterfaceC904740ZeS> LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public volatile boolean LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C914170Ztf LLJLIL;
    public final C2252331DDr LLJLILLLLZIIL;
    public final C2252331DDr LLJLL;
    public final C2252321DDq LLJLLIL;
    public final C2252321DDq LLJLLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC903640Zcg
    public final boolean LIZ() {
        return !this.LLJJJJJIL;
    }

    public final ChatLinearLayoutManager LIZIZ() {
        return (ChatLinearLayoutManager) this.LLIZLLLIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LJFF() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZ.getValue();
    }

    public final void LJIIJJI() {
        C23250099c.LIZLLL(this.LLJJIJIIJIL, (CoroutineContext) this.LLJJI.getValue(), null, new C06Z5(this, null), 2);
        this.LLJJIJI.LIZ(this.LL.LJJJLZIJ(C11S5.LIZIZ).LJJLJLI(new AfS183S0100000_14(this, 8)));
        this.LLJJIJI.LIZ(this.LL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS183S0100000_14(this, 9)).LJJJLZIJ(this.LLJILJILJ).LJJLJLI(new AfS171S0100000_2(this, 35)));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final List<C869590Y9l> vi2() {
        List<C869590Y9l> list = (List) C13LP.LJJJLL(this.LLJLILLLLZIIL.LIZ());
        return list == null ? C13BV.INSTANCE : list;
    }

    public final void LJI() {
        LJFF().setLayoutManager(LIZIZ());
        LIZIZ().LLILLJJLI.add(new AwS593S0100000_14(this, 60));
        LJFF().LL.LLLJ(new C0Q9R() { // from class: X.0ZeJ
            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                if (((InterfaceC904700ZeO) this.LIZ.LLJI.getValue()).LIZIZ() && i == 0 && this.LIZ.LJFF().getScrollState() == 0 && this.LIZ.LIZIZ().LJIILIIL() == 0) {
                    this.LIZ.LIZIZ().scrollToPositionWithOffset(0, 0);
                }
            }
        });
        LJFF().addOnScrollListener(new AsS41S0100000_14(this, 1));
        this.LLILZ.getLifecycle().addObserver(this);
        List<InterfaceC904610ZeF<?>> listInvoke = this.LLILLL.LIZJ().invoke(AFwS201S0000000_14.get$arr$(147));
        ArrayList<InterfaceC904620ZeG> arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
        Iterator<T> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC904610ZeF) it2.next()).convert());
        }
        for (InterfaceC904620ZeG interfaceC904620ZeG : arrayList) {
            if (C0BQN.LIZ()) {
                List<InterfaceC902790ZbJ<? extends InterfaceC1891350zJl>> listLIZ = interfaceC904620ZeG.LIZ();
                ArrayList<InterfaceC902790ZbJ> arrayList2 = new ArrayList();
                for (InterfaceC902790ZbJ<? extends InterfaceC1891350zJl> interfaceC902790ZbJ : listLIZ) {
                    if (interfaceC902790ZbJ.getCustomViewPoolSize() != null) {
                        arrayList2.add(interfaceC902790ZbJ);
                    }
                }
                for (InterfaceC902790ZbJ interfaceC902790ZbJ2 : arrayList2) {
                    if (this.LLJJIJIL.add(interfaceC904620ZeG.getInterceptOrdering())) {
                        Iterator<Class<? extends PowerCell<?>>> it3 = interfaceC904620ZeG.LIZJ().iterator();
                        while (it3.hasNext()) {
                            LJFF().LJIILJJIL(it3.next());
                        }
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLJFF = LJFF();
                    Integer customViewPoolSize = interfaceC902790ZbJ2.getCustomViewPoolSize();
                    if (customViewPoolSize != null) {
                        viewOnAttachStateChangeListenerC20604515jvLJFF.getRecycledViewPool().setMaxRecycledViews(viewOnAttachStateChangeListenerC20604515jvLJFF.LJIIJJI(interfaceC902790ZbJ2.getPowerItemClazz(), null), customViewPoolSize.intValue());
                    }
                }
            } else {
                Iterator<Class<? extends PowerCell<?>>> it4 = interfaceC904620ZeG.LIZJ().iterator();
                while (it4.hasNext()) {
                    LJFF().LJIILJJIL(it4.next());
                }
                for (InterfaceC902790ZbJ<? extends InterfaceC1891350zJl> interfaceC902790ZbJ3 : interfaceC904620ZeG.LIZ()) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLJFF2 = LJFF();
                    Integer customViewPoolSize2 = interfaceC902790ZbJ3.getCustomViewPoolSize();
                    if (customViewPoolSize2 != null) {
                        viewOnAttachStateChangeListenerC20604515jvLJFF2.getRecycledViewPool().setMaxRecycledViews(viewOnAttachStateChangeListenerC20604515jvLJFF2.LJIIJJI(interfaceC902790ZbJ3.getPowerItemClazz(), null), customViewPoolSize2.intValue());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final RecyclerView LLII() {
        return LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final C05YD<List<InterfaceC1891350zJl>> B11() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC903640Zcg
    public final boolean LIZLLL() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final C01S9<List<C869590Y9l>> bV1() {
        return this.LLJLL;
    }

    public final void LJIIJ(Throwable th) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SubmitList Exception ");
            sbLIZ.append(th.getMessage());
            iMALogApiLIZ.LIZ(6, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
        IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
        if (iMALogApiLIZ2 != null) {
            iMALogApiLIZ2.LIZJ("SubmitList Exception", th);
        }
        C1721206oc.LIZ(this.LLILZ, th, "MessageListSubmitListAbilityImpl");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLJJIJI.LJ();
        ((HandlerThread) this.LLJILLL.getValue()).quit();
    }

    public static void LJII(InterfaceC904740ZeS interfaceC904740ZeS, List list) {
        Long lValueOf;
        String uuid;
        Boolean boolValueOf;
        Long lValueOf2;
        String uuid2;
        int i = 0;
        Boolean boolValueOf2 = null;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C869590Y9l) it2.next()).isIndexLocal() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int size = list.size() - i;
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL(list);
        C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJLIIIJL(list);
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sb = new StringBuilder("SubmistList[G4] event=");
            sb.append(interfaceC904740ZeS.getName());
            sb.append(" total=");
            sb.append(list.size());
            sb.append(" realCount=");
            sb.append(size);
            sb.append(" localCount=");
            sb.append(i);
            sb.append(" firstIndex=");
            if (c869590Y9l != null) {
                lValueOf = Long.valueOf(c869590Y9l.getIndex());
            } else {
                lValueOf = null;
            }
            sb.append(lValueOf);
            sb.append(" firstUuid=");
            if (c869590Y9l != null) {
                uuid = c869590Y9l.getUuid();
            } else {
                uuid = null;
            }
            sb.append(uuid);
            sb.append(" firstIsLocal=");
            if (c869590Y9l != null) {
                boolValueOf = Boolean.valueOf(c869590Y9l.isIndexLocal());
            } else {
                boolValueOf = null;
            }
            sb.append(boolValueOf);
            sb.append(" lastIndex=");
            if (c869590Y9l2 != null) {
                lValueOf2 = Long.valueOf(c869590Y9l2.getIndex());
            } else {
                lValueOf2 = null;
            }
            sb.append(lValueOf2);
            sb.append(" lastUuid=");
            if (c869590Y9l2 != null) {
                uuid2 = c869590Y9l2.getUuid();
            } else {
                uuid2 = null;
            }
            sb.append(uuid2);
            sb.append(" lastIsLocal=");
            if (c869590Y9l2 != null) {
                boolValueOf2 = Boolean.valueOf(c869590Y9l2.isIndexLocal());
            }
            sb.append(boolValueOf2);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", sb.toString());
        }
    }

    public MessageListSubmitListAbilityImpl(C01GW<? extends ViewOnAttachStateChangeListenerC20604515jv> c01gw, C01GW<? extends ChatLinearLayoutManager> c01gw2, C01GW<? extends MessageListOperatorVM> c01gw3, C11NZ<InterfaceC904740ZeS> c11nz, C904630ZeH c904630ZeH, InterfaceC904660ZeK interfaceC904660ZeK, C01GW<? extends InterfaceC904700ZeO> c01gw4, C01GW<? extends InterfaceC899940ZSe> c01gw5, LifecycleOwner lifecycleOwner, C01GW<? extends InterfaceC904730ZeR> c01gw6, C0N7O c0n7o, InterfaceC904710ZeP interfaceC904710ZeP) {
        this.LL = c11nz;
        this.LLILLJJLI = c904630ZeH;
        this.LLILLL = interfaceC904660ZeK;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = c0n7o;
        this.LLILZLL = interfaceC904710ZeP;
        this.LLIZ = c01gw;
        this.LLIZLLLIL = c01gw2;
        this.LLJ = c01gw3;
        this.LLJI = c01gw4;
        this.LLJIJIL = c01gw5;
        this.LLJILJIL = c01gw6;
        C2185208hG c2185208hG = CoroutineExceptionHandler.LJJLIL;
        this.LLJJIII = new C914180Ztg(c2185208hG, this, 2);
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIIJIL = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        this.LLJJIJIL = new LinkedHashSet();
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        this.LLJJJ = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LLJJJIL = new C13E8<>();
        this.LLJJJJ = new ConcurrentLinkedQueue<>();
        this.LLJJJJJIL = true;
        this.LLJL = true;
        this.LLJLIL = new C914170Ztf(c2185208hG, 2);
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LLJLILLLLZIIL = c2252331DDrLIZ;
        this.LLJLL = c2252331DDrLIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLJLLIL = c2252321DDqLIZ;
        this.LLJLLL = c2252321DDqLIZ;
    }
}
