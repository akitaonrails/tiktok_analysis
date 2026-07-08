package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0I6Y;
import X.C0Q6L;
import X.C0Q6M;
import X.C0YS1;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13LE;
import X.C1481290oeN;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C457780HxI;
import X.C461530I7z;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C896070ZDh;
import X.C901890ZZr;
import X.C902500Zaq;
import X.C910250ZnL;
import X.C911140Zom;
import X.C911250Zox;
import X.EnumC911240Zow;
import X.EnumC911260Zoy;
import X.InterfaceC1473950oSX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC911110Zoj;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import Y.AUListenerS57S0201000_14;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.SurfaceTexture;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.exp.DMQuickLivePreventAutoPlayConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.QuickLiveReactionPlayerManagerViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS54S1000000_3;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class QuickLiveReactionVideoAssem<T extends InterfaceC911110Zoj, RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<T>, C0Q6M {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C01GW LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 989));
    public final C01GW LLJL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 980));
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 983));
    public final C01GW LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 984));
    public final C01GW LLJLL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 981));
    public final C01GW LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 982));
    public final C01GW LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 986));
    public final C1559260qg8 LLJZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public boolean LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final C01GW LLLF;
    public final C902500Zaq LLLFF;
    public Aweme LLLFFI;
    public AnimatorSet LLLFZ;
    public DecelerateInterpolator LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public C911250Zox LLLIIIIL;
    public long LLLIIIL;
    public Long LLLIIL;
    public Boolean LLLIILIL;
    public boolean LLLIL;
    public final AssemVMLazy LLLILZ;
    public boolean LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickLiveReactionVideoAssem.class, "quickLiveReactionPlayerManagerViewModel", "getQuickLiveReactionPlayerManagerViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/template/media/QuickLiveReactionPlayerManagerViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuickLiveReactionVideoAssem.class, "longPressVM", "getLongPressVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/ChatLongPressVM;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public QuickLiveReactionVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickLiveReactionPlayerManagerViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 987), AFwS248S0000000_14.get$arr$(271), null, true);
        this.LLLF = C1509305vX.LIZ(new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 990));
        this.LLLFF = new C902500Zaq();
        this.LLLIIIIL = new C911250Zox();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatLongPressVM.class);
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 988), AFwS248S0000000_14.get$arr$(272), null, true);
        this.LLLILZJ = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cr9;
    }

    @Override // X.C0Q6M
    public final void nd() {
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
        Ep(false);
        this.LLLII = false;
        tp().O4();
        tp().setMute(true);
        this.LLLIIII = false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.C0Q6M
    public final void LJII() {
        C911250Zox c911250Zox = this.LLLIIIIL;
        c911250Zox.LJ = Double.valueOf(System.currentTimeMillis() - this.LLLIIIL);
        c911250Zox.LIZLLL = EnumC911240Zow.PLAYING.getValue();
        C786410Ut5.LLFF(8, (SmartImageView) this.LLJL.getValue());
        C786410Ut5.LJLLLLLL(8, (View) this.LLJLIL.getValue());
        C786410Ut5.LLZILL((TuxSpinner) this.LLJLILLLLZIIL.getValue(), 8);
        C786410Ut5.l(yp(), 8);
        this.LLLIIII = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFirstFrame: messageId: ");
        sbLIZ.append(up().getMsgId());
        C0YS1.LIZJ("QuickLiveReactionVideoAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0Q6M
    public final void LJJIJIIJIL() {
        if (this.LLLILZJ) {
            Ep(false);
        }
    }

    public final C0Q6L tp() {
        return (C0Q6L) this.LLJLL.getValue();
    }

    public final C869590Y9l up() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    public final RemoteImageView yp() {
        return (RemoteImageView) this.LLJLLL.getValue();
    }

    public final C901890ZZr zp() {
        return (C901890ZZr) this.LLLF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public void cp() {
        tp().O4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        tp().setMute(true);
    }

    @Override // X.C0Q6M
    public final void i9() {
        tp().O4();
        C786410Ut5.LLFF(0, (SmartImageView) this.LLJL.getValue());
        tp().setMute(true);
        this.LLLII = false;
        this.LLLIIII = false;
    }

    public final void op() {
        tp().LLLLLIL();
        if (this.LLLII) {
            return;
        }
        tp().setMute(true);
    }

    public final void Ep(final boolean z) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float f;
        if (!z) {
            if (!this.LLJZIJLIL && !this.LLLII) {
                return;
            }
        } else if (this.LLLII) {
            return;
        }
        if (!z) {
            this.LLJZIJLIL = false;
            this.LLLII = false;
        }
        View viewFindViewById = getContentView().findViewById(R.id.xv2);
        getContentView().findViewById(R.id.tsp);
        final LinearLayout linearLayout = (LinearLayout) getContentView().findViewById(R.id.evm);
        AnimatorSet animatorSet = this.LLLFZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float fLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(198)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116))) / 2.0f;
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.TRANSLATION_X, fLIZIZ);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.TRANSLATION_Y, fLIZIZ);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        if (z) {
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS57S0201000_14(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116)), this, linearLayout, 0));
        } else {
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS57S0201000_14(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(198)), this, linearLayout, 1));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLLFZ = animatorSet2;
        Animator[] animatorArr = new Animator[5];
        Property property = View.SCALE_X;
        float[] fArr = new float[1];
        float f2 = 1.7f;
        if (z) {
            f = 1.7f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        animatorArr[0] = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) property, fArr);
        Property property2 = View.SCALE_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            f2 = 1.0f;
        }
        fArr2[0] = f2;
        animatorArr[1] = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) property2, fArr2);
        animatorArr[2] = objectAnimatorOfFloat;
        animatorArr[3] = objectAnimatorOfFloat2;
        animatorArr[4] = valueAnimatorOfFloat;
        animatorSet2.playTogether(animatorArr);
        AnimatorSet animatorSet3 = this.LLLFZ;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(150L);
        }
        if (this.LLLI == null) {
            this.LLLI = new DecelerateInterpolator();
        }
        AnimatorSet animatorSet4 = this.LLLFZ;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: X.0Zov
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (Intrinsics.LJFF(animator, this.LLLFZ)) {
                        this.LLLFZ = null;
                    }
                    if (!z) {
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        layoutParams.height = -2;
                        layoutParams.width = -2;
                        C786410Ut5.d6(linearLayout, layoutParams);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (z) {
                        QuickLiveReactionVideoAssem<T, RECEIVER> quickLiveReactionVideoAssem = this;
                        AssemVMLazy assemVMLazy = quickLiveReactionVideoAssem.LLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = QuickLiveReactionVideoAssem.LLLILZLLLI;
                        assemVMLazy.getValue().setState(new AwS54S1000000_3(quickLiveReactionVideoAssem.up().getUuid(), 0));
                        C0N0Y c0n0y = quickLiveReactionVideoAssem.tp().LLJIJIL;
                        if (c0n0y != null) {
                            c0n0y.seek(0.0f);
                        }
                        quickLiveReactionVideoAssem.tp().LLLLLIL();
                        quickLiveReactionVideoAssem.tp().setMute(false);
                        QuickLiveReactionVideoAssem<T, RECEIVER> quickLiveReactionVideoAssem2 = this;
                        quickLiveReactionVideoAssem2.LLLII = true;
                        quickLiveReactionVideoAssem2.LLJZIJLIL = true;
                        return;
                    }
                    this.getClass();
                    this.tp().setMute(true);
                }
            });
        }
        AnimatorSet animatorSet5 = this.LLLFZ;
        if (animatorSet5 != null) {
            animatorSet5.setInterpolator(this.LLLI);
        }
        AnimatorSet animatorSet6 = this.LLLFZ;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }

    @Override // X.C0Q6M
    public final void a1(C1481290oeN c1481290oeN) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("player failed, msgId: ");
        sbLIZ.append(up().getMsgId());
        sbLIZ.append(", sourceId: ");
        Integer numValueOf = null;
        if (c1481290oeN != null) {
            str = c1481290oeN.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", messageTtl: ");
        sbLIZ.append(up().getTtl());
        sbLIZ.append(", isMessageExpired: ");
        sbLIZ.append(C896070ZDh.LIZ(up(), AFwS187S0000000_2.get$arr$(1216)));
        sbLIZ.append(", error: ");
        sbLIZ.append(c1481290oeN);
        C0YS1.LIZ("QuickLiveReactionVideoAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLIIII) {
            return;
        }
        this.LLLIIII = false;
        C786410Ut5.LLZILL((TuxSpinner) this.LLJLILLLLZIIL.getValue(), 8);
        C786410Ut5.l(yp(), 0);
        C786410Ut5.LJZL(0, (LinearLayout) this.LLJLLIL.getValue());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_refresh;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), yp());
        yp().setImageDrawable(c419910GdJ.LIZ(yp().getContext()));
        C911250Zox c911250Zox = this.LLLIIIIL;
        c911250Zox.LIZIZ = EnumC911260Zoy.PLAYER_ERROR.getValue();
        if (c1481290oeN != null) {
            numValueOf = Integer.valueOf(c1481290oeN.LJ);
        }
        c911250Zox.LIZJ = numValueOf;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        tp().getSurfaceHolder().Dn(new InterfaceC1473950oSX(this) { // from class: X.0Zp0
            public final /* synthetic */ QuickLiveReactionVideoAssem<T, RECEIVER> LL;

            @Override // X.InterfaceC1473950oSX
            public final void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
                this.LL.Ep(false);
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                DMQuickLivePreventAutoPlayConfig dMQuickLivePreventAutoPlayConfig = C911300Zp2.LIZ;
                DMQuickLivePreventAutoPlayConfig dMQuickLivePreventAutoPlayConfig2 = (DMQuickLivePreventAutoPlayConfig) settingsManagerLIZLLL.LJIIIIZZ("im_live_reaction_prevent_auto_play_setting", DMQuickLivePreventAutoPlayConfig.class, dMQuickLivePreventAutoPlayConfig);
                if (dMQuickLivePreventAutoPlayConfig2 != null) {
                    dMQuickLivePreventAutoPlayConfig = dMQuickLivePreventAutoPlayConfig2;
                }
                if (dMQuickLivePreventAutoPlayConfig.isEnabled() && !this.LL.LLLIIIIL.LJI) {
                    if (dMQuickLivePreventAutoPlayConfig.preventLowEndAutoPlay) {
                        C0CF8.LIZ.getClass();
                        if (C0CF8.LIZJ()) {
                            return;
                        }
                    }
                    C0CF8.LIZ.getClass();
                    if (C0CF8.LIZ() <= dMQuickLivePreventAutoPlayConfig.maximumDeviceScoreToPreventAutoPlay) {
                        return;
                    }
                }
                this.LL.op();
            }
        });
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        int iIntValue = 0;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Zp1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2007107td) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 26), 6);
        ((C0Q6L) getContentView().findViewById(R.id.xrx)).setPlayerViewListener(this);
        C786410Ut5.O7((FrameLayout) getContentView().findViewById(R.id.xv2), new ACListenerS149S0100000_14(this, 65));
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 11));
        tp().setAweme(this.LLLFFI);
        tp().LJIJI(this.LLLFFI);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910250ZnL(this, null), 3);
        TuxSpinner tuxSpinner = (TuxSpinner) view.findViewById(R.id.nnd);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ne, LJJIJL().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        sp((InterfaceC911110Zoj) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038f A[PHI: r2
      0x038f: PHI (r2v76 java.lang.Integer) = (r2v75 java.lang.Integer), (r2v79 java.lang.Integer) binds: [B:108:0x037d, B:113:0x038d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.InterfaceC911110Zoj r36) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem.sp(X.0Zoj):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public void sr(T t, List<? extends Object> list) {
        C911140Zom c911140Zom;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C911140Zom) && (c911140Zom = (C911140Zom) obj2) != null && c911140Zom.LIZ) {
                    sp(t);
                }
            }
            return;
        }
        sp(t);
    }

    public final void Bp(View view, boolean z) {
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((QuickLiveReactionVideoAssem) this, 985);
        ACListenerS149S0100000_14 aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(awS558S0100000_14, 40);
        if ((z || !zp().LJI(aCListenerS149S0100000_14, view)) && up().isSuccessStatus()) {
            awS558S0100000_14.invoke();
        }
    }
}
