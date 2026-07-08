package com.ss.android.ugc.aweme.im.messagelist.api.ability;

import X.C19EG;
import X.C869590Y9l;
import X.InterfaceC454950Hsj;
import X.InterfaceC494301wD;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: loaded from: classes7.dex */
public interface MessageListStickerClickAbility extends InterfaceC494301wD {
    void Gl1(C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate);

    void LG1(RoundingCornerLayout roundingCornerLayout, StickerTemplate stickerTemplate);

    void MS(RoundingCornerLayout roundingCornerLayout, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate);

    void dH1(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate);

    void iA0(SessionInfo sessionInfo, StickerTemplate stickerTemplate, AwS215S0300000_6 awS215S0300000_6);

    void up1(View view, FragmentManager fragmentManager, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate);

    void xj2(InterfaceC454950Hsj interfaceC454950Hsj);

    void zM(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate);
}
