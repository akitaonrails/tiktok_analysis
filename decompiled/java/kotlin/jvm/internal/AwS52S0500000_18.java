package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C1171050gZz;
import X.C1183240gte;
import X.C1184490gvf;
import X.C1200260hL6;
import X.C1749280vcc;
import X.C197039127h;
import X.C19M4;
import X.C20248814Kw;
import X.C2046507zz;
import X.C291001Au;
import X.EnumC1198680hIY;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.AddVideoAssem;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarAssem;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarModule;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS52S0500000_18 extends C09AY implements Function1 {
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
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0500000_18 awS52S0500000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiRecommendFeatureBottomBarAssem) awS52S0500000_18.l0, new AwS227S0300000_18((PoiRecommendFeatureBottomBarModule) awS52S0500000_18.l1, (C1184490gvf) awS52S0500000_18.l2, (PoiButton) awS52S0500000_18.l3, 1));
        PoiRecommendFeatureBottomBarAssem poiRecommendFeatureBottomBarAssem = (PoiRecommendFeatureBottomBarAssem) awS52S0500000_18.l0;
        assembler.EQ2(poiRecommendFeatureBottomBarAssem, new AwS227S0300000_18(poiRecommendFeatureBottomBarAssem, (C1184490gvf) awS52S0500000_18.l2, (C1183240gte) awS52S0500000_18.l4, 2));
        assembler.RQ2((PoiRecommendFeatureBottomBarAssem) awS52S0500000_18.l0, AFwS229S0000000_2.get$arr$(14));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S0500000_18 awS52S0500000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS548S0100000_4((C19M4) awS52S0500000_18.l0, 21);
        c20248814Kw.LIZIZ(new AwS173S0400000_18((PoiDetailFoodHeaderAssem) awS52S0500000_18.l1, (PoiListApi.PoiDetailResponse) awS52S0500000_18.l2, (PoiListApi.PoiDetailResponse) awS52S0500000_18.l3, (PoiDetailTag) awS52S0500000_18.l4, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS52S0500000_18 awS52S0500000_18, Object obj) {
        AddVideoAssem addVideoAssem = (AddVideoAssem) awS52S0500000_18.l0;
        addVideoAssem.withState(addVideoAssem.Go(), new AwS35S0600000_18((C291001Au) obj, (C291001Au<? extends List<C1171050gZz>>) awS52S0500000_18.l0, (AddVideoAssem) awS52S0500000_18.l1, (View) awS52S0500000_18.l2, (C1749280vcc) awS52S0500000_18.l3, (Context) awS52S0500000_18.l4, (C197039127h) 0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS52S0500000_18 awS52S0500000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1200260hL6(C2046507zz.LIZ(((ExtensionMisc) awS52S0500000_18.l0).mobParam), (ExtensionMisc) awS52S0500000_18.l0, (PoiData) awS52S0500000_18.l1, ((PublishOutput) awS52S0500000_18.l2).mediaLocationMetaDataList, (EnumC1198680hIY) awS52S0500000_18.l3, (IAVPublishExtension.Callback) awS52S0500000_18.l4);
        c062p.LIZIZ = "PoiPublishExtensionDataV2";
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0500000_18(C19M4 c19m4, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, PoiListApi.PoiDetailResponse poiDetailResponse2, PoiDetailTag poiDetailTag, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19m4;
        this.l1 = poiDetailFoodHeaderAssem;
        this.l2 = poiDetailResponse;
        this.l3 = poiDetailResponse2;
        this.l4 = poiDetailTag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0500000_18(AddVideoAssem addVideoAssem, View view, C1749280vcc c1749280vcc, Context context, C197039127h c197039127h, int i) {
        super(1);
        this.$t = i;
        this.l0 = addVideoAssem;
        this.l1 = view;
        this.l2 = c1749280vcc;
        this.l3 = context;
        this.l4 = c197039127h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0500000_18(PoiRecommendFeatureBottomBarAssem poiRecommendFeatureBottomBarAssem, PoiRecommendFeatureBottomBarModule poiRecommendFeatureBottomBarModule, C1184490gvf c1184490gvf, PoiButton poiButton, C1183240gte c1183240gte, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiRecommendFeatureBottomBarAssem;
        this.l1 = poiRecommendFeatureBottomBarModule;
        this.l2 = c1184490gvf;
        this.l3 = poiButton;
        this.l4 = c1183240gte;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0500000_18(ExtensionMisc extensionMisc, PoiData poiData, PublishOutput publishOutput, EnumC1198680hIY enumC1198680hIY, IAVPublishExtension.Callback callback, int i) {
        super(1);
        this.$t = i;
        this.l0 = extensionMisc;
        this.l1 = poiData;
        this.l2 = publishOutput;
        this.l3 = enumC1198680hIY;
        this.l4 = callback;
    }
}
