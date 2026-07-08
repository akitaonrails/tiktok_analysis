package kotlin.jvm.internal;

import X.1JLc;
import X.C09AY;
import X.C0TEO;
import X.C0TH2;
import X.C0THL;
import X.C0U5B;
import X.C0UH7;
import X.C0UHO;
import X.C20743716Ff;
import X.C21657819pQ;
import X.C249600xq;
import X.C259800zU;
import X.C499640Jic;
import X.C743540TEq;
import X.EnumC776090UcR;
import X.InterfaceC781800Ule;
import android.content.Intent;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS138S0201000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS138S0201000_12 r7) {
        /*
            int r1 = r7.i2
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L98
            r0 = 3
            if (r1 == r0) goto L8a
            r0 = 4
            if (r1 == r0) goto L5b
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LLIZLLLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LL = r0
        L1b:
            return r3
        L1c:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L4d
            X.0U78 r3 = r0.wQ2()
            if (r3 == 0) goto L4d
            java.lang.Object r2 = r7.l1
            X.0UHO r2 = (X.C0UHO) r2
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r1 = (com.bytedance.android.live.effect.api.IEffectService) r1
            X.0UHP r0 = r2.LIZ
            com.bytedance.android.livesdk.ui.BaseFragment r3 = r1.getMultiGuestEffectFragment(r3, r0)
            if (r3 == 0) goto L4d
        L3e:
            boolean r0 = r3 instanceof com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            if (r0 == 0) goto L1b
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "fragment should be LiveMultiGuestEffectFragment, not MultiGuestBeautyLevelAdjustFragment"
            X.C1CC2.LIZ(r0, r1)
            return r3
        L4d:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LLIZLLLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LL = r0
            goto L3e
        L5b:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r6 = r0.LLIZLLLIL
            android.widget.FrameLayout r5 = r0.LLJ
            int r4 = r0.LLJILJIL
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = r0.LLJJIJIL
            X.0a9J r1 = r0.LLJJJIL
            boolean r0 = r0.LLJJJJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestNewPropsPageFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestNewPropsPageFragment
            r3.<init>()
            r3.LL = r6
            r3.LLILLJJLI = r5
            r3.LLILLL = r4
            r3.LLILZ = r2
            r3.LLILZIL = r1
            r3.LLILZLL = r0
            java.lang.Object r2 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r2 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r2
            kotlin.jvm.internal.AwS556S0100000_12 r1 = new kotlin.jvm.internal.AwS556S0100000_12
            r0 = 71
            r1.<init>(r2, r0)
            r3.LLIZ = r1
            return r3
        L8a:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LLIZLLLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment
            r3.<init>()
            r3.LLILLL = r0
            return r3
        L98:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LLIZLLLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LL = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS138S0201000_12.invoke$0(kotlin.jvm.internal.AwS138S0201000_12):java.lang.Object");
    }

    public static final Object invoke$1(AwS138S0201000_12 awS138S0201000_12) {
        String eventKey;
        C20743716Ff c20743716Ff;
        C499640Jic c499640JicLJJIIZ;
        if (((LiveHostSettingFragmentSheet) awS138S0201000_12.l0).LLLII.add(Integer.valueOf(awS138S0201000_12.i2))) {
            C0UH7 c0uh7 = EnumC776090UcR.Companion;
            int i = awS138S0201000_12.i2;
            c0uh7.getClass();
            EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
            if (enumC776090UcRLIZ == null || (eventKey = enumC776090UcRLIZ.getEventKey()) == null) {
                eventKey = "";
            }
            LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) awS138S0201000_12.l0;
            String str = liveHostSettingFragmentSheet.LLLIZZ;
            DataChannel dataChannel = liveHostSettingFragmentSheet.LLJZ;
            InterfaceC781800Ule interfaceC781800Ule = (InterfaceC781800Ule) ((C259800zU) awS138S0201000_12.l1).element;
            if (interfaceC781800Ule != null && (c499640JicLJJIIZ = interfaceC781800Ule.LJJIIZ()) != null) {
                c20743716Ff = c499640JicLJJIIZ.LJI;
            } else {
                c20743716Ff = null;
            }
            C249600xq.LIZ("show", eventKey, str, dataChannel, c20743716Ff);
        }
        C21657819pQ c21657819pQRemove = ((LiveHostSettingFragmentSheet) awS138S0201000_12.l0).LLLIIII.remove(Integer.valueOf(awS138S0201000_12.i2));
        if (c21657819pQRemove != null) {
            c21657819pQRemove.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS138S0201000_12 awS138S0201000_12) {
        C0THL c0thl = GameCast.LIZJ;
        if (c0thl != null) {
            c0thl.LJFF(awS138S0201000_12.i2, (Intent) awS138S0201000_12.l0);
        }
        C0THL c0thl2 = GameCast.LIZJ;
        if (c0thl2 != null && c0thl2.LIZLLL != null) {
            GameCast gameCast = GameCast.LIZ;
            GameCast.LJIILJJIL((ServiceInfo) awS138S0201000_12.l1);
        } else {
            DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.ERROR);
            C743540TEq.LJJIIJ(true, 10092, 0, "media projection is null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS138S0201000_12 awS138S0201000_12) {
        C0U5B c0u5b = (C0U5B) awS138S0201000_12.l0;
        if (c0u5b != null) {
            c0u5b.LLLIL(awS138S0201000_12.i2, (LiveEffect) awS138S0201000_12.l1);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AwS138S0201000_12 awS138S0201000_12) {
        1JLc r4 = ((C0TEO) awS138S0201000_12.l0).LIZJ;
        if (r4 != null) {
            r4.LJIIIZ(awS138S0201000_12.i2, new Object[]{awS138S0201000_12.l1});
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0201000_12(int i, Intent intent, ServiceInfo serviceInfo, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = intent;
        this.l1 = serviceInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0201000_12(int i, MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment, C0UHO c0uho, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = multiGuestEffectSwitchFragment;
        this.l1 = c0uho;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0201000_12(int i, LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, C259800zU c259800zU, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = liveHostSettingFragmentSheet;
        this.i2 = i;
        this.l1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0201000_12(C0TEO c0teo, int i, Object obj, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0teo;
        this.i2 = i;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0201000_12(C0U5B c0u5b, LiveEffect liveEffect, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0u5b;
        this.l1 = liveEffect;
        this.i2 = i;
    }
}
