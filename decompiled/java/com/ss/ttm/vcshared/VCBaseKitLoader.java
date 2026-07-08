package com.ss.ttm.vcshared;

import X.C1150504el;
import X.C1472750oQb;

/* JADX INFO: loaded from: classes14.dex */
public class VCBaseKitLoader {
    public static synchronized void LIZ() {
        if (C1472750oQb.LJI && C1150504el.LIZ().LJII) {
            C1150504el.LIZ().LIZLLL("player_precreate_load_vcbasekit_so_duration", false);
        }
        com_ss_ttm_vcshared_VCBaseKitLoader__loadLibrary$___twin___();
        if (C1472750oQb.LJI && C1150504el.LIZ().LJII) {
            C1150504el.LIZ().LJI("player_precreate_load_vcbasekit_so_duration", false);
            C1472750oQb.LJI = false;
        }
    }

    public static synchronized boolean com_ss_ttm_vcshared_VCBaseKitLoader__loadLibrary$___twin___() {
        return com.ss.vcbkit.VCBaseKitLoader.loadLibrary();
    }
}
