package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C0R1H;
import X.C1120604Zw;
import X.C1168270gVV;
import X.C1325860kbg;
import X.C1533510q0b;
import X.C1744700vVE;
import X.C1765210w2J;
import X.C1956907lX;
import X.C1AF0;
import X.C1AQS;
import X.C2097608Jq;
import X.C21320018c2;
import X.C21320418c6;
import X.C21322018cM;
import X.C21322218cO;
import X.C21323118cX;
import X.C21326518d5;
import X.C21326718d7;
import X.C21328418dO;
import X.C21329018dU;
import X.C452501pT;
import X.C786410Ut5;
import X.C7879035x;
import X.InterfaceC1168310gVZ;
import X.InterfaceC1765240w2M;
import X.InterfaceC21322918cV;
import X.InterfaceC21326118d1;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpContext;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECPdpMynaConfigModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.legacy.LegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes33.dex */
public final class SeaPdpMynaPageManager implements InterfaceC1765240w2M, InterfaceC494301wD {
    public final InterfaceC665370Q7z LL;
    public final C21326718d7 LLILLJJLI;
    public final Map<String, ? extends Object> LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC1765240w2M
    public final Map<String, Object> LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1765240w2M
    public final String LIZLLL(String str) {
        C1533510q0b c1533510q0bLIZIZ;
        String str2;
        String prefixAsGeckoCDN;
        String str3 = (String) ((Map) this.LLILZIL.getValue()).get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            String path = UriProtector.parse(str).getPath();
            if (path != null) {
                prefixAsGeckoCDN = GeckoXAdapter.Companion.getPrefixAsGeckoCDN(path);
            } else {
                prefixAsGeckoCDN = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, th.getMessage());
        }
        if (prefixAsGeckoCDN != null) {
            c1533510q0bLIZIZ = C1956907lX.LIZIZ(str, prefixAsGeckoCDN);
        } else {
            c1533510q0bLIZIZ = null;
        }
        if (c1533510q0bLIZIZ == null || (str2 = c1533510q0bLIZIZ.LIZIZ) == null) {
            return null;
        }
        ((Map) this.LLILZIL.getValue()).put(str, str2);
        return str2;
    }

    public SeaPdpMynaPageManager(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        C21326718d7 c21326718d7;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        Object objValueOf;
        boolean z;
        String name;
        String str;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3;
        AnonymousClass0317 anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin;
        LifecycleOwner lifecycleOwner;
        boolean z2;
        boolean z3;
        String name2;
        boolean z4;
        String name3;
        boolean z5;
        String name4;
        IECommerceHostService iECommerceHostService3;
        boolean z6;
        String name5;
        boolean z7;
        String name6;
        Context contextM3 = context;
        this.LL = interfaceC665370Q7z;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 435));
        this.LLILZ = c01gwLIZIZ;
        this.LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(123));
        if (contextM3 == null) {
            C1AF0.LIZJ("ec_pdp_sea_myna_manager, init context is null");
            contextM3 = C786410Ut5.M3(C7879035x.LIZ());
        }
        C21320418c6.LIZ.LIZ();
        C21322218cO c21322218cO = C21322218cO.LIZ;
        c21322218cO.getClass();
        InterfaceC21322918cV interfaceC21322918cVLJ = C21322218cO.LJ(contextM3, "sea_pdp");
        C21329018dU c21329018dULIZIZ = interfaceC21322918cVLJ.LIZIZ();
        C21328418dO c21328418dO = new C21328418dO(c21329018dULIZIZ == null ? new C21329018dU((Object) null) : c21329018dULIZIZ);
        C1168270gVV.LIZ.getClass();
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get("sea_pdp");
        if (interfaceC1168310gVZ == null) {
            C1325860kbg.LIZIZ(null, AFwS215S0000000_26.get$arr$(122), C2097608Jq.LJ());
        }
        C21322018cM c21322018cM = C21322218cO.LJI;
        Reference reference = (Reference) ((ConcurrentHashMap) c21322018cM.LJFF.getValue()).get("sea_pdp");
        if (reference != null && (c21326718d7 = (C21326718d7) reference.get()) != null) {
            Context context2 = c21326718d7.LIZ;
            c21322218cO.getClass();
            C21322218cO.LJIIJ(context2, contextM3);
        } else {
            c21326718d7 = null;
        }
        boolean z8 = true;
        if (c21326718d7 == null) {
            c21326718d7 = new C21326718d7(contextM3, "sea_pdp", c21328418dO);
            if (interfaceC1168310gVZ != null) {
                c21326718d7.LJIIIIZZ = interfaceC1168310gVZ.LJIIJ();
                c21326718d7.LJIIL = interfaceC1168310gVZ.LIZJ();
                c21326718d7.LJIILIIL = true;
            }
            c21326718d7.LJJJLL = new AwS570S0100000_26(this, 434);
            c21322218cO.getClass();
            ((ConcurrentHashMap) c21322018cM.LJFF.getValue()).put("sea_pdp", new WeakReference(c21326718d7));
        }
        this.LLILLJJLI = c21326718d7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            String name7 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name6 = iECommerceHostService.getClass().getName();
            } else {
                name6 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name7, name6, z7);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZLLL.length() > 0) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService3 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                String name8 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService3 != null) {
                    name5 = iECommerceHostService3.getClass().getName();
                } else {
                    name5 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name8, name5, z6);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            objValueOf = ((IApplicationDependencyService) iECommerceHostService3).getVersionInfo().LIZLLL;
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name9 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name9, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            objValueOf = Long.valueOf(((IApplicationDependencyService) iECommerceHostService2).getVersionInfo().LIZIZ);
        }
        linkedHashMap.put("version_code", objValueOf);
        if (C1744700vVE.LJ(contextM3, null)) {
            str = "dark";
        } else {
            str = "light";
        }
        linkedHashMap.put("theme", str);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            String name10 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name4 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name4 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime4, 1, name10, name4, z5);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            String name11 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                name3 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2.getClass().getName();
            } else {
                name3 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime5, 1, name11, name3, z4);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("op_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2).getCurrentRegionCode());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime6 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name12 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                name2 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime6, 1, name12, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("carrier_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3).getSimCountry());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime7 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = LegacyDependencyService.createILegacyDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            z8 = true;
            C1AQS.LIZJ(jElapsedRealtime7, 1, ILegacyDependencyService.class.getName(), anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin.getClass().getName() : null, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILegacyDependencyService.class);
        }
        String userResidence = ((ILegacyDependencyService) anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin).getUserResidence();
        linkedHashMap.put("residence", userResidence == null ? "" : userResidence);
        this.LLILLL = linkedHashMap;
        C21320018c2.LIZ.getClass();
        Integer num = ((ECPdpMynaConfigModel) C21320018c2.LIZJ.getValue()).enableViewPool;
        if (num != null && num.intValue() == z8) {
            c21326718d7.LJII(z8);
        }
        c21326718d7.LJJJLIIL = new C21323118cX(interfaceC21322918cVLJ);
        PdpContext pdpContext = (PdpContext) c01gwLIZIZ.getValue();
        if (pdpContext != null && (lifecycleOwner = pdpContext.LL) != null) {
            C0R1H.LIZIZ(lifecycleOwner, new SeaPdpMynaPageManager$initLifecycle$1(this));
        }
    }

    @Override // X.InterfaceC1765240w2M
    public final C21326518d5 LIZIZ(String str, Map map, String str2, InterfaceC21326118d1 interfaceC21326118d1, Map map2, C1765210w2J c1765210w2J) {
        return this.LLILLJJLI.LIZ(str, map, str2, map2, this.LLILLL, interfaceC21326118d1, c1765210w2J);
    }
}
