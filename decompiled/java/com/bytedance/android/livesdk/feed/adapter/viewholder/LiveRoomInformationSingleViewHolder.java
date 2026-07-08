package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.AbstractC472460Ifs;
import X.C0GSX;
import X.C0KVU;
import X.C1308910kAL;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16F5;
import X.C176600m4;
import X.C1819620xS4;
import X.C21569819bE;
import X.C472610Ig7;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC21569519bB;
import X.InterfaceC468260IXw;
import X.InterfaceC472640IgA;
import Y.ACListenerS4S1301000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomInformationSingleViewHolder extends LiveRoomViewHolder {
    public static final /* synthetic */ int LLJLIL = 0;
    public final InterfaceC472640IgA LLJJJIL;
    public final View LLJJJJ;
    public final C1324720kZq LLJJJJJIL;
    public final C16F5 LLJJJJLIIL;
    public final C16F5 LLJJL;
    public final C0GSX LLJJLIIIJLLLLLLLZ;
    public final C1324720kZq LLJL;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
        this.LLJL.clearAnimation();
    }

    public LiveRoomInformationSingleViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs, InterfaceC472640IgA interfaceC472640IgA) {
        C21569819bE c21569819bE;
        super(view, abstractC472460Ifs, null, null);
        this.LLJJJIL = interfaceC472640IgA;
        this.LLJJJJ = view.findViewById(R.id.tqv);
        this.LLJJJJJIL = (C1324720kZq) view.findViewById(R.id.ld7);
        this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.zym);
        this.LLJJL = (C16F5) view.findViewById(R.id.n8e);
        this.LLJJLIIIJLLLLLLLZ = (C0GSX) view.findViewById(R.id.mtu);
        this.LLJL = (C1324720kZq) view.findViewById(R.id.mts);
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
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        int iIntValue;
        Integer numLIZJ;
        ImageModel avatarThumb;
        List urls;
        InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
        if (interfaceC468260IXw != null && (interfaceC468260IXw instanceof Room)) {
            Room room = (Room) interfaceC468260IXw;
            room.setRequestId(feedItem.resId);
            User owner = room.getOwner();
            if (owner != null && (avatarThumb = owner.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && urls.size() > 0) {
                C1324610kZf c1324610kZfLJIILIIL = C1819620xS4.LIZ().LJIILIIL(P5());
                c1324610kZfLJIILIIL.LJIJJLI((String) ListProtector.get(urls, 0), "toplive_window");
                c1324610kZfLJIILIIL.LJJI(this.LLJJJJJIL);
            }
            if (room.getOwner() != null) {
                this.LLJJJJLIIL.setText(C0KVU.LIZ(room.getOwner()));
            }
            this.LLJ = room;
            this.LLJI = feedItem;
            this.LLJIJIL = i;
            L5();
            if (TextUtils.isEmpty(room.getTitle())) {
                this.LLJJL.setText(C497740JfY.LJIJI(2131842200));
            } else {
                this.LLJJL.setText(room.getTitle());
            }
        }
        if (!S5()) {
            Context contextLIZ = C176600m4.LIZ();
            if (contextLIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5t, contextLIZ)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            C0GSX c0gsx = this.LLJJLIIIJLLLLLLLZ;
            if (c0gsx != null) {
                c0gsx.LIZ(iIntValue, iIntValue);
            }
            C0GSX c0gsx2 = this.LLJJLIIIJLLLLLLLZ;
            if (c0gsx2 != null) {
                C500260Jjc.LLFFF(c0gsx2);
            }
        } else {
            C0GSX c0gsx3 = this.LLJJLIIIJLLLLLLLZ;
            if (c0gsx3 != null) {
                C500260Jjc.LJIILIIL(c0gsx3);
            }
        }
        U5(this.LLJL);
        C786410Ut5.I7(new ACListenerS4S1301000_7(this, i, feedExtra, feedItem, str, 2), this.LLJJJJ);
    }
}
