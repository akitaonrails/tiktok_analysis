package com.ss.android.ugc.profile.business.profile.tab;

import X.AbstractC1255880imo;
import X.AbstractC848400XPy;
import X.C036E;
import X.C038S;
import X.C05A5;
import X.C098200Yq;
import X.C0O0W;
import X.C0PEM;
import X.C0VWN;
import X.C0WST;
import X.C0WSU;
import X.C0WYJ;
import X.C0WZW;
import X.C0WZX;
import X.C0XIR;
import X.C0XQ7;
import X.C10EU;
import X.C1253150iiP;
import X.C1253180iiS;
import X.C1253720ijK;
import X.C1255780ime;
import X.C1255920ims;
import X.C1256130inD;
import X.C1258270iqf;
import X.C1258650irH;
import X.C1258700irM;
import X.C1258710irN;
import X.C1258750irR;
import X.C1258810irX;
import X.C1259020irs;
import X.C1259160is6;
import X.C1259360isQ;
import X.C1259950itN;
import X.C1260030itV;
import X.C1260280itu;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C16FB;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C1EDI;
import X.C1ELC;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2296808zG;
import X.C23112093u;
import X.C23250099c;
import X.C299890BpD;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1258260iqe;
import X.InterfaceC1258470iqz;
import X.InterfaceC1259140is4;
import X.InterfaceC1602960roc;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.tab.appdiff.IAwmeListFragmentAppDiff;
import com.ss.android.ugc.profile.business.profile.ui.v2.MineProfileAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS47S0010000_35;

/* JADX INFO: loaded from: classes20.dex */
public class MTAwemeListFragment extends AwemeListFragmentImpl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9ODcjLyY/LWs4KC19BRENPio+LQklOjsVOiQrJCo9PA==";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1258750irR f436J;
    public C16FB K;
    public C038S L;
    public C1258710irN M;
    public C1258650irH N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Deque<C1259160is6> f437O = new ArrayDeque();
    public volatile boolean P = false;
    public volatile int Q = 0;
    public final Object R = new Object();
    public final BPEAHandler S = new BPEAHandler(new Handler.Callback() { // from class: X.0irL
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            MTAwemeListFragment mTAwemeListFragment = this.LL;
            mTAwemeListFragment.getClass();
            if (message.what == 1388723342) {
                mTAwemeListFragment.vT(4, message.arg1, (String) HandlerHook.getMessageObj(message.obj));
            }
            if (message.what == 830294584) {
                C1259160is6 c1259160is6 = (C1259160is6) HandlerHook.getMessageObj(message.obj);
                if (c1259160is6 != null) {
                    int i = c1259160is6.LIZ;
                    String str = c1259160is6.LIZIZ;
                    int i2 = c1259160is6.LIZJ;
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("executeLoadAwemeTask: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" source=");
                    sbLIZ.append(str);
                    sbLIZ.append(" count=");
                    sbLIZ.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (i == 1388723342) {
                        mTAwemeListFragment.vT(4, i2, str);
                        return true;
                    }
                    if (i == -358032022) {
                        mTAwemeListFragment.vT(2, i2, str);
                        return true;
                    }
                    if (i != -1358263788) {
                        return true;
                    }
                    mTAwemeListFragment.GU();
                    return true;
                }
                return true;
            }
            return false;
        }
    });
    public UserAwemePagerAbility T;
    public C1258700irM U;

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final int YS() {
        return R.layout.ecu;
    }

    public final void GU() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("MTAwemeListFragment", "loadTargetAweme start");
        if (C299890BpD.LIZ()) {
            if (this.LLJJJJJIL == null) {
                SY();
                InterfaceC1258260iqe interfaceC1258260iqe = this.LLLII;
                if (interfaceC1258260iqe != null) {
                    interfaceC1258260iqe.LIZJ();
                }
                C1720106oR.LJI("MTAwemeListFragment", "loadTargetAweme mAwemePresenter");
                return;
            }
            if (this.LLLLLZL.FQ2().isRefreshing()) {
                C1720106oR.LIZ("MTAwemeListFragment", "loadTargetAweme. page is refreshing, return");
                C1720106oR.LJI("MTAwemeListFragment", "page is refreshing, return");
                SY();
                InterfaceC1258260iqe interfaceC1258260iqe2 = this.LLLII;
                if (interfaceC1258260iqe2 != null) {
                    interfaceC1258260iqe2.LIZJ();
                    return;
                }
                return;
            }
            ProfileViewModel profileViewModel = this.LLLLLZL;
            profileViewModel.getClass();
            profileViewModel.setState(new AwS47S0010000_35(true, 27));
        }
        C0O0W.LIZJ = System.currentTimeMillis();
        boolean zLIZJ = this.LLJJJJJIL.LIZJ(6, Boolean.FALSE, this.LLIZ, Integer.valueOf(this.LLJIJIL), 2000, this.LLJ, this.LLLLLLJ, "load_more_to_target");
        if (!C299890BpD.LIZ() || zLIZJ) {
            return;
        }
        C1720106oR.LIZ("MTAwemeListFragment", "loadTargetAweme sendRequest failed");
        SY();
        ProfileViewModel profileViewModel2 = this.LLLLLZL;
        profileViewModel2.getClass();
        profileViewModel2.setState(new AwS47S0010000_35(false, 27));
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.C0P6P
    public final void LJJIFFI() {
        C1258710irN c1258710irN = this.M;
        if (c1258710irN == null) {
            c5("load_more_bind_footer");
            return;
        }
        WrapGridLayoutManager wrapGridLayoutManager = this.LLJJJJ;
        InterfaceC1259140is4 interfaceC1259140is4 = new InterfaceC1259140is4() { // from class: X.0irm
            @Override // X.InterfaceC1259140is4
            public final boolean LIZIZ() {
                return this.LIZ.C;
            }

            @Override // X.InterfaceC1259140is4
            public final void LIZ(int i, String str) {
                this.LIZ.iT(1388723342, i, str);
            }
        };
        c1258710irN.getClass();
        if (wrapGridLayoutManager != null) {
            int iFindLastVisibleItemPosition = wrapGridLayoutManager.findLastVisibleItemPosition();
            int itemCount = wrapGridLayoutManager.getItemCount();
            View childAt = wrapGridLayoutManager.getChildAt(0);
            c1258710irN.LIZ(iFindLastVisibleItemPosition, itemCount, childAt != null ? childAt.getHeight() : 0, wrapGridLayoutManager.LLILLJJLI, "load_more_bind_footer", interfaceC1259140is4, -1);
        }
    }

    public final void MU() {
        C1749280vcc c1749280vcc = this.LLJJJJLIIL;
        if (c1749280vcc != null) {
            c1749280vcc.setTopMargin(this.LLJJL);
            C786410Ut5.LLLZLZ(this.LLJJJJLIIL, 0);
        }
        if (this.LLLLIIL != null) {
            C786410Ut5.LJLLLLLL(4, VS());
        }
        this.LLLJ = 2;
        this.LLJJJJLIIL.setTopMargin(this.LLJJL);
        C786410Ut5.LLLZLZ(this.LLJJJJLIIL, 0);
        this.LLJJJJLIIL.setStatus(this.LLLILZJ);
        InterfaceC1258470iqz interfaceC1258470iqz = this.LLJL;
        if (interfaceC1258470iqz != null) {
            interfaceC1258470iqz.LIZJ(this.LLJIJIL, this.LLJILLL);
        }
        if (this.LLJIJIL == 0) {
            C1253150iiP.LIZJ(true, false);
        }
        vU();
    }

    public final void NU() {
        C19EG activity;
        Fragment parentFragment;
        UserProfileAbility userProfileAbility;
        C1260280itu c1260280ituZp;
        View childAt;
        C19EG activity2;
        if (this.LLJJJJ == null || this.LLJJIJI == null || this.LLLIIL == -1) {
            return;
        }
        if (C299890BpD.LIZ()) {
            if (this.LLLLLZL.FQ2().isRefreshing()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ("MTAwemeListFragment", "scrollToTargetAweme. page is refreshing, return");
                InterfaceC1258260iqe interfaceC1258260iqe = this.LLLII;
                if (interfaceC1258260iqe != null) {
                    interfaceC1258260iqe.LIZJ();
                    return;
                }
                return;
            }
            if (this.LLJJIJI.isComputingLayout()) {
                HandlerHook.viewPost(this.LLJJIJI, new ARunnableS119S0100000_19(this, 200));
                return;
            }
            VT(true);
            int iET = eT();
            int itemCount = this.LLJJJJ.getItemCount();
            int i2 = this.LLLIIL;
            int i3 = i2 / iET;
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollToTargetAweme. targetPos:");
            sbLIZ.append(i2);
            sbLIZ.append(", targetRow:");
            sbLIZ.append(i3);
            sbLIZ.append(", rowsAfter:");
            sbLIZ.append((((itemCount + iET) - 1) / iET) - (i3 + 1));
            C2188811AlT.LIZIZ(sbLIZ);
            if ((!C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() || (activity2 = getActivity()) == null || activity2.getResources().getConfiguration().orientation != 2) && (parentFragment = getParentFragment()) != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(parentFragment, null), UserProfileAbility.class, null)) != null && userProfileAbility.Zp() != null && (c1260280ituZp = userProfileAbility.Zp()) != null) {
                if (i3 != 0) {
                    if (!c1260280ituZp.LIZLLL()) {
                        c1260280ituZp.scrollTo(0, c1260280ituZp.getMaxY());
                    }
                } else if (c1260280ituZp.LIZLLL() && c1260280ituZp.LLJLIL != 0) {
                    c1260280ituZp.scrollTo(0, 0);
                }
            }
            int height = this.LLJJIJI.getHeight();
            RecyclerView recyclerView = this.LLJJIJI;
            int height2 = (recyclerView == null || recyclerView.getChildCount() <= 0 || (childAt = this.LLJJIJI.getChildAt(this.LLJJJ.LLLJL())) == null || childAt.getHeight() <= 0) ? 0 : childAt.getHeight();
            int iFindFirstVisibleItemPosition = this.LLJJJJ.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == 0 && this.LLJJJ.LLLJL() != 0) {
                iFindFirstVisibleItemPosition = this.LLJJJ.LLLJL() + 1;
            }
            View viewFindViewByPosition = this.LLJJJJ.findViewByPosition(iFindFirstVisibleItemPosition);
            this.LLJJIJI.smoothScrollBy(0, ((viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0) + ((i3 - (iFindFirstVisibleItemPosition / iET)) * height2)) - ((height / 2) - (height2 / 2)));
            HandlerHook.viewPost(this.LLJJIJI, new ARunnableS119S0100000_19(this, 201));
            return;
        }
        int iFindFirstVisibleItemPosition2 = this.LLJJJJ.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.LLJJJJ.findLastVisibleItemPosition();
        Rect rect = new Rect();
        while (iFindLastVisibleItemPosition >= 0) {
            View viewFindViewByPosition2 = this.LLJJJJ.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition2 == null || viewFindViewByPosition2.getGlobalVisibleRect(rect)) {
                break;
            } else {
                iFindLastVisibleItemPosition--;
            }
        }
        int i5 = this.LLLIIL;
        if (i5 < iFindFirstVisibleItemPosition2) {
            View viewFindViewByPosition3 = this.LLJJJJ.findViewByPosition(iFindFirstVisibleItemPosition2);
            int top = this.LLJJJJ.findViewByPosition(eT() + iFindFirstVisibleItemPosition2).getTop() - viewFindViewByPosition3.getBottom();
            Rect rect2 = new Rect();
            viewFindViewByPosition3.getGlobalVisibleRect(rect2);
            int iET2 = ((iFindFirstVisibleItemPosition2 / eT()) - (this.LLLIIL / eT())) + 1;
            int height3 = (viewFindViewByPosition3.getHeight() - rect2.height()) + (viewFindViewByPosition3.getHeight() * iET2) + ((iET2 + 1) * top);
            VT(true);
            this.LLJJIJI.smoothScrollBy(0, -height3);
        } else if (i5 > iFindLastVisibleItemPosition) {
            View viewFindViewByPosition4 = this.LLJJJJ.findViewByPosition(iFindFirstVisibleItemPosition2);
            while (viewFindViewByPosition4 != null && iFindFirstVisibleItemPosition2 < this.LLLIIL && iFindFirstVisibleItemPosition2 <= 150 && !(viewFindViewByPosition4 instanceof FixedRatioFrameLayout)) {
                iFindFirstVisibleItemPosition2++;
                viewFindViewByPosition4 = this.LLJJJJ.findViewByPosition(iFindFirstVisibleItemPosition2);
            }
            View viewFindViewByPosition5 = this.LLJJJJ.findViewByPosition(iFindFirstVisibleItemPosition2);
            View viewFindViewByPosition6 = this.LLJJJJ.findViewByPosition(eT() + iFindFirstVisibleItemPosition2);
            if (viewFindViewByPosition5 == null || viewFindViewByPosition6 == null) {
                return;
            }
            int top2 = viewFindViewByPosition6.getTop() - viewFindViewByPosition5.getBottom();
            Rect rect3 = new Rect();
            viewFindViewByPosition5.getGlobalVisibleRect(rect3);
            int top3 = viewFindViewByPosition5.getTop() > 0 ? viewFindViewByPosition5.getTop() : 0;
            int iET3 = ((this.LLLIIL / eT()) - (iFindFirstVisibleItemPosition2 / eT())) - 2;
            int iHeight = rect3.height() + (viewFindViewByPosition5.getHeight() * iET3) + ((iET3 + 1) * top2) + top3;
            if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() || (activity = getActivity()) == null || activity.getResources().getConfiguration().orientation != 2) {
                this.LLLIIII.LJJJJLI();
            }
            VT(true);
            this.LLJJIJI.smoothScrollBy(0, iHeight);
        }
        InterfaceC1258260iqe interfaceC1258260iqe2 = this.LLLII;
        if (interfaceC1258260iqe2 != null) {
            interfaceC1258260iqe2.LIZJ();
        }
    }

    public final void PU() {
        C1259160is6 c1259160is6;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryExecuteLoadTask. isTaskRunning:");
        sbLIZ.append(this.P);
        sbLIZ.append(" taskQueue.isEmpty:");
        sbLIZ.append(((ArrayDeque) this.f437O).isEmpty());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.P || ((ArrayDeque) this.f437O).isEmpty() || (c1259160is6 = (C1259160is6) ((ArrayDeque) this.f437O).pollFirst()) == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tryExecuteLoadTask. source:");
        sbLIZ2.append(c1259160is6.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.P = true;
        this.Q = c1259160is6.LIZ;
        this.S.obtainMessage(830294584, c1259160is6).sendToTarget();
    }

    public final void RU() {
        String str;
        WrapGridLayoutManager wrapGridLayoutManager;
        int i;
        int i2;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateJustWatchedButton. mIsMyProfile:");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", mType:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", mIsVisibleToUser:");
        sbLIZ.append(this.LLLIIIL);
        sbLIZ.append(", lastFeedAwemeId:");
        sbLIZ.append(this.LLLIIIIL);
        sbLIZ.append(", mFeedsAwemeId:");
        sbLIZ.append(this.LLLLLLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJILLL || this.LLJIJIL != 0 || !this.LLLIIIL || (str = this.LLLIIIIL) == null || !str.equals(this.LLLLLLJ) || (wrapGridLayoutManager = this.LLJJJJ) == null || wrapGridLayoutManager.getChildCount() <= 0) {
            return;
        }
        int i4 = this.LLLIIL;
        View viewFindViewByPosition = i4 != -1 ? this.LLJJJJ.findViewByPosition(i4 + this.LLJJJ.LLLJL()) : null;
        final boolean z = false;
        if (!C299890BpD.LIZ()) {
            if (this.LLLIL) {
                if (viewFindViewByPosition != null) {
                    Context context = getContext();
                    if (context == null) {
                        C1720106oR.LIZ("MTAwemeListFragment", "updateJustWatchedButton. context is null");
                        return;
                    }
                    if (viewFindViewByPosition.getVisibility() == 0 && !C0O0W.LIZ) {
                        Rect rect = new Rect();
                        if (viewFindViewByPosition.getGlobalVisibleRect(rect)) {
                            final boolean z2 = this.LLLIILIL && viewFindViewByPosition.getHeight() == rect.height();
                            final Aweme aweme = this.LLLLLILLIL;
                            final int i5 = this.LLLIIL + 1;
                            final boolean z3 = this.LLLIILIL;
                            if (!C0O0W.LIZ) {
                                C0O0W.LIZ = true;
                                C20684815ws.LJFF().execute(new Runnable() { // from class: X.05yt
                                    public final void LIZ() {
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                                        Aweme aweme2 = aweme;
                                        c2344009Gk.LJIIIIZZ("request_id", aweme2 != null ? aweme2.getRequestId() : null);
                                        Aweme aweme3 = aweme;
                                        c2344009Gk.LJIIIIZZ("group_id", aweme3 != null ? aweme3.getAid() : null);
                                        Aweme aweme4 = aweme;
                                        c2344009Gk.LJIIIIZZ("author_id", aweme4 != null ? AwemeExtKt.getAuthorUid(aweme4) : null);
                                        c2344009Gk.LIZJ(i5, "order");
                                        c2344009Gk.LJ(Boolean.valueOf(z3), "is_first_screen");
                                        c2344009Gk.LJ(Boolean.valueOf(z2), "is_first_screen_full_show");
                                        C20684815ws.LJIILLIIL("just_watched_video_show", c2344009Gk.LIZ);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("JustWatchTracker@f11e.reportJWVideoShow$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("JustWatchTracker@f11e.reportJWVideoShow$1");
                                    }
                                });
                            }
                        }
                    }
                    if (!this.LLLIL) {
                        return;
                    }
                    Rect rect2 = new Rect();
                    this.LLJJIJI.getGlobalVisibleRect(rect2);
                    int i6 = C0WYJ.LJIILL(context).LIZIZ;
                    int[] iArr = new int[2];
                    viewFindViewByPosition.getLocationOnScreen(iArr);
                    if (viewFindViewByPosition.getVisibility() == 0 && (i = iArr[0] - rect2.left) >= 0 && i <= i6 && (i2 = iArr[1]) >= rect2.top && i2 <= rect2.bottom) {
                        this.LLLILZ = true;
                        this.LLLII.LIZJ();
                        return;
                    }
                }
                this.LLLILZ = false;
                if (this.LLLIL) {
                    int iFindFirstVisibleItemPosition = this.LLJJJJ.findFirstVisibleItemPosition();
                    InterfaceC1258260iqe interfaceC1258260iqe = this.LLLII;
                    int i7 = this.LLLIIL;
                    interfaceC1258260iqe.LIZ(i7 != -1 && i7 < iFindFirstVisibleItemPosition);
                    return;
                }
                return;
            }
            return;
        }
        if (this.T == null) {
            this.T = (UserAwemePagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getParentFragment(), null), UserAwemePagerAbility.class, null);
        }
        UserAwemePagerAbility userAwemePagerAbility = this.T;
        if (userAwemePagerAbility == null) {
            C1720106oR.LIZ("MTAwemeListFragment", "updateJustWatchedButton. mAwemePagerAbility is null");
            return;
        }
        if (userAwemePagerAbility.XN0()) {
            int iFindFirstCompletelyVisibleItemPosition = this.LLJJJJ.findFirstCompletelyVisibleItemPosition();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("realUpdateJustWatchedButton. justWatchedAwemeView is null:");
            sbLIZ2.append(viewFindViewByPosition == null);
            sbLIZ2.append(", postVideoHasLocateItem:");
            sbLIZ2.append(this.LLLIL);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1256130inD.LIZ.getClass();
            if (C1256130inD.LIZ() == 1) {
                this.LLLII.LIZJ();
                return;
            }
            if (viewFindViewByPosition == null) {
                this.LLLILZ = false;
                if (this.LLLIL) {
                    InterfaceC1258260iqe interfaceC1258260iqe2 = this.LLLII;
                    int i8 = this.LLLIIL;
                    interfaceC1258260iqe2.LIZ(i8 != -1 && i8 < iFindFirstCompletelyVisibleItemPosition);
                    return;
                }
                return;
            }
            if (getContext() == null) {
                C1720106oR.LIZ("MTAwemeListFragment", "realUpdateJustWatchedButton. context is null");
                return;
            }
            Rect rect3 = new Rect();
            boolean localVisibleRect = viewFindViewByPosition.getLocalVisibleRect(rect3);
            if (this.LLLIL) {
                int iHeight = rect3.height();
                int height = viewFindViewByPosition.getHeight();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("realUpdateJustWatchedButton. visibleResult:");
                sbLIZ3.append(localVisibleRect);
                sbLIZ3.append(", visibleHeight:");
                sbLIZ3.append(iHeight);
                sbLIZ3.append(", viewHeight:");
                sbLIZ3.append(height);
                C2188811AlT.LIZIZ(sbLIZ3);
                boolean z4 = localVisibleRect && iHeight == height;
                this.LLLILZ = z4;
                if (z4) {
                    this.LLLII.LIZJ();
                } else {
                    InterfaceC1258260iqe interfaceC1258260iqe3 = this.LLLII;
                    int i9 = this.LLLIIL;
                    interfaceC1258260iqe3.LIZ(i9 != -1 && i9 < iFindFirstCompletelyVisibleItemPosition);
                }
            }
            if (localVisibleRect) {
                final boolean z5 = this.LLLIILIL;
                if (z5 && this.LLLILZ) {
                    z = true;
                }
                final Aweme aweme2 = this.LLLLLILLIL;
                final int i10 = this.LLLIIL + 1;
                if (C0O0W.LIZ) {
                    return;
                }
                C0O0W.LIZ = true;
                C20684815ws.LJFF().execute(new Runnable() { // from class: X.05yt
                    public final void LIZ() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                        Aweme aweme22 = aweme2;
                        c2344009Gk.LJIIIIZZ("request_id", aweme22 != null ? aweme22.getRequestId() : null);
                        Aweme aweme3 = aweme2;
                        c2344009Gk.LJIIIIZZ("group_id", aweme3 != null ? aweme3.getAid() : null);
                        Aweme aweme4 = aweme2;
                        c2344009Gk.LJIIIIZZ("author_id", aweme4 != null ? AwemeExtKt.getAuthorUid(aweme4) : null);
                        c2344009Gk.LIZJ(i10, "order");
                        c2344009Gk.LJ(Boolean.valueOf(z5), "is_first_screen");
                        c2344009Gk.LJ(Boolean.valueOf(z), "is_first_screen_full_show");
                        C20684815ws.LJIILLIIL("just_watched_video_show", c2344009Gk.LIZ);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("JustWatchTracker@f11e.reportJWVideoShow$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("JustWatchTracker@f11e.reportJWVideoShow$1");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void SY() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadEnd. stack:");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().contains("java.lang.Thread")) {
                stringBuffer.append(stackTraceElement);
                stringBuffer.append('\n');
            }
        }
        sbLIZ.append(stringBuffer.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C299890BpD.LIZ() || this.LLJILLL) {
            return;
        }
        synchronized (this.R) {
            try {
                this.P = false;
                this.Q = 0;
                PU();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bU() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment.bU():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0irk] */
    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initData() {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment.initData():void");
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        C1258750irR c1258750irR = this.f436J;
        if (c1258750irR != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(c1258750irR.LIZ())) != null) {
            interfaceC1602960rocLIZIZ.LJIIIIZZ();
        }
        super.onDestroyView();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("profile_load_more_error_fix", true)) {
            ((ArrayDeque) this.f437O).clear();
            this.P = false;
            this.Q = 0;
            if (this.U != null && getParentFragment() != null) {
                UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getParentFragment(), null), UserProfileAbility.class, null);
                if (userProfileAbility != null && userProfileAbility.y12() != null) {
                    C1253180iiS c1253180iiSY12 = userProfileAbility.y12();
                    C1258700irM c1258700irM = this.U;
                    synchronized (c1253180iiSY12.LJIIJ) {
                        try {
                            ((ArrayList) c1253180iiSY12.LJIIIIZZ).remove(c1258700irM);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                this.U = null;
            }
        }
        if (!C1ELC.LIZIZ() || !this.LLJILLL || this.LLJIJIL != 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDestroyView  is unable, mType: ");
            sbLIZ.append(this.LLJIJIL);
            C1720106oR.LJI("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        MineProfileAbility mineProfileAbility = (MineProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(getParentFragment(), null), MineProfileAbility.class, null);
        if (mineProfileAbility == null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("MTAwemeListFragment", "onDestroyView mineProfileAbility is null");
        } else if (mineProfileAbility.HK() == null) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LJI("MTAwemeListFragment", "registerAwemeCacheCallback getProfileAwemeCacheManager is null");
        } else {
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("MTAwemeListFragment", "onDestroyView unRegisterListener");
            C1253720ijK.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1257400ipG
    public final void Jn() {
        super.Jn();
        C1258710irN c1258710irN = this.M;
        if (c1258710irN != null) {
            c1258710irN.LIZJ.getFirst().set(-1);
            c1258710irN.LIZJ.getSecond().set(-1);
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void Ng1() {
        InterfaceC1258470iqz interfaceC1258470iqz;
        T t;
        if (isViewValid()) {
            C1255920ims<AbstractC1255880imo> c1255920ims = this.LLJJJJJIL;
            if (c1255920ims != null && (t = c1255920ims.LL) != 0 && ((AbstractC1255880imo) t).isHasMore()) {
                c5("load_more_feed_empty_but_has_more");
            }
            if (!this.LLJILLL || this.LLJIJIL != 0) {
                MU();
                return;
            }
            if (this.LLJJJ.getItemCount() != 0 || this.LLJJJ.LLILZ) {
                InterfaceC1258470iqz interfaceC1258470iqz2 = this.LLJL;
                if (interfaceC1258470iqz2 != null) {
                    interfaceC1258470iqz2.LIZ(this.LLJIJIL);
                }
            } else {
                InterfaceC1258470iqz interfaceC1258470iqz3 = this.LLJL;
                if (interfaceC1258470iqz3 != null) {
                    interfaceC1258470iqz3.LIZJ(this.LLJIJIL, this.LLJILLL);
                }
            }
            if (((Boolean) C1EDI.LJII.getValue()).booleanValue() && this.LLJJJ.LLILZ && (interfaceC1258470iqz = this.LLJL) != null) {
                interfaceC1258470iqz.LIZIZ(this.LLJIJIL);
            }
            IAwmeListFragmentAppDiff.LIZ.getClass();
            C1259020irs.LIZ().LIZ();
            C786410Ut5.LLLZLZ(this.LLJJJJLIIL, 4);
        }
    }

    public final void OU() {
        if (!isViewValid() || this.LLJJJ == null) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showHeaderLoading: type=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1259360isQ c1259360isQ = this.LLJJJ;
        if (c1259360isQ.LLJILJILJ || c1259360isQ.LLILLL == null) {
            return;
        }
        HandlerHook.viewPost(c1259360isQ.LLILLL, new ARunnableS119S0100000_19(c1259360isQ, 204));
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        C1258750irR c1258750irR = this.f436J;
        if (c1258750irR != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(c1258750irR.LIZ())) != null) {
            interfaceC1602960rocLIZIZ.LJIIJ(c1258750irR.LIZJ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Fragment parentFragment = getParentFragment();
        if (!C1260030itV.LIZ() || parentFragment == null) {
            return;
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(parentFragment, null), UserProfileAbility.class, null);
        if (userProfileAbility == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("MTAwemeListFragment", "onResume ability is null");
            return;
        }
        C1253180iiS c1253180iiSY12 = userProfileAbility.y12();
        if (c1253180iiSY12 != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05A5(c1253180iiSY12, jCurrentTimeMillis, null), 3);
        } else {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("MTAwemeListFragment", "onResume helper is null");
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void sU() {
        User user;
        super.sU();
        if (this.LLJL == null || this.LLJIJIL != 0 || this.LLJILLL || C10EU.LJIIIIZZ() || (user = this.LLILZLL) == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3) {
            return;
        }
        this.LLJL.LIZJ(this.LLJIJIL, this.LLJILLL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final View WR() {
        return this.L;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, X.InterfaceC1257400ipG
    public final void An(String str) {
        super.An(str);
        C1258750irR c1258750irR = this.f436J;
        if (c1258750irR != null) {
            c1258750irR.LIZIZ = str;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1257400ipG
    public final void Co(Exception exc) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMoreToTargetError. exception:");
        sbLIZ.append(exc.toString());
        sbLIZ.append(", mJustWatchedVideoPosition:");
        sbLIZ.append(this.LLLIIL);
        C1720106oR.LIZ("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (C299890BpD.LIZ() && !this.LLJILLL) {
            ProfileViewModel profileViewModel = this.LLLLLZL;
            profileViewModel.getClass();
            profileViewModel.setState(new AwS47S0010000_35(false, 27));
        }
        int errorCode = -1;
        if (C299890BpD.LIZ() && this.LLLIIL != -1) {
            NU();
            return;
        }
        this.LLLII.LIZJ();
        if ("ABORT_LOCATE_RESULT".equals(exc.getMessage())) {
            return;
        }
        if (exc instanceof C0XIR) {
            errorCode = ((C23112093u) exc).getErrorCode();
            if (errorCode == 2053) {
                C1389890mGx c1389890mGx = new C1389890mGx(getActivity());
                c1389890mGx.LJIIIZ(2131836272);
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(getActivity());
                c1389890mGx2.LJIIIZ(2131834217);
                c1389890mGx2.LJIIJJI();
            }
        } else {
            C1389890mGx c1389890mGx3 = new C1389890mGx(getActivity());
            c1389890mGx3.LJIIIZ(2131834217);
            c1389890mGx3.LJIIJJI();
        }
        C0O0W.LIZIZ(1, errorCode, this.LLLLLILLIL, "", this.l);
    }

    public final void EU(FeedItemList feedItemList) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAwemeCache  awemeCacheCallback ");
        sbLIZ.append(this.LLJIJIL);
        C1720106oR.LJI("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1255780ime c1255780ime = (C1255780ime) this.LLJJJJJIL.LL;
        if (c1255780ime == null) {
            C1720106oR.LIZ("MTAwemeListFragment", "awemeCacheCallback awemeModel is null");
            return;
        }
        if (feedItemList != null && feedItemList.getAwemeList() != null && !feedItemList.getAwemeList().isEmpty()) {
            String curUserId = this.LLIZ;
            if (curUserId == null) {
                curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            }
            c1255780ime.LJJIJIIJIL(curUserId);
            Message messageObtainMessage = c1255780ime.mHandler.obtainMessage(0);
            messageObtainMessage.obj = feedItemList;
            c1255780ime.handleMsg(messageObtainMessage);
            this.p = true;
            getActivity();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                this.LLJLILLLLZIIL = true;
            } else {
                xU("fresh_after_get_cached_post", false, false);
            }
            C1720106oR.LIZ("MTAwemeListFragment", "awemeCacheCallback setInitList");
            return;
        }
        xU("fresh_get_cached_post_empty", false, false);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1257400ipG
    public final void Gn(User user) {
        super.Gn(user);
        if (!this.LLJILLL && !C10EU.LJIIIIZZ() && this.LLJIJIL == 0 && getContext() != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = getContext().getString(2131845470);
            c1722300uv6.LJIIIIZZ = C786410Ut5.j4(getContext().getString(2131845469), new Object[]{C10EU.LIZJ(this.LLILZLL)});
            this.LLLILZJ = c1722300uv6;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1257400ipG
    public final void Hn(boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHasLocateItem:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLIL = z;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void ZT(List<Aweme> list) {
        C1258650irH c1258650irH = this.N;
        if (c1258650irH != null) {
            ARunnableS88S0200000_19 aRunnableS88S0200000_19 = new ARunnableS88S0200000_19(this, list, 57);
            if (c1258650irH.LLILZIL.get()) {
                int i = C2187451AjH.LIZ;
                ((ArrayList) c1258650irH.LLILZ).add(aRunnableS88S0200000_19);
                return;
            } else {
                int i2 = C2187451AjH.LIZ;
                aRunnableS88S0200000_19.run();
                return;
            }
        }
        super.ZT(list);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        User user;
        C1258750irR c1258750irR;
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/profile/tab/MTAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkXRrvObmdGO6S5uiUXR/4WoTz0J1vS3g==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLLIIIL = z;
        if (z && (c1258750irR = this.f436J) != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(c1258750irR.LIZ())) != null) {
            interfaceC1602960rocLIZIZ.LJIIJ(c1258750irR.LIZJ);
        }
        if (isResumed() && z && !this.LLJILLL && this.LLJIJIL == 0) {
            String str = this.LLLIIIIL;
            if (str != null && str.equals(this.LLLLLLJ) && !this.LLLILZ && (user = this.LLILZLL) != null && !user.isBlock()) {
                RU();
            } else {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lastFeedAwemeId: ");
                sbLIZ.append(this.LLLIIIIL);
                sbLIZ.append(" mFeedsAwemeId: ");
                sbLIZ.append(this.LLLLLLJ);
                sbLIZ.append(" mIsJustWatchedAwemeVisible: ");
                sbLIZ.append(this.LLLILZ);
                sbLIZ.append(" mUser: ");
                sbLIZ.append(this.LLILZLL);
                C1720106oR.LJI("MTAwemeListFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(71783);
        this.K = (C16FB) view.findViewById(R.id.kp5);
        this.L = (C038S) view.findViewById(R.id.eux);
        super.onViewCreated(view, bundle);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1257400ipG
    public final void DH(List<Aweme> list, boolean z, boolean z2) {
        String str;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMoreToTargetResult. hasMore:");
        sbLIZ.append(z);
        sbLIZ.append(" hasMoreUp:");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C299890BpD.LIZ() && !this.LLJILLL) {
            ProfileViewModel profileViewModel = this.LLLLLZL;
            profileViewModel.getClass();
            profileViewModel.setState(new AwS47S0010000_35(false, 27));
        }
        if (!this.LLJILLL && this.LLJIJIL == 0 && this.LLLIIL == -1) {
            int i2 = 0;
            if (list != null) {
                while (true) {
                    if (i2 < list.size()) {
                        if (ListProtector.get(list, i2) != null && ((Aweme) ListProtector.get(list, i2)).getAid() != null && ((Aweme) ListProtector.get(list, i2)).getAid().equals(this.LLLLLLJ)) {
                            this.LLLIIL = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (this.LLLIIL == -1) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZ("MTAwemeListFragment", "onLoadMoreToTargetResult error. target video position is -1");
            C1389890mGx c1389890mGx = new C1389890mGx(getActivity());
            c1389890mGx.LJIIIZ(2131834217);
            c1389890mGx.LJIIJJI();
            InterfaceC1258260iqe interfaceC1258260iqe = this.LLLII;
            if (interfaceC1258260iqe != null) {
                interfaceC1258260iqe.LIZJ();
                return;
            }
            return;
        }
        if (!C299890BpD.LIZ()) {
            Pj(list, z);
            NU();
            return;
        }
        this.C = z;
        this.D = z2;
        if (z2) {
            C1259360isQ c1259360isQ = this.LLJJJ;
            c1259360isQ.getClass();
            c1259360isQ.LLLLLILLIL = new C1258270iqf(c1259360isQ.LLLFF);
            c1259360isQ.LLLFF = false;
        }
        if (isViewValid()) {
            String strLIZ = C1258810irX.LIZ((C1255780ime) this.LLJJJJJIL.LL, this.LLLLLIL);
            this.LLLLLIL = strLIZ;
            this.LLJJJ.LLLLLJIL = strLIZ;
            List<Aweme> listGS = GS(list);
            if (z2) {
                this.LLJJJ.setData(listGS);
            } else {
                this.LLJJJ.setDataAfterLoadMore(listGS);
            }
            yS(listGS, z2);
        }
        if (this.LLJJIJI != null) {
            HandlerHook.viewPost(this.LLJJIJI, new ARunnableS119S0100000_19(this, 199));
        }
        if (z2) {
            str = "part_locate";
        } else {
            str = "direct_locate";
        }
        C0O0W.LIZIZ(0, 0, this.LLLLLILLIL, str, this.l);
    }

    public final void JU(FeedItemList feedItemList, String str, boolean z) {
        C1255780ime c1255780ime = (C1255780ime) this.LLJJJJJIL.LL;
        if (c1255780ime == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("MTAwemeListFragment", "registerAwemeResponseCallback awemeModel is null");
            return;
        }
        this.LLJLIL = z;
        c1255780ime.LJJIJIIJIL(str);
        if (C1259950itN.LIZ()) {
            c1255780ime.LLILZ = str;
            c1255780ime.LLILZIL = str;
        }
        c1255780ime.LLJ = feedItemList.hotsoonFilteredCount;
        c1255780ime.LLJI = feedItemList.hotsoonHasMore;
        c1255780ime.LLJIJIL = feedItemList.hotSoonText;
        Message messageObtainMessage = c1255780ime.mHandler.obtainMessage(0);
        messageObtainMessage.obj = feedItemList;
        c1255780ime.handleMsg(messageObtainMessage);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void iT(int i, int i2, String str) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLoad. msg:");
        sbLIZ.append(i);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        sbLIZ.append(" requestCount:");
        sbLIZ.append(i2);
        sbLIZ.append(" mLoadingAwemeTaskType:");
        sbLIZ.append(this.Q);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.S.hasMessages(i)) {
            return;
        }
        if (C299890BpD.LIZ() && !this.LLJILLL) {
            synchronized (this.R) {
                try {
                    if (this.Q == i) {
                        return;
                    }
                    Iterator it2 = ((ArrayDeque) this.f437O).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C1259160is6 c1259160is6 = (C1259160is6) it2.next();
                            if (c1259160is6 != null && c1259160is6.LIZ == i) {
                                int i4 = C2187451AjH.LIZ;
                                break;
                            }
                        } else {
                            ((ArrayDeque) this.f437O).addLast(new C1259160is6(i, str, i2));
                            PU();
                            break;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        BPEAHandler bPEAHandler = this.S;
        C786410Ut5.LJLJLJ(bPEAHandler, Message.obtain(bPEAHandler, i, i2, -1, str), 150L);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (C1260030itV.LIZ() && !this.LLJILLL) {
            this.LLJLILLLLZIIL = false;
        }
        try {
            ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
            viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewOnCreateView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewOnCreateView;
        }
    }

    public static MTAwemeListFragment HU(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        MTAwemeListFragment mTAwemeListFragment = new MTAwemeListFragment();
        bundle.putInt("type", i2);
        C786410Ut5.LJJJI("uid", str, bundle);
        C786410Ut5.LJJJI("sec_user_id", str2, bundle);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", z2);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("delay_profile_initialization", z3);
        mTAwemeListFragment.setArguments(bundle);
        return mTAwemeListFragment;
    }
}
