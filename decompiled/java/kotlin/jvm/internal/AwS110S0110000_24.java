package kotlin.jvm.internal;

import X.C09AY;
import X.C1609400rz0;
import X.C1609410rz1;
import X.C1623706Xj;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.EnumC1609480rz8;
import X.EnumC992500bw0;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSocialFragment;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS110S0110000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS110S0110000_24 awS110S0110000_24, Object obj) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEvent = (MiniDramaPagePerformanceMonitor.PagePerformanceEvent) obj;
        pagePerformanceEvent.errorCode = String.valueOf(((SeriesCenterListResponse) awS110S0110000_24.l0).status_code);
        String str = ((SeriesCenterListResponse) awS110S0110000_24.l0).status_msg;
        str.toString();
        pagePerformanceEvent.errorMsg = str;
        pagePerformanceEvent.isCacheData = awS110S0110000_24.z1 ? 1 : 0;
        pagePerformanceEvent.cacheSource = "none";
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS110S0110000_24 awS110S0110000_24, Object obj) {
        C1609400rz0 c1609400rz0 = (C1609400rz0) obj;
        c1609400rz0.LIZIZ = true;
        c1609400rz0.LIZJ = EnumC1609480rz8.LARGE_MEDIUM_THUMB;
        c1609400rz0.LJFF = Integer.valueOf((int) ((StoryThoughtAvatarSocialFragment) awS110S0110000_24.l0).SR().LLILZ.getAvatarSizeDp());
        c1609400rz0.LJIIIIZZ = false;
        c1609400rz0.LJIIJ = new C1609410rz1(awS110S0110000_24.z1, EnumC992500bw0.INNER_BORDER, null, null, null, 60);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS110S0110000_24 awS110S0110000_24, Object obj) {
        if (!awS110S0110000_24.z1) {
            ((SeriesPanelSquareViewModel) awS110S0110000_24.l0).setState(AFwS264S0000000_24.get$arr$(697));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS110S0110000_24 awS110S0110000_24, Object obj) {
        boolean z = ((InboxSkylightListState) obj).getRefreshState() instanceof C1623706Xj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is refreshing state: ");
        sbLIZ.append(z);
        sbLIZ.append(", should refresh: ");
        sbLIZ.append(awS110S0110000_24.z1);
        C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (awS110S0110000_24.z1 && !z) {
            ((SkylightListViewModel) awS110S0110000_24.l0).manualListRefresh();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0110000_24(SeriesCenterListResponse seriesCenterListResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesCenterListResponse;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0110000_24(StoryThoughtAvatarSocialFragment storyThoughtAvatarSocialFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = storyThoughtAvatarSocialFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0110000_24(boolean z, SkylightListViewModel skylightListViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = skylightListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S0110000_24(boolean z, SeriesPanelSquareViewModel seriesPanelSquareViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = seriesPanelSquareViewModel;
    }
}
