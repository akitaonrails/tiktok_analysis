package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC895380ZAq;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C0Z31;
import X.C0Z3O;
import X.C0Z3Q;
import X.C0ZA1;
import X.C0ZA3;
import X.C0ZA8;
import X.C0ZAG;
import X.C0ZAH;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889200zGI;
import X.C1904490zex;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296850BkJ;
import X.C452501pT;
import X.C461720I8s;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C885880Yp8;
import X.C890330YwJ;
import X.C890610Ywl;
import X.C890690Ywt;
import X.C898680ZNi;
import X.EnumC1599580rjA;
import X.EnumC1889770zHD;
import X.EnumC880480YgQ;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxEntranceWidgetContainer extends InboxWidgetContainer implements C0ZA8, C0ZA3, InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public boolean LLJILLL;
    public boolean LLJJ = true;
    public boolean LLJJI;
    public Integer LLJJIII;
    public final Keva LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxEntranceWidgetContainer.class, "inboxBannerViewModel", "getInboxBannerViewModel()Lcom/ss/android/ugc/aweme/notification/banner/InboxBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(InboxEntranceWidgetContainer.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0)};
        new Object() { // from class: X.0ZAD
        };
    }

    public InboxEntranceWidgetContainer() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceWidgetContainer:");
        sbLIZ.append(C461720I8s.LIZIZ());
        this.LLJJIJI = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(279));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxBannerViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1056), AFwS248S0000000_14.get$arr$(297), null, true);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final boolean Vo() {
        return true;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        super.lo();
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZA9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C637320OzC) obj).LLILLJJLI;
            }
        }, null, new AwS628S0100000_14(this, 29), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> Ao() {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntranceWidgetContainer.Ao():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        ArrayList arrayList = new ArrayList();
        Map mapLJI = C296850BkJ.LIZ() ? C1889140zGC.LIZ.LJI(this) : C1889140zGC.LIZ.LJFF();
        C1889180zGG c1889180zGG = mapLJI.get(C898680ZNi.LIZIZ);
        if (c1889180zGG != null && c1889180zGG.LIZLLL) {
            arrayList.add(c1889180zGG);
            c1889180zGG.LJ = C1889200zGI.LIZ;
        }
        C1889180zGG c1889180zGG2 = mapLJI.get(C0Z3Q.LIZIZ);
        if (c1889180zGG2 != null && c1889180zGG2.LIZLLL) {
            arrayList.add(c1889180zGG2);
        }
        C1889180zGG c1889180zGG3 = mapLJI.get(C0Z3O.LIZIZ);
        if (c1889180zGG3 != null && c1889180zGG3.LIZLLL) {
            arrayList.add(c1889180zGG3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility bp() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJJ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJJ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJJ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r1 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJJ = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntranceWidgetContainer.bp():com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility");
    }

    @Override // X.C0ZA8, X.C0ZA3
    public final Pair<Pair<FilterTabType, Set<EnumC880480YgQ>>, List<C890610Ywl>> LLJLL() {
        MutableLiveData mutableLiveDataJp2;
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityBp = bp();
        Object value = null;
        if (inboxAbilityCenter$IInboxImFilterAbilityBp != null && (mutableLiveDataJp2 = inboxAbilityCenter$IInboxImFilterAbilityBp.jp2()) != null) {
            value = mutableLiveDataJp2.getValue();
        }
        List<InterfaceC1891350zJl> listAo = Ao();
        ArrayList arrayList = new ArrayList();
        for (Object objConvertToInboxEntranceWrapper$awemenotice_release : (ArrayList) listAo) {
            if (!(objConvertToInboxEntranceWrapper$awemenotice_release instanceof C890610Ywl)) {
                if (objConvertToInboxEntranceWrapper$awemenotice_release instanceof ActivityPod) {
                    objConvertToInboxEntranceWrapper$awemenotice_release = ((AbstractC895380ZAq) objConvertToInboxEntranceWrapper$awemenotice_release).convertToInboxEntranceWrapper$awemenotice_release();
                } else if (objConvertToInboxEntranceWrapper$awemenotice_release instanceof InboxEntrancePod) {
                    objConvertToInboxEntranceWrapper$awemenotice_release = ((AbstractC895380ZAq) objConvertToInboxEntranceWrapper$awemenotice_release).convertToInboxEntranceWrapper$awemenotice_release();
                }
            }
            if (objConvertToInboxEntranceWrapper$awemenotice_release != null) {
                arrayList.add(objConvertToInboxEntranceWrapper$awemenotice_release);
            }
        }
        return new Pair<>(value, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0ZAG.LIZ.getClass();
        C0ZAG.LJFF = this;
        C0ZAH.LIZ.getClass();
        C0ZAH.LIZJ = this;
        C0ZA1.LIZ.LJI(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZAG.LIZ.getClass();
        C0ZAG.LJFF = null;
        AnonymousClass0956 anonymousClass0956 = C0ZAG.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0ZAH.LIZ.getClass();
        C0ZAH.LIZJ = null;
        AnonymousClass0956 anonymousClass09562 = C0ZAH.LIZIZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C0ZA1.LIZ.LJIIIZ();
    }

    @Override // X.C0ZA3
    public final boolean s4() {
        InboxWidget inboxWidget;
        LifecycleOwner parent = getParent();
        if (!(parent instanceof InboxWidgetContainer) || (inboxWidget = (InboxWidget) parent) == null) {
            return false;
        }
        return !inboxWidget.ko().isShow();
    }

    @Override // X.C0ZA3
    public final C885880Yp8 t6() {
        InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        if (inboxAbilityCenter$IMessageInboxWidgetAbility != null) {
            return inboxAbilityCenter$IMessageInboxWidgetAbility.t6();
        }
        return null;
    }

    @Override // X.C0ZA3
    public final boolean ve() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        EnumC1889770zHD enumC1889770zHD;
        List<C890610Ywl> list;
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LIZ(3);
        }
        if (this.LLJILLL && this.LLJJ && Intrinsics.LJFF(inboxWidget.identity(), C0Z3O.LIZIZ)) {
            this.LLJJ = false;
            return;
        }
        if (this.LLJILLL && Intrinsics.LJFF(inboxWidget.identity(), C898680ZNi.LIZIZ)) {
            this.LLJJ = false;
        }
        C0Z31 c0z31LJIIZILJ2 = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ2 != null) {
            c0z31LJIIZILJ2.LIZ(4);
        }
        super.Zo(inboxWidget);
        if (Intrinsics.LJFF(inboxWidget.identity(), C898680ZNi.LIZIZ)) {
            this.LLJJI = false;
        }
        C0ZA1.LIZ.getClass();
        C0ZA1.LJIIIIZZ("reload");
        if (Intrinsics.LJFF(inboxWidget.identity(), C0Z3O.LIZIZ)) {
            C1904490zex c1904490zex = C1904490zex.LJFF;
            C885880Yp8 c885880Yp8T6 = t6();
            if (c885880Yp8T6 != null && (list = c885880Yp8T6.LIZ) != null && list.isEmpty()) {
                enumC1889770zHD = EnumC1889770zHD.EMPTY;
            } else {
                enumC1889770zHD = EnumC1889770zHD.SUCCESS;
            }
            c1904490zex.LJIIJ("dm", enumC1889770zHD);
            C885880Yp8 c885880Yp8T62 = t6();
            if (c885880Yp8T62 != null && c885880Yp8T62.LJ == 1) {
                if (c885880Yp8T62.LIZIZ) {
                    C0ZA1.LJIIIIZZ = false;
                } else {
                    if (C0ZA1.LJIIIIZZ) {
                        return;
                    }
                    C0ZA1.LJIIIIZZ = true;
                    C0ZA1.LJIIIIZZ("page_state");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        this.LLJJI = true;
        if (enumC1599580rjA == EnumC1599580rjA.PULL_TO_REFRESH) {
            this.LLJILLL = true;
            this.LLJJ = true;
        }
        super.vo(enumC1599580rjA);
    }

    public final C890690Ywt ap(int i, FilterTabType filterTabType) {
        return new C890690Ywt(i, filterTabType, this.LLJJIII);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
