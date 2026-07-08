package com.ss.android.ugc.aweme.story.note.prompt;

import X.C0C64;
import X.C0DZZ;
import X.C20580415g2;
import X.C20580615g4;
import X.EnumC19387610t8;
import android.content.Context;
import com.ss.android.ugc.aweme.social.thought.view.IThoughtBubblePromptResolver;

/* JADX INFO: loaded from: classes32.dex */
public final class ThoughtBubblePromptResolverImpl implements IThoughtBubblePromptResolver {
    @Override // com.ss.android.ugc.aweme.social.thought.view.IThoughtBubblePromptResolver
    public final C0DZZ LIZ(Context context, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "skip_holiday_prompt_for_thought_redesign", true) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20580415g2 c20580415g2LIZ = C20580615g4.LIZ(context, z2, z);
        String str = c20580415g2LIZ.LIZ;
        EnumC19387610t8 enumC19387610t8 = c20580415g2LIZ.LIZIZ;
        if (enumC19387610t8 == EnumC19387610t8.HOLIDAY || enumC19387610t8 == EnumC19387610t8.DYNAMIC) {
            z3 = true;
        }
        return new C0DZZ(str, z3);
    }
}
