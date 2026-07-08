package com.ss.android.ugc.aweme.socialgame.impl.service;

import X.AnonymousClass0204;
import X.C01GW;
import X.C0PEM;
import X.C1505505uv;
import X.C1701706lT;
import X.C1701806lU;
import X.C1702806le;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C463401rE;
import X.C463501rF;
import X.InterfaceC1681406iC;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialGameService implements ISocialGameService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(672));

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final InterfaceC1681406iC LIZ() {
        return (InterfaceC1681406iC) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final boolean LIZJ() {
        boolean z = C1701706lT.LIZ;
        if (!C1701706lT.LIZ) {
            return false;
        }
        C1701806lU.LIZ.getClass();
        return C1701806lU.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final void LJIIIIZZ() {
        String appLanguage;
        II18nService iI18nService = (II18nService) PluggableExtentionKt.pluggableSpi$default(II18nService.class, false, false, false, 14, null);
        if (iI18nService == null || (appLanguage = iI18nService.getAppLanguage()) == null) {
            appLanguage = "en";
        }
        Map mapLIZ = C463501rF.LIZ(appLanguage);
        List<EmojiGameItemConfig> list = C1505505uv.LIZ().gameList;
        ArrayList arrayList = new ArrayList();
        Iterator<EmojiGameItemConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().id;
            if (num != null) {
                arrayList.add(num);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int iIntValue = ((Number) obj).intValue();
            if (mapLIZ == null || !mapLIZ.containsKey(Integer.valueOf(iIntValue))) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 2))), null, null, new C463401rE(appLanguage, arrayList2, mapLIZ, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final String LIZLLL(Integer num) {
        String appLanguage;
        if (num != null) {
            num.intValue();
            II18nService iI18nService = (II18nService) PluggableExtentionKt.pluggableSpi$default(II18nService.class, false, false, false, 14, null);
            if (iI18nService == null || (appLanguage = iI18nService.getAppLanguage()) == null) {
                appLanguage = "en";
            }
            Map mapLIZ = C463501rF.LIZ(appLanguage);
            if (mapLIZ != null) {
                return (String) mapLIZ.get(num);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (r1.getLong(X.C2188811AlT.LIZIZ(r0), 0) >= r6.maxShowTimeInInterval) goto L28;
     */
    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig r14) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService.LJI(com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig):boolean");
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final EmojiGameItemConfig LJ(SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo) {
        if (!C1505505uv.LIZIZ) {
            return null;
        }
        C1701806lU c1701806lU = C1701806lU.LIZ;
        String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
        c1701806lU.getClass();
        EmojiGameItemConfig emojiGameItemConfigLIZIZ = C1701806lU.LIZIZ(emojiGameInfo, singleChatFromUserId);
        if (emojiGameItemConfigLIZIZ != null) {
            C1702806le c1702806le = C1702806le.LIZ;
            String str = emojiGameItemConfigLIZIZ.channel;
            String str2 = emojiGameItemConfigLIZIZ.path;
            if (str2 == null) {
                str2 = "";
            }
            c1702806le.getClass();
            C1702806le.LIZ(str, str2);
        }
        return emojiGameItemConfigLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final boolean LJFF(SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo) {
        if (C1505505uv.LIZIZ && emojiGameInfo != null) {
            C1701806lU c1701806lU = C1701806lU.LIZ;
            String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
            c1701806lU.getClass();
            EmojiGameItemConfig emojiGameItemConfigLIZIZ = C1701806lU.LIZIZ(emojiGameInfo, singleChatFromUserId);
            if (emojiGameItemConfigLIZIZ != null) {
                C1702806le c1702806le = C1702806le.LIZ;
                String str = emojiGameItemConfigLIZIZ.channel;
                String str2 = emojiGameItemConfigLIZIZ.path;
                if (str2 == null) {
                    str2 = "";
                }
                c1702806le.getClass();
                C1702806le.LIZ(str, str2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r5, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = X.C1505505uv.LIZIZ
            if (r0 != 0) goto La
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.invoke(r0)
            return
        La:
            X.068s r0 = com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r2 = X.C15596068s.LIZ()
            r1 = 1
            if (r2 == 0) goto L28
            java.lang.String r0 = r5.getConversationId()
            X.0693 r2 = (X.AnonymousClass0693) r2
            boolean r0 = r2.LJII(r0)
            if (r0 != r1) goto L28
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.invoke(r0)
            return
        L28:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r5.getSingleChatFromUser()
            if (r0 == 0) goto L35
            boolean r0 = r0.isBlock()
            if (r0 != r1) goto L35
            goto L22
        L35:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r5.getSingleChatFromUser()
            if (r0 == 0) goto L42
            boolean r0 = r0.isBlocked()
            if (r0 != r1) goto L42
            goto L22
        L42:
            boolean r0 = X.C1702606lc.LIZ()
            if (r0 == 0) goto L5f
            X.05uq r0 = X.C1505005uq.LIZ
            java.lang.String r1 = r5.getConversationId()
            r0.getClass()
            java.util.Set<java.lang.String> r0 = X.C1505005uq.LIZIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.invoke(r0)
            return
        L5f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.08hG r2 = kotlinx.coroutines.CoroutineExceptionHandler.LJJLIL
            X.06wV r1 = new X.06wV
            r0 = 2
            r1.<init>(r2, r6, r0)
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r1)
            X.054G r3 = X.C2296808zG.LIZ(r0)
            X.05uu r2 = new X.05uu
            r1 = 0
            r2.<init>(r5, r6, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService.LJIIJ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List r9, int r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService.LJII(java.util.List, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final void LJIIIZ(Context context, EmojiGameInfo emojiGameInfo, SessionInfo sessionInfo, Map<String, String> map) {
        String str;
        String strLIZLLL;
        C1701806lU.LIZ.getClass();
        EmojiGameItemConfig emojiGameItemConfigLIZIZ = C1701806lU.LIZIZ(emojiGameInfo, sessionInfo.getSingleChatFromUserId());
        if (emojiGameItemConfigLIZIZ != null && (str = emojiGameItemConfigLIZIZ.path) != null && (strLIZLLL = C1701806lU.LIZLLL(str, emojiGameItemConfigLIZIZ)) != null) {
            C1701806lU.LIZJ(context, strLIZLLL, emojiGameInfo, sessionInfo, map, emojiGameItemConfigLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService
    public final void LIZIZ(Context context, String str, SessionInfo sessionInfo, EmojiGameInfo emojiGameInfo, Map<String, String> map) throws UnsupportedEncodingException {
        EmojiGameItemConfig next;
        C1701806lU.LIZ.getClass();
        String strLIZ = C1701806lU.LIZ(str, sessionInfo.getSingleChatFromUserId());
        if (strLIZ != null) {
            Iterator<EmojiGameItemConfig> it2 = C1505505uv.LIZ().gameList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.path, strLIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EmojiGameItemConfig emojiGameItemConfig = next;
            String strLIZLLL = C1701806lU.LIZLLL(strLIZ, emojiGameItemConfig);
            if (strLIZLLL != null) {
                C1701806lU.LIZJ(context, strLIZLLL, emojiGameInfo, sessionInfo, map, emojiGameItemConfig);
            }
        }
    }
}
