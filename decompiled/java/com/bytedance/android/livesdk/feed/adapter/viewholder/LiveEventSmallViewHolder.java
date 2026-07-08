package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.AbstractC472460Ifs;
import X.C00UH;
import X.C01DW;
import X.C0GSX;
import X.C0KVU;
import X.C1143680frq;
import X.C12ES;
import X.C1324720kZq;
import X.C16F5;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.zhiliaoapp.musically.R;
import webcast.api.feed.EventStruct;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEventSmallViewHolder extends LiveEventViewHolder {
    public static final /* synthetic */ int LLJJJ = 0;
    public final AbstractC472460Ifs LLJ;
    public final View LLJI;
    public final C0GSX LLJIJIL;
    public final C1324720kZq LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final C0GSX LLJILLL;
    public final C1324720kZq LLJJ;
    public final C16F5 LLJJI;
    public float LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;

    public LiveEventSmallViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs) {
        super(view);
        this.LLJ = abstractC472460Ifs;
        this.LLJI = view.findViewById(R.id.g_s);
        this.LLJIJIL = (C0GSX) view.findViewById(R.id.ln2);
        this.LLJILJIL = (C1324720kZq) view.findViewById(R.id.ld7);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.zym);
        this.LLJILLL = (C0GSX) view.findViewById(R.id.mtu);
        this.LLJJ = (C1324720kZq) view.findViewById(R.id.mts);
        this.LLJJI = (C16F5) view.findViewById(R.id.hk2);
        this.LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        Number numberValueOf;
        GradientDrawable gradientDrawable;
        EventStruct eventStruct = feedItem.liveEvent;
        if (eventStruct != null) {
            C1324720kZq c1324720kZq = this.LLJILJIL;
            User user = eventStruct.owner;
            ImageModel avatarThumb = null;
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            }
            C1143680frq.LJJI(c1324720kZq, avatarThumb, false);
            this.LLJILJILJ.setText(C0KVU.LIZ(eventStruct.owner));
            int iLIZJ = C20736316Cj.LIZJ(R.attr.exq, this.LLJIJIL);
            this.LLJIJIL.LIZ(iLIZJ, iLIZJ);
            this.LLJILLL.LIZ(-16777216, -16777216);
            C12ES.LJIILL(0, this.LLJILLL);
            C12ES.LJIILL(0, this.LLJJ);
            if (feedItem.skylightItemStyle != C00UH.SINGLE_EVENT) {
                if (!this.LLJ.LIZ()) {
                    C500260Jjc.LJJLJLI(this.LLJJIJIIJIL, this.LLJI);
                }
            } else {
                if (this.LLJJIII <= 0.0f) {
                    this.LLJJIII = this.LLJJI.getPaint().measureText(C497740JfY.LJIJI(2131856835));
                }
                float f = this.LLJJIII;
                if (f > 0.0f) {
                    int i2 = this.LLJJIJI;
                    int i3 = this.LLJJIJIIJIL;
                    int i4 = i2 + (i3 * 2);
                    int i5 = (i4 * 2) + i3;
                    float f2 = f + this.LLJJIJIL;
                    float f3 = i4;
                    if (f2 <= f3) {
                        numberValueOf = Integer.valueOf(i3);
                    } else if (f2 <= i5) {
                        numberValueOf = Float.valueOf(f2 - f3);
                    } else {
                        numberValueOf = Integer.valueOf(i5 - i4);
                    }
                    C500260Jjc.LJJLJLI(numberValueOf.intValue(), this.LLJI);
                } else {
                    C500260Jjc.LJJLJLI(this.LLJJIJIIJIL, this.LLJI);
                }
            }
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LLJJ.getContext(), R.drawable.chh);
            if ((drawableLIZIZ instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableLIZIZ) != null) {
                if (!this.LLJ.LIZ()) {
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
                }
                this.LLJJ.setBackgroundDrawable(gradientDrawable);
            }
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.d0c, this.LLJIJIL.getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C20736316Cj.LIZJ(R.attr.exp, this.LLJIJIL));
                if (this.LLJ.LIZ()) {
                    this.LLJJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
                } else {
                    this.LLJJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
                }
                this.LLJJ.setImageDrawable(c20743516FdLIZLLL);
            }
            C786410Ut5.I7(new C01DW() { // from class: X.0Ifm
                @Override // X.C01DW
                public final void LIZ(View view) {
                    this.LLILLL.P5();
                }
            }, this.LLJI);
            this.LLIZ = eventStruct;
            this.LLIZLLLIL = i;
            L5();
        }
    }
}
