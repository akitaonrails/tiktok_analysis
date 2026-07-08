package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC1347290lAF;
import X.AbstractC1387200mCc;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0CNO;
import X.C0P0T;
import X.C0PEM;
import X.C0UQH;
import X.C0XQ7;
import X.C0Y8T;
import X.C0ZFW;
import X.C1075940e6a;
import X.C10EU;
import X.C1153930g8N;
import X.C1206770hVb;
import X.C1220000hqw;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C1228920i5K;
import X.C1231430i9N;
import X.C1231470i9R;
import X.C1241010iOp;
import X.C12ES;
import X.C1341780l1M;
import X.C1342030l1l;
import X.C1344030l4z;
import X.C1344900l6O;
import X.C1345260l6y;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1346480l8w;
import X.C1346550l93;
import X.C1346760l9O;
import X.C1346890l9b;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1347570lAh;
import X.C1347610lAl;
import X.C1347620lAm;
import X.C1347720lAw;
import X.C1347730lAx;
import X.C1347740lAy;
import X.C1347860lBA;
import X.C1347890lBD;
import X.C1347980lBM;
import X.C1347990lBN;
import X.C1348010lBP;
import X.C1348110lBZ;
import X.C1348130lBb;
import X.C1349470lDl;
import X.C1350650lFf;
import X.C1350920lG6;
import X.C1350950lG9;
import X.C1355270lN7;
import X.C1355280lN8;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1401850maF;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1618506Vj;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19514711Wn;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C1A5L;
import X.C20684815ws;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C276180As4;
import X.C294170Bfz;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C459990I2b;
import X.C462970IDn;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786390Ut3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.EnumC1244100iTo;
import X.EnumC1341650l19;
import X.EnumC1346360l8k;
import X.EnumC1347870lBB;
import X.EnumC1347910lBF;
import X.EnumC1348240lBm;
import X.EnumC1355290lN9;
import X.InterfaceC1228860i5E;
import X.InterfaceC1346530l91;
import X.InterfaceC1346750l9N;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC1347900lBE;
import X.ViewTreeObserverOnGlobalLayoutListenerC1402110maf;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS22S0210000_21;
import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.comment.experiment.CommentPollPublishConfig;
import com.ss.android.ugc.aweme.comment.experiment.ReplyCommentUIOptConfig;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.ICommentGroupChatAssemAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.plus.PlusPanelConfig;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class KeyboardIconGroupAssem extends UIContentAssem implements IKeyboardIconGroupAssemAbility, IKeyboardProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 149));
    public final C01GW LLJ;
    public final C726120Se2 LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public TuxIconView LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public View LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C1348110lBZ LLJLIL;
    public AbstractC1347290lAF LLJLILLLLZIIL;
    public ViewTreeObserver.OnGlobalLayoutListener LLJLL;
    public Runnable LLJLLIL;
    public C0P0T LLJLLL;
    public C0P0T LLJZ;
    public C0P0T LLJZIJLIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1402110maf LLL;
    public ARunnableS90S0200000_21 LLLF;
    public ViewTreeObserverOnGlobalLayoutListenerC1347900lBE LLLFF;
    public ARunnableS22S0210000_21 LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final AwS565S0100000_21 LLLIIII;
    public final C01GW LLLIIIIL;
    public final C1559260qg8 LLLIIIL;
    public C459990I2b LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(KeyboardIconGroupAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(KeyboardIconGroupAssem.class, "keyboardIconGroupVM", "getKeyboardIconGroupVM()Lcom/ss/android/ugc/aweme/comment/keyboard/keyboardv2/refactor/KeyboardIconGroupVM;", 0);
        c09r3.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1153930g8N c1153930g8N = (C1153930g8N) this.LLLIIIL.getValue();
        C1558520qew.LJI(this, CommentKeyboardScope.class, this, IKeyboardIconGroupAssemAbility.class, this, String.valueOf(c1153930g8N != null ? Integer.valueOf(c1153930g8N.LL) : ""));
        cp().LL = C1558520qew.LJIIL(this);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0lBZ] */
    public KeyboardIconGroupAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C452230HoL c452230HoL = new C452230HoL(c19719912DlLIZ);
        C452250HoN c452250HoN = new C452250HoN();
        this.LLJ = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, c1637906bB, c452230HoL, c452250HoN, (Function0) null, 40));
        this.LLJI = new C726120Se2();
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(KeyboardIconGroupVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 385), AFwS259S0000000_21.get$arr$(72), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ3, c1637906bB, new C452230HoL(c19719912DlLIZ3), c452250HoN, (Function0) null, 42));
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(CommentPollViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(73), new AwS556S0100000_12((AbstractC738140SxQ) this, 386), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJLIIIJLLLLLLLZ = R.attr.a1h;
        this.LLJLIL = new InterfaceC1346530l91() { // from class: X.0lBZ
            @Override // X.InterfaceC1346530l91
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1346530l91
            public final void onShow() {
                this.LIZ.up();
            }
        };
        this.LLJLILLLLZIIL = C1347120l9y.LIZ;
        this.LLLIIII = new AwS565S0100000_21(this, 141);
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 150));
        this.LLLIIIL = new C1559260qg8(new C723580SZw(this, C1153930g8N.class, null), checkSupervisorPrepared());
    }

    public final boolean Bp() {
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView == null) {
            return false;
        }
        Zo();
        if (!Ho()) {
            return false;
        }
        this.LLLF = new ARunnableS90S0200000_21(tuxIconView, this, 6);
        if (tuxIconView.isLaidOut() && !tuxIconView.isLayoutRequested()) {
            HandlerHook.viewPostDelay(tuxIconView, this.LLLF, 350L);
            return true;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf = new ViewTreeObserverOnGlobalLayoutListenerC1402110maf(tuxIconView, this, 0);
        this.LLL = viewTreeObserverOnGlobalLayoutListenerC1402110maf;
        C786410Ut5.x3(tuxIconView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402110maf);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final void G40() {
        String strEnterFrom;
        Aweme aweme;
        C1347730lAx c1347730lAxLIZ;
        Aweme aweme2;
        C1344030l4z.LIZJ("KeyboardIconGroupAssem", "resetIconGroup");
        this.LLLII = false;
        KeyboardIconGroupVM keyboardIconGroupVMCp = cp();
        boolean zJQ2 = dp().JQ2();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = KeyboardIconGroupVM.LLILZ;
        keyboardIconGroupVMCp.wQ2(zJQ2, false);
        KeyboardIconGroupVM keyboardIconGroupVMCp2 = cp();
        keyboardIconGroupVMCp2.setStateImmediate(new AwS34S0010000_21(C1345700l7g.LJI(keyboardIconGroupVMCp2.vQ2()), 35));
        cp().xQ2(dp().JQ2());
        yp();
        Ap();
        up();
        KeyboardIconGroupVM keyboardIconGroupVMCp3 = cp();
        keyboardIconGroupVMCp3.setStateImmediate(new AwS34S0010000_21(C1345700l7g.LJFF(keyboardIconGroupVMCp3.vQ2()), 34));
        zp();
        CommentContextSource commentContextSourceBp = bp();
        C1347730lAx c1347730lAx = null;
        if (C1346420l8q.LIZ((commentContextSourceBp == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceBp)) == null) ? null : Boolean.valueOf(C1347740lAy.LIZ(aweme2, false)))) {
            CommentContextSource commentContextSourceBp2 = bp();
            if (commentContextSourceBp2 == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2)) == null) {
                strEnterFrom = "";
            }
            CommentContextSource commentContextSourceBp3 = bp();
            Aweme aweme3 = commentContextSourceBp3 != null ? CommentContextSourceKt.aweme(commentContextSourceBp3) : null;
            CommentContextSource commentContextSourceBp4 = bp();
            if (commentContextSourceBp4 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceBp4)) != null && (c1347730lAxLIZ = C1347720lAw.LIZ(aweme)) != null) {
                c1347730lAxLIZ.LJIIIZ = ep();
                c1347730lAx = c1347730lAxLIZ;
            }
            C1350920lG6.LLFZ(strEnterFrom, aweme3, false, c1347730lAx);
        }
    }

    public final void Lo() {
        TuxIconView tuxIconView;
        ViewTreeObserver viewTreeObserver;
        TuxIconView tuxIconView2;
        ViewTreeObserver viewTreeObserver2;
        TuxIconView tuxIconView3 = this.LLJJJIL;
        if (tuxIconView3 == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(tuxIconView3, this.LLJLLIL);
        this.LLJLLIL = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLJLL;
        if (onGlobalLayoutListener != null && (tuxIconView = this.LLJJJIL) != null && (viewTreeObserver = tuxIconView.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (tuxIconView2 = this.LLJJJIL) != null && (viewTreeObserver2 = tuxIconView2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLJLL = null;
        dp().LLJIJIL = false;
    }

    public final void Oo() {
        C1346890l9b c1346890l9b = C1346890l9b.LIZ;
        CommentInputContent commentInputContent = dp().getState().LLJI.LIZ;
        c1346890l9b.getClass();
        if (!C1346890l9b.LIZ(2, commentInputContent)) {
            ip();
            return;
        }
        IAudioEditAbility iAudioEditAbilityLIZ = C1346550l93.LIZ(C1558520qew.LJIIL(this));
        if (iAudioEditAbilityLIZ != null) {
            iAudioEditAbilityLIZ.ho1();
        }
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this));
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.C52();
        }
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ2 = C1346550l93.LIZJ(C1558520qew.LJIIL(this));
        if (iKeyboardInputPanelAssemAbilityLIZJ2 != null) {
            iKeyboardInputPanelAssemAbilityLIZJ2.N2();
        }
        C1346890l9b.LIZIZ(2, LJJIJL(), dp().getState().LLJI.LIZ, new AwS565S0100000_21(this, 145), new AwS565S0100000_21(this, 146), new AwS565S0100000_21(this, 147), new AwS635S0100000_21(this, 31));
    }

    public final void Zo() {
        TuxIconView tuxIconView;
        ViewTreeObserver viewTreeObserver;
        TuxIconView tuxIconView2;
        ViewTreeObserver viewTreeObserver2;
        TuxIconView tuxIconView3;
        ARunnableS90S0200000_21 aRunnableS90S0200000_21 = this.LLLF;
        if (aRunnableS90S0200000_21 != null && (tuxIconView3 = this.LLJJJJ) != null) {
            HandlerHook.viewRemoveCallbacks(tuxIconView3, aRunnableS90S0200000_21);
        }
        this.LLLF = null;
        ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf = this.LLL;
        if (viewTreeObserverOnGlobalLayoutListenerC1402110maf != null && (tuxIconView = this.LLJJJJ) != null && (viewTreeObserver = tuxIconView.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (tuxIconView2 = this.LLJJJJ) != null && (viewTreeObserver2 = tuxIconView2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1402110maf);
            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC1402110maf, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLL = null;
        C0P0T c0p0t = this.LLJZIJLIL;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
        }
        this.LLJZIJLIL = null;
    }

    public final CommentContextSource bp() {
        C726120Se2 c726120Se2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        return c726120Se2.LIZ(this);
    }

    public final KeyboardIconGroupVM cp() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        return (KeyboardIconGroupVM) assemVMLazy.getValue();
    }

    public final KeyboardVMV2 dp() {
        return (KeyboardVMV2) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final void hg1() {
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = bp();
        Aweme aweme = commentContextSourceBp != null ? CommentContextSourceKt.aweme(commentContextSourceBp) : null;
        CommentContextSource commentContextSourceBp2 = bp();
        String strEnterFrom = commentContextSourceBp2 != null ? CommentContextSourceKt.enterFrom(commentContextSourceBp2) : null;
        CommentContextSource commentContextSourceBp3 = bp();
        String strEnterMethod = commentContextSourceBp3 != null ? CommentContextSourceKt.enterMethod(commentContextSourceBp3) : null;
        String strSo = So();
        c1350920lG6.getClass();
        if (aweme != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_page", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            User author = aweme.getAuthor();
            c2344009Gk.LJIIIIZZ("author_id", author != null ? author.getUid() : null);
            User author2 = aweme.getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
            c2344009Gk.LJIIIIZZ("story_type", C729510SjV.LJJ(aweme) ? "story" : "post");
            AwemeStatistics statistics = aweme.getStatistics();
            c2344009Gk.LIZJ((statistics == null || statistics.getCommentCount() <= 0) ? 1 : 0, "is_zero_comment");
            c2344009Gk.LJIIIIZZ("input_box_status", strSo);
            C735840Sti.LIZIZ(aweme, c2344009Gk);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_plus_panel_show");
        }
    }

    public final void up() {
        C0CNO.LIZLLL(0L, new AwS565S0100000_21(this, 148));
    }

    public final void Ap() {
        if (hp()) {
            TuxIconView tuxIconView = this.LLJJIJIIJIL;
            if (tuxIconView != null) {
                C1206770hVb.LIZ(tuxIconView);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            int iOrdinal = tp().ordinal();
            if (iOrdinal == 0) {
                C1206770hVb.LIZ(tuxIconView2);
                ap(C294170Bfz.LIZ());
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C1954807lC();
                }
                C12ES.LJIILL(0, tuxIconView2);
                C786410Ut5.x5(tuxIconView2, 0.34f);
                tuxIconView2.setEnabled(true);
                ap(C294170Bfz.LIZ());
                return;
            }
            C12ES.LJIILL(0, tuxIconView2);
            C786410Ut5.x5(tuxIconView2, 1.0f);
            tuxIconView2.setEnabled(true);
            if (this.LLLI) {
                return;
            }
            this.LLLI = true;
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceBp = bp();
            Aweme aweme = commentContextSourceBp != null ? CommentContextSourceKt.aweme(commentContextSourceBp) : null;
            CommentContextSource commentContextSourceBp2 = bp();
            String strEnterFrom = commentContextSourceBp2 != null ? CommentContextSourceKt.enterFrom(commentContextSourceBp2) : null;
            CommentContextSource commentContextSourceBp3 = bp();
            String strEnterMethod = commentContextSourceBp3 != null ? CommentContextSourceKt.enterMethod(commentContextSourceBp3) : null;
            String strSo = So();
            c1350920lG6.getClass();
            C1350920lG6.LJJJJIZL(aweme, "comment_poll", strEnterFrom, strEnterMethod, strSo, "comment_panel_outer", null, null);
        }
    }

    public final boolean Ho() {
        return (!((PlusPanelConfig) C1348010lBP.LIZJ.getValue()).enable || ((Keva) C1347980lBM.LIZ.getValue()).getBoolean(C1347980lBM.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()), false) || C1345700l7g.LJIIIIZZ(bp())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r7.bp()
            boolean r0 = X.C1345700l7g.LJIIIIZZ(r0)
            if (r0 == 0) goto Le
            boolean r0 = r7.LLJL
            if (r0 == 0) goto L79
        Le:
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r0 = r7.dp()
            X.002o r0 = r0.getState()
            X.0l9h r0 = (X.C1346950l9h) r0
            X.01Au<com.ss.android.ugc.aweme.comment.model.CommentInputContent> r0 = r0.LLJI
            r3 = 0
            if (r0 == 0) goto L93
            T r0 = r0.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentInputContent r0 = (com.ss.android.ugc.aweme.comment.model.CommentInputContent) r0
            if (r0 == 0) goto L93
            android.text.Editable r6 = r0.text
        L25:
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L2f
            boolean r0 = X.C1346830l9V.LIZ(r6)
            if (r0 == 0) goto L91
        L2f:
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r0 = r7.dp()
            java.util.List r0 = r0.CQ2()
            if (r0 != 0) goto L91
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r0 = r7.dp()
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r0 = r0.GQ2()
            if (r0 != 0) goto L91
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2 r0 = r7.dp()
            java.util.List r0 = r0.xQ2()
            if (r0 != 0) goto L91
            r2 = 0
        L4e:
            boolean r0 = X.C1347610lAl.LIZIZ()
            if (r0 == 0) goto L7c
            int r1 = X.C1353700lKa.LIZIZ()
            if (r6 == 0) goto L7a
            java.lang.String r0 = r6.toString()
            if (r0 == 0) goto L7a
            int r0 = r0.length()
        L64:
            if (r0 <= r1) goto L7c
        L66:
            X.127h r1 = r7.LLJJJJLIIL
            if (r1 != 0) goto L6b
            r1 = r3
        L6b:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            X.C786410Ut5.w5(r1, r0)
            X.127h r0 = r7.LLJJJJLIIL
            if (r0 == 0) goto L76
            r3 = r0
        L76:
            r3.setEnabled(r4)
        L79:
            return
        L7a:
            r0 = 0
            goto L64
        L7c:
            if (r2 == 0) goto L66
            X.127h r1 = r7.LLJJJJLIIL
            if (r1 != 0) goto L83
            r1 = r3
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.w5(r1, r0)
            X.127h r0 = r7.LLJJJJLIIL
            if (r0 == 0) goto L8d
            r3 = r0
        L8d:
            r3.setEnabled(r5)
            return
        L91:
            r2 = 1
            goto L4e
        L93:
            r6 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem.Ip():void");
    }

    public final void No() {
        Activity activityLIZIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C0UQH.LIZ.getClass();
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            c19741112Lp.getClass();
            if (C19741112Lp.LIZLLL(c19egLIZ, "android.permission.RECORD_AUDIO")) {
                Set setLJLIIL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.MICROPHONE, EnumC1355290lN9.AUDIO_FOCUS});
                BusinessCapabilityService.LIZ.getClass();
                if (C1355270lN7.LIZ(C1355280lN8.LIZ(), setLJLIIL)) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI);
                        c1389880mGw.LJIIIIZZ(2131832241);
                        c1389880mGw.LJIIJ();
                        return;
                    }
                    return;
                }
                IKeyboardV2Ability iKeyboardV2Ability = (IKeyboardV2Ability) C1558520qew.LIZ(C1558520qew.LJIIL(this), IKeyboardV2Ability.class, null);
                if (iKeyboardV2Ability != null) {
                    iKeyboardV2Ability.ds1();
                }
                KeyboardVMV2 keyboardVMV2Dp = dp();
                keyboardVMV2Dp.getClass();
                keyboardVMV2Dp.withState(new AwS600S0100000_21(keyboardVMV2Dp, 420));
                sp("success", null);
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                c19741112Lp.getClass();
                if (C19741112Lp.LJI(c19egLIZ2, "android.permission.RECORD_AUDIO", false)) {
                    sp("fail", "no_microphone_permission");
                }
            }
            IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this));
            if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                iKeyboardInputPanelAssemAbilityLIZJ.C52();
            }
            IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ2 = C1346550l93.LIZJ(C1558520qew.LJIIL(this));
            if (iKeyboardInputPanelAssemAbilityLIZJ2 != null) {
                iKeyboardInputPanelAssemAbilityLIZJ2.N2();
            }
            KeyboardVMV2.MQ2(dp(), true);
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 142);
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 143);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(this, 144);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                return;
            }
            Activity activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            if (activityLIZ != null) {
                c19741112Lp.getClass();
                if (C19741112Lp.LJI(activityLIZ, "android.permission.RECORD_AUDIO", false)) {
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
                    c1397580mTM.LJI(activityLIZIZ.getString(2131826751));
                    c1397580mTM.LIZIZ(activityLIZIZ.getString(2131826748));
                    c1397580mTM.LJII = false;
                    C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12((Context) activityLIZIZ, 922));
                    c1397580mTM.LIZLLL(new AwS600S0100000_21(awS565S0100000_21, 285));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
            }
            Activity activityLIZ2 = C1388190mED.LIZ(activityLIZIZ);
            if (activityLIZ2 != null) {
                C19514711Wn.LIZIZ.LIZIZ(activityLIZ2, CertProviderManagerKt.findCert("bpea-comment_voice_comment", 1476788505)).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new C462970IDn(awS565S0100000_213, awS565S0100000_212, 0));
            }
        }
    }

    public final String So() {
        return !Intrinsics.LJFF(dp().wQ2(), C1347120l9y.LIZ) ? "unfold" : "fold";
    }

    public final Comment ep() {
        C1346480l8w c1346480l8w = dp().getState().LLILZIL;
        if (c1346480l8w != null) {
            return c1346480l8w.LIZ;
        }
        return null;
    }

    public final boolean hp() {
        return cp().getState().LLIZ.LIZ;
    }

    public final void ip() {
        KeyboardVMV2 keyboardVMV2Dp = dp();
        keyboardVMV2Dp.getClass();
        keyboardVMV2Dp.withState(new AwS600S0100000_21(keyboardVMV2Dp, 410));
        C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(bp()), CommentContextSourceKt.aweme(bp()), !this.LLJL, dp().HQ2(), false, C1347720lAw.LJIILL(ep()));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", "photo_comment");
        CommentContextSource commentContextSourceBp = bp();
        C1347720lAw.LJFF(c2344009Gk, commentContextSourceBp != null ? CommentContextSourceKt.aweme(commentContextSourceBp) : null);
        C20684815ws.LJIILLIIL("click_upload_entrance", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        dp().tP1(this.LLJLIL);
        if (C294170Bfz.LIZ()) {
            ap(true);
            Vo(true);
            C1346760l9O.LIZLLL("poll_guide");
        } else {
            ap(false);
            Vo(false);
        }
        KeyboardVMV2 keyboardVMV2Dp = dp();
        if (keyboardVMV2Dp.LLILZLL == this.LLLIIII) {
            keyboardVMV2Dp.LLILZLL = null;
        }
    }

    public final EnumC1347910lBF tp() {
        EnumC1346360l8k inputServiceType;
        CommentContextSource commentContextSourceBp;
        CommentContextSource commentContextSourceBp2;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        Aweme aweme3;
        CommentCommonModel commonModel;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        if (dp().JQ2()) {
            return EnumC1347910lBF.LL;
        }
        CommentContextSource commentContextSourceBp3 = bp();
        if (commentContextSourceBp3 == null || (keyboardModel2 = commentContextSourceBp3.getKeyboardModel()) == null || (inputServiceType = keyboardModel2.getInputServiceType()) == null) {
            inputServiceType = EnumC1346360l8k.COMMENT_PANEL;
        }
        if (inputServiceType == EnumC1346360l8k.FEED_QUICK_COMMENT) {
            return EnumC1347910lBF.LL;
        }
        CommentContextSource commentContextSourceBp4 = bp();
        if ((commentContextSourceBp4 != null && (keyboardModel = commentContextSourceBp4.getKeyboardModel()) != null && keyboardModel.isLandscapeMode()) || ((commentContextSourceBp = bp()) != null && (commonModel = commentContextSourceBp.getCommonModel()) != null && commonModel.isInPhotoCommentDetailPage())) {
            return EnumC1347910lBF.LL;
        }
        CommentPollPublishConfig commentPollPublishConfig = (CommentPollPublishConfig) C1344900l6O.LIZIZ.getValue();
        if (commentPollPublishConfig == null) {
            commentPollPublishConfig = C1344900l6O.LIZ;
        }
        if (commentPollPublishConfig.enable) {
            CommentContextSource commentContextSourceBp5 = bp();
            String authorUid = null;
            if (commentContextSourceBp5 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceBp5)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme3);
            }
            if (C10EU.LJIIZILJ(authorUid) && ((commentContextSourceBp2 = bp()) == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceBp2)) == null || (!AwemeExtKt.isProhibited(aweme2) && AwemeExtKt.getReviewStatus(aweme2) != 1))) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LLJILJILJ.getValue();
                CommentContextSource commentContextSourceBp6 = bp();
                return (commentContextSourceBp6 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceBp6)) == null || (aid = aweme.getAid()) == null || aid.length() == 0 || !((C1342030l1l) assemViewModel.getState()).LL.containsKey(aid)) ? EnumC1347910lBF.LLILLJJLI : EnumC1347910lBF.LLILLL;
            }
        }
        return EnumC1347910lBF.LL;
    }

    public final void yp() {
        CommentContextSource commentContextSourceBp;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceBp2;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        CommentContextSource commentContextSourceBp3 = bp();
        if ((!((commentContextSourceBp3 == null || (keyboardModel2 = commentContextSourceBp3.getKeyboardModel()) == null || !keyboardModel2.getForceDisableMention()) ? false : true) && ((commentContextSourceBp2 = bp()) == null || (keyboardModel = commentContextSourceBp2.getKeyboardModel()) == null || !keyboardModel.isLandscapeMode())) || (commentContextSourceBp = bp()) == null || (commonModel = commentContextSourceBp.getCommonModel()) == null || commonModel.isInPhotoCommentDetailPage()) {
            TuxIconView tuxIconView = this.LLJJIJI;
            C786410Ut5.LLLLLLZZ(tuxIconView != null ? tuxIconView : null, 0);
        } else {
            TuxIconView tuxIconView2 = this.LLJJIJI;
            C786410Ut5.LLLLLLZZ(tuxIconView2 != null ? tuxIconView2 : null, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupVM r4 = r5.cp()
            com.ss.android.ugc.aweme.comment.plus.PlusPanelConfig r0 = X.C1348010lBP.LIZ()
            java.util.List<java.lang.String> r1 = r0.plusPanelButtons
            boolean r0 = r1 instanceof java.util.Collection
            r3 = 1
            if (r0 == 0) goto L49
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L49
        L15:
            r1 = 0
        L16:
            com.ss.android.ugc.aweme.comment.plus.PlusPanelConfig r0 = X.C1348010lBP.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L45
            boolean r0 = r0.isLandscapeMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L32:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 != 0) goto L47
            if (r1 == 0) goto L47
        L3a:
            kotlin.jvm.internal.AwS34S0010000_21 r1 = new kotlin.jvm.internal.AwS34S0010000_21
            r0 = 32
            r1.<init>(r3, r0)
            r4.setStateImmediate(r1)
            return
        L45:
            r0 = 0
            goto L32
        L47:
            r3 = 0
            goto L3a
        L49:
            java.util.Iterator r2 = r1.iterator()
        L4d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r1 = r2.next()
            X.0lBa r0 = X.EnumC1347870lBB.Companion
            r0.getClass()
            java.util.Map<java.lang.String, X.0lBB> r0 = X.EnumC1347870lBB.byRaw
            java.lang.Object r0 = r0.get(r1)
            X.0lBB r0 = (X.EnumC1347870lBB) r0
            if (r0 == 0) goto L4d
            boolean r0 = r5.SE2(r0)
            if (r0 == 0) goto L4d
            r1 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem.zp():void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        G40();
    }

    public static String Fp(EnumC1347870lBB enumC1347870lBB) {
        int i = C1347890lBD.LIZ[enumC1347870lBB.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return enumC1347870lBB.getRaw();
                    }
                    return "gift";
                }
                return "group";
            }
            return "product";
        }
        return "comment_poll";
    }

    public final void Go(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return;
        }
        String strLJIIJ = C0ZFW.LIZ.LJIIJ(c0y8t);
        ICommentGroupChatAssemAbility iCommentGroupChatAssemAbility = (ICommentGroupChatAssemAbility) this.LLIZLLLIL.getValue();
        if (iCommentGroupChatAssemAbility != null) {
            iCommentGroupChatAssemAbility.jY(strLJIIJ, c0y8t.getConversationShortId(), EnumC1244100iTo.CLICK_COMMENT_PANEL_GROUP_ICON);
        }
    }

    public final boolean Jo(boolean z) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        C0P0T c0p0t;
        C1075940e6a.LIZ.getClass();
        if (!C1075940e6a.LJ().LIZLLL) {
            return false;
        }
        if ((!z && (this.LLLFZ || ((c0p0t = this.LLJLLL) != null && c0p0t.isShowing()))) || tp() != EnumC1347910lBF.LLILLJJLI || (tuxIconView = this.LLJJIJIIJIL) == null || tuxIconView.getVisibility() != 0 || (tuxIconView2 = this.LLJJIJIIJIL) == null || !tuxIconView2.isEnabled()) {
            return false;
        }
        if (!C294170Bfz.LIZ()) {
            ICommentFakeInputAbility iCommentFakeInputAbilityLIZJ = C1345760l7m.LIZJ(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
            if (iCommentFakeInputAbilityLIZJ != null && iCommentFakeInputAbilityLIZJ.lb0()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final boolean SE2(EnumC1347870lBB enumC1347870lBB) {
        C1348130lBb c1348130lBb;
        int i = C1347890lBD.LIZ[enumC1347870lBB.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || !C1350950lG9.LIZIZ.LIZLLL() || (c1348130lBb = cp().getState().LLILZ) == null || !c1348130lBb.LIZ || dp().JQ2()) {
                        return false;
                    }
                } else {
                    C1231430i9N c1231430i9N = C1231430i9N.LIZ;
                    CommentContextSource commentContextSourceBp = bp();
                    c1231430i9N.getClass();
                    return C1231430i9N.LIZ(commentContextSourceBp);
                }
            } else {
                return dp().getState().LLJJLIIIJLLLLLLLZ;
            }
        } else if (tp() == EnumC1347910lBF.LL) {
            return false;
        }
        return true;
    }

    public final void Vo(boolean z) {
        Lo();
        C0P0T c0p0t = this.LLJZ;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
        }
        this.LLJZ = null;
        if (z) {
            C1346760l9O.LIZLLL("audio_record_guide");
        }
    }

    public final void ap(boolean z) {
        TuxIconView tuxIconView;
        ViewTreeObserver viewTreeObserver;
        TuxIconView tuxIconView2;
        ViewTreeObserver viewTreeObserver2;
        TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
        if (tuxIconView3 != null) {
            HandlerHook.viewRemoveCallbacks(tuxIconView3, this.LLLFFI);
        }
        this.LLLFFI = null;
        ViewTreeObserverOnGlobalLayoutListenerC1347900lBE viewTreeObserverOnGlobalLayoutListenerC1347900lBE = this.LLLFF;
        if (viewTreeObserverOnGlobalLayoutListenerC1347900lBE != null && (tuxIconView = this.LLJJIJIIJIL) != null && (viewTreeObserver = tuxIconView.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (tuxIconView2 = this.LLJJIJIIJIL) != null && (viewTreeObserver2 = tuxIconView2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1347900lBE);
            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC1347900lBE, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLLFF = null;
        this.LLLFZ = false;
        C0P0T c0p0t = this.LLJLLL;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
            return;
        }
        this.LLJLLL = null;
        if (!z) {
            return;
        }
        C1346760l9O.LIZ("poll_guide");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final void ba2(EnumC1347870lBB enumC1347870lBB) {
        Pair pair;
        Aweme aweme;
        String strEnterFrom;
        String strEnterMethod;
        ICommentLinkProductAssemAbility iCommentLinkProductAssemAbility;
        String uid;
        int i;
        if (enumC1347870lBB == EnumC1347870lBB.POLL && tp() == EnumC1347910lBF.LLILLL) {
            pair = new Pair("fail", "poll_already_created");
        } else {
            pair = new Pair("success", null);
        }
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = bp();
        if (commentContextSourceBp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceBp);
        } else {
            aweme = null;
        }
        String strFp = Fp(enumC1347870lBB);
        CommentContextSource commentContextSourceBp2 = bp();
        if (commentContextSourceBp2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
        } else {
            strEnterFrom = null;
        }
        CommentContextSource commentContextSourceBp3 = bp();
        if (commentContextSourceBp3 != null) {
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
        } else {
            strEnterMethod = null;
        }
        String strMp = mp(enumC1347870lBB);
        String strSo = So();
        c1350920lG6.getClass();
        if (aweme != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_element", strFp);
            c2344009Gk.LJIIIIZZ("event_page", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            User author2 = aweme.getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null && statistics.getCommentCount() > 0) {
                i = 0;
            } else {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "is_zero_comment");
            c2344009Gk.LJIIIIZZ("is_greyed_out", strMp);
            c2344009Gk.LJIIIIZZ("input_box_status", strSo);
            c2344009Gk.LJIIIIZZ("action_result", str);
            c2344009Gk.LJIIIIZZ("result_code", str2);
            C735840Sti.LIZIZ(aweme, c2344009Gk);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_plus_panel_function_click");
        }
        int i2 = C1347890lBD.LIZ[enumC1347870lBB.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        GiftViewModel giftViewModel = (GiftViewModel) this.LLLIIIIL.getValue();
                        if (giftViewModel != null) {
                            giftViewModel.LLJILJILJ = "plus_panel";
                        }
                        KeyboardVMV2 keyboardVMV2Dp = dp();
                        keyboardVMV2Dp.getClass();
                        keyboardVMV2Dp.withState(new AwS135S1100000_21(keyboardVMV2Dp, "plus_panel", 20));
                        return;
                    }
                    return;
                }
                kp("plus_panel");
                return;
            }
            if (getContext() == null || (iCommentLinkProductAssemAbility = (ICommentLinkProductAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentLinkProductAssemAbility.class, null)) == null) {
                return;
            }
            iCommentLinkProductAssemAbility.to1(null, false);
            return;
        }
        lp("plus_panel");
    }

    public final void kp(String str) {
        Context context;
        long j;
        String str2;
        CommentCommonModel commonModel;
        String str3;
        CommentCommonModel commonModel2;
        String str4;
        CommentCommonModel commonModel3;
        String str5;
        CommentCommonModel commonModel4;
        TuxIconView tuxIconView = this.LLJJIII;
        if ((tuxIconView == null || (context = tuxIconView.getContext()) == null) && (context = getContext()) == null) {
            return;
        }
        GroupEntranceCommon groupEntranceCommon = C1228920i5K.LIZJ().LIZJ;
        if (groupEntranceCommon != null) {
            j = groupEntranceCommon.totalCurrentGroupCnt;
        } else {
            j = 0;
        }
        String str6 = "";
        if (j > 0) {
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "comment", "comment_keyboard");
            C1231430i9N c1231430i9N = C1231430i9N.LIZ;
            CommentContextSource commentContextSourceBp = bp();
            CommentContextSource commentContextSourceBp2 = bp();
            if (commentContextSourceBp2 == null || (commonModel4 = commentContextSourceBp2.getCommonModel()) == null || (str4 = commonModel4.enterFrom) == null) {
                str4 = "";
            }
            AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 54);
            c1231430i9N.getClass();
            C1228650i4t c1228650i4tLIZLLL = C1231430i9N.LIZLLL(context, commentContextSourceBp, str4, "add_group_to_comment", awS600S0100000_21, true, null);
            CommentContextSource commentContextSourceBp3 = bp();
            CommentContextSource commentContextSourceBp4 = bp();
            if (commentContextSourceBp4 != null && (commonModel3 = commentContextSourceBp4.getCommonModel()) != null && (str5 = commonModel3.enterFrom) != null) {
                str6 = str5;
            }
            c1231470i9RLIZIZ.LJFF(context, new C1228470i4b(c1228650i4tLIZLLL, C1231430i9N.LJ(context, commentContextSourceBp3, str6, new AwS670S0100000_21(this, 4), new InterfaceC1228860i5E() { // from class: X.0lBH
                @Override // X.InterfaceC1228860i5E
                public final void LIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.w92();
                    }
                }

                @Override // X.InterfaceC1228860i5E
                public final void LIZIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.wW0();
                    }
                }
            })));
        } else {
            C1231470i9R c1231470i9RLIZIZ2 = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "comment", "comment_keyboard");
            C1231430i9N c1231430i9N2 = C1231430i9N.LIZ;
            CommentContextSource commentContextSourceBp5 = bp();
            CommentContextSource commentContextSourceBp6 = bp();
            if (commentContextSourceBp6 == null || (commonModel2 = commentContextSourceBp6.getCommonModel()) == null || (str2 = commonModel2.enterFrom) == null) {
                str2 = "";
            }
            AwS600S0100000_21 awS600S0100000_212 = new AwS600S0100000_21(this, 55);
            InterfaceC1228860i5E interfaceC1228860i5E = new InterfaceC1228860i5E() { // from class: X.0lBI
                @Override // X.InterfaceC1228860i5E
                public final void LIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.w92();
                    }
                }

                @Override // X.InterfaceC1228860i5E
                public final void LIZIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.wW0();
                    }
                }
            };
            c1231430i9N2.getClass();
            C1228650i4t c1228650i4tLIZLLL2 = C1231430i9N.LIZLLL(context, commentContextSourceBp5, str2, "comment_panel_group_icon", awS600S0100000_212, false, interfaceC1228860i5E);
            CommentContextSource commentContextSourceBp7 = bp();
            CommentContextSource commentContextSourceBp8 = bp();
            if (commentContextSourceBp8 != null && (commonModel = commentContextSourceBp8.getCommonModel()) != null && (str3 = commonModel.enterFrom) != null) {
                str6 = str3;
            }
            c1231470i9RLIZIZ2.LJ(context, new C1228470i4b(c1228650i4tLIZLLL2, C1231430i9N.LJ(context, commentContextSourceBp7, str6, new AwS670S0100000_21(this, 5), new InterfaceC1228860i5E() { // from class: X.0lBJ
                @Override // X.InterfaceC1228860i5E
                public final void LIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.w92();
                    }
                }

                @Override // X.InterfaceC1228860i5E
                public final void LIZIZ() {
                    IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(C1558520qew.LJIIL(this.LIZ));
                    if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
                        iKeyboardInputPanelAssemAbilityLIZJ.wW0();
                    }
                }
            })));
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String value = EnumC1348240lBm.GROUP.getValue();
        CommentContextSource commentContextSourceBp9 = bp();
        boolean zLIZ = C1345260l6y.LIZ(dp().getState().LL);
        c1350920lG6.getClass();
        if (commentContextSourceBp9 != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1241010iOp(commentContextSourceBp9, value, str, zLIZ, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final boolean lM0(EnumC1347870lBB enumC1347870lBB) {
        return Intrinsics.LJFF(mp(enumC1347870lBB), "1");
    }

    public final void lp(String str) {
        Aweme aweme;
        String strEnterFrom;
        Aweme aweme2;
        String strEnterFrom2;
        ap(C294170Bfz.LIZ());
        int iOrdinal = tp().ordinal();
        if (iOrdinal != 0) {
            String strEnterMethod = null;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                        c1389890mGx.LJIIIZ(2131829096);
                        c1389890mGx.LJIIJJI();
                    }
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    CommentContextSource commentContextSourceBp = bp();
                    if (commentContextSourceBp != null) {
                        aweme2 = CommentContextSourceKt.aweme(commentContextSourceBp);
                    } else {
                        aweme2 = null;
                    }
                    CommentContextSource commentContextSourceBp2 = bp();
                    if (commentContextSourceBp2 != null) {
                        strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
                    } else {
                        strEnterFrom2 = null;
                    }
                    CommentContextSource commentContextSourceBp3 = bp();
                    if (commentContextSourceBp3 != null) {
                        strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
                    }
                    c1350920lG6.getClass();
                    C1350920lG6.LJJJJ(aweme2, "comment_poll", strEnterFrom2, strEnterMethod, "unfold", "fail", "poll_already_created", str, null, null);
                    return;
                }
                throw new C1954807lC();
            }
            ISingleCommentKeyboardAbility iSingleCommentKeyboardAbility = (ISingleCommentKeyboardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISingleCommentKeyboardAbility.class, null);
            if (iSingleCommentKeyboardAbility != null) {
                iSingleCommentKeyboardAbility.Yr0();
            }
            C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceBp4 = bp();
            if (commentContextSourceBp4 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceBp4);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceBp5 = bp();
            if (commentContextSourceBp5 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp5);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceBp6 = bp();
            if (commentContextSourceBp6 != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp6);
            }
            c1350920lG62.getClass();
            C1350920lG6.LJJJJ(aweme, "comment_poll", strEnterFrom, strEnterMethod, "unfold", "success", null, str, null, null);
        }
    }

    public final String mp(EnumC1347870lBB enumC1347870lBB) {
        if (enumC1347870lBB == EnumC1347870lBB.POLL && tp() == EnumC1347910lBF.LLILLL) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup viewGroup;
        List<String> list;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3;
        TuxIconView tuxIconView4;
        ViewGroup viewGroup2;
        TuxIconView tuxIconView5;
        super.onViewCreated(view);
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null) {
            iKeyboardEditAbilityLIZIZ.Zy1();
        }
        this.LLJILLL = (TuxIconView) view.findViewById(R.id.lzc);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.lfo);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.lml);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.lis);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.l99);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.lri);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.lie);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.ll7);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.kcl);
        this.LLJJJIL = (TuxIconView) view.findViewById(R.id.lzj);
        TuxIconView tuxIconView6 = (TuxIconView) view.findViewById(R.id.lre);
        this.LLJJJJ = tuxIconView6;
        if (tuxIconView6 != null) {
            tuxIconView6.setScaleType(ImageView.ScaleType.CENTER);
            int i2 = (int) (tuxIconView6.getResources().getDisplayMetrics().density * 24);
            tuxIconView6.setIconWidth(i2);
            tuxIconView6.setIconHeight(i2);
        }
        ViewGroup viewGroup3 = this.LLJJJJJIL;
        if (viewGroup3 != null) {
            q0.LJIJ(viewGroup3, new C786390Ut3(1));
        }
        this.LLJJJJLIIL = (C197039127h) view.findViewById(R.id.cuv);
        this.LLJJL = view.findViewById(R.id.v_spacer);
        C197039127h c197039127h = null;
        if (!C1345700l7g.LJIIIIZZ(bp())) {
            C197039127h c197039127h2 = this.LLJJJJLIIL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        if (CommentWithStickerExp.LIZIZ()) {
            TuxIconView tuxIconView7 = this.LLJJ;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            this.LLLIIL = new C459990I2b(tuxIconView7, null);
        }
        TuxIconView tuxIconView8 = this.LLJILLL;
        if (tuxIconView8 == null) {
            tuxIconView8 = null;
        }
        C786410Ut5.a9(tuxIconView8, new ACListenerS155S0100000_21(this, 25));
        TuxIconView tuxIconView9 = this.LLJJ;
        if (tuxIconView9 == null) {
            tuxIconView9 = null;
        }
        C786410Ut5.I7(new C1401850maF(this, 2), tuxIconView9);
        TuxIconView tuxIconView10 = this.LLJJIJIL;
        if (tuxIconView10 == null) {
            tuxIconView10 = null;
        }
        C786410Ut5.I7(new C1401850maF(this, 3), tuxIconView10);
        TuxIconView tuxIconView11 = this.LLJJI;
        if (tuxIconView11 != null) {
            C786410Ut5.I7(new C1401850maF(this, 4), tuxIconView11);
        }
        TuxIconView tuxIconView12 = this.LLJJIII;
        if (tuxIconView12 != null) {
            up();
            C786410Ut5.I7(new C1401850maF(this, 42), tuxIconView12);
        }
        TuxIconView tuxIconView13 = this.LLJJIJI;
        if (tuxIconView13 == null) {
            tuxIconView13 = null;
        }
        C786410Ut5.I7(new C1401850maF(this, 5), tuxIconView13);
        TuxIconView tuxIconView14 = this.LLJJIJIIJIL;
        if (tuxIconView14 != null) {
            C786410Ut5.I7(new C1401850maF(this, 6), tuxIconView14);
        }
        C1350650lFf.LIZ.getClass();
        if (C1350650lFf.LIZIZ()) {
            TuxIconView tuxIconView15 = this.LLJJJ;
            if (tuxIconView15 == null) {
                tuxIconView15 = null;
            }
            C786410Ut5.a9(tuxIconView15, new ACListenerS155S0100000_21(this, 26));
            IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService != null) {
                iToolsDebugGpService.isOpen();
            }
        }
        C2271391DvN.LIZ(this.LLJJJIL, (C1A5L) C2271381DvM.f250Y.getValue());
        TuxIconView tuxIconView16 = this.LLJJJIL;
        if (tuxIconView16 != null) {
            C786410Ut5.I7(new C1401850maF(this, 7), tuxIconView16);
        }
        C197039127h c197039127h3 = this.LLJJJJLIIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        C786410Ut5.U8(c197039127h3, new ACListenerS155S0100000_21(this, 28));
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && C1347860lBA.LIZIZ && (list = C1347860lBA.LIZJ) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            for (String str : list) {
                switch (str.hashCode()) {
                    case -1157264982:
                        if (str.equals("link_product") && (tuxIconView = this.LLJJI) != null) {
                            viewGroup.addView(tuxIconView);
                        }
                        break;
                    case 3172656:
                        if (str.equals("gift")) {
                            TuxIconView tuxIconView17 = this.LLJJIJIL;
                            if (tuxIconView17 == null) {
                                tuxIconView17 = null;
                            }
                            viewGroup.addView(tuxIconView17);
                        }
                        break;
                    case 3357525:
                        if (str.equals("more") && (tuxIconView2 = this.LLJJJJ) != null) {
                            viewGroup.addView(tuxIconView2);
                        }
                        break;
                    case 3446719:
                        if (str.equals("poll") && (tuxIconView3 = this.LLJJIJIIJIL) != null) {
                            viewGroup.addView(tuxIconView3);
                        }
                        break;
                    case 93166550:
                        if (str.equals("audio") && (tuxIconView4 = this.LLJJJIL) != null) {
                            viewGroup.addView(tuxIconView4);
                        }
                        break;
                    case 96632902:
                        if (str.equals("emoji")) {
                            TuxIconView tuxIconView18 = this.LLJJ;
                            if (tuxIconView18 == null) {
                                tuxIconView18 = null;
                            }
                            viewGroup.addView(tuxIconView18);
                        }
                        break;
                    case 106642994:
                        if (str.equals("photo") && (viewGroup2 = this.LLJJJJJIL) != null) {
                            viewGroup.addView(viewGroup2);
                        }
                        break;
                    case 950345194:
                        if (str.equals("mention")) {
                            TuxIconView tuxIconView19 = this.LLJJIJI;
                            if (tuxIconView19 == null) {
                                tuxIconView19 = null;
                            }
                            viewGroup.addView(tuxIconView19);
                        }
                        break;
                    case 1281985816:
                        if (str.equals("group_chat") && (tuxIconView5 = this.LLJJIII) != null) {
                            viewGroup.addView(tuxIconView5);
                        }
                        break;
                }
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                viewGroup.addView(view2);
            }
            C197039127h c197039127h4 = this.LLJJJJLIIL;
            if (c197039127h4 == null) {
                c197039127h4 = null;
            }
            viewGroup.addView(c197039127h4);
        }
        C1153930g8N c1153930g8N = (C1153930g8N) this.LLLIIIL.getValue();
        if (c1153930g8N != null && c1153930g8N.LL == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C1347570lAh.LIZIZ()) {
                i = 8;
            } else {
                i = 4;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            TuxIconView tuxIconView20 = this.LLJILLL;
            if (tuxIconView20 == null) {
                tuxIconView20 = null;
            }
            C426750GoL.LJIIIZ(tuxIconView20, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            TuxIconView tuxIconView21 = this.LLJJ;
            if (tuxIconView21 == null) {
                tuxIconView21 = null;
            }
            C426750GoL.LJIIIZ(tuxIconView21, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            TuxIconView tuxIconView22 = this.LLJJIJI;
            if (tuxIconView22 == null) {
                tuxIconView22 = null;
            }
            C426750GoL.LJIIIZ(tuxIconView22, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            TuxIconView tuxIconView23 = this.LLJJIJIIJIL;
            if (tuxIconView23 != null) {
                C426750GoL.LJIIIZ(tuxIconView23, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            }
            TuxIconView tuxIconView24 = this.LLJJIJIL;
            if (tuxIconView24 == null) {
                tuxIconView24 = null;
            }
            C426750GoL.LJIIIZ(tuxIconView24, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            TuxIconView tuxIconView25 = this.LLJJJ;
            if (tuxIconView25 == null) {
                tuxIconView25 = null;
            }
            C426750GoL.LJIIIZ(tuxIconView25, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            TuxIconView tuxIconView26 = this.LLJJIII;
            if (tuxIconView26 != null) {
                C426750GoL.LJIIIZ(tuxIconView26, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            }
            TuxIconView tuxIconView27 = this.LLJJJIL;
            if (tuxIconView27 != null) {
                C426750GoL.LJIIIZ(tuxIconView27, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            }
            TuxIconView tuxIconView28 = this.LLJJJJ;
            if (tuxIconView28 != null) {
                C426750GoL.LJIIIZ(tuxIconView28, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
            }
            if (!C1345700l7g.LJIIIIZZ(bp())) {
                C01GW c01gw = C1347620lAm.LIZIZ;
                if (((ReplyCommentUIOptConfig) c01gw.getValue()).sendBtnStyle == 2) {
                    C197039127h c197039127h5 = this.LLJJJJLIIL;
                    if (c197039127h5 == null) {
                        c197039127h5 = null;
                    }
                    c197039127h5.LJJJLZIJ(null, null);
                    C197039127h c197039127h6 = this.LLJJJJLIIL;
                    if (c197039127h6 == null) {
                        c197039127h6 = null;
                    }
                    c197039127h6.setText(R.string.sxo);
                }
                if (((ReplyCommentUIOptConfig) c01gw.getValue()).sendBtnStyle > 0 || ((Number) C276180As4.LIZ.getValue()).intValue() == 3) {
                    C197039127h c197039127h7 = this.LLJJJJLIIL;
                    if (c197039127h7 == null) {
                        c197039127h7 = null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = c197039127h7.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        }
                    } else {
                        marginLayoutParams2 = null;
                    }
                    C197039127h c197039127h8 = this.LLJJJJLIIL;
                    if (c197039127h8 == null) {
                        c197039127h8 = null;
                    }
                    c197039127h8.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
                    C197039127h c197039127h9 = this.LLJJJJLIIL;
                    if (c197039127h9 == null) {
                        c197039127h9 = null;
                    }
                    C786410Ut5.J6(c197039127h9, marginLayoutParams2);
                }
                if (C1347610lAl.LIZ().buttonGroupReArrange != 1 && ((ReplyCommentUIOptConfig) c01gw.getValue()).buttonGroupReArrange != 1) {
                    C197039127h c197039127h10 = this.LLJJJJLIIL;
                    if (c197039127h10 == null) {
                        c197039127h10 = null;
                    }
                    C426750GoL.LJIIIZ(c197039127h10, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, null, false, 30);
                } else {
                    View view3 = this.LLJJL;
                    if (view3 != null) {
                        layoutParams = view3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams) != null) {
                        layoutParams2.weight = 1.0f;
                        View view4 = this.LLJJL;
                        if (view4 != null) {
                            C786410Ut5.W5(view4, layoutParams2);
                        }
                    }
                }
            }
            if (((Number) C276180As4.LIZ.getValue()).intValue() == 3) {
                C197039127h c197039127h11 = this.LLJJJJLIIL;
                if (c197039127h11 == null) {
                    c197039127h11 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = c197039127h11.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    }
                } else {
                    marginLayoutParams = null;
                }
                C197039127h c197039127h12 = this.LLJJJJLIIL;
                if (c197039127h12 == null) {
                    c197039127h12 = null;
                }
                c197039127h12.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
                C197039127h c197039127h13 = this.LLJJJJLIIL;
                if (c197039127h13 == null) {
                    c197039127h13 = null;
                }
                C786410Ut5.J6(c197039127h13, marginLayoutParams);
            }
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0lBV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1347990lBN) obj).LLILLJJLI;
            }
        }, null, new AwS635S0100000_21(this, 207), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0lBU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1347990lBN) obj).LLILZIL);
            }
        }, null, new AwS635S0100000_21(this, 214), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0lBR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1347990lBN) obj).LLILZLL);
            }
        }, null, new AwS635S0100000_21(this, 198), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lAM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJJ);
            }
        }, null, new AwS633S0100000_19(this, 310), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0l6B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1342030l1l) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 200), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lAY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS635S0100000_21(this, 202), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lBQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 204), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0l9B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 205), 4);
        AwS635S0100000_21 awS635S0100000_21 = null;
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lBS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS635S0100000_21(this, 206), 6);
        if (!C1345700l7g.LJIIIIZZ(bp())) {
            C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lBT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1346950l9h) obj).LLJ);
                }
            }, null, new AwS635S0100000_21(this, 209), 6);
            C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0SYd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1346950l9h) obj).LLJI;
                }
            }, null, new AwS635S0100000_21(this, 45), 6);
            if (C1347610lAl.LIZIZ()) {
                C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0lAO
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1346950l9h) obj).LLJLLIL;
                    }
                }, null, new AwS635S0100000_21(this, 46), 6);
            }
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0Ht5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJLL);
            }
        }, null, new AwS635S0100000_21(this, 211), 6);
        cp().LLILLL = (GiftViewModel) this.LLLIIIIL.getValue();
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0lBX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1347990lBN) obj).LLILZ;
            }
        }, null, new AwS635S0100000_21(this, 213), 6);
        dp().Qu0(this.LLJLIL);
        dp().LLILZLL = this.LLLIIII;
        TuxIconView tuxIconView29 = this.LLJJJJ;
        if (tuxIconView29 != null) {
            if (C1348010lBP.LIZ().enable) {
                C1349470lDl.LIZ();
                C786410Ut5.I7(new C1401850maF(this, 43), tuxIconView29);
                final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1627);
                final AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 1629);
                final AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(this, 1631);
                C1346760l9O.LIZIZ(new InterfaceC1346750l9N(awS565S0100000_21, awS565S0100000_212, awS565S0100000_213) { // from class: X.0lBL
                    public final Function0<Boolean> LIZ;
                    public final Function0<Boolean> LIZIZ;
                    public final Function0<Unit> LIZJ;
                    public final EnumC993530bxf LIZLLL = EnumC993530bxf.KEYBOARD_OPEN;

                    @Override // X.InterfaceC1346750l9N
                    public final String getId() {
                        return "plus_panel_bubble_guide";
                    }

                    @Override // X.InterfaceC1346750l9N
                    public final int getPriority() {
                        return 2;
                    }

                    @Override // X.InterfaceC1346750l9N
                    public final boolean LJJLIL() {
                        return this.LIZ.invoke().booleanValue();
                    }

                    @Override // X.InterfaceC1346750l9N
                    public final void dismiss() {
                        this.LIZJ.invoke();
                    }

                    @Override // X.InterfaceC1346750l9N
                    public final boolean show() {
                        return this.LIZIZ.invoke().booleanValue();
                    }

                    @Override // X.InterfaceC1346750l9N
                    public final EnumC993530bxf LIZ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZ = awS565S0100000_21;
                        this.LIZIZ = awS565S0100000_212;
                        this.LIZJ = awS565S0100000_213;
                    }
                });
                awS635S0100000_21 = null;
                C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0lBW
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1347990lBN) obj).LLIZ;
                    }
                }, null, new AwS635S0100000_21(this, 210), 6);
                zp();
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView29, 8);
            }
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        TuxIconView tuxIconView30 = this.LLJILLL;
        if (tuxIconView30 == null) {
            tuxIconView30 = null;
        }
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.ALPHA_BUTTON;
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView30, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        TuxIconView tuxIconView31 = this.LLJJIJI;
        if (tuxIconView31 == null) {
            tuxIconView31 = null;
        }
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView31, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        TuxIconView tuxIconView32 = this.LLJJ;
        if (tuxIconView32 == null) {
            tuxIconView32 = null;
        }
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView32, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        TuxIconView tuxIconView33 = this.LLJJIJIL;
        if (tuxIconView33 == null) {
            tuxIconView33 = null;
        }
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView33, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        TuxIconView tuxIconView34 = this.LLJJJ;
        if (tuxIconView34 == null) {
            tuxIconView34 = null;
        }
        C1341780l1M.LIZIZ(c1341780l1M, tuxIconView34, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        C197039127h c197039127h14 = this.LLJJJJLIIL;
        if (c197039127h14 != null) {
            c197039127h = c197039127h14;
        }
        C1341780l1M.LIZIZ(c1341780l1M, c197039127h, EnumC1341650l19.BUTTON, 0.0f, awS635S0100000_21, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJI, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJIII, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJIJIIJIL, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJJIL, enumC1341650l19, 0.0f, awS635S0100000_21, 12);
        KeyboardIconGroupVM keyboardIconGroupVMCp = cp();
        keyboardIconGroupVMCp.setStateImmediate(new AwS34S0010000_21(C1345700l7g.LJI(keyboardIconGroupVMCp.vQ2()), 35));
        KeyboardIconGroupVM keyboardIconGroupVMCp2 = cp();
        keyboardIconGroupVMCp2.setStateImmediate(new AwS34S0010000_21(C1345700l7g.LJFF(keyboardIconGroupVMCp2.vQ2()), 34));
        G40();
        Ip();
    }

    public final void op(boolean z) {
        List<String> list;
        int i;
        int i2;
        int i3;
        int i4;
        PlusPanelConfig plusPanelConfigLIZ = C1348010lBP.LIZ();
        if (plusPanelConfigLIZ.enable && !C1345700l7g.LJIIIIZZ(bp())) {
            if (z) {
                list = plusPanelConfigLIZ.unfoldButtons;
            } else {
                list = plusPanelConfigLIZ.foldButtons;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                EnumC1347870lBB.Companion.getClass();
                EnumC1347870lBB enumC1347870lBB = EnumC1347870lBB.byRaw.get(str);
                if (enumC1347870lBB != null) {
                    arrayList.add(enumC1347870lBB);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            C1347990lBN state = cp().getState();
            ViewGroup viewGroup = this.LLJJJJJIL;
            if (viewGroup != null) {
                if (setLLIIJI.contains(EnumC1347870lBB.PHOTO) && state.LLILZIL) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, viewGroup);
            }
            TuxIconView tuxIconView = this.LLJJ;
            TuxIconView tuxIconView2 = null;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            if (!setLLIIJI.contains(EnumC1347870lBB.STICKER) && !setLLIIJI.contains(EnumC1347870lBB.EMOJI)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView);
            TuxIconView tuxIconView3 = this.LLJJIJI;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            if (setLLIIJI.contains(EnumC1347870lBB.MENTION)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxIconView3);
            TuxIconView tuxIconView4 = this.LLJJJIL;
            if (tuxIconView4 != null) {
                if (setLLIIJI.contains(EnumC1347870lBB.AUDIO) && state.LLILZLL) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, tuxIconView4);
            }
            TuxIconView tuxIconView5 = this.LLJJI;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
            TuxIconView tuxIconView6 = this.LLJJIII;
            if (tuxIconView6 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
            }
            TuxIconView tuxIconView7 = this.LLJJIJIIJIL;
            if (tuxIconView7 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
            }
            TuxIconView tuxIconView8 = this.LLJJIJIL;
            if (tuxIconView8 != null) {
                tuxIconView2 = tuxIconView8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            TuxIconView tuxIconView9 = this.LLJJJJ;
            if (tuxIconView9 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView9, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final void rF2(EnumC1347870lBB enumC1347870lBB) {
        Aweme aweme;
        String strEnterFrom;
        String strEnterMethod;
        Aweme aweme2;
        String strEnterFrom2;
        String uid;
        String str;
        int i;
        String strFp = Fp(enumC1347870lBB);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = bp();
        String strEnterMethod2 = null;
        if (commentContextSourceBp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceBp);
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceBp2 = bp();
        if (commentContextSourceBp2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
        } else {
            strEnterFrom = null;
        }
        CommentContextSource commentContextSourceBp3 = bp();
        if (commentContextSourceBp3 != null) {
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
        } else {
            strEnterMethod = null;
        }
        String strMp = mp(enumC1347870lBB);
        String strSo = So();
        c1350920lG6.getClass();
        if (aweme != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_element", strFp);
            c2344009Gk.LJIIIIZZ("event_page", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            User author2 = aweme.getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
            if (C729510SjV.LJJ(aweme)) {
                str = "story";
            } else {
                str = "post";
            }
            c2344009Gk.LJIIIIZZ("story_type", str);
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null && statistics.getCommentCount() > 0) {
                i = 0;
            } else {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "is_zero_comment");
            c2344009Gk.LJIIIIZZ("is_greyed_out", strMp);
            c2344009Gk.LJIIIIZZ("input_box_status", strSo);
            C735840Sti.LIZIZ(aweme, c2344009Gk);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_plus_panel_function_show");
        }
        if (enumC1347870lBB == EnumC1347870lBB.POLL || enumC1347870lBB == EnumC1347870lBB.GROUP_CHAT) {
            CommentContextSource commentContextSourceBp4 = bp();
            if (commentContextSourceBp4 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceBp4);
            } else {
                aweme2 = null;
            }
            CommentContextSource commentContextSourceBp5 = bp();
            if (commentContextSourceBp5 != null) {
                strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceBp5);
            } else {
                strEnterFrom2 = null;
            }
            CommentContextSource commentContextSourceBp6 = bp();
            if (commentContextSourceBp6 != null) {
                strEnterMethod2 = CommentContextSourceKt.enterMethod(commentContextSourceBp6);
            }
            String strSo2 = So();
            c1350920lG6.getClass();
            C1350920lG6.LJJJJIZL(aweme2, strFp, strEnterFrom2, strEnterMethod2, strSo2, "plus_panel", null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0lBE, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    public final boolean Ep(AbstractC1347290lAF abstractC1347290lAF, boolean z) {
        final long j;
        final TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView == null) {
            return false;
        }
        ap(z);
        if (!Jo(false)) {
            return false;
        }
        this.LLLFZ = true;
        if (abstractC1347290lAF instanceof C1347110l9x) {
            j = 350;
        } else {
            j = 0;
        }
        this.LLLFFI = new ARunnableS22S0210000_21(this, z, tuxIconView, 1);
        if (tuxIconView.isLaidOut() && !tuxIconView.isLayoutRequested()) {
            if (j > 0) {
                HandlerHook.viewPostDelay(tuxIconView, this.LLLFFI, j);
            } else {
                ARunnableS22S0210000_21 aRunnableS22S0210000_21 = this.LLLFFI;
                if (aRunnableS22S0210000_21 != null) {
                    aRunnableS22S0210000_21.run();
                    return true;
                }
            }
            return true;
        }
        ?? r1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0lBE
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (tuxIconView.getViewTreeObserver().isAlive()) {
                    C786410Ut5.C3(tuxIconView.getViewTreeObserver(), this);
                }
                KeyboardIconGroupAssem keyboardIconGroupAssem = this;
                keyboardIconGroupAssem.LLLFF = null;
                if (j > 0) {
                    HandlerHook.viewPostDelay(tuxIconView, keyboardIconGroupAssem.LLLFFI, j);
                    return;
                }
                ARunnableS22S0210000_21 aRunnableS22S0210000_212 = keyboardIconGroupAssem.LLLFFI;
                if (aRunnableS22S0210000_212 != null) {
                    aRunnableS22S0210000_212.run();
                }
            }
        };
        this.LLLFF = r1;
        C786410Ut5.x3(tuxIconView.getViewTreeObserver(), r1);
        return true;
    }

    public final void Gp(boolean z, boolean z2) {
        TuxIconView tuxIconView = null;
        if (hp()) {
            TuxIconView tuxIconView2 = this.LLJJIJIL;
            if (tuxIconView2 != null) {
                tuxIconView = tuxIconView2;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            return;
        }
        if (!C1350950lG9.LIZIZ.LIZLLL()) {
            TuxIconView tuxIconView3 = this.LLJJIJIL;
            if (tuxIconView3 != null) {
                tuxIconView = tuxIconView3;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            return;
        }
        if (z) {
            TuxIconView tuxIconView4 = this.LLJJIJIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            if (z2) {
                TuxIconView tuxIconView5 = this.LLJJIJIL;
                if (tuxIconView5 == null) {
                    tuxIconView5 = null;
                }
                tuxIconView5.LIZ();
                TuxIconView tuxIconView6 = this.LLJJIJIL;
                if (tuxIconView6 != null) {
                    tuxIconView = tuxIconView6;
                }
                tuxIconView.setIconRes(R.raw.icon_color_gift);
                return;
            }
            TuxIconView tuxIconView7 = this.LLJJIJIL;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            tuxIconView7.setIconRes(R.raw.icon_gift);
            TuxIconView tuxIconView8 = this.LLJJIJIL;
            if (tuxIconView8 == null) {
                tuxIconView8 = null;
            }
            tuxIconView8.setTintColorRes(this.LLJJLIIIJLLLLLLLZ);
            TuxIconView tuxIconView9 = this.LLJJIJIL;
            if (tuxIconView9 != null) {
                tuxIconView = tuxIconView9;
            }
            C786410Ut5.x5(tuxIconView, 1.0f);
            return;
        }
        TuxIconView tuxIconView10 = this.LLJJIJIL;
        if (tuxIconView10 != null) {
            tuxIconView = tuxIconView10;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
    }

    public final void sp(String str, String str2) {
        Aweme aweme;
        String strEnterFrom;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = bp();
        String strEnterMethod = null;
        if (commentContextSourceBp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceBp);
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceBp2 = bp();
        if (commentContextSourceBp2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
        } else {
            strEnterFrom = null;
        }
        CommentContextSource commentContextSourceBp3 = bp();
        if (commentContextSourceBp3 != null) {
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
        }
        c1350920lG6.getClass();
        C1350920lG6.LJJJJ(aweme, "audio", strEnterFrom, strEnterMethod, "unfold", str, str2, null, null, null);
    }
}
