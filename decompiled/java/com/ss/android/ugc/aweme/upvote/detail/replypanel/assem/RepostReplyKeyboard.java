package com.ss.android.ugc.aweme.upvote.detail.replypanel.assem;

import X.AbstractC848400XPy;
import X.C03H5;
import X.C098200Yq;
import X.C09M5;
import X.C0HU6;
import X.C0HV5;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1342130l1v;
import X.C1355330lND;
import X.C1356730lPT;
import X.C1356740lPU;
import X.C1356800lPa;
import X.C1358170lRn;
import X.C1358180lRo;
import X.C1358550lSP;
import X.C13LE;
import X.C1402120mag;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C21647019ng;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2212008la;
import X.C23250099c;
import X.C338520DOw;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427870Gq9;
import X.C438710HIf;
import X.C441580HTg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC19746112Nn;
import X.InterfaceC0148002o;
import X.InterfaceC1352000lHq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS81S0200000_12;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyKeyboard extends BaseDialogFragment implements InterfaceC1352000lHq, InterfaceC724530SbT {
    public static long LLJJIJI = -1;
    public static volatile long LLJJIJIIJIL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoLDsyISHELIOSliOyojJDw8KCE2JGstOjw2JWseLD88OzEeLD8/MQ4pMC08KTco";
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public C427870Gq9 LLIZ;
    public C1355330lND LLIZLLLIL;
    public C197039127h LLJ;
    public final C736950SvV LLJI = new C736950SvV(C13LE.LIZ(RepostSyncViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(253), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public View LLJIJIL;
    public VideoItemParams LLJILJIL;
    public C1356730lPT LLJILJILJ;
    public boolean LLJILLL;
    public Integer LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        PR(false);
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            try {
                if (!isAdded() || isDetached()) {
                    return;
                }
                FragmentManager parentFragmentManager = getParentFragmentManager();
                if (parentFragmentManager == null || parentFragmentManager.LJLJJI()) {
                    return;
                }
                dismissAllowingStateLoss();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final String MR() {
        Aweme aweme;
        Aweme aweme2;
        String aid;
        VideoItemParams videoItemParams = this.LLJILJIL;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && (aid = aweme2.getAid()) != null) {
            return aid;
        }
        C1356730lPT c1356730lPT = this.LLJILJILJ;
        if (c1356730lPT == null || (aweme = c1356730lPT.LJ) == null) {
            return null;
        }
        return aweme.getAid();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1355330lND c1355330lND = this.LLIZLLLIL;
        if (c1355330lND != null) {
            c1355330lND.requestFocus();
        }
        KeyboardUtils.LIZLLL(this.LLIZLLLIL);
        PR(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        Window window3;
        WindowManager.LayoutParams attributes;
        super.onStart();
        if (this.LLJILLL) {
            C19EG activity = getActivity();
            this.LLJJ = (activity == null || (window3 = activity.getWindow()) == null || (attributes = window3.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
            C19EG activity2 = getActivity();
            if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                window2.setSoftInputMode(48);
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        PR(true);
        C1356740lPU.LIZ();
    }

    public final void OR(boolean z) {
        int iIntValue;
        Integer numLIZJ;
        C419910GdJ c419910GdJ;
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            String str = RepostInputFragment._pnsPageId;
            if (z) {
                c419910GdJ = RepostInputFragment.LLLIIIL;
            } else {
                c419910GdJ = RepostInputFragment.LLLIIIIL;
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLILZIL;
        if (tuxIconView2 != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxIconView2.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView3 = this.LLILZIL;
        if (tuxIconView3 != null) {
            tuxIconView3.setSelected(z);
        }
    }

    public final void PR(boolean z) {
        RepostPublicInteractExp.LIZ.getClass();
        RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
        boolean z2 = true;
        int i = 0;
        if (repostPublicInteractConfigLIZIZ == null || !repostPublicInteractConfigLIZIZ.quickEmojiBar || !z || this.LLJJIII) {
            z2 = false;
        }
        View view = this.LLJIJIL;
        if (view != null) {
            if (!z2) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void RR(Editable editable) {
        String string;
        C1355330lND c1355330lND;
        String string2 = null;
        if ((editable != null || ((c1355330lND = this.LLIZLLLIL) != null && (editable = C2204961BRm.I(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsD4TcuK8aJlD4G+1Ax", null))) != null)) && (string = editable.toString()) != null) {
            string2 = a0.LJLIIIL(string).toString();
        }
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            c197039127h.setEnabled(C123100dR.LIZ(string2));
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        C1110404Vy.LIZ().LIZIZ(i, true);
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C441580HTg.LIZ(i, frameLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C1358180lRo.LIZ()) {
            i = R.style.ala;
        } else {
            i = R.style.alc;
        }
        if (Build.VERSION.SDK_INT < 24) {
            setStyle(0, i);
        } else {
            setStyle(1, i);
        }
        setCancelable(true);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C19EG activity;
        Window window;
        Integer num;
        LifecycleCoroutineScope lifecycleScope;
        Editable editableI;
        String str;
        super.onDismiss(dialogInterface);
        C1355330lND c1355330lND = this.LLIZLLLIL;
        if (c1355330lND != null && (editableI = C2204961BRm.I(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsD4TcuK8aJlD4G+1Ax", null))) != null && editableI.length() != 0) {
            HashMap<String, Editable> map = C1356800lPa.LIZ;
            String strMR = MR();
            C1356730lPT c1356730lPT = this.LLJILJILJ;
            if (c1356730lPT != null) {
                RepostReplyStruct repostReplyStruct = c1356730lPT.LIZ;
                if (repostReplyStruct == null || (str = repostReplyStruct.replyId) == null) {
                    str = c1356730lPT.LIZIZ;
                }
            } else {
                str = null;
            }
            if (strMR != null && str != null) {
                Map<String, Editable> map2 = C1356800lPa.LIZJ;
                ((LinkedHashMap) map2).clear();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strMR);
                sbLIZ.append('_');
                sbLIZ.append(str);
                map2.put(C2188811AlT.LIZIZ(sbLIZ), editableI);
            }
        } else {
            ((LinkedHashMap) C1356800lPa.LIZJ).clear();
        }
        if (this.LLJILLL && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (num = this.LLJJ) != null) {
            int iIntValue = num.intValue();
            C19EG activity2 = getActivity();
            if (activity2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activity2)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C2212008la(window, iIntValue, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) throws Throwable {
        String str;
        CharSequence charSequence;
        Editable editableI;
        String string;
        String strLIZ;
        User userLIZ;
        super.onViewCreated(view, bundle);
        if (!C1358180lRo.LIZ()) {
            new C21647019ng(requireContext(), requireView(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("enter_translationY", new C0HV5(C1110404Vy.LIZ().LIZJ(false), 0.0f)))), false).LJI(true);
        }
        view.findViewById(R.id.tai);
        this.LLJ = (C197039127h) view.findViewById(R.id.up_);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.gzl);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.h04);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.gzv);
        this.LLIZ = (C427870Gq9) view.findViewById(R.id.bh2);
        this.LLIZLLLIL = (C1355330lND) view.findViewById(R.id.grz);
        View viewFindViewById = view.findViewById(R.id.pw5);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 99), viewFindViewById);
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C441580HTg.LIZ(C1110404Vy.LIZ().LIZJ(false), frameLayout);
        }
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.o76);
        RepostPublicInteractExp.LIZ.getClass();
        RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
        if (repostPublicInteractConfigLIZIZ != null && repostPublicInteractConfigLIZIZ.replyMention) {
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 != null) {
                C786410Ut5.I7(new AbS701S0100000_21(this, 11, 42), tuxIconView2);
            }
        } else {
            View viewFindViewById2 = view.findViewById(R.id.taj);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
        TuxIconView tuxIconView3 = this.LLILZIL;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 12, 42), tuxIconView3);
        }
        C427870Gq9 c427870Gq9 = this.LLIZ;
        if (c427870Gq9 != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        C1355330lND c1355330lND = this.LLIZLLLIL;
        if (c1355330lND != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c1355330lND.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C1355330lND c1355330lND2 = this.LLIZLLLIL;
        if (c1355330lND2 != null) {
            Context context = getContext();
            if (context != null) {
                Object[] objArr = new Object[1];
                C1356730lPT c1356730lPT = this.LLJILJILJ;
                if (c1356730lPT != null && (userLIZ = c1356730lPT.LIZ()) != null) {
                    C1243240iSQ.LIZ.getClass();
                    strLIZ = C1243240iSQ.LIZ(userLIZ, true);
                } else {
                    strLIZ = null;
                }
                objArr[0] = strLIZ;
                string = context.getString(2131835456, objArr);
            } else {
                string = null;
            }
            c1355330lND2.setHint(string);
        }
        C1355330lND c1355330lND3 = this.LLIZLLLIL;
        if (c1355330lND3 != null) {
            c1355330lND3.setMaxLines(1);
        }
        C1355330lND c1355330lND4 = this.LLIZLLLIL;
        if (c1355330lND4 != null) {
            c1355330lND4.setEllipsize(TextUtils.TruncateAt.END);
        }
        C1355330lND c1355330lND5 = this.LLIZLLLIL;
        if (c1355330lND5 != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 13, 42), c1355330lND5);
        }
        C1355330lND c1355330lND6 = this.LLIZLLLIL;
        if (c1355330lND6 != null) {
            c1355330lND6.setFilters(new C09M5[]{new C09M5(500, new AwS565S0100000_21(this, 940))});
        }
        C1355330lND c1355330lND7 = this.LLIZLLLIL;
        if (c1355330lND7 != null) {
            c1355330lND7.addTextChangedListener(new C1402120mag(this, 10));
        }
        HashMap<String, Editable> map = C1356800lPa.LIZ;
        String strMR = MR();
        C1356730lPT c1356730lPT2 = this.LLJILJILJ;
        if (c1356730lPT2 != null) {
            RepostReplyStruct repostReplyStruct = c1356730lPT2.LIZ;
            if (repostReplyStruct == null || (str = repostReplyStruct.replyId) == null) {
                str = c1356730lPT2.LIZIZ;
            }
        } else {
            str = null;
        }
        if (strMR != null && str != null) {
            Map<String, Editable> map2 = C1356800lPa.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strMR);
            sbLIZ.append('_');
            sbLIZ.append(str);
            charSequence = (CharSequence) ((LinkedHashMap) map2).get(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            charSequence = null;
        }
        C1355330lND c1355330lND8 = this.LLIZLLLIL;
        if (c1355330lND8 != null) {
            c1355330lND8.setText(charSequence);
        }
        C1355330lND c1355330lND9 = this.LLIZLLLIL;
        if (c1355330lND9 != null) {
            editableI = C2204961BRm.I(c1355330lND9, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsD4TcuK8aJlD4G+1Ax", null));
        } else {
            editableI = null;
        }
        RR(editableI);
        if (C1358180lRo.LIZ()) {
            C1355330lND c1355330lND10 = this.LLIZLLLIL;
            if (c1355330lND10 != null) {
                c1355330lND10.requestFocus();
            }
            KeyboardUtils.LIZLLL(this.LLIZLLLIL);
        }
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 14, 42), c197039127h);
        }
        if (!C1358180lRo.LIZ() && !this.LLJJI) {
            this.LLJJI = true;
            C723850SaN.LIZ(this, false, null, new AwS387S0200000_21(this, view, 58), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS387S0200000_21(this, view, 41), 3);
        this.LLJIJIL = view.findViewById(R.id.upvote_quick_emoji_bar);
        NR(0, "enter_text", null);
        if (C1356740lPU.LIZ != 0) {
            C1356740lPU.LIZLLL = System.currentTimeMillis();
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T67
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    if (C1356740lPU.LIZ != 0 && C1356740lPU.LJ == 0) {
                        C1356740lPU.LJ = System.currentTimeMillis();
                    }
                    View view2 = view;
                    HandlerHook.viewPost(view2, new ARunnableS81S0200000_12(view2, this, this, 87));
                }
            };
            viewTreeObserver.addOnDrawListener(onDrawListener);
            C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
        }
    }

    public final void NR(int i, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String uid;
        int iLIZLLL;
        String str8;
        RepostReplyStruct repostReplyStruct;
        User userLIZ;
        User userLIZ2;
        RepostReplyStruct repostReplyStruct2;
        C1356730lPT c1356730lPT = this.LLJILJILJ;
        String str9 = null;
        if (c1356730lPT != null && (repostReplyStruct2 = c1356730lPT.LIZ) != null) {
            str3 = repostReplyStruct2.repostId;
        } else {
            str3 = null;
        }
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = this.LLJILJIL;
        if (videoItemParams == null || (str4 = videoItemParams.mEventType) == null) {
            C1356730lPT c1356730lPT2 = this.LLJILJILJ;
            if (c1356730lPT2 != null) {
                str4 = c1356730lPT2.LJFF;
            } else {
                str4 = null;
            }
        }
        C1356730lPT c1356730lPT3 = this.LLJILJILJ;
        if (c1356730lPT3 != null) {
            str5 = c1356730lPT3.LJIIIIZZ;
            if (str5 == null) {
                str5 = c1356730lPT3.LJI;
            }
        } else {
            str5 = null;
        }
        String strMR = MR();
        C1356730lPT c1356730lPT4 = this.LLJILJILJ;
        if (c1356730lPT4 != null && c1356730lPT4.LIZLLL) {
            str6 = "repost_with_text";
        } else {
            str6 = "repost_no_text";
        }
        if (c1356730lPT4 != null && c1356730lPT4.LIZ != null) {
            str7 = "reply_to_reply";
        } else {
            str7 = "reply_to_repost";
        }
        if (c1356730lPT4 != null && (userLIZ2 = c1356730lPT4.LIZ()) != null) {
            uid = userLIZ2.getUid();
        } else {
            uid = null;
        }
        C1356730lPT c1356730lPT5 = this.LLJILJILJ;
        if (c1356730lPT5 != null && (userLIZ = c1356730lPT5.LIZ()) != null) {
            iLIZLLL = C1358170lRn.LIZLLL(userLIZ);
        } else {
            iLIZLLL = 0;
        }
        if (str3 == null) {
            C1356730lPT c1356730lPT6 = this.LLJILJILJ;
            if (c1356730lPT6 != null) {
                str3 = c1356730lPT6.LIZIZ;
            } else {
                str3 = null;
            }
        }
        C1356730lPT c1356730lPT7 = this.LLJILJILJ;
        if (c1356730lPT7 != null && (repostReplyStruct = c1356730lPT7.LIZ) != null) {
            str8 = repostReplyStruct.replyId;
        } else {
            str8 = null;
            if (c1356730lPT7 != null) {
            }
            c1358550lSP.getClass();
            C1358550lSP.LJI(str, str4, str5, strMR, str6, str7, uid, str2, iLIZLLL, str3, str8, str9, null, i);
        }
        str9 = c1356730lPT7.LJII;
        c1358550lSP.getClass();
        C1358550lSP.LJI(str, str4, str5, strMR, str6, str7, uid, str2, iLIZLLL, str3, str8, str9, null, i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        View viewTd;
        Long lValueOf = Long.valueOf(LLJJIJI);
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        C19GS c19gs = null;
        if (!z) {
            lValueOf = null;
        }
        VideoItemParams videoItemParams = this.LLJILJIL;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        C1356730lPT c1356730lPT = this.LLJILJILJ;
        if (c1356730lPT != null) {
            str2 = c1356730lPT.LJI;
        } else {
            str2 = null;
        }
        C1356740lPU.LIZJ(lValueOf, "repost_reply", str, str2);
        if (C1356740lPU.LIZ != 0 && C1356740lPU.LIZIZ == 0) {
            C1356740lPU.LIZIZ = System.currentTimeMillis();
        }
        if (C1358180lRo.LIZ()) {
            viewTd = C21146717pB.LIZIZ(requireContext(), R.layout.i6x, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6x, viewGroup, false);
        }
        if (C1356740lPU.LIZ != 0 && C1356740lPU.LIZJ == 0) {
            C1356740lPU.LIZJ = System.currentTimeMillis();
        }
        LLJJIJIIJIL = 0L;
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(getContext(), viewTd);
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
