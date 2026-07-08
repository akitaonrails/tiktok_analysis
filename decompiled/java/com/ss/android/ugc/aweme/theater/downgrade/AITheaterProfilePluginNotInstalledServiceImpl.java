package com.ss.android.ugc.aweme.theater.downgrade;

import X.C0LOV;
import X.C1266270j3Z;
import X.C1518305wz;
import X.C19A3;
import X.C19EG;
import X.C531080KsE;
import X.C563290M7j;
import X.InterfaceC1257670iph;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC528960Koo;
import X.InterfaceC546120LbO;
import X.InterfaceC549230LgP;
import X.InterfaceC550750Lir;
import X.InterfaceC563350M7p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoMetricsInfo;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterProfilePluginNotInstalledServiceImpl implements AITheaterProfileService {
    public static final AITheaterProfilePluginNotInstalledServiceImpl LIZIZ = new AITheaterProfilePluginNotInstalledServiceImpl();

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void P8(CameoDraftInfo cameoDraftInfo) {
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final Class<? extends C19A3> R8() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC1257670iph T8() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final boolean V8() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void W8() {
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void X8() {
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final Class<? extends C19A3> Z8() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final boolean b9(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void e9(String str) {
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final C19A3 h9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final C19A3 l9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void Q8() {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZLLL("cameo_profile_refresh_cloud_draft", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC546120LbO LIZIZ() {
        return new InterfaceC546120LbO() { // from class: X.0LbP
            @Override // X.InterfaceC546120LbO
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final boolean isFeatureEnabled() {
                return false;
            }

            @Override // X.InterfaceC546120LbO
            public final C0LO5 LIZJ() {
                InterfaceC546120LbO.LIZ.getClass();
                return C549470Lgn.LIZIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC346201Wa<Unit> d9() {
        return C1518305wz.LL;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC550750Lir g9() {
        return new InterfaceC550750Lir() { // from class: X.0DUO
            @Override // X.InterfaceC550750Lir
            public final Integer LIZ() {
                return null;
            }

            @Override // X.InterfaceC550750Lir
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.InterfaceC550750Lir
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC550750Lir
            public final int LJFF() {
                return 0;
            }

            @Override // X.InterfaceC550750Lir
            public final String LJI() {
                return "";
            }

            @Override // X.InterfaceC550750Lir
            public final String LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC550750Lir
            public final void LJIIIZ(String str) {
            }

            @Override // X.InterfaceC550750Lir
            public final boolean LJIIL() {
                return false;
            }

            @Override // X.InterfaceC550750Lir
            public final void LJIILL() {
            }

            @Override // X.InterfaceC550750Lir
            public final InterfaceC346201Wa<InterfaceC549230LgP> LJIIJJI() {
                return new C516501zn(C558690Lvf.LIZ, 1);
            }

            @Override // X.InterfaceC550750Lir
            public final AITheaterCameoMetricsInfo LJIILJJIL() {
                return new AITheaterCameoMetricsInfo(null, null, null, null);
            }

            @Override // X.InterfaceC550750Lir
            public final InterfaceC549230LgP LIZLLL() {
                return C558690Lvf.LIZ;
            }

            @Override // X.InterfaceC550750Lir
            public final Object LJII(String str, InterfaceC1364105Vn<? super C189200o6<Unit>> interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                return unit;
            }

            @Override // X.InterfaceC550750Lir
            public final Object LJ(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                return unit;
            }

            @Override // X.InterfaceC550750Lir
            public final Object LJIIJ(String str, String str2, InterfaceC1364105Vn<? super C189200o6<Integer>> interfaceC1364105Vn) {
                Integer numLJ = C2286608xc.LJ(0);
                C189200o6.m2constructorimpl(numLJ);
                return numLJ;
            }

            @Override // X.InterfaceC550750Lir
            public final Object LJIILIIL(String str, boolean z, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<Boolean>> interfaceC1364105Vn) {
                C189200o6.m2constructorimpl(false);
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC346201Wa<CameoDraftInfo> i9() {
        return C1518305wz.LL;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC528960Koo j9() {
        return new InterfaceC528960Koo() { // from class: X.0M7k
            @Override // X.InterfaceC528960Koo
            public final void LIZ(long j, Integer num, Integer num2, String str, String str2, boolean z) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LIZIZ(long j, boolean z, Boolean bool, Integer num, Integer num2, String str, String str2) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LIZJ(String str, AIGCEntranceInfo aIGCEntranceInfo) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LIZLLL(String str, AIGCEntranceInfo aIGCEntranceInfo) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LJ(String str, AIGCEntranceInfo aIGCEntranceInfo) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LJFF(int i, String str, String str2, String str3, String str4, String str5) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LJI(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LJII(String str, AIGCEntranceInfo aIGCEntranceInfo) {
            }

            @Override // X.InterfaceC528960Koo
            public final void LJIIIIZZ(AIGCEntranceInfo aIGCEntranceInfo) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final InterfaceC563350M7p k9() {
        return C563290M7j.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final boolean S8(Activity activity, Bundle bundle) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(activity, "cameo_profile_route", true);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void a9(Context context, Function0<Unit> function0) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(context, "cameo_profile_retake", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final Object f9(Activity activity, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void Y8(Activity activity, C531080KsE c531080KsE, Function0<Unit> function0) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(activity, "cameo_profile_navigate", true);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final void c9(C19EG c19eg, ViewGroup viewGroup, C1266270j3Z c1266270j3Z) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(c19eg, "cameo_profile_banner", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.theater.service.AITheaterProfileService
    public final Object U8(Activity activity, InterfaceC549230LgP interfaceC549230LgP, boolean z, boolean z2, Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }
}
