package com.ss.android.ugc.tiktok.location.serviceimpl;

import X.C0C2S;
import X.C1197760hH4;
import X.C1205480hTW;
import X.C1207340hWW;
import X.C1207400hWc;
import X.EnumC1205470hTV;
import X.InterfaceC1207490hWl;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServiceForLS implements ILocationServiceForLS {
    @Override // com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS
    public final EnumC1205470hTV LIZJ(TokenCert tokenCert) {
        C1207340hWW.LIZ.getClass();
        if (!C1207340hWW.LJIIJ(tokenCert)) {
            C1205480hTW c1205480hTW = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV = EnumC1205470hTV.INVALID_CERT;
            c1205480hTW.getClass();
            C1205480hTW.LIZ(enumC1205470hTV, tokenCert);
            return enumC1205470hTV;
        }
        if (C0C2S.LIZ(tokenCert)) {
            C1205480hTW c1205480hTW2 = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV2 = EnumC1205470hTV.BLOCKED_CERT;
            c1205480hTW2.getClass();
            C1205480hTW.LIZ(enumC1205470hTV2, tokenCert);
            return enumC1205470hTV2;
        }
        C1205480hTW c1205480hTW3 = C1205480hTW.LIZ;
        EnumC1205470hTV enumC1205470hTV3 = EnumC1205470hTV.SUCCESS;
        c1205480hTW3.getClass();
        C1205480hTW.LIZ(enumC1205470hTV3, tokenCert);
        return enumC1205470hTV3;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS
    public final EnumC1205470hTV LIZIZ(Context context, TokenCert tokenCert) {
        if (context == null) {
            C1205480hTW c1205480hTW = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV = EnumC1205470hTV.UNKOWN_ERROR;
            c1205480hTW.getClass();
            C1205480hTW.LIZ(enumC1205470hTV, tokenCert);
            return enumC1205470hTV;
        }
        C1197760hH4.LIZ.getClass();
        if (!C1197760hH4.LIZ()) {
            C1205480hTW c1205480hTW2 = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV2 = EnumC1205470hTV.NOT_MET_EXP;
            c1205480hTW2.getClass();
            C1205480hTW.LIZ(enumC1205470hTV2, tokenCert);
            return enumC1205470hTV2;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJJIIJZLJL(context)) {
            C1207340hWW.LIZ.getClass();
            if (!C1207340hWW.LJIIJ(tokenCert)) {
                C1205480hTW c1205480hTW3 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV3 = EnumC1205470hTV.INVALID_CERT;
                c1205480hTW3.getClass();
                C1205480hTW.LIZ(enumC1205470hTV3, tokenCert);
                return enumC1205470hTV3;
            }
            if (!C1207340hWW.LIZLLL().LJIILL(tokenCert)) {
                C1205480hTW c1205480hTW4 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV4 = EnumC1205470hTV.HIT_CERT_FREQUENCY;
                c1205480hTW4.getClass();
                C1205480hTW.LIZ(enumC1205470hTV4, tokenCert);
                return enumC1205470hTV4;
            }
            if (C0C2S.LIZ(tokenCert)) {
                C1205480hTW c1205480hTW5 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV5 = EnumC1205470hTV.SUCCESS;
                c1205480hTW5.getClass();
                C1205480hTW.LIZ(enumC1205470hTV5, tokenCert);
                return EnumC1205470hTV.BLOCKED_CERT;
            }
            C1205480hTW c1205480hTW6 = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV6 = EnumC1205470hTV.SUCCESS;
            c1205480hTW6.getClass();
            C1205480hTW.LIZ(enumC1205470hTV6, tokenCert);
            return enumC1205470hTV6;
        }
        C1205480hTW c1205480hTW7 = C1205480hTW.LIZ;
        EnumC1205470hTV enumC1205470hTV7 = EnumC1205470hTV.INVALID_PERMISSION;
        c1205480hTW7.getClass();
        C1205480hTW.LIZ(enumC1205470hTV7, tokenCert);
        return enumC1205470hTV7;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS
    public final EnumC1205470hTV LIZ(Context context, TokenCert tokenCert, String str) {
        if (context == null) {
            C1205480hTW c1205480hTW = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV = EnumC1205470hTV.UNKOWN_ERROR;
            c1205480hTW.getClass();
            C1205480hTW.LIZ(enumC1205470hTV, tokenCert);
            C1207400hWc.LIZ.getClass();
            C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV);
            return enumC1205470hTV;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJJ()) {
            InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
            if (interfaceC1207490hWl != null && interfaceC1207490hWl.LJII(0, context)) {
                C1205480hTW c1205480hTW2 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV2 = EnumC1205470hTV.INVALID_PERMISSION;
                c1205480hTW2.getClass();
                C1205480hTW.LIZ(enumC1205470hTV2, tokenCert);
                C1207400hWc.LIZ.getClass();
                C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV2);
                return enumC1205470hTV2;
            }
            C1207340hWW.LIZ.getClass();
            if (!C1207340hWW.LJIIJ(tokenCert)) {
                C1205480hTW c1205480hTW3 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV3 = EnumC1205470hTV.INVALID_CERT;
                c1205480hTW3.getClass();
                C1205480hTW.LIZ(enumC1205470hTV3, tokenCert);
                C1207400hWc.LIZ.getClass();
                C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV3);
                return enumC1205470hTV3;
            }
            if (!C1207340hWW.LJIIIZ(tokenCert)) {
                C1205480hTW c1205480hTW4 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV4 = EnumC1205470hTV.HIT_CERT_FREQUENCY;
                c1205480hTW4.getClass();
                C1205480hTW.LIZ(enumC1205470hTV4, tokenCert);
                C1207400hWc.LIZ.getClass();
                C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV4);
                return enumC1205470hTV4;
            }
            if (C0C2S.LIZ(tokenCert)) {
                C1205480hTW c1205480hTW5 = C1205480hTW.LIZ;
                EnumC1205470hTV enumC1205470hTV5 = EnumC1205470hTV.BLOCKED_CERT;
                c1205480hTW5.getClass();
                C1205480hTW.LIZ(enumC1205470hTV5, tokenCert);
                C1207400hWc.LIZ.getClass();
                C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV5);
                return enumC1205470hTV5;
            }
            C1205480hTW c1205480hTW6 = C1205480hTW.LIZ;
            EnumC1205470hTV enumC1205470hTV6 = EnumC1205470hTV.SUCCESS;
            c1205480hTW6.getClass();
            C1205480hTW.LIZ(enumC1205470hTV6, tokenCert);
            return enumC1205470hTV6;
        }
        C1205480hTW c1205480hTW7 = C1205480hTW.LIZ;
        EnumC1205470hTV enumC1205470hTV7 = EnumC1205470hTV.NOT_ALLOW_LOCATION;
        c1205480hTW7.getClass();
        C1205480hTW.LIZ(enumC1205470hTV7, tokenCert);
        C1207400hWc.LIZ.getClass();
        C1207400hWc.LJIILLIIL(str, tokenCert, enumC1205470hTV7);
        return enumC1205470hTV7;
    }
}
