package com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor;

import X.AbstractC1585810rMx;
import X.AbstractC883730Ylf;
import X.C01GW;
import X.C0QSJ;
import X.C0Z31;
import X.C0Z32;
import X.C0Z33;
import X.C0Z3M;
import X.C0Z7G;
import X.C0Z7H;
import X.C0Z7I;
import X.C0ZP6;
import X.C11JF;
import X.C11NZ;
import X.C11PQ;
import X.C1239300iM4;
import X.C1319210kQx;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1729806q0;
import X.C19212010Ec;
import X.C19475711Hn;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C293380Bei;
import X.C298480Bmw;
import X.C452501pT;
import X.C687700QyG;
import X.C881500Yi4;
import X.C882120Yj4;
import X.C882200YjC;
import X.C882210YjD;
import X.C883590YlR;
import X.C883610YlT;
import X.C885110Ynt;
import X.C885830Yp3;
import X.C885880Yp8;
import X.C890330YwJ;
import X.C890610Ywl;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.EnumC880480YgQ;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageInboxWidget extends InboxWidget implements InboxAbilityCenter$IMessageInboxWidgetAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final C0Z33 LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public boolean LLJ;
    public boolean LLJI;
    public C885880Yp8 LLJIJIL;
    public C11JF LLJILJILJ;
    public final boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;
    public boolean LLIZLLLIL = true;
    public final NextLiveData<Pair<InboxWidgetStatus, C885880Yp8>> LLJILJIL = new NextLiveData<>();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Z33] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageInboxWidget.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new Object() { // from class: X.0Z33
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C0Z7H.class), C13LE.LIZ(C0Z7I.class), C13LE.LIZ(C0Z7G.class), C13LE.LIZ(C0Z3M.class));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final long Go() {
        return 200L;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1641017393) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<C890610Ywl> list;
        C885880Yp8 c885880Yp8 = this.LLJIJIL;
        return (c885880Yp8 == null || (list = c885880Yp8.LIZ) == null) ? C13BV.INSTANCE : list;
    }

    public final C11JF Ho() {
        C11NZ c11pq;
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LJFF();
        }
        C882120Yj4.LIZ().getClass();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            C11PQ<C885880Yp8> c11pqLJIILLIIL = abstractC883730YlfLJ.LJIILLIIL();
            c11pqLJIILLIIL.getClass();
            c11pq = new C19475711Hn(c11pqLJIILLIIL).LJJIFFI();
        } else {
            c11pq = new C11PQ();
        }
        return C1239300iM4.LJ(c11pq, new AwS593S0100000_14(this, 204), C1239300iM4.LIZJ, new AwS593S0100000_14(this, 205));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility Jo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r1 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidget.Jo():com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final EnumC1889520zGo bo() {
        C885880Yp8 c885880Yp8 = this.LLJIJIL;
        return (c885880Yp8 == null || !c885880Yp8.LIZIZ) ? EnumC1889520zGo.COMPLETE : EnumC1889520zGo.HAS_MORE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IMessageInboxWidgetAbility.class, null, null);
        C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
        InboxSocPubStatusViewModel inboxSocPubStatusViewModel = (InboxSocPubStatusViewModel) this.LLJJI.getValue();
        c883610YlTLIZ.getClass();
        C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-injectNowModel", new C882210YjD(c883610YlTLIZ, inboxSocPubStatusViewModel, null));
        C883610YlT c883610YlTLIZ2 = C882120Yj4.LIZ();
        C0ZP6 c0zp6 = (C0ZP6) this.LLJJIII.getValue();
        c883610YlTLIZ2.getClass();
        C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-injectGroupSocialStatusModel", new C882200YjC(c883610YlTLIZ2, c0zp6, null));
        C882120Yj4.LIZ().getClass();
        C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-fetchResource", new C883590YlR(null));
        this.LLJILJILJ = Ho();
    }

    public MessageInboxWidget() {
        boolean z = true;
        if (!C298480Bmw.LIZ() && !C293380Bei.LIZIZ()) {
            z = false;
        }
        this.LLJILLL = z;
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 414));
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 415));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 413));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility;
        C1319210kQx c1319210kQxIM;
        super.onDestroy();
        if (this.LLJILLL && (inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null)) != null && (c1319210kQxIM = inboxAbilityCenter$IInboxFragmentAbility.IM()) != null) {
            c1319210kQxIM.removeOnScrollListener((AbstractC1585810rMx) this.LLJJ.getValue());
        }
        C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C1319210kQx c1319210kQxIM;
        MutableLiveData mutableLiveDataJp2;
        super.onParentViewCreated();
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityJo = Jo();
        if (inboxAbilityCenter$IInboxImFilterAbilityJo != null && (mutableLiveDataJp2 = inboxAbilityCenter$IInboxImFilterAbilityJo.jp2()) != null) {
            mutableLiveDataJp2.observe(this, new Observer() { // from class: X.0Yio
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Pair pair = (Pair) obj;
                    C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
                    FilterTabType filterTabType = (FilterTabType) pair.getFirst();
                    Set<? extends EnumC880480YgQ> setSingleton = (Set) pair.getSecond();
                    c883610YlTLIZ.getClass();
                    if (C19212010Ec.LIZJ.LIZLLL()) {
                        setSingleton = Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB);
                    }
                    AbstractC883730Ylf.LJIIIIZZ.getClass();
                    AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
                    if (abstractC883730YlfLJ != null) {
                        abstractC883730YlfLJ.LJJ(filterTabType, setSingleton);
                    }
                }
            });
        }
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility == null || (c1319210kQxIM = inboxAbilityCenter$IInboxFragmentAbility.IM()) == null) {
            return;
        }
        IMChatListApi.LJJIII.getClass();
        if (C890330YwJ.LIZ().LJIJJLI().LIZJ) {
            c1319210kQxIM.setRecycledViewPool(new RecyclerView.RecycledViewPool() { // from class: X.0Z35
                public final Set<Integer> LIZ = new LinkedHashSet();

                @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
                public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
                    if ((viewHolder instanceof C0Z3E) && !this.LIZ.contains(Integer.valueOf(viewHolder.getItemViewType()))) {
                        this.LIZ.add(Integer.valueOf(viewHolder.getItemViewType()));
                        int itemViewType = viewHolder.getItemViewType();
                        IMChatListApi.LJJIII.getClass();
                        setMaxRecycledViews(itemViewType, C890330YwJ.LIZ().LJJIJLIJ(C13LE.LIZ(viewHolder.getClass())));
                    }
                    super.putRecycledView(viewHolder);
                }
            });
        }
        if (this.LLJILLL) {
            c1319210kQxIM.addOnScrollListener((AbstractC1585810rMx) this.LLJJ.getValue());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJJ().onPause();
        C882120Yj4.LIZ().getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityJo;
        MutableLiveData mutableLiveDataJp2;
        Pair pair;
        super.onResume();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJJ().onResume();
        if ((!this.LLIZLLLIL || !C293380Bei.LIZIZ()) && (inboxAbilityCenter$IInboxImFilterAbilityJo = Jo()) != null && (mutableLiveDataJp2 = inboxAbilityCenter$IInboxImFilterAbilityJo.jp2()) != null && (pair = (Pair) mutableLiveDataJp2.getValue()) != null) {
            C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
            FilterTabType filterTabType = (FilterTabType) pair.getFirst();
            Set<? extends EnumC880480YgQ> setSingleton = (Set) pair.getSecond();
            c883610YlTLIZ.getClass();
            if (C19212010Ec.LIZJ.LIZLLL()) {
                setSingleton = Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB);
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null) {
                abstractC883730YlfLJ.LJJ(filterTabType, setSingleton);
            }
        }
        this.LLIZLLLIL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
        c883610YlTLIZ.getClass();
        if (EventBus.LIZLLL().LJIIJ(c883610YlTLIZ) || !c883610YlTLIZ.LIZLLL.compareAndSet(false, true)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(c883610YlTLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility
    public final C885880Yp8 t6() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility
    public final NextLiveData wc2() {
        return this.LLJILJIL;
    }

    public final void Lo(InboxWidgetStatus inboxWidgetStatus) {
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            inboxAbilityCenter$IInboxFragmentAbility.J01();
        }
        Co(inboxWidgetStatus);
        this.LLJILJIL.postValue(new Pair<>(inboxWidgetStatus, this.LLJIJIL));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        if (enumC1599580rjA == EnumC1599580rjA.INBOX_MODE_SWITCH) {
            C11JF c11jf = this.LLJILJILJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJIJIL = null;
            this.LLJILJILJ = Ho();
        }
        C882120Yj4.LIZ().LJFF();
        InboxSocPubStatusViewModel inboxSocPubStatusViewModel = (InboxSocPubStatusViewModel) this.LLJJI.getValue();
        if (inboxSocPubStatusViewModel != null) {
            inboxSocPubStatusViewModel.Jk2();
        }
        C0ZP6 c0zp6 = (C0ZP6) this.LLJJIII.getValue();
        if (c0zp6 != null) {
            c0zp6.LJFF();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        int iEK1;
        C11PQ<C885880Yp8> c11pqLJIILLIIL;
        C885880Yp8 c885880Yp8LJLZ;
        List<C890610Ywl> list;
        if (!this.LLJ) {
            C882120Yj4.LIZ().getClass();
            C885830Yp3 c885830Yp3 = C885830Yp3.LL;
            synchronized (c885830Yp3) {
                C885830Yp3.LJ(c885830Yp3, "first_dm_item_attach", null, 6);
            }
            this.LLJ = true;
        }
        if (viewHolder instanceof C0Z32) {
            ((C0Z32) viewHolder).onAttach();
        }
        if (C293380Bei.LIZIZ() && !this.LLJI) {
            return;
        }
        int layoutPosition = viewHolder.getLayoutPosition();
        InboxAbilityCenter$IInboxPageWidgetContainerAbility inboxAbilityCenter$IInboxPageWidgetContainerAbility = (InboxAbilityCenter$IInboxPageWidgetContainerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxPageWidgetContainerAbility.class, null);
        if (inboxAbilityCenter$IInboxPageWidgetContainerAbility != null) {
            iEK1 = inboxAbilityCenter$IInboxPageWidgetContainerAbility.EK1();
        } else {
            iEK1 = 0;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ == null || (c11pqLJIILLIIL = abstractC883730YlfLJ.LJIILLIIL()) == null || (c885880Yp8LJLZ = c11pqLJIILLIIL.LJLZ()) == null || !c885880Yp8LJLZ.LIZIZ || layoutPosition <= 0 || (list = c885880Yp8LJLZ.LIZ) == null || list.isEmpty() || c885880Yp8LJLZ.LIZ.size() - (layoutPosition - iEK1) > 20) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perform load more when position ");
        sbLIZ.append(iEK1);
        sbLIZ.append('/');
        sbLIZ.append(layoutPosition);
        sbLIZ.append('/');
        sbLIZ.append(c885880Yp8LJLZ.LIZ.size());
        C1720106oR.LJI("MessageInboxWidget", C2188811AlT.LIZIZ(sbLIZ));
        C882120Yj4.LIZ().getClass();
        AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
        if (abstractC883730YlfLJ2 == null) {
            return;
        }
        C1729806q0.LIZIZ(new AwS558S0100000_14(abstractC883730YlfLJ2, 1816), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void yo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C0Z32) {
            ((C0Z32) viewHolder).onDetach();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder uo(android.view.ViewGroup r15, X.C13IQ<? extends X.InterfaceC1891350zJl> r16) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidget.uo(android.view.ViewGroup, X.13IQ):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
