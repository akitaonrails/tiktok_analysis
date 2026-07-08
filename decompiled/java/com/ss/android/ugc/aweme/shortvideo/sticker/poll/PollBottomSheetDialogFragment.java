package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.C098200Yq;
import X.C0HJ7;
import X.C117M;
import X.C1258350iqn;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1843500y4a;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C705930RmZ;
import X.C786410Ut5;
import X.InterfaceC19598211m0;
import X.InterfaceC19632811ra;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class PollBottomSheetDialogFragment extends ViewPagerBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9OzElHELIOSKiQ2Oms8JiM/ZhUjJSMRJzE4JiIAICApPQs6KSkjLgkhKSIhLCEn";
    public View LL;
    public C19U1 LLILLJJLI;
    public C117M LLILLL;
    public C0HJ7 LLILZ;
    public TextView LLILZIL;
    public ImageView LLILZLL;
    public PollStruct LLIZ;
    public C1258350iqn LLIZLLLIL;
    public InterfaceC19632811ra LLJ;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.adu);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.LLIZ = (PollStruct) serializable;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.0iqm
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                final C117M c117m = this.LL.LLILLL;
                final View view = c117m;
                while (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof ViewPagerBottomSheetBehavior)) {
                        c117m.addOnPageChangeListener(new C360660ECa(c117m, view) { // from class: X.0iqp
                            public final ViewPager LL;
                            public final ViewPagerBottomSheetBehavior<View> LLILLJJLI;

                            @Override // X.C360660ECa, X.InterfaceC469360Ias
                            public final void onPageSelected(int i) {
                                ViewPager viewPager = this.LL;
                                ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LLILLJJLI;
                                Objects.requireNonNull(viewPagerBottomSheetBehavior);
                                HandlerHook.viewPost(viewPager, new ARunnableS119S0100000_19(viewPagerBottomSheetBehavior, 131));
                            }

                            {
                                this.LL = c117m;
                                this.LLILLJJLI = ViewPagerBottomSheetBehavior.LIZ(view);
                            }
                        });
                        return;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        return;
                    } else {
                        view = (View) parent;
                    }
                }
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C705930RmZ c705930RmZ;
        InterfaceC19598211m0 interfaceC19598211m0;
        super.onDismiss(dialogInterface);
        C1258350iqn c1258350iqn = this.LLIZLLLIL;
        if (c1258350iqn != null && (c705930RmZ = c1258350iqn.LIZ) != null && (interfaceC19598211m0 = c705930RmZ.LJIILJJIL) != null) {
            interfaceC19598211m0.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long pollCount;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i_u, viewGroup, false);
        this.LL = viewTd;
        C19GS c19gs = null;
        if (viewTd == null) {
            viewTd = null;
        }
        this.LLILLJJLI = (C19U1) viewTd.findViewById(R.id.wz8);
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        this.LLILLL = (C117M) view.findViewById(R.id.viewpager);
        View view2 = this.LL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLILZIL = (TextView) view2.findViewById(R.id.title);
        View view3 = this.LL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLILZLL = (ImageView) view3.findViewById(R.id.lc0);
        C0HJ7 c0hj7 = new C0HJ7(getChildFragmentManager());
        List<Fragment> list = c0hj7.LLIZ;
        PollStruct pollStruct = this.LLIZ;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("key_state", 0);
        if (pollStruct != null) {
            C786410Ut5.LJJIZ(bundle2, "key_poll", pollStruct);
        }
        PollDetailFragment pollDetailFragment = new PollDetailFragment();
        pollDetailFragment.setArguments(bundle2);
        ((ArrayList) list).add(pollDetailFragment);
        List<Fragment> list2 = c0hj7.LLIZ;
        PollStruct pollStruct2 = this.LLIZ;
        Bundle bundle3 = new Bundle();
        bundle3.putInt("key_state", 1);
        if (pollStruct2 != null) {
            C786410Ut5.LJJIZ(bundle3, "key_poll", pollStruct2);
        }
        PollDetailFragment pollDetailFragment2 = new PollDetailFragment();
        pollDetailFragment2.setArguments(bundle3);
        ((ArrayList) list2).add(pollDetailFragment2);
        ((PollDetailFragment) ListProtector.get(c0hj7.LLIZ, 0)).LLIZLLLIL = this.LLJ;
        ((PollDetailFragment) ListProtector.get(c0hj7.LLIZ, 1)).LLIZLLLIL = this.LLJ;
        this.LLILZ = c0hj7;
        C117M c117m = this.LLILLL;
        if (c117m != null) {
            c117m.setPagingEnable(false);
        }
        C117M c117m2 = this.LLILLL;
        if (c117m2 != null) {
            c117m2.setAdapter(this.LLILZ);
        }
        C117M c117m3 = this.LLILLL;
        if (c117m3 != null) {
            HandlerHook.viewPost(c117m3, new ARunnableS119S0100000_19(this, 89));
        }
        PollStruct pollStruct3 = this.LLIZ;
        long pollCount2 = 0;
        if (pollStruct3 != null && (options2 = pollStruct3.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 0)) != null) {
            pollCount = optionsBean2.getPollCount();
        } else {
            pollCount = 0;
        }
        PollStruct pollStruct4 = this.LLIZ;
        if (pollStruct4 != null && (options = pollStruct4.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
            pollCount2 = optionsBean.getPollCount();
        }
        String strLIZIZ = C1843500y4a.LIZIZ(pollCount + pollCount2);
        TextView textView = this.LLILZIL;
        if (textView != null) {
            textView.setText(C786410Ut5.j4(getResources().getString(2131858397), Arrays.copyOf(new Object[]{strLIZIZ}, 1)));
        }
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS154S0100000_19(this, 133));
        }
        View view4 = this.LL;
        if (view4 == null) {
            view4 = null;
        }
        if (!(view4 instanceof View)) {
            view4 = null;
        }
        if (view4 != null) {
            try {
                ViewTreeLifecycleOwner.set(view4, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view4, this);
                view4.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view4;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view4;
    }
}
