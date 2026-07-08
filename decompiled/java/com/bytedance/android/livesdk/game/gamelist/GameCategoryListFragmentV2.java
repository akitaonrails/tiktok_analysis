package com.bytedance.android.livesdk.game.gamelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0IJT;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19MX;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C773650UWl;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1813060xHU;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.gamelist.GameCategoryListFragmentV2;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS54S1000000_3;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class GameCategoryListFragmentV2 extends BaseGameCategoryListFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGE0HELIOSKSgpJSYgPGsLKCI2CyQ4LCg8OjwAIDwnDjctLiI2JjEaew==";
    public ViewOnClickListenerC1836610xtT LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(135));
    public LiveMode LLILZ;
    public boolean LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameCategoryListFragmentV2.class, "listViewModel", "getListViewModel()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GameCategoryListFragmentV2.class, "searchViewModel", "getSearchViewModel()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicSearchViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public GameCategoryListFragmentV2() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameTopicListViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 293);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(26);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 160), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS571S0100000_27((Fragment) this, 161), aFwS269S0000000_27, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 162), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GameTopicSearchViewModel.class);
        AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(c19719912DlLIZ2, 294);
        AFwS269S0000000_27 aFwS269S0000000_272 = AFwS269S0000000_27.get$arr$(27);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS556S0100000_122, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 163), aFwS269S0000000_272, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS556S0100000_122, new AwS571S0100000_27((Fragment) this, 164), aFwS269S0000000_272, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS556S0100000_122, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 159), aFwS269S0000000_272, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZ = assemVMLazy2;
    }

    public final GameTopicListViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (GameTopicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), DataChannelAbility.class, null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_topic_two_show");
        c474500IjALIZ.LJJII(this.LLILLL.getValue(), "anchor_id");
        LiveMode liveMode = this.LLILZ;
        c474500IjALIZ.LJJII(liveMode != null ? liveMode.logStreamingType : null, "live_type");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String idStr;
        HashtagResponse hashtagResponse;
        Room room;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        List<PartnershipGameEvent> list = null;
        if (dataChannelLJ != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(this, null), new DataChannelAbilityImply(dataChannelLJ), DataChannelAbility.class, null, null);
        }
        NR().LLJILJIL = this.LL;
        GameTopicListViewModel gameTopicListViewModelNR = NR();
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 == null || (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) == null || (idStr = room.getIdStr()) == null) {
            idStr = "null";
        }
        gameTopicListViewModelNR.LLILZ = idStr;
        GameTopicListViewModel gameTopicListViewModelNR2 = NR();
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null) {
            hashtagResponse = (HashtagResponse) dataChannelLJ3.gg0(HashTagResp.class);
        } else {
            hashtagResponse = null;
        }
        gameTopicListViewModelNR2.LLJILLL = hashtagResponse;
        NR().LLILLJJLI = this.LLILZIL;
        LiveMode liveMode = this.LLILZ;
        if (liveMode != null) {
            NR().LLILLL = liveMode;
            if (liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.THIRD_PARTY) {
                GameTopicListViewModel gameTopicListViewModelNR3 = NR();
                DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
                if (dataChannelLJ4 != null) {
                    list = (List) dataChannelLJ4.gg0(C773650UWl.class);
                }
                gameTopicListViewModelNR3.LLILZIL = list;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager fragmentManager;
        List<Fragment> listLJJLIIIJL;
        super.onViewCreated(view, bundle);
        C19MX c19mx = (C19MX) view.findViewById(R.id.bt1);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.jcz, R.id.jcx});
        }
        C19MX c19mx2 = (C19MX) view.findViewById(R.id.bte);
        if (c19mx2 != null) {
            c19mx2.setReferencedIds(new int[]{R.id.nhd, R.id.nd_});
        }
        View viewFindViewById = view.findViewById(R.id.l_a);
        if (viewFindViewById != null && (fragmentManager = getFragmentManager()) != null && (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) != null && Integer.valueOf(listLJJLIIIJL.size()).intValue() > 1) {
            C12ES.LJIILL(0, viewFindViewById);
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 205), viewFindViewById);
        }
        AssemViewModel.selectSubscribe$default(NR(), new C2217381BqS() { // from class: X.0xS6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1819630xS5) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS591S0100000_12(new AwS591S0100000_12(this, 566), 1154), 12, null);
        View viewFindViewById2 = null;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 49), 3);
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.iq5);
            }
            this.LLILLJJLI = (ViewOnClickListenerC1836610xtT) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view2;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0xS2
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    AssemVMLazy assemVMLazy = this.LIZ.LLIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GameCategoryListFragmentV2.LLIZLLLIL;
                    assemVMLazy.getValue().setState(new AwS54S1000000_3("", 1));
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        assemVMLazy.getValue().setState(new AwS54S1000000_3("", 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi1, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
