package com.ss.android.ugc.gamora.recorder.navi;

import X.AbstractC1622390sJx;
import X.AbstractC21363818j6;
import X.C13LP;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C1658310tFt;
import X.C1778860wOK;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C21367118jd;
import X.C579040MnO;
import X.C786410Ut5;
import X.EnumC1155090gAF;
import X.EnumC1778850wOJ;
import X.InterfaceC1159800gHq;
import X.InterfaceC1635880sfi;
import X.InterfaceC21362718iv;
import Y.ACListenerS166S0100000_32;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicSelectorHandler extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi, GenericLifecycleObserver {
    public final List<AbstractC21363818j6> LLILLJJLI;
    public final C19EG LLILLL;
    public AbstractC21363818j6 LLILZ;
    public AbstractC21363818j6 LLILZIL;
    public EnumC1778850wOJ LLILZLL;
    public C21367118jd LLIZ;
    public LinearLayout LLIZLLLIL;
    public Effect LLJ;
    public boolean LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final List<InterfaceC21362718iv> LLJILJILJ;

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    AbstractC21363818j6 abstractC21363818j6 = this.LLILZ;
                    if (abstractC21363818j6 != null) {
                        abstractC21363818j6.LJFF();
                    }
                    this.LLJIJIL.setValue(Boolean.FALSE);
                    return;
                }
                return;
            }
            C21367118jd c21367118jd = this.LLIZ;
            if (c21367118jd != null) {
                AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(this, 180);
                Boolean bool = c21367118jd.LLILLL;
                if (bool != null) {
                    awS611S0100000_32.invoke(Boolean.valueOf(bool.booleanValue()));
                }
            }
            C21367118jd c21367118jd2 = this.LLIZ;
            if (c21367118jd2 != null) {
                C786410Ut5.e2(c21367118jd2, 8);
            }
            this.LLJIJIL.setValue(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        List<InterfaceC21362718iv> list = this.LLJILJILJ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC21362718iv) it2.next()).LIZ()) {
                    return;
                }
            }
        }
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    AbstractC21363818j6 abstractC21363818j6 = this.LLILZ;
                    if (abstractC21363818j6 != null) {
                        abstractC21363818j6.LJIIJ();
                    }
                    this.LLJIJIL.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            C21367118jd c21367118jd = this.LLIZ;
            if (c21367118jd != null) {
                AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(this, 181);
                Boolean bool = c21367118jd.LLILLL;
                if (bool != null) {
                    awS611S0100000_32.invoke(Boolean.valueOf(bool.booleanValue()));
                }
            }
            C21367118jd c21367118jd2 = this.LLIZ;
            if (c21367118jd2 != null) {
                C786410Ut5.e2(c21367118jd2, 0);
            }
            this.LLJIJIL.setValue(Boolean.TRUE);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        AbstractC21363818j6 abstractC21363818j6;
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i == 1) {
                LJJIIJZLJL();
                AbstractC21363818j6 abstractC21363818j62 = this.LLILZ;
                if (abstractC21363818j62 != null) {
                    abstractC21363818j62.LJJIFFI();
                }
                AbstractC21363818j6 abstractC21363818j63 = this.LLILZIL;
                if (abstractC21363818j63 != null) {
                    abstractC21363818j63.LJJIFFI();
                }
            } else if (i == 2 && (abstractC21363818j6 = this.LLILZ) != null) {
                abstractC21363818j6.LJJIFFI();
            }
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLJ = null;
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        int i = enumC1778850wOJ == null ? -1 : C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1) {
            AbstractC21363818j6 abstractC21363818j6 = this.LLILZ;
            if (abstractC21363818j6 == null || this.LLILZIL == null) {
                return false;
            }
            if (!abstractC21363818j6.LJJII() && !this.LLILZIL.LJJII()) {
                return false;
            }
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            AbstractC21363818j6 abstractC21363818j62 = this.LLILZ;
            if (abstractC21363818j62 == null || !abstractC21363818j62.LJJII()) {
                return false;
            }
        }
        return true;
    }

    public final C21367118jd LJJIIJ() {
        C21367118jd c21367118jd = this.LLIZ;
        if (c21367118jd != null) {
            return c21367118jd;
        }
        C21367118jd c21367118jd2 = new C21367118jd(this.LLILLL);
        this.LLIZ = c21367118jd2;
        return c21367118jd2;
    }

    public final void LJJIIZ() {
        AbstractC21363818j6 abstractC21363818j6 = this.LLILZ;
        if (abstractC21363818j6 == null || this.LLILZIL == null) {
            return;
        }
        if (this.LLIZ == null) {
            this.LLJI = true;
            return;
        }
        View viewLJIJ = abstractC21363818j6.LJIJ();
        View viewLJIJ2 = this.LLILZIL.LJIJ();
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null) {
            C786410Ut5.LJJL(viewLJIJ, linearLayout);
        }
        LinearLayout linearLayout2 = this.LLIZLLLIL;
        if (linearLayout2 != null) {
            C786410Ut5.LJJL(viewLJIJ2, linearLayout2);
        }
        C21367118jd c21367118jdLJJIIJ = LJJIIJ();
        AbstractC21363818j6 abstractC21363818j62 = this.LLILZ;
        AbstractC21363818j6 abstractC21363818j63 = this.LLILZIL;
        c21367118jdLJJIIJ.LLILLL = null;
        C786410Ut5.e2(c21367118jdLJJIIJ, 0);
        c21367118jdLJJIIJ.LL = abstractC21363818j62;
        c21367118jdLJJIIJ.LLILLJJLI = abstractC21363818j63;
        c21367118jdLJJIIJ.LLIZLLLIL = abstractC21363818j62.LJIJ();
        c21367118jdLJJIIJ.LLJ = abstractC21363818j63.LJIJ();
        View viewLJIJ3 = abstractC21363818j62.LJIJ();
        if (viewLJIJ3 == null || viewLJIJ3.getParent() == null) {
            c21367118jdLJJIIJ.LLJJI.addView(c21367118jdLJJIIJ.LLIZLLLIL);
        }
        View viewLJIJ4 = abstractC21363818j63.LJIJ();
        if (viewLJIJ4 == null || viewLJIJ4.getParent() == null) {
            c21367118jdLJJIIJ.LLJJIII.addView(c21367118jdLJJIIJ.LLJ);
        }
        View viewLJIIL = abstractC21363818j62.LJIIL();
        View viewLJIIL2 = abstractC21363818j63.LJIIL();
        ViewGroup viewGroup = c21367118jdLJJIIJ.LLILZLL;
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(viewLJIIL);
        ViewGroup viewGroup2 = c21367118jdLJJIIJ.LLIZ;
        C786410Ut5.LJJJJI(viewGroup2);
        viewGroup2.addView(viewLJIIL2);
        C786410Ut5.K7(c21367118jdLJJIIJ.LLILZLL, new ACListenerS166S0100000_32(c21367118jdLJJIIJ, 99));
        C786410Ut5.K7(c21367118jdLJJIIJ.LLIZ, new ACListenerS166S0100000_32(c21367118jdLJJIIJ, 100));
        c21367118jdLJJIIJ.LIZJ();
    }

    public final void LJJIIJZLJL() {
        ValueAnimator valueAnimator;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View leftSelectorView = LJJIIJ().getLeftSelectorView();
        ViewParent parent = leftSelectorView != null ? leftSelectorView.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(leftSelectorView, viewGroup2);
        }
        View rightSelectorView = LJJIIJ().getRightSelectorView();
        ViewParent parent2 = rightSelectorView != null ? rightSelectorView.getParent() : null;
        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
            C786410Ut5.LJJJLZIJ(rightSelectorView, viewGroup);
        }
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null) {
            linearLayout.addView(leftSelectorView);
        }
        LinearLayout linearLayout2 = this.LLIZLLLIL;
        if (linearLayout2 != null) {
            linearLayout2.addView(rightSelectorView);
        }
        C21367118jd c21367118jdLJJIIJ = LJJIIJ();
        ValueAnimator valueAnimator2 = c21367118jdLJJIIJ.LLJILJILJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c21367118jdLJJIIJ.LLJILJILJ) != null) {
            valueAnimator.end();
        }
        if (c21367118jdLJJIIJ.LLJJ != 0 && c21367118jdLJJIIJ.LLJILLL != 0) {
            c21367118jdLJJIIJ.LLILZ.getLayoutParams().width = c21367118jdLJJIIJ.LLJJ;
            c21367118jdLJJIIJ.LLILZIL.getLayoutParams().width = c21367118jdLJJIIJ.LLJILLL;
        }
        c21367118jdLJJIIJ.LLJ = null;
        c21367118jdLJJIIJ.LLIZLLLIL = null;
        c21367118jdLJJIIJ.LLJIJIL = null;
        c21367118jdLJJIIJ.LLJILJIL = null;
        C786410Ut5.e2(LJJIIJ(), 8);
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLJILJILJ).add(c579040MnO);
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
        ((ArrayList) this.LLJILJILJ).remove(c579040MnO);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        AbstractC21363818j6 abstractC21363818j6;
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i != 1) {
                if (i == 2 && (abstractC21363818j6 = this.LLILZ) != null) {
                    abstractC21363818j6.LIZLLL(enumC1155090gAF);
                    return;
                }
                return;
            }
            Iterator<AbstractC21363818j6> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(enumC1155090gAF);
            }
            if (this.LLJI) {
                this.LLJI = false;
                LJJIIZ();
                return;
            }
            C21367118jd c21367118jd = this.LLIZ;
            if (c21367118jd != null) {
                C786410Ut5.e2(c21367118jd, 0);
            }
            C21367118jd c21367118jd2 = this.LLIZ;
            if (c21367118jd2 == null) {
                return;
            }
            if (Intrinsics.LJFF(c21367118jd2.LLILLL, Boolean.TRUE)) {
                c21367118jd2.LIZIZ(c21367118jd2.LLILZIL, c21367118jd2.LLILZ);
            } else {
                c21367118jd2.LIZIZ(c21367118jd2.LLILZ, c21367118jd2.LLILZIL);
            }
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        Iterator<AbstractC21363818j6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(view);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.f760net);
        this.LLIZLLLIL = linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(LJJIIJ());
        }
        if (this.LLJI) {
            LIZLLL(EnumC1155090gAF.AFTER_ANIMATE);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        AbstractC21363818j6 abstractC21363818j6;
        EnumC1778850wOJ enumC1778850wOJ = this.LLILZLL;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i != 1) {
                if (i == 2 && (abstractC21363818j6 = this.LLILZ) != null) {
                    abstractC21363818j6.LJIIZILJ(enumC1155090gAF);
                    return;
                }
                return;
            }
            Iterator<AbstractC21363818j6> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIZILJ(enumC1155090gAF);
            }
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        Iterator<AbstractC21363818j6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJI(c1627370sRz)) {
                if (!Intrinsics.LJFF(this.LLJ, c1627370sRz.LIZ)) {
                    LJJIFFI();
                    return true;
                }
                if (this.LLILZLL != EnumC1778850wOJ.Dynamic) {
                    return true;
                }
                LJJIIJZLJL();
                return true;
            }
        }
        return false;
    }

    public DynamicSelectorHandler(C19GS c19gs, List list) {
        this.LLILLJJLI = list;
        this.LLILLL = c19gs;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = mutableLiveData;
        this.LLJILJILJ = new ArrayList();
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        EnumC1778850wOJ enumC1778850wOJ = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLJ = null;
        List<AbstractC21363818j6> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (AbstractC21363818j6 abstractC21363818j6 : list) {
            if (abstractC21363818j6.LJJI(c1627370sRz)) {
                arrayList.add(abstractC21363818j6);
            }
        }
        this.LLILZ = (AbstractC21363818j6) C13LP.LJJJLL(arrayList);
        this.LLILZIL = (AbstractC21363818j6) C13LP.LJJJLZIJ(1, arrayList);
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                enumC1778850wOJ = EnumC1778850wOJ.Dynamic;
            } else {
                enumC1778850wOJ = EnumC1778850wOJ.Single;
            }
        }
        this.LLILZLL = enumC1778850wOJ;
        if (enumC1778850wOJ != null) {
            int i = C1778860wOK.LIZ[enumC1778850wOJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C1658310tFt.LIZ("Call DynamicSelectorHandler to create a tray");
                    AbstractC21363818j6 abstractC21363818j62 = this.LLILZ;
                    if (abstractC21363818j62 != null) {
                        abstractC21363818j62.LJJIII(c1623370sLX, c1627370sRz);
                    }
                }
            } else {
                AbstractC21363818j6 abstractC21363818j63 = this.LLILZ;
                if (abstractC21363818j63 != null) {
                    abstractC21363818j63.LJJIII(c1623370sLX, c1627370sRz);
                }
                AbstractC21363818j6 abstractC21363818j64 = this.LLILZIL;
                if (abstractC21363818j64 != null) {
                    abstractC21363818j64.LJJIII(c1623370sLX, c1627370sRz);
                }
                LJJIIZ();
            }
        }
        this.LLJ = c1627370sRz.LIZ;
    }
}
