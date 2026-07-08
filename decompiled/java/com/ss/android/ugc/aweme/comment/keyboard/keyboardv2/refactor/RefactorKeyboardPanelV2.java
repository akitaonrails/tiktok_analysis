package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C013C;
import X.C01GW;
import X.C0BKP;
import X.C0IDA;
import X.C10EU;
import X.C1231430i9N;
import X.C1308910kAL;
import X.C1341780l1M;
import X.C1341800l1O;
import X.C1344030l4z;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1347570lAh;
import X.C1347620lAm;
import X.C1348490lCB;
import X.C13LE;
import X.C1402080mac;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C276590Asj;
import X.C295780Bia;
import X.C295880Bik;
import X.C371410EhH;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C726120Se2;
import X.C726240SeE;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.EnumC1341660l1A;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS155S0100000_21;
import Y.ATListenerS343S0200000_21;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.experiment.ReplyCommentUIOptConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS25S1400000_21;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class RefactorKeyboardPanelV2 extends UISlotAssem implements View.OnLayoutChangeListener, IKeyboardV2Ability, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final RefactorKeyboardPanelV2 LLJJI = this;
    public final C01GW LLJJIII;
    public ViewGroup LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public View LLJJJ;
    public ViewGroup LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public final List<MessageQueue.IdleHandler> LLJLILLLLZIIL;
    public AwS265S0300000_21 LLJLL;
    public AwS420S0200000_19 LLJLLIL;
    public boolean LLJLLL;
    public View LLJZ;
    public FrameLayout LLJZIJLIL;
    public TuxIconView LLL;
    public final C726120Se2 LLLF;
    public boolean LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RefactorKeyboardPanelV2.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RefactorKeyboardPanelV2() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 44));
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLLF = new C726120Se2();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a4k;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final boolean Bc2() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void CN0() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final C21647019ng LZ0() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            return C1348490lCB.LIZIZ(frameLayout);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final Animator Vj2() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            return C1348490lCB.LIZ(frameLayout);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void YJ2() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final Integer gB() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            return Integer.valueOf(viewGroup.getHeight());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final int kG1() {
        View view = this.LLJL;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it2.hasNext()) {
            Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler) it2.next());
        }
        ((ArrayList) this.LLJLILLLLZIIL).clear();
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLLFF = false;
        super.onDestroy();
        View view = this.LLJLIL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final Animator r31() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            return C1348490lCB.LJ(frameLayout);
        }
        return null;
    }

    public final void tp() {
        if (this.LLJLL == null && this.LLJLLIL == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it2.hasNext()) {
            Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler) it2.next());
        }
        ((ArrayList) this.LLJLILLLLZIIL).clear();
        AwS265S0300000_21 awS265S0300000_21 = this.LLJLL;
        if (awS265S0300000_21 != null) {
            awS265S0300000_21.invoke();
        }
        this.LLJLL = null;
        AwS420S0200000_19 awS420S0200000_19 = this.LLJLLIL;
        if (awS420S0200000_19 != null) {
            awS420S0200000_19.invoke();
        }
        this.LLJLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final C21647019ng uB2() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            return C1348490lCB.LJFF(frameLayout, 1.0f);
        }
        return null;
    }

    public final CommentContextSource up() {
        C726120Se2 c726120Se2 = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return c726120Se2.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void K41() {
        if (C371410EhH.LIZ()) {
            tp();
        } else {
            C1344030l4z.LIZIZ("KeyboardPanelV2", "flushDeferredAssems called off main thread", new Throwable());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void ds1() {
        if (!C371410EhH.LIZ()) {
            C1344030l4z.LIZIZ("KeyboardPanelV2", "ensureAudioAssemLoaded called off main thread", new Throwable());
        } else {
            if (this.LLLFF) {
                return;
            }
            this.LLLFF = true;
            C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 49));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void il2() {
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (C1346420l8q.LIZJ((commentContextSourceUp == null || (keyboardModel = commentContextSourceUp.getKeyboardModel()) == null) ? null : Boolean.valueOf(keyboardModel.isLandscapeMode())) || !this.LLJJLIIIJLLLLLLLZ) {
            View view = this.LLJJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentMentionAssemAbility.class, null);
        boolean z = (this.LLJJIJIL == null || this.LLJJJJLIIL == null || iCommentMentionAssemAbility == null || !iCommentMentionAssemAbility.tS()) ? false : true;
        IGiftSelectAbility iGiftSelectAbilityLJII = C1345760l7m.LJII(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
        boolean z2 = (this.LLJJJIL == null || this.LLJJL == null || iGiftSelectAbilityLJII == null || iGiftSelectAbilityLJII.pq1() == null) ? false : true;
        if (z) {
            View view3 = this.LLJJJJJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
                return;
            }
            return;
        }
        if (z2) {
            View view4 = this.LLJJJJ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
                return;
            }
            return;
        }
        View view5 = this.LLJJJJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        View view6 = this.LLJJJJJIL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(8, view6);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void mo0() {
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (C1346420l8q.LIZJ((commentContextSourceUp == null || (keyboardModel = commentContextSourceUp.getKeyboardModel()) == null) ? null : Boolean.valueOf(keyboardModel.isLandscapeMode()))) {
            return;
        }
        if (this.LLJZIJLIL == null || this.LLL == null) {
            this.LLJZIJLIL = (FrameLayout) C726240SeE.LIZIZ(getContentView(), this.LLJZIJLIL, R.id.y1v, R.id.vs_collapse_title_container);
            TuxIconView tuxIconView = (TuxIconView) C726240SeE.LIZIZ(getContentView(), this.LLL, R.id.ea0, R.id.vs_collapse_title_container);
            this.LLL = tuxIconView;
            C1341780l1M.LIZIZ(C1341780l1M.LIZ, tuxIconView, EnumC1341650l19.ALPHA_BUTTON, 0.0f, null, 12);
            TuxIconView tuxIconView2 = this.LLL;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS155S0100000_21(this, 29));
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IKeyboardV2Ability.class, null, null);
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).unbindAbility(this.LLJJI, IKeyboardV2Ability.class);
    }

    public final void hp(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.getForceHideInnerGiftPanel());
        } else {
            boolValueOf = null;
        }
        if (!C1346420l8q.LIZ(boolValueOf)) {
            if (C295880Bik.LIZLLL && !C295780Bia.LIZIZ) {
                assembler.RQ2(this, AFwS257S0000000_19.get$arr$(89));
            } else {
                assembler.RQ2(this, AFwS257S0000000_19.get$arr$(90));
            }
        }
    }

    public final void ip(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        assembler.QQ2(this, new AwS598S0100000_19(this, 898));
    }

    public final void kp(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        assembler.QQ2(this, AFwS236S0000000_6.get$arr$(556));
    }

    public final void lp(Assembler assembler) {
        String authorUid;
        Aweme aweme;
        C1231430i9N c1231430i9N = C1231430i9N.LIZ;
        CommentContextSource commentContextSourceUp = up();
        c1231430i9N.getClass();
        if (((Number) C276590Asj.LIZ.getValue()).intValue() == 1) {
            if (commentContextSourceUp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceUp)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (C10EU.LJIIZILJ(authorUid)) {
                assembler.QQ2(this, new AwS598S0100000_19(this, 900));
            }
        }
    }

    public final void mp(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf) && ((ReplyCommentUIOptConfig) C1347620lAm.LIZIZ.getValue()).replyInfoStyle == 0) {
            return;
        }
        assembler.QQ2(this, new AwS598S0100000_19(this, 901));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        Aweme aweme;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0lAk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        this.LLJLIL = view.findViewById(R.id.hi8);
        CommentContextSource commentContextSourceUp = up();
        String initKeyboardTypeName = null;
        if (commentContextSourceUp != null && (keyboardModel2 = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel2.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (!C1346420l8q.LIZJ(boolValueOf)) {
            this.LLJJIJI = (ViewGroup) view.findViewById(R.id.esr);
            this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.o7p);
            View viewFindViewById = view.findViewById(R.id.v_full_screen_mask);
            this.LLJJJ = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setOnTouchListener(new ATListenerS343S0200000_21(this, 3));
            }
            this.LLJJJIL = (ViewGroup) view.findViewById(R.id.j0_);
            this.LLJJJJ = view.findViewById(R.id.v_divider_top_line);
            this.LLJJJJJIL = view.findViewById(R.id.v_divider_bottom_line);
            this.LLJJJJLIIL = view.findViewById(R.id.o7o);
            this.LLJJL = view.findViewById(R.id.yaa);
            this.LLJL = view.findViewById(R.id.opa);
            this.LLJZ = view.findViewById(R.id.eah);
        }
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.eqx);
        C1347570lAh.LIZ(this.LLJLIL);
        C1347570lAh.LIZ(view.findViewById(R.id.voice_record_panel_container));
        C1347570lAh.LIZ(this.LLJJJJLIIL);
        C1347570lAh.LIZ(this.LLJJIJIL);
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (C1347570lAh.LIZIZ() && viewGroup != null) {
            float dimension = viewGroup.getResources().getDimension(R.dimen.jq);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, viewGroup.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
                gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
                viewGroup.setBackground(gradientDrawable);
                viewGroup.setClipToOutline(true);
                viewGroup.setOutlineProvider(new C0IDA(dimension, 16));
            }
        }
        View view2 = this.LLJLIL;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(this);
        }
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        CommentContextSource commentContextSourceUp2 = up();
        CommentContextSource commentContextSourceUp3 = up();
        if (commentContextSourceUp3 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceUp3);
        } else {
            aweme = null;
        }
        c1341800l1O.getClass();
        EnumC1341660l1A enumC1341660l1ALIZ = C1341800l1O.LIZ(commentContextSourceUp2, aweme);
        if (!C1697810uHb.LJIIJJI(EnumC1341660l1A.COMMENT_CLOSE, EnumC1341660l1A.MANAGE_MODE, EnumC1341660l1A.HISTORY_NO_PERMISSION, EnumC1341660l1A.STORY_EXPIRED).contains(enumC1341660l1ALIZ)) {
            if (C1697810uHb.LJIIJJI(EnumC1341660l1A.COMMENT_LIMIT, EnumC1341660l1A.FUNCTION_BAN).contains(enumC1341660l1ALIZ)) {
                C723850SaN.LIZLLL(this, new AwS387S0200000_21(this, view, 106));
            } else if (C0BKP.LIZ() != 1 && C0BKP.LIZ() != 3) {
                this.LLLFF = true;
                C723850SaN.LIZLLL(this, new AwS387S0200000_21(this, view, 103));
            } else {
                CommentContextSource commentContextSourceUp4 = up();
                if (commentContextSourceUp4 != null && (keyboardModel = commentContextSourceUp4.getKeyboardModel()) != null) {
                    initKeyboardTypeName = keyboardModel.getInitKeyboardTypeName();
                }
                C013C c013c = new C013C();
                C013C c013c2 = new C013C();
                C723850SaN.LIZLLL(this, new AwS25S1400000_21(this, view, initKeyboardTypeName, c013c2, c013c, 4));
                this.LLJLL = new AwS265S0300000_21(this, view, c013c, 30);
                this.LLJLLIL = new AwS420S0200000_19(this, c013c2, 213);
                C1402080mac c1402080mac = new C1402080mac(this, 1);
                ((ArrayList) this.LLJLILLLLZIIL).add(c1402080mac);
                C786410Ut5.f3(c1402080mac, Looper.myQueue());
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0lAi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 42), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0lAa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1346950l9h) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(27), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0lAd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJLL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 43), 4);
    }

    public final void op(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        assembler.QQ2(this, new AwS598S0100000_19(this, 902));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).bindAbility(this.LLJJI, IKeyboardV2Ability.class);
    }

    public final void sp(Assembler assembler) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceUp = up();
        if (commentContextSourceUp != null && (keyboardModel = commentContextSourceUp.getKeyboardModel()) != null) {
            boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        assembler.QQ2(this, new AwS598S0100000_19(this, 903));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredHeight;
        if (view != null) {
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChange height :");
        sbLIZ.append(measuredHeight);
        C1344030l4z.LIZJ("KeyboardPanelV2", C2188811AlT.LIZIZ(sbLIZ));
        ICommentFloatAdAbility iCommentFloatAdAbility = (ICommentFloatAdAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentFloatAdAbility.class, null);
        if (iCommentFloatAdAbility != null) {
            iCommentFloatAdAbility.ZI0(measuredHeight);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIII.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS34S0001000_21(measuredHeight, 18));
    }
}
