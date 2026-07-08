package kotlin.jvm.internal;

import X.C019F;
import X.C05P0;
import X.C05P1;
import X.C05YF;
import X.C09AY;
import X.C0BA2;
import X.C0ETY;
import X.C1390920mIc;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LN;
import X.C15442062u;
import X.C1634250sd5;
import X.C1634310sdB;
import X.C1634330sdD;
import X.C1637806bA;
import X.C1650960t42;
import X.C1675370thP;
import X.C1679360tnq;
import X.C1680680tpy;
import X.C1682700ttE;
import X.C1682740ttI;
import X.C1685530txn;
import X.C1686970u07;
import X.C1687430u0r;
import X.C1687630u1B;
import X.C1692280u8g;
import X.C19719912Dl;
import X.C1DRG;
import X.C20060213eK;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C298060BmG;
import X.C343070Dcf;
import X.C5182020e;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1678550tmX;
import X.InterfaceC1642740sqm;
import X.InterfaceC1647930sz9;
import X.InterfaceC1648020szI;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650620t3U;
import X.InterfaceC1651180t4O;
import X.InterfaceC1651490t4t;
import X.InterfaceC1664410tPj;
import X.InterfaceC1679450tnz;
import X.InterfaceC1690500u5o;
import X.InterfaceC1692880u9e;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS159S0100000_25;
import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS82S0400000_25;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINViewModel;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import myl.c;

/* JADX INFO: loaded from: classes26.dex */
public class AwS82S0500000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.13BV] */
    public static final Object invoke$0(AwS82S0500000_25 awS82S0500000_25) {
        ?? arrayList;
        C05P0 c05p0 = (C05P0) awS82S0500000_25.l1;
        String str = CreateOrResetPINFragment._pnsPageId;
        if (((String) c05p0.getValue()).length() != 6) {
            ((C05P0) awS82S0500000_25.l2).setValue(((CreateOrResetPINFragment) awS82S0500000_25.l0).getString(2131838963));
            C1682700ttE c1682700ttE = C1682700ttE.LIZ;
            String enterFrom = ((CreateOrResetPINFragment) awS82S0500000_25.l0).getEnterFrom();
            String strAS = ((CreateOrResetPINFragment) awS82S0500000_25.l0).aS();
            c1682700ttE.getClass();
            C1682700ttE.LIZ(0, -2, enterFrom, "confirm", strAS);
        } else if (!Intrinsics.LJFF(((C05P0) awS82S0500000_25.l1).getValue(), ((C05P0) awS82S0500000_25.l3).getValue())) {
            ((C05P0) awS82S0500000_25.l4).setValue(((CreateOrResetPINFragment) awS82S0500000_25.l0).getString(2131838962));
            C1682700ttE c1682700ttE2 = C1682700ttE.LIZ;
            String enterFrom2 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).getEnterFrom();
            String strAS2 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).aS();
            c1682700ttE2.getClass();
            C1682700ttE.LIZ(0, -1, enterFrom2, "confirm", strAS2);
        } else {
            CreateOrResetPINFragment createOrResetPINFragment = (CreateOrResetPINFragment) awS82S0500000_25.l0;
            String str2 = (String) ((C05P0) awS82S0500000_25.l1).getValue();
            createOrResetPINFragment.getClass();
            int length = str2.length() - 1;
            if (length < 1) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList(length);
                int i = 0;
                do {
                    char cCharAt = str2.charAt(i);
                    i++;
                    arrayList.add(Integer.valueOf(str2.charAt(i) - cCharAt));
                } while (i < length);
            }
            boolean z = arrayList instanceof Collection;
            if (z && arrayList.isEmpty()) {
                ((C05P0) awS82S0500000_25.l4).setValue(((CreateOrResetPINFragment) awS82S0500000_25.l0).getString(2131838964));
                C1682700ttE c1682700ttE3 = C1682700ttE.LIZ;
                String enterFrom3 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).getEnterFrom();
                String strAS3 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).aS();
                c1682700ttE3.getClass();
                C1682700ttE.LIZ(0, -3, enterFrom3, "confirm", strAS3);
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Number) it2.next()).intValue() != 1) {
                        if (!z || !arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() != -1) {
                                    if (C13LN.LLD((String) ((C05P0) awS82S0500000_25.l1).getValue()).size() < 3) {
                                        ((C05P0) awS82S0500000_25.l4).setValue(((CreateOrResetPINFragment) awS82S0500000_25.l0).getString(2131838965));
                                        C1682700ttE c1682700ttE4 = C1682700ttE.LIZ;
                                        String enterFrom4 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).getEnterFrom();
                                        String strAS4 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).aS();
                                        c1682700ttE4.getClass();
                                        C1682700ttE.LIZ(0, -4, enterFrom4, "confirm", strAS4);
                                    } else {
                                        CreateOrResetPINViewModel createOrResetPINViewModel = (CreateOrResetPINViewModel) ((CreateOrResetPINFragment) awS82S0500000_25.l0).LLIZLLLIL.getValue();
                                        String str3 = (String) ((C05P0) awS82S0500000_25.l1).getValue();
                                        boolean zBS = ((CreateOrResetPINFragment) awS82S0500000_25.l0).bS();
                                        createOrResetPINViewModel.getClass();
                                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(createOrResetPINViewModel), null, null, new C1682740ttI(createOrResetPINViewModel, str3, zBS, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                ((C05P0) awS82S0500000_25.l4).setValue(((CreateOrResetPINFragment) awS82S0500000_25.l0).getString(2131838964));
                C1682700ttE c1682700ttE32 = C1682700ttE.LIZ;
                String enterFrom32 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).getEnterFrom();
                String strAS32 = ((CreateOrResetPINFragment) awS82S0500000_25.l0).aS();
                c1682700ttE32.getClass();
                C1682700ttE.LIZ(0, -3, enterFrom32, "confirm", strAS32);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS82S0500000_25 awS82S0500000_25) {
        UserMatchedAssem userMatchedAssem = (UserMatchedAssem) awS82S0500000_25.l0;
        C1687630u1B c1687630u1B = (C1687630u1B) awS82S0500000_25.l1;
        Context context = (Context) awS82S0500000_25.l2;
        int iLJJJJLL = (int) ((InterfaceC1690500u5o) awS82S0500000_25.l3).LJJJJLL(590);
        FragmentManager fragmentManager = (FragmentManager) awS82S0500000_25.l4;
        userMatchedAssem.getClass();
        View viewSd = C786410Ut5.Sd(R.layout.c__, C786410Ut5.ne(context), null);
        ComposeView composeView = (ComposeView) viewSd.findViewById(R.id.p6j);
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.p6k);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConnectNowMatchVM.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(userMatchedAssem, C724750Sbp.LJIIJ(userMatchedAssem, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 491), AFwS266S0000000_25.get$arr$(525), null, true);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UserMatchedAssem.LLJJ;
        AssemViewModel.selectSubscribe$default(assemVMLazyLIZ.getValue(), new C2217381BqS() { // from class: X.0u0b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1687630u1B) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS604S0100000_25(new AwS120S0400000_25(tuxTextView, c1687630u1B, composeView, userMatchedAssem, 31), 788), 14, null);
        C1685530txn.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        C20684815ws.LJIILLIIL("follower_notice_banner", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "follower_notice_banner");
        c2344009Gk2.LJIIIIZZ("action_type", "show");
        C20684815ws.LJIILLIIL("follower_notice_banner_new_followers", c2344009Gk2.LIZ);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.p6l);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS159S0100000_25(viewSd, 79));
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewSd;
        tuxSheet.LLJJL = iLJJJJLL;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.show(fragmentManager, "UserMatchedAssem");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS82S0500000_25 awS82S0500000_25) {
        InterfaceC1642740sqm interfaceC1642740sqm;
        C1650960t42 c1650960t42 = (C1650960t42) awS82S0500000_25.l0;
        C1DRG c1drg = (C1DRG) awS82S0500000_25.l1;
        InterfaceC1651490t4t interfaceC1651490t4t = (InterfaceC1651490t4t) awS82S0500000_25.l2;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS82S0500000_25.l3;
        InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) awS82S0500000_25.l4;
        c1650960t42.getClass();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null);
        SafeHandler safeHandler = new SafeHandler(lifecycleOwner);
        interfaceC1650230t2r.oN().LIZ(lifecycleOwner, new AObjectS185S0300000_25(interfaceC1650230t2r, c1650960t42, interfaceC1651490t4t, 22));
        AwS58S0500000_25 awS58S0500000_25 = new AwS58S0500000_25(lifecycleOwner, safeHandler, interfaceC1651490t4t, c1650960t42, interfaceC1650230t2r, 7);
        if (c1drg.LIZJ(InterfaceC1649530t1j.class)) {
            if (C343070Dcf.LIZ()) {
                ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1649530t1j.class, new AwS604S0100000_25((Function1) awS58S0500000_25, (Function1<? super EnumC1678550tmX, Boolean>) 603));
            } else if (C298060BmG.LIZ() && (interfaceC1642740sqm = (InterfaceC1642740sqm) c1drg.LJIIL(null, InterfaceC1642740sqm.class)) != null) {
                interfaceC1642740sqm.Sd(InterfaceC1649530t1j.class, awS58S0500000_25);
            } else {
                awS58S0500000_25.invoke(c1drg.LJII(InterfaceC1649530t1j.class, null));
            }
        }
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1651180t4O.class, new AwS120S0400000_25(lifecycleOwner, safeHandler, interfaceC1651490t4t, c1650960t42, 24));
        } else {
            C05YF c05yf = (C05YF) c1drg.LJIIL(null, InterfaceC1651180t4O.class);
            if (c05yf != null) {
                InterfaceC1651180t4O interfaceC1651180t4O = (InterfaceC1651180t4O) c05yf;
                interfaceC1651180t4O.Kd1().LIZ(lifecycleOwner, new AObjectS185S0300000_25(c1650960t42, safeHandler, interfaceC1651490t4t, 23));
                interfaceC1651180t4O.ec().LIZ(lifecycleOwner, new AObjectS82S0400000_25(c1650960t42, interfaceC1651490t4t, interfaceC1651180t4O, lifecycleOwner, 9));
            }
        }
        interfaceC1650230t2r.vC1().LIZ(lifecycleOwner, new AObjectS185S0300000_25(shortVideoContext, c1650960t42, interfaceC1651490t4t, 18));
        ((InterfaceC1647930sz9) c1drg.LJII(InterfaceC1648020szI.class, null)).getBottomTabIndexChangeEvent().LIZ(lifecycleOwner, new AObjectS185S0300000_25(shortVideoContext, c1650960t42, interfaceC1651490t4t, 19));
        interfaceC1650230t2r.vB1().LIZ(lifecycleOwner, new AObjectS246S0100000_25(interfaceC1651490t4t, 694));
        interfaceC1650230t2r.Q30().LIZ(lifecycleOwner, new AObjectS185S0300000_25(interfaceC1650230t2r, c1650960t42, interfaceC1651490t4t, 20));
        interfaceC1650230t2r.p92().LIZ(lifecycleOwner, new AObjectS82S0400000_25(shortVideoContext, interfaceC1650230t2r, c1650960t42, interfaceC1651490t4t, 6));
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1650620t3U.class, new AwS120S0400000_25(lifecycleOwner, c1650960t42, interfaceC1651490t4t, c1drg, 25));
        } else {
            C05YF c05yf2 = (C05YF) c1drg.LJIIL(null, InterfaceC1650620t3U.class);
            if (c05yf2 != null) {
                ((InterfaceC1650620t3U) c05yf2).zu0().LIZ(lifecycleOwner, new AObjectS185S0300000_25(c1drg, c1650960t42, interfaceC1651490t4t, 21));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS82S0500000_25 awS82S0500000_25) {
        if (((Boolean) C0BA2.LIZ.getValue()).booleanValue()) {
            return new C1634310sdB((Function0) awS82S0500000_25.l0, (Function0) awS82S0500000_25.l1, (Function0) awS82S0500000_25.l2, (Function0) awS82S0500000_25.l3, C1634250sd5.LIZIZ);
        }
        return new C1634330sdD((Function0) awS82S0500000_25.l1, (Function0) awS82S0500000_25.l4, (Function0) awS82S0500000_25.l2, (Function0) awS82S0500000_25.l3, AFwS214S0000000_25.get$arr$(492));
    }

    public static final Object invoke$4(AwS82S0500000_25 awS82S0500000_25) {
        Set setLJIIIIZZ;
        if (((Boolean) ((C05P1) awS82S0500000_25.l4).getValue()).booleanValue()) {
            ((Function0) awS82S0500000_25.l0).invoke();
        } else {
            String str = ((C1675370thP) awS82S0500000_25.l1).LIZ;
            InterfaceC1664410tPj interfaceC1664410tPj = (InterfaceC1664410tPj) awS82S0500000_25.l2;
            Function1 function1 = (Function1) awS82S0500000_25.l3;
            if (interfaceC1664410tPj.contains(str)) {
                setLJIIIIZZ = C15442062u.LJI(str, interfaceC1664410tPj);
            } else {
                setLJIIIIZZ = C15442062u.LJIIIIZZ(str, interfaceC1664410tPj);
            }
            function1.invoke(C1687430u0r.LIZIZ(setLJIIIIZZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS82S0500000_25 awS82S0500000_25) {
        int length = C1679360tnq.LIZIZ((C05P0) awS82S0500000_25.l4).LIZ.LLILLJJLI.length();
        long j = C1679360tnq.LIZIZ((C05P0) awS82S0500000_25.l4).LIZIZ;
        int i = C1692280u8g.LIZJ;
        if (((int) (j >> 32)) != length || C1692280u8g.LIZLLL(C1679360tnq.LIZIZ((C05P0) awS82S0500000_25.l4).LIZIZ) != length) {
            C05P0 c05p0 = (C05P0) awS82S0500000_25.l4;
            c05p0.setValue(C1686970u07.LIZIZ(C1679360tnq.LIZIZ(c05p0), null, C1680680tpy.LIZ(length, length), 5));
            ((Function1) awS82S0500000_25.l0).invoke(C1679360tnq.LIZIZ((C05P0) awS82S0500000_25.l4));
        }
        ((InterfaceC1692880u9e) awS82S0500000_25.l1).hide();
        C20060213eK.LIZIZ((C20060213eK) awS82S0500000_25.l2);
        InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) awS82S0500000_25.l3;
        if (interfaceC1679450tnz != null) {
            interfaceC1679450tnz.show();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0500000_25(C1650960t42 c1650960t42, C1DRG c1drg, c cVar, ShortVideoContext shortVideoContext, InterfaceC1650230t2r interfaceC1650230t2r, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1650960t42;
        this.l1 = c1drg;
        this.l2 = cVar;
        this.l3 = shortVideoContext;
        this.l4 = interfaceC1650230t2r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS82S0500000_25(CreateOrResetPINFragment createOrResetPINFragment, CreateOrResetPINFragment createOrResetPINFragment2, C05P0<String> c05p0, C05P0<String> c05p02, C05P0<String> c05p03, C05P0<String> c05p04) {
        super(0);
        this.$t = c05p04;
        this.l0 = createOrResetPINFragment;
        this.l1 = createOrResetPINFragment2;
        this.l2 = c05p0;
        this.l3 = c05p02;
        this.l4 = c05p03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0500000_25(UserMatchedAssem userMatchedAssem, C1687630u1B c1687630u1B, Context context, InterfaceC1690500u5o interfaceC1690500u5o, FragmentManager fragmentManager, int i) {
        super(0);
        this.$t = i;
        this.l0 = userMatchedAssem;
        this.l1 = c1687630u1B;
        this.l2 = context;
        this.l3 = interfaceC1690500u5o;
        this.l4 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS82S0500000_25(Function0 function0, Function0<Unit> function02, C1675370thP c1675370thP, InterfaceC1664410tPj<String> interfaceC1664410tPj, Function1<? super InterfaceC1664410tPj<String>, Unit> function1, C05P1<Boolean> c05p1) {
        super(0);
        this.$t = c05p1;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c1675370thP;
        this.l3 = interfaceC1664410tPj;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS82S0500000_25(Function1 function1, Function1<? super C1686970u07, Unit> function12, InterfaceC1692880u9e interfaceC1692880u9e, C20060213eK c20060213eK, InterfaceC1679450tnz interfaceC1679450tnz, C05P0<C1686970u07> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = interfaceC1692880u9e;
        this.l3 = c20060213eK;
        this.l4 = interfaceC1679450tnz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0500000_25(AFwS214S0000000_25 aFwS214S0000000_25, AFwS214S0000000_25 aFwS214S0000000_252, AFwS214S0000000_25 aFwS214S0000000_253, AFwS201S0000000_14 aFwS201S0000000_14, AFwS201S0000000_14 aFwS201S0000000_142, int i) {
        super(0);
        this.$t = i;
        this.l0 = aFwS214S0000000_25;
        this.l1 = aFwS214S0000000_252;
        this.l2 = aFwS214S0000000_253;
        this.l3 = aFwS201S0000000_14;
        this.l4 = aFwS201S0000000_142;
    }
}
