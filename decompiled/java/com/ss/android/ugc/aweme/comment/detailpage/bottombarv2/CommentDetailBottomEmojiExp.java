package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2;

import X.C01GW;
import X.C09CT;
import X.C10EU;
import X.C1345700l7g;
import X.C1A1M;
import X.C452501pT;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDetailBottomEmojiExp {
    public static final CommentDetailBottomEmojiExp LIZ = new CommentDetailBottomEmojiExp();
    public static final BottomEmojiABConfig LIZIZ = new BottomEmojiABConfig(0, 0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(102));

    public static final boolean LIZ() {
        LIZ.getClass();
        return ((BottomEmojiABConfig) LIZJ.getValue()).enable > 0;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (C10EU.LJIILLIIL(aweme.getAuthor()) || !C1A1M.LIZIZ.LIZ(AwemeExtKt.getAuthorUid(aweme)) || AwemeExtKt.getFollowStatus(aweme) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str) {
        User author;
        boolean zLIZIZ;
        if (str == null || str.length() == 0) {
            return false;
        }
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ != null) {
            author = awemeLLILZ.getAuthor();
        } else {
            author = null;
        }
        if (C1345700l7g.LJIIIZ(author)) {
            return false;
        }
        if (awemeLLILZ != null) {
            zLIZIZ = LIZIZ(awemeLLILZ);
        } else {
            zLIZIZ = false;
        }
        int i = ((BottomEmojiABConfig) LIZJ.getValue()).scene;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return LIZ();
                }
                return false;
            }
            if (LIZ() && zLIZIZ) {
                return true;
            }
            return false;
        }
        if (LIZ() && !zLIZIZ) {
            return true;
        }
        return false;
    }

    public static final class BottomEmojiABConfig {

        @C09CT("comment_detail_bottom_quick_emoji_enable")
        public final int enable;

        @C09CT("comment_detail_bottom_quick_emoji_avatar")
        public final int hasAvatar;

        @C09CT("comment_detail_bottom_quick_emoji_scene")
        public final int scene;

        public BottomEmojiABConfig() {
            this(0, 0, 0);
        }

        public BottomEmojiABConfig(int i, int i2, int i3) {
            this.enable = i;
            this.hasAvatar = i2;
            this.scene = i3;
        }
    }
}
