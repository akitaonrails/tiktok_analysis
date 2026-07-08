package com.ss.android.ugc.tiktok.im.contact.selector.impl.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0QSJ;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1224840hyk;
import X.C1266330j3f;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1770850wBP;
import X.C1848410yCV;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C687700QyG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS393S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSelectedListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import u4.q0;

/* JADX INFO: loaded from: classes15.dex */
public final class SelectorSelectedContactCell extends PowerCell<C1224840hyk> implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public C127G LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorSelectedContactCell.class, "selectorSelectedListVM", "getSelectorSelectedListVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSelectedListVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorSelectedContactCell.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cv6;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZKW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1223570hwh) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 41), 4);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(L5() ? 56 : 48)));
        View view = (View) this.LLILZIL.getValue();
        ViewGroup.LayoutParams layoutParams = ((View) this.LLILZIL.getValue()).getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
        Integer numLIZJ = C1308910kAL.LIZJ(L5() ? R.attr.a1h : R.attr.a1k, this.itemView.getContext());
        if (numLIZJ != null) {
            ((TextView) this.LLIZ.getValue()).setTextColor(numLIZJ.intValue());
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(L5() ? 26 : 18)));
        TuxIconView tuxIconView = (TuxIconView) this.LLILZLL.getValue();
        ViewGroup.LayoutParams layoutParams2 = ((View) this.LLILZLL.getValue()).getLayoutParams();
        layoutParams2.width = iLIZIZ2;
        layoutParams2.height = iLIZIZ2;
        C786410Ut5.M6(tuxIconView, layoutParams2);
        View.OnClickListener aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(this, 52);
        C786410Ut5.a9((TuxIconView) this.LLILZLL.getValue(), aCListenerS149S0100000_14);
        View view2 = (View) this.LLILZIL.getValue();
        if (C1848410yCV.LIZ) {
            aCListenerS149S0100000_14 = new f(aCListenerS149S0100000_14);
        }
        a aVar = new a(aCListenerS149S0100000_14);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(view2);
        }
        view2.setOnClickListener(aVar);
        q0.LJIJ(this.itemView, new C1266330j3f(1));
    }

    public SelectorSelectedContactCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorSelectedListVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 1234);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(349);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1221), awS558S0100000_14, AFwS201S0000000_14.get$arr$(330), new AwS558S0100000_14((C03K6) this, 1211), new AwS558S0100000_14((C03K6) this, 1222), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1225), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1228), null, new AwS558S0100000_14((C03K6) this, 1231));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 1207);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1209);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 1212);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 68));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 1217);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 1220);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 1223);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 1226);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 1229);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1232), awS558S0100000_14, AFwS201S0000000_14.get$arr$(335), new AwS558S0100000_14((C03K6) this, 1236), new AwS558S0100000_14((C03K6) this, 1238), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1240), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1242), null, new AwS558S0100000_14((C03K6) this, 1185));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1188), awS558S0100000_14, AFwS201S0000000_14.get$arr$(331), new AwS558S0100000_14((C03K6) this, 1192), new AwS558S0100000_14((C03K6) this, 1194), new AwS558S0100000_14((C03K6) this, 1199), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 1201));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorContainerVM.class);
        AwS558S0100000_14 awS558S0100000_1410 = new AwS558S0100000_14(c19719912DlLIZ2, 1203);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(350);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1206), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(334), new AwS558S0100000_14((C03K6) this, 1210), new AwS558S0100000_14((C03K6) this, 1213), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1215), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1218), null, new AwS558S0100000_14((C03K6) this, 1224));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_1411 = new AwS558S0100000_14((C03K6) this, 1227);
            AwS558S0100000_14 awS558S0100000_1412 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1230);
            AwS558S0100000_14 awS558S0100000_1413 = new AwS558S0100000_14(c19719912DlLIZ2, 1233);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_1411, 69));
            AwS558S0100000_14 awS558S0100000_1414 = new AwS558S0100000_14(c01gwLIZIZ2, 1235);
            AwS558S0100000_14 awS558S0100000_1415 = new AwS558S0100000_14(c01gwLIZIZ2, 1237);
            AwS558S0100000_14 awS558S0100000_1416 = new AwS558S0100000_14(c01gwLIZIZ2, 1239);
            AwS558S0100000_14 awS558S0100000_1417 = new AwS558S0100000_14(c01gwLIZIZ2, 1241);
            AwS558S0100000_14 awS558S0100000_1418 = new AwS558S0100000_14(c01gwLIZIZ2, 1186);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1413, awS558S0100000_1410, new C452080Ho6(), awS558S0100000_1414, awS558S0100000_1415, awS558S0100000_1412, aFwS248S0000000_142, awS558S0100000_1416, awS558S0100000_1417, awS558S0100000_1418);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1190), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(332), new AwS558S0100000_14((C03K6) this, 1195), new AwS558S0100000_14((C03K6) this, 1197), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 1200), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1202), null, new AwS558S0100000_14((C03K6) this, 1204));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1205), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(333), new AwS558S0100000_14((C03K6) this, 1208), new AwS558S0100000_14((C03K6) this, 1214), new AwS558S0100000_14((C03K6) this, 1216), aFwS248S0000000_142, null, null, new AwS558S0100000_14((C03K6) this, 1219));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1193));
        this.LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1187));
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1191));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1198));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1189));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1196));
    }

    public final C0QSJ I5() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJILJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJILJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final boolean L5() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float fLIZIZ;
        float fLIZIZ2;
        int i;
        int i2;
        C1224840hyk c1224840hyk = (C1224840hyk) interfaceC1891350zJl;
        super.onBindItemView(c1224840hyk);
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (L5()) {
            fLIZIZ = C418440Gaw.LIZIZ(24);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (L5()) {
            fLIZIZ2 = C418440Gaw.LIZIZ(24);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(fLIZIZ2);
        c419910GdJ.LIZ = R.raw.icon_x_mark_circle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        if (L5()) {
            i = 26;
        } else {
            i = 18;
        }
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (L5()) {
            i2 = 26;
        } else {
            i2 = 18;
        }
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        ((TuxIconView) this.LLILZLL.getValue()).setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
        ((IDMAvatarLoader) this.LLIZLLLIL.getValue()).LIZIZ(c1224840hyk.LLILZ, c1224840hyk.LLILZIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        ((TextView) this.LLIZ.getValue()).setText(c1224840hyk.LLILZLL);
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
