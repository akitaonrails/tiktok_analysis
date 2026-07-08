package com.ss.android.ugc.aweme.notification.vh;

import X.C0C64;
import X.C0OSD;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C424620Gku;
import X.C635360Ow2;
import X.C786410Ut5;
import X.C800330VaR;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemNotificationSettingCell extends PowerCell<C635360Ow2> {
    public C424620Gku LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        GroupUnsubscribeSetting groupUnsubscribeSetting;
        int i;
        UrlModel urlModel;
        ImageUrlModel imageUrlModelLIZIZ;
        C635360Ow2 c635360Ow2 = (C635360Ow2) interfaceC1891350zJl;
        super.onBindItemView(c635360Ow2);
        Context context = getContext();
        if (context != null && (groupUnsubscribeSetting = c635360Ow2.LL) != null) {
            if (c635360Ow2.LLILLJJLI) {
                i = R.drawable.f629aha;
            } else if (c635360Ow2.LLILLL) {
                i = R.drawable.ah9;
            } else {
                i = R.drawable.ah8;
            }
            Context context2 = getContext();
            if (context2 != null) {
                this.itemView.setBackground(C800330VaR.LIZIZ(context2, i));
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "system_notifications_add_unsubscribe_portal", true, true)) {
                C424620Gku c424620Gku = this.LL;
                if (c424620Gku != null) {
                    TuxImageModel tuxImageModel = groupUnsubscribeSetting.settingImageUrlTux;
                    if (tuxImageModel != null) {
                        imageUrlModelLIZIZ = C0OSD.LIZIZ(context, tuxImageModel);
                    } else {
                        imageUrlModelLIZIZ = null;
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
                    c1331670kl3LJIIIIZZ.LJJI(c424620Gku);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                }
            } else {
                if (C960203pA.LIZIZ(ActivityStack.getTopActivity())) {
                    urlModel = groupUnsubscribeSetting.imageUrlDark;
                } else {
                    urlModel = groupUnsubscribeSetting.imageUrl;
                }
                C1324840ka2.LJFF(this.LL, urlModel);
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText(groupUnsubscribeSetting.name);
            }
            C786410Ut5.I7(new ACListenerS113S0200000_9(this, groupUnsubscribeSetting, 22), this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aba, viewGroup, false);
        this.LL = (C424620Gku) viewTd.findViewById(R.id.l6h);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.z4s);
        return viewTd;
    }
}
