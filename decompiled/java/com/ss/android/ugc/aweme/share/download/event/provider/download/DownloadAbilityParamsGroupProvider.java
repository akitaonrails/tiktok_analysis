package com.ss.android.ugc.aweme.share.download.event.provider.download;

import X.C1380780m2G;
import X.C1380810m2J;
import X.C1380830m2L;
import X.C1554960qZC;
import X.C2214201BlK;
import X.C584850Mwl;
import X.C729510SjV;
import X.C735370Ssx;
import X.C735840Sti;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import android.app.Activity;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadAbilityParamsGroupProvider implements BaseDownloadParamsGroupProvider<C1380810m2J> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380830m2L c1380830m2L;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1380780m2G c1380780m2G;
        GScope gScope = GScope.LL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(gScope, "Download", C1380830m2L.class, null);
        if (interfaceC1555100qZQLIZIZ2 == null || (c1380830m2L = (C1380830m2L) interfaceC1555100qZQLIZIZ2.getSource()) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "Download", C1380780m2G.class, null)) == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        final int i = c1380830m2L.LL;
        final String str = c1380830m2L.LLILLJJLI;
        final long j = c1380830m2L.LLILLL;
        final long j2 = c1380830m2L.LLILZ;
        final String authorUid = AwemeExtKt.getAuthorUid(c1380780m2G.LLILLJJLI);
        final String str2 = C729510SjV.LJJ(c1380780m2G.LLILLJJLI) ? "story" : "post";
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String str3 = c1380780m2G.LLILLL;
        Activity activityLJFF = C2214201BlK.LJFF();
        c735840Sti.getClass();
        final String strLJIIJ = C735840Sti.LJIIJ(activityLJFF, str3, null);
        final int i2 = c1380780m2G.LLILZLL;
        final long j3 = c1380830m2L.LLILZIL;
        final String strLJIJJLI = C735370Ssx.LJIJJLI(c1380780m2G.LLILLJJLI.getAuthor());
        final long j4 = c1380830m2L.LLILZ - c1380830m2L.LLILLL;
        final int i3 = c1380830m2L.LLILZLL;
        final String strLIZIZ = C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(c1380780m2G.LLILLJJLI));
        final String str4 = c1380830m2L.LLJ;
        final String str5 = c1380830m2L.LLJI;
        final int i4 = c1380830m2L.LLIZ;
        final int i5 = c1380830m2L.LLIZLLLIL;
        return new InterfaceC1282004zy(i, str, i5, j, j2, authorUid, str2, strLJIIJ, i2, j3, strLJIJJLI, j4, i3, strLIZIZ, str4, str5, i4) { // from class: X.0m2J
            public final int LL;
            public final String LLILLJJLI;
            public final int LLILLL;
            public final long LLILZ;
            public final long LLILZIL;
            public final String LLILZLL;
            public final String LLIZ;
            public final String LLIZLLLIL;
            public final int LLJ;
            public final long LLJI;
            public final String LLJIJIL;
            public final long LLJILJIL;
            public final int LLJILJILJ;
            public final String LLJILLL;
            public final String LLJJ;
            public final String LLJJI;
            public final int LLJJIII;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1380810m2J)) {
                    return false;
                }
                C1380810m2J c1380810m2J = (C1380810m2J) obj;
                return this.LL == c1380810m2J.LL && Intrinsics.LJFF(this.LLILLJJLI, c1380810m2J.LLILLJJLI) && this.LLILLL == c1380810m2J.LLILLL && this.LLILZ == c1380810m2J.LLILZ && this.LLILZIL == c1380810m2J.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1380810m2J.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1380810m2J.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1380810m2J.LLIZLLLIL) && this.LLJ == c1380810m2J.LLJ && this.LLJI == c1380810m2J.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1380810m2J.LLJIJIL) && this.LLJILJIL == c1380810m2J.LLJILJIL && this.LLJILJILJ == c1380810m2J.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1380810m2J.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1380810m2J.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1380810m2J.LLJJI) && this.LLJJIII == c1380810m2J.LLJJIII;
            }

            public final int hashCode() {
                int iHashCode = ((((((((((((((((((((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31) + this.LLJILLL.hashCode()) * 31;
                String str6 = this.LLJJ;
                int iHashCode2 = (iHashCode + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.LLJJI;
                return ((iHashCode2 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.LLJJIII;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_server_watermark", Integer.valueOf(this.LL));
                linkedHashMap.put("download_url", this.LLILLJJLI);
                linkedHashMap.put("retry", Integer.valueOf(this.LLILLL));
                linkedHashMap.put("start_download", Long.valueOf(this.LLILZ));
                linkedHashMap.put("end_download", Long.valueOf(this.LLILZIL));
                linkedHashMap.put("author_id", this.LLILZLL);
                linkedHashMap.put("story_type", this.LLIZ);
                linkedHashMap.put("enter_position", this.LLIZLLLIL);
                linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLJ));
                linkedHashMap.put("package_size", Long.valueOf(this.LLJI));
                linkedHashMap.put("follow_status", this.LLJIJIL);
                linkedHashMap.put("duration", Long.valueOf(this.LLJILJIL));
                linkedHashMap.put("download_result", Integer.valueOf(this.LLJILJILJ));
                linkedHashMap.put("log_pb", this.LLJILLL);
                linkedHashMap.put("error_code", this.LLJJ);
                linkedHashMap.put("error_message", this.LLJJI);
                linkedHashMap.put("retry_failed", Integer.valueOf(this.LLJJIII));
                return linkedHashMap;
            }

            public final String toString() {
                return "DownloadAbilityParamsGroup(isServerWatermark=" + this.LL + ", downloadUrl=" + this.LLILLJJLI + ", retry=" + this.LLILLL + ", startDownload=" + this.LLILZ + ", endDownload=" + this.LLILZIL + ", authorID=" + this.LLILZLL + ", storyType=" + this.LLIZ + ", enterPosition=" + this.LLIZLLLIL + ", isLandscapeScreen=" + this.LLJ + ", packageSize=" + this.LLJI + ", followStatus=" + this.LLJIJIL + ", duration=" + this.LLJILJIL + ", downloadResult=" + this.LLJILJILJ + ", logPb=" + this.LLJILLL + ", errorCode=" + this.LLJJ + ", errorMsg=" + this.LLJJI + ", retryFailed=" + this.LLJJIII + ')';
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                HashMap map = new HashMap();
                map.putAll(keyParams());
                if (this.LLJILJILJ != 0) {
                    map.remove("retry_failed");
                    map.remove("error_code");
                    map.remove("error_message");
                }
                return map;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                C1380790m2H c1380790m2H;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380790m2H.class, null);
                return (interfaceC1555100qZQLIZIZ3 == null || (c1380790m2H = (C1380790m2H) interfaceC1555100qZQLIZIZ3.getSource()) == null) ? C2097608Jq.LJ() : TakoAIVideoMobFiller.toParams(c1380790m2H.LLILLJJLI, c1380790m2H.LLILLL, c1380790m2H.LLILZ);
            }

            {
                this.LL = i;
                this.LLILLJJLI = str;
                this.LLILLL = i5;
                this.LLILZ = j;
                this.LLILZIL = j2;
                this.LLILZLL = authorUid;
                this.LLIZ = str2;
                this.LLIZLLLIL = strLJIIJ;
                this.LLJ = i2;
                this.LLJI = j3;
                this.LLJIJIL = strLJIJJLI;
                this.LLJILJIL = j4;
                this.LLJILJILJ = i3;
                this.LLJILLL = strLIZIZ;
                this.LLJJ = str4;
                this.LLJJI = str5;
                this.LLJJIII = i4;
            }
        };
    }
}
