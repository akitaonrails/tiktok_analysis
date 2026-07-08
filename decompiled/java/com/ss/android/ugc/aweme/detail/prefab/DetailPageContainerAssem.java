package com.ss.android.ugc.aweme.detail.prefab;

import X.C01GW;
import X.C036E;
import X.C0H62;
import X.C11NZ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C2097608Jq;
import X.C327850CtD;
import X.C452501pT;
import X.C481090Itn;
import X.C627530OjP;
import X.C628830OlV;
import X.C639050P4t;
import X.C723850SaN;
import X.C804440Vh4;
import X.InterfaceC1602960roc;
import X.InterfaceC420801kM;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageContainerAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS107S0400000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class DetailPageContainerAssem extends DynamicAssem implements RefreshSuccessSubscriber, RefreshErrorSubscriber, RefreshLoadingSubscriber, DetailPageContainerAbility {
    public static final Map<String, Integer> LLJJJIL = C2097608Jq.LJIIIIZZ(new Pair("navbar", Integer.valueOf(R.id.p15)), new Pair("bottom", Integer.valueOf(R.id.cad)), new Pair("record", Integer.valueOf(R.id.sy6)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(R.id.w0k)), new Pair("bottom_mask_view", Integer.valueOf(R.id.btq)));
    public C481090Itn LLJJI;
    public InterfaceC1602960roc LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 102));
    public long LLJJIJIIJIL;
    public InterfaceC420801kM LLJJIJIL;
    public C627530OjP LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bk7;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        Integer num;
        Map<String, C628830OlV> map = ip().LLJILJIL;
        ArrayList arrayList = new ArrayList();
        List listLJIIJJI = C1697810uHb.LJIIJJI("header", "content");
        for (Map.Entry<String, C628830OlV> entry : map.entrySet()) {
            String key = entry.getKey();
            C628830OlV value = entry.getValue();
            Map<String, Integer> map2 = LLJJJIL;
            if (map2.keySet().contains(key) && (num = map2.get(key)) != null) {
                value.LLIZLLLIL = num.intValue();
                arrayList.add(value);
            }
        }
        C723850SaN.LIZLLL(this, new AwS107S0400000_9(this, (DetailPageContainerAssem) arrayList, (List<C628830OlV>) map, (Map<String, C628830OlV>) listLJIIJJI, (List<String>) 0));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String str = (String) this.LLJJIJI.getValue();
        if (str != null) {
            C327850CtD.LIZ("detail_page_init", str);
            C327850CtD.LIZLLL("detail_container_init", str);
        }
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void t0() {
        if (this.LLJJIJI.getValue() != null) {
            InterfaceC1602960roc interfaceC1602960roc = this.LLJJIII;
            if (interfaceC1602960roc == null) {
                interfaceC1602960roc = null;
            }
            interfaceC1602960roc.LIZJ(3000L);
        }
        lp(true);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public final void i1() {
        this.LLJJIJIIJIL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC420801kM interfaceC420801kM = this.LLJJIJIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public final void LLLLLZIL(Throwable th) {
        if (this.LLJJIJI.getValue() != null) {
            InterfaceC1602960roc interfaceC1602960roc = this.LLJJIII;
            if (interfaceC1602960roc == null) {
                interfaceC1602960roc = null;
            }
            interfaceC1602960roc.LIZJ(3000L);
        }
        lp(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OjP] */
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
    public final void lp(boolean z) {
        long j;
        C627530OjP c627530OjP = null;
        C481090Itn c481090Itn = null;
        if (z) {
            C481090Itn c481090Itn2 = this.LLJJI;
            if (c481090Itn2 != null) {
                c481090Itn = c481090Itn2;
            }
            c481090Itn.setRefreshing(false);
            return;
        }
        this.LLJJJ = new C0H62() { // from class: X.0OjP
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                RefreshAbility refreshAbility;
                if (c0o0l2 == C0O0L.AVAILABLE) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                    C627530OjP c627530OjP2 = null;
                    if (fragmentLJI != null && (refreshAbility = (RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), RefreshAbility.class, null)) != null) {
                        refreshAbility.refresh();
                    }
                    InterfaceC420801kM interfaceC420801kM = this.LL.LLJJIJIL;
                    if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                        interfaceC420801kM.dispose();
                    }
                    C804440Vh4 c804440Vh4 = C036E.LIZ;
                    C627530OjP c627530OjP3 = this.LL.LLJJJ;
                    if (c627530OjP3 != null) {
                        c627530OjP2 = c627530OjP3;
                    }
                    c804440Vh4.LIZLLL(c627530OjP2);
                }
            }
        };
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
        if (jCurrentTimeMillis > 2000) {
            j = 0;
        } else {
            C804440Vh4 c804440Vh4 = C036E.LIZ;
            C627530OjP c627530OjP2 = this.LLJJJ;
            if (c627530OjP2 != null) {
                c627530OjP = c627530OjP2;
            }
            c804440Vh4.LIZ(c627530OjP);
            j = ((long) 2000) - jCurrentTimeMillis;
        }
        C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C639050P4t(this, 0));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem for r10v8 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem.onViewCreated(android.view.View):void");
    }
}
