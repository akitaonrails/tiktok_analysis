package com.ss.android.ugc.aweme.notification.vh;

import X.C0P4Q;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C635370Ow3;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemNotificationChannelSettingCell extends PowerCell<C635370Ow3> {
    public C127K LL;
    public C127A LLILLJJLI;

    public final void I5(C635370Ow3 c635370Ow3) {
        boolean zLJFF;
        C127A c127a = this.LLILLJJLI;
        if (c127a != null) {
            ChannelSetting channelSetting = c635370Ow3.LLILLJJLI;
            if (channelSetting != null) {
                zLJFF = Intrinsics.LJFF(channelSetting.isSubscribe, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c127a.LJIILJJIL(zLJFF);
        }
        C127A c127a2 = this.LLILLJJLI;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C127M accessory;
        C127A c127a;
        boolean zLJFF;
        C635370Ow3 c635370Ow3 = (C635370Ow3) interfaceC1891350zJl;
        super.onBindItemView(c635370Ow3);
        Context context = getContext();
        if (context != null) {
            this.itemView.setBackground(C800330VaR.LIZIZ(context, R.drawable.ah_));
            C127K c127k = this.LL;
            if (c127k != null) {
                c127k.setTitle(context.getString(2131849502));
            }
            C127K c127k2 = this.LL;
            if (c127k2 != null) {
                accessory = c127k2.getAccessory();
            } else {
                accessory = null;
            }
            if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != null) {
                c127a.LJIILLIIL(null);
                ChannelSetting channelSetting = c635370Ow3.LLILLJJLI;
                if (channelSetting != null) {
                    zLJFF = Intrinsics.LJFF(channelSetting.isSubscribe, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                c127a.LJIILJJIL(zLJFF);
                c127a.LJIILLIIL(new C0P4Q(this, c635370Ow3, c127a, 1));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abb, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LL = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLJJLI = c127a;
        return viewTd;
    }
}
