package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.C0IJT;
import X.C1161920gLG;
import X.C474500IjA;
import X.C500260Jjc;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.feed.EventStruct;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LiveEventViewHolder extends DrawerFollowingViewHolder {
    public EventStruct LLIZ;
    public int LLIZLLLIL;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void L5() {
        EventStruct eventStruct = this.LLIZ;
        if (eventStruct == null || this.LLILLJJLI || !this.LL) {
            return;
        }
        this.LLILLJJLI = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_card_show");
        c474500IjALIZ.LJJII("toplive_live_cover", "enter_from");
        User user = eventStruct.owner;
        c474500IjALIZ.LJJII(Long.valueOf(user != null ? user.getId() : 0L), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLIZLLLIL), "card_position");
        c474500IjALIZ.LJJII(eventStruct.id, "live_event_id");
        c474500IjALIZ.LIZ();
    }

    public final void P5() {
        String liveEvent60PercentSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEvent60PercentSchema();
        if (liveEvent60PercentSchema.length() == 0 || this.LLIZ == null) {
            return;
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.itemView.getContext(), liveEvent60PercentSchema, new AwS586S0100000_7(this, 99));
        N5("card");
    }

    public LiveEventViewHolder(View view) {
        super(view, null);
    }

    public final void N5(String str) {
        long id;
        Object obj;
        User user;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_card_click");
        c474500IjALIZ.LJJII("toplive_live_cover", "enter_from");
        EventStruct eventStruct = this.LLIZ;
        if (eventStruct != null && (user = eventStruct.owner) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLIZLLLIL), "card_position");
        EventStruct eventStruct2 = this.LLIZ;
        Object objValueOf = null;
        if (eventStruct2 != null) {
            obj = eventStruct2.id;
        } else {
            obj = null;
        }
        c474500IjALIZ.LJJII(obj, "live_event_id");
        c474500IjALIZ.LJJII(str, "click_area");
        EventStruct eventStruct3 = this.LLIZ;
        if (eventStruct3 != null) {
            objValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(eventStruct3.hasSubscribed)) ? 1 : 0);
        }
        c474500IjALIZ.LJJII(objValueOf, "has_registered");
        c474500IjALIZ.LIZ();
    }
}
