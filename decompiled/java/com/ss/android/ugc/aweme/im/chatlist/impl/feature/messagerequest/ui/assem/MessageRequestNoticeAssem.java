package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0PEM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1770850wBP;
import X.C19208510Ct;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C300860Bqm;
import X.C452501pT;
import X.C610200NwY;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C887750Ys9;
import X.C888790Ytp;
import X.C888870Ytx;
import X.C888890Ytz;
import X.C889980Yvk;
import X.EnumC871430YGn;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC888860Ytw;
import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.engine.MessageRequestNoticeAbility;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestNoticeAssem extends AbstractC738140SxQ implements MessageRequestNoticeAbility, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 316));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C887750Ys9.class, "message_request_fragment_config"), checkSupervisorPrepared());
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 307));
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestNoticeAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestNoticeAssem.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageRequestNoticeAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MessageRequestNoticeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 313), AFwS248S0000000_14.get$arr$(98), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVMV2.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 314), AFwS248S0000000_14.get$arr$(99), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageRequestListVM.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 315), AFwS248S0000000_14.get$arr$(100), null, true);
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        EnumC871430YGn enumC871430YGnA1;
        super.onParentViewCreated();
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
            enumC871430YGnA1 = ((MessageRequestPageVM) assemVMLazy.getValue()).a1();
        } else {
            C887750Ys9 c887750Ys9 = (C887750Ys9) this.LLILLJJLI.getValue();
            if (c887750Ys9 == null || (enumC871430YGnA1 = c887750Ys9.LLILLJJLI) == null) {
                return;
            }
        }
        m232do(enumC871430YGnA1);
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy2 = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLIZ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0YuK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C885570Yod) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 13), 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.engine.MessageRequestNoticeAbility
    public final void pZ1() {
        C888890Ytz c888890Ytz = (C888890Ytz) this.LLILLL.getValue();
        if (c888890Ytz != null) {
            C23250099c.LIZLLL(c888890Ytz.LIZJ, C0PEM.LIZJ, null, new C888870Ytx(c888890Ytz, null), 2);
        }
    }

    public final BaseMessageRequestListVM bo() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLIZ;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, MessageRequestNoticeAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), MessageRequestNoticeAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        InterfaceC888860Ytw interfaceC888860Ytw;
        super.onResume();
        C888890Ytz c888890Ytz = (C888890Ytz) this.LLILLL.getValue();
        if (c888890Ytz == null || (interfaceC888860Ytw = c888890Ytz.LJ) == null) {
            return;
        }
        interfaceC888860Ytw.LJI(c888890Ytz.LIZIZ);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m232do(final EnumC871430YGn enumC871430YGn) {
        C888890Ytz c888890Ytz = (C888890Ytz) this.LLILLL.getValue();
        if (c888890Ytz != null) {
            if (enumC871430YGn != EnumC871430YGn.ALL_RISKY) {
                c888890Ytz.LIZ(new C610200NwY());
                c888890Ytz.LIZ(new C19208510Ct());
                final AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 308);
                c888890Ytz.LIZ(new InterfaceC888860Ytw(awS558S0100000_14) { // from class: X.0Nza
                    public final Function0<Boolean> LIZ;

                    @Override // X.InterfaceC888860Ytw
                    public final void LJI(Context context) {
                    }

                    @Override // X.InterfaceC888860Ytw
                    public final EnumC610450Nwx getType() {
                        return EnumC610450Nwx.MESSAGE_REQUEST_PRIORITY;
                    }

                    {
                        this.LIZ = awS558S0100000_14;
                    }

                    @Override // X.InterfaceC888860Ytw
                    public final void LJII(Context context) {
                        FragmentManager supportFragmentManager;
                        int i;
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (!supportFragmentManager.LJLJJI())) {
                            C1391960mKI c1391960mKI = new C1391960mKI();
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_color_ai_priority;
                            c1391960mKI.LIZLLL = c419910GdJ.LIZ(context);
                            c1391960mKI.LJI = 0;
                            c1391960mKI.LJII = context.getString(2131846452);
                            if (C300850Bql.LIZ() && !C612090Nzb.LIZ()) {
                                i = 2131846449;
                            } else {
                                i = 2131846450;
                            }
                            c1391960mKI.LJIIIIZZ = context.getString(i);
                            c1391960mKI.LIZIZ(context.getString(2131846451), AFwS292S0000000_9.get$arr$(69));
                            c1391960mKI.LIZ().LIZ.show(supportFragmentManager, "MessageRequestListAssemV2");
                            C12859051l.LIZ().storeBoolean("key_has_shown_priority_intro_view", true);
                        }
                    }

                    @Override // X.InterfaceC888860Ytw
                    public final Object LJIIIIZZ(Context context, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                        boolean z = true;
                        if (C888810Ytr.LIZ(this)) {
                            return true;
                        }
                        if (!(!C12859051l.LIZ().getBoolean("key_has_shown_priority_intro_view", false)) || !this.LIZ.invoke().booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                ViewGroup viewGroup = (ViewGroup) this.LL.getValue();
                if (viewGroup != null) {
                    c888890Ytz.LIZ(new C888790Ytp(viewGroup, enumC871430YGn, new AwS558S0100000_14(this, 309), new AwS558S0100000_14(this, 310), new AwS558S0100000_14(this, 311)));
                    if (c888890Ytz.LIZ != null) {
                        c888890Ytz.LIZ(new C889980Yvk(viewGroup, enumC871430YGn, bo().zQ2(), new AwS558S0100000_14(this, 312)));
                        return;
                    }
                    return;
                }
                return;
            }
            final ViewGroup viewGroup2 = (ViewGroup) this.LL.getValue();
            if (viewGroup2 == null) {
                return;
            }
            c888890Ytz.LIZ(new InterfaceC888860Ytw(viewGroup2, enumC871430YGn) { // from class: X.0Yu1
                public final ViewGroup LIZ;
                public final EnumC871430YGn LIZIZ;

                @Override // X.InterfaceC888860Ytw
                public final void LJI(Context context) {
                }

                @Override // X.InterfaceC888860Ytw
                public final EnumC610450Nwx getType() {
                    return EnumC610450Nwx.MESSAGE_REQUEST_FILTER_WORD;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [X.0Yu2, android.view.View] */
                @Override // X.InterfaceC888860Ytw
                public final void LJII(final Context context) {
                    ?? r1 = new LinearLayout(context) { // from class: X.0Yu2
                        public static final /* synthetic */ int LLILLJJLI = 0;
                        public boolean LL;

                        private final SpannableStringBuilder getSpanForRiskNotice() {
                            String string = getContext().getString(2131832030);
                            String string2 = getContext().getString(2131832029, string);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                            int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
                            int length = string.length() + iLJJJ;
                            if (iLJJJ >= 0 && length >= 0) {
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                                C786410Ut5.q2(spannableStringBuilder, new C913790Zt3(numLIZJ != null ? numLIZJ.intValue() : 0, this, 0), iLJJJ, length, 33);
                                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(42, false), iLJJJ, length, 33);
                            }
                            return spannableStringBuilder;
                        }

                        public final void LIZ(EnumC871430YGn enumC871430YGn2) {
                            if (enumC871430YGn2 == null || this.LL) {
                                return;
                            }
                            this.LL = true;
                            C786410Ut5.LJLLJ(getContext(), R.layout.csc, this);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, getContext());
                            if (numLIZJ != null) {
                                setBackgroundColor(numLIZJ.intValue());
                            }
                            C786410Ut5.I7(new ACListenerS117S0200000_14(this, enumC871430YGn2, 3), findViewById(R.id.k6s));
                            TextView textView = (TextView) findViewById(R.id.k6r);
                            if (C0YVL.LIZ[enumC871430YGn2.ordinal()] == 1) {
                                if (((Number) C0BBD.LIZ.getValue()).intValue() > 0) {
                                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                                    textView.setText(getSpanForRiskNotice());
                                } else {
                                    textView.setText(getContext().getString(2131837243));
                                }
                            }
                        }
                    };
                    r1.LIZ(this.LIZIZ);
                    this.LIZ.addView(r1);
                }

                {
                    this.LIZ = viewGroup2;
                    this.LIZIZ = enumC871430YGn;
                }

                @Override // X.InterfaceC888860Ytw
                public final Object LJIIIIZZ(Context context, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                    if (C888810Ytr.LIZ(this)) {
                        return true;
                    }
                    EnumC871430YGn enumC871430YGn2 = this.LIZIZ;
                    boolean z = false;
                    if (enumC871430YGn2 == EnumC871430YGn.ALL_RISKY) {
                        z = !Keva.getRepo("stranger_notice_shown").getBoolean(C786410Ut5.j4("shown_%s", new Object[]{enumC871430YGn2.name()}), false);
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
