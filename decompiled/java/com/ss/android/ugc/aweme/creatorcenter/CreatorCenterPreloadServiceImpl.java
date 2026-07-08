package com.ss.android.ugc.aweme.creatorcenter;

import X.AbstractC1552040qUU;
import X.C04TD;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1553780qXI;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2344009Gk;
import X.InterfaceC1550240qRa;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creatorcenter.CreatorCenterPreloadServiceImpl;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class CreatorCenterPreloadServiceImpl implements ICreatorCenterPreloadService {
    public static ICreatorCenterPreloadService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ICreatorCenterPreloadService.class, false);
        if (objLIZ != null) {
            return (ICreatorCenterPreloadService) objLIZ;
        }
        if (C04TD.LLLLLZ == null) {
            synchronized (ICreatorCenterPreloadService.class) {
                if (C04TD.LLLLLZ == null) {
                    C04TD.LLLLLZ = new CreatorCenterPreloadServiceImpl();
                }
            }
        }
        return C04TD.LLLLLZ;
    }

    public CreatorCenterPreloadServiceImpl() {
        CreatorCenterURLSetting.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService
    public final void LIZIZ() {
        int i = C1553780qXI.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService
    public final void LIZJ() {
        int i = C1553780qXI.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qXH] */
    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService
    public final void LIZ(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("cc_gecko_preload_hamburger_tap_is_enabled", false)) {
                final String strLIZ = C1553670qX7.LIZ();
                C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(strLIZ);
                final ?? r0 = new InterfaceC1550240qRa() { // from class: X.0qXH
                    @Override // X.InterfaceC1550240qRa
                    public final void LIZIZ() {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        CreatorCenterPreloadServiceImpl creatorCenterPreloadServiceImpl = this.LIZ;
                        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                        creatorCenterPreloadServiceImpl.getClass();
                        CreatorCenterPreloadServiceImpl.LJ(j, null, true);
                    }

                    @Override // X.InterfaceC1550240qRa
                    public final void LIZ(Throwable th) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        CreatorCenterPreloadServiceImpl creatorCenterPreloadServiceImpl = this.LIZ;
                        String message = th.getMessage();
                        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                        creatorCenterPreloadServiceImpl.getClass();
                        CreatorCenterPreloadServiceImpl.LJ(j, message, false);
                    }
                };
                AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.0qRZ
                    @Override // X.AbstractC1552040qUU
                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                        r0.LIZIZ();
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        InterfaceC1550240qRa interfaceC1550240qRa = r0;
                        if (th == null) {
                            th = new Throwable("geckox update failed", th);
                        }
                        interfaceC1550240qRa.LIZ(th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list;
                        List<Pair<String, Long>> list2;
                        if (map != null && (list2 = map.get(strLIZ)) != null) {
                            String str2 = str;
                            Iterator<Pair<String, Long>> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Pair<String, Long> next = it2.next();
                                if (Intrinsics.LJFF(next.first, str2)) {
                                    if (next != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (map2 != null && (list = map2.get(strLIZ)) != null) {
                            String str3 = str;
                            Iterator<UpdatePackage> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                UpdatePackage next2 = it3.next();
                                if (Intrinsics.LJFF(next2.getChannel(), str3)) {
                                    if (next2 != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        r0.LIZ(new Throwable("invalid channel"));
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                        InterfaceC1550240qRa interfaceC1550240qRa = r0;
                        if (th == null) {
                            th = new Throwable("geckox update failed", th);
                        }
                        interfaceC1550240qRa.LIZ(th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        r0.LIZIZ();
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJI(int i, Throwable th, Map map) {
                        r0.LIZ(th);
                    }
                };
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                optionCheckUpdateParams.setLazyUpdate(true);
                optionCheckUpdateParams.setListener(abstractC1552040qUU);
                Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new kotlin.Pair(strLIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
                if (c1551950qULLJIIIZ != null) {
                    c1551950qULLJIIIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                }
            }
        }
    }

    public static void LJ(long j, String str, boolean z) {
        String str2;
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "prefetch_time");
        if (C1553780qXI.LIZIZ()) {
            str2 = "creator_center";
        } else {
            str2 = "creator_tools";
        }
        c2344009Gk.LJFF("button_name", str2);
        c2344009Gk.LJFF("error_message", str);
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        c2344009Gk.LJFF("prefetch_status", str3);
        C20684815ws.LJIILLIIL("creator_center_gecko_prefetch_complete", c2344009Gk.LIZ);
    }
}
