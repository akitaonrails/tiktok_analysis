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
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomInformationDoubleViewHolder extends LiveRoomViewHolder {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final InterfaceC472640IgA LLJJJIL;
    public final View LLJJJJ;
    public final C1324720kZq LLJJJJJIL;
    public final C1324720kZq LLJJJJLIIL;
    public final C0GSX LLJJL;
    public final C1324720kZq LLJJLIIIJLLLLLLLZ;
    public final C16F5 LLJL;
    public final C16F5 LLJLIL;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
        this.LLJJLIIIJLLLLLLLZ.clearAnimation();
    }

    public LiveRoomInformationDoubleViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs, InterfaceC472640IgA interfaceC472640IgA) {
        C21569819bE c21569819bE;
        super(view, abstractC472460Ifs, null, null);
        this.LLJJJIL = interfaceC472640IgA;
        this.LLJJJJ = view.findViewById(R.id.tqu);
        this.LLJJJJJIL = (C1324720kZq) view.findViewById(R.id.ldr);
        this.LLJJJJLIIL = (C1324720kZq) view.findViewById(R.id.ldd);
        this.LLJJL = (C0GSX) view.findViewById(R.id.mtu);
        this.LLJJLIIIJLLLLLLLZ = (C1324720kZq) view.findViewById(R.id.mts);
        this.LLJL = (C16F5) view.findViewById(R.id.zym);
        this.LLJLIL = (C16F5) view.findViewById(R.id.n8e);
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
        int size;
        RoomLinkInfo linkMicInfo;
        List<User> list;
        User user;
        ImageModel avatarThumb;
        List urls;
        List<User> list2;
        User user2;
        ImageModel avatarThumb2;
        List urls2;
        List<User> list3;
        InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
        if (interfaceC468260IXw != null && (interfaceC468260IXw instanceof Room)) {
            Room room = (Room) interfaceC468260IXw;
            room.setRequestId(feedItem.resId);
            RoomLinkInfo linkMicInfo2 = room.getLinkMicInfo();
            if (linkMicInfo2 != null && (list3 = linkMicInfo2.showUserList) != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            if (size > 0) {
                RoomLinkInfo linkMicInfo3 = room.getLinkMicInfo();
                if (linkMicInfo3 != null && (list2 = linkMicInfo3.showUserList) != null && (user2 = (User) ListProtector.get(list2, 0)) != null && (avatarThumb2 = user2.getAvatarThumb()) != null && (urls2 = avatarThumb2.getUrls()) != null && urls2.size() > 0) {
                    C1324610kZf c1324610kZfLJIILIIL = C1819620xS4.LIZ().LJIILIIL(P5());
                    c1324610kZfLJIILIIL.LJIJJLI((String) ListProtector.get(urls2, 0), "toplive_window");
                    c1324610kZfLJIILIIL.LJJI(this.LLJJJJLIIL);
                }
                if (size > 1 && (linkMicInfo = room.getLinkMicInfo()) != null && (list = linkMicInfo.showUserList) != null && (user = (User) ListProtector.get(list, 1)) != null && (avatarThumb = user.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && urls.size() > 0) {
                    C1324610kZf c1324610kZfLJIILIIL2 = C1819620xS4.LIZ().LJIILIIL(P5());
                    c1324610kZfLJIILIIL2.LJIJJLI((String) ListProtector.get(urls, 0), "toplive_window");
                    c1324610kZfLJIILIIL2.LJJI(this.LLJJJJJIL);
                }
            }
            if (room.getOwner() != null) {
                this.LLJL.setText(C0KVU.LIZ(room.getOwner()));
            }
            this.LLJLIL.setText(room.getTitle());
            this.LLJ = room;
            this.LLJI = feedItem;
            this.LLJIJIL = i;
            L5();
            if (TextUtils.isEmpty(room.getTitle())) {
                this.LLJLIL.setText(C497740JfY.LJIJI(2131842200));
            } else {
                this.LLJLIL.setText(room.getTitle());
            }
        }
        if (!S5()) {
            Context contextLIZ = C176600m4.LIZ();
            if (contextLIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5t, contextLIZ)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            C0GSX c0gsx = this.LLJJL;
            if (c0gsx != null) {
                c0gsx.LIZ(iIntValue, iIntValue);
            }
            C0GSX c0gsx2 = this.LLJJL;
            if (c0gsx2 != null) {
                C500260Jjc.LLFFF(c0gsx2);
            }
        } else {
            C0GSX c0gsx3 = this.LLJJL;
            if (c0gsx3 != null) {
                C500260Jjc.LJIILIIL(c0gsx3);
            }
        }
        U5(this.LLJJLIIIJLLLLLLLZ);
        C786410Ut5.I7(new ACListenerS4S1301000_7(this, i, feedExtra, feedItem, str, 1), this.LLJJJJ);
    }
}
