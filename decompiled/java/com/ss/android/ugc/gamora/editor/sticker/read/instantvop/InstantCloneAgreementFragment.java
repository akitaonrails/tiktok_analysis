package com.ss.android.ugc.gamora.editor.sticker.read.instantvop;

import X.C098200Yq;
import X.C0HTI;
import X.C11VO;
import X.C11VR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19772712Xt;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneAgreementFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiOjs6Ky4pO2EhLSHELIOSQoZyY9OzEtJzslJzViACEgPCQiPQw/JyspCCghLSAhLCEnDjctLiI2JjE=";
    public String LL = "half_screen";
    public C11VO LLILLJJLI;
    public TuxTextView LLILLL;
    public ImageView LLILZ;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String strReplace;
        String strReplace2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.exe);
        TuxTextView tuxTextView = null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 47), viewFindViewById);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.ami);
        this.LLILZ = (ImageView) view.findViewById(R.id.amp);
        Context context = getContext();
        if (context != null && (string = context.getString(2131858311)) != null && (strReplace = new Regex("\\{").replace(string, "")) != null && (strReplace2 = new Regex("\\}").replace(strReplace, "")) != null) {
            int iLJJJ = a0.LJJJ(strReplace2, "learn more", 0, false, 6);
            SpannableString spannableString = new SpannableString(strReplace2);
            C786410Ut5.p2(spannableString, new C19772712Xt(this, 2), iLJJJ, iLJJJ + 10, 33);
            int iLJJJ2 = a0.LJJJ(strReplace2, "Privacy Policy", 0, false, 6);
            C786410Ut5.p2(spannableString, new C19772712Xt(this, 3), iLJJJ2, iLJJJ2 + 14, 33);
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(spannableString);
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (Intrinsics.LJFF(this.LL, "full_screen")) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.sr;
            Context context2 = getContext();
            if (context2 != null) {
                Drawable drawableLIZ = c0hti.LIZ(new ContextThemeWrapper(context2, R.style.y0));
                ImageView imageView = this.LLILZ;
                if (imageView != null) {
                    imageView.setImageDrawable(drawableLIZ);
                    return;
                }
                return;
            }
            return;
        }
        C0HTI c0hti2 = new C0HTI();
        c0hti2.LIZ = R.drawable.sr;
        Context context3 = getContext();
        if (context3 == null) {
            return;
        }
        Drawable drawableLIZ2 = c0hti2.LIZ(context3);
        ImageView imageView2 = this.LLILZ;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageDrawable(drawableLIZ2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        View viewTd;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("view_mode")) == null) {
            string = "half_screen";
        }
        this.LL = string;
        boolean z = true;
        if (Intrinsics.LJFF(string, "full_screen")) {
            if (C11VR.LIZIZ().isAgreementIntroV2 != 1) {
                z = false;
            }
            if (z) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.eox, viewGroup, false);
            } else {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.eow, viewGroup, false);
            }
        } else if (Intrinsics.LJFF(this.LL, "half_screen")) {
            if (C11VR.LIZIZ().isAgreementIntroV2 != 1) {
                z = false;
            }
            if (z) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoz, viewGroup, false);
            } else {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoy, viewGroup, false);
            }
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoy, viewGroup, false);
        }
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
