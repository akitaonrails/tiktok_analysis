package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C0P0T;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1341780l1M;
import X.C1341800l1O;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346550l93;
import X.C1346810l9T;
import X.C1346890l9b;
import X.C1347110l9x;
import X.C1347610lAl;
import X.C1348310lBt;
import X.C1348490lCB;
import X.C1348730lCZ;
import X.C1349180lDI;
import X.C1350920lG6;
import X.C1351800lHW;
import X.C1352710lIz;
import X.C1353500lKG;
import X.C1353700lKa;
import X.C1354660lM8;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C1402180mam;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19MB;
import X.C1A5L;
import X.C1C7U;
import X.C21647019ng;
import X.C2176211AEx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C2533609wM;
import X.C288920BUc;
import X.C295780Bia;
import X.C295880Bik;
import X.C299080Bnu;
import X.C306510Bzt;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C450720Hlu;
import X.C452501pT;
import X.C454010HrD;
import X.C454040HrG;
import X.C454060HrI;
import X.C459990I2b;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726240SeE;
import X.C729510SjV;
import X.C735840Sti;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C866950Xzh;
import X.EnumC1235690iGF;
import X.EnumC1341650l19;
import X.EnumC1346360l8k;
import X.EnumC454370Hrn;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS155S0100000_21;
import Y.ALAdapterS17S0100000_21;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS121S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.PhotoCacheModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class PortraitInputKeyboard extends BaseInputKeyboard implements IKeyboardProtocol, IKeyboarInputAbility, IImageEditAbility, IAudioEditAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLL;
    public View LLJZIJLIL;
    public C1349180lDI LLL;
    public View LLLF;
    public SmartImageView LLLFF;
    public ViewGroup LLLFFI;
    public FrameLayout LLLFZ;
    public TuxTextView LLLI;
    public C0P0T LLLII;
    public C0P0T LLLIIII;
    public C0P0T LLLIIIIL;
    public C1348310lBt LLLIIIL;
    public View LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public Pair<String, String> LLLLIILLL;
    public boolean LLLLIL;
    public Intent LLLLILI;
    public final PortraitInputKeyboard$handler$1 LLLLJ;
    public final C1402180mam LLLLJI;
    public final AssemVMLazy LLLLL;
    public final C01GW LLLLLIL;
    public Comment LLLLLILLIL;
    public final AtomicBoolean LLLLLJIL;
    public boolean LLLLLJLJLL;
    public final PortraitInputKeyboard LLJZ = this;
    public boolean LLLILZLLLI = true;
    public boolean LLLIZZ = true;
    public boolean LLLJ = true;
    public boolean LLLJIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PortraitInputKeyboard.class, "commentMenuVM", "getCommentMenuVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentActionMenuVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard$handler$1] */
    public PortraitInputKeyboard() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LLLLJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                C1C7U.LIZ("PortraitInputKeyboard@283f.handler$1");
                super.handleMessage(message);
                int i = message.arg1;
                if (i == 1) {
                    this.LL.iq(true);
                } else if (i == 2) {
                    this.LL.iq(false);
                }
                C1C7U.LIZIZ("PortraitInputKeyboard@283f.handler$1");
            }
        };
        this.LLLLJI = new C1402180mam(this, 0);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentActionMenuVM.class);
        this.LLLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 387), AFwS259S0000000_21.get$arr$(76), null, true);
        this.LLLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 158));
        this.LLLLLJIL = new AtomicBoolean(false);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3i;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void N2() throws Throwable {
        iq(false);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -516586903) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void C52() {
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.clearFocus();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IAudioEditAbility
    public final void CY() {
        C1348310lBt c1348310lBt = this.LLLIIIL;
        if (c1348310lBt == null || !c1348310lBt.getAudioPlayer().LJIIJ(c1348310lBt.LLJ)) {
            return;
        }
        C1351800lHW.LIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void N4() {
        removeMessages(100);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.arg1 = 1;
        jq();
        C786410Ut5.LJLJLJ(this.LLLLJ, messageObtain, 30L);
    }

    public final View Tp() {
        View view = this.LLJZIJLIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Zf0() {
        C1353500lKG c1353500lKG;
        List<CommentImageModel> list;
        Integer numLIZJ;
        C1353500lKG c1353500lKG2;
        List<CommentImageModel> list2;
        C1353500lKG c1353500lKG3;
        IKeyboardV2Ability iKeyboardV2AbilityOp;
        TuxIconView tuxIconView;
        View view;
        View view2;
        Drawable drawable;
        if (isLandscapeMode()) {
            return;
        }
        C1353500lKG c1353500lKG4 = this.LLJJIJI;
        if (c1353500lKG4 != null) {
            c1353500lKG4.setVerticalScrollBarEnabled(true);
            c1353500lKG4.setScrollBarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            Context context = c1353500lKG4.getContext();
            if (context != null && (drawable = context.getDrawable(R.drawable.a13)) != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    c1353500lKG4.setVerticalScrollbarThumbDrawable(drawable);
                } else {
                    try {
                        Field declaredField = View.class.getDeclaredField("mScrollCache");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(c1353500lKG4);
                        if (obj != null) {
                            Field declaredField2 = obj.getClass().getDeclaredField("scrollBar");
                            declaredField2.setAccessible(true);
                            Object obj2 = declaredField2.get(obj);
                            if (obj2 != null) {
                                Method declaredMethod = obj2.getClass().getDeclaredMethod("setVerticalThumbDrawable", Drawable.class);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(obj2, drawable);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1344030l4z.LIZ("PortraitInputKeyboard", e.toString());
                    }
                }
            }
            if (c1353500lKG4.getLineCount() >= Vp() && this.LLLIILIL == null) {
                if (C1347610lAl.LIZJ()) {
                    this.LLLIILIL = C726240SeE.LIZIZ(getContentView(), null, R.id.eat, R.id.vs_comment_expand_button_inbox);
                } else {
                    this.LLLIILIL = C726240SeE.LIZIZ(getContentView(), null, R.id.eas, R.id.vs_comment_expand_button_below_avatar);
                }
                C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.LLLIILIL, EnumC1341650l19.ALPHA_BUTTON, 0.0f, null, 12);
                C2271391DvN.LIZ(this.LLLIILIL, (C1A5L) C2271381DvM.T.getValue());
                if (C2176211AEx.LIZIZ()) {
                    if (!isLandscapeMode() && (view2 = this.LLLIILIL) != null) {
                        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 278), view2);
                    }
                } else if (!isLandscapeMode() && (view = this.LLLIILIL) != null) {
                    C786410Ut5.I7(new ACListenerS155S0100000_21(this, 277), view);
                }
            }
            if (this.LLLIILIL != null) {
                IKeyboardV2Ability iKeyboardV2AbilityOp2 = op();
                if (iKeyboardV2AbilityOp2 == null || iKeyboardV2AbilityOp2.Bc2() || c1353500lKG4.getLineCount() < Vp()) {
                    View view3 = this.LLLIILIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                } else {
                    if (C1347610lAl.LIZJ()) {
                        View view4 = this.LLLIILIL;
                        if ((view4 instanceof TuxIconView) && (tuxIconView = (TuxIconView) view4) != null) {
                            tuxIconView.setTintColorRes(R.attr.a1k);
                        }
                    }
                    View view5 = this.LLLIILIL;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(0, view5);
                    }
                    wq(true);
                }
            }
        }
        if (C1347610lAl.LIZJ() && !isLandscapeMode() && (c1353500lKG3 = this.LLJJIJI) != null && this.LLLIILIL != null && (iKeyboardV2AbilityOp = op()) != null && !iKeyboardV2AbilityOp.Bc2() && c1353500lKG3.getLineCount() >= Vp()) {
            C19MB c19mb = new C19MB();
            View viewTp = Tp();
            c19mb.LJII(viewTp instanceof ConstraintLayout ? (ConstraintLayout) viewTp : null);
            View view6 = this.LLLIILIL;
            if (view6 != null) {
                int id = view6.getId();
                C1353500lKG c1353500lKG5 = this.LLJJIJI;
                if (c1353500lKG5 != null) {
                    int id2 = c1353500lKG5.getId();
                    c19mb.LJI(id2, 7);
                    c19mb.LJIIIZ(id2, 7, id, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
            }
            if (!this.LLLLIL) {
                View viewTp2 = Tp();
                c19mb.LIZIZ(viewTp2 instanceof ConstraintLayout ? (ConstraintLayout) viewTp2 : null);
            }
            this.LLLLIL = true;
        }
        if (C1347610lAl.LIZJ() && !isLandscapeMode()) {
            C19MB c19mb2 = new C19MB();
            View viewTp3 = Tp();
            c19mb2.LJII(viewTp3 instanceof ConstraintLayout ? (ConstraintLayout) viewTp3 : null);
            qq(c19mb2);
            View viewTp4 = Tp();
            c19mb2.LIZIZ(viewTp4 instanceof ConstraintLayout ? (ConstraintLayout) viewTp4 : null);
        }
        if (!C1347610lAl.LIZIZ() || isLandscapeMode()) {
            return;
        }
        int iLIZIZ = C1353700lKa.LIZIZ();
        CommentInputContent commentInputContent = sp().getState().LLJI.LIZ;
        Editable editableXp = Xp();
        int length = editableXp != null ? editableXp.length() : 0;
        if (length < iLIZIZ - ((int) C1347610lAl.LIZ().charCountBeforeHint)) {
            TuxTextView tuxTextView = this.LLLI;
            if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
                return;
            }
            if (mI() && (c1353500lKG = this.LLJJIJI) != null) {
                ViewGroup.LayoutParams layoutParams = c1353500lKG.getLayoutParams();
                layoutParams.height = (layoutParams.height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - ((commentInputContent == null || (((list = commentInputContent.imageList) == null || list.isEmpty()) && (commentInputContent == null || commentInputContent.stickerStruct == null))) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C786410Ut5.h7(c1353500lKG, layoutParams);
            }
            TuxTextView tuxTextView2 = this.LLLI;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLLI;
        if (tuxTextView3 != null) {
            tuxTextView3.toString();
        }
        TuxTextView tuxTextView4 = this.LLLI;
        if (tuxTextView4 != null && tuxTextView4.getVisibility() == 8) {
            TuxTextView tuxTextView5 = this.LLLI;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
            if (mI() && (c1353500lKG2 = this.LLJJIJI) != null) {
                ViewGroup.LayoutParams layoutParams2 = c1353500lKG2.getLayoutParams();
                layoutParams2.height = (layoutParams2.height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) + ((commentInputContent == null || (((list2 = commentInputContent.imageList) == null || list2.isEmpty()) && (commentInputContent == null || commentInputContent.stickerStruct == null))) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C786410Ut5.h7(c1353500lKG2, layoutParams2);
            }
        }
        TuxTextView tuxTextView6 = this.LLLI;
        if (tuxTextView6 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(length);
            sbLIZ.append('/');
            sbLIZ.append(iLIZIZ);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            if (length > iLIZIZ && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1m, tuxTextView6.getContext())) != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, String.valueOf(length).length(), 33);
            }
            tuxTextView6.setText(spannableString);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IAudioEditAbility
    public final void dF() {
        C1348310lBt c1348310lBt = this.LLLIIIL;
        if (c1348310lBt != null) {
            c1348310lBt.getAudioPlayer().LJIIIIZZ(c1348310lBt.LLJ, null);
            AnonymousClass0956 anonymousClass0956 = c1348310lBt.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void fE1() {
        Animator animatorVj2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            int measuredHeight = c1353500lKG.getMeasuredHeight();
            int width = this.LLLILZ;
            if (width == 0) {
                width = c1353500lKG.getWidth();
            }
            c1353500lKG.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = c1353500lKG.getMeasuredHeight();
            arrayList.add(C1348490lCB.LJI(measuredHeight, measuredHeight2, c1353500lKG));
            isLandscapeMode();
            if (!C1347610lAl.LJ()) {
                View view = this.LLJJJJJIL;
                if (view != null) {
                    arrayList.add(C1348490lCB.LIZJ(12, 58, view));
                }
                if (sp().RQ2()) {
                    ImageView imageView = this.LLJL;
                    if (imageView != null) {
                        arrayList.add(C1348490lCB.LJ(imageView));
                    }
                } else {
                    C427870Gq9 c427870Gq9 = this.LLJJIII;
                    if (c427870Gq9 != null) {
                        arrayList.add(C1348490lCB.LJ(c427870Gq9));
                    }
                }
            } else if (sp().RQ2()) {
                View view2 = this.LLJJJJJIL;
                if (view2 != null) {
                    arrayList.add(C1348490lCB.LIZJ(12, 58, view2));
                }
                ImageView imageView2 = this.LLJL;
                if (imageView2 != null) {
                    arrayList.add(C1348490lCB.LJ(imageView2));
                }
            }
            View view3 = this.LLLIILIL;
            if (view3 != null) {
                if (measuredHeight2 >= this.LLLILZJ) {
                    arrayList.add(C1348490lCB.LJ(view3));
                } else {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }
            IKeyboardV2Ability iKeyboardV2AbilityOp = op();
            if (iKeyboardV2AbilityOp != null && (animatorVj2 = iKeyboardV2AbilityOp.Vj2()) != null) {
                arrayList.add(animatorVj2);
            }
        }
        animatorSet.addListener(new ALAdapterS17S0100000_21(new ARunnableS121S0100000_21(this, 38), 0));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        lq();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IAudioEditAbility
    public final void ho1() {
        C1348310lBt c1348310lBt = this.LLLIIIL;
        if (c1348310lBt != null) {
            c1348310lBt.getAudioPlayer().LJI(c1348310lBt.LLJ, "show_replace_dialog");
        }
    }

    public final void jq() {
        String string;
        C1353500lKG c1353500lKG = this.LLJJIJI;
        boolean zRequestFocus = true;
        if (c1353500lKG != null) {
            c1353500lKG.setFocusableInTouchMode(true);
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            c1353500lKG2.setFocusable(true);
        }
        C1353500lKG c1353500lKG3 = this.LLJJIJI;
        if (c1353500lKG3 == null || (zRequestFocus = c1353500lKG3.requestFocus())) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder("input request edit focus failed, visible=");
            C1353500lKG c1353500lKG4 = this.LLJJIJI;
            sb.append(c1353500lKG4 != null ? Integer.valueOf(c1353500lKG4.getVisibility()) : null);
            sb.append(", enable=");
            C1353500lKG c1353500lKG5 = this.LLJJIJI;
            sb.append(c1353500lKG5 != null ? Boolean.valueOf(c1353500lKG5.isEnabled()) : null);
            sb.append(", focusable=");
            C1353500lKG c1353500lKG6 = this.LLJJIJI;
            sb.append(c1353500lKG6 != null ? Boolean.valueOf(c1353500lKG6.isFocusable()) : null);
            sb.append(", focusableInTouch=");
            C1353500lKG c1353500lKG7 = this.LLJJIJI;
            sb.append(c1353500lKG7 != null ? Boolean.valueOf(c1353500lKG7.isFocusableInTouchMode()) : null);
            string = sb.toString();
        }
        C1344030l4z.LIZJ("PortraitInputKeyboard", "BaseKeyboardPanel: reqFocusRes=" + zRequestFocus + "  msg===> " + string);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void wm2() {
        C21647019ng c21647019ngLZ0;
        ArrayList arrayList = new ArrayList();
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 39);
            int measuredHeight = c1353500lKG.getMeasuredHeight();
            int width = this.LLLILZ;
            if (width == 0) {
                width = c1353500lKG.getWidth();
            }
            c1353500lKG.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = c1353500lKG.getMeasuredHeight();
            arrayList.add(C1348490lCB.LJII(c1353500lKG, measuredHeight, measuredHeight2, aRunnableS121S0100000_21));
            isLandscapeMode();
            if (!C1347610lAl.LJ()) {
                View view = this.LLJJJJJIL;
                if (view != null) {
                    arrayList.add(C1348490lCB.LIZLLL(12, 58, view));
                }
                if (sp().RQ2()) {
                    ImageView imageView = this.LLJL;
                    if (imageView != null) {
                        arrayList.add(C1348490lCB.LJFF(imageView, 1.0f));
                    }
                } else {
                    C427870Gq9 c427870Gq9 = this.LLJJIII;
                    if (c427870Gq9 != null) {
                        arrayList.add(C1348490lCB.LJFF(c427870Gq9, 1.0f));
                    }
                }
            } else if (sp().RQ2()) {
                View view2 = this.LLJJJJJIL;
                if (view2 != null) {
                    arrayList.add(C1348490lCB.LIZLLL(12, 58, view2));
                }
                ImageView imageView2 = this.LLJL;
                if (imageView2 != null) {
                    arrayList.add(C1348490lCB.LJFF(imageView2, 1.0f));
                }
            }
            View view3 = this.LLLIILIL;
            if (view3 != null) {
                if (measuredHeight2 >= this.LLLILZJ) {
                    isLandscapeMode();
                    if (C1347610lAl.LJ()) {
                        arrayList.add(C1348490lCB.LJFF(view3, 0.34f));
                    } else {
                        arrayList.add(C1348490lCB.LJFF(view3, 1.0f));
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }
            IKeyboardV2Ability iKeyboardV2AbilityOp = op();
            if (iKeyboardV2AbilityOp != null && (c21647019ngLZ0 = iKeyboardV2AbilityOp.LZ0()) != null) {
                arrayList.add(c21647019ngLZ0);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C21647019ng) it2.next()).LJI(true);
        }
        lq();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zq() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.zq():void");
    }

    public static int Vp() {
        return C1347610lAl.LIZJ() ? C1347610lAl.LIZ().inputLineNeedExpand : C288920BUc.LIZ();
    }

    public static boolean dq() {
        if (C299080Bnu.LIZ()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService == null) {
                return false;
            }
            C844470XAv.LIZ.getClass();
            if (!creativeToolsPluginService.LIZJ(C844470XAv.LIZ(), "CommentImageEdit", false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean Aq() {
        Aweme aweme;
        CommentContextSource commentContextSourceKp;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceKp2;
        CommentCommonModel commonModel2;
        CommentContextSource commentContextSourceKp3;
        CommentCommonModel commonModel3;
        PhotoCacheModel photoCacheModel;
        CommentCommonModel commonModel4;
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp4)) == null || !C1354660lM8.LIZIZ(aweme) || (commentContextSourceKp = kp()) == null || (commonModel = commentContextSourceKp.getCommonModel()) == null || !commonModel.createAIPhotoFromInnerPage || (commentContextSourceKp2 = kp()) == null || (commonModel2 = commentContextSourceKp2.getCommonModel()) == null || commonModel2.innerCreateAIPhotoCache == null || (commentContextSourceKp3 = kp()) == null || (commonModel3 = commentContextSourceKp3.getCommonModel()) == null || (photoCacheModel = commonModel3.innerCreateAIPhotoCache) == null) {
            return false;
        }
        this.LLLLILI = photoCacheModel.intent;
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.XW0(photoCacheModel.resultCode, null, photoCacheModel.data);
        }
        CommentContextSource commentContextSourceKp5 = kp();
        if (commentContextSourceKp5 != null && (commonModel4 = commentContextSourceKp5.getCommonModel()) != null) {
            commonModel4.setInnerCreateAIPhotoCache(null);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IImageEditAbility
    public final String BG() {
        Aweme aweme;
        CommentContextSource commentContextSourceKp = kp();
        String aid = (commentContextSourceKp == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) == null) ? null : aweme.getAid();
        Pair<String, String> pair = this.LLLLIILLL;
        if (!TextUtils.equals(aid, pair != null ? pair.getFirst() : null)) {
            this.LLLLIILLL = null;
            return null;
        }
        Pair<String, String> pair2 = this.LLLLIILLL;
        if (pair2 != null) {
            return pair2.getSecond();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Ii1() {
        withState(sp(), new AwS600S0100000_21(this, 60));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qp() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.Qp():void");
    }

    public final Aweme Up() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp == null || (commonModel = commentContextSourceKp.getCommonModel()) == null) {
            return null;
        }
        return commonModel.aweme;
    }

    public final int Wp() {
        Aweme aweme;
        if (C1347610lAl.LIZIZ() && !isLandscapeMode()) {
            return (int) C1347610lAl.LIZ().maxInputLimit;
        }
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceKp)) != null) {
            AwemeExtKt.getAuthorUid(aweme);
        }
        return C1353700lKa.LIZIZ();
    }

    public final Editable Xp() {
        KeyboardVMV2 keyboardVMV2Sp = sp();
        CommentInputContent commentInputContent = sp().getState().LLJI.LIZ;
        return keyboardVMV2Sp.FQ2(commentInputContent != null ? commentInputContent.text : null);
    }

    public final boolean aq() {
        int iLIZIZ = C1353700lKa.LIZIZ();
        Editable editableXp = Xp();
        return (editableXp != null ? editableXp.length() : 0) >= iLIZIZ - ((int) C1347610lAl.LIZ().charCountBeforeHint);
    }

    public final void kq() {
        CommentKeyboardModel keyboardModel;
        CharSequence initEditTextContent;
        List<CommentImageModel> list;
        CommentStickerStruct commentStickerStruct;
        List<AudioCommentModel> list2;
        int iWp = Wp();
        C1349180lDI c1349180lDI = this.LLL;
        if (c1349180lDI != null) {
            c1349180lDI.LL = iWp;
        }
        KeyboardVMV2 keyboardVMV2Sp = sp();
        keyboardVMV2Sp.getClass();
        keyboardVMV2Sp.withState(new AwS600S0100000_21(keyboardVMV2Sp, 411));
        Editable editable = null;
        Bp(null, false);
        tp().LLILLJJLI = C1558520qew.LJIIL(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            tp().LLILLL = fragmentLJI;
        }
        KeyboardVMV2 keyboardVMV2Sp2 = sp();
        CommentContextSource commentContextSourceKp = kp();
        CommentInputContent commentInputContentZQ2 = keyboardVMV2Sp2.zQ2(commentContextSourceKp != null ? CommentContextSourceKt.aweme(commentContextSourceKp) : null, getInputServiceType());
        if (getInputServiceType() != EnumC1346360l8k.INBOX_QUICK_COMMENT) {
            if (commentInputContentZQ2 != null) {
                editable = commentInputContentZQ2.text;
                list = commentInputContentZQ2.imageList;
                commentStickerStruct = commentInputContentZQ2.stickerStruct;
                list2 = commentInputContentZQ2.audioList;
            } else {
                list = null;
                commentStickerStruct = null;
                list2 = null;
            }
            IN1(editable, list, commentStickerStruct, list2);
        } else {
            CommentContextSource commentContextSourceKp2 = kp();
            if (commentContextSourceKp2 == null || (keyboardModel = commentContextSourceKp2.getKeyboardModel()) == null || (initEditTextContent = keyboardModel.getInitEditTextContent()) == null) {
                C1353500lKG c1353500lKG = this.LLJJIJI;
                if (c1353500lKG != null) {
                    c1353500lKG.setText("");
                }
            } else {
                C1353500lKG c1353500lKG2 = this.LLJJIJI;
                if (c1353500lKG2 != null) {
                    c1353500lKG2.setText(initEditTextContent);
                }
            }
        }
        KeyboardVMV2 keyboardVMV2Sp3 = sp();
        CommentContextSource commentContextSourceKp3 = kp();
        Aweme aweme = commentContextSourceKp3 != null ? CommentContextSourceKt.aweme(commentContextSourceKp3) : null;
        keyboardVMV2Sp3.getClass();
        keyboardVMV2Sp3.setState(new AwS34S0010000_21(!C1348730lCZ.LJJIZ(aweme), 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lq() {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.lq():void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final boolean mI() {
        IKeyboardV2Ability iKeyboardV2AbilityOp = op();
        if (iKeyboardV2AbilityOp != null) {
            return iKeyboardV2AbilityOp.Bc2();
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI(this.LLLLJI);
        C1348310lBt c1348310lBt = this.LLLIIIL;
        if (c1348310lBt != null) {
            c1348310lBt.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputKeyboard, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        tp().LLILLJJLI = C1558520qew.LJIIL(this);
        if (C306510Bzt.LIZ()) {
            C1558520qew.LIZLLL(this);
        } else {
            C1558520qew.LJII(C1558520qew.LJIIL(this), this, IKeyboarInputAbility.class, null, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, IImageEditAbility.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLLLLJLJLL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            tp().LLILLL = fragmentLJI;
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAudioEditAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1348310lBt c1348310lBt = this.LLLIIIL;
        if (c1348310lBt != null) {
            c1348310lBt.getAudioPlayer().LJI(c1348310lBt.LLJ, "on_page_paused");
        }
    }

    public final void pq() {
        View view;
        KeyboardVMV2 keyboardVMV2Sp = sp();
        keyboardVMV2Sp.getClass();
        keyboardVMV2Sp.setState(new AwS34S0010000_21(true, 23));
        C19MB c19mb = new C19MB();
        View viewTp = Tp();
        c19mb.LJII(viewTp instanceof ConstraintLayout ? (ConstraintLayout) viewTp : null);
        if (isLandscapeMode()) {
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if (c1353500lKG != null) {
                int id = c1353500lKG.getId();
                View view2 = this.LLJJJJJIL;
                if (view2 != null) {
                    int id2 = view2.getId();
                    c19mb.LJI(id, 7);
                    c19mb.LJIIIZ(id, 7, id2, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                    this.LLLLIL = false;
                }
            }
        } else if (C1347610lAl.LIZIZ()) {
            qq(c19mb);
        } else {
            C1353500lKG c1353500lKG2 = this.LLJJIJI;
            if (c1353500lKG2 != null) {
                c19mb.LJI(c1353500lKG2.getId(), 4);
                ViewGroup viewGroup = this.LLLFFI;
                if (viewGroup != null) {
                    c19mb.LJIIIZ(c1353500lKG2.getId(), 4, viewGroup.getId(), 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
                }
            }
        }
        View viewTp2 = Tp();
        c19mb.LIZIZ(viewTp2 instanceof ConstraintLayout ? (ConstraintLayout) viewTp2 : null);
        if (isLandscapeMode() && (view = this.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        wq(false);
        vq(true);
        C1353500lKG c1353500lKG3 = this.LLJJIJI;
        if (c1353500lKG3 != null) {
            c1353500lKG3.clearFocus();
        }
        C1353500lKG c1353500lKG4 = this.LLJJIJI;
        if (c1353500lKG4 != null) {
            c1353500lKG4.requestFocus();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void w92() {
        sp().LLJI = true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void wW0() {
        sp().LLJI = false;
        sp().SQ2(C1347110l9x.LIZ, false);
    }

    public final boolean xq() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceKp;
        CommentCommonModel commonModel2;
        CommentContextSource commentContextSourceKp2;
        CommentCommonModel commonModel3;
        PhotoCacheModel photoCacheModel;
        CommentCommonModel commonModel4;
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 == null || (commonModel = commentContextSourceKp3.getCommonModel()) == null || !commonModel.choosePhotoFromInnerPage || (commentContextSourceKp = kp()) == null || (commonModel2 = commentContextSourceKp.getCommonModel()) == null || commonModel2.innerChoosePhotoCache == null || (commentContextSourceKp2 = kp()) == null || (commonModel3 = commentContextSourceKp2.getCommonModel()) == null || (photoCacheModel = commonModel3.innerChoosePhotoCache) == null) {
            return false;
        }
        this.LLLLILI = photoCacheModel.intent;
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.XW0(photoCacheModel.resultCode, null, photoCacheModel.data);
        }
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (commonModel4 = commentContextSourceKp4.getCommonModel()) != null) {
            commonModel4.setInnerChoosePhotoCache(null);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboarInputAbility
    public final void yj() {
        CommentPublishViewModel commentPublishViewModelTp = tp();
        KeyboardVMV2 keyboardVMV2Sp = sp();
        EnumC1346360l8k inputServiceType = getInputServiceType();
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        commentPublishViewModelTp.Yb0(keyboardVMV2Sp.DQ2(inputServiceType, null), null, null);
        this.LLLLIILLL = null;
    }

    public final void yq() {
        if (isLandscapeMode()) {
            this.LLLLIL = false;
        } else {
            lp().LIZLLL(C418440Gaw.LIZIZ(22));
        }
        lp().LJFF();
        lp().LJ();
        lp().LIZIZ(this.LLLLIL);
        C1346810l9T c1346810l9TLp = lp();
        boolean z = C866950Xzh.LIZIZ(sp().CQ2()) || sp().GQ2() != null || C866950Xzh.LIZIZ(sp().xQ2());
        if (c1346810l9TLp.LJI && z) {
            c1346810l9TLp.LJII.setMinLines(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility
    public final C1353500lKG Zy1() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLLLLJLJLL;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        kq();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Cj(C454040HrG c454040HrG) throws Throwable {
        tq(new AwS600S0100000_21(this, c454040HrG, 59));
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

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void HE(TuxIconView tuxIconView) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (this.LLLII == null) {
                C450720Hlu c450720Hlu = new C450720Hlu(c19egLIZ);
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = tuxIconView;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                c450720Hlu.LJIIJ(2131829220);
                this.LLLII = c450720Hlu.LIZIZ();
            }
            C0P0T c0p0t = this.LLLII;
            if (c0p0t != null) {
                c0p0t.show();
            }
            Keva.getRepo("reply_with_video_bubble").storeBoolean(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), true);
            withState(sp(), AFwS259S0000000_21.get$arr$(451));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void Hp(String str) {
        int iWp = Wp();
        C459990I2b c459990I2b = this.LLJLLIL;
        if (c459990I2b != null) {
            c459990I2b.LIZ(str, Up(), iWp, kp());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void OY0(List<AudioCommentModel> list) {
        Integer numValueOf;
        Aweme aweme;
        Integer numValueOf2;
        String str;
        String str2;
        Aweme aweme2;
        String strEnterFrom;
        String strEnterMethod;
        Aweme aweme3;
        String strEnterFrom2;
        String uid;
        String str3;
        int i;
        int iLJIIIIZZ;
        LifecycleCoroutineScope lifecycleScope;
        String str4;
        Aweme aweme4;
        Aweme aweme5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudio modelList: ");
        String strEnterMethod2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        IAudioEditAbility iAudioEditAbilityLIZ = C1346550l93.LIZ(C1558520qew.LJIIL(this));
        if (iAudioEditAbilityLIZ != null) {
            iAudioEditAbilityLIZ.CY();
        }
        List<CommentImageModel> listCQ2 = sp().CQ2();
        CommentStickerStruct commentStickerStructGQ2 = sp().GQ2();
        List<AudioCommentModel> listXQ2 = sp().xQ2();
        if (C2533609wM.LIZ() && list != null && !list.isEmpty()) {
            if (C866950Xzh.LIZIZ(listCQ2)) {
                KeyboardVMV2 keyboardVMV2Sp = sp();
                CommentContextSource commentContextSourceKp = kp();
                if (commentContextSourceKp != null) {
                    aweme5 = CommentContextSourceKt.aweme(commentContextSourceKp);
                } else {
                    aweme5 = null;
                }
                keyboardVMV2Sp.UQ2(aweme5, null, getInputServiceType());
                this.LLLL = true;
                SmartImageView smartImageView = this.LLLFF;
                if (smartImageView != null) {
                    smartImageView.setImageDrawable(null);
                }
            } else if (commentStickerStructGQ2 != null) {
                KeyboardVMV2 keyboardVMV2Sp2 = sp();
                CommentContextSource commentContextSourceKp2 = kp();
                if (commentContextSourceKp2 != null) {
                    aweme4 = CommentContextSourceKt.aweme(commentContextSourceKp2);
                } else {
                    aweme4 = null;
                }
                keyboardVMV2Sp2.VQ2(aweme4, null, getInputServiceType());
                sp().LLJILLL = null;
                this.LLLLIIIILLL = true;
                SmartImageView smartImageView2 = this.LLLFF;
                if (smartImageView2 != null) {
                    smartImageView2.setImageDrawable(null);
                }
            }
        }
        KeyboardVMV2 keyboardVMV2Sp3 = sp();
        CommentContextSource commentContextSourceKp3 = kp();
        if (commentContextSourceKp3 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp3);
        } else {
            aweme = null;
        }
        EnumC1346360l8k inputServiceType = getInputServiceType();
        keyboardVMV2Sp3.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCommentInputContentAudio ");
        CommentContextSource commentContextSourceBQ2 = keyboardVMV2Sp3.BQ2();
        if (commentContextSourceBQ2 != null) {
            numValueOf2 = Integer.valueOf(commentContextSourceBQ2.hashCode());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (aweme == null) {
            CommentContextSource commentContextSourceBQ22 = keyboardVMV2Sp3.BQ2();
            if (commentContextSourceBQ22 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceBQ22);
            } else {
                aweme = null;
            }
        }
        keyboardVMV2Sp3.withState(new AwS117S0400000_21(aweme, (Aweme) keyboardVMV2Sp3, (KeyboardVMV2) inputServiceType, (EnumC1346360l8k) list, (List<CommentImageModel>) 16));
        if (list != null && !list.isEmpty()) {
            if (!Intrinsics.LJFF(listXQ2, list) && listXQ2 != null) {
                C1352710lIz c1352710lIz = C1352710lIz.LIZ;
                AudioCommentModel audioCommentModel = (AudioCommentModel) C13LP.LJJJLZIJ(0, listXQ2);
                if (audioCommentModel != null) {
                    str4 = audioCommentModel.audioFilePath;
                } else {
                    str4 = null;
                }
                c1352710lIz.getClass();
                C1352710lIz.LIZJ(str4);
            }
            AudioCommentModel audioCommentModel2 = (AudioCommentModel) C13LP.LJJJLL(list);
            if (audioCommentModel2 != null) {
                Comment comment = this.LLLLLILLIL;
                if (comment != null) {
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    User user = comment.getUser();
                    c735840Sti.getClass();
                    iLJIIIIZZ = C735840Sti.LJIIIIZZ(user);
                } else {
                    iLJIIIIZZ = 0;
                }
                int width = Tp().getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126));
                C1348310lBt c1348310lBt = this.LLLIIIL;
                if (c1348310lBt != null) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLJI);
                    } else {
                        lifecycleScope = null;
                    }
                    C1348310lBt.LJII(c1348310lBt, audioCommentModel2, lifecycleScope, kp(), "preview", null, null, iLJIIIIZZ, width, null, 304);
                }
                this.LLLLIILL = true;
                this.LLLJL = false;
                this.LLLLII = false;
            }
            if (C866950Xzh.LIZIZ(listCQ2)) {
                str = "photo";
            } else if (commentStickerStructGQ2 != null) {
                str = "sticker";
            } else if (C866950Xzh.LIZIZ(listXQ2)) {
                str = "audio";
            } else {
                str = null;
            }
            if (str != null) {
                str2 = "replace";
            } else {
                str2 = "add";
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp4 = kp();
            if (commentContextSourceKp4 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp4);
            } else {
                aweme2 = null;
            }
            CommentContextSource commentContextSourceKp5 = kp();
            if (commentContextSourceKp5 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceKp5);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceKp6 = kp();
            if (commentContextSourceKp6 != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceKp6);
            } else {
                strEnterMethod = null;
            }
            c1350920lG6.getClass();
            if (aweme2 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("event_element", "audio");
                c2344009Gk.LJIIIIZZ("event_page", strEnterFrom);
                c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
                c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
                c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                User author = aweme2.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                c2344009Gk.LJIIIIZZ("author_id", uid);
                C735840Sti c735840Sti2 = C735840Sti.LIZ;
                User author2 = aweme2.getAuthor();
                c735840Sti2.getClass();
                c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
                if (C729510SjV.LJJ(aweme2)) {
                    str3 = "story";
                } else {
                    str3 = "post";
                }
                c2344009Gk.LJIIIIZZ("story_type", str3);
                AwemeStatistics statistics = aweme2.getStatistics();
                if (statistics != null && statistics.getCommentCount() > 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                c2344009Gk.LIZJ(i, "is_zero_comment");
                c2344009Gk.LJIIIIZZ("action_type", str2);
                c2344009Gk.LJIIIIZZ("former_element", str);
                C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_multi_genre_content_add");
            }
            if (C866950Xzh.LIZIZ(listXQ2)) {
                CommentContextSource commentContextSourceKp7 = kp();
                if (commentContextSourceKp7 != null) {
                    aweme3 = CommentContextSourceKt.aweme(commentContextSourceKp7);
                } else {
                    aweme3 = null;
                }
                CommentContextSource commentContextSourceKp8 = kp();
                if (commentContextSourceKp8 != null) {
                    strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceKp8);
                } else {
                    strEnterFrom2 = null;
                }
                CommentContextSource commentContextSourceKp9 = kp();
                if (commentContextSourceKp9 != null) {
                    strEnterMethod2 = CommentContextSourceKt.enterMethod(commentContextSourceKp9);
                }
                C1350920lG6.LJJJIL(aweme3, strEnterFrom2, strEnterMethod2, "replace", "audio");
            }
        } else {
            C1348310lBt c1348310lBt2 = this.LLLIIIL;
            if (c1348310lBt2 != null) {
                c1348310lBt2.getAudioPlayer().LJIIIIZZ(c1348310lBt2.LLJ, null);
                AnonymousClass0956 anonymousClass0956 = c1348310lBt2.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
            C1348310lBt c1348310lBt3 = this.LLLIIIL;
            if (c1348310lBt3 != null) {
                c1348310lBt3.LJ();
            }
            this.LLLLIIL = true;
            if (listXQ2 != null && (!listXQ2.isEmpty())) {
                C1352710lIz c1352710lIz2 = C1352710lIz.LIZ;
                AudioCommentModel audioCommentModel3 = (AudioCommentModel) C13LP.LJJJLZIJ(0, listXQ2);
                if (audioCommentModel3 != null) {
                    strEnterMethod2 = audioCommentModel3.audioFilePath;
                }
                c1352710lIz2.getClass();
                C1352710lIz.LIZJ(strEnterMethod2);
            }
        }
        if (!this.LLLLIILL && !sp().getState().LLJL) {
            TuxIconView tuxIconView = this.LLJJJ;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LLJJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setClickable(true);
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.34f);
        }
        TuxIconView tuxIconView4 = this.LLJJJ;
        if (tuxIconView4 == null) {
            return;
        }
        tuxIconView4.setClickable(false);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).unbindAbility(this.LLJZ, IKeyboarInputAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void g7(C454060HrI c454060HrI) throws Throwable {
        tq(new AwS387S0200000_21(this, c454060HrI, 13));
    }

    public final void iq(boolean z) throws Throwable {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" openSoftInput show soft input ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("PortraitInputKeyboard", C2188811AlT.LIZIZ(sbLIZ));
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            if (z) {
                jq();
                IKeyboardV2Ability iKeyboardV2AbilityOp = op();
                if (iKeyboardV2AbilityOp != null && iKeyboardV2AbilityOp.Bc2()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Ip(false, true, z2);
                yq();
                C1353500lKG c1353500lKG2 = this.LLJJIJI;
                if (c1353500lKG2 != null) {
                    HandlerHook.viewPost(c1353500lKG2, new ARunnableS112S0100000_12(this, 152));
                }
                KeyboardUtils.LIZLLL(c1353500lKG);
                return;
            }
            KeyboardUtils.LIZIZ(c1353500lKG);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void lc(C454010HrD c454010HrD) throws Throwable {
        tq(new AwS387S0200000_21(this, c454010HrD, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0148 A[PHI: r2 r6
      0x0148: PHI (r2v8 int) = (r2v7 int), (r2v7 int), (r2v18 int), (r2v18 int) binds: [B:38:0x00ac, B:40:0x00b0, B:64:0x013e, B:66:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r6v1 boolean) = (r6v0 boolean), (r6v0 boolean), (r6v4 boolean), (r6v4 boolean) binds: [B:38:0x00ac, B:40:0x00b0, B:64:0x013e, B:66:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m62(int r8) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.m62(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a6  */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).bindAbility(this.LLJZ, IKeyboarInputAbility.class);
    }

    public final void qq(C19MB c19mb) {
        List<AudioCommentModel> list;
        Editable editable;
        CommentInputContent commentInputContent = sp().getState().LLJI.LIZ;
        if (commentInputContent != null && (editable = commentInputContent.text) != null) {
            editable.toString();
        }
        List<CommentImageModel> list2 = null;
        if (commentInputContent != null) {
            list2 = commentInputContent.imageList;
        }
        boolean z = false;
        if ((list2 != null && !list2.isEmpty()) || (commentInputContent != null && (commentInputContent.stickerStruct != null || (commentInputContent != null && (list = commentInputContent.audioList) != null && !list.isEmpty())))) {
            z = true;
        }
        if (z) {
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if (c1353500lKG != null) {
                int id = c1353500lKG.getId();
                ViewGroup viewGroup = this.LLLFFI;
                if (viewGroup != null) {
                    int id2 = viewGroup.getId();
                    c19mb.LJI(id, 4);
                    c19mb.LJIIIZ(id, 4, id2, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
                    return;
                }
                return;
            }
            return;
        }
        if (aq()) {
            C1353500lKG c1353500lKG2 = this.LLJJIJI;
            if (c1353500lKG2 == null) {
                return;
            }
            int id3 = c1353500lKG2.getId();
            TuxTextView tuxTextView = this.LLLI;
            if (tuxTextView == null) {
                return;
            }
            int id4 = tuxTextView.getId();
            c19mb.LJI(id3, 4);
            c19mb.LJIIIZ(id3, 4, id4, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            return;
        }
        C1353500lKG c1353500lKG3 = this.LLJJIJI;
        if (c1353500lKG3 == null) {
            return;
        }
        int id5 = c1353500lKG3.getId();
        TuxTextView tuxTextView2 = this.LLLI;
        if (tuxTextView2 == null) {
            return;
        }
        int id6 = tuxTextView2.getId();
        c19mb.LJI(id5, 4);
        c19mb.LJIIIZ(id5, 4, id6, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
    }

    public final void tq(Function1<? super Boolean, Unit> function1) throws Throwable {
        C1346890l9b c1346890l9b = C1346890l9b.LIZ;
        CommentInputContent commentInputContent = sp().getState().LLJI.LIZ;
        c1346890l9b.getClass();
        if (C1346890l9b.LIZ(3, commentInputContent)) {
            IAudioEditAbility iAudioEditAbilityLIZ = C1346550l93.LIZ(C1558520qew.LJIIL(this));
            if (iAudioEditAbilityLIZ != null) {
                iAudioEditAbilityLIZ.ho1();
            }
            C1353500lKG c1353500lKG = this.LLJJIJI;
            if (c1353500lKG != null) {
                c1353500lKG.clearFocus();
            }
            iq(false);
            C1346890l9b.LIZIZ(3, LJJIJL(), sp().getState().LLJI.LIZ, new AwS565S0100000_21(this, 156), new AwS422S0200000_21(this, (PortraitInputKeyboard) function1, (Function1<? super Boolean, Unit>) 8), new AwS565S0100000_21(this, 157), new AwS635S0100000_21(this, 36));
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public final void vq(boolean z) {
        Aweme aweme = null;
        if (z) {
            if (this.LLLJ) {
                this.LLLJ = false;
                CommentContextSource commentContextSourceKp = kp();
                if (commentContextSourceKp != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
                }
                C1350920lG6.LJIILL(aweme, CommentContextSourceKt.enterFrom(kp()), true);
                return;
            }
            return;
        }
        if (!this.LLLJIL) {
            return;
        }
        this.LLLJIL = false;
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp2);
        }
        C1350920lG6.LJIILL(aweme, CommentContextSourceKt.enterFrom(kp()), false);
    }

    public final void wq(boolean z) {
        Aweme aweme = null;
        if (z) {
            if (this.LLLILZLLLI) {
                this.LLLILZLLLI = false;
                CommentContextSource commentContextSourceKp = kp();
                if (commentContextSourceKp != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
                }
                C1350920lG6.LJIILLIIL(aweme, CommentContextSourceKt.enterFrom(kp()), true);
                return;
            }
            return;
        }
        if (!this.LLLIZZ) {
            return;
        }
        this.LLLIZZ = false;
        CommentContextSource commentContextSourceKp2 = kp();
        if (commentContextSourceKp2 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp2);
        }
        C1350920lG6.LJIILLIIL(aweme, CommentContextSourceKt.enterFrom(kp()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xk0(java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r20) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.xk0(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void yd(KeyEvent keyEvent) {
        C459990I2b c459990I2b = this.LLJLLIL;
        if (c459990I2b != null) {
            c459990I2b.LIZIZ(keyEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Om0(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r27, java.lang.String r28, java.lang.Integer r29) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.Om0(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct, java.lang.String, java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:15:0x001b, B:17:0x0021, B:19:0x0027, B:20:0x002b, B:22:0x0036, B:28:0x0047, B:27:0x0043, B:13:0x0017, B:11:0x0011), top: B:35:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fq(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 102(0x66, float:1.43E-43)
            if (r6 == r0) goto Lc
            r0 = 103(0x67, float:1.44E-43)
            if (r6 != r0) goto Lb
            r4.Qp()
        Lb:
            return
        Lc:
            r2 = 0
            if (r7 == 0) goto L1a
            java.lang.String r0 = "image_path"
            java.lang.String r3 = r7.getStringExtra(r0)     // Catch: java.lang.Exception -> L16
            goto L1b
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L4b
        L1a:
            r3 = r2
        L1b:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.kp()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.getAid()     // Catch: java.lang.Exception -> L4b
        L2b:
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L4b
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L4b
            r4.LLLLIILLL = r0     // Catch: java.lang.Exception -> L4b
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LLLFF     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L4f
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4b
            if (r0 != 0) goto L43
            goto L41
        L3f:
            r1 = r2
            goto L2b
        L41:
            r0 = r2
            goto L47
        L43:
            android.net.Uri r0 = X.C2471909mP.LJIILIIL(r0)     // Catch: java.lang.Exception -> L4b
        L47:
            r1.setImageURI(r0)     // Catch: java.lang.Exception -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r4)
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment r0 = X.C1345760l7m.LJIIJ(r0, r1)
            if (r0 == 0) goto Lb
            r0.XW0(r6, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard.fq(int, int, android.content.Intent):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility
    public final void IN1(CharSequence charSequence, List<CommentImageModel> list, CommentStickerStruct commentStickerStruct, List<AudioCommentModel> list2) {
        Editable editable;
        KeyboardVMV2 keyboardVMV2Sp = sp();
        if (charSequence instanceof Editable) {
            editable = (Editable) charSequence;
        } else {
            editable = null;
        }
        Editable editableFQ2 = keyboardVMV2Sp.FQ2(editable);
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.setText(editableFQ2);
        }
        if (list != null && !list.isEmpty()) {
            xk0(list);
            return;
        }
        if (commentStickerStruct != null) {
            Om0(commentStickerStruct, EnumC454370Hrn.USE.getValue(), null);
            return;
        }
        if (list2 != null && !list2.isEmpty()) {
            OY0(list2);
            return;
        }
        xk0(null);
        Om0(null, null, null);
        OY0(null);
    }
}
