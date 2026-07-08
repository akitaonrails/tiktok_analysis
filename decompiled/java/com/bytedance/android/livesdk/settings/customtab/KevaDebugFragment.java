package com.bytedance.android.livesdk.settings.customtab;

import X.C098200Yq;
import X.C0IJT;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C474500IjA;
import X.C497740JfY;
import X.C745350TLp;
import X.C745370TLr;
import X.C786120Usc;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS147S0100000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KevaDebugFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OyA4HELIOSPSY9LzZiKjogPCohPS4xZg4pPy4XLSc5LgkhKSIhLCEn";
    public RecyclerView LL;
    public C16F5 LLILLJJLI;
    public LiveEditText LLILLL;
    public C16FS LLILZ;
    public C745350TLp LLILZIL;
    public final Keva LLILZLL;
    public final Keva LLIZ;
    public final List<C745370TLr> LLIZLLLIL;

    public KevaDebugFragment() {
        Keva repo = KevaImpl.getRepo("live_sdk_core", 0);
        this.LLILZLL = repo;
        this.LLIZ = KevaImpl.getRepo("tt_live_sdk", 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it2 = repo.getAll().entrySet().iterator();
        while (true) {
            Object obj = "";
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (value != null) {
                obj = value;
            }
            arrayList.add(new C745370TLr(obj, key, "live_sdk_core"));
        }
        for (Map.Entry<String, ?> entry : this.LLIZ.getAll().entrySet()) {
            String key2 = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 == null) {
                value2 = "";
            }
            arrayList.add(new C745370TLr(value2, key2, "tt_live_sdk"));
        }
        this.LLIZLLLIL = arrayList;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EnterFrom")) == null) {
            string = "enter_live_setting";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("keva_manager_use");
        c474500IjALIZ.LJJII(string, "enter_from");
        c474500IjALIZ.LIZ();
        C16FS c16fs = this.LLILZ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 231));
        }
        if (this.LLILLL == null) {
            this.LLILLL = (LiveEditText) view.findViewWithTag("search_view");
        }
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new C786120Usc(this, 11));
        }
        if (this.LL == null) {
            this.LL = (RecyclerView) view.findViewWithTag("recycler_view");
        }
        this.LLILZIL = new C745350TLp(this.LLIZLLLIL, new AwS626S0100000_12(this, 19));
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILZIL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setBackground(C497740JfY.LJIIJ(R.drawable.dxd));
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        C19GS c19gs = null;
        C16F5 c16f5 = new C16F5(layoutInflater.getContext(), null);
        c16f5.setTextAppearance(R.style.r1);
        C786410Ut5.y6(c16f5, new LinearLayout.LayoutParams(-1, -2));
        c16f5.setPadding((int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(8.0f), (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(8.0f));
        c16f5.setText(C497740JfY.LJIJI(2131856092));
        c16f5.setBackgroundColor(ColorProtector.parseColor("#55112233"));
        c16f5.setTextColor(-1);
        linearLayout.addView(c16f5);
        C16FS c16fs = new C16FS(layoutInflater.getContext(), null);
        c16fs.setText("Reset all");
        c16fs.j0(R.style.a7b);
        this.LLILZ = c16fs;
        C16FS c16fs2 = this.LLILZ;
        if (c16fs2 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(50.0f));
            layoutParams.leftMargin = (int) C497740JfY.LIZIZ(20.0f);
            layoutParams.rightMargin = (int) C497740JfY.LIZIZ(20.0f);
            layoutParams.topMargin = (int) C497740JfY.LIZIZ(20.0f);
            layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(20.0f);
            C786410Ut5.x6(c16fs2, layoutParams);
        }
        linearLayout.addView(this.LLILZ);
        this.LLILLL = new LiveEditText(layoutInflater.getContext(), null);
        LiveEditText liveEditText = this.LLILLL;
        if (liveEditText != null) {
            liveEditText.setTextAppearance(R.style.r4);
            liveEditText.setTag("search_view");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(50.0f));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveEditText);
            liveEditText.setLayoutParams(layoutParams2);
            liveEditText.setPadding((int) C497740JfY.LIZIZ(16.0f), 0, (int) C497740JfY.LIZIZ(16.0f), 0);
            liveEditText.setMaxLines(1);
            liveEditText.setGravity(16);
            liveEditText.setHint("input search keywords");
            liveEditText.setSingleLine();
            liveEditText.setFocusable(true);
            liveEditText.setFocusableInTouchMode(true);
            linearLayout.addView(this.LLILLL);
            liveEditText.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.fwz, liveEditText.getContext()));
            liveEditText.setImeOptions(3);
            liveEditText.requestFocus();
        }
        this.LLILLJJLI = new C16F5(layoutInflater.getContext(), null);
        C16F5 c16f52 = this.LLILLJJLI;
        if (c16f52 != null) {
            C786410Ut5.y6(c16f52, new LinearLayout.LayoutParams(-1, -1));
        }
        C16F5 c16f53 = this.LLILLJJLI;
        if (c16f53 != null) {
            c16f53.setText("No value stored into keva, so you cannot search it according keywords. Or your search keywords is not right!");
        }
        C16F5 c16f54 = this.LLILLJJLI;
        if (c16f54 != null) {
            c16f54.setPadding((int) C497740JfY.LIZIZ(16.0f), 0, (int) C497740JfY.LIZIZ(16.0f), 0);
        }
        C16F5 c16f55 = this.LLILLJJLI;
        if (c16f55 != null) {
            c16f55.setTextColor(-7829368);
        }
        C16F5 c16f56 = this.LLILLJJLI;
        if (c16f56 != null) {
            C786410Ut5.LLJJJJ(c16f56, 8);
        }
        linearLayout.addView(this.LLILLJJLI);
        RecyclerView recyclerView2 = new RecyclerView(layoutInflater.getContext());
        this.LL = recyclerView2;
        recyclerView2.setTag("recycler_view");
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null) {
            recyclerView3.setScrollBarSize((int) C497740JfY.LIZIZ(3.0f));
        }
        if (Build.VERSION.SDK_INT >= 29 && (recyclerView = this.LL) != null) {
            recyclerView.setVerticalScrollbarThumbDrawable(new ColorDrawable(-7829368));
        }
        RecyclerView recyclerView4 = this.LL;
        if (recyclerView4 != null) {
            C786410Ut5.p6(recyclerView4, new LinearLayout.LayoutParams(-1, -1));
        }
        linearLayout.addView(this.LL);
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linearLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linearLayout;
        }
    }
}
