package kotlin.jvm.internal;

import X.C09AY;
import X.C1166990gTR;
import X.C20577315fX;
import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.poi.albummix.feed.PoiPhotoTextRootAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS7S3200000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S3200000_18 awS7S3200000_18) {
        ((PoiPhotoTextRootAssem) awS7S3200000_18.l3).ip((Uri) awS7S3200000_18.l4, awS7S3200000_18.s0, awS7S3200000_18.s1, awS7S3200000_18.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S3200000_18 awS7S3200000_18) {
        C1166990gTR c1166990gTR = (C1166990gTR) awS7S3200000_18.l3;
        C20577315fX c20577315fX = new C20577315fX(c1166990gTR.LLJJIJIIJIL, c1166990gTR.LLJJIJIL, awS7S3200000_18.s0, awS7S3200000_18.s1, awS7S3200000_18.s2, (CreativeInfo) awS7S3200000_18.l4);
        ((C1166990gTR) awS7S3200000_18.l3).add(R.id.u1_, c20577315fX, "EditPreviewStickerScene");
        return c20577315fX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3200000_18(C1166990gTR c1166990gTR, String str, String str2, String str3, CreativeInfo creativeInfo, int i) {
        super(0);
        this.$t = i;
        this.l3 = c1166990gTR;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = creativeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3200000_18(Uri uri, PoiPhotoTextRootAssem poiPhotoTextRootAssem, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.l3 = poiPhotoTextRootAssem;
        this.l4 = uri;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
