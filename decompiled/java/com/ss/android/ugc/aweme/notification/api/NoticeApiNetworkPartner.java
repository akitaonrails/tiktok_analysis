package com.ss.android.ugc.aweme.notification.api;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C098200Yq;
import X.C0X52;
import X.C189200o6;
import X.C2188811AlT;
import X.C452501pT;
import X.C613390O4b;
import android.net.Uri;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeApiNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(new C613390O4b());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Integer numValueOf;
        if (c0x52 == null) {
            return;
        }
        try {
            T t = c0x52.LIZIZ;
            String path = request.getPath();
            if (Intrinsics.LJFF(path, "/aweme/v1/aweme/collecteduser/") && (t instanceof FavoriteListResponse)) {
                long j = ((FavoriteListResponse) t).cursor;
                List<DiggInfo> list = ((FavoriteListResponse) t).diggInfos;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                int i = ((FavoriteListResponse) t).hasMore;
                Uri uri = UriProtector.parse(request.getUrl());
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cursor");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aweme_id");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "count");
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path: ");
                sbLIZ.append(path);
                sbLIZ.append(", statusCode: ");
                sbLIZ.append(((FavoriteListResponse) t).status_code);
                sbLIZ.append(", statusMsg: ");
                sbLIZ.append(((FavoriteListResponse) t).status_msg);
                sbLIZ.append(", logId: ");
                sbLIZ.append(((FavoriteListResponse) t).extra.logid);
                sbLIZ.append(", req {itemId: ");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                sbLIZ.append(", cursur: ");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ.append(", count: ");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                sbLIZ.append("}, res {cursur: ");
                sbLIZ.append(j);
                sbLIZ.append(", length: ");
                sbLIZ.append(numValueOf);
                sbLIZ.append(", hasmore: ");
                sbLIZ.append(i);
                sbLIZ.append('}');
                abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
