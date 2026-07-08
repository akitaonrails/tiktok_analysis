package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0QSJ;
import X.C0TLW;
import X.C1220000hqw;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1346570l95;
import X.C1388190mED;
import X.C13LE;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1347670lAr;
import X.InterfaceC1146704e9;
import X.InterfaceC1352000lHq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import Y.ARunnableS121S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S0201000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class CommonCommentKeyboard extends UISlotAssem implements IRefactorKeyboardFragment, ICommentPageReusedProtocol, ICommentPageVisibilityProtocol, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public KeyboardFakePopupWindow LLJJIII;
    public View LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public EnumC1347670lAr LLJJIJIL;
    public ObjectAnimator LLJJJ;
    public boolean LLJJJIL;
    public final C736950SvV LLJJJJ;
    public List<CommentImageModel> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public ICommentMentionAssemAbility LLJJL;
    public IKeyboarInputAbility LLJJLIIIJLLLLLLLZ;
    public IKeyboardV2Ability LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommonCommentKeyboard.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3g;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            this.LLJJL = (ICommentMentionAssemAbility) obj;
        } else if (cls == IKeyboarInputAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = (IKeyboarInputAbility) obj;
        } else if (cls == IKeyboardV2Ability.class) {
            this.LLJL = (IKeyboardV2Ability) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentKeyboardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            return this.LLJJL;
        }
        if (cls == IKeyboarInputAbility.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == IKeyboardV2Ability.class) {
            return this.LLJL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            this.LLJJL = null;
        } else if (cls == IKeyboarInputAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == IKeyboardV2Ability.class) {
            this.LLJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public CommonCommentKeyboard() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 34));
        this.LLJJIJIL = EnumC1347670lAr.UN_INIT;
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(71), new AwS563S0100000_19((AbstractC738140SxQ) this, 586), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    public final void E7() {
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 136);
        if (this.LLILZ) {
            awS565S0100000_21.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        if (this.LLILZ) {
            KeyboardVMV2 keyboardVMV2Ip = ip();
            keyboardVMV2Ip.getClass();
            keyboardVMV2Ip.withState(new AwS600S0100000_21(keyboardVMV2Ip, 416));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    public final void hn() {
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 137);
        if (this.LLILZ) {
            awS565S0100000_21.invoke();
        }
    }

    public final CommentContextSource hp() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return c726120Se2.LIZ(this);
    }

    public final KeyboardVMV2 ip() {
        return (KeyboardVMV2) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), IRefactorKeyboardFragment.class, null);
        KeyboardFakePopupWindow keyboardFakePopupWindow = this.LLJJIII;
        if (keyboardFakePopupWindow != null) {
            keyboardFakePopupWindow.release();
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        ip().LL = C1558520qew.LJIIL(this);
        ip().LLILLJJLI = new WeakReference<>(C724240Sb0.LJI(this));
        CommentContextSource commentContextSourceHp = hp();
        if (commentContextSourceHp != null) {
            C1554960qZC.LIZ(C1558520qew.LJIIL(this), commentContextSourceHp, CommentContextSource.class, "source_default_key");
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C1554960qZC.LIZ(C1558360qeg.LJFF(fragmentLJI, null), commentContextSourceHp, CommentContextSource.class, "source_default_key");
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, IRefactorKeyboardFragment.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLJJJJLIIL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
        ((CommentSyncSharedVM) this.LLJJJJ.getValue()).LL = hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (this.LLILZ) {
            ISingleCommentKeyboardAbility iSingleCommentKeyboardAbility = this instanceof ISingleCommentKeyboardAbility ? (ISingleCommentKeyboardAbility) this : null;
            if (iSingleCommentKeyboardAbility == null || !iSingleCommentKeyboardAbility.fH0()) {
                KeyboardVMV2 keyboardVMV2Ip = ip();
                keyboardVMV2Ip.getClass();
                keyboardVMV2Ip.withState(new C1346570l95(keyboardVMV2Ip, true, true));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ISingleCommentKeyboardAbility iSingleCommentKeyboardAbility;
        super.onResume();
        if (this.LLILZ) {
            if ((this instanceof ISingleCommentKeyboardAbility) && (iSingleCommentKeyboardAbility = (ISingleCommentKeyboardAbility) this) != null && iSingleCommentKeyboardAbility.fH0()) {
                return;
            }
            HandlerHook.viewPost(LJJIJL(), new ARunnableS121S0100000_21(this, 33));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJJJLIIL;
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

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        Aweme aweme2;
        KeyboardVMV2 keyboardVMV2Ip = ip();
        CommentContextSource commentContextSourceHp = hp();
        if (commentContextSourceHp != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSourceHp);
        } else {
            aweme2 = null;
        }
        keyboardVMV2Ip.XQ2(aweme2);
    }

    public void kp(final boolean z) {
        float f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("innerSwitchBackground ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("CommonCommentKeyboard", C2188811AlT.LIZIZ(sbLIZ));
        final View view = this.LLJJIJI;
        if (view != null) {
            view.setClickable(false);
            ObjectAnimator objectAnimator = this.LLJJJ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            final float f2 = 0.0f;
            if (z) {
                f = 0.0f;
                f2 = 1.0f;
            } else {
                f = 1.0f;
            }
            if (view.getAlpha() == f2) {
                this.LLJJJIL = false;
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0lAo
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL.LLJJJIL = false;
                    C786410Ut5.T4(view, 1.0f);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LL.LLJJJIL = false;
                    C786410Ut5.T4(view, f2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.LLJJJIL = true;
                    view.setClickable(z);
                }
            });
            this.LLJJJ = objectAnimatorOfFloat;
            ObjectAnimator objectAnimator2 = this.LLJJJ;
            if (objectAnimator2 == null) {
                return;
            }
            C786410Ut5.Pd(objectAnimator2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = view.findViewById(R.id.pvy);
        this.LLJJIJIL = EnumC1347670lAr.ON_START;
        C723850SaN.LIZLLL(this, new AwS387S0200000_21(this, view, 9));
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0lAt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                }
            }, view2);
        }
        View view3 = this.LLJJIJI;
        if (view3 != null) {
            view3.setOnTouchListener(new ATListenerS454S0100000_21(this, 7));
        }
        view.setOnKeyListener(new View.OnKeyListener() { // from class: X.0lAp
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view4, int i, KeyEvent keyEvent) {
                C013C c013c = new C013C();
                CommonCommentKeyboard commonCommentKeyboard = this.LL;
                commonCommentKeyboard.withState(commonCommentKeyboard.ip(), new AwS104S0201000_21(i, this.LL, c013c, 1));
                return c013c.element;
            }
        });
        KeyboardFakePopupWindow keyboardFakePopupWindow = null;
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lAs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 26), 6);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        Aweme aweme = null;
        if (c19egLIZIZ != null) {
            keyboardFakePopupWindow = new KeyboardFakePopupWindow(c19egLIZIZ, view);
        }
        this.LLJJIII = keyboardFakePopupWindow;
        if (keyboardFakePopupWindow != null) {
            keyboardFakePopupWindow.LLJ = new InterfaceC1352000lHq() { // from class: X.0lAq
                @Override // X.InterfaceC1352000lHq
                public final void LLILII() {
                    KeyboardVMV2 keyboardVMV2Ip = this.LL.ip();
                    C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
                    keyboardVMV2Ip.dR2(0, false);
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLLLZI(int i) {
                    CommentKeyboardModel keyboardModel;
                    C1353500lKG c1353500lKGZy1;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("keyboardFakePopupWindow show keyboard height->");
                    sbLIZ.append(i);
                    sbLIZ.append(' ');
                    sbLIZ.append(this.LL.LLJJIJIL);
                    C1344030l4z.LIZJ("CommonCommentKeyboard", C2188811AlT.LIZIZ(sbLIZ));
                    CommonCommentKeyboard commonCommentKeyboard = this.LL;
                    if (commonCommentKeyboard.LLJJIJIL == EnumC1347670lAr.ON_PAUSE) {
                        return;
                    }
                    CommentSyncSharedVM commentSyncSharedVM = (CommentSyncSharedVM) commonCommentKeyboard.LLJJJJ.getValue();
                    int iHashCode = this.LL.hashCode();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("isCurrentKeyboard  showCommentListKeyboard:");
                    sbLIZ2.append(commentSyncSharedVM.LL);
                    sbLIZ2.append("  current:");
                    sbLIZ2.append(iHashCode);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    int i2 = commentSyncSharedVM.LL;
                    if (i2 >= 0 && i2 != iHashCode) {
                        return;
                    }
                    IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this.LL));
                    Boolean boolValueOf = null;
                    if (iKeyboardEditAbilityLIZIZ != null && (c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1()) != null && !c1353500lKGZy1.hasFocus()) {
                        return;
                    }
                    CommentContextSource commentContextSourceHp = this.LL.hp();
                    if (commentContextSourceHp != null && (keyboardModel = commentContextSourceHp.getKeyboardModel()) != null) {
                        boolValueOf = Boolean.valueOf(keyboardModel.isLandscapeMode());
                    }
                    if (C1346420l8q.LIZJ(boolValueOf)) {
                        if (i != C1349270lDR.LJI) {
                            C1349270lDR.LJI = i;
                            if (i > 100) {
                                C1349270lDR.LIZIZ().storeInt("keyboard_height_landscape", i);
                            }
                        }
                    } else if (i != C1349270lDR.LJFF) {
                        C1349270lDR.LJFF = i;
                        if (i > 100) {
                            C1349270lDR.LIZIZ().storeInt("keyboard_height_portrait", i);
                        }
                    }
                    this.LL.ip().dR2(i, true);
                }

                @Override // X.InterfaceC1352000lHq
                public final void j(int i) {
                    if (C1345700l7g.LJIIIIZZ(this.LL.hp())) {
                        if (i != C1349270lDR.LJI) {
                            C1349270lDR.LJI = i;
                            if (i > 100) {
                                C1349270lDR.LIZIZ().storeInt("keyboard_height_landscape", i);
                            }
                        }
                    } else if (i != C1349270lDR.LJFF) {
                        C1349270lDR.LJFF = i;
                        if (i > 100) {
                            C1349270lDR.LIZIZ().storeInt("keyboard_height_portrait", i);
                        }
                    }
                    KeyboardVMV2 keyboardVMV2Ip = this.LL.ip();
                    keyboardVMV2Ip.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateKeyboardHeight ");
                    sbLIZ.append(i);
                    C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
                    keyboardVMV2Ip.setState(new AwS34S0001000_21(i, 19));
                }
            };
            keyboardFakePopupWindow.show();
        }
        KeyboardVMV2 keyboardVMV2Ip = ip();
        CommentContextSource commentContextSourceHp = hp();
        if (commentContextSourceHp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceHp);
        }
        keyboardVMV2Ip.XQ2(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    public final void uE(float f, int i) {
        C0TLW c0tlw = new C0TLW(this, i, f);
        if (this.LLILZ) {
            c0tlw.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel>] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XW0(int r16, android.content.Intent r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard.XW0(int, android.content.Intent, java.util.List):void");
    }
}
