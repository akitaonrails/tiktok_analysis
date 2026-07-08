package kotlin.jvm.internal;

import X.C09AY;
import X.C0IDZ;
import X.C1390920mIc;
import X.C786410Ut5;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS34S2100000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS34S2100000_6 awS34S2100000_6, Object obj) {
        C1390920mIc c1390920mIc = (C1390920mIc) obj;
        String str = StoryNotePanelAuthorFragment._pnsPageId;
        StoryNoteDataCollection storyNoteDataCollection = (StoryNoteDataCollection) awS34S2100000_6.l2;
        String str2 = awS34S2100000_6.s0;
        String str3 = awS34S2100000_6.s1;
        StoryNotePanelAuthorFragment storyNotePanelAuthorFragment = new StoryNotePanelAuthorFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "StoryNoteDataCollectionKey", storyNoteDataCollection);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        storyNotePanelAuthorFragment.setArguments(bundle);
        c1390920mIc.LIZ.LLJJIJI = storyNotePanelAuthorFragment;
        c1390920mIc.LJI(5);
        return c1390920mIc;
    }

    public static final Object invoke$1(AwS34S2100000_6 awS34S2100000_6, Object obj) {
        C1390920mIc c1390920mIc = (C1390920mIc) obj;
        String str = StoryNotePanelUserFragment._pnsPageId;
        StoryNoteDataCollection storyNoteDataCollection = (StoryNoteDataCollection) awS34S2100000_6.l2;
        String str2 = awS34S2100000_6.s0;
        String str3 = awS34S2100000_6.s1;
        StoryNotePanelUserFragment storyNotePanelUserFragment = new StoryNotePanelUserFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "StoryNoteDataCollectionKey", storyNoteDataCollection);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        storyNotePanelUserFragment.setArguments(bundle);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = storyNotePanelUserFragment;
        tuxSheet.LLILLJJLI = new C0IDZ(storyNotePanelUserFragment, 0);
        c1390920mIc.LJI(21);
        return c1390920mIc;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS34S2100000_6 r10, java.lang.Object r11) {
        /*
            X.062P r11 = (X.C062P) r11
            java.lang.String r6 = r10.s0
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment) r0
            java.lang.String r7 = r0.LLJILJILJ
            long r0 = r0.LLJJJ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L1e
            r0 = 0
            r8 = 0
            if (r0 == 0) goto L22
        L1e:
            java.lang.String r8 = r5.toString()
        L22:
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment) r0
            int r0 = r0.LLJJJJ
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r10.s0
            r1.append(r0)
            java.lang.String r0 = r10.s1
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "_feed_dm"
            r1.append(r0)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r1)
            X.0Hx8 r5 = new X.0Hx8
            r5.<init>(r6, r7, r8, r9, r10)
            r11.LIZ = r5
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS34S2100000_6.invoke$2(kotlin.jvm.internal.AwS34S2100000_6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S2100000_6(StoryNoteDataCollection storyNoteDataCollection, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = storyNoteDataCollection;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S2100000_6(String str, DetailFeedReplyMessageFragment detailFeedReplyMessageFragment, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = detailFeedReplyMessageFragment;
        this.s1 = str2;
    }
}
