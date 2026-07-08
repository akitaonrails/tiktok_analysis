package com.ss.android.ugc.profile.business.effect;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C0PEM;
import X.C0T3H;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10EU;
import X.C115H;
import X.C11DL;
import X.C11DN;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1253930ijf;
import X.C1254630ikn;
import X.C1390410mHn;
import X.C13LE;
import X.C13LP;
import X.C1634100scq;
import X.C1644460stY;
import X.C1656500tCy;
import X.C1656550tD3;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1750050vdr;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19773112Xx;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20533215Wg;
import X.C2107308Nj;
import X.C21689319uV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C23250099c;
import X.C306690C0l;
import X.C337180DJs;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C844470XAv;
import X.C861240XqU;
import X.C861270XqX;
import X.C861290XqZ;
import X.C861300Xqa;
import X.C861340Xqe;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1398040mU6;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1749320vcg;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC737090Svj;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import com.ss.android.ugc.aweme.effect.TTAppMGetUserPunishmentStatusResp;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.profile.business.effect.EffectProfileState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectProfileListFragment extends ProfileListFragment implements InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412>, InterfaceC737090Svj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9LSMqLCwnZgAqLyowPBU+Jik6JCAAIDwnDjctLiI2JjE=";
    public C21689319uV LLILZLL;
    public C1749280vcc LLIZ;
    public C1390410mHn LLIZLLLIL;
    public final AnonymousClass0412 LLJ = new AnonymousClass0412();
    public final lifecycleAwareLazy LLJI;
    public final C01GW LLJIJIL;
    public C1750050vdr LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C1656500tCy LLJJJJ;
    public final C861340Xqe LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    public EffectProfileListFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectProfileListViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 736);
        this.LLJI = new lifecycleAwareLazy(this, awS573S0100000_29, new AwS157S0400000_29(this, awS573S0100000_29, c19719912DlLIZ, AFwS317S0000000_29.get$arr$(9), 11));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 733));
        this.LLJJI = true;
        this.LLJJIJIL = -1;
        this.LLJJJIL = true;
        this.LLJJJJ = new C1656500tCy();
        this.LLJJJJJIL = new C861340Xqe();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2081));
        this.LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 734));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 735));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C1390410mHn BS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w2h) : null;
            this.LLIZLLLIL = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final EffectProfileListViewModel wS() {
        return (EffectProfileListViewModel) this.LLJI.getValue();
    }

    public final C21689319uV yS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txw) : null;
            this.LLILZLL = (C21689319uV) viewFindViewById;
        }
        return (C21689319uV) viewFindViewById;
    }

    public final C1749280vcc zS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLIZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return yS();
    }

    public final void Ng1() {
        if (isViewValid()) {
            C786410Ut5.LLLZLZ(zS(), 0);
            zS().setStatus((C1722300uv6) this.LLJJL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final int UR() {
        if (!isViewValid()) {
            return super.UR();
        }
        if (zS().getVisibility() == 0) {
            return C1254630ikn.LIZ(zS());
        }
        if (yS().getVisibility() != 0 || yS().getChildCount() <= 0) {
            return super.UR();
        }
        View childAt = yS().getChildAt(yS().getChildCount() - 1);
        return childAt == null ? super.UR() : C1254630ikn.LIZ(childAt);
    }

    @Override // X.InterfaceC737090Svj
    public final boolean W0() {
        EffectProfileListViewModel effectProfileListViewModel;
        if (!isViewValid()) {
            return false;
        }
        if (isViewValid()) {
            yS().scrollToPosition(0);
            wS().refresh();
        }
        C861340Xqe c861340Xqe = this.LLJJJJJIL;
        if (this.LLJILJILJ) {
            boolean z = c861340Xqe.LIZ != null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryRefreshList, hasFloatingNotice ");
            sbLIZ.append(z);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectUserLevelNoticeController", C2188811AlT.LIZIZ(sbLIZ));
            if (!z && (effectProfileListViewModel = c861340Xqe.LIZIZ) != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectProfileListViewModel), C0PEM.LIZJ, null, new C861290XqZ(effectProfileListViewModel, null), 2);
                return true;
            }
        } else {
            c861340Xqe.getClass();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        C1750050vdr c1750050vdr;
        return isViewValid() && (c1750050vdr = this.LLJILJIL) != null && c1750050vdr.getItemCount() == 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJJ = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EffectProfileListFragment.class.getName());
        }
        super.onResume();
        User userLIZ = C10EU.LIZ();
        if (this.LLJILJILJ && userLIZ.getIsFeatureVideoChanged().booleanValue()) {
            wS().refresh();
            userLIZ.setIsFeatureVideoChanged(Boolean.FALSE);
        } else if (this.LLJJJ && C1656550tD3.LIZ()) {
            wS().refresh();
        }
        this.LLJJJ = false;
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        if (!isViewValid()) {
            this.LL = true;
        } else if (!this.LLJJIII && !this.LLJJIJI && !this.LLJJIJIIJIL) {
            wS().refresh();
        } else {
            Ng1();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Wb(boolean z) {
        this.LLJJIII = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, X.InterfaceC1206550hVF
    public final void b(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        C21689319uV c21689319uVYS = yS();
        if (isViewValid() && c21689319uVYS.getChildCount() > 0) {
            if (z) {
                c21689319uVYS.smoothScrollToPosition(0);
            } else {
                c21689319uVYS.scrollToPosition(0);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        super.onConfigurationChanged(configuration);
        C21689319uV c21689319uVYS = yS();
        RecyclerView.LayoutManager layoutManager = null;
        if (c21689319uVYS != null) {
            layoutManager = c21689319uVYS.getLayoutManager();
        }
        if ((layoutManager instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(((Number) this.LLJJJJLIIL.getValue()).intValue());
            C21689319uV c21689319uVYS2 = yS();
            if (c21689319uVYS2 != null) {
                c21689319uVYS2.invalidateItemDecorations();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ro(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        C1750050vdr c1750050vdr;
        List<? extends T> list;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/effect/EffectProfileListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vsy8Lm+43j8IFQbyDMwsmyP0OlbKa+jWOwOTI0YKVQgg=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLJJJIL = z;
        if (z) {
            if (this.LLJILJILJ && isViewValid()) {
                yS().scrollToPosition(0);
                wS().refresh();
            }
            if (isViewValid() && (c1750050vdr = this.LLJILJIL) != null && (list = c1750050vdr.LLILLJJLI.LJFF) != 0) {
                RecyclerView.LayoutManager layoutManager = yS().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) <= (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                    while (true) {
                        if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < list.size()) {
                            Object obj2 = ListProtector.get(list, iFindFirstVisibleItemPosition);
                            if (obj2 instanceof NewFaceStickerBean) {
                                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) obj2;
                                if (newFaceStickerBean.isTopEffect) {
                                    C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                                    boolean z2 = this.LLJILJILJ;
                                    String str = newFaceStickerBean.effectId;
                                    c1253930ijf.getClass();
                                    C1253930ijf.LJIJ(str, z2);
                                }
                            }
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
            }
        }
        this.LLJJJJJIL.LIZ(z, this.LLJILJILJ);
        if (getActivity() != null) {
            C844470XAv.LIZ.getClass();
            if (!NetworkUtils.isNetworkAvailable(C844470XAv.LIZ()) && C306690C0l.LIZ()) {
                TTAppMGetUserPunishmentStatusResp tTAppMGetUserPunishmentStatusResp = (TTAppMGetUserPunishmentStatusResp) C13LP.LJJJLIIL(((LinkedHashMap) EffectCreationBanStatusViewModel.LLILZIL).values());
                if (tTAppMGetUserPunishmentStatusResp == null || tTAppMGetUserPunishmentStatusResp.userPunishmentStatus != 3) {
                    this.LLJJJJ.LIZ(this, z);
                }
            } else {
                ((C0T3H) this.LLJIJIL.getValue()).eP1(this, new AwS115S0110000_29(this, z, 4));
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(EffectProfileListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void nS(String str, String str2) {
        if (!TextUtils.equals(this.LLJILLL, str) && !TextUtils.equals(this.LLJJ, str2)) {
            this.LLJJI = true;
        }
        this.LLJILLL = str;
        this.LLJJ = str2;
        try {
            EffectProfileListViewModel effectProfileListViewModelWS = wS();
            boolean z = this.LLJILJILJ;
            String str3 = this.LLJILLL;
            Context context = getContext();
            effectProfileListViewModelWS.LLJILJILJ = z;
            effectProfileListViewModelWS.LLJILLL = str3;
            effectProfileListViewModelWS.LLJJ = context;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectProfileListViewModelWS), null, null, new C861270XqX(effectProfileListViewModelWS, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.112y] */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1750050vdr c1750050vdr;
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJILJILJ = arguments.getBoolean("is_me", false);
            this.LLJILLL = arguments.getString("user_id");
            this.LLJJ = arguments.getString("sec_user_id");
            EffectProfileListViewModel effectProfileListViewModelWS = wS();
            boolean z = this.LLJILJILJ;
            String str = this.LLJILLL;
            Context context = getContext();
            effectProfileListViewModelWS.LLJILJILJ = z;
            effectProfileListViewModelWS.LLJILLL = str;
            effectProfileListViewModelWS.LLJJ = context;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectProfileListViewModelWS), null, null, new C861270XqX(effectProfileListViewModelWS, null), 3);
            this.LLJJIJIL = arguments.getInt("bottom_bar_height", -1);
        }
        boolean zLJI = MethodIDManager.LJI(202108);
        ?? r2 = new InterfaceC1398040mU6() { // from class: X.112y
            @Override // X.InterfaceC1398040mU6
            public final boolean LIZ() {
                return this.LIZ.LLJJJIL;
            }
        };
        if (this.LLJJ != null) {
            c1750050vdr = new C1750050vdr(this, this.LLJILJILJ, r2);
        } else {
            c1750050vdr = null;
        }
        this.LLJILJIL = c1750050vdr;
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(((Number) this.LLJJJJLIIL.getValue()).intValue(), 1, getContext(), false);
        C1750050vdr c1750050vdr2 = this.LLJILJIL;
        if (c1750050vdr2 != null) {
            c1750050vdr2.setLoadMoreListener(new C115H(wS()));
            wrapGridLayoutManager.LLIZ = new C19773112Xx(this, c1750050vdr2, 1);
        }
        C21689319uV c21689319uVYS = yS();
        c21689319uVYS.setAdapter(this.LLJILJIL);
        c21689319uVYS.setLayoutManager(wrapGridLayoutManager);
        c21689319uVYS.addItemDecoration(new C0DXR() { // from class: X.0DWh
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                C21681919tJ c21681919tJ;
                GridLayoutManager gridLayoutManager;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                        if (c21681919tJ.LL % gridLayoutManager.LLILLJJLI != 0) {
                            if (C444960Hcc.LIZJ(view2.getContext())) {
                                rect.right = C341940Daq.LIZ(0.5d);
                            } else {
                                rect.left = C341940Daq.LIZ(0.5d);
                            }
                        } else if (C444960Hcc.LIZJ(view2.getContext())) {
                            rect.left = C341940Daq.LIZ(0.5d);
                        } else {
                            rect.right = C341940Daq.LIZ(0.5d);
                        }
                        rect.bottom = C341940Daq.LIZ(1.0d);
                    }
                }
            }
        });
        c21689319uVYS.setItemAnimator(null);
        int i = this.LLJJIJIL;
        if (i > 0) {
            c21689319uVYS.setPadding(0, 0, 0, i);
        }
        EffectProfileListViewModel effectProfileListViewModelWS2 = wS();
        C1750050vdr c1750050vdr3 = this.LLJILJIL;
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 612);
        final AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 88);
        final AwS643S0100000_29 awS643S0100000_292 = new AwS643S0100000_29(this, 89);
        C11DN<Object, InterfaceC960503pD> c11dn = new C11DN<Object, InterfaceC960503pD>(awS608S0100000_29, awS643S0100000_29, awS643S0100000_292) { // from class: X.112u
            public final Function1<InterfaceC960503pD, Unit> LIZ;
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
            public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZJ;

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C11DN
            public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = awS608S0100000_29;
                this.LIZIZ = awS643S0100000_29;
                this.LIZJ = awS643S0100000_292;
            }
        };
        final AwS608S0100000_29 awS608S0100000_292 = new AwS608S0100000_29(this, 613);
        final AwS643S0100000_29 awS643S0100000_293 = new AwS643S0100000_29(this, 90);
        final AwS643S0100000_29 awS643S0100000_294 = new AwS643S0100000_29(this, 91);
        ListViewModel.mR2(effectProfileListViewModelWS2, this, c1750050vdr3, c11dn, new C11DN<Object, InterfaceC960503pD>(awS608S0100000_292, awS643S0100000_293, awS643S0100000_294) { // from class: X.112v
            public final Function1<InterfaceC960503pD, Unit> LIZ;
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
            public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZJ;

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C11DN
            public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = awS608S0100000_292;
                this.LIZIZ = awS643S0100000_293;
                this.LIZJ = awS643S0100000_294;
            }
        }, 240);
        C11EA.LJII(this, wS(), new C2217381BqS() { // from class: X.1130
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EffectProfileState) obj).getSubstate();
            }
        }, new AwS643S0100000_29(this, 87));
        if (this.LL) {
            wS().refresh();
        }
        zS().LIZ(new InterfaceC1749320vcg() { // from class: X.112x
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                this.LIZ.BS().LIZLLL();
                C786410Ut5.LLLZZIL(this.LIZ.BS(), 8);
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                this.LIZ.BS().LIZJ();
                C786410Ut5.LLLZZIL(this.LIZ.BS(), 0);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C861240XqU(this, view, null), 2);
        C19EG activity = getActivity();
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.view_stub_float_notice)) != null) {
            C337180DJs.LIZJ(viewGroup);
            C861340Xqe c861340Xqe = this.LLJJJJJIL;
            boolean z2 = this.LLJILJILJ;
            Lifecycle lifecycle = getLifecycle();
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
            EffectProfileListViewModel effectProfileListViewModelWS3 = wS();
            if (!z2) {
                c861340Xqe.getClass();
            } else {
                c861340Xqe.LIZIZ = effectProfileListViewModelWS3;
                C23250099c.LIZLLL(lifecycleScope2, null, null, new C861300Xqa(effectProfileListViewModelWS3, lifecycle, viewGroup, c861340Xqe, null), 3);
            }
        }
        if (this.LLJJJIL) {
            this.LLJJJJJIL.LIZ(true, this.LLJILJILJ);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ech, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
