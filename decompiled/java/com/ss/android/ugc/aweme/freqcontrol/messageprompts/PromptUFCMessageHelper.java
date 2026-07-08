package com.ss.android.ugc.aweme.freqcontrol.messageprompts;

import X.C09CT;
import X.C13LE;
import X.C1674906h9;
import X.C1807670x8n;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.EnumC1641806bo;
import X.EnumC1674506h5;
import X.EnumC1674706h7;
import X.EnumC1674806h8;
import X.EnumC868450Y5b;
import X.InterfaceC1677406hY;
import X.InterfaceC1808750xAX;
import X.InterfaceC2217461Bqa;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class PromptUFCMessageHelper {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public static final Map<Integer, InterfaceC1677406hY> LJ;
    public static final Map<Integer, InterfaceC1677406hY> LJFF;
    public static final Map<Integer, InterfaceC1677406hY> LJI;
    public static final Map<String, InterfaceC1677406hY> LJII;
    public final C1674906h9 LIZ;
    public final String LIZIZ;
    public volatile InterfaceC1808750xAX LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PromptUFCMessageHelper.class, "photo2StickerInlineRepository", "getPhoto2StickerInlineRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/service/photo2sticker/Photo2StickerInlineRepository;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        EnumC1674706h7 enumC1674706h7 = EnumC1674706h7.GUIDE_TO_REPORT;
        LJ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(EnumC868450Y5b.MESSAGE_TYPE_RECALL_MESSAGE.getValue()), EnumC1674806h8.MESSAGE_DELETION), new Pair(Integer.valueOf(EnumC868450Y5b.MsgTypeGroupNotice.getValue()), EnumC1674806h8.GROUP_UPDATES), new Pair(4011, EnumC1641806bo.SA_POST_GENERATION_INLINE_MESSAGE), new Pair(4010, EnumC1674506h5.UPDATE_GROUP_NAME), new Pair(4050, EnumC1674506h5.PHOTO_SWAP_INTRO), new Pair(4007, enumC1674706h7));
        EnumC1674706h7 enumC1674706h72 = EnumC1674706h7.FAILED_SENSITIVE_KEYWORD;
        LJFF = C2097608Jq.LJIIIIZZ(new Pair(7195, enumC1674706h72), new Pair(7179, enumC1674706h72), new Pair(7284, EnumC1674806h8.FAILED_PERMISSION), new Pair(7806, EnumC1674806h8.FAILED_RICH_MEDIA));
        LJI = C2097608Jq.LJIIIIZZ(new Pair(7197, enumC1674706h7), new Pair(7178, enumC1674706h7));
        LJII = C2097908Jt.LIZJ(new Pair("turn_on_restrict_sharing", EnumC1674706h7.TURN_ON_RESTRICT_SHARING_NOTICE));
    }

    public final InterfaceC1808750xAX LIZIZ() {
        InterfaceC1808750xAX interfaceC1808750xAX = this.LIZJ;
        if (interfaceC1808750xAX == null) {
            synchronized (this) {
                interfaceC1808750xAX = this.LIZJ;
                if (interfaceC1808750xAX == null) {
                    InterfaceC1808750xAX interfaceC1808750xAX2 = (InterfaceC1808750xAX) C1807670x8n.LLLLZIL();
                    this.LIZJ = interfaceC1808750xAX2;
                    return interfaceC1808750xAX2;
                }
            }
        }
        return interfaceC1808750xAX;
    }

    public static final class ResponseCheckMessage {

        @C09CT("status_code")
        public final Integer statusCode;

        public ResponseCheckMessage(Integer num) {
            this.statusCode = num;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<kotlin.Pair<X.C869590Y9l, X.InterfaceC1677406hY>> LIZ(java.util.List<? extends X.C869590Y9l> r10) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freqcontrol.messageprompts.PromptUFCMessageHelper.LIZ(java.util.List):java.util.List");
    }

    public PromptUFCMessageHelper(C1674906h9 c1674906h9, String str) {
        this.LIZ = c1674906h9;
        this.LIZIZ = str;
    }
}
