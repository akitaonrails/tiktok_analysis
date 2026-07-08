package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import X.C0C64;
import X.C0EBE;
import X.C12H1;
import X.C12I9;
import X.C12IS;
import X.C12IT;
import X.C12IU;
import X.C12IV;
import X.C12IX;
import X.C12J0;
import X.C12J7;
import X.C12J9;
import X.C12JD;
import X.C12JF;
import X.C12JG;
import X.C12JK;
import X.C12JL;
import X.C12JN;
import X.C12JP;
import X.C12JU;
import X.C19570511hX;
import X.C19729012Gy;
import X.C19732312If;
import X.C19733612Is;
import X.C19775612Yw;
import X.C19GS;
import X.C565530MFz;
import X.InterfaceC1658800tGg;
import X.InterfaceC19731812Ia;
import X.InterfaceC19731912Ib;
import X.InterfaceC19732212Ie;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class InternalBeautyPanel implements InterfaceC1658800tGg, GenericLifecycleObserver {
    public final ViewGroup LL;
    public final C12I9 LLILLJJLI;
    public ViewGroup LLILLL;
    public C12JG LLILZ;
    public C12J9 LLILZIL;
    public C12IV LLILZLL;
    public C12H1 LLIZ;
    public C12JU LLIZLLLIL;
    public C12IS LLJ;
    public C12JN LLJI;
    public C12IT LLJIJIL;
    public C12JF LLJILJIL;
    public C12JK LLJILJILJ;
    public InterfaceC19732212Ie LLJILLL;
    public C12J7 LLJJ;
    public InterfaceC19731812Ia LLJJI;
    public final C12JP LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C12IV LIZ() {
        C12IV c12iv = this.LLILZLL;
        if (c12iv != null) {
            return c12iv;
        }
        return null;
    }

    public final C12JG LIZIZ() {
        C12JG c12jg = this.LLILZ;
        if (c12jg != null) {
            return c12jg;
        }
        return null;
    }

    @Override // X.InterfaceC1658800tGg
    public final void V3() {
        C12JF c12jf = this.LLJILJIL;
        if (c12jf == null) {
            c12jf = null;
        }
        c12jf.V3();
    }

    @Override // X.InterfaceC1658800tGg
    public final void hide() {
        C12J7 c12j7;
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            C19570511hX.LIZIZ("InternalBeautyPanel hide");
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_beauty_slider_optimization", true, false)) {
                C12IS c12is = this.LLJ;
                if (c12is == null) {
                    c12is = null;
                }
                HashMap<String, Float> map = c12is.LJFF;
                if (!map.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Float> entry : map.entrySet()) {
                        if (entry.getValue().floatValue() == 0.0f) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new BeautyComposerInfo((String) ((Map.Entry) it2.next()).getKey(), "", "", "", ""));
                    }
                    if ((!arrayList.isEmpty()) && (c12j7 = this.LLJJ) != null) {
                        c12j7.LJJLIIIJILLIZJL(new ArrayList(arrayList));
                    }
                    C12IS c12is2 = this.LLJ;
                    (c12is2 != null ? c12is2 : null).LJFF.clear();
                }
            }
            C12JP c12jp = this.LLJJIII;
            ComposerBeauty composerBeauty = c12jp.LIZIZ;
            InterfaceC19731912Ib interfaceC19731912Ib = c12jp.LIZ;
            if (interfaceC19731912Ib != null) {
                interfaceC19731912Ib.LIZ(composerBeauty);
            }
            c12jp.LIZIZ = composerBeauty;
            LIZIZ().dismiss();
            C12J7 c12j72 = this.LLJJ;
            if (c12j72 != null) {
                c12j72.onDismiss();
            }
            this.LLILLJJLI.Fe(true, true, new AwS608S0100000_29(this, 308));
        }
    }

    @Override // X.InterfaceC1658800tGg
    public final void show() {
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        C19570511hX.LIZIZ("InternalBeautyPanel show");
        LIZ().LJFF();
        LIZIZ().show();
        C12J7 c12j7 = this.LLJJ;
        if (c12j7 != null) {
            c12j7.onShow();
        }
        this.LLJJIJI = this.LLILLJJLI.Fe(false, false, null).toString();
    }

    @Override // X.InterfaceC1658800tGg
    public final void setContainer(ViewGroup viewGroup) {
        this.LLILLL = viewGroup;
        LIZIZ().setContainer(this.LLILLL);
    }

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
    public InternalBeautyPanel(Context context, ViewGroup viewGroup, C12I9 c12i9, C12J0 c12j0) {
        Context context2 = context;
        this.LL = viewGroup;
        this.LLILLJJLI = c12i9;
        this.LLILLL = viewGroup;
        this.LLJJI = c12j0.LIZIZ;
        C12JP c12jp = new C12JP();
        this.LLJJIII = c12jp;
        C12JD c12jd = new C12JD();
        c12j0.LIZJ.LIZIZ.invoke(context2, viewGroup, c12j0);
        this.LLILZ = new C19733612Is(context2, viewGroup, c12j0);
        c12jd.LIZIZ(C12JG.class, LIZIZ());
        LIZIZ().setDismissViewClickListener(new ACListenerS163S0100000_29(this, 172));
        LIZIZ().LIZ();
        Drawable drawable = c12j0.LJIIIZ;
        if (drawable != null) {
            LIZIZ().lo(drawable);
        }
        this.LLILZIL = new C12J9(c12jp, c12jd, c12i9, this.LLJJ, this.LLJJI);
        C19775612Yw c19775612Yw = c12j0.LIZLLL.LJJIIJ;
        View root = LIZIZ().getRoot();
        C12J9 c12j9 = this.LLILZIL;
        c19775612Yw.invoke(context2, root, c12j0, c12j9 == null ? null : c12j9);
        View root2 = LIZIZ().getRoot();
        C12J9 c12j92 = this.LLILZIL;
        this.LLILZLL = new C19732312If(context2, root2, c12j0, c12j92 == null ? null : c12j92);
        c12jd.LIZIZ(C12IV.class, LIZ());
        this.LLJ = new C12IS(c12jp, c12jd, c12i9, this.LLJJ, this.LLJJI);
        C19775612Yw c19775612Yw2 = c12j0.LJ.LJ;
        View root3 = LIZIZ().getRoot();
        C12IS c12is = this.LLJ;
        c19775612Yw2.invoke(context2, root3, c12j0, c12is == null ? null : c12is);
        View root4 = LIZIZ().getRoot();
        C12IS c12is2 = this.LLJ;
        C12IX c12ix = new C12IX(context2, root4, c12j0, c12is2 == null ? null : c12is2);
        this.LLJI = c12ix;
        c12jd.LIZIZ(C12JN.class, c12ix);
        this.LLJIJIL = new C12IT(c12i9, this.LLJJ, this.LLJJI, c12jp, c12jd);
        C19775612Yw c19775612Yw3 = c12j0.LJI.LIZ;
        View root5 = LIZIZ().getRoot();
        C12IT c12it = this.LLJIJIL;
        c19775612Yw3.invoke(context2, root5, c12j0, c12it == null ? null : c12it);
        View root6 = LIZIZ().getRoot();
        C12IT c12it2 = this.LLJIJIL;
        C12IU c12iu = new C12IU(context2, root6, c12j0, c12it2 == null ? null : c12it2);
        this.LLJILJIL = c12iu;
        c12jd.LIZIZ(C12JF.class, c12iu);
        this.LLIZ = new C12H1(c12i9, c12jp, this.LLJJI, LIZ());
        C19775612Yw c19775612Yw4 = c12j0.LJFF.LIZ;
        View root7 = LIZIZ().getRoot();
        C12H1 c12h1 = this.LLIZ;
        c19775612Yw4.invoke(context2, root7, c12j0, c12h1 == null ? null : c12h1);
        View root8 = LIZIZ().getRoot();
        C12H1 c12h12 = this.LLIZ;
        C19729012Gy c19729012Gy = new C19729012Gy(context2, root8, c12j0, c12h12 == null ? null : c12h12);
        this.LLIZLLLIL = c19729012Gy;
        c12jd.LIZIZ(C12JU.class, c19729012Gy);
        C12J7 c12j7 = this.LLJJ;
        C12JF c12jf = this.LLJILJIL;
        c12jf = c12jf == null ? null : c12jf;
        C12JU c12ju = this.LLIZLLLIL;
        this.LLJILJILJ = new C12JK(c12i9, c12j7, c12jp, c12jf, c12ju == null ? null : c12ju);
        C19775612Yw c19775612Yw5 = c12j0.LJII.LIZ;
        View root9 = LIZIZ().getRoot();
        C12JK c12jk = this.LLJILJILJ;
        c19775612Yw5.invoke(context2, root9, c12j0, c12jk == null ? null : c12jk);
        View root10 = LIZIZ().getRoot();
        C12JK c12jk2 = this.LLJILJILJ;
        C12JL c12jl = new C12JL(root10, c12j0, c12jk2 == null ? null : c12jk2);
        this.LLJILLL = c12jl;
        c12jd.LIZIZ(InterfaceC19732212Ie.class, c12jl);
        if (context2 instanceof C19GS) {
            Scene sceneLIZ = C0EBE.LIZ(viewGroup);
            Object obj = context2;
            if (sceneLIZ != null) {
                Scene sceneLIZ2 = C565530MFz.LIZ(sceneLIZ);
                obj = context2;
                if (sceneLIZ2 != null) {
                    obj = sceneLIZ2;
                }
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
            lifecycleOwner.getLifecycle().addObserver(this);
            c12i9.we().safeObserve(lifecycleOwner, new AObserverS231S0100000_29(this, 122));
            c12i9.He().observe(lifecycleOwner, new AObserverS231S0100000_29(this, 123));
            c12i9.Ee().safeObserve(lifecycleOwner, new AObserverS231S0100000_29(this, 124));
        }
    }
}
