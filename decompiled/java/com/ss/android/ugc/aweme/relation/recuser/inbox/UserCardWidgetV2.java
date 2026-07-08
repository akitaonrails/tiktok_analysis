package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC1261460ivo;
import X.AbstractC1903730zdj;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0PEM;
import X.C0XQ7;
import X.C1261360ive;
import X.C1261450ivn;
import X.C1261480ivq;
import X.C1261650iw7;
import X.C1261770iwJ;
import X.C1261860iwS;
import X.C1261940iwa;
import X.C1263420iyy;
import X.C1263590izF;
import X.C1319210kQx;
import X.C13BV;
import X.C13IQ;
import X.C14EU;
import X.C1558520qew;
import X.C1720106oR;
import X.C1889230zGL;
import X.C1903740zdk;
import X.C1903750zdl;
import X.C1903760zdm;
import X.C1904040zeE;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C304890BxH;
import X.C452501pT;
import X.C486550J6f;
import X.C724240Sb0;
import X.C757600Tni;
import X.EnumC1070410dxf;
import X.EnumC1261960iwc;
import X.EnumC1599580rjA;
import X.EnumC1889240zGM;
import X.EnumC1889520zGo;
import X.EnumC1903590zdV;
import X.EnumC1903600zdW;
import X.InterfaceC1073860e3E;
import X.InterfaceC1261590iw1;
import X.InterfaceC1261750iwH;
import X.InterfaceC1262660ixk;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1889260zGO;
import X.InterfaceC1891350zJl;
import X.InterfaceC332260D0u;
import X.InterfaceC586170Myt;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IRecommendUserAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMafChatListWidgetAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IRecommendUserAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationResultFragmentScope;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.TriadRecMoreConfig;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class UserCardWidgetV2 extends InboxWidget implements InterfaceC1261750iwH {
    public static String LLJJJJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static final C01GW<Typeface> LLJJJJJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(350));
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(351));
    public List<? extends InterfaceC1891350zJl> LLJIJIL = C13BV.INSTANCE;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 519));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 521));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1751));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 522));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 523));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 520));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1752));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(305));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1754));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1753));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1755));

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        EnumC1889240zGM enumC1889240zGMLIZ;
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        InterfaceC1889260zGO interfaceC1889260zGOHo = InboxWidget.ho(this);
        if (interfaceC1889260zGOHo == null || (enumC1889240zGMLIZ = interfaceC1889260zGOHo.LIZ()) == null) {
            return;
        }
        int i = C1889230zGL.LIZ[enumC1889240zGMLIZ.ordinal()];
        if (i == 1) {
            C1558520qew.LJI(this, InboxFragmentScope.class, new InboxFragmentRecAbility(this), InboxAbilityCenter$IRecommendUserAbility.class, null, null);
        } else if (i == 2) {
            C1558520qew.LJI(this, NotificationResultFragmentScope.class, new NotificationFragmentRecAbility(this), NotificationAbilityCenter.IRecommendUserAbility.class, null, null);
        } else if (i == 3) {
            C1558520qew.LJI(this, FollowerFragmentScope.class, new FollowerFragmentRecAbility(this), FollowerPageAbilityCenter$IRecommendUserAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        for (InterfaceC1891350zJl interfaceC1891350zJl : this.LLJIJIL) {
            if (interfaceC1891350zJl instanceof InterfaceC1261590iw1) {
                InterfaceC1261590iw1 interfaceC1261590iw1 = (InterfaceC1261590iw1) interfaceC1891350zJl;
                Object objZo = Zo();
                interfaceC1261590iw1.LIZ(objZo instanceof InterfaceC1263010iyJ ? (InterfaceC1263010iyJ) objZo : null);
            }
        }
        return this.LLJIJIL;
    }

    public final ActivityUserCardVM Ho() {
        return (ActivityUserCardVM) this.LLJJIII.getValue();
    }

    public final InboxUserCardSharedVM Jo() {
        return (InboxUserCardSharedVM) this.LLJJ.getValue();
    }

    public final InboxUserCardVM Lo() {
        return (InboxUserCardVM) this.LLJJI.getValue();
    }

    public final boolean No() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    public final AbstractC1903730zdj Zo() {
        return (AbstractC1903730zdj) this.LLJJJIL.getValue();
    }

    public final InterfaceC332260D0u<InboxWidgetStatus> ap() {
        return (InterfaceC332260D0u) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final EnumC1889520zGo bo() {
        return (EnumC1889520zGo) ((InterfaceC332260D0u) this.LLJI.getValue()).getValue();
    }

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.087Z
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    if (!Intrinsics.LJFF(UserCardWidgetV2.LLJJJJ, curUserId)) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("the account ");
                        sbLIZ.append(UserCardWidgetV2.LLJJJJ);
                        sbLIZ.append(" -> ");
                        sbLIZ.append(curUserId);
                        C1720106oR.LJI("@UserCard_inbox", C2188811AlT.LIZIZ(sbLIZ));
                        UserCardWidgetV2.LLJJJJ = curUserId;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Zo().LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void LJJIIJ() {
        ((C1904040zeE) Zo()).LLILLIZIL();
    }

    public final String Oo() {
        EnumC1889240zGM enumC1889240zGMLIZ;
        InterfaceC1889260zGO interfaceC1889260zGOHo = InboxWidget.ho(this);
        return (interfaceC1889260zGOHo == null || (enumC1889240zGMLIZ = interfaceC1889260zGOHo.LIZ()) == null || C1889230zGL.LIZ[enumC1889240zGMLIZ.ordinal()] != 3) ? "click_card" : "click_followers";
    }

    public final String So() {
        InterfaceC1889260zGO interfaceC1889260zGOHo = InboxWidget.ho(this);
        if (interfaceC1889260zGOHo != null) {
            return interfaceC1889260zGOHo.LIZIZ();
        }
        return null;
    }

    public final Integer Vo() {
        EnumC1889240zGM enumC1889240zGMLIZ;
        InterfaceC1889260zGO interfaceC1889260zGOHo = InboxWidget.ho(this);
        if (interfaceC1889260zGOHo == null || (enumC1889240zGMLIZ = interfaceC1889260zGOHo.LIZ()) == null) {
            return null;
        }
        int i = C1889230zGL.LIZ[enumC1889240zGMLIZ.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 1 : null;
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp2;
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), NotificationAbilityCenter.INotificationFragmentAbility.class, null);
        if (iNotificationFragmentAbility != null && (viewOnAttachStateChangeListenerC20604515jvQp2 = iNotificationFragmentAbility.qp()) != null) {
            Zo().LIZIZ(viewOnAttachStateChangeListenerC20604515jvQp2);
        }
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
        if (followerPageAbilityCenter$IFollowerFragmentAbility != null && (viewOnAttachStateChangeListenerC20604515jvQp = followerPageAbilityCenter$IFollowerFragmentAbility.qp()) != null) {
            Zo().LIZIZ(viewOnAttachStateChangeListenerC20604515jvQp);
        }
        if (!this.LLIZLLLIL) {
            InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJJIJI.getValue();
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.av(null);
            }
            this.LLIZLLLIL = true;
        }
        return Zo().LIZ();
    }

    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("@UserCard_inbox_");
        sbLIZ.append(So());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        C1319210kQx c1319210kQxIM;
        Integer numVo;
        if (C1263590izF.LIZLLL() && (numVo = Vo()) != null && numVo.intValue() == 0) {
            EnumC1261960iwc enumC1261960iwc = EnumC1261960iwc.INBOX_PAGE;
            C1261940iwa.LIZ.getClass();
            if (!C1261940iwa.LIZJ(enumC1261960iwc)) {
                C1261940iwa.LJ(enumC1261960iwc);
            }
        }
        ((C1904040zeE) Zo()).LJI(null);
        ((C1904040zeE) Zo()).Eg(this);
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null && (c1319210kQxIM = inboxAbilityCenter$IInboxFragmentAbility.IM()) != null) {
            Zo().LIZIZ(c1319210kQxIM);
        }
        InboxAbilityCenter$IMafChatListWidgetAbility inboxAbilityCenter$IMafChatListWidgetAbility = (InboxAbilityCenter$IMafChatListWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMafChatListWidgetAbility.class, null);
        MafChatListWidgetV2 mafChatListWidgetV2HH0 = inboxAbilityCenter$IMafChatListWidgetAbility != null ? inboxAbilityCenter$IMafChatListWidgetAbility.hH0() : null;
        if ((mafChatListWidgetV2HH0 instanceof InterfaceC1262660ixk) && mafChatListWidgetV2HH0 != null) {
            ((C1904040zeE) Zo()).LJJLL(mafChatListWidgetV2HH0);
        }
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJJIJI.getValue();
        if (interfaceC1073860e3E != null) {
            Integer numVo2 = Vo();
            if (numVo2 != null && numVo2.intValue() == 0) {
                interfaceC1073860e3E.vg2();
            }
            ((C1904040zeE) Zo()).Eg(interfaceC1073860e3E);
        }
        cp(false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        EnumC1889240zGM enumC1889240zGMLIZ;
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility;
        C1319210kQx c1319210kQxIM;
        super.onDestroy();
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJJIJI.getValue();
        if (interfaceC1073860e3E != null) {
            interfaceC1073860e3E.m6();
        }
        InterfaceC1889260zGO interfaceC1889260zGOHo = InboxWidget.ho(this);
        if ((interfaceC1889260zGOHo != null ? interfaceC1889260zGOHo.LIZ() : null) != EnumC1889240zGM.INBOX && (inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null)) != null && (c1319210kQxIM = inboxAbilityCenter$IInboxFragmentAbility.IM()) != null) {
            Zo().LIZJ(c1319210kQxIM);
        }
        ((C1904040zeE) Zo()).ng(this);
        EventBus.LIZLLL().LJJI(this);
        InterfaceC1889260zGO interfaceC1889260zGOHo2 = InboxWidget.ho(this);
        if (interfaceC1889260zGOHo2 == null || (enumC1889240zGMLIZ = interfaceC1889260zGOHo2.LIZ()) == null) {
            return;
        }
        int i = C1889230zGL.LIZ[enumC1889240zGMLIZ.ordinal()];
        if (i == 1) {
            C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$IRecommendUserAbility.class, null);
        } else if (i == 2) {
            C1558520qew.LJIIJ(this, NotificationResultFragmentScope.class, NotificationAbilityCenter.IRecommendUserAbility.class, null);
        } else if (i == 3) {
            C1558520qew.LJIIJ(this, FollowerFragmentScope.class, FollowerPageAbilityCenter$IRecommendUserAbility.class, null);
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        Integer numVo;
        NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvQp2;
        Fragment fragmentLJI;
        LifecycleCoroutineScope lifecycleScope;
        if (abstractC1261460ivo instanceof C1261450ivn) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && fragmentLJI2.getContext() != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLJI)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C757600Tni(this, null), 2);
                return;
            }
            return;
        }
        if (abstractC1261460ivo instanceof C1261480ivq) {
            T t = abstractC1261460ivo.LIZ;
            if (!(t instanceof C1261770iwJ) || ((C1261770iwJ) t).LL != EnumC1070410dxf.CONTACT) {
                return;
            }
            EnumC1903590zdV.markAction$default(EnumC1903590zdV.CONTACTS, false, 1, null);
            return;
        }
        if (!(abstractC1261460ivo instanceof C1261360ive) || !C304890BxH.LIZIZ() || ((TriadRecMoreConfig) C1263420iyy.LIZIZ.getValue()).withAutoScroll != 1) {
            return;
        }
        Integer numVo2 = Vo();
        if ((numVo2 == null || numVo2.intValue() != 1) && ((numVo = Vo()) == null || numVo.intValue() != 2)) {
            return;
        }
        int i = C2187451AjH.LIZ;
        String tag = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AUTOSCROLL - rec more inserted, position: ");
        C1261360ive c1261360ive = (C1261360ive) abstractC1261460ivo;
        sbLIZ.append(c1261360ive.LIZIZ);
        sbLIZ.append(", count: ");
        sbLIZ.append(c1261360ive.LIZJ.size());
        C1720106oR.LJI(tag, C2188811AlT.LIZIZ(sbLIZ));
        Integer numVo3 = Vo();
        if (numVo3 == null) {
            return;
        }
        if (numVo3.intValue() == 1) {
            FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
            if (followerPageAbilityCenter$IFollowerFragmentAbility == null || (viewOnAttachStateChangeListenerC20604515jvQp2 = followerPageAbilityCenter$IFollowerFragmentAbility.qp()) == null) {
                return;
            }
            bp(viewOnAttachStateChangeListenerC20604515jvQp2, c1261360ive);
            return;
        }
        if (numVo3.intValue() != 2 || (iNotificationFragmentAbility = (NotificationAbilityCenter.INotificationFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), NotificationAbilityCenter.INotificationFragmentAbility.class, null)) == null || (viewOnAttachStateChangeListenerC20604515jvQp = iNotificationFragmentAbility.qp()) == null) {
            return;
        }
        bp(viewOnAttachStateChangeListenerC20604515jvQp, c1261360ive);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cp(boolean r18) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2.cp(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    @Override // X.InterfaceC1261750iwH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nO0(X.C1075800e6M r6) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2.nO0(X.0e6M):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C486550J6f c486550J6f) {
        ((C1904040zeE) Zo()).reset();
        if (C1263590izF.LIZLLL()) {
            Integer numVo = Vo();
            if (numVo != null) {
                if (numVo.intValue() == 0) {
                    InboxUserCardVM inboxUserCardVMLo = Lo();
                    inboxUserCardVMLo.getClass();
                    inboxUserCardVMLo.LL = new C1903760zdm(0);
                    return;
                } else if (numVo.intValue() == 2) {
                    ActivityUserCardVM activityUserCardVMHo = Ho();
                    activityUserCardVMHo.getClass();
                    activityUserCardVMHo.LL = new C1903750zdl(0);
                    return;
                }
            }
            InboxUserCardSharedVM inboxUserCardSharedVMJo = Jo();
            inboxUserCardSharedVMJo.getClass();
            inboxUserCardSharedVMJo.LL = new C1903740zdk(0);
            return;
        }
        InboxUserCardSharedVM inboxUserCardSharedVMJo2 = Jo();
        inboxUserCardSharedVMJo2.getClass();
        inboxUserCardSharedVMJo2.LL = new C1903740zdk(0);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void oo(RecyclerView recyclerView) {
        Zo().LIZJ(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        Integer numVo;
        this.LLJ = false;
        if (!C1263590izF.LIZLLL() || (numVo = Vo()) == null || numVo.intValue() != 0 || enumC1599580rjA != EnumC1599580rjA.SWITCH_TAB) {
            cp(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        Zo().LJII(viewHolder);
        if (!this.LLJ && (viewHolder instanceof AbsAuthCell) && this.LLJILJILJ.getValue() == EnumC1903600zdW.BOTTOM) {
            this.LLJ = true;
            EnumC1903590zdV.CONTACTS.markExposure();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void yo(RecyclerView.ViewHolder viewHolder) {
        Zo().LJIIIIZZ(viewHolder);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void zo(RecyclerView.ViewHolder viewHolder) {
        Zo().LJIIIZ(viewHolder);
    }

    public final void bp(final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1261360ive c1261360ive) {
        final LinearLayoutManager linearLayoutManager;
        String strItemUniqueId;
        int iFindLastCompletelyVisibleItemPosition;
        C1261650iw7 c1261650iw7;
        C1261650iw7 c1261650iw72;
        String nickname;
        String nickname2;
        C1261650iw7 c1261650iw73;
        C1261860iwS c1261860iwS;
        C1261860iwS c1261860iwS2;
        C1261860iwS c1261860iwS3;
        C1261650iw7 c1261650iw74;
        C1261860iwS c1261860iwS4;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        String nickname3 = null;
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            String strItemUniqueId2 = ((C1261860iwS) c1261360ive.LIZ).itemUniqueId();
            final boolean z = false;
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : viewOnAttachStateChangeListenerC20604515jv.getListItems()) {
                if ((interfaceC1891350zJl instanceof C1261650iw7) && (c1261650iw74 = (C1261650iw7) interfaceC1891350zJl) != null && (c1261860iwS4 = c1261650iw74.LLILLJJLI) != null) {
                    strItemUniqueId = c1261860iwS4.itemUniqueId();
                } else {
                    strItemUniqueId = null;
                }
                if (Intrinsics.LJFF(strItemUniqueId, strItemUniqueId2)) {
                    if (i > 0 && (iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()) != -1 && iFindLastCompletelyVisibleItemPosition >= 0 && iFindLastCompletelyVisibleItemPosition < viewOnAttachStateChangeListenerC20604515jv.getListItems().size()) {
                        Object obj = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), iFindLastCompletelyVisibleItemPosition);
                        if (obj instanceof C1261650iw7) {
                            c1261650iw7 = (C1261650iw7) obj;
                        } else {
                            c1261650iw7 = null;
                        }
                        Object obj2 = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), i);
                        if (obj2 instanceof C1261650iw7) {
                            c1261650iw72 = (C1261650iw7) obj2;
                        } else {
                            c1261650iw72 = null;
                        }
                        String tag = getTag();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AUTOSCROLL - rec more inserted, visibleItemIndex: ");
                        sbLIZ.append(iFindLastCompletelyVisibleItemPosition);
                        sbLIZ.append(", nickname ");
                        if (c1261650iw7 != null && (c1261860iwS3 = c1261650iw7.LLILLJJLI) != null) {
                            nickname = c1261860iwS3.getNickname();
                        } else {
                            nickname = null;
                        }
                        sbLIZ.append(nickname);
                        C1720106oR.LJI(tag, C2188811AlT.LIZIZ(sbLIZ));
                        String tag2 = getTag();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AUTOSCROLL - rec more inserted, targetItemIndex: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", nickname ");
                        if (c1261650iw72 != null && (c1261860iwS2 = c1261650iw72.LLILLJJLI) != null) {
                            nickname2 = c1261860iwS2.getNickname();
                        } else {
                            nickname2 = null;
                        }
                        sbLIZ2.append(nickname2);
                        C1720106oR.LJI(tag2, C2188811AlT.LIZIZ(sbLIZ2));
                        Integer numVo = Vo();
                        if (numVo != null && numVo.intValue() == 1) {
                            int size = c1261360ive.LIZJ.size();
                            if (size > 1) {
                                size = 1;
                            }
                            int i2 = i + size;
                            final int size2 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                            if (i2 <= size2) {
                                size2 = i2;
                            }
                            if (size2 > iFindLastCompletelyVisibleItemPosition) {
                                int i3 = C2187451AjH.LIZ;
                                String tag3 = getTag();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("AUTOSCROLL - by count ");
                                sbLIZ3.append(size2 - iFindLastCompletelyVisibleItemPosition);
                                C1720106oR.LJI(tag3, C2188811AlT.LIZIZ(sbLIZ3));
                                final boolean z2 = true;
                                viewOnAttachStateChangeListenerC20604515jv.postOnAnimationDelayed(new Runnable() { // from class: X.0e3I
                                    public final void LIZ() {
                                        Context context;
                                        if (C447550Hgn.LJ(this.LL) && viewOnAttachStateChangeListenerC20604515jv.isAttachedToWindow() && viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() == linearLayoutManager) {
                                            if (viewOnAttachStateChangeListenerC20604515jv.getScrollState() != 0) {
                                                viewOnAttachStateChangeListenerC20604515jv.postOnAnimation(this);
                                                return;
                                            }
                                            int i4 = size2;
                                            int size3 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                                            if (i4 > size3) {
                                                i4 = size3;
                                            }
                                            if (i4 >= 0 && (context = this.LL.getContext()) != null) {
                                                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                                                C1073910e3J c1073910e3J = new C1073910e3J(context, C304890BxH.LIZLLL(), z2);
                                                c1073910e3J.LIZ = i4;
                                                linearLayoutManager2.startSmoothScroll(c1073910e3J);
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("UserCardWidgetV2@a30b.scheduleRecMoreInsertedSmoothScroll$startSmoothScroll$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("UserCardWidgetV2@a30b.scheduleRecMoreInsertedSmoothScroll$startSmoothScroll$1");
                                    }
                                }, 50L);
                                return;
                            }
                            return;
                        }
                        Integer numVo2 = Vo();
                        if (numVo2 == null || numVo2.intValue() != 2) {
                            return;
                        }
                        int size3 = i + c1261360ive.LIZJ.size();
                        final int size4 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                        if (size3 <= size4) {
                            size4 = size3;
                        }
                        if (size4 <= iFindLastCompletelyVisibleItemPosition) {
                            return;
                        }
                        Object obj3 = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), size4);
                        if (obj3 instanceof C1261650iw7) {
                            c1261650iw73 = (C1261650iw7) obj3;
                        } else {
                            c1261650iw73 = null;
                        }
                        String tag4 = getTag();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("AUTOSCROLL - rec more inserted, needToShowItemIndex: ");
                        sbLIZ4.append(size4);
                        sbLIZ4.append(", nickname ");
                        if (c1261650iw73 != null && (c1261860iwS = c1261650iw73.LLILLJJLI) != null) {
                            nickname3 = c1261860iwS.getNickname();
                        }
                        sbLIZ4.append(nickname3);
                        C1720106oR.LJI(tag4, C2188811AlT.LIZIZ(sbLIZ4));
                        viewOnAttachStateChangeListenerC20604515jv.postOnAnimationDelayed(new Runnable() { // from class: X.0e3I
                            public final void LIZ() {
                                Context context;
                                if (C447550Hgn.LJ(this.LL) && viewOnAttachStateChangeListenerC20604515jv.isAttachedToWindow() && viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() == linearLayoutManager) {
                                    if (viewOnAttachStateChangeListenerC20604515jv.getScrollState() != 0) {
                                        viewOnAttachStateChangeListenerC20604515jv.postOnAnimation(this);
                                        return;
                                    }
                                    int i4 = size4;
                                    int size32 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                                    if (i4 > size32) {
                                        i4 = size32;
                                    }
                                    if (i4 >= 0 && (context = this.LL.getContext()) != null) {
                                        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                                        C1073910e3J c1073910e3J = new C1073910e3J(context, C304890BxH.LIZLLL(), z);
                                        c1073910e3J.LIZ = i4;
                                        linearLayoutManager2.startSmoothScroll(c1073910e3J);
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("UserCardWidgetV2@a30b.scheduleRecMoreInsertedSmoothScroll$startSmoothScroll$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("UserCardWidgetV2@a30b.scheduleRecMoreInsertedSmoothScroll$startSmoothScroll$1");
                            }
                        }, 50L);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (!this.LLIZLLLIL) {
            InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJJIJI.getValue();
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.av(null);
            }
            this.LLIZLLLIL = true;
        }
        return Zo().LJFF(viewGroup, c13iq);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        Zo().LJ(viewHolder, interfaceC1891350zJl, i);
    }
}
