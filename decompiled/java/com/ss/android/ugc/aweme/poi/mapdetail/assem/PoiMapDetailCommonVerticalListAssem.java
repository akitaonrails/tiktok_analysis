package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C09R3;
import X.C1175090ggV;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C2255108sX;
import X.C339190DRl;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1175760gha;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapdetail.cell.PoiMapDetailVerticalSkeletonCell;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailCommonVerticalListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final C1175090ggV<PoiGeneralCard> LLJILJIL;

    public interface PoiMapDetailVerticalListAbility extends InterfaceC494301wD {
        void LIZJ();

        void LJJJJLI();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailCommonVerticalListAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailCommonVerticalListAssem.class, "navTabVM", "getNavTabVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailNavTabVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PoiMapDetailCommonVerticalListAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PoiMapDetailCommonVerticalListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 409), AFwS256S0000000_18.get$arr$(469), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailNavTabVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 410), AFwS256S0000000_18.get$arr$(470), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ3, 411), AFwS256S0000000_18.get$arr$(471), null, true);
        this.LLJILJIL = new C1175090ggV<>();
    }

    public final PoiMapDetailPageVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.vertical_list);
        this.LLJIJIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            this.LLJILJIL.getClass();
            C1175090ggV.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiMapDetailVerticalSkeletonCell.class);
            }
        }
        View viewFindViewById = view.findViewById(R.id.jzi);
        if (Go().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            C339190DRl.LIZIZ(viewFindViewById);
        } else {
            C339190DRl.LIZIZ(viewFindViewById);
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ghO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C995810c1L) obj).LL;
                }
            }, null, new AwS620S0100000_6(viewFindViewById, 2), 6);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AkS87S0100000_18(this, 2), viewFindViewById);
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7z = Go().LLIZ;
        if (interfaceC665370Q7z != null) {
            PoiMapDetailVerticalListAbility poiMapDetailVerticalListAbility = new PoiMapDetailVerticalListAbility() { // from class: com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonVerticalListAssem$loadAllAbility$1
                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonVerticalListAssem.PoiMapDetailVerticalListAbility
                public final void LIZJ() {
                    C20600815jK<InterfaceC1891350zJl> state;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LL.LLJIJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv3 == null || (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) == null) {
                        return;
                    }
                    state.LJFF(null);
                }

                @Override // com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonVerticalListAssem.PoiMapDetailVerticalListAbility
                public final void LJJJJLI() {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LL.LLJIJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        viewOnAttachStateChangeListenerC20604515jv3.scrollToPosition(0);
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, PoiMapDetailVerticalListAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, poiMapDetailVerticalListAbility, PoiMapDetailVerticalListAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(poiMapDetailVerticalListAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(poiMapDetailVerticalListAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(PoiMapDetailVerticalListAbility.class.getClassLoader(), new Class[]{PoiMapDetailVerticalListAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, PoiMapDetailVerticalListAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonVerticalListAssem.PoiMapDetailVerticalListAbility");
                    }
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0ghN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 20), 6);
    }
}
