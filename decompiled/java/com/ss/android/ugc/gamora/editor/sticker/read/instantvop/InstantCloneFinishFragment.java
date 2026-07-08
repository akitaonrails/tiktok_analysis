package com.ss.android.ugc.gamora.editor.sticker.read.instantvop;

import X.AnonymousClass0956;
import X.C05HP;
import X.C098200Yq;
import X.C0PEM;
import X.C11VM;
import X.C11VO;
import X.C11VR;
import X.C123100dR;
import X.C1295960jpS;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C238400w2;
import X.C786410Ut5;
import X.CountDownTimerC19772612Xs;
import X.InterfaceC497601wk;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneFinishFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiOjs6Ky4pO2EhHELIOSLSQoZyY9OzEtJzslJzViACEgPCQiPQw/JyspDyY9ITYkDz0yLygpJzs=";
    public C11VO LLILLJJLI;
    public C197039127h LLILLL;
    public C197039127h LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public ViewGroup LLIZ;
    public TuxIconView LLIZLLLIL;
    public ViewGroup LLJ;
    public ViewGroup LLJI;
    public ObjectAnimator LLJIJIL;
    public C1295960jpS LLJILJIL;
    public CountDownTimerC19772612Xs LLJILJILJ;
    public String LLJILLL;
    public String LL = "half_screen";
    public final ArrayList<String> LLJJ = C11VR.LIZIZ().supportLanguageList;

    public final void NR() {
        AnonymousClass0956 anonymousClass0956;
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        C11VO c11vo = this.LLILLJJLI;
        if (c11vo != null) {
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            String string = tuxTextView.getText().toString();
            PlayAuditionCallback playAuditionCallback = new PlayAuditionCallback() { // from class: X.11VL
                @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                public final void onAudioFileSuccess(int i, File file) {
                }

                @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                public final void oPrepare() {
                    C01TT.LIZLLL(new AwS573S0100000_29(this.LIZ, 675));
                }

                @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                public final void onPlay() {
                    C01TT.LIZLLL(new AwS430S0200000_29(this.LIZ, c238400w2, 56));
                }

                @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                public final void onStop() {
                    C01TT.LIZLLL(new AwS573S0100000_29(this.LIZ, 676));
                }
            };
            AnonymousClass0956 anonymousClass09562 = c11vo.LIZ.LLJL;
            if (anonymousClass09562 != null) {
                if (anonymousClass09562.isActive() && (anonymousClass0956 = c11vo.LIZ.LLJL) != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c11vo.LIZ.getVopInstantCloneCameraService().stopAudition();
            }
            C11VM c11vm = c11vo.LIZ;
            InterfaceC497601wk coroutineScope = c11vm.getCoroutineScope();
            C1DFH c1dfh = C0PEM.LIZ;
            c11vm.LLJL = C23250099c.LIZLLL(coroutineScope, C2107308Nj.LIZ, null, new C05HP(playAuditionCallback, c11vo.LIZ, string, null), 2);
        }
    }

    public final String MR(String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        if (Intrinsics.LJFF(str, "en")) {
            Context context = getContext();
            if (context == null || (string7 = context.getString(2131858336)) == null) {
                return "English";
            }
            return string7;
        }
        if (Intrinsics.LJFF(str, "zh")) {
            Context context2 = getContext();
            if (context2 == null || (string6 = context2.getString(2131858335)) == null) {
                return "Mandarin";
            }
            return string6;
        }
        if (Intrinsics.LJFF(str, "ja")) {
            Context context3 = getContext();
            if (context3 == null || (string5 = context3.getString(2131858339)) == null) {
                return "Japanese";
            }
            return string5;
        }
        if (Intrinsics.LJFF(str, "es")) {
            Context context4 = getContext();
            if (context4 == null || (string4 = context4.getString(2131858337)) == null) {
                return "Spanish";
            }
            return string4;
        }
        if (Intrinsics.LJFF(str, FollowStatusChangeMethod.PARAM_UID)) {
            Context context5 = getContext();
            if (context5 == null || (string3 = context5.getString(2131858338)) == null) {
                return "Indonesian";
            }
            return string3;
        }
        if (Intrinsics.LJFF(str, "pt")) {
            Context context6 = getContext();
            if (context6 == null || (string2 = context6.getString(2131858340)) == null) {
                return "Portuguese";
            }
            return string2;
        }
        Context context7 = getContext();
        if (context7 == null || (string = context7.getString(2131858336)) == null) {
            return "English";
        }
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.LLILLL = (C197039127h) view.findViewById(R.id.use_voice_button);
        this.LLILZ = (C197039127h) view.findViewById(R.id.vz3);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.hz6);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.m5t);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.wts);
        this.LLJI = (ViewGroup) view.findViewById(R.id.qme);
        this.LLJ = (ViewGroup) view.findViewById(R.id.qmc);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.qmb);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.ns2);
        this.LLJILJIL = c1295960jpS;
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation("creation_instantclone_playing_tux_lottie.json");
            c1295960jpS.setRepeatCount(-1);
        }
        C197039127h c197039127h = this.LLILZ;
        ViewGroup viewGroup = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setButtonVariant(1);
        if (this.LLJJ.size() == 1) {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            C786410Ut5.LJLZ(8, viewGroup2);
            ViewGroup viewGroup3 = this.LLJI;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            C786410Ut5.LJLZ(0, viewGroup3);
        } else {
            ViewGroup viewGroup4 = this.LLJ;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            C786410Ut5.LJLZ(0, viewGroup4);
            ViewGroup viewGroup5 = this.LLJI;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            C786410Ut5.LJLZ(8, viewGroup5);
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 48), c197039127h2);
        C197039127h c197039127h3 = this.LLILZ;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 49), c197039127h3);
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(C11VR.LIZ(C11VR.LIZIZ().auditionDefaultLanguage));
        if (C123100dR.LIZ(C11VR.LIZIZ().auditionDefaultLanguage)) {
            str = C11VR.LIZIZ().auditionDefaultLanguage;
        } else {
            str = "en";
        }
        this.LLJILLL = str;
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        if (str == null) {
            str = null;
        }
        tuxTextView2.setText(MR(str));
        ViewGroup viewGroup6 = this.LLIZ;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 50), viewGroup6);
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 51), tuxIconView);
        ViewGroup viewGroup7 = this.LLJI;
        if (viewGroup7 != null) {
            viewGroup = viewGroup7;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 52), viewGroup);
        this.LLJILJILJ = new CountDownTimerC19772612Xs(this, 0);
        NR();
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
        if (Intrinsics.LJFF(string, "full_screen")) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep0, viewGroup, false);
        } else if (Intrinsics.LJFF(this.LL, "half_screen")) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep1, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ep1, viewGroup, false);
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
