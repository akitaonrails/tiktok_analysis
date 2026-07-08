package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0W17;
import X.C1581390rFp;
import X.C1601400rm6;
import X.C189200o6;
import X.C2188811AlT;
import X.C614770O9j;
import X.C724240Sb0;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS146S0201000_24 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS146S0201000_24 awS146S0201000_24) {
        C1581390rFp.LIZ(C724240Sb0.LJI((FriendsV3RefreshAssem) awS146S0201000_24.l0), (InsertStory) awS146S0201000_24.l1, awS146S0201000_24.i2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS146S0201000_24 awS146S0201000_24) {
        String str;
        int i = awS146S0201000_24.i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        str = "auto";
                    } else {
                        str = "publish_landing";
                    }
                } else {
                    str = "home_tab";
                }
            } else {
                str = "pull_refresh";
            }
        } else {
            str = "refresh";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshAndShowSkylightList, start real refresh with ");
        sbLIZ.append(str);
        C0W17.LIZJ("data", C2188811AlT.LIZIZ(sbLIZ));
        C614770O9j.LIZIZ.LJ().LJIIJ((Fragment) awS146S0201000_24.l0, str, 0, (InsertStory) awS146S0201000_24.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS146S0201000_24 awS146S0201000_24) {
        try {
            ((C1601400rm6) awS146S0201000_24.l0).LIZJ(awS146S0201000_24.i2, (FeedItemList) awS146S0201000_24.l1);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0201000_24(int i, Fragment fragment, InsertStory insertStory, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = fragment;
        this.l1 = insertStory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0201000_24(C1601400rm6 c1601400rm6, int i, FeedItemList feedItemList, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1601400rm6;
        this.i2 = i;
        this.l1 = feedItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0201000_24(FriendsV3RefreshAssem friendsV3RefreshAssem, InsertStory insertStory, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = friendsV3RefreshAssem;
        this.l1 = insertStory;
        this.i2 = i;
    }
}
