package kotlin.jvm.internal;

import X.C09AY;
import X.C1434650nR9;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS47S1300000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S1300000_6 awS47S1300000_6, Object obj) {
        boolean z = false;
        if (((Boolean) obj).booleanValue()) {
            if (((ISocialGameService) awS47S1300000_6.l1).LJFF((SessionInfo) awS47S1300000_6.l2, new EmojiGameInfo(0, awS47S1300000_6.s0, null))) {
                z = true;
            }
        }
        ((Function1) awS47S1300000_6.l3).invoke(Boolean.valueOf(z));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S1300000_6 awS47S1300000_6, Object obj) {
        boolean z = false;
        if (((Boolean) obj).booleanValue()) {
            if (((ISocialGameService) awS47S1300000_6.l1).LJFF((SessionInfo) awS47S1300000_6.l2, new EmojiGameInfo(0, awS47S1300000_6.s0, null))) {
                z = true;
            }
        }
        ((Function1) awS47S1300000_6.l3).invoke(Boolean.valueOf(z));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS47S1300000_6 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS47S1300000_6.invoke$2(kotlin.jvm.internal.AwS47S1300000_6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S1300000_6(PublishModel publishModel, C1434650nR9 c1434650nR9, String str, FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = publishModel;
        this.l2 = c1434650nR9;
        this.s0 = str;
        this.l3 = friendsV3PublishStatusViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S1300000_6(ISocialGameService iSocialGameService, String str, SessionInfo sessionInfo, AwS215S0300000_6 awS215S0300000_6, int i) {
        super(1);
        this.$t = i;
        this.l1 = iSocialGameService;
        this.s0 = str;
        this.l2 = sessionInfo;
        this.l3 = awS215S0300000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S1300000_6(ISocialGameService iSocialGameService, String str, SessionInfo sessionInfo, AwS223S0300000_14 awS223S0300000_14, int i) {
        super(1);
        this.$t = i;
        this.l1 = iSocialGameService;
        this.s0 = str;
        this.l2 = sessionInfo;
        this.l3 = awS223S0300000_14;
    }
}
