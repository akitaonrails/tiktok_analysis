package com.ss.android.ugc.aweme.favorites.business.video;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C098200Yq;
import X.C0HU6;
import X.C0HYB;
import X.C0IDL;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1206420hV2;
import X.C1206590hVJ;
import X.C1260280itu;
import X.C128Y;
import X.C1342130l1v;
import X.C14K9;
import X.C1685300txQ;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19LV;
import X.C20533215Wg;
import X.C20684815ws;
import X.C21521319Kh;
import X.C21521419Ki;
import X.C21521519Kj;
import X.C21521619Kk;
import X.C21647019ng;
import X.C2200821BBo;
import X.C2204961BRm;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C462900IDg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC444370Hbf;
import X.InterfaceC1206370hUx;
import X.InterfaceC1206390hUz;
import X.InterfaceC1258040iqI;
import X.InterfaceC19566711gv;
import X.InterfaceC19566811gw;
import X.InterfaceC21506019Ek;
import X.ViewOnFocusChangeListenerC21523319Lb;
import X.ViewTreeObserverOnGlobalLayoutListenerC21523919Lh;
import Y.AAListenerS327S0100000_16;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS166S0100000_32;
import Y.ALAdapterS26S0200000_32;
import Y.AObserverS210S0100000_6;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoriteVideoTabRootFragmentData;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.favorites.business.video.search.FavoriteSearchInputFragment;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class FavoriteVideoTabRootFragment extends Fragment implements InterfaceC1258040iqI, InterfaceC19566711gv, InterfaceC1206390hUz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlHELIOSJyogO2s6ICs2J2sKKDk8Oiw4LBk6LCAjHS4xGiojPQkhKSIhLCEn";
    public Bundle LL;
    public boolean LLILLL;
    public C21647019ng LLILZ;
    public C21521319Kh LLILZLL;
    public RecyclerView LLIZ;
    public ValueAnimator LLIZLLLIL;
    public ViewTreeObserverOnGlobalLayoutListenerC21523919Lh LLJI;
    public C21521619Kk LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public C1260280itu LLJILLL;
    public EditText LLJJ;
    public ViewGroup LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public Boolean LLJJIJIL;
    public ValueAnimator LLJJJ;
    public C21521519Kj LLJJJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1430));
    public final C0HU6 LLILZIL = new C0HU6(new C1342130l1v(947.29f), new C1342130l1v(61.56f));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1431));
    public final C21521419Ki LLJJJJ = new InterfaceC21506019Ek() { // from class: X.19Ki
        @Override // X.InterfaceC21506019Ek
        public final /* synthetic */ void onBackStackChangeCancelled() {
        }

        @Override // X.InterfaceC21506019Ek
        public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        }

        @Override // X.InterfaceC21506019Ek
        public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
        }

        @Override // X.InterfaceC21506019Ek
        public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        }

        @Override // X.InterfaceC21506019Ek
        public final void onBackStackChanged() throws Throwable {
            RecyclerView recyclerView;
            Editable editableLLJILLL;
            EditText editText;
            View view;
            View view2;
            int iOrdinal = this.LL.RR().ordinal();
            if (iOrdinal == 0) {
                FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = this.LL;
                EditText editText2 = favoriteVideoTabRootFragment.LLJJ;
                if (editText2 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null))) != null && editableLLJILLL.length() != 0 && (editText = favoriteVideoTabRootFragment.LLJJ) != null) {
                    editText.setText("");
                }
                Fragment fragmentLJJJJZI = this.LL.getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
                if (fragmentLJJJJZI != null) {
                    FavoriteVideoTabRootFragment favoriteVideoTabRootFragment2 = this.LL;
                    View view3 = fragmentLJJJJZI.getView();
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    C19EH c19ehLJIIJ = favoriteVideoTabRootFragment2.getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIL(fragmentLJJJJZI, Lifecycle.State.RESUMED);
                    c19ehLJIIJ.LJIIJ();
                    C1260280itu c1260280ituPR = favoriteVideoTabRootFragment2.PR();
                    if (c1260280ituPR == null || !c1260280ituPR.LIZLLL()) {
                        View viewLJJLIIIJILLIZJL = favoriteVideoTabRootFragment2.LJJLIIIJILLIZJL();
                        if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                }
                FavoriteVideoTabRootFragment favoriteVideoTabRootFragment3 = this.LL;
                favoriteVideoTabRootFragment3.LLILLL = false;
                favoriteVideoTabRootFragment3.MR();
                this.LL.WR();
            } else if (iOrdinal == 1) {
                this.LL.OR();
                Fragment fragmentLJJJJZI2 = this.LL.getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
                if (fragmentLJJJJZI2 != null && (view = fragmentLJJJJZI2.getView()) != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                Fragment fragmentLJJJJZI3 = this.LL.getChildFragmentManager().LJJJJZI("favorite_video_tab_search_input");
                if (fragmentLJJJJZI3 != null) {
                    C19EH c19ehLJIIJ2 = this.LL.getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ2.LJIL(fragmentLJJJJZI3, Lifecycle.State.RESUMED);
                    c19ehLJIIJ2.LJIIJ();
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C1954807lC();
                }
                this.LL.OR();
                Fragment fragmentLJJJJZI4 = this.LL.getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
                if (fragmentLJJJJZI4 != null && (view2 = fragmentLJJJJZI4.getView()) != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            }
            this.LL.kS();
            FavoriteVideoTabRootFragment favoriteVideoTabRootFragment4 = this.LL;
            Fragment fragmentLJJJJZI5 = favoriteVideoTabRootFragment4.getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
            if (fragmentLJJJJZI5 != null) {
                fragmentLJJJJZI5.setUserVisibleHint(favoriteVideoTabRootFragment4.RR() == EnumC444370Hbf.LL);
            }
            Fragment fragmentLJJJJZI6 = favoriteVideoTabRootFragment4.getChildFragmentManager().LJJJJZI("favorite_video_tab_search_input");
            if (fragmentLJJJJZI6 != null) {
                fragmentLJJJJZI6.setUserVisibleHint(favoriteVideoTabRootFragment4.RR() == EnumC444370Hbf.LLILLJJLI);
            }
            Fragment fragmentLJJJJZI7 = favoriteVideoTabRootFragment4.getChildFragmentManager().LJJJJZI("favorite_video_tab_search_result");
            if (fragmentLJJJJZI7 != null) {
                fragmentLJJJJZI7.setUserVisibleHint(favoriteVideoTabRootFragment4.RR() == EnumC444370Hbf.LLILLL);
            }
            this.LL.mS();
            if (this.LL.RR() != EnumC444370Hbf.LL) {
                this.LL.WR();
            }
        }
    };

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    public final void OR() {
        C21521319Kh c21521319Kh = this.LLILZLL;
        RecyclerView recyclerView = this.LLIZ;
        if (c21521319Kh != null && recyclerView != null) {
            recyclerView.removeOnScrollListener(c21521319Kh);
        }
        this.LLIZ = null;
    }

    public final C1260280itu PR() {
        C1260280itu c1260280itu = this.LLJILLL;
        if (c1260280itu != null) {
            return c1260280itu;
        }
        View view = getView();
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof C1260280itu) {
                    C1260280itu c1260280itu2 = (C1260280itu) parent;
                    this.LLJILLL = c1260280itu2;
                    return c1260280itu2;
                }
            }
        }
        return null;
    }

    public final FavoriteSearchViewModel UR() {
        return (FavoriteSearchViewModel) this.LLJ.getValue();
    }

    public final void cS() {
        RecyclerView recyclerView;
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup == null) {
            return;
        }
        if (RR() == EnumC444370Hbf.LL) {
            C1260280itu c1260280ituPR = PR();
            if (c1260280ituPR == null || c1260280ituPR.LIZLLL()) {
                View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
                    hS(((Number) this.LLILLJJLI.getValue()).intValue(), viewGroup, recyclerView);
                }
            } else {
                this.LLILLL = false;
                C786410Ut5.bd(SR(viewGroup), viewGroup);
                C786410Ut5.R4(0.0f, viewGroup);
            }
            if (this.LLIZ == null) {
                MR();
            }
        }
        WR();
    }

    public final void kS() {
        EditText editText = this.LLJJ;
        if (editText == null) {
            return;
        }
        int iOrdinal = RR().ordinal();
        if (iOrdinal == 0) {
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
            editText.setCursorVisible(false);
        } else {
            if (iOrdinal == 1) {
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                editText.setCursorVisible(true);
                editText.setImeOptions((editText.getImeOptions() & (-256)) | 3);
                HandlerHook.viewPost(editText, new ARunnableS98S0200000_29(this, editText, 16));
                return;
            }
            if (iOrdinal != 2) {
                throw new C1954807lC();
            }
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.setCursorVisible(true);
            editText.setImeOptions((editText.getImeOptions() & (-256)) | 3);
        }
    }

    public final void mS() {
        final View view;
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup == null) {
            return;
        }
        int iOrdinal = RR().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            if (viewGroup.getAlpha() < 1.0f) {
                C786410Ut5.bd(0.0f, viewGroup);
                C786410Ut5.R4(1.0f, viewGroup);
            } else {
                C786410Ut5.bd(0.0f, viewGroup);
                C786410Ut5.R4(1.0f, viewGroup);
            }
        }
        boolean z = RR() != EnumC444370Hbf.LL;
        boolean z2 = this.LLILLL;
        final View view2 = this.LLJJIJI;
        if (view2 != null) {
            if ((view2.getVisibility() == 0) == z || (view = this.LLJJIII) == null) {
                return;
            }
            ValueAnimator valueAnimator = this.LLJJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int measuredWidth = z ? view2.getMeasuredWidth() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            final float f = z ? 1.0f : 0.0f;
            if (!z2) {
                C786410Ut5.LJLLLLLL(z ? 0 : 4, view2);
                C426750GoL.LJIIIZ(view, null, null, Integer.valueOf(measuredWidth), null, false, 16);
                C786410Ut5.T4(view2, f);
                return;
            }
            final float alpha = view2.getAlpha();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            final int marginEnd = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06PT
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    View view3 = view2;
                    float f2 = alpha;
                    C786410Ut5.T4(view3, f2 + ((f - f2) * fFloatValue));
                    C426750GoL.LJIIIZ(view, null, null, Integer.valueOf((int) (marginEnd + ((measuredWidth - r2) * fFloatValue))), null, false, 16);
                }
            });
            C786410Ut5.LJLLLLLL(0, view2);
            if (!z) {
                valueAnimatorOfFloat.addListener(new AAListenerS327S0100000_16(view2, 7));
            }
            valueAnimatorOfFloat.start();
            this.LLJJJ = valueAnimatorOfFloat;
        }
    }

    public final void nS() {
        Editable editableLLJILLL;
        EditText editText = this.LLJJ;
        String string = null;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null))) != null) {
            string = editableLLJILLL.toString();
        }
        boolean z = !(string == null || string.length() == 0);
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(z ? 0 : 8, view);
        }
        EditText editText2 = this.LLJJ;
        if (editText2 != null) {
            C426750GoL.LJIIIZ(editText2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(z ? 38 : 8))), null, false, 16);
        }
    }

    public final void oS() {
        EditText editText = this.LLJJ;
        if (editText == null) {
            return;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null));
        boolean z = editableLLJILLL == null || editableLLJILLL.length() == 0;
        if (Intrinsics.LJFF(this.LLJJIJIL, Boolean.valueOf(z))) {
            return;
        }
        this.LLJJIJIL = Boolean.valueOf(z);
        editText.setEllipsize(z ? TextUtils.TruncateAt.END : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = this.LLJILJIL;
        if (view != null) {
            if (this.LLJIJIL != null) {
                C14K9.LJIJJ(view, null);
            }
            this.LLJIJIL = null;
            ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh = this.LLJI;
            if (viewTreeObserverOnGlobalLayoutListenerC21523919Lh != null && view.getViewTreeObserver().isAlive()) {
                C786410Ut5.C3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523919Lh);
            }
            this.LLJILJIL = null;
            this.LLJI = null;
        }
        ValueAnimator valueAnimator = this.LLJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJJ = null;
        ValueAnimator valueAnimator2 = this.LLIZLLLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLIZLLLIL = null;
        iS(false);
        FavoriteSearchViewModel favoriteSearchViewModelUR = UR();
        if (favoriteSearchViewModelUR != null) {
            if (favoriteSearchViewModelUR.LLJJIJI == this.LLJJJIL) {
                favoriteSearchViewModelUR.LLJJIJI = null;
            }
        }
        this.LLJJJIL = null;
        C21647019ng c21647019ng = this.LLILZ;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LLILZ = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJILLL = null;
        OR();
        this.LLILZLL = null;
        getChildFragmentManager().LLD(this.LLJJJJ);
        super.onDestroyView();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        InterfaceC1258040iqI interfaceC1258040iqI;
        InterfaceC1258040iqI interfaceC1258040iqI2;
        int iOrdinal = RR().ordinal();
        if (iOrdinal == 0) {
            C128Y c128yLJJJJZI = getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
            if (!(c128yLJJJJZI instanceof InterfaceC1258040iqI) || (interfaceC1258040iqI = (InterfaceC1258040iqI) c128yLJJJJZI) == null) {
                return null;
            }
            return interfaceC1258040iqI.LJJLIIIJILLIZJL();
        }
        if (iOrdinal == 1) {
            return null;
        }
        if (iOrdinal != 2) {
            throw new C1954807lC();
        }
        C128Y c128yLJJJJZI2 = getChildFragmentManager().LJJJJZI("favorite_video_tab_search_result");
        if (!(c128yLJJJJZI2 instanceof InterfaceC1258040iqI) || (interfaceC1258040iqI2 = (InterfaceC1258040iqI) c128yLJJJJZI2) == null) {
            return null;
        }
        return interfaceC1258040iqI2.LJJLIIIJILLIZJL();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.19Kh] */
    public final void MR() {
        RecyclerView recyclerView;
        ViewGroup viewGroup;
        if (RR() != EnumC444370Hbf.LL) {
            return;
        }
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (!(viewLJJLIIIJILLIZJL instanceof RecyclerView) || (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) == null || (viewGroup = this.LLJJI) == null) {
            return;
        }
        OR();
        final int iIntValue = ((Number) this.LLILLJJLI.getValue()).intValue();
        if (this.LLILZLL == null) {
            this.LLILZLL = new AbstractC1585810rMx() { // from class: X.19Kh
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                    Context context;
                    int i3;
                    Context context2;
                    if (recyclerView2.computeVerticalScrollOffset() >= iIntValue) {
                        FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = this;
                        if (!favoriteVideoTabRootFragment.LLILLL) {
                            favoriteVideoTabRootFragment.LLILLL = true;
                            ViewGroup viewGroup2 = favoriteVideoTabRootFragment.LLJJI;
                            if (viewGroup2 != null && (context2 = favoriteVideoTabRootFragment.getContext()) != null) {
                                float fSR = FavoriteVideoTabRootFragment.SR(viewGroup2);
                                C786410Ut5.bd(fSR, viewGroup2);
                                C786410Ut5.R4(0.0f, viewGroup2);
                                C21647019ng c21647019ng = favoriteVideoTabRootFragment.LLILZ;
                                if (c21647019ng != null) {
                                    c21647019ng.LIZ();
                                }
                                C21647019ng c21647019ng2 = new C21647019ng(context2, viewGroup2, new C19746312Np(EnumC19746112Nn.SPRING, favoriteVideoTabRootFragment.LLILZIL, C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)), new C19746412Nq("translationY", new C0HV5(fSR, 0.0f)))), false);
                                c21647019ng2.LJI = c21647019ng2.LIZIZ(new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 200L), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)), new C19746412Nq("translationY", new C0HV5(fSR, 0.0f)))));
                                c21647019ng2.LJI(true);
                                favoriteVideoTabRootFragment.LLILZ = c21647019ng2;
                            }
                            this.WR();
                            FavoriteSearchViewModel favoriteSearchViewModelUR = this.UR();
                            if (favoriteSearchViewModelUR != null && Intrinsics.LJFF(favoriteSearchViewModelUR.LLILLJJLI.getValue(), Boolean.TRUE) && favoriteSearchViewModelUR.LLJIJIL && (i3 = favoriteSearchViewModelUR.LLJI) >= 0) {
                                C0HYB c0hyb = C0HYB.LIZ;
                                String str = favoriteSearchViewModelUR.LLIZLLLIL;
                                String str2 = favoriteSearchViewModelUR.LLJ;
                                String str3 = favoriteSearchViewModelUR.LLJILJIL;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                c0hyb.getClass();
                                C0HYB.LIZ(i3, str, str2, "search_box", str3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    FavoriteVideoTabRootFragment favoriteVideoTabRootFragment2 = this;
                    if (!favoriteVideoTabRootFragment2.LLILLL) {
                        return;
                    }
                    favoriteVideoTabRootFragment2.LLILLL = false;
                    ViewGroup viewGroup3 = favoriteVideoTabRootFragment2.LLJJI;
                    if (viewGroup3 != null && (context = favoriteVideoTabRootFragment2.getContext()) != null) {
                        float fSR2 = FavoriteVideoTabRootFragment.SR(viewGroup3);
                        C21647019ng c21647019ng3 = favoriteVideoTabRootFragment2.LLILZ;
                        if (c21647019ng3 != null) {
                            c21647019ng3.LIZ();
                        }
                        C21647019ng c21647019ng4 = new C21647019ng(context, viewGroup3, new C19746312Np(EnumC19746112Nn.SPRING, favoriteVideoTabRootFragment2.LLILZIL, C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)), new C19746412Nq("translationY", new C0HV5(0.0f, fSR2)))), false);
                        c21647019ng4.LJI = c21647019ng4.LIZIZ(new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 200L), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)), new C19746412Nq("translationY", new C0HV5(0.0f, fSR2)))));
                        c21647019ng4.LJI(true);
                        favoriteVideoTabRootFragment2.LLILZ = c21647019ng4;
                    }
                    this.WR();
                }
            };
        }
        C21521319Kh c21521319Kh = this.LLILZLL;
        if (c21521319Kh != null) {
            recyclerView.addOnScrollListener(c21521319Kh);
        }
        this.LLIZ = recyclerView;
        hS(iIntValue, viewGroup, recyclerView);
        WR();
    }

    public final EnumC444370Hbf RR() {
        int iLJJLIIIIJ = getChildFragmentManager().LJJLIIIIJ();
        return iLJJLIIIIJ != 0 ? iLJJLIIIIJ != 1 ? EnumC444370Hbf.LLILLL : EnumC444370Hbf.LLILLJJLI : EnumC444370Hbf.LL;
    }

    public final boolean VR() {
        C19EG activity;
        if (!isAdded() || getView() == null || !isVisible()) {
            return false;
        }
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        if (!currentState.isAtLeast(state) || (activity = getActivity()) == null || !activity.getLifecycle().getCurrentState().isAtLeast(state)) {
            return false;
        }
        for (Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (!parentFragment.isVisible() || !parentFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) || !parentFragment.getUserVisibleHint()) {
                return false;
            }
        }
        return true;
    }

    public final void WR() {
        FavoriteSearchViewModel favoriteSearchViewModelUR = UR();
        if (favoriteSearchViewModelUR != null) {
            favoriteSearchViewModelUR.LL.setValue(Boolean.valueOf(RR() != EnumC444370Hbf.LL || this.LLILLL));
        }
    }

    public final void ZR() {
        bS();
        int iOrdinal = RR().ordinal();
        if (iOrdinal == 0) {
            gS();
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            dS();
        }
    }

    public final void aS() {
        FavoriteSearchViewModel favoriteSearchViewModelUR;
        if (VR()) {
            FavoriteSearchViewModel favoriteSearchViewModelUR2 = UR();
            if (favoriteSearchViewModelUR2 != null) {
                C1206590hVJ c1206590hVJ = favoriteSearchViewModelUR2.LLIZ;
                favoriteSearchViewModelUR2.LLIZ = null;
                if (c1206590hVJ != null && (favoriteSearchViewModelUR = UR()) != null) {
                    C0HYB c0hyb = C0HYB.LIZ;
                    String str = favoriteSearchViewModelUR.LLIZLLLIL;
                    int i = favoriteSearchViewModelUR.LLJI;
                    String str2 = favoriteSearchViewModelUR.LLJ;
                    String str3 = c1206590hVJ.LIZ;
                    String str4 = c1206590hVJ.LIZIZ;
                    c0hyb.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    if (str == null) {
                        str = "";
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("favourite_cnt", String.valueOf(i));
                    if (str2 == null) {
                        str2 = "";
                    }
                    c2344009Gk.LJIIIIZZ("tab_name", str2);
                    c2344009Gk.LJIIIIZZ("type", str3);
                    c2344009Gk.LJIIIIZZ("enter_method", str4);
                    C20684815ws.LJIILLIIL("profile_tab_search_entrance_click", c2344009Gk.LIZ);
                }
            }
            iS(true);
            dS();
            FavoriteSearchViewModel favoriteSearchViewModelUR3 = UR();
            if (favoriteSearchViewModelUR3 != null) {
                favoriteSearchViewModelUR3.LLILLL.setValue(new C1206420hV2<>(Unit.LIZ));
            }
        }
    }

    public final void bS() {
        String str;
        FavoriteSearchViewModel favoriteSearchViewModelUR = UR();
        if (favoriteSearchViewModelUR == null) {
            return;
        }
        int iOrdinal = RR().ordinal();
        if (iOrdinal == 0) {
            str = "search_box";
        } else if (iOrdinal == 1) {
            str = "detail_page";
        } else {
            if (iOrdinal != 2) {
                throw new C1954807lC();
            }
            str = "result_page";
        }
        favoriteSearchViewModelUR.LLIZ = new C1206590hVJ("search_box", str);
    }

    public final void dS() {
        int scrollY;
        int maxY;
        C1260280itu c1260280ituPR = PR();
        if (c1260280ituPR == null || c1260280ituPR.LIZLLL() || (scrollY = c1260280ituPR.getScrollY()) >= (maxY = c1260280ituPR.getMaxY())) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, maxY);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(c1260280ituPR, 8));
        valueAnimatorOfInt.start();
    }

    public final void gS() {
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
        if (fragmentLJJJJZI == null) {
            return;
        }
        C1260280itu c1260280ituPR = PR();
        if (c1260280ituPR == null || c1260280ituPR.LIZLLL()) {
            NR(fragmentLJJJJZI);
            return;
        }
        int scrollY = c1260280ituPR.getScrollY();
        int maxY = c1260280ituPR.getMaxY();
        if (scrollY >= maxY) {
            NR(fragmentLJJJJZI);
            return;
        }
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, maxY);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(c1260280ituPR, 9));
        valueAnimatorOfInt.addListener(new ALAdapterS26S0200000_32(fragmentLJJJJZI, this, 1));
        valueAnimatorOfInt.start();
        this.LLIZLLLIL = valueAnimatorOfInt;
    }

    public static float SR(View view) {
        int height = view.getHeight();
        if (height > 0) {
            return -height;
        }
        return C418440Gaw.LIZIZ(-52);
    }

    public final void NR(Fragment fragment) {
        if (!isAdded()) {
            return;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIL(fragment, Lifecycle.State.STARTED);
        c19ehLJIIJ.LIZJ(R.id.hqv, new FavoriteSearchInputFragment(), "favorite_video_tab_search_input");
        c19ehLJIIJ.LJII("favorite_video_tab_search_input");
        c19ehLJIIJ.LJIIIZ();
    }

    public final void iS(boolean z) {
        Object parent;
        View view = getView();
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        while (parent instanceof View) {
            if (parent instanceof InterfaceC19566811gw) {
                InterfaceC19566811gw interfaceC19566811gw = (InterfaceC19566811gw) parent;
                if (interfaceC19566811gw != null) {
                    if (z) {
                        interfaceC19566811gw.setProfileTouchDownObserver(this);
                        return;
                    } else {
                        interfaceC19566811gw.setProfileTouchDownObserver(null);
                        return;
                    }
                }
                return;
            }
            parent = ((View) parent).getParent();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        super.onConfigurationChanged(configuration);
        C1260280itu c1260280ituPR = PR();
        if (c1260280ituPR != null) {
            if (c1260280ituPR.isLaidOut() && !c1260280ituPR.isLayoutRequested()) {
                cS();
                C1260280itu c1260280ituPR2 = PR();
                if (c1260280ituPR2 != null && !c1260280ituPR2.LIZLLL()) {
                    View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                    if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
                        recyclerView.scrollToPosition(0);
                        return;
                    }
                    return;
                }
                return;
            }
            c1260280ituPR.addOnLayoutChangeListener(new C19LV(this, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        FavoriteVideoTabRootFragmentData favoriteVideoTabRootFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (bundle2 = arguments.getBundle("favorite_video_tab_root_list_fragment_args")) == null) {
            Bundle arguments2 = getArguments();
            bundle2 = null;
            if (arguments2 != null) {
                favoriteVideoTabRootFragmentData = (FavoriteVideoTabRootFragmentData) arguments2.getParcelable("power_viewpager_default_key");
            } else {
                favoriteVideoTabRootFragmentData = null;
            }
            if ((favoriteVideoTabRootFragmentData instanceof FavoriteVideoTabRootFragmentData) && favoriteVideoTabRootFragmentData != null) {
                bundle2 = favoriteVideoTabRootFragmentData.listFragmentArgs;
            }
        }
        this.LL = bundle2;
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) throws Throwable {
        setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        String str;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/video/FavoriteVideoTabRootFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        int iOrdinal = RR().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    str = "favorite_video_tab_search_result";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "favorite_video_tab_search_input";
            }
        } else {
            str = "favorite_video_tab_list";
        }
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(str);
        if (fragmentLJJJJZI != null) {
            fragmentLJJJJZI.setUserVisibleHint(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FavoriteVideoTabRootFragment.class);
        }
    }

    @Override // X.InterfaceC19566711gv
    public final void OL(float f, float f2) {
        if (RR() != EnumC444370Hbf.LL) {
            View view = this.LLJJIII;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (f >= iArr[0] && f < r1 + view.getWidth()) {
                    if (f2 >= iArr[1] && f2 < r1 + view.getHeight()) {
                        return;
                    }
                }
            }
            EditText editText = this.LLJJ;
            if (editText == null || !editText.isFocused()) {
                return;
            }
            editText.clearFocus();
            KeyboardUtils.LIZIZ(editText);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0TVI, X.19Kk] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.19Kj] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment favoriteVideoListFragment;
        MutableLiveData mutableLiveData;
        FavoriteSearchViewModel favoriteSearchViewModelUR;
        super.onViewCreated(view, bundle);
        this.LLJJ = (EditText) view.findViewById(R.id.hqq);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.hqi);
        this.LLJJIII = view.findViewById(R.id.hqh);
        this.LLJJIJI = view.findViewById(R.id.hqj);
        this.LLJJIJIIJIL = view.findViewById(R.id.hqk);
        this.LLJILLL = PR();
        oS();
        getChildFragmentManager().LJFF(this.LLJJJJ);
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 22), view2);
        }
        View view3 = this.LLJJIII;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 18), view3);
        }
        EditText editText = this.LLJJ;
        if (editText != null) {
            C786410Ut5.N7(editText, new ACListenerS166S0100000_32(this, 19));
        }
        EditText editText2 = this.LLJJ;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC21523319Lb(this, 0));
        }
        EditText editText3 = this.LLJJ;
        if (editText3 != null) {
            editText3.setOnEditorActionListener(new C0IDL(this, 1));
        }
        View view4 = this.LLJJIJI;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 20), view4);
        }
        EditText editText4 = this.LLJJ;
        if (editText4 != null) {
            editText4.addTextChangedListener(new C462900IDg(this, 1));
        }
        nS();
        View rootView = view.getRootView();
        this.LLJILJIL = rootView;
        ?? r0 = new C0TVI() { // from class: X.19Kk
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view5, C20246014Ju c20246014Ju) {
                boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = this.LL;
                if (zLJIIIIZZ != favoriteVideoTabRootFragment.LLJILJILJ) {
                    favoriteVideoTabRootFragment.LLJILJILJ = zLJIIIIZZ;
                    if (zLJIIIIZZ) {
                        favoriteVideoTabRootFragment.aS();
                    } else if (favoriteVideoTabRootFragment.VR()) {
                        favoriteVideoTabRootFragment.iS(false);
                    }
                }
                ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh = this.LL.LLJI;
                if (viewTreeObserverOnGlobalLayoutListenerC21523919Lh != null && view5.getViewTreeObserver().isAlive()) {
                    C786410Ut5.C3(view5.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523919Lh);
                    this.LL.LLJI = null;
                }
                return c20246014Ju;
            }
        };
        this.LLJIJIL = r0;
        C14K9.LJIJJ(rootView, r0);
        rootView.requestApplyInsets();
        this.LLJI = new ViewTreeObserverOnGlobalLayoutListenerC21523919Lh(this, rootView, 2);
        C786410Ut5.x3(rootView.getViewTreeObserver(), this.LLJI);
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new InterfaceC1206370hUx() { // from class: X.19Kj
                @Override // X.InterfaceC1206370hUx
                public final void LIZ() {
                    this.LIZ.gS();
                }

                @Override // X.InterfaceC1206370hUx
                public final void LIZIZ() {
                    InterfaceC1258040iqI interfaceC1258040iqI;
                    View viewLJJLIIIJILLIZJL;
                    RecyclerView recyclerView;
                    FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = this.LIZ;
                    EditText editText5 = favoriteVideoTabRootFragment.LLJJ;
                    if (editText5 != null) {
                        KeyboardUtils.LIZIZ(editText5);
                    }
                    if (favoriteVideoTabRootFragment.RR() != EnumC444370Hbf.LL) {
                        favoriteVideoTabRootFragment.getChildFragmentManager().LJLLJ(1, null);
                    }
                    C1260280itu c1260280ituPR = favoriteVideoTabRootFragment.PR();
                    if (c1260280ituPR != null) {
                        c1260280ituPR.scrollTo(0, 0);
                    }
                    C128Y c128yLJJJJZI = favoriteVideoTabRootFragment.getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
                    if (c128yLJJJJZI == null || !(c128yLJJJJZI instanceof InterfaceC1258040iqI) || (interfaceC1258040iqI = (InterfaceC1258040iqI) c128yLJJJJZI) == null || (viewLJJLIIIJILLIZJL = interfaceC1258040iqI.LJJLIIIJILLIZJL()) == null || !(viewLJJLIIIJILLIZJL instanceof RecyclerView) || (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) == null) {
                        return;
                    }
                    recyclerView.scrollToPosition(0);
                }

                @Override // X.InterfaceC1206370hUx
                public final void LIZJ() {
                    this.LIZ.cS();
                }
            };
        }
        C21521519Kj c21521519Kj = this.LLJJJIL;
        if (c21521519Kj != null && (favoriteSearchViewModelUR = UR()) != null) {
            favoriteSearchViewModelUR.LLJJIJI = c21521519Kj;
        }
        FavoriteSearchViewModel favoriteSearchViewModelUR2 = UR();
        if (favoriteSearchViewModelUR2 != null && (mutableLiveData = favoriteSearchViewModelUR2.LLILZLL) != null) {
            mutableLiveData.observe(this, new AObserverS210S0100000_6(this, 26));
        }
        Bundle bundle2 = this.LL;
        if (bundle2 != null) {
            Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("favorite_video_tab_list");
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIL(fragmentLJJJJZI, Lifecycle.State.RESUMED);
                c19ehLJIIJ.LJIIIZ();
            } else {
                Context context = getContext();
                if (context != null && (favoriteVideoListFragment = C2277881EDy.LIZIZ.getFavoriteVideoListFragment(context, bundle2)) != null) {
                    C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ2.LIZJ(R.id.hqv, favoriteVideoListFragment, "favorite_video_tab_list");
                    c19ehLJIIJ2.LJIIIZ();
                }
            }
        }
        kS();
        mS();
        MR();
    }

    public final void hS(int i, View view, RecyclerView recyclerView) {
        if (recyclerView.computeVerticalScrollOffset() >= i) {
            this.LLILLL = true;
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.T4(view, 1.0f);
        } else {
            this.LLILLL = false;
            C786410Ut5.ed(view, SR(view));
            C786410Ut5.T4(view, 0.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6e, viewGroup, false);
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
