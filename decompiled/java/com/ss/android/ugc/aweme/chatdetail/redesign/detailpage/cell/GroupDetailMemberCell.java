package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C05QS;
import X.C069P;
import X.C0I0B;
import X.C0S1B;
import X.C0Z9N;
import X.C0ZE7;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZP4;
import X.C0ZPM;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1243340iSa;
import X.C1260960iv0;
import X.C13LE;
import X.C13LP;
import X.C1509305vX;
import X.C1584506Ih;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1770850wBP;
import X.C1908830zlx;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C287640BPe;
import X.C289680BXa;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452080Ho6;
import X.C452501pT;
import X.C461720I8s;
import X.C736680Sv4;
import X.C737760Swo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897400ZIk;
import X.C897410ZIl;
import X.C897430ZIn;
import X.C897490ZIt;
import X.C897520ZIw;
import X.C898250ZLr;
import X.C898270ZLt;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.InterfaceC0148002o;
import X.InterfaceC1398730mVD;
import X.InterfaceC1480505qt;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS50S0400000_14;
import Y.AObserverS218S0100000_14;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS504S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailMemberCell extends PowerCell<C897400ZIk> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailMemberCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public GroupDetailMemberCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupDetailViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 69);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(27);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 90), awS558S0100000_14, AFwS201S0000000_14.get$arr$(58), new AwS558S0100000_14((C03K6) this, 93), new AwS558S0100000_14((C03K6) this, 95), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 97), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 99), null, new AwS558S0100000_14((C03K6) this, 100));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 94);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 96);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 98);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 10));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 101);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 58);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 61);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 63);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 65);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 67), awS558S0100000_14, AFwS201S0000000_14.get$arr$(56), new AwS558S0100000_14((C03K6) this, 72), new AwS558S0100000_14((C03K6) this, 74), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 76), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 77), null, new AwS558S0100000_14((C03K6) this, 78));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 80), awS558S0100000_14, AFwS201S0000000_14.get$arr$(57), new AwS558S0100000_14((C03K6) this, 83), new AwS558S0100000_14((C03K6) this, 85), new AwS558S0100000_14((C03K6) this, 86), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 88));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 84));
        this.LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 70));
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 71));
        this.LLILZIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 68));
        this.LLILZLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 82));
        this.LLIZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 89));
        this.LLIZLLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 81));
        this.LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 60));
        this.LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 59));
        this.LLJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 73));
        this.LLJILJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 87));
        this.LLJILJILJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 75));
        this.LLJILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 91));
        this.LLJJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 92));
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 64));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 79));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 62));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 66));
    }

    public final GroupDetailViewModel R5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (GroupDetailViewModel) assemVMLazy.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        EventLiveData<C1243340iSa> eventLiveDataLIZ;
        C736680Sv4.LJIIIIZZ(this, R5(), new C2217381BqS() { // from class: X.0ZIp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLIZ;
            }
        }, null, new AwS628S0100000_14(this, 5), 6);
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILZ.getValue();
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS593S0100000_14(this, 301).invoke(config.LIZ);
            config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.DM, new C1606770rul(null, null, null, null, new AwS558S0100000_14(this, 1502), null, null, null, null, 495), 4)));
            if (R5().AQ2()) {
                config.LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.DM, null, false, false, (C897520ZIw) this.LLJJI.getValue(), 126)));
            }
            config.LIZIZ(AFwS248S0000000_14.get$arr$(486));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        View view = (View) this.LLILZ.getValue();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.W5(view, marginLayoutParams);
        }
        if (C289680BXa.LIZ()) {
            IMHostApiRelationService.LIZ.getClass();
            IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
            if (iMHostApiRelationServiceLIZ == null || (eventLiveDataLIZ = iMHostApiRelationServiceLIZ.LIZ()) == null) {
                return;
            }
            eventLiveDataLIZ.observe(this, new AObserverS218S0100000_14(this, 32));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return C287640BPe.LIZ() ? R.layout.cmh : R.layout.cme;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJILJILJ.getValue();
        if (iDMAvatarLoader != null) {
            iDMAvatarLoader.LIZ();
        }
    }

    public final void I5(C897400ZIk c897400ZIk) {
        if (this.LLJJI.getValue() == null) {
            return;
        }
        C0ZPM c0zpm = (C0ZPM) this.LLJIJIL.getValue();
        if (c0zpm != null) {
            c0zpm.LIZIZ(c897400ZIk.LLILLL);
        }
        C0ZE7 c0ze7 = (C0ZE7) this.LLJILJIL.getValue();
        c0ze7.LIZJ = c897400ZIk.LL.getUid();
        c0ze7.LJII = Boolean.valueOf(c897400ZIk.LLILLL);
        C897490ZIt.LIZLLL((C0ZE7) this.LLJILJIL.getValue());
    }

    public final void N5(C897400ZIk c897400ZIk) {
        View view = (View) this.LLIZ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(((View) this.LLIZ.getValue()).getContext()));
        TextView textView = (TextView) this.LLIZ.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = numValueOf;
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        textView.setBackground(c384050F3z2.LIZ(textView.getContext()));
        int i = c897400ZIk.LLILLJJLI;
        if (i == C0Z9N.OWNER.getValue()) {
            textView.setText(textView.getContext().getString(2131828483));
            C1584506Ih.LIZIZ(textView);
        } else if (i == C0Z9N.ADMIN.getValue()) {
            textView.setText(textView.getContext().getString(2131830147));
            C1584506Ih.LIZIZ(textView);
        } else {
            C1584506Ih.LIZ(textView);
        }
    }

    public final void P5(final C897400ZIk c897400ZIk) {
        String string;
        IMUser iMUserLIZ = C05QS.LIZ(c897400ZIk.LL);
        if (iMUserLIZ != null) {
            L5(c897400ZIk, iMUserLIZ);
            return;
        }
        TextView textView = (TextView) this.LLILZLL.getValue();
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131831188);
        } else {
            string = null;
        }
        textView.setText(string);
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.0ZIo
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                this.LIZ.L5(c897400ZIk, iMUser);
            }
        }, c897400ZIk.LL.getUid(), c897400ZIk.LL.getSecUid(), "im_chat_group", false);
    }

    public final void S5(String str) {
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_remove_pop", new Pair[]{new Pair("enter_from", getEnterFrom()), new Pair("enter_method", "group_chat_member"), new Pair("group_role", String.valueOf(R5().getState().LLJ)), new Pair("member_remove_cnt", "1"), new Pair("result", str)}, C0I0B.LJFF.LIZIZ());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C897400ZIk c897400ZIk = (C897400ZIk) interfaceC1891350zJl;
        super.onBindItemView(c897400ZIk);
        C427690Gpr.LJ(this.itemView, 0.0f);
        I5(c897400ZIk);
        N5(c897400ZIk);
        P5(c897400ZIk);
    }

    public final void L5(C897400ZIk c897400ZIk, IMUser iMUser) {
        String strLIZIZ;
        C1260960iv0 c1260960iv0LIZLLL;
        C1908830zlx c1908830zlxLJIIIIZZ;
        IMUser.Companion.getClass();
        User userLJII = C2201941BFw.LJII(iMUser);
        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJILJILJ.getValue();
        String str = "";
        if (iDMAvatarLoader != null) {
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            iDMAvatarLoader.LIZIZ(uid, iMUser.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        }
        TextView textView = (TextView) this.LLILZLL.getValue();
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null) {
            strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMUser.getUid(), iMUser.getDisplayName());
        } else {
            strLIZIZ = null;
        }
        textView.setText(strLIZIZ);
        if (!C461720I8s.LJI(iMUser.getUid()) && !iMUser.isBlocked()) {
            View view = (View) this.LLJ.getValue();
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.I7(new AbS504S0200000_14(this, iMUser, 0), view);
            if (!iMUser.isBlock()) {
                RelationButton relationButton = (RelationButton) this.LLIZLLLIL.getValue();
                HandlerHook.viewPost(this.itemView, new ARunnableS73S0200000_4(relationButton, this, 39));
                C786410Ut5.LJLLLLLL(0, relationButton);
                IMFriendsService iMFriendsServiceLIZ2 = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ2 != null && (c1908830zlxLJIIIIZZ = iMFriendsServiceLIZ2.LJIIIIZZ(userLJII)) != null) {
                    relationButton.LLLLZIL(c1908830zlxLJIIIIZZ);
                }
                IMFriendsService iMFriendsServiceLIZ3 = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ3 != null && (c1260960iv0LIZLLL = iMFriendsServiceLIZ3.LIZLLL(C2097908Jt.LIZJ(new Pair("light_interaction_enter_method", "group_member_list")))) != null) {
                    relationButton.setTracker(new AwS558S0100000_14(c1260960iv0LIZLLL, 1501));
                }
                relationButton.setFollowClickListener(new AwS450S0200000_14(userLJII, this, 17));
                IIMRecUserAnalytics.LIZ.getClass();
                IIMRecUserAnalytics iIMRecUserAnalyticsLIZ = C897430ZIn.LIZ();
                if (iIMRecUserAnalyticsLIZ != null) {
                    iIMRecUserAnalyticsLIZ.LIZIZ(userLJII, getEnterFrom());
                }
            } else {
                C786410Ut5.LJLLLLLL(8, (View) this.LLIZLLLIL.getValue());
            }
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLIZLLLIL.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJ.getValue());
        }
        C786410Ut5.Y7((ConstraintLayout) this.LLJI.getValue(), new ACListenerS50S0400000_14(userLJII, iMUser, this, c897400ZIk, 0));
        if (C287640BPe.LIZ()) {
            String uid2 = userLJII.getUid();
            if (uid2 != null) {
                StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
                if (storyFeatureLIZ != null) {
                    storyFeatureLIZ.LJFF(userLJII);
                }
                AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILZ.getValue();
                if (avatarComponentView != null) {
                    C0S1B.LIZ(avatarComponentView, uid2, userLJII, this, false, null, 56);
                    return;
                }
                return;
            }
            return;
        }
        InboxSocPubStatusViewModel inboxSocPubStatusViewModel = (InboxSocPubStatusViewModel) this.LLJJ.getValue();
        if (inboxSocPubStatusViewModel != null) {
            String uid3 = iMUser.getUid();
            if (uid3 != null) {
                str = uid3;
            }
            inboxSocPubStatusViewModel.gk2(str, true);
        }
        InboxSocPubStatusViewModel inboxSocPubStatusViewModel2 = (InboxSocPubStatusViewModel) this.LLJJ.getValue();
        if (inboxSocPubStatusViewModel2 == null) {
            return;
        }
        inboxSocPubStatusViewModel2.jo1((InterfaceC1398730mVD) this.LLJILLL.getValue(), userLJII);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C897400ZIk c897400ZIk = (C897400ZIk) interfaceC1891350zJl;
        super.onBindItemView(c897400ZIk, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C897410ZIl) {
            C897410ZIl c897410ZIl = (C897410ZIl) objLJJJLZIJ;
            if (c897410ZIl.LIZ) {
                I5(c897400ZIk);
            }
            if (c897410ZIl.LIZIZ) {
                N5(c897400ZIk);
            }
        }
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
