package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import X.AnonymousClass1247;
import X.C01GW;
import X.C0GTU;
import X.C123J;
import X.C123K;
import X.C13LP;
import X.C15O7;
import X.C194561119z;
import X.C196925122x;
import X.C196932123e;
import X.C19774512Yl;
import X.C21645419nQ;
import X.C452501pT;
import X.C560530Lyd;
import X.InterfaceC1444160ngU;
import X.InterfaceC1457400o1q;
import X.InterfaceC196910122i;
import X.InterfaceC196915122n;
import X.InterfaceC196928123a;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditTextStickerViewModel extends LifecycleAwareViewModel<FTCEditTextStickerViewState> implements InterfaceC1444160ngU, InterfaceC1457400o1q {
    public static final AnonymousClass1247 LLJJI = new Object() { // from class: X.1247
    };
    public static final int LLJJIII = 8;
    public MutableLiveData<Boolean> LLILZLL;
    public boolean LLJI;
    public Pair<Integer, Integer> LLJIJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(82));
    public final List<C196925122x> LLIZLLLIL = new ArrayList();
    public boolean LLJ = true;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(83));
    public final C560530Lyd<Unit> LLJILJILJ = new C560530Lyd<>();
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJILLL = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLJJ = new C560530Lyd<>();

    @Override // X.InterfaceC1457400o1q
    public InterfaceC1444160ngU LJJIFFI() {
        return this;
    }

    private final C123J mR2() {
        return (C123J) this.LLJILJIL.getValue();
    }

    private final List<C196925122x> rR2() {
        return C13LP.LJLLLL(new Comparator() { // from class: X.123M
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C196925122x) obj).LLJLL - ((C196925122x) obj2).LLJLL;
            }
        }, this.LLIZLLLIL);
    }

    public final int Ir0() {
        return this.LLIZLLLIL.size();
    }

    @Override // X.InterfaceC1457400o1q
    public boolean LJJJLZIJ() {
        setState(AFwS273S0000000_29.get$arr$(52));
        boolean z = false;
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            C123K c123k = c196925122x.LLILZ;
            boolean z2 = c196925122x.LLJJIJIIJIL.LJIIIIZZ;
            c123k.LJI = z2;
            if (z2) {
                c196925122x.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC1457400o1q
    public void LLLLJ() {
        setState(AFwS273S0000000_29.get$arr$(59));
    }

    @Override // X.InterfaceC1457400o1q
    public boolean LLLLZLLIL() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LLILZLL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.InterfaceC1457400o1q
    public void Md() {
        setState(AFwS273S0000000_29.get$arr$(55));
    }

    public final Iterator<C196925122x> OV1() {
        return this.LLIZLLLIL.listIterator();
    }

    public final void R02() {
        this.LLIZLLLIL.clear();
    }

    public final int T10() {
        if (this.LLIZLLLIL.isEmpty()) {
            return 0;
        }
        int size = this.LLIZLLLIL.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            for (TextStickerTextWrap textStickerTextWrap : ((C196925122x) ListProtector.get(this.LLIZLLLIL, i)).getTextWrapList()) {
                if (textStickerTextWrap != null) {
                    size2 += textStickerTextWrap.safeStrPair().second.size();
                }
            }
        }
        return size2;
    }

    public final C196925122x Zn0() {
        if (this.LLIZLLLIL.isEmpty()) {
            return null;
        }
        return (C196925122x) ListProtector.get(this.LLIZLLLIL, 0);
    }

    public final boolean ab1() {
        return this.LLIZLLLIL.isEmpty();
    }

    @Override // X.InterfaceC1457400o1q
    public void d3() {
        setState(AFwS273S0000000_29.get$arr$(57));
    }

    @Override // X.InterfaceC1457400o1q
    public void i() {
        setState(AFwS273S0000000_29.get$arr$(56));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: kR2, reason: merged with bridge method [inline-methods] */
    public FTCEditTextStickerViewState zQ2() {
        return new FTCEditTextStickerViewState(new C194561119z(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final MutableLiveData<Pair<Float, Boolean>> lR2() {
        return (MutableLiveData) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1457400o1q
    public void show() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(58));
    }

    @Override // X.InterfaceC1457400o1q
    public boolean LJLL() {
        return !ab1();
    }

    private final List<C196925122x> ht() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1457400o1q
    public C560530Lyd<Unit> H1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1457400o1q
    public List<C196925122x> LLLLLLZZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1457400o1q
    public C560530Lyd<Boolean> c2() {
        return this.LLJJ;
    }

    public final boolean nR2() {
        return this.LLJI;
    }

    public final boolean oR2() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1457400o1q
    public C560530Lyd<Pair<Boolean, Boolean>> u2() {
        return this.LLJILLL;
    }

    public final void DJ2(long j) {
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            c196925122x.setPlayPosition(j);
            c196925122x.LJJII();
        }
    }

    public final boolean E2(C21645419nQ c21645419nQ) {
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJJLI(c21645419nQ)) {
                return true;
            }
        }
        return false;
    }

    public final void IH1(C196925122x c196925122x) {
        this.LLIZLLLIL.remove(c196925122x);
        ListProtector.add(this.LLIZLLLIL, 0, c196925122x);
    }

    public final void IQ1(C196925122x c196925122x) {
        ListProtector.add(this.LLIZLLLIL, 0, c196925122x);
    }

    @Override // X.InterfaceC1457400o1q
    public void Jl(InterfaceC196910122i interfaceC196910122i) {
        setState(new AwS608S0100000_29(interfaceC196910122i, 93));
    }

    @Override // X.InterfaceC1457400o1q
    public void LJJJJJ(int i) {
        setState(new AwS41S0001000_29(i, 4));
    }

    public final boolean LJJLIIIJLJLI(float f) {
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJJ(f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LLLZLZ(b bVar) {
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJI(bVar)) {
                setState(AFwS273S0000000_29.get$arr$(53));
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1457400o1q
    public void Ss(InterfaceC196915122n interfaceC196915122n) {
        setState(new AwS608S0100000_29(interfaceC196915122n, 94));
    }

    @Override // X.InterfaceC1457400o1q
    public void T3(Function1<? super C196925122x, Unit> function1) {
        setState(new AwS608S0100000_29(function1, 95));
    }

    @Override // X.InterfaceC1457400o1q
    public void V1(Function2<? super C196925122x, ? super C196925122x, Unit> function2) {
        setState(new AwS608S0100000_29(function2, 92));
    }

    public final void Yo(C196925122x c196925122x) {
        this.LLIZLLLIL.remove(c196925122x);
    }

    @Override // X.InterfaceC1457400o1q
    public void Z3(MutableLiveData<Boolean> mutableLiveData) {
        this.LLILZLL = mutableLiveData;
    }

    @Override // X.InterfaceC1457400o1q
    public void Ze(C196925122x c196925122x) {
        setState(new AwS608S0100000_29(c196925122x, 98));
    }

    @Override // X.InterfaceC1457400o1q
    public void a2(boolean z) {
        setState(new AwS41S0010000_29(z, 7));
        MutableLiveData<Boolean> mutableLiveData = this.LLILZLL;
        if (mutableLiveData != null && !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1457400o1q
    public void b(Pair<Integer, Integer> pair) {
        if (this.LLJIJIL == null) {
            this.LLJIJIL = pair;
        }
        setState(new AwS608S0100000_29(pair, (Pair<Integer, Integer>) 96));
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.LLJI = false;
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJIJIIJIL.LJIIIZ = 2;
        }
        Iterator<C196925122x> it3 = this.LLIZLLLIL.iterator();
        while (it3.hasNext()) {
            if (it3.next().LJIJ(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIL(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLJ) {
            return false;
        }
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            if (c196925122x.LJJ(scaleGestureDetector)) {
                setState(new AwS608S0100000_29(c196925122x, 91));
                return true;
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean onUp(MotionEvent motionEvent) {
        if (!this.LLJ) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJIFFI(motionEvent)) {
                setState(AFwS273S0000000_29.get$arr$(54));
                return true;
            }
        }
        return false;
    }

    public final void pR2(boolean z) {
        this.LLJI = z;
    }

    public final void qR2(boolean z) {
        this.LLJ = z;
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().setEnableEdit(this.LLJ);
        }
    }

    @Override // X.InterfaceC1457400o1q
    public void setEnable(boolean z) {
        qR2(z);
    }

    @Override // X.InterfaceC1444160ngU
    public boolean ve1(RectF rectF) {
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            PointF[] anglePointList = it2.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF rectFLIZIZ = C0GTU.LIZIZ(anglePointList);
                if (rectFLIZIZ.top < rectF.top || rectFLIZIZ.bottom > rectF.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1457400o1q
    public void zl(InterfaceC196928123a interfaceC196928123a) {
        setState(new AwS608S0100000_29(interfaceC196928123a, 97));
    }

    private final PointF sR2(PointF pointF, Context context) {
        int screenWidth;
        int screenHeight;
        PointF pointF2 = new PointF();
        Pair<Integer, Integer> pair = this.LLJIJIL;
        if (pair != null) {
            screenWidth = pair.getFirst().intValue();
            screenHeight = pair.getSecond().intValue();
        } else if (context != null) {
            screenWidth = ScreenUtils.getScreenWidth(context);
            screenHeight = ScreenUtils.getScreenHeight(context);
        } else {
            screenWidth = 0;
            screenHeight = 0;
        }
        AnonymousClass1247 anonymousClass1247 = LLJJI;
        float f = (pointF.x * 1.0f) / screenWidth;
        anonymousClass1247.getClass();
        pointF2.set(new BigDecimal(f).setScale(4, 1).floatValue(), new BigDecimal((pointF.y * 1.0f) / screenHeight).setScale(4, 1).floatValue());
        return pointF2;
    }

    public final void CU1(float f, boolean z) {
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(f, z);
        }
    }

    public final void Ct(TextStickerData textStickerData, boolean z) {
        setStateImmediate(new AwS115S0110000_29(textStickerData, z, 1));
    }

    public final void iJ2(float f, boolean z) {
        lR2().setValue(new Pair<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    public final C15O7<List<TextStickerCompileResult>> jR2(String str, ViewGroup viewGroup) {
        LJJJLZIJ();
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            arrayList.add(mR2().LIZ(c196925122x, viewGroup, str, 0, 0, 0, 0).LJIILLIIL(new C19774512Yl(c196925122x, 7)));
        }
        return C15O7.LJJI(arrayList);
    }

    @Override // X.InterfaceC1457400o1q
    public C15O7<List<TextStickerCompileResult>> jT1(C196932123e c196932123e, ViewGroup viewGroup) {
        LJJJLZIJ();
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            arrayList.add(mR2().LIZ(c196925122x, viewGroup, c196932123e.LIZ, c196932123e.LIZIZ, c196932123e.LIZJ, c196932123e.LIZLLL, c196932123e.LJ).LJIILLIIL(new C19774512Yl(c196925122x, 8)));
        }
        return C15O7.LJJI(arrayList);
    }

    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        if (!this.LLJ) {
            return false;
        }
        for (C196925122x c196925122x : this.LLIZLLLIL) {
            if (c196925122x.LJJIJIIJIL()) {
                c196925122x.LLJZ = c196925122x.LJIILJJIL(f, f2);
                c196925122x.LLJJIJIIJIL.LIZJ(f, f2);
                if (c196925122x.LLJZIJLIL || c196925122x.LLL || c196925122x.LLJZ || c196925122x.LLJJIJIIJIL.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LLJI) {
            return false;
        }
        this.LLJI = false;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C196925122x> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }
}
