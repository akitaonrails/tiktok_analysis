package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups;

import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C09IC;
import X.C0H2J;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0ZP4;
import X.C1214260hhg;
import X.C1236480iHW;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1617806Vc;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1BNE;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C459400Hzu;
import X.C724750Sbp;
import X.EnumC1229960i70;
import X.EnumC459420Hzw;
import X.EnumC913760Zt0;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS106S0100000_6;
import Y.AsS33S0100000_6;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;
import com.ss.android.ugc.profile.business.ur.school.datasource.GroupSectionInfo;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.button.JoinGroupViewModel;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell.SchoolGroupLoadingCell;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell.SchoolGroupsItemCell;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell.SchoolGroupsTitleCell;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsListAssem extends UIListContentAssem<SchoolGroupsListViewModel> implements SchoolGroupsAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C2252321DDq LLJILJILJ;
    public C0ZP4 LLJILLL;
    public C0ZP4 LLJJ;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> LLJJI;
    public AsS33S0100000_6 LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolGroupsListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolgroups/SchoolGroupsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SchoolGroupsListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolGroupsListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2429), AFwS257S0000000_19.get$arr$(459), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2428));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2426));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2427));
        this.LLJILJIL = C1BNE.LIZ(Integer.valueOf(EnumC459420Hzw.INITIAL.getValue()));
        this.LLJILJILJ = C1BNE.LIZ(C459400Hzu.LIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1748301501) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final AnonymousClass0951 GY1() {
        return C09IC.LIZIZ(this.LLJILJILJ);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = SchoolGroupLoadingCell.class;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final SchoolGroupsListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (SchoolGroupsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final AnonymousClass0951 pC() {
        return C09IC.LIZIZ(this.LLJILJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final int O91() {
        Integer num;
        GroupSectionInfo groupSectionInfo = ((C1236480iHW) Jo().getState()).LLILZIL;
        if (groupSectionInfo == null || (num = groupSectionInfo.othersCnt) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final int ci2() {
        Integer num;
        GroupSectionInfo groupSectionInfo = ((C1236480iHW) Jo().getState()).LLILZIL;
        if (groupSectionInfo == null || (num = groupSectionInfo.myCnt) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        NextLiveData nextLiveData;
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        JoinGroupViewModel joinGroupViewModel = (JoinGroupViewModel) this.LLJIJIL.getValue();
        if (joinGroupViewModel != null && (nextLiveData = joinGroupViewModel.LLILLJJLI) != null) {
            nextLiveData.removeObservers(this);
        }
        C0ZP4 c0zp4 = this.LLJILLL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLJJ;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        AsS33S0100000_6 asS33S0100000_6 = this.LLJJIII;
        if (asS33S0100000_6 != null) {
            Go().removeOnScrollListener(asS33S0100000_6);
        }
        this.LLJJIII = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
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

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final boolean av2(String str) {
        SchoolGroupsListViewModel schoolGroupsListViewModelJo = Jo();
        if (str == null || str.length() == 0) {
            return false;
        }
        return schoolGroupsListViewModelJo.LLILZLL.add(str);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility
    public final void j2(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJJI = interfaceC1631620sYq;
        if (Go().getParent() != null) {
            HandlerHook.viewPost(Go(), new ARunnableS106S0100000_6(this, 128));
        }
    }

    @C14EU
    public final void onPublicGroupCreateFinish(C1617806Vc c1617806Vc) {
        C0Y8T c0y8t;
        String name;
        String icon;
        Long lValueOf;
        if (c1617806Vc.LIZ && Intrinsics.LJFF(c1617806Vc.LIZJ, EnumC913760Zt0.CAMPUS_GROUP.getValue()) && (c0y8t = c1617806Vc.LIZIZ) != null) {
            SchoolGroupsListViewModel schoolGroupsListViewModelJo = Jo();
            EnumC1229960i70 enumC1229960i70 = EnumC1229960i70.IN_GROUP;
            Long lValueOf2 = Long.valueOf(c0y8t.getConversationShortId());
            String conversationId = c0y8t.getConversationId();
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            String desc = null;
            if (coreInfo != null) {
                name = coreInfo.getName();
            } else {
                name = null;
            }
            C0Y8Y coreInfo2 = c0y8t.getCoreInfo();
            if (coreInfo2 != null) {
                icon = coreInfo2.getIcon();
            } else {
                icon = null;
            }
            Integer numValueOf = Integer.valueOf(c0y8t.getMemberCount());
            C0Y8Y coreInfo3 = c0y8t.getCoreInfo();
            if (coreInfo3 != null) {
                lValueOf = Long.valueOf(coreInfo3.getOwner());
            } else {
                lValueOf = null;
            }
            C0Y8Y coreInfo4 = c0y8t.getCoreInfo();
            if (coreInfo4 != null) {
                desc = coreInfo4.getDesc();
            }
            schoolGroupsListViewModelJo.withState(new AwS385S0200000_19(schoolGroupsListViewModelJo, new C1214260hhg(new CampusGroup(lValueOf2, conversationId, name, icon, null, numValueOf, lValueOf, desc, Integer.valueOf(enumC1229960i70.getValue()), null, null)), 64));
            schoolGroupsListViewModelJo.setState(new AwS33S0001000_19(1, 7));
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NextLiveData nextLiveData;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(SchoolGroupsItemCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(SchoolGroupsTitleCell.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H2J(this, null), 3);
        AsS33S0100000_6 asS33S0100000_6 = new AsS33S0100000_6(this, 3);
        Go().addOnScrollListener(asS33S0100000_6);
        this.LLJJIII = asS33S0100000_6;
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        JoinGroupViewModel joinGroupViewModel = (JoinGroupViewModel) this.LLJIJIL.getValue();
        if (joinGroupViewModel != null && (nextLiveData = joinGroupViewModel.LLILLJJLI) != null) {
            nextLiveData.observe(this, new AObserverS223S0100000_19(this, 49));
        }
    }
}
