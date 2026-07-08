package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1637906bB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1935107i1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C330050Cwl;
import X.C343850Ddv;
import X.C452501pT;
import X.C627260Oiy;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class UserRecommendListAssem extends InvitableListAssem<UserRecommendListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public C1749280vcc LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final C01GW LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final String LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserRecommendListAssem.class, "addYoursInviteVM", "getAddYoursInviteVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UserRecommendListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/UserRecommendListViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public UserRecommendListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursInviteFriendsViewModel.class);
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 398), AFwS232S0000000_4.get$arr$(150), null, true);
        this.LLJILJIL = new C1559260qg8(new C723590SZx(this, C330050Cwl.class, "InviteHierarchyData"), checkSupervisorPrepared());
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 396));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UserRecommendListViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 399), AFwS232S0000000_4.get$arr$(151), null, true);
        this.LLJJ = "addyours_invite_rcmd";
        this.LLJJI = C1935107i1.LIZ(new AwS548S0100000_4(this, 395));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean So() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C1722300uv6 No() {
        return (C1722300uv6) this.LLJJI.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C1749280vcc Vo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.stb) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final UserRecommendListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (UserRecommendListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean Zo() {
        C343850Ddv c343850Ddv = (C343850Ddv) ip().getState();
        c343850Ddv.getClass();
        List listLIZ = C627260Oiy.LIZ(c343850Ddv);
        return listLIZ == null || listLIZ.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean ap() {
        C343850Ddv c343850Ddv = (C343850Ddv) ip().getState();
        c343850Ddv.getClass();
        return C627260Oiy.LIZLLL(c343850Ddv) instanceof C1623606Xi;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final String Oo() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ddr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C330070Cwn) obj2).LL;
            }
        }, null, new AwS618S0100000_4(this, 53), 6);
        List<UserInvitee> list = ((C330050Cwl) this.LLJILJIL.getValue()).LL;
        if (list != null) {
            UserRecommendListViewModel userRecommendListViewModelIp = ip();
            userRecommendListViewModelIp.withState(new AwS370S0200000_4(userRecommendListViewModelIp, list, 50));
            AddYoursInviteFriendsViewModel addYoursInviteFriendsViewModel = (AddYoursInviteFriendsViewModel) this.LLJIJIL.getValue();
            addYoursInviteFriendsViewModel.withState(new AwS370S0200000_4(addYoursInviteFriendsViewModel, (AddYoursInviteFriendsViewModel) list, (List<UserInvitee>) 48));
        }
        UserRecommendListViewModel userRecommendListViewModelIp2 = ip();
        Map<String, Object> map = ((C330050Cwl) this.LLJILJIL.getValue()).LLILLL;
        Long l = null;
        if (map != null) {
            obj = map.get("topic_id");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            l = (Long) obj;
        }
        userRecommendListViewModelIp2.LL = l;
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Ddt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                C343850Ddv c343850Ddv = (C343850Ddv) obj2;
                c343850Ddv.getClass();
                return C627260Oiy.LIZLLL(c343850Ddv);
            }
        }, null, new AwS583S0100000_4(this, 193), new AwS548S0100000_4(this, 397), new AwS583S0100000_4(this, 194), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Ddu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                C343850Ddv c343850Ddv = (C343850Ddv) obj2;
                c343850Ddv.getClass();
                return C627260Oiy.LIZ(c343850Ddv);
            }
        }, null, new AwS618S0100000_4(this, 54), 6);
    }
}
