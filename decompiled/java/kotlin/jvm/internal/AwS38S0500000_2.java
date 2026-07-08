package kotlin.jvm.internal;

import X.C09AY;
import X.C1186970gzf;
import X.C13IQ;
import X.C19719912Dl;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDetailHeaderDynamicButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDynamicShopButtonBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS38S0500000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS38S0500000_2 awS38S0500000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailHeaderDynamicButtonAssem) awS38S0500000_2.l0, new AwS368S0200000_2((PoiShopBookingInfo) awS38S0500000_2.l1, (C1186970gzf) awS38S0500000_2.l2, 1));
        assembler.RQ2((PoiDetailHeaderDynamicButtonAssem) awS38S0500000_2.l0, new AwS368S0200000_2((C13IQ) awS38S0500000_2.l3, (C13IQ<? extends PoiDynamicShopButtonBaseAssem>) awS38S0500000_2.l4, (FrameLayout) 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0500000_2 awS38S0500000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiScrollBottomBarComponent) awS38S0500000_2.l0, new AwS368S0200000_2((PoiShopBookingInfo) awS38S0500000_2.l1, (C1186970gzf) awS38S0500000_2.l2, 85));
        assembler.RQ2((PoiScrollBottomBarComponent) awS38S0500000_2.l0, new AwS368S0200000_2((C13IQ) awS38S0500000_2.l3, (C13IQ<? extends PoiDynamicShopButtonBaseAssem>) awS38S0500000_2.l4, (FrameLayout) 86));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0500000_2(PoiDetailHeaderDynamicButtonAssem poiDetailHeaderDynamicButtonAssem, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, C19719912Dl c19719912Dl, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailHeaderDynamicButtonAssem;
        this.l1 = poiShopBookingInfo;
        this.l2 = c1186970gzf;
        this.l3 = c19719912Dl;
        this.l4 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0500000_2(PoiScrollBottomBarComponent poiScrollBottomBarComponent, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, C19719912Dl c19719912Dl, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiScrollBottomBarComponent;
        this.l1 = poiShopBookingInfo;
        this.l2 = c1186970gzf;
        this.l3 = c19719912Dl;
        this.l4 = frameLayout;
    }
}
