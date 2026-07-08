package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.AbstractC472460Ifs;
import X.C01GW;
import X.C098200Yq;
import X.C0IUA;
import X.C0IVW;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C123100dR;
import X.C1324720kZq;
import X.C189200o6;
import X.C19748512Ol;
import X.C21569819bE;
import X.C452501pT;
import X.C472450Ifr;
import X.C472490Ifv;
import X.C500260Jjc;
import X.C930940aKi;
import X.EnumC471790Ien;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LiveRoomViewHolder extends DrawerFollowingViewHolder {
    public static final C01GW<Integer> LLJJJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(44));
    public final AbstractC472460Ifs LLIZ;
    public final EnumC471790Ien LLIZLLLIL;
    public Room LLJ;
    public FeedItem LLJI;
    public int LLJIJIL;
    public DrawerSmallLiveViewHolder.LogExtraData LLJILJIL;
    public DrawerSmallLiveViewHolder.LogExtraData LLJILJILJ;
    public C1143920fsE LLJILLL;
    public boolean LLJJ;
    public C21569819bE LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public void V5() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5() {
        /*
            r4 = this;
            android.view.View r0 = r4.itemView
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L8a
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLJ
            if (r0 == 0) goto L8a
            com.bytedance.android.livesdk.model.FeedItem r0 = r4.LLJI
            if (r0 == 0) goto L8a
            boolean r0 = r4.LLILLJJLI
            if (r0 != 0) goto L8a
            boolean r0 = r4.LL
            if (r0 == 0) goto L8a
            r3 = 1
            r4.LLILLJJLI = r3
            X.0IVW r2 = new X.0IVW
            android.view.View r0 = r4.itemView
            android.content.Context r0 = r0.getContext()
            com.bytedance.android.livesdk.model.FeedItem r1 = r4.LLJI
            r2.<init>(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLJ
            r2.LJ = r0
            int r0 = r4.LLJIJIL
            r2.LJI = r0
            r2.LJII = r0
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r4.LLJILJIL
            r2.LJIIJ = r0
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r4.LLJILJILJ
            r2.LJIIJJI = r0
            if (r1 == 0) goto L92
            int r1 = r1.type
            r0 = 20
            if (r1 != r0) goto L92
            r0 = 1
        L43:
            r2.LJIILIIL = r0
            X.0Ifs r0 = r4.LLIZ
            boolean r0 = r0 instanceof X.C472490Ifv
            if (r0 == 0) goto L90
            com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle r0 = com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle.INSTANCE
            com.bytedance.android.livesdk.livesetting.feed.LiveSkylightNearbyStyleConfig r0 = r0.invoke()
            boolean r0 = r0.getShowLocation()
            if (r0 == 0) goto L90
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLJ
            if (r0 == 0) goto L8e
            com.bytedance.android.livesdkapi.depend.model.live.NearbyInfo r0 = r0.nearbyInfo
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.label
        L61:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L90
        L67:
            r2.LJIIL = r3
            java.lang.String r0 = "live_cover"
            r2.LJIIZILJ = r0
            X.0Ifs r0 = r4.LLIZ
            boolean r0 = r0 instanceof X.C472490Ifv
            if (r0 == 0) goto L84
            X.0Ien r1 = r4.LLIZLLLIL
            X.0Ien r0 = X.EnumC471790Ien.NEARBY
            if (r1 != r0) goto L8b
            java.lang.String r0 = "nearby_tab_toplive_live_cover"
        L7b:
            r2.LIZLLL = r0
            java.lang.String r0 = "full_screen"
            r2.LJIJJ = r0
            W5(r2)
        L84:
            X.C0IVV.LIZJ(r2)
            r4.V5()
        L8a:
            return
        L8b:
            java.lang.String r0 = "toplive_live_cover"
            goto L7b
        L8e:
            r0 = 0
            goto L61
        L90:
            r3 = 0
            goto L67
        L92:
            r0 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder.L5():void");
    }

    public final String P5() {
        return (String) this.LLJJIJIL.getValue();
    }

    public final boolean R5() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final boolean S5() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    public final boolean T5() {
        Room room;
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 == null || (room = this.LLJ) == null || room2.getId() != room.getId()) {
            return false;
        }
        return Intrinsics.LJFF(this.LLIZ, C472490Ifv.LIZIZ);
    }

    public final void Ir() {
        if (R5()) {
            return;
        }
        C1143920fsE c1143920fsE = this.LLJILLL;
        if (c1143920fsE != null) {
            c1143920fsE.LJ();
        }
        C21569819bE c21569819bE = this.LLJJI;
        if (c21569819bE != null) {
            c21569819bE.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLJJ = true;
        if (C472450Ifr.LLJI == 0) {
            xs();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void onViewDetachedFromWindow() {
        moveToStopState();
        this.LLJJ = false;
    }

    public final void xs() {
        if (R5()) {
            return;
        }
        C1143920fsE c1143920fsE = this.LLJILLL;
        if (c1143920fsE != null) {
            c1143920fsE.LJFF();
        }
        C21569819bE c21569819bE = this.LLJJI;
        if (c21569819bE != null) {
            c21569819bE.LJFF();
        }
    }

    public static void W5(C0IVW c0ivw) {
        String str = C0IUA.LJIILLIIL;
        if (Intrinsics.LJFF(str, "homepage_bottom_live")) {
            c0ivw.LIZJ = str;
            c0ivw.LIZLLL = "live_cover";
        } else {
            if (Intrinsics.LJFF(str, "live_merge") || !C123100dR.LIZ(str)) {
                return;
            }
            c0ivw.LIZJ = "inner_flow_live_cover";
            c0ivw.LIZLLL = str;
        }
    }

    public final void N5(Room room) {
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        List<FeedRoomLabel> feedRoomLabelList = room.getFeedRoomLabelList();
        if (feedRoomLabelList != null) {
            for (FeedRoomLabel feedRoomLabel : feedRoomLabelList) {
                try {
                    long j = feedRoomLabel.location;
                    if (j == 0) {
                        this.LLJILJIL = (DrawerSmallLiveViewHolder.LogExtraData) C19748512Ol.LIZJ.LJII(feedRoomLabel.logExtra, DrawerSmallLiveViewHolder.LogExtraData.class);
                    } else if (j == 3) {
                        this.LLJILJILJ = (DrawerSmallLiveViewHolder.LogExtraData) C19748512Ol.LIZJ.LJII(feedRoomLabel.logExtra, DrawerSmallLiveViewHolder.LogExtraData.class);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public final void U5(C1324720kZq c1324720kZq) {
        boolean z;
        C1143920fsE c1143920fsE;
        C21569819bE c21569819bE;
        if (S5()) {
            C500260Jjc.LJIILIIL(c1324720kZq);
            if (!R5() && this.LLJJ && C472450Ifr.LLJI == 0 && (c21569819bE = this.LLJJI) != null) {
                c21569819bE.LJFF();
                return;
            }
            return;
        }
        C500260Jjc.LLFFF(c1324720kZq);
        boolean z2 = false;
        if (Intrinsics.LJFF(this.LLIZ, C472490Ifv.LIZIZ) && R5()) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) this.LLJJIII.getValue()).booleanValue()) {
            z2 = z;
        }
        C1143920fsE c1143920fsE2 = new C1143920fsE();
        c1143920fsE2.LJFF = z2;
        c1143920fsE2.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c1143920fsE2.LIZJ = "live_skylight_icon_anim_small_size.webp";
        c1143920fsE2.LIZ = c1324720kZq;
        c1143920fsE2.LJI = Integer.MAX_VALUE;
        c1143920fsE2.LJII = "skylight_volume";
        this.LLJILLL = c1143920fsE2;
        if (((Boolean) this.LLJJIII.getValue()).booleanValue() && (c1143920fsE = this.LLJILLL) != null) {
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.0Ig6
                @Override // X.C1143950fsH
                public final void LIZLLL() {
                    LiveRoomViewHolder liveRoomViewHolder = this.LIZ;
                    if (liveRoomViewHolder.LLJJ && C472450Ifr.LLJI == 0) {
                        liveRoomViewHolder.xs();
                    }
                }
            };
        }
        C1143680frq.LJIIIIZZ(this.LLJILLL);
    }

    public LiveRoomViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs, LifecycleOwner lifecycleOwner, EnumC471790Ien enumC471790Ien) {
        super(view, lifecycleOwner);
        this.LLIZ = abstractC472460Ifs;
        this.LLIZLLLIL = enumC471790Ien;
        this.LLJJIII = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(48));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(47));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(46));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(45));
    }
}
