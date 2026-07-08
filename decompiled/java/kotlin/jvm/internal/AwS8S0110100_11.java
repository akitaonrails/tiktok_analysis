package kotlin.jvm.internal;

import X.C09AY;
import X.C0SRH;
import X.C0SYI;
import X.C731910SnN;
import X.C732160Snm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.videorepost.VideoRepostVM;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS8S0110100_11 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S0110100_11 awS8S0110100_11, Object obj) {
        Aweme aweme;
        VideoRepostVM videoRepostVM = (VideoRepostVM) awS8S0110100_11.l0;
        long j = awS8S0110100_11.j2;
        VideoItemParams item = videoRepostVM.getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        C731910SnN c731910SnNVQ2 = videoRepostVM.vQ2(j, aweme, awS8S0110100_11.z1);
        obj.getClass();
        return new C732160Snm(c731910SnNVQ2);
    }

    public static final Object invoke$1(AwS8S0110100_11 awS8S0110100_11, Object obj) {
        PostDiggViewModel postDiggViewModel = (PostDiggViewModel) awS8S0110100_11.l0;
        C0SYI c0syiVQ2 = postDiggViewModel.vQ2(awS8S0110100_11.j2, postDiggViewModel.LLIZLLLIL, awS8S0110100_11.z1);
        obj.getClass();
        return new C0SRH(c0syiVQ2);
    }

    public static final Object invoke$2(AwS8S0110100_11 awS8S0110100_11, Object obj) {
        Aweme aweme;
        VideoRepostVM videoRepostVM = (VideoRepostVM) awS8S0110100_11.l0;
        long j = awS8S0110100_11.j2;
        VideoItemParams item = videoRepostVM.getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        C731910SnN c731910SnNVQ2 = videoRepostVM.vQ2(j, aweme, awS8S0110100_11.z1);
        obj.getClass();
        return new C732160Snm(c731910SnNVQ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0110100_11(VideoRepostVM videoRepostVM, long j, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoRepostVM;
        this.j2 = j;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0110100_11(PostDiggViewModel postDiggViewModel, long j, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = postDiggViewModel;
        this.j2 = j;
        this.z1 = z;
    }
}
