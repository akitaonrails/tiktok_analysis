package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C0I2U;
import X.C1558520qew;
import X.C19719912Dl;
import X.C628830OlV;
import X.C723850SaN;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiDynamicHeaderContainerAssem extends DynamicAssem implements IPoiDetailVisibilityAbility, ContainerEventDispatcher$IPoiDetailVisibilityAbility {
    public static final Map<String, Integer> LLJJIJIIJIL = new LinkedHashMap();
    public LinearLayout LLJJIII;
    public boolean LLJJI = true;
    public List<C628830OlV> LLJJIJI = new ArrayList();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2t;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        Map<String, Integer> map = LLJJIJIIJIL;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C628830OlV> entry : ip().LLJILJIL.entrySet()) {
            String key = entry.getKey();
            C628830OlV value = entry.getValue();
            Integer num = (Integer) ((LinkedHashMap) map).get(key);
            if (num != null) {
                value.LLIZLLLIL = num.intValue();
                arrayList.add(value);
            }
        }
        LinearLayout linearLayout = this.LLJJIII;
        if (linearLayout != null) {
            lp(linearLayout.getContext());
        }
        C723850SaN.LIZLLL(this, new C0I2U(this, arrayList));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return LLJJIJIIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDynamicHeaderContainerAssem.lp(android.content.Context):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDynamicHeaderContainerAssem for r8v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r9) {
        /*
            r8 = this;
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L19
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.01wD r7 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r7 != 0) goto L57
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.C1558520qew.LJII(r4, r8, r0, r5, r5)
        L19:
            r0 = 2131374984(0x7f0a3388, float:1.8370103E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r8.LLJJIII = r0
            android.content.Context r0 = r9.getContext()
            r8.lp(r0)
            r8.mo127do()
            boolean r0 = r8.LLJJI
            if (r0 == 0) goto L56
            r8.LLJJI = r6
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            if (r0 == 0) goto L56
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility> r0 = com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility r0 = (com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility) r0
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.MP()
            if (r1 == 0) goto L56
            X.0CtE r0 = new X.0CtE
            r0.<init>(r1)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r9, r0)
        L56:
            return
        L57:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r7)     // Catch: java.lang.IllegalArgumentException -> L6f
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L6f
            if (r0 == 0) goto L67
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L6f
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L6f
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L6f
            goto L19
        L67:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L6f
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L6f
            throw r1     // Catch: java.lang.IllegalArgumentException -> L6f
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            r2[r6] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L9e
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            goto L19
        L9e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.IPoiDetailVisibilityAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDynamicHeaderContainerAssem.onViewCreated(android.view.View):void");
    }

    public final void mp(C19719912Dl c19719912Dl, String str, Integer num) {
        ViewGroup viewGroup;
        C723850SaN.LJII(this, c19719912Dl, str);
        if (num != null) {
            int iIntValue = num.intValue();
            LinearLayout linearLayout = this.LLJJIII;
            View viewFindViewById = null;
            if (linearLayout != null) {
                viewFindViewById = linearLayout.findViewById(iIntValue);
            }
            if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
    }
}
