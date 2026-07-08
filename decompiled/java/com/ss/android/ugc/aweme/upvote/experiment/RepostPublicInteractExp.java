package com.ss.android.ugc.aweme.upvote.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostPublicInteractExp {
    public static final RepostPublicInteractExp LIZ = new RepostPublicInteractExp();
    public static final RepostPublicInteractConfig LIZIZ = new RepostPublicInteractConfig(false, false, false, false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(382));

    public static RepostPublicInteractConfig LIZIZ() {
        return (RepostPublicInteractConfig) LIZJ.getValue();
    }

    public static boolean LIZ() {
        RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = LIZIZ();
        return repostPublicInteractConfigLIZIZ != null && repostPublicInteractConfigLIZIZ.repostThenNote;
    }

    public static final class RepostPublicInteractConfig {

        @C09CT("notice_quick_action")
        public final boolean noticeQuickAction;

        @C09CT("panel_swipe_dismiss")
        public final boolean panelSwipeDismiss;

        @C09CT("quick_emoji_bar")
        public final boolean quickEmojiBar;

        @C09CT("reply_mention")
        public final boolean replyMention;

        @C09CT("tt_repost_with_note")
        public final boolean repostThenNote;

        @C09CT("zero_reply_guide")
        public final boolean zeroReplyGuide;

        public RepostPublicInteractConfig() {
            this(false, false, false, false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RepostPublicInteractConfig)) {
                return false;
            }
            RepostPublicInteractConfig repostPublicInteractConfig = (RepostPublicInteractConfig) obj;
            return this.quickEmojiBar == repostPublicInteractConfig.quickEmojiBar && this.replyMention == repostPublicInteractConfig.replyMention && this.zeroReplyGuide == repostPublicInteractConfig.zeroReplyGuide && this.panelSwipeDismiss == repostPublicInteractConfig.panelSwipeDismiss && this.repostThenNote == repostPublicInteractConfig.repostThenNote && this.noticeQuickAction == repostPublicInteractConfig.noticeQuickAction;
        }

        public final int hashCode() {
            return (((((((((C786410Ut5.Z2(this.quickEmojiBar) * 31) + C786410Ut5.Z2(this.replyMention)) * 31) + C786410Ut5.Z2(this.zeroReplyGuide)) * 31) + C786410Ut5.Z2(this.panelSwipeDismiss)) * 31) + C786410Ut5.Z2(this.repostThenNote)) * 31) + C786410Ut5.Z2(this.noticeQuickAction);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RepostPublicInteractConfig(quickEmojiBar=");
            sbLIZ.append(this.quickEmojiBar);
            sbLIZ.append(", replyMention=");
            sbLIZ.append(this.replyMention);
            sbLIZ.append(", zeroReplyGuide=");
            sbLIZ.append(this.zeroReplyGuide);
            sbLIZ.append(", panelSwipeDismiss=");
            sbLIZ.append(this.panelSwipeDismiss);
            sbLIZ.append(", repostThenNote=");
            sbLIZ.append(this.repostThenNote);
            sbLIZ.append(", noticeQuickAction=");
            sbLIZ.append(this.noticeQuickAction);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RepostPublicInteractConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.quickEmojiBar = z;
            this.replyMention = z2;
            this.zeroReplyGuide = z3;
            this.panelSwipeDismiss = z4;
            this.repostThenNote = z5;
            this.noticeQuickAction = z6;
        }
    }
}
