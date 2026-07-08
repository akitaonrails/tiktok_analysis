package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot;

import X.AnonymousClass0629;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDetailNameAssem extends ChatDetailNameAssem {
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnh;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem
    public final void kp() {
        String str;
        Object obj = getConfig().LLILZ.get("key_bot_info");
        IMAIBotInfo iMAIBotInfo = obj instanceof IMAIBotInfo ? (IMAIBotInfo) obj : null;
        TuxTextView tuxTextViewHp = hp();
        if (iMAIBotInfo == null || (str = iMAIBotInfo.nickname) == null) {
            str = "";
        }
        tuxTextViewHp.setText(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem
    public final void lp() {
        TuxTextView tuxTextViewIp = ip();
        IMAIServiceAPI.LIZ.getClass();
        tuxTextViewIp.setText(AnonymousClass0629.LIZ().LIZ().LJJIIZI() ? ip().getContext().getString(2131848509) : ip().getContext().getString(2131848424));
        ip().setMaxLines(Integer.MAX_VALUE);
        ip().setTuxFont(51);
        ip().setTextColorRes(R.attr.a1j);
        ip().setGravity(17);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }
}
