package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem;

import X.C003A;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C09R3;
import X.C0I0B;
import X.C0ZHB;
import X.C0ZP4;
import X.C1077580e9E;
import X.C1252620ihY;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1705506m5;
import X.C19719912Dl;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C23250099c;
import X.C300140Bpc;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C860630XpV;
import X.C876890Yad;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS67S0000000_14;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AFwS337S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import u4.q0;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileReusedUISlot extends ReusedUISlotAssem<ProfileReusedUISlot> implements InterfaceC712990Rxx<C003A> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1015));
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1016));
    public final AssemVMLazy LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public View LLLI;
    public final List<C0ZP4> LLLII;
    public final C01GW LLLIIII;
    public C127G LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileReusedUISlot.class, "commonViewModel", "getCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ProfileReusedUISlot.class, "profileItemVm", "getProfileItemVm()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/profileitem/ProfileItemViewModel;", 0);
        c09r3.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ProfileReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 1017), AFwS248S0000000_14.get$arr$(278), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProfileItemViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 1018), AFwS248S0000000_14.get$arr$(279), null, true);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1007));
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1009));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1019));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1011));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1010));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1014));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1012));
        this.LLLFFI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1013));
        this.LLLFZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1008));
        this.LLLII = new ArrayList();
        this.LLLIIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1006));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cki;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ProfileItemViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIL;
        return (ProfileItemViewModel) assemVMLazy.getValue();
    }

    public final RelationButton sp() {
        return (RelationButton) this.LLLFF.getValue();
    }

    public final SessionInfo tp() {
        return (SessionInfo) this.LLJL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        Iterator<C0ZP4> it2 = this.LLLII.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
        ((ArrayList) this.LLLII).clear();
    }

    public final LinearLayout up() {
        return (LinearLayout) this.LLJZ.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 20)}, defaultViewModelProviderFactory);
                    this.LLLIIIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        IMBusinessInfoAbility iMBusinessInfoAbility;
        if (this.LLJLIL.getValue() == null) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        if (((Boolean) C1252620ihY.LJI.getValue()).booleanValue()) {
            RelationButton relationButtonSp = sp();
            ViewGroup.LayoutParams layoutParams = relationButtonSp.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(164));
                C786410Ut5.W5(relationButtonSp, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        view.setTag(R.id.k__, C0ZHB.LAST_ITEM_FILL_BOTTOM);
        q0.LJIJ(LJJIJL(), new C1077580e9E(1));
        C786410Ut5.R7((LinearLayout) this.LLJZIJLIL.getValue(), new ACListenerS149S0100000_14(this, 42));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iMBusinessInfoAbility = (IMBusinessInfoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMBusinessInfoAbility.class, null)) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C860630XpV(iMBusinessInfoAbility, this, null), 3);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C003A c003a) {
        IMUser iMUserLJIIL;
        if (this.LLJLIL.getValue() == null) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIL;
        ((ArrayList) this.LLLII).add(C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06ab
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILLJJLI;
            }
        }, null, AFwS298S0000000_14.get$arr$(13), 6));
        ((ArrayList) this.LLLII).add(C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0ZD4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C895910ZCr) obj).LL;
            }
        }, null, AFwS298S0000000_14.get$arr$(14), 6));
        ((ArrayList) this.LLLII).add(C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.0ZD5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C895910ZCr) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0ZD3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C895910ZCr) obj).LLILLJJLI;
            }
        }, null, AFwS337S0000000_14.get$arr$(3), 12));
        ((ArrayList) this.LLLII).add(C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0ZCz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C895910ZCr) obj).LLILLL;
            }
        }, null, AFwS298S0000000_14.get$arr$(11), 6));
        ((ArrayList) this.LLLII).add(C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0ZD0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C895910ZCr) obj).LLILZ;
            }
        }, null, AFwS298S0000000_14.get$arr$(12), 6));
        ProfileItemViewModel profileItemViewModelOp = op();
        IMUser singleChatFromUser = tp().getSingleChatFromUser();
        if (singleChatFromUser != null) {
            IMContactApi.LIZ.getClass();
            iMUserLJIIL = C069P.LIZ().LJ().LJIIL(singleChatFromUser.getUid(), singleChatFromUser.getSecUid(), "im_local_db");
        } else {
            iMUserLJIIL = null;
        }
        profileItemViewModelOp.yQ2(iMUserLJIIL);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003A c003a) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003A c003a) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void yp(IMUser iMUser, boolean z) {
        String str;
        String enterMethod;
        IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpiForReal(IUserProfilePreload.class);
        if (iUserProfilePreload != null) {
            IMUser.Companion.getClass();
            iUserProfilePreload.LIZ(C2201941BFw.LJII(iMUser));
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            String singleChatFromUserId = tp().getSingleChatFromUserId();
            if (C300140Bpc.LIZ()) {
                enterMethod = "click_head";
            } else {
                enterMethod = tp().getEnterMethod();
            }
            iDmHelperLIZ.LJIIIZ(singleChatFromUserId, null, enterMethod, tp().getConversationId());
        }
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        if (iIMChatAnalyticsLIZ != null) {
            String singleChatFromUserId2 = tp().getSingleChatFromUserId();
            if (z) {
                str = "click_view_profile_btn";
            } else {
                str = "click_profile_avatar";
            }
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, singleChatFromUserId2, "chat", str, String.valueOf(System.currentTimeMillis()));
        }
    }
}
