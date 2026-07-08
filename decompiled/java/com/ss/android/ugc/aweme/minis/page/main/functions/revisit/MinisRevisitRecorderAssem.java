package com.ss.android.ugc.aweme.minis.page.main.functions.revisit;

import X.AbstractC738140SxQ;
import X.C0QSJ;
import X.C1395720mQM;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C635000OvS;
import X.C687700QyG;
import X.EnumC1395730mQN;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisRevisitRecorderAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final Set<String> LL = new LinkedHashSet();
    public volatile InterfaceC1324510kZV LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisRevisitRecorderAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1324510kZV m266do() {
        InterfaceC1324510kZV interfaceC1324510kZV = this.LLILLJJLI;
        if (interfaceC1324510kZV == null) {
            synchronized (this) {
                interfaceC1324510kZV = this.LLILLJJLI;
                if (interfaceC1324510kZV == null) {
                    InterfaceC1324510kZV interfaceC1324510kZVBo = bo();
                    this.LLILLJJLI = interfaceC1324510kZVBo;
                    return interfaceC1324510kZVBo;
                }
            }
        }
        return interfaceC1324510kZV;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
    }

    public final InterfaceC1324510kZV bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILLL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILLL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLILZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
        String str;
        String string;
        IMinisRevisitMissionService iMinisRevisitMissionService;
        InterfaceC1324510kZV interfaceC1324510kZVBo = this.LLILLJJLI;
        if (interfaceC1324510kZVBo == null) {
            synchronized (this) {
                interfaceC1324510kZVBo = this.LLILLJJLI;
                if (interfaceC1324510kZVBo == null) {
                    interfaceC1324510kZVBo = bo();
                    this.LLILLJJLI = interfaceC1324510kZVBo;
                }
            }
        }
        SchemaParserData schemaParserDataCl = interfaceC1324510kZVBo.Cl();
        if (schemaParserDataCl == null) {
            return;
        }
        String str2 = schemaParserDataCl.clientKey;
        if (str2 != null) {
            C635000OvS.LIZ.getClass();
            ((Keva) C635000OvS.LIZIZ.getValue()).storeLong(C635000OvS.LIZ(str2), System.currentTimeMillis());
        }
        if (!m266do().GE() || schemaParserDataCl.isBackgroundLoad || (str = schemaParserDataCl.clientKey) == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return;
        }
        boolean zLJFF = Intrinsics.LJFF(schemaParserDataCl.enterMethod, "desktop_shortcut");
        C1395720mQM c1395720mQM = EnumC1395730mQN.Companion;
        String enterFrom = schemaParserDataCl.getEnterFrom();
        c1395720mQM.getClass();
        EnumC1395730mQN enumC1395730mQNLIZ = zLJFF ? EnumC1395730mQN.SHORT_CUT : C1395720mQM.LIZ(enterFrom);
        if (enumC1395730mQNLIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(':');
        sbLIZ.append(enumC1395730mQNLIZ.getScene());
        if (this.LL.add(C2188811AlT.LIZIZ(sbLIZ)) && (iMinisRevisitMissionService = (IMinisRevisitMissionService) PluggableExtentionKt.pluggableSpi$default(IMinisRevisitMissionService.class, false, false, false, 14, null)) != null) {
            iMinisRevisitMissionService.LJ(enumC1395730mQNLIZ, string);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
    }
}
