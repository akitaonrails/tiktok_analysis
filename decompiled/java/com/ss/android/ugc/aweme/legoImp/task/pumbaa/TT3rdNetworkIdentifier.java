package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C2188811AlT;
import X.C841740X0i;
import X.InterfaceC304970BxP;
import com.bytedance.bpea.net3rd.api.I3rdNetworkIdentifier;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BostonConfig;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class TT3rdNetworkIdentifier implements I3rdNetworkIdentifier {
    public String[] LIZ = ((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIILLIIL();

    public TT3rdNetworkIdentifier() {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0X0h
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                this.LL.LIZ = ((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIILLIIL();
            }
        });
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdNetworkIdentifier
    public final boolean LIZ(String str) {
        String lowerCase;
        String lowerCase2;
        if (str == null || str.length() == 0) {
            return false;
        }
        BostonConfig bostonConfig = (BostonConfig) C841740X0i.LIZIZ.getValue();
        if (bostonConfig == null) {
            bostonConfig = C841740X0i.LIZ;
        }
        if (bostonConfig.enablePumbaa3rdNetworkIdentifier) {
            try {
                String host = UriProtector.parse(str).getHost();
                if (host != null && (lowerCase = host.toLowerCase(Locale.ROOT)) != null) {
                    if (Intrinsics.LJFF(NetworkDomainRecognize.domainIdentityRecognize(lowerCase), "bd_3rd")) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        String host2 = UriProtector.parse(str).getHost();
        if (host2 != null) {
            lowerCase2 = host2.toLowerCase(Locale.ROOT);
        } else {
            lowerCase2 = null;
        }
        for (String str2 : this.LIZ) {
            String lowerCase3 = str2.toLowerCase(Locale.ROOT);
            if (lowerCase2 == null || !u.LJIIZILJ(lowerCase2, lowerCase3, false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('.');
                sbLIZ.append(lowerCase2);
                if (!u.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ), lowerCase3, false)) {
                }
            }
            return false;
        }
        return true;
    }
}
