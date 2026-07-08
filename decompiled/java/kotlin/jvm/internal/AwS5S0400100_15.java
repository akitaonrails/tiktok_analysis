package kotlin.jvm.internal;

import X.C09AY;
import X.C919690a2Z;
import X.C925080aBG;
import X.C930540aK4;
import X.C948450amx;
import X.InterfaceC923600a8s;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS5S0400100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS5S0400100_15 awS5S0400100_15, Object obj) {
        ((Number) obj).intValue();
        ((KaraokeGuestViewModel) awS5S0400100_15.l0).vQ2((InterfaceC923600a8s) awS5S0400100_15.l1, awS5S0400100_15.j4, (Function1) awS5S0400100_15.l2, (Function1) awS5S0400100_15.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0400100_15 awS5S0400100_15, Object obj) {
        Long l;
        ((Boolean) obj).booleanValue();
        KaraokeGuestViewModel karaokeGuestViewModel = (KaraokeGuestViewModel) awS5S0400100_15.l0;
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) awS5S0400100_15.l1;
        long j = awS5S0400100_15.j4;
        Function1 function1 = (Function1) awS5S0400100_15.l2;
        Function1 function12 = (Function1) awS5S0400100_15.l3;
        karaokeGuestViewModel.getClass();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ == null) {
            if (function12 != null) {
                function12.invoke(new Throwable("getCurrentRoom is null"));
            }
        } else {
            boolean z = C925080aBG.LIZ;
            DataChannel dataChannel = karaokeGuestViewModel.LL;
            AwS7S1400100_15 awS7S1400100_15 = new AwS7S1400100_15(interfaceC923600a8s, karaokeGuestViewModel, function12, j, function1, 1);
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(function12, (Function1<? super Throwable, Unit>) 1180);
            C948450amx c948450amx = C948450amx.LIZIZ;
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (C925080aBG.LJI()) {
                MultiLiveUserSettings multiLiveUserSettings = roomLJIIIZ.multiLiveUserSettings;
                if (multiLiveUserSettings != null && multiLiveUserSettings.isMultiGuestPermissionInfoAudienceSideNotNull()) {
                    MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                    String str = null;
                    if (multiGuestDataHolder2 != null) {
                        l = multiGuestDataHolder2.LJJL;
                        str = multiGuestDataHolder2.LJJLI;
                    } else {
                        l = null;
                    }
                    C919690a2Z c919690a2Z = new C919690a2Z(0, l, str);
                    if (interfaceC923600a8s != null) {
                        interfaceC923600a8s.tF2(c919690a2Z);
                    }
                    awS559S0100000_15.invoke();
                } else {
                    C925080aBG.LIZLLL(roomLJIIIZ, dataChannel, interfaceC923600a8s, 0, false, null, awS559S0100000_15, new AwS451S0200000_15((MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER"), awS7S1400100_15, 23), null);
                }
            } else if (multiGuestDataHolder != null) {
                awS7S1400100_15.invoke(Integer.valueOf(multiGuestDataHolder.LJJJLL));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS5S0400100_15 r10, java.lang.Object r11) {
        /*
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            java.lang.Object r5 = r10.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel r5 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel) r5
            java.lang.Object r6 = r10.l1
            X.0a8s r6 = (X.InterfaceC923600a8s) r6
            long r7 = r10.j4
            java.lang.Object r9 = r10.l2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r10.l3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r5.getClass()
            boolean r0 = X.C925150aBN.LJJIII()
            r3 = 1
            if (r0 == 0) goto L68
            boolean r0 = X.C925150aBN.LJJJJIZL()
            if (r0 == 0) goto L9d
        L27:
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog r0 = r5.LLILLJJLI
            if (r0 != 0) goto L39
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel$showFollowGuideDialog$1 r4 = new com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel$showFollowGuideDialog$1
            r4.<init>()
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog r0 = new com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog
            r0.<init>()
            r0.LLILLJJLI = r4
            r5.LLILLJJLI = r0
        L39:
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog r0 = r5.LLILLJJLI
            if (r0 == 0) goto L52
            boolean r0 = r0.isShowing()
            if (r0 != r3) goto L52
            if (r10 == 0) goto L4f
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "follow failed, follow dialog is showing"
            r1.<init>(r0)
            r10.invoke(r1)
        L4f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LL
            java.lang.Class<X.0TZe> r0 = X.C748880TZe.class
            java.lang.Object r2 = r1.gg0(r0)
            androidx.fragment.app.FragmentManager r2 = (androidx.fragment.app.FragmentManager) r2
            if (r2 == 0) goto L4f
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog r1 = r5.LLILLJJLI
            if (r1 == 0) goto L4f
            java.lang.String r0 = "KaraokeGuestViewModel_follow"
            X.C492400JSs.LIZ(r1, r2, r0)
            goto L4f
        L68:
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r1 = X.C925150aBN.LJFF()
            boolean r0 = X.C925150aBN.LJJIZ(r1)
            if (r0 == 0) goto L9d
            boolean r0 = X.C925150aBN.LJJIJIIJIL(r1)
            if (r0 == 0) goto L9d
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = X.C930540aK4.LJIIIZ()
            if (r4 == 0) goto L27
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            long r0 = r0.getFollowStatus()
            int r2 = (int) r0
            if (r2 == r3) goto L9d
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            long r0 = r0.getFollowStatus()
            int r2 = (int) r0
            r0 = 2
            if (r2 != r0) goto L27
        L9d:
            r5.wQ2(r6, r7, r9, r10)
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S0400100_15.invoke$2(kotlin.jvm.internal.AwS5S0400100_15, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS5S0400100_15) (LINE:100663305) kotlin.jvm.internal.AwS5S0400100_15.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS5S0400100_15(KaraokeGuestViewModel karaokeGuestViewModel, KaraokeGuestViewModel karaokeGuestViewModel2, InterfaceC923600a8s interfaceC923600a8s, long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Object obj;
        super(1);
        this.$t = function12;
        this.l0 = karaokeGuestViewModel;
        this.l1 = karaokeGuestViewModel2;
        this.j4 = interfaceC923600a8s;
        this.l2 = obj;
        this.l3 = function1;
    }
}
