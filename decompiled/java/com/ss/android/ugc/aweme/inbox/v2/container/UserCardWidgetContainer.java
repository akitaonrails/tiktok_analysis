package com.ss.android.ugc.aweme.inbox.v2.container;

import X.C05RV;
import X.C0QSJ;
import X.C0ZAV;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889330zGV;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C1889370zGZ;
import X.C1904490zex;
import X.C2217381BqS;
import X.C296850BkJ;
import X.C687700QyG;
import X.C885880Yp8;
import X.C889930Yvf;
import X.C890610Ywl;
import X.EnumC1889770zHD;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObserverS218S0100000_14;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class UserCardWidgetContainer extends InboxWidgetContainer implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public boolean LLJILLL;
    public InboxWidgetStatus LLJJ = C1889370zGZ.LIZ;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserCardWidgetContainer.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility ap() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = r4.LLJJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope> r1 = com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJI = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.v2.container.UserCardWidgetContainer.ap():com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        NextLiveData nextLiveDataWc2;
        Pair pair;
        C885880Yp8 c885880Yp8;
        InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        if (inboxAbilityCenter$IMessageInboxWidgetAbility != null && (nextLiveDataWc2 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2()) != null && (pair = (Pair) nextLiveDataWc2.getValue()) != null && (c885880Yp8 = (C885880Yp8) pair.getSecond()) != null && c885880Yp8.LIZ.size() >= 100) {
            return C13BV.INSTANCE;
        }
        C1889180zGG c1889180zGG = (C296850BkJ.LIZ() ? C1889140zGC.LIZ.LJI(this) : C1889140zGC.LIZ.LJFF()).get(C0ZAV.LIZIZ);
        return (c1889180zGG == null || !c1889180zGG.LIZLLL) ? C13BV.INSTANCE : Collections.singletonList(c1889180zGG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final InboxWidgetStatus ko() {
        this.LLJJ = super.ko();
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityAp = ap();
        if (((inboxAbilityCenter$IInboxImFilterAbilityAp != null && Intrinsics.LJFF(inboxAbilityCenter$IInboxImFilterAbilityAp.Ef2((Pair) inboxAbilityCenter$IInboxImFilterAbilityAp.jp2().getValue()), Boolean.TRUE)) || !this.LLJILLL || C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX) && Intrinsics.LJFF(this.LLJJ, C1889360zGY.LIZ)) {
            this.LLJJ = C1889340zGW.LIZ;
        }
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbilityAp;
        MutableLiveData mutableLiveDataJp2;
        Pair<? extends InboxWidgetStatus, C885880Yp8> pair;
        NextLiveData nextLiveDataWc2;
        super.onCreate();
        InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        if (inboxAbilityCenter$IMessageInboxWidgetAbility == null || (nextLiveDataWc2 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2()) == null) {
            this.LLJILLL = true;
            if (inboxAbilityCenter$IMessageInboxWidgetAbility != null) {
            }
            inboxAbilityCenter$IInboxImFilterAbilityAp = ap();
            if (inboxAbilityCenter$IInboxImFilterAbilityAp != null || (mutableLiveDataJp2 = inboxAbilityCenter$IInboxImFilterAbilityAp.jp2()) == null) {
            }
            mutableLiveDataJp2.observe(this, new AObserverS218S0100000_14(this, 9));
            return;
        }
        nextLiveDataWc2.observe(this, new AObserverS218S0100000_14(this, 8));
        NextLiveData nextLiveDataWc22 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2();
        if (nextLiveDataWc22 != null && (pair = (Pair) nextLiveDataWc22.getValue()) != null) {
            bp(pair);
        }
        inboxAbilityCenter$IInboxImFilterAbilityAp = ap();
        if (inboxAbilityCenter$IInboxImFilterAbilityAp != null) {
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void Fo(InboxWidgetStatus inboxWidgetStatus) {
        this.LLJJ = inboxWidgetStatus;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
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

    public final void bp(Pair<? extends InboxWidgetStatus, C885880Yp8> pair) {
        int size;
        List<C890610Ywl> list;
        InboxWidgetStatus first = pair.getFirst();
        C885880Yp8 second = pair.getSecond();
        boolean z = false;
        if (second != null && (list = second.LIZ) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (Intrinsics.LJFF(first, C1889330zGV.LIZ)) {
            this.LLJILLL = true;
            return;
        }
        if (!Intrinsics.LJFF(first, C1889360zGY.LIZ) && !Intrinsics.LJFF(first, C1889340zGW.LIZ)) {
            return;
        }
        if (size < 100) {
            z = true;
        }
        this.LLJILLL = z;
        if (z) {
            return;
        }
        C1904490zex.LJFF.LJIIJ("recommend", EnumC1889770zHD.NO_NEED_SHOW);
    }
}
