package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui;

import X.C019F;
import X.C01GW;
import X.C041J;
import X.C09JN;
import X.C0WZX;
import X.C1153890g8J;
import X.C11NJ;
import X.C11PQ;
import X.C1216270hkv;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1701940uOG;
import X.C1851007Mu;
import X.C1909950znl;
import X.C1910000znq;
import X.C1910010znr;
import X.C19333910kT;
import X.C19475811Ho;
import X.C196972124s;
import X.C19719612Di;
import X.C19719912Dl;
import X.C1A6V;
import X.C1EDI;
import X.C20600815jK;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C444940Hca;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1233230iCH;
import X.InterfaceC1233260iCK;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS162S0100000_28;
import Y.AfS197S0100000_28;
import Y.AsS54S0100000_28;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.api.ProfileEditPronounsParams;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.powerlist.PronounCell;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileEditPronounsSearchAndDisplayAssem extends UIContentAssem implements InterfaceC1233230iCH {
    public static final C1910000znq LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public View LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 623));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 622));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 621));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 620));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 618));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 619));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 617));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(423));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(424));
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C1153890g8J.class, null), checkSupervisorPrepared());
    public boolean LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0znq] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileEditPronounsSearchAndDisplayAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/editprofile/pronouns/viewmodel/ProfileEditPronounsSearchAndDisplayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new Object() { // from class: X.0znq
        };
        LLJJJJ = 8;
    }

    public ProfileEditPronounsSearchAndDisplayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileEditPronounsSearchAndDisplayViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 624), AFwS271S0000000_28.get$arr$(235), null, true);
    }

    private final void Fp() {
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0znm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C233600vG) obj).LL;
            }
        }, null, new AwS642S0100000_28(this, 56), 6);
    }

    @Override // X.InterfaceC1233230iCH, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final C11NJ Vo() {
        return (C11NJ) this.LLJJIII.getValue();
    }

    private final View ap() {
        return (View) this.LLJILJILJ.getValue();
    }

    private final TuxTextView bp() {
        return (TuxTextView) this.LLJILLL.getValue();
    }

    private final View cP() {
        return (View) this.LLJ.getValue();
    }

    private final ViewOnAttachStateChangeListenerC20604515jv cp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    private final TuxTextView ep() {
        return (TuxTextView) this.LLJI.getValue();
    }

    private final C1153890g8J hp() {
        return (C1153890g8J) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0znr] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public C1910010znr lt() {
        return new InterfaceC447510Hgj() { // from class: X.0znr
        };
    }

    public final C11PQ<String> So() {
        return (C11PQ) this.LLJJI.getValue();
    }

    public final TuxIconView Zo() {
        return (TuxIconView) this.LLJJ.getValue();
    }

    public final C196972124s dp() {
        return (C196972124s) this.LLJIJIL.getValue();
    }

    public final View kp() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.underline) : null;
            this.LLIZLLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final ProfileEditPronounsSearchAndDisplayViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (ProfileEditPronounsSearchAndDisplayViewModel) assemVMLazy.getValue();
    }

    private final void Ap() {
        Bp();
        Ep();
        Fp();
    }

    private final void Bp() {
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
        profileEditPronounsSearchAndDisplayViewModelLp.getClass();
        ProfileEditPronounsParams profileEditPronounsParams = (ProfileEditPronounsParams) C1851007Mu.LIZIZ.getValue();
        Integer num = profileEditPronounsParams.maxPronounsNum;
        profileEditPronounsSearchAndDisplayViewModelLp.LLILZIL = num != null ? num.intValue() : profileEditPronounsSearchAndDisplayViewModelLp.LLILZIL;
        List<String> list = profileEditPronounsParams.pronounsList;
        if (list == null) {
            list = profileEditPronounsSearchAndDisplayViewModelLp.LLILZ;
        }
        profileEditPronounsSearchAndDisplayViewModelLp.LLILZ = list;
    }

    private final void Ep() {
        String str;
        Context context = getContext();
        if (context != null) {
            ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
            C1153890g8J c1153890g8JHp = hp();
            if (c1153890g8JHp == null || (str = c1153890g8JHp.LLILLJJLI) == null) {
                str = "";
            }
            profileEditPronounsSearchAndDisplayViewModelLp.getClass();
            if (Intrinsics.LJFF(str, "")) {
                return;
            }
            profileEditPronounsSearchAndDisplayViewModelLp.xQ2(context, a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6));
        }
    }

    private final void Go() {
        dp().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0znn
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                }
                return true;
            }
        });
    }

    private final void Ho() {
        cp().addOnScrollListener(new AsS54S0100000_28(this, 1));
    }

    private final void Jo() {
        dp().addTextChangedListener(new C19333910kT(this, 0));
    }

    private final void QI2() {
        Go();
        Jo();
        dp().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0zno
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    KeyboardUtils.LIZLLL(view);
                } else {
                    KeyboardUtils.LIZIZ(view);
                }
            }
        });
    }

    private final void mp() {
        C11PQ<String> c11pqSo = So();
        c11pqSo.getClass();
        Vo().LIZ(new C19475811Ho(c11pqSo).LJIL(300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIFFI().LJJLL(new AfS197S0100000_28(this, 35), new C09JN() { // from class: X.0ym0
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ProfileEditPronounsSearchAndDisplayAssem@60cd.initBehaviorSubject$2");
                C1C7U.LIZIZ("ProfileEditPronounsSearchAndDisplayAssem@60cd.initBehaviorSubject$2");
            }
        }));
    }

    private final void op() {
        C786410Ut5.a9(Zo(), new ACListenerS162S0100000_28(this, 80));
    }

    private final void sp() {
        Context context = getContext();
        if (context != null) {
            bp().setMovementMethod(C431260Gvc.LIZ);
            String string = context.getString(2131835787);
            String string2 = context.getString(2131835788);
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) string);
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = string2;
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ(C1EDI.LJ() ? 52 : 42);
            c444940Hca.LJIIIIZZ = new AwS429S0200000_28(this, context, 63);
            spannableStringBuilderAppend.append((CharSequence) " ").append(c444940Hca.LIZ(context));
            bp().setText(spannableStringBuilderAppend);
        }
    }

    private final void tp() throws Throwable {
        up();
        QI2();
    }

    private final void up() throws Throwable {
        Integer numLIZJ;
        Integer numLIZJ2;
        C1A6V c1a6vLJIIJ;
        C196972124s c196972124sDp = dp();
        Editable editableT = C2204961BRm.T(c196972124sDp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZFglNuCYpyRBN+xr+GPj3dMJ03dHOYZ3mTJLGFaQJEImqpgxSM7+deBBxA==", null));
        if (editableT != null) {
            dp().setSelection(editableT.length());
        }
        c196972124sDp.setFocusable(true);
        c196972124sDp.setFocusableInTouchMode(true);
        c196972124sDp.requestFocus();
        if (C1EDI.LJ() && (c1a6vLJIIJ = q0.LJIIJ(c196972124sDp)) != null) {
            c1a6vLJIIJ.LIZLLL(8);
        }
        c196972124sDp.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0znp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        int iIntValue = 0;
        c196972124sDp.setLongClickable(false);
        c196972124sDp.setTextIsSelectable(false);
        c196972124sDp.setMovementMethod(new BaseMovementMethod() { // from class: X.0Gva
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
            public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                Integer numValueOf;
                if (textView != null && spannable != null) {
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                        int totalPaddingTop = y - textView.getTotalPaddingTop();
                        int scrollX = totalPaddingLeft + textView.getScrollX();
                        int scrollY = totalPaddingTop + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        if (layout == null) {
                            return super.onTouchEvent(textView, spannable, motionEvent);
                        }
                        int lineForVertical = layout.getLineForVertical(scrollY);
                        float f = scrollX;
                        int iU3 = C786410Ut5.U3(layout, lineForVertical, f);
                        if (layout.getPrimaryHorizontal(iU3) > f) {
                            iU3--;
                        }
                        if (layout.getLineRight(lineForVertical) <= f) {
                            return true;
                        }
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3 + 1, ClickableSpan.class);
                        boolean z = false;
                        if (clickableSpanArr.length == 0) {
                            Selection.removeSelection(spannable);
                        } else {
                            C511601z0 c511601z0 = clickableSpanArr[0];
                            if (c511601z0 instanceof InterfaceC431250Gvb) {
                                if (numValueOf.intValue() == 1) {
                                    ((InterfaceC431250Gvb) c511601z0).LIZJ(textView, spannable, iU3);
                                } else if (numValueOf.intValue() == 0) {
                                    ((InterfaceC431250Gvb) c511601z0).LJ(textView, spannable, iU3);
                                }
                                z = true;
                            }
                            if (numValueOf.intValue() == 1) {
                                c511601z0.onClick(textView);
                            }
                            if (z) {
                                textView.invalidate();
                            }
                            return true;
                        }
                    }
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
        });
        Context context = c196972124sDp.getContext();
        int iIntValue2 = (context == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, context)) == null) ? 0 : numLIZJ2.intValue();
        Context context2 = c196972124sDp.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        c196972124sDp.setTextColor(iIntValue);
        c196972124sDp.setHintTextColor(iIntValue2);
    }

    private final void yp() {
        Context context = getContext();
        if (context != null) {
            if (C1EDI.LJ()) {
                ep().setText(context.getString(2131838889));
            } else {
                ep().setText(C786410Ut5.j4(context.getString(2131845560), Arrays.copyOf(new Object[]{Integer.valueOf(lp().LLILZIL)}, 1)));
            }
        }
    }

    private final void zp() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCp = cp();
        viewOnAttachStateChangeListenerC20604515jvCp.LJIILJJIL(PronounCell.class);
        viewOnAttachStateChangeListenerC20604515jvCp.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jvCp.setItemAnimator(null);
        Ho();
    }

    public final boolean Gp() {
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
        C196972124s c196972124sDp = dp();
        if (profileEditPronounsSearchAndDisplayViewModelLp.LL.length() == profileEditPronounsSearchAndDisplayViewModelLp.LLILZIL && profileEditPronounsSearchAndDisplayViewModelLp.wQ2(c196972124sDp, profileEditPronounsSearchAndDisplayViewModelLp.LL.length())) {
            dp().setCursorVisible(false);
            L1(0);
            return true;
        }
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp2 = lp();
        if (!profileEditPronounsSearchAndDisplayViewModelLp2.wQ2(dp(), profileEditPronounsSearchAndDisplayViewModelLp2.LL.length() + 20)) {
            return false;
        }
        L1(1);
        return true;
    }

    @Override // X.InterfaceC1233230iCH
    public String I9() {
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
        return ((ArrayList) profileEditPronounsSearchAndDisplayViewModelLp.LLILLJJLI).isEmpty() ? "" : C13LP.LJJLIIIJ(profileEditPronounsSearchAndDisplayViewModelLp.LLILLJJLI, ",", null, null, 0, null, null, 62);
    }

    public final void Ip() {
        C786410Ut5.LJLLLLLL(8, ap());
        C786410Ut5.LLF(8, cp());
    }

    public final void Lo() {
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
        C1153890g8J c1153890g8JHp = hp();
        String str = c1153890g8JHp != null ? c1153890g8JHp.LLILLJJLI : null;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(profileEditPronounsSearchAndDisplayViewModelLp.LLILLJJLI, "/", null, null, 0, null, null, 62);
        if (str == null) {
            str = "";
        }
        this.LLJJIJIIJIL = !Intrinsics.LJFF(strLJJLIIIJ, str);
        Editable editableT = C2204961BRm.T(dp(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZFglNuCYpyRBN+xr+GPj3dMJ03dHOYZ3mTJLGFaQJEImqpgxSM7+deBBxA==", null));
        boolean z = ip(editableT != null ? editableT : "").length() > 0;
        if (!this.LLJJIJIIJIL || z) {
            ((InterfaceC1233260iCK) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1233260iCK.class), null)).LLIZLLLIL();
        } else {
            ((InterfaceC1233260iCK) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1233260iCK.class), null)).LLFII();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        Vo().dispose();
        super.onDestroy();
    }

    @Override // X.InterfaceC1233230iCH
    public boolean Vn() {
        return this.LLJJIJIIJIL;
    }

    private final void L1(int i) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                i2 = R.string.m25;
            } else {
                i2 = 2131837105;
            }
        } else {
            i2 = 2131845564;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
        c1389890mGx.LJIIIZ(i2);
        c1389890mGx.LJIIJJI();
    }

    public final void Jp(List<String> list) {
        cp().getState().LJFF(null);
        if (list.isEmpty()) {
            C786410Ut5.LJLLLLLL(0, ap());
            C786410Ut5.LLF(8, cp());
            return;
        }
        C786410Ut5.LLF(0, cp());
        C786410Ut5.LJLLLLLL(8, ap());
        C20600815jK<InterfaceC1891350zJl> state = cp().getState();
        lp().getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1909950znl(it2.next()));
        }
        state.LIZLLL(arrayList, null);
    }

    public final void Qp(View view) {
        this.LLIZLLLIL = view;
    }

    public final String ip(CharSequence charSequence) {
        return charSequence.subSequence(lp().LL.length(), charSequence.length()).toString();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) throws Throwable {
        Ap();
        yp();
        mp();
        tp();
        if (C1EDI.LJ()) {
            op();
        }
        zp();
        sp();
    }

    @Override // X.InterfaceC1233230iCH
    public void sj(int i) throws Throwable {
        int length;
        boolean z;
        ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModelLp = lp();
        C196972124s c196972124sDp = dp();
        View viewKp = kp();
        View viewCP = cP();
        if (i >= 0 && profileEditPronounsSearchAndDisplayViewModelLp.LLILZLL == null) {
            viewKp.getWindowVisibleDisplayFrame(new Rect());
            viewKp.getLocationInWindow(new int[]{0, 0});
            if (r1.bottom - r0[1] >= C1216270hkv.LIZ(78)) {
                z = true;
            } else {
                z = false;
            }
            profileEditPronounsSearchAndDisplayViewModelLp.LLILZLL = Boolean.valueOf(z);
        }
        Boolean bool = profileEditPronounsSearchAndDisplayViewModelLp.LLILZLL;
        if (bool != null) {
            bool.booleanValue();
            if (i > 0) {
                Editable editableLLJILLL = C2204961BRm.LLJILLL(c196972124sDp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZ1huEZE9mLdm0t02dv6hflrcf2zthm2FqEy8Tj0b5JLa7WYQQNBhShCdHBqL8WywTCNFkLEq", null));
                if (editableLLJILLL != null) {
                    length = editableLLJILLL.length();
                } else {
                    length = 0;
                }
                if (length != profileEditPronounsSearchAndDisplayViewModelLp.LL.length()) {
                    profileEditPronounsSearchAndDisplayViewModelLp.vQ2(viewCP, false);
                    if (c196972124sDp.getMaxLines() != 1) {
                        c196972124sDp.setMaxLines(1);
                        return;
                    }
                    return;
                }
            }
            profileEditPronounsSearchAndDisplayViewModelLp.vQ2(viewCP, true);
            if (i > 0 || c196972124sDp.getMaxLines() != 1) {
                return;
            }
            c196972124sDp.setMaxLines(profileEditPronounsSearchAndDisplayViewModelLp.LLIZ);
        }
    }

    public final void No(int i, int i2, int i3) {
        int i4 = i + 1;
        if (i4 == lp().LL.length() && i2 > i3 && i2 == 1) {
            lp().LL.delete(Math.max(0, i4 - i2), i4);
            ListProtector.remove(lp().LLILLJJLI, i);
            dp().setSelectionMinIndex(lp().LL.length());
            if (C1EDI.LJ()) {
                if (C041J.LIZ(lp().LL)) {
                    C786410Ut5.LLLLLLZZ(Zo(), 0);
                    return;
                } else {
                    C786410Ut5.LLLLLLZZ(Zo(), 8);
                    return;
                }
            }
            return;
        }
        int i5 = i + i3;
        if (i5 < lp().LL.length() && lp().LL.length() < lp().LLILZIL) {
            if (i3 > i2) {
                dp().setText(lp().LL);
                dp().setSelection(lp().LL.length());
                return;
            }
            int iMin = Math.min(lp().LL.length() - i5, i2);
            lp().LL.delete(i5, Math.min(lp().LL.length(), i + i2));
            while (true) {
                int i6 = iMin - 1;
                if (iMin <= 0) {
                    break;
                }
                C19719612Di.LJJIJ(lp().LLILLJJLI);
                iMin = i6;
            }
            dp().setSelectionMinIndex(lp().LL.length());
            if (C1EDI.LJ()) {
                if (C041J.LIZ(lp().LL)) {
                    C786410Ut5.LLLLLLZZ(Zo(), 0);
                } else {
                    C786410Ut5.LLLLLLZZ(Zo(), 8);
                }
            }
        }
    }
}
