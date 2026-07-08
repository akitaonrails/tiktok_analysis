package kotlin.jvm.internal;

import X.C09AY;
import X.C0UA1;
import X.C0UC5;
import X.C0UCF;
import X.C0UEH;
import X.C474500IjA;
import X.C924790aAn;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS63S1000000_12 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S1000000_12(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS63S1000000_12 r8, java.lang.Object r9) {
        /*
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r9 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r9
            java.util.Map<java.lang.Long, com.bytedance.android.live.broadcast.model.PushStreamInfo> r2 = r9.pushStreamInfoMap
            r5 = 0
            if (r2 == 0) goto L5d
            r0 = 4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r2.get(r0)
            com.bytedance.android.live.broadcast.model.PushStreamInfo r1 = (com.bytedance.android.live.broadcast.model.PushStreamInfo) r1
        L13:
            com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting r0 = com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L54
            X.0jXh r0 = X.C19370910qR.LIZ
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, com.bytedance.android.live.broadcast.model.PushStreamInfo$QualityList> r0 = r1.multiQualities
        L21:
            java.util.List r7 = X.C19370910qR.LJ(r0)
            if (r1 == 0) goto L29
            java.util.Map<java.lang.String, com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality> r5 = r1.multiDefaultQualities
        L29:
            com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality r5 = X.C19370910qR.LIZJ(r5)
        L2d:
            r4 = 0
            r3 = 1
            if (r7 == 0) goto L66
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()
            com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality r0 = (com.bytedance.android.live.broadcast.model.PushStreamInfo.Quality) r0
            java.lang.String r0 = r0.sdkKey
            r2.add(r0)
            goto L40
        L52:
            r0 = r5
            goto L21
        L54:
            if (r1 == 0) goto L5b
            java.util.List<com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality> r7 = r1.qualityList
            com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality r5 = r1.defaultQuality
            goto L2d
        L5b:
            r7 = r5
            goto L2d
        L5d:
            r1 = r5
            goto L13
        L5f:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKb> r0 = X.C930870aKb.class
            r1.JQ2(r0, r2)
        L66:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality r6 = r0.WG1()
            if (r6 == 0) goto L9e
            if (r7 == 0) goto L9e
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L9e
            java.util.Iterator r2 = r7.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r2.next()
            com.bytedance.android.live.broadcast.model.PushStreamInfo$Quality r0 = (com.bytedance.android.live.broadcast.model.PushStreamInfo.Quality) r0
            java.lang.String r1 = r0.sdkKey
            java.lang.String r0 = r6.sdkKey
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L80
            java.lang.String r0 = r8.s0
            X.C501080Jkw.LIZ(r6, r3, r0)
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9e:
            if (r5 == 0) goto L9b
            java.lang.String r0 = r8.s0
            X.C501080Jkw.LIZ(r5, r4, r0)
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS63S1000000_12.invoke$0(kotlin.jvm.internal.AwS63S1000000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS63S1000000_12 awS63S1000000_12, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        C924790aAn.LIZLLL().LJFF = liveEffect;
        C0UC5.LIZ.LJ(liveEffect, C0UEH.LIZIZ, 0, awS63S1000000_12.s0);
        DataChannel dataChannel = C0UEH.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestSelectedStickerEvent.class, new C0UCF(liveEffect, "liveinteract", "", false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS63S1000000_12 awS63S1000000_12, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        String str = awS63S1000000_12.s0;
        if (liveEffect != null) {
            C0UEH.LJFF(liveEffect, C0UA1.LIZ(), new AwS126S1100000_12(liveEffect, str, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS63S1000000_12 awS63S1000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII(awS63S1000000_12.s0, "features");
        return c474500IjA;
    }

    public static final Object invoke$4(AwS63S1000000_12 awS63S1000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII(awS63S1000000_12.s0, "features");
        return c474500IjA;
    }
}
