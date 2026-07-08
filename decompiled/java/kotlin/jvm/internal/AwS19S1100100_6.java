package kotlin.jvm.internal;

import X.C09AY;
import X.C0HFR;
import X.C0HNI;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C433040GyU;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS19S1100100_6 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$0(AwS19S1100100_6 awS19S1100100_6, Object obj) {
        boolean z;
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI("social_avatar_enter_from", awS19S1100100_6.s0, bundle);
        C0HFR c0hfrXQ2 = ((SocialAvatarEditViewModel) awS19S1100100_6.l1).xQ2();
        if (c0hfrXQ2 != null) {
            z = c0hfrXQ2.LL;
        } else {
            z = true;
        }
        bundle.putBoolean("social_avatar_is_first_avatar", z);
        bundle.putBoolean("social_avatar_is_using_user_bucket", ((C0HNI) ((SocialAvatarEditViewModel) awS19S1100100_6.l1).getState()).LLILZLL);
        bundle.putLong("social_avatar_download_time_in_ms", awS19S1100100_6.j2);
        bundle.putInt("social_avatar_count", ((ArrayList) ((SocialAvatarEditViewModel) awS19S1100100_6.l1).LL).size());
        bundle.putBoolean("social_avatar_need_update", ((SocialAvatarEditViewModel) awS19S1100100_6.l1).CQ2());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S1100100_6 awS19S1100100_6, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((EasterEggForShareAssem) awS19S1100100_6.l1).So(awS19S1100100_6.j2, "high_frequency_sharing", awS19S1100100_6.s0, "not_shown", "animation_rejected");
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((EasterEggForShareAssem) awS19S1100100_6.l1);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C433040GyU((EasterEggForShareAssem) awS19S1100100_6.l1, null), 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1100100_6(EasterEggForShareAssem easterEggForShareAssem, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = easterEggForShareAssem;
        this.s0 = str;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1100100_6(String str, SocialAvatarEditViewModel socialAvatarEditViewModel, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = socialAvatarEditViewModel;
        this.j2 = j;
    }
}
