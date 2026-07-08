package kotlin.jvm.internal;

import X.C09AY;
import X.C1357860lRI;
import X.C1357900lRM;
import com.ss.android.ugc.now.interaction.api.CommentCountState;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.api.LikeState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS7S1000100_21 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public String s0;

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

    public static final Object invoke$0(AwS7S1000100_21 awS7S1000100_21, Object obj) {
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        CommentCountState commentCountState = new CommentCountState(awS7S1000100_21.j1, awS7S1000100_21.s0);
        LikeState likeState = interactionSyncViewModelState.likeState;
        interactionSyncViewModelState.getClass();
        return interactionSyncViewModelState.copy(likeState, null, commentCountState, interactionSyncViewModelState.commentPublishState, interactionSyncViewModelState.commentDeleteState, interactionSyncViewModelState.commentLatestState, interactionSyncViewModelState.user, interactionSyncViewModelState.activePost);
    }

    public static final Object invoke$1(AwS7S1000100_21 awS7S1000100_21, Object obj) {
        return C1357900lRM.LIZ((C1357900lRM) obj, null, null, null, new C1357860lRI(awS7S1000100_21.s0, awS7S1000100_21.j1), 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1000100_21(long j, String str, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1000100_21(String str, String str2, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str2;
        this.j1 = j;
    }
}
