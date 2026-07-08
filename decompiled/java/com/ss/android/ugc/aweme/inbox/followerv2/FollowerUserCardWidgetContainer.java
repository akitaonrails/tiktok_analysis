package com.ss.android.ugc.aweme.inbox.followerv2;

import X.AbstractC1865990yer;
import X.AbstractC21673719rz;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C05YC;
import X.C1245050iVL;
import X.C1558520qew;
import X.C1866030yev;
import X.C1866040yew;
import X.C1889310zGT;
import X.C1889330zGV;
import X.C1889340zGW;
import X.C1901350zZt;
import X.C1904500zey;
import X.C2188811AlT;
import X.C23250099c;
import X.C2450909j1;
import X.C452501pT;
import X.EnumC1889770zHD;
import X.EnumC1901360zZu;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS97S0200000_28;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerUserCardContainerAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerUserCardWidgetContainer extends InboxWidgetContainer implements FollowerPageAbilityCenter$IFollowerUserCardContainerAbility, InterfaceC1554640qYg {
    public boolean LLJJ;
    public AbstractC21673719rz LLJJIII;
    public InboxWidget LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 240));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 241));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 242));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void Fo(InboxWidgetStatus inboxWidgetStatus) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, FollowerFragmentScope.class, this, FollowerPageAbilityCenter$IFollowerUserCardContainerAbility.class, null, null);
        this.LLJJIJIIJIL = Lo(C1866030yev.LIZIZ);
        FollowerPageAbilityCenter$IFollowerWidgetContainerAbility followerPageAbilityCenter$IFollowerWidgetContainerAbility = (FollowerPageAbilityCenter$IFollowerWidgetContainerAbility) this.LLJJI.getValue();
        if (followerPageAbilityCenter$IFollowerWidgetContainerAbility != null) {
            followerPageAbilityCenter$IFollowerWidgetContainerAbility.tb0();
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -466522815) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerUserCardContainerAbility
    public final InterfaceC332260D0u T21() {
        return (InterfaceC332260D0u) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerUserCardContainerAbility
    public final void fI1() {
        if (this.LLJJIJIL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerUserCardWidgetContainer, observeNoticeState, followerAbility: ");
        Object value = this.LLJJI.getValue();
        sbLIZ.append(value != null ? value.hashCode() : 0);
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FollowerPageAbilityCenter$IFollowerWidgetContainerAbility followerPageAbilityCenter$IFollowerWidgetContainerAbility = (FollowerPageAbilityCenter$IFollowerWidgetContainerAbility) this.LLJJI.getValue();
        if (followerPageAbilityCenter$IFollowerWidgetContainerAbility != null) {
            this.LLJJIJIL = true;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1889310zGT(followerPageAbilityCenter$IFollowerWidgetContainerAbility, this, null), 3);
            followerPageAbilityCenter$IFollowerWidgetContainerAbility.tb0();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final InboxWidgetStatus ko() {
        return !this.LLJJ ? C1889340zGW.LIZ : super.ko();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<InterfaceC1891350zJl> listAo = super.Ao();
        C1901350zZt c1901350zZt = C1901350zZt.LIZ;
        int size = listAo.size();
        c1901350zZt.getClass();
        if (C1901350zZt.LIZJ()) {
            EnumC1901360zZu.LLJJIII.LJI(size);
        }
        return listAo;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[LOOP:1: B:27:0x0096->B:29:0x009c, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C1889180zGG> Oo() {
        /*
            r7 = this;
            boolean r0 = X.C1073960e3O.LIZIZ()
            r2 = 0
            if (r0 == 0) goto L4d
            X.0Q7z r1 = X.C1558520qew.LJIIL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol.class
            java.util.List r0 = X.C1554610qYd.LIZIZ(r1, r0, r2)
            if (r0 == 0) goto Lbb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol r2 = (com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol) r2
            X.0yer r1 = r2.identity()
            X.0yew r0 = X.C1866040yew.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L43
            X.0yer r1 = r2.identity()
            X.0yev r0 = X.C1866030yev.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1e
        L43:
            boolean r0 = r2.enable()
            if (r0 == 0) goto L1e
            r5.add(r3)
            goto L1e
        L4d:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol> r0 = com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol.class
            java.util.List r0 = X.C1554610qYd.LIZIZ(r1, r0, r2)
            if (r0 == 0) goto Lbb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L64:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol r2 = (com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol) r2
            X.0yer r1 = r2.identity()
            X.0yew r0 = X.C1866040yew.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L64
            boolean r0 = r2.enable()
            if (r0 == 0) goto L64
            r5.add(r3)
            goto L64
        L87:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L96:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol r0 = (com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentInjectProtocol) r0
            X.0zGG r4 = new X.0zGG
            X.12Dl r3 = r0.j0()
            X.0yeI r2 = r0.z0()
            X.0yer r1 = r0.identity()
            boolean r0 = r0.enable()
            r4.<init>(r3, r2, r1, r0)
            r6.add(r4)
            goto L96
        Lbb:
            X.13BV r6 = X.C13BV.INSTANCE
        Lbd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.followerv2.FollowerUserCardWidgetContainer.Oo():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        InboxWidget inboxWidget2;
        AbstractC738140SxQ abstractC738140SxQ;
        AbstractC738140SxQ next;
        AbstractC1865990yer abstractC1865990yerIdentity;
        InboxWidget inboxWidget3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp;
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
        if (followerPageAbilityCenter$IFollowerFragmentAbility != null && (viewOnAttachStateChangeListenerC20604515jvQp = followerPageAbilityCenter$IFollowerFragmentAbility.qp()) != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvQp, new ARunnableS97S0200000_28(this, viewOnAttachStateChangeListenerC20604515jvQp, 51));
        }
        super.Zo(inboxWidget);
        ((C05YC) this.LLJILLL.getValue()).LIZJ(new Pair(ko(), super.ko()));
        if (!Intrinsics.LJFF(inboxWidget.identity(), C1866030yev.LIZIZ)) {
            if (!Intrinsics.LJFF(inboxWidget.identity(), C1866040yew.LIZIZ)) {
                List<AbstractC738140SxQ> children = getChildren();
                if (children != null) {
                    Iterator<AbstractC738140SxQ> it2 = children.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            AbstractC738140SxQ abstractC738140SxQ2 = next;
                            if ((abstractC738140SxQ2 instanceof InboxWidget) && (inboxWidget3 = (InboxWidget) abstractC738140SxQ2) != null) {
                                abstractC1865990yerIdentity = inboxWidget3.identity();
                            } else {
                                abstractC1865990yerIdentity = null;
                            }
                            if (Intrinsics.LJFF(abstractC1865990yerIdentity, C1866040yew.LIZIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    abstractC738140SxQ = next;
                } else {
                    abstractC738140SxQ = null;
                }
                if (!(abstractC738140SxQ instanceof InboxWidget) || (inboxWidget = (InboxWidget) abstractC738140SxQ) == null) {
                    return;
                }
            }
            if (inboxWidget.ko().isShow()) {
                C1901350zZt.LIZ.getClass();
                if (C1901350zZt.LIZJ()) {
                    if (C1901350zZt.LIZJ()) {
                        EnumC1901360zZu.LLJJJ.LJI(1);
                    }
                    EnumC1901360zZu.LLJJI.LIZJ();
                }
                if (ko().isShow()) {
                    C2450909j1.LIZJ(AFwS217S0000000_28.get$arr$(775));
                }
            } else if (inboxWidget.ko().isHide()) {
                C1904500zey.LJFF.LJIIJ("recommend", EnumC1889770zHD.EMPTY);
                C1901350zZt.LIZ.getClass();
                if (C1901350zZt.LIZJ()) {
                    EnumC1901360zZu.LLJJJ.LJI(0);
                }
            }
            if (inboxWidget.ko().isCompleted() && (inboxWidget2 = this.LLJJIJIIJIL) != null) {
                inboxWidget2.Co(C1889330zGV.LIZ);
            }
        }
    }
}
