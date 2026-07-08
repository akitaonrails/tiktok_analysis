package kotlin.jvm.internal;

import X.C09AY;
import X.C1123800fLm;
import X.C1124780fNM;
import X.C1147020fxE;
import X.C1161920gLG;
import X.C495520Jby;
import X.C963140bAe;
import X.EnumC1142190fpR;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCollaborativeSparkUrlSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS2S1200200_17 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S1200200_17 awS2S1200200_17) {
        if (((Gift) awS2S1200200_17.l1) != null) {
            C1124780fNM c1124780fNM = (C1124780fNM) awS2S1200200_17.l2;
            long j = awS2S1200200_17.j3;
            String str = awS2S1200200_17.s0;
            long j2 = awS2S1200200_17.j4;
            C495520Jby c495520Jby = new C495520Jby(LiveGiftCollaborativeSparkUrlSetting.INSTANCE.getUrl());
            c495520Jby.LIZJ("enter_from", "gift_panel_banner");
            c495520Jby.LIZIZ(C963140bAe.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "time_diff_sec");
            c495520Jby.LIZJ("trigger_gift_id", String.valueOf(j2));
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c1124780fNM.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
            C1123800fLm.LIZJ(j, null, null, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1200200_17 awS2S1200200_17) {
        ((IMusicGiftService) awS2S1200200_17.l1).HJ0(new C1147020fxE(awS2S1200200_17.j3, 0L, awS2S1200200_17.j4, 0L, EnumC1142190fpR.MUSIC_GUIDE, awS2S1200200_17.s0, null, 0L, 0, null, 970), (DataChannel) awS2S1200200_17.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1200200_17(IMusicGiftService iMusicGiftService, DataChannel dataChannel, long j, long j2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = iMusicGiftService;
        this.l2 = dataChannel;
        this.j3 = j;
        this.j4 = j2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1200200_17(Gift gift, C1124780fNM c1124780fNM, long j, String str, long j2, int i) {
        super(0);
        this.$t = i;
        this.l1 = gift;
        this.l2 = c1124780fNM;
        this.j3 = j;
        this.s0 = str;
        this.j4 = j2;
    }
}
