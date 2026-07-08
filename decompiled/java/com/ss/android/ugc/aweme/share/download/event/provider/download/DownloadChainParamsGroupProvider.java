package com.ss.android.ugc.aweme.share.download.event.provider.download;

import X.C121700dD;
import X.C1380840m2M;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadChainParamsGroupProvider implements BaseDownloadParamsGroupProvider<C121700dD> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380840m2M c1380840m2M;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380840m2M.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380840m2M = (C1380840m2M) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final String str = c1380840m2M.LLILZLL;
        final String strValueOf = String.valueOf(c1380840m2M.LLIZ);
        final String strValueOf2 = String.valueOf(c1380840m2M.LLIZLLLIL);
        final Integer num = c1380840m2M.LLJ;
        final String str2 = c1380840m2M.LLJI;
        final int i = c1380840m2M.LLJIJIL;
        return new InterfaceC1282004zy(i, str, strValueOf, strValueOf2, num, str2) { // from class: X.00dD
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final Integer LLILZ;
            public final String LLILZIL;
            public final int LLILZLL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C121700dD)) {
                    return false;
                }
                C121700dD c121700dD = (C121700dD) obj;
                return Intrinsics.LJFF(this.LL, c121700dD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c121700dD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c121700dD.LLILLL) && Intrinsics.LJFF(this.LLILZ, c121700dD.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c121700dD.LLILZIL) && this.LLILZLL == c121700dD.LLILZLL;
            }

            public final int hashCode() {
                int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
                Integer num2 = this.LLILZ;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.LLILZIL;
                return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LLILZLL;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_downloading", this.LL);
                linkedHashMap.put("duration", this.LLILLJJLI);
                linkedHashMap.put("download_result", this.LLILLL);
                linkedHashMap.put("error_code", this.LLILZ);
                linkedHashMap.put("error_desc", this.LLILZIL);
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LLILZLL));
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DownloadChainParamsGroup(isDownloading=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", duration=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", result=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", errorCode=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", errorDesc=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", status=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = str;
                this.LLILLJJLI = strValueOf;
                this.LLILLL = strValueOf2;
                this.LLILZ = num;
                this.LLILZIL = str2;
                this.LLILZLL = i;
            }
        };
    }
}
