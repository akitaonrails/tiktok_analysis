package com.ss.android.ugc.aweme.ad.comment.api;

import X.C01GW;
import X.C09CT;
import X.C0X9S;
import X.C10A0;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC19212710Ej;
import X.InterfaceC594300NSq;
import com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class HasCommentDesApi {
    public static InterfaceC19212710Ej LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(90));

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/v1/ad/privacy/settings/description/")
        C0X9S<HasCResponse> getResponse(@InterfaceC1501070pAH("item_id") String str);
    }

    public static void LIZ(String str, C10A0 c10a0) {
        LIZ = c10a0;
        ((Api) LIZIZ.getValue()).getResponse(str).enqueue(new InterfaceC594300NSq<HasCResponse>() { // from class: X.10Eh
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<HasCommentDesApi.HasCResponse> c0x9s, Throwable th) {
                HasCommentDesApi.LIZ = null;
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<HasCommentDesApi.HasCResponse> c0x9s, C0X52<HasCommentDesApi.HasCResponse> c0x52) {
                if (c0x52 != null && c0x52.LIZJ() && c0x52.LIZIZ.hasAdCommentDes) {
                    C2487409ou.LIZJ(new Runnable() { // from class: X.10Ei
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("HasCommentDesApi@4941.hasAdCommentSettingDes$1$onResponse$1$1");
                            try {
                                InterfaceC19212710Ej interfaceC19212710Ej = HasCommentDesApi.LIZ;
                                if (interfaceC19212710Ej != null) {
                                    interfaceC19212710Ej.call();
                                }
                                HasCommentDesApi.LIZ = null;
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("HasCommentDesApi@4941.hasAdCommentSettingDes$1$onResponse$1$1");
                        }
                    });
                } else {
                    HasCommentDesApi.LIZ = null;
                }
            }
        });
    }

    public static final class HasCResponse {

        @C09CT("has_ad_comment_des")
        public final boolean hasAdCommentDes;

        @C09CT("status_code")
        public final int statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        public HasCResponse(int i, String str, boolean z) {
            this.statusCode = i;
            this.statusMsg = str;
            this.hasAdCommentDes = z;
        }
    }
}
