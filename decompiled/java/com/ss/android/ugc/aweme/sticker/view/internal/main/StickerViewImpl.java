package com.ss.android.ugc.aweme.sticker.view.internal.main;

import X.AbstractC1635610sfH;
import X.C01GW;
import X.C11VU;
import X.C1625780sPQ;
import X.C1630880sXe;
import X.C1631250sYF;
import X.C1635590sfF;
import X.C1635820sfc;
import X.C1635840sfe;
import X.C1635890sfj;
import X.C1636890shL;
import X.C1642680sqg;
import X.C19561611g6;
import X.C19EG;
import X.C19GS;
import X.C19YA;
import X.C21594319fB;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1635640sfK;
import X.InterfaceC1635660sfM;
import X.InterfaceC1635870sfh;
import X.InterfaceC1636820shE;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerViewImpl extends AbstractStickerView {
    public final C01GW LLLF;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final void LJIIJ(ViewGroup viewGroup) {
        super.LJIIJ(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.pu4);
        viewGroup2.addView(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d9w, viewGroup2, false));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final C1635890sfj LJIIL(ViewGroup viewGroup) {
        return new C1635890sfj(viewGroup.findViewById(R.id.w7p), this.LLIZ.LJIILL);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0sfF] */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final C1635590sfF LJIILIIL(ViewGroup viewGroup) {
        C1635840sfe c1635840sfe = this.LLIZ.LJIIJ;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.viewpager_sticker);
        viewPager.setOffscreenPageLimit(this.LLIZ.LJIIJ.LJIIIZ);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        if (this.LLIZ.LJ > 0) {
            layoutParams.height = (int) C11VU.LIZIZ(this.LLIZ.LJ, viewPager.getContext());
            C786410Ut5.q6(viewPager, layoutParams);
        }
        Function1<? super ViewPager, Unit> function1 = c1635840sfe.LIZIZ;
        if (function1 != null) {
            function1.invoke(viewPager);
        }
        if (viewPager instanceof C21594319fB) {
            ((C21594319fB) viewPager).LLILZ = Boolean.valueOf(this.LLILZ.LJFF.LJIILLIIL).booleanValue();
        }
        final C1636890shL c1636890shL = new C1636890shL(viewPager, LJI(), this.LLJIJIL, this.LLILZ, this.LLILZIL, (InterfaceC1635660sfM) this.LLLF.getValue());
        LJIIIIZZ().setSupportCustomIndicator(false);
        Function1<? super C19YA, Unit> function12 = this.LLIZ.LJIIJ.LIZJ;
        if (function12 != null) {
            function12.invoke(LJIIIIZZ());
        }
        final C19561611g6 c19561611g6LJIIIIZZ = LJIIIIZZ();
        final C19EG c19eg = this.LL;
        final LifecycleOwner lifecycleOwner = this.LLILLL;
        final C1635820sfc c1635820sfc = this.LLIZ;
        final C1630880sXe c1630880sXe = this.LLILZ;
        final InterfaceC1635640sfK interfaceC1635640sfKLJI = LJI();
        final InterfaceC1635660sfM interfaceC1635660sfM = (InterfaceC1635660sfM) this.LLLF.getValue();
        return new AbstractC1635610sfH<C1642680sqg>(c19561611g6LJIIIIZZ, c19eg, lifecycleOwner, c1635820sfc, c1636890shL, c1630880sXe, interfaceC1635640sfKLJI, interfaceC1635660sfM) { // from class: X.0sfF
            @Override // X.AbstractC1635610sfH
            public final void LJFF(EffectCategoryModel effectCategoryModel) {
                C21146717pB.LJFF(this.LLILLJJLI, "sticker_tab_item", this.LLIZLLLIL.get(effectCategoryModel.getKey()).LIZ());
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [X.0sfE] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC1635610sfH
            public final View LIZ(C19EG c19eg2, EffectCategoryModel effectCategoryModel, int i, Function2<? super EffectCategoryModel, ? super Integer, Unit> function2) {
                final C1642680sqg c1642680sqgLIZIZ = this.LLIZLLLIL.get(effectCategoryModel.getKey()).LIZIZ(c19eg2, effectCategoryModel, this.LL, this.LLILZLL, new AwS147S0201000_25((Function2) function2, (Function2<? super EffectCategoryModel, ? super Integer, Unit>) effectCategoryModel, (EffectCategoryModel) i, 11));
                List<String> tags = effectCategoryModel.getTags();
                if (tags != null && !tags.isEmpty()) {
                    this.LLILZLL.LJ.LIZIZ(effectCategoryModel, new IIsTagNeedUpdatedListener() { // from class: X.0sfE
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                        public final void onTagNeedNotUpdate() {
                            c1642680sqgLIZIZ.LIZ(false);
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                        public final void onTagNeedUpdate() {
                            c1642680sqgLIZIZ.LIZ(true);
                        }
                    });
                    return c1642680sqgLIZIZ;
                }
                c1642680sqgLIZIZ.LIZ(false);
                return c1642680sqgLIZIZ;
            }
        };
    }

    public StickerViewImpl(C19GS c19gs, ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, C1625780sPQ c1625780sPQ, C1635820sfc c1635820sfc, FragmentManager fragmentManager, InterfaceC1635640sfK interfaceC1635640sfK, InterfaceC1635660sfM interfaceC1635660sfM, InterfaceC1635870sfh interfaceC1635870sfh, boolean z, InterfaceC1636820shE interfaceC1636820shE) {
        super(c19gs, viewGroup, lifecycleOwner, c1630880sXe, c1631250sYF, c1625780sPQ, c1635820sfc, interfaceC1635870sfh, fragmentManager, interfaceC1635640sfK, z, interfaceC1636820shE);
        this.LLLF = C452501pT.LIZIZ(new AwS569S0100000_25(interfaceC1635660sfM, (InterfaceC1635660sfM<C1642680sqg, Fragment>) 1053));
    }
}
