package com.ss.android.ugc.aweme.im.b2c.api;

import X.AbstractC1549150qPp;
import X.AnonymousClass0653;
import X.C061D;
import X.C0Z7V;
import X.C0ZR3;
import X.C13IQ;
import X.C1668706g9;
import X.C19719912Dl;
import X.C909290Zln;
import X.InterfaceC1364105Vn;
import X.InterfaceC1608000rwk;
import X.InterfaceC1668206g4;
import X.InterfaceC1669006gC;
import X.InterfaceC1669306gF;
import X.InterfaceC1669506gH;
import X.InterfaceC1670106gN;
import X.InterfaceC1712206nA;
import X.InterfaceC1712506nD;
import X.InterfaceC877200Yb8;
import X.InterfaceC894120Z5u;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.b2c.api.model.ClickToChatItemResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IIMBusinessChatService {
    public static final C1668706g9 LIZ = C1668706g9.LIZ;

    void LIZ();

    InterfaceC1669506gH LIZIZ();

    void LIZJ();

    void LIZLLL();

    C13IQ<? extends UIContentAssem> LJ();

    InterfaceC1712506nD LJFF();

    InterfaceC894120Z5u LJI();

    void LJII(ChatFeatureListConf chatFeatureListConf, Assembler assembler, Fragment fragment, C909290Zln c909290Zln, SingleChatAssem singleChatAssem);

    InterfaceC1669306gF LJIIIIZZ();

    Map<String, List<Integer>> LJIIIZ(IMUser iMUser);

    InterfaceC1608000rwk LJIIJ(Aweme aweme, Long l, String str, String str2);

    InterfaceC1669006gC LJIIJJI();

    void LJIIL(BusinessCommandMessage businessCommandMessage);

    C061D LJIILIIL();

    C0Z7V LJIILJJIL();

    InterfaceC1712206nA LJIILL();

    C19719912Dl LJIILLIIL();

    InterfaceC1670106gN LJIIZILJ();

    ChatFeatureListConf LJIJ(SessionInfo sessionInfo, IMUser iMUser, IMUser iMUser2);

    InterfaceC877200Yb8 LJIJI();

    InterfaceC1668206g4 LJIJJ();

    Object LJIJJLI(AnonymousClass0653 anonymousClass0653, InterfaceC1364105Vn<? super ClickToChatItemResponse> interfaceC1364105Vn);

    void LJIL(IMUser iMUser);

    void LJJ(String str);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJI();

    C0ZR3 getFeedbackService();
}
