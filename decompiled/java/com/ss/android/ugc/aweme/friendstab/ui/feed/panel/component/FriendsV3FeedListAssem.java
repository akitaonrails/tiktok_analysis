package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC1263540izA;
import X.AbstractC1263550izB;
import X.AbstractC1585810rMx;
import X.AbstractC1890380zIC;
import X.AbstractC1903730zdj;
import X.AbstractC21673619ry;
import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0CNO;
import X.C0SDE;
import X.C0W17;
import X.C1073940e3M;
import X.C1196320hEk;
import X.C1223430hwT;
import X.C1246900iYK;
import X.C1262040iwk;
import X.C1262300ixA;
import X.C1262310ixB;
import X.C1262320ixC;
import X.C1262590ixd;
import X.C1262780ixw;
import X.C1262790ixx;
import X.C1262970iyF;
import X.C1264180j0C;
import X.C1286410ja3;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C14NM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581370rFn;
import X.C1581380rFo;
import X.C1582180rH6;
import X.C1582190rH7;
import X.C1582240rHC;
import X.C1582270rHF;
import X.C1582370rHP;
import X.C1587740rQ4;
import X.C1588110rQf;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1723500ux2;
import X.C18035074n;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C260260AHw;
import X.C282400B5a;
import X.C296380BjY;
import X.C339450DSl;
import X.C452501pT;
import X.C614770O9j;
import X.C627260Oiy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1582410rHT;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS35S0101000_24;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedRequestConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3LoadPreviousReqConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecUserConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3ScrollSpeedConfig;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3LVBCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3RepostEntranceCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish.FriendsV3PublishCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser.FriendsV3BottomRecUserListCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser.FriendsV3HorizontalRecUserCardCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS36S2100000_9;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class FriendsV3FeedListAssem extends UIListContentAssem<FriendsV3FeedListViewModel> implements FriendsV3FeedListAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLIZLLLIL;
    public InterfaceC1588310rQz LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C630740Ooa LLJILLL;
    public final C630740Ooa LLJJ;
    public final C630740Ooa LLJJI;
    public final AssemVMLazy LLJJIII;
    public InterfaceC1588310rQz LLJJIJI;
    public InterfaceC1582750rI1 LLJJIJIIJIL;
    public AbstractC1263550izB LLJJIJIL;
    public C339450DSl LLJJJ;
    public C1582370rHP LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3FeedListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3FeedListAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FriendsV3FeedListAssem.class, "repostVM", "getRepostVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3RepostEntranceVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(FriendsV3FeedListAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public FriendsV3FeedListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 214), AFwS264S0000000_24.get$arr$(153), null, true);
        this.LLJI = -1;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 215), AFwS264S0000000_24.get$arr$(154), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FriendsV3RepostEntranceVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 216), AFwS264S0000000_24.get$arr$(155), null, true);
        this.LLJILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 517));
        this.LLJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 515));
        this.LLJJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 516));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 217), AFwS264S0000000_24.get$arr$(156), null, true);
        this.LLJJJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(177));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(178));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(175));
        this.LLJJL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(176));
        this.LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 514));
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Lo() {
        AbstractC1263550izB abstractC1263550izB;
        Fragment fragmentLJI;
        Object objLJ;
        if (((FriendsV3RecUserConfig) C1582270rHF.LIZIZ.getValue()).addBottomUserCard) {
            C19EG c19eg = null;
            int i = 1;
            if (this.LLJJIJIL == null && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                C1262310ixB c1262310ixB = new C1262310ixB(c19eg, fragmentLJI, i);
                c1262310ixB.LIZJ(AFwS252S0000000_16.get$arr$(409));
                c1262310ixB.LIZ(AFwS257S0000000_19.get$arr$(597));
                c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(598));
                IRelationUserCardInternalService.LIZ.getClass();
                IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
                C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
                if (c1262320ixC.LIZLLL == -1) {
                    int i2 = c1262310ixB.LJFF.LIZJ - 10;
                    if (i2 < 5) {
                        i2 = 5;
                    }
                    c1262320ixC.LIZLLL = i2;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263550izB.class);
                if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                    C1262590ixd c1262590ixd = c1262310ixB.LJFF;
                    if (c1262590ixd.LJIILJJIL == null) {
                        c1262590ixd.LJIILJJIL = Boolean.TRUE;
                    }
                }
                C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263550izB.class);
                if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
                } else {
                    if (!Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
                        "type is error!".toString();
                        throw new IllegalStateException("type is error!");
                    }
                    objLJ = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
                }
                if (objLJ == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
                }
                this.LLJJIJIL = (AbstractC1263550izB) objLJ;
            }
            AbstractC1263550izB abstractC1263550izB2 = this.LLJJIJIL;
            if (abstractC1263550izB2 != null) {
                if (!Go().getAllChunks().contains(abstractC1263550izB2)) {
                    Go().LIZJ(abstractC1263550izB2);
                }
                AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI = abstractC1263550izB2.LJIIJJI();
                if (abstractC329610Cw3LJIIJJI != null && (abstractC1263550izB = this.LLJJIJIL) != null) {
                    Go().LL.LLLIL(abstractC329610Cw3LJIIJJI, abstractC1263550izB, abstractC1263550izB.LLILZLL);
                }
                C1262970iyF c1262970iyF = (C1262970iyF) abstractC1263550izB2;
                c1262970iyF.LJI(null);
                c1262970iyF.LLFZ(false);
            }
            Class<?> clsLIZLLL = C1264180j0C.LIZIZ.LIZLLL();
            if (!(clsLIZLLL instanceof Class) || clsLIZLLL == null) {
                return;
            }
            int iLJIIJJI = Go().LJIIJJI(C1262040iwk.class, clsLIZLLL);
            C339450DSl c339450DSl = this.LLJJJ;
            if (c339450DSl != null) {
                c339450DSl.LL = C1697810uHb.LJIILJJIL(Integer.valueOf(iLJIIJJI));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void On() {
        C0CNO.LIZLLL(0L, new AwS568S0100000_24(this, 513));
    }

    public FriendsV3FeedListViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Vo, reason: merged with bridge method [inline-methods] */
    public FriendsV3FeedListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void GP1() {
        if (Oo().BQ2()) {
            IFriendsV3RefreshAbility iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(this, IFriendsV3RefreshAbility.class, null);
            if (iFriendsV3RefreshAbility != null) {
                iFriendsV3RefreshAbility.lv1(10, false, null, null, 0);
                return;
            }
            return;
        }
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        FriendsV3FeedRepository.LIZ.getClass();
        List<Aweme> listLIZIZ = FriendsV3FeedRepository.LIZIZ().LIZIZ();
        if (((ArrayList) listLIZIZ).isEmpty()) {
            return;
        }
        friendsV3FeedListViewModelOo.withState(new AwS387S0200000_21((List) listLIZIZ, (List<? extends Aweme>) friendsV3FeedListViewModelOo, (FriendsV3FeedListViewModel) 75));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final long Ha1() {
        return Jo().LLILZIL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        return Go().getDefaultConfig();
    }

    public void NO0() {
        C20603715jn currentConfig = Go().getCurrentConfig();
        if (currentConfig == null) {
            return;
        }
        final FriendsV3FeedListViewModel friendsV3FeedListViewModelJo = Jo();
        Go().setListConfig(currentConfig);
        Go().LJIIL((AbstractC329610Cw3) new C2217401BqU(friendsV3FeedListViewModelJo) { // from class: X.0mLh
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }

    public void No() {
        Bundle arguments;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String string = (fragmentLJI == null || (arguments = fragmentLJI.getArguments()) == null) ? null : arguments.getString("enter_method");
        if (!((Boolean) C260260AHw.LIZ.getValue()).booleanValue()) {
            dp(string);
            return;
        }
        if (!Intrinsics.LJFF(string, "publish_landing")) {
            dp(string);
            return;
        }
        C614770O9j.LIZIZ.LIZ().LJIIJ();
        long jLongValue = ((Number) C18035074n.LIZ.getValue()).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delayLoadSkylightDataAfterPublishLanding, delayMills: ");
        sbLIZ.append(jLongValue);
        C0W17.LIZJ("feedList", C2188811AlT.LIZIZ(sbLIZ));
        Oo().LLIZLLLIL = new C1581380rFo(jLongValue);
        dp(string);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void R12() {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        friendsV3FeedListViewModelOo.withState(new AwS588S0100000_9(friendsV3FeedListViewModelOo, 560));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final C1582240rHC Go() {
        return (C1582240rHC) LJJIJL().findViewById(R.id.hto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final boolean UQ() {
        C1223430hwT c1223430hwT = (C1223430hwT) Oo().getState();
        c1223430hwT.getClass();
        List listLIZ = C627260Oiy.LIZ(c1223430hwT);
        return listLIZ == null || listLIZ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void ap0() {
        Go().stopScroll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final Set<String> bb0() {
        List<String> list = ((C1223430hwT) Oo().getState()).LLIZ;
        return list != null ? C13LP.LLIIIZ(list) : new LinkedHashSet();
    }

    public void bp() {
        if (Go().getAllChunks().contains(this.LLJJIJIL)) {
            AbstractC1263550izB abstractC1263550izB = this.LLJJIJIL;
            if (abstractC1263550izB != null) {
                ((C1262970iyF) abstractC1263550izB).reset();
            }
            Go().LJIJJLI(this.LLJJIJIL);
            C339450DSl c339450DSl = this.LLJJJ;
            if (c339450DSl != null) {
                c339450DSl.LL = new ArrayList();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        if (((FriendsV3ScrollSpeedConfig) this.LLJJJJJIL.getValue()).enableScrollAwarePageCount) {
            Go().removeOnScrollListener((AbstractC1585810rMx) this.LLJL.getValue());
        }
        C1582370rHP c1582370rHP = this.LLJJJIL;
        if (c1582370rHP != null && Go().getTag(R.id.ims) == c1582370rHP) {
            Go().setTag(R.id.ims, null);
        }
        this.LLJJJIL = null;
        Oo().LLJILJIL = null;
        Oo().LLJILJILJ = null;
        C1582180rH6 c1582180rH6AQ2 = Oo().AQ2();
        if (c1582180rH6AQ2 != null) {
            c1582180rH6AQ2.LJII = null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3FeedListAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3FeedListAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void rD0() {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        friendsV3FeedListViewModelOo.withState(new AwS588S0100000_9(friendsV3FeedListViewModelOo, 559));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final boolean L50() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void J42(int i) {
        AbstractC21673619ry adapter = Go().getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i, "comments_update_payload");
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void Kn(String str) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        C0W17.LIZJ("listVM", "removeItemsByUid");
        friendsV3FeedListViewModelOo.withState(new AwS36S2100000_9("removeItemsByUid", friendsV3FeedListViewModelOo, str, 5));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void LLJ(int i) {
        HandlerHook.viewPost(Go(), new ARunnableS35S0101000_24(this, i, 1));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void LLZL(boolean z) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        friendsV3FeedListViewModelOo.setState(new AwS33S0010000_19(false, 24));
        if (z && Go().getScrollState() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollToTop stopScroll, needRefresh=");
            sbLIZ.append(z);
            C0W17.LIZJ("feedList", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJIJIL = true;
            Go().stopScroll();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scrollToTop, needRefresh=");
        sbLIZ2.append(z);
        C0W17.LIZJ("feedList", C2188811AlT.LIZIZ(sbLIZ2));
        cp(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void Nx1(String str) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        friendsV3FeedListViewModelOo.setState(new AwS70S1000000_19(str, 27));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void Nx2(String str) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        C0W17.LIZJ("listVM", "removeStoryItemsByUid");
        friendsV3FeedListViewModelOo.withState(new AwS123S1100000_9(friendsV3FeedListViewModelOo, str, 11));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void OD(AbstractC1585810rMx abstractC1585810rMx) {
        C1582190rH7 c1582190rH7 = (C1582190rH7) this.LLJL.getValue();
        if (!((CopyOnWriteArrayList) c1582190rH7.LL.getValue()).contains(abstractC1585810rMx)) {
            ((CopyOnWriteArrayList) c1582190rH7.LL.getValue()).add(abstractC1585810rMx);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void Py0(String str) {
        Oo().Py0(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void VJ0(boolean z) {
        int i;
        C1582240rHC c1582240rHCGo = Go();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = c1582240rHCGo.getVisibility();
        c1582240rHCGo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1582240rHCGo);
    }

    public void Zo(int i) {
        C1582180rH6 c1582180rH6AQ2;
        boolean z;
        AwS390S0200000_24 awS390S0200000_24;
        if (i == 0 && (c1582180rH6AQ2 = Oo().AQ2()) != null) {
            if (c1582180rH6AQ2.LJFF != 0) {
                z = true;
            } else {
                z = false;
            }
            c1582180rH6AQ2.LJFF = 0;
            c1582180rH6AQ2.LJI = 0.0f;
            c1582180rH6AQ2.LJIIIIZZ = 0L;
            c1582180rH6AQ2.LJIIIZ = 0L;
            if (z && (awS390S0200000_24 = c1582180rH6AQ2.LJII) != null) {
                awS390S0200000_24.invoke(0);
            }
        }
        if (this.LLJIJIL && i == 0) {
            cp(true);
        } else {
            if (i != 1 || !C1581370rFn.LIZ()) {
                return;
            }
            Go().setPreloadPrevCount(((FriendsV3LoadPreviousReqConfig) this.LLJJL.getValue()).loadPreviousPrefetchCount);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void a90(InterfaceC1588310rQz interfaceC1588310rQz) {
        int iY2;
        this.LLJ = interfaceC1588310rQz;
        if (interfaceC1588310rQz != null) {
            iY2 = interfaceC1588310rQz.y2();
        } else {
            iY2 = -1;
        }
        this.LLJI = iY2;
    }

    public final void cp(boolean z) {
        FriendsV3SkylightAbility friendsV3SkylightAbility;
        String str;
        this.LLJIJIL = false;
        FriendsV3SkylightAbility friendsV3SkylightAbility2 = (FriendsV3SkylightAbility) this.LLJILLL.getValue();
        if (friendsV3SkylightAbility2 != null && friendsV3SkylightAbility2.ZQ1()) {
            if (z) {
                str = "refresh_force";
            } else {
                str = "scroll_to_top";
            }
            FriendsV3SkylightAbility friendsV3SkylightAbility3 = (FriendsV3SkylightAbility) this.LLJILLL.getValue();
            if (friendsV3SkylightAbility3 != null) {
                friendsV3SkylightAbility3.PD0("auto", str, false);
                return;
            }
            return;
        }
        Go().setTag(R.id.imr, Boolean.TRUE);
        Go().scrollToPosition(0);
        if (!Oo().BQ2() && (friendsV3SkylightAbility = (FriendsV3SkylightAbility) this.LLJILLL.getValue()) != null) {
            friendsV3SkylightAbility.Rs1(true);
        }
        if (!z) {
            return;
        }
        if (((Boolean) C282400B5a.LIZ.getValue()).booleanValue()) {
            C1587740rQ4.LIZ.getClass();
            if (!C1587740rQ4.LJIJI) {
                IFriendsV3RefreshAbility iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(this, IFriendsV3RefreshAbility.class, null);
                if (iFriendsV3RefreshAbility == null) {
                    return;
                }
                iFriendsV3RefreshAbility.t12();
                return;
            }
        }
        HandlerHook.viewPost(Go(), new ARunnableS112S0100000_12(this, 189));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0.hasMoreUp, java.lang.Boolean.TRUE) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dp(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem.dp(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void f52(AbstractC1585810rMx abstractC1585810rMx) {
        ((CopyOnWriteArrayList) ((C1582190rH7) this.LLJL.getValue()).LL.getValue()).remove(abstractC1585810rMx);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final InterfaceC1588310rQz fL(String str) {
        Object c098200Yq;
        InterfaceC1588310rQz interfaceC1588310rQz;
        try {
            c098200Yq = Go();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        RecyclerView recyclerView = (RecyclerView) c098200Yq;
        if (recyclerView == null) {
            return null;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                if ((childViewHolder instanceof InterfaceC1588310rQz) && (interfaceC1588310rQz = (InterfaceC1588310rQz) childViewHolder) != null && Intrinsics.LJFF(C1588110rQf.LIZJ(interfaceC1588310rQz), str)) {
                    return interfaceC1588310rQz;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void k32(String str) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        C0W17.LIZJ("listVM", "removeNonStoryItemsByUid");
        friendsV3FeedListViewModelOo.withState(new AwS36S2100000_9("removeNonStoryItemsByUid", friendsV3FeedListViewModelOo, str, 6));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInnerAwemeChanged(C1246900iYK c1246900iYK) {
        if (c1246900iYK == null || !C296380BjY.LIZ()) {
            return;
        }
        withState(Oo(), new AwS138S1100000_24(c1246900iYK.LIZ, this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [X.0qtC] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(FriendsV3PublishCell.class, FriendsV3LVBCell.class, FriendsV3RepostEntranceCell.class, FriendsV3HorizontalRecUserCardCell.class, FriendsV3BottomRecUserListCell.class);
        for (Map.Entry<Integer, Class<? extends PowerCell<? extends C14NM>>> entry : C0SDE.LIZ.entrySet()) {
            Go().LJIJ(new C1723500ux2(entry.getKey().intValue(), entry.getValue()));
        }
        C1582240rHC c1582240rHCGo = Go();
        if (c1582240rHCGo != null) {
            c1582240rHCGo.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
        C1196320hEk.LIZIZ(Go(), C1558520qew.LJIIL(this));
        C339450DSl c339450DSl = new C339450DSl(view.getContext());
        this.LLJJJ = c339450DSl;
        Go().addItemDecoration(c339450DSl);
        Go().addOnScrollListener((AbstractC1585810rMx) this.LLJL.getValue());
        Go().setItemAnimator(null);
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue()) {
            final Context context = view.getContext();
            C1582370rHP c1582370rHP = new C1582370rHP(new InterfaceC1582410rHT() { // from class: X.0qtC
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1582410rHT
                public final int LIZ() {
                    C1223430hwT c1223430hwT = (C1223430hwT) this.LIZ.Oo().getState();
                    c1223430hwT.getClass();
                    List listLIZ = C627260Oiy.LIZ(c1223430hwT);
                    if (listLIZ != null) {
                        return listLIZ.size();
                    }
                    return -1;
                }

                @Override // X.InterfaceC1582410rHT
                public final int LIZIZ() {
                    int iFindLastVisibleItemPosition;
                    RecyclerView.LayoutManager layoutManager = this.LIZ.Go().getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null || (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) == -1) {
                        return -1;
                    }
                    return iFindLastVisibleItemPosition;
                }

                @Override // X.InterfaceC1582410rHT
                public final String LIZJ() {
                    Object c098200Yq;
                    try {
                        c098200Yq = C786410Ut5.b3(context);
                        if (c098200Yq == null) {
                            c098200Yq = "";
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
                }

                @Override // X.InterfaceC1582410rHT
                public final boolean LIZLLL() {
                    return this.LIZ.Oo().LLIZ;
                }

                @Override // X.InterfaceC1582410rHT
                public final long LJ() {
                    return this.LIZ.Oo().LLILZIL;
                }

                @Override // X.InterfaceC1582410rHT
                public final String LJFF() {
                    Object c098200Yq;
                    try {
                        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
                        c098200Yq = iNetworkStateService != null ? Integer.valueOf(iNetworkStateService.getEffectiveConnectionType()).toString() : null;
                        if (c098200Yq == null) {
                            c098200Yq = "";
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
                }

                @Override // X.InterfaceC1582410rHT
                public final String LJI() {
                    Object c098200Yq;
                    try {
                        c098200Yq = String.valueOf(C1479130oat.LJII());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = "";
                    }
                    return (String) c098200Yq;
                }
            });
            this.LLJJJIL = c1582370rHP;
            Go().setTag(R.id.ims, c1582370rHP);
            Oo().LLJILJIL = new AwS603S0100000_24(this, 457);
            Oo().LLJILJILJ = new AwS638S0100000_24(this, 132);
        }
        if (((FriendsV3ScrollSpeedConfig) this.LLJJJJJIL.getValue()).enableScrollAwareLoadMoreOffset) {
            FriendsV3FeedRequestConfig friendsV3FeedRequestConfig = (FriendsV3FeedRequestConfig) this.LLJJJJLIIL.getValue();
            C1582180rH6 c1582180rH6AQ2 = Oo().AQ2();
            if (c1582180rH6AQ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scrollAwareLoadMoreOffset mounted, baseline=");
                sbLIZ.append(friendsV3FeedRequestConfig.loadMorePrefetchOffset);
                sbLIZ.append(", fast=");
                sbLIZ.append(friendsV3FeedRequestConfig.loadMorePrefetchOffsetWhenFastScroll);
                sbLIZ.append(", fling=");
                sbLIZ.append(friendsV3FeedRequestConfig.loadMorePrefetchOffsetWhenFling);
                C2188811AlT.LIZIZ(sbLIZ);
                c1582180rH6AQ2.LJII = new AwS390S0200000_24(friendsV3FeedRequestConfig, this, 68);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0R8f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C690900R8e) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 109), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hwU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS310S0000000_24.get$arr$(64), 4);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hwV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 84), 4);
        AssemViewModel.asyncSubscribe$default(Oo(), new C2217381BqS() { // from class: X.0O1v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZLLL(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), null, AFwS213S0000000_24.get$arr$(469), new AwS603S0100000_24(this, 456), 8, null);
        AssemViewModel.asyncSubscribe$default(Oo(), new C2217381BqS() { // from class: X.0O1w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZJ(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(this, 459), 24, null);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0OEO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZ(c1223430hwT);
            }
        }, null, new AwS638S0100000_24(this, 135), 6);
        Oo().asyncSubscribe(new C2217381BqS() { // from class: X.0OhG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZIZ(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), new AwS603S0100000_24(this, 461), new AwS568S0100000_24(this, 1649), new AwS603S0100000_24(this, 453));
        No();
        if (C296380BjY.LIZ()) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (!eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJIJJ(this);
            }
            C736680Sv4.LJIIIIZZ(this, this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0rGx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0O2L) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 133), 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void yi0(Function0<Unit> function0) {
        Object c098200Yq;
        try {
            c098200Yq = Go();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        View view = (View) c098200Yq;
        if (view != null && view.getParent() != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(function0, (Function0<Unit>) 188));
        } else {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void Wa(String str, String str2) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModelOo = Oo();
        friendsV3FeedListViewModelOo.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeItemByUidAndAid,  aid=");
        sbLIZ.append(str);
        C0W17.LIZJ("listVM", C2188811AlT.LIZIZ(sbLIZ));
        if (str2.length() != 0 && str != null && str.length() != 0) {
            friendsV3FeedListViewModelOo.withState(new AwS36S2100000_9(str2, friendsV3FeedListViewModelOo, str, 4));
        }
    }

    public void ap(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int iAbs;
        int i3 = 0;
        if (i2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        C1582180rH6 c1582180rH6AQ2 = Oo().AQ2();
        if (c1582180rH6AQ2 != null) {
            float f = recyclerView.getResources().getDisplayMetrics().density;
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i4 = C1286410ja3.LIZ[c1582180rH6AQ2.LIZ.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    iAbs = Math.abs(i);
                } else {
                    throw new C1954807lC();
                }
            } else {
                iAbs = Math.abs(i2);
            }
            float f2 = 0.0f;
            if (f > 0.0f) {
                f2 = iAbs / f;
            }
            long j = c1582180rH6AQ2.LJIIIIZZ;
            if (j == 0) {
                c1582180rH6AQ2.LJIIIIZZ = jUptimeMillis;
                return;
            }
            long j2 = jUptimeMillis - j;
            if (j2 < 1) {
                j2 = 1;
            }
            c1582180rH6AQ2.LJIIIIZZ = jUptimeMillis;
            float f3 = (f2 * 1000.0f) / j2;
            if (f3 > 12000.0f) {
                f3 = 12000.0f;
            }
            float f4 = c1582180rH6AQ2.LJ;
            c1582180rH6AQ2.LJI = (f3 * f4) + ((1.0f - f4) * c1582180rH6AQ2.LJI);
            float f5 = c1582180rH6AQ2.LJI;
            if (f5 > 0.5f) {
                if (f5 > c1582180rH6AQ2.LIZJ) {
                    i3 = 30;
                } else if (f5 > c1582180rH6AQ2.LIZIZ) {
                    i3 = 20;
                } else {
                    i3 = 10;
                }
            }
            if (i3 > c1582180rH6AQ2.LJFF) {
                c1582180rH6AQ2.LJFF = i3;
                c1582180rH6AQ2.LJIIIZ = 0L;
                AwS390S0200000_24 awS390S0200000_24 = c1582180rH6AQ2.LJII;
                if (awS390S0200000_24 == null) {
                    return;
                }
                awS390S0200000_24.invoke(Integer.valueOf(i3));
                return;
            }
            if (i3 < c1582180rH6AQ2.LJFF) {
                long j3 = c1582180rH6AQ2.LJIIIZ;
                if (j3 == 0) {
                    c1582180rH6AQ2.LJIIIZ = jUptimeMillis;
                    return;
                }
                if (jUptimeMillis - j3 < c1582180rH6AQ2.LIZLLL) {
                    return;
                }
                c1582180rH6AQ2.LJFF = i3;
                c1582180rH6AQ2.LJIIIZ = 0L;
                AwS390S0200000_24 awS390S0200000_242 = c1582180rH6AQ2.LJII;
                if (awS390S0200000_242 == null) {
                    return;
                }
                awS390S0200000_242.invoke(Integer.valueOf(i3));
                return;
            }
            c1582180rH6AQ2.LJIIIZ = 0L;
        }
    }
}
