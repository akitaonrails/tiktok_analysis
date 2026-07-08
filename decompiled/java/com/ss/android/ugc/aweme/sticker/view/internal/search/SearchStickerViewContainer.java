package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC1406770miB;
import X.AbstractC1630410sWt;
import X.AbstractC214823195h;
import X.C03AQ;
import X.C0DXR;
import X.C0WZX;
import X.C11NJ;
import X.C11PQ;
import X.C11RK;
import X.C11VU;
import X.C1406600mhu;
import X.C1406790miD;
import X.C1629930sW7;
import X.C1630430sWv;
import X.C1630880sXe;
import X.C1635820sfc;
import X.C1635910sfl;
import X.C1636000sfu;
import X.C1636150sg9;
import X.C1636520sgk;
import X.C1636660sgy;
import X.C1636780shA;
import X.C1698180uIC;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C19EG;
import X.C2097908Jt;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC1641470soj;
import X.InterfaceC1391500mJY;
import X.InterfaceC1624480sNK;
import X.InterfaceC1635560sfC;
import X.InterfaceC1635930sfn;
import X.InterfaceC1636820shE;
import Y.ACListenerS159S0100000_25;
import Y.AObserverS205S0100000_1;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS125S0100000_25;
import Y.AfS194S0100000_25;
import Y.AsS51S0100000_25;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class SearchStickerViewContainer implements InterfaceC1635930sfn, TextView.OnEditorActionListener, GenericLifecycleObserver {
    public final C19EG LL;
    public final View LLILLJJLI;
    public final C1630880sXe LLILLL;
    public final InterfaceC1636820shE LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final Function0<Unit> LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public View LLJ;
    public RelativeLayout LLJI;
    public View LLJIJIL;
    public EditText LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public RecyclerView LLJJ;
    public LinearLayout LLJJI;
    public LinearLayout LLJJIII;
    public C1636660sgy LLJJIJI;
    public C1636150sg9 LLJJIJIIJIL;
    public RecyclerView LLJJIJIL;
    public C03AQ LLJJJ;
    public LinearLayout LLJJJIL;
    public final InterfaceC1624480sNK LLJJJJ;
    public final C11RK<C1635910sfl> LLJJJJJIL;
    public final C11RK<AbstractC1630410sWt> LLJJJJLIIL;
    public final MutableLiveData<AbstractC1406770miB> LLJJL;
    public final MutableLiveData<Boolean> LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public final AwS569S0100000_25 LLJLIL;
    public int LLJLILLLLZIIL;
    public LinearLayoutManager LLJLL;
    public final C11PQ<String> LLJLLIL;
    public String LLJLLL;
    public final C11NJ LLJZ;
    public final C1636780shA LLJZIJLIL;
    public final ARunnableS125S0100000_25 LLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestory() {
        this.LLJZ.LJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        EditText editText = this.LLJILJIL;
        if (editText == null) {
            editText = null;
        }
        editText.setText((CharSequence) null);
        LIZLLL(false);
    }

    @Override // X.InterfaceC1635930sfn
    public final C19475711Hn LIZIZ() {
        C11RK<AbstractC1630410sWt> c11rk = this.LLJJJJLIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final boolean LJ() {
        Boolean value = this.LLJJLIIIJLLLLLLLZ.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final C19475711Hn LJFF() {
        C11RK<C1635910sfl> c11rk = this.LLJJJJJIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final void LJI() {
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView recyclerView2 = this.LLJJ;
            ((GridLayoutManager) (recyclerView2 != null ? recyclerView2 : null).getLayoutManager()).LJIJI(this.LLJZIJLIL);
        }
    }

    public final void LJIIIZ() {
        this.LLJJL.setValue(new C1406790miD(true));
        EditText editText = this.LLJILJIL;
        if (editText == null) {
            editText = null;
        }
        HandlerHook.viewPostDelay(editText, new ARunnableS125S0100000_25(this, 112), 100L);
        C1636150sg9 c1636150sg9 = this.LLJJIJIIJIL;
        if (c1636150sg9 == null) {
            c1636150sg9 = null;
        }
        c1636150sg9.setState((Enum) EnumC1641470soj.NONE);
        LinearLayout linearLayout = this.LLJJIII;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        if (Intrinsics.LJFF(this.LLILZ.a02(), C1629930sW7.LIZ)) {
            LJIIIIZZ(false);
        }
        if (this.LLJLILLLLZIIL > 0) {
            this.LLJJJJJIL.onNext(new C1635910sfl(true, true, false, ((int) C11VU.LIZIZ(300.0f, this.LL)) + this.LLJLILLLLZIIL));
        } else {
            View view = this.LLJ;
            HandlerHook.viewPostDelay(view != null ? view : null, this.LLL, 100L);
        }
    }

    public final boolean LJIIJ() {
        return this.LLILZIL == 1;
    }

    @Override // X.InterfaceC1635930sfn
    public final void x4() {
        EditText editText = this.LLJILJIL;
        if (editText == null) {
            editText = null;
        }
        KeyboardUtils.LIZ(this.LL, editText);
        this.LLJJL.setValue(new C1406790miD(false));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        if (LJ()) {
            x4();
        }
    }

    @Override // X.InterfaceC1635930sfn
    public final MutableLiveData LIZ() {
        return this.LLJJL;
    }

    public final boolean LIZJ(Effect effect) {
        if (effect == null) {
            effect = this.LLJJJJ.LLILIL();
        }
        if (effect == null) {
            return false;
        }
        C1636660sgy c1636660sgy = this.LLJJIJI;
        RecyclerView recyclerView = null;
        if (c1636660sgy == null) {
            c1636660sgy = null;
        }
        Iterator it2 = c1636660sgy.LLILZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Effect) it2.next()).getId(), effect.getId())) {
                RecyclerView recyclerView2 = this.LLJJ;
                if (recyclerView2 != null) {
                    recyclerView = recyclerView2;
                }
                if (recyclerView.getVisibility() != 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(boolean z) {
        int i;
        x4();
        this.LLJJJJJIL.onNext(new C1635910sfl(false, LIZJ(null), z, ((int) C11VU.LIZIZ(300.0f, this.LL)) + this.LLJLILLLLZIIL));
        if (z && (i = this.LLILZLL) != 1 && i != 2) {
            this.LLJJJJLIIL.onNext(C1630430sWv.LIZ);
            this.LLJJL.setValue(new C1406600mhu("click_cancel"));
        }
    }

    public final void LJII(boolean z) {
        EditText editText = this.LLJILJIL;
        RecyclerView recyclerView = null;
        if (editText == null) {
            editText = null;
        }
        String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8Yr+kSnfiy0XURUWbVwsR56+hkZHIeoP81xnEzO5VcnrGshQAnCZPOKfTlJVYbM=", null)).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (z) {
            RecyclerView recyclerView2 = this.LLJJ;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            if (recyclerView.getVisibility() == 0) {
                x4();
            }
        }
        System.currentTimeMillis();
        this.LLJLLIL.onNext(string);
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LLILZ.bJ();
        }
        LinearLayout linearLayout = this.LLJJJIL;
        TextView textView = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
        TextView textView2 = this.LLJILLL;
        if (textView2 != null) {
            textView = textView2;
        }
        C786410Ut5.LLIL(textView, 8);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        LJII(false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0shA] */
    public SearchStickerViewContainer(final C19EG c19eg, View view, C1630880sXe c1630880sXe, InterfaceC1636820shE interfaceC1636820shE, int i, int i2, C1635820sfc c1635820sfc, Function0<Unit> function0, LifecycleOwner lifecycleOwner) {
        View viewLJLLLL;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = c1630880sXe;
        this.LLILZ = interfaceC1636820shE;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = function0;
        this.LLIZLLLIL = lifecycleOwner;
        InterfaceC1624480sNK interfaceC1624480sNK = c1630880sXe.LIZ;
        this.LLJJJJ = interfaceC1624480sNK;
        this.LLJJJJJIL = new C11RK<>();
        this.LLJJJJLIIL = new C11RK<>();
        MutableLiveData<AbstractC1406770miB> mutableLiveData = new MutableLiveData<>();
        this.LLJJL = mutableLiveData;
        new MutableLiveData();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
        this.LLJLIL = new AwS569S0100000_25(this, 426);
        C11PQ<String> c11pq = new C11PQ<>();
        this.LLJLLIL = c11pq;
        this.LLJLLL = "";
        C11NJ c11nj = new C11NJ();
        this.LLJZ = c11nj;
        this.LLJZIJLIL = new AbstractC214823195h() { // from class: X.0shA
            @Override // X.AbstractC214823195h
            public final int LJFF(int i3) {
                if (i3 != 0) {
                    C1636660sgy c1636660sgy = this.LJ.LLJJIJI;
                    if (c1636660sgy == null) {
                        c1636660sgy = null;
                    }
                    if (i3 != c1636660sgy.getItemCount() - 1) {
                        return 1;
                    }
                }
                return 4;
            }
        };
        this.LLL = new ARunnableS125S0100000_25(this, 54);
        C11VU.LIZIZ(12.0f, c19eg);
        if (LJIIJ()) {
            viewLJLLLL = view;
        } else {
            viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.wcb));
        }
        this.LLJ = viewLJLLLL;
        this.LLJI = (RelativeLayout) (viewLJLLLL == null ? null : viewLJLLLL).findViewById(R.id.tpd);
        View view2 = this.LLJ;
        (view2 == null ? null : view2).findViewById(R.id.u9b);
        View view3 = this.LLJ;
        this.LLJIJIL = (view3 == null ? null : view3).findViewById(R.id.cou);
        View view4 = this.LLJ;
        this.LLJILJIL = (EditText) (view4 == null ? null : view4).findViewById(R.id.hdg);
        View view5 = this.LLJ;
        this.LLJILJILJ = (TextView) (view5 == null ? null : view5).findViewById(R.id.tv_search_cancel);
        View view6 = this.LLJ;
        this.LLJILLL = (TextView) (view6 == null ? null : view6).findViewById(R.id.tv_search_null_result);
        View view7 = this.LLJ;
        this.LLJJ = (RecyclerView) (view7 == null ? null : view7).findViewById(R.id.w6_);
        View view8 = this.LLJ;
        this.LLJJIII = (LinearLayout) (view8 == null ? null : view8).findViewById(R.id.uas);
        View view9 = this.LLJ;
        this.LLJJI = (LinearLayout) (view9 == null ? null : view9).findViewById(R.id.w6b);
        View view10 = this.LLJ;
        this.LLJJJIL = (LinearLayout) (view10 == null ? null : view10).findViewById(R.id.uae);
        View view11 = this.LLJ;
        this.LLJJIJIL = (RecyclerView) (view11 == null ? null : view11).findViewById(R.id.tvj);
        View view12 = this.LLJ;
        ViewGroup viewGroup = (ViewGroup) (view12 == null ? null : view12).findViewById(R.id.uar);
        C1636150sg9 c1636150sg9 = new C1636150sg9(viewGroup.getContext(), C2097908Jt.LIZJ(new Pair(EnumC1641470soj.LOADING, new AwS604S0100000_25(this, 933))), EnumC1641470soj.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C11VU.LIZIZ(100.0f, c19eg));
        layoutParams.gravity = 48;
        C786410Ut5.q7(c1636150sg9, layoutParams);
        viewGroup.addView(c1636150sg9);
        this.LLJJIJIIJIL = c1636150sg9;
        if (c1635820sfc.LJIIJ.LJI && (linearLayout2 = (LinearLayout) view.findViewById(R.id.gvw)) != null) {
            C786410Ut5.LJZL(0, linearLayout2);
            C786410Ut5.R7(linearLayout2, new ACListenerS159S0100000_25(this, 36));
        }
        EditText editText = this.LLJILJIL;
        (editText == null ? null : editText).setHint(2131833828);
        TextView textView = this.LLJILJILJ;
        (textView == null ? null : textView).setText(R.string.f1_);
        TextView textView2 = this.LLJILLL;
        (textView2 == null ? null : textView2).setText(2131833824);
        RecyclerView recyclerView = this.LLJJ;
        recyclerView = recyclerView == null ? null : recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(c19eg) { // from class: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$getLayoutManager$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return true;
            }
        });
        recyclerView.setItemViewCacheSize(4);
        recyclerView.setVerticalFadingEdgeEnabled(true);
        recyclerView.setFadingEdgeLength(20);
        recyclerView.addItemDecoration(new C1636000sfu(0));
        InterfaceC1635560sfC interfaceC1635560sfC = c1630880sXe.LJ;
        C1636520sgk c1636520sgk = c1630880sXe.LJFF;
        RecyclerView recyclerView2 = this.LLJJ;
        C1636660sgy c1636660sgy = new C1636660sgy(c19eg, interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1636820shE, c1636520sgk, mutableLiveData, (recyclerView2 == null ? null : recyclerView2).getLayoutManager(), i2, new AwS569S0100000_25(this, 1151));
        this.LLJJIJI = c1636660sgy;
        RecyclerView recyclerView3 = this.LLJJ;
        (recyclerView3 == null ? null : recyclerView3).setAdapter(c1636660sgy);
        recyclerView.addOnScrollListener(new AsS51S0100000_25(this, 9));
        this.LLJLL = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView recyclerView4 = this.LLJJIJIL;
        recyclerView4 = recyclerView4 == null ? null : recyclerView4;
        recyclerView4.setLayoutManager(new LinearLayoutManager(c19eg) { // from class: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$getLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return ((Boolean) this.LL.LLJLIL.invoke()).booleanValue();
            }
        });
        recyclerView4.setItemViewCacheSize(4);
        this.LLJJJ = new C03AQ(new AwS604S0100000_25(this, 932));
        recyclerView4.addItemDecoration(new C0DXR() { // from class: X.0DXe
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view13, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                rect.bottom = (int) C11VU.LIZ(12.0f);
                rect.left = (int) C11VU.LIZ(28.0f);
            }
        });
        C03AQ c03aq = this.LLJJJ;
        recyclerView4.setAdapter(c03aq == null ? null : c03aq);
        recyclerView4.addOnScrollListener(new AsS51S0100000_25(this, 10));
        View view13 = this.LLJ;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0shI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view14) {
            }
        }, view13 == null ? null : view13);
        TextView textView3 = this.LLJILJILJ;
        C786410Ut5.T7(textView3 == null ? null : textView3, new ACListenerS159S0100000_25(this, 33));
        EditText editText2 = this.LLJILJIL;
        (editText2 == null ? null : editText2).setOnEditorActionListener(this);
        EditText editText3 = this.LLJILJIL;
        (editText3 == null ? null : editText3).addTextChangedListener(new C1698180uIC(this, 3));
        EditText editText4 = this.LLJILJIL;
        C786410Ut5.N7(editText4 == null ? null : editText4, new ACListenerS159S0100000_25(this, 34));
        View view14 = this.LLJIJIL;
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 35), view14 == null ? null : view14);
        if (!LJIIJ()) {
            new SoftKeyBoardListener(c19eg, null, null, lifecycleOwner, 4).LIZIZ(new InterfaceC1391500mJY() { // from class: X.0shF
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i3) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i3) {
                    if (!this.LL.LJ()) {
                        SearchStickerViewContainer searchStickerViewContainer = this.LL;
                        searchStickerViewContainer.LLJLILLLLZIIL = i3;
                        searchStickerViewContainer.LLJJLIIIJLLLLLLLZ.setValue(Boolean.TRUE);
                    }
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i3) {
                    if (this.LL.LJ()) {
                        this.LL.LLJJLIIIJLLLLLLLZ.setValue(Boolean.FALSE);
                    }
                }
            });
        }
        interfaceC1624480sNK.LJII().LIZ().observe(this.LLIZLLLIL, new AObserverS227S0100000_25(this, 144));
        LinearLayout linearLayout3 = this.LLJJJIL;
        C786410Ut5.LJZL(0, linearLayout3 == null ? null : linearLayout3);
        LinearLayout linearLayout4 = this.LLJJJIL;
        linearLayout4 = linearLayout4 == null ? null : linearLayout4;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        C786410Ut5.d6(linearLayout4, layoutParams2);
        RecyclerView recyclerView5 = this.LLJJIJIL;
        recyclerView5 = recyclerView5 == null ? null : recyclerView5;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        View view15 = this.LLJ;
        layoutParams3.topMargin = (int) C11VU.LIZIZ(8.0f, (view15 == null ? null : view15).getContext());
        C786410Ut5.p6(recyclerView5, layoutParams3);
        interfaceC1636820shE.n02().observe(this.LLIZLLLIL, new AObserverS227S0100000_25(this, 145));
        interfaceC1636820shE.LJJIJ().observe(this.LLIZLLLIL, new AObserverS227S0100000_25(this, 146));
        if (!LJIIJ()) {
            interfaceC1636820shE.eJ1().observe(this.LLIZLLLIL, new AObserverS227S0100000_25(this, 147));
        }
        interfaceC1636820shE.getKeyword().observe(this.LLIZLLLIL, new AObserverS227S0100000_25(this, 142));
        interfaceC1636820shE.qZ().observe(this.LLIZLLLIL, new AObserverS205S0100000_1(this, 1));
        lifecycleOwner.getLifecycle().addObserver(this);
        c11nj.LIZ(c11pq.LJJI(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 221)));
        if (LJIIJ()) {
            View view16 = this.LLJ;
            linearLayout = null;
            (view16 == null ? null : view16).setBackground(null);
            View view17 = this.LLJ;
            C786410Ut5.LJLLLLLL(0, view17 == null ? null : view17);
            TextView textView4 = this.LLJILJILJ;
            C786410Ut5.LLIL(textView4 == null ? null : textView4, 8);
            RelativeLayout relativeLayout = this.LLJI;
            relativeLayout = relativeLayout == null ? null : relativeLayout;
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams4.leftMargin = (int) C11VU.LIZIZ(8.5f, c19eg);
            C786410Ut5.e6(relativeLayout, layoutParams4);
            RecyclerView recyclerView6 = this.LLJJ;
            recyclerView6 = recyclerView6 == null ? null : recyclerView6;
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) recyclerView6.getLayoutParams();
            layoutParams5.leftMargin = 0;
            layoutParams5.rightMargin = 0;
            C786410Ut5.p6(recyclerView6, layoutParams5);
            EditText editText5 = this.LLJILJIL;
            (editText5 == null ? null : editText5).setFocusableInTouchMode(false);
        } else {
            linearLayout = null;
            View view18 = this.LLJ;
            C786410Ut5.LJLLLLLL(8, view18 == null ? null : view18);
            TextView textView5 = this.LLJILJILJ;
            C786410Ut5.LLIL(textView5 == null ? null : textView5, 0);
            EditText editText6 = this.LLJILJIL;
            (editText6 == null ? null : editText6).setFocusableInTouchMode(true);
        }
        if (c1635820sfc.LJ > 0) {
            View view19 = this.LLJ;
            C11VU.LIZIZ(c1635820sfc.LJ, (view19 == null ? linearLayout : view19).getContext());
            LinearLayout linearLayout5 = this.LLJJI;
            ViewGroup.LayoutParams layoutParams6 = (linearLayout5 == null ? linearLayout : linearLayout5).getLayoutParams();
            View view20 = this.LLJ;
            C11VU.LIZIZ(68.0f, (view20 == null ? linearLayout : view20).getContext());
            layoutParams6.height = -1;
            LinearLayout linearLayout6 = this.LLJJI;
            C786410Ut5.d6(linearLayout6 == null ? linearLayout : linearLayout6, layoutParams6);
        }
    }
}
