package kotlin.jvm.internal;

import X.AbstractC468201s0;
import X.C09AY;
import X.C1163440gNi;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C13LE;
import X.C438710HIf;
import X.C628830OlV;
import X.EnumC1338240kve;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.detail.prefab.DetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import com.ss.android.ugc.aweme.template.datamodel.TemplateBannerModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplatePugcCreatorStatisticModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS6S0410000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS6S0410000_6 awS6S0410000_6, Object obj) {
        Integer show;
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailHeaderAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJII("basic_info", new AwS94S0110000_6((TemplateDetailModel) awS6S0410000_6.l2, awS6S0410000_6.z4, 2));
        TemplatePugcCreatorStatisticModel templatePugcCreatorStatisticModel = (TemplatePugcCreatorStatisticModel) awS6S0410000_6.l0;
        if ((templatePugcCreatorStatisticModel != null && (show = templatePugcCreatorStatisticModel.getShow()) != null && show.intValue() > 0) || ((TemplateBannerModel) awS6S0410000_6.l1) != null) {
            c628830OlV.LJII("advanced_info", new AwS104S0400000_6((TemplatePugcCreatorStatisticModel) awS6S0410000_6.l0, (TemplateBannerModel) awS6S0410000_6.l1, (TemplateDetailFragment) awS6S0410000_6.l3, (TemplateDetailModel) awS6S0410000_6.l2, 5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0410000_6 awS6S0410000_6, Object obj) {
        ((Number) obj).intValue();
        C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_detail", "poi_detail_top_video_bg", null).LIZ(C438710HIf.LIZ(((PoiHeaderTopVideosModule) awS6S0410000_6.l0).getMultiMediumBackgroundImg()));
        c1189360h3WLIZ.LIZ.LJJIJL((Context) awS6S0410000_6.l1);
        c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        PoiHeaderTopVideosAssem poiHeaderTopVideosAssem = (PoiHeaderTopVideosAssem) awS6S0410000_6.l2;
        SmartImageView smartImageView = poiHeaderTopVideosAssem.LLJJJIL;
        if (smartImageView != null) {
            int width = smartImageView.getWidth();
            SmartImageView smartImageView2 = poiHeaderTopVideosAssem.LLJJJIL;
            if (smartImageView2 != null) {
                int height = smartImageView2.getHeight();
                if (width > 0 && height > 0) {
                    c1189360h3WLIZ.LJI(width, height);
                }
            }
        }
        final PoiHeaderTopVideosAssem poiHeaderTopVideosAssem2 = (PoiHeaderTopVideosAssem) awS6S0410000_6.l2;
        final boolean z = awS6S0410000_6.z4;
        final Drawable drawable = (Drawable) awS6S0410000_6.l3;
        final Context context = (Context) awS6S0410000_6.l1;
        c1189360h3WLIZ.LIZ.LJJIIJ(new AbstractC468201s0() { // from class: X.0Gym
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(poiHeaderTopVideosAssem2), C0PEM.LIZJ, null, new C433210Gyl(bitmap, z, poiHeaderTopVideosAssem2, drawable, context, null), 2);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                SmartImageView smartImageView3 = poiHeaderTopVideosAssem2.LLJJJIL;
                if (smartImageView3 != null) {
                    smartImageView3.setImageDrawable(drawable);
                }
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0410000_6(PoiHeaderTopVideosModule poiHeaderTopVideosModule, Context context, PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, boolean z, Drawable drawable, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiHeaderTopVideosModule;
        this.l1 = context;
        this.l2 = poiHeaderTopVideosAssem;
        this.z4 = z;
        this.l3 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0410000_6(TemplateDetailFragment templateDetailFragment, TemplateBannerModel templateBannerModel, TemplateDetailModel templateDetailModel, TemplatePugcCreatorStatisticModel templatePugcCreatorStatisticModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templatePugcCreatorStatisticModel;
        this.l1 = templateBannerModel;
        this.l2 = templateDetailModel;
        this.z4 = z;
        this.l3 = templateDetailFragment;
    }
}
