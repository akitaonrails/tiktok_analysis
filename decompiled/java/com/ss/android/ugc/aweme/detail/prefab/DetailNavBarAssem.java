package com.ss.android.ugc.aweme.detail.prefab;

import X.AbstractC1250290idn;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OM1;
import X.C0RUV;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2095008Iq;
import X.C2255108sX;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class DetailNavBarAssem extends DynamicAssem {
    public TuxNavBar LLJJI;
    public TuxTextView LLJJIII;
    public String LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 100));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public final TuxNavBar lp() {
        TuxNavBar tuxNavBar = this.LLJJI;
        if (tuxNavBar != null) {
            return tuxNavBar;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
        C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, -2));
        tuxNavBar.setNavBackground(0);
        Zo(tuxNavBar);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        String string;
        super.didUpdateConfig(c0ruv);
        Object obj = getConfig().LLILZ.get("title");
        if (obj != null && (string = obj.toString()) != null) {
            String str = this.LLJJIJI;
            if (str == null) {
                str = null;
            }
            if (!Intrinsics.LJFF(str, string)) {
                this.LLJJIJI = string;
                TuxNavBar tuxNavBarLp = lp();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = string;
                tuxNavBarLp.LJIJJ(c1250250idj);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String string;
        int i;
        final Integer numLJIIJJI;
        float f;
        Fragment fragmentLJI;
        String string2;
        NavActionProvider navActionProvider;
        List<AbstractC1250290idn> listAr0;
        mo127do();
        Object obj = getConfig().LLILZ.get("title");
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        this.LLJJIJI = string;
        this.LLJJI = (TuxNavBar) view;
        TuxNavBar tuxNavBarLp = lp();
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        if (Intrinsics.LJFF(this.LLJJIJIIJIL.getValue(), "arrow")) {
            i = R.raw.icon_arrow_left_ltr;
        } else {
            i = R.raw.icon_x_mark;
        }
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZIZ = "back";
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 101));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LJ(abstractC1250290idnArr);
        C1250250idj c1250250idj = new C1250250idj();
        String str = this.LLJJIJI;
        if (str == null) {
            str = null;
        }
        c1250250idj.LIZJ = str;
        c1250250idj.LIZIZ = "center_title";
        c0om1.LIZJ = c1250250idj;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (navActionProvider = (NavActionProvider) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), NavActionProvider.class, null)) != null && (listAr0 = navActionProvider.ar0()) != null) {
            c0om1.LIZ(listAr0);
        }
        tuxNavBarLp.setNavActions(c0om1);
        Object obj2 = getConfig().LLILZ.get("fade_in_offset");
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string2);
        } else {
            numLJIIJJI = null;
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.p1i);
        this.LLJJIII = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        if (numLJIIJJI == null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.B5(tuxTextView, f);
        if (numLJIIJJI != null && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem.onViewCreated.3
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                public final void bq(int i2) {
                    int iMin = Math.min(i2, numLJIIJJI.intValue());
                    boolean z = true;
                    if (iMin >= 0 && iMin <= numLJIIJJI.intValue()) {
                        TuxTextView tuxTextView2 = this.LLJJIII;
                        if (tuxTextView2 == null) {
                            tuxTextView2 = null;
                        }
                        C786410Ut5.B5(tuxTextView2, iMin / numLJIIJJI.intValue());
                    }
                    TuxNavBar tuxNavBarLp2 = this.lp();
                    if (iMin <= 0) {
                        z = false;
                    }
                    tuxNavBarLp2.LJIIZILJ(z);
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, PageHeaderScrollAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(pageHeaderScrollAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(pageHeaderScrollAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, PageHeaderScrollAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
            }
        }
    }
}
