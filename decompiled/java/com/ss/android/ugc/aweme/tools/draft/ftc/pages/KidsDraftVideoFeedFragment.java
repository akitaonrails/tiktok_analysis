package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import X.C01GW;
import X.C098200Yq;
import X.C09QQ;
import X.C0CHQ;
import X.C0JAI;
import X.C0LAB;
import X.C1233040iBy;
import X.C1291180jhk;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1441840nck;
import X.C14EU;
import X.C1602160rnK;
import X.C1607680rwE;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C189200o6;
import X.C19292410dm;
import X.C19459811Bk;
import X.C19460111Bn;
import X.C19460211Bo;
import X.C19460311Bp;
import X.C19460811Bu;
import X.C19460911Bv;
import X.C19461011Bw;
import X.C19461111Bx;
import X.C19774712Yn;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21597019fc;
import X.C23250099c;
import X.C313970CSl;
import X.C418740GbQ;
import X.C446980Hfs;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC19460411Bq;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes30.dex */
public final class KidsDraftVideoFeedFragment extends Fragment implements InterfaceC19460411Bq {
    public static AwemeDraft LLJJIJI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZiE+KCknZiHELIOSM4KmEjKSIpOmEYISE/DT0yLjEaICs2JwMpLCsVOiQrJCo9PA==";
    public C1749280vcc LL;
    public C418740GbQ LLILLJJLI;
    public C19459811Bk LLILLL;
    public C21597019fc LLILZ;
    public C1607680rwE LLILZIL;
    public C1291180jhk LLILZLL;
    public FrameLayout LLIZ;
    public VideoPublishEditModel LLIZLLLIL;
    public AwemeDraft LLJ;
    public C19461111Bx LLJILJIL;
    public int LLJI = 1;
    public boolean LLJIJIL = true;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 523));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(236));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 294));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 521));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 522));

    @Override // X.InterfaceC19460411Bq
    public final void LLJJJJ() {
        UR(false);
    }

    public final C19459811Bk MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g4s) : null;
            this.LLILLL = (C19459811Bk) viewFindViewById;
        }
        return (C19459811Bk) viewFindViewById;
    }

    public final C21597019fc NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hsi) : null;
            this.LLILZ = (C21597019fc) viewFindViewById;
        }
        return (C21597019fc) viewFindViewById;
    }

    public final FrameLayout OR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hti) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1749280vcc PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nld) : null;
            this.LL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C19460811Bu RR() {
        return (C19460811Bu) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC19460411Bq
    public final void k1() {
        if (this.LLJILJIL == null || !C19460911Bv.LIZLLL()) {
            this.LLJILJIL = new C19461111Bx();
        }
        C19461111Bx c19461111Bx = this.LLJILJIL;
        if (c19461111Bx == null) {
            c19461111Bx = null;
        }
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ron) : null;
            this.LLILZLL = (C1291180jhk) viewFindViewById;
        }
        c19461111Bx.LJ(activity, videoPublishEditModel, viewLifecycleOwner, (C1291180jhk) viewFindViewById);
        C0LAB c0lab = new C0LAB();
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        c0lab.LJ("author_id", currentUser != null ? currentUser.getUid() : null);
        AwemeDraft awemeDraft = this.LLJ;
        c0lab.LJ("group_id", awemeDraft != null ? awemeDraft.LIZ() : null);
        C20684815ws.LJIILLIIL("download_retry", c0lab.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1441840nck c1441840nckLIZ;
        super.onDestroy();
        C19460811Bu c19460811BuRR = RR();
        for (Map.Entry entry : ((LinkedHashMap) c19460811BuRR.LLIZ).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            entry.getValue();
            C19461011Bw c19461011Bw = (C19461011Bw) ((LinkedHashMap) c19460811BuRR.LLIZ).get(Integer.valueOf(iIntValue));
            if (c19461011Bw != null && (c1441840nckLIZ = c19461011Bw.LIZ()) != null) {
                c1441840nckLIZ.LIZJ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C19460111Bn.LIZ();
        C1440005kM.LIZ(new IEvent() { // from class: X.0btU
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        C09QQ.LIZIZ(this);
        C19459811Bk.LLJI.remove(this);
        C19461111Bx.LJFF = true;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C19461011Bw c19461011BwLJJIJIL = RR().LJJIJIL(this.LLJI - 1);
        if (c19461011BwLJJIJIL != null) {
            c19461011BwLJJIJIL.LIZJ(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C19461011Bw c19461011BwLJJIJIL = RR().LJJIJIL(this.LLJI - 1);
        if (c19461011BwLJJIJIL != null) {
            c19461011BwLJJIJIL.LIZJ(true);
        }
    }

    public final void UR(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (MR() != null) {
            if (z) {
                C19459811Bk c19459811BkMR = MR();
                int visibility = c19459811BkMR.getVisibility();
                c19459811BkMR.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c19459811BkMR);
                if (OR() != null) {
                    C786410Ut5.LJZ(0, OR());
                    C19461011Bw c19461011BwLJJIJIL = RR().LJJIJIL(this.LLJI - 1);
                    if (c19461011BwLJJIJIL != null && (frameLayout2 = c19461011BwLJJIJIL.LJIJJ) != null) {
                        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = (int) C0JAI.LIZ(37.0f, getContext());
                        }
                        if (frameLayout2 != null) {
                            C786410Ut5.a6(frameLayout2, layoutParams);
                            frameLayout2.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C19459811Bk c19459811BkMR2 = MR();
            int visibility2 = c19459811BkMR2.getVisibility();
            c19459811BkMR2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c19459811BkMR2);
            if (OR() == null) {
                return;
            }
            C786410Ut5.LJZ(8, OR());
            C19461011Bw c19461011BwLJJIJIL2 = RR().LJJIJIL(this.LLJI - 1);
            if (c19461011BwLJJIJIL2 == null || (frameLayout = c19461011BwLJJIJIL2.LJIJJ) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = 0;
            }
            if (frameLayout == null) {
                return;
            }
            C786410Ut5.a6(frameLayout, layoutParams2);
            frameLayout.requestLayout();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void handleDownloadVideoStatus(C19460211Bo c19460211Bo) {
        boolean z;
        Integer numValueOf;
        String creationId;
        String creationId2;
        String uid;
        String creationId3;
        String creationId4;
        String uid2;
        String creationId5;
        String creationId6;
        C19460311Bp c19460311Bp = c19460211Bo.LIZ;
        if (c19460311Bp != null && C19460311Bp.LIZIZ == 3) {
            z = true;
        } else {
            z = false;
        }
        UR(!z);
        String creationId7 = null;
        if (c19460311Bp != null) {
            numValueOf = Integer.valueOf(C19460311Bp.LIZIZ);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    C19459811Bk c19459811BkMR = MR();
                    c19459811BkMR.getClass();
                    C19459811Bk.LIZLLL();
                    c19459811BkMR.LIZJ();
                    ImageView imageView = c19459811BkMR.LLILLJJLI;
                    if (imageView == null) {
                        imageView = null;
                    }
                    C786410Ut5.LJZI(8, imageView);
                    TextView textView = c19459811BkMR.LLILLL;
                    if (textView == null) {
                        textView = null;
                    }
                    C786410Ut5.LLIL(textView, 8);
                    C786410Ut5.LLIL(c19459811BkMR.getMDownloadFailedTextView(), 8);
                    c19459811BkMR.getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
                    C786410Ut5.LLIIL(c19459811BkMR.getMDownloadProgressViewRoot(), 0);
                    TextView textView2 = c19459811BkMR.LLILZ;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    C786410Ut5.LLIL(textView2, 0);
                    TextView textView3 = c19459811BkMR.LLILZIL;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    C786410Ut5.LLIL(textView3, 0);
                    TextView textView4 = c19459811BkMR.LLIZ;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    C786410Ut5.LLIL(textView4, 0);
                    c19459811BkMR.getMDownloadProgressViewRoot().requestLayout();
                    c19460311Bp.getClass();
                    VideoPublishEditModel videoPublishEditModel = C19460311Bp.LIZLLL;
                    if (videoPublishEditModel != null) {
                        creationId6 = videoPublishEditModel.getCreationId();
                    } else {
                        creationId6 = null;
                    }
                    VideoPublishEditModel videoPublishEditModel2 = this.LLIZLLLIL;
                    if (videoPublishEditModel2 != null) {
                        creationId7 = videoPublishEditModel2.getCreationId();
                    }
                    UR(Intrinsics.LJFF(creationId6, creationId7));
                    C0LAB c0lab = new C0LAB();
                    c0lab.LIZIZ(System.currentTimeMillis(), "start_download");
                    C20684815ws.LJIILLIIL("download_start", c0lab.LIZ);
                    return;
                }
                if (numValueOf.intValue() == 2) {
                    c19460311Bp.getClass();
                    VideoPublishEditModel videoPublishEditModel3 = C19460311Bp.LIZLLL;
                    if (videoPublishEditModel3 != null) {
                        creationId5 = videoPublishEditModel3.getCreationId();
                    } else {
                        creationId5 = null;
                    }
                    VideoPublishEditModel videoPublishEditModel4 = this.LLIZLLLIL;
                    if (videoPublishEditModel4 != null) {
                        creationId7 = videoPublishEditModel4.getCreationId();
                    }
                    if (Intrinsics.LJFF(creationId5, creationId7)) {
                        MR().LJ(C19460311Bp.LIZJ);
                        return;
                    } else {
                        UR(false);
                        return;
                    }
                }
                if (numValueOf.intValue() == 3) {
                    return;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        if (numValueOf.intValue() == 4) {
            c19460311Bp.getClass();
            VideoPublishEditModel videoPublishEditModel5 = C19460311Bp.LIZLLL;
            if (videoPublishEditModel5 != null) {
                creationId3 = videoPublishEditModel5.getCreationId();
            } else {
                creationId3 = null;
            }
            VideoPublishEditModel videoPublishEditModel6 = this.LLIZLLLIL;
            if (videoPublishEditModel6 != null) {
                creationId4 = videoPublishEditModel6.getCreationId();
            } else {
                creationId4 = null;
            }
            if (Intrinsics.LJFF(creationId3, creationId4)) {
                MR().LIZIZ();
                UR(true);
            } else {
                UR(false);
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZIZ(2131836349);
                C1389890mGx c1389890mGx = c1233040iBy.LIZIZ;
                if (c1389890mGx != null) {
                    c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                }
                C1389890mGx c1389890mGx2 = c1233040iBy.LIZIZ;
                if (c1389890mGx2 != null) {
                    c1389890mGx2.LJII(R.attr.a0i);
                }
                c1233040iBy.LIZLLL();
            }
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LIZIZ(System.currentTimeMillis(), "end_download");
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null) {
                uid2 = currentUser.getUid();
            } else {
                uid2 = null;
            }
            c0lab2.LJ("author_id", uid2);
            if (videoPublishEditModel5 != null) {
                creationId7 = videoPublishEditModel5.getCreationId();
            }
            c0lab2.LJ("group_id", creationId7);
            c0lab2.LIZ(1, "is_self_video");
            C20684815ws.LJIILLIIL("download_end", c0lab2.LIZ);
            return;
        }
        if (numValueOf.intValue() != 5) {
            return;
        }
        c19460311Bp.getClass();
        VideoPublishEditModel videoPublishEditModel7 = C19460311Bp.LIZLLL;
        if (videoPublishEditModel7 != null) {
            creationId = videoPublishEditModel7.getCreationId();
        } else {
            creationId = null;
        }
        VideoPublishEditModel videoPublishEditModel8 = this.LLIZLLLIL;
        if (videoPublishEditModel8 != null) {
            creationId2 = videoPublishEditModel8.getCreationId();
        } else {
            creationId2 = null;
        }
        if (Intrinsics.LJFF(creationId, creationId2)) {
            MR().LIZ();
            UR(true);
        } else {
            UR(false);
        }
        C0LAB c0lab3 = new C0LAB();
        C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser2 != null) {
            uid = currentUser2.getUid();
        } else {
            uid = null;
        }
        c0lab3.LJ("author_id", uid);
        if (videoPublishEditModel7 != null) {
            creationId7 = videoPublishEditModel7.getCreationId();
        }
        c0lab3.LJ("group_id", creationId7);
        C20684815ws.LJIILLIIL("download_fail", c0lab3.LIZ);
    }

    public static int SR(List list, VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (Intrinsics.LJFF(videoPublishEditModel.getCreationId(), ((BaseShortVideoContext) obj).getCreationId())) {
                    return i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PR().setStatus(new C1722300uv6());
        PR().LJ();
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bn2);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C418740GbQ) viewFindViewById;
        }
        C786410Ut5.Ua((C418740GbQ) viewFindViewById, new ACListenerS163S0100000_29(this, 121));
        C19459811Bk.LLJI.add(this);
        MR().setVideoDownloadClickListener(this);
        NR().setAdapter(RR());
        C21597019fc c21597019fcNR = NR();
        int visibility = c21597019fcNR.getVisibility();
        c21597019fcNR.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21597019fcNR);
        NR().LIZJ(new C19774712Yn(this, 8));
        View viewFindViewById2 = this.LLILZIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.nns);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZIL = (C1607680rwE) viewFindViewById2;
        }
        C1607680rwE c1607680rwE = (C1607680rwE) viewFindViewById2;
        c1607680rwE.LLILLJJLI = NR();
        c1607680rwE.LLILLL = null;
        KidsDraftFeedViewModel kidsDraftFeedViewModel = (KidsDraftFeedViewModel) this.LLJJ.getValue();
        kidsDraftFeedViewModel.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C313970CSl(kidsDraftFeedViewModel, null), 3);
        kidsDraftFeedViewModel.getClass();
        ((KidsDraftOptionViewModel) this.LLJJI.getValue()).LL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 168));
        ((KidsDraftFeedViewModel) this.LLJJ.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 169));
        ((KidsDraftFeedViewModel) this.LLJJ.getValue()).LLILLL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 170));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        ImmersionBar immersionBar = tuxImmersionBarLIZLLL.LIZIZ;
        immersionBar.LJFF.LL = C446980Hfs.LIZ(immersionBar.LIZ, R.color.b6);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(false);
        tuxImmersionBarLIZLLL.LIZLLL();
        C09QQ.LIZ(this);
        C19461111Bx.LJFF = false;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czx, viewGroup, false);
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
}
