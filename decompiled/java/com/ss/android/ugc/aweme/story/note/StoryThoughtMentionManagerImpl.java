package com.ss.android.ugc.aweme.story.note;

import X.C0FLJ;
import X.C0FMX;
import X.C0JCW;
import X.C0WZX;
import X.C13BV;
import X.C20584715gj;
import X.C20585615gs;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C298620BnA;
import X.C786410Ut5;
import X.InterfaceC1356670lPN;
import Y.AComparatorS513S0100000_14;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtMentionManagerImpl implements IStoryThoughtMentionManager {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C20584715gj LIZ;
    public final View LIZIZ;
    public final FrameLayout LIZJ;
    public final StoryThoughtCreationVM LIZLLL;
    public final StoryThoughtAvatarCreationVM LJ;
    public InterfaceC1356670lPN LJFF;
    public boolean LJI;
    public String LJII;
    public final List<C0FLJ> LJIIIIZZ;

    public StoryThoughtMentionManagerImpl() {
        this(null, null, null, null, null, 31);
    }

    public final List<StoryNoteTextExtra> LIZ() {
        Editable editableLLJILLL;
        C20585615gs[] c20585615gsArr;
        C20584715gj c20584715gj = this.LIZ;
        if (c20584715gj == null || (editableLLJILLL = C2204961BRm.LLJILLL(c20584715gj, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkjynXmSYc+Nz333g7LZNR6OMSNS9qPlwsnufjfZp928bxwGT", null))) == null) {
            return C13BV.INSTANCE;
        }
        if (editableLLJILLL.length() == 0) {
            c20585615gsArr = new C20585615gs[0];
        } else {
            c20585615gsArr = (C20585615gs[]) editableLLJILLL.getSpans(0, editableLLJILLL.length(), C20585615gs.class);
            Arrays.sort(c20585615gsArr, new AComparatorS513S0100000_14(editableLLJILLL, 10));
        }
        ArrayList arrayList = new ArrayList();
        for (C20585615gs c20585615gs : c20585615gsArr) {
            String str = c20585615gs.LLILLJJLI.nickname;
            if (str == null) {
                str = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(C0FMX.LJ(str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (TextUtils.equals(strLIZIZ, editableLLJILLL.subSequence(editableLLJILLL.getSpanStart(c20585615gs), editableLLJILLL.getSpanEnd(c20585615gs)).toString())) {
                arrayList.add(c20585615gs.LLILLJJLI);
            } else {
                IntRange intRangeLIZ = C0JCW.LIZ(c20584715gj, strLIZIZ);
                if (intRangeLIZ != null) {
                    int i = intRangeLIZ.LL;
                    int i2 = intRangeLIZ.LLILLJJLI;
                    StoryNoteTextExtra storyNoteTextExtra = c20585615gs.LLILLJJLI;
                    arrayList.add(new StoryNoteTextExtra(1, Integer.valueOf(i), Integer.valueOf(i2), storyNoteTextExtra.userId, storyNoteTextExtra.secUid, C0FMX.LJ(str), c20585615gs.LLILLJJLI.avatar));
                }
            }
        }
        return arrayList;
    }

    public final void LIZIZ() {
        if (C298620BnA.LIZ()) {
            try {
                View view = this.LIZIZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                InterfaceC1356670lPN interfaceC1356670lPN = this.LJFF;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.Hi(8, false);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hideMentionList() - Failed to hide mention list with error message: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final void LIZJ(String str) {
        String str2;
        if (C298620BnA.LIZ()) {
            try {
                if (str.length() == 0) {
                    str2 = "caption_mode";
                } else {
                    str2 = "caption_mode_click_button";
                }
                InterfaceC1356670lPN interfaceC1356670lPN = this.LJFF;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.Ml(str, str2, false);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("searchMentionList() - Failed to search mention list with error message: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final void LIZLLL(List<StoryNoteTextExtra> list) {
        List<StoryNoteTextExtra> mentionText;
        StoryNoteTextExtra next;
        Integer num;
        C20584715gj c20584715gj = this.LIZ;
        if (c20584715gj == null || (mentionText = c20584715gj.getMentionText()) == null) {
            mentionText = C13BV.INSTANCE;
        }
        C20584715gj c20584715gj2 = this.LIZ;
        if (c20584715gj2 != null) {
            c20584715gj2.setMentionText(list);
        }
        Iterator<StoryNoteTextExtra> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!mentionText.contains(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        StoryNoteTextExtra storyNoteTextExtra = next;
        if (storyNoteTextExtra != null && (num = storyNoteTextExtra.end) != null) {
            int iIntValue = num.intValue();
            C20584715gj c20584715gj3 = this.LIZ;
            if (c20584715gj3 != null) {
                c20584715gj3.setSelection(iIntValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryThoughtMentionManagerImpl(X.C20584715gj r21, android.view.View r22, android.widget.FrameLayout r23, com.ss.android.ugc.aweme.story.note.StoryThoughtCreationVM r24, com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM r25, int r26) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtMentionManagerImpl.<init>(X.15gj, android.view.View, android.widget.FrameLayout, com.ss.android.ugc.aweme.story.note.StoryThoughtCreationVM, com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM, int):void");
    }
}
