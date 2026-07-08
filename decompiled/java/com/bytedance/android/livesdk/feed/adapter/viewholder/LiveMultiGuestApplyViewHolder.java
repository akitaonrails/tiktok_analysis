package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.AbstractC472460Ifs;
import X.C01GW;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.EnumC471790Ien;
import X.InterfaceC472640IgA;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveMultiGuestApplyViewHolder extends LiveRoomSingleViewHolder {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder, com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        super.I5(feedItem, feedExtra, str, i);
        GuestApplyInfo guestApplyInfo = feedItem.skylightMultiGuestApplyInfo;
        if (guestApplyInfo != null) {
            int i2 = guestApplyInfo.applyStatus;
            C500260Jjc.LLFFF((View) this.LLJLLIL.getValue());
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C500260Jjc.LJIILIIL((View) this.LLJLLIL.getValue());
                        return;
                    } else {
                        ((View) this.LLJLLL.getValue()).setBackgroundResource(R.drawable.ejc);
                        ((TextView) this.LLJZ.getValue()).setText(C497740JfY.LJIJI(2131854292));
                        return;
                    }
                }
                ((View) this.LLJLLL.getValue()).setBackgroundResource(R.drawable.ejb);
                ((TextView) this.LLJZ.getValue()).setText(C497740JfY.LJIJI(2131854286));
                return;
            }
            ((View) this.LLJLLL.getValue()).setBackgroundResource(R.drawable.ejd);
            ((TextView) this.LLJZ.getValue()).setText(C497740JfY.LJIJI(2131854290));
        }
    }

    public LiveMultiGuestApplyViewHolder(View view, AbstractC472460Ifs abstractC472460Ifs, InterfaceC472640IgA interfaceC472640IgA, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner) {
        super(view, abstractC472460Ifs, interfaceC472640IgA, enumC471790Ien, lifecycleOwner);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(view, 48));
        this.LLJLLL = C452501pT.LIZIZ(new AwS551S0100000_7(view, 49));
        this.LLJZ = C452501pT.LIZIZ(new AwS551S0100000_7(view, 50));
    }
}
