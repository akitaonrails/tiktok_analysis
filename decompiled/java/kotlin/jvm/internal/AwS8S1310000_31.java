package kotlin.jvm.internal;

import X.C04W7;
import X.C09AY;
import X.C15B8;
import X.C15TI;
import X.C15V6;
import X.C20526015Tm;
import X.C20532315Vx;
import X.C20532515Vz;
import X.C2095008Iq;
import android.text.Layout;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes32.dex */
public class AwS8S1310000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1310000_31 awS8S1310000_31, Object obj) {
        int layoutPosition;
        String strQ6;
        int value;
        String aid;
        String authorUid;
        String str;
        LogPbBean logPbBean;
        int awemeType;
        long jCurrentTimeMillis;
        boolean z;
        Aweme aweme;
        Integer exploreCommunityCommentShowType;
        AwemeStatistics statistics;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        String str2;
        Integer numLJIIJJI;
        ExploreFeedCell exploreFeedCell = (ExploreFeedCell) awS8S1310000_31.l1;
        Long l = (Long) awS8S1310000_31.l2;
        Map map = (Map) awS8S1310000_31.l3;
        boolean z2 = awS8S1310000_31.z4;
        String str3 = awS8S1310000_31.s0;
        String string = exploreFeedCell.T6().getText().toString();
        String strX5 = exploreFeedCell.X5((Layout) obj, string);
        String string2 = null;
        if (ExploreFeedCell.b7()) {
            if (map != null) {
                layoutPosition = C15V6.LIZ(map);
                strQ6 = C15V6.LIZIZ(map);
                if (strQ6 == null) {
                }
                if (map == null && (str2 = (String) map.get("model_source")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                    value = numLJIIJJI.intValue();
                } else {
                    value = C15TI.UNKNOWN.getValue();
                }
            } else {
                layoutPosition = -1;
            }
            strQ6 = "";
            if (map == null) {
                value = C15TI.UNKNOWN.getValue();
            } else {
                value = C15TI.UNKNOWN.getValue();
            }
        } else {
            layoutPosition = exploreFeedCell.getLayoutPosition();
            strQ6 = exploreFeedCell.q6();
            C20526015Tm item = exploreFeedCell.getItem();
            if (item != null) {
                value = item.LLILZLL;
            } else {
                value = C15TI.UNKNOWN.getValue();
            }
        }
        if (layoutPosition == -1) {
            layoutPosition = 0;
        }
        C20526015Tm item2 = exploreFeedCell.getItem();
        if (item2 != null && (aweme4 = item2.LL) != null) {
            aid = aweme4.getAid();
        } else {
            aid = null;
        }
        C20526015Tm item3 = exploreFeedCell.getItem();
        if (item3 != null && (aweme3 = item3.LL) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme3);
        } else {
            authorUid = null;
        }
        C20526015Tm item4 = exploreFeedCell.getItem();
        if (item4 != null) {
            str = item4.LLILLL;
        } else {
            str = null;
        }
        C20526015Tm item5 = exploreFeedCell.getItem();
        if (item5 != null) {
            logPbBean = item5.LLILZ;
        } else {
            logPbBean = null;
        }
        C20526015Tm item6 = exploreFeedCell.getItem();
        if (item6 != null && (aweme2 = item6.LL) != null) {
            awemeType = aweme2.getAwemeType();
        } else {
            awemeType = 0;
        }
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = -1;
        }
        HashMap<String, String> map2 = exploreFeedCell.LLJJJJLIIL;
        C20526015Tm item7 = exploreFeedCell.getItem();
        if (item7 != null) {
            z = item7.LLILZIL;
        } else {
            z = false;
        }
        Long lS6 = exploreFeedCell.S6();
        String tabName = exploreFeedCell.getTabName();
        String strZR1 = exploreFeedCell.zR1();
        C20526015Tm item8 = exploreFeedCell.getItem();
        if (item8 != null && (aweme = item8.LL) != null && (exploreCommunityCommentShowType = aweme.getExploreCommunityCommentShowType()) != null && exploreCommunityCommentShowType.intValue() == 1 && exploreFeedCell.b6(aweme).getFirst().length() > 0 && C04W7.LIZ() && (statistics = aweme.getStatistics()) != null) {
            string2 = Long.valueOf(statistics.getCommentCount()).toString();
        }
        C20532515Vz.LIZ(new C20532315Vx("homepage_explore", str3, strQ6, Integer.valueOf(layoutPosition), aid, authorUid, str, logPbBean, z2, awemeType, strX5, string, jCurrentTimeMillis, map2, z, value, lS6, tabName, strZR1, string2));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS8S1310000_31 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS8S1310000_31.invoke$1(kotlin.jvm.internal.AwS8S1310000_31, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1310000_31(C15B8 c15b8, GuestShowdownContent guestShowdownContent, ViewGroup viewGroup, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c15b8;
        this.l2 = guestShowdownContent;
        this.l3 = viewGroup;
        this.s0 = str;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1310000_31(ExploreFeedCell exploreFeedCell, ExploreFeedCell exploreFeedCell2, Long l, Map<String, String> map, boolean z, String str) {
        super(1);
        this.$t = str;
        this.l1 = exploreFeedCell;
        this.l2 = exploreFeedCell2;
        this.l3 = l;
        this.z4 = map;
        this.s0 = z;
    }
}
