package com.ss.android.ugc.profile.business.ur.popup;

import X.AbstractC1623806Xk;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0RPA;
import X.C0XQ7;
import X.C0ZP4;
import X.C1169590gXd;
import X.C1169640gXi;
import X.C1169690gXn;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2022407w6;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C259800zU;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C634030Ott;
import X.C723850SaN;
import X.C724710Sbl;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1169600gXe;
import X.EnumC1169660gXk;
import X.EnumC1261820iwO;
import X.InterfaceC0148002o;
import X.InterfaceC1169630gXh;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC723730SaB;
import X.InterfaceC724530SbT;
import X.InterfaceC724720Sbm;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
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
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS29S0102000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AvatarAndNicknamePopup extends Fragment implements InterfaceC724530SbT, InterfaceC1169630gXh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiOSAjPTViCDkyPCQ+CCE3BiwvIiEyJSAcJj8mOA==";
    public EnumC1261820iwO LL;
    public final AssemVMLazy LLILLJJLI;
    public C1169690gXn LLILLL;
    public EnumC1169600gXe LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AvatarAndNicknamePopup.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/popup/AvatarAndNicknamePopupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    @Override // X.InterfaceC1169630gXh, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
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

    public AvatarAndNicknamePopup() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AvatarAndNicknamePopupViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2408);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(815);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2409), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 2410), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2411), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: PR, reason: merged with bridge method [inline-methods] */
    public C1169640gXi lt() {
        return new C1169640gXi(null);
    }

    public final AvatarAndNicknamePopupViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (AvatarAndNicknamePopupViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        bS(SR(), new AwS597S0100000_18(this, 622));
    }

    public final EnumC1261820iwO RR() {
        return this.LL;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final void WR(EnumC1261820iwO enumC1261820iwO) {
        this.LL = enumC1261820iwO;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AvatarAndNicknamePopupViewModel avatarAndNicknamePopupViewModelSR = SR();
        C1169690gXn c1169690gXn = this.LLILLL;
        if (c1169690gXn == null) {
            c1169690gXn = null;
        }
        avatarAndNicknamePopupViewModelSR.LL = c1169690gXn;
    }

    public final void UR(C1169690gXn c1169690gXn, EnumC1169600gXe enumC1169600gXe) {
        this.LLILLL = c1169690gXn;
        this.LLILZ = enumC1169600gXe;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R bS(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void cS(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    public View NR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ebt, viewGroup, false);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0gXg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169650gXj) obj).LL;
            }
        }, null, new AwS454S0200000_18(viewTd, this, 21), 6);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0gXf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169650gXj) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 208), 6);
        EnumC1169600gXe enumC1169600gXe = this.LLILZ;
        if (enumC1169600gXe == null) {
            enumC1169600gXe = null;
        }
        if (enumC1169600gXe == EnumC1169600gXe.ONLY_NICKNAME) {
            AvatarAndNicknamePopupViewModel avatarAndNicknamePopupViewModelSR = SR();
            EnumC1169660gXk enumC1169660gXk = EnumC1169660gXk.SET_UP_NICKNAME;
            avatarAndNicknamePopupViewModelSR.getClass();
            avatarAndNicknamePopupViewModelSR.setState(new AwS597S0100000_18(enumC1169660gXk, 623));
        } else {
            AvatarAndNicknamePopupViewModel avatarAndNicknamePopupViewModelSR2 = SR();
            EnumC1169660gXk enumC1169660gXk2 = EnumC1169660gXk.ADD_PROFILE;
            avatarAndNicknamePopupViewModelSR2.getClass();
            avatarAndNicknamePopupViewModelSR2.setState(new AwS597S0100000_18(enumC1169660gXk2, 623));
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 621), 3);
        return viewTd;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R aS(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.0Sbl] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, X.0Sbl] */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        super.onActivityResult(i, i2, intent);
        AwS29S0102000_18 awS29S0102000_18 = new AwS29S0102000_18(i, i2, intent, 0);
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            Class<AvatarAndNicknamePopup> superclass = AvatarAndNicknamePopup.class;
            Class<?>[] interfaces = superclass.getInterfaces();
            ArrayList arrayList2 = new ArrayList();
            for (Class<?> cls : interfaces) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                    arrayList2.add(cls);
                }
            }
            while (arrayList2.isEmpty()) {
                superclass = superclass.getSuperclass();
                if (superclass != null) {
                    Class<?>[] interfaces2 = superclass.getInterfaces();
                    arrayList2 = new ArrayList();
                    for (Class<?> cls2 : interfaces2) {
                        if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                            arrayList2.add(cls2);
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
                Class<?>[] interfaces3 = AvatarAndNicknamePopup.class.getInterfaces();
                int length = interfaces3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    Class<?> cls3 = interfaces3[i3];
                    if (InterfaceC723730SaB.class.isAssignableFrom(cls3)) {
                        if (cls3 != null) {
                            if (!c724710Sbl.LIZIZ.containsKey(new C634030Ott(cls3, LIZ()))) {
                                break;
                            }
                        }
                    } else {
                        i3++;
                    }
                }
                C724710Sbl c724710Sbl2 = (C724710Sbl) c259800zU.element;
                Class<AvatarAndNicknamePopup> superclass2 = AvatarAndNicknamePopup.class;
                while (superclass2 != Object.class) {
                    Class<?>[] interfaces4 = superclass2.getInterfaces();
                    ArrayList arrayList3 = new ArrayList();
                    for (Class<?> cls4 : interfaces4) {
                        if (InterfaceC723730SaB.class.isAssignableFrom(cls4)) {
                            arrayList3.add(cls4);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        c724710Sbl2.LIZLLL((Class) it2.next(), this);
                    }
                    superclass2 = superclass2.getSuperclass();
                    if (superclass2 == null) {
                        break;
                    }
                }
                getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.profile.business.ur.popup.AvatarAndNicknamePopup$onActivityResult$$inlined$setAssemServiceState$default$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (C2022407w6.LIZ[event.ordinal()] == 1) {
                            C724710Sbl c724710Sbl3 = (C724710Sbl) c259800zU.element;
                            InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) this;
                            Class<?> superclass3 = interfaceC723730SaB.getClass();
                            Class<?>[] interfaces5 = superclass3.getInterfaces();
                            if (interfaces5 != null && interfaces5.length != 0) {
                                while (superclass3 != Object.class) {
                                    Class<?>[] interfaces6 = superclass3.getInterfaces();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Class<?> cls5 : interfaces6) {
                                        if (InterfaceC723730SaB.class.isAssignableFrom(cls5)) {
                                            arrayList4.add(cls5);
                                        }
                                    }
                                    Iterator it3 = arrayList4.iterator();
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
            ((C724710Sbl) c259800zU.element).LJI((Class) C13LP.LJJJJZI(arrayList2), awS29S0102000_18);
        }
        if (i == 10002 && i2 != 0) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            List<String> list = curUser.boldFields;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = new ArrayList();
            }
            arrayList.add("photo");
            curUser.setBoldFields(arrayList);
            C1169690gXn c1169690gXn = SR().LL;
            if (c1169690gXn != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c1169690gXn.LIZ(c2344009Gk);
                C20684815ws.LJIILLIIL("show_update_avatar_success", c2344009Gk.LIZ);
            }
            EnumC1169600gXe enumC1169600gXe = this.LLILZ;
            if (enumC1169600gXe == null) {
                enumC1169600gXe = null;
            }
            if (C1169590gXd.LIZ[enumC1169600gXe.ordinal()] == 1) {
                AvatarAndNicknamePopupViewModel avatarAndNicknamePopupViewModelSR = SR();
                EnumC1169660gXk enumC1169660gXk = EnumC1169660gXk.PROFILE_ADDED;
                avatarAndNicknamePopupViewModelSR.getClass();
                avatarAndNicknamePopupViewModelSR.setState(new AwS597S0100000_18(enumC1169660gXk, 623));
                return;
            }
            AvatarAndNicknamePopupViewModel avatarAndNicknamePopupViewModelSR2 = SR();
            EnumC1169660gXk enumC1169660gXk2 = EnumC1169660gXk.PROFILE_ADDED_SET_UP_NICKNAME;
            avatarAndNicknamePopupViewModelSR2.getClass();
            avatarAndNicknamePopupViewModelSR2.setState(new AwS597S0100000_18(enumC1169660gXk2, 623));
        }
    }

    public static View OR(AvatarAndNicknamePopup avatarAndNicknamePopup, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewNR = avatarAndNicknamePopup.NR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewNR instanceof View)) {
            viewNR = null;
        }
        if (viewNR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewNR, avatarAndNicknamePopup.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewNR, avatarAndNicknamePopup);
                viewNR.setTag(R.id.view_tree_saved_state_registry_owner, avatarAndNicknamePopup);
                C19EG activity = avatarAndNicknamePopup.getActivity();
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

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R ZR(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
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

    public <S extends InterfaceC0148002o, A, B> C0ZP4 VR(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
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
