package com.ss.android.ugc.aweme.ad.gp.service;

import X.C0N1S;
import X.C1028270crh;
import X.C1054180dXU;
import X.C1054200dXW;
import X.C1697810uHb;
import X.InterfaceC1050810dS3;
import X.InterfaceC1054160dXS;
import X.InterfaceC1054170dXT;
import X.InterfaceC1054190dXV;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceGooglePlayServiceImpl implements ICommerceGooglePlayService {
    public final List<InterfaceC1054170dXT> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1054170dXT() { // from class: X.0dXJ
        @Override // X.InterfaceC1054170dXT
        public final InterfaceC1054160dXS LIZ(Uri uri) {
            if (!Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https")) {
                return null;
            }
            return new C1054110dXN(uri);
        }
    }, new InterfaceC1054170dXT() { // from class: X.0dXL
        @Override // X.InterfaceC1054170dXT
        public final InterfaceC1054160dXS LIZ(Uri uri) {
            if (!Intrinsics.LJFF(uri.getScheme(), "market")) {
                return null;
            }
            return new C1054150dXR(uri);
        }
    }, new InterfaceC1054170dXT() { // from class: X.0dXK
        @Override // X.InterfaceC1054170dXT
        public final InterfaceC1054160dXS LIZ(final Uri uri) {
            if (Intrinsics.LJFF(uri.getScheme(), "intent")) {
                return new AbstractC1054130dXP(uri) { // from class: X.0dXM
                    public final Uri LIZ;

                    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
                    
                        if (r2.equals("https") != false) goto L43;
                     */
                    @Override // X.InterfaceC1054160dXS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final android.net.Uri convert() {
                        /*
                            Method dump skipped, instruction units count: 225
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1054100dXM.convert():android.net.Uri");
                    }

                    {
                        this.LIZ = uri;
                    }
                };
            }
            return null;
        }
    });
    public final List<C1054180dXU> LIZIZ = C1697810uHb.LJIIL(new Object() { // from class: X.0dXU
    });

    @Override // com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService
    public final C1054200dXW LIZIZ(C1028270crh c1028270crh) {
        Iterator<C1054180dXU> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            if (c1028270crh.LIZ == C0N1S.LANDING_AD) {
                return new C1054200dXW(c1028270crh);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService
    public final Uri LIZJ(Uri uri) {
        Iterator<InterfaceC1054170dXT> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1054160dXS interfaceC1054160dXSLIZ = it2.next().LIZ(uri);
            if (interfaceC1054160dXSLIZ != null) {
                return interfaceC1054160dXSLIZ.convert();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService
    public final boolean LIZ(Context context, String str, InterfaceC1054190dXV interfaceC1054190dXV) {
        InterfaceC1050810dS3 interfaceC1050810dS3LJIIIIZZ;
        ILegacyCommercializeService iLegacyCommercializeService = (ILegacyCommercializeService) PluggableExtentionKt.pluggableSpi$default(ILegacyCommercializeService.class, false, false, false, 14, null);
        if (iLegacyCommercializeService == null || (interfaceC1050810dS3LJIIIIZZ = iLegacyCommercializeService.LJIIIIZZ()) == null) {
            return false;
        }
        boolean zLJFF = interfaceC1050810dS3LJIIIIZZ.LJFF(context, str);
        if (zLJFF) {
            if (interfaceC1054190dXV != null) {
                interfaceC1054190dXV.onSuccess(str);
            }
        } else if (interfaceC1054190dXV != null) {
            interfaceC1054190dXV.onFailed(str);
            return zLJFF;
        }
        return zLJFF;
    }
}
