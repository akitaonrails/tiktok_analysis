package com.ss.android.ugc.aweme.aiuikit.impl.imagepreview;

import X.C03D9;
import X.C098200Yq;
import X.C0DQH;
import X.C0KFD;
import X.C1308910kAL;
import X.C13BV;
import X.C13LZ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20635115or;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS139S0100000_4;
import Y.AsS31S0100000_4;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem;
import com.ss.android.ugc.aweme.aiuikit.impl.imagepreview.ImagePreviewFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class ImagePreviewFragment extends SAFTikTokFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlPCY4ITFiICIjHELIOSJGslJC40LTU+LDk6LTJiACIyLyAcOyolISA7Dz0yLygpJzs=";
    public final C0DQH LLJILLL = new C0DQH();
    public final C20635115or LLJJ = new C20635115or();
    public int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public FrameLayout LLJJJ;
    public RecyclerView LLJJJIL;
    public C03D9 LLJJJJ;
    public TuxTextView LLJJJJJIL;

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        super.onDestroyView();
    }

    public final void B6() {
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        if (this.LLJJJ == null) {
            finish();
        } else {
            finish();
        }
    }

    public ImagePreviewFragment() {
        aS(AFwS278S0000000_32.get$arr$(23));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        B6();
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJI = ViewConfiguration.get(requireContext()).getScaledTouchSlop();
    }

    public final void onPageSelected(int i) {
        TuxTextView tuxTextView;
        C03D9 c03d9 = this.LLJJJJ;
        if (c03d9 != null) {
            c03d9.setSelected(i);
        }
        if (this.LLJJIJIIJIL > 0 && (tuxTextView = this.LLJJJJJIL) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i + 1);
            sbLIZ.append('/');
            sbLIZ.append(this.LLJJIJIIJIL);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<ImagePreviewItem> parcelableArrayList;
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("items")) == null) {
            parcelableArrayList = C13BV.INSTANCE;
        }
        if (parcelableArrayList.isEmpty()) {
            finish();
            return;
        }
        if (arguments != null) {
            i = arguments.getInt("index", 0);
        } else {
            i = 0;
        }
        final int iLJ = C13LZ.LJ(i, 0, parcelableArrayList.size() - 1);
        C0DQH c0dqh = this.LLJILLL;
        c0dqh.LL = parcelableArrayList;
        c0dqh.notifyDataSetChanged();
        this.LLJJIJIIJIL = parcelableArrayList.size();
        C03D9 c03d9 = this.LLJJJJ;
        if (c03d9 != null) {
            c03d9.setCount(parcelableArrayList.size());
        }
        onPageSelected(iLJ);
        final FrameLayout frameLayout = this.LLJJJ;
        final C03D9 c03d92 = this.LLJJJJ;
        final RecyclerView recyclerView = this.LLJJJIL;
        if (frameLayout != null) {
            HandlerHook.viewPost(frameLayout, new Runnable() { // from class: X.0DUH
                public final void LIZ() {
                    FrameLayout.LayoutParams layoutParams;
                    if (frameLayout != this.LLJJJ) {
                        return;
                    }
                    C03D9 c03d93 = c03d92;
                    if (c03d93 != null && c03d93.getParent() != null && 1 != 0) {
                        int iLIZ = C1257310ip7.LIZ(frameLayout);
                        ViewGroup.LayoutParams layoutParams2 = c03d93.getLayoutParams();
                        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                            layoutParams.bottomMargin = iLIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03d93);
                            c03d93.setLayoutParams(layoutParams);
                        }
                    }
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollToPosition(iLJ);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ImagePreviewFragment@2ab6.onViewCreated$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ImagePreviewFragment@2ab6.onViewCreated$1");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), R.style.z4);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setClickable(true);
        RecyclerView recyclerView = new RecyclerView(contextThemeWrapper);
        C786410Ut5.p6(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(contextThemeWrapper, 0, false));
        recyclerView.setAdapter(this.LLJILLL);
        try {
            this.LLJJ.LIZIZ(recyclerView);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.w("ImagePreviewFragment", "snapHelper attach failed", e);
        }
        recyclerView.addOnScrollListener(new AsS31S0100000_4(this, 1));
        frameLayout.addView(recyclerView);
        recyclerView.addOnItemTouchListener(new C0KFD() { // from class: X.0DUI
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        return false;
                    }
                    float fAbs = Math.abs(motionEvent.getX() - this.LL.LLJJIII);
                    float fAbs2 = Math.abs(motionEvent.getY() - this.LL.LLJJIJI);
                    ImagePreviewFragment imagePreviewFragment = this.LL;
                    int i = imagePreviewFragment.LLJJI;
                    if (fAbs > i || fAbs2 > i) {
                        return false;
                    }
                    imagePreviewFragment.B6();
                    return true;
                }
                this.LL.LLJJIII = motionEvent.getX();
                this.LL.LLJJIJI = motionEvent.getY();
                return false;
            }
        });
        C03D9 c03d9 = new C03D9(contextThemeWrapper);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03d9);
        c03d9.setLayoutParams(layoutParams);
        frameLayout.addView(c03d9);
        C19GS c19gs = null;
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper, null, 6, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = C497820Jfg.LIZJ(contextThemeWrapper) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setGravity(17);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setTuxFont(33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, contextThemeWrapper);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -592138;
        }
        tuxTextView.setTextColor(iIntValue);
        frameLayout.addView(tuxTextView);
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = C497820Jfg.LIZJ(contextThemeWrapper) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.M6(tuxIconView, layoutParams3);
        tuxIconView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setContentDescription("back");
        C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(this, 8));
        frameLayout.addView(tuxIconView);
        this.LLJJJ = frameLayout;
        this.LLJJJIL = recyclerView;
        this.LLJJJJ = c03d9;
        this.LLJJJJJIL = tuxTextView;
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
