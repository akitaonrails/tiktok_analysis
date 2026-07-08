package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan;

import X.C0DXR;
import X.C13BV;
import X.C16F5;
import X.C1AAA;
import X.C21668219r6;
import X.C446030HeL;
import X.C497740JfY;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC21676019sM;
import X.ViewOnLayoutChangeListenerC2189561Amg;
import Y.AObserverS235S0100000_33;
import Y.AsS54S0100000_28;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.data.SuperFanPrivilegeInfo;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class SuperFanPrivilegeContentAssem extends UISlotAssem {
    public static final int LLJJL = (int) C497740JfY.LIZIZ(108.0f);
    public static final int LLJJLIIIJLLLLLLLZ = (int) C497740JfY.LIZIZ(6.0f);
    public RecyclerView LLJJI;
    public C446030HeL LLJJIII;
    public View LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public View LLJJJ;
    public boolean LLJJJJ;
    public List<SuperFanPrivilegeInfo> LLJJJIL = C13BV.INSTANCE;
    public final ViewOnLayoutChangeListenerC2189561Amg LLJJJJJIL = new ViewOnLayoutChangeListenerC2189561Amg(this, 0);
    public final C21668219r6 LLJJJJLIIL = new InterfaceC21676019sM() { // from class: X.19r6
        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
        }

        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            return !this.LL.LLJJJJ;
        }
    };

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hpw;
    }

    public final void hp() {
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (this.LLJJJJ || this.LLJJJIL.size() <= 4) ? -2 : LLJJL;
        C786410Ut5.W5(recyclerView, layoutParams);
    }

    public final void kp() {
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.getVisibility() != 0) {
            View view = this.LLJJIJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        boolean z = this.LLJJJJ && recyclerView.canScrollVertically(1);
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(z ? 0 : 4, view2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            recyclerView.clearOnScrollListeners();
        }
        RecyclerView recyclerView2 = this.LLJJI;
        if (recyclerView2 != null) {
            recyclerView2.removeOnLayoutChangeListener(this.LLJJJJJIL);
        }
        RecyclerView recyclerView3 = this.LLJJI;
        if (recyclerView3 != null) {
            recyclerView3.removeOnItemTouchListener(this.LLJJJJLIIL);
        }
        super.onDestroy();
    }

    public final void ip(List<SuperFanPrivilegeInfo> list) {
        boolean z;
        float f;
        int i;
        int i2 = 0;
        if (list.size() > 4) {
            z = true;
        } else {
            z = false;
            this.LLJJJJ = false;
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LJZL(i2, linearLayout);
        }
        C16F5 c16f5 = this.LLJJIJIL;
        if (c16f5 != null) {
            if (this.LLJJJJ) {
                i = 2131844301;
            } else {
                i = 2131854568;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
        }
        View view = this.LLJJJ;
        if (view != null) {
            if (this.LLJJJJ) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            C786410Ut5.Ab(view, f);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData<C1AAA> mutableLiveData;
        super.onViewCreated(view);
        this.LLJJI = (RecyclerView) view.findViewById(R.id.bvp);
        this.LLJJIJI = view.findViewById(R.id.bvk);
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.hfu);
        this.LLJJIJIL = (C16F5) view.findViewById(R.id.hg8);
        this.LLJJJ = view.findViewById(R.id.hg1);
        this.LLJJIII = new C446030HeL();
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
            recyclerView.setAdapter(this.LLJJIII);
            recyclerView.setItemAnimator(null);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            final int i = LLJJLIIIJLLLLLLLZ;
            recyclerView.addItemDecoration(new C0DXR(i) { // from class: X.0HeT
                public final int LL;
                public final int LLILLJJLI = 4;

                {
                    this.LL = i;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i2;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition == -1) {
                        return;
                    }
                    if (childAdapterPosition >= this.LLILLJJLI) {
                        i2 = this.LL;
                    } else {
                        i2 = 0;
                    }
                    rect.top = i2;
                }
            });
            recyclerView.addOnScrollListener(new AsS54S0100000_28(this, 5));
            recyclerView.addOnLayoutChangeListener(this.LLJJJJJIL);
            recyclerView.addOnItemTouchListener(this.LLJJJJLIIL);
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 14), linearLayout);
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel = (JoinDialogProxyViewModel) C723850SaN.LJFF(this, "super_fan_privilege_view_model");
        if (joinDialogProxyViewModel != null && (mutableLiveData = joinDialogProxyViewModel.LLIZ) != null) {
            getActualLifecycleOwner();
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 67));
        }
    }
}
