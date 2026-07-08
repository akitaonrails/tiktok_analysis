package kotlin.jvm.internal;

import X.C09AY;
import X.C1334280kpG;
import X.C2190321Anu;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS122S1000000_10 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1000000_10(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS122S1000000_10 awS122S1000000_10, Object obj, Object obj2) {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        boolean z = false;
        if ((searchMixFeed.isAggregatedVideo() || searchMixFeed.isMusicAggregatedVideo()) && (aggregatedVideo = searchMixFeed.aggregatedVideo) != null && (list = aggregatedVideo.awemes) != null) {
            String str = awS122S1000000_10.s0;
            if (!list.isEmpty()) {
                Iterator<Aweme> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it2.next().getAid(), str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS122S1000000_10 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r6 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r6
            int r1 = r6.getFeedType()
            r0 = 65514(0xffea, float:9.1805E-41)
            r4 = 33
            r3 = 1
            if (r1 != r0) goto L4f
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r6.getDynamicPatch()
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r6.getDynamicPatch()
            int r0 = r0.getOriginType()
            if (r0 != r4) goto L4f
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r6.getDynamicPatch()
            java.util.List r1 = r0.getAwemeList()
            if (r1 == 0) goto L4f
            java.lang.String r2 = r5.s0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4f
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L34
        L4a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L4f:
            int r0 = r6.getFeedType()
            if (r0 != r4) goto L6a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.getAid()
            if (r1 == 0) goto L6a
            java.lang.String r0 = r5.s0
            boolean r0 = r1.equals(r0)
            if (r0 != r3) goto L6a
            goto L4a
        L6a:
            r3 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S1000000_10.invoke$1(kotlin.jvm.internal.AwS122S1000000_10, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS122S1000000_10 awS122S1000000_10, Object obj, Object obj2) throws JSONException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Throwable th = (Throwable) obj2;
        C1334280kpG.LIZ.getClass();
        if (C1334280kpG.LIZIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", zBooleanValue ? 1 : 0);
            if (th != null) {
                jSONObject.put("error", th.getMessage());
            }
            if (awS122S1000000_10.s0.length() > 0) {
                jSONObject.put("content_type", awS122S1000000_10.s0);
            }
            jSONObject.put("surface", "search_photo_card");
            jSONObject.put("prefetch_group", C2190321Anu.LIZ());
            AppLogNewUtils.onEventV3("search_image_prefetch_monitor", jSONObject);
        }
        return Unit.LIZ;
    }
}
