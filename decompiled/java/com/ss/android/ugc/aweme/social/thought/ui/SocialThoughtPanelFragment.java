package com.ss.android.ugc.aweme.social.thought.ui;

import X.AbstractC1387200mCc;
import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0DZ2;
import X.C0DZ3;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C1906580ziK;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C2097608Jq;
import X.C23250099c;
import X.C341110DYv;
import X.C341150DYz;
import X.C341220DZg;
import X.C418440Gaw;
import X.C438490HHj;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC1427810nG7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS282S0300000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtPanelFragment extends BaseFragment {
    public static final int LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJGs4ISHELIOSAmLy04Zzo6ZhYjKiYyJBEkJjo0IDEcKCE2JAM+KCg+LSs4";
    public Function0<Unit> LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public Boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public final List<String> LLJILJIL = new ArrayList();
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 216));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 217));

    static {
        new C0DZ3();
        LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(15.305d)));
    }

    public final SocialThoughtAuthorPanelVM SR() {
        return (SocialThoughtAuthorPanelVM) this.LLJJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Bundle arguments;
        String str;
        C19EG activity = getActivity();
        if ((activity == null || !activity.isChangingConfigurations()) && ZR() == C0DZ2.CONSUMPTION_OTHERS) {
            long j = this.LLJILJILJ;
            if (j != 0 && (arguments = getArguments()) != null) {
                Serializable serializable = arguments.getSerializable("thought_info");
                ThoughtInfo thoughtInfo = serializable instanceof ThoughtInfo ? (ThoughtInfo) serializable : null;
                Serializable serializable2 = arguments.getSerializable("user");
                User user = serializable2 instanceof User ? (User) serializable2 : null;
                String str2 = this.LLIZLLLIL;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = this.LLJ;
                if (str4 == null) {
                    str4 = "";
                }
                String strLJIILL = C341220DZg.LJIILL(user, user != null ? user.getUid() : null);
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                List listLLIIII = C13LP.LLIIII(this.LLJILJIL);
                Pair[] pairArr = new Pair[8];
                pairArr[0] = new Pair("enter_from", str2);
                pairArr[1] = new Pair("enter_method", str4);
                pairArr[2] = new Pair("is_mention", 0);
                if (thoughtInfo != null && (str = thoughtInfo.authorUid) != null) {
                    str3 = str;
                }
                pairArr[3] = new Pair("author_id", str3);
                pairArr[4] = new Pair("is_new_thought", 1);
                pairArr[5] = new Pair("follow_status", strLJIILL);
                pairArr[6] = new Pair("stay_duration", Long.valueOf(jCurrentTimeMillis));
                pairArr[7] = new Pair("interactions", C13LP.LJJLIIIJ(listLLIIII, ",", null, null, 0, null, null, 62));
                C341220DZg.LJIIZILJ("note_half_screen_exit", C2097608Jq.LJIIIIZZ(pairArr));
                this.LLJILJILJ = 0L;
            }
        }
        super.onDestroy();
    }

    public final boolean UR() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("in_aggregate_flow", false);
    }

    public final C0DZ2 ZR() {
        String string;
        Object c098200Yq;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("mode")) != null) {
            try {
                c098200Yq = C0DZ2.valueOf(string);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C0DZ2 c0dz2 = (C0DZ2) c098200Yq;
            if (c0dz2 != null) {
                return c0dz2;
            }
        }
        return C0DZ2.CREATION;
    }

    public final void VR(String str) {
        C341220DZg c341220DZg = C341220DZg.LIZ;
        ThoughtInfo value = SR().LLILLL.getValue();
        String str2 = SR().LL;
        String str3 = SR().LLILLJJLI;
        c341220DZg.getClass();
        C341220DZg.LJIIZILJ("ttsocial_creator_thought_view_panel_click", C2097608Jq.LJIILIIL(C341220DZg.LJ(value, str2, str3), new Pair("button_name", str)));
    }

    public final void WR(String str) {
        C341220DZg c341220DZg = C341220DZg.LIZ;
        ThoughtInfo value = SR().LLILLL.getValue();
        String str2 = SR().LL;
        String str3 = SR().LLILLJJLI;
        c341220DZg.getClass();
        C341220DZg.LJIIZILJ("ttsocial_thought_delete_confirm_popup_click", C2097608Jq.LJIILIIL(C341220DZg.LJII(value, str2, str3), new Pair("button_name", str)));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (ZR() == C0DZ2.CONSUMPTION_SELF && (arguments = getArguments()) != null) {
            SR().LL = arguments.getString("enter_from", "");
            SR().LLILLJJLI = arguments.getString("enter_method", "");
        }
        C438490HHj.LIZ.getClass();
        if (C438490HHj.LIZJ.compareAndSet(false, true)) {
            ((ExecutorService) C438490HHj.LIZIZ.getValue()).execute(new Runnable() { // from class: X.0O51
                public static void LIZ() {
                    String accessKey;
                    try {
                        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
                        if (iMainService == null || (accessKey = iMainService.getAccessKey()) == null || accessKey.length() <= 0 || 1 == 0) {
                            C438490HHj.LIZJ.set(false);
                            return;
                        }
                        C1537050q6J.LIZ.getClass();
                        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                        if (c1551950qULLIZ == null) {
                            C438490HHj.LIZJ.set(false);
                            return;
                        }
                        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new CheckRequestBodyModel.TargetChannel("story_thought_bg_res"));
                        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                        optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
                        optionCheckUpdateParams.setListener(new C0P4B(2));
                        c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, listLJIILJJIL)), optionCheckUpdateParams);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ThoughtLottieGecko@4e7d.prefetch$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ThoughtLottieGecko@4e7d.prefetch$1");
                }
            });
        }
    }

    public static void aS(SocialThoughtPanelFragment socialThoughtPanelFragment, int i) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        socialThoughtPanelFragment.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            if (i != 0) {
                c1389890mGx.LJIIIZ(i);
            } else {
                c1389890mGx.LJIIJ("");
            }
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (ZR() != C0DZ2.CONSUMPTION_SELF) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C341110DYv(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C341150DYz(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        C0DZ2 c0dz2ZR = ZR();
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1997166967, new AwS282S0300000_4(c0dz2ZR, arguments, this, 3), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
