package com.ss.android.ugc.aweme.socialgame.api.service;

import X.InterfaceC1364105Vn;
import X.InterfaceC1681406iC;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface ISocialGameService {
    InterfaceC1681406iC LIZ();

    void LIZIZ(Context context, String str, SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo, Map<String, String> map);

    boolean LIZJ();

    String LIZLLL(Integer num);

    EmojiGameItemConfig LJ(SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo);

    boolean LJFF(SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo);

    boolean LJI(EmojiGameItemConfig emojiGameItemConfig);

    Object LJII(List list, int i, String str, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIIIIZZ();

    void LJIIIZ(Context context, EmojiGameInfo emojiGameInfo, SessionInfo sessionInfo, Map<String, String> map);

    void LJIIJ(SessionInfo sessionInfo, Function1<? super Boolean, Unit> function1);
}
