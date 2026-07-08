package t28;

import X.AbstractC1252750ihl;
import X.AbstractC1646530swt;
import X.AbstractC1653180t7c;
import X.AbstractC214814194y;
import X.AnonymousClass0956;
import X.C004I;
import X.C01GW;
import X.C0LCS;
import X.C1170060gYO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C12MF;
import X.C1308910kAL;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1653330t7r;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1697580uHE;
import X.C1765020w20;
import X.C1DRG;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1166920gTK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1653360t7u;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import a6n.a;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aime.MobModule;
import com.ss.android.ugc.aweme.aiself.MobModuleImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import t28.c;

/* JADX INFO: loaded from: classes26.dex */
public final class c extends AbstractC1646530swt implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZIL;
    public final C1664750tQH LLIZ;
    public a LLIZLLLIL;
    public AnonymousClass0956 LLJILJIL;
    public final String LLILZ = "AISelf";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(549));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1069));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1066));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1070));
    public final LifecycleCoroutineScope LLJILJILJ = LifecycleOwnerKt.getLifecycleScope(this);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(c.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Scene scene = (Scene) this.LLILLJJLI.LJIIL(null, AbstractC214814194y.class);
        if (scene != null && (lifecycle = scene.getLifecycle()) != null) {
            return lifecycle;
        }
        a aVar = this.LLIZLLLIL;
        return (aVar != null ? aVar : null).LIZ().getLifecycle();
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLJI.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        Object styleSpan;
        Object styleSpan2;
        Context context;
        Integer numLIZJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLILZIL);
        AbstractC214814194y abstractC214814194y = (AbstractC214814194y) this.LLILLJJLI.LJIIL(null, AbstractC214814194y.class);
        if (abstractC214814194y != null && (context = abstractC214814194y.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ca, context)) != null) {
            styleSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            styleSpan = new StyleSpan(C12MF.BOLD_ITALIC.getVALUE());
        }
        C786410Ut5.q2(spannableStringBuilder, styleSpan, 0, 2, 33);
        if (Build.VERSION.SDK_INT >= 28) {
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 17.0f, 1.0f, Float.valueOf(17.0f), 0.0f, 0, null, 224);
            if (typefaceLIZIZ != null) {
                styleSpan2 = new TypefaceSpan(typefaceLIZIZ);
            } else {
                styleSpan2 = new StyleSpan(C12MF.BOLD_ITALIC.getVALUE());
            }
            C786410Ut5.q2(spannableStringBuilder, styleSpan2, 0, 2, 33);
        } else {
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(C12MF.BOLD_ITALIC.getVALUE()), 0, 2, 33);
        }
        return new C1653330t7r(new SpannableString(spannableStringBuilder), this.LLILZ, "aime_tab", this.LLILLL, new InterfaceC1653360t7u() { // from class: X.0sxD
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                MobModuleImpl mobModuleImpl;
                Object obj;
                MobModule mobModule = (MobModule) this.LIZ.LLILZLL.getValue();
                String str = null;
                if (mobModule instanceof MobModuleImpl) {
                    mobModuleImpl = (MobModuleImpl) mobModule;
                } else {
                    mobModuleImpl = null;
                }
                if (mobModuleImpl != null) {
                    ShortVideoContext shortVideoContext = (ShortVideoContext) this.LIZ.LLILLJJLI.LJII(ShortVideoContext.class, null);
                    c cVar = this.LIZ;
                    Bundle bundle = ((Scene) cVar.LLIZ.getValue(cVar, c.LLJILLL[0])).mArguments;
                    mobModuleImpl.LIZ = shortVideoContext;
                    mobModuleImpl.LIZIZ = bundle;
                }
                ((MobModule) this.LIZ.LLILZLL.getValue()).LIZJ("aime_tab");
                C1638140sjM.LIZ(EnumC1647590syb.AI_SELF);
                aVar.LIZLLL().shootMode = 21;
                ((com.ss.android.ugc.aweme.shortvideo.component.a) this.LIZ.LLILLJJLI.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null)).eP2(false);
                c cVar2 = this.LIZ;
                AnonymousClass0956 anonymousClass0956 = cVar2.LLJILJIL;
                if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                    LifecycleCoroutineScope lifecycleCoroutineScope = cVar2.LLJILJILJ;
                    C1DFH c1dfh = C0PEM.LIZ;
                    cVar2.LLJILJIL = C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C566770MKt(cVar2, null), 2);
                }
                c cVar3 = this.LIZ;
                a aVar2 = aVar;
                cVar3.getClass();
                AbstractC1646530swt.LIZIZ(c1646490swp, aVar2);
                InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) this.LIZ.LLJ.getValue();
                if (interfaceC1646220swO != null) {
                    int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
                    C1647390syH c1647390syH = c1646490swp.LIZJ;
                    if (c1647390syH != null) {
                        obj = c1647390syH.LIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    }
                    interfaceC1646220swO.uF2(iLJFF, str, c1646490swp.LJ, EnumC2008807tu.TAB_CHANGED);
                }
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                c cVar = this.LIZ;
                a aVar2 = aVar;
                cVar.getClass();
                AbstractC1646530swt.LIZ(c1646490swp, aVar2);
                AnonymousClass0956 anonymousClass0956 = this.LIZ.LLJILJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LIZ.LLJILJIL = null;
                return false;
            }
        }, new AwS552S0100000_8(this, 1067), false, null, null, 448);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        this.LLIZLLLIL = aVar;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public c(C1DRG c1drg, boolean z, String str) {
        this.LLILLJJLI = c1drg;
        this.LLILLL = z;
        this.LLILZIL = str;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
