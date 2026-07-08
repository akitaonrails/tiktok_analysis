package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C452501pT;
import X.EnumC700430Rdh;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ScheduleBottomBarAssem extends BaseCellSlotComponent<ScheduleBottomBarAssem> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1218));
    public ViewGroup LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ba2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLJLLL = viewGroup;
        if (viewGroup != null) {
            setComponentClickStatusExperimental(viewGroup, EnumC700430Rdh.POSITIVE);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLJLLIL.getValue();
        if (rootCellCommonAbility != null) {
            rootCellCommonAbility.Ew2(this.LLJLLL);
        }
        videoItemParams2.getAweme();
        Aweme aweme = videoItemParams2.getAweme();
        String str = videoItemParams2.mEventType;
        if (!aweme.isAd() && AwemeExtKt.isScheduleVideo(aweme) && !TextUtils.equals(str, "homepage_follow")) {
            RootCellCommonAbility rootCellCommonAbility2 = (RootCellCommonAbility) this.LLJLLIL.getValue();
            if (rootCellCommonAbility2 != null) {
                rootCellCommonAbility2.mL0(this.LLJLLL);
                return;
            }
            return;
        }
        RootCellCommonAbility rootCellCommonAbility3 = (RootCellCommonAbility) this.LLJLLIL.getValue();
        if (rootCellCommonAbility3 == null) {
            return;
        }
        rootCellCommonAbility3.Ew2(this.LLJLLL);
    }
}
