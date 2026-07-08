package com.ss.android.ugc.aweme.inbox.v2.container;

import X.C0QSJ;
import X.C0ZAT;
import X.C13BV;
import X.C13LE;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C1904490zex;
import X.C2217381BqS;
import X.C687700QyG;
import X.EnumC1889770zHD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxUserCardWidgetContainer extends UserCardVisibleWidgetContainer {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxUserCardWidgetContainer.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.inbox.v2.container.UserCardVisibleWidgetContainer, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.inbox.v2.container.UserCardVisibleWidgetContainer, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.v2.container.UserCardVisibleWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        C1889180zGG c1889180zGG = (C1889180zGG) C1889140zGC.LIZ.LJI(this).get(C0ZAT.LIZIZ);
        return (c1889180zGG == null || !c1889180zGG.LIZLLL) ? C13BV.INSTANCE : Collections.singletonList(c1889180zGG);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.inbox.v2.container.UserCardVisibleWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r4 = this;
            super.onCreate()
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIJIL
            if (r0 != 0) goto L3f
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L2c
            X.0Q7z r3 = r4.LLJJJ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L1a
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJJ = r3     // Catch: java.lang.Throwable -> L3a
        L1a:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r1 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJJIL = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L2c
            r0 = 0
            goto L34
        L2c:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r0     // Catch: java.lang.Throwable -> L3a
        L34:
            r4.LLJJIJIL = r0     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L38:
            monitor-exit(r4)
            goto L3f
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            if (r0 == 0) goto L4e
        L3f:
            androidx.lifecycle.MutableLiveData r2 = r0.jp2()
            if (r2 == 0) goto L4e
            Y.AObserverS218S0100000_14 r1 = new Y.AObserverS218S0100000_14
            r0 = 6
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.v2.container.InboxUserCardWidgetContainer.onCreate():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.v2.container.UserCardVisibleWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        super.Zo(inboxWidget);
        if (Intrinsics.LJFF(inboxWidget.ko(), C1889360zGY.LIZ)) {
            C1904490zex.LJFF.LJIIJ("recommend", EnumC1889770zHD.SUCCESS);
        } else {
            if (!Intrinsics.LJFF(inboxWidget.ko(), C1889340zGW.LIZ)) {
                return;
            }
            C1904490zex.LJFF.LJIIJ("recommend", EnumC1889770zHD.EMPTY);
        }
    }
}
