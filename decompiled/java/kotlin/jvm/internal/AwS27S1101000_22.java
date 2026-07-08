package kotlin.jvm.internal;

import X.C09AY;
import X.C1431000nLG;
import X.C1446920nkw;
import X.InterfaceC2257101DWa;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS27S1101000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS27S1101000_22 awS27S1101000_22, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            IWaterMarkService iWaterMarkService = (IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class);
            InterfaceC2257101DWa interfaceC2257101DWa = (InterfaceC2257101DWa) awS27S1101000_22.l1;
            String str = awS27S1101000_22.s0;
            iWaterMarkService.addWaterMarkToImage(interfaceC2257101DWa, str, str, false, awS27S1101000_22.i2, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S1101000_22 awS27S1101000_22, Object obj) {
        int imageAIGCType;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        ((Boolean) obj).booleanValue();
        VideoPublishEditModel videoPublishEditModel = ((C1431000nLG) awS27S1101000_22.l1).LLIZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) ListProtector.get(imageList, awS27S1101000_22.i2)) != null) {
            imageAIGCType = singleImageData.getImageAIGCType();
        } else {
            imageAIGCType = 0;
        }
        C1446920nkw.LIZIZ(imageAIGCType, awS27S1101000_22.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S1101000_22(C1431000nLG c1431000nLG, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1431000nLG;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S1101000_22(InterfaceC2257101DWa interfaceC2257101DWa, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC2257101DWa;
        this.s0 = str;
        this.i2 = i;
    }
}
