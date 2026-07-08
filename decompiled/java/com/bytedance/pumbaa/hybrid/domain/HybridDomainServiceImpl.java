package com.bytedance.pumbaa.hybrid.domain;

import X.C13BV;
import X.C1942007j8;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class HybridDomainServiceImpl implements IHybridDomainService {
    public List<String> LIZ;
    public List<String> LIZIZ;

    public HybridDomainServiceImpl() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = c13bv;
        this.LIZIZ = c13bv;
    }

    @Override // com.bytedance.pumbaa.hybrid.domain.IHybridDomainService
    public final boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !C1942007j8.LIZJ(UriProtector.parse(str), this.LIZ);
    }

    @Override // com.bytedance.pumbaa.hybrid.domain.IHybridDomainService
    public final void LIZIZ(List<String> list) {
        this.LIZ = list;
    }

    @Override // com.bytedance.pumbaa.hybrid.domain.IHybridDomainService
    public final boolean LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (!C1942007j8.LIZJ(UriProtector.parse(str), this.LIZIZ)) {
            String host = UriProtector.parse(str).getHost();
            if (host == null) {
                return false;
            }
            if (!u.LJIJI(host, "localhost", true) && !new Regex("^(\\d{1,3}\\.){3}\\d{1,3}$").matches(host) && !new Regex("^(\\[)?([0-9a-fA-F]{0,4}:){2,7}([0-9a-fA-F]{0,4})(\\])?$").matches(host)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.pumbaa.hybrid.domain.IHybridDomainService
    public final boolean LIZLLL(Uri uri) {
        if (uri == null) {
            return false;
        }
        return !C1942007j8.LIZJ(uri, this.LIZ);
    }

    @Override // com.bytedance.pumbaa.hybrid.domain.IHybridDomainService
    public final void LJ(List<String> list) {
        this.LIZIZ = list;
    }
}
