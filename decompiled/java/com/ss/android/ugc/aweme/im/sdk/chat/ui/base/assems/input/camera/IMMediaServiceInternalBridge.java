package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.C05YD;
import X.C0CGL;
import X.C0HV9;
import X.C0IBF;
import X.C0IBX;
import X.C1175804iq;
import X.C19EG;
import X.C457750HxF;
import X.C869590Y9l;
import X.C901590ZYn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC457730HxD;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatroomInputAssem;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS289S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public interface IMMediaServiceInternalBridge {
    public static final C457750HxF LIZ = C457750HxF.LIZ;

    void LIZ();

    void LIZIZ(SessionInfo sessionInfo, C0IBF c0ibf, InterfaceC1493105sv interfaceC1493105sv);

    C0IBX LIZJ(C19EG c19eg, SessionInfo sessionInfo, String str);

    boolean LIZLLL(int i, IMUser iMUser, String str);

    void LJ(SessionInfo sessionInfo, C0IBF c0ibf, InterfaceC1493105sv interfaceC1493105sv);

    boolean LJFF(SessionInfo sessionInfo);

    InterfaceC457730HxD LJI();

    void LJII(SessionInfo sessionInfo, C0IBF c0ibf, String str, String str2, Boolean bool, Long l, String str3, String str4, String str5, Double d, boolean z, InterfaceC1493105sv interfaceC1493105sv);

    void LJIIIIZZ(SessionInfo sessionInfo, C0IBF c0ibf, String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv);

    void LJIIIZ(Integer num, String str, String str2, String str3, String str4);

    Object LJIIJ(Context context, List list, InterfaceC1364105Vn interfaceC1364105Vn);

    boolean LJIIJJI(int i, String str, boolean z);

    boolean LJIIL(String str, int i, IMUser iMUser, boolean z);

    void LJIILIIL();

    Function1 LJIILJJIL(SingleChatroomInputAssem singleChatroomInputAssem, C05YD c05yd, C1175804iq c1175804iq, AFwS289S0000000_6 aFwS289S0000000_6, C0HV9 c0hv9);

    void LJIILL(Activity activity, String str, int i, String str2, String str3, Effect effect, Long l, String str4, DMCreativeStickerFontData dMCreativeStickerFontData, C901590ZYn c901590ZYn, boolean z, String str5, Map map, Map map2, Integer num, String str6, String str7, Boolean bool, boolean z2, boolean z3, boolean z4, boolean z5, QuoteMode quoteMode);

    void LJIILLIIL(C19EG c19eg, String str, String str2, int i, Map map, Map map2, String str3, String str4, QuoteMode quoteMode, Function0 function0, C0CGL c0cgl);

    boolean LJIIZILJ(C869590Y9l c869590Y9l, int i);

    void LJIJ(String str);
}
