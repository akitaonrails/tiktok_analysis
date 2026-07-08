package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class VpnProxyInfo {

    @C09CT("is_proxy")
    public final Boolean isProxy;

    @C09CT("is_vpn")
    public final Boolean isVpn;

    @C09CT("proxy_domain_status")
    public final Map<String, Boolean> proxyDomainStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VpnProxyInfo)) {
            return false;
        }
        VpnProxyInfo vpnProxyInfo = (VpnProxyInfo) obj;
        return Intrinsics.LJFF(this.isVpn, vpnProxyInfo.isVpn) && Intrinsics.LJFF(this.isProxy, vpnProxyInfo.isProxy) && Intrinsics.LJFF(this.proxyDomainStatus, vpnProxyInfo.proxyDomainStatus);
    }

    public final int hashCode() {
        Boolean bool = this.isVpn;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isProxy;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, Boolean> map = this.proxyDomainStatus;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VpnProxyInfo(isVpn=");
        sbLIZ.append(this.isVpn);
        sbLIZ.append(", isProxy=");
        sbLIZ.append(this.isProxy);
        sbLIZ.append(", proxyDomainStatus=");
        sbLIZ.append(this.proxyDomainStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VpnProxyInfo(Boolean bool, Boolean bool2, Map<String, Boolean> map) {
        this.isVpn = bool;
        this.isProxy = bool2;
        this.proxyDomainStatus = map;
    }
}
