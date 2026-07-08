package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS5S2110000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

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

    public static final Object invoke$0(AwS5S2110000_15 awS5S2110000_15, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (Intrinsics.LJFF(((MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2).LLILZIL, awS5S2110000_15.s0)) {
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audience aigc: apply shared bg, download image success, sharedBgUrl = ");
            sbLIZ.append(awS5S2110000_15.s0);
            multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = (MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2;
            multiGuestSharedBgGuestViewModel2.setState(new AwS5S2210000_15(awS5S2110000_15.z3, multiGuestSharedBgGuestViewModel2, awS5S2110000_15.s1, awS5S2110000_15.s0, downloadInfo, 0));
        } else {
            ((MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2).yQ2("audience aigc: apply shared bg, abort because effect changed");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S2110000_15 awS5S2110000_15, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (Intrinsics.LJFF(((MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2).LLILZLL, awS5S2110000_15.s0)) {
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from LinkState apply aigc wallpaper bg, download image success, sharedBgUrl = ");
            sbLIZ.append(awS5S2110000_15.s0);
            multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = (MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2;
            multiGuestSharedBgGuestViewModel2.setState(new AwS5S2210000_15(awS5S2110000_15.z3, multiGuestSharedBgGuestViewModel2, awS5S2110000_15.s1, awS5S2110000_15.s0, downloadInfo, 1));
        } else {
            ((MultiGuestSharedBgGuestViewModel) awS5S2110000_15.l2).yQ2("from LinkState apply aigc wallpaper apply shared bg, abort because effect changed");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2110000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, boolean z, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.z3 = z;
        this.s1 = str2;
    }
}
