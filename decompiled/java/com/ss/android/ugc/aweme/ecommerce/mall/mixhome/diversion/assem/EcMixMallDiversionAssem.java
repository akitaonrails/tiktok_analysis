package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem;

import X.AbstractC1772940wEm;
import X.C019F;
import X.C098200Yq;
import X.C09R3;
import X.C0BAU;
import X.C0PEM;
import X.C0QSJ;
import X.C0WOW;
import X.C0WOY;
import X.C123100dR;
import X.C127G;
import X.C1311220kE4;
import X.C13LE;
import X.C14EU;
import X.C1544630qIX;
import X.C1557000qcU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1608210rx5;
import X.C1637806bA;
import X.C1637906bB;
import X.C1739870vNR;
import X.C1741530vQ7;
import X.C1741560vQA;
import X.C1771720wCo;
import X.C1771750wCr;
import X.C1771760wCs;
import X.C1771770wCt;
import X.C1772240wDe;
import X.C1772770wEV;
import X.C1772800wEY;
import X.C1774710wHd;
import X.C1775130wIJ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21155517qb;
import X.C21156817qo;
import X.C21157017qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2399609ak;
import X.C259800zU;
import X.C597560NcA;
import X.C599820Nfo;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C7879035x;
import X.C948503nH;
import X.EnumC599720Nfe;
import X.InterfaceC1146704e9;
import X.InterfaceC13038058i;
import X.InterfaceC1768080w6w;
import X.InterfaceC1773890wGJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC599750Nfh;
import X.InterfaceC606320NqI;
import X.InterfaceC665370Q7z;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS1S2300000_26;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallInitConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.TTKECMMKGlobalContextModule;
import com.ss.android.ugc.aweme.ecommerce.mixmall.retreat.ECMixMallRetreatAbility;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS142S0110000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS61S0010000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallDiversionAssem extends UIContentAssem implements EcMixMallDiversionAbility, InterfaceC13038058i, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public FrameLayout LLJIJIL;
    public C1772240wDe LLJILJIL;
    public final C1608210rx5 LLJILJILJ = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public C1771760wCs LLJJI;
    public C1771770wCt LLJJIII;
    public C1771750wCr LLJJIJI;
    public C21157017qq LLJJIJIIJIL;
    public C21156817qo LLJJIJIL;
    public C1771720wCo LLJJJ;
    public volatile MainBusinessAbility LLJJJIL;
    public C127G LLJJJJ;
    public InterfaceC665370Q7z LLJJJJJIL;
    public C0QSJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcMixMallDiversionAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EcMixMallDiversionAssem.class, "diversionVM", "getDiversionVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/diversion/assem/vm/EcMixMallDiversionViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(EcMixMallDiversionAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public EcMixMallDiversionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1394), AFwS268S0000000_26.get$arr$(278), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(EcMixMallDiversionViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1395), AFwS268S0000000_26.get$arr$(279), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    public final FrameLayout Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i8o) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i8x) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShopMallMixFragment Jo() {
        return (ShopMallMixFragment) this.LLJILJILJ.getValue();
    }

    public final C1771760wCs Lo() {
        C1771760wCs c1771760wCs = this.LLJJI;
        if (c1771760wCs != null) {
            return c1771760wCs;
        }
        C1771760wCs c1771760wCs2 = new C1771760wCs(No().LLILZ, No().globalContext, No().LLILLJJLI, Jo().LLJJ, Jo());
        this.LLJJI = c1771760wCs2;
        return c1771760wCs2;
    }

    public final ShopMallMixViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS400S0100000_26(this, 6), EcMixMallDiversionViewModel.class, new AObjectS400S0100000_26(this, 7)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), EcMixMallDiversionAbility.class, null);
        }
        C0BAU.LIZ.getClass();
        if (C0BAU.LIZ()) {
            ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).LJII("real_time_voucher", "");
        }
        C1771720wCo c1771720wCo = this.LLJJJ;
        if (c1771720wCo != null) {
            c1771720wCo.LIZ();
        }
        this.LLJJJ = null;
        C21157017qq c21157017qq = this.LLJJIJIIJIL;
        if (c21157017qq != null) {
            C21155517qb c21155517qb = c21157017qq.LJ;
            if (c21155517qb != null) {
                c21155517qb.LIZ(false, false, null, null);
            }
            c21157017qq.LJ = null;
            Iterator it2 = ((ArrayList) c21157017qq.LIZLLL).iterator();
            while (it2.hasNext()) {
                c21157017qq.LIZ.LIZ.LIZIZ((C1775130wIJ) it2.next());
            }
            ((ArrayList) c21157017qq.LIZLLL).clear();
        }
        this.LLJJIJIIJIL = null;
        C21156817qo c21156817qo = this.LLJJIJIL;
        if (c21156817qo != null) {
            C21156817qo.LIZ(c21156817qo, 0, false, false, null, null, 33);
            c21156817qo.LJFF = null;
            Iterator it3 = ((ArrayList) c21156817qo.LJ).iterator();
            while (it3.hasNext()) {
                c21156817qo.LIZ.LIZ.LIZIZ((C1775130wIJ) it3.next());
            }
            ((ArrayList) c21156817qo.LJ).clear();
        }
        this.LLJJIJIL = null;
        C1771750wCr c1771750wCr = this.LLJJIJI;
        if (c1771750wCr != null) {
            c1771750wCr.LIZ();
        }
        this.LLJJIJI = null;
        C1771770wCt c1771770wCt = this.LLJJIII;
        if (c1771770wCt != null) {
            C1775130wIJ c1775130wIJ = c1771770wCt.LIZJ;
            if (c1775130wIJ != null) {
                c1771770wCt.LIZ.LIZ.LIZIZ(c1775130wIJ);
            }
            c1771770wCt.LIZJ = null;
        }
        this.LLJJIII = null;
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility
    public final void gz2(boolean z) {
        Iterator it2 = ((ArrayList) Jo().LLJJ.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1768080w6w) it2.next()).LJIIJ(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.EcMixMallDiversionAssem.onViewCreated(android.view.View):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void resetPrefetchCollection(C1739870vNR c1739870vNR) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 0;
        if (C7879035x.LIZLLL()) {
            if (Intrinsics.LJFF(c1739870vNR.LIZ, "tiktok_ecom_hybrid_mall")) {
                Object objLIZLLL = No().globalContext.LIZLLL("prefetch_collection", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (objLIZLLL instanceof String) {
                    str3 = (String) objLIZLLL;
                } else {
                    str3 = null;
                }
                JSONArray jSONArray = new JSONArray(str3);
                int length = jSONArray.length();
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        str4 = (String) obj;
                    } else {
                        str4 = null;
                    }
                    if (C123100dR.LIZ(str4) && Intrinsics.LJFF(C2399609ak.LIZJ(GsonProtectorUtils.parse(new p(), str4).LJIILIIL(), "prefetch_api"), c1739870vNR.LIZIZ)) {
                        jSONArray.remove(i);
                        break;
                    }
                    i++;
                }
                No().globalContext.LJ("prefetch_collection", jSONArray.toString(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            if (Intrinsics.LJFF(c1739870vNR.LIZ, "tiktok_ecom_hybrid_mall")) {
                Object objLIZLLL2 = No().globalContext.LIZLLL("prefetch_collection", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (objLIZLLL2 instanceof String) {
                    str = (String) objLIZLLL2;
                } else {
                    str = null;
                }
                JSONArray jSONArray2 = new JSONArray(str);
                int length2 = jSONArray2.length();
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    Object obj2 = jSONArray2.get(i);
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    if (C123100dR.LIZ(str2)) {
                        new p();
                        if (Intrinsics.LJFF(C2399609ak.LIZJ(p.LIZJ(str2).LJIILIIL(), "prefetch_api"), c1739870vNR.LIZIZ)) {
                            jSONArray2.remove(i);
                            break;
                        }
                    }
                    i++;
                }
                No().globalContext.LJ("prefetch_collection", jSONArray2.toString(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility
    public final void wI1(InterfaceC1773890wGJ interfaceC1773890wGJ) {
        C1771760wCs c1771760wCs = this.LLJJI;
        if (c1771760wCs != null) {
            c1771760wCs.LJFF = interfaceC1773890wGJ;
        }
    }

    @Override // X.InterfaceC13038058i
    public final void N0(String str, long j, JSONObject jSONObject) {
        if (Intrinsics.LJFF(str, "real_time_voucher")) {
            AssemVMLazy assemVMLazy = this.LLJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            EcMixMallDiversionViewModel ecMixMallDiversionViewModel = (EcMixMallDiversionViewModel) assemVMLazy.getValue();
            MainBusinessAbility mainBusinessAbility = this.LLJJJIL;
            if (mainBusinessAbility == null) {
                synchronized (this) {
                    mainBusinessAbility = this.LLJJJIL;
                    if (mainBusinessAbility == null) {
                        C0QSJ c0qsjLIZLLL = this.LLJJJJLIIL;
                        if (c0qsjLIZLLL == null) {
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJJIL;
                            if (interfaceC665370Q7zLJIIIZ == null) {
                                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                                this.LLJJJJJIL = interfaceC665370Q7zLJIIIZ;
                            }
                            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
                            this.LLJJJJLIIL = c0qsjLIZLLL;
                            if (c0qsjLIZLLL == null) {
                                mainBusinessAbility = null;
                            }
                            this.LLJJJIL = mainBusinessAbility;
                        }
                        mainBusinessAbility = (MainBusinessAbility) c0qsjLIZLLL.getAbility(MainBusinessAbility.class);
                        this.LLJJJIL = mainBusinessAbility;
                    }
                }
            }
            if (jSONObject != null) {
                C948503nH.LJI(ecMixMallDiversionViewModel, C0PEM.LIZJ, new C597560NcA(jSONObject, mainBusinessAbility, ecMixMallDiversionViewModel, j, str, null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0wCr] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0wCr] */
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility
    public final void Vu1(View view, String str, String str2, Map map) {
        ECMixMallRetreatAbility eCMixMallRetreatAbility;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = this.LLJJIJI;
        c259800zU.element = r0;
        if (r0 == 0) {
            ?? c1771750wCr = new C1771750wCr(Lo(), Go());
            c259800zU.element = c1771750wCr;
            this.LLJJIJI = c1771750wCr;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        ARunnableS1S2300000_26 aRunnableS1S2300000_26 = new ARunnableS1S2300000_26(c259800zU, map, view, str, str2, 2);
        if (c19egLIZ != null && (eCMixMallRetreatAbility = (ECMixMallRetreatAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), ECMixMallRetreatAbility.class, null)) != null) {
            eCMixMallRetreatAbility.Kw1(aRunnableS1S2300000_26, "pendant_layer");
        } else {
            aRunnableS1S2300000_26.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility
    public final void BN0(Context context, String str, Map map, String str2, View view) {
        String str3;
        String str4;
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZ("MixMall", "initRuntimeCard...");
        if (this.LLJJJ == null) {
            this.LLJJJ = new C1771720wCo(Lo());
        }
        final C1771720wCo c1771720wCo = this.LLJJJ;
        if (c1771720wCo != null) {
            synchronized (c1771720wCo) {
                new AwS142S0110000_26(c1771720wCo, 2);
                EcMixMallInitConfigSettings.EcMixMallInitConfigModel ecMixMallInitConfigModel = EcMixMallInitConfigSettings.LIZIZ;
                Pair pairLIZIZ = C1771720wCo.LIZIZ(str, str2, map);
                String str5 = (String) pairLIZIZ.getFirst();
                String str6 = (String) pairLIZIZ.getSecond();
                if (C123100dR.LIZ(c1771720wCo.LIZJ)) {
                    str3 = "update";
                } else {
                    str3 = "init";
                }
                Pair[] pairArr = new Pair[3];
                if (str5 == null) {
                    str4 = "";
                } else {
                    str4 = str5;
                }
                pairArr[0] = new Pair("schema", str4);
                pairArr[1] = new Pair("is_preload", CardStruct.IStatusCode.DEFAULT);
                pairArr[2] = new Pair("from", str6);
                final C1741560vQA c1741560vQALIZ = C1741530vQ7.LIZ("runtime_card", str3, 0L, C2097608Jq.LJIIJ(pairArr), 4);
                if (Intrinsics.LJFF(C1774710wHd.LIZIZ(c1771720wCo.LIZJ), C1774710wHd.LIZIZ(str5))) {
                    C599820Nfo.LIZ("EcMixMallRuntimeCardManager", "RuntimeCardMgr initRuntimeCard : same schema");
                } else {
                    if (C123100dR.LIZ(c1771720wCo.LIZJ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("recreate runtime: ");
                        sbLIZ.append(str5);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C599820Nfo.LIZLLL();
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("create runtime: ");
                        sbLIZ2.append(str5);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C599820Nfo.LIZLLL();
                    }
                    c1771720wCo.LIZ();
                    c1771720wCo.LIZJ = str5;
                    C1741560vQA.LIZJ(c1741560vQALIZ, "init_start", 0L, null, 6);
                    if (str5 != null && !a0.LJJJIL(str5)) {
                        C599820Nfo.LIZ("EcMixMallRuntimeCardManager", "RuntimeCardMgr initRuntimeCard...");
                        c1771720wCo.LIZ.LIZIZ.LJ("t_runtime_card_load_start", Long.valueOf(System.currentTimeMillis()), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                        System.currentTimeMillis();
                        C1772770wEV c1772770wEVLIZ = C0WOY.LIZ(C0WOW.SPARK_LITE);
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ecGlobalContext", new C1311220kE4(TTKECMMKGlobalContextModule.class, Collections.singletonList(c1771720wCo.LIZ.LIZIZ))));
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(InterfaceC606320NqI.class, new C1544630qIX(c1771720wCo.LIZ.LIZ)), new Pair(InterfaceC599750Nfh.class, new C1544630qIX(c1771720wCo.LIZ.LIZIZ)));
                        int i = ecMixMallInitConfigModel.runtimeCardLoadRetryTimes;
                        C1771760wCs c1771760wCs = c1771720wCo.LIZ;
                        c1772770wEVLIZ.LJI(context, new C1772800wEY(str5, null, mapLJIIIIZZ, mapLJIIJ, null, Integer.valueOf(i), false, c1771760wCs.LIZIZ, C2097908Jt.LIZJ(new Pair("shop_mix_mall_global_data", c1771760wCs.LIZJ)), null, false, null, "runtime_card", null, 48292), null, new AbstractC1772940wEm() { // from class: X.0wCp
                            public final /* synthetic */ boolean LIZIZ = false;

                            @Override // X.AbstractC1772940wEm
                            public final void LIZJ() throws JSONException {
                                new AwS61S0010000_18(this.LIZIZ, 10);
                                c1741560vQALIZ.LIZ("init_success", true, null, null, null, null);
                            }

                            @Override // X.AbstractC1772940wEm
                            public final void LIZLLL() {
                                new AwS61S0010000_18(this.LIZIZ, 11);
                                C1771720wCo c1771720wCo2 = c1771720wCo;
                                if (C7879035x.LIZLLL()) {
                                    c1771720wCo2.LIZ.LIZIZ.LJ("mix_mall_runtime_card_ready", 1, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                    return;
                                }
                                try {
                                    c1771720wCo2.LIZ.LIZIZ.LJ("mix_mall_runtime_card_ready", 1, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (CancellationException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw e;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }

                            @Override // X.AbstractC1772940wEm
                            public final void LJ(Map<String, Object> map2) {
                                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("runtime card onTimingSetup=");
                                sbLIZ3.append(map2);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                c599820Nfo.getClass();
                                C599820Nfo.LIZLLL();
                            }

                            @Override // X.AbstractC1772940wEm
                            public final void LIZ(Integer num, String str7) throws JSONException {
                                Map<String, Object> mapLJIIJ2;
                                new C1154020g8W(num, str7, this.LIZIZ);
                                c1771720wCo.LIZ();
                                C1741560vQA c1741560vQA = c1741560vQALIZ;
                                if (str7 != null) {
                                    mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("lynx_error_info", str7));
                                } else {
                                    mapLJIIJ2 = null;
                                }
                                c1741560vQA.LIZ("init_fail", false, num, "lynx error", null, mapLJIIJ2);
                            }
                        }, null, view);
                        c1771720wCo.LIZIZ = c1772770wEVLIZ;
                        C1771720wCo.LIZLLL++;
                        if (C1771720wCo.LIZLLL > 1) {
                            C1557000qcU.LIZ("runtime_card", "multiple_create", C2097608Jq.LJIIJ(new Pair("schema", str5), new Pair("is_preload", CardStruct.IStatusCode.DEFAULT), new Pair("quantity", Integer.valueOf(C1771720wCo.LIZLLL))));
                        }
                    } else {
                        c1771720wCo.LIZ();
                        c1741560vQALIZ.LIZ("init_fail", false, null, "schema null", null, null);
                        C599820Nfo.LIZ("EcMixMallRuntimeCardManager", "RuntimeCardMgr initRuntimeCard error: schema empty!");
                    }
                }
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("initRuntimeCard, runtimeCard=");
        sbLIZ3.append(this.LLJJJ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C599820Nfo.LIZLLL();
    }
}
