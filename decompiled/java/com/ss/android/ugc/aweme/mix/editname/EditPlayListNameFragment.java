package com.ss.android.ugc.aweme.mix.editname;

import X.AbstractC1623806Xk;
import X.C03H5;
import X.C098200Yq;
import X.C0DHG;
import X.C0RPA;
import X.C0T0P;
import X.C0TYL;
import X.C0ZP4;
import X.C1169510gXV;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220260hrM;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2022207w4;
import X.C2217381BqS;
import X.C259800zU;
import X.C297000BkY;
import X.C338490DOt;
import X.C452070Ho5;
import X.C632670Orh;
import X.C634030Ott;
import X.C723850SaN;
import X.C724710Sbl;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC0148002o;
import X.InterfaceC1169560gXa;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC723730SaB;
import X.InterfaceC724530SbT;
import X.InterfaceC724720Sbm;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlayListNameFragment extends Fragment implements InterfaceC1169560gXa, InterfaceC724530SbT {
    public static final C0TYL LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public static Aweme LLIZLLLIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWE2LCHELIOSw4Jy4+LWsJLSYnGCktMAM6OzECKCI2DjctLiI2JjE=";
    public final AssemVMLazy LL;
    public String LLILLJJLI;
    public Long LLILLL;
    public String LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditPlayListNameFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new C0TYL();
        LLIZ = 8;
    }

    public static final EditPlayListNameFragment SR(int i, String str, String str2, int i2, Aweme aweme, Long l, String str3, UrlModel urlModel, String str4, Integer num) {
        LLILZIL.getClass();
        return C0TYL.LIZ(i, str, str2, i2, aweme, l, str3, urlModel, str4, num);
    }

    @Override // X.InterfaceC1169560gXa, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return OR(this, layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC1169560gXa
    public void pp(String str, String str2) {
    }

    @Override // X.InterfaceC1169560gXa
    public void tL(String str) {
    }

    private final MixCreateViewModel RR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (MixCreateViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: PR, reason: merged with bridge method [inline-methods] */
    public C1169510gXV lt() {
        return new C1169510gXV(0);
    }

    public EditPlayListNameFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixCreateViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS556S0100000_12(c19719912DlLIZ, 516), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 479), AFwS256S0000000_18.get$arr$(148));
        this.LLILLJJLI = "";
        this.LLILZ = "";
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    private final void initView(View view) {
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, view, 58), 3);
        Long l = this.LLILLL;
        if (l != null) {
            long jLongValue = l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long seconds = jLongValue + TimeUnit.DAYS.toSeconds(1L);
            if (jCurrentTimeMillis < seconds) {
                VR(view.getContext(), new SimpleDateFormat("MMM dd, yyyy hh:mm a", Locale.getDefault()).format(new Date(seconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
            }
        }
    }

    @Override // X.InterfaceC1169560gXa
    public void oD(String str) {
        C1440005kM.LIZ(new C0T0P(str, this.LLILLJJLI));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.0Sbl] */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, X.0Sbl] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(arguments, 632);
            C19EG activity = getActivity();
            UrlModel urlModel = null;
            if (activity != null && !activity.isFinishing()) {
                Class<EditPlayListNameFragment> superclass = EditPlayListNameFragment.class;
                Class<?>[] interfaces = superclass.getInterfaces();
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : interfaces) {
                    if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                        arrayList.add(cls);
                    }
                }
                while (arrayList.isEmpty()) {
                    superclass = superclass.getSuperclass();
                    if (superclass != null) {
                        Class<?>[] interfaces2 = superclass.getInterfaces();
                        arrayList = new ArrayList();
                        for (Class<?> cls2 : interfaces2) {
                            if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                                arrayList.add(cls2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Can not find target interface.");
                    }
                }
                final Assembler assemblerLIZ = C0RPA.LIZ(activity);
                final C259800zU c259800zU = new C259800zU();
                ?? BQ2 = Assembler.BQ2(assemblerLIZ, this);
                c259800zU.element = BQ2;
                if (BQ2 == 0) {
                    LifecycleOwner parentFragment = getParentFragment();
                    if (parentFragment == null) {
                        parentFragment = requireActivity();
                    }
                    ?? c724710Sbl = new C724710Sbl(Assembler.BQ2(assemblerLIZ, parentFragment));
                    c259800zU.element = c724710Sbl;
                    Class<?>[] interfaces3 = EditPlayListNameFragment.class.getInterfaces();
                    int length = interfaces3.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Class<?> cls3 = interfaces3[i];
                        if (InterfaceC723730SaB.class.isAssignableFrom(cls3)) {
                            if (cls3 != null) {
                                if (!c724710Sbl.LIZIZ.containsKey(new C634030Ott(cls3, LIZ()))) {
                                    break;
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                    C724710Sbl c724710Sbl2 = (C724710Sbl) c259800zU.element;
                    Class<EditPlayListNameFragment> superclass2 = EditPlayListNameFragment.class;
                    while (superclass2 != Object.class) {
                        Class<?>[] interfaces4 = superclass2.getInterfaces();
                        ArrayList arrayList2 = new ArrayList();
                        for (Class<?> cls4 : interfaces4) {
                            if (InterfaceC723730SaB.class.isAssignableFrom(cls4)) {
                                arrayList2.add(cls4);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            c724710Sbl2.LIZLLL((Class) it2.next(), this);
                        }
                        superclass2 = superclass2.getSuperclass();
                        if (superclass2 == null) {
                            break;
                        }
                    }
                    getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment$onCreate$lambda$2$$inlined$setAssemServiceState$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            if (C2022207w4.LIZ[event.ordinal()] == 1) {
                                C724710Sbl c724710Sbl3 = (C724710Sbl) c259800zU.element;
                                InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) this;
                                Class<?> superclass3 = interfaceC723730SaB.getClass();
                                Class<?>[] interfaces5 = superclass3.getInterfaces();
                                if (interfaces5 != null && interfaces5.length != 0) {
                                    while (superclass3 != Object.class) {
                                        Class<?>[] interfaces6 = superclass3.getInterfaces();
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Class<?> cls5 : interfaces6) {
                                            if (InterfaceC723730SaB.class.isAssignableFrom(cls5)) {
                                                arrayList3.add(cls5);
                                            }
                                        }
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            c724710Sbl3.LJ((Class) it3.next(), interfaceC723730SaB);
                                        }
                                        superclass3 = superclass3.getSuperclass();
                                        if (superclass3 == null) {
                                            break;
                                        }
                                    }
                                }
                                assemblerLIZ.xQ2(this);
                            }
                        }
                    });
                    assemblerLIZ.OQ2(this, (C724710Sbl) c259800zU.element);
                }
                ((C724710Sbl) c259800zU.element).LJI((Class) C13LP.LJJJJZI(arrayList), awS591S0100000_12);
            }
            String string = arguments.getString("mix_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLILLJJLI = string;
            Serializable serializable = arguments.getSerializable("key_mix_add_aweme_info");
            if (serializable != null) {
                LLIZLLLIL = (Aweme) serializable;
                RR().LLILZ = LLIZLLLIL;
            }
            Serializable serializable2 = arguments.getSerializable("key_playlist_cover");
            if (serializable2 != null) {
                MixCreateViewModel mixCreateViewModelRR = RR();
                if (serializable2 instanceof UrlModel) {
                    urlModel = (UrlModel) serializable2;
                }
                mixCreateViewModelRR.LLILZLL = urlModel;
            }
            this.LLILLL = Long.valueOf(arguments.getLong("moderated_rename_timestamp"));
            String string2 = arguments.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            this.LLILZ = str;
        }
    }

    private final void VR(Context context, String str) {
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(950599879, new C1220260hrM(this, str, context), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(C786410Ut5.j4(getString(2131850527), Arrays.copyOf(new Object[]{str}, 1)));
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(context, this, 35));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R aS(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void bS(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
    }

    public View NR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!C297000BkY.LIZ()) {
            i = R.layout.do0;
        } else {
            i = R.layout.dx0;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R ZR(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    public static View OR(EditPlayListNameFragment editPlayListNameFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewNR = editPlayListNameFragment.NR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewNR instanceof View)) {
            viewNR = null;
        }
        if (viewNR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewNR, editPlayListNameFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewNR, editPlayListNameFragment);
                viewNR.setTag(R.id.view_tree_saved_state_registry_owner, editPlayListNameFragment);
                C19EG activity = editPlayListNameFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewNR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewNR;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R WR(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 MR(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 UR(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
