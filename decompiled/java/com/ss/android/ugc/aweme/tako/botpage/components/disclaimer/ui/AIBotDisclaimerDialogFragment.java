package com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1857690yRT;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20232414Eo;
import X.C20232514Ep;
import X.C20232714Er;
import X.C418440Gaw;
import X.C747440TTq;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import Y.ACListenerS164S0100000_30;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AIBotDisclaimerDialogFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvJiIjJyspJzHELIOSsgZiElOiw/KSwhLD19PSxiCAYRJzEIIDwwJCQlJCohDCwtJSA0DjctLiI2JjE=";
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public C19EG LLIZLLLIL;
    public final C20232714Er LLJ = new C20232714Er(null);
    public final C20232514Ep LLJI = new C20232514Ep(null);
    public final C20232414Eo LLJIJIL = new C20232414Eo(null);
    public TuxSheet LLJILJIL;

    public final TuxTextView MR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c9k) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS574S0100000_30(this, 241));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        TakoBotInfo takoBotInfo = this.LLJ.LIZJ;
        if (takoBotInfo != null && takoBotInfo.botId == 88872960259L) {
            z = true;
        } else {
            z = false;
        }
        View viewFindViewById = null;
        String str4 = "";
        if (z) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.c9f);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (SmartImageView) viewFindViewById2;
            }
            SmartImageView smartImageView = (SmartImageView) viewFindViewById2;
            TakoBotInfo takoBotInfo2 = this.LLJ.LIZJ;
            if (takoBotInfo2 != null && (str3 = takoBotInfo2.botAvatar) != null) {
                str4 = str3;
            }
            C1857690yRT.LJFF(smartImageView, str4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), false);
        } else {
            View viewFindViewById3 = this.LL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.c9f);
                } else {
                    viewFindViewById3 = null;
                }
                this.LL = (SmartImageView) viewFindViewById3;
            }
            SmartImageView smartImageView2 = (SmartImageView) viewFindViewById3;
            TakoBotInfo takoBotInfo3 = this.LLJ.LIZJ;
            if (takoBotInfo3 != null && (str = takoBotInfo3.botAvatar) != null) {
                str4 = str;
            }
            C1857690yRT.LJFF(smartImageView2, str4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)), true);
            View viewFindViewById4 = this.LLILLJJLI;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.x3l);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLJJLI = (SmartImageView) viewFindViewById4;
            }
            C1857690yRT.LJI((ImageView) viewFindViewById4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), R.attr.zq, R.attr.zq, null, 16);
        }
        View viewFindViewById5 = this.LLILLL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.c9l);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById5;
        }
        TextView textView = (TextView) viewFindViewById5;
        String string = getString(2131847081);
        Object[] objArr = new Object[1];
        TakoBotInfo takoBotInfo4 = this.LLJ.LIZJ;
        if (takoBotInfo4 != null) {
            str2 = takoBotInfo4.botName;
        } else {
            str2 = null;
        }
        objArr[0] = str2;
        textView.setText(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
        View viewFindViewById6 = this.LLILZ;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.c9g);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById6;
        }
        ((TextView) viewFindViewById6).setText(getString(2131847078));
        View viewFindViewById7 = this.LLILZIL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.c9h);
            } else {
                viewFindViewById7 = null;
            }
            this.LLILZIL = (TuxTextView) viewFindViewById7;
        }
        ((TextView) viewFindViewById7).setText(getString(2131847079));
        MR().setText(getString(2131849799));
        TakoBotInfo takoBotInfo5 = this.LLJ.LIZJ;
        if (takoBotInfo5 != null && takoBotInfo5.botId == 88872960259L) {
            TuxTextView tuxTextViewMR = MR();
            if (tuxTextViewMR != null) {
                C747440TTq.LIZIZ(tuxTextViewMR, null, this.LLJ.LIZLLL, null, 11);
            }
        } else {
            C1857690yRT.LIZ(MR(), null, null, null, null, 15);
        }
        View viewFindViewById8 = this.LLIZ;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.cly);
            } else {
                viewFindViewById8 = null;
            }
            this.LLIZ = (C197039127h) viewFindViewById8;
        }
        ((TextView) viewFindViewById8).setText(getString(2131847080));
        View view9 = this.LLIZ;
        if (view9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById = view10.findViewById(R.id.cly);
            }
            this.LLIZ = (C197039127h) viewFindViewById;
            view9 = viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) view9, new ACListenerS164S0100000_30(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fo7, viewGroup, false);
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
