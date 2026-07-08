package kotlin.jvm.internal;

import X.C09AY;
import X.C1623606Xi;
import X.C1816130xMR;
import X.C1855180yNQ;
import X.C1855260yNY;
import X.C1861040yWs;
import X.C19323610io;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS41S0000100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0000100_27(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        return C1861040yWs.LIZ((C1861040yWs) obj, null, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, awS41S0000100_27.j0, null, null, null, null, null, 1056964607);
    }

    public static final Object invoke$1(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        return C1855260yNY.LIZ((C1855260yNY) obj, true, true, new C1855180yNQ("", false, ""), null, Long.valueOf(awS41S0000100_27.j0), null, null, 104);
    }

    public static final Object invoke$2(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        return C19323610io.LJJIJL((C19323610io) obj, null, null, false, null, String.valueOf(awS41S0000100_27.j0), false, false, null, false, false, null, false, false, 16777087);
    }

    public static final Object invoke$3(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        boolean z;
        if (((IExploreTopicTabProtocol) obj).getTabId() == awS41S0000100_27.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        boolean z;
        Long l = ((ExploreCustomTopicResponse) obj).topicId;
        long j = awS41S0000100_27.j0;
        if (l != null && l.longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        boolean z;
        if (((IExploreTopicTabProtocol) obj).getTabId() == awS41S0000100_27.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS41S0000100_27 awS41S0000100_27, Object obj) {
        return C1816130xMR.LIZ((C1816130xMR) obj, null, null, null, new C1623606Xi(Long.valueOf(awS41S0000100_27.j0)), null, null, null, null, 503);
    }
}
