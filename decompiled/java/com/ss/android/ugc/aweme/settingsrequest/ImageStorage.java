package com.ss.android.ugc.aweme.settingsrequest;

import X.C01GW;
import X.C0VSJ;
import X.C1322200kVm;
import X.C1328130kfL;
import X.C13BV;
import X.C13VI;
import X.C20022913Vz;
import X.C2354709Kn;
import X.C2454209jY;
import X.C297930Bm3;
import X.EnumC1335420kr6;
import X.InterfaceC1326920kdO;
import com.ss.android.ugc.aweme.setting.performance.ToolsImageDiskStorageConfig;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public final class ImageStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C2354709Kn.LJIILIIL();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        C0VSJ c0vsjLJIILIIL;
        ArrayList arrayList = new ArrayList();
        if ((C297930Bm3.LIZ() || ((ToolsImageDiskStorageConfig) C20022913Vz.LIZIZ.getValue()).isOpen) && (c0vsjLJIILIIL = C2354709Kn.LJIILIIL()) != null) {
            arrayList.add(new C0VSJ(c0vsjLJIILIIL, "fresco_custom_cache/tools_default"));
        }
        C01GW c01gw = C20022913Vz.LIZIZ;
        if (((ToolsImageDiskStorageConfig) c01gw.getValue()).isOpen) {
            Class<?> cls = C1322200kVm.LIZ;
            InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get("tools_default");
            if (interfaceC1326920kdO != null) {
                interfaceC1326920kdO.LJI(((long) ((ToolsImageDiskStorageConfig) c01gw.getValue()).lruCacheDays) * 86400000);
            }
        }
        C0VSJ c0vsjLJIILIIL2 = C2354709Kn.LJIILIIL();
        if (c0vsjLJIILIIL2 == null) {
            return 0L;
        }
        return C2454209jY.LIZIZ(c0vsjLJIILIIL2, arrayList, z);
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C13BV c13bv = C13BV.INSTANCE;
        C0VSJ c0vsjLJIILIIL = C2354709Kn.LJIILIIL();
        if (c0vsjLJIILIIL == null) {
            return 0L;
        }
        return C2454209jY.LIZIZ(c0vsjLJIILIIL, c13bv, z);
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        return LJIIJ(z);
    }
}
