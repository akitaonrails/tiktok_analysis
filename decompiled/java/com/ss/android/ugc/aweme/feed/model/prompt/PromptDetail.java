package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PromptDetail implements Serializable {
    public boolean buttonIfClick;
    public PromptDetailActionType detailActionType;
    public List<Integer> finalSelectedOptionIndex;

    @C09CT("interactive_rec_detail_tag_type")
    public Long interactiveRecDetailTagType;
    public List<Integer> intersectTriggers;
    public boolean intoAdjustPanel;

    @C09CT("prompt_options")
    public List<PromptOption> promptOptions;
    public boolean submitAdjustPanel;
    public boolean submitFreeformPanel;
    public boolean triggerButtonAdjust;

    @C09CT("triggers")
    public List<Integer> triggers;

    public PromptDetail() {
        this(null, null, null, null, null, false, false, false, false, false, null, 2047, null);
    }

    public final String getFixSurveyIdWithActionType() {
        PromptRecTagType curAwemeRecDetailTagType = getCurAwemeRecDetailTagType(true);
        PromptDetailActionType promptDetailActionType = this.detailActionType;
        PromptDetailActionType promptDetailActionType2 = PromptDetailActionType.MORE;
        if (promptDetailActionType == promptDetailActionType2 && curAwemeRecDetailTagType == PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_TRIGGER) {
            return "survey_7280363268353296386";
        }
        if (promptDetailActionType == promptDetailActionType2 && curAwemeRecDetailTagType == PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_RANDOM) {
            return "survey_7372124880257189904";
        }
        PromptDetailActionType promptDetailActionType3 = PromptDetailActionType.FEWER;
        return (promptDetailActionType == promptDetailActionType3 && curAwemeRecDetailTagType == PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_TRIGGER) ? "survey_7280480596332283906" : (promptDetailActionType == promptDetailActionType3 && curAwemeRecDetailTagType == PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_RANDOM) ? "survey_7372126702439024656" : "";
    }

    public final String getButtonIfClick() {
        return this.buttonIfClick ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final List<Integer> getOptionsTrack() {
        ArrayList arrayList = new ArrayList();
        if (this.triggerButtonAdjust) {
            arrayList.add(1);
        }
        Iterator<Integer> it2 = this.finalSelectedOptionIndex.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue == 0) {
                arrayList.add(2);
            } else if (iIntValue == 1) {
                arrayList.add(3);
            } else if (iIntValue == 2) {
                arrayList.add(4);
            } else if (iIntValue == 3) {
                arrayList.add(5);
            }
        }
        if (this.submitFreeformPanel) {
            arrayList.add(6);
        }
        return arrayList;
    }

    private final List<PromptOption> getCurAwemePromptOptions(boolean z) {
        return this.promptOptions;
    }

    public final PromptOption getCurAwemeI2iOption(boolean z) {
        List<PromptOption> curAwemePromptOptions = getCurAwemePromptOptions(z);
        PromptOption promptOption = null;
        if (curAwemePromptOptions == null) {
            return null;
        }
        Iterator<PromptOption> it2 = curAwemePromptOptions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PromptOption next = it2.next();
            if (next.promptType == 1) {
                promptOption = next;
                break;
            }
        }
        return promptOption;
    }

    public final PromptRecTagType getCurAwemeRecDetailTagType(boolean z) {
        Long l = this.interactiveRecDetailTagType;
        if (l != null) {
            return PromptResultKt.toRecTagType(l.longValue());
        }
        return null;
    }

    public final List<PromptOption> getCurAwemeTagOptions(boolean z) {
        ArrayList arrayList;
        List<PromptOption> curAwemePromptOptions = getCurAwemePromptOptions(z);
        if (curAwemePromptOptions != null) {
            arrayList = new ArrayList();
            for (PromptOption promptOption : curAwemePromptOptions) {
                if (promptOption.promptType == 3) {
                    arrayList.add(promptOption);
                }
            }
            if (arrayList.size() != 4) {
            }
            return arrayList;
        }
        arrayList = null;
        if (z) {
            return null;
        }
        return arrayList;
    }

    public final void setButtonIfClick(boolean z) {
        this.buttonIfClick = z;
    }

    public final void setDetailActionType(PromptDetailActionType promptDetailActionType) {
        this.detailActionType = promptDetailActionType;
    }

    public final void setFinalSelectedOptionIndex(List<Integer> list) {
        this.finalSelectedOptionIndex = list;
    }

    public final void setIntersectTriggers(List<Integer> list) {
        this.intersectTriggers = list;
    }

    public final void setIntoAdjustPanel(boolean z) {
        this.intoAdjustPanel = z;
    }

    public final void setPromptOptions(List<PromptOption> list) {
        this.promptOptions = list;
    }

    public final void setSubmitAdjustPanel(boolean z) {
        this.submitAdjustPanel = z;
    }

    public final void setSubmitFreeformPanel(boolean z) {
        this.submitFreeformPanel = z;
    }

    public final void setTriggerButtonAdjust(boolean z) {
        this.triggerButtonAdjust = z;
    }

    public final void setTriggers(List<Integer> list) {
        this.triggers = list;
    }

    public PromptDetail(List<PromptOption> list, List<Integer> list2, Long l, PromptDetailActionType promptDetailActionType, List<Integer> list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<Integer> list4) {
        this.promptOptions = list;
        this.triggers = list2;
        this.interactiveRecDetailTagType = l;
        this.detailActionType = promptDetailActionType;
        this.intersectTriggers = list3;
        this.buttonIfClick = z;
        this.triggerButtonAdjust = z2;
        this.intoAdjustPanel = z3;
        this.submitAdjustPanel = z4;
        this.submitFreeformPanel = z5;
        this.finalSelectedOptionIndex = list4;
    }

    public PromptDetail(List list, List list2, Long l, PromptDetailActionType promptDetailActionType, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? PromptDetailActionType.MORE : promptDetailActionType, (i & 16) == 0 ? list3 : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) == 0 ? z5 : false, (i & 1024) != 0 ? C13BV.INSTANCE : list4);
    }
}
