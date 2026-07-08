package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C603820NmG;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SayHelloContent extends BaseContent {
    public static final Companion Companion = new Companion();
    public static final C603820NmG<Long, Emoji> cache = new C603820NmG<>(100);
    public final List<Emoji> actualEmoji;

    @C09CT("hello_text")
    public final String helloText;
    public final boolean isNewStyle;

    @C09CT("joker_stickers")
    public List<? extends Emoji> jockerStickers;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("stickers")
    public List<? extends Emoji> stickers;

    public SayHelloContent() {
        this(null, null, null, null);
    }

    private final List<Emoji> component3() {
        return this.jockerStickers;
    }

    private final List<Emoji> component4() {
        return this.stickers;
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.helloText;
    }

    public final SayHelloContent copy(String str, String str2, List<? extends Emoji> list, List<? extends Emoji> list2) {
        return new SayHelloContent(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SayHelloContent)) {
            return false;
        }
        SayHelloContent sayHelloContent = (SayHelloContent) obj;
        return Intrinsics.LJFF(this.nickname, sayHelloContent.nickname) && Intrinsics.LJFF(this.helloText, sayHelloContent.helloText) && Intrinsics.LJFF(this.jockerStickers, sayHelloContent.jockerStickers) && Intrinsics.LJFF(this.stickers, sayHelloContent.stickers);
    }

    public int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.helloText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<? extends Emoji> list = this.jockerStickers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends Emoji> list2 = this.stickers;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SayHelloContent(nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", helloText=");
        sbLIZ.append(this.helloText);
        sbLIZ.append(", jockerStickers=");
        sbLIZ.append(this.jockerStickers);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<Emoji> list = this.actualEmoji;
        ArrayList arrayList = new ArrayList();
        for (Emoji emoji : list) {
            if (emoji.getAnimateUrl() != null) {
                arrayList.add(emoji);
            }
        }
        List listLL = C13LP.LL(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Emoji) it2.next()).getAnimateUrl());
        }
        return arrayList2;
    }

    public final List<Emoji> getEmojiList() {
        return this.actualEmoji;
    }

    public final boolean isNewStyle() {
        return this.isNewStyle;
    }

    public static final class Companion {
        public final boolean isNewStyle$message_content_api_release(boolean z, boolean z2) {
            return !z && z2;
        }

        public final List<Emoji> getFromPool(List<? extends Emoji> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Emoji emoji : list) {
                    C603820NmG<Long, Emoji> c603820NmG = SayHelloContent.cache;
                    Emoji emojiLIZJ = c603820NmG.LIZJ(Long.valueOf(emoji.getId()));
                    if (emojiLIZJ == null) {
                        c603820NmG.LIZLLL(Long.valueOf(emoji.getId()), emoji);
                    }
                    if (Intrinsics.LJFF(emojiLIZJ, emoji)) {
                        emoji = emojiLIZJ;
                    }
                    arrayList.add(emoji);
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
    }

    public SayHelloContent(String str, String str2, List<? extends Emoji> list, List<? extends Emoji> list2) {
        boolean z;
        List<? extends Emoji> list3;
        this.nickname = str;
        this.helloText = str2;
        this.jockerStickers = list;
        this.stickers = list2;
        if (list2 != null && (!list2.isEmpty()) && list2.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        List<? extends Emoji> list4 = this.jockerStickers;
        boolean z2 = list4 == null || list4.isEmpty();
        Companion companion = Companion;
        boolean zIsNewStyle$message_content_api_release = companion.isNewStyle$message_content_api_release(z, !z2);
        this.isNewStyle = zIsNewStyle$message_content_api_release;
        if (zIsNewStyle$message_content_api_release) {
            list3 = this.jockerStickers;
        } else {
            list3 = this.stickers;
        }
        this.actualEmoji = companion.getFromPool(list3);
        this.stickers = null;
        this.jockerStickers = null;
    }
}
