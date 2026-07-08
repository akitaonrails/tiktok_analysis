package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C11G4;
import X.C1216630hlV;
import X.C1216760hli;
import X.C127K;
import X.C13IQ;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1717506o1;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894210Z6d;
import X.EnumC1216640hlW;
import X.EnumC1216650hlX;
import X.EnumC1216690hlb;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AFwS341S0000000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageGroupContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final List<C1216760hli> LLJJ;
    public static final List<C1216760hli> LLJJI;
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS563S0100000_19(this, 496));
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public final Map<EnumC1216640hlW, C13IQ<? extends UIContentAssem>> LLJIJIL;
    public final Map<EnumC1216640hlW, C13IQ<? extends UISlotAssem>> LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageGroupContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        EnumC1216640hlW enumC1216640hlW = EnumC1216640hlW.REQUIRE_APPROVAL;
        EnumC1216640hlW enumC1216640hlW2 = EnumC1216640hlW.JOIN_REQUEST;
        List listLJIIJJI = C1697810uHb.LJIIJJI(enumC1216640hlW, enumC1216640hlW2);
        EnumC1216690hlb enumC1216690hlb = EnumC1216690hlb.JOIN;
        EnumC1216640hlW enumC1216640hlW3 = EnumC1216640hlW.INVITE_BY_LINK;
        List listSingletonList = Collections.singletonList(enumC1216640hlW3);
        EnumC1216690hlb enumC1216690hlb2 = EnumC1216690hlb.INVITE;
        EnumC1216640hlW enumC1216640hlW4 = EnumC1216640hlW.MANAGE_ADMIN;
        EnumC1216640hlW enumC1216640hlW5 = EnumC1216640hlW.REMOVE_MEMBER;
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(enumC1216640hlW4, enumC1216640hlW5);
        EnumC1216690hlb enumC1216690hlb3 = EnumC1216690hlb.MEMBER;
        EnumC1216640hlW enumC1216640hlW6 = EnumC1216640hlW.END_GROUP;
        List listLJIIJJI3 = C1697810uHb.LJIIJJI(EnumC1216640hlW.TRANSFER_OWNER, enumC1216640hlW6);
        EnumC1216690hlb enumC1216690hlb4 = EnumC1216690hlb.DESTRUCTIVE;
        LLJJ = C1697810uHb.LJIIJJI(new C1216760hli(listLJIIJJI, enumC1216690hlb), new C1216760hli(listSingletonList, enumC1216690hlb2), new C1216760hli(listLJIIJJI2, enumC1216690hlb3), new C1216760hli(listLJIIJJI3, enumC1216690hlb4));
        LLJJI = C1697810uHb.LJIIJJI(new C1216760hli(C1697810uHb.LJIIJJI(EnumC1216640hlW.WHO_CAN_JOIN, enumC1216640hlW, enumC1216640hlW2), enumC1216690hlb), new C1216760hli(Collections.singletonList(enumC1216640hlW3), enumC1216690hlb2), new C1216760hli(C1697810uHb.LJIIJJI(enumC1216640hlW4, enumC1216640hlW5, EnumC1216640hlW.HIDE_MEMBERS), enumC1216690hlb3), new C1216760hli(Collections.singletonList(EnumC1216640hlW.GO_LIVE_REMINDER), EnumC1216690hlb.GO_LIVE), new C1216760hli(Collections.singletonList(enumC1216640hlW6), enumC1216690hlb4));
    }

    public ManageGroupContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 498), AFwS257S0000000_19.get$arr$(83), null, true);
        this.LLJI = new C1559260qg8(new C723580SZw(this, C1717506o1.class, null), checkSupervisorPrepared());
        this.LLJIJIL = C2097608Jq.LJIIIIZZ(new Pair(EnumC1216640hlW.INVITE_BY_LINK, C13LE.LIZ(InviteByLinkAssem.class)), new Pair(EnumC1216640hlW.MANAGE_ADMIN, C13LE.LIZ(ManageAdminAssem.class)), new Pair(EnumC1216640hlW.JOIN_REQUEST, C13LE.LIZ(JoinRequestAssem.class)), new Pair(EnumC1216640hlW.REMOVE_MEMBER, C13LE.LIZ(RemoveMemberAssem.class)), new Pair(EnumC1216640hlW.GO_LIVE_REMINDER, C13LE.LIZ(GoLiveReminderAssem.class)), new Pair(EnumC1216640hlW.HIDE_MEMBERS, C13LE.LIZ(HideMembersAssem.class)), new Pair(EnumC1216640hlW.TRANSFER_OWNER, C13LE.LIZ(TransferOwnerAssem.class)), new Pair(EnumC1216640hlW.END_GROUP, C13LE.LIZ(EndGroupAssem.class)));
        this.LLJILJIL = C2097608Jq.LJIIIIZZ(new Pair(EnumC1216640hlW.WHO_CAN_JOIN, C13LE.LIZ(WhoCanJoinAssem.class)), new Pair(EnumC1216640hlW.REQUIRE_APPROVAL, C13LE.LIZ(RequireApprovalAssem.class)));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 497));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ManageGroupViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ManageGroupViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        ManageGroupViewModel manageGroupViewModelGo = Go();
        Long l = (Long) manageGroupViewModelGo.LLILZIL.getValue();
        if (l != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C894210Z6d(l.longValue(), manageGroupViewModelGo, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.127K, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, android.widget.FrameLayout] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ?? c127k;
        super.onViewCreated(view);
        List<C1216760hli> list = (List) this.LLJILJILJ.getValue();
        C786410Ut5.LJJJJJL((LinearLayout) this.LLIZLLLIL.getValue());
        for (C1216760hli c1216760hli : list) {
            EnumC1216690hlb enumC1216690hlb = c1216760hli.LIZIZ;
            ?? linearLayout = new LinearLayout(getContext());
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.setId(enumC1216690hlb.getId());
            C426750GoL.LJIIIZ(linearLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 21);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            linearLayout.setBackground(c384050F3z.LIZ(((View) this.LLIZLLLIL.getValue()).getContext()));
            for (EnumC1216640hlW enumC1216640hlW : c1216760hli.LIZ) {
                if (this.LLJILJIL.keySet().contains(enumC1216640hlW)) {
                    c127k = new FrameLayout(LJJIJL().getContext());
                    c127k.setId(enumC1216640hlW.getId());
                    C786410Ut5.a6(c127k, new FrameLayout.LayoutParams(-1, -2));
                } else {
                    c127k = new C127K(LJJIJL().getContext(), null, 6);
                    c127k.setId(enumC1216640hlW.getId());
                    c127k.setAccessory(new C11G4(c127k.getContext(), null));
                    c127k.setInset(EnumC1216650hlX.PADDING_16);
                }
                linearLayout.addView(c127k, new ViewGroup.LayoutParams(-1, -2));
            }
            ((ViewGroup) this.LLIZLLLIL.getValue()).addView(linearLayout);
        }
        C723850SaN.LIZLLL(this, new AwS228S0300000_19(list, (List<C1216760hli>) this, (ManageGroupContentAssem) view, (View) 3));
        List list2 = (List) this.LLJILJILJ.getValue();
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C1216760hli) it2.next()).LIZIZ == EnumC1216690hlb.JOIN) {
                    ManageGroupViewModel manageGroupViewModelGo = Go();
                    selectSubscribe(manageGroupViewModelGo, new C2217381BqS() { // from class: X.0hlS
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C1651206dK) obj).LL);
                        }
                    }, new C2217381BqS() { // from class: X.06dG
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C1651206dK) obj).LLILZ);
                        }
                    }, new C2217381BqS() { // from class: X.06dH
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C1651206dK) obj).LLILZIL);
                        }
                    }, C736820SvI.LIZIZ(manageGroupViewModelGo.usedInReusedScene), null, new C1216630hlV());
                    break;
                }
            }
        }
        List list3 = (List) this.LLJILJILJ.getValue();
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((C1216760hli) it3.next()).LIZIZ == EnumC1216690hlb.INVITE) {
                        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hlj
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C1651206dK) obj).LLIZLLLIL);
                            }
                        }, null, AFwS303S0000000_19.get$arr$(3), 6);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        List list4 = (List) this.LLJILJILJ.getValue();
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((C1216760hli) it4.next()).LIZIZ == EnumC1216690hlb.GO_LIVE) {
                        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.06Xx
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C1651206dK) obj).LLJILJIL);
                            }
                        }, null, AFwS303S0000000_19.get$arr$(2), 6);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        List list5 = (List) this.LLJILJILJ.getValue();
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            return;
        }
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            if (((C1216760hli) it5.next()).LIZIZ == EnumC1216690hlb.DESTRUCTIVE) {
                C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0hie
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1651206dK) obj).LLJJI);
                    }
                }, new C2217381BqS() { // from class: X.0hic
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1651206dK) obj).LLJJIII);
                    }
                }, null, AFwS341S0000000_19.get$arr$(1), 12);
                return;
            }
        }
    }
}
