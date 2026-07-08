package com.ss.android.ugc.aweme.notification.v2.widget.container;

import X.AbstractC21673719rz;
import X.C01GW;
import X.C036E;
import X.C13BV;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1866090yf1;
import X.C1869670ykn;
import X.C1889180zGG;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C1889370zGZ;
import X.C1889530zGp;
import X.C1901380zZw;
import X.C1904510zez;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C723580SZw;
import X.C844470XAv;
import X.C860610XpT;
import X.EnumC1599580rjA;
import X.EnumC1889770zHD;
import X.EnumC1901370zZv;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS97S0200000_28;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationResultFragmentScope;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationUserCardWidgetContainer extends InboxWidgetContainer implements NotificationAbilityCenter.INotificationUserCardWidgetContainerAbility, InterfaceC1554640qYg {
    public AbstractC21673719rz LLJJIII;
    public boolean LLJJIJIIJIL;
    public final C1559260qg8 LLJILLL = new C1559260qg8(new C723580SZw(this, C1869670ykn.class, "notification_result_fragment_model"), checkSupervisorPrepared());
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 454));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 453));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 455));

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void Fo(InboxWidgetStatus inboxWidgetStatus) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, NotificationResultFragmentScope.class, this, NotificationAbilityCenter.INotificationUserCardWidgetContainerAbility.class, null, null);
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate() notificationAbility = ");
        sbLIZ.append(this.LLJJ.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationUserCardWidgetContainer", strLIZIZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C860610XpT(this, null), 3);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -583003436) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final List<C1889180zGG> Oo() {
        C1869670ykn c1869670ykn = (C1869670ykn) this.LLJILLL.getValue();
        if (c1869670ykn == null || !c1869670ykn.LLILLJJLI) {
            Co(C1889370zGZ.LIZ);
            return C13BV.INSTANCE;
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), NotificationFragmentInjectProtocol.class, false);
        if (listLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        ArrayList<NotificationFragmentInjectProtocol> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            NotificationFragmentInjectProtocol notificationFragmentInjectProtocol = (NotificationFragmentInjectProtocol) obj;
            if (Intrinsics.LJFF(notificationFragmentInjectProtocol.identity(), C1866090yf1.LIZIZ) && notificationFragmentInjectProtocol.enable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (NotificationFragmentInjectProtocol notificationFragmentInjectProtocol2 : arrayList) {
            arrayList2.add(new C1889180zGG(notificationFragmentInjectProtocol2.j0(), notificationFragmentInjectProtocol2.z0(), notificationFragmentInjectProtocol2.identity(), notificationFragmentInjectProtocol2.enable()));
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final InboxWidgetStatus ko() {
        return !this.LLJJIJIIJIL ? C1889340zGW.LIZ : super.ko();
    }

    public NotificationUserCardWidgetContainer() {
        NotificationFragmentV2.LLJILJIL.getClass();
        C1889530zGp.LIZ("NotificationUserCardWidgetContainer", "init");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationUserCardWidgetContainerAbility
    public final boolean FQ() {
        return ko().isShow();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ap() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp;
        NotificationAbilityCenter.INotificationWidgetContainerAbility iNotificationWidgetContainerAbility;
        InboxWidgetStatus inboxWidgetStatusKo = super.ko();
        if (inboxWidgetStatusKo.isCompleted()) {
            if (!inboxWidgetStatusKo.isShow() && (iNotificationWidgetContainerAbility = (NotificationAbilityCenter.INotificationWidgetContainerAbility) this.LLJJ.getValue()) != null) {
                iNotificationWidgetContainerAbility.ri0();
            }
            C1901380zZw c1901380zZw = C1901380zZw.LIZ;
            boolean zIsShow = ko().isShow();
            c1901380zZw.getClass();
            if (C1901380zZw.LIZ()) {
                EnumC1901370zZv.LLJIJIL.LJII(zIsShow ? 1 : 0);
            }
            C1904510zez.LJFF.LJIIJ("recommend", Intrinsics.LJFF(inboxWidgetStatusKo, C1889360zGY.LIZ) ? EnumC1889770zHD.SUCCESS : Intrinsics.LJFF(inboxWidgetStatusKo, C1889340zGW.LIZ) ? EnumC1889770zHD.EMPTY : EnumC1889770zHD.FAIL);
        }
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) this.LLJJI.getValue();
        if (iNotificationFragmentAbility == null || (viewOnAttachStateChangeListenerC20604515jvQp = iNotificationFragmentAbility.qp()) == null) {
            return;
        }
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvQp, new ARunnableS97S0200000_28(this, viewOnAttachStateChangeListenerC20604515jvQp, 20));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public final void Zo(InboxWidget inboxWidget) {
        ap();
        super.Zo(inboxWidget);
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWidgetStatusChange, widget = ");
        sbLIZ.append(inboxWidget.identity());
        sbLIZ.append(", widget.status = ");
        sbLIZ.append(inboxWidget.ko());
        sbLIZ.append(", status = ");
        sbLIZ.append(ko());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationUserCardWidgetContainer", strLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                super.vo(enumC1599580rjA);
                C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRefresh, from = ");
                sbLIZ.append(enumC1599580rjA.getDetail());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1889530zGp.getClass();
                C1889530zGp.LIZ("NotificationUserCardWidgetContainer", strLIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
