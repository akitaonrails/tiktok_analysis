package com.ss.android.ugc.aweme.ad.preload.gecko;

import X.AbstractC1552040qUU;
import X.C01GW;
import X.C1028210crb;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C1048150dNl;
import X.C1551910qUH;
import X.C823050WQl;
import X.C988570bpf;
import X.EnumC1048180dNo;
import X.InterfaceC1040680dBi;
import X.InterfaceC988110bov;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS27S0101000_16;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ad.experiment.AdAutofillJsConfigExp;
import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatConfigExp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class GeckoPreloadServiceImpl implements ICommerceGeckoPreloadService {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService
    public final void LIZIZ() {
        if (((AdAutofillJsConfigExp.AdAutofillJsConfig) AdAutofillJsConfigExp.LIZIZ.getValue()).useJsPlatform) {
            C823050WQl.LIZLLL().submit(new ARunnableS116S0100000_16(this, 20));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService
    public final void LIZLLL() {
        String str = IABLoadingFormatConfigExp.LIZIZ;
        if (str == null || str.length() == 0 || this.LIZJ) {
            return;
        }
        LJ(new C1048150dNl(str, "global", true, false, true));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService
    public final void LIZJ(int i) {
        boolean zLJI = MethodIDManager.LJI(137882);
        C823050WQl.LIZLLL().submit(new ARunnableS27S0101000_16(i, this, 2));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJ(final C1048150dNl c1048150dNl) {
        final String strK0;
        String strK02;
        if (!a0.LJJJIL(c1048150dNl.LIZIZ) && !a0.LJJJIL(c1048150dNl.LIZ)) {
            if (Intrinsics.LJFF(c1048150dNl.LIZIZ, "global")) {
                if (c1048150dNl.LIZJ) {
                    String str = c1048150dNl.LIZ;
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        strK02 = iAdLandPagePreloadService.K0("global");
                    } else {
                        strK02 = null;
                    }
                    if (c1048150dNl.LJ && C1551910qUH.LIZIZ(strK02, "on_demand") == EnumC1048180dNo.STATUS_REQUESTED) {
                        if (strK02 != null) {
                            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                            optionCheckUpdateParams.setLazyUpdate(true);
                            C988570bpf.LIZ.getClass();
                            if (C1041070dCL.LIZIZ() != null) {
                                C1041280dCg.LIZ(str, new AbstractC1552040qUU() { // from class: X.0dNk
                                    @Override // X.AbstractC1552040qUU
                                    public final void LJII(Throwable th, Map map) {
                                    }

                                    @Override // X.AbstractC1552040qUU
                                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                                    }

                                    @Override // X.AbstractC1552040qUU
                                    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                                    }

                                    @Override // X.AbstractC1552040qUU
                                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                                        this.LIZ.LIZ(c1048150dNl, null);
                                        this.LIZ.LJFF(c1048150dNl);
                                    }

                                    @Override // X.AbstractC1552040qUU
                                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                                        if (th != null) {
                                            th.getMessage();
                                        }
                                    }

                                    @Override // X.AbstractC1552040qUU
                                    public final void LJIL(long j, UpdatePackage updatePackage) {
                                        this.LIZ.LJFF(c1048150dNl);
                                        this.LIZ.LIZ(c1048150dNl, null);
                                    }
                                }, optionCheckUpdateParams);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZIZ() == null) {
                        return;
                    }
                    C1041280dCg.LIZ(str, new AbstractC1552040qUU() { // from class: X.0dNk
                        @Override // X.AbstractC1552040qUU
                        public final void LJII(Throwable th, Map map) {
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                            this.LIZ.LIZ(c1048150dNl, null);
                            this.LIZ.LJFF(c1048150dNl);
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                            if (th != null) {
                                th.getMessage();
                            }
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIL(long j, UpdatePackage updatePackage) {
                            this.LIZ.LJFF(c1048150dNl);
                            this.LIZ.LIZ(c1048150dNl, null);
                        }
                    }, null);
                    return;
                }
                LIZ(c1048150dNl, null);
                return;
            }
            if (c1048150dNl.LIZJ) {
                IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService2 == null || (strK0 = iAdLandPagePreloadService2.K0(c1048150dNl.LIZIZ)) == null) {
                    return;
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() == null) {
                    return;
                }
                C1041280dCg.LIZIZ(c1048150dNl.LIZ, strK0, new AbstractC1552040qUU() { // from class: X.0dNj
                    @Override // X.AbstractC1552040qUU
                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                        this.LIZ.LIZ(c1048150dNl, new InterfaceC1040680dBi() { // from class: X.0dNm
                            @Override // X.InterfaceC1040680dBi
                            public final void LIZ(String str2) {
                            }

                            @Override // X.InterfaceC1040680dBi
                            public final void LIZIZ() {
                            }
                        });
                        this.LIZ.LJFF(c1048150dNl);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list;
                        List<Pair<String, Long>> list2;
                        if (map != null && (list2 = map.get(strK0)) != null) {
                            C1048150dNl c1048150dNl2 = c1048150dNl;
                            Iterator<Pair<String, Long>> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Pair<String, Long> next = it2.next();
                                if (Intrinsics.LJFF(next.first, c1048150dNl2.LIZ)) {
                                    if (next != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (map2 != null && (list = map2.get(strK0)) != null) {
                            C1048150dNl c1048150dNl3 = c1048150dNl;
                            Iterator<UpdatePackage> it3 = list.iterator();
                            while (it3.hasNext() && !Intrinsics.LJFF(it3.next().getChannel(), c1048150dNl3.LIZ)) {
                            }
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                        if (th != null) {
                            th.getMessage();
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        this.LIZ.LIZ(c1048150dNl, new InterfaceC1040680dBi() { // from class: X.0dNn
                            @Override // X.InterfaceC1040680dBi
                            public final void LIZ(String str2) {
                            }

                            @Override // X.InterfaceC1040680dBi
                            public final void LIZIZ() {
                            }
                        });
                        this.LIZ.LJFF(c1048150dNl);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJI(int i, Throwable th, Map map) {
                        th.getMessage();
                    }
                });
                return;
            }
            LIZ(c1048150dNl, null);
        }
    }

    public final void LJFF(C1048150dNl c1048150dNl) {
        if (AdAutofillConfigSettings.LIZ().channelList.contains(c1048150dNl.LIZ)) {
            this.LIZ = true;
        }
        C01GW c01gw = AdAutofillJsConfigExp.LIZIZ;
        if (((AdAutofillJsConfigExp.AdAutofillJsConfig) c01gw.getValue()).jsChannel != null && TextUtils.equals(((AdAutofillJsConfigExp.AdAutofillJsConfig) c01gw.getValue()).jsChannel, c1048150dNl.LIZ)) {
            this.LIZIZ = true;
        }
        String str = IABLoadingFormatConfigExp.LIZIZ;
        if (str != null && TextUtils.equals(str, c1048150dNl.LIZ)) {
            this.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService
    public final void LIZ(C1048150dNl c1048150dNl, InterfaceC1040680dBi interfaceC1040680dBi) {
        String strLJI;
        if (c1048150dNl.LIZLLL) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (Intrinsics.LJFF(c1048150dNl.LIZIZ, "global")) {
                C988570bpf.LIZ.getClass();
                InterfaceC988110bov interfaceC988110bovLIZ = C1041070dCL.LIZ();
                if (interfaceC988110bovLIZ != null) {
                    strLJI = ((C1028210crb) interfaceC988110bovLIZ).LJII(c1048150dNl.LIZ);
                } else {
                    return;
                }
            } else {
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() == null) {
                    return;
                } else {
                    strLJI = C1028210crb.LJI(c1048150dNl.LIZ, c1048150dNl.LIZIZ);
                }
            }
            if (strLJI != null && !a0.LJJJIL(strLJI)) {
                iAdLandPagePreloadService.O0(strLJI, interfaceC1040680dBi);
            }
        }
    }
}
