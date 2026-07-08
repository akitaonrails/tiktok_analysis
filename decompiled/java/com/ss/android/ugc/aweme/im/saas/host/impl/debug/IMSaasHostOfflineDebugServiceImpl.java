package com.ss.android.ugc.aweme.im.saas.host.impl.debug;

import X.C0ZLD;
import X.C0ZLE;
import X.C2276551E8v;
import X.C869590Y9l;
import X.EnumC900880ZVu;
import X.EnumC993830by9;
import X.InterfaceC2276571E8x;
import X.InterfaceC868420Y4y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.WebSocketConnectionStateDebugHelper;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class IMSaasHostOfflineDebugServiceImpl implements IMSaasHostOfflineDebugService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJIJJLI() {
    }

    public static IDmToolsDebugService LJJIII() {
        return (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LIZ() {
        WebSocketConnectionStateDebugHelper webSocketConnectionStateDebugHelper = (WebSocketConnectionStateDebugHelper) PluggableExtentionKt.pluggableSpi$default(WebSocketConnectionStateDebugHelper.class, false, false, false, 14, null);
        if (webSocketConnectionStateDebugHelper != null) {
            webSocketConnectionStateDebugHelper.LIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LIZIZ() {
        C0ZLD.LIZ.getClass();
        C0ZLD c0zldLIZ = C0ZLE.LIZ();
        return c0zldLIZ != null && c0zldLIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LIZJ() {
        return LJJII(AFwS283S0000000_35.get$arr$(58));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJ() {
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJFF() {
        return LJJII(AFwS283S0000000_35.get$arr$(56));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJI() {
        return LJJII(AFwS283S0000000_35.get$arr$(48));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJII() {
        return LJJII(AFwS283S0000000_35.get$arr$(52));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIIIIZZ() {
        return LJJII(AFwS283S0000000_35.get$arr$(55));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIIIZ() {
        return LJJII(AFwS283S0000000_35.get$arr$(49));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIIJ() {
        return LJJII(AFwS283S0000000_35.get$arr$(47));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIIJJI() {
        return LJJII(AFwS283S0000000_35.get$arr$(51));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIIL() {
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJIIL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIILIIL() {
        return LJJII(AFwS283S0000000_35.get$arr$(53));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIILJJIL() {
        return LJJII(AFwS283S0000000_35.get$arr$(50));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIILL() {
        InterfaceC2276571E8x.LIZ.getClass();
        InterfaceC2276571E8x value = C2276551E8v.LIZIZ.getValue();
        return (value != null ? value.LIZ() : null) == EnumC993830by9.UPLOAD;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIJ() {
        return LJJII(AFwS283S0000000_35.get$arr$(54));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJIJJ() {
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) PluggableExtentionKt.pluggableSpi$default(INetworkDebugService.class, false, false, false, 14, null);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJJ() {
        return LJJII(AFwS283S0000000_35.get$arr$(57));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void enableBoe() {
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) PluggableExtentionKt.pluggableSpi$default(INetworkDebugService.class, false, false, false, 14, null);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void isPPEEnable() {
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) PluggableExtentionKt.pluggableSpi$default(INetworkDebugService.class, false, false, false, 14, null);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final Pair<Boolean, Integer> LIZLLL() {
        Pair<Boolean, Integer> pairLIZLLL;
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        return (iDmToolsDebugServiceLJJIII == null || (pairLIZLLL = iDmToolsDebugServiceLJJIII.LIZLLL()) == null) ? new Pair<>(Boolean.FALSE, 0) : pairLIZLLL;
    }

    public static boolean LJJII(Function1 function1) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null && ((Boolean) function1.invoke(iDmToolsDebugServiceLJJIII)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJIILLIIL(FragmentManager fragmentManager) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null) {
            iDmToolsDebugServiceLJJIII.LJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final boolean LJIJI(EnumC900880ZVu enumC900880ZVu) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null) {
            iDmToolsDebugServiceLJJIII.LJJIFFI();
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJJI(Fragment fragment) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null) {
            iDmToolsDebugServiceLJJIII.LJJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final List<C869590Y9l> LJIIZILJ(String str, Collection<? extends InterfaceC868420Y4y> collection) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null) {
            iDmToolsDebugServiceLJJIII.LJJIIJ();
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJIL(String str, FragmentManager fragmentManager, C869590Y9l c869590Y9l) {
        IDmToolsDebugService iDmToolsDebugServiceLJJIII = LJJIII();
        if (iDmToolsDebugServiceLJJIII != null) {
            iDmToolsDebugServiceLJJIII.LJIJJLI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0zCu] */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService
    public final void LJJIFFI(FragmentManager fragmentManager, Object obj, String str, String str2) {
        ?? r1 = new Object() { // from class: X.0zCu
        };
        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
        if (localTestApi != 0) {
            localTestApi.openChatNoticeDebugBottomSheet(fragmentManager, obj, r1);
        }
    }
}
