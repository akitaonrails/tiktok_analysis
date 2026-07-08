package com.ss.android.ugc.aweme.inbox.v2.container;

import X.AbstractC1865990yer;
import X.AbstractC1889640zH0;
import X.C01GW;
import X.C0PEM;
import X.C0Z31;
import X.C0Z3O;
import X.C1389890mGx;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1508630pMT;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1866100yf2;
import X.C1866110yf3;
import X.C1866130yf5;
import X.C1889140zGC;
import X.C1889160zGE;
import X.C1889180zGG;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C1889560zGs;
import X.C1889580zGu;
import X.C1889590zGv;
import X.C1889600zGw;
import X.C1889630zGz;
import X.C1889650zH1;
import X.C1889660zH2;
import X.C1889670zH3;
import X.C1889690zH5;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C2450909j1;
import X.C296850BkJ;
import X.C443270HZt;
import X.C452501pT;
import X.C724240Sb0;
import X.C890330YwJ;
import X.C898680ZNi;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.InterfaceC1554640qYg;
import X.InterfaceC1889260zGO;
import X.InterfaceC1889380zGa;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.InterfaceC887660Ys0;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2ViewModel;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxPageWidgetContainer extends InboxWidgetContainer implements InterfaceC1889380zGa, InboxAbilityCenter$IInboxPageWidgetContainerAbility, InterfaceC1554640qYg {
    public static final C1889660zH2 LLJJL;
    public static final List<AbstractC1865990yer> LLJJLIIIJLLLLLLLZ;
    public boolean LLJILLL;
    public List<? extends InterfaceC1891350zJl> LLJJIJI;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final Set<InboxWidget> LLJJ = new LinkedHashSet();
    public final HashMap<C13IQ<? extends Object>, InboxWidget> LLJJI = new HashMap<>();
    public final HashMap<C13IQ<? extends RecyclerView.ViewHolder>, InboxWidget> LLJJIII = new HashMap<>();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 258));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 257));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final boolean Vo() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility
    public final void Zw() {
        this.LLJJJJ = true;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1889600zGw(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp = cp();
        if (inboxFragmentV2ViewModelCp != null) {
            C1508630pMT.LIZ.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page container ready: -- ");
            sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
            C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
            inboxFragmentV2ViewModelCp.LLIZLLLIL = this;
        }
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxPageWidgetContainerAbility.class, null, null);
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp2 = cp();
        if (inboxFragmentV2ViewModelCp2 != null) {
            inboxFragmentV2ViewModelCp2.vQ2(C1889690zH5.LIZ);
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 257555276) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0zH2] */
    static {
        new Object() { // from class: X.0zH7
        };
        LLJJL = new InterfaceC1891350zJl() { // from class: X.0zH2
            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }
        };
        LLJJLIIIJLLLLLLLZ = C1697810uHb.LJIIJJI(C1866100yf2.LIZIZ, C0Z3O.LIZIZ, C898680ZNi.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility
    public final int EK1() {
        C0Z3O c0z3o = C0Z3O.LIZIZ;
        List<? extends InterfaceC1891350zJl> list = this.LLJJIJI;
        if (list == null) {
            return -1;
        }
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            InboxWidget inboxWidget = this.LLJJI.get(C13LE.LIZ(obj.getClass()));
            if (Intrinsics.LJFF(inboxWidget != null ? inboxWidget.identity() : null, c0z3o)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final InboxFragmentV2ViewModel cp() {
        return (InboxFragmentV2ViewModel) this.LLJJJJLIIL.getValue();
    }

    public final ConcurrentSkipListMap<InboxWidget, C1889560zGs> dp() {
        return (ConcurrentSkipListMap) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<X.0zJl>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> hp() {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r0 = r12.LLJJJIL
            r9 = 1
            if (r0 == 0) goto L7e
            X.0Yvf r0 = X.C889930Yvf.LIZ
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto L7e
            r11 = 1
        L13:
            java.util.concurrent.ConcurrentSkipListMap r0 = r12.dp()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
            r4 = 0
            r5 = r4
        L21:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget) r0
            java.lang.Object r8 = r1.getValue()
            X.0zGs r8 = (X.C1889560zGs) r8
            com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus r0 = r0.ko()
            boolean r0 = r0.isShow()
            if (r0 == 0) goto L21
            if (r11 == 0) goto L6f
            java.util.List<X.0zJl> r0 = r8.LIZ
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r0.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.0zJl r1 = (X.InterfaceC1891350zJl) r1
            boolean r0 = r1 instanceof X.InterfaceC887660Ys0
            if (r0 == 0) goto L50
            X.0Ys0 r1 = (X.InterfaceC887660Ys0) r1
            if (r1 == 0) goto L50
            boolean r0 = r1.getDisplayInMultiSelectMode()
            if (r0 != r9) goto L50
            r7.add(r2)
            goto L50
        L6f:
            java.util.List<X.0zJl> r7 = r8.LIZ
        L71:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7a
            r5 = r8
        L7a:
            r3.addAll(r7)
            goto L21
        L7e:
            r11 = 0
            goto L13
        L80:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9b
            java.util.Iterator r1 = r3.iterator()
        L8a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C890690Ywt
            if (r0 == 0) goto L8a
        L98:
            r12.LLJJIJI = r3
            return r3
        L9b:
            if (r5 == 0) goto L9f
            X.0zGo r4 = r5.LIZIZ
        L9f:
            X.0zGo r0 = X.EnumC1889520zGo.HAS_MORE
            if (r4 != r0) goto L98
            X.0zH2 r0 = com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer.LLJJL
            r3.add(r0)
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer.hp():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility
    public final List<InterfaceC1891350zJl> hu2() {
        List<? extends InterfaceC1891350zJl> list = this.LLJJIJI;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
            if ((interfaceC1891350zJl2 instanceof InterfaceC887660Ys0) && ((InterfaceC887660Ys0) interfaceC1891350zJl2).isSelected()) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        return hp();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        List<C1889180zGG> list;
        Map mapLJI = C296850BkJ.LIZ() ? C1889140zGC.LIZ.LJI(this) : C1889140zGC.LIZ.LJFF();
        synchronized (C1889140zGC.LIZ) {
            C1889160zGE c1889160zGELJ = C1889140zGC.LJ(mapLJI);
            list = c1889160zGELJ != null ? c1889160zGELJ.LIZJ : null;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
        }
        return list;
    }

    public final void ep() {
        List<InboxWidget> listJo = Jo();
        if (!listJo.isEmpty()) {
            Iterator<InboxWidget> it2 = listJo.iterator();
            while (it2.hasNext()) {
                if (!it2.next().ko().isCompleted()) {
                    return;
                }
            }
        }
        InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp = cp();
        if (inboxFragmentV2ViewModelCp != null) {
            inboxFragmentV2ViewModelCp.LLILLL.postValue(Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$IInboxPageWidgetContainerAbility.class, null);
        C1889140zGC c1889140zGC = C1889140zGC.LIZ;
        c1889140zGC.getClass();
        EventBus.LIZLLL().LJJI(c1889140zGC);
        C1889140zGC.LIZIZ = null;
        C1889140zGC.LIZJ = null;
        this.LLJJI.clear();
        this.LLJJIII.clear();
        dp().clear();
    }

    @Override // X.InterfaceC1889380zGa
    public final InterfaceC1889260zGO bc() {
        return C1889140zGC.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.0zJl] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.0zJl] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        ?? Ao;
        List<InterfaceC1891350zJl> list;
        Object objCopyData;
        InterfaceC887660Ys0 interfaceC887660Ys0;
        boolean enableSelect;
        InterfaceC1891350zJl interfaceC1891350zJl;
        boolean zIsSelected;
        InterfaceC887660Ys0 interfaceC887660Ys02;
        InterfaceC1891350zJl next;
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LIZ(5);
        }
        super.Zo(inboxWidget);
        if (inboxWidget.ko().isShow()) {
            if (this.LLJJJIL) {
                C1889560zGs c1889560zGs = dp().get(inboxWidget);
                if (c1889560zGs != null) {
                    list = c1889560zGs.LIZ;
                } else {
                    list = null;
                }
                List<InterfaceC1891350zJl> listAo = inboxWidget.Ao();
                Ao = new ArrayList(C15438062q.LJIJJ(listAo, 10));
                for (InterfaceC1891350zJl interfaceC1891350zJl2 : listAo) {
                    if ((interfaceC1891350zJl2 instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl2) != null) {
                        if (this.LLJJJJ) {
                            enableSelect = false;
                        } else {
                            enableSelect = ((InterfaceC887660Ys0) interfaceC1891350zJl2).getEnableSelect();
                        }
                        if (list != null) {
                            Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.areItemTheSame(interfaceC1891350zJl2)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            interfaceC1891350zJl = next;
                        } else {
                            interfaceC1891350zJl = null;
                        }
                        if ((interfaceC1891350zJl instanceof InterfaceC887660Ys0) && (interfaceC887660Ys02 = (InterfaceC887660Ys0) interfaceC1891350zJl) != null) {
                            zIsSelected = interfaceC887660Ys02.isSelected();
                        } else {
                            zIsSelected = false;
                        }
                        objCopyData = interfaceC887660Ys0.copyData(true, enableSelect, zIsSelected, interfaceC887660Ys0.isSwitchingMode(), interfaceC887660Ys0.getDisplayInMultiSelectMode(), new C1889630zGz(this));
                    } else {
                        objCopyData = null;
                    }
                    if ((objCopyData instanceof InterfaceC1891350zJl) && objCopyData != null) {
                        interfaceC1891350zJl2 = objCopyData;
                    }
                    Ao.add(interfaceC1891350zJl2);
                }
            } else {
                Ao = inboxWidget.Ao();
            }
            dp().put(inboxWidget, new C1889560zGs(Ao, inboxWidget.bo()));
        } else if (inboxWidget.ko().isHide()) {
            dp().put(inboxWidget, new C1889560zGs(C13BV.INSTANCE, EnumC1889520zGo.COMPLETE));
        } else if (!inboxWidget.ko().isEnable()) {
            dp().remove(inboxWidget);
        }
        if (this.LLJJIJIL) {
            if (!Intrinsics.LJFF(inboxWidget.identity(), C1866110yf3.LIZIZ) && !Intrinsics.LJFF(inboxWidget.identity(), C1866130yf5.LIZIZ)) {
                return;
            } else {
                this.LLJJIJIL = false;
            }
        }
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ2 = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ2 != null) {
            c0z31LJIIZILJ2.LIZ(6);
        }
        if (!So(inboxWidget) && !Ho()) {
            return;
        }
        C0Z31 c0z31LJIIZILJ3 = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ3 != null) {
            c0z31LJIIZILJ3.LIZ(7);
        }
        if (this.LLJJJ) {
            return;
        }
        C0Z31 c0z31LJIIZILJ4 = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ4 != null) {
            c0z31LJIIZILJ4.LIZ(8);
        }
        C1508630pMT.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State Change : widget: ");
        sbLIZ.append(inboxWidget.identity());
        sbLIZ.append(" --- status: ");
        sbLIZ.append(inboxWidget.ko());
        sbLIZ.append(" -- ");
        sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
        C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1889580zGu(this, null), 2);
    }

    public final void ap(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        boolean z = false;
        for (Map.Entry<InboxWidget, C1889560zGs> entry : dp().entrySet()) {
            InboxWidget key = entry.getKey();
            C1889560zGs value = entry.getValue();
            Iterator<InterfaceC1891350zJl> it2 = value.LIZ.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), interfaceC887660Ys0)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                if (!interfaceC887660Ys0.isSelected() && hu2().size() >= 99) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                        c1389890mGx.LJIIIZ(2131830237);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                Object objCopyData = interfaceC887660Ys0.copyData(interfaceC887660Ys0.isInMultiSelectMode(), interfaceC887660Ys0.getEnableSelect(), !interfaceC887660Ys0.isSelected(), interfaceC887660Ys0.isSwitchingMode(), interfaceC887660Ys0.getDisplayInMultiSelectMode(), interfaceC887660Ys0.getOnSelect());
                if ((objCopyData instanceof InterfaceC1891350zJl) && objCopyData != null) {
                    ConcurrentSkipListMap<InboxWidget, C1889560zGs> concurrentSkipListMapDp = dp();
                    ArrayList arrayList = new ArrayList(value.LIZ);
                    ListProtector.set(arrayList, iIntValue, objCopyData);
                    concurrentSkipListMapDp.put(key, new C1889560zGs(arrayList, value.LIZIZ));
                    z = true;
                }
            }
        }
        if (z) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1889590zGv(this, null), 2);
        }
    }

    public final AbstractC1889640zH0 bp(InboxWidgetStatus inboxWidgetStatus) {
        if (Intrinsics.LJFF(inboxWidgetStatus, C1889360zGY.LIZ)) {
            return new C1889650zH1(hp());
        }
        if (Intrinsics.LJFF(inboxWidgetStatus, C1889340zGW.LIZ)) {
            return C1889670zH3.LIZ;
        }
        return null;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveFreezeInboxUIEvent(C443270HZt c443270HZt) {
        if (c443270HZt.LIZ) {
            this.LLJJJ = true;
            return;
        }
        this.LLJJJ = false;
        AbstractC1889640zH0 abstractC1889640zH0Bp = bp(ko());
        if (abstractC1889640zH0Bp == null) {
            return;
        }
        InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp = cp();
        if (inboxFragmentV2ViewModelCp != null) {
            inboxFragmentV2ViewModelCp.vQ2(abstractC1889640zH0Bp);
        }
        ep();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        if (enumC1599580rjA == EnumC1599580rjA.PULL_TO_REFRESH) {
            this.LLJJIJIL = true;
        }
        C1508630pMT.LIZ.getClass();
        C2450909j1.LIZ(AFwS212S0000000_23.get$arr$(245));
        C1508630pMT.LIZIZ = SystemClock.uptimeMillis();
        C1508630pMT.LIZLLL = enumC1599580rjA.name();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh，");
        sbLIZ.append(enumC1599580rjA.name());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxArch", strLIZIZ);
        super.vo(enumC1599580rjA);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility
    public final void Fq0(List<? extends C13IQ<? extends Object>> list, InboxWidget inboxWidget) {
        Iterator<? extends C13IQ<? extends Object>> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LLJJI.put(it2.next(), inboxWidget);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r0 = true;
     */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k41(boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer.k41(boolean, boolean):void");
    }
}
