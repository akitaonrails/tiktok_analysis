package com.ss.android.ugc.profile.business.ur.popup;

import X.C019F;
import X.C01GW;
import X.C0WZX;
import X.C11NJ;
import X.C11PQ;
import X.C1208860hYy;
import X.C1232410iAx;
import X.C1308910kAL;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C787200UuM;
import X.EnumC1254850il9;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC346410Di3;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SetUpNicknameAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C11PQ<Unit> LLJ;
    public final C11NJ LLJI;
    public final C1232410iAx LLJIJIL;
    public TextView LLJILJIL;
    public TuxNavBar LLJILJILJ;
    public EditText LLJILLL;
    public TuxIconView LLJJ;
    public TuxTextView LLJJI;
    public C1749280vcc LLJJIII;
    public ViewTreeObserverOnGlobalLayoutListenerC346410Di3 LLJJIJI;
    public final C1208860hYy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SetUpNicknameAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/popup/AvatarAndNicknamePopupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SetUpNicknameAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2416), AFwS256S0000000_18.get$arr$(816), null, true);
        this.LLJ = new C11PQ<>();
        this.LLJI = new C11NJ();
        this.LLJIJIL = new C1232410iAx(EnumC1254850il9.PROMPT.getValue());
        this.LLJJIJIIJIL = new C1208860hYy(this, 7);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2417));
    }

    public final String Go() {
        EditText editText = this.LLJILLL;
        return String.valueOf(editText != null ? C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjuIz1PdNdLyUpEXaVWj7W7FpHeLwBnFD", null)) : null);
    }

    public final AvatarAndNicknamePopupViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (AvatarAndNicknamePopupViewModel) assemVMLazy.getValue();
    }

    public final void Jo() throws Throwable {
        Integer numLIZJ;
        EditText editText = this.LLJILLL;
        if (editText != null) {
            ForegroundColorSpan foregroundColorSpan = null;
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjuIz1PdNdLyUpEXaVWj7W7FpHeLwBnFD", null));
            boolean z = false;
            if (editableLLJILLL.length() > 30) {
                int selectionEnd = Selection.getSelectionEnd(editableLLJILLL);
                editText.setText(editableLLJILLL.toString().substring(0, 30));
                Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjuIz1PdNdLyUpEXaVWj7W7FpHeLwBnFD", null));
                if (selectionEnd > editableLLJILLL2.length()) {
                    selectionEnd = editableLLJILLL2.length();
                }
                Selection.setSelection(editableLLJILLL2, selectionEnd);
                z = true;
                this.LLJ.onNext(Unit.LIZ);
            }
            int length = editText.length();
            int i = z ? R.attr.zs : R.attr.a1k;
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            }
            int iMin = Math.min(length, 30);
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZJ(C787200UuM.LIZ(iMin), foregroundColorSpan, 33);
            c1360520lVa.LJI("/");
            c1360520lVa.LIZ.append((CharSequence) C787200UuM.LIZ(30));
            C1360500lVY c1360500lVY = c1360520lVa.LIZ;
            TextView textView = this.LLJILJIL;
            if (textView != null) {
                textView.setText(c1360500lVY);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        this.LLJI.LJ();
        super.onDestroy();
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, null);
        }
        EditText editText = this.LLJILLL;
        if (editText != null) {
            editText.removeTextChangedListener(this.LLJJIJIIJIL);
        }
        EditText editText2 = this.LLJILLL;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(null);
        }
        EditText editText3 = this.LLJILLL;
        if (editText3 != null && (viewTreeObserver = editText3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3 = this.LLJJIJI;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC346410Di3);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC346410Di3, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        KeyboardUtils.LIZIZ(this.LLJILLL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.0gY4
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) throws Throwable {
                ViewTreeObserver viewTreeObserver;
                int i;
                SetUpNicknameAssem setUpNicknameAssem = this.LIZ;
                setUpNicknameAssem.LLJIJIL.LLJ = (C1169850gY3) setUpNicknameAssem.LLJJIJIL.getValue();
                SetUpNicknameAssem setUpNicknameAssem2 = this.LIZ;
                view2.findViewById(R.id.ew1);
                setUpNicknameAssem2.getClass();
                this.LIZ.LLJILLL = (EditText) view2.findViewById(R.id.hd7);
                this.LIZ.LLJJ = (TuxIconView) view2.findViewById(R.id.lbx);
                this.LIZ.LLJJI = (TuxTextView) view2.findViewById(R.id.gpy);
                this.LIZ.LLJILJILJ = (TuxNavBar) view2.findViewById(R.id.p15);
                this.LIZ.LLJJIII = (C1749280vcc) view2.findViewById(R.id.w28);
                this.LIZ.LLJILJIL = (TextView) view2.findViewById(R.id.gq_);
                SetUpNicknameAssem setUpNicknameAssem3 = this.LIZ;
                setUpNicknameAssem3.getClass();
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZIZ = "cancel";
                c1250300ido.LIZJ = C20642515q3.LJFF().getString(2131828464, Arrays.copyOf(new Object[0], 0));
                c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
                c1250300ido.LIZ(new AwS562S0100000_18(setUpNicknameAssem3, 2419));
                C1250300ido c1250300ido2 = new C1250300ido();
                c1250300ido2.LIZIZ = "save";
                c1250300ido2.LIZJ = C20642515q3.LJFF().getString(2131828463, Arrays.copyOf(new Object[0], 0));
                c1250300ido2.LIZ(new AwS562S0100000_18(setUpNicknameAssem3, 2418));
                TuxNavBar tuxNavBar = setUpNicknameAssem3.LLJILJILJ;
                if (tuxNavBar != null) {
                    C0OM1 c0om1 = new C0OM1();
                    c0om1.LJ(c1250300ido);
                    c0om1.LIZIZ(c1250300ido2);
                    c0om1.LIZLLL = false;
                    tuxNavBar.setNavActions(c0om1);
                }
                final EditText editText = setUpNicknameAssem3.LLJILLL;
                if (editText != null) {
                    editText.setText("");
                    editText.setHint(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname());
                    editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjuIz1PdNdLyUpEXaVWj7W7FpHeLwBnFD", null)).length());
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0gY6
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                            if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                                return true;
                            }
                            return false;
                        }
                    });
                    editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0gY5
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view3, boolean z) {
                            if (z) {
                                EditText editText2 = editText;
                                HandlerHook.viewPostDelay(editText2, new ARunnableS118S0100000_18(editText2, 55), 300L);
                            }
                        }
                    });
                    editText.addTextChangedListener(setUpNicknameAssem3.LLJJIJIIJIL);
                    editText.requestFocus();
                }
                TuxIconView tuxIconView = setUpNicknameAssem3.LLJJ;
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(setUpNicknameAssem3, 141));
                    if (setUpNicknameAssem3.Go().length() > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, i);
                }
                TextView textView = setUpNicknameAssem3.LLJILJIL;
                if (textView != null) {
                    C786410Ut5.LLIL(textView, 0);
                }
                setUpNicknameAssem3.Jo();
                setUpNicknameAssem3.LLJI.LIZ(setUpNicknameAssem3.LLJ.LJLIL(3000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(view2, 108), new C09JN() { // from class: X.00Pe
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SetUpNicknameAssem@d47.initTextLengthSubject$2");
                        C1C7U.LIZIZ("SetUpNicknameAssem@d47.initTextLengthSubject$2");
                    }
                }));
                TuxTextView tuxTextView = setUpNicknameAssem3.LLJJI;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    tuxTextView.setText(C20642515q3.LJFF().getString(2131828466, Arrays.copyOf(new Object[0], 0)));
                }
                TuxNavBar tuxNavBar2 = setUpNicknameAssem3.LLJILJILJ;
                if (tuxNavBar2 != null) {
                    tuxNavBar2.LJJ(AFwS256S0000000_18.get$arr$(823), "save");
                }
                if (C815020Vy8.LIZ()) {
                    SetUpNicknameAssem setUpNicknameAssem4 = this.LIZ;
                    setUpNicknameAssem4.LLJJIJI = new ViewTreeObserverOnGlobalLayoutListenerC346410Di3(view2, 1);
                    EditText editText2 = setUpNicknameAssem4.LLJILLL;
                    if (editText2 != null && (viewTreeObserver = editText2.getViewTreeObserver()) != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3 = this.LIZ.LLJJIJI;
                        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC346410Di3);
                        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC346410Di3, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                }
                C1169690gXn c1169690gXn = this.LIZ.Ho().LL;
                if (c1169690gXn != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c1169690gXn.LIZ(c2344009Gk);
                    C20684815ws.LJIILLIIL("show_update_nickname_sheet", c2344009Gk.LIZ);
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gXz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169650gXj) obj).LL;
            }
        }, null, new AwS632S0100000_18(view, 209), 6);
    }
}
