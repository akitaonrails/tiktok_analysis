package com.ss.android.ugc.aweme.upvote.detail.input;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AnimationAnimationListenerC1401870maH;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09M5;
import X.C0B0R;
import X.C0B0S;
import X.C0B0T;
import X.C0B12;
import X.C0HU6;
import X.C0HV5;
import X.C0I7D;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1342130l1v;
import X.C1355330lND;
import X.C1356740lPU;
import X.C1356800lPa;
import X.C1358180lRo;
import X.C1358550lSP;
import X.C1358720lSg;
import X.C1358880lSw;
import X.C1358940lT2;
import X.C1359030lTB;
import X.C1359350lTh;
import X.C1359360lTi;
import X.C1359460lTs;
import X.C1359730lUJ;
import X.C1359770lUN;
import X.C1359790lUP;
import X.C1359970lUh;
import X.C1360460lVU;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391890mKB;
import X.C1391960mKI;
import X.C13LQ;
import X.C1402120mag;
import X.C1402210map;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C188900o3;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C197039127h;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21146717pB;
import X.C21647019ng;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C259800zU;
import X.C263730AVf;
import X.C263820AVo;
import X.C298430Bmr;
import X.C298740BnM;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427870Gq9;
import X.C429430Gsf;
import X.C438710HIf;
import X.C439850HMp;
import X.C452501pT;
import X.C453740Hqm;
import X.C720360SNm;
import X.C723850SaN;
import X.C724220Say;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1359800lUQ;
import X.EnumC19746112Nn;
import X.InterfaceC0148002o;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC1359760lUM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21641019mi;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnGlobalLayoutListenerC1402100mae;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS81S0200000_12;
import Y.ATListenerS454S0100000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.setting.PublishOptConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS125S1000000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostInputFragment extends BaseDialogFragment implements InterfaceC1352000lHq, InterfaceC724530SbT, RepostInputAbility, View.OnClickListener {
    public static final C419910GdJ LLLIIIIL;
    public static final C419910GdJ LLLIIIL;
    public static final C419910GdJ LLLIIL;
    public static long LLLIILIL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoHELIOSLDsyISliICEjPTFiGyojJzY4ACEjPTEKOy40JSAiPQ==";
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public FrameLayout LLILZIL;
    public C427870Gq9 LLILZLL;
    public C1355330lND LLIZ;
    public TuxIconView LLIZLLLIL;
    public RelativeLayout LLJ;
    public TuxIconView LLJI;
    public C197039127h LLJIJIL;
    public RadiusLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public InterfaceC1355580lNc LLJILLL;
    public Aweme LLJJ;
    public boolean LLJJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public InterfaceC1359760lUM LLJJJJLIIL;
    public C0I7D LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public CarrierType LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public C1359460lTs LLLF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJJJ = "";
    public EnumC1359800lUQ LLJJL = EnumC1359800lUQ.INPUT_BOX;
    public String LLJL = "input_panel";
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 847));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 846));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 842));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 844));

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

    static {
        new C1359730lUJ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji;
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJ = numValueOf;
        LLLIIIIL = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_keyboard_circle;
        c419910GdJ2.LJ = numValueOf;
        LLLIIIL = c419910GdJ2;
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ3.LJ = Integer.valueOf(R.attr.zi);
        LLLIIL = c419910GdJ3;
        LLLIILIL = -1L;
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
        } else {
            IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
            if (iRepostStickerAbility != null) {
                iRepostStickerAbility.Om1();
            }
        }
        IRepostMentionAbility iRepostMentionAbilityNR = NR();
        if (iRepostMentionAbilityNR != null) {
            iRepostMentionAbilityNR.d90();
        }
        if (VR()) {
            FrameLayout frameLayout = this.LLJILJILJ;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                try {
                    if (!isAdded() || isDetached()) {
                        return;
                    }
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    if (parentFragmentManager == null || parentFragmentManager.LJLJJI()) {
                        return;
                    }
                    dismiss();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final IRepostMentionAbility NR() {
        return (IRepostMentionAbility) this.LLLIIII.getValue();
    }

    public final void RR() {
        if (!this.LLJJI) {
            this.LLJJI = true;
            C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 24), 3);
        }
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        SR(true);
        this.LLJJJIL = true;
        KeyboardUtils.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        InterfaceC1359760lUM interfaceC1359760lUM;
        LLLIILIL = -1L;
        if (!VR()) {
            super.dismiss();
            return;
        }
        if (this.LLJLIL) {
            return;
        }
        if (!this.LLJLILLLLZIIL && (interfaceC1359760lUM = this.LLJJJJLIIL) != null) {
            C0I7D c0i7d = this.LLJJLIIIJLLLLLLLZ;
            interfaceC1359760lUM.QG(c0i7d != null ? C2204961BRm.LLLLJ(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ==", null)) : null);
        }
        KeyboardUtils.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 843);
        this.LLJLIL = true;
        final int iLIZJ = C1110404Vy.LIZ().LIZJ(false) + C1356800lPa.LIZIZ;
        C21647019ng c21647019ng = new C21647019ng(requireContext(), requireView(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("exit_translationY", new C0HV5(0.0f, iLIZJ)))), false);
        c21647019ng.LIZJ("exit_translationY", new InterfaceC21641019mi() { // from class: X.0lUK
            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                awS565S0100000_21.invoke();
                this.LLJLIL = false;
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                float value = 1 - (interfaceC1844880y6o.getValue() / iLIZJ);
                View view = this.getView();
                if (view != null) {
                    C786410Ut5.T4(view, value);
                }
            }
        });
        c21647019ng.LJI(true);
    }

    public final boolean VR() {
        return C1359970lUh.LIZ() && this.LLJJL != EnumC1359800lUQ.TIMELINE_TAB;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Editable editableLLLLJ;
        super.onDestroyView();
        C0I7D c0i7d = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d == null || (editableLLLLJ = C2204961BRm.LLLLJ(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ==", null))) == null) {
            return;
        }
        if (editableLLLLJ.length() > 0) {
            HashMap<String, Editable> map = C1356800lPa.LIZ;
            Object value = this.LLLI.getValue();
            if (value != null) {
                C1356800lPa.LIZ.put((String) value, editableLLLLJ);
            }
        }
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJILLL;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
        InterfaceC1355580lNc interfaceC1355580lNc2 = this.LLJILLL;
        if (interfaceC1355580lNc2 != null) {
            interfaceC1355580lNc2.LJIJJ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0I7D c0i7d = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d != null) {
            c0i7d.requestFocus();
        }
        KeyboardUtils.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
        IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
        if (iRepostStickerAbility != null) {
            iRepostStickerAbility.r01();
        }
        if (this.LLLF != null) {
            if (this.LLLFZ) {
                C429430Gsf.LIZ("RepostInputFragment", "present complete again (onResume), reposted toast already shown -> skip (encourage path)");
                return;
            }
            this.LLLFZ = true;
            C429430Gsf.LIZ("RepostInputFragment", "present complete (onResume), encourage path -> show Reposted toast");
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131846365);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        Window window;
        Window window2;
        View decorView;
        Window window3;
        super.onStart();
        if (VR()) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window3 = dialog2.getWindow()) != null) {
                window3.setBackgroundDrawable(new ColorDrawable(0));
                window3.clearFlags(2);
                if (this.LLJJL != EnumC1359800lUQ.EMOJI) {
                    window3.setSoftInputMode(21);
                } else {
                    window3.setSoftInputMode(18);
                }
            }
        } else if (this.LLJJL == EnumC1359800lUQ.EMOJI && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window2 = dialog3.getWindow()) == null || (decorView = window2.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        C1356740lPU.LIZ();
    }

    public final void OR(long j) {
        EnumC1359800lUQ enumC1359800lUQ;
        String str;
        if (LLLIILIL == -1 || (enumC1359800lUQ = this.LLJJL) == EnumC1359800lUQ.EMOJI) {
            return;
        }
        switch (C1359790lUP.LIZ[enumC1359800lUQ.ordinal()]) {
            case 1:
            case 2:
            case 3:
                str = "click_pencil_icon";
                break;
            case 4:
                str = "click_single_recommend_avatar";
                break;
            case 5:
                str = "click_panel_mention_icon";
                break;
            case 6:
                str = "repost_tab_guide_bubble";
                break;
            default:
                str = "click_panel_button";
                break;
        }
        if (this.LLLF != null) {
            str = "auto_after_repost";
        }
        long j2 = j - LLLIILIL;
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        String str2 = this.LLJJIII;
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LIZLLL(j2, "latency_duration");
        C20684815ws.LJIILLIIL("ttsocial_click_to_repost_input_state_finish_show_latency", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(boolean r5) {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.LLILZIL
            r3 = 0
            if (r0 == 0) goto L2c
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L2c
            int r2 = r1.intValue()
        L17:
            java.util.HashMap<java.lang.String, android.text.Editable> r0 = X.C1356800lPa.LIZ
            X.C1356800lPa.LIZIZ = r2
            com.ss.android.ugc.aweme.comment.services.IKeyboardService r0 = X.C1110404Vy.LIZ()
            int r1 = r0.LIZJ(r3)
            X.0lUM r0 = r4.LLJJJJLIIL
            if (r0 == 0) goto L2b
            int r2 = r2 + r1
            r0.OH(r2, r5)
        L2b:
            return
        L2c:
            java.util.HashMap<java.lang.String, android.text.Editable> r0 = X.C1356800lPa.LIZ
            int r2 = X.C1356800lPa.LIZIZ
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment.PR(boolean):void");
    }

    public final void SR(boolean z) {
        int iIntValue;
        Integer numLIZJ;
        C419910GdJ c419910GdJ;
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            if (z) {
                c419910GdJ = LLLIIIL;
            } else {
                c419910GdJ = LLLIIIIL;
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxIconView2.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView3 = this.LLJI;
        if (tuxIconView3 != null) {
            tuxIconView3.setSelected(z);
        }
    }

    public final void UR(int i) {
        int iLIZIZ;
        int iLIZIZ2;
        if (this.LLJJIJIIJIL == i) {
            return;
        }
        if (VR()) {
            int height = 0;
            PR(false);
            HashMap<String, Editable> map = C1356800lPa.LIZ;
            FrameLayout frameLayout = this.LLILZIL;
            if (frameLayout != null) {
                height = frameLayout.getHeight();
            }
            C1356800lPa.LIZIZ = height;
            return;
        }
        if (i < 2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29));
        } else {
            if (i < 4) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        C0I7D c0i7d = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d != null) {
            C426750GoL.LJIIIZ(c0i7d, null, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ2), false, 21);
        }
        this.LLJJIJIIJIL = i;
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        ViewGroup.LayoutParams layoutParams;
        if (i == C1110404Vy.LIZ().LIZJ(false)) {
            return;
        }
        C1110404Vy.LIZ().LIZIZ(i, true);
        RadiusLayout radiusLayout = this.LLJILJIL;
        if (radiusLayout != null && (layoutParams = radiusLayout.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        RadiusLayout radiusLayout2 = this.LLJILJIL;
        if (radiusLayout2 != null) {
            radiusLayout2.requestLayout();
        }
        if (VR()) {
            PR(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        Integer numValueOf;
        Editable editableLLLLJI;
        ArrayList<TextExtraStruct> mentionExtraStructList;
        Editable editableLLLLJI2;
        String aid;
        boolean z;
        String str;
        String uid;
        String string;
        String string2;
        RecReasonEntry recReasonTag;
        RecReasonsStruct recReasonsStruct;
        boolean z2;
        int size;
        ArrayList arrayList;
        Integer second;
        String str2;
        String str3;
        String str4;
        boolean z3;
        String requestId;
        Pair<C453740Hqm, Integer> pairTh1;
        User author;
        User author2;
        UpvoteStruct upvoteStructLIZJ;
        Pair<C453740Hqm, Integer> pairTh12;
        Editable editableLLLLJI3;
        long j;
        Boolean boolValueOf = null;
        first = null;
        C453740Hqm first = null;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() != R.id.t_f && numValueOf.intValue() != R.id.ta4) {
                if (numValueOf != null) {
                    if (numValueOf.intValue() == R.id.t_k) {
                        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                        String str5 = this.LLJJIII;
                        c1358550lSP.getClass();
                        C1358550lSP.LJFF("click", str5);
                        TuxIconView tuxIconView = this.LLJI;
                        if (tuxIconView != null && tuxIconView.isSelected()) {
                            TuxIconView tuxIconView2 = this.LLJI;
                            if (tuxIconView2 != null) {
                                tuxIconView2.setSelected(false);
                            }
                            FrameLayout frameLayout = this.LLJILJILJ;
                            if (frameLayout != null) {
                                C786410Ut5.LJZ(8, frameLayout);
                            }
                            SR(false);
                            KeyboardUtils.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
                            j = 300;
                        } else {
                            j = 0;
                        }
                        C0I7D c0i7d = this.LLJJLIIIJLLLLLLLZ;
                        if (c0i7d != null) {
                            HandlerHook.viewPostDelay(c0i7d, new ARunnableS105S0100000_5(c0i7d, 8), j);
                            return;
                        }
                        return;
                    }
                    if (numValueOf.intValue() == R.id.t_g) {
                        TuxIconView tuxIconView3 = this.LLJI;
                        if (tuxIconView3 == null) {
                            return;
                        }
                        tuxIconView3.setSelected(!tuxIconView3.isSelected());
                        if (tuxIconView3.isSelected()) {
                            IRepostMentionAbility iRepostMentionAbilityNR = NR();
                            if (iRepostMentionAbilityNR != null) {
                                iRepostMentionAbilityNR.d90();
                            }
                            RR();
                        } else {
                            FrameLayout frameLayout2 = this.LLJILJILJ;
                            if (frameLayout2 != null) {
                                C786410Ut5.LJZ(8, frameLayout2);
                            }
                            SR(false);
                            KeyboardUtils.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
                        }
                        SR(tuxIconView3.isSelected());
                        return;
                    }
                    if (numValueOf.intValue() == R.id.t_m) {
                        C0I7D c0i7d2 = this.LLJJLIIIJLLLLLLLZ;
                        if (c0i7d2 != null) {
                            editableLLLLJI = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ==", null));
                        } else {
                            editableLLLLJI = null;
                        }
                        String strValueOf = String.valueOf(editableLLLLJI);
                        String string3 = a0.LJLJJL(strValueOf).toString();
                        int length = strValueOf.length() - string3.length();
                        C1355330lND c1355330lND = this.LLIZ;
                        if (c1355330lND != null) {
                            mentionExtraStructList = c1355330lND.getMentionExtraStructList();
                        } else {
                            mentionExtraStructList = null;
                        }
                        if (length > 0 && mentionExtraStructList != null) {
                            for (TextExtraStruct textExtraStruct : mentionExtraStructList) {
                                textExtraStruct.setStart(textExtraStruct.getStart() - length);
                                textExtraStruct.setEnd(textExtraStruct.getEnd() - length);
                            }
                        }
                        Pair pair = new Pair(a0.LJLILLLLZI(string3).toString(), mentionExtraStructList);
                        String str6 = (String) pair.getFirst();
                        List<? extends TextExtraStruct> list = (List) pair.getSecond();
                        C1359360lTi c1359360lTi = (C1359360lTi) this.LLLFF.getValue();
                        if (c1359360lTi != null) {
                            c1359360lTi.LIZ(str6, list);
                            if (str6 != null && str6.length() != 0) {
                                this.LLLFFI = true;
                            }
                            C0I7D c0i7d3 = this.LLJJLIIIJLLLLLLLZ;
                            if (c0i7d3 != null && (editableLLLLJI3 = C2204961BRm.LLLLJI(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ==", null))) != null) {
                                editableLLLLJI3.clear();
                            }
                            dismiss();
                            return;
                        }
                        IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
                        if (iRepostStickerAbility != null && (pairTh12 = iRepostStickerAbility.Th1()) != null) {
                            first = pairTh12.getFirst();
                        }
                        CarrierType carrierType = this.LLJLL;
                        String str7 = this.LLJLLIL;
                        String str8 = this.LLJLLL;
                        Aweme aweme = this.LLJJ;
                        if (aweme != null && (aid = aweme.getAid()) != null) {
                            if (carrierType == CarrierType.COMMENT) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1358880lSw.LIZ.getClass();
                            UpvoteList upvoteListLJFF = C1358880lSw.LJFF(aid);
                            if (upvoteListLJFF != null && (upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteListLJFF)) != null && upvoteStructLIZJ.repostItemSource == 1) {
                                str = "video_comment";
                            } else {
                                str = "video";
                            }
                            C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
                            String str9 = this.LLJJIII;
                            String str10 = this.LLJJIJI;
                            Aweme aweme2 = this.LLJJ;
                            String str11 = "";
                            if (aweme2 == null || (author2 = aweme2.getAuthor()) == null || (uid = author2.getUid()) == null) {
                                uid = "";
                            }
                            Aweme aweme3 = this.LLJJ;
                            if (aweme3 == null || (author = aweme3.getAuthor()) == null || (string = Integer.valueOf(author.getFollowStatus()).toString()) == null) {
                                string = "";
                            }
                            Aweme aweme4 = this.LLJJ;
                            if (aweme4 == null || (string2 = Integer.valueOf(aweme4.getAwemeType()).toString()) == null) {
                                string2 = "";
                            }
                            Aweme aweme5 = this.LLJJ;
                            if (aweme5 != null) {
                                recReasonTag = aweme5.getRecReasonTag();
                            } else {
                                recReasonTag = null;
                            }
                            Aweme aweme6 = this.LLJJ;
                            if (aweme6 != null) {
                                recReasonsStruct = aweme6.getRecReasonsStruct();
                            } else {
                                recReasonsStruct = null;
                            }
                            Aweme aweme7 = this.LLJJ;
                            if (aweme7 != null && C720360SNm.LJI(aweme7)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String strLLIFFJFJJ = ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LLIFFJFJJ(this.LLJJ);
                            String str12 = this.LLJJJ;
                            if (list != null) {
                                size = list.size();
                                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<? extends TextExtraStruct> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().getUserId());
                                }
                            } else {
                                size = 0;
                                arrayList = null;
                            }
                            String strLIZ = C188900o3.LIZ(arrayList);
                            IRepostStickerAbility iRepostStickerAbility2 = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
                            if (iRepostStickerAbility2 != null && (pairTh1 = iRepostStickerAbility2.Th1()) != null) {
                                second = pairTh1.getSecond();
                            } else {
                                second = null;
                            }
                            String str13 = this.LLJJJJ;
                            boolean z4 = this.LLJJJJJIL;
                            String panelDetailMob = this.LLJJL.getPanelDetailMob();
                            Aweme aweme8 = this.LLJJ;
                            if (aweme8 != null && (requestId = aweme8.getRequestId()) != null) {
                                str11 = requestId;
                            }
                            if (z) {
                                str2 = str7;
                                str3 = this.LLJZ;
                                str4 = this.LLJZIJLIL;
                                str = "comment";
                            } else {
                                str2 = null;
                                str3 = null;
                                str4 = null;
                            }
                            UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(str9, str10, aid, uid, string, null, "recommend_panel", false, null == true ? 1 : 0, string2, z2, recReasonTag, recReasonsStruct, null == true ? 1 : 0, strLLIFFJFJJ, 0.0d, null == true ? 1 : 0, null == true ? 1 : 0, str12, "text_input_panel", size, strLIZ, second, str13, z4, null == true ? 1 : 0, null == true ? 1 : 0, panelDetailMob, null == true ? 1 : 0, null == true ? 1 : 0, str11, str3, str2, null == true ? 1 : 0, str, str4, this.LLL, 31395296, 4543);
                            UpvotePublishExtraData upvotePublishExtraData = new UpvotePublishExtraData(this.LLJJ, 2, null == true ? 1 : 0);
                            if (carrierType != CarrierType.COMMENT && !Intrinsics.LJFF(this.LLJJIJI, "bubble") && this.LLJJL != EnumC1359800lUQ.AUTO_OPEN_BY_NOTE_GUIDE) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            c1360460lVU.LJJJ(null, carrierType, first, upvotePublishExtraData, upvotePublishMobParam, 0, aid, str6, str7, str8, list, null, null, z3);
                        }
                        C0I7D c0i7d4 = this.LLJJLIIIJLLLLLLLZ;
                        if (c0i7d4 != null && (editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7d4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ==", null))) != null) {
                            editableLLLLJI2.clear();
                        }
                        if (C1359030lTB.LIZIZ()) {
                            if (first != null) {
                                IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIJLIJ(first.LL);
                            }
                            IRepostStickerAbility iRepostStickerAbility3 = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
                            if (iRepostStickerAbility3 != null) {
                                iRepostStickerAbility3.HA2();
                            }
                        }
                        dismiss();
                        return;
                    }
                }
            } else {
                FrameLayout frameLayout3 = this.LLJILJILJ;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(8, frameLayout3);
                }
                SR(false);
                KeyboardUtils.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
                return;
            }
        }
        IRepostMentionAbility iRepostMentionAbilityNR2 = NR();
        if (iRepostMentionAbilityNR2 != null) {
            boolValueOf = Boolean.valueOf(iRepostMentionAbilityNR2.d90());
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (VR()) {
            setStyle(1, R.style.al9);
        } else {
            if (C1358180lRo.LIZ()) {
                i = R.style.al_;
            } else {
                i = R.style.al6;
            }
            setStyle(1, i);
        }
        setCancelable(true);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        final C19EG c19egLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        WeakReference<C19EG> weakReference;
        super.onDismiss(dialogInterface);
        C1359360lTi c1359360lTi = (C1359360lTi) this.LLLFF.getValue();
        if (c1359360lTi == null) {
            return;
        }
        c1359360lTi.LIZ(null, null);
        if (this.LLLFFI) {
            C1359460lTs c1359460lTs = this.LLLF;
            if (c1359460lTs == null || (weakReference = c1359460lTs.LIZ) == null || (c19egLIZIZ = weakReference.get()) == null) {
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                } else {
                    c19egLIZIZ = null;
                }
            }
            C1359770lUN c1359770lUN = new Object() { // from class: X.0lUN
            };
            final String str = this.LLJJIII;
            c1359770lUN.getClass();
            if (c19egLIZIZ == null) {
                AbstractC1387200mCc abstractC1387200mCcLJFF2 = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF2 != null && (activityLIZIZ2 = abstractC1387200mCcLJFF2.LIZIZ()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ2);
                } else {
                    c19egLIZIZ = null;
                }
            }
            if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed() && !c19egLIZIZ.getSupportFragmentManager().LJLJJI()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show F3 education: popupId=repost_text_education_popup, triggerId=social_repost_text_education_trigger_force_input, enterFrom=");
                sbLIZ.append(str);
                C429430Gsf.LIZ("RepostTextEncourageEducationLauncher", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("F3 show -> mob popup_show, enterFrom=");
                sbLIZ2.append(str);
                C429430Gsf.LIZ("RepostTextEncourageEducationLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                C1358550lSP.LIZ.getClass();
                C20684815ws.LJIJI("ttsocial_repost_text_guide_popup_show", new Pair(str, "enter_from"), new Pair("after_text_added", Scene.SCENE_SERVICE));
                FrameLayout frameLayout = new FrameLayout(c19egLIZIZ) { // from class: X.0FFi
                    public final float LL;
                    public float LLILLJJLI;
                    public final Paint LLILLL;
                    public final Paint LLILZ;
                    public final Paint LLILZIL;
                    public final Paint LLILZLL;
                    public final RectF LLIZ;
                    public final Path LLIZLLLIL;
                    public final RectF LLJ;
                    public final RectF LLJI;
                    public final RectF LLJIJIL;
                    public final RectF LLJILJIL;
                    public float LLJILJILJ;
                    public float LLJILLL;
                    public final C427660Gpo LLJJ;
                    public final TuxTextView LLJJI;
                    public final TuxIconView LLJJIII;
                    public final TuxIconView LLJJIJI;
                    public final TuxIconView LLJJIJIIJIL;
                    public final TuxIconView LLJJIJIL;
                    public final LinearLayout LLJJJ;

                    public final void LIZ() {
                        int iLJIIL;
                        boolean zLIZIZ = C960203pA.LIZIZ(getContext());
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.hz, getContext());
                        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.i5, getContext());
                        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zi, getContext());
                        int iIntValue3 = numLIZJ3 != null ? numLIZJ3.intValue() : -1;
                        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.z_, getContext());
                        int iIntValue4 = numLIZJ4 != null ? numLIZJ4.intValue() : -16777216;
                        float fCenterX = this.LLIZ.centerX();
                        Paint paint = this.LLILLL;
                        RectF rectF = this.LLIZ;
                        paint.setShader(new LinearGradient(fCenterX, rectF.bottom, fCenterX, rectF.top, new int[]{iIntValue, iIntValue, C2441009hQ.LJIIL(iIntValue, 0)}, new float[]{0.0f, 0.74f, 1.0f}, Shader.TileMode.CLAMP));
                        this.LLILLL.setAlpha(165);
                        this.LLILZ.setColor(zLIZIZ ? C2441009hQ.LJIIL(iIntValue3, 45) : C2441009hQ.LJIIL(iIntValue2, 165));
                        int iLJIIL2 = C2441009hQ.LJIIL(iIntValue2, 178);
                        this.LLILZIL.setColor(iIntValue3);
                        this.LLILZIL.setShadowLayer(LIZJ(2.4f), 0.0f, 0.0f, iLJIIL2);
                        Paint paint2 = this.LLILZLL;
                        if (zLIZIZ) {
                            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.zj, getContext());
                            iLJIIL = numLIZJ5 != null ? numLIZJ5.intValue() : 0;
                        } else {
                            iLJIIL = C2441009hQ.LJIIL(iIntValue4, 86);
                        }
                        paint2.setColor(iLJIIL);
                        this.LLILZLL.setShadowLayer(LIZJ(2.4f), 0.0f, 0.0f, iLJIIL2);
                        this.LLJJIII.setTintColorRes(R.attr.zi);
                        this.LLJJI.setTextColorRes(R.attr.zd);
                        if (zLIZIZ) {
                            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.zk, getContext());
                            iIntValue2 = numLIZJ6 != null ? numLIZJ6.intValue() : 0;
                        }
                        this.LLJJIJI.setTintColor(iIntValue2);
                        this.LLJJIJIIJIL.setTintColor(iIntValue2);
                        this.LLJJIJIL.setTintColor(iIntValue2);
                        invalidate();
                    }

                    public final void LIZIZ() {
                        String string;
                        this.LLJILJILJ = LIZJ(4.0f);
                        this.LLJILLL = LIZJ(4.8f);
                        this.LLIZ.set(LIZJ(28.0f), LIZJ(-8.0f), LIZJ(248.0f), LIZJ(132.0f));
                        float fLIZJ = LIZJ(25.0f);
                        this.LLIZLLLIL.reset();
                        this.LLIZLLLIL.addRoundRect(this.LLIZ, new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZJ, fLIZJ, fLIZJ, fLIZJ}, Path.Direction.CW);
                        this.LLJ.set(LIZJ(42.0f), LIZJ(76.0f), LIZJ(101.0f), LIZJ(86.0f));
                        this.LLJI.set(LIZJ(42.0f), LIZJ(94.0f), LIZJ(172.0f), LIZJ(106.0f));
                        C427660Gpo c427660Gpo = this.LLJJ;
                        ViewGroup.LayoutParams layoutParams = c427660Gpo.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.width = LIZLLL(24.0f);
                        layoutParams2.height = LIZLLL(24.0f);
                        layoutParams2.setMarginStart(LIZLLL(7.7f));
                        layoutParams2.topMargin = LIZLLL(38.0f);
                        C786410Ut5.W5(c427660Gpo, layoutParams2);
                        TuxTextView tuxTextView = this.LLJJI;
                        ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        layoutParams4.height = LIZLLL(33.6f);
                        layoutParams4.setMarginStart(LIZLLL(36.5f));
                        layoutParams4.topMargin = LIZLLL(33.2f);
                        C786410Ut5.W5(tuxTextView, layoutParams4);
                        TuxIconView tuxIconView = this.LLJJIII;
                        ViewGroup.LayoutParams layoutParams5 = tuxIconView.getLayoutParams();
                        if (layoutParams5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                        layoutParams6.width = LIZLLL(19.2f);
                        layoutParams6.height = LIZLLL(19.2f);
                        layoutParams6.topMargin = LIZLLL(40.4f);
                        C786410Ut5.W5(tuxIconView, layoutParams6);
                        LinearLayout linearLayout = this.LLJJJ;
                        ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                        if (layoutParams7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                        layoutParams8.width = LIZLLL(32.0f);
                        layoutParams8.setMarginStart(LIZLLL(204.0f));
                        layoutParams8.topMargin = LIZLLL(-30.0f);
                        C786410Ut5.W5(linearLayout, layoutParams8);
                        TuxIconView tuxIconView2 = this.LLJJIJI;
                        ViewGroup.LayoutParams layoutParams9 = tuxIconView2.getLayoutParams();
                        if (layoutParams9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                        layoutParams10.width = LIZLLL(32.0f);
                        layoutParams10.height = LIZLLL(32.0f);
                        layoutParams10.topMargin = 0;
                        C786410Ut5.W5(tuxIconView2, layoutParams10);
                        TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
                        ViewGroup.LayoutParams layoutParams11 = tuxIconView3.getLayoutParams();
                        if (layoutParams11 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
                        layoutParams12.width = LIZLLL(32.0f);
                        layoutParams12.height = LIZLLL(32.0f);
                        layoutParams12.topMargin = LIZLLL(20.0f);
                        C786410Ut5.W5(tuxIconView3, layoutParams12);
                        TuxIconView tuxIconView4 = this.LLJJIJIL;
                        ViewGroup.LayoutParams layoutParams13 = tuxIconView4.getLayoutParams();
                        if (layoutParams13 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams14 = (LinearLayout.LayoutParams) layoutParams13;
                        layoutParams14.width = LIZLLL(32.0f);
                        layoutParams14.height = LIZLLL(32.0f);
                        layoutParams14.topMargin = LIZLLL(20.0f);
                        C786410Ut5.W5(tuxIconView4, layoutParams14);
                        TuxTextView tuxTextView2 = this.LLJJI;
                        TextPaint paint = tuxTextView2.getPaint();
                        CharSequence text = tuxTextView2.getText();
                        if (text == null || (string = text.toString()) == null) {
                            string = "";
                        }
                        float fLIZLLL = C13LZ.LIZLLL(paint.measureText(string) + LIZJ(1.0f), LIZJ(24.0f), LIZJ(111.0f));
                        ViewGroup.LayoutParams layoutParams15 = tuxTextView2.getLayoutParams();
                        if (layoutParams15 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
                        layoutParams16.width = (int) fLIZLLL;
                        C786410Ut5.W5(tuxTextView2, layoutParams16);
                        float fLIZJ2 = LIZJ(43.7f) + fLIZLLL;
                        this.LLJIJIL.set(LIZJ(1.7f), LIZJ(33.2f), fLIZJ2, LIZJ(66.8f));
                        float fLIZJ3 = fLIZJ2 + LIZJ(7.0f);
                        this.LLJILJIL.set(fLIZJ3, LIZJ(33.2f), LIZJ(33.6f) + fLIZJ3, LIZJ(66.8f));
                        TuxIconView tuxIconView5 = this.LLJJIII;
                        ViewGroup.LayoutParams layoutParams17 = tuxIconView5.getLayoutParams();
                        if (layoutParams17 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams17;
                        marginLayoutParams.setMarginStart((int) (fLIZJ3 + LIZJ(7.2f)));
                        C786410Ut5.W5(tuxIconView5, marginLayoutParams);
                        invalidate();
                    }

                    {
                        Object c098200Yq;
                        super(c19egLIZIZ, null, 0);
                        this.LL = getResources().getDisplayMetrics().density;
                        this.LLILLJJLI = 1.0f;
                        this.LLILLL = new Paint(1);
                        this.LLILZ = new Paint(1);
                        this.LLILZIL = new Paint(1);
                        this.LLILZLL = new Paint(1);
                        this.LLIZ = new RectF();
                        this.LLIZLLLIL = new Path();
                        this.LLJ = new RectF();
                        this.LLJI = new RectF();
                        this.LLJIJIL = new RectF();
                        this.LLJILJIL = new RectF();
                        this.LLJILJILJ = LIZJ(4.0f);
                        this.LLJILLL = LIZJ(4.8f);
                        setLayerType(1, null);
                        setWillNotDraw(false);
                        setClipChildren(true);
                        setClipToPadding(true);
                        C427660Gpo c427660Gpo = new C427660Gpo(c19egLIZIZ, null, 6, 0);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                        layoutParams.gravity = 8388659;
                        C786410Ut5.H6(c427660Gpo, layoutParams);
                        this.LLJJ = c427660Gpo;
                        addView(c427660Gpo);
                        TuxTextView tuxTextView = new TuxTextView(c19egLIZIZ, null, 6, 0);
                        tuxTextView.setTuxFont(52);
                        tuxTextView.LJJJJI(17.0f);
                        tuxTextView.setMinTextSize(10.0f);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setIncludeFontPadding(false);
                        tuxTextView.setGravity(16);
                        tuxTextView.setText(c19egLIZIZ.getString(2131846365));
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0);
                        layoutParams2.gravity = 8388659;
                        C786410Ut5.R6(tuxTextView, layoutParams2);
                        this.LLJJI = tuxTextView;
                        addView(tuxTextView);
                        TuxIconView tuxIconView = new TuxIconView(c19egLIZIZ, null, 0, 6, null);
                        tuxIconView.setIconRes(R.raw.icon_pen_fill);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                        layoutParams3.gravity = 8388659;
                        C786410Ut5.M6(tuxIconView, layoutParams3);
                        this.LLJJIII = tuxIconView;
                        addView(tuxIconView);
                        TuxIconView tuxIconViewLJ = LJ(R.raw.icon_color_like_shadow_2);
                        this.LLJJIJI = tuxIconViewLJ;
                        TuxIconView tuxIconViewLJ2 = LJ(R.raw.icon_color_comment_shadow);
                        this.LLJJIJIIJIL = tuxIconViewLJ2;
                        TuxIconView tuxIconViewLJ3 = LJ(R.raw.icon_color_share_shadow_alt_2);
                        this.LLJJIJIL = tuxIconViewLJ3;
                        LinearLayout linearLayout = new LinearLayout(c19egLIZIZ);
                        linearLayout.setOrientation(1);
                        C786410Ut5.W4(linearLayout, 0.65f);
                        linearLayout.setClickable(false);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams4.gravity = 8388659;
                        C786410Ut5.d6(linearLayout, layoutParams4);
                        this.LLJJJ = linearLayout;
                        linearLayout.addView(tuxIconViewLJ, new LinearLayout.LayoutParams(0, 0));
                        linearLayout.addView(tuxIconViewLJ2, new LinearLayout.LayoutParams(0, 0));
                        linearLayout.addView(tuxIconViewLJ3, new LinearLayout.LayoutParams(0, 0));
                        addView(linearLayout);
                        LIZIZ();
                        try {
                            c098200Yq = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        User user = (User) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                        C427660Gpo.LJIIJJI(this.LLJJ, C438710HIf.LIZ(user != null ? user.getAvatarThumb() : null), false, null, null, false, false, null, null, false, null, 1022);
                        LIZ();
                    }

                    public final float LIZJ(float f) {
                        return f * this.LL * this.LLILLJJLI;
                    }

                    public final int LIZLLL(float f) {
                        return (int) (f * this.LL * this.LLILLJJLI);
                    }

                    public final TuxIconView LJ(int i) {
                        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
                        tuxIconView.setIconRes(i);
                        return tuxIconView;
                    }

                    @Override // android.view.View
                    public final void onConfigurationChanged(Configuration configuration) {
                        super.onConfigurationChanged(configuration);
                        LIZ();
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        int iSave;
                        super.onDraw(canvas);
                        boolean z = true;
                        if (getLayoutDirection() == 1) {
                            iSave = canvas.save();
                            canvas.translate(getWidth(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        } else {
                            z = false;
                            iSave = -1;
                        }
                        canvas.drawPath(this.LLIZLLLIL, this.LLILLL);
                        RectF rectF = this.LLJ;
                        float f = this.LLJILJILJ;
                        canvas.drawRoundRect(rectF, f, f, this.LLILZ);
                        RectF rectF2 = this.LLJI;
                        float f2 = this.LLJILJILJ;
                        canvas.drawRoundRect(rectF2, f2, f2, this.LLILZ);
                        RectF rectF3 = this.LLJIJIL;
                        float f3 = this.LLJILLL;
                        canvas.drawRoundRect(rectF3, f3, f3, this.LLILZIL);
                        RectF rectF4 = this.LLJILJIL;
                        float f4 = this.LLJILLL;
                        canvas.drawRoundRect(rectF4, f4, f4, this.LLILZLL);
                        if (z) {
                            canvas.restoreToCount(iSave);
                        }
                    }

                    @Override // android.widget.FrameLayout, android.view.View
                    public final void onMeasure(int i, int i2) {
                        int size = View.MeasureSpec.getSize(i);
                        int i3 = (int) ((size * 276.0f) / 358.0f);
                        float f = i3;
                        int i4 = (int) ((140.0f * f) / 276.0f);
                        if (size > 0) {
                            float f2 = f / (this.LL * 276.0f);
                            if (f2 != this.LLILLJJLI) {
                                this.LLILLJJLI = f2;
                                LIZIZ();
                            }
                        }
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                    }
                };
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 1;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
                frameLayout.setLayoutParams(layoutParams);
                final C259800zU c259800zU = new C259800zU();
                C1391960mKI c1391960mKI = new C1391960mKI();
                c1391960mKI.LIZ = true;
                c1391960mKI.LJFF = frameLayout;
                c1391960mKI.LJI = -1;
                c1391960mKI.LJII = c19egLIZIZ.getString(2131825175);
                c1391960mKI.LJIIIZ = C13LQ.LJJLL(new C1391890mKB[]{new C1391890mKB(c19egLIZIZ.getString(2131825174), Integer.valueOf(R.raw.icon_repost), null, 4), new C1391890mKB(c19egLIZIZ.getString(2131825173), Integer.valueOf(R.raw.icon_trash_bin), null, 4)});
                c1391960mKI.LIZIZ(c19egLIZIZ.getString(2131825176), new AwS125S1000000_19(str, 5));
                C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
                DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0itk
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        AbstractC439520HLi abstractC439520HLi;
                        TuxPanel tuxPanel = c259800zU.element;
                        if (tuxPanel != null) {
                            abstractC439520HLi = tuxPanel.LLJILLL;
                        } else {
                            abstractC439520HLi = null;
                        }
                        if (abstractC439520HLi instanceof C439530HLj) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("F3 close -> mob popup_click(close), enterFrom=");
                            sbLIZ3.append(str);
                            C429430Gsf.LIZ("RepostTextEncourageEducationLauncher", C2188811AlT.LIZIZ(sbLIZ3));
                            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                            String str2 = str;
                            c1358550lSP.getClass();
                            C1358550lSP.LJIJJ(str2, "close");
                        }
                    }
                };
                ?? r2 = c439850HMpLIZ.LIZ;
                r2.LLILZLL = onCancelListener;
                c259800zU.element = r2;
                try {
                    r2.show(c19egLIZIZ.getSupportFragmentManager(), "RepostTextEncouragementEducationPanel");
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("show F3 education failed: ");
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(", enterFrom=");
                    sbLIZ3.append(str);
                    C429430Gsf.LIZ("RepostTextEncourageEducationLauncher", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("show F3 education aborted: host unavailable (null/finishing/destroyed/stateSaved), enterFrom=");
            sbLIZ4.append(str);
            C429430Gsf.LIZ("RepostTextEncourageEducationLauncher", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    @Override // com.ss.android.ugc.aweme.upvote.detail.input.RepostInputAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void em0(android.text.Editable r8, X.C453740Hqm r9) {
        /*
            r7 = this;
            boolean r0 = r7.LLJJIJIL
            r5 = 1
            if (r0 == 0) goto L90
            r2 = 0
            if (r8 != 0) goto L19
            X.0I7D r3 = r7.LLJJLIIIJLLLLLLLZ
            if (r3 == 0) goto L8e
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC2Gc43iVLW3JkbRL8cQ=="
            r1.<init>(r0, r2)
            android.text.Editable r8 = X.C2204961BRm.LLLLJ(r3, r1)
            if (r8 == 0) goto L8e
        L19:
            java.lang.String r0 = r8.toString()
            if (r0 == 0) goto L8e
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r3 = r0.toString()
        L27:
            if (r9 != 0) goto L43
            X.0Q7z r1 = X.C1558360qeg.LJFF(r7, r2)
            java.lang.Class<com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility> r0 = com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility r0 = (com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility) r0
            if (r0 == 0) goto L8c
            kotlin.Pair r0 = r0.Th1()
            if (r0 == 0) goto L8c
            java.lang.Object r9 = r0.getFirst()
            X.0Hqm r9 = (X.C453740Hqm) r9
        L43:
            X.127h r6 = r7.LLJIJIL
            if (r6 == 0) goto L84
            boolean r0 = X.C1359030lTB.LIZIZ()
            if (r0 == 0) goto L87
            X.0lSw r1 = X.C1358880lSw.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJJ
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.getAid()
        L57:
            r1.getClass()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = X.C1358880lSw.LJFF(r0)
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r2 = X.C1358940lT2.LIZJ(r0)
        L64:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 != 0) goto L81
            if (r9 == 0) goto L80
            if (r2 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker r0 = r2.aiMojiSticker
            if (r0 == 0) goto L81
            long r3 = r9.LL
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L81
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L81
        L80:
            r5 = 0
        L81:
            r6.setEnabled(r5)
        L84:
            return
        L85:
            r0 = r2
            goto L57
        L87:
            boolean r5 = X.C123100dR.LIZ(r3)
            goto L81
        L8c:
            r9 = r2
            goto L43
        L8e:
            r3 = r2
            goto L27
        L90:
            X.127h r0 = r7.LLJIJIL
            if (r0 == 0) goto L84
            r0.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment.em0(android.text.Editable, X.0Hqm):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [X.01wD, android.view.View$OnClickListener, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v164 */
    /* JADX WARN: Type inference failed for: r4v165 */
    /* JADX WARN: Type inference failed for: r4v166 */
    /* JADX WARN: Type inference failed for: r4v167 */
    /* JADX WARN: Type inference failed for: r4v168 */
    /* JADX WARN: Type inference failed for: r4v169 */
    /* JADX WARN: Type inference failed for: r4v170 */
    /* JADX WARN: Type inference failed for: r4v83, types: [android.text.Editable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        ?? r6;
        int iIntValue;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C724220Say c724220Say;
        C0I7D c0i7d;
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int iIntValue2;
        Integer numLIZJ;
        int iIntValue3;
        C0I7D c0i7d2;
        super.onViewCreated(view, bundle);
        String string2 = null;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, RepostInputAbility.class, null, null);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.t_n);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.t_l);
        this.LLILZLL = (C427870Gq9) view.findViewById(R.id.t_c);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.t_k);
        this.LLJI = (TuxIconView) view.findViewById(R.id.t_g);
        this.LLJ = (RelativeLayout) view.findViewById(R.id.t_h);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.t_m);
        this.LLJILJIL = (RadiusLayout) view.findViewById(R.id.t9u);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.t9t);
        int i3 = 0;
        if (C298740BnM.LIZ()) {
            C1355330lND c1355330lND = (C1355330lND) view.findViewById(R.id.ta4);
            this.LLIZ = c1355330lND;
            if (c1355330lND != null) {
                int visibility = c1355330lND.getVisibility();
                c1355330lND.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1355330lND);
            }
            C0I7D c0i7d3 = (C0I7D) view.findViewById(R.id.t_f);
            if (c0i7d3 != null) {
                C786410Ut5.LLLLLZL(c0i7d3, 8);
            }
            this.LLJJLIIIJLLLLLLLZ = this.LLIZ;
        } else {
            this.LLJJLIIIJLLLLLLLZ = (C0I7D) view.findViewById(R.id.t_f);
        }
        if (((PublishOptConfig) C1359970lUh.LIZIZ.getValue()).newHint && C263730AVf.LIZ() && (c0i7d2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            Context context = getContext();
            if (context != null) {
                string2 = context.getString(2131838848);
            }
            c0i7d2.setHint(string2);
        }
        Integer num = 0;
        int i4 = 6;
        if (VR()) {
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C339190DRl.LIZIZ(tuxTextView);
            }
            C427870Gq9 c427870Gq9 = this.LLILZLL;
            if (c427870Gq9 != null) {
                C339190DRl.LIZIZ(c427870Gq9);
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.tar);
            if (frameLayout != null) {
                frameLayout.setMinimumHeight(0);
                i2 = R.attr.a1b;
                C426750GoL.LJIIIZ(frameLayout, null, null, null, num, false, 23);
                C426750GoL.LJIIL(frameLayout, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, 29);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, frameLayout.getContext());
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                } else {
                    iIntValue3 = 0;
                }
                frameLayout.setBackgroundColor(iIntValue3);
            } else {
                i2 = R.attr.a1b;
                frameLayout = null;
            }
            this.LLILZIL = frameLayout;
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1g);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a1e);
                linearLayout.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            View viewFindViewById = view.findViewById(R.id.t_e);
            if (viewFindViewById != null) {
                num = num;
                C426750GoL.LJIIIZ(viewFindViewById, num, null, num, null, false, 26);
            }
            C0I7D c0i7d4 = this.LLJJLIIIJLLLLLLLZ;
            if (c0i7d4 != null) {
                C426750GoL.LJIIIZ(c0i7d4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
                c0i7d4.setTuxFont(41);
                c0i7d4.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)));
            }
            RelativeLayout relativeLayout = this.LLJ;
            if (relativeLayout != null) {
                C426750GoL.LJIIIZ(relativeLayout, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 23);
            }
            RadiusLayout radiusLayout = this.LLJILJIL;
            if (radiusLayout != null) {
                Context context2 = getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(i2, context2)) != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                radiusLayout.setBackgroundColor(iIntValue2);
            }
            RadiusLayout radiusLayout2 = this.LLJILJIL;
            if (radiusLayout2 != null) {
                radiusLayout2.setRadius(0.0f);
            }
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                C426750GoL.LJIIIZ(tuxIconView, null, null, num, null, false, 27);
            }
            TuxIconView tuxIconView2 = this.LLJI;
            if (tuxIconView2 != null) {
                C426750GoL.LJIIIZ(tuxIconView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 27);
            }
            C197039127h c197039127h = this.LLJIJIL;
            if (c197039127h != null) {
                ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(77));
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.J6(c197039127h, layoutParams2);
            }
            view.setOnTouchListener(new ATListenerS454S0100000_21(this, 1));
        } else {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                C1358720lSg.LIZ.getClass();
                boolean z = C1358720lSg.LIZIZ().getBoolean(C1358720lSg.LIZ("repost_text_input_show"), false);
                if (this.LLJLL == CarrierType.COMMENT) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        string = context3.getString(2131846391);
                        if (string == null) {
                        }
                        tuxTextView2.setText(string);
                    }
                    string = "";
                    tuxTextView2.setText(string);
                } else if (!z && ((Number) C0B12.LIZ.getValue()).intValue() == 0) {
                    C1358720lSg.LIZIZ().storeBoolean(C1358720lSg.LIZ("repost_text_input_show"), true);
                    Context context4 = getContext();
                    if (context4 != null) {
                        string = context4.getString(2131850098);
                        if (string == null) {
                        }
                        tuxTextView2.setText(string);
                    }
                    string = "";
                    tuxTextView2.setText(string);
                } else if (C298430Bmr.LIZ()) {
                    Context context5 = getContext();
                    if (context5 != null) {
                        string = context5.getString(2131824963);
                        if (string == null) {
                        }
                        tuxTextView2.setText(string);
                    }
                    string = "";
                    tuxTextView2.setText(string);
                } else if (((Boolean) C263820AVo.LIZ.getValue()).booleanValue()) {
                    Context context6 = getContext();
                    if (context6 != null) {
                        string = context6.getString(2131825172);
                        if (string == null) {
                        }
                        tuxTextView2.setText(string);
                    }
                    string = "";
                    tuxTextView2.setText(string);
                } else {
                    Context context7 = getContext();
                    if (context7 != null) {
                        string = context7.getString(2131850099);
                        if (string == null) {
                        }
                        tuxTextView2.setText(string);
                    }
                    string = "";
                    tuxTextView2.setText(string);
                }
            }
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(40));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.bv);
            Drawable drawableLIZ = c384050F3z2.LIZ(view.getContext());
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJ(this.LLILZLL);
            c1331670kl3LJIIIIZZ.LJJIIZI(drawableLIZ);
            c1331670kl3LJIIIIZZ.LJIIJJI();
            LinearLayout linearLayout2 = this.LLILZ;
            if (linearLayout2 != null) {
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a1d);
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                linearLayout2.setBackground(c384050F3z3.LIZ(view.getContext()));
            }
        }
        if (!((Boolean) C0B0S.LIZ.getValue()).booleanValue()) {
            C429430Gsf.LIZ("RepostInputFragment", "close icon AB(repost_input_close_icon_enabled) off, skip render");
        } else {
            LinearLayout linearLayout3 = this.LLILZ;
            if (linearLayout3 != null) {
                ViewParent parent = linearLayout3.getParent();
                if ((parent instanceof LinearLayout) && (r6 = (ViewGroup) parent) != 0) {
                    Context context8 = view.getContext();
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ze, context8);
                    if (numLIZJ3 != null) {
                        iIntValue = numLIZJ3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    TuxIconView tuxIconView3 = new TuxIconView(context8, null, i3, i4, false ? 1 : 0);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    tuxIconView3.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                    tuxIconView3.setTuxIcon(LLLIIL);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(18));
                    gradientDrawable.setColor(iIntValue);
                    tuxIconView3.setBackground(gradientDrawable);
                    tuxIconView3.setClickable(true);
                    tuxIconView3.setFocusable(true);
                    C786410Ut5.a9(tuxIconView3, new ACListenerS155S0100000_21(this, 12));
                    ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        i = marginLayoutParams.bottomMargin;
                    } else {
                        i = 0;
                    }
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                    layoutParams4.gravity = 1;
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) - i;
                    if (iLIZIZ2 < 0) {
                        iLIZIZ2 = 0;
                    }
                    layoutParams4.topMargin = iLIZIZ2;
                    r6.addView(tuxIconView3, r6.indexOfChild(linearLayout3) + 1, layoutParams4);
                    C429430Gsf.LIZ("RepostInputFragment", "close icon rendered below input box (AB on)");
                }
            }
        }
        RadiusLayout radiusLayout3 = this.LLJILJIL;
        if (radiusLayout3 != null && (layoutParams = radiusLayout3.getLayoutParams()) != null) {
            layoutParams.height = C1110404Vy.LIZ().LIZJ(false);
        }
        RadiusLayout radiusLayout4 = this.LLJILJIL;
        if (radiusLayout4 != null) {
            radiusLayout4.requestLayout();
        }
        if (C298740BnM.LIZ()) {
            c724220Say = null;
            C723850SaN.LIZ(this, false, null, new AwS600S0100000_21((RepostInputFragment) this, 27), 3);
        } else {
            c724220Say = null;
        }
        if (C1359030lTB.LIZIZ()) {
            C723850SaN.LIZ(this, false, c724220Say, new AwS600S0100000_21((RepostInputFragment) this, 30), 3);
        }
        HashMap<String, Editable> map = C1356800lPa.LIZ;
        Object value = this.LLLI.getValue();
        ?? r4 = c724220Say;
        if (value != null) {
            Editable editableRemove = C1356800lPa.LIZ.remove(value);
            r4 = editableRemove;
            if (editableRemove != null) {
                int length = editableRemove.length();
                r4 = editableRemove;
                if (length != 0) {
                    if (C298740BnM.LIZ()) {
                        IRepostMentionAbility iRepostMentionAbilityNR = NR();
                        if (iRepostMentionAbilityNR != null) {
                            iRepostMentionAbilityNR.dh(editableRemove);
                        }
                    } else {
                        C0I7D c0i7d5 = this.LLJJLIIIJLLLLLLLZ;
                        if (c0i7d5 != null) {
                            c0i7d5.setText(editableRemove);
                        }
                        C0I7D c0i7d6 = this.LLJJLIIIJLLLLLLLZ;
                        if (c0i7d6 != null) {
                            c0i7d6.setSelection(editableRemove.length());
                        }
                    }
                    C0I7D c0i7d7 = this.LLJJLIIIJLLLLLLLZ;
                    r4 = editableRemove;
                    if (c0i7d7 != null) {
                        r4 = editableRemove;
                        if (c0i7d7.getParent() != null) {
                            C0I7D c0i7d8 = this.LLJJLIIIJLLLLLLLZ;
                            r4 = editableRemove;
                            if (c0i7d8 != null) {
                                HandlerHook.viewPost(c0i7d8, new ARunnableS121S0100000_21((Object) this, 84));
                                r4 = editableRemove;
                            }
                        }
                    }
                }
            }
        }
        if (this.LLJJIJIL) {
            C197039127h c197039127h2 = this.LLJIJIL;
            if (c197039127h2 != null) {
                c197039127h2.setText(getText(2131850097));
            }
        } else {
            C197039127h c197039127h3 = this.LLJIJIL;
            if (c197039127h3 != null) {
                c197039127h3.setText(getText(2131846378));
            }
            C1359350lTh.LIZIZ(C1359350lTh.LIZ, this.LLJJIII, "click_recommend_avatar", this.LLJJ, "recommend_panel", null, false, 0.0d, "card", "text_input_panel", null, null, null, 3696);
        }
        em0(r4, (C453740Hqm) this.LLLII.getValue());
        C0I7D c0i7d9 = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d9 != null) {
            c0i7d9.setFilters(new C09M5[]{new C09M5(((Number) C0B0R.LIZ.getValue()).intValue(), new AwS565S0100000_21((RepostInputFragment) this, 845))});
        }
        C0I7D c0i7d10 = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d10 != null) {
            c0i7d10.addTextChangedListener(new C1402120mag(this, 8));
        }
        C0I7D c0i7d11 = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d11 != null) {
            C786410Ut5.d9(c0i7d11, this);
        }
        IRepostStickerAbility iRepostStickerAbility = (IRepostStickerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IRepostStickerAbility.class, null);
        if (iRepostStickerAbility != null) {
            iRepostStickerAbility.r01();
        }
        if (C298740BnM.LIZ() && C0B0T.LIZ()) {
            TuxIconView tuxIconView4 = this.LLIZLLLIL;
            if (tuxIconView4 != null) {
                C786410Ut5.a9(tuxIconView4, this);
            }
            TuxIconView tuxIconView5 = this.LLIZLLLIL;
            if (tuxIconView5 != null) {
                C339190DRl.LIZLLL(tuxIconView5);
            }
            TuxIconView tuxIconView6 = this.LLJI;
            if (tuxIconView6 != null) {
                C426750GoL.LJIIIZ(tuxIconView6, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
            }
            if (!C1359970lUh.LIZIZ()) {
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                String str = this.LLJJIII;
                c1358550lSP.getClass();
                C1358550lSP.LJFF("show", str);
            }
        } else {
            TuxIconView tuxIconView7 = this.LLIZLLLIL;
            if (tuxIconView7 != null) {
                C339190DRl.LIZIZ(tuxIconView7);
            }
        }
        TuxIconView tuxIconView8 = this.LLJI;
        if (tuxIconView8 != null) {
            C786410Ut5.a9(tuxIconView8, this);
        }
        C197039127h c197039127h4 = this.LLJIJIL;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, this);
        }
        C786410Ut5.I7(this, view);
        C0I7D c0i7d12 = this.LLJJLIIIJLLLLLLLZ;
        if (c0i7d12 != null) {
            c0i7d12.requestFocus();
        }
        int i5 = C1359790lUP.LIZ[this.LLJJL.ordinal()];
        if (i5 != 5) {
            if (i5 == 7) {
                RR();
                C0I7D c0i7d13 = this.LLJJLIIIJLLLLLLLZ;
                if (c0i7d13 != null) {
                    c0i7d13.setShowSoftInputOnFocus(false);
                }
                C0I7D c0i7d14 = this.LLJJLIIIJLLLLLLLZ;
                if (c0i7d14 != null) {
                    c0i7d14.setFocusable(true);
                }
                C0I7D c0i7d15 = this.LLJJLIIIJLLLLLLLZ;
                if (c0i7d15 != null) {
                    c0i7d15.setFocusableInTouchMode(true);
                }
                KeyboardUtils.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
            }
        } else {
            if (C298740BnM.LIZ() && C0B0T.LIZ() && (c0i7d = this.LLJJLIIIJLLLLLLLZ) != null) {
                HandlerHook.viewPostDelay(c0i7d, new ARunnableS105S0100000_5(c0i7d, 8), 0L);
            }
            KeyboardUtils.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
        }
        if (VR()) {
            C21647019ng c21647019ng = new C21647019ng(requireContext(), requireView(), new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("enter_translationY", new C0HV5(C1110404Vy.LIZ().LIZJ(false) + C1356800lPa.LIZIZ, 0.0f)))), false);
            c21647019ng.LIZJ("enter_translationY", new C1402210map(this, 1));
            c21647019ng.LJI(true);
            FrameLayout frameLayout2 = this.LLILZIL;
            if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1402100mae viewTreeObserverOnGlobalLayoutListenerC1402100mae = new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 2);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402100mae);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1402100mae, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            FrameLayout frameLayout3 = this.LLILZIL;
            if (frameLayout3 != null) {
                frameLayout3.requestLayout();
            }
        } else if (!C1358180lRo.LIZ()) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.j3);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1401870maH(this, 0));
            View view2 = getView();
            if (view2 != null) {
                view2.startAnimation(animationLoadAnimation);
            }
        }
        if (C1356740lPU.LIZ != 0) {
            C1356740lPU.LIZLLL = System.currentTimeMillis();
        }
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T66
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    if (C1356740lPU.LIZ != 0 && C1356740lPU.LJ == 0) {
                        C1356740lPU.LJ = System.currentTimeMillis();
                    }
                    View view3 = view;
                    HandlerHook.viewPost(view3, new ARunnableS81S0200000_12(view3, this, this, 16));
                }
            };
            viewTreeObserver2.addOnDrawListener(onDrawListener);
            C2187701Ajg.LIZ(viewTreeObserver2, onDrawListener, ViewTreeObserver.OnDrawListener.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View viewTd;
        Long lValueOf = Long.valueOf(LLLIILIL);
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        C19GS c19gs = null;
        if (!z) {
            lValueOf = null;
        }
        C1356740lPU.LIZJ(lValueOf, "repost_note", this.LLJJIII, this.LLJJIJI);
        if (C1356740lPU.LIZ != 0 && C1356740lPU.LIZIZ == 0) {
            C1356740lPU.LIZIZ = System.currentTimeMillis();
        }
        if (C1358180lRo.LIZ()) {
            viewTd = C21146717pB.LIZIZ(requireContext(), R.layout.i6j, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6j, viewGroup, false);
        }
        if (C1356740lPU.LIZ != 0 && C1356740lPU.LIZJ == 0) {
            C1356740lPU.LIZJ = System.currentTimeMillis();
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(getContext(), viewTd);
        this.LLJILLL = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0lUL
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        this.LL.dismiss();
                        return true;
                    }
                    return false;
                }
            });
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
