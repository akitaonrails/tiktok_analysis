package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.ranking;

import X.C01GW;
import X.C09RC;
import X.C13LE;
import X.C1750140ve0;
import X.C19719912Dl;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRankHolder extends PdpHolder<RankInfo> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SeaPdpRankHolder(View view) {
        super(R.layout.awy, view, false);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 67));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        RankInfo rankInfo = (RankInfo) obj;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(String.valueOf(rankInfo.rankHint));
        SpannableString spannableString2 = new SpannableString(String.valueOf(rankInfo.rankLevelStr));
        if (spannableString2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 8;
        if (z && spannableString.length() > 0) {
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), 0, spannableString.length(), 33);
            C786410Ut5.p2(spannableString2, new C444920HcY(61, false), 0, spannableString2.length(), 33);
            SpannableString spannableString3 = new SpannableString(" · ");
            C786410Ut5.p2(spannableString3, new C444920HcY(42, false), 0, spannableString3.length(), 33);
            C09RC.LIZ(spannableStringBuilder, spannableString, spannableString3, spannableString2);
            ((TextView) this.itemView.findViewById(R.id.sq9)).setText(spannableStringBuilder);
            View viewFindViewById = this.itemView.findViewById(R.id.h75);
            String str = rankInfo.schema;
            if (str != null && !a0.LJJJIL(str)) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.h75));
        }
        C786410Ut5.I7(new AjS40S0200000_1(rankInfo, this, 46), this.itemView);
        C1750140ve0.LIZ(this.itemView, false);
    }
}
