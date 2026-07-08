package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo;

import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C0PPD;
import X.C0R12;
import X.C0R45;
import X.C1007860cKm;
import X.C1010120cOQ;
import X.C1011930cRL;
import X.C1558520qew;
import X.C1840307Ir;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C21565319aV;
import X.C452501pT;
import X.C640750PBh;
import X.C650240Pew;
import X.C650630PfZ;
import X.C655610Pnb;
import X.C655710Pnl;
import X.C656700PpM;
import X.C656760PpS;
import X.C656770PpT;
import X.C656780PpU;
import X.C691880RBy;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC656710PpN;
import X.EnumC658110Prd;
import X.InterfaceC1587906Jp;
import X.InterfaceC656730PpP;
import X.InterfaceC656740PpQ;
import X.InterfaceC657510Pqf;
import X.InterfaceC712990Rxx;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdPhotoCardContentAssem extends ReusedUISlotAssem<SearchAdPhotoCardContentAssem> implements InterfaceC712990Rxx<C655710Pnl> {
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public InterfaceC656740PpQ LLJL;
    public InterfaceC656730PpP LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public ViewGroup LLJLLIL;
    public RadiusLayout LLJLLL;
    public boolean LLJZ;
    public boolean LLL;
    public C655710Pnl LLLF;
    public C0PPD LLLFF;
    public EnumC656710PpN LLJZIJLIL = EnumC656710PpN.PRODUCT_PHOTO;
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(303));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 699));

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC656740PpQ interfaceC656740PpQ = this.LLJL;
        if (interfaceC656740PpQ != null) {
            interfaceC656740PpQ.onDestroy();
        }
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.onDestroy();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC656740PpQ interfaceC656740PpQ = this.LLJL;
        if (interfaceC656740PpQ != null) {
            interfaceC656740PpQ.unBind();
        }
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.unBind();
        }
        this.LLJL = null;
        this.LLJLIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return C1840307Ir.LIZ() ? R.layout.et1 : R.layout.et0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner lifecycleOwner;
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.rxr);
        this.LLJLL = (TuxIconView) view.findViewById(R.id.qcl);
        this.LLJLLIL = (ViewGroup) view.findViewById(R.id.yxk);
        this.LLJLLL = (RadiusLayout) view.findViewById(R.id.yxm);
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.yxj);
        if (C650240Pew.LIZ()) {
            RadiusLayout radiusLayout = this.LLJLLL;
            if (radiusLayout != null) {
                C650240Pew.LIZ.getClass();
                radiusLayout.setRadius(0.0f);
            }
            ViewGroup viewGroup = this.LLJJLIIIJLLLLLLLZ;
            C650240Pew.LIZ.getClass();
            lifecycleOwner = null;
            C21565319aV.LIZIZ(viewGroup, Float.valueOf(0.0f), null, null, null, null, 30);
        } else {
            RadiusLayout radiusLayout2 = this.LLJLLL;
            if (radiusLayout2 != null) {
                C21565319aV.LIZIZ(radiusLayout2, (Float) this.LLLFFI.getValue(), null, null, null, null, 30);
            }
            lifecycleOwner = null;
            C21565319aV.LIZIZ(this.LLJJLIIIJLLLLLLLZ, (Float) this.LLLFFI.getValue(), null, null, null, null, 30);
        }
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 20));
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdPhotoCardContentAssem.onViewCreated.3
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LJJLIIIJLLLLLLLZ() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Mu(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean N1() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View Vt() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void kC0(int i) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean mm() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void wp(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void J0() {
                    InterfaceC656740PpQ interfaceC656740PpQ = SearchAdPhotoCardContentAssem.this.LLJL;
                    if (interfaceC656740PpQ != null) {
                        interfaceC656740PpQ.J0();
                    }
                    InterfaceC656730PpP interfaceC656730PpP = SearchAdPhotoCardContentAssem.this.LLJLIL;
                    if (interfaceC656730PpP != null) {
                        interfaceC656730PpP.J0();
                    }
                    SearchAdPhotoCardContentAssem.this.LLJZ = true;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LLZZZZ() {
                    InterfaceC656740PpQ interfaceC656740PpQ = SearchAdPhotoCardContentAssem.this.LLJL;
                    if (interfaceC656740PpQ != null) {
                        interfaceC656740PpQ.LLZZZZ();
                    }
                    InterfaceC656730PpP interfaceC656730PpP = SearchAdPhotoCardContentAssem.this.LLJLIL;
                    if (interfaceC656730PpP != null) {
                        interfaceC656730PpP.LLZZZZ();
                    }
                    SearchAdPhotoCardContentAssem.this.LLJZ = false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View getDetectView() {
                    C1011930cRL c1011930cRLMm0;
                    InterfaceC656740PpQ interfaceC656740PpQ = SearchAdPhotoCardContentAssem.this.LLJL;
                    return (interfaceC656740PpQ == null || (c1011930cRLMm0 = interfaceC656740PpQ.Mm0()) == null) ? SearchAdPhotoCardContentAssem.this.LJJIJL() : c1011930cRLMm0;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean isPlaying() {
                    return SearchAdPhotoCardContentAssem.this.LLJZ;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                    function0.invoke();
                }
            }, SearchServiceCenter$AutoPlayAbility.class, lifecycleOwner, lifecycleOwner);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 32));
    }

    public final void op(Lifecycle.State state) {
        Fragment fragmentLJI;
        FragmentManager fragmentManager;
        Fragment fragmentLJJJJZI;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        sAFHelper.getClass();
        if (!SAFHelper.LJJJJJ(fragmentLJI2, c19egLIZ) && !SAFHelper.LJJJJI(C724240Sb0.LJI(this), c19egLIZ) && (fragmentLJI = C724240Sb0.LJI(this)) != null && fragmentLJI.isAdded() && (fragmentManager = (FragmentManager) this.LLLFZ.getValue()) != null && (fragmentLJJJJZI = fragmentManager.LJJJJZI("container")) != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C655710Pnl c655710Pnl) {
        EnumC656710PpN enumC656710PpN;
        EnumC658110Prd enumC658110Prd;
        C0PPD c0ppdLIZIZ;
        C1007860cKm c1007860cKmLJIILIIL;
        C655710Pnl c655710Pnl2 = c655710Pnl;
        this.LLLF = c655710Pnl2;
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxIconView tuxIconView2 = this.LLJLL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        if (C1010120cOQ.LJJIFFI(c655710Pnl2.LLILLJJLI)) {
            enumC656710PpN = EnumC656710PpN.CAROUSEL_ADS;
        } else {
            enumC656710PpN = EnumC656710PpN.PRODUCT_PHOTO;
        }
        this.LLJZIJLIL = enumC656710PpN;
        if (enumC656710PpN == EnumC656710PpN.CAROUSEL_ADS) {
            enumC658110Prd = EnumC658110Prd.CAROUSEL_ADS;
        } else {
            enumC658110Prd = EnumC658110Prd.PRODUCT_PHOTO;
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        ViewGroup viewGroup = null;
        if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
            c0ppdLIZIZ = c1007860cKmLJIILIIL.LIZIZ(c655710Pnl2.LLILLJJLI, null);
        } else {
            c0ppdLIZIZ = null;
        }
        this.LLLFF = c0ppdLIZIZ;
        if (c0ppdLIZIZ != null) {
            c0ppdLIZIZ.LJFF(c655710Pnl2.LLILLJJLI, enumC658110Prd, null);
        }
        EnumC656710PpN enumC656710PpN2 = this.LLJZIJLIL;
        int[] iArr = C656700PpM.LIZ;
        int i = iArr[enumC656710PpN2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                TuxIconView tuxIconView3 = this.LLJLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJLILLLLZIIL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            }
        }
        C656760PpS c656760PpS = new C656760PpS(this, c655710Pnl2);
        int i2 = iArr[this.LLJZIJLIL.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LLJLIL = C0R12.LIZIZ.LJIJJ(new C656770PpT(c656760PpS, this));
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LLJL = C0R12.LIZIZ.LJJ(new C656780PpU(c656760PpS));
        }
        InterfaceC656740PpQ interfaceC656740PpQ = this.LLJL;
        if (interfaceC656740PpQ != null) {
            interfaceC656740PpQ.bind();
        }
        InterfaceC656730PpP interfaceC656730PpP = this.LLJLIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.bind();
        }
        if (this.LLL) {
            InterfaceC656740PpQ interfaceC656740PpQ2 = this.LLJL;
            if (interfaceC656740PpQ2 != null) {
                interfaceC656740PpQ2.onViewAttachedToWindow();
            }
            InterfaceC656730PpP interfaceC656730PpP2 = this.LLJLIL;
            if (interfaceC656730PpP2 != null) {
                interfaceC656730PpP2.onViewAttachedToWindow();
            }
        }
        C0PPD c0ppd = this.LLLFF;
        if (c0ppd != null) {
            c0ppd.LIZ();
        }
        Context context = getContext();
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewLJJIJL;
        }
        C691880RBy.LIZ(context, viewGroup, c655710Pnl2.LLILLJJLI.getAwemeRawAd(), false);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C655710Pnl c655710Pnl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C655710Pnl c655710Pnl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
