package com.ss.android.ugc.aweme.upvote.publish.panel;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import Y.ACListenerS137S0100000_2;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class UpvoteNewbieGuideFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWs8PC0/HELIOSITYkZz8yJiAgZxojPio4LAE2PyclLAgmISEpDz0yLygpJzs=";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        UrlModel avatarThumb;
        super.onViewCreated(view, bundle);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.lc0), new ACListenerS137S0100000_2(this, 49));
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.xfm), new ACListenerS137S0100000_2(this, 50));
        View viewFindViewById = view.findViewById(R.id.bye);
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            C426750GoL.LJIIL(viewFindViewById, null, null, null, 0, 23);
            viewFindViewById.setBackgroundColor(0);
        } else {
            C426750GoL.LJIIL(viewFindViewById, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), 23);
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bv, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        Context context3 = view.getContext();
        if (context3 != null) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.l_8);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.v_white_bar);
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
                constraintLayout.setBackground(c384050F3z.LIZ(context3));
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_repost_bubble_wb);
            if (textView != null) {
                textView.setText(context3.getString(2131846369));
            }
            if (curUser != null) {
                avatarThumb = curUser.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1324840ka2.LJFF(remoteImageView, avatarThumb);
            view.findViewById(R.id.neh).setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-10)), 0, 0);
            HandlerHook.viewPost(view, new ARunnableS102S0100000_2(view, 4));
            Context context4 = view.getContext();
            ((TextView) view.findViewById(R.id.tv_title)).setText(context4.getString(2131846353));
            ((TextView) view.findViewById(R.id.zht)).setText(context4.getString(2131846351));
            ((TextView) view.findViewById(R.id.zhu)).setText(context4.getString(2131846352));
            C786410Ut5.LJZL(8, (LinearLayout) view.findViewById(R.id.ncf));
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.vbz);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6b, viewGroup, false);
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
