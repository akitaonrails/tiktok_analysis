package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.AbstractC901370ZXr;
import X.AnonymousClass0956;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C09AE;
import X.C0H95;
import X.C0H96;
import X.C0HHT;
import X.C0I6Y;
import X.C0ZDX;
import X.C0ZP4;
import X.C0ZS6;
import X.C0ZS7;
import X.C0ZXM;
import X.C0ZXR;
import X.C0ZXS;
import X.C0ZXT;
import X.C0ZXU;
import X.C1295090jo3;
import X.C1295400joY;
import X.C1295960jpS;
import X.C1296110jph;
import X.C13LE;
import X.C13LP;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1619106Vp;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1760706uz;
import X.C1954807lC;
import X.C19719912Dl;
import X.C207134163o;
import X.C21416018rW;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C271550Akb;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C461640I8k;
import X.C723580SZw;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C898900ZOe;
import X.C901130ZWt;
import X.C901280ZXi;
import X.C901310ZXl;
import X.C901320ZXm;
import X.C901330ZXn;
import X.C901340ZXo;
import X.C901380ZXs;
import X.C901400ZXu;
import X.C901410ZXv;
import X.C901420ZXw;
import X.C902500Zaq;
import X.C903380ZcG;
import X.EnumC207101162h;
import X.InterfaceC1295080jo2;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC901390ZXt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.AAListenerS65S0110000_14;
import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMB2CMessageAttachAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.IMMessageListTranslationViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class TextTranslateAssem extends ReusedUISlotAssem<TextTranslateAssem> implements InterfaceC712990Rxx<C0ZS7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public static final OvershootInterpolator LLLLII;
    public static final int LLLLIIIILLL;
    public static final int LLLLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C1559260qg8 LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public C1295960jpS LLLFF;
    public CharSequence LLLFFI;
    public final C902500Zaq LLLFZ;
    public View LLLI;
    public C21416018rW LLLII;
    public TuxIconView LLLIIII;
    public C0ZP4 LLLIIIIL;
    public C0ZP4 LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public AnonymousClass0956 LLLIILIL;
    public Animator LLLIL;
    public Animator LLLILZ;
    public Animator LLLILZJ;
    public Animator LLLILZLLLI;
    public Animator LLLIZZ;
    public C09AE LLLJ;
    public C21416018rW LLLJIL;
    public AwS415S0200000_14 LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextTranslateAssem.class, "translationVm", "getTranslationVm()Lcom/ss/android/ugc/aweme/translation/viewmodel/IBizCompTranslationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TextTranslateAssem.class, "messageListTranslationViewModel", "getMessageListTranslationViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/IMMessageListTranslationViewModel;", 0)};
        LLLLII = new OvershootInterpolator(0.6f);
        int iIntValue = ((Number) C271550Akb.LIZ.getValue()).intValue();
        LLLLIIIILLL = iIntValue;
        int i = iIntValue / 2;
        LLLLIIL = i >= 1 ? i : 1;
    }

    public TextTranslateAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(222);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IBizCompTranslationViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 894), aFwS201S0000000_14, AFwS248S0000000_14.get$arr$(259));
        this.LLJLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLILLLLZIIL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IMMessageListTranslationViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 895), null, AFwS248S0000000_14.get$arr$(260));
        this.LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 896));
        this.LLJLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(221));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 893));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 891));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 892));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 897));
        this.LLLFZ = new C902500Zaq();
    }

    public abstract C901380ZXs Ap();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cmb;
    }

    public abstract void tp(C0ZXS c0zxs, boolean z);

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final FrameLayout Bp() {
        return (FrameLayout) this.LLJZIJLIL.getValue();
    }

    public final LinearLayout Ep() {
        return (LinearLayout) this.LLL.getValue();
    }

    public final IMMessageListTranslationViewModel Fp() {
        return (IMMessageListTranslationViewModel) this.LLJLL.getValue(this, LLLL[1]);
    }

    public final C898900ZOe Ip() {
        return (C898900ZOe) this.LLJLILLLLZIIL.getValue();
    }

    public final C21416018rW Jp() {
        return (C21416018rW) this.LLLF.getValue();
    }

    public final IBizCompTranslationViewModel Qp() {
        return (IBizCompTranslationViewModel) this.LLJL.getValue(this, LLLL[0]);
    }

    public final TuxIconView Vp() {
        TuxIconView tuxIconView = this.LLLIIII;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        TuxIconView tuxIconView2 = new TuxIconView(LJJIJL().getContext(), null, 0, 6, null);
        this.LLLIIII = tuxIconView2;
        C786410Ut5.x5(tuxIconView2, 0.0f);
        Bp().addView(tuxIconView2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 8388693));
        C786410Ut5.a9(tuxIconView2, new ACListenerS149S0100000_14(this, 32));
        tuxIconView2.setTintColor(Ap().LIZIZ);
        tuxIconView2.setIconRes(R.raw.icon_languages_tick);
        tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        return tuxIconView2;
    }

    public final C21416018rW Wp() {
        C21416018rW c21416018rW = this.LLLII;
        if (c21416018rW != null) {
            return c21416018rW;
        }
        C21416018rW c21416018rW2 = new C21416018rW(LJJIJL().getContext(), null);
        this.LLLII = c21416018rW2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21416018rW2);
        c21416018rW2.setAlpha(0.0f);
        aq();
        Ep().addView(c21416018rW2, new LinearLayout.LayoutParams(-2, -2));
        return c21416018rW2;
    }

    public final C1295960jpS Xp() {
        C1295960jpS c1295960jpS = this.LLLFF;
        if (c1295960jpS != null) {
            return c1295960jpS;
        }
        C1295960jpS c1295960jpS2 = new C1295960jpS(LJJIJL().getContext());
        this.LLLFF = c1295960jpS2;
        C786410Ut5.f5(c1295960jpS2, 0.0f);
        FrameLayout frameLayoutBp = Bp();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 8388693);
        C426750GoL.LJIIJ(layoutParams, LJJIJL().getContext(), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 38);
        frameLayoutBp.addView(c1295960jpS2, layoutParams);
        c1295960jpS2.setRepeatCount(-1);
        c1295960jpS2.setRepeatMode(1);
        C1296110jph c1296110jph = new C1296110jph(Ap().LIZJ);
        c1295960jpS2.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (C1295400joY<ColorFilter>) new C1295400joY(c1296110jph));
        c1295960jpS2.setAnimation(R.raw.tux_lottie_common_im_aitranslateicon);
        return c1295960jpS2;
    }

    public final View aq() {
        View view = this.LLLI;
        if (view != null) {
            return view;
        }
        View view2 = new View(LJJIJL().getContext());
        this.LLLI = view2;
        C786410Ut5.T4(view2, 0.0f);
        LinearLayout linearLayoutEp = Ep();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        C426750GoL.LJIIJ(layoutParams, LJJIJL().getContext(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 42);
        linearLayoutEp.addView(view2, layoutParams);
        view2.setBackgroundColor(Ap().LIZLLL);
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0ZRR dq() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem.dq():X.0ZRR");
    }

    public final void zp() {
        C0ZP4 c0zp4 = this.LLLIIIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLLIIIL;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLIILIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        Animator animator = this.LLLIL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLLILZ;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.LLLILZJ;
        if (animator3 != null) {
            animator3.cancel();
        }
        Animator animator4 = this.LLLILZLLLI;
        if (animator4 != null) {
            animator4.cancel();
        }
        Animator animator5 = this.LLLIZZ;
        if (animator5 != null) {
            animator5.cancel();
        }
        C09AE c09ae = this.LLLJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public final IMSelectTextAbility Gp() {
        return (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMSelectTextAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        zp();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        zp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        Object obj = null;
        IMB2CMessageAttachAbility iMB2CMessageAttachAbility = (IMB2CMessageAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMB2CMessageAttachAbility.class, null);
        if (iMB2CMessageAttachAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            iMB2CMessageAttachAbility.AI0(C0I6Y.LIZ((InterfaceC461380I7k) obj));
        }
    }

    public final void Tp(C0ZS7 c0zs7) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindToBizComp ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(C0I6Y.LIZ((InterfaceC461380I7k) obj).getUuid());
        sbLIZ.append(", sourceLanguage=");
        sbLIZ.append(c0zs7.LJLJLLL());
        sbLIZ.append(", translationFirstCollectFlag=");
        sbLIZ.append(this.LLLIILIL);
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0956 anonymousClass0956 = this.LLLIILIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C901130ZWt c901130ZWt = C901130ZWt.LIZIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        C903380ZcG c903380ZcGLJI = c901130ZWt.LJI(C0I6Y.LIZ((InterfaceC461380I7k) obj2).getUuid());
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        String strLLIFFJFJJ = ((C0ZS7) obj3).LLIFFJFJJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("observeTranslation sourceContent=");
        sbLIZ2.append(strLLIFFJFJJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        IBizCompTranslationViewModel iBizCompTranslationViewModelQp = Qp();
        EnumC207101162h enumC207101162h = EnumC207101162h.DIRECT_MESSAGE;
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        String uuid = C0I6Y.LIZ((InterfaceC461380I7k) obj4).getUuid();
        String strLJLJLLL = c0zs7.LJLJLLL();
        if (strLJLJLLL == null) {
            if (c903380ZcGLJI != null) {
                strLJLJLLL = c903380ZcGLJI.LIZJ;
            } else {
                strLJLJLLL = null;
            }
        }
        iBizCompTranslationViewModelQp.vQ2(new C207134163o(enumC207101162h, uuid, strLLIFFJFJJ, strLJLJLLL, c903380ZcGLJI));
        C013C c013c = new C013C();
        c013c.element = true;
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        String uuid2 = C0I6Y.LIZ((InterfaceC461380I7k) obj5).getUuid();
        int iLIZJ = C461640I8k.LIZJ(C461640I8k.LIZ, Jp().getContext(), Ip().LLILLL, 0.0f, 0.0f, 124);
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        } else {
            obj6 = null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZS7) obj6).LJII().LIZ.LIZ)));
        C724270Sb3 c724270Sb37 = this.LLJI;
        if (c724270Sb37 != null) {
            obj7 = c724270Sb37.LL;
        } else {
            obj7 = null;
        }
        this.LLLIILIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C901280ZXi(this, c0zs7, uuid2, c013c, iLIZJ - (iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZS7) obj7).LJII().LIZ.LIZJ)))), null), 3);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Up, reason: merged with bridge method [inline-methods] */
    public final void up(C0ZS7 c0zs7) {
        if (c0zs7.LJII().LIZJ instanceof C0ZXU) {
            this.LLLFZ.LIZJ(c0zs7.LLILII().LIZ.LIZ, "text_translate_assem");
        }
        op(c0zs7, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(true);
        }
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0ZS7 r19) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem.up(X.0ZS7):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZS7 c0zs7) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZS7 c0zs7) {
    }

    public final void op(C0ZS7 c0zs7, boolean z) {
        zp();
        C0ZP4 c0zp4 = this.LLLIIIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLLIIIIL = C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0ZRP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZRO) obj).LL;
            }
        }, null, AFwS298S0000000_14.get$arr$(0), 6);
        C0ZP4 c0zp42 = this.LLLIIIL;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        this.LLLIIIL = C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0ZRQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZRO) obj).LLILLJJLI;
            }
        }, null, AFwS298S0000000_14.get$arr$(1), 6);
        AnonymousClass0956 anonymousClass0956 = this.LLLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZXM(this, null), 3);
        if (z) {
            tp(c0zs7.LJII(), false);
        }
        up(c0zs7);
        C901130ZWt c901130ZWt = C901130ZWt.LIZIZ;
        if (c901130ZWt.LJI(c0zs7.LLILII().LIZ.LIZ.getUuid()) != null || (c901130ZWt.LJIIIZ() && !C0ZDX.LJJJJIZL(c0zs7.LLILII().LIZ.LIZ))) {
            Tp(c0zs7);
            return;
        }
        sp(c0zs7.LLIFFJFJJ(), C461640I8k.LIZJ(C461640I8k.LIZ, Jp().getContext(), Ip().LLILLL, 0.0f, 0.0f, 124) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zs7.LJII().LIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zs7.LJII().LIZ.LIZJ)))), c0zs7.LJII().LIZIZ, c0zs7.LJII().LIZ, C901420ZXw.LIZ, false);
        c901130ZWt.LJIILJJIL(c0zs7.LLILII().LIZ.LIZ.getUuid(), C1760706uz.LIZ);
        this.LLLJL = new AwS415S0200000_14(this, c0zs7, 43);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZS6 c0zs6;
        C0ZS7 c0zs7 = (C0ZS7) interfaceC1587906Jp;
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
                if ((obj2 instanceof C0ZS6) && (c0zs6 = (C0ZS6) obj2) != null) {
                    if (c0zs6.LIZIZ) {
                        tp(c0zs7.LJII(), !c0zs7.LJJJJLL());
                    }
                    if (c0zs6.LIZ) {
                        up(c0zs7);
                    }
                }
            }
            return;
        }
        up(c0zs7);
    }

    public final Animator yp(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        fArr[0] = view.getAlpha();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fArr[1] = f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(LLLLII);
        objectAnimatorOfFloat.addListener(new AAListenerS65S0110000_14(view, z, 3));
        objectAnimatorOfFloat.addListener(new AAListenerS65S0110000_14(view, z, 2));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void fq(com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem r7, boolean r8, boolean r9, boolean r10, int r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem.fq(com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem, boolean, boolean, boolean, int):void");
    }

    public final void sp(final String str, int i, C0ZXR c0zxr, C0ZXT c0zxt, InterfaceC901390ZXt interfaceC901390ZXt, boolean z) {
        AbstractC901370ZXr c901310ZXl;
        boolean z2;
        int i2;
        boolean z3;
        CharSequence charSequenceLIZIZ;
        Pair pair;
        float f;
        float f2;
        float f3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        float f4;
        Context context;
        Context context2;
        boolean z7 = interfaceC901390ZXt instanceof C901420ZXw;
        if (z7) {
            final CharSequence charSequence = this.LLLFFI;
            if (charSequence == null) {
                charSequence = str;
            }
            c901310ZXl = new AbstractC901370ZXr(str, charSequence) { // from class: X.0ZXn
                public final CharSequence LIZ;
                public final CharSequence LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C901330ZXn)) {
                        return false;
                    }
                    C901330ZXn c901330ZXn = (C901330ZXn) obj;
                    return Intrinsics.LJFF(this.LIZ, c901330ZXn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c901330ZXn.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Text(text=");
                    sbLIZ.append((Object) this.LIZ);
                    sbLIZ.append(", spannableText=");
                    sbLIZ.append((Object) this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC901370ZXr
                public final CharSequence LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC901370ZXr
                public final CharSequence LIZIZ() {
                    return this.LIZ;
                }

                {
                    super(str, charSequence);
                    this.LIZ = str;
                    this.LIZIZ = charSequence;
                }
            };
        } else if (interfaceC901390ZXt instanceof C901410ZXv) {
            final CharSequence charSequence2 = this.LLLFFI;
            if (charSequence2 == null) {
                charSequence2 = str;
            }
            c901310ZXl = new AbstractC901370ZXr(str, charSequence2) { // from class: X.0ZXm
                public final CharSequence LIZ;
                public final CharSequence LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C901320ZXm)) {
                        return false;
                    }
                    C901320ZXm c901320ZXm = (C901320ZXm) obj;
                    return Intrinsics.LJFF(this.LIZ, c901320ZXm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c901320ZXm.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InProgress(text=");
                    sbLIZ.append((Object) this.LIZ);
                    sbLIZ.append(", spannableText=");
                    sbLIZ.append((Object) this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC901370ZXr
                public final CharSequence LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC901370ZXr
                public final CharSequence LIZIZ() {
                    return this.LIZ;
                }

                {
                    super(str, charSequence2);
                    this.LIZ = str;
                    this.LIZIZ = charSequence2;
                }
            };
        } else if (interfaceC901390ZXt instanceof C901340ZXo) {
            CharSequence charSequence3 = this.LLLFFI;
            if (charSequence3 == null) {
                charSequence3 = str;
            }
            c901310ZXl = new C901310ZXl(str, charSequence3, ((C901340ZXo) interfaceC901390ZXt).LIZ);
        } else {
            throw new C1954807lC();
        }
        if (((Number) C271550Akb.LIZ.getValue()).intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = Integer.MAX_VALUE;
        if (!z2) {
            i2 = Integer.MAX_VALUE;
        } else {
            if (interfaceC901390ZXt instanceof C901340ZXo) {
                i2 = LLLLIIL;
            } else {
                i2 = LLLLIIIILLL;
            }
            i4 = LLLLIIL;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0zxr.LIZ)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0zxr.LIZIZ)));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (context2 = fragmentLJI.getContext()) != null && C426750GoL.LIZLLL(context2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportShowCustomization()) {
            charSequenceLIZIZ = c901310ZXl.LIZ();
        } else {
            charSequenceLIZIZ = c901310ZXl.LIZIZ();
        }
        Pair pairLIZIZ = C0H95.LIZIZ(i, i2, charSequenceLIZIZ);
        int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
        if (c901310ZXl instanceof C901330ZXn) {
            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        } else if (c901310ZXl instanceof C901320ZXm) {
            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        } else if (c901310ZXl instanceof C901310ZXl) {
            Pair pairLIZIZ2 = C0H95.LIZIZ(i, i4, ((C901310ZXl) c901310ZXl).LIZJ);
            pair = new Pair(C13LP.LJJLJ(C1697810uHb.LJIIJJI(Integer.valueOf(iIntValue), Integer.valueOf(((Number) pairLIZIZ2.getFirst()).intValue()))), Integer.valueOf(iIntValue2 + ((Number) pairLIZIZ2.getSecond()).intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(40.5d)))));
        } else {
            throw new C1954807lC();
        }
        int iIntValue3 = ((Number) pair.getFirst()).intValue();
        int iIntValue4 = ((Number) pair.getSecond()).intValue();
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZ)));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZIZ)));
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZLLL)));
        int iLIZIZ6 = iIntValue3 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZJ)));
        int i5 = iIntValue4 + iLIZIZ4 + iLIZIZ5;
        final int iMax = Math.max(iLIZIZ6, iLIZIZ);
        final int iMax2 = Math.max(i5, iLIZIZ2);
        if (iLIZIZ6 >= iLIZIZ) {
            f2 = iLIZIZ3;
            f = 0.0f;
        } else {
            f = (iLIZIZ - iLIZIZ6) / 2.0f;
            f2 = iLIZIZ3 + f;
        }
        if (z3) {
            f2 = -f2;
        }
        if (i5 >= iLIZIZ2) {
            f3 = iLIZIZ4;
        } else {
            f3 = iLIZIZ4 + ((iLIZIZ2 - i5) / 2.0f);
        }
        C901400ZXu c901400ZXu = new C901400ZXu(f2, f3, f, iMax, iMax2);
        int iLIZIZ7 = iMax - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZJ))));
        if (z2) {
            C21416018rW c21416018rWJp = Jp();
            CharSequence charSequence4 = this.LLLFFI;
            if (charSequence4 == null) {
                charSequence4 = str;
            }
            c21416018rWJp.setTextLayout(C0H96.LIZ(i, Ap().LIZ, i2, charSequence4));
        }
        final float f5 = c901400ZXu.LIZ;
        final float f6 = c901400ZXu.LIZIZ;
        Animator animator = this.LLLILZLLLI;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            final int width = Bp().getWidth();
            final int height = Bp().getHeight();
            final float translationX = Ep().getTranslationX();
            final float translationY = Ep().getTranslationY();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            z5 = true;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ZXj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    FrameLayout frameLayoutBp = this.LL.Bp();
                    int i6 = width;
                    int i7 = iMax;
                    int i8 = height;
                    int i9 = iMax2;
                    ViewGroup.LayoutParams layoutParams = frameLayoutBp.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i6 + ((int) ((i7 - i6) * animatedFraction));
                        layoutParams.height = i8 + ((int) ((i9 - i8) * animatedFraction));
                        C786410Ut5.W5(frameLayoutBp, layoutParams);
                        LinearLayout linearLayoutEp = this.LL.Ep();
                        float f7 = translationX;
                        C786410Ut5.Mc(linearLayoutEp, f7 + ((f5 - f7) * animatedFraction));
                        LinearLayout linearLayoutEp2 = this.LL.Ep();
                        float f8 = translationY;
                        C786410Ut5.hd(linearLayoutEp2, f8 + ((f6 - f8) * animatedFraction));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            });
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.setInterpolator(LLLLII);
            valueAnimatorOfFloat.start();
            this.LLLILZLLLI = valueAnimatorOfFloat;
            z4 = false;
        } else {
            z4 = false;
            z5 = true;
            C786410Ut5.Mc(Ep(), f5);
            C786410Ut5.hd(Ep(), f6);
            FrameLayout frameLayoutBp = Bp();
            ViewGroup.LayoutParams layoutParams = frameLayoutBp.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iMax;
                layoutParams.height = iMax2;
                C786410Ut5.W5(frameLayoutBp, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (z7) {
            fq(this, z, z4, z4, 6);
        } else if (interfaceC901390ZXt instanceof C901410ZXv) {
            fq(this, z, z5, z4, 4);
        } else if (interfaceC901390ZXt instanceof C901340ZXo) {
            fq(this, z, z4, z5, 2);
            C21416018rW c21416018rWWp = Wp();
            c21416018rWWp.setTextLayout(C0H96.LIZ(iLIZIZ7, Ap().LIZ, i4, ((C901340ZXo) interfaceC901390ZXt).LIZ));
            ViewGroup.LayoutParams layoutParams2 = c21416018rWWp.getLayoutParams();
            if (layoutParams2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                if (C0H95.LIZ(str)) {
                    i3 = 8388613;
                } else {
                    i3 = 8388611;
                }
                layoutParams3.gravity = i3;
                C786410Ut5.W5(c21416018rWWp, layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            throw new C1954807lC();
        }
        if (c0zxt.LJ) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (context = fragmentLJI2.getContext()) != null && C426750GoL.LIZLLL(context) == z5) {
                z6 = true;
            } else {
                z6 = false;
            }
            float fLIZIZ = (f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxt.LIZJ)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C1295960jpS c1295960jpSXp = Xp();
            if (z6) {
                f4 = fLIZIZ;
            } else {
                f4 = -fLIZIZ;
            }
            C786410Ut5.Pc(c1295960jpSXp, f4);
            TuxIconView tuxIconViewVp = Vp();
            if (!z6) {
                fLIZIZ = -fLIZIZ;
            }
            C786410Ut5.Uc(tuxIconViewVp, fLIZIZ);
        }
    }
}
