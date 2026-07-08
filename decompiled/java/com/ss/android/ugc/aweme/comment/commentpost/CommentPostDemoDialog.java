package com.ss.android.ugc.aweme.comment.commentpost;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0H90;
import X.C0HC5;
import X.C0ID3;
import X.C0TSK;
import X.C0XQ7;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1350920lG6;
import X.C1390410mHn;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentPostDemoDialog extends BaseDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiHELIOSKiA+JSAiPT88OzFiCiA+JSAiPR88OzEILCI8DCwtJSA0";
    public ConstraintLayout LLILLL;
    public ConstraintLayout LLILZ;
    public C1390410mHn LLILZIL;
    public FrameLayout LLILZLL;
    public C0H90 LLIZ;
    public LinearLayout LLIZLLLIL;
    public SmartImageView LLJ;
    public RadiusLayout LLJI;
    public View LLJIJIL;
    public FrameLayout LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C197039127h LLJILLL;
    public TuxTextView LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 50));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 48));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 51));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 49));
    public Function1<? super Bitmap, Unit> LLJJIJIL;

    public final SmartImageView MR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f5r) : null;
            this.LLJ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final C1390410mHn NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gb3) : null;
            this.LLILZIL = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final Aweme getAweme() {
        return (Aweme) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        String aid;
        String cid;
        Video video;
        UrlModel cover;
        List<String> urlList;
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.rjb);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (ConstraintLayout) viewFindViewById;
        }
        C786410Ut5.Y7((ConstraintLayout) viewFindViewById, new ACListenerS141S0100000_6(this, 120));
        View viewFindViewById2 = this.LLILZ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.riv);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZ = (ConstraintLayout) viewFindViewById2;
        }
        C786410Ut5.Y7((ConstraintLayout) viewFindViewById2, new View.OnClickListener() { // from class: X.0HC4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        });
        NR().LIZJ();
        View viewFindViewById3 = this.LLILZLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.hfi);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZLL = (FrameLayout) viewFindViewById3;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById3, new ACListenerS141S0100000_6(this, 121));
        View viewFindViewById4 = this.LLIZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.f4x);
            } else {
                viewFindViewById4 = null;
            }
            this.LLIZ = (C0H90) viewFindViewById4;
        }
        C0H90 c0h90 = (C0H90) viewFindViewById4;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c0h90.LJ(iLIZIZ2, iLIZIZ, iLIZIZ2);
        c0h90.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c0h90.LJFF(43, 5, 12, null);
        c0h90.LIZ((Comment) this.LLJJI.getValue(), null);
        Aweme aweme = getAweme();
        String str2 = "";
        if (aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJIJL(getContext());
        c1331670kl3LJIIIZ.LIZLLL("load_comment_post_cover");
        c1331670kl3LJIIIZ.LJJII(new C0ID3(this, 4));
        if (MR().getParent() != null) {
            HandlerHook.viewPost(MR(), new ARunnableS106S0100000_6(this, 212));
        }
        C0HC5.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_comment_input_also_comment_post_demo_first_show_");
        sbLIZ.append(curUserId);
        C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ), Boolean.TRUE);
        Aweme aweme2 = getAweme();
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        Comment comment = (Comment) this.LLJJI.getValue();
        if (comment != null && (cid = comment.getCid()) != null) {
            str2 = cid;
        }
        String str3 = (String) this.LLJJIJI.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("comment_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        C1350920lG6.LJJJ(c2344009Gk, "comment_post_pop_up");
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a_k);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd = C786410Ut5.Sd(R.layout.a1_, layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
