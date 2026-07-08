package com.ss.android.ugc.tiktok.im.contact.selector.impl.comm;

import X.AbstractC1223800hx4;
import X.AbstractC343940De4;
import X.C01GW;
import X.C020N;
import X.C1224060hxU;
import X.C1224190hxh;
import X.C1224280hxq;
import X.C1224340hxw;
import X.C1224450hy7;
import X.C1224590hyL;
import X.C1224600hyM;
import X.C1224760hyc;
import X.C1224780hye;
import X.C1224840hyk;
import X.C1224850hyl;
import X.C1251350ifV;
import X.C13BV;
import X.C1527905yX;
import X.C1697810uHb;
import X.C19719612Di;
import X.C19EG;
import X.C356901a3;
import X.C452501pT;
import X.C595660NXw;
import X.C896480ZEw;
import X.C897520ZIw;
import X.EnumC1223630hwn;
import X.EnumC1224390hy1;
import X.EnumC1227730i3P;
import X.EnumC992630bwD;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224270hxp;
import X.InterfaceC1224330hxv;
import X.InterfaceC1224420hy4;
import X.InterfaceC1226510i1R;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorConfirmWidgetVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSelectedListVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContactSelectorBridgeImp implements InterfaceC1226510i1R {
    public AbsContactSelectorFragment LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.InterfaceC1226510i1R
    public final int LIZ() {
        C897520ZIw c897520ZIw;
        Collection<C595660NXw> collectionValues;
        SelectorContainerVM selectorContainerVM = (SelectorContainerVM) this.LIZJ.getValue();
        int i = 0;
        if (selectorContainerVM != null && selectorContainerVM.vQ2().LJ().LJJIZ().LIZLLL() && (c897520ZIw = selectorContainerVM.LLJI) != null && (collectionValues = c897520ZIw.LIZLLL().values()) != null && !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (C896480ZEw.LIZJ((C595660NXw) it2.next()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC1226510i1R
    public final void LIZLLL() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LIZLLL.getValue();
        if (assemViewModel != null) {
            assemViewModel.setState(new C020N(false, 8));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJI() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJFF.getValue();
        if (assemViewModel != null) {
            assemViewModel.setStateImmediate(AFwS257S0000000_19.get$arr$(679));
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LIZLLL.getValue();
        if (assemViewModel2 != null) {
            assemViewModel2.setState(new C020N(true, 8));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIIIIZZ() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJFF.getValue();
        if (assemViewModel != null) {
            assemViewModel.setState(AFwS257S0000000_19.get$arr$(677));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final boolean LJIIJ() {
        InterfaceC1224270hxp protocol;
        InterfaceC1224330hxv interfaceC1224330hxvLJIIJ;
        C1224340hxw c1224340hxwLJJIZ;
        SelectorSelectedListVM selectorSelectedListVM = (SelectorSelectedListVM) this.LJIIIZ.getValue();
        int iLIZ = C1527905yX.LIZ(selectorSelectedListVM != null ? Integer.valueOf(selectorSelectedListVM.Vb()) : null);
        C1224280hxq c1224280hxq = (C1224280hxq) this.LIZIZ.getValue();
        return iLIZ >= ((c1224280hxq == null || (protocol = c1224280hxq.getProtocol()) == null || (interfaceC1224330hxvLJIIJ = protocol.LJIIJ()) == null || (c1224340hxwLJJIZ = interfaceC1224330hxvLJIIJ.LJJIZ()) == null) ? Integer.MAX_VALUE : c1224340hxwLJJIZ.LIZIZ());
    }

    @Override // X.InterfaceC1226510i1R
    public final C1224780hye LJIILLIIL() {
        SelectorContainerVM selectorContainerVM = (SelectorContainerVM) this.LIZJ.getValue();
        if (selectorContainerVM != null) {
            return selectorContainerVM.LLILZLL;
        }
        return null;
    }

    public final SelectorContentPageContainerVM LJJI() {
        return (SelectorContentPageContainerVM) this.LJII.getValue();
    }

    @Override // X.InterfaceC1226510i1R
    public final C19EG getActivity() {
        AbsContactSelectorFragment absContactSelectorFragment = this.LIZ;
        if (absContactSelectorFragment != null) {
            return absContactSelectorFragment.getActivity();
        }
        return null;
    }

    @Override // X.InterfaceC1226510i1R
    public final InterfaceC1224270hxp getProtocol() {
        C1224280hxq c1224280hxq = (C1224280hxq) this.LIZIZ.getValue();
        if (c1224280hxq != null) {
            return c1224280hxq.getProtocol();
        }
        return null;
    }

    @Override // X.InterfaceC1226510i1R
    public final String LIZJ() {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            return selectorContentPageContainerVMLJJI.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIILJJIL() {
        String str;
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI;
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI2 = LJJI();
        if (selectorContentPageContainerVMLJJI2 == null || (str = selectorContentPageContainerVMLJJI2.LLIZLLLIL) == null || (selectorContentPageContainerVMLJJI = LJJI()) == null) {
            return;
        }
        selectorContentPageContainerVMLJJI.ne0(0, str, false);
    }

    @Override // X.InterfaceC1226510i1R
    public final AbsContactSelectorFragment getFragment() {
        return this.LIZ;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.tiktok.im.contact.selector.impl.comm.ContactSelectorBridgeImp$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            ContactSelectorBridgeImp.this.LIZ = null;
        }
    }

    public ContactSelectorBridgeImp(AbsContactSelectorFragment absContactSelectorFragment) {
        this.LIZ = absContactSelectorFragment;
        absContactSelectorFragment.getLifecycle().addObserver(new AnonymousClass1());
        this.LIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2653));
        this.LIZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2655));
        this.LIZLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2657));
        this.LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2658));
        this.LJFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2659));
        this.LJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2660));
        this.LJII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2656));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2654));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2661));
    }

    @Override // X.InterfaceC1226510i1R
    public final void LIZIZ(String str) {
        InterfaceC1224160hxe interfaceC1224160hxe;
        Map<String, List<C1224840hyk>> mapTy2;
        Object next;
        SelectorContainerVM selectorContainerVM = (SelectorContainerVM) this.LIZJ.getValue();
        if (selectorContainerVM != null && selectorContainerVM.vQ2().LJ().LJJIZ().LIZJ() != EnumC1224390hy1.DISABLE && (interfaceC1224160hxe = selectorContainerVM.LLILZIL) != null && (mapTy2 = interfaceC1224160hxe.Ty2()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<C1224840hyk>>> it2 = mapTy2.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue(), arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((C1224840hyk) next).LLILZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1224840hyk c1224840hyk = (C1224840hyk) next;
            if (c1224840hyk != null) {
                selectorContainerVM.hy2(c1224840hyk, false);
            }
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final List<C1224760hyc> LJFF(String str) {
        Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> function0;
        Map<String, ? extends SelectorTabFragmentAbilityProtocol> mapInvoke;
        SelectorTabFragmentAbilityProtocol selectorTabFragmentAbilityProtocol;
        List<C1224760hyc> listQY;
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI == null || (function0 = selectorContentPageContainerVMLJJI.LLJ) == null || (mapInvoke = function0.invoke()) == null || (selectorTabFragmentAbilityProtocol = mapInvoke.get(str)) == null || (listQY = selectorTabFragmentAbilityProtocol.qY()) == null) {
            return C13BV.INSTANCE;
        }
        return listQY;
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIIIZ(C1224850hyl c1224850hyl) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI;
        EnumC992630bwD enumC992630bwD = c1224850hyl.LIZ;
        if (enumC992630bwD == EnumC992630bwD.TYPE_SEARCH_PAGE) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LJI.getValue();
            if (assemViewModel != null) {
                assemViewModel.setState(new AwS33S0001000_19(11));
                return;
            }
            return;
        }
        if (enumC992630bwD != EnumC992630bwD.TYPE_CONTENT_PAGE || (selectorContentPageContainerVMLJJI = LJJI()) == null) {
            return;
        }
        selectorContentPageContainerVMLJJI.ne0(0, c1224850hyl.LIZIZ, false);
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIIL(EnumC1223630hwn enumC1223630hwn) {
        SelectorContainerVM selectorContainerVM = (SelectorContainerVM) this.LIZJ.getValue();
        if (selectorContainerVM != null) {
            selectorContainerVM.xQ2(enumC1223630hwn);
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIJJ(String str) {
        Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> function0;
        Map<String, ? extends SelectorTabFragmentAbilityProtocol> mapInvoke;
        SelectorTabFragmentAbilityProtocol selectorTabFragmentAbilityProtocol;
        AssemViewModel assemViewModel = (AssemViewModel) this.LJFF.getValue();
        if (assemViewModel != null) {
            assemViewModel.setState(new AwS33S0010000_19(22));
        }
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null && (function0 = selectorContentPageContainerVMLJJI.LLJ) != null && (mapInvoke = function0.invoke()) != null && (selectorTabFragmentAbilityProtocol = mapInvoke.get(str)) != null) {
            selectorTabFragmentAbilityProtocol.hZ0();
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final C1224590hyL LJJ(EnumC1227730i3P enumC1227730i3P) {
        C1224060hxU c1224060hxU;
        C1224060hxU c1224060hxU2;
        if (enumC1227730i3P == EnumC1227730i3P.MAIN) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LJIIIIZZ.getValue();
            if (assemViewModel != null && (c1224060hxU2 = (C1224060hxU) assemViewModel.getState()) != null) {
                return c1224060hxU2.LLILLJJLI;
            }
            return null;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LJIIIIZZ.getValue();
        if (assemViewModel2 != null && (c1224060hxU = (C1224060hxU) assemViewModel2.getState()) != null) {
            return c1224060hxU.LLILLL;
        }
        return null;
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJ(String str, String str2) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            selectorContentPageContainerVMLJJI.wQ2(str, true, Collections.singletonList(new C1224190hxh(str2, null, Boolean.TRUE, null, 10)));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJII(String str, String str2) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            selectorContentPageContainerVMLJJI.wQ2(str, true, Collections.singletonList(new C1224190hxh(str2, Boolean.FALSE, null, null, 12)));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIIJJI(C1224600hyM c1224600hyM, boolean z) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJIIIIZZ.getValue();
        if (assemViewModel != null) {
            EnumC1227730i3P enumC1227730i3P = c1224600hyM.LIZ;
            if (enumC1227730i3P == EnumC1227730i3P.MAIN) {
                AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(c1224600hyM, 643);
                if (z) {
                    assemViewModel.setStateImmediate(awS598S0100000_19);
                    return;
                } else {
                    assemViewModel.setState(awS598S0100000_19);
                    return;
                }
            }
            if (enumC1227730i3P != EnumC1227730i3P.SECONDARY) {
                return;
            }
            AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(c1224600hyM, 645);
            if (z) {
                assemViewModel.setStateImmediate(awS598S0100000_192);
            } else {
                assemViewModel.setState(awS598S0100000_192);
            }
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIILL(AbstractC343940De4 abstractC343940De4, Integer num) {
        C19EG activity;
        C1224280hxq c1224280hxq = (C1224280hxq) this.LIZIZ.getValue();
        if (c1224280hxq == null) {
            return;
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LJFF.getValue();
        if (assemViewModel != null) {
            assemViewModel.setStateImmediate(AFwS257S0000000_19.get$arr$(679));
        }
        Map<String, InterfaceC1224420hy4> map = AbsContactSelectorFragment.LLJILJIL;
        boolean zLJIIIZ = c1224280hxq.LJIIIZ().LJIIIZ();
        AbsContactSelectorFragment absContactSelectorFragment = this.LIZ;
        if (absContactSelectorFragment != null) {
            activity = absContactSelectorFragment.getActivity();
        } else {
            activity = null;
        }
        C1224450hy7.LIZ(zLJIIIZ, absContactSelectorFragment, activity, abstractC343940De4, num);
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIIZILJ(boolean z, boolean z2) {
        SelectorConfirmWidgetVM selectorConfirmWidgetVM = (SelectorConfirmWidgetVM) this.LJIIIIZZ.getValue();
        if (selectorConfirmWidgetVM != null) {
            selectorConfirmWidgetVM.yg0(z, z2);
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIL(String str, String str2) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            selectorContentPageContainerVMLJJI.wQ2(str, true, Collections.singletonList(new C1224190hxh(str2, null, Boolean.FALSE, null, 10)));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIJ(String str, String str2, boolean z) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            selectorContentPageContainerVMLJJI.wQ2(str, z, Collections.singletonList(new C1224190hxh(str2, Boolean.TRUE, null, null, 12)));
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIJI(String str, boolean z, List list) {
        SelectorContentPageContainerVM selectorContentPageContainerVMLJJI = LJJI();
        if (selectorContentPageContainerVMLJJI != null) {
            selectorContentPageContainerVMLJJI.wQ2(str, z, list);
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIJJLI(C1224600hyM c1224600hyM, C1224600hyM c1224600hyM2, boolean z) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJIIIIZZ.getValue();
        if (assemViewModel != null && c1224600hyM.LIZ == EnumC1227730i3P.MAIN && c1224600hyM2.LIZ == EnumC1227730i3P.SECONDARY) {
            AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19(c1224600hyM, c1224600hyM2, 99);
            if (z) {
                assemViewModel.setStateImmediate(awS385S0200000_19);
            } else {
                assemViewModel.setState(awS385S0200000_19);
            }
        }
    }

    @Override // X.InterfaceC1226510i1R
    public final void LJIILIIL(int i, String str, List list, Function1 function1) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Map<String, List<AbstractC1223800hx4>> mapP60;
        Map<String, List<AbstractC1223800hx4>> mapP602;
        List<AbstractC1223800hx4> list2;
        SelectorContainerVM selectorContainerVM = (SelectorContainerVM) this.LIZJ.getValue();
        if (selectorContainerVM != null) {
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (obj instanceof C1224840hyk) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((C1224840hyk) it2.next()).LLJILJIL) {
                            new Exception("not allow insert selected cell");
                            return;
                        }
                    }
                }
            }
            InterfaceC1224160hxe interfaceC1224160hxe = selectorContainerVM.LLILZIL;
            if (interfaceC1224160hxe != null && (mapP602 = interfaceC1224160hxe.p60()) != null && (list2 = mapP602.get(str)) != null) {
                arrayList = new ArrayList(list2);
            } else {
                arrayList = new ArrayList();
            }
            InterfaceC1224160hxe interfaceC1224160hxe2 = selectorContainerVM.LLILZIL;
            if (interfaceC1224160hxe2 != null && (mapP60 = interfaceC1224160hxe2.p60()) != null) {
                linkedHashMap = new LinkedHashMap(mapP60);
            } else {
                linkedHashMap = null;
            }
            C19719612Di.LJJIIJ(arrayList, new AwS598S0100000_19(function1, (Function1<? super C1251350ifV, C1251350ifV>) 646), true);
            if (linkedHashMap != null) {
                linkedHashMap.put(str, arrayList);
            }
            if (list != null) {
                arrayList.addAll(i, list);
            }
            selectorContainerVM.yQ2(null, linkedHashMap, null);
            InterfaceC1224160hxe interfaceC1224160hxe3 = selectorContainerVM.LLILZIL;
            if (interfaceC1224160hxe3 == null) {
                return;
            }
            interfaceC1224160hxe3.ne0(i, str, true);
        }
    }
}
