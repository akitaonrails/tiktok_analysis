package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.AbstractC472460Ifs;
import X.C0GSX;
import X.C0IJT;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C1834150xpV;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C21569819bE;
import X.C472490Ifv;
import X.C472610Ig7;
import X.C472630Ig9;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC21569519bB;
import X.EnumC471790Ien;
import X.InterfaceC472640IgA;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.NearbyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomDoubleViewHolder extends LiveRoomViewHolder {
    public static final /* synthetic */ int LLJLLL = 0;
    public final InterfaceC472640IgA LLJJJIL;
    public final LifecycleOwner LLJJJJ;
    public final View LLJJJJJIL;
    public final C1324720kZq LLJJJJLIIL;
    public final C1324720kZq LLJJL;
    public final C0GSX LLJJLIIIJLLLLLLLZ;
    public final C1324720kZq LLJL;
    public final C16F5 LLJLIL;
    public final C16F5 LLJLILLLLZIIL;
    public final C16F5 LLJLL;
    public final C472630Ig9 LLJLLIL;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder
    public final void V5() {
        NearbyInfo nearbyInfo;
        NearbyInfo nearbyInfo2;
        Room room = this.LLJ;
        if (TextUtils.isEmpty((room == null || (nearbyInfo2 = room.nearbyInfo) == null) ? null : nearbyInfo2.label)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_nearby_server_skylight_label");
        Room room2 = this.LLJ;
        c474500IjALIZ.LJJII((room2 == null || (nearbyInfo = room2.nearbyInfo) == null) ? null : nearbyInfo.label, "show_label");
        Room room3 = this.LLJ;
        c474500IjALIZ.LJJII(room3 != null ? Long.valueOf(room3.getOwnerUserId()) : null, "anchor_id");
        Room room4 = this.LLJ;
        c474500IjALIZ.LJJII(room4 != null ? Long.valueOf(room4.getId()) : null, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    public final boolean X5() {
        return (this.LLIZ instanceof C472490Ifv) && TopLiveSkylightNearbyStyle.INSTANCE.invoke().getShowLocation() && this.LLIZLLLIL != EnumC471790Ien.NEARBY;
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
        this.LLJL.clearAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.bytedance.android.livesdk.model.FeedItem r15, com.bytedance.android.live.base.model.feed.FeedExtra r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder.I5(com.bytedance.android.livesdk.model.FeedItem, com.bytedance.android.live.base.model.feed.FeedExtra, java.lang.String, int):void");
    }

    public LiveRoomDoubleViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs, InterfaceC472640IgA interfaceC472640IgA, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner) {
        C21569819bE c21569819bE;
        super(view, abstractC472460Ifs, lifecycleOwner, enumC471790Ien);
        this.LLJJJIL = interfaceC472640IgA;
        this.LLJJJJ = lifecycleOwner;
        this.LLJJJJJIL = view.findViewById(R.id.g_r);
        this.LLJJJJLIIL = (C1324720kZq) view.findViewById(R.id.ldr);
        this.LLJJL = (C1324720kZq) view.findViewById(R.id.ldd);
        this.LLJJLIIIJLLLLLLLZ = (C0GSX) view.findViewById(R.id.mtu);
        this.LLJL = (C1324720kZq) view.findViewById(R.id.mts);
        this.LLJLIL = (C16F5) view.findViewById(R.id.zym);
        this.LLJLILLLLZIIL = (C16F5) view.findViewById(R.id.tv_plus);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.n7c);
        this.LLJLL = c16f5;
        if (S5()) {
            C21569819bE c21569819bE2 = (C21569819bE) view.findViewById(R.id.n9n);
            this.LLJJI = c21569819bE2;
            if (c21569819bE2 != null) {
                c21569819bE2.LIZJ(EnumC21569519bB.LIVE_TOPLIVE_SKY_LIVING_ICON_NEW);
            }
            C21569819bE c21569819bE3 = this.LLJJI;
            if (c21569819bE3 != null) {
                c21569819bE3.setOuterCircleColors(-16777216);
            }
            if (C472610Ig7.LIZ() > 0 && (c21569819bE = this.LLJJI) != null) {
                c21569819bE.setRenderInterval(C472610Ig7.LIZ());
            }
            C500260Jjc.LLFFF(this.LLJJI);
        }
        if (X5()) {
            if (c16f5 != null) {
                Context context = c16f5.getContext();
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e2h, context);
                c16f5.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(2.0f));
                if (c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezt, C1834150xpV.LJII(context)));
                    c20743516FdLIZLLL.setBounds(0, (int) C497740JfY.LIZIZ(0.0f), (int) C497740JfY.LIZIZ(10.0f), (int) C497740JfY.LIZIZ(10.0f));
                }
                c16f5.setCompoundDrawablesRelative(c20743516FdLIZLLL, null, null, null);
                C786410Ut5.LLJJJJ(c16f5, 4);
            }
        } else if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        if (LiveSkylightStyleSetting.INSTANCE.getValue().showFollowBtn && enumC471790Ien != EnumC471790Ien.NEARBY) {
            C472630Ig9 c472630Ig9 = new C472630Ig9(view, interfaceC472640IgA);
            c472630Ig9.LIZIZ();
            this.LLJLLIL = c472630Ig9;
        }
    }
}
