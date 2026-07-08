package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoSearchCarryInItem {

    @C09CT("bings")
    public final List<SearchBingItem> bings;

    @C09CT("event_tacker")
    public final TakoEventTracker eventTracker;

    @C09CT("images")
    public final List<TakoImageItem> images;

    @C09CT("placehodler_awemes")
    public final List<Aweme> placeholderAwemes;

    @C09CT("placeholder_sources")
    public HashMap<String, String> placeholderSources;

    @C09CT("references")
    public final List<ReferenceItemBridge> references;

    @C09CT("sugs")
    public final List<String> sugs;

    @C09CT("text")
    public final String text;

    @C09CT("videos")
    public final List<Aweme> videos;

    public TakoSearchCarryInItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSearchCarryInItem)) {
            return false;
        }
        TakoSearchCarryInItem takoSearchCarryInItem = (TakoSearchCarryInItem) obj;
        return Intrinsics.LJFF(this.text, takoSearchCarryInItem.text) && Intrinsics.LJFF(this.videos, takoSearchCarryInItem.videos) && Intrinsics.LJFF(this.bings, takoSearchCarryInItem.bings) && Intrinsics.LJFF(this.images, takoSearchCarryInItem.images) && Intrinsics.LJFF(this.references, takoSearchCarryInItem.references) && Intrinsics.LJFF(this.placeholderSources, takoSearchCarryInItem.placeholderSources) && Intrinsics.LJFF(this.placeholderAwemes, takoSearchCarryInItem.placeholderAwemes) && Intrinsics.LJFF(this.sugs, takoSearchCarryInItem.sugs) && Intrinsics.LJFF(this.eventTracker, takoSearchCarryInItem.eventTracker);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSearchCarryInItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", videos=");
        sbLIZ.append(this.videos);
        sbLIZ.append(", bings=");
        sbLIZ.append(this.bings);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", references=");
        sbLIZ.append(this.references);
        sbLIZ.append(", placeholderSources=");
        sbLIZ.append(this.placeholderSources);
        sbLIZ.append(", placeholderAwemes=");
        sbLIZ.append(this.placeholderAwemes);
        sbLIZ.append(", sugs=");
        sbLIZ.append(this.sugs);
        sbLIZ.append(", eventTracker=");
        sbLIZ.append(this.eventTracker);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakoSearchCarryInItem(String str, List<? extends Aweme> list, List<SearchBingItem> list2, List<TakoImageItem> list3, List<ReferenceItemBridge> list4, HashMap<String, String> map, List<? extends Aweme> list5, List<String> list6, TakoEventTracker takoEventTracker) {
        this.text = str;
        this.videos = list;
        this.bings = list2;
        this.images = list3;
        this.references = list4;
        this.placeholderSources = map;
        this.placeholderAwemes = list5;
        this.sugs = list6;
        this.eventTracker = takoEventTracker;
    }

    public TakoSearchCarryInItem(String str, List list, List list2, List list3, List list4, HashMap map, List list5, List list6, TakoEventTracker takoEventTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3, (i & 16) != 0 ? C13BV.INSTANCE : list4, (i & 32) != 0 ? new HashMap() : map, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? C13BV.INSTANCE : list6, (i & 256) == 0 ? takoEventTracker : null);
    }
}
