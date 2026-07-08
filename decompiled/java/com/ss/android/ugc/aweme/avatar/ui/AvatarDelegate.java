package com.ss.android.ugc.aweme.avatar.ui;

import X.AbstractC1608790ry1;
import X.AbstractC1608810ry3;
import X.AbstractC1609080ryU;
import X.AbstractC1609640rzO;
import X.C01GW;
import X.C03IT;
import X.C1608610rxj;
import X.C1608620rxk;
import X.C1608750rxx;
import X.C1608760rxy;
import X.C1608770rxz;
import X.C1608980ryK;
import X.C1608990ryL;
import X.C1609000ryM;
import X.C1609070ryT;
import X.C1609150ryb;
import X.C1609360ryw;
import X.C1609400rz0;
import X.C1609410rz1;
import X.C1609420rz2;
import X.C1609510rzB;
import X.C1609600rzK;
import X.C1609610rzL;
import X.C1609650rzP;
import X.C2188811AlT;
import X.C2485509ob;
import X.C418440Gaw;
import X.C419460Gca;
import X.C427660Gpo;
import X.C427870Gq9;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1256840ioM;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.EnumC2006907tb;
import X.EnumC992500bw0;
import X.InterfaceC1605410rsZ;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import X.InterfaceC1608860ry8;
import X.InterfaceC1608870ry9;
import X.InterfaceC1609110ryX;
import X.InterfaceC1609290ryp;
import X.InterfaceC426680GoE;
import X.InterfaceC713050Ry3;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS13S0310000_24;
import Y.ARunnableS32S0400000_24;
import Y.ATListenerS456S0100000_24;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS87S1300000_24;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarDelegate implements InterfaceC1609290ryp, InterfaceC1607380rvk, Observer<C1608990ryL> {
    public static final HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> LLJJJIL = new HashMap<>();
    public AvatarComponentView LL;
    public C427660Gpo LLILLJJLI;
    public Context LLILLL;
    public C1609150ryb LLILZ;
    public C1609420rz2 LLILZIL;
    public C1609400rz0 LLILZLL;
    public C1608750rxx LLIZ;
    public HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> LLJ;
    public String LLJIJIL;
    public Object LLJILJIL;
    public C1609360ryw LLJILJILJ;
    public C1609070ryT LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public AtomicBoolean LLJJIII;
    public boolean LLJJIJI;
    public Function1<? super Map<EnumC1608710rxt, C1609000ryM>, Unit> LLJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(56));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(55));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(58));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(57));

    @Override // X.InterfaceC1609290ryp
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC1609290ryp
    public final HashMap<EnumC1608710rxt, View> LIZIZ() {
        C1609150ryb c1609150ryb = this.LLILZ;
        if (c1609150ryb == null) {
            c1609150ryb = null;
        }
        return c1609150ryb.LJII;
    }

    @Override // X.InterfaceC1609290ryp
    public final Map<EnumC1607270rvZ, InterfaceC1606880ruw> LJ() {
        HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map = this.LLJ;
        return map == null ? LLJJJIL : map;
    }

    @Override // X.InterfaceC1609290ryp
    public final C1609600rzK LJIIJJI() {
        C1609420rz2 c1609420rz2 = this.LLILZIL;
        if (c1609420rz2 != null) {
            return c1609420rz2.LIZIZ();
        }
        return null;
    }

    public final AvatarControllerVM LJIJJLI() {
        return (AvatarControllerVM) this.LLIZLLLIL.getValue();
    }

    public final boolean LJIL() {
        HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map;
        C1609400rz0 c1609400rz0 = this.LLILZLL;
        return (c1609400rz0 == null || !c1609400rz0.LJ || (map = this.LLJ) == null || map.isEmpty()) ? false : true;
    }

    @Override // X.InterfaceC1609290ryp
    public final boolean LIZ() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1609290ryp
    public final C1609360ryw LIZJ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1609290ryp
    public final int LJIIIZ() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1609290ryp
    public final int LJIIL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1607380rvk
    public final String LJJJJJ() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1609290ryp
    public final void LJII(C1608750rxx c1608750rxx) {
        Integer num;
        Integer num2;
        C1609400rz0 c1609400rz0;
        LifecycleOwner lifecycleOwner;
        C1609070ryT c1609070ryT;
        C1609420rz2 c1609420rz2;
        List<? extends EnumC2006907tb> list;
        C1609510rzB c1609510rzBLIZ;
        C1608760rxy c1608760rxy;
        Set<? extends InterfaceC1608860ry8<?>> set;
        Object obj;
        AvatarControllerVM avatarControllerVMLJIJJLI = LJIJJLI();
        Context context = this.LLILLL;
        if (context == null) {
            context = null;
        }
        avatarControllerVMLJIJJLI.LLILLL = c1608750rxx;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1608750rxx c1608750rxx2 = avatarControllerVMLJIJJLI.LLILLL;
        if (c1608750rxx2 != null && (c1608760rxy = c1608750rxx2.LIZIZ) != null && (set = c1608760rxy.LIZ) != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                InterfaceC1608860ry8 interfaceC1608860ry8 = (InterfaceC1608860ry8) it2.next();
                EnumC1607270rvZ enumC1607270rvZLIZ = interfaceC1608860ry8.LIZ();
                AbstractC1608810ry3 abstractC1608810ry3 = (AbstractC1608810ry3) ((LinkedHashMap) C1608770rxz.LIZ).get(enumC1607270rvZLIZ);
                if (abstractC1608810ry3 != null) {
                    Object objLIZIZ = abstractC1608810ry3.LIZIZ(interfaceC1608860ry8.getVariant());
                    AbstractC1608790ry1<STATE, VARIANT> abstractC1608790ry1LIZJ = abstractC1608810ry3.LIZJ(interfaceC1608860ry8.getVariant());
                    if (abstractC1608790ry1LIZJ != 0) {
                        abstractC1608790ry1LIZJ.LIZIZ = context;
                        obj = abstractC1608790ry1LIZJ;
                    } else {
                        obj = null;
                    }
                    ((Map) avatarControllerVMLJIJJLI.LLILZIL.getValue()).put(enumC1607270rvZLIZ, abstractC1608810ry3);
                    linkedHashMap.put(enumC1607270rvZLIZ, obj);
                    ((Map) avatarControllerVMLJIJJLI.LLILZLL.getValue()).put(enumC1607270rvZLIZ, interfaceC1608860ry8.getVariant());
                    ((Map) avatarControllerVMLJIJJLI.LLIZ.getValue()).put(enumC1607270rvZLIZ, objLIZIZ);
                    if ((objLIZIZ instanceof InterfaceC1608820ry4) && objLIZIZ != null) {
                        avatarControllerVMLJIJJLI.vQ2().put(enumC1607270rvZLIZ, objLIZIZ);
                    }
                }
            }
        }
        C1608980ryK c1608980ryK = (C1608980ryK) avatarControllerVMLJIJJLI.LLILLJJLI.getValue();
        C1608760rxy c1608760rxy2 = c1608750rxx.LIZIZ;
        Map<EnumC1607270rvZ, ? extends AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE>> map = (Map) avatarControllerVMLJIJJLI.LLILZIL.getValue();
        Map<EnumC1607270rvZ, ? extends InterfaceC1608870ry9<?, ?>> map2 = (Map) avatarControllerVMLJIJJLI.LLIZ.getValue();
        c1608980ryK.LIZIZ = c1608980ryK.LIZ.get(Integer.valueOf(c1608760rxy2.LIZIZ.getValue()));
        c1608980ryK.LIZJ = map;
        c1608980ryK.LIZLLL = map2;
        c1608980ryK.LJ = linkedHashMap;
        this.LLIZ = c1608750rxx;
        C1609400rz0 c1609400rz02 = c1608750rxx.LIZ;
        this.LLILZLL = c1609400rz02;
        if (c1609400rz02 != null && (c1609420rz2 = this.LLILZIL) != null && (list = c1609400rz02.LJIILL) != null && !list.isEmpty()) {
            C1608620rxk c1608620rxk = (C1608620rxk) c1609420rz2.LIZLLL.getValue();
            int avatarSizePx = c1608620rxk.LIZ.getAvatarSizePx();
            List<? extends EnumC2006907tb> list2 = c1609400rz02.LJIILL;
            if (list2 != null) {
                for (EnumC2006907tb enumC2006907tb : list2) {
                    Map<EnumC2006907tb, InterfaceC1609110ryX> map3 = C1608610rxj.LIZ;
                    AvatarComponentView avatarComponentView = c1608620rxk.LIZ;
                    InterfaceC1609110ryX interfaceC1609110ryX = (InterfaceC1609110ryX) ((LinkedHashMap) C1608610rxj.LIZ).get(enumC2006907tb);
                    if (interfaceC1609110ryX != null && (c1609510rzBLIZ = interfaceC1609110ryX.LIZ(avatarComponentView, c1608620rxk)) != null) {
                        c1608620rxk.LIZIZ.put(enumC2006907tb, c1609510rzBLIZ);
                    }
                }
            }
            for (Map.Entry entry : ((LinkedHashMap) c1608620rxk.LIZIZ).entrySet()) {
                entry.getKey();
                AbstractC1609080ryU abstractC1609080ryU = (AbstractC1609080ryU) entry.getValue();
                View viewLIZIZ = abstractC1609080ryU.LIZIZ();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(avatarSizePx, avatarSizePx);
                layoutParams.addRule(13);
                c1608620rxk.LIZ.addView(viewLIZIZ, layoutParams);
                abstractC1609080ryU.LIZJ();
            }
        }
        C1609400rz0 c1609400rz03 = this.LLILZLL;
        if (c1609400rz03 != null) {
            num = c1609400rz03.LJFF;
            num2 = c1609400rz03.LJI;
        } else {
            num = null;
            num2 = null;
        }
        LJIIJ(num, num2);
        C1609400rz0 c1609400rz04 = this.LLILZLL;
        if (c1609400rz04 != null && !c1609400rz04.LJIIIIZZ) {
            C427660Gpo c427660Gpo = this.LLILLJJLI;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            c427660Gpo.setForeground(null);
        }
        C1609400rz0 c1609400rz05 = this.LLILZLL;
        if (c1609400rz05 != null && Intrinsics.LJFF(c1609400rz05.LJIIJJI, Boolean.TRUE) && (c1609070ryT = this.LLJILLL) != null) {
            if (Intrinsics.LJFF(c1609070ryT.LIZ.getConfig().LIZ.LJIILIIL, Boolean.FALSE)) {
                c1609070ryT.LIZ.setOnTouchListener(new ATListenerS456S0100000_24(c1609070ryT, 11));
            } else {
                C786410Ut5.I7(new AbS703S0100000_24(c1609070ryT, 22), c1609070ryT.LIZ);
                c1609070ryT.LIZ.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(c1609070ryT, 6));
            }
        }
        if (!this.LLJJIJI && (c1609400rz0 = this.LLILZLL) != null && (lifecycleOwner = c1609400rz0.LIZ) != null) {
            LJIJJ(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIILL(int i) {
        EnumC992500bw0 enumC992500bw0;
        double d;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        int i2;
        if (this.LLJJ != i) {
            this.LLJJ = i;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            AvatarComponentView avatarComponentView = this.LL;
            ViewGroup.LayoutParams layoutParams6 = null;
            if (avatarComponentView == null) {
                avatarComponentView = null;
            }
            C427660Gpo avatar = avatarComponentView.getAvatar();
            ViewGroup.LayoutParams layoutParams7 = avatar.getLayoutParams();
            if (layoutParams7 != null) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
                layoutParams8.width = iLIZIZ;
                layoutParams8.height = iLIZIZ;
                C786410Ut5.W5(avatar, layoutParams8);
                AvatarComponentView avatarComponentView2 = this.LL;
                if (avatarComponentView2 == null) {
                    avatarComponentView2 = null;
                }
                avatarComponentView2.getAvatar().setSize(i);
                C1609420rz2 c1609420rz2 = this.LLILZIL;
                if (c1609420rz2 != null) {
                    c1609420rz2.LIZ().LJIIIIZZ.getAvatar().setSize(i);
                    C1609600rzK c1609600rzKLIZIZ = c1609420rz2.LIZIZ();
                    if (c1609600rzKLIZIZ != null) {
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                        C1609410rz1 c1609410rz1 = c1609600rzKLIZIZ.LJIIIIZZ.getConfig().LIZ.LJIIJ;
                        if (c1609410rz1 != null) {
                            enumC992500bw0 = c1609410rz1.LIZIZ;
                        } else {
                            enumC992500bw0 = null;
                        }
                        if (enumC992500bw0 == EnumC992500bw0.INNER_BORDER) {
                            d = 0.95d;
                        } else {
                            d = 1.1d;
                        }
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d * ((double) i))));
                        int i3 = (int) (((double) iLIZIZ3) * 1.1d);
                        ViewGroup viewGroupLJIIIIZZ = c1609600rzKLIZIZ.LJIIIIZZ();
                        if (viewGroupLJIIIIZZ != null) {
                            ViewGroup viewGroupLJIIIIZZ2 = c1609600rzKLIZIZ.LJIIIIZZ();
                            if (viewGroupLJIIIIZZ2 != null && (layoutParams5 = viewGroupLJIIIIZZ2.getLayoutParams()) != null) {
                                if (i3 < iLIZIZ2) {
                                    i2 = iLIZIZ2;
                                } else {
                                    i2 = i3;
                                }
                                layoutParams5.width = i2;
                                if (i3 < iLIZIZ2) {
                                    i3 = iLIZIZ2;
                                }
                                layoutParams5.height = i3;
                            } else {
                                layoutParams5 = null;
                            }
                            C786410Ut5.X5(layoutParams5, viewGroupLJIIIIZZ);
                        }
                        C427870Gq9 c427870Gq9 = (C427870Gq9) c1609600rzKLIZIZ.LJIIJ.getValue();
                        if (c427870Gq9 != null) {
                            View view = (View) c1609600rzKLIZIZ.LJIIJ.getValue();
                            if (view != null && (layoutParams4 = view.getLayoutParams()) != null) {
                                layoutParams4.width = iLIZIZ2;
                                layoutParams4.height = iLIZIZ2;
                            } else {
                                layoutParams4 = null;
                            }
                            C786410Ut5.F6(c427870Gq9, layoutParams4);
                        }
                        C419460Gca c419460GcaLJIILJJIL = c1609600rzKLIZIZ.LJIILJJIL();
                        if (c419460GcaLJIILJJIL != null) {
                            C419460Gca c419460GcaLJIILJJIL2 = c1609600rzKLIZIZ.LJIILJJIL();
                            if (c419460GcaLJIILJJIL2 != null && (layoutParams3 = c419460GcaLJIILJJIL2.getLayoutParams()) != null) {
                                layoutParams3.width = iLIZIZ3;
                                layoutParams3.height = iLIZIZ3;
                            } else {
                                layoutParams3 = null;
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419460GcaLJIILJJIL);
                            c419460GcaLJIILJJIL.setLayoutParams(layoutParams3);
                        }
                        C419460Gca c419460GcaLJIIZILJ = c1609600rzKLIZIZ.LJIIZILJ();
                        if (c419460GcaLJIIZILJ != null) {
                            C419460Gca c419460GcaLJIIZILJ2 = c1609600rzKLIZIZ.LJIIZILJ();
                            if (c419460GcaLJIIZILJ2 != null && (layoutParams2 = c419460GcaLJIIZILJ2.getLayoutParams()) != null) {
                                layoutParams2.width = iLIZIZ3;
                                layoutParams2.height = iLIZIZ3;
                            } else {
                                layoutParams2 = null;
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419460GcaLJIIZILJ);
                            c419460GcaLJIIZILJ.setLayoutParams(layoutParams2);
                        }
                        TuxIconView tuxIconViewLJIILL = c1609600rzKLIZIZ.LJIILL();
                        if (tuxIconViewLJIILL != null) {
                            TuxIconView tuxIconViewLJIILL2 = c1609600rzKLIZIZ.LJIILL();
                            if (tuxIconViewLJIILL2 != null && (layoutParams = tuxIconViewLJIILL2.getLayoutParams()) != null) {
                                layoutParams.width = C1609650rzP.LJ(i);
                                layoutParams.height = C1609650rzP.LJ(i);
                                layoutParams6 = layoutParams;
                            }
                            C786410Ut5.M6(tuxIconViewLJIILL, layoutParams6);
                        }
                        C419460Gca c419460GcaLJIILJJIL3 = c1609600rzKLIZIZ.LJIILJJIL();
                        if (c419460GcaLJIILJJIL3 != null) {
                            c419460GcaLJIILJJIL3.setAvatarWidthRatio(iLIZIZ2 / iLIZIZ3);
                        }
                        C419460Gca c419460GcaLJIIZILJ3 = c1609600rzKLIZIZ.LJIIZILJ();
                        if (c419460GcaLJIIZILJ3 != null) {
                            c419460GcaLJIIZILJ3.setAvatarWidthRatio(iLIZIZ2 / iLIZIZ3);
                        }
                        ViewGroup viewGroupLJIIIIZZ3 = c1609600rzKLIZIZ.LJIIIIZZ();
                        if (viewGroupLJIIIIZZ3 != null) {
                            viewGroupLJIIIIZZ3.requestLayout();
                        }
                    }
                    for (Map.Entry entry : ((LinkedHashMap) ((C1608620rxk) c1609420rz2.LIZLLL.getValue()).LIZIZ).entrySet()) {
                        View viewLIZIZ = ((AbstractC1609080ryU) entry.getValue()).LIZIZ();
                        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                        ViewGroup.LayoutParams layoutParams9 = viewLIZIZ.getLayoutParams();
                        layoutParams9.width = iLIZIZ4;
                        layoutParams9.height = iLIZIZ4;
                        C786410Ut5.W5(viewLIZIZ, layoutParams9);
                        entry.getValue().getClass();
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIILLIIL(AwS598S0100000_19 awS598S0100000_19) {
        this.LLJJJ = awS598S0100000_19;
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIJ(C03IT c03it) {
        C1609420rz2 c1609420rz2 = this.LLILZIL;
        if (c1609420rz2 != null) {
            C1609610rzL c1609610rzLLIZ = c1609420rz2.LIZ();
            AbstractC1609640rzO.LJIIJ(new AwS425S0200000_24(c1609610rzLLIZ, c03it, 100), c1609610rzLLIZ.LIZIZ);
        }
    }

    public final void LJIJJ(final LifecycleOwner lifecycleOwner) {
        Set<? extends InterfaceC1608860ry8<?>> set;
        C1608760rxy c1608760rxy;
        C1609400rz0 c1609400rz0 = this.LLILZLL;
        if (c1609400rz0 != null) {
            c1609400rz0.LIZ = lifecycleOwner;
        }
        this.LLJJIJI = true;
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        avatarComponentView.LIZ(1, new ACListenerS158S0100000_24(this, 4));
        new WeakReference(lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate$doInitLogic$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C1609420rz2 c1609420rz2 = this.LL.LLILZIL;
                if (c1609420rz2 != null) {
                    c1609420rz2.LIZ().LJIIL();
                    C1609600rzK c1609600rzKLIZIZ = c1609420rz2.LIZIZ();
                    if (c1609600rzKLIZIZ != null) {
                        c1609600rzKLIZIZ.LJIIL();
                    }
                    Iterator it2 = ((LinkedHashMap) ((C1608620rxk) c1609420rz2.LIZLLL.getValue()).LIZIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        ((Map.Entry) it2.next()).getValue().getClass();
                    }
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
        C1608750rxx c1608750rxx = this.LLIZ;
        if (c1608750rxx != null && (c1608760rxy = c1608750rxx.LIZIZ) != null) {
            set = c1608760rxy.LIZ;
        } else {
            set = null;
        }
        if (set != null && !set.isEmpty()) {
            LJIJJLI().LLJIJIL.observe(lifecycleOwner, this);
            AvatarControllerVM avatarControllerVMLJIJJLI = LJIJJLI();
            AvatarComponentView avatarComponentView2 = this.LL;
            if (avatarComponentView2 == null) {
                avatarComponentView2 = null;
            }
            avatarControllerVMLJIJJLI.getClass();
            avatarControllerVMLJIJJLI.LLJ = new WeakReference<>(lifecycleOwner);
            for (Map.Entry<EnumC1607270rvZ, InterfaceC1608820ry4<?, ?>> entry : avatarControllerVMLJIJJLI.vQ2().entrySet()) {
                entry.getKey();
                InterfaceC1608820ry4<?, ?> value = entry.getValue();
                if (value != null) {
                    value.LJ(avatarComponentView2, lifecycleOwner);
                }
            }
        }
        C1609400rz0 c1609400rz02 = this.LLILZLL;
        if (c1609400rz02 != null && c1609400rz02.LJIJ) {
            AvatarControllerVM avatarControllerVMLJIJJLI2 = LJIJJLI();
            avatarControllerVMLJIJJLI2.LLJILJIL = true;
            InterfaceC1608820ry4<?, ?> interfaceC1608820ry4 = avatarControllerVMLJIJJLI2.vQ2().get(EnumC1607270rvZ.STORY);
            if (interfaceC1608820ry4 != null) {
                interfaceC1608820ry4.LIZJ(null, this, null);
            }
        }
    }

    public final void LJJ(AtomicBoolean atomicBoolean) {
        if (!Intrinsics.LJFF(this.LLJJIII, atomicBoolean)) {
            this.LLJJIII = atomicBoolean;
            if (atomicBoolean != null && !atomicBoolean.get()) {
                for (Runnable runnable : (CopyOnWriteArrayList) this.LLJJIJIIJIL.getValue()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                ((CopyOnWriteArrayList) this.LLJJIJIIJIL.getValue()).clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007d A[SYNTHETIC] */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C1608990ryL r12) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate.onChanged(java.lang.Object):void");
    }

    @Override // X.InterfaceC1609290ryp
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (LJIL()) {
            if (layoutParams != null && layoutParams.width == this.LLJJI) {
                return;
            }
            C1609150ryb c1609150ryb = this.LLILZ;
            if (c1609150ryb == null) {
                c1609150ryb = null;
            }
            c1609150ryb.LIZJ(((C1608980ryK) LJIJJLI().LLILLJJLI.getValue()).LJII);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ryw] */
    @Override // X.InterfaceC1609290ryp
    public final void LIZLLL(Context context, AvatarComponentView avatarComponentView) {
        this.LL = avatarComponentView;
        C427660Gpo avatar = avatarComponentView.getAvatar();
        this.LLILLJJLI = avatar;
        this.LLILLL = context;
        AvatarComponentView avatarComponentView2 = this.LL;
        AvatarComponentView avatarComponentView3 = null;
        if (avatarComponentView2 == null) {
            avatarComponentView2 = null;
        }
        if (avatar == null) {
            avatar = null;
        }
        this.LLILZ = new C1609150ryb(avatarComponentView2, avatar, context);
        AvatarComponentView avatarComponentView4 = this.LL;
        if (avatarComponentView4 == null) {
            avatarComponentView4 = null;
        }
        this.LLILZIL = new C1609420rz2(avatarComponentView4);
        AvatarComponentView avatarComponentView5 = this.LL;
        if (avatarComponentView5 == null) {
            avatarComponentView5 = null;
        }
        this.LLJILJILJ = new InterfaceC1605410rsZ(avatarComponentView5) { // from class: X.0ryw
            public final AvatarComponentView LIZ;
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(614));

            @Override // X.InterfaceC1605410rsZ
            public final C11PQ LIZ() {
                return (C11PQ) this.LIZIZ.getValue();
            }

            {
                this.LIZ = avatarComponentView5;
            }

            @Override // X.InterfaceC1605410rsZ
            public final void LIZIZ(AwS638S0100000_24 awS638S0100000_24) {
                AvatarComponentView avatarComponentView6 = this.LIZ;
                C2211751BhN.LIZ(avatarComponentView6, new C1621010sHj(avatarComponentView6, awS638S0100000_24, 4));
            }
        };
        AvatarComponentView avatarComponentView6 = this.LL;
        if (avatarComponentView6 != null) {
            avatarComponentView3 = avatarComponentView6;
        }
        this.LLJILLL = new C1609070ryT(avatarComponentView3);
        LJIJJLI().LLILZ = new AwS603S0100000_24(this, 695);
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJFF(Canvas canvas, AwS425S0200000_24 awS425S0200000_24) {
        HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map = this.LLJ;
        if (map != null && !map.isEmpty()) {
            AvatarComponentView avatarComponentView = this.LL;
            AvatarComponentView avatarComponentView2 = null;
            if (avatarComponentView == null) {
                avatarComponentView = null;
            }
            float width = avatarComponentView.getWidth();
            AvatarComponentView avatarComponentView3 = this.LL;
            if (avatarComponentView3 != null) {
                avatarComponentView2 = avatarComponentView3;
            }
            canvas.saveLayer(0.0f, 0.0f, width, avatarComponentView2.getHeight(), null);
            awS425S0200000_24.invoke();
            canvas.restore();
            return;
        }
        awS425S0200000_24.invoke();
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJI(EnumC1607270rvZ enumC1607270rvZ, Function1<? super InterfaceC1606880ruw, Unit> function1) {
        HashMap map = (HashMap) this.LLJJIJIL.getValue();
        Object arrayList = map.get(enumC1607270rvZ);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(enumC1607270rvZ, arrayList);
        }
        ((List) arrayList).add(function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088 A[SYNTHETIC] */
    @Override // X.InterfaceC1609290ryp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.EnumC1607270rvZ r15, X.C1256520inq r16) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate.LJIIIIZZ(X.0rvZ, X.0inq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @Override // X.InterfaceC1609290ryp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.Integer r7, java.lang.Integer r8) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate.LJIIJ(java.lang.Integer, java.lang.Integer):void");
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIJI(Object obj, boolean z, EnumC1607270rvZ enumC1607270rvZ) {
        if (obj == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.LLJJIII;
        if (atomicBoolean != null && atomicBoolean.get()) {
            ((CopyOnWriteArrayList) this.LLJJIJIIJIL.getValue()).add(new ARunnableS13S0310000_24(this, obj, enumC1607270rvZ, 0));
            return;
        }
        LJJ(new AtomicBoolean(true));
        AvatarControllerVM avatarControllerVMLJIJJLI = LJIJJLI();
        AvatarControllerVM.wQ2(avatarControllerVMLJIJJLI, avatarControllerVMLJIJJLI.LL, obj, false, enumC1607270rvZ, false, 48);
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIILIIL(EnumC1607270rvZ enumC1607270rvZ, EnumC1256840ioM enumC1256840ioM, InterfaceC713050Ry3 interfaceC713050Ry3, boolean z) {
        ARunnableS32S0400000_24 aRunnableS32S0400000_24 = new ARunnableS32S0400000_24(this, enumC1607270rvZ, enumC1256840ioM, interfaceC713050Ry3, 3);
        AtomicBoolean atomicBoolean = this.LLJJIII;
        if (atomicBoolean != null && atomicBoolean.get() && !z) {
            ((CopyOnWriteArrayList) this.LLJJIJIIJIL.getValue()).add(aRunnableS32S0400000_24);
        } else {
            aRunnableS32S0400000_24.run();
        }
    }

    @Override // X.InterfaceC1607380rvk
    public final void LJIIZILJ(String str, Object obj, EnumC1607270rvZ enumC1607270rvZ, boolean z, Function1<Object, Unit> function1) {
        InterfaceC1606880ruw interfaceC1606880ruwLJFF;
        InterfaceC1606880ruw interfaceC1606880ruwLJFF2;
        InterfaceC1606880ruw interfaceC1606880ruw = null;
        if (obj != null && enumC1607270rvZ != null) {
            HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map = this.LLJ;
            if (map != null) {
                interfaceC1606880ruw = map.get(enumC1607270rvZ);
            }
            if (Intrinsics.LJFF(obj, interfaceC1606880ruw)) {
                return;
            }
        }
        if (function1 != null) {
            function1.invoke(this.LLJILJIL);
        }
        HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map2 = this.LLJ;
        if ((map2 == null || map2.get(enumC1607270rvZ) == null) && obj == null) {
            return;
        }
        AvatarControllerVM avatarControllerVMLJIJJLI = LJIJJLI();
        if (enumC1607270rvZ != null) {
            avatarControllerVMLJIJJLI.getClass();
            if (obj instanceof InterfaceC1606880ruw) {
                AbstractC1608810ry3 abstractC1608810ry3 = (AbstractC1608810ry3) ((Map) avatarControllerVMLJIJJLI.LLILZIL.getValue()).get(enumC1607270rvZ);
                if (abstractC1608810ry3 != null) {
                    interfaceC1606880ruwLJFF2 = abstractC1608810ry3.LJ((InterfaceC1606880ruw) obj);
                } else {
                    return;
                }
            } else {
                InterfaceC1608820ry4<?, ?> interfaceC1608820ry4 = avatarControllerVMLJIJJLI.vQ2().get(enumC1607270rvZ);
                if (interfaceC1608820ry4 == null) {
                    return;
                } else {
                    interfaceC1606880ruwLJFF2 = interfaceC1608820ry4.LJFF(obj);
                }
            }
            if (interfaceC1606880ruwLJFF2 != null) {
                AvatarControllerVM.wQ2(avatarControllerVMLJIJJLI, str, interfaceC1606880ruwLJFF2, z, enumC1607270rvZ, false, 48);
                return;
            }
            return;
        }
        for (Map.Entry<EnumC1607270rvZ, InterfaceC1608820ry4<?, ?>> entry : avatarControllerVMLJIJJLI.vQ2().entrySet()) {
            EnumC1607270rvZ key = entry.getKey();
            InterfaceC1608820ry4<?, ?> value = entry.getValue();
            if (value != null && (interfaceC1606880ruwLJFF = value.LJFF(obj)) != null) {
                AvatarControllerVM.wQ2(avatarControllerVMLJIJJLI, str, interfaceC1606880ruwLJFF, z, key, false, 48);
                return;
            }
        }
    }

    @Override // X.InterfaceC1609290ryp
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner, Object obj, String str, Function1 function1, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String simpleName;
        User user;
        C1609600rzK c1609600rzKLIZIZ;
        boolean z5;
        Pair<Boolean, ? extends C03IT> pairInvoke;
        LJJ(new AtomicBoolean(true));
        this.LLJILJIL = obj;
        String str2 = this.LLJIJIL;
        this.LLJIJIL = str;
        if (!this.LLJJIJI) {
            LJIJJ(lifecycleOwner);
        }
        if (!Intrinsics.LJFF(str2, str)) {
            this.LLJ = null;
            Iterator it2 = ((ConcurrentHashMap) this.LLJI.getValue()).entrySet().iterator();
            while (it2.hasNext()) {
                LJIILIIL((EnumC1607270rvZ) ((Map.Entry) it2.next()).getKey(), EnumC1256840ioM.END_ANIMATION, null, true);
            }
            LJJ(null);
            if (str2 != null) {
                C1609150ryb c1609150ryb = this.LLILZ;
                if (c1609150ryb == null) {
                    c1609150ryb = null;
                }
                AvatarComponentView avatarComponentView = c1609150ryb.LIZ;
                int childCount = avatarComponentView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = avatarComponentView.getChildAt(i);
                    if (!Intrinsics.LJFF(childAt, c1609150ryb.LIZIZ)) {
                        C786410Ut5.LJLLLLLL(8, childAt);
                    }
                }
            }
        }
        AvatarControllerVM avatarControllerVMLJIJJLI = LJIJJLI();
        if (obj == null) {
            avatarControllerVMLJIJJLI.getClass();
            z3 = false;
            z4 = true;
        } else {
            String str3 = avatarControllerVMLJIJJLI.LL;
            boolean z6 = !Intrinsics.LJFF(str3, str);
            if (z6) {
                AwS87S1300000_24 awS87S1300000_24 = new AwS87S1300000_24(avatarControllerVMLJIJJLI, str3, str, this, obj, 1);
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    awS87S1300000_24.invoke();
                } else {
                    C2485509ob.LIZIZ(new ARunnableS103S0100000_3((Object) awS87S1300000_24, 71));
                }
                avatarControllerVMLJIJJLI.LL = str;
            }
            z3 = false;
            z4 = true;
            AvatarControllerVM.wQ2(avatarControllerVMLJIJJLI, str, obj, z6, null, z, 8);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: avatar ");
        if (obj != null) {
            simpleName = obj.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        C2188811AlT.LIZIZ(sbLIZ);
        if (obj != null && !(obj instanceof User)) {
            if (function1 != null) {
                user = (User) function1.invoke(obj);
            } else {
                user = null;
            }
        } else {
            user = (User) obj;
        }
        C1609420rz2 c1609420rz2 = this.LLILZIL;
        if (c1609420rz2 != null) {
            Function0<? extends Pair<Boolean, ? extends C03IT>> function0 = ((C1609400rz0) c1609420rz2.LJ.getValue()).LJIIZILJ;
            if (function0 != null && (pairInvoke = function0.invoke()) != null && pairInvoke.getFirst().booleanValue() == z4) {
                C03IT second = pairInvoke.getSecond();
                C1609600rzK c1609600rzKLIZIZ2 = c1609420rz2.LIZIZ();
                if (c1609600rzKLIZIZ2 != null) {
                    c1609600rzKLIZIZ2.LJIJ(z4);
                }
                C1609610rzL c1609610rzLLIZ = c1609420rz2.LIZ();
                AbstractC1609640rzO.LJIIJ(new AwS425S0200000_24(c1609610rzLLIZ, second, 100), c1609610rzLLIZ.LIZIZ);
            } else {
                Map<EnumC2006907tb, AbstractC1609080ryU> map = ((C1608620rxk) c1609420rz2.LIZLLL.getValue()).LIZIZ;
                if (map != null) {
                    Iterator it3 = ((LinkedHashMap) map).entrySet().iterator();
                    while (it3.hasNext()) {
                        ((AbstractC1609080ryU) ((Map.Entry) it3.next()).getValue()).LIZ(user);
                    }
                }
                if (!c1609420rz2.LIZJ(user) && ((C1609400rz0) c1609420rz2.LJ.getValue()).LIZIZ) {
                    if (((C1609400rz0) c1609420rz2.LJ.getValue()).LJIIZILJ != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c1609420rz2.LIZ().LJ(user, z2, z5);
                }
                if (c1609420rz2.LIZJ(user) && (c1609600rzKLIZIZ = c1609420rz2.LIZIZ()) != null) {
                    c1609600rzKLIZIZ.LJ(user, z2, z3);
                }
            }
        }
        C1609420rz2 c1609420rz22 = this.LLILZIL;
        if (c1609420rz22 != null) {
            c1609420rz22.LIZ().LJIIJJI(str2, str);
            C1609600rzK c1609600rzKLIZIZ3 = c1609420rz22.LIZIZ();
            if (c1609600rzKLIZIZ3 != null) {
                c1609600rzKLIZIZ3.LJIIJJI(str2, str);
            }
        }
    }
}
