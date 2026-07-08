package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C09IC;
import X.C0H2K;
import X.C0ZP4;
import X.C1261170ivL;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1BNE;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C339440DSk;
import X.C346160Dhe;
import X.C452501pT;
import X.C459400Hzu;
import X.C724750Sbp;
import X.C888460YtI;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS106S0100000_6;
import Y.AsS33S0100000_6;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS118S1100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes7.dex */
public final class SchoolUsersListAssem extends UIListContentAssem<SchoolUsersListViewModel> implements SchoolUsersAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C2252321DDq LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public C0ZP4 LLJILJILJ;
    public C0ZP4 LLJILLL;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> LLJJ;
    public AsS33S0100000_6 LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolUsersListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolusers/SchoolUsersListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SchoolUsersListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolUsersListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 892), AFwS236S0000000_6.get$arr$(378), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 891));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 890));
        this.LLJIJIL = C1BNE.LIZ(-1);
        this.LLJILJIL = C1BNE.LIZ(C459400Hzu.LIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -235170859) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = SchoolUserLoadingCell.class;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final SchoolUsersListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SchoolUsersListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final AnonymousClass0951 Ls0() {
        return C09IC.LIZIZ(this.LLJILJIL);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final AnonymousClass0951 US0() {
        return C09IC.LIZIZ(this.LLJIJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final Pair<Integer, Integer> Yo2() {
        return ((C346160Dhe) Jo().getState()).LLILLL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C0ZP4 c0zp4 = this.LLJILJILJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLJILLL;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        AsS33S0100000_6 asS33S0100000_6 = this.LLJJI;
        if (asS33S0100000_6 != null) {
            Go().removeOnScrollListener(asS33S0100000_6);
        }
        this.LLJJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final boolean vm0() {
        return ((C346160Dhe) Jo().getState()).LL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final void LLZL(boolean z) {
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        } else {
            if (layoutManager == null) {
                return;
            }
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility
    public final void j2(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJJ = interfaceC1631620sYq;
        if (Go().getParent() != null) {
            HandlerHook.viewPost(Go(), new ARunnableS106S0100000_6(this, 130));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        if (user != null && (uid = user.getUid()) != null) {
            SchoolUsersListViewModel schoolUsersListViewModelJo = Jo();
            schoolUsersListViewModelJo.withState(new AwS118S1100000_4(uid, schoolUsersListViewModelJo, 5));
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(SchoolUserItemCell.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H2K(this, null), 3);
        AsS33S0100000_6 asS33S0100000_6 = new AsS33S0100000_6(this, 8);
        Go().addOnScrollListener(asS33S0100000_6);
        this.LLJJI = asS33S0100000_6;
        C1261170ivL.LIZ.getClass();
        if (C1261170ivL.LIZ()) {
            Go().addItemDecoration(new C339440DSk());
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }
}
