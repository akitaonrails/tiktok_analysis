package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture;

import X.AnonymousClass0317;
import X.C034S;
import X.C08CX;
import X.C098200Yq;
import X.C0C64;
import X.C0QSJ;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C1153610g7r;
import X.C1233304s7;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1457805nE;
import X.C1508610pMR;
import X.C15442062u;
import X.C1561200qjG;
import X.C1757080vpC;
import X.C1757090vpD;
import X.C1757110vpF;
import X.C1757130vpH;
import X.C1766860w4y;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C1AQS;
import X.C20739116Dl;
import X.C2097608Jq;
import X.C2132808Xe;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C687700QyG;
import X.C786410Ut5;
import X.C7879035x;
import X.C814420VxA;
import X.EnumC1508600pMQ;
import X.EnumC1757150vpJ;
import X.InterfaceC1146704e9;
import X.InterfaceC1457705nD;
import X.InterfaceC1757120vpG;
import X.InterfaceC1757230vpR;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar.PdpTabBarAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcomPdpPictureInPictureUiEnhanceConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPdpPictureInPicturePageList;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LivePiPConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class PiPManager extends LogicAssem implements IPdpPiPAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public InterfaceC1757120vpG LLILLJJLI;
    public InterfaceC1757230vpR LLILZ;
    public boolean LLILZIL;
    public volatile InterfaceC1761670vwb LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;
    public final PiPManager LL = this;
    public InterfaceC1457705nD LLILLL = C1457805nE.LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PiPManager.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    public final InterfaceC1761670vwb fo() {
        InterfaceC1761670vwb interfaceC1761670vwb = this.LLILZLL;
        if (interfaceC1761670vwb == null) {
            synchronized (this) {
                interfaceC1761670vwb = this.LLILZLL;
                if (interfaceC1761670vwb == null) {
                    InterfaceC1761670vwb interfaceC1761670vwbM180do = m180do();
                    this.LLILZLL = interfaceC1761670vwbM180do;
                    return interfaceC1761670vwbM180do;
                }
            }
        }
        return interfaceC1761670vwb;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1761670vwb m180do() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLIZLLLIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLIZLLLIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1761670vwb interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjLIZLLL.getAbility(InterfaceC1761670vwb.class);
        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
        return interfaceC1761670vwb;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final void du2() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (this.LLILLJJLI instanceof C1757080vpC) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            if (((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).getInternalWindowState() != 3) {
                YI1(null, null, null, null);
            }
        }
    }

    public final boolean ho() {
        IPdpStarter.PdpEnterParam pdpEnterParam;
        String str;
        List listLJJLIIIJILLIZJL;
        Object objLJJJLZIJ;
        LivePiPConfig livePiPConfig = C1153610g7r.LIZ;
        return (!livePiPConfig.enabled || (pdpEnterParam = fo().lX().LLJI) == null || (str = pdpEnterParam.btmToken) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL)) == null || !livePiPConfig.allowList.contains(objLJJJLZIJ)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final void qn() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        InterfaceC1757120vpG interfaceC1757120vpG = this.LLILLJJLI;
        if (interfaceC1757120vpG instanceof C1757090vpD) {
            interfaceC1757120vpG.k(EnumC1757150vpJ.HIDE, false);
            return;
        }
        if (interfaceC1757120vpG != null) {
            interfaceC1757120vpG.k(EnumC1757150vpJ.RETURN, false);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).resetInternalWindow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final boolean FK1() {
        C1757130vpH c1757130vpHCf;
        EnumC1757150vpJ enumC1757150vpJ;
        if (!ko()) {
            return false;
        }
        InterfaceC1757230vpR interfaceC1757230vpR = this.LLILZ;
        return interfaceC1757230vpR == null || (c1757130vpHCf = interfaceC1757230vpR.cf()) == null || (enumC1757150vpJ = c1757130vpHCf.LIZIZ) == null || enumC1757150vpJ == EnumC1757150vpJ.HIDE;
    }

    public final C1757110vpF bo() {
        int iLIZIZ;
        Object c098200Yq;
        Context contextM3 = C786410Ut5.M3(C7879035x.LIZ());
        if (EcomPdpPictureInPictureUiEnhanceConfig.LIZ() != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EcomPdpPictureInPictureUiEnhanceConfig.LIZ())));
        } else {
            ProductPackStruct productPackStruct = fo().lX().LLJILLL;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((productPackStruct != null ? productPackStruct.aiAssistant : null) != null ? 80 : 0))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        }
        int iLIZJ = C497820Jfg.LIZJ(contextM3);
        int iLIZ = C2132808Xe.LIZ(contextM3);
        try {
            c098200Yq = Integer.valueOf(contextM3.getResources().getDimensionPixelSize(R.dimen.o8));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer numValueOf = Integer.valueOf(LLJI);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = numValueOf;
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        PdpTabBarAssem.LLJJJJJIL.getClass();
        return new C1757110vpF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), iLIZJ + iIntValue + C1561200qjG.LIZ() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), iLIZ + iLIZIZ);
    }

    public final boolean ko() {
        Iterable iterable;
        PageSourceInfo pageSourceInfoLJ;
        PageSource pageSourcePrevious;
        String str;
        List listLJJLIIIJILLIZJL;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_pdp_picture_in_picture", true) == 0) {
            return false;
        }
        EcomPdpPictureInPicturePageList.PdpPictureInPictureList pdpPictureInPictureList = (EcomPdpPictureInPicturePageList.PdpPictureInPictureList) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_picture_in_picture_allow_list", EcomPdpPictureInPicturePageList.PdpPictureInPictureList.class, EcomPdpPictureInPicturePageList.LIZ);
        if (pdpPictureInPictureList == null || (iterable = pdpPictureInPictureList.pageList) == null) {
            iterable = C13BV.INSTANCE;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = fo().lX().LLJI;
        String str2 = (pdpEnterParam == null || (str = pdpEnterParam.btmToken) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) == null) ? null : (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
        if (C13LP.LJJJJ(str2, iterable) && str2 != null && str2.length() != 0 && (pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3)) != null) {
            List<PageSource> list = pageSourceInfoLJ.sourcePageList;
            ListIterator<PageSource> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    pageSourcePrevious = null;
                    break;
                }
                pageSourcePrevious = listIterator.previous();
                if (Intrinsics.LJFF(pageSourcePrevious.pageName, str2)) {
                    break;
                }
            }
            PageSource pageSource = pageSourcePrevious;
            if (pageSource != null || ((pageSource = pageSourceInfoLJ.ecHead) != null && Intrinsics.LJFF(pageSource.pageName, str2) && pageSource != null)) {
                Map<String, String> map = pageSource.extra;
                if (Intrinsics.LJFF(map != null ? map.get("ec_is_video_page") : null, "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onCreate();
        fo().lX().w = this;
        LivePiPConfig livePiPConfig = C1153610g7r.LIZ;
        if (livePiPConfig.enabled) {
            boolean z = true;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ILiveDependencyService iLiveDependencyService = (ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
            boolean zHo = ho();
            iLiveDependencyService.setLiveFunnelSession(zHo);
            if (zHo) {
                iLiveDependencyService.resetInternalWindow();
                iLiveDependencyService.setResumeAfterMediaConflict(livePiPConfig.shouldPlayAfterVideoEnds);
                return;
            }
            iLiveDependencyService.hideInternalWindow();
            if (!ko() && !iLiveDependencyService.isInternalWindowMute()) {
                z = false;
            }
            iLiveDependencyService.setCurrentPlayerMute(z);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        fo().lX().w = null;
        this.LLILLL = C1457805nE.LIZ;
        InterfaceC1757120vpG interfaceC1757120vpG = this.LLILLJJLI;
        if ((interfaceC1757120vpG instanceof C1757090vpD) && interfaceC1757120vpG != null) {
            interfaceC1757120vpG.k(EnumC1757150vpJ.RETURN, false);
        }
        this.LLILLJJLI = null;
        this.LLILZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onPause();
        this.LLILZIL = false;
        if (C1153610g7r.LIZ.enabled && ho()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).clearSafeZone();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onResume();
        this.LLILZIL = true;
        if (C1153610g7r.LIZ.enabled && ho()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ILiveDependencyService iLiveDependencyService = (ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
            iLiveDependencyService.setLiveFunnelSession(true);
            if (this.LLILLL instanceof C1457805nE) {
                iLiveDependencyService.setCurrentPlayerMute(iLiveDependencyService.isInternalWindowMute());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final InterfaceC1757120vpG D0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, IPdpPiPAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, IPdpPiPAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final void OM2(EnumC1508600pMQ enumC1508600pMQ, boolean z) {
        Set set;
        Set setLJI;
        InterfaceC1457705nD c1233304s7;
        C1233304s7 c1233304s72;
        if (!this.LLILZIL) {
            return;
        }
        InterfaceC1757120vpG interfaceC1757120vpG = this.LLILLJJLI;
        boolean z2 = true;
        if (interfaceC1757120vpG instanceof C1757090vpD) {
            int i = C1508610pMR.LIZ[enumC1508600pMQ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C1757090vpD c1757090vpD = (C1757090vpD) interfaceC1757120vpG;
                        if (z) {
                            c1757090vpD.LIZ(enumC1508600pMQ.getHasOwnAudio());
                            return;
                        } else {
                            c1757090vpD.LIZIZ();
                            return;
                        }
                    }
                    throw new C1954807lC();
                }
                if (!z) {
                    return;
                }
                ((C1757090vpD) interfaceC1757120vpG).k(EnumC1757150vpJ.NEXT, true);
                return;
            }
            if (!z) {
                return;
            }
            ((C1757090vpD) interfaceC1757120vpG).LIZ(enumC1508600pMQ.getHasOwnAudio());
            return;
        }
        InterfaceC1457705nD interfaceC1457705nD = this.LLILLL;
        boolean z3 = interfaceC1457705nD instanceof C1233304s7;
        C1233304s7 c1233304s73 = null;
        if (!(interfaceC1457705nD instanceof C1233304s7) || (c1233304s72 = (C1233304s7) interfaceC1457705nD) == null || (set = c1233304s72.LIZ) == null) {
            set = C08CX.INSTANCE;
        }
        if (z) {
            setLJI = C15442062u.LJIIIIZZ(enumC1508600pMQ, set);
        } else {
            setLJI = C15442062u.LJI(enumC1508600pMQ, set);
        }
        if (setLJI.isEmpty()) {
            c1233304s7 = C1457805nE.LIZ;
        } else {
            c1233304s7 = new C1233304s7(setLJI);
        }
        this.LLILLL = c1233304s7;
        if (c1233304s7 instanceof C1233304s7) {
            c1233304s73 = (C1233304s7) c1233304s7;
        }
        if (!z3) {
            if (c1233304s73 != null && interfaceC1757120vpG != null) {
                Set<EnumC1508600pMQ> set2 = c1233304s73.LIZ;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator<T> it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (((EnumC1508600pMQ) it2.next()).getHasOwnAudio()) {
                            break;
                        }
                    }
                    z2 = false;
                }
                interfaceC1757120vpG.LIZ(z2);
                return;
            }
            return;
        }
        if (c1233304s73 != null) {
            if (interfaceC1757120vpG == null) {
                return;
            }
            Set<EnumC1508600pMQ> set3 = c1233304s73.LIZ;
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it3 = set3.iterator();
                while (it3.hasNext()) {
                    if (((EnumC1508600pMQ) it3.next()).getHasOwnAudio()) {
                        break;
                    }
                }
                z2 = false;
            }
            interfaceC1757120vpG.LIZJ(z2);
            return;
        }
        if (interfaceC1757120vpG == null) {
            return;
        }
        interfaceC1757120vpG.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final void k(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        InterfaceC1757120vpG interfaceC1757120vpG;
        if ((enumC1757150vpJ != EnumC1757150vpJ.MANUAL || (this.LLILLJJLI instanceof C1757090vpD)) && (interfaceC1757120vpG = this.LLILLJJLI) != null) {
            interfaceC1757120vpG.k(enumC1757150vpJ, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility
    public final void YI1(DialogFragment dialogFragment, Fragment fragment, FrameLayout frameLayout, Function0<Unit> function0) {
        Map mapLJ;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        Map<String, Object> mapLJ2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z2;
        String name;
        InterfaceC1757120vpG c1757090vpD = this.LLILLJJLI;
        if (c1757090vpD == null) {
            boolean z3 = true;
            String string6 = null;
            if (ho()) {
                if (dialogFragment != null) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String name2 = ILiveDependencyService.class.getName();
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                    }
                    ILiveDependencyService iLiveDependencyService = (ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
                    C19EG activity = dialogFragment.getActivity();
                    if (activity != null && iLiveDependencyService.canShowInternalWindow(null)) {
                        IPdpStarter.PdpEnterParam pdpEnterParam = fo().lX().LLJI;
                        if (pdpEnterParam == null || (mapLJ2 = pdpEnterParam.trackParams) == null) {
                            mapLJ2 = C2097608Jq.LJ();
                        }
                        Pair[] pairArr = new Pair[11];
                        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
                        Object obj = mapLJ2.get("room_id");
                        if (obj != null) {
                            string6 = obj.toString();
                        }
                        String str = "";
                        if (string6 == null) {
                            string6 = "";
                        }
                        pairArr[1] = new Pair("room_id", string6);
                        pairArr[2] = new Pair("enter_from_merge", "good_detail");
                        Object obj2 = mapLJ2.get("enter_method");
                        if (obj2 == null || (string = obj2.toString()) == null) {
                            string = "";
                        }
                        pairArr[3] = new Pair("enter_method", string);
                        pairArr[4] = new Pair("source_previous_page", "good_detail_mini_window");
                        Object obj3 = mapLJ2.get("traffic_source_list");
                        if (obj3 == null || (string2 = obj3.toString()) == null) {
                            string2 = "";
                        }
                        pairArr[5] = new Pair("traffic_source_list", string2);
                        pairArr[6] = new Pair("is_from_live", "1");
                        pairArr[7] = new Pair("page_name", "pdp");
                        Object obj4 = mapLJ2.get("request_id");
                        if (obj4 == null || (string3 = obj4.toString()) == null) {
                            string3 = "";
                        }
                        pairArr[8] = new Pair("request_id", string3);
                        Object obj5 = mapLJ2.get("author_id");
                        if (obj5 == null || (string4 = obj5.toString()) == null) {
                            string4 = "";
                        }
                        pairArr[9] = new Pair("anchor_id", string4);
                        Object obj6 = mapLJ2.get("lineup_author_id");
                        if (obj6 != null && (string5 = obj6.toString()) != null) {
                            str = string5;
                        }
                        pairArr[10] = new Pair("lineup_author_id", str);
                        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                            if (((String) entry.getValue()).length() > 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        c1757090vpD = new C1757080vpC(activity, dialogFragment, linkedHashMap, bo(), C1153610g7r.LIZ.shouldPlayAfterVideoEnds);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (ko() && fragment != null && frameLayout != null && function0 != null && FK1()) {
                InterfaceC1757230vpR interfaceC1757230vpRLJIIJJI = this.LLILZ;
                if (interfaceC1757230vpRLJIIJJI == null) {
                    IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceVideoService.class));
                    if (iECommerceVideoService != null) {
                        PdpViewModel pdpViewModelLX = fo().lX();
                        String strUR2 = pdpViewModelLX.UR2("enter_from");
                        String strUR22 = pdpViewModelLX.UR2("previous_page");
                        String strUR23 = pdpViewModelLX.UR2("author_id");
                        C1054004Ag c1054004Ag = pdpViewModelLX.LLJLILLLLZIIL;
                        if (c1054004Ag == null || (mapLJ = c1054004Ag.LIZIZ) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        C20739116Dl c20739116Dl = new C20739116Dl(strUR2, "product_detail", strUR22, strUR23, mapLJ, false);
                        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_pdp_picture_in_picture", true) == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        interfaceC1757230vpRLJIIJJI = iECommerceVideoService.LJIIJJI(fragment, frameLayout, c20739116Dl, z, null);
                        if (interfaceC1757230vpRLJIIJJI != null) {
                            this.LLILZ = interfaceC1757230vpRLJIIJJI;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                ProductPackStruct productPackStruct = fo().lX().LLJILLL;
                if (productPackStruct == null || productPackStruct.aiAssistant == null) {
                    z3 = false;
                }
                c1757090vpD = new C1757090vpD(interfaceC1757230vpRLJIIJJI, frameLayout, z3, function0);
            } else {
                return;
            }
        }
        this.LLILLJJLI = c1757090vpD;
        if (c1757090vpD instanceof C1757080vpC) {
            C1757110vpF c1757110vpFBo = bo();
            ((C1757080vpC) c1757090vpD).LJ.updateSafeZone(c1757110vpFBo.LIZ, c1757110vpFBo.LIZIZ, c1757110vpFBo.LIZJ, c1757110vpFBo.LIZLLL);
            if (this.LLILLL instanceof C1233304s7) {
                return;
            }
        }
        if ((c1757090vpD instanceof C1757090vpD) && !FK1()) {
            return;
        }
        c1757090vpD.show();
    }
}
