package com.ss.android.ugc.aweme.inbox.bulletin.animation;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C019F;
import X.C03H5;
import X.C0OPX;
import X.C0OSF;
import X.C0OWM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12DM;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C620650OVz;
import X.C623210OcR;
import X.C623230OcT;
import X.C623300Oca;
import X.C623320Occ;
import X.C623340Oce;
import X.C623350Ocf;
import X.C623360Ocg;
import X.C639090P4x;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.EnumC620000OTm;
import X.EnumC623310Ocb;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ALAdapterS3S0300000_9;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS78S0200000_9;
import Y.AUListenerS259S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS149S0101000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputAnimationManagerAssem extends AbstractC738140SxQ implements BulletinAnimationCoordinatorAbility, InterfaceC617820OLc, InterfaceC724530SbT, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LL;
    public final Map<EnumC619890OTb, WeakReference<InterfaceC623330Ocd>> LLILLJJLI;
    public C0OWM LLILLL;
    public C0OSF LLILZ;
    public EnumC620000OTm LLILZIL;
    public AnimatorSet LLILZLL;
    public final List<Animator> LLIZ;
    public final List<Function0<Unit>> LLIZLLLIL;
    public final List<Animator> LLJ;
    public final Map<View, Integer> LLJI;
    public final Map<View, C623320Occ> LLJIJIL;
    public final LinkedHashMap<View, C623320Occ> LLJILJIL;
    public final C623210OcR LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputAnimationManagerAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinInputAnimationManagerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 263), AFwS240S0000000_9.get$arr$(168), null, true);
        this.LLILLJJLI = new LinkedHashMap();
        this.LLILLL = C0OWM.HIDE;
        this.LLILZ = C0OSF.NORMAL;
        this.LLILZIL = EnumC620000OTm.INPUT;
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new ArrayList();
        this.LLJI = new LinkedHashMap();
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = new LinkedHashMap<>();
        this.LLJILJILJ = new C623210OcR();
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJILJILJ.LJI = new C623230OcT(this);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        AssemViewModel value = assemVMLazy.getValue();
        selectSubscribe(value, new C2217381BqS() { // from class: X.0OWR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OWG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0OTi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C639090P4x(this, 0));
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1677026914) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m244do() {
        AnimatorSet animatorSet = this.LLILZLL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        this.LLILZLL = null;
        for (Animator animator : this.LLJ) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ((ArrayList) this.LLJ).clear();
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZLLLIL).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C623210OcR c623210OcR = this.LLJILJILJ;
        ARunnableS109S0100000_9 aRunnableS109S0100000_9 = c623210OcR.LJFF;
        if (aRunnableS109S0100000_9 != null) {
            c623210OcR.LJ.removeCallbacks(aRunnableS109S0100000_9);
        }
        c623210OcR.LJFF = null;
        c623210OcR.LIZ = null;
        ((ArrayList) c623210OcR.LIZIZ).clear();
        c623210OcR.LIZJ = false;
        m244do();
        ((LinkedHashMap) this.LLILLJJLI).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public static void bo(Map map) {
        TextView textView;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            View view = (View) entry.getKey();
            C623320Occ c623320Occ = (C623320Occ) entry.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = c623320Occ.LIZIZ;
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).weight = c623320Occ.LIZ;
                }
                C623350Ocf c623350Ocf = c623320Occ.LJ;
                if (c623350Ocf != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = c623350Ocf.LIZ;
                    marginLayoutParams.setMarginStart(c623350Ocf.LIZIZ);
                    marginLayoutParams.setMarginEnd(c623350Ocf.LIZJ);
                    marginLayoutParams.bottomMargin = c623350Ocf.LIZLLL;
                }
                C786410Ut5.W5(view, layoutParams);
            }
            Integer num = c623320Occ.LIZLLL;
            if (num != null) {
                int iIntValue = num.intValue();
                if ((view instanceof TextView) && (textView = (TextView) view) != null) {
                    textView.setMaxHeight(iIntValue);
                }
            }
            Integer num2 = c623320Occ.LJFF;
            if (num2 != null) {
                view.setMinimumHeight(num2.intValue());
            }
            C623360Ocg c623360Ocg = c623320Occ.LJI;
            if (c623360Ocg != null) {
                view.setPaddingRelative(c623360Ocg.LIZIZ, c623360Ocg.LIZ, c623360Ocg.LIZJ, c623360Ocg.LIZLLL);
            }
            C786410Ut5.LJLLLLLL(c623320Occ.LIZJ, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility
    public final void HK2(InterfaceC623330Ocd interfaceC623330Ocd) {
        this.LLILLJJLI.put(interfaceC623330Ocd.pd(), new WeakReference<>(interfaceC623330Ocd));
        EnumC620000OTm enumC620000OTm = this.LLILZIL;
        EnumC620000OTm enumC620000OTm2 = EnumC620000OTm.INPUT;
        if (enumC620000OTm != enumC620000OTm2 || this.LLILLL != C0OWM.HIDE || this.LLILZ != C0OSF.NORMAL) {
            if (this.LLJILJILJ.LIZ == null && !(!((ArrayList) r1.LIZIZ).isEmpty())) {
                C620650OVz c620650OVz = new C620650OVz(C0OWM.HIDE, this.LLILLL, C0OSF.NORMAL, this.LLILZ, enumC620000OTm2, this.LLILZIL);
                List listLLIIII = C13LP.LLIIII(this.LLIZ);
                List listLLIIII2 = C13LP.LLIIII(this.LLIZLLLIL);
                ((ArrayList) this.LLIZ).clear();
                ((ArrayList) this.LLIZLLLIL).clear();
                try {
                    interfaceC623330Ocd.D4(c620650OVz, EnumC617880OLi.PREPARE, this);
                    interfaceC623330Ocd.D4(c620650OVz, EnumC617880OLi.PERFORM, this);
                    Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
                    while (it2.hasNext()) {
                        ((Function0) it2.next()).invoke();
                    }
                    ((ArrayList) this.LLIZ).clear();
                    ((ArrayList) this.LLIZLLLIL).clear();
                    interfaceC623330Ocd.D4(c620650OVz, EnumC617880OLi.COMPLETE, this);
                    ((ArrayList) this.LLIZ).clear();
                    ((ArrayList) this.LLIZ).addAll(listLLIIII);
                    ((ArrayList) this.LLIZLLLIL).clear();
                    ((ArrayList) this.LLIZLLLIL).addAll(listLLIIII2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ArrayList) this.LLIZ).clear();
                    ((ArrayList) this.LLIZ).addAll(listLLIIII);
                    ((ArrayList) this.LLIZLLLIL).clear();
                    ((ArrayList) this.LLIZLLLIL).addAll(listLLIIII2);
                    throw th;
                }
            }
        }
    }

    public final void fo(C620650OVz c620650OVz) {
        Iterator it2 = ((LinkedHashMap) this.LLILLJJLI).values().iterator();
        while (it2.hasNext()) {
            InterfaceC623330Ocd interfaceC623330Ocd = (InterfaceC623330Ocd) ((Reference) it2.next()).get();
            if (interfaceC623330Ocd != null) {
                interfaceC623330Ocd.D4(c620650OVz, EnumC617880OLi.COMPLETE, this);
            }
        }
        this.LLILZLL = null;
        C623210OcR c623210OcR = this.LLJILJILJ;
        c623210OcR.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] Animation complete, queueSize=");
        sbLIZ.append(((ArrayList) c623210OcR.LIZIZ).size());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        c623210OcR.LIZJ = false;
        c623210OcR.LIZIZ();
    }

    public final void ho(final C620650OVz c620650OVz) {
        if (((ArrayList) this.LLIZ).isEmpty()) {
            Iterator<Function0<Unit>> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
            ((ArrayList) this.LLIZLLLIL).clear();
            fo(c620650OVz);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.LLIZ);
        final C013C c013c = new C013C();
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0OcV
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                c013c2.element = true;
                this.fo(c620650OVz);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                InterfaceC623330Ocd interfaceC623330Ocd;
                View viewDk;
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                c013c2.element = true;
                Iterator<Function0<Unit>> it3 = this.LLIZLLLIL.iterator();
                while (it3.hasNext()) {
                    it3.next().invoke();
                }
                ((ArrayList) this.LLIZLLLIL).clear();
                Reference reference = (Reference) C13LP.LJJJLIIL(((LinkedHashMap) this.LLILLJJLI).values());
                if (reference != null && (interfaceC623330Ocd = (InterfaceC623330Ocd) reference.get()) != null && (viewDk = interfaceC623330Ocd.dk()) != null) {
                    HandlerHook.viewPost(viewDk, new ARunnableS78S0200000_9(this, c620650OVz, 27));
                } else {
                    this.fo(c620650OVz);
                }
            }
        });
        this.LLILZLL = animatorSet;
        animatorSet.start();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility
    public final void iA(EnumC619890OTb enumC619890OTb) {
        this.LLILLJJLI.remove(enumC619890OTb);
    }

    @Override // X.InterfaceC617820OLc
    public final void He(final View view, final int i, long j, boolean z) {
        int height = view.getHeight();
        if (height == i) {
            return;
        }
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new C12DM());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS259S0100000_9(view, 2));
        if (z) {
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0OcY
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    view.getLayoutParams().height = i;
                    view.requestLayout();
                    ((ArrayList) this.LLJ).remove(valueAnimatorOfInt);
                }
            });
            ((ArrayList) this.LLJ).add(valueAnimatorOfInt);
            valueAnimatorOfInt.start();
        } else {
            ((ArrayList) this.LLIZ).add(valueAnimatorOfInt);
            ((ArrayList) this.LLIZLLLIL).add(new AwS149S0101000_9(i, view, 1));
        }
    }

    @Override // X.InterfaceC617820OLc
    public final void S7(View view, long j, long j2, boolean z) {
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(new C12DM());
        if (z) {
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0300000_9(view, this, objectAnimatorOfFloat, 2));
            ((ArrayList) this.LLJ).add(objectAnimatorOfFloat);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } else {
            ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat);
            ((ArrayList) this.LLIZLLLIL).add(new AwS553S0100000_9(view, 262));
        }
    }

    @Override // X.InterfaceC617820OLc
    public final void ig(final View view, long j, final boolean z, boolean z2) {
        final int height = view.getHeight();
        if (height <= 0) {
            if (z) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new C12DM());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS259S0100000_9(view, 1));
        if (z2) {
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0OcW
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (z) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    view.getLayoutParams().height = height;
                    ((ArrayList) this.LLJ).remove(valueAnimatorOfInt);
                }
            });
            ((ArrayList) this.LLJ).add(valueAnimatorOfInt);
            valueAnimatorOfInt.start();
        } else {
            ((ArrayList) this.LLIZ).add(valueAnimatorOfInt);
            ((ArrayList) this.LLIZLLLIL).add(new C623340Oce(height, view, z));
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC617820OLc
    public final void Nc(final View view, long j, long j2, final boolean z, boolean z2) {
        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(new C12DM());
        if (z2) {
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0OcX
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (z) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    C786410Ut5.T4(view, 1.0f);
                    ((ArrayList) this.LLJ).remove(objectAnimatorOfFloat);
                }
            });
            ((ArrayList) this.LLJ).add(objectAnimatorOfFloat);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } else {
            ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat);
            ((ArrayList) this.LLIZLLLIL).add(new AwS127S0110000_9(view, z, 5));
        }
    }

    @Override // X.InterfaceC617820OLc
    public final void e6(TuxNavBar tuxNavBar, EnumC623310Ocb enumC623310Ocb, long j, long j2, boolean z) {
        int height;
        int[] iArr = C623300Oca.LIZ;
        int i = iArr[enumC623310Ocb.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            height = tuxNavBar.getWidth();
        } else {
            height = tuxNavBar.getHeight();
        }
        float f = height;
        int i2 = iArr[enumC623310Ocb.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        C786410Ut5.Jc(tuxNavBar, -f);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C786410Ut5.Jc(tuxNavBar, f);
                }
            } else {
                C786410Ut5.ed(tuxNavBar, -f);
            }
        } else {
            C786410Ut5.ed(tuxNavBar, f);
        }
        C786410Ut5.T4(tuxNavBar, 0.0f);
        C786410Ut5.LJLLLLLL(0, tuxNavBar);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_X, tuxNavBar.getTranslationX(), 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(new C12DM());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_Y, tuxNavBar.getTranslationY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setStartDelay(j2);
        objectAnimatorOfFloat2.setInterpolator(new C12DM());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(j);
        objectAnimatorOfFloat3.setStartDelay(j2);
        objectAnimatorOfFloat3.setInterpolator(new C12DM());
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.addListener(new ALAdapterS3S0300000_9(tuxNavBar, this, animatorSet, 0));
            ((ArrayList) this.LLJ).add(animatorSet);
            animatorSet.start();
            return;
        }
        ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat);
        ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat2);
        ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat3);
        ((ArrayList) this.LLIZLLLIL).add(new AwS553S0100000_9(tuxNavBar, 0));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC617820OLc
    public final void vh(TuxNavBar tuxNavBar, EnumC623310Ocb enumC623310Ocb, long j, long j2, boolean z) {
        int height;
        ObjectAnimator objectAnimatorOfFloat;
        int[] iArr = C623300Oca.LIZ;
        int i = iArr[enumC623310Ocb.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            height = tuxNavBar.getWidth();
        } else {
            height = tuxNavBar.getHeight();
        }
        float f = height;
        int i2 = iArr[enumC623310Ocb.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_X, 0.0f, f);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_X, 0.0f, -f);
                }
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_Y, 0.0f, f);
            }
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.TRANSLATION_Y, 0.0f, -f);
        }
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(new C12DM());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxNavBar, (Property<TuxNavBar, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setStartDelay(j2);
        objectAnimatorOfFloat2.setInterpolator(new C12DM());
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.addListener(new ALAdapterS3S0300000_9(tuxNavBar, this, animatorSet, 1));
            ((ArrayList) this.LLJ).add(animatorSet);
            animatorSet.start();
            return;
        }
        ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat);
        ((ArrayList) this.LLIZ).add(objectAnimatorOfFloat2);
        ((ArrayList) this.LLIZLLLIL).add(new AwS553S0100000_9(tuxNavBar, 1));
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
