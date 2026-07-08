package com.bytedance.ies.cutsame.resourcefetcher;

import X.C2188811AlT;
import X.C2491509pZ;
import X.C539420LDo;
import X.InterfaceC19859512n3;
import X.InterfaceC2491409pY;
import android.text.TextUtils;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcherCallBack;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkFileFetcher implements ResourceFetcher {
    public abstract void LJJJZ(String str, String str2, C539420LDo c539420LDo);

    public static class DownloadItem {
        public String url = "";
        public String md5 = "";

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(this.url);
            sbLIZ.append(", ");
            sbLIZ.append(this.md5);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0LDo] */
    @Override // com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher
    public final void fetch(String str, final ResourceFetcherCallBack resourceFetcherCallBack) {
        DownloadItem downloadItem = (DownloadItem) GsonProtectorUtils.fromJson(new Gson(), str, DownloadItem.class);
        if (downloadItem != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch ");
            sbLIZ.append(downloadItem);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC2491409pY interfaceC2491409pY = C2491509pZ.LIZ;
            if (interfaceC2491409pY != null) {
                interfaceC2491409pY.LIZ(strLIZIZ);
            }
            String str2 = downloadItem.url;
            final String str3 = downloadItem.md5;
            LJJJZ(str2, str3, new InterfaceC19859512n3(str3, resourceFetcherCallBack) { // from class: X.0LDo
                public final String LIZ;
                public final ResourceFetcherCallBack LIZIZ;

                @Override // X.InterfaceC19859512n3
                public final void notifySuccess(String str4) {
                    if (!new C0VSJ(str4).exists()) {
                        InterfaceC2491409pY interfaceC2491409pY2 = C2491509pZ.LIZ;
                        if (interfaceC2491409pY2 != null) {
                            interfaceC2491409pY2.LJ("cut.NetworkFileFetcher", "notifySuccess but file not exist");
                        }
                        notifyError(-18, "file doesn't exist");
                        return;
                    }
                    if (!TextUtils.isEmpty(this.LIZ)) {
                        String strLIZJ = C2117808Rk.LIZJ(str4);
                        if (!TextUtils.equals(this.LIZ, strLIZJ)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("notifySuccess but md5 verify failed. md5=");
                            sbLIZ2.append(this.LIZ);
                            sbLIZ2.append(", fileMd5=");
                            sbLIZ2.append(strLIZJ);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            InterfaceC2491409pY interfaceC2491409pY3 = C2491509pZ.LIZ;
                            if (interfaceC2491409pY3 != null) {
                                interfaceC2491409pY3.LJ("cut.NetworkFileFetcher", strLIZIZ2);
                            }
                            notifyError(-18, "md5 verify failed");
                            return;
                        }
                    }
                    this.LIZIZ.notifySuccess(str4);
                }

                {
                    this.LIZ = str3;
                    this.LIZIZ = resourceFetcherCallBack;
                }

                @Override // X.InterfaceC19859512n3
                public final void notifyError(int i, String str4) {
                    this.LIZIZ.notifyError(i, str4);
                }
            });
        }
    }
}
