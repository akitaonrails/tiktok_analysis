package com.ss.android.ugc.profile.business.ur.ui;

import X.C019F;
import X.C01GW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1355350lNF;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1EDI;
import X.C20612915lH;
import X.C21405618pq;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2246341Cw4;
import X.C2246351Cw5;
import X.C2246401CwA;
import X.C2246531CwN;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C787200UuM;
import X.InterfaceC1356670lPN;
import X.InterfaceC20613315lL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2246541CwO;
import X.InterfaceC2246551CwP;
import Y.ACListenerS168S0100000_34;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS683S0100000_34;
import kotlin.jvm.internal.AwS84S1000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class ProfileEditBioAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public View LLJI;
    public TextView LLJIJIL;
    public TuxNavBar LLJILJIL;
    public C1355350lNF LLJILJILJ;
    public C197039127h LLJILLL;
    public boolean LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public final C2246531CwN LLJJIJI;
    public boolean LLJJIJIIJIL;
    public InterfaceC1356670lPN LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public final C21405618pq LLJJJIL;
    public boolean LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileEditBioAssem.class, "profileEditBioVM", "getProfileEditBioVM()Lcom/ss/android/ugc/profile/business/ur/ui/ProfileEditBioViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileEditBioAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileEditBioViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2442), AFwS281S0000000_34.get$arr$(33), null, true);
        this.LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(524));
        this.LLJJIJI = new C2246531CwN();
        this.LLJJJIL = new C21405618pq();
    }

    public final ProfileEditBioViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (ProfileEditBioViewModel) assemVMLazy.getValue();
    }

    public final void Lo() {
        this.LLJJJIL.LIZ();
        InterfaceC1356670lPN interfaceC1356670lPN = this.LLJJIJIL;
        if (interfaceC1356670lPN != null) {
            interfaceC1356670lPN.Hi(8, false);
        }
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        if (c197039127h.getTranslationY() != 0.0f) {
            C197039127h c197039127h2 = this.LLJILLL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            C786410Ut5.ud(c197039127h2, 0.0f);
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null) {
                C786410Ut5.wd(tuxTextView, 0.0f);
            }
            TuxTextView tuxTextView2 = this.LLJJI;
            if (tuxTextView2 != null) {
                C786410Ut5.wd(tuxTextView2, 0.0f);
            }
            TuxNavBar tuxNavBar = this.LLJILJIL;
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            tuxNavBar.setTranslationZ(0.0f);
        }
        C197039127h c197039127h3 = this.LLJILLL;
        C786410Ut5.LLLLLLJ(c197039127h3 != null ? c197039127h3 : null, 0);
    }

    public final boolean No() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        C21405618pq c21405618pq = this.LLJJJIL;
        c21405618pq.LIZ();
        c21405618pq.LIZ = null;
        C2246401CwA c2246401CwA = this.LLJJIJI.LIZ;
        if (c2246401CwA != null) {
            View view = c2246401CwA.LIZ;
            if (view != null && c2246401CwA.LIZLLL != null) {
                C786410Ut5.C3(view.getViewTreeObserver(), c2246401CwA.LIZLLL);
            }
            c2246401CwA.LIZJ = null;
        }
    }

    public final void Go(int i) {
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        ((ViewGroup.MarginLayoutParams) c197039127h.getLayoutParams()).bottomMargin = i;
        c197039127h.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.1CwM] */
    /* JADX WARN: Type inference failed for: r1v28, types: [X.1Cw3] */
    /* JADX WARN: Type inference failed for: r2v17, types: [X.1Cw7] */
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
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = view;
        this.LLJIJIL = (TextView) view.findViewById(R.id.zjm);
        this.LLJILJIL = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJILJILJ = (C1355350lNF) view.findViewById(R.id.hd7);
        this.LLJILLL = (C197039127h) view.findViewById(R.id.o6z);
        this.LLJJJ = (ConstraintLayout) view.findViewById(R.id.gsj);
        if (C1EDI.LJ()) {
            this.LLJJI = (TuxTextView) view.findViewById(R.id.zp4);
            this.LLJJIII = (TuxTextView) view.findViewById(R.id.zjj);
        }
        View view2 = this.LLJI;
        C1355350lNF c1355350lNF = null;
        if (view2 == null) {
            view2 = null;
        }
        view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.1CwC
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View viewFindViewById;
                View viewFindViewById2;
                if (!this.LL.LLJJ) {
                    View view4 = null;
                    if (C1EDI.LJ()) {
                        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.goe)) != null) {
                            View view5 = this.LL.LLJI;
                            if (view5 == null) {
                                view5 = null;
                            }
                            C1744700vVE.LJIIIZ(view5.getHeight(), viewFindViewById2);
                        }
                    } else if (view3 != null && (viewFindViewById = view3.findViewById(R.id.god)) != null) {
                        View view6 = this.LL.LLJI;
                        if (view6 == null) {
                            view6 = null;
                        }
                        C1744700vVE.LJIIIZ(view6.getHeight(), viewFindViewById);
                    }
                    this.LL.LLJJ = true;
                    if (view3 != null) {
                        view3.setScrollContainer(true);
                    }
                    View view7 = this.LL.LLJI;
                    if (view7 != null) {
                        view4 = view7;
                    }
                    view4.removeOnLayoutChangeListener(this);
                }
            }
        });
        if (No()) {
            C197039127h c197039127h = this.LLJILLL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            c197039127h.LJJJJL(new AwS585S0100000_6(this, 253));
            C197039127h c197039127h2 = this.LLJILLL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            C786410Ut5.U8(c197039127h2, new ACListenerS168S0100000_34(this, 28));
            C2246531CwN c2246531CwN = this.LLJJIJI;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            final ?? r2 = new InterfaceC2246551CwP() { // from class: X.1Cw7
                public final C01GW LIZ;

                @Override // X.InterfaceC2246551CwP
                public final void LIZ() {
                    C197039127h c197039127h3 = this.LIZIZ.LLJILLL;
                    if (c197039127h3 == null) {
                        c197039127h3 = null;
                    }
                    C786410Ut5.LLLLLLJ(c197039127h3, 8);
                    InterfaceC1356670lPN interfaceC1356670lPN = this.LIZIZ.LLJJIJIL;
                    if (interfaceC1356670lPN != null) {
                        interfaceC1356670lPN.Hi(8, false);
                    }
                }

                {
                    this.LIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this.LIZIZ, 98));
                }

                @Override // X.InterfaceC2246551CwP
                public final void LIZJ(int i) {
                    ((View) this.LIZ.getValue()).getPaddingBottom();
                    this.LIZIZ.Go(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    C197039127h c197039127h3 = null;
                    if (this.LIZIZ.Jo().getState().LLILZLL == EnumC2246361Cw6.MENTIONING) {
                        C197039127h c197039127h4 = this.LIZIZ.LLJILLL;
                        if (c197039127h4 != null) {
                            c197039127h3 = c197039127h4;
                        }
                        C786410Ut5.LLLLLLJ(c197039127h3, 8);
                        InterfaceC1356670lPN interfaceC1356670lPN = this.LIZIZ.LLJJIJIL;
                        if (interfaceC1356670lPN != null) {
                            interfaceC1356670lPN.Hi(0, false);
                        }
                    } else {
                        InterfaceC1356670lPN interfaceC1356670lPN2 = this.LIZIZ.LLJJIJIL;
                        if (interfaceC1356670lPN2 != null && !interfaceC1356670lPN2.Be()) {
                            C197039127h c197039127h5 = this.LIZIZ.LLJILLL;
                            if (c197039127h5 != null) {
                                c197039127h3 = c197039127h5;
                            }
                            C786410Ut5.LLLLLLJ(c197039127h3, 0);
                        }
                    }
                    InterfaceC1356670lPN interfaceC1356670lPN3 = this.LIZIZ.LLJJIJIL;
                    if (interfaceC1356670lPN3 != null) {
                        interfaceC1356670lPN3.Df();
                    }
                    ProfileEditBioAssem profileEditBioAssem = this.LIZIZ;
                    C814420VxA.LIZIZ(C418440Gaw.LIZIZ(138));
                    profileEditBioAssem.getClass();
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
                @Override // X.InterfaceC2246551CwP
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(int r5, int r6) {
                    /*
                        r4 = this;
                        com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem r0 = r4.LIZIZ
                        X.0lPN r0 = r0.LLJJIJIL
                        r3 = 0
                        if (r0 == 0) goto L2d
                        boolean r1 = r0.Be()
                        r0 = 1
                        if (r1 != r0) goto L2d
                    Le:
                        r2 = 12
                        if (r0 == 0) goto L2f
                        com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem r0 = r4.LIZIZ
                        X.0lPN r0 = r0.LLJJIJIL
                        if (r0 == 0) goto L1b
                        r0.Df()
                    L1b:
                        com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem r1 = r4.LIZIZ
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                        float r0 = X.C418440Gaw.LIZIZ(r0)
                        int r0 = X.C814420VxA.LIZIZ(r0)
                        r1.Go(r0)
                        return
                    L2d:
                        r0 = 0
                        goto Le
                    L2f:
                        int r5 = r5 + r6
                        X.01GW r0 = r4.LIZ
                        java.lang.Object r0 = r0.getValue()
                        android.view.View r0 = (android.view.View) r0
                        int r0 = r0.getPaddingBottom()
                        if (r0 == r5) goto L3f
                        r3 = r5
                    L3f:
                        com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioAssem r1 = r4.LIZIZ
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                        float r0 = X.C418440Gaw.LIZIZ(r0)
                        int r0 = X.C814420VxA.LIZIZ(r0)
                        int r3 = r3 + r0
                        r1.Go(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2246371Cw7.LIZIZ(int, int):void");
                }
            };
            c2246531CwN.getClass();
            c2246531CwN.LIZIZ = new InterfaceC2246541CwO(r2) { // from class: X.1CwM
                public int LIZ;
                public final InterfaceC2246551CwP LIZIZ;

                @Override // X.InterfaceC2246541CwO
                public final void LIZ() {
                    this.LIZ = 0;
                    InterfaceC2246551CwP interfaceC2246551CwP = this.LIZIZ;
                    if (interfaceC2246551CwP != null) {
                        interfaceC2246551CwP.LIZ();
                    }
                }

                {
                    this.LIZIZ = r2;
                }

                @Override // X.InterfaceC2246541CwO
                public final void LJJIIJ(int i) {
                    this.LIZ = i;
                    InterfaceC2246551CwP interfaceC2246551CwP = this.LIZIZ;
                    if (interfaceC2246551CwP != null) {
                        interfaceC2246551CwP.LIZJ(i);
                    }
                }

                @Override // X.InterfaceC2246541CwO
                public final void LLLL(int i) {
                    InterfaceC2246551CwP interfaceC2246551CwP = this.LIZIZ;
                    if (interfaceC2246551CwP != null) {
                        interfaceC2246551CwP.LIZIZ(this.LIZ, i);
                    }
                    this.LIZ += i;
                }
            };
            if (c19egLIZ != null) {
                C2246401CwA c2246401CwA = new C2246401CwA(c19egLIZ);
                c2246531CwN.LIZ = c2246401CwA;
                c2246401CwA.LIZJ = c2246531CwN.LIZIZ;
                View view3 = c2246401CwA.LIZ;
                if (view3 != null && c2246401CwA.LIZLLL != null) {
                    C786410Ut5.x3(view3.getViewTreeObserver(), c2246401CwA.LIZLLL);
                }
            }
            C1355350lNF c1355350lNF2 = this.LLJILJILJ;
            if (c1355350lNF2 == null) {
                c1355350lNF2 = null;
            }
            c1355350lNF2.requestFocus();
            C21405618pq c21405618pq = this.LLJJJIL;
            C1355350lNF c1355350lNF3 = this.LLJILJILJ;
            if (c1355350lNF3 == null) {
                c1355350lNF3 = null;
            }
            c21405618pq.LIZ = c1355350lNF3;
            c21405618pq.LIZIZ = c1355350lNF3.getInputType();
            this.LLJJIJIL = C20612915lH.LIZIZ.LIZJ(new InterfaceC20613315lL() { // from class: X.1Cw3
                @Override // X.InterfaceC20613315lL
                public final void Af() {
                }

                @Override // X.InterfaceC20613315lL
                public final void LLJI() {
                }

                @Override // X.InterfaceC20613315lL
                public final void M8(String str, String str2, C316530Cax c316530Cax, String str3) {
                }

                @Override // X.InterfaceC20613315lL
                public final void Wj(String str, C316530Cax c316530Cax, String str2) {
                }

                @Override // X.InterfaceC20613315lL
                public final String getCreationId() {
                    return null;
                }

                @Override // X.InterfaceC20613315lL
                public final void ld(int i) {
                }

                @Override // X.InterfaceC20613315lL
                public final int lk() {
                    return 0;
                }

                @Override // X.InterfaceC20613315lL
                public final void qj(User user) {
                }

                @Override // X.InterfaceC20613315lL
                public final void r6(int i) {
                }

                @Override // X.InterfaceC20613315lL
                public final void g1(String str, boolean z) {
                    C19EG c19egLIZ2;
                    if (z && (c19egLIZ2 = C724240Sb0.LIZ(this.LL)) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ2);
                        c1389890mGx.LJIIJ(str);
                        c1389890mGx.LJIIJJI();
                    }
                }

                @Override // X.InterfaceC20613315lL
                public final void Mi(User user, boolean z, String str, String str2, int i) {
                    String str3;
                    MentionSpan mentionSpan;
                    Integer numLIZJ;
                    ProfileEditBioAssem profileEditBioAssem = this.LL;
                    profileEditBioAssem.LLJJJJ = true;
                    try {
                        profileEditBioAssem.LLJJJIL.LIZ();
                        if (profileEditBioAssem.LLJJIJIIJIL) {
                            str3 = "click_mention_button";
                        } else {
                            str3 = "type_in";
                        }
                        C1232140iAW.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_method", str3);
                        c2344009Gk.LJIIIIZZ("action_type", "select");
                        C20684815ws.LJIILLIIL("show_mention_list", c2344009Gk.LIZ);
                        C1355350lNF c1355350lNF4 = profileEditBioAssem.LLJILJILJ;
                        C1355350lNF c1355350lNF5 = null;
                        if (c1355350lNF4 == null) {
                            c1355350lNF4 = null;
                        }
                        int selectionStart = c1355350lNF4.getSelectionStart();
                        ProfileEditBioViewModel profileEditBioViewModelJo = profileEditBioAssem.Jo();
                        C1355350lNF c1355350lNF6 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF6 == null) {
                            c1355350lNF6 = null;
                        }
                        Editable editableXQ2 = profileEditBioViewModelJo.xQ2(C2204961BRm.U(c1355350lNF6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)), user, selectionStart);
                        int length = editableXQ2.length();
                        C1355350lNF c1355350lNF7 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF7 == null) {
                            c1355350lNF7 = null;
                        }
                        int length2 = length - c1355350lNF7.length();
                        C1355350lNF c1355350lNF8 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF8 == null) {
                            c1355350lNF8 = null;
                        }
                        c1355350lNF8.setText(editableXQ2);
                        int length3 = (selectionStart - ((user.getNickname().length() - length2) + 1)) - 1;
                        int i2 = selectionStart + length2;
                        int i3 = i2 - 1;
                        Context context = profileEditBioAssem.getContext();
                        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                            int iIntValue = numLIZJ.intValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('@');
                            sbLIZ.append(user.getNickname());
                            mentionSpan = new MentionSpan(iIntValue, C2188811AlT.LIZIZ(sbLIZ), user.getUid(), 9, user.getSecUid());
                        } else {
                            mentionSpan = null;
                        }
                        C444920HcY c444920HcY = new C444920HcY(42, false);
                        C1355350lNF c1355350lNF9 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF9 == null) {
                            c1355350lNF9 = null;
                        }
                        C2204961BRm.U(c1355350lNF9, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)).setSpan(mentionSpan, length3, i3, 33);
                        C1355350lNF c1355350lNF10 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF10 == null) {
                            c1355350lNF10 = null;
                        }
                        C2204961BRm.U(c1355350lNF10, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)).setSpan(c444920HcY, length3, i3, 33);
                        C1355350lNF c1355350lNF11 = profileEditBioAssem.LLJILJILJ;
                        if (c1355350lNF11 != null) {
                            c1355350lNF5 = c1355350lNF11;
                        }
                        c1355350lNF5.setSelection(i2);
                        new C2246341Cw4(profileEditBioAssem.Jo()).LIZ(i2, i2, true);
                        profileEditBioAssem.LLJJJJ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        profileEditBioAssem.LLJJJJ = false;
                        throw th;
                    }
                }
            }, this);
        }
        ProfileEditBioViewModel profileEditBioViewModelJo = Jo();
        Jo();
        C1355350lNF c1355350lNF4 = this.LLJILJILJ;
        if (c1355350lNF4 == null) {
            c1355350lNF4 = null;
        }
        profileEditBioViewModelJo.setStateImmediate(new AwS84S1000000_34(ProfileEditBioViewModel.vQ2(C2204961BRm.U(c1355350lNF4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null))), 4));
        C1355350lNF c1355350lNF5 = this.LLJILJILJ;
        if (c1355350lNF5 == null) {
            c1355350lNF5 = null;
        }
        c1355350lNF5.addTextChangedListener(new TextWatcher() { // from class: X.1Cw9
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                ProfileEditBioAssem profileEditBioAssem = this.LL;
                if (!profileEditBioAssem.LLJJJIL.LIZLLL && editable != null) {
                    ProfileEditBioViewModel profileEditBioViewModelJo2 = profileEditBioAssem.Jo();
                    C1355350lNF c1355350lNF6 = this.LL.LLJILJILJ;
                    C1355350lNF c1355350lNF7 = null;
                    if (c1355350lNF6 == null) {
                        c1355350lNF6 = null;
                    }
                    int selectionStart = c1355350lNF6.getSelectionStart();
                    AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this.LL, 420);
                    if (((Boolean) profileEditBioViewModelJo2.LLILLJJLI.getValue()).booleanValue()) {
                        profileEditBioViewModelJo2.BQ2(editable, selectionStart, awS598S0100000_19);
                    }
                    ProfileEditBioViewModel profileEditBioViewModelJo3 = this.LL.Jo();
                    C1355350lNF c1355350lNF8 = this.LL.LLJILJILJ;
                    if (c1355350lNF8 != null) {
                        c1355350lNF7 = c1355350lNF8;
                    }
                    profileEditBioViewModelJo3.AQ2(c1355350lNF7.getSelectionStart(), ProfileEditBioViewModel.vQ2(editable), false);
                }
            }
        });
        C1355350lNF c1355350lNF6 = this.LLJILJILJ;
        if (c1355350lNF6 == null) {
            c1355350lNF6 = null;
        }
        c1355350lNF6.setSelectionChangeCallback(new C2246341Cw4(Jo()));
        if (No()) {
            C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.1CwH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2246381Cw8) obj).LLILZLL;
                }
            }, new C2217381BqS() { // from class: X.1CwL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2246381Cw8) obj).LLILZIL;
                }
            }, C736820SvI.LIZLLL(), new AwS683S0100000_34(this, 1), 8);
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.1CwE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2246381Cw8) obj).LLIZ);
            }
        }, null, new AwS643S0100000_29(this, 57), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.1CwF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2246381Cw8) obj).LLIZLLLIL;
            }
        }, null, new AwS633S0100000_19(this, 145), 6);
        ProfileEditBioViewModel profileEditBioViewModelJo2 = Jo();
        selectSubscribe(profileEditBioViewModelJo2, new C2217381BqS() { // from class: X.1CwJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2246381Cw8) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.1CwG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2246381Cw8) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.1CwK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2246381Cw8) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.1CwI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2246381Cw8) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(profileEditBioViewModelJo2.usedInReusedScene), null, new C2246351Cw5(this, view));
        ProfileEditBioViewModel profileEditBioViewModelJo3 = Jo();
        Jo();
        C1355350lNF c1355350lNF7 = this.LLJILJILJ;
        if (c1355350lNF7 == null) {
            c1355350lNF7 = null;
        }
        String strVQ2 = ProfileEditBioViewModel.vQ2(C2204961BRm.U(c1355350lNF7, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpKwb9K4Q==", null)));
        C1355350lNF c1355350lNF8 = this.LLJILJILJ;
        if (c1355350lNF8 != null) {
            c1355350lNF = c1355350lNF8;
        }
        int selectionStart = c1355350lNF.getSelectionStart();
        profileEditBioViewModelJo3.withState(new AwS148S1100000_34(profileEditBioViewModelJo3, strVQ2, 12));
        profileEditBioViewModelJo3.AQ2(selectionStart, strVQ2, true);
    }

    public final void Ho(int i, boolean z) {
        int i2;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        if (z && i >= ProfileEditBioFragment.LLJJIII) {
            i2 = R.attr.zs;
        } else {
            i2 = R.attr.a1k;
        }
        Context context = getContext();
        TextView textView = null;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i2, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            foregroundColorSpan = null;
        }
        int i3 = ProfileEditBioFragment.LLJJIII;
        int iMin = Math.min(i, i3);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZJ(C787200UuM.LIZ(iMin), foregroundColorSpan, 33);
        c1360520lVa.LJI("/");
        c1360520lVa.LIZ.append((CharSequence) C787200UuM.LIZ(i3));
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        TextView textView2 = this.LLJIJIL;
        if (textView2 != null) {
            textView = textView2;
        }
        textView.setText(c1360500lVY);
    }
}
