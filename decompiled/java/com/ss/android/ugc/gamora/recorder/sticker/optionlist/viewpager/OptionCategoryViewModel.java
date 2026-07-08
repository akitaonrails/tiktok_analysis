package com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager;

import X.AbstractC1642960sr8;
import X.C19EG;
import X.C810670Vr7;
import X.InterfaceC1635390sev;
import X.InterfaceC1643190srV;
import android.app.Activity;
import android.content.SharedPreferences;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionCategoryViewModel extends ViewModel {
    public final Activity LL;
    public final InterfaceC1635390sev LLILLJJLI;
    public final InterfaceC1643190srV LLILLL;
    public final Effect LLILZ;
    public final Effect LLILZIL;
    public final SharedPreferences LLILZLL;
    public boolean LLIZ;
    public final MediatorLiveData<AbstractC1642960sr8> LLIZLLLIL;
    public final MediatorLiveData LLJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0srS] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(final X.C1643220srY r7) {
        /*
            r6 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LLILZIL
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L75
            boolean r0 = X.C1624550sNR.LJ(r0)
            if (r0 != r2) goto L75
            java.lang.String r1 = "mix_other_effects"
        Le:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LLILZIL
            if (r0 == 0) goto L19
            boolean r0 = X.C1624550sNR.LJ(r0)
            if (r0 != r2) goto L19
            r3 = 1
        L19:
            r4 = 0
            if (r3 == 0) goto L6e
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LLILZIL
            if (r0 != 0) goto L70
            r5 = r4
        L21:
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.LJ(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click"
            r3.LJ(r1, r0)
            java.lang.String r0 = "entry_effect_identifier"
            r3.LJ(r0, r5)
            X.0srg r0 = r7.LJ
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.LIZ
        L3d:
            java.lang.String r0 = "effect_category"
            r3.LJ(r0, r1)
            java.lang.String r1 = "effect_subcategory"
            java.lang.String r0 = r7.LIZ
            r3.LJ(r1, r0)
            X.0srg r0 = r7.LJ
            if (r0 == 0) goto L55
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJFF
            if (r0 == 0) goto L55
            java.lang.String r4 = r0.getEffectId()
        L55:
            java.lang.String r0 = "stackable_item_id"
            r3.LJ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "select_other_stackable_effects"
            X.C1449260noi.LJ(r0, r1)
            X.0srV r1 = r6.LLILLL
            X.0srS r0 = new X.0srS
            r0.<init>()
            r1.LIZJ(r7, r0, r2)
            return
        L6c:
            r1 = r4
            goto L3d
        L6e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LLILZ
        L70:
            java.lang.String r5 = r0.getName()
            goto L21
        L75:
            java.lang.String r1 = "prop_click"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel.vQ2(X.0srY):void");
    }

    public OptionCategoryViewModel(C19EG c19eg, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1643190srV interfaceC1643190srV, Effect effect, Effect effect2) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(c19eg, 0, "OptionCategoryPanelViewModel");
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1635390sev;
        this.LLILLL = interfaceC1643190srV;
        this.LLILZ = effect;
        this.LLILZIL = effect2;
        this.LLILZLL = sharedPreferencesLIZJ;
        this.LLIZ = sharedPreferencesLIZJ.getBoolean("firstTimeSelectShown", false);
        MediatorLiveData<AbstractC1642960sr8> mediatorLiveData = new MediatorLiveData<>();
        this.LLIZLLLIL = mediatorLiveData;
        this.LLJ = mediatorLiveData;
    }
}
