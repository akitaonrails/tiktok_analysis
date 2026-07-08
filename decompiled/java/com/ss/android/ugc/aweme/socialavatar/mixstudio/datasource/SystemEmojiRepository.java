package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.C01GW;
import X.C435710H6r;
import X.C452501pT;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemEmojiRepository implements EmojiRepository {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(139));

    @Override // com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository
    public final List<Emoji> LIZ() {
        List<Emoji> listRecommendedEmojis = MixStudioSettings.INSTANCE.recommendedEmojis();
        if (listRecommendedEmojis != null) {
            return listRecommendedEmojis;
        }
        throw new C435710H6r("There are none to get for getAllEmojis");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    @Override // com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji> LIZIZ(int r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.im.sticker.api.model.MixStudioFestiveSettings r0 = com.ss.android.ugc.aweme.im.sticker.api.model.MixStudioFestiveSettings.INSTANCE
            java.util.List r5 = r0.getFestiveEmojis()
            if (r5 != 0) goto L18
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings r0 = com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings.INSTANCE
            java.util.List r5 = r0.recommendedEmojis()
        Le:
            if (r5 != 0) goto L59
            X.0H6r r1 = new X.0H6r
            java.lang.String r0 = "Mix Studio Settings did not contain recommended emojis"
            r1.<init>(r0)
            throw r1
        L18:
            int r0 = r5.size()
            int r4 = r7 - r0
            if (r4 <= 0) goto L59
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings r0 = com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings.INSTANCE
            java.util.List r0 = r0.recommendedEmojis()
            if (r0 == 0) goto L52
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            r3.add(r1)
            goto L31
        L47:
            java.util.List r0 = X.C1697820uHc.LIZLLL(r3)
            java.util.List r0 = X.C13LP.LL(r0, r4)
            if (r0 == 0) goto L52
            goto L54
        L52:
            X.13BV r0 = X.C13BV.INSTANCE
        L54:
            java.util.List r5 = X.C13LP.LJLIL(r0, r5)
            goto Le
        L59:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L62:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L78
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji r0 = (com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji) r0
            java.lang.String r0 = r0.text
            if (r0 == 0) goto L62
            r4.add(r1)
            goto L62
        L78:
            java.util.List r1 = X.C1697820uHc.LIZLLL(r4)
            int r0 = r4.size()
            if (r7 > r0) goto L83
            r0 = r7
        L83:
            java.util.List r1 = r1.subList(r2, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r0) goto L9a
            int r0 = r1.size()
            if (r0 >= r7) goto L9a
            X.0H6r r1 = new X.0H6r
            java.lang.String r0 = "Not enough emojis in Mix Studio Settings"
            r1.<init>(r0)
            throw r1
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SystemEmojiRepository.LIZIZ(int):java.util.List");
    }
}
