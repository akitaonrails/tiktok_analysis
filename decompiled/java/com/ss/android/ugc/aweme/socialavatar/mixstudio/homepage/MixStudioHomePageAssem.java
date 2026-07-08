package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.AbstractC2098408Jy;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C0FNV;
import X.C0GRD;
import X.C0GRE;
import X.C0H6M;
import X.C0H6Q;
import X.C0H7H;
import X.C0HGY;
import X.C0HKU;
import X.C0HOC;
import X.C0HOI;
import X.C0HOM;
import X.C0HOX;
import X.C0HPU;
import X.C0HPW;
import X.C0HSG;
import X.C0IE5;
import X.C0P0T;
import X.C0ZP4;
import X.C10EU;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1358105Tf;
import X.C1372405Ys;
import X.C1372505Yt;
import X.C1372805Yw;
import X.C1373105Yz;
import X.C1389880mGw;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697580uHE;
import X.C1710306mr;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C19ME;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C420500GeG;
import X.C426750GoL;
import X.C428740GrY;
import X.C435650H6l;
import X.C440190HNx;
import X.C440370HOp;
import X.C440440HOw;
import X.C440470HOz;
import X.C440480HPa;
import X.C440500HPc;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C531650Kt9;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1389620mGW;
import X.EnumC440220HOa;
import X.EnumC440250HOd;
import X.EnumC440890HQp;
import X.EnumC441640HTm;
import X.InterfaceC440090HNn;
import X.InterfaceC440230HOb;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS110S0200000_6;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import irm.AkS5S1100000_6;
import irm.AkS78S0100000_6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS475S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.ranges.IntRange;
import mf.a;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioHomePageAssem extends MixStudioPageAssem {
    public static final /* synthetic */ int LLLZI = 0;
    public final C736950SvV LLJJJ;
    public final C736950SvV LLJJJIL;
    public final C1559260qg8 LLJJJJ;
    public final C01GW LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public FrameLayout LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public ConstraintLayout LLJLIL;
    public C420500GeG LLJLILLLLZIIL;
    public C0GRD LLJLL;
    public C0P0T LLJLLIL;
    public C420500GeG LLJLLL;
    public C0GRE LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public C0HPU LLLF;
    public List<C420500GeG> LLLFF;
    public List<C420500GeG> LLLFFI;
    public ConstraintLayout LLLFZ;
    public FrameLayout LLLI;
    public LinearLayout LLLII;
    public TuxTextView LLLIIII;
    public ConstraintLayout LLLIIIIL;
    public AnonymousClass0956 LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public AnonymousClass0956 LLLIILIL;
    public AnonymousClass0956 LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public final C01GW LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final C01GW LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final C01GW LLLLLZIL;
    public C0ZP4 LLLLLZL;
    public AnonymousClass0956 LLLLZ;
    public C0ZP4 LLLLZI;
    public AnonymousClass0956 LLLLZIL;
    public AnonymousClass0956 LLLLZLL;
    public final EnumC440890HQp LLLLZLLIL;
    public final C01GW LLLLZLLLI;
    public InterfaceC440090HNn LLLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public MixStudioHomePageAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioHomePageViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(316);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((AbstractC738140SxQ) this, 622);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, awS550S0100000_6, c451610HnL, c723700Sa8);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(IdAndElementViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(317), new AwS550S0100000_6((AbstractC738140SxQ) this, 623), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJJ = new C1559260qg8(new C723580SZw(this, C440500HPc.class, null), checkSupervisorPrepared());
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(235));
        this.LLLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(223));
        this.LLLILZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(210));
        this.LLLILZLLLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(209));
        this.LLLIZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(212));
        this.LLLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(208));
        this.LLLJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(211));
        this.LLLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(222));
        this.LLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(220));
        this.LLLLII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(230));
        this.LLLLIIIILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(228));
        this.LLLLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(226));
        this.LLLLIILL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(224));
        this.LLLLIILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(214));
        this.LLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(216));
        this.LLLLILI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(218));
        this.LLLLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(221));
        this.LLLLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(219));
        this.LLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(217));
        this.LLLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(241));
        this.LLLLLILLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(237));
        this.LLLLLJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(239));
        this.LLLLLJLJLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(236));
        this.LLLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(229));
        this.LLLLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(227));
        this.LLLLLLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(225));
        this.LLLLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(231));
        this.LLLLLLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(240));
        this.LLLLLLLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(232));
        this.LLLLLLLZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(234));
        this.LLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(215));
        this.LLLLLLZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(242));
        this.LLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(213));
        this.LLLLLZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(233));
        this.LLLLZLLIL = EnumC440890HQp.HOME;
        this.LLLLZLLLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(238));
    }

    public final int Ap() {
        return ((Number) this.LLLLIILLL.getValue()).intValue();
    }

    public final float Bp() {
        return ((Number) this.LLLLIL.getValue()).floatValue();
    }

    public final int Ep() {
        return ((Number) this.LLLLII.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void LLFF() {
        this.LLLLLZL = C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0HP7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HPD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LLILZIL;
            }
        }, null, new C0HOI(this, new C013C(), new C013C(), new C013C(), new C013C()), 12);
        this.LLLLZI = C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0HOx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C440270HOf) obj).LLIZLLLIL);
            }
        }, new C2217381BqS() { // from class: X.0HP9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, null, new C440470HOz(this), 12);
        if (mp().getState().LLILLJJLI.getState().getValue() instanceof C1372505Yt) {
            C0HSG.LIZ.getClass();
            if (C0HSG.LIZ()) {
                mp().vQ2(false);
                mp().yQ2(mp().getState().LLILLJJLI);
                MixStudioHomePageViewModel mixStudioHomePageViewModelMp = mp();
                mixStudioHomePageViewModelMp.getClass();
                mixStudioHomePageViewModelMp.setState(new AwS585S0100000_6((C0HOC) null, 290));
            }
        }
    }

    public final MixStudioHomePageViewModel mp() {
        return (MixStudioHomePageViewModel) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        AnonymousClass0956 anonymousClass0956 = this.LLLLZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLZLL = null;
        C0ZP4 c0zp4 = this.LLLLLZL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLLZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C0ZP4 c0zp42 = this.LLLLZI;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
    }

    public final IdAndElementViewModel op() {
        return (IdAndElementViewModel) this.LLJJJIL.getValue();
    }

    public final C440500HPc up() {
        return (C440500HPc) this.LLJJJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [X.0GRE, android.view.View, java.lang.Object] */
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
    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        int i;
        String strLIZLLL;
        final Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        if (C724240Sb0.LIZ(this) == null) {
            super.xo();
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (C440480HPa.LIZJ()) {
            HandlerHook.viewPost(linearLayout, new ARunnableS73S0200000_4(context, linearLayout, 16));
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                linearLayout.setBackgroundColor(numLIZJ.intValue());
            }
        }
        linearLayout.setClipChildren(false);
        Zo(linearLayout);
        FrameLayout frameLayout = new FrameLayout(context);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_watch_history);
        tuxIconView.setIconHeight(((Number) this.LLLLLLLZIL.getValue()).intValue());
        tuxIconView.setIconWidth(((Number) this.LLLLLLLZIL.getValue()).intValue());
        tuxIconView.setTintColorRes(R.attr.a1h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart(((Number) this.LLLLLZIL.getValue()).intValue());
        C786410Ut5.M6(tuxIconView, layoutParams);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 66));
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setIconHeight(((Number) this.LLLLLLZ.getValue()).intValue());
        tuxIconView2.setIconWidth(((Number) this.LLLLLLZ.getValue()).intValue());
        tuxIconView2.setIconRes(R.raw.icon_x_mark);
        tuxIconView2.setTintColorRes(R.attr.a1h);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(((Number) this.LLLLLZ.getValue()).intValue());
        C786410Ut5.M6(tuxIconView2, layoutParams2);
        C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 67));
        frameLayout.addView(this.LLJJLIIIJLLLLLLLZ);
        frameLayout.addView(tuxIconView2);
        if (!C440480HPa.LIZJ()) {
            linearLayout.addView(frameLayout, C435650H6l.LIZ(-1, yp(), 0, 0, 0, 252));
        }
        this.LLJJL = frameLayout;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(((Number) mp().LLILZLL.getValue()).intValue());
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(17);
        tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 800, 0.0f, 1.0f, null, 0.0f, 0, null, 245));
        tuxTextView.LJJJJI(24.0f);
        if (!C440480HPa.LIZJ()) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, ((Number) this.LLLILZJ.getValue()).intValue());
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = ((Number) this.LLLIZZ.getValue()).intValue();
            layoutParams3.bottomMargin = zp();
            int iIntValue = ((Number) this.LLLJIL.getValue()).intValue();
            layoutParams3.setMarginStart(iIntValue);
            layoutParams3.setMarginEnd(iIntValue);
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        this.LLJJJJLIIL = tuxTextView;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipChildren(false);
        this.LLJLIL = constraintLayout;
        if (!C440480HPa.LIZJ()) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            layoutParams4.bottomMargin = ((Number) this.LLLLIILL.getValue()).intValue();
            linearLayout.addView(constraintLayout, layoutParams4);
        }
        if (C440480HPa.LIZJ()) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setClipChildren(false);
            View view = new View(context) { // from class: X.0Epz
                public final Paint LL;
                public int LLILLJJLI;
                public float LLILLL;
                public float LLILZ;
                public final Shader LLILZIL;

                public final int getDotColor() {
                    return this.LLILLJJLI;
                }

                public final float getDotRadius() {
                    return this.LLILLL;
                }

                public final Shader getDotShader() {
                    return this.LLILZIL;
                }

                public final float getSpacing() {
                    return this.LLILZ;
                }

                {
                    super(context, null, 0);
                    this.LL = new Paint(1);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, context);
                    this.LLILLJJLI = C2441009hQ.LJIIL(numLIZJ2 != null ? numLIZJ2.intValue() : 0, 13);
                    this.LLILLL = C418440Gaw.LIZIZ(2);
                    float fLIZIZ = C418440Gaw.LIZIZ(30);
                    this.LLILZ = fLIZIZ;
                    int i2 = (int) fLIZIZ;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(this.LLILLJJLI);
                    paint.setStyle(Paint.Style.FILL);
                    float f = i2 / 2.0f;
                    canvas.drawCircle(f, f, this.LLILLL, paint);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    this.LLILZIL = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LL);
                }

                public final void setDotColor(int i2) {
                    this.LLILLJJLI = i2;
                }

                public final void setDotRadius(float f) {
                    this.LLILLL = f;
                }

                public final void setSpacing(float f) {
                    this.LLILZ = f;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i2, int i3, int i4, int i5) {
                    super.onSizeChanged(i2, i3, i4, i5);
                    this.LL.setShader(new ComposeShader(this.LLILZIL, new LinearGradient(0.0f, 0.0f, 0.0f, i3, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.77f, 1.0f}, Shader.TileMode.CLAMP), PorterDuff.Mode.DST_IN));
                }
            };
            view.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
            View view2 = this.LLJJL;
            if (view2 != null) {
                frameLayout2.addView(view2, new FrameLayout.LayoutParams(-1, yp()));
            }
            View view3 = this.LLJJJJLIIL;
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, ((Number) this.LLLILZJ.getValue()).intValue());
                layoutParams5.gravity = 49;
                layoutParams5.topMargin = ((Number) this.LLLIZZ.getValue()).intValue() + yp();
                layoutParams5.bottomMargin = zp();
                int iIntValue2 = ((Number) this.LLLJIL.getValue()).intValue();
                layoutParams5.setMarginStart(iIntValue2);
                layoutParams5.setMarginEnd(iIntValue2);
                frameLayout2.addView(view3, layoutParams5);
            }
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams6.gravity = 81;
            layoutParams6.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            frameLayout2.addView(constraintLayout, layoutParams6);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, Ep() + zp() + ((Number) this.LLLILZJ.getValue()).intValue() + ((Number) this.LLLIZZ.getValue()).intValue() + yp() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)));
            layoutParams7.bottomMargin = ((Number) this.LLLLIILL.getValue()).intValue();
            linearLayout.addView(frameLayout2, layoutParams7);
            this.LLJL = frameLayout2;
        }
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        int iGenerateViewId3 = View.generateViewId();
        int iGenerateViewId4 = View.generateViewId();
        int iGenerateViewId5 = View.generateViewId();
        C420500GeG c420500GeG = new C420500GeG(context);
        c420500GeG.setId(iGenerateViewId);
        c420500GeG.LLIZ = true;
        c420500GeG.invalidate();
        C786410Ut5.I7(new AkS78S0100000_6(this, 8), c420500GeG);
        C19ME c19me = new C19ME(Ep(), Ep());
        c19me.startToStart = 0;
        c19me.endToStart = iGenerateViewId3;
        c19me.horizontalChainStyle = 2;
        constraintLayout.addView(c420500GeG, c19me);
        this.LLJLILLLLZIIL = c420500GeG;
        C0GRD c0grd = new C0GRD(context);
        c0grd.setId(iGenerateViewId2);
        C786410Ut5.LJLLLLLL(8, c0grd);
        float fBp = C426750GoL.LIZLLL(context) ? -Bp() : Bp();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0grd);
        c0grd.setTranslationX(fBp);
        float fFloatValue = ((Number) this.LLLLILI.getValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0grd);
        c0grd.setTranslationY(fFloatValue);
        c0grd.setElevation(3.0f);
        C786410Ut5.I7(new AkS52S0200000_6(c0grd, this, 1), c0grd);
        C19ME c19me2 = new C19ME(Ap(), Ap());
        c19me2.startToEnd = iGenerateViewId;
        c19me2.topToTop = iGenerateViewId;
        constraintLayout.addView(c0grd, c19me2);
        this.LLJLL = c0grd;
        TuxIconView tuxIconView3 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView3.setId(iGenerateViewId3);
        tuxIconView3.setIconHeight(((Number) this.LLLJL.getValue()).intValue());
        tuxIconView3.setIconRes(R.raw.icon_plus_fill);
        tuxIconView3.setTintColorRes(C440480HPa.LIZJ() ? R.attr.a1p : R.attr.a1k);
        C19ME c19me3 = new C19ME(((Number) this.LLLJL.getValue()).intValue(), ((Number) this.LLLJL.getValue()).intValue());
        int iIntValue3 = ((Number) this.LLLL.getValue()).intValue();
        c19me3.setMarginStart(iIntValue3);
        c19me3.setMarginEnd(iIntValue3);
        c19me3.startToEnd = iGenerateViewId;
        c19me3.topToTop = iGenerateViewId;
        c19me3.bottomToBottom = iGenerateViewId;
        c19me3.endToStart = iGenerateViewId4;
        c19me3.horizontalChainStyle = 2;
        constraintLayout.addView(tuxIconView3, c19me3);
        C420500GeG c420500GeG2 = new C420500GeG(context);
        c420500GeG2.setId(iGenerateViewId4);
        c420500GeG2.LLIZ = true;
        c420500GeG2.invalidate();
        View.OnClickListener aCListenerS110S0200000_6 = new ACListenerS110S0200000_6(c420500GeG2, this, 17);
        if (C1848410yCV.LIZ) {
            aCListenerS110S0200000_6 = new f(aCListenerS110S0200000_6);
        }
        a aVar = new a(aCListenerS110S0200000_6);
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c420500GeG2);
        }
        c420500GeG2.setOnClickListener(aVar);
        C19ME c19me4 = new C19ME(Ep(), Ep());
        c19me4.startToEnd = iGenerateViewId3;
        c19me4.endToEnd = 0;
        c19me4.horizontalChainStyle = 2;
        constraintLayout.addView(c420500GeG2, c19me4);
        this.LLJLLL = c420500GeG2;
        ?? r10 = new View(context) { // from class: X.0GRE
            public final C01GW LL;
            public final C01GW LLILLJJLI;

            private final Paint getFillPaint() {
                return (Paint) this.LLILLJJLI.getValue();
            }

            private final Paint getMainPaint() {
                return (Paint) this.LL.getValue();
            }

            {
                super(context);
                this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1542));
                this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1541));
                setWillNotDraw(false);
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float f = 2;
                float width = getWidth() / f;
                float height = getHeight() / f;
                canvas.drawCircle(width, width, width, getMainPaint());
                float f2 = 3;
                float width2 = getWidth() / f2;
                canvas.drawCircle(width, width, width2, getFillPaint());
                float width3 = (getWidth() / f2) / f;
                float f3 = ((width2 * f2) / 10) / f;
                canvas.drawRoundRect(width - width3, height - f3, width + width3, height + f3, C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(1), getMainPaint());
            }
        };
        r10.setId(iGenerateViewId5);
        C786410Ut5.LJLLLLLL(8, r10);
        float fBp2 = C426750GoL.LIZLLL(context) ? -Bp() : Bp();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r10);
        r10.setTranslationX(fBp2);
        float fFloatValue2 = ((Number) this.LLLLILI.getValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r10);
        r10.setTranslationY(fFloatValue2);
        r10.setElevation(3.0f);
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 65);
        if (C1848410yCV.LIZ) {
            aCListenerS141S0100000_6 = new f(aCListenerS141S0100000_6);
        }
        a aVar2 = new a(aCListenerS141S0100000_6);
        if (c2213981Bky.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(r10);
        }
        r10.setOnClickListener(aVar2);
        C19ME c19me5 = new C19ME(Ap(), Ap());
        c19me5.startToEnd = iGenerateViewId4;
        c19me5.topToTop = iGenerateViewId4;
        constraintLayout.addView((View) r10, c19me5);
        this.LLJZ = r10;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setGravity(17);
        tuxTextView2.setPadding(((Number) this.LLLLLJIL.getValue()).intValue(), 0, ((Number) this.LLLLLJIL.getValue()).intValue(), 0);
        tuxTextView2.setBackground(new C440190HNx(C418440Gaw.LIZIZ(12), Color.argb(10, 0, 0, 0)));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(((Number) this.LLLLLIL.getValue()).intValue(), ((Number) this.LLLLLILLIL.getValue()).intValue());
        layoutParams8.gravity = 1;
        layoutParams8.bottomMargin = ((Number) this.LLLLLJLJLL.getValue()).intValue();
        linearLayout.addView(tuxTextView2, layoutParams8);
        this.LLJZIJLIL = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
        tuxTextView3.setText(2131835878);
        tuxTextView3.setTuxFont(103);
        tuxTextView3.setTextColorRes(R.attr.z_);
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        tuxTextView3.setBackground(C428740GrY.LIZ(C418440Gaw.LIZIZ(20), context));
        tuxTextView3.setGravity(17);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(((Number) this.LLLLJ.getValue()).intValue(), ((Number) this.LLLLJI.getValue()).intValue());
        layoutParams9.gravity = 1;
        layoutParams9.bottomMargin = ((Number) this.LLLLL.getValue()).intValue();
        if (C440480HPa.LIZJ()) {
            layoutParams9.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-42));
        }
        linearLayout.addView(tuxTextView3, layoutParams9);
        this.LLL = tuxTextView3;
        int i2 = (!C440480HPa.LIZJ() ? C497820Jfg.LIZIZ(context) <= ((Number) this.LLLILZ.getValue()).intValue() : C497820Jfg.LIZIZ(context) < ((Number) this.LLLILZ.getValue()).intValue()) ? 5 : 4;
        if (C0H6Q.LIZ()) {
            C0HPU c0hpu = new C0HPU(context);
            c0hpu.setElementsPerRow(i2);
            c0hpu.setClickListener(new C0HPW() { // from class: X.0HOZ
                @Override // X.C0HPW
                public final void o8() {
                    Integer numValueOf;
                    C0HGK c0hgk;
                    FriendsIDInfo friendsIDInfo;
                    MixStudioHomePageAssem mixStudioHomePageAssem = this.LIZ;
                    EnumC440220HOa enumC440220HOa = EnumC440220HOa.GENERATE;
                    int i3 = MixStudioHomePageAssem.LLLZI;
                    String str = null;
                    mixStudioHomePageAssem.Gp(enumC440220HOa, null);
                    InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = this.LIZ.mp().getState().LL;
                    InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2 = this.LIZ.mp().getState().LLILLJJLI;
                    C0HOC c0hoc = this.LIZ.mp().getState().LLILZIL;
                    if (c0hoc == null) {
                        return;
                    }
                    InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3 = this.LIZ.mp().getState().LLILLL;
                    InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4 = this.LIZ.mp().getState().LLILZ;
                    C440370HOp c440370HOp = C440370HOp.LIZ;
                    EnumC441640HTm enumC441640HTmVQ2 = this.LIZ.hp().vQ2();
                    boolean zIsNewUser = this.LIZ.hp().isNewUser();
                    InterfaceC440090HNn interfaceC440090HNn = c0hoc.LIZ;
                    c440370HOp.getClass();
                    C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn);
                    C0H7H c0h7h = c0hoc.LIZIZ;
                    EnumC440340HOm enumC440340HOm = EnumC440340HOm.HOME_PAGE;
                    String strLJIIL = C440370HOp.LJIIL(c0hoc.LIZ);
                    Integer num = c0hoc.LIZJ;
                    C440500HPc c440500HPcUp = this.LIZ.up();
                    String str2 = (c440500HPcUp == null || (friendsIDInfo = c440500HPcUp.LLJ) == null) ? null : friendsIDInfo.chatType;
                    String strLIZLLL2 = interfaceC440230HOb.LIZLLL();
                    if (C0H6Q.LIZ()) {
                        numValueOf = Integer.valueOf(this.LIZ.op().wQ2());
                    } else {
                        Integer numLIZ = interfaceC440230HOb2.LIZ();
                        if (numLIZ != null) {
                            int iIntValue4 = numLIZ.intValue();
                            Integer numLIZ2 = interfaceC440230HOb3.LIZ();
                            numValueOf = Integer.valueOf(iIntValue4 + (numLIZ2 != null ? numLIZ2.intValue() : 0));
                        } else {
                            numValueOf = null;
                        }
                    }
                    Integer numLIZJ2 = interfaceC440230HOb.LIZJ();
                    String strZQ2 = C0H6Q.LIZ() ? this.LIZ.op().zQ2() : interfaceC440230HOb4.LIZLLL();
                    InterfaceC440090HNn interfaceC440090HNn2 = c0hoc.LIZ;
                    if ((interfaceC440090HNn2 instanceof C0HGK) && (c0hgk = (C0HGK) interfaceC440090HNn2) != null) {
                        str = c0hgk.LIZ;
                    }
                    C440370HOp.LIZJ(enumC441640HTmVQ2, zIsNewUser, c0hgyLJIILIIL, c0h7h, enumC440340HOm, strLJIIL, num, str2, strLIZLLL2, numValueOf, numLIZJ2, strZQ2, str, C440370HOp.LJIILL(interfaceC440090HNn2));
                    this.LIZ.hp().setState(new AwS585S0100000_6(EnumC440360HOo.HOME_PAGE, 271));
                    MixStudioHomePageViewModel mixStudioHomePageViewModelMp = this.LIZ.mp();
                    EnumC441640HTm enumC441640HTmVQ22 = this.LIZ.hp().vQ2();
                    mixStudioHomePageViewModelMp.getClass();
                    mixStudioHomePageViewModelMp.withState(new AwS372S0200000_6(mixStudioHomePageViewModelMp, enumC441640HTmVQ22, 61));
                }

                @Override // X.C0HPW
                public final void vl(C0H6M c0h6m) {
                    this.LIZ.lp(c0h6m);
                }
            });
            i = -1;
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams10.bottomMargin = ((Number) this.LLLLLLLLL.getValue()).intValue();
            linearLayout.addView(c0hpu, layoutParams10);
            this.LLLF = c0hpu;
        } else {
            i = -1;
        }
        if (!C0H6Q.LIZ()) {
            ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
            constraintLayout2.setClipChildren(false);
            constraintLayout2.setMaxWidth(((Number) this.LLLLLLIL.getValue()).intValue());
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(i, -2);
            layoutParams11.gravity = 1;
            layoutParams11.bottomMargin = ((Number) this.LLLLLLL.getValue()).intValue();
            int iIntValue4 = ((Number) this.LLLLLLJ.getValue()).intValue();
            layoutParams11.setMarginStart(iIntValue4);
            layoutParams11.setMarginEnd(iIntValue4);
            linearLayout.addView(constraintLayout2, layoutParams11);
            this.LLLFF = kp(context, constraintLayout2, i2);
            ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
            constraintLayout3.setClipChildren(false);
            constraintLayout3.setMaxWidth(((Number) this.LLLLLLIL.getValue()).intValue());
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(i, -2);
            layoutParams12.gravity = 1;
            layoutParams12.bottomMargin = ((Number) this.LLLLLLLLL.getValue()).intValue();
            int iIntValue5 = ((Number) this.LLLLLLJ.getValue()).intValue();
            layoutParams12.setMarginStart(iIntValue5);
            layoutParams12.setMarginEnd(iIntValue5);
            linearLayout.addView(constraintLayout3, layoutParams12);
            this.LLLFFI = kp(context, constraintLayout3, i2);
            if (C440480HPa.LIZJ()) {
                FrameLayout frameLayout3 = new FrameLayout(context);
                C786410Ut5.LJLLLLLL(8, frameLayout3);
                LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                layoutParams13.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                linearLayout.addView(frameLayout3, layoutParams13);
                this.LLLI = frameLayout3;
                String str = mp().getState().LLJIJIL;
                if (str == null || (strLIZLLL = C428740GrY.LIZLLL(context, str)) == null) {
                    strLIZLLL = "";
                }
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                linearLayout2.setBackground(c384050F3z.LIZ(context));
                C786410Ut5.I7(new AkS5S1100000_6(this, strLIZLLL, 0), linearLayout2);
                int iLIZIZ = C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                FrameLayout frameLayout4 = this.LLLI;
                if (frameLayout4 != null) {
                    FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(iLIZIZ, i);
                    layoutParams14.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    layoutParams14.gravity = 8388611;
                    frameLayout4.addView(linearLayout2, layoutParams14);
                }
                this.LLLII = linearLayout2;
                int iGenerateViewId6 = View.generateViewId();
                TuxIconView tuxIconView4 = new TuxIconView(context, null, 0, 6, null);
                tuxIconView4.setId(iGenerateViewId6);
                tuxIconView4.setIconRes(R.raw.icon_pen_star_fill);
                tuxIconView4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView4.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView4.setTintColorRes(R.attr.a1j);
                LinearLayout linearLayout3 = this.LLLII;
                if (linearLayout3 != null) {
                    LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams15.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    layoutParams15.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    layoutParams15.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                    linearLayout3.addView(tuxIconView4, layoutParams15);
                }
                int iGenerateViewId7 = View.generateViewId();
                TuxTextView tuxTextView4 = new TuxTextView(context, null, 6, 0);
                tuxTextView4.setId(iGenerateViewId7);
                tuxTextView4.setText(strLIZLLL);
                tuxTextView4.setTuxFont(31);
                tuxTextView4.setTextColorRes(R.attr.a1k);
                LinearLayout linearLayout4 = this.LLLII;
                if (linearLayout4 != null) {
                    LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    layoutParams16.gravity = 16;
                    layoutParams16.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
                    linearLayout4.addView(tuxTextView4, layoutParams16);
                }
                this.LLLIIII = tuxTextView4;
                ConstraintLayout constraintLayout4 = new ConstraintLayout(context);
                constraintLayout4.setBackground(C428740GrY.LIZ(Float.MAX_VALUE, context));
                FrameLayout frameLayout5 = this.LLLI;
                if (frameLayout5 != null) {
                    FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(0, i);
                    layoutParams17.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    layoutParams17.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    layoutParams17.gravity = 8388613;
                    frameLayout5.addView(constraintLayout4, layoutParams17);
                }
                this.LLLIIIIL = constraintLayout4;
                int iGenerateViewId8 = View.generateViewId();
                int iGenerateViewId9 = View.generateViewId();
                TuxIconView tuxIconView5 = new TuxIconView(context, null, 0, 6, null);
                tuxIconView5.setId(iGenerateViewId8);
                tuxIconView5.setIconRes(R.raw.icon_twinkle_star_fill);
                tuxIconView5.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView5.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView5.setTintColorRes(R.attr.z_);
                ConstraintLayout constraintLayout5 = this.LLLIIIIL;
                if (constraintLayout5 != null) {
                    C19ME c19me6 = new C19ME(-2, -2);
                    c19me6.startToStart = 0;
                    c19me6.topToTop = 0;
                    c19me6.endToStart = iGenerateViewId9;
                    c19me6.bottomToBottom = 0;
                    c19me6.horizontalChainStyle = 2;
                    constraintLayout5.addView(tuxIconView5, c19me6);
                }
                TuxTextView tuxTextView5 = new TuxTextView(context, null, 6, 0);
                tuxTextView5.setId(iGenerateViewId9);
                tuxTextView5.setText(2131831632);
                tuxTextView5.setTuxFont(33);
                tuxTextView5.setTextColorRes(R.attr.z_);
                ConstraintLayout constraintLayout6 = this.LLLIIIIL;
                if (constraintLayout6 != null) {
                    C19ME c19me7 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    c19me7.startToEnd = iGenerateViewId8;
                    c19me7.topToTop = 0;
                    c19me7.endToEnd = 0;
                    c19me7.bottomToBottom = 0;
                    c19me7.horizontalChainStyle = 2;
                    constraintLayout6.addView(tuxTextView5, c19me7);
                }
            } else {
                ConstraintLayout constraintLayoutLIZIZ = C428740GrY.LIZIZ(context);
                ViewGroup.MarginLayoutParams marginLayoutParamsLIZJ = C428740GrY.LIZJ();
                marginLayoutParamsLIZJ.bottomMargin = ((Number) this.LLLLLLLLLL.getValue()).intValue();
                linearLayout.addView(constraintLayoutLIZIZ, marginLayoutParamsLIZJ);
                this.LLLFZ = constraintLayoutLIZIZ;
            }
        }
        if (C440480HPa.LIZJ() && Build.VERSION.SDK_INT >= 35) {
            HandlerHook.viewPost(linearLayout, new ARunnableS106S0100000_6(this, 112));
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJIJ(fragmentLJI);
            }
            C426750GoL.LJIIL(linearLayout, null, null, null, Integer.valueOf(C1710306mr.LIZ(context)), 23);
        }
        super.xo();
    }

    public final int yp() {
        return ((Number) this.LLLLLLZZ.getValue()).intValue();
    }

    public final int zp() {
        return ((Number) this.LLLJ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLLLZLLIL;
    }

    public final void lp(C0H6M c0h6m) {
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = mp().getState().LL;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2 = mp().getState().LLILLJJLI;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3 = mp().getState().LLILLL;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4 = mp().getState().LLILZ;
        if (!(interfaceC440230HOb.getState().getValue() instanceof C1372405Ys)) {
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
            c440370HOp.getClass();
            C440370HOp.LJIIIZ(enumC441640HTmVQ2);
            C1389880mGw c1389880mGw = new C1389880mGw(getContentView());
            c1389880mGw.LJIIIIZZ(2131835880);
            c1389880mGw.LJIIJ();
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HOX(this, c0h6m, interfaceC440230HOb, interfaceC440230HOb2, interfaceC440230HOb3, interfaceC440230HOb4, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C0H6Q.LIZ()) {
            C0HPU c0hpu = this.LLLF;
            if (c0hpu != null) {
                c0hpu.setElementDisplayProducer(this.LLJJI);
            }
            C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0HPM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HPZ) obj).LLILZ;
                }
            }, null, new AwS620S0100000_6(this, 77), 6);
            C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.0HPJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HPZ) obj).LLILZLL;
                }
            }, new C2217381BqS() { // from class: X.0HPL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HPZ) obj).LLIZ;
                }
            }, null, new AwS655S0100000_6(this, 2), 12);
        }
        if (!C0H6Q.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HOk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLILZLL;
                }
            }, null, new AwS620S0100000_6(this, 79), 6);
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HOl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLIZ;
                }
            }, null, new AwS620S0100000_6(this, 80), 6);
        }
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HPA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 78), 4);
        if (!C0H6Q.LIZ()) {
            C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0HPF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0HPH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLILLL;
                }
            }, null, new AwS655S0100000_6(this, 3), 12);
        }
        if (C0H6Q.LIZ()) {
            C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.0HPN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HPZ) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0HPK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HPZ) obj).LLILZLL;
                }
            }, null, new AwS655S0100000_6(this, 4), 12);
        }
        if (!C0H6Q.LIZ()) {
            MixStudioHomePageViewModel mixStudioHomePageViewModelMp = mp();
            selectSubscribe(mixStudioHomePageViewModelMp, new C2217381BqS() { // from class: X.0HPB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0HPG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0HPI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C440270HOf) obj).LLILLL;
                }
            }, C736820SvI.LIZIZ(mixStudioHomePageViewModelMp.usedInReusedScene), null, new C0IE5(this, 4));
        }
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HOi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C440270HOf) obj).LLJ);
            }
        }, null, new AwS620S0100000_6(this, 74), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HOj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 75), 4);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0HP5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 76), 6);
        C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0HP6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HPC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LLILZIL;
            }
        }, null, new AwS655S0100000_6(this, 1), 12);
        C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0HP8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HPE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LLILZIL;
            }
        }, null, new AwS475S0200000_6(this, view, 1), 12);
    }

    public final void Gp(EnumC440220HOa enumC440220HOa, InterfaceC440230HOb<?> interfaceC440230HOb) {
        InterfaceC440090HNn interfaceC440090HNn;
        C0HGY c0hgyLJIILIIL;
        C0H7H c0h7h;
        Integer num;
        String strLJIIL;
        String str;
        int iIntValue;
        String strLIZLLL;
        FriendsIDInfo friendsIDInfo;
        InterfaceC440230HOb<?> interfaceC440230HOb2 = interfaceC440230HOb;
        C0HOC c0hoc = mp().getState().LLILZIL;
        if (interfaceC440230HOb2 == null) {
            interfaceC440230HOb2 = mp().getState().LL;
        }
        Integer numValueOf = null;
        if (c0hoc != null) {
            interfaceC440090HNn = c0hoc.LIZ;
        } else {
            interfaceC440090HNn = null;
        }
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3 = mp().getState().LLILLJJLI;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4 = mp().getState().LLILLL;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb5 = mp().getState().LLILZ;
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
        boolean zIsNewUser = hp().isNewUser();
        boolean z = mp().getState().LLIZLLLIL;
        if (interfaceC440090HNn != null) {
            c440370HOp.getClass();
            c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn);
        } else {
            c0hgyLJIILIIL = null;
        }
        if (c0hoc != null) {
            c0h7h = c0hoc.LIZIZ;
            num = c0hoc.LIZJ;
        } else {
            c0h7h = null;
            num = null;
        }
        if (interfaceC440090HNn != null) {
            c440370HOp.getClass();
            strLJIIL = C440370HOp.LJIIL(interfaceC440090HNn);
        } else {
            strLJIIL = null;
        }
        C440500HPc c440500HPcUp = up();
        if (c440500HPcUp != null && (friendsIDInfo = c440500HPcUp.LLJ) != null) {
            str = friendsIDInfo.chatType;
        } else {
            str = null;
        }
        String strLIZLLL2 = interfaceC440230HOb2.LIZLLL();
        if (C0H6Q.LIZ()) {
            numValueOf = Integer.valueOf(op().wQ2());
        } else {
            Integer numLIZ = interfaceC440230HOb3.LIZ();
            if (numLIZ != null) {
                int iIntValue2 = numLIZ.intValue();
                Integer numLIZ2 = interfaceC440230HOb4.LIZ();
                if (numLIZ2 != null) {
                    iIntValue = numLIZ2.intValue();
                } else {
                    iIntValue = 0;
                }
                numValueOf = Integer.valueOf(iIntValue2 + iIntValue);
            }
        }
        Integer numLIZJ = interfaceC440230HOb2.LIZJ();
        if (C0H6Q.LIZ()) {
            strLIZLLL = op().zQ2();
        } else {
            strLIZLLL = interfaceC440230HOb5.LIZLLL();
        }
        C440370HOp.LIZIZ(c440370HOp, enumC441640HTmVQ2, zIsNewUser, enumC440220HOa, z, c0hgyLJIILIIL, c0h7h, num, strLJIIL, str, strLIZLLL2, numValueOf, numLIZJ, strLIZLLL);
    }

    public final void Ip(Context context, boolean z) {
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            TuxTextView tuxTextView = this.LLLIIII;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView);
            }
            TuxTextView tuxTextView2 = this.LLLIIII;
            if (tuxTextView2 != null) {
                C786410Ut5.B5(tuxTextView2, 0.0f);
            }
            LinearLayout linearLayout = this.LLLII;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.d6(linearLayout, layoutParams2);
            }
            ConstraintLayout constraintLayout = this.LLLIIIIL;
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                    layoutParams = layoutParams3;
                }
                C786410Ut5.m6(constraintLayout, layoutParams);
            }
            ConstraintLayout constraintLayout2 = this.LLLIIIIL;
            if (constraintLayout2 != null) {
                C786410Ut5.Ub(constraintLayout2, 1.0f);
            }
            ConstraintLayout constraintLayout3 = this.LLLIIIIL;
            if (constraintLayout3 != null) {
                C786410Ut5.LJLLLLLL(0, constraintLayout3);
            }
            ConstraintLayout constraintLayout4 = this.LLLIIIIL;
            if (constraintLayout4 != null) {
                C786410Ut5.c5(constraintLayout4, 1.0f);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLLIIII;
        if (tuxTextView3 != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LLLIIII;
        if (tuxTextView4 != null) {
            C786410Ut5.B5(tuxTextView4, 1.0f);
        }
        LinearLayout linearLayout2 = this.LLLII;
        if (linearLayout2 != null) {
            ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            } else {
                layoutParams4 = null;
            }
            C786410Ut5.d6(linearLayout2, layoutParams4);
        }
        ConstraintLayout constraintLayout5 = this.LLLIIIIL;
        if (constraintLayout5 != null) {
            ViewGroup.LayoutParams layoutParams5 = constraintLayout5.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = (C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                layoutParams = layoutParams5;
            }
            C786410Ut5.m6(constraintLayout5, layoutParams);
        }
        ConstraintLayout constraintLayout6 = this.LLLIIIIL;
        if (constraintLayout6 != null) {
            C786410Ut5.Ub(constraintLayout6, 0.0f);
        }
        ConstraintLayout constraintLayout7 = this.LLLIIIIL;
        if (constraintLayout7 != null) {
            C786410Ut5.LJLLLLLL(4, constraintLayout7);
        }
        ConstraintLayout constraintLayout8 = this.LLLIIIIL;
        if (constraintLayout8 == null) {
            return;
        }
        C786410Ut5.c5(constraintLayout8, 0.0f);
    }

    public final void Jp(Context context, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb) {
        String str;
        FriendsIDInfo friendsIDInfo;
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTm = EnumC441640HTm.STUDIO_ID_DROPDOWN;
        EnumC440250HOd enumC440250HOd = EnumC440250HOd.CREATE_AVATAR;
        C440500HPc c440500HPcUp = up();
        if (c440500HPcUp != null && (friendsIDInfo = c440500HPcUp.LLJ) != null) {
            str = friendsIDInfo.chatType;
        } else {
            str = null;
        }
        c440370HOp.getClass();
        C440370HOp.LJI(enumC441640HTm, enumC440250HOd, str);
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.setCancelable(false);
        dialogC1389620mGW.setCanceledOnTouchOutside(false);
        C0FNV.LIZJ(dialogC1389620mGW);
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLIIIJILLIZJL().LIZ(new AwS104S0400000_6(dialogC1389620mGW, (DialogC1389620mGW) interfaceC440230HOb, (InterfaceC440230HOb<? extends List<C440440HOw>>) context, (Context) this, (MixStudioHomePageAssem) 2));
    }

    public static boolean sp(InterfaceC440230HOb interfaceC440230HOb, C0HOM c0hom, C440440HOw c440440HOw) {
        if (interfaceC440230HOb instanceof C0HKU) {
            if (C10EU.LJIIZILJ(c440440HOw.LIZJ) && (c0hom instanceof C1372405Ys)) {
                return true;
            }
            return false;
        }
        if (interfaceC440230HOb instanceof C1372805Yw) {
            return ((C1372805Yw) interfaceC440230HOb).LJI(c440440HOw);
        }
        if (interfaceC440230HOb instanceof C1373105Yz) {
            return ((C1373105Yz) interfaceC440230HOb).LJI(c440440HOw);
        }
        return false;
    }

    public static boolean tp(InterfaceC440230HOb interfaceC440230HOb, C0HOM c0hom, C440440HOw c440440HOw) {
        if (C440480HPa.LIZIZ() && !(interfaceC440230HOb instanceof C0HKU) && !(interfaceC440230HOb instanceof C1372805Yw) && (interfaceC440230HOb instanceof C1373105Yz) && !((C1373105Yz) interfaceC440230HOb).LJI(c440440HOw)) {
            if (C10EU.LJIIZILJ(c440440HOw.LIZJ) && (c0hom instanceof C1372505Yt)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final List<C420500GeG> kp(Context context, ConstraintLayout constraintLayout, int i) {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
        while (((C531650Kt9) it2).LLILLL) {
            ((AbstractC2098408Jy) it2).nextInt();
            C420500GeG c420500GeG = new C420500GeG(context);
            c420500GeG.setId(View.generateViewId());
            C786410Ut5.I7(new AkS52S0200000_6(this, c420500GeG, 9), c420500GeG);
            C19ME c19me = new C19ME(((Number) this.LLLLLL.getValue()).intValue(), ((Number) this.LLLLLL.getValue()).intValue());
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            c19me.horizontalChainStyle = 1;
            constraintLayout.addView(c420500GeG, c19me);
            arrayList.add(c420500GeG);
        }
        List<C420500GeG> listLLIIII = C13LP.LLIIII(arrayList);
        C1358105Tf.LIZ(listLLIIII, AFwS289S0000000_6.get$arr$(24));
        return listLLIIII;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[PHI: r3
      0x0169: PHI (r3v16 X.0HOb<? extends java.util.List<X.0HOw>>) = 
      (r3v22 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v23 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v24 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v25 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v26 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v27 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v28 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v29 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v30 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v31 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v32 X.0HOb<? extends java.util.List<X.0HOw>>)
      (r3v33 X.0HOb<? extends java.util.List<X.0HOw>>)
     binds: [B:62:0x012c, B:65:0x0136, B:60:0x011d, B:51:0x00e5, B:54:0x00f5, B:29:0x0069, B:37:0x0087, B:7:0x001c, B:9:0x0020, B:11:0x0026, B:13:0x002c, B:67:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Fp(android.content.Context r9, X.C0HOM<? extends java.util.List<X.C440440HOw>> r10, X.C440440HOw r11, android.view.View r12, kotlin.jvm.functions.Function1<? super X.InterfaceC440230HOb<? extends java.util.List<X.C440440HOw>>, kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem.Fp(android.content.Context, X.0HOM, X.0HOw, android.view.View, kotlin.jvm.functions.Function1):boolean");
    }
}
