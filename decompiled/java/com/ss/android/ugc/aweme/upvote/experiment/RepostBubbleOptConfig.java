package com.ss.android.ugc.aweme.upvote.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class RepostBubbleOptConfig {

    @C09CT("bubble_color_style")
    public final int bubbleColorStyle;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_note_guide")
    public final boolean enableNoteGuide;

    @C09CT("enable_two_line_note")
    public final boolean enableTwoLineNote;

    public RepostBubbleOptConfig() {
        this(false, 0, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostBubbleOptConfig)) {
            return false;
        }
        RepostBubbleOptConfig repostBubbleOptConfig = (RepostBubbleOptConfig) obj;
        return this.enable == repostBubbleOptConfig.enable && this.bubbleColorStyle == repostBubbleOptConfig.bubbleColorStyle && this.enableNoteGuide == repostBubbleOptConfig.enableNoteGuide && this.enableTwoLineNote == repostBubbleOptConfig.enableTwoLineNote;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enable) * 31) + this.bubbleColorStyle) * 31) + C786410Ut5.Z2(this.enableNoteGuide)) * 31) + C786410Ut5.Z2(this.enableTwoLineNote);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostBubbleOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", bubbleColorStyle=");
        sbLIZ.append(this.bubbleColorStyle);
        sbLIZ.append(", enableNoteGuide=");
        sbLIZ.append(this.enableNoteGuide);
        sbLIZ.append(", enableTwoLineNote=");
        sbLIZ.append(this.enableTwoLineNote);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostBubbleOptConfig(boolean z, int i, boolean z2, boolean z3) {
        this.enable = z;
        this.bubbleColorStyle = i;
        this.enableNoteGuide = z2;
        this.enableTwoLineNote = z3;
    }
}
