package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS193S1100000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
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
    public AwS193S1100000_15(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = multiGuestSharedBgAnchorViewModel;
    }

    public static final Object invoke$0(AwS193S1100000_15 awS193S1100000_15, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from LinkState apply  wallpaper, sharedBgUrl = ");
        sbLIZ.append(awS193S1100000_15.s0);
        sbLIZ.append(", download image failed");
        C20441214yg.LJIIIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        ((MultiGuestSharedBgAnchorViewModel) awS193S1100000_15.l1).setState(AFwS250S0000000_15.get$arr$(119));
        ((MultiGuestSharedBgAnchorViewModel) awS193S1100000_15.l1).LLILZIL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS193S1100000_15 awS193S1100000_15, Object obj, Object obj2) {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS193S1100000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from LinkState apply shared bg, sharedBgUrl = ");
        sbLIZ.append(awS193S1100000_15.s0);
        sbLIZ.append(", download image failed");
        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
        ((MultiGuestSharedBgGuestViewModel) awS193S1100000_15.l1).setState(AFwS250S0000000_15.get$arr$(148));
        ((MultiGuestSharedBgGuestViewModel) awS193S1100000_15.l1).LLILZLL = null;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS193S1100000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
    }
}
