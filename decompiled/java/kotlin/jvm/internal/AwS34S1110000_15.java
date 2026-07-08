package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC954910axN;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS34S1110000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS34S1110000_15 awS34S1110000_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(awS34S1110000_15.s0, "source");
        interfaceC954910axN.LJIILIIL(Boolean.valueOf(awS34S1110000_15.z2), "isResetSession");
        interfaceC954910axN.LJIILL(((MultiHostCrossAdapterImpl) awS34S1110000_15.l1).LLILLL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS34S1110000_15 awS34S1110000_15, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (Intrinsics.LJFF(((MultiGuestSharedBgAnchorViewModel) awS34S1110000_15.l1).LLILZIL, awS34S1110000_15.s0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" from LinkState aigc wallpaper bg, download image success, sharedBgUrl = ");
            sbLIZ.append(awS34S1110000_15.s0);
            C20441214yg.LJIIIZ("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS34S1110000_15.l1;
            multiGuestSharedBgAnchorViewModel.setState(new AwS13S1210000_15(awS34S1110000_15.z2, multiGuestSharedBgAnchorViewModel, awS34S1110000_15.s0, downloadInfo, 2));
        } else {
            C20441214yg.LJIIIZ("anchor_shared_bg_viewmodel", "from LinkState wallpaper apply shared bg, abort because effect changed");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S1110000_15(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestSharedBgAnchorViewModel;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S1110000_15(String str, boolean z, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = multiHostCrossAdapterImpl;
    }
}
