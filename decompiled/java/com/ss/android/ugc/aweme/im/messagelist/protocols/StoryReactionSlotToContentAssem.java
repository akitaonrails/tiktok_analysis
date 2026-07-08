package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C723830SaL;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryReactionSlotToContentAssem extends ReusedUISlotAssem<StoryReactionSlotToContentAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cs9;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        IIMQuotedAreaService iIMQuotedAreaService = (IIMQuotedAreaService) PluggableExtentionKt.pluggableSpiForReal(IIMQuotedAreaService.class);
        if (iIMQuotedAreaService != null) {
            C723830SaL.LIZ(this, null, new AwS215S0300000_6(this, view, iIMQuotedAreaService, 1));
        }
    }
}
