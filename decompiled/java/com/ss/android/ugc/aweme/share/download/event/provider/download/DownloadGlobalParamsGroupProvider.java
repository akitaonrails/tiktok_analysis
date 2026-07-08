package com.ss.android.ugc.aweme.share.download.event.provider.download;

import X.C1380780m2G;
import X.C1380800m2I;
import X.C1554960qZC;
import X.C324710Co9;
import X.C729510SjV;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.CreationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadGlobalParamsGroupProvider implements BaseDownloadParamsGroupProvider<C1380800m2I> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        final String repostFromGroupId;
        final int i;
        List<String> creationUsedFunctions;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        Aweme aweme = c1380780m2G.LLILLJJLI;
        if (AwemeExtKt.getRepostFromGroupId(aweme) == null && AwemeExtKt.getRepostFromUserId(aweme) == null) {
            repostFromGroupId = aweme.getAid();
        } else {
            repostFromGroupId = AwemeExtKt.getRepostFromGroupId(aweme);
            if (repostFromGroupId == null) {
                repostFromGroupId = "";
            }
        }
        final int awemeType = aweme.getAwemeType();
        final String str = c1380780m2G.LLILLL;
        final String str2 = c1380780m2G.LLILZ;
        final String str3 = C324710Co9.LIZ(aweme) ? "1" : CardStruct.IStatusCode.DEFAULT;
        final String str4 = c1380780m2G.LLIZ;
        boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme);
        CreationInfo creationInfo = aweme.getCreationInfo();
        if (creationInfo != null && (creationUsedFunctions = creationInfo.getCreationUsedFunctions()) != null) {
            Iterator<String> it2 = creationUsedFunctions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (Intrinsics.LJFF(next, "ai_livephoto")) {
                    i = next != null ? 1 : 0;
                }
            }
        }
        final int i2 = zLJJIJIL ? 1 : 0;
        return new InterfaceC1282004zy(repostFromGroupId, str, str2, str3, awemeType, i2, i, str4) { // from class: X.0m2I
            public final String LL;
            public final int LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;
            public final String LLILZIL;
            public final String LLILZLL;
            public final int LLIZ;
            public final int LLIZLLLIL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1380800m2I)) {
                    return false;
                }
                C1380800m2I c1380800m2I = (C1380800m2I) obj;
                return Intrinsics.LJFF(this.LL, c1380800m2I.LL) && this.LLILLJJLI == c1380800m2I.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1380800m2I.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380800m2I.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1380800m2I.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1380800m2I.LLILZLL) && this.LLIZ == c1380800m2I.LLIZ && this.LLIZLLLIL == c1380800m2I.LLIZLLLIL;
            }

            public final int hashCode() {
                return (((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("group_id", this.LL);
                linkedHashMap.put("aweme_type", Integer.valueOf(this.LLILLJJLI));
                linkedHashMap.put("enter_from", this.LLILLL);
                linkedHashMap.put("download_method", this.LLILZ);
                linkedHashMap.put("is_self_video", this.LLILZIL);
                linkedHashMap.put("download_id", this.LLILZLL);
                linkedHashMap.put("is_story", Integer.valueOf(this.LLIZ));
                linkedHashMap.put("is_ai_livephoto", Integer.valueOf(this.LLIZLLLIL));
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DownloadGlobalParamsGroup(groupID=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", awemeType=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", downloadMethod=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", isSelfVideo=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", downloadID=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(", isStory=");
                sbLIZ.append(this.LLIZ);
                sbLIZ.append(", isAILivePhoto=");
                sbLIZ.append(this.LLIZLLLIL);
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
                this.LL = repostFromGroupId;
                this.LLILLJJLI = awemeType;
                this.LLILLL = str;
                this.LLILZ = str2;
                this.LLILZIL = str3;
                this.LLILZLL = str4;
                this.LLIZ = i2;
                this.LLIZLLLIL = i;
            }
        };
    }
}
