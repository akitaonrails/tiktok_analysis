package com.ss.android.ugc.tiktok.location.component;

import X.C01GW;
import X.C0T2Y;
import X.C1205380hTM;
import X.C19EG;
import X.C452501pT;
import X.C724240Sb0;
import X.C740740T3w;
import X.InterfaceC687820QyS;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.tiktok.location.component.LocationFypGpsFetchComponent;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationFypGpsFetchComponent extends BasePanelComponent {
    public final ILocationBaseServiceForMT LL = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(645));
    public final Set<String> LLILLL = new LinkedHashSet();
    public final C1205380hTM LLILZ = new InterfaceC687820QyS() { // from class: X.0hTM
        @Override // X.InterfaceC687820QyS
        public final void LIZ(LocationData locationData) {
        }

        @Override // X.InterfaceC687820QyS
        public final void onError(int i, String str) {
        }
    };

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C19EG c19egLIZ;
        super.onParentViewCreated();
        if (!this.LL.LJJIIJ() || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        C740740T3w.LIZIZ(c19egLIZ, c19egLIZ, new C0T2Y() { // from class: X.0hTL
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                String strCt0;
                TokenCert tokenCertWith;
                String aid;
                HomeTabAbility homeTabAbility = (HomeTabAbility) this.LL.LLILLJJLI.getValue();
                Boolean boolValueOf = null;
                if (homeTabAbility != null) {
                    strCt0 = homeTabAbility.Ct0();
                } else {
                    strCt0 = null;
                }
                if (Intrinsics.LJFF(strCt0, "For You")) {
                    if (aweme != null && (aid = aweme.getAid()) != null) {
                        this.LL.LLILLL.add(aid);
                    }
                    if (this.LL.LLILLL.size() == 20) {
                        this.LL.LLILLL.clear();
                        LocationFypGpsFetchComponent locationFypGpsFetchComponent = this.LL;
                        locationFypGpsFetchComponent.getClass();
                        int i = C292400Bd8.LIZ;
                        if (i != 5) {
                            if (i != 10) {
                                if (i == 15) {
                                    tokenCertWith = TokenCert.Companion.with("bpea-location_fyp_gps_fetch_15_min_cache");
                                    tokenCertWith.auth("wpvk");
                                } else {
                                    return;
                                }
                            } else {
                                tokenCertWith = TokenCert.Companion.with("bpea-location_fyp_gps_fetch_10_min_cache");
                                tokenCertWith.auth("livy");
                            }
                        } else {
                            tokenCertWith = TokenCert.Companion.with("bpea-location_fyp_gps_fetch_5_min_cache");
                            tokenCertWith.auth("aakc");
                        }
                        Context context = locationFypGpsFetchComponent.getContext();
                        if (context != null) {
                            boolValueOf = Boolean.valueOf(C1207450hWh.LIZ.LJII(0, context));
                        }
                        if (Intrinsics.LJFF(Boolean.TRUE, boolValueOf)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchLocationNew cacheTime");
                            sbLIZ.append(i);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1207450hWh.LIZ.LJIIL("fyp", "periodically", tokenCertWith, null, locationFypGpsFetchComponent.LLILZ, -1L);
                        }
                    }
                }
            }
        });
    }
}
