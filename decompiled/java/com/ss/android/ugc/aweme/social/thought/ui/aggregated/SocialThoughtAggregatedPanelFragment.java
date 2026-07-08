package com.ss.android.ugc.aweme.social.thought.ui.aggregated;

import X.C01GW;
import X.C098200Yq;
import X.C0DZG;
import X.C0DZH;
import X.C0DZJ;
import X.C0DZM;
import X.C0DZU;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C2097608Jq;
import X.C2252321DDq;
import X.C23250099c;
import X.C341220DZg;
import X.C452501pT;
import X.C497820Jfg;
import X.EnumC1427810nG7;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtAggregatedPanelFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJGs4ISAmLy04Zzo6ZiQrHELIOSLj02LyQ4LCt9GyovIC4/HC0jPCg7PAQrLj02LyQ4LCsDKSspJQkhKSIhLCEn";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 218));

    public final SocialThoughtAggregatedVM SR() {
        return (SocialThoughtAggregatedVM) this.LLIZ.getValue();
    }

    public final String getEnterFrom() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("enter_from")) == null) ? "" : string;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String str;
        Object value;
        super.onViewCreated(view, bundle);
        SocialThoughtAggregatedVM socialThoughtAggregatedVMSR = SR();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("from_thought_id")) == null) {
            string = "";
        }
        String enterFrom = getEnterFrom();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("enter_method")) == null) {
            string2 = "";
        }
        if (!socialThoughtAggregatedVMSR.LLIZLLLIL) {
            socialThoughtAggregatedVMSR.LLIZLLLIL = true;
            socialThoughtAggregatedVMSR.LLILZIL = enterFrom;
            C341220DZg.LIZ.getClass();
            C341220DZg.LJIIZILJ("ttsocial_friends_thoughts_panel_enter", C2097608Jq.LJIIIIZZ(new Pair("enter_from", enterFrom), new Pair("enter_method", string2), new Pair("position", "guest_thought_view_panel"), new Pair("from_author_id", ""), new Pair("from_thought_id", string)));
            C0DZM.LIZ.getClass();
            if (C0DZM.LJ()) {
                synchronized (C0DZM.LIZIZ) {
                    try {
                        str = C0DZM.LIZLLL;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                socialThoughtAggregatedVMSR.LLILZLL = str;
                List<ThoughtAggregatedModel> listLIZLLL = C0DZM.LIZLLL();
                C2252321DDq c2252321DDq = socialThoughtAggregatedVMSR.LL;
                do {
                    value = c2252321DDq.getValue();
                } while (!c2252321DDq.compareAndSet(value, C0DZJ.LIZ((C0DZJ) value, listLIZLLL, C0DZM.LIZJ(), false, false, 12)));
                socialThoughtAggregatedVMSR.yQ2(listLIZLLL);
            }
            socialThoughtAggregatedVMSR.xQ2();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C0DZG(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0DZH c0dzh = new C0DZH(requireContext());
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1753734090, new AwS440S0200000_4(this, c0dzh, 7), true));
        c0dzh.addView(composeView, new ViewGroup.LayoutParams(-1, -1));
        C0DZU c0dzu = C0DZU.LIZ;
        C19EG c19egRequireActivity = requireActivity();
        c0dzu.getClass();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) ((Resources.getSystem().getDisplayMetrics().heightPixels - C497820Jfg.LIZJ(c19egRequireActivity)) * 0.8f));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0dzh);
        c0dzh.setLayoutParams(layoutParams);
        try {
            ViewTreeLifecycleOwner.set(c0dzh, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c0dzh, this);
            c0dzh.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c0dzh;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c0dzh;
        }
    }
}
