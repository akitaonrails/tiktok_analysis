package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot;

import X.AnonymousClass0629;
import X.C01GW;
import X.C0I98;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQ1;
import X.C1509305vX;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDetailAvatarAssem extends UISlotAssem {
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 559));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cng;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IMAIBotInfo iMAIBotInfo;
        TuxIconView tuxIconView;
        String string;
        UrlModel urlModelLJIILIIL;
        super.onViewCreated(view);
        Object obj = getConfig().LLILZ.get("key_bot_info");
        if (obj instanceof IMAIBotInfo) {
            iMAIBotInfo = (IMAIBotInfo) obj;
        } else {
            iMAIBotInfo = null;
        }
        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJJI.getValue();
        if (iDMAvatarLoader != null) {
            if (iMAIBotInfo != null) {
                string = Long.valueOf(iMAIBotInfo.id).toString();
                String str = iMAIBotInfo.avatarUrl;
                if (str != null) {
                    urlModelLJIILIIL = C0I98.LJIILIIL(str);
                }
                iDMAvatarLoader.LIZIZ(string, urlModelLJIILIIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            } else {
                string = null;
            }
            urlModelLJIILIIL = null;
            iDMAvatarLoader.LIZIZ(string, urlModelLJIILIIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        }
        IMAIServiceAPI.LIZ.getClass();
        Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.BOT_SETTING_PAGE_AVATAR_LABEL, null).LIZIZ;
        if (drawable != null && (tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.bhq)) != null) {
            tuxIconView.setImageDrawable(drawable);
        }
    }
}
