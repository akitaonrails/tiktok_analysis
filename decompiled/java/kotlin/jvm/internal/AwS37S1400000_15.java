package kotlin.jvm.internal;

import X.C09AY;
import X.C12ES;
import X.C1324720kZq;
import X.C786410Ut5;
import X.C930540aK4;
import X.C933980aPc;
import X.C940400aZy;
import X.C940450aa3;
import X.C941290abP;
import X.C944860ahA;
import X.C956380azk;
import X.C958040b2Q;
import X.C958090b2V;
import X.C981480beE;
import X.EnumC940090aZT;
import X.EnumC943790afR;
import X.InterfaceC954180awC;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSwitchTurnEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS37S1400000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS37S1400000_15 awS37S1400000_15) {
        ((InterfaceC954180awC) awS37S1400000_15.l1).LLJJ().LJJJJJ((List) awS37S1400000_15.l2, null);
        C958040b2Q.LJIILIIL(awS37S1400000_15.s0, (C981480beE) awS37S1400000_15.l4);
        DataChannel dataChannel = (DataChannel) awS37S1400000_15.l3;
        if (dataChannel != null) {
            dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(8, "switch_to_normal"));
        }
        DataChannel dataChannel2 = (DataChannel) awS37S1400000_15.l3;
        if (dataChannel2 != null) {
            dataChannel2.zW(TakeStageSwitchTurnEvent.class, new C958090b2V());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[PHI: r3
      0x0080: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:11:0x005a, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS37S1400000_15 r5) {
        /*
            java.lang.Object r0 = r5.l1
            X.0ahA r0 = (X.C944860ahA) r0
            r0.getClass()
            java.lang.String r1 = "ToolbarCoHostBehavior"
            java.lang.String r0 = "online friend prompt was blocked by display strategy"
            X.C20441214yg.LIZIZ(r1, r0)
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC960800b6s.LLLLIIL
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            boolean r0 = X.C958370b2x.LIZJ()
            if (r0 == 0) goto L7b
            java.lang.Object r3 = r5.l1
            X.0ahA r3 = (X.C944860ahA) r3
            java.lang.Object r2 = r5.l2
            com.bytedance.android.live.base.model.user.User r2 = (com.bytedance.android.live.base.model.user.User) r2
            java.lang.Object r1 = r5.l3
            X.0afR r1 = (X.EnumC943790afR) r1
            java.lang.String r0 = r5.s0
            r3.LJIIJ(r2, r1, r0)
            java.lang.Object r1 = r5.l1
            X.0ahA r1 = (X.C944860ahA) r1
            int r0 = r1.LLLIIL
            int r0 = r0 + 1
            r1.LLLIIL = r0
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            java.lang.String r4 = ""
            if (r2 == 0) goto L59
            long r0 = r2.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L80
        L59:
            r3 = r4
            if (r2 != 0) goto L80
        L5c:
            java.lang.Object r0 = r5.l4
            com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage r0 = (com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            r2 = 0
            if (r0 == 0) goto L7e
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L6d:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_icon"
            X.C925600aC6.LJJ(r3, r4, r0, r2, r1)
            java.lang.String r0 = "online_friend_icon"
            X.C925600aC6.LJIIIIZZ(r0)
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            r0 = r2
            goto L6d
        L80:
            java.lang.String r4 = r2.getIdStr()
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S1400000_15.invoke$1(kotlin.jvm.internal.AwS37S1400000_15):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS37S1400000_15 awS37S1400000_15) {
        SimpleLiveTextView simpleLiveTextView;
        LiveIconView liveIconView;
        C1324720kZq c1324720kZq;
        ViewGroup viewGroup;
        View viewFindViewById;
        C786410Ut5.LJJJJI((ViewGroup) awS37S1400000_15.l1);
        int width = (int) (((ViewGroup) awS37S1400000_15.l1).getWidth() * C933980aPc.LIZJ(awS37S1400000_15.s0));
        ViewGroup viewGroup2 = ((C940400aZy) awS37S1400000_15.l2).LL;
        if (viewGroup2 != null && (viewFindViewById = viewGroup2.findViewById(R.id.qt3)) != null) {
            C933980aPc.LJIIZILJ(width, width, viewFindViewById);
        }
        int i = ((C940400aZy) awS37S1400000_15.l2).LLIZ;
        if ((i != 2 && i != 3) || ((C940450aa3) awS37S1400000_15.l3).LIZ == EnumC940090aZT.SEARCH) {
            ((C940400aZy) awS37S1400000_15.l2).LJIIIZ((ImageModel) awS37S1400000_15.l4);
        }
        if (((C940450aa3) awS37S1400000_15.l3).LIZ == EnumC940090aZT.FEED) {
            C940400aZy c940400aZy = (C940400aZy) awS37S1400000_15.l2;
            ViewGroup viewGroup3 = (ViewGroup) awS37S1400000_15.l1;
            ViewGroup viewGroup4 = c940400aZy.LL;
            if (viewGroup4 != null && (viewGroup = (ViewGroup) viewGroup4.findViewById(R.id.gvn)) != null) {
                viewGroup.setClipChildren(false);
            }
            ViewGroup viewGroup5 = c940400aZy.LL;
            if (viewGroup5 != null && (c1324720kZq = (C1324720kZq) viewGroup5.findViewById(R.id.pnc)) != null) {
                C933980aPc.LJIILLIIL(c1324720kZq, viewGroup3, width);
                C12ES.LJIILL(0, c1324720kZq);
                c940400aZy.LLIZLLLIL = new C941290abP(c1324720kZq, true, 12);
            }
        }
        ViewGroup viewGroup6 = ((C940400aZy) awS37S1400000_15.l2).LL;
        if (viewGroup6 != null && (liveIconView = (LiveIconView) viewGroup6.findViewById(R.id.pn3)) != null) {
            int i2 = (int) (width * 0.3125f);
            C933980aPc.LJIIZILJ(i2, i2, liveIconView);
            liveIconView.setIconHeightRatio(0.6f);
            liveIconView.setIconWidthRatio(0.6f);
        }
        float width2 = ((ViewGroup) awS37S1400000_15.l1).getWidth() * 0.8f;
        ViewGroup viewGroup7 = ((C940400aZy) awS37S1400000_15.l2).LL;
        if (viewGroup7 != null && (simpleLiveTextView = (SimpleLiveTextView) viewGroup7.findViewById(R.id.p9_)) != null) {
            simpleLiveTextView.setMaxWidth((int) width2);
        }
        ViewGroup viewGroup8 = ((C940400aZy) awS37S1400000_15.l2).LL;
        if (viewGroup8 != null) {
            C930540aK4.LJJIL(-1, viewGroup8, (ViewGroup) awS37S1400000_15.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1400000_15(C944860ahA c944860ahA, User user, EnumC943790afR enumC943790afR, String str, LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, int i) {
        super(0);
        this.$t = i;
        this.l1 = c944860ahA;
        this.l2 = user;
        this.l3 = enumC943790afR;
        this.s0 = str;
        this.l4 = linkMicAnchorGuideMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S1400000_15(InterfaceC954180awC interfaceC954180awC, InterfaceC954180awC interfaceC954180awC2, List<LinkUser> list, String str, DataChannel dataChannel, C981480beE c981480beE) {
        super(0);
        this.$t = c981480beE;
        this.l1 = interfaceC954180awC;
        this.l2 = interfaceC954180awC2;
        this.s0 = list;
        this.l3 = str;
        this.l4 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1400000_15(ViewGroup viewGroup, String str, C940400aZy c940400aZy, C940450aa3 c940450aa3, ImageModel imageModel, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewGroup;
        this.s0 = str;
        this.l2 = c940400aZy;
        this.l3 = c940450aa3;
        this.l4 = imageModel;
    }
}
