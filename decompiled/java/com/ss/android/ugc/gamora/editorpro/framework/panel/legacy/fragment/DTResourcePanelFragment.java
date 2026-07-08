package com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment;

import X.C01GW;
import X.C093Y;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0E2B;
import X.C0E2C;
import X.C0E46;
import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0EG9;
import X.C0EHD;
import X.C0EU6;
import X.C0FU0;
import X.C13LQ;
import X.C1619980sG4;
import X.C19EG;
import X.C2252611DEt;
import X.C350410DoV;
import X.C350870DpF;
import X.C354270Duj;
import X.C357780E0y;
import X.C358810E4x;
import X.C360090E9v;
import X.C361650EFv;
import X.C362550EJh;
import X.C365830EVx;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC357140DzM;
import X.InterfaceC1364105Vn;
import X.InterfaceC360730ECh;
import X.ViewOnLayoutChangeListenerC391530FWt;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.AAListenerS316S0100000_5;
import Y.AAListenerS49S0210000_5;
import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS74S0200000_5;
import Y.ATListenerS439S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.ss.ugc.android.editor.bottom.panel.BasePanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DTResourcePanelFragment<VM extends ViewModel> extends BasePanelFragment implements C0EHD {
    public static final /* synthetic */ int LLJLLL = 0;
    public LinearLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public TuxTextView LLJJ;
    public boolean LLJJIJI;
    public C360090E9v LLJJIJIIJIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public boolean LLJJI = true;
    public final boolean LLJJIII = true;
    public final boolean LLJJIJIL = true;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5((DTResourcePanelFragment) this, 812));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5((DTResourcePanelFragment) this, 809));
    public final Set<String> LLJJJJ = C093Y.LJ("volume_panel", "speed_panel", "tts_panel", "voice_effect", "magic_panel", "video_anim_panel", "video_transition", "filter_panel", "adjust_filter_panel");
    public final Set<String> LLJJJJJIL = C13LQ.LJLIIL(new String[]{"inline_caption", "inline_caption_font", "video_effect_panel", "audio_beats", "speed_curve_edit_panel"});
    public final Set<String> LLJJJJLIIL = Collections.singleton("async_tasks");
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5((DTResourcePanelFragment) this, 811));
    public final boolean LLJJLIIIJLLLLLLLZ = true;
    public final Set<String> LLJL = C13LQ.LJLIIL(new String[]{"adjust_range_panel", "sound_adjust_panel", "customize_cutout_panel", "smart_trim_panel"});
    public final C362550EJh LLJLIL = new C361650EFv(this) { // from class: X.0EJh
        public final /* synthetic */ DTResourcePanelFragment<VM> LIZ;

        /* JADX WARN: Multi-variable type inference failed */
        {
            this.LIZ = this;
        }

        @Override // X.C361650EFv, X.InterfaceC357170DzP
        public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            this.LIZ.getClass();
        }

        @Override // X.InterfaceC357170DzP
        public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BaseUndoRedoFragment::UndoRedoListener::succeed=");
            sbLIZ.append(z);
            sbLIZ.append(", Operation=");
            sbLIZ.append(enumC357140DzM);
            C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                this.LIZ.PS(enumC357140DzM);
            }
        }
    };
    public final int LLJLLIL = C0FU0.LIZ(30.0f);

    public boolean FS() {
        return false;
    }

    public void GS() {
        JS(false);
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public void NR() {
        ZR(null, false);
    }

    public abstract void PS(EnumC357140DzM enumC357140DzM);

    public abstract VM QS();

    public void UR() {
    }

    public void clearFromXmlViewCache() {
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    public String hS() {
        return null;
    }

    public abstract String qS();

    public boolean uS() {
        return false;
    }

    public final boolean BS() {
        boolean zContains = this.LLJJJJ.contains(qS());
        boolean zContains2 = this.LLJJJJJIL.contains(qS());
        boolean zContains3 = this.LLJJJJLIIL.contains(qS());
        if (C0E2B.LIZ()) {
            return zContains || zContains2 || zContains3;
        }
        return false;
    }

    public void NS() {
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.getPlayer().LJIJJLI();
            C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, hS(), true, true);
        }
        NR();
    }

    public final LinearLayout bS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b6z) : null;
            this.LLJILLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fii) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView dS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fij) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout gS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fk6) : null;
            this.LLIZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final NLEModel mS() {
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            return C350870DpF.LJI(c0e48);
        }
        return null;
    }

    public final ConstraintLayout nS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pp3) : null;
            this.LLJILJILJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final View oS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q28) : null;
            this.LLJILJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C0EU6 rS() {
        return (C0EU6) this.LLJJL.getValue();
    }

    public final VM wS() {
        return (VM) this.LLJJJ.getValue();
    }

    public void HS() {
        NR();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.LLFII().LJI().resetHead();
            C0E55 player = c0e48.getPlayer();
            player.LJIJJLI();
            player.pause(false);
        }
    }

    public final void RS() {
        MutableLiveData mutableLiveDataLIZ;
        View view;
        C0EU6 c0eu6RS = rS();
        C0E48 c0e48 = this.LL;
        c0eu6RS.LJII = c0e48;
        if (this.LLJJI && c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.TRUE, "is_bottom_panel_showing", false);
        }
        View view2 = getView();
        if (view2 != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view2, new ARunnableS74S0200000_5(view2, this, 61));
        }
        LinearLayout linearLayoutGS = gS();
        if (linearLayoutGS != null) {
            if (!linearLayoutGS.isLaidOut() || linearLayoutGS.isLayoutRequested()) {
                linearLayoutGS.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 20));
            } else {
                C360090E9v c360090E9v = this.LLJJIJIIJIL;
                if (c360090E9v != null) {
                    C354270Duj.LIZJ(50L, new AwS549S0100000_5(c360090E9v.LIZ, 1294));
                }
                if (BS()) {
                    Context context = linearLayoutGS.getContext();
                    if (context != null) {
                        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(C357780E0y.LIZ() ? 20 : 12));
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
                        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
                        linearLayoutGS.setBackground(c384050F3z.LIZ(context));
                    }
                    if (SR() && (view = getView()) != null) {
                        view.setOnTouchListener(new ATListenerS439S0100000_5(this, 11));
                    }
                }
                this.LLJLILLLLZIIL = linearLayoutGS.getHeight();
                ES(true);
                qS();
                if (kS()) {
                    C786410Ut5.ed(linearLayoutGS, this.LLJLILLLLZIIL);
                    linearLayoutGS.animate().translationYBy(-this.LLJLILLLLZIIL).setDuration(this.LLJJJJ.contains(qS()) ? 250L : this.LLJJJJJIL.contains(qS()) ? 300L : 350L).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new AAListenerS316S0100000_5(this, 10));
                }
            }
        }
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view3 = getView();
            viewFindViewById = view3 != null ? view3.findViewById(R.id.fih) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById, new ACListenerS140S0100000_5(this, 164));
        C786410Ut5.h9(cS(), new ACListenerS140S0100000_5(this, 165));
        C786410Ut5.Y7(nS(), new ACListenerS140S0100000_5(this, 166));
        C0EG9.LIZ((ViewGroup) oS(), new AwS549S0100000_5((DTResourcePanelFragment) this, 1713));
        C786410Ut5.R7(bS(), new ACListenerS140S0100000_5(this, 167));
        WR(true);
        C0E48 c0e482 = this.LL;
        if (c0e482 != null && (mutableLiveDataLIZ = c0e482.S7().LIZ("common_close_panel_event")) != null) {
            mutableLiveDataLIZ.observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 187));
        }
        if (BS()) {
            View view4 = this.LLIZLLLIL;
            if (view4 == null) {
                View view5 = getView();
                View viewFindViewById2 = view5 != null ? view5.findViewById(R.id.b71) : null;
                this.LLIZLLLIL = (TuxTextView) viewFindViewById2;
                view4 = viewFindViewById2;
            }
            ((TuxTextView) view4).setTuxFont(62);
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                viewGroup.setOnTouchListener(new ATListenerS439S0100000_5(this, 12));
            }
        }
    }

    public final void US() {
        if (C357780E0y.LIZ()) {
            FrameLayout frameLayout = (FrameLayout) oS();
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayoutNS = nS();
        if (constraintLayoutNS != null) {
            C786410Ut5.LL(0, constraintLayoutNS);
        }
    }

    @Override // X.C0EHD
    public final String getPanelName() {
        return qS();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C0E48 c0e48;
        super.onDestroy();
        if (!C0E47.LIZ() || (c0e48 = this.LL) == null) {
            return;
        }
        c0e48.Bo().LIZJ(this.LLJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewGroup viewGroup;
        super.onDestroyView();
        if (BS() && (viewGroup = this.LLILZ) != null) {
            viewGroup.setOnTouchListener(null);
        }
        clearFromXmlViewCache();
    }

    public final int sS() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C19EG activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.gcu)) == null || (viewFindViewById2 = activity.findViewById(R.id.ygy)) == null || (viewFindViewById3 = activity.findViewById(R.id.gcv)) == null) {
            return 0;
        }
        return viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight() + viewFindViewById3.getMeasuredHeight();
    }

    public final void zS() {
        LinearLayout linearLayoutBS = bS();
        if (linearLayoutBS != null) {
            C786410Ut5.LJZL(8, linearLayoutBS);
        }
    }

    public boolean iS() {
        return this.LLJJIII;
    }

    public boolean kS() {
        return this.LLJJIJIL;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public boolean yS() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public void ES(boolean z) {
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C0E2C(this.LLJLILLLLZIIL, qS(), z), "panel_bounce_event", false);
        }
    }

    public void JS(boolean z) {
        String uuid;
        NLECommit head;
        String uuid2;
        NLECommit headPrev;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            C0E55 player = c0e48.getPlayer();
            player.LJIJJLI();
            player.pause(false);
            NLEBranch branch = c0e48.LLFII().LJI().getBranch();
            String str = "";
            if (branch == null || (headPrev = branch.getHeadPrev()) == null || (uuid = headPrev.getUUID()) == null) {
                uuid = "";
            }
            C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, hS(), true, true);
            if (!z) {
                NLEBranch branch2 = c0e48.LLFII().LJI().getBranch();
                if (branch2 != null && (head = branch2.getHead()) != null && (uuid2 = head.getUUID()) != null) {
                    str = uuid2;
                }
                c0e48.LLFII().LJI().trimRange(uuid, str);
            }
        }
        NR();
    }

    public final void WR(boolean z) {
        Integer num;
        if (uS()) {
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            C0E48 c0e48 = this.LL;
            if (c0e48 != null) {
                c0e48.S7().LIZIZ(new C358810E4x(num), "switch_track_style", false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (C0E47.LIZ()) {
            C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
            InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
            if (interfaceC360730ECh != null) {
                interfaceC360730ECh.getResourceConfig();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0E47.LIZ();
    }

    public static void VR(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C0FU0.LIZ(f);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void ZR(C2252611DEt c2252611DEt, boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationYBy;
        long j;
        ViewPropertyAnimator interpolator;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.getWindow();
        }
        LinearLayout linearLayoutGS = gS();
        if (linearLayoutGS != null && (viewPropertyAnimatorAnimate = linearLayoutGS.animate()) != null && (viewPropertyAnimatorTranslationYBy = viewPropertyAnimatorAnimate.translationYBy(this.LLJLILLLLZIIL)) != null) {
            if (this.LLJJJJ.contains(qS())) {
                j = 200;
            } else if (this.LLJJJJJIL.contains(qS())) {
                j = 250;
            } else {
                j = 300;
            }
            ViewPropertyAnimator duration = viewPropertyAnimatorTranslationYBy.setDuration(j);
            if (duration != null && (interpolator = duration.setInterpolator(C1619980sG4.LIZLLL())) != null) {
                interpolator.setListener(new AAListenerS49S0210000_5(this, z, c2252611DEt, 1));
            }
        }
        if (c2252611DEt != null) {
            c2252611DEt.LJJII(new AwS584S0100000_5(this, (DTResourcePanelFragment<ViewModel>) 1233));
        }
    }

    public final Object aS(boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ZR(c2252611DEt, z);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!C0E47.LIZ()) {
            C354270Duj.LIZ(0L, new AwS549S0100000_5((DTResourcePanelFragment) this, 810));
            return;
        }
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.Bo().LIZLLL(this.LLJLIL);
        }
        if (C357780E0y.LIZ()) {
            View viewFindViewById = this.LLJ;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.b70);
                } else {
                    viewFindViewById = null;
                }
                this.LLJ = (TuxIconView) viewFindViewById;
            }
            TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_quadrilateral;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
        }
        RS();
    }
}
