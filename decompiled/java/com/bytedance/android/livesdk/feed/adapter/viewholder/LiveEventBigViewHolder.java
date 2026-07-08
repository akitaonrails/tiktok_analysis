package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.C01DW;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C20736316Cj;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.res.ColorStateList;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.zhiliaoapp.musically.R;
import webcast.api.feed.EventStruct;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEventBigViewHolder extends LiveEventViewHolder {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final View LLJ;
    public final C1324720kZq LLJI;
    public final C16F5 LLJIJIL;
    public final C16FS LLJILJIL;

    public LiveEventBigViewHolder(View view) {
        super(view);
        this.LLJ = view.findViewById(R.id.g_s);
        this.LLJI = (C1324720kZq) view.findViewById(R.id.ld7);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.tv_time);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.cu0);
    }

    public final void R5(boolean z) {
        if (z) {
            this.LLJILJIL.setText(C497740JfY.LJIJI(2131851061));
            this.LLJILJIL.j0(R.style.a74);
            C16FS c16fs = this.LLJILJIL;
            c16fs.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZJ(R.attr.ey_, c16fs)));
            C16FS c16fs2 = this.LLJILJIL;
            c16fs2.setTextColor(C20736316Cj.LIZJ(R.attr.ezq, c16fs2));
            return;
        }
        this.LLJILJIL.setText(C497740JfY.LJIJI(2131851060));
        this.LLJILJIL.j0(R.style.a7q);
        C16FS c16fs3 = this.LLJILJIL;
        c16fs3.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZJ(R.attr.eya, c16fs3)));
        C16FS c16fs4 = this.LLJILJIL;
        c16fs4.setTextColor(C20736316Cj.LIZJ(R.attr.eyw, c16fs4));
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        ImageModel avatarThumb;
        String strGr1;
        EventStruct eventStruct = feedItem.liveEvent;
        if (eventStruct != null) {
            C1324720kZq c1324720kZq = this.LLJI;
            User user = eventStruct.owner;
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1143680frq.LJJI(c1324720kZq, avatarThumb, false);
            C16F5 c16f5 = this.LLJIJIL;
            IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
            if (iHostCreativeTool == null || (strGr1 = iHostCreativeTool.Gr1(Long.valueOf(eventStruct.startTime * 1000))) == null) {
                strGr1 = "";
            }
            c16f5.setText(strGr1);
            R5(eventStruct.hasSubscribed);
            C786410Ut5.I7(new C01DW() { // from class: X.0Ifo
                @Override // X.C01DW
                public final void LIZ(View view) {
                    this.LLILLL.P5();
                }
            }, this.LLJ);
            C786410Ut5.h8(this.LLJILJIL, new C01DW() { // from class: X.0Ifn
                @Override // X.C01DW
                public final void LIZ(View view) {
                    LiveEventBigViewHolder liveEventBigViewHolder = this.LLILLL;
                    EventStruct eventStruct2 = liveEventBigViewHolder.LLIZ;
                    if (eventStruct2 != null) {
                        liveEventBigViewHolder.LLJILJIL.LJ();
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C472380Ifk(eventStruct2, liveEventBigViewHolder, null), 2);
                    }
                }
            });
            this.LLIZ = eventStruct;
            this.LLIZLLLIL = i;
            L5();
        }
    }
}
