package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.AnonymousClass1258;
import X.C01GW;
import X.C0GTT;
import X.C121Q;
import X.C125P;
import X.C125R;
import X.C125U;
import X.C125V;
import X.C125X;
import X.C125Y;
import X.C13LP;
import X.C167O;
import X.C19377210rS;
import X.C194561119z;
import X.C201955140j;
import X.C21645419nQ;
import X.C2188811AlT;
import X.C385670FAf;
import X.C452501pT;
import X.C529130Kp5;
import X.C560530Lyd;
import X.C844470XAv;
import X.InterfaceC196985125f;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS120S0110000_35;
import kotlin.jvm.internal.AwS149S1100000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS85S1000000_35;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: loaded from: classes30.dex */
public final class EditTextStickerViewModel extends LifecycleAwareViewModel<EditTextStickerViewState> implements InterfaceC196985125f, C125V {
    public static final C19377210rS LLJJJ = new C19377210rS();
    public static final int LLJJJIL = 8;
    public boolean LLILZLL;
    public TextStickerData LLIZLLLIL;
    public MutableLiveData<Boolean> LLJ;
    public boolean LLJI;
    public boolean LLJJ;
    public Pair<Integer, Integer> LLJJI;
    public final MutableLiveData<TextStickerData> LLIZ = new MutableLiveData<>();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(97));
    public final List<C125R> LLJILJIL = new ArrayList();
    public boolean LLJILJILJ = true;
    public boolean LLJILLL = true;
    public final C560530Lyd<Unit> LLJJIII = new C560530Lyd<>();
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJJIJI = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLJJIJIIJIL = new C560530Lyd<>();
    public final h0<Boolean> LLJJIJIL = new h0<>(Boolean.FALSE);

    @Override // X.C125V
    public void Dc0() {
        CU1(0.0f, false);
    }

    @Override // X.C125V
    public InterfaceC196985125f LJJIFFI() {
        return this;
    }

    private final List<C125R> CR2() {
        return C13LP.LJLLLL(new Comparator() { // from class: X.125Z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C125R) obj).LLJJL - ((C125R) obj2).LLJJL;
            }
        }, this.LLJILJIL);
    }

    @Override // X.C125V
    public void DJ0() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(69));
    }

    @Override // X.C125V
    public void Fo() {
        setState(AFwS283S0000000_35.get$arr$(73));
    }

    public final int Ir0() {
        List<C125R> list = this.LLJILJIL;
        ArrayList arrayList = new ArrayList();
        for (C125R c125r : list) {
            if (C125P.LIZ(c125r)) {
                arrayList.add(c125r);
            }
        }
        return arrayList.size();
    }

    @Override // X.C125V
    public boolean LJJJLZIJ() {
        setState(AFwS283S0000000_35.get$arr$(70));
        boolean z = false;
        for (C125R c125r : this.LLJILJIL) {
            C125Y c125y = c125r.LLILZ;
            boolean z2 = c125r.LLJJI.LJIIIIZZ;
            c125y.LJI = z2;
            if (z2) {
                c125r.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.C125V
    public void LLJJIJIL() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(63));
    }

    @Override // X.C125V
    public void LLLLJ() {
        setState(AFwS283S0000000_35.get$arr$(68));
    }

    @Override // X.C125V
    public boolean LLLLZLLIL() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LLJ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C125V
    public void Md() {
        setState(AFwS283S0000000_35.get$arr$(74));
    }

    public final Iterator<C125R> OV1() {
        return this.LLJILJIL.listIterator();
    }

    public final void R02() {
        this.LLJILJIL.clear();
    }

    @Override // X.C125V
    public void T1() {
        setState(AFwS283S0000000_35.get$arr$(62));
    }

    public final int T10() {
        if (this.LLJILJIL.isEmpty()) {
            return 0;
        }
        int size = this.LLJILJIL.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            for (TextStickerTextWrap textStickerTextWrap : ((C125R) ListProtector.get(this.LLJILJIL, i)).getTextWrapList()) {
                if (textStickerTextWrap != null) {
                    size2 += textStickerTextWrap.safeStrPair().second.size();
                }
            }
        }
        return size2;
    }

    public final void Yr() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(61));
    }

    public final boolean ab1() {
        return this.LLJILJIL.isEmpty();
    }

    public final void ag2() {
        this.LLJILJIL.clear();
    }

    @Override // X.C125V
    public void bf() {
        setState(AFwS283S0000000_35.get$arr$(67));
    }

    @Override // X.C125V
    public boolean c0() {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            C125R next = it2.next();
            TextStickerData data = next.getData();
            if (data != null && data.getHasReadTextAudio()) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.C125V
    public void d3() {
        setState(AFwS283S0000000_35.get$arr$(64));
    }

    @Override // X.C125V
    public String getTextContent() {
        StringBuilder sb = new StringBuilder();
        int size = this.LLJILJIL.size();
        for (int i = 0; i < size; i++) {
            ((C125R) ListProtector.get(this.LLJILJIL, i)).LIZIZ();
            TextStickerData data = ((C125R) ListProtector.get(this.LLJILJIL, i)).getData();
            if (data != null) {
                sb.append(AnonymousClass1258.LIZIZ(data.getTextWrapList()));
            }
            if (i != this.LLJILJIL.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // X.C125V
    public void i() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(60));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: mR2, reason: merged with bridge method [inline-methods] */
    public EditTextStickerViewState zQ2() {
        return new EditTextStickerViewState(new C194561119z(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C529130Kp5(false), null, null, null, null, null, null, null, null, null, null);
    }

    public final MutableLiveData<Pair<Float, Boolean>> nR2() {
        return (MutableLiveData) this.LLJIJIL.getValue();
    }

    @Override // X.C125V
    public List<TextStickerData> on() {
        ArrayList arrayList = new ArrayList();
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZIZ());
        }
        return arrayList;
    }

    public final C125R rR2() {
        if (this.LLJILJIL.isEmpty()) {
            return null;
        }
        return (C125R) ListProtector.get(this.LLJILJIL, 0);
    }

    @Override // X.C125V
    public void show() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(66));
    }

    public final void t01() {
        setState(AFwS283S0000000_35.get$arr$(65));
    }

    @Override // X.C125V
    public boolean LJLL() {
        return !ab1();
    }

    @Override // X.C125V
    public LiveData<TextStickerData> D9() {
        return this.LLIZ;
    }

    @Override // X.C125V
    public boolean Gb() {
        return this.LLJI;
    }

    @Override // X.C125V
    public C560530Lyd<Unit> H1() {
        return this.LLJJIII;
    }

    @Override // X.C125V
    public List<C125R> LLLLLLZZ() {
        return this.LLJILJIL;
    }

    @Override // X.C125V
    public boolean b8() {
        return this.LLILZLL;
    }

    @Override // X.C125V
    public C560530Lyd<Boolean> c2() {
        return this.LLJJIJIIJIL;
    }

    public final List<C125R> ht() {
        return this.LLJILJIL;
    }

    @Override // X.C125V
    public C385670FAf<Boolean> mo() {
        return this.LLJJIJIL;
    }

    public final boolean oR2() {
        return this.LLJJ;
    }

    public final boolean pR2() {
        return this.LLJILJILJ;
    }

    public final TextStickerData qR2() {
        return this.LLIZLLLIL;
    }

    @Override // X.C125V
    public C560530Lyd<Pair<Boolean, Boolean>> u2() {
        return this.LLJJIJI;
    }

    private final void zR2(boolean z) {
        C201955140j.LIZ("EditStickerScene -> set enableEditTextSticker");
        this.LLJILLL = z;
        List<C125R> list = this.LLJILJIL;
        ArrayList<C125R> arrayList = new ArrayList();
        for (C125R c125r : list) {
            if (C125P.LIZ(c125r)) {
                arrayList.add(c125r);
            }
        }
        for (C125R c125r2 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditStickerScene -> is Text Sticker, setEnableEdit = ");
            sbLIZ.append(this.LLJILLL);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c125r2.setEnableEdit(this.LLJILLL);
        }
    }

    public final void AR2(TextStickerData textStickerData) {
        this.LLIZLLLIL = textStickerData;
    }

    public final void BR2(boolean z) {
        this.LLJJIJIL.LJII(Boolean.valueOf(z));
    }

    public final Pair<Float, Float> Cc(Context context) {
        float screenWidth;
        float screenHeight;
        Pair<Integer, Integer> pair = this.LLJJI;
        if (pair != null) {
            screenWidth = pair.getFirst().intValue();
            screenHeight = pair.getSecond().intValue();
        } else if (context != null) {
            screenWidth = ScreenUtils.getScreenWidth(context);
            screenHeight = ScreenUtils.getScreenHeight(context);
        } else {
            screenWidth = 0.0f;
            screenHeight = 0.0f;
        }
        return new Pair<>(Float.valueOf(screenWidth), Float.valueOf(screenHeight));
    }

    public final void DJ2(long j) {
        for (C125R c125r : this.LLJILJIL) {
            c125r.setPlayPosition(j);
            c125r.LJIIIZ();
        }
    }

    public final void DR2(C125R c125r) {
        this.LLJILJIL.remove(c125r);
        ListProtector.add(this.LLJILJIL, 0, c125r);
    }

    @Override // X.C125V
    public void Dg(boolean z) {
        zR2(z);
    }

    public final boolean E2(C21645419nQ c21645419nQ) {
        if (!this.LLJILJILJ) {
            return false;
        }
        for (C125R c125r : this.LLJILJIL) {
            if (c125r.LJIILJJIL()) {
                c125r.LLJL = C121Q.LIZ(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL - c125r.LLJILJILJ, c125r.LLILZ.LIZIZ, c125r.getHelpRect(), 0.0f);
                c125r.LLJJI.LIZIZ(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL);
                if (c125r.LLJL || c125r.LLJJLIIIJLLLLLLLZ || c125r.LLJJI.LJIIIZ == 3) {
                    if (c125r.LLJJJJLIIL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C125V
    public void Eu(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        List<C125R> list = this.LLJILJIL;
        ArrayList arrayList = new ArrayList();
        for (C125R c125r : list) {
            if (C125P.LIZ(c125r)) {
                arrayList.add(c125r);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C125R) it2.next()).LJIIJ(f, z);
        }
    }

    public final void Fb2(boolean z) {
        setState(new AwS47S0010000_35(z, 7));
    }

    public final void JR1(boolean z) {
        setStateImmediate(new AwS47S0010000_35(z, 12));
    }

    @Override // X.C125V
    public void Jp0(C125R c125r) {
        setState(new AwS614S0100000_35(c125r, 108));
    }

    @Override // X.C125V
    public void LJJJJJ(int i) {
        setState(new AwS46S0001000_35(i, 6));
    }

    public final boolean LJJLIIIJLJLI(float f) {
        if (!this.LLJILJILJ) {
            return false;
        }
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJI(f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LLLLJI(float f) {
        if (!this.LLJILJILJ) {
            return false;
        }
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIIIIZZ()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LLLZLZ(b bVar) {
        boolean z;
        if (!this.LLJILJILJ) {
            return false;
        }
        for (C125R c125r : this.LLJILJIL) {
            if (c125r.LJIILJJIL() && (c125r.LLJL || c125r.LLJLIL || c125r.LLJJLIIIJLLLLLLLZ || c125r.LLJJI.LJIIIZ == 3)) {
                PointF pointF = bVar.LJIIJJI;
                float f = pointF.x;
                float f2 = pointF.y;
                C125U c125u = c125r.LLJJI;
                if (c125u.LJIILL != null) {
                    float f3 = c125u.LJI + f;
                    float f4 = c125u.LJII + f2;
                    float fAbs = Math.abs(f3 - c125u.LIZLLL);
                    float fAbs2 = Math.abs(f4 - c125u.LJ);
                    if (fAbs < 5.0f && fAbs2 < 5.0f) {
                        if (c125u.LJIIIZ == 3) {
                            setState(AFwS283S0000000_35.get$arr$(71));
                            return true;
                        }
                    } else {
                        if (c125u.LIZ != null && c125u.LJIIIZ == 3) {
                            RectF helpRect = c125u.LJIILL.getHelpRect();
                            C121Q.LIZLLL(helpRect.centerX(), helpRect.centerY(), helpRect, c125u.LJIILL.getStickerRotate());
                            C121Q.LJ(helpRect, c125u.LJIILL.getStickerScale());
                            boolean z2 = c125u.LJIIIIZZ;
                            if (z2) {
                                c125u.LJIILLIIL = z2;
                            }
                            c125u.LIZ.LJFF(c125u.LJIILL, new C167O(false, (int) (c125u.LJIIJ + f3), (int) (c125u.LJIIJJI + f4), c125u.LIZ()));
                            if (!c125u.LIZ()) {
                                c125u.LIZ.LIZIZ();
                                c125u.LIZ.LJI();
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c125u.LJIIIZ == 3) {
                            c125u.LJIIIZ = 3;
                            c125u.LIZIZ = f3 - c125u.LJI;
                            c125u.LIZJ = f4 - c125u.LJII;
                            C125R c125r2 = c125u.LJIILL;
                            c125r2.setCenterX(c125r2.getCenterX() + c125u.LIZIZ);
                            C125R c125r3 = c125u.LJIILL;
                            c125r3.setCenterY(c125r3.getCenterY() + c125u.LIZJ);
                            c125u.LJIILL.invalidate();
                            c125u.LJI = f3;
                            c125u.LJII = f4;
                        } else if (z) {
                        }
                        if (c125u.LJIIIIZZ) {
                            c125u.LIZJ(false);
                        }
                        setState(AFwS283S0000000_35.get$arr$(71));
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // X.C125V
    public void Pb(boolean z) {
        setStateImmediate(new AwS47S0010000_35(z, 10));
    }

    @Override // X.C125V
    public void R3(boolean z) {
        setState(new AwS47S0010000_35(z, 11));
    }

    @Override // X.C125V
    public void T3(Function1<? super C125R, Unit> function1) {
        setState(new AwS614S0100000_35((Function1) function1, 107));
    }

    @Override // X.C125V
    public void Uw2(C125X c125x) {
        setState(new AwS614S0100000_35(c125x, 105));
    }

    @Override // X.C125V
    public void V1(Function2<? super C125R, ? super C125R, Unit> function2) {
        setState(new AwS614S0100000_35(function2, (Function2<? super C125R, ? super C125R, Unit>) 103));
    }

    @Override // X.C125V
    public void Z3(MutableLiveData<Boolean> mutableLiveData) {
        this.LLJ = mutableLiveData;
    }

    @Override // X.C125V
    public void a2(boolean z) {
        setState(new AwS47S0010000_35(z, 6));
        MutableLiveData<Boolean> mutableLiveData = this.LLJ;
        if (mutableLiveData != null && !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C125V
    public void aa(boolean z) {
        setStateImmediate(new AwS47S0010000_35(z, 8));
    }

    @Override // X.C125V
    public void b(Pair<Integer, Integer> pair) {
        if (this.LLJJI == null) {
            this.LLJJI = pair;
        }
        setState(new AwS614S0100000_35(pair, (Pair<Integer, Integer>) 109));
    }

    @Override // X.C125V
    public void f8(Function1<? super C125R, Unit> function1) {
        setState(new AwS614S0100000_35((Function1) function1, 104));
    }

    public final void gp2(String str) {
        setState(new AwS85S1000000_35(str, 7));
    }

    @Override // X.C125V
    public void hW0(C125R c125r) {
        setState(new AwS614S0100000_35(c125r, 110));
    }

    public final void jR2(C125R c125r) {
        ListProtector.add(this.LLJILJIL, 0, c125r);
    }

    @Override // X.C125V
    public void ja(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.C125V
    public void kQ2(String str) {
        setState(new AwS85S1000000_35(str, 6));
    }

    public final void lR2(TextStickerData textStickerData) {
        setState(new AwS614S0100000_35(textStickerData, 106));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.125b] */
    public final boolean onDown(MotionEvent motionEvent) {
        this.LLJJ = false;
        if (!this.LLJILJILJ) {
            return false;
        }
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJI.LJIIIZ = 2;
        }
        for (C125R c125r : this.LLJILJIL) {
            if (c125r.LJIILJJIL()) {
                float centerX = c125r.getCenterX();
                float centerY = c125r.getCenterY();
                c125r.getStickerRotate();
                c125r.getStickerScale();
                c125r.LLJJJJJIL = new Object(centerX, centerY) { // from class: X.125b
                };
                motionEvent.getY();
                motionEvent.getRawY();
                if (c125r.LLJJI.LIZIZ(motionEvent.getX(), motionEvent.getY())) {
                    c125r.setTouching(true);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLJILJILJ) {
            return false;
        }
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJII(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLJILJILJ) {
            return false;
        }
        for (C125R c125r : this.LLJILJIL) {
            if (c125r.LJIILJJIL()) {
                c125r.LLJLIL = C121Q.LIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY() - c125r.LLJILJILJ, c125r.LLILZ.LIZIZ, c125r.getHelpRect(), 0.0f);
                c125r.LLJJI.LIZIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                if (c125r.LLJLIL || c125r.LLJJLIIIJLLLLLLLZ || c125r.LLJJI.LJIIIZ == 3) {
                    setState(new AwS614S0100000_35(c125r, 112));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean onUp(MotionEvent motionEvent) {
        boolean z;
        if (!this.LLJILJILJ) {
            return false;
        }
        for (C125R c125r : this.LLJILJIL) {
            c125r.LLJJJJ.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (c125r.LJIILJJIL()) {
                C125U c125u = c125r.LLJJI;
                c125u.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c125u.LJFF;
                if (c125u.LIZ != null && jCurrentTimeMillis <= 200 && c125u.LJIILL.LJ(c125u.LIZLLL, c125u.LJ) && c125u.LJIILL.LJ(motionEvent.getX() - c125u.LJIIJ, motionEvent.getY() - c125u.LJIIJJI)) {
                    c125u.LIZ.LIZJ();
                }
                if (c125r.LLJJI.LJIIIZ != 2 && c125r.LLJJJJJIL != null) {
                    c125r.getCenterX();
                    c125r.LLJJJJJIL.getClass();
                    c125r.getCenterY();
                    c125r.LLJJJJJIL.getClass();
                    C125U c125u2 = c125r.LLJJI;
                    c125u2.LJIIZILJ = true;
                    if (c125u2.LIZ != null && c125u2.LJIIIZ == 3) {
                        RectF helpRect = c125u2.LJIILL.getHelpRect();
                        C121Q.LIZLLL(helpRect.centerX(), helpRect.centerY(), helpRect, c125u2.LJIILL.getStickerRotate());
                        C121Q.LJ(helpRect, c125u2.LJIILL.getStickerScale());
                        c125u2.LIZ.LJFF(c125u2.LJIILL, new C167O(true, ((int) c125u2.LJI) + c125u2.LJIIJ, ((int) c125u2.LJII) + c125u2.LJIIJJI, c125u2.LIZ()));
                        if (c125u2.LJIILLIIL) {
                            if (c125u2.LIZ()) {
                                c125u2.LIZJ(false);
                            } else {
                                c125u2.LIZJ(false);
                            }
                            c125u2.LJIILLIIL = false;
                        }
                        c125u2.LIZ.LIZIZ();
                        c125u2.LIZ.LJ(c125u2.LJIILL);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c125u2.LJIIL) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - c125u2.LJFF;
                        int iAbs = (int) Math.abs(motionEvent.getX() - (c125u2.LIZLLL + c125u2.LJIIJ));
                        int iAbs2 = (int) Math.abs((motionEvent.getY() - 0) - (c125u2.LJ + c125u2.LJIIJJI));
                        if (jCurrentTimeMillis2 <= 200 && ((iAbs <= 5 || iAbs2 <= 5) && !c125u2.LJIJI.LIZ())) {
                            if (!c125u2.LJIIIIZZ && !c125u2.LIZ()) {
                                C125X c125x = c125u2.LIZ;
                                if (c125x != null) {
                                    c125x.LIZLLL(c125u2.LJIILL);
                                }
                                c125u2.LIZJ(true);
                            } else {
                                C125X c125x2 = c125u2.LIZ;
                                if (c125x2 != null) {
                                    c125x2.LIZLLL(c125u2.LJIILL);
                                }
                                c125u2.LIZJ(false);
                            }
                        }
                        z = true;
                    }
                } else {
                    z = false;
                }
                c125r.LLJL = false;
                c125r.LLJJLIIIJLLLLLLLZ = false;
                c125r.LLJLIL = false;
                C125U c125u3 = c125r.LLJJI;
                c125u3.LJI = 0.0f;
                c125u3.LJII = 0.0f;
                c125r.setTouching(false);
                if (z) {
                    setState(AFwS283S0000000_35.get$arr$(72));
                    tR2(c125r.LIZIZ());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C125V
    public void ov(TextWatcher textWatcher) {
        setStateImmediate(new AwS614S0100000_35(textWatcher, 102));
    }

    @Override // X.C125V
    public void qs(View.OnClickListener onClickListener) {
        setState(new AwS614S0100000_35(onClickListener, 100));
    }

    public final void sR2(C125R c125r) {
        setState(new AwS614S0100000_35(c125r, 111));
    }

    @Override // X.C125V
    public void setEnable(boolean z) {
        yR2(z);
    }

    public final void tR2(TextStickerData textStickerData) {
        this.LLIZ.setValue(textStickerData);
    }

    @Override // X.C125V
    public void tm(boolean z) {
        setState(new AwS47S0010000_35(z, 5));
    }

    public boolean ve1(RectF rectF) {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            PointF[] anglePointList = it2.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF rectFLIZIZ = C0GTT.LIZIZ(anglePointList);
                if (rectFLIZIZ.top < rectF.top || rectFLIZIZ.bottom > rectF.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void wR2(C125R c125r) {
        this.LLJILJIL.remove(c125r);
    }

    @Override // X.C125V
    public void wv0(C125R c125r) {
        setState(new AwS614S0100000_35(c125r, 101));
    }

    public final void xR2(boolean z) {
        this.LLJJ = z;
    }

    public final void yR2(boolean z) {
        this.LLJILJILJ = z;
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().setEnableEdit(this.LLJILJILJ);
        }
    }

    @Override // X.C125V
    public void yr(boolean z) {
        setState(new AwS47S0010000_35(z, 9));
        this.LLJI = z;
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    private final PointF ER2(PointF pointF, Context context) {
        int screenWidth;
        int screenHeight;
        PointF pointF2 = new PointF();
        Pair<Integer, Integer> pair = this.LLJJI;
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
        if (screenHeight == 0 || screenWidth == 0) {
            C844470XAv.LIZ.getClass();
            screenWidth = ScreenUtils.getScreenWidth(C844470XAv.LIZ());
            screenHeight = ScreenUtils.getScreenHeight(C844470XAv.LIZ());
        }
        try {
            C19377210rS c19377210rS = LLJJJ;
            float f = (pointF.x * 1.0f) / screenWidth;
            c19377210rS.getClass();
            pointF2.set(C19377210rS.LIZ(f), C19377210rS.LIZ((pointF.y * 1.0f) / screenHeight));
            return pointF2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return pointF2;
        }
    }

    public final void CU1(float f, boolean z) {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(f, z);
        }
    }

    public final void iJ2(float f, boolean z) {
        nR2().setValue(new Pair<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    public final void kR2(TextStickerData textStickerData, boolean z) {
        setStateImmediate(new AwS120S0110000_35(textStickerData, z, 1));
    }

    public final void uR2(TextStickerData textStickerData, String str) {
        setState(new AwS149S1100000_35(textStickerData, str, 2));
    }

    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        if (!this.LLJILJILJ) {
            return false;
        }
        for (C125R c125r : this.LLJILJIL) {
            if (c125r.LJIILJJIL()) {
                c125r.LLJJLIIIJLLLLLLLZ = C121Q.LIZ(f, f2 - c125r.LLJILJILJ, c125r.LLILZ.LIZIZ, c125r.getHelpRect(), 0.0f);
                c125r.LLJJI.LIZIZ(f, f2);
                if (c125r.LLJL || c125r.LLJLIL || c125r.LLJJLIIIJLLLLLLLZ || c125r.LLJJI.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:11|(1:13)(1:55)|(2:15|(1:17)(15:53|19|(1:52)(1:23)|24|(1:51)(1:28)|29|57|30|33|(1:(1:68)(2:35|(2:69|37)(1:50)))|38|(1:40)(1:49)|41|(2:43|(2:47|65)(1:67))(1:66)|48))(1:54)|18|19|(2:21|52)(0)|24|(2:26|51)(0)|29|57|30|33|(2:(0)(0)|50)|38|(0)(0)|41|(0)(0)|48|9) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0109, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149 A[EDGE_INSN: B:68:0x0149->B:38:0x0149 BREAK  A[LOOP:2: B:34:0x0113->B:50:0x01cc], SYNTHETIC] */
    @Override // X.C125V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> nt(android.content.Context r23, java.util.List<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r24, com.google.gson.Gson r25) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel.nt(android.content.Context, java.util.List, com.google.gson.Gson):java.util.List");
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJI.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LLJJ) {
            return false;
        }
        this.LLJJ = false;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C125R> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }
}
