package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatBotSchema_OptTypeAdapter extends TypeAdapter<ChatBotSchema> {
    @Override // com.google.gson.TypeAdapter
    public final ChatBotSchema read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ChatBotSchema chatBotSchema = new ChatBotSchema();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "recharge_page_faq_v3")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    chatBotSchema.rechargePageFaqV3 = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "recharge_failed_bot_v3")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    chatBotSchema.rechargeFailedBotV3 = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return chatBotSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ChatBotSchema chatBotSchema) {
        ChatBotSchema chatBotSchema2 = chatBotSchema;
        if (chatBotSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("recharge_page_faq_v3");
        c09dl.LJJJJJ(chatBotSchema2.rechargePageFaqV3);
        c09dl.LJIILLIIL("recharge_failed_bot_v3");
        c09dl.LJJJJJ(chatBotSchema2.rechargeFailedBotV3);
        c09dl.LJII();
    }
}
