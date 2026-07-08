package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.AbstractC1538740q92;
import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C0WWO;
import X.C1008603wy;
import X.C1161850gL9;
import X.C1166240gSE;
import X.C1166590gSn;
import X.C1166610gSp;
import X.C13LE;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1538140q84;
import X.C1538590q8n;
import X.C1547280qMo;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1DFH;
import X.C2010707uD;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C433140Gye;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1166540gSi;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mix.api.BaseMixContainerAbility;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreHeaderAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreHeaderAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.UpdateHeaderEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreHeaderAssem extends MixUIContentAssem<C1166240gSE> implements StoreHeaderAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C1537720q7O LLJJIJIIJIL;
    public final n LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreHeaderAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/showcase/mix/viewmodel/StoreMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoreHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS256S0000000_18.get$arr$(66));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreMixViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 199), AFwS256S0000000_18.get$arr$(65), null, true);
        this.LLJJIJIL = new n();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 201));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 200));
        this.LLJJL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(99));
    }

    public final int So() {
        Resources resources;
        Integer numValueOf;
        Resources resources2;
        int dimensionPixelSize = 0;
        try {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null && (numValueOf = Integer.valueOf(C786410Ut5.n3(resources, "status_bar_height", "dimen", "android"))) != null) {
                Context context2 = getContext();
                if (context2 == null || (resources2 = context2.getResources()) == null) {
                    return 0;
                }
                dimensionPixelSize = resources2.getDimensionPixelSize(numValueOf.intValue());
                return dimensionPixelSize;
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return dimensionPixelSize;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJJJJ = true;
        super.onDestroy();
        C1537720q7O c1537720q7O = this.LLJJIJIIJIL;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -298666335) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreHeaderAbility
    public final int LLLZL() {
        int i = this.LLJJJ;
        return i <= 0 ? LJJIJL().getHeight() : i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final Map<String, Class<?>> Lo() {
        return (ConcurrentHashMap) this.LLJJL.getValue();
    }

    public final FrameLayout Oo() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jit) : null;
            this.LLJJIII = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final StoreMixViewModel Vo() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (StoreMixViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C1537720q7O c1537720q7O;
        super.onPause();
        if (getContext() instanceof StoreMixActivity) {
            if (((Activity) getContext()).isFinishing() || (c1537720q7O = this.LLJJIJIIJIL) == null) {
                return;
            }
            c1537720q7O.onHide();
            return;
        }
        C1537720q7O c1537720q7O2 = this.LLJJIJIIJIL;
        if (c1537720q7O2 != null) {
            c1537720q7O2.onHide();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1537720q7O c1537720q7O = this.LLJJIJIIJIL;
        if (c1537720q7O != null) {
            c1537720q7O.onShow();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        Map<String, Object> map;
        String strLIZ;
        Map<String, Object> map2;
        String str;
        String strLIZLLL;
        String str2;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1537720q7O c1537720q7O;
        RouteIntent routeIntent;
        super.onViewCreated(view);
        boolean z = false;
        this.LLJJJJ = false;
        C1166240gSE c1166240gSEHo = Ho();
        if (c1166240gSEHo != null) {
            map = c1166240gSEHo.LIZLLL;
        } else {
            map = null;
        }
        C1161850gL9.LIZJ("header", map);
        FrameLayout frameLayoutOo = Oo();
        if (frameLayoutOo != null) {
            C1166240gSE c1166240gSEHo2 = Ho();
            if (c1166240gSEHo2 == null || (strLIZ = C1166590gSn.LIZ(c1166240gSEHo2, C1166610gSp.LIZIZ, false)) == null) {
                strLIZ = C1166610gSp.LIZIZ;
            }
            String strLIZ2 = C2010707uD.LIZ(1, strLIZ, "fix_popup_close");
            if (this.LLJJIJIIJIL == null) {
                C1538140q84 c1538140q84 = C1538140q84.LIZ;
                C1538590q8n c1538590q8n = new C1538590q8n();
                c1538590q8n.LIZLLL = false;
                c1538590q8n.LJ = false;
                c1538590q8n.LJFF = false;
                c1538590q8n.LJI = true;
                c1538590q8n.LJIIIZ = true;
                SparkContext sparkContextLIZJ = c1538140q84.LIZJ(strLIZ2, c1538590q8n);
                Go(sparkContextLIZJ);
                C1538590q8n c1538590q8n2 = new C1538590q8n();
                c1538590q8n2.LIZLLL = false;
                c1538590q8n2.LJ = false;
                c1538590q8n2.LJFF = false;
                c1538590q8n2.LJI = true;
                c1538590q8n2.LJIIIZ = true;
                sparkContextLIZJ.liteLynxConfig = c1538590q8n2;
                HashMap map3 = new HashMap();
                C1166240gSE c1166240gSEHo3 = Ho();
                if (c1166240gSEHo3 != null) {
                    str = c1166240gSEHo3.LJIIIZ;
                } else {
                    str = null;
                }
                C1008603wy.LIZIZ(map3, "page_source_info", str);
                if (c1166240gSEHo3 != null && (routeIntent = c1166240gSEHo3.LJI) != null) {
                    strLIZLLL = C0WWO.LIZLLL(routeIntent, "landing_deeplink");
                } else {
                    strLIZLLL = null;
                }
                C1008603wy.LIZIZ(map3, "landing_deeplink", strLIZLLL);
                C1547280qMo.LJ(sparkContextLIZJ, TemplateData.LJII(map3));
                if (c1166240gSEHo3 == null || (str2 = c1166240gSEHo3.LIZ) == null) {
                    str2 = "store_mix";
                }
                C1547280qMo.LIZLLL(sparkContextLIZJ, str2);
                if (c1166240gSEHo3 != null && c1166240gSEHo3.LIZIZ) {
                    z = true;
                }
                sparkContextLIZJ.LJJLIIIJ(Boolean.valueOf(z), "isPopup");
                sparkContextLIZJ.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0gSX
                    {
                        super(0);
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        StoreHeaderAssem storeHeaderAssem = this.LLILLJJLI;
                        if (!storeHeaderAssem.LLJJJJ && !storeHeaderAssem.LLJJJIL) {
                            storeHeaderAssem.LLJJJIL = true;
                            C736680Sv4.LJIIIIZZ(storeHeaderAssem, storeHeaderAssem.Vo(), new C2217381BqS() { // from class: X.0gSV
                                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                public final Object get(Object obj) {
                                    return ((C1166370gSR) obj).LLILLL;
                                }
                            }, null, new AwS632S0100000_18(storeHeaderAssem, 215), 6);
                            C736680Sv4.LJIIIIZZ(storeHeaderAssem, storeHeaderAssem.Vo(), new C2217381BqS() { // from class: X.0gSZ
                                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                public final Object get(Object obj) {
                                    return ((C1166370gSR) obj).LLILLJJLI;
                                }
                            }, null, new AwS632S0100000_18(storeHeaderAssem, 216), 6);
                            C736680Sv4.LJIIIIZZ(storeHeaderAssem, storeHeaderAssem.Vo(), new C2217381BqS() { // from class: X.0gSW
                                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                public final Object get(Object obj) {
                                    return ((C1166370gSR) obj).LLILZ;
                                }
                            }, null, new AwS632S0100000_18(storeHeaderAssem, 217), 6);
                            C736680Sv4.LJIIIIZZ(storeHeaderAssem, storeHeaderAssem.Vo(), new C2217381BqS() { // from class: X.0gSI
                                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                                public final Object get(Object obj) {
                                    return ((C1166370gSR) obj).LL;
                                }
                            }, null, new AwS632S0100000_18(storeHeaderAssem, 218), 6);
                        }
                    }
                });
                InterfaceC1531560pxS interfaceC1531560pxS = sparkContextLIZJ.hybridParams;
                if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                    InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContextLIZJ, frameLayoutOo.getContext(), null);
                    if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
                        c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
                    } else {
                        c1537720q7O = null;
                    }
                    this.LLJJIJIIJIL = c1537720q7O;
                }
            }
            C1537720q7O c1537720q7O2 = this.LLJJIJIIJIL;
            if (c1537720q7O2 != null) {
                C1166240gSE c1166240gSEHo4 = Ho();
                if (c1166240gSEHo4 != null) {
                    map2 = c1166240gSEHo4.LIZLLL;
                } else {
                    map2 = null;
                }
                C1161850gL9.LIZJ("header_load", map2);
                c1537720q7O2.load();
                n nVar = this.LLJJIJIL;
                if (true ^ nVar.LJJIJIL().isEmpty()) {
                    c1537720q7O2.updateData(nVar.toString(), (String) null);
                }
                frameLayoutOo.addView(c1537720q7O2);
            }
        }
        BaseMixContainerAbility baseMixContainerAbility = (BaseMixContainerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BaseMixContainerAbility.class, null);
        if (baseMixContainerAbility != null) {
            baseMixContainerAbility.aK(new InterfaceC1166540gSi() { // from class: X.0gSo
                @Override // X.InterfaceC1166540gSi
                public final void LIZ() {
                }

                @Override // X.InterfaceC1166540gSi
                public final void LJFF() {
                }

                @Override // X.InterfaceC1166540gSi
                public final void LLZZJLIL(C16GX c16gx, int i) {
                    this.LL.LLJJJ = view.getHeight() + i;
                    View view2 = (View) this.LL.LLJJJJLIIL.getValue();
                    if (view2 != null) {
                        float fAbs = Math.abs(i);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
                        view2.setY(fAbs);
                    }
                    C1195950hE9 c1195950hE9 = (C1195950hE9) this.LL.LLJJJJJIL.getValue();
                    if (c1195950hE9 != null) {
                        int height = view.getHeight();
                        int iAbs = Math.abs(i);
                        Function2<? super Integer, ? super Integer, Unit> function2 = c1195950hE9.LL;
                        if (function2 != null) {
                            function2.invoke(Integer.valueOf(height), Integer.valueOf(iAbs));
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem
    public final void No(Object obj, String str) {
        UpdateHeaderEvent updateHeaderEvent;
        super.No(obj, str);
        if (!this.LLJJJJ && Intrinsics.LJFF(str, "ecMixTabUpdateHeader") && (obj instanceof UpdateHeaderEvent) && (updateHeaderEvent = (UpdateHeaderEvent) obj) != null) {
            StoreMixViewModel storeMixViewModelVo = Vo();
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJI(storeMixViewModelVo, C2107308Nj.LIZ, new C433140Gye(this, updateHeaderEvent, null));
        }
    }
}
