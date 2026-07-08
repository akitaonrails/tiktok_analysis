package kotlin.jvm.internal;

import X.AbstractC919790a2j;
import X.C00IS;
import X.C01HE;
import X.C09AY;
import X.C1143300frE;
import X.C1697810uHb;
import X.C207209166l;
import X.C2097608Jq;
import X.C403501hZ;
import X.C771370UNr;
import X.C915850ZwN;
import X.C919770a2h;
import X.C920060a3A;
import X.C920070a3B;
import X.C920080a3C;
import X.C920160a3K;
import X.C920170a3L;
import X.C922840a7e;
import X.C930480aJy;
import X.C935540aS8;
import X.C938970aXf;
import X.EnumC1990907r1;
import X.InterfaceC920110a3F;
import X.InterfaceC937900aVw;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class AwS55S1300000_15 extends C09AY implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        String targetFilePath;
        C935540aS8 c935540aS8 = (C935540aS8) obj;
        boolean zBQ2 = ((MultiGuestSharedBgAnchorViewModel) awS55S1300000_15.l1).BQ2(true);
        String str = awS55S1300000_15.s0;
        String strLLJLLIL = ((LiveEffect) awS55S1300000_15.l2).LLJLLIL();
        DownloadInfo downloadInfo = (DownloadInfo) awS55S1300000_15.l3;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        return C935540aS8.LIZ(c935540aS8, false, zBQ2, str, strLLJLLIL, targetFilePath, false, 67);
    }

    public static final Object invoke$1(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        String strLIZLLL = C771370UNr.LIZLLL((C207209166l) awS55S1300000_15.l1);
        ((LiveEffect) awS55S1300000_15.l2).LJJLIL(true);
        ((LiveEffect) awS55S1300000_15.l2).LJLILLLLZI(false);
        ((LiveEffect) awS55S1300000_15.l2).LJJJJL(strLIZLLL);
        C403501hZ.LIZ(new AwS57S2100000_15((C938970aXf) awS55S1300000_15.l3, awS55S1300000_15.s0, strLIZLLL, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS55S1300000_15.l1;
        enlargeScreenManageParams.scene = 7;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(obj);
        ((C920170a3L) awS55S1300000_15.l2).LJIILJJIL(awS55S1300000_15.s0, (EnlargeScreenManageParams) awS55S1300000_15.l1, (InterfaceC920110a3F) awS55S1300000_15.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS55S1300000_15.l1;
        enlargeScreenManageParams.scene = 7;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(obj);
        ((C920160a3K) awS55S1300000_15.l2).LJIILJJIL(awS55S1300000_15.s0, (EnlargeScreenManageParams) awS55S1300000_15.l1, (InterfaceC920110a3F) awS55S1300000_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        PosIdentity posIdentity = (PosIdentity) obj;
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS55S1300000_15.l1;
        enlargeScreenManageParams.scene = 7;
        boolean z = true;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(posIdentity);
        ((C920060a3A) awS55S1300000_15.l2).LJJIJ(awS55S1300000_15.s0, (EnlargeScreenManageParams) awS55S1300000_15.l1, (InterfaceC920110a3F) awS55S1300000_15.l3);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS55S1300000_15.s0;
        if (posIdentity.type != 2) {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        Layout layout = (Layout) obj;
        C919770a2h c919770a2h = (C919770a2h) awS55S1300000_15.l1;
        c919770a2h.LIZIZ = layout;
        c919770a2h.LIZLLL = layout;
        DataChannel dataChannel = c919770a2h.LIZ;
        if (dataChannel != null) {
            String str = awS55S1300000_15.s0;
            String str2 = c919770a2h.LJ;
            EnumC1990907r1 enumC1990907r1 = EnumC1990907r1.ZOOM_MAX;
            C00IS c00is = C00IS.SOURCE_SEI;
            C930480aJy.LIZ.getClass();
            dataChannel.LC0(LinkGuestZoomEvent.class, new C922840a7e(str, str2, enumC1990907r1, c00is, 2, C930480aJy.LJIIIZ()));
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        AbstractC919790a2j.LJIIJJI.getClass();
        c1143300frELJIIJJI.LJII(AbstractC919790a2j.LJIJI, C2097608Jq.LJIIJ(new Pair("action", "loadZoomDataFromSei"), new Pair("linkMicId", ((SeiAppData) awS55S1300000_15.l2).toString())));
        int iLJIILLIIL = ((C919770a2h) awS55S1300000_15.l1).LJIILLIIL((InterfaceC937900aVw) awS55S1300000_15.l3, awS55S1300000_15.s0);
        C919770a2h c919770a2h2 = (C919770a2h) awS55S1300000_15.l1;
        AbstractC919790a2j.LJJIIZI(c919770a2h2, awS55S1300000_15.s0, c919770a2h2.LJII(), iLJIILLIIL, 0, (InterfaceC937900aVw) awS55S1300000_15.l3, null, 32);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS55S1300000_15 awS55S1300000_15, Object obj) {
        PosIdentity posIdentity = (PosIdentity) obj;
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS55S1300000_15.l1;
        enlargeScreenManageParams.scene = 7;
        boolean z = true;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(posIdentity);
        ((C920070a3B) awS55S1300000_15.l2).LJJIIJ(awS55S1300000_15.s0, (EnlargeScreenManageParams) awS55S1300000_15.l1, (InterfaceC920110a3F) awS55S1300000_15.l3);
        long jLJI = C01HE.LJI(posIdentity.value);
        String str = awS55S1300000_15.s0;
        if (posIdentity.type != 2) {
            z = false;
        }
        C915850ZwN.LJIIIZ(jLJI, str, false, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(C919770a2h c919770a2h, String str, SeiAppData seiAppData, InterfaceC937900aVw interfaceC937900aVw, int i) {
        super(1);
        this.$t = i;
        this.l1 = c919770a2h;
        this.s0 = str;
        this.l2 = seiAppData;
        this.l3 = interfaceC937900aVw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(C920060a3A c920060a3A, InterfaceC920110a3F interfaceC920110a3F, EnlargeScreenManageParams enlargeScreenManageParams, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920060a3A;
        this.s0 = str;
        this.l3 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(InterfaceC920110a3F interfaceC920110a3F, C920070a3B c920070a3B, EnlargeScreenManageParams enlargeScreenManageParams, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920070a3B;
        this.s0 = str;
        this.l3 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(C207209166l c207209166l, LiveEffect liveEffect, C938970aXf c938970aXf, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c207209166l;
        this.l2 = liveEffect;
        this.l3 = c938970aXf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str, LiveEffect liveEffect, DownloadInfo downloadInfo, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestSharedBgAnchorViewModel;
        this.s0 = str;
        this.l2 = liveEffect;
        this.l3 = downloadInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920160a3K c920160a3K, String str, C920080a3C c920080a3C, int i) {
        super(1);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920160a3K;
        this.s0 = str;
        this.l3 = c920080a3C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920170a3L c920170a3L, String str, C920080a3C c920080a3C, int i) {
        super(1);
        this.$t = i;
        this.l1 = enlargeScreenManageParams;
        this.l2 = c920170a3L;
        this.s0 = str;
        this.l3 = c920080a3C;
    }
}
