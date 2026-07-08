package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.AbstractC1768210w79;
import X.AbstractC1771170wBv;
import X.AbstractC1772270wDh;
import X.C019F;
import X.C01GW;
import X.C034S;
import X.C0PEM;
import X.C1120604Zw;
import X.C127G;
import X.C13LE;
import X.C1435405jc;
import X.C14EU;
import X.C1507830pLB;
import X.C1508220pLo;
import X.C1533030pzp;
import X.C1533060pzs;
import X.C1534490q2B;
import X.C1535030q33;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1608210rx5;
import X.C1619080sEc;
import X.C1637806bA;
import X.C1741890vQh;
import X.C1767950w6j;
import X.C1768190w77;
import X.C1768440w7W;
import X.C1770900wBU;
import X.C1770930wBX;
import X.C1771080wBm;
import X.C1771140wBs;
import X.C1771480wCQ;
import X.C1771590wCb;
import X.C1772140wDU;
import X.C1772240wDe;
import X.C1772630wEH;
import X.C1772650wEJ;
import X.C1772750wET;
import X.C1773140wF6;
import X.C1774640wHW;
import X.C1903780zdo;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C2097608Jq;
import X.C21394318o1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2232408os;
import X.C2341109Fh;
import X.C452501pT;
import X.C599820Nfo;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C948503nH;
import X.EnumC1768470w7Z;
import X.EnumC1771830wCz;
import X.EnumC599720Nfe;
import X.InterfaceC1535230q3N;
import X.InterfaceC2217461Bqa;
import X.InterfaceC599750Nfh;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS42S0300000_9;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.ECMixMallLifecycleAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardModelV2;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV1Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadSceneConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.retreat.ECMixMallRetreatAbility;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS63S0010000_26;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopMallMixAssem extends UIContentAssem implements GetShopMixVMAbility, GetMixControllerAbility, GetAnchorViewAbility, ECMixMallLifecycleAbility, ECMixMallRetreatAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public FrameLayout LLIZLLLIL;
    public C1772240wDe LLJ;
    public final C1608210rx5 LLJI = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final AssemVMLazy LLJIJIL;
    public View LLJILJIL;
    public ECMMKContainerController LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public volatile boolean LLJJI;
    public final C1508220pLo LLJJIII;
    public volatile boolean LLJJIJI;
    public final C1768190w77 LLJJIJIIJIL;
    public final C1535030q33 LLJJIJIL;
    public final C1533060pzs LLJJJ;
    public C127G LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShopMallMixAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0w77] */
    public ShopMallMixAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 116), AFwS268S0000000_26.get$arr$(277), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 632));
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 115));
        this.LLJJIII = new C1508220pLo();
        this.LLJJIJIIJIL = new AbstractC1768210w79() { // from class: X.0w77
            @Override // X.AbstractC1768210w79
            public final void LIZIZ() {
            }

            @Override // X.AbstractC1768210w79
            public final void LIZ() {
                Long l;
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("MixMall LynxLifeCycle onFirstScreen");
                ((BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class)).notifyMallFullColdBootEnd();
                this.LIZ.Lo().LLILLJJLI.LJ = true;
                C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = ((C1768200w78) this.LIZ.Lo().LLILZLL.getValue()).LIZ.LIZLLL;
                if (jCurrentTimeMillis2 <= 0) {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                long j = jCurrentTimeMillis - jCurrentTimeMillis2;
                MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
                boolean zLIZLLL = MMKStorageUtil.LIZLLL();
                c1767950w6j.getClass();
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(j));
                map.put("is_data_cache", zLIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
                map.put("enter_from", C1767950w6j.LJFF());
                map.putAll(C1767950w6j.LJII());
                C1767950w6j.LJIJ("rd_tiktokec_mall_page_lynx_dur", map);
                String stage = EnumC1768030w6r.STAGE_LYNX_FIRST_SCREEN.getStage();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                C1767960w6k.LIZ.getClass();
                long j2 = jCurrentTimeMillis3 - C1767960w6k.LIZLLL;
                c1767950w6j.getClass();
                C1767950w6j.LJIIL(j2, stage, null, true, false);
                this.LIZ.Lo().LLILLJJLI.LJII.add(EnumC0322009g.LYNX_ON_FIRST_SCREEN);
                ShopMallMixAssem shopMallMixAssem = this.LIZ;
                View view = shopMallMixAssem.LLJILJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                shopMallMixAssem.Lo().LLILLL.LJLJLJ = System.currentTimeMillis();
                C823050WQl.LIZJ().execute(new ARunnableS42S0300000_9(EnumC586710Mzl.SKELETON_VIEW, C0NCP.VIEW_GONE, null, 26));
                this.LIZ.Lo().setState(AFwS264S0000000_24.get$arr$(570));
                C1843807Ka.LIZ.getClass();
                Integer num = C1843807Ka.LIZ().open;
                if (num == null || num.intValue() != 0) {
                    Integer num2 = C1843807Ka.LIZ().open;
                    if ((num2 == null || num2.intValue() != 0) && (l = C1843807Ka.LIZ().duration) != null) {
                        l.longValue();
                    }
                    this.LIZ.getClass();
                }
                ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJII(this.LIZ.getContext());
                C0BAV.LIZ.getClass();
                C0BAU.LIZ.getClass();
                if (!C0BAU.LIZ() || ((Number) C0BAV.LIZIZ.getValue()).intValue() < 0) {
                    return;
                }
                C948503nH.LJ(this.LIZ, C23271099x.INSTANCE, new C0CRJ(null));
            }
        };
        this.LLJJIJIL = new C1535030q33(AFwS263S0000000_23.get$arr$(25), AFwS268S0000000_26.get$arr$(273), AFwS268S0000000_26.get$arr$(274));
        this.LLJJJ = new C1533060pzs(AFwS263S0000000_23.get$arr$(26), AFwS268S0000000_26.get$arr$(275), AFwS268S0000000_26.get$arr$(276));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetMixControllerAbility
    public final void CF0() {
        if (this.LLJJI) {
            return;
        }
        Oo(Lo().LLILZ, Lo().globalContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShopMallMixFragment Go() {
        return (ShopMallMixFragment) this.LLJI.getValue();
    }

    public final FrameLayout Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nua) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1772240wDe Jo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nue) : null;
            this.LLJ = (C1772240wDe) viewFindViewById;
        }
        return (C1772240wDe) viewFindViewById;
    }

    public final ShopMallMixViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vo() {
        /*
            r17 = this;
            r4 = r17
            X.19EG r3 = X.C724240Sb0.LIZ(r4)
            if (r3 == 0) goto L62
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController r0 = r4.LLJILJILJ
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r0 = r0.LLJJJJ
            if (r0 == 0) goto L65
            X.0wEH r0 = r0.c82()
            if (r0 == 0) goto L65
            X.0wG1 r2 = r0.LIZIZ()
            if (r2 == 0) goto L2a
            java.util.List<X.0wEN> r1 = r2.LJJIII
            int r0 = r2.LJJIFFI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.0wEN r0 = (X.C1772690wEN) r0
            java.lang.String r5 = r0.LIZLLL
            if (r5 != 0) goto L2c
        L2a:
            java.lang.String r5 = "0"
        L2c:
            if (r2 == 0) goto L63
            int r0 = r2.LJJIFFI
        L30:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "feed_tab_index"
            r1.<init>(r0, r2)
            java.util.Map r12 = X.C2097908Jt.LIZJ(r1)
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController r0 = r4.LLJILJILJ
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r1 = r0.LLJJJJ
            if (r1 == 0) goto L62
            X.0wDW r0 = new X.0wDW
            X.0wCb r4 = new X.0wCb
            r6 = 0
            r7 = 0
            java.lang.String r8 = "fetch"
            java.lang.String r9 = "unknown"
            r16 = 64282(0xfb1a, float:9.0078E-41)
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.<init>(r3, r4)
            r1.tW(r0)
        L62:
            return
        L63:
            r0 = 0
            goto L30
        L65:
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem.Vo():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.ECMixMallLifecycleAbility
    public final void ZI1() {
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZLLL();
        C1770900wBU.LIZ.getClass();
        if (C1770900wBU.LJII()) {
            C1770900wBU.LIZJ(new AwS63S0010000_26(false, 2));
        } else {
            C1770900wBU.LIZJ(new AwS63S0010000_26(false, 1));
        }
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1230);
        C21394318o1.LIZ(awS570S0100000_26);
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) awS570S0100000_26, 66));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetMixControllerAbility
    public final C1772240wDe Mg1() {
        return Jo();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS400S0100000_26(this, 4)}, defaultViewModelProviderFactory);
                    this.LLJJJIL = c127g2;
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
        C1533030pzp.LIZ.LIZIZ(this.LLJJJ);
        C1534490q2B.LIZ.remove(this.LLJJIJIL);
        C1535030q33 c1535030q33 = this.LLJJIJIL;
        if ((c1535030q33 instanceof InterfaceC1535230q3N) && c1535030q33 != null) {
            C1534490q2B.LIZIZ.remove(c1535030q33);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), GetShopMixVMAbility.class, null);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ2, null), GetMixControllerAbility.class, null);
        }
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ3, null), GetAnchorViewAbility.class, null);
        }
        C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
        if (c19egLIZ4 != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ4, null), ECMixMallRetreatAbility.class, null);
        }
        C1508220pLo c1508220pLo = this.LLJJIII;
        c1508220pLo.LJ = false;
        C2232408os c2232408os = C1507830pLB.LIZ;
        C1507830pLB.LJII(c1508220pLo, "mall");
        new AwS556S0100000_12(c1508220pLo, 712);
        C1508220pLo.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetShopMixVMAbility
    public final ShopMallMixViewModel tV() {
        return Lo();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetShopMixVMAbility
    public final boolean Y72() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetMixControllerAbility
    public final void ak1() {
        Vo();
    }

    public final AbstractC1771170wBv No(C1771590wCb c1771590wCb) {
        IECommerceHostService iECommerceHostService;
        AbstractC1771170wBv abstractC1771170wBvLIZ;
        C1773140wF6 c1773140wF6;
        boolean z;
        String name;
        Lo().LLILLL.LJJIII = System.currentTimeMillis();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MixMall", "renderCacheData inter...");
        }
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        C1772630wEH c1772630wEH = MMKStorageUtil.LIZJ;
        if (c1772630wEH != null) {
            abstractC1771170wBvLIZ = new C1771140wBs(c1772630wEH, null, null);
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MixMall", "loadCacheData reuse cachePageVO");
        } else {
            String strLIZIZ = mMKStorageUtil.LIZIZ("mix_mall_homepage_cache", "");
            ECMMKContainerController eCMMKContainerController = this.LLJILJILJ;
            if (eCMMKContainerController != null && (c1773140wF6 = eCMMKContainerController.LLJI) != null) {
                abstractC1771170wBvLIZ = c1773140wF6.LIZ(strLIZIZ, null, c1771590wCb, EnumC1771830wCz.REFRESH);
            } else {
                abstractC1771170wBvLIZ = null;
            }
            if (abstractC1771170wBvLIZ instanceof C1771140wBs) {
                MMKStorageUtil.LIZJ = ((C1771140wBs) abstractC1771170wBvLIZ).LIZ;
                C948503nH.LJ(this, C0PEM.LIZJ, new C1771080wBm(abstractC1771170wBvLIZ, null));
            }
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MixMall", "loadCacheData create cachePageVO");
        }
        Lo().LLILLL.LJJIIJ = System.currentTimeMillis();
        return abstractC1771170wBvLIZ;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void loadShopTabSparkView(C1435405jc c1435405jc) {
        if (!c1435405jc.LIZIZ || this.LLJJI) {
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTabV3 HalfScreen loadSparkView");
        Oo(Lo().LLILZ, Lo().globalContext);
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        String str = c1435405jc.LIZ;
        c1767950w6j.getClass();
        C1767950w6j.LJIJ("rd_tiktokec_resume_load_shop_tab", C2097608Jq.LJIIJ(new Pair("reason", str)));
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdateRefactor(C1619080sEc c1619080sEc) throws JSONException {
        Lo();
        int iLJIIIZ = C1903780zdo.LJIIIZ(210);
        int iLJIIIZ2 = C1903780zdo.LJIIIZ(214);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("210", iLJIIIZ);
        jSONObject.put("214", iLJIIIZ2);
        String strJ3 = C786410Ut5.J3(jSONObject);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixhome ShopTabV3 messageNotify ");
        sbLIZ.append(strJ3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        Lo().globalContext.LJ("red_dot_message", C1741890vQh.LJIIJ(strJ3), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.retreat.ECMixMallRetreatAbility
    public final void Kw1(Runnable runnable, String str) {
        this.LLJJIII.LIZIZ(runnable, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c0  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(X.C21176017tu r34, X.InterfaceC599750Nfh r35) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem.Oo(X.17tu, X.0Nfh):void");
    }

    public final void Zo(AbstractC1771170wBv abstractC1771170wBv, C1771590wCb c1771590wCb) {
        IECommerceHostService iECommerceHostService;
        ECMMKViewModel eCMMKViewModel;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderCacheData: ");
            sbLIZ.append(abstractC1771170wBv);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MixMall", strLIZIZ);
        }
        if (abstractC1771170wBv instanceof C1771140wBs) {
            ECMMKContainerController eCMMKContainerController = this.LLJILJILJ;
            if (eCMMKContainerController != null && (eCMMKViewModel = eCMMKContainerController.LLJJJJ) != null) {
                C1771140wBs c1771140wBs = (C1771140wBs) abstractC1771170wBv;
                eCMMKViewModel.Qb2(new C1772140wDU(c1771140wBs.LIZ, c1771140wBs.LIZIZ, c1771590wCb, false));
            }
            ShopMallMixViewModel shopMallMixViewModelLo = Lo();
            C1770900wBU c1770900wBU = C1770900wBU.LIZ;
            C1772630wEH c1772630wEH = ((C1771140wBs) abstractC1771170wBv).LIZ;
            c1770900wBU.getClass();
            shopMallMixViewModelLo.LLIZ = C1770900wBU.LJIIJJI(c1772630wEH);
            return;
        }
        if (abstractC1771170wBv instanceof C1771480wCQ) {
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadPageCache, error = ");
            sbLIZ2.append(((C1771480wCQ) abstractC1771170wBv).LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZIZ();
            return;
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZIZ();
    }

    public static void So(AbstractC1771170wBv abstractC1771170wBv, InterfaceC599750Nfh interfaceC599750Nfh, C1772750wET c1772750wET) {
        boolean z;
        Integer num;
        Integer num2;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model;
        List<ECMixMallCardModelV2> list;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model2;
        List<ECMixMallCardModelV2> list2;
        Integer num3;
        if (!(abstractC1771170wBv instanceof C1771140wBs)) {
            C1770900wBU.LIZ.getClass();
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadForNoMallCache, enable=");
            C1770930wBX.LIZ.getClass();
            EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ = C1770930wBX.LIZ();
            if (ecMixMallPreloadConfigV1ModelLIZ != null && (num3 = ecMixMallPreloadConfigV1ModelLIZ.enableFullPreLoadIfNoCache) != null && num3.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            if (C1770900wBU.LJII()) {
                C1768440w7W.LIZ.getClass();
                EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ = C1768440w7W.LIZ();
                if (ecMixMallPreloadConfigV2ModelLIZ != null && (num2 = ecMixMallPreloadConfigV2ModelLIZ.enableFullPreloadIfNoCache) != null && num2.intValue() == 1) {
                    ArrayList arrayList = new ArrayList();
                    EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ2 = C1768440w7W.LIZ();
                    if (ecMixMallPreloadConfigV2ModelLIZ2 != null && (ecMixMallPreloadSceneConfigV2Model2 = ecMixMallPreloadConfigV2ModelLIZ2.preloadScene) != null && (list2 = ecMixMallPreloadSceneConfigV2Model2.beforeMallConfig) != null) {
                        arrayList.addAll(list2);
                    }
                    EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ3 = C1768440w7W.LIZ();
                    if (ecMixMallPreloadConfigV2ModelLIZ3 != null && (ecMixMallPreloadSceneConfigV2Model = ecMixMallPreloadConfigV2ModelLIZ3.preloadScene) != null && (list = ecMixMallPreloadSceneConfigV2Model.afterCacheRender) != null) {
                        arrayList.addAll(list);
                    }
                    C1770900wBU.LIZLLL(EnumC1768470w7Z.NO_CACHE, arrayList, interfaceC599750Nfh, c1772750wET);
                    return;
                }
            }
            EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ2 = C1770930wBX.LIZ();
            if (ecMixMallPreloadConfigV1ModelLIZ2 == null || (num = ecMixMallPreloadConfigV1ModelLIZ2.enableFullPreLoadIfNoCache) == null || num.intValue() != 1) {
                return;
            }
            C1770900wBU.LJIILIIL(interfaceC599750Nfh);
            C1770900wBU.LJIIL();
            ArrayList arrayList2 = new ArrayList();
            List listLJ = C1770900wBU.LJ();
            if (listLJ != null) {
                arrayList2.addAll(listLJ);
            }
            List listLJFF = C1770900wBU.LJFF();
            if (listLJFF != null) {
                arrayList2.addAll(listLJFF);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preloadForNoMallCache, preloadList=");
            sbLIZ2.append(arrayList2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C599820Nfo.LIZLLL();
            EnumC1768470w7Z enumC1768470w7Z = EnumC1768470w7Z.NO_CACHE;
            C1770900wBU.LJIILLIIL(arrayList2, enumC1768470w7Z, c1772750wET);
            C1770900wBU.LJIILL(arrayList2, enumC1768470w7Z, c1772750wET, interfaceC599750Nfh);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetAnchorViewAbility
    public final C1774640wHW lz1(String str, String str2, String str3) {
        C1772650wEJ c1772650wEJ;
        AbstractC1772270wDh abstractC1772270wDh;
        ECMMKContainerController eCMMKContainerController = this.LLJILJILJ;
        if (eCMMKContainerController != null && (c1772650wEJ = eCMMKContainerController.LL) != null && (abstractC1772270wDh = c1772650wEJ.LJ) != null) {
            return abstractC1772270wDh.LIZ(str, str2, str3);
        }
        return null;
    }
}
