package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C1175770ghb;
import X.C1176270giP;
import X.C1389890mGx;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1175790ghd;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS24S0201000_18;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailErrorAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public View LLJ;
    public C1749280vcc LLJI;
    public C1389890mGx LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailErrorAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapDetailErrorAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1387), AFwS256S0000000_18.get$arr$(472), null, true);
    }

    public final PoiMapDetailPageVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    public final void d() {
        PoiMapDetailPageVM poiMapDetailPageVMGo = Go();
        C1175770ghb c1175770ghb = poiMapDetailPageVMGo.LL;
        EnumC1175790ghd enumC1175790ghd = c1175770ghb.LIZIZ;
        if (enumC1175790ghd != null) {
            enumC1175790ghd.onRetry(c1175770ghb);
        }
        C1176270giP c1176270giP = poiMapDetailPageVMGo.LLIZLLLIL;
        if (c1176270giP != null) {
            PoiMapDetailPageVM.vQ2(poiMapDetailPageVMGo, c1176270giP, false, false, 0L, 12);
        } else {
            poiMapDetailPageVMGo.AQ2();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = view.findViewById(R.id.w1w);
        this.LLJI = (C1749280vcc) view.findViewById(R.id.w28);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0giH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 7), 6);
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiMapDetailSheetSlideAbility iPoiMapDetailSheetSlideAbility = new IPoiMapDetailSheetSlideAbility() { // from class: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailErrorAssem$subscribe$3
                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetSlideAbility
                public final void Og(int i) {
                    PoiMapDetailErrorAssem poiMapDetailErrorAssem = this.LL;
                    View view2 = poiMapDetailErrorAssem.LLJ;
                    if (view2 != null) {
                        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view2, new ARunnableS24S0201000_18(view2, poiMapDetailErrorAssem, i, 0));
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiMapDetailSheetSlideAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiMapDetailSheetSlideAbility, IPoiMapDetailSheetSlideAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiMapDetailSheetSlideAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiMapDetailSheetSlideAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiMapDetailSheetSlideAbility.class.getClassLoader(), new Class[]{IPoiMapDetailSheetSlideAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiMapDetailSheetSlideAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.mapdetail.assem.IPoiMapDetailSheetSlideAbility");
            }
        }
    }
}
