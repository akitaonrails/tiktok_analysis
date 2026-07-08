package com.ss.android.ugc.aweme.minidrama.common.component.limitedfree;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.CountDownTimerC1579120rCA;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS29S1100000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class LimitedFreeFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyY3OiQhKGEwJyghJiF9HELIOSKyohOSA9LSs4ZyM6JSw4LCs1OiApZwM6JSw4LCsVOiApDz0yLygpJzs=";
    public final Function1<String, Unit> LL;
    public Bitmap LLILLJJLI;
    public final C01GW LLILLL;
    public C197039127h LLILZ;
    public AppCompatImageView LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final CountDownTimerC1579120rCA LLJILJIL;

    public LimitedFreeFragment() {
        this(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        cancel();
        try {
            Bitmap bitmap = this.LLILLJJLI;
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            this.LLILLJJLI = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0rCA] */
    public LimitedFreeFragment(Function1<? super String, Unit> function1) {
        this.LL = function1;
        this.LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(235));
        this.LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(234));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 746));
        this.LLJIJIL = c01gwLIZIZ;
        final long jLongValue = ((Number) c01gwLIZIZ.getValue()).longValue();
        this.LLJILJIL = new CountDownTimer(jLongValue) { // from class: X.0rCA
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LIZ.LLILLL.getValue();
                if (iSeriesLimitedFreeService != null) {
                    iSeriesLimitedFreeService.LIZ();
                }
                Function1<String, Unit> function12 = this.LIZ.LL;
                if (function12 != null) {
                    function12.invoke("5s_auto_exit");
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                String string;
                Context context = this.LIZ.getContext();
                if (context == null || (string = context.getString(2131836545, Long.valueOf((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1))) == null) {
                    string = "";
                }
                C786410Ut5.LJJZZIII((Handler) this.LIZ.LLJI.getValue(), new ARunnableS29S1100000_24(this.LIZ, string, 1));
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onViewCreated(view, bundle);
        this.LLILZ = (C197039127h) view.findViewById(R.id.vz1);
        this.LLILZIL = (AppCompatImageView) view.findViewById(R.id.ex3);
        this.LLILZLL = view.findViewById(R.id.mom);
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            C786410Ut5.V7(appCompatImageView, new View.OnClickListener() { // from class: X.0rCB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.mop);
        this.LLIZLLLIL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(30.0f);
        }
        this.LLJ = (TuxTextView) view.findViewById(R.id.moo);
        View viewFindViewById = view.findViewById(R.id.vz1);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 26), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.mom);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 27), viewFindViewById2);
        }
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.eyo);
        this.LLIZ = tuxTextView2;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(ColorProtector.parseColor("#E5FFFFFF"));
        }
        Bitmap bitmap = this.LLILLJJLI;
        String string5 = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            AppCompatImageView appCompatImageView2 = this.LLILZIL;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageBitmap(bitmap);
            }
        } else {
            AppCompatImageView appCompatImageView3 = this.LLILZIL;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setImageDrawable(null);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("limited_free_title");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("limited_free_sub_title");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("limited_free_image_cta");
        } else {
            string3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("highlight_text");
        } else {
            string4 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string5 = arguments5.getString("highlight_color");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (string != null && string.length() != 0 && string4 != null && string4.length() != 0 && string5 != null && string5.length() != 0) {
            int iLJJJ = a0.LJJJ(string, string4, 0, false, 6);
            int length = string4.length() + iLJJJ;
            if (iLJJJ >= 0 && length >= 0) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(ColorProtector.parseColor(string5)), iLJJJ, length, 33);
            }
        }
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(spannableStringBuilder);
        }
        TuxTextView tuxTextView4 = this.LLJ;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(string2);
        }
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            c197039127h.setText(string3);
        }
        cancel();
        start();
        ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LLILLL.getValue();
        if (iSeriesLimitedFreeService != null) {
            iSeriesLimitedFreeService.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bi2, viewGroup, false);
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
