package kotlin.jvm.internal;

import X.C062P;
import X.C062U;
import X.C09AY;
import X.C1186970gzf;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.groupcreation.assem.PublicGroupCreationAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.postcard.PoiLimitedPostAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS57S0210000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S0210000_2 awS57S0210000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        ChooseCollectionSheetFragment chooseCollectionSheetFragment = (ChooseCollectionSheetFragment) awS57S0210000_2.l0;
        assembler.DQ2(chooseCollectionSheetFragment, new AwS105S0110000_18(awS57S0210000_2.z2, chooseCollectionSheetFragment, 2));
        assembler.QQ2((ChooseCollectionSheetFragment) awS57S0210000_2.l0, new AwS581S0100000_2((View) awS57S0210000_2.l1, 170));
        assembler.QQ2((ChooseCollectionSheetFragment) awS57S0210000_2.l0, new AwS581S0100000_2((View) awS57S0210000_2.l1, 171));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0210000_2 awS57S0210000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        if (awS57S0210000_2.z2) {
            assembler.RQ2((PublicGroupCreationAssem) awS57S0210000_2.l0, AFwS229S0000000_2.get$arr$(192));
        } else {
            assembler.RQ2((PublicGroupCreationAssem) awS57S0210000_2.l0, AFwS229S0000000_2.get$arr$(193));
            assembler.QQ2((PublicGroupCreationAssem) awS57S0210000_2.l0, new AwS581S0100000_2((View) awS57S0210000_2.l1, 193));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S0210000_2 awS57S0210000_2, Object obj) {
        String str;
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C062U((PoiShopBookingInfo) awS57S0210000_2.l0, (C1186970gzf) awS57S0210000_2.l1, 4);
        if (awS57S0210000_2.z2) {
            str = "PoiDetailHeaderShopFirstCtaHierarchyData";
        } else {
            str = "PoiDetailHeaderShopSecondCtaHierarchyData";
        }
        c062p.LIZIZ = str;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS57S0210000_2 awS57S0210000_2, Object obj) {
        ((C062P) obj).LIZ = new C062U((PoiShopBookingInfo) awS57S0210000_2.l0, (C1186970gzf) awS57S0210000_2.l1, awS57S0210000_2.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS57S0210000_2 awS57S0210000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiLimitedPostAssem poiLimitedPostAssem = (PoiLimitedPostAssem) awS57S0210000_2.l0;
        assembler.EQ2(poiLimitedPostAssem, new AwS384S0200000_18((PoiListApi.PoiMergedListResponse) awS57S0210000_2.l1, poiLimitedPostAssem, 103));
        assembler.QQ2((PoiLimitedPostAssem) awS57S0210000_2.l0, new AwS17S0010000_2(awS57S0210000_2.z2, 3));
        Integer scrollType = ((PoiListApi.PoiMergedListResponse) awS57S0210000_2.l1).getScrollType();
        if (scrollType != null && scrollType.intValue() == 1) {
            assembler.RQ2((PoiLimitedPostAssem) awS57S0210000_2.l0, AFwS229S0000000_2.get$arr$(456));
        } else {
            assembler.RQ2((PoiLimitedPostAssem) awS57S0210000_2.l0, AFwS229S0000000_2.get$arr$(457));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0210000_2(ChooseCollectionSheetFragment chooseCollectionSheetFragment, boolean z, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = chooseCollectionSheetFragment;
        this.z2 = z;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0210000_2(PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiShopBookingInfo;
        this.l1 = c1186970gzf;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0210000_2(PoiLimitedPostAssem poiLimitedPostAssem, PoiListApi.PoiMergedListResponse poiMergedListResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiLimitedPostAssem;
        this.l1 = poiMergedListResponse;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0210000_2(boolean z, PublicGroupCreationAssem publicGroupCreationAssem, View view, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = publicGroupCreationAssem;
        this.l1 = view;
    }
}
