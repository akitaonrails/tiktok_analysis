package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C001A;
import X.C0KVU;
import X.C1128630fTZ;
import X.C1850730yGF;
import X.C497740JfY;
import X.C498540Jgq;
import X.C500260Jjc;
import X.C776250Uch;
import X.C784440Upu;
import X.C786410Ut5;
import X.C924810aAp;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveNewGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, OnMessageListener {
    public C1128630fTZ LL;
    public TextView LLILLJJLI;
    public User LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g76;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        C498540Jgq c498540Jgq = (C498540Jgq) this.contentView.findViewById(R.id.bh2);
        TextView textView = (TextView) this.contentView.findViewById(R.id.y50);
        TextView textView2 = (TextView) this.contentView.findViewById(R.id.user_coin_num);
        this.LLILLJJLI = textView2;
        C1128630fTZ c1128630fTZ = this.LL;
        if (c1128630fTZ != null) {
            this.LLILLL = c1128630fTZ.LIZ;
            long j = c1128630fTZ.LJII;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT));
        }
        User user = this.LLILLL;
        if (user != null) {
            if (c498540Jgq != null) {
                c498540Jgq.setAvatar(user.getAvatarThumb());
            }
            if (textView != null) {
                textView.setText(C497740JfY.LJIJJ(2131844053, C0KVU.LIZ(this.LLILLL)));
            }
        }
        if (c498540Jgq != null) {
            C786410Ut5.A8(c498540Jgq, this);
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC.getIntType(), this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1128630fTZ c1128630fTZ;
        if (view.getId() == R.id.bh2 && (c1128630fTZ = this.LL) != null) {
            c1128630fTZ.LJ.postValue(Boolean.TRUE);
            C924810aAp.LJ().LJIJI = true;
            UserProfileEvent userProfileEvent = new UserProfileEvent(c1128630fTZ.LIZ, "guest_connection");
            userProfileEvent.mReportType = "report_anchor";
            userProfileEvent.mSource = "guest_connection";
            C784440Upu.LIZ().LIZIZ(userProfileEvent);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        User user;
        if ((iMessage instanceof LinkMicMessage) && (user = this.LLILLL) != null && user.getId() == ((LinkMicMessage) iMessage).userId) {
            LinkMicMessage linkMicMessage = (LinkMicMessage) iMessage;
            if (linkMicMessage.mType == 8) {
                long j = linkMicMessage.fanTicket;
                TextView textView = this.LLILLJJLI;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT));
            }
        }
    }
}
