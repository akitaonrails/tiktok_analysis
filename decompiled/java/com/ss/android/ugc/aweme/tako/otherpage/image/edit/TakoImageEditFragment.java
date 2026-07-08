package com.ss.android.ugc.aweme.tako.otherpage.image.edit;

import X.C098200Yq;
import X.C0I7D;
import X.C1110404Vy;
import X.C1308910kAL;
import X.C1385040m98;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C1852650yJL;
import X.C1852780yJY;
import X.C1854260yLw;
import X.C1854340yM4;
import X.C1855920yOc;
import X.C1857690yRT;
import X.C1862330yYx;
import X.C1864490ycR;
import X.C189200o6;
import X.C19659111vp;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2174781A9k;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC665370Q7z;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS124S0100000_24;
import Y.AUListenerS18S0102000_27;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageEditFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZyY+KSIpZyo3ITFiHS44JwwhKCg2DSElPQkhKSIhLCEn";
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public C1854340yM4 LLJ;
    public C1852780yJY LLJI;
    public View LLJIJIL;
    public boolean LLJILJIL = true;
    public String LLJILJILJ;
    public InterfaceC1355580lNc LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final void SR() {
        if (this.LLJJIII) {
            this.LLJJIJIIJIL = true;
            if (this.LLJJIJI) {
                C1854340yM4 c1854340yM4 = this.LLJ;
                if (c1854340yM4 != null) {
                    C2174781A9k.LIZIZ(c1854340yM4);
                }
            } else if (this.LLJJ) {
                C1854340yM4 c1854340yM42 = this.LLJ;
                if (c1854340yM42 != null) {
                    C2174781A9k.LIZ(c1854340yM42);
                }
            } else {
                this.LLJJIJIIJIL = false;
            }
            if (this.LLJJIII) {
                this.LLJJIII = false;
            }
        }
    }

    public final void finish() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        TakoSubModeBarAbility takoSubModeBarAbility;
        C1852650yJL c1852650yJL;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        TakoSubModeBarAbility takoSubModeBarAbility2;
        C1854340yM4 c1854340yM4 = this.LLJ;
        if (c1854340yM4 != null) {
            C2174781A9k.LIZ(c1854340yM4);
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            C1854260yLw.LIZ.getClass();
            C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
            if (c1852650yJL2 != null && c1852650yJL2.LIZ == 5) {
                if (!Intrinsics.LJFF(c1852650yJL2 != null ? c1852650yJL2.LJI : null, "action_bar") || (c1852650yJL = C1854260yLw.LIZIZ) == null || c1852650yJL.LJIIIIZZ) {
                    C1854260yLw.LJIIL();
                } else {
                    WeakReference<InterfaceC665370Q7z> weakReference = C1854260yLw.LIZLLL;
                    if (weakReference != null && (interfaceC665370Q7z2 = weakReference.get()) != null && (takoSubModeBarAbility2 = (TakoSubModeBarAbility) C1558520qew.LIZ(interfaceC665370Q7z2, TakoSubModeBarAbility.class, null)) != null) {
                        takoSubModeBarAbility2.Qo2();
                    }
                }
            } else if (c1852650yJL2 != null) {
                if (c1852650yJL2.LIZ == 6) {
                    if (c1852650yJL2.LJIIIIZZ) {
                        C1854260yLw.LJIIL();
                    } else {
                        WeakReference<InterfaceC665370Q7z> weakReference2 = C1854260yLw.LIZLLL;
                        if (weakReference2 != null && (interfaceC665370Q7z = weakReference2.get()) != null && (takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoSubModeBarAbility.class, null)) != null) {
                            takoSubModeBarAbility.jA2();
                        }
                    }
                } else if (c1852650yJL2.LIZ == 6001) {
                    C1854260yLw.LJIIL();
                }
            }
            C1854260yLw.LIZIZ = null;
            ((ArrayList) C1854260yLw.LIZJ).clear();
            C1854260yLw.LJ = C2097608Jq.LJ();
            InterfaceC1355580lNc interfaceC1355580lNc = this.LLJILLL;
            if (interfaceC1355580lNc != null) {
                interfaceC1355580lNc.release();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJIJI = this.LLJJ;
        this.LLJJIII = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SR();
    }

    public final void UR(int i) {
        View view = this.LLJIJIL;
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS18S0102000_27(measuredHeight, i, view, 0));
            valueAnimatorOfFloat.start();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Window window;
        super.onCreate(bundle);
        NR(AFwS269S0000000_27.get$arr$(281));
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null) {
            z = arguments.getBoolean("tako_bottom_up", true);
        }
        this.LLJILJIL = z;
        Bundle arguments2 = getArguments();
        View decorView = null;
        if (arguments2 != null) {
            string = arguments2.getString("tako_image_edit_default_input");
        } else {
            string = null;
        }
        this.LLJILJILJ = string;
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        C19EG activity = getActivity();
        C19EG activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(activity, decorView);
        this.LLJILLL = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = new InterfaceC1352000lHq() { // from class: X.0yM6
                @Override // X.InterfaceC1352000lHq
                public final void j(int i) {
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLILII() {
                    TakoImageEditFragment takoImageEditFragment = this.LL;
                    if (takoImageEditFragment.LLJJIJIIJIL) {
                        if (takoImageEditFragment.LLJJIJI) {
                            return;
                        }
                        takoImageEditFragment.LLJJIJIIJIL = false;
                        return;
                    }
                    C1852780yJY c1852780yJY = takoImageEditFragment.LLJI;
                    if (c1852780yJY == null || !c1852780yJY.LLJ) {
                        C1854340yM4 c1854340yM4 = takoImageEditFragment.LLJ;
                        if (c1854340yM4 == null || !c1854340yM4.LLJILLL) {
                            takoImageEditFragment.LLJJ = false;
                            if (c1852780yJY != null) {
                                c1852780yJY.LIZLLL(-takoImageEditFragment.LLJJI, false);
                            }
                            TuxTextView tuxTextView = this.LL.LLIZ;
                            if (tuxTextView != null) {
                                C786410Ut5.LLLLZLL(tuxTextView, 0);
                            }
                            this.LL.UR(0);
                        }
                    }
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLLLZI(int i) {
                    boolean z2;
                    TakoImageEditFragment takoImageEditFragment = this.LL;
                    if (takoImageEditFragment.LLJJIJIIJIL) {
                        if (!takoImageEditFragment.LLJJIJI) {
                            return;
                        }
                        takoImageEditFragment.LLJJIJIIJIL = false;
                        return;
                    }
                    C1852780yJY c1852780yJY = takoImageEditFragment.LLJI;
                    if (c1852780yJY != null) {
                        z2 = c1852780yJY.LLJ;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        C1854340yM4 c1854340yM4 = takoImageEditFragment.LLJ;
                        if (c1854340yM4 != null && c1854340yM4.LLJILLL) {
                            return;
                        }
                        takoImageEditFragment.LLJJ = true;
                        takoImageEditFragment.LLJJI = i - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(takoImageEditFragment.getContext());
                        TakoImageEditFragment takoImageEditFragment2 = this.LL;
                        C1852780yJY c1852780yJY2 = takoImageEditFragment2.LLJI;
                        if (c1852780yJY2 != null) {
                            c1852780yJY2.LIZLLL(takoImageEditFragment2.LLJJI, true);
                        }
                        TuxTextView tuxTextView = this.LL.LLIZ;
                        if (tuxTextView != null) {
                            C786410Ut5.LLLLZLL(tuxTextView, 8);
                        }
                        TakoImageEditFragment takoImageEditFragment3 = this.LL;
                        takoImageEditFragment3.UR(takoImageEditFragment3.LLJJI);
                    }
                }
            };
            keyboardFakePopupWindowLIZ.show();
        }
        C19EG activity3 = getActivity();
        if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, new C1864490ycR(this, 5));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        TuxTextView tuxTextView;
        FrameLayout frameLayout;
        C1854340yM4 c1854340yM4;
        C1852780yJY c1852780yJY;
        View viewFindViewById;
        Integer numValueOf;
        C0I7D c0i7d;
        Integer numLIZJ;
        ViewGroup viewGroup;
        String string;
        TuxIconView tuxIconView;
        int i;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.x96)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (this.LLJILJIL) {
                i = R.raw.icon_x_mark;
            } else {
                i = R.raw.icon_chevron_left_ltr;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LIZLLL = Integer.valueOf(C1857690yRT.LJIIJ(R.attr.a1h));
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 102));
        }
        View view3 = getView();
        String str = null;
        if (view3 != null && (tuxTextView = (TuxTextView) view3.findViewById(R.id.x9w)) != null) {
            C1854260yLw.LIZ.getClass();
            C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
            if (c1852650yJL == null || (string = c1852650yJL.LIZIZ) == null) {
                string = getString(2131849872);
            }
            tuxTextView.setText(string);
        } else {
            tuxTextView = null;
        }
        this.LLIZ = tuxTextView;
        View view4 = getView();
        if (view4 != null && (frameLayout = (FrameLayout) view4.findViewById(R.id.x8o)) != null) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(1);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(28);
            if (C960203pA.LIZIZ(frameLayout.getContext())) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, C1385040m98.LIZ(frameLayout.getContext(), false));
                if (numLIZJ2 != null) {
                    numLIZJ = Integer.valueOf(C1857690yRT.LJIIIZ(0.07f, numLIZJ2.intValue()));
                } else {
                    numLIZJ = null;
                }
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.f511p1, frameLayout.getContext());
            }
            c19659111vp.LJFF = numLIZJ;
            c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
            frameLayout.setBackground(c19659111vp.LIZ(frameLayout.getContext()));
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.setClipChildren(false);
            }
        } else {
            frameLayout = null;
        }
        this.LLIZLLLIL = frameLayout;
        View view5 = getView();
        if (view5 != null && (c1854340yM4 = (C1854340yM4) view5.findViewById(R.id.x8n)) != null) {
            C1854260yLw.LIZ.getClass();
            if (!C1854260yLw.LJI() && (c0i7d = c1854340yM4.LL) != null) {
                HandlerHook.viewPostDelay(c0i7d, new ARunnableS124S0100000_24(c0i7d, 89), 300L);
            }
            c1854340yM4.setEditTextHeightChangeListener(new AwS571S0100000_27(this, 1024));
            c1854340yM4.setOnSendButtonClickListener(new AwS606S0100000_27(this, 317));
            c1854340yM4.setHasImageSelected(true ^ ((ArrayList) C1854260yLw.LIZJ).isEmpty());
            c1854340yM4.setDefaultInputText(this.LLJILJILJ);
            c1854340yM4.setStylePanelDismissListener(new AwS571S0100000_27(this, 1025));
            c1854340yM4.setStylePanelShowListener(new AwS571S0100000_27(this, 1026));
            c1854340yM4.setExpandInputFragmentShowListener(new AwS571S0100000_27(this, 1027));
            c1854340yM4.setExpandInputFragmentDismissListener(new AwS571S0100000_27(this, 1028));
        } else {
            c1854340yM4 = null;
        }
        this.LLJ = c1854340yM4;
        View view6 = getView();
        if (view6 != null && (c1852780yJY = (C1852780yJY) view6.findViewById(R.id.x97)) != null) {
            c1852780yJY.setImageSelectedChangedListener(new AwS606S0100000_27(this, 318));
            c1852780yJY.setModuleClickListener(AFwS269S0000000_27.get$arr$(328));
        } else {
            c1852780yJY = null;
        }
        this.LLJI = c1852780yJY;
        View view7 = getView();
        if (view7 != null) {
            viewFindViewById = view7.findViewById(R.id.x98);
        } else {
            viewFindViewById = null;
        }
        this.LLJIJIL = viewFindViewById;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1854260yLw.LIZ.getClass();
        String str2 = C1854260yLw.LJ.get("enter_from");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = C1854260yLw.LJ.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = C1854260yLw.LJ.get("process_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = C1854260yLw.LJ.get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = C1854260yLw.LJ.get("tako_chat_id");
        if (str6 == null) {
            str6 = "";
        }
        C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
        if (c1852650yJL2 != null) {
            numValueOf = Integer.valueOf(c1852650yJL2.LIZ);
        } else {
            numValueOf = null;
        }
        String strLIZJ = C1855920yOc.LIZJ(numValueOf);
        C1852650yJL c1852650yJL3 = C1854260yLw.LIZIZ;
        if (c1852650yJL3 != null) {
            str = c1852650yJL3.LJI;
        }
        C1862330yYx.LJJI(c1862330yYx, str2, str3, str4, str5, str6, "image_upload", null, strLIZJ, str, null, 1600);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.foe, viewGroup, false);
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
