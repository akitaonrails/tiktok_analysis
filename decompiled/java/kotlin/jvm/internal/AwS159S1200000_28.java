package kotlin.jvm.internal;

import X.C09AY;
import X.C10LZ;
import X.C13LP;
import X.C1403740mdI;
import X.C19223110Ij;
import X.C20684815ws;
import Y.ARunnableS82S0200000_13;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS159S1200000_28 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1200000_28(VideoPublishEditModel videoPublishEditModel, C19223110Ij c19223110Ij, int i) {
        super(2);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.s0 = "video_edit_page";
        this.l2 = c19223110Ij;
    }

    public static final Object invoke$0(AwS159S1200000_28 awS159S1200000_28, Object obj, Object obj2) {
        User user;
        Object objLJJJLL;
        User user2;
        List<String> urlList;
        ((Number) obj2).intValue();
        RecSwipeGalleryLayoutManager layoutManagerV2 = ((C10LZ) awS159S1200000_28.l1).getLayoutManagerV2();
        if (layoutManagerV2 != null) {
            UserWithAweme userWithAwemeLIZLLL = ((C10LZ) awS159S1200000_28.l1).LIZLLL(layoutManagerV2.LLILZIL);
            if (userWithAwemeLIZLLL != null && (user = userWithAwemeLIZLLL.getUser()) != null) {
                UrlModel avatarMedium = user.getAvatarMedium();
                if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null) {
                    objLJJJLL = C13LP.LJJJLL(urlList);
                } else {
                    objLJJJLL = null;
                }
                if (Intrinsics.LJFF(obj, awS159S1200000_28.s0) && Intrinsics.LJFF(obj, objLJJJLL) && (user2 = (User) awS159S1200000_28.l2) != null) {
                    C10LZ c10lz = (C10LZ) awS159S1200000_28.l1;
                    HandlerHook.viewPost(c10lz, new ARunnableS82S0200000_13(user2, c10lz, 28));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS159S1200000_28 awS159S1200000_28, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Map<String, String> mapLIZ = C1403740mdI.LIZ((VideoPublishEditModel) awS159S1200000_28.l1, awS159S1200000_28.s0);
        if (!zBooleanValue) {
            C20684815ws.LJIILLIIL("turn_off_mature_themes", mapLIZ);
        }
        ((VideoPublishEditModel) awS159S1200000_28.l1).getCreativeFlowData().getPublishConfig().setMatureTheme(zBooleanValue ? 1 : 0);
        ((C19223110Ij) awS159S1200000_28.l2).LJIIIIZZ = !r1.LJ;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S1200000_28(C10LZ c10lz, String str, User user, int i) {
        super(2);
        this.$t = i;
        this.l1 = c10lz;
        this.s0 = str;
        this.l2 = user;
    }
}
