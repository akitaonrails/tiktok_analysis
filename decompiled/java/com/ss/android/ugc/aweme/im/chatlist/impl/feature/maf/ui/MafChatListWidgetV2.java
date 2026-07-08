package com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui;

import X.AbstractC883730Ylf;
import X.C01GW;
import X.C0OVM;
import X.C0PEM;
import X.C0QSJ;
import X.C0Z3J;
import X.C0Z7M;
import X.C1076010e6h;
import X.C11NJ;
import X.C1252380ihA;
import X.C1261860iwS;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1889360zGY;
import X.C1889370zGZ;
import X.C1906570ziJ;
import X.C19212010Ec;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C823170WQx;
import X.C881500Yi4;
import X.C885080Ynq;
import X.C890230Yw9;
import X.C890240YwA;
import X.EnumC1260930iux;
import X.EnumC1599580rjA;
import X.InterfaceC1146704e9;
import X.InterfaceC1262660ixk;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC884050YmB;
import X.InterfaceC898260ZLs;
import Y.AComparatorS513S0100000_14;
import Y.AObserverS218S0100000_14;
import Y.ARunnableS83S0200000_14;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.data.MatchedFriendsKeva;
import com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMafChatListWidgetAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class MafChatListWidgetV2 extends InboxWidget implements C0Z3J, InterfaceC1262660ixk, InboxAbilityCenter$IMafChatListWidgetAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public volatile boolean LLJIJIL;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;
    public final Map<C1261860iwS, Integer> LLIZLLLIL = new ConcurrentHashMap();
    public final C823170WQx<String> LLJ = new C823170WQx<>();
    public final Set<String> LLJI = new LinkedHashSet();
    public final Set<C1261860iwS> LLJILJIL = new LinkedHashSet();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 257));
    public final C11NJ LLJILLL = new C11NJ();
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(100));
    public final MutableLiveData<Integer> LLJJI = new MutableLiveData<>();
    public final BPEAHandler LLJJIII = new BPEAHandler(Looper.getMainLooper());
    public final C885080Ynq LLJJIJI = new InterfaceC884050YmB() { // from class: X.0Ynq
        @Override // X.InterfaceC884050YmB
        public final String LIZ() {
            return "maf_chat_list_widget_v2";
        }

        @Override // X.InterfaceC884050YmB
        public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
            Pair<C13IQ<? extends InterfaceC884250YmV>, InterfaceC878560YdK> next;
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (C881500Yi4.LJ() != null) {
                Iterator<Pair<C13IQ<? extends InterfaceC884250YmV>, InterfaceC878560YdK>> it2 = interfaceC884020Ym8.getConfig().LIZJ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String strLJI = next.getFirst().LJI();
                        if (strLJI == null) {
                            strLJI = "";
                        }
                        if (a0.LJJIIZI(str, strLJI, false)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null || Intrinsics.LJFF(str, "page_cache")) {
                    IChatListEngine.LIZ.getClass();
                    if (C884160YmM.LIZ().LJIIIZ().contains(C1517405wq.LIZ)) {
                        MafChatListWidgetV2 mafChatListWidgetV2 = this.LIZ;
                        C786410Ut5.LJJZZIII(mafChatListWidgetV2.LLJJIII, new ARunnableS83S0200000_14(mafChatListWidgetV2, list, 7));
                    }
                }
            }
        }
    };
    public InboxWidgetStatus LLJJIJIIJIL = C1889370zGZ.LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MafChatListWidgetV2.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMafChatListWidgetAbility
    public final MafChatListWidgetV2 hH0() {
        return this;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1235492876) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        return C13LP.LJLLLL(new AComparatorS513S0100000_14(this, 1), ((ConcurrentHashMap) this.LLIZLLLIL).keySet());
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(C1261860iwS.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0037, PHI: r1
      0x0029: PHI (r1v5 X.0QSJ) = (r1v4 X.0QSJ), (r1v10 X.0QSJ) binds: [B:8:0x000c, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0006, B:7:0x000a, B:9:0x000e, B:11:0x0012, B:12:0x0018, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:33:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus ko() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r1 = r4.LLJJIJIL
            r3 = 0
            if (r1 != 0) goto L3c
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L35
            X.0QSJ r1 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L29
            X.0Q7z r2 = r4.LLJJJ     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L18
            X.0Q7z r2 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L37
            r4.LLJJJ = r2     // Catch: java.lang.Throwable -> L37
        L18:
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L37
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r1[r3] = r0     // Catch: java.lang.Throwable -> L37
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L37
            r4.LLJJJIL = r1     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L29
            r1 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L37
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r1 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r1     // Catch: java.lang.Throwable -> L37
        L31:
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L35:
            monitor-exit(r4)
            goto L3c
        L37:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3a:
            if (r1 == 0) goto L52
        L3c:
            androidx.lifecycle.MutableLiveData r0 = r1.jp2()
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Boolean r1 = r1.Ef2(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
        L52:
            java.util.Map<X.0iwS, java.lang.Integer> r0 = r4.LLIZLLLIL
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L63
            X.0zGY r0 = X.C1889360zGY.LIZ
            r4.LLJJIJIIJIL = r0
        L60:
            com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus r0 = r4.LLJJIJIIJIL
            return r0
        L63:
            X.0zGW r0 = X.C1889340zGW.LIZ
            r4.LLJJIJIIJIL = r0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2.ko():com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IMafChatListWidgetAbility.class, null, null);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(fragmentLJI, new AObserverS218S0100000_14(this, 1));
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            abstractC883730YlfLJ.LIZJ(this.LLJJIJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$IMafChatListWidgetAbility.class, null);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            abstractC883730YlfLJ.LIZ(this.LLJJIJI);
        }
        this.LLJILLL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void Fo(InboxWidgetStatus inboxWidgetStatus) {
        this.LLJJIJIIJIL = inboxWidgetStatus;
    }

    @Override // X.C0Z3J
    public final void Gk(C1261860iwS c1261860iwS) {
        MatchedFriendsKeva.Service.LJ().LIZLLL();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C890240YwA(this, c1261860iwS, null), 3);
    }

    public final void Ho(String str) {
        for (Object obj : ((ConcurrentHashMap) this.LLIZLLLIL).keySet()) {
            if (Intrinsics.LJFF(((User) obj).getUid(), str)) {
                if (obj != null) {
                    ((ConcurrentHashMap) this.LLIZLLLIL).remove(obj);
                    Co(C1889360zGY.LIZ);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // X.InterfaceC1262660ixk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L6(java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2.L6(java.util.List):java.util.List");
    }

    @Override // X.C0Z3J
    public final void Qi(C1261860iwS c1261860iwS) {
        this.LLJILJIL.add(c1261860iwS);
        Gk(c1261860iwS);
        InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) this.LLJILJILJ.getValue();
        boolean z = true;
        if (interfaceC898260ZLs != null) {
            C0OVM c0ovm = new C0OVM();
            c0ovm.LIZJ(c1261860iwS.getUid());
            c0ovm.LIZIZ(c1261860iwS.getSecUid());
            boolean zIsAccuratePrivateAccount = c1261860iwS.isAccuratePrivateAccount();
            C1252380ihA c1252380ihA = c0ovm.LIZ;
            c1252380ihA.LJIILIIL = zIsAccuratePrivateAccount;
            c1252380ihA.LIZLLL = 1;
            c0ovm.LIZ.LJIIJJI = c1261860iwS.getFollowerStatus();
            c0ovm.LIZ.LJIILLIIL = c1261860iwS.getAccurateRecType();
            interfaceC898260ZLs.AI2(c0ovm.LIZ(), "notification_page", new AwS450S0200000_14(this, c1261860iwS, 3));
        }
        IMatchedFriendsAnalytics iMatchedFriendsAnalytics = (IMatchedFriendsAnalytics) ServiceManager.get().getService(IMatchedFriendsAnalytics.class);
        if (c1261860iwS.getFollowerStatus() != 1) {
            z = false;
        }
        iMatchedFriendsAnalytics.LIZ(z);
        ((IMatchedFriendsAnalytics) ServiceManager.get().getService(IMatchedFriendsAnalytics.class)).LIZJ(c1261860iwS, EnumC1260930iux.FOLLOW.getType());
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        if (!this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = false;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C890230Yw9(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        C0Z7M c0z7m;
        if ((viewHolder instanceof C0Z7M) && (c0z7m = (C0Z7M) viewHolder) != null) {
            Set<String> set = this.LLJI;
            C1261860iwS c1261860iwS = c0z7m.LLJJIJIIJIL;
            if (c1261860iwS != null && (!set.contains(c1261860iwS.getUid()))) {
                set.add(c1261860iwS.getUid());
                c0z7m.L5(c1261860iwS.getUid(), "show");
                ((IMatchedFriendsAnalytics) ServiceManager.get().getService(IMatchedFriendsAnalytics.class)).LIZJ(c1261860iwS, EnumC1260930iux.SHOW.getType());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        View viewLIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            int i = C0Z7M.LLJJIJIL;
            if (C19212010Ec.LIZJ.LJJIII()) {
                viewLIZ = C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.cl0, viewGroup, false, 16);
            } else {
                viewLIZ = C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.ckz, viewGroup, false, 16);
            }
            C0Z7M c0z7m = new C0Z7M(viewLIZ);
            c0z7m.LLJJI = fragmentLJI;
            c0z7m.LLJJIII = this;
            return c0z7m;
        }
        return null;
    }
}
