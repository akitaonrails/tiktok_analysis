package com.ss.android.ugc.aweme.social.creation.edit.component.toolbar;

import X.AbstractC1678220tm0;
import X.AbstractC2255721DQs;
import X.C05YF;
import X.C08CX;
import X.C09R3;
import X.C0ETY;
import X.C0FUM;
import X.C0ME4;
import X.C0P0T;
import X.C1391600mJi;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1444450ngx;
import X.C1462030o9J;
import X.C15438062q;
import X.C1660340tJA;
import X.C1660360tJC;
import X.C1661820tLY;
import X.C1661900tLg;
import X.C1661920tLi;
import X.C1661930tLj;
import X.C1664770tQJ;
import X.C1BNE;
import X.C1DRG;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C298680BnG;
import X.C450720Hlu;
import X.C559050LwF;
import X.C560530Lyd;
import X.C861160XqM;
import X.C861380Xqi;
import X.EnumC1235690iGF;
import X.InterfaceC1417050myl;
import X.InterfaceC1417440mzO;
import X.InterfaceC1457610o2B;
import X.InterfaceC1460120o6E;
import X.InterfaceC1461390o8H;
import X.InterfaceC1461640o8g;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import X.InterfaceC346201Wa;
import X.InterfaceC379610EuV;
import Y.ACListenerS89S0300000_25;
import Y.AgS107S0101000_25;
import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.als.LiveEvent;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import uxk.a;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryEditToolbarComponent extends AbstractC2255721DQs<InterfaceC1460120o6E> implements InterfaceC1460120o6E, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LL;
    public String LLJILJILJ;
    public boolean LLJJ;
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Pair<Boolean, Boolean>> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final C560530Lyd<Unit> LLILZLL = new C560530Lyd<>();
    public final InterfaceC332260D0u<Set<Integer>> LLIZ = C1BNE.LIZ(C08CX.INSTANCE);
    public final InterfaceC332260D0u<List<Pair<Integer, C1661900tLg>>> LLIZLLLIL = C1BNE.LIZ(C13BV.INSTANCE);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417440mzO.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
    public final Set<String> LLJILJIL = new LinkedHashSet();
    public boolean LLJILLL = true;
    public final EditToolbarViewModel LLJJI = new EditToolbarViewModel(getDiContainer(), new AwS604S0100000_25(this, 240), new C1660360tJC(this));
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1457610o2B.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryEditToolbarComponent.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryEditToolbarComponent.class, "templateAutoCutAIApi", "getTemplateAutoCutAIApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(StoryEditToolbarComponent.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(StoryEditToolbarComponent.class, "topUiApi", "getTopUiApi()Lcom/ss/android/ugc/gamora/editor/lightening/titlebar/BaseTitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(StoryEditToolbarComponent.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(StoryEditToolbarComponent.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJJ = 8;
    }

    public InterfaceC1460120o6E X1() {
        return this;
    }

    @Override // X.InterfaceC1455610nyx
    public void bo() {
    }

    @Override // X.InterfaceC1455610nyx
    public void refresh() {
    }

    @Override // X.InterfaceC1460120o6E
    public void rt() {
        this.LLJILJILJ = null;
    }

    @Override // X.InterfaceC1455610nyx
    public void ug2(C0ME4 c0me4) {
    }

    private final InterfaceC1417440mzO H2() {
        return (InterfaceC1417440mzO) this.LLJI.getValue(this, LLJJIJIL[1]);
    }

    private final InterfaceC1457610o2B T2() {
        return (InterfaceC1457610o2B) this.LLJJIII.getValue(this, LLJJIJIL[3]);
    }

    private final InterfaceC1461390o8H w2() {
        return (InterfaceC1461390o8H) this.LLJJIJI.getValue(this, LLJJIJIL[4]);
    }

    @Override // X.InterfaceC1455610nyx
    public void DQ() {
        this.LLILZLL.LJIIJ(Unit.LIZ);
    }

    public final VideoPublishEditModel G2() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue(this, LLJJIJIL[5]);
    }

    public final Activity getActivity() {
        return (Activity) this.LLJ.getValue(this, LLJJIJIL[0]);
    }

    public final InterfaceC1417050myl o2() {
        return (InterfaceC1417050myl) this.LLJIJIL.getValue(this, LLJJIJIL[2]);
    }

    private final void c3() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1417440mzO.class, new AwS593S0100000_14(this, 154));
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> Py1() {
        return Transformations.map(x8(), AFwS266S0000000_25.get$arr$(191));
    }

    public final C861380Xqi Z1() {
        Object next;
        C1661820tLY value = getViewModel().E90().getValue();
        Iterator it2 = C13LP.LJLIL(value.LIZJ, value.LIZIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(((C1661930tLj) next).LIZ, C1661920tLi.LIZJ)) {
                break;
            }
        }
        C1661930tLj c1661930tLj = (C1661930tLj) next;
        Object obj = c1661930tLj != null ? c1661930tLj.LIZIZ : null;
        if (obj instanceof C861380Xqi) {
            return (C861380Xqi) obj;
        }
        return null;
    }

    @Override // X.InterfaceC1455610nyx
    public void j5() {
        getViewModel().PC1(false, true);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        c3();
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> RJ() {
        return this.LLILZIL;
    }

    public C560530Lyd<Unit> W2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1460120o6E
    public String Ye() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1460120o6E
    public EditToolbarViewModel getViewModel() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Unit> jf1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Integer> ww() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Pair<Boolean, Boolean>> x8() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1455610nyx
    public /* bridge */ /* synthetic */ LiveEvent xg1() {
        return this.LLILZLL;
    }

    public StoryEditToolbarComponent(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1455610nyx
    public void BJ(boolean z) {
        this.LLILZIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1455610nyx
    public void Fe2(boolean z) {
        getViewModel().PC1(true, z);
    }

    @Override // X.InterfaceC1455610nyx
    public void Ws(int i) {
        getViewModel().JM1(i, new AwS639S0100000_25(this, 50));
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> hB(final int i) {
        final InterfaceC332260D0u<List<Pair<Integer, C1661900tLg>>> interfaceC332260D0u = this.LLIZLLLIL;
        return FlowLiveDataConversions.asLiveData(new InterfaceC346201Wa<Boolean>() { // from class: X.0tLc
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = interfaceC332260D0u.collect(new AgS107S0101000_25(interfaceC346701Wf, i, 1), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        }, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void i3(C1661820tLY c1661820tLY) {
        getViewModel();
        List listLJLIL = C13LP.LJLIL(c1661820tLY.LIZJ, c1661820tLY.LIZIZ);
        InterfaceC332260D0u<Set<Integer>> interfaceC332260D0u = this.LLIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        ArrayList<C1661930tLj> arrayList2 = (ArrayList) listLJLIL;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractC1678220tm0) ((C1661930tLj) it2.next()).LIZ).LIZ));
        }
        interfaceC332260D0u.setValue(C13LP.LLIIJI(arrayList));
        InterfaceC332260D0u<List<Pair<Integer, C1661900tLg>>> interfaceC332260D0u2 = this.LLIZLLLIL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        for (C1661930tLj c1661930tLj : arrayList2) {
            arrayList3.add(new Pair(Integer.valueOf(((AbstractC1678220tm0) c1661930tLj.LIZ).LIZ), c1661930tLj.LIZLLL));
        }
        interfaceC332260D0u2.setValue(arrayList3);
        this.LLJILLL = c1661820tLY.LIZ;
        w2().LIZIZ(new GestureInteractItem(0, new C0FUM() { // from class: X.0tLZ
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0 && this.LL.getViewModel().E90().getValue().LJI) {
                    if (C1429330nIZ.LJFF(this.LL.G2())) {
                        this.LL.getViewModel().PC1(false, false);
                        return this instanceof C1417630mzh;
                    }
                    this.LL.j5();
                    return true;
                }
                return this instanceof C1417630mzh;
            }
        }));
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> lQ1(final int i) {
        final InterfaceC332260D0u<List<Pair<Integer, C1661900tLg>>> interfaceC332260D0u = this.LLIZLLLIL;
        return FlowLiveDataConversions.asLiveData(new InterfaceC346201Wa<Boolean>() { // from class: X.0tLa
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = interfaceC332260D0u.collect(new AgS107S0101000_25(interfaceC346701Wf, i, 0), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        }, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final void q3(C559050LwF c559050LwF) {
        getViewModel().JM1(21, new AwS460S0200000_25(this, c559050LwF, 16));
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> v01(final int i) {
        final InterfaceC332260D0u<Set<Integer>> interfaceC332260D0u = this.LLIZ;
        return FlowLiveDataConversions.asLiveData(new InterfaceC346201Wa<Boolean>() { // from class: X.0tLe
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = interfaceC332260D0u.collect(new AgS107S0101000_25(interfaceC346701Wf, i, 2), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        }, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B3(kotlin.jvm.functions.Function0<kotlin.Unit> r9, android.graphics.Rect r10) {
        /*
            r8 = this;
            boolean r0 = X.C0L44.LIZ()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r0 == 0) goto L7c
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.centerY()
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r0 = r0 & r4
            long r0 = r0 | r2
            X.C1462030o9J.LIZLLL(r0, r6)
        L1f:
            boolean r0 = X.C298630BnB.LIZ()
            if (r0 == 0) goto L38
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.centerY()
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r0 = r0 & r4
            long r0 = r0 | r2
            X.C1462030o9J.LIZLLL(r0, r6)
        L37:
            return
        L38:
            boolean r0 = X.C1444450ngx.LIZIZ()
            if (r0 == 0) goto L5a
            uxk.a r0 = uxk.a.LIZ
            r0.getClass()
            boolean r0 = uxk.a.LJIIJJI()
            if (r0 == 0) goto L5a
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.top
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r4 = r4 & r0
            long r4 = r4 | r2
            X.C1462030o9J.LIZJ(r6, r4, r9)
            return
        L5a:
            boolean r0 = X.C1444450ngx.LIZIZ()
            if (r0 == 0) goto L37
            uxk.a r0 = uxk.a.LIZ
            r0.getClass()
            boolean r0 = uxk.a.LJIIJ()
            if (r0 == 0) goto L37
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.top
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r4 = r4 & r0
            long r4 = r4 | r2
            X.C1462030o9J.LIZIZ(r6, r4, r9)
            return
        L7c:
            boolean r0 = X.C1444450ngx.LIZIZ()
            if (r0 == 0) goto L9e
            uxk.a r0 = uxk.a.LIZ
            r0.getClass()
            boolean r0 = uxk.a.LJIIJJI()
            if (r0 == 0) goto L9e
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.top
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r0 = r0 & r4
            long r0 = r0 | r2
            X.C1462030o9J.LIZJ(r6, r0, r9)
            goto L1f
        L9e:
            boolean r0 = X.C1444450ngx.LIZIZ()
            if (r0 == 0) goto L1f
            uxk.a r0 = uxk.a.LIZ
            r0.getClass()
            boolean r0 = uxk.a.LJIIJ()
            if (r0 == 0) goto L1f
            android.app.Activity r6 = r8.getActivity()
            int r1 = r10.left
            int r0 = r10.top
            long r2 = (long) r1
            long r2 = r2 << r7
            long r0 = (long) r0
            long r0 = r0 & r4
            long r0 = r0 | r2
            X.C1462030o9J.LIZIZ(r6, r0, r9)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent.B3(kotlin.jvm.functions.Function0, android.graphics.Rect):void");
    }

    public final void E3(Function0<Unit> function0, Rect rect) {
        if (C298680BnG.LIZ()) {
            B3(function0, rect);
            return;
        }
        if (!C1444450ngx.LIZIZ()) {
            return;
        }
        a.LIZ.getClass();
        if (a.LJIIJJI()) {
            Activity activity = getActivity();
            int i = rect.left;
            C1462030o9J.LIZJ(activity, (((long) rect.top) & 4294967295L) | (((long) i) << 32), function0);
        }
        if (!a.LJIIJ()) {
            return;
        }
        Activity activity2 = getActivity();
        int i2 = rect.left;
        C1462030o9J.LIZIZ(activity2, (4294967295L & ((long) rect.top)) | (((long) i2) << 32), function0);
    }

    @Override // X.InterfaceC1455610nyx
    public void Jf1(boolean z, boolean z2) {
        this.LLILZ.setValue(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        T2().nf1(z);
        C2252321DDq c2252321DDq = getViewModel().LLJ;
        C1660340tJA c1660340tJA = (C1660340tJA) c2252321DDq.getValue();
        boolean z3 = c1660340tJA.LIZIZ;
        boolean z4 = c1660340tJA.LIZJ;
        c1660340tJA.getClass();
        c2252321DDq.setValue(new C1660340tJA(z, z3, z4));
    }

    @Override // X.InterfaceC1455610nyx
    public void Uh1(int i, boolean z) {
        getViewModel().yQ2(i, new AwS37S0010000_25(z, 16));
    }

    public final void W1(Function0<Unit> function0, Rect rect) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C861160XqM(this, rect, function0, null), 3);
    }

    public final boolean m3(int i, C1661820tLY c1661820tLY) {
        if (c1661820tLY.LJI) {
            return false;
        }
        List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list = c1661820tLY.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((AbstractC1678220tm0) it2.next().LIZ).LIZ == i) {
                    return false;
                }
            }
        }
        Iterator<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> it3 = c1661820tLY.LIZJ.iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (((AbstractC1678220tm0) it3.next().LIZ).LIZ == i) {
                if (i2 < 0 || i2 < c1661820tLY.LJ) {
                    return false;
                }
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // X.InterfaceC1455610nyx
    public void ut0(int i, boolean z) {
        getViewModel().yQ2(i, new AwS37S0010000_25(z, 15));
    }

    @Override // X.InterfaceC1455610nyx
    public void Fp2(int i, boolean z, Function0<Unit> function0) {
        getViewModel().JM1(i, new AwS124S0201000_25(i, (int) this, (StoryEditToolbarComponent) function0, (Function0<Unit>) 41));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.0P0T] */
    public final void v3(Rect rect, String str, Function0<Unit> function0) {
        if (getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            return;
        }
        this.LLJILJILJ = str;
        final C259800zU c259800zU = new C259800zU();
        C450720Hlu c450720Hlu = new C450720Hlu(getActivity());
        c450720Hlu.LIZ(rect.left, rect.centerY());
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.START;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LJIJJ = true;
        c450720Hlu.LJIIJ(2131825366);
        c450720Hlu.LJIIIZ(true, new ACListenerS89S0300000_25(c259800zU, this, function0, 2));
        c450720Hlu.LIZJ(new AwS604S0100000_25(this, 239));
        c259800zU.element = c450720Hlu.LIZIZ();
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent$showAutoCutAICompletedTooltip$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_PAUSE && c259800zU.element.isShowing()) {
                    c259800zU.element.dismiss();
                }
                this.getLifecycle().removeObserver(this);
            }
        });
        ((C0P0T) c259800zU.element).show();
    }
}
