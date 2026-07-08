package kotlin.jvm.internal;

import X.C09AY;
import X.C13IQ;
import X.C20248814Kw;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS9S2300000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S2300000_18 awS9S2300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        SlashPowerListCellGroupCommonReusedAssem slashPowerListCellGroupCommonReusedAssem = (SlashPowerListCellGroupCommonReusedAssem) awS9S2300000_18.l2;
        assembler.EQ2(slashPowerListCellGroupCommonReusedAssem, new AwS132S1100000_18(slashPowerListCellGroupCommonReusedAssem, awS9S2300000_18.s0, 12));
        assembler.RQ2((SlashPowerListCellGroupCommonReusedAssem) awS9S2300000_18.l2, new AwS102S1200000_18((C13IQ) awS9S2300000_18.l3, (C13IQ<? extends SlashCell<?>>) awS9S2300000_18.s1, (String) awS9S2300000_18.l4, (ViewGroup) 3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S2300000_18 awS9S2300000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((FrameLayout) awS9S2300000_18.l2, 2569);
        c20248814Kw.LIZIZ(new AwS40S2200000_18(awS9S2300000_18.s0, (PoiDetailTravelHeaderAssemV2) awS9S2300000_18.l3, (PoiListApi.PoiDetailResponse) awS9S2300000_18.l4, awS9S2300000_18.s1, 2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S2300000_18(FrameLayout frameLayout, String str, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = frameLayout;
        this.s0 = str;
        this.l3 = poiDetailTravelHeaderAssemV2;
        this.l4 = poiDetailResponse;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S2300000_18(SlashPowerListCellGroupCommonReusedAssem slashPowerListCellGroupCommonReusedAssem, SlashPowerListCellGroupCommonReusedAssem slashPowerListCellGroupCommonReusedAssem2, String str, C13IQ<? extends SlashCell<?>> c13iq, String str2, ViewGroup viewGroup) {
        super(1);
        this.$t = viewGroup;
        this.l2 = slashPowerListCellGroupCommonReusedAssem;
        this.s0 = slashPowerListCellGroupCommonReusedAssem2;
        this.l3 = str;
        this.s1 = c13iq;
        this.l4 = str2;
    }
}
