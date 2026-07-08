package com.ss.android.ugc.aweme.internalshare.impl.fragment;

import X.AbstractC1365570ldj;
import X.C098200Yq;
import X.C0OM1;
import X.C0SHX;
import X.C0TA1;
import X.C1214160hhW;
import X.C1214170hhX;
import X.C1250250idj;
import X.C1363430laH;
import X.C1369580lkC;
import X.C1369870lkf;
import X.C1371590lnR;
import X.C1386360mBG;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C13LE;
import X.C1440005kM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19286110cl;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C2211751BhN;
import X.C418440Gaw;
import X.C453940Hr6;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897370ZIh;
import X.C897520ZIw;
import X.C960203pA;
import X.DialogInterfaceOnDismissListenerC1402030maX;
import X.EnumC1910450zoZ;
import X.InterfaceC344240DeY;
import X.InterfaceC897380ZIi;
import Y.AObserverS216S0100000_12;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.DownloadAndShareViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS174S0400000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadAndShareFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiPSohJiQgOicyOiBiHELIOSICIjJGsqOy40JSAiPWEXJzIiJSAyLAQiLRw7KTcpDz0yLygpJzs=";
    public final C19286110cl LLIZ = new C19286110cl(C13LE.LIZ(DownloadAndShareViewModel.class), new AwS565S0100000_21((Fragment) this, 615), new AwS565S0100000_21(this, 616));
    public volatile boolean LLIZLLLIL;
    public TuxSheet LLJ;
    public SharePackage LLJI;
    public C1371590lnR LLJIJIL;
    public RecyclerView LLJILJIL;
    public C1369580lkC LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public ConstraintLayout LLJJI;
    public C1363430laH LLJJIII;
    public final C897520ZIw LLJJIJI;

    public final DownloadAndShareViewModel SR() {
        return (DownloadAndShareViewModel) this.LLIZ.getValue();
    }

    public DownloadAndShareFragment() {
        InterfaceC897380ZIi.LIZIZ.getClass();
        this.LLJJIJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.LONG_PRESS_PANEL, false);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string = getResources().getString(R.string.tba);
        C1371590lnR value = SR().LL.getValue();
        if (value != null && value.LJIILJJIL) {
            return null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIw = this.LLJJIJI;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C897520ZIw c897520ZIw = this.LLJJIJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C897520ZIw c897520ZIw = this.LLJJIJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
    }

    public final void UR(C1371590lnR c1371590lnR) {
        if (!this.LLIZLLLIL) {
            return;
        }
        C1369580lkC c1369580lkC = this.LLJILJILJ;
        ConstraintLayout constraintLayout = null;
        if (c1369580lkC != null) {
            final Context contextRequireContext = requireContext();
            final SharePackage sharePackage = this.LLJI;
            if (sharePackage == null) {
                sharePackage = null;
            }
            c1369580lkC.LLJJ = new AbstractC1365570ldj(contextRequireContext, sharePackage) { // from class: X.0lbo
                @Override // X.AbstractC1365570ldj
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
                    DownloadAndShareViewModel downloadAndShareViewModelSR = this.LLILLL.SR();
                    Context contextRequireContext2 = this.LLILLL.requireContext();
                    C1371590lnR value = downloadAndShareViewModelSR.LL.getValue();
                    if (value != null) {
                        if (!interfaceC1369790lkX.LIZJ() && value.LJIJJ.LIZJ()) {
                            downloadAndShareViewModelSR.LLILLJJLI.setValue(Boolean.TRUE);
                        }
                        if (!value.LJIJJ.LJII(interfaceC1369790lkX, contextRequireContext2, view, null, new AwS117S0400000_21(contextRequireContext2, downloadAndShareViewModelSR, interfaceC1369790lkX, value, 18))) {
                            value.LJIJJ.LJIJ(interfaceC1369790lkX, new AwS174S0400000_21(contextRequireContext2, downloadAndShareViewModelSR, interfaceC1369790lkX, value, 1));
                        }
                    }
                }
            };
        }
        if (!c1371590lnR.LJIJJLI) {
            RecyclerView recyclerView = this.LLJILJIL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
            View view = this.LLJILLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        C19MB c19mb = new C19MB();
        ConstraintLayout constraintLayout2 = this.LLJJI;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        c19mb.LJII(constraintLayout2);
        c19mb.LJIIIIZZ(R.id.fzj, 3, R.id.uyu, 4);
        ConstraintLayout constraintLayout3 = this.LLJJI;
        if (constraintLayout3 != null) {
            constraintLayout = constraintLayout3;
        }
        c19mb.LIZIZ(constraintLayout);
        if (!c1371590lnR.LJIILJJIL) {
            C1369580lkC c1369580lkC2 = this.LLJILJILJ;
            if (c1369580lkC2 != null) {
                C786410Ut5.B0(c1369580lkC2, 0);
            }
        } else {
            C1369580lkC c1369580lkC3 = this.LLJILJILJ;
            if (c1369580lkC3 != null) {
                C786410Ut5.B0(c1369580lkC3, 8);
            }
            View view3 = this.LLJILLL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        }
        C1369580lkC c1369580lkC4 = this.LLJILJILJ;
        if (c1369580lkC4 != null) {
            c1369580lkC4.LJIIZILJ(c1371590lnR.LIZ, false);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SharePackage sharePackage;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (sharePackage = (SharePackage) arguments.getParcelable("SharePackage")) != null) {
            this.LLJI = sharePackage;
        }
    }

    public final void VR(C1371590lnR c1371590lnR, C19EG c19eg) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.LLJIJIL = c1371590lnR;
        if (!this.LLIZLLLIL) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            if (supportFragmentManager != null && (resources = c19eg.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                float f = displayMetrics.heightPixels;
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJIIJIL = false;
                c1390920mIc.LJIIIIZZ(2);
                c1390920mIc.LIZIZ((int) (0.5f * f), (int) (f * 0.7f));
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = true;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1402030maX(this, c19eg, 2);
                tuxSheet.LLJJIJI = this;
                this.LLJ = tuxSheet;
                C1391850mK7.LIZIZ(tuxSheet, "after_video_saved_share_to_nscreen");
                TuxSheet tuxSheet2 = this.LLJ;
                if (tuxSheet2 == null) {
                    tuxSheet2 = null;
                }
                tuxSheet2.show(supportFragmentManager, "DownloadAndShareFragment");
                C1440005kM.LIZ(new C453940Hr6(true, false, 6));
                this.LLIZLLLIL = true;
                C0SHX.LIZ(c19eg, null).LJIIJJI("downloaded_video_share_dialog", true, new C0TA1() { // from class: X.0lbm
                    @Override // X.C0TA1
                    public final void LIZ() {
                        TuxSheet tuxSheet3 = this.LIZ.LLJ;
                        if (tuxSheet3 == null) {
                            tuxSheet3 = null;
                        }
                        tuxSheet3.dismiss();
                    }
                });
                FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
                if (fypAutoScrollServiceLIZJ != null) {
                    fypAutoScrollServiceLIZJ.LJIJI(true);
                    return;
                }
                return;
            }
            return;
        }
        SR().LL.setValue(this.LLJIJIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        C1369580lkC c1369580lkC;
        C1371590lnR value;
        C1214170hhX c1214170hhXLJFF;
        View viewFindViewById;
        boolean zLJI = MethodIDManager.LJI(202385);
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
        this.LLJJI = constraintLayout2;
        if (this.LLJI == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (constraintLayout2 == null) {
            constraintLayout = null;
        } else {
            constraintLayout = constraintLayout2;
        }
        this.LLJILJIL = (RecyclerView) constraintLayout.findViewById(R.id.eqo);
        ConstraintLayout constraintLayout3 = this.LLJJI;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        this.LLJILJILJ = (C1369580lkC) constraintLayout3.findViewById(R.id.uyu);
        ConstraintLayout constraintLayout4 = this.LLJJI;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.LLJILLL = constraintLayout4.findViewById(R.id.fzj);
        ConstraintLayout constraintLayout5 = this.LLJJI;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.LLJJ = constraintLayout5.findViewById(R.id.uq1);
        C1369580lkC c1369580lkC2 = this.LLJILJILJ;
        if (c1369580lkC2 != null) {
            C786410Ut5.B0(c1369580lkC2, 8);
        }
        C1369580lkC c1369580lkC3 = this.LLJILJILJ;
        if (c1369580lkC3 != null && (viewFindViewById = c1369580lkC3.findViewById(R.id.doe)) != null) {
            viewFindViewById.setPaddingRelative(viewFindViewById.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), viewFindViewById.getPaddingEnd(), viewFindViewById.getPaddingBottom());
        }
        SharePackage sharePackage = this.LLJI;
        if (sharePackage == null) {
            sharePackage = null;
        }
        if (sharePackage.extras != null && (c1214170hhXLJFF = SR().LLIZLLLIL.LJFF()) != null && !SR().LLIZLLLIL.LIZJ(c1214170hhXLJFF)) {
            ConstraintLayout constraintLayout6 = this.LLJJI;
            if (constraintLayout6 == null) {
                constraintLayout6 = null;
            }
            C1214160hhW c1214160hhW = (C1214160hhW) constraintLayout6.findViewById(R.id.xyr);
            c1214160hhW.LIZ(true);
            c1214160hhW.LJ(c1214170hhXLJFF);
        }
        DownloadAndShareViewModel downloadAndShareViewModelSR = SR();
        downloadAndShareViewModelSR.LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 107));
        downloadAndShareViewModelSR.LL.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 78));
        downloadAndShareViewModelSR.LLILLL.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 79));
        downloadAndShareViewModelSR.LLILZ.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 80));
        downloadAndShareViewModelSR.LLILZLL.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 81));
        View view2 = this.LLJILLL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw nullPointerException;
                }
                throw nullPointerException;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.W5(view2, marginLayoutParams);
        }
        View view3 = this.LLJILLL;
        if (view3 != null) {
            view3.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.na, constraintLayout2.getContext())));
        }
        C1363430laH c1363430laH = new C1363430laH(SR().LLIZLLLIL, this.LLJJIJI);
        this.LLJJIII = c1363430laH;
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView != null) {
            recyclerView.setAdapter(c1363430laH);
        }
        RecyclerView recyclerView2 = this.LLJILJIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        C1363430laH c1363430laH2 = this.LLJJIII;
        if (c1363430laH2 == null) {
            c1363430laH2 = null;
        }
        c1363430laH2.setData(null);
        SR().LLIZLLLIL.refresh();
        if (this.LLJIJIL != null && getContext() != null) {
            SR().LL.setValue(this.LLJIJIL);
        }
        if (SR().LL.getValue() != null) {
            UR(SR().LL.getValue());
        }
        if (constraintLayout2.getParent() != null && (c1369580lkC = this.LLJILJILJ) != null && c1369580lkC.getVisibility() == 0 && (value = SR().LL.getValue()) != null) {
            ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
            C1369870lkf.LJIJ(value);
            C1369870lkf.LJIILL(value);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chd, viewGroup, false);
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
