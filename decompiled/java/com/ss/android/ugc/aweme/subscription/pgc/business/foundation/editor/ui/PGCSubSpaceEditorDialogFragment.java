package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui;

import X.C019F;
import X.C01D1;
import X.C0DW5;
import X.C0DW6;
import X.C0JCO;
import X.C0JCP;
import X.C0K7T;
import X.C0K8U;
import X.C0K8W;
import X.C0K8X;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C338490DOt;
import X.C446980Hfs;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C456340Huy;
import X.C512160K6s;
import X.C521840KdK;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewTreeObserverOnGlobalLayoutListenerC521810KdH;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS73S0200000_4;
import Y.ATListenerS441S0100000_7;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubSpaceEditorDialogFragment extends PGCSubEmojiInputDialogFragment {
    public static final C0K8W LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static boolean LLJJJ = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyHELIOSAmJiEtPSY8JmspLSYnJzdiPCZ9GAIPGjoxGzUtKioWLCw4Jj0XISQgJigVOiQrJCo9PA==";
    public EditText LLILLL;
    public final AssemVMLazy LLILZ;
    public C0JCP LLILZIL;
    public C0JCO LLILZLL;
    public SubscriptionBridgeViewModel LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public ViewPager LLJJ;
    public boolean LLJJI;
    public C0DW6 LLJJIII;
    public C0K8U LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PGCSubSpaceEditorDialogFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/viewmodel/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = new C0K8W();
    }

    public PGCSubSpaceEditorDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 431);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(193);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 432), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 433), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 434), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
    }

    public final C0JCP NR() {
        if (this.LLILZIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0JCP.class, null);
            this.LLILZIL = interfaceC1555100qZQLIZIZ != null ? (C0JCP) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZIL;
    }

    public final SubSpaceEditorVM OR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (SubSpaceEditorVM) assemVMLazy.getValue();
    }

    public final void PR() {
        ViewPager viewPager = this.LLJJ;
        if (viewPager == null) {
            return;
        }
        if (this.LLJJI || viewPager.getAdapter() != null) {
            this.LLJJI = true;
            return;
        }
        final C0DW6 c0dw6 = new C0DW6(viewPager.getContext());
        c0dw6.setOnEmojiClickListener(new AwS586S0100000_7(this, 278));
        this.LLJJIII = c0dw6;
        viewPager.setAdapter(new PagerAdapter() { // from class: X.0K8Y
            @Override // androidx.viewpager.widget.PagerAdapter
            public final boolean LJJIFFI(View view, Object obj) {
                return view == obj;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return 1;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final Object LJJI(int i, ViewGroup viewGroup) {
                viewGroup.addView(c0dw6, new ViewGroup.LayoutParams(-1, -1));
                return c0dw6;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                if (obj instanceof View) {
                    C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
                }
            }
        });
        LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()).launchWhenStarted(new C0DW5(this, null));
        this.LLJJI = true;
    }

    public final void SR() {
        C0K8X c0k8xInvoke;
        InputMethodManager inputMethodManager;
        C0K8U c0k8u = this.LLJJIJI;
        EditText editText = this.LLILLL;
        if (c0k8u == null) {
            View view = this.LLJILJIL;
            if (view == null) {
                return;
            }
            PR();
            boolean z = true ^ this.LLJILJILJ;
            this.LLJILJILJ = z;
            if (z) {
                C786410Ut5.LJLLLLLL(0, view);
                if (editText != null && (inputMethodManager = (InputMethodManager) C446980Hfs.LIZIZ(editText.getContext(), InputMethodManager.class)) != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            } else {
                C786410Ut5.LJLLLLLL(8, view);
                RR(editText);
            }
            C0K7T c0k7t = new C0K7T(this.LLJILJILJ ? "emoji_panel_show" : "emoji_panel_hide", null, null, view.getHeight() > 0 ? view.getHeight() : 0, 6);
            if (this.LLIZ != null) {
                C512160K6s.LIZ(c0k7t);
                return;
            } else {
                C512160K6s.LIZ(c0k7t);
                return;
            }
        }
        C0K8X c0k8x = this.LLJILJILJ ? C0K8X.EMOJI : this.LLJILLL ? C0K8X.AT : C0K8X.NONE;
        C0K8X c0k8x2 = C0K8X.EMOJI;
        if (c0k8x == c0k8x2) {
            c0k8u.LIZ();
            RR(editText);
            return;
        }
        if (c0k8x2 == C0K8X.NONE) {
            c0k8u.LIZ();
            return;
        }
        Function0<C0K8X> function0 = c0k8u.LJFF;
        if (function0 == null || (c0k8xInvoke = function0.invoke()) == null) {
            c0k8xInvoke = c0k8u.LJIIIIZZ;
        }
        if (c0k8xInvoke == c0k8x2 && !c0k8u.LJIIIZ) {
            c0k8u.LIZ();
            InputMethodManager inputMethodManager2 = (InputMethodManager) C446980Hfs.LIZIZ(c0k8u.LIZ.getContext(), InputMethodManager.class);
            View viewFindFocus = c0k8u.LJ;
            if (viewFindFocus == null && (viewFindFocus = c0k8u.LIZ.findFocus()) == null) {
                viewFindFocus = c0k8u.LIZ;
            }
            if (viewFindFocus instanceof EditText) {
                ((TextView) viewFindFocus).setShowSoftInputOnFocus(true);
            }
            HandlerHook.viewPost(viewFindFocus, new ARunnableS73S0200000_4(viewFindFocus, inputMethodManager2, 27));
            return;
        }
        EditText editText2 = c0k8u.LJ;
        if (editText2 != null) {
            editText2.setShowSoftInputOnFocus(false);
            editText2.requestFocus();
        }
        InputMethodManager inputMethodManager3 = (InputMethodManager) C446980Hfs.LIZIZ(c0k8u.LIZ.getContext(), InputMethodManager.class);
        View viewFindFocus2 = c0k8u.LJ;
        if (viewFindFocus2 == null && (viewFindFocus2 = c0k8u.LIZ.findFocus()) == null) {
            viewFindFocus2 = c0k8u.LIZ;
        }
        IBinder windowToken = viewFindFocus2.getWindowToken();
        if ((windowToken != null || (windowToken = c0k8u.LIZ.getWindowToken()) != null) && inputMethodManager3 != null) {
            inputMethodManager3.hideSoftInputFromWindow(windowToken, 0);
        }
        c0k8u.LJIIIIZZ = c0k8x2;
        Function1<C0K8X, Unit> function1 = c0k8u.LJI;
        if (function1 != null) {
            function1.invoke(c0k8x2);
        }
    }

    public static void RR(EditText editText) {
        if (editText == null) {
            return;
        }
        HandlerHook.viewPost(editText, new ARunnableS107S0100000_7(editText, 148));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0JCP(), C0JCP.class, "source_default_key");
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubEmojiInputDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(20);
        }
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0K8V
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C0K8U c0k8u;
                C0K8X c0k8xInvoke;
                if (i == 4 && keyEvent.getAction() == 1 && (c0k8u = this.LL.LLJJIJI) != null && !c0k8u.LJIIIZ) {
                    Function0<C0K8X> function0 = c0k8u.LJFF;
                    if (function0 == null || (c0k8xInvoke = function0.invoke()) == null) {
                        c0k8xInvoke = c0k8u.LJIIIIZZ;
                    }
                    if (c0k8xInvoke != C0K8X.NONE) {
                        c0k8u.LIZ();
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubEmojiInputDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String string;
        Editable editableLLJILLL;
        EditText editText = this.LLILLL;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/7F/+CBOfytm1fNSZdJRUsFtkWyBabBJkHw1ePxd1Z/FO1w==", null))) != null) {
            string = editableLLJILLL.toString();
        } else {
            string = null;
        }
        C0JCO c0jco = this.LLILZLL;
        if (c0jco != null) {
            c0jco.Ll1(string);
        }
        EditText editText2 = this.LLILLL;
        if (editText2 != null) {
            editText2.removeTextChangedListener(OR().LLJ);
        }
        C0K8U c0k8u = this.LLJJIJI;
        if (c0k8u != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = c0k8u.LJIIJJI;
            if (viewTreeObserverOnGlobalLayoutListenerC521810KdH != null) {
                try {
                    C786410Ut5.C3(c0k8u.LIZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c0k8u.LJIIJJI = null;
        }
        this.LLJJIJI = null;
        super.onDismiss(dialogInterface);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubEmojiInputDialogFragment
    public final View MR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.fff, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Editable editableMq;
        int iIntValue;
        View viewFindViewById;
        Window window;
        View decorView;
        Integer numLIZJ;
        Editable editableLLJILLL;
        super.onViewCreated(view, bundle);
        SubSpaceEditorVM subSpaceEditorVMOR = OR();
        subSpaceEditorVMOR.LLILLJJLI = C1558360qeg.LJFF(this, null);
        if (((List) subSpaceEditorVMOR.LLIZ.getValue()).isEmpty()) {
            C2252321DDq c2252321DDq = subSpaceEditorVMOR.LLIZ;
            subSpaceEditorVMOR.LLILZLL.getClass();
            c2252321DDq.setValue(C456340Huy.LIZ);
        }
        OR().LL = this.LLILZLL;
        C0JCP c0jcpNR = NR();
        if (c0jcpNR != null) {
            c0jcpNR.LLILLJJLI = this.LLJ;
        }
        C0JCO c0jco = this.LLILZLL;
        if (c0jco != null) {
            this.LLILLJJLI = c0jco;
            c0jco.Rd(this);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLIZ = (SubscriptionBridgeViewModel) new ViewModelProvider(activity).get(SubscriptionBridgeViewModel.class);
        }
        AssemViewModel.selectSubscribe$default(OR(), new C2217381BqS() { // from class: X.0JC7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC5) obj).LLILLL;
            }
        }, null, null, null, new AwS586S0100000_7(new AwS586S0100000_7(this, 360), 400), 14, null);
        this.LLIZLLLIL = view.findViewById(R.id.upp);
        this.LLILLL = (EditText) view.findViewById(R.id.grz);
        this.LLJILJIL = view.findViewById(R.id.h05);
        this.LLJIJIL = view.findViewById(R.id.po8);
        View viewFindViewById2 = view.findViewById(R.id.po_);
        this.LLJJ = (ViewPager) view.findViewById(R.id.ks8);
        View viewFindViewById3 = view.findViewById(R.id.gzo);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 184), viewFindViewById3);
        }
        PR();
        C0JCO c0jco2 = OR().LL;
        if (c0jco2 != null) {
            editableMq = c0jco2.Mq();
        } else {
            editableMq = null;
        }
        if (editableMq != null && editableMq.length() > 0) {
            EditText editText = this.LLILLL;
            if (editText != null) {
                editText.setText(editableMq);
            }
            EditText editText2 = this.LLILLL;
            if (editText2 != null) {
                editText2.setSelection(editableMq.length());
            }
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 185), view2);
        }
        EditText editText3 = this.LLILLL;
        if (editText3 != null) {
            editText3.addTextChangedListener(new C521840KdK(this, 3));
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 186), view3);
        }
        EditText editText4 = this.LLILLL;
        if (editText4 != null) {
            editText4.setOnTouchListener(new ATListenerS441S0100000_7(this, 10));
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 187), viewFindViewById2);
        }
        EditText editText5 = this.LLILLL;
        if (editText5 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJd3pSl8Mx0/7F/+CBOfytm1fNSZdJRUsFtkWyBabBJkHw1ePxd1Z/FO1w==", null))) != null && editableLLJILLL.length() != 0) {
            View view4 = this.LLIZLLLIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
        } else {
            View view5 = this.LLIZLLLIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
        }
        View viewFindViewById4 = view.findViewById(R.id.view_shadow);
        C786410Ut5.T4(viewFindViewById4, 0.0f);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.f8c, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        viewFindViewById4.setBackgroundColor(iIntValue);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById4, (Property<View, Float>) View.ALPHA, 0.0f, 0.5f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        View viewFindViewById5 = view.findViewById(R.id.eqx);
        if (viewFindViewById5 != null && (viewFindViewById = view.findViewById(R.id.ko2)) != null) {
            View viewFindViewById6 = view.findViewById(R.id.ko3);
            C0K8U c0k8u = this.LLJJIJI;
            if (c0k8u != null) {
                ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = c0k8u.LJIIJJI;
                if (viewTreeObserverOnGlobalLayoutListenerC521810KdH != null) {
                    try {
                        C786410Ut5.C3(c0k8u.LIZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c0k8u.LJIIJJI = null;
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            C0K8U c0k8u2 = new C0K8U(viewFindViewById5, window, viewFindViewById, viewFindViewById6, this.LLILLJJLI, this.LLILLL, new AwS551S0100000_7(this, 435), new AwS586S0100000_7(this, 279), new AwS586S0100000_7(this, 361));
            if (window == null || (decorView = window.getDecorView()) == null) {
                decorView = viewFindViewById5;
            }
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH2 = new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(decorView, c0k8u2, 4);
            c0k8u2.LJIIJJI = viewTreeObserverOnGlobalLayoutListenerC521810KdH2;
            C786410Ut5.x3(viewFindViewById5.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH2);
            this.LLJJIJI = c0k8u2;
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 144), viewFindViewById4);
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 276), 3);
        if (!LLJJJ) {
            LLJJJ = true;
            C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 359), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 277), 3);
        if (this.LLJI == 1) {
            if (!this.LLJILJILJ) {
                SR();
                return;
            }
            return;
        }
        RR(this.LLILLL);
    }
}
