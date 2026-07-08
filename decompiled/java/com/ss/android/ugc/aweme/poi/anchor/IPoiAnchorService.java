package com.ss.android.ugc.aweme.poi.anchor;

import X.C13IQ;
import X.InterfaceC1631630sYr;
import X.InterfaceC702540Rh6;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IPoiAnchorService {
    int getIconResByABExp(boolean z);

    PoiAnchorButtonInfo getPoiAnchorCta(Aweme aweme);

    BottomBarPriorityProtocol getPoiBottomBarAssem();

    VideoBottomLabelProtocol getPoiCreatorBottomLabelTrigger();

    IPoiTagComponent getPoiTagComponent();

    <T> Function1<T, InterfaceC702540Rh6> getPoiTagPolicyProvider();

    Function0<C13IQ<? extends ReusedUISlotAssem<?>>> getPoiTagProvider();

    boolean isPoiAnchorView2(View view);

    void measureAnchorTexts(String str, TextView textView, String str2, TextView textView2, View view, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr);

    Boolean shouldAddNearbyExplore();

    boolean shouldShowCustomFeedSingleAnchor(Aweme aweme);

    boolean shouldShowOldFeedSingleAnchor(Aweme aweme);
}
