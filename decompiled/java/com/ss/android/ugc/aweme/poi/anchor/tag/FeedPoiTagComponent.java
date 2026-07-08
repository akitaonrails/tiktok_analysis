package com.ss.android.ugc.aweme.poi.anchor.tag;

import X.C01GW;
import X.C0RF0;
import X.C1188960h2s;
import X.C1559260qg8;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C299590Boj;
import X.C339190DRl;
import X.C426750GoL;
import X.C452501pT;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C704020RjU;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC702820RhY;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.feed.platform.ab.UnifyTagStyleExpData;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPoiTagComponent extends BaseCellSlotComponent<FeedPoiTagComponent> implements InterfaceC702820RhY {
    public C1188960h2s LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 516));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e9d;
    }

    @Override // X.InterfaceC702820RhY
    public final void mk() {
    }

    @Override // X.InterfaceC702820RhY
    public final void E2() {
        C1188960h2s c1188960h2s = this.LLJLLIL;
        if (c1188960h2s != null) {
            c1188960h2s.LIZIZ();
        }
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> Pi() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> R9() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> u8() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        TuxTextView dividerView;
        TuxTextView subTitleView;
        TuxTextView titleView;
        SmartImageView tagIcon;
        int i;
        super.onViewCreated(view);
        C1188960h2s c1188960h2s = (C1188960h2s) view.findViewById(R.id.x24);
        this.LLJLLIL = c1188960h2s;
        if (c1188960h2s != null) {
            c1188960h2s.LIZJ(false);
        }
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (C704010RjT.LJ(str)) {
            C1188960h2s c1188960h2s2 = this.LLJLLIL;
            if (c1188960h2s2 != null && (tagIcon = c1188960h2s2.getTagIcon()) != null) {
                ViewGroup.LayoutParams layoutParams = tagIcon.getLayoutParams();
                UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
                if (unifyTagStyleExpDataLIZ != null) {
                    i = unifyTagStyleExpDataLIZ.iconSizeDp;
                } else {
                    i = 12;
                }
                int iLIZ = (int) C339190DRl.LIZ(i);
                layoutParams.width = iLIZ;
                layoutParams.height = iLIZ;
                C786410Ut5.G6(tagIcon, layoutParams);
            }
            C1188960h2s c1188960h2s3 = this.LLJLLIL;
            if (c1188960h2s3 != null && (titleView = c1188960h2s3.getTitleView()) != null) {
                C704010RjT.LIZLLL(titleView);
            }
            C1188960h2s c1188960h2s4 = this.LLJLLIL;
            if (c1188960h2s4 != null && (subTitleView = c1188960h2s4.getSubTitleView()) != null) {
                C704010RjT.LIZLLL(subTitleView);
            }
            C1188960h2s c1188960h2s5 = this.LLJLLIL;
            if (c1188960h2s5 != null && (dividerView = c1188960h2s5.getDividerView()) != null) {
                C704010RjT.LIZLLL(dividerView);
            }
            C1188960h2s c1188960h2s6 = this.LLJLLIL;
            if (c1188960h2s6 != null) {
                float f = 2;
                C426750GoL.LJIIL(c1188960h2s6, null, Integer.valueOf((int) C339190DRl.LIZ(f)), null, Integer.valueOf((int) C339190DRl.LIZ(f)), 21);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        PoiDataStruct poiDataStruct;
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed onBind, ");
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null) {
            str = poiDataStruct.poiName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1188960h2s c1188960h2s = this.LLJLLIL;
        if (c1188960h2s != null) {
            c1188960h2s.LIZ(videoItemParams2.getAweme(), ((VideoItemParams) bo()).mEventType, (String) this.LLJLLL.getValue());
        }
    }
}
