package com.bytedance.android.livesdk.game;

import X.C020W;
import X.C0URZ;
import X.C259800zU;
import X.C497740JfY;
import X.C754650Tix;
import X.C754670Tiz;
import X.C754750Tj7;
import X.C754790TjB;
import X.EnumC754690Tj1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public class GameTopicService implements IGameTopicService {
    @Override // com.bytedance.android.live.game.IGameTopicService
    public final void Jm0(String str) {
        C0URZ.LIZ(str);
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final GameTag fB(LiveMode liveMode) {
        GameTag gameTag;
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ == null || (gameTag = enumC754690Tj1LIZ.getGameTag()) == null) {
            return new GameTag(0L, C497740JfY.LJIJI(2131842800), C497740JfY.LJIJI(2131842800), C497740JfY.LJIJI(2131842800), 0, null, null, null, null, 496, null);
        }
        return gameTag;
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final Integer md2(GameTag gameTag) {
        return Integer.valueOf(C0URZ.LIZIZ(gameTag));
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final Hashtag s62(LiveMode liveMode) {
        Hashtag hashtag;
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ == null || (hashtag = enumC754690Tj1LIZ.getHashtag()) == null) {
            return new Hashtag(0L, "", null, 0);
        }
        return hashtag;
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final void ZE2(Fragment fragment, DataChannel dataChannel) {
        C754650Tix.LIZ(dataChannel, fragment, AFwS245S0000000_12.get$arr$(137), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.game.IGameTopicService
    public final GameTag y61(DataChannel dataChannel, Fragment fragment, long j) {
        Long lValueOf = Long.valueOf(j);
        if (lValueOf != null && lValueOf.longValue() == -1) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        C754650Tix.LIZ(dataChannel, fragment, new C020W(c259800zU, (C259800zU<GameTag>) lValueOf, (Long) 48), null);
        return (GameTag) c259800zU.element;
    }

    @Override // com.bytedance.android.live.game.IGameTopicService
    public final void lk1(FragmentManager fragmentManager, C754750Tj7 c754750Tj7, EnumC754690Tj1 enumC754690Tj1, LiveMode liveMode) {
        C754790TjB.LIZ(fragmentManager, c754750Tj7, enumC754690Tj1, liveMode, "go_live");
    }
}
