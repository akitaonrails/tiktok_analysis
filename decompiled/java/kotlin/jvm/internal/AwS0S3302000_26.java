package kotlin.jvm.internal;

import X.C09AY;
import X.C1761230vvt;
import X.C1761290vvz;
import X.C1761300vw0;
import X.EnumC1760580vuq;
import X.InterfaceC1053404Aa;
import X.InterfaceC1748820vbs;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS0S3302000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S3302000_26 awS0S3302000_26, Object obj) {
        String uri;
        Object objValueOf;
        String str;
        int length;
        int i;
        Integer num;
        String str2;
        Video video;
        Double d;
        Video video2;
        String str3;
        Image image;
        LaneParams laneParams = (LaneParams) obj;
        C1761230vvt c1761230vvt = (C1761230vvt) awS0S3302000_26.l3;
        String str4 = awS0S3302000_26.s0;
        c1761230vvt.getClass();
        C1761230vvt.LIZJ(laneParams, str4);
        laneParams.plusAssign("page_name", awS0S3302000_26.s1);
        Integer num2 = (Integer) awS0S3302000_26.l4;
        int type = EnumC1760580vuq.SHOP_TAB_REVIEW_GALLERY.getType();
        if (num2 != null && num2.intValue() == type) {
            laneParams.plusAssign("previous_page", "shop");
        }
        String str5 = awS0S3302000_26.s2;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        laneParams.plusAssign("product_id", str5);
        laneParams.plusAssign("item_order", Integer.valueOf(awS0S3302000_26.i6));
        ReviewMedia reviewMedia = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (uri = image.getUri()) == null) {
            uri = "";
        }
        laneParams.plusAssign("photo_id", uri);
        ReviewMedia reviewMedia2 = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (str3 = video2.id) != null) {
            str6 = str3;
        }
        laneParams.plusAssign("video_id", str6);
        ReviewMedia reviewMedia3 = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        int i2 = 0;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            objValueOf = Double.valueOf(d.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            objValueOf = 0;
        }
        laneParams.plusAssign("whole_duration", objValueOf);
        laneParams.plusAssign("photo_cnt", Integer.valueOf(awS0S3302000_26.i7));
        C1761290vvz c1761290vvz = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz != null) {
            str = c1761290vvz.LIZIZ;
        } else {
            str = null;
        }
        laneParams.plusAssign("rate", str);
        C1761290vvz c1761290vvz2 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz2 != null && (str2 = c1761290vvz2.LJIJ) != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        C1761290vvz c1761290vvz3 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz3 != null && c1761290vvz3.LJIJI) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_local", Integer.valueOf(i));
        C1761290vvz c1761290vvz4 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz4 != null && c1761290vvz4.LJIIIIZZ) {
            i2 = 1;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i2));
        C1761290vvz c1761290vvz5 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz5 != null && (num = c1761290vvz5.LJIILJJIL) != null) {
            laneParams.plusAssign("is_third_party", Integer.valueOf(num.intValue()));
        }
        C1761230vvt c1761230vvt2 = (C1761230vvt) awS0S3302000_26.l3;
        C1761290vvz c1761290vvz6 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        c1761230vvt2.getClass();
        C1761230vvt.LIZLLL(laneParams, c1761290vvz6);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS0S3302000_26 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S3302000_26.invoke$1(kotlin.jvm.internal.AwS0S3302000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS0S3302000_26 awS0S3302000_26, Object obj) {
        String uri;
        Object objValueOf;
        String str;
        int length;
        int i;
        Map<String, Object> mapLJ;
        Integer num;
        String str2;
        Video video;
        Double d;
        Video video2;
        String str3;
        Image image;
        LaneParams laneParams = (LaneParams) obj;
        C1761230vvt c1761230vvt = (C1761230vvt) awS0S3302000_26.l3;
        String str4 = awS0S3302000_26.s0;
        c1761230vvt.getClass();
        C1761230vvt.LIZJ(laneParams, str4);
        laneParams.plusAssign("page_name", ((InterfaceC1748820vbs) awS0S3302000_26.l4).getPageName());
        laneParams.plusAssign("previous_page", awS0S3302000_26.s1);
        String str5 = awS0S3302000_26.s2;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        laneParams.plusAssign("product_id", str5);
        laneParams.plusAssign("item_order", Integer.valueOf(awS0S3302000_26.i6));
        ReviewMedia reviewMedia = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (uri = image.getUri()) == null) {
            uri = "";
        }
        laneParams.plusAssign("photo_id", uri);
        ReviewMedia reviewMedia2 = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (str3 = video2.id) != null) {
            str6 = str3;
        }
        laneParams.plusAssign("video_id", str6);
        ReviewMedia reviewMedia3 = ((C1761300vw0) awS0S3302000_26.l5).LIZ;
        int i2 = 0;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            objValueOf = Double.valueOf(d.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            objValueOf = 0;
        }
        laneParams.plusAssign("whole_duration", objValueOf);
        laneParams.plusAssign("photo_cnt", Integer.valueOf(awS0S3302000_26.i7));
        C1761290vvz c1761290vvz = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz != null) {
            str = c1761290vvz.LIZIZ;
        } else {
            str = null;
        }
        laneParams.plusAssign("rate", str);
        C1761290vvz c1761290vvz2 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz2 != null && (str2 = c1761290vvz2.LJIJ) != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        C1761290vvz c1761290vvz3 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz3 != null && c1761290vvz3.LJIJI) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_local", Integer.valueOf(i));
        C1761290vvz c1761290vvz4 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz4 != null && c1761290vvz4.LJIIIIZZ) {
            i2 = 1;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i2));
        C1761290vvz c1761290vvz5 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        if (c1761290vvz5 != null && (num = c1761290vvz5.LJIILJJIL) != null) {
            laneParams.plusAssign("is_third_party", Integer.valueOf(num.intValue()));
        }
        C1761230vvt c1761230vvt2 = (C1761230vvt) awS0S3302000_26.l3;
        C1761290vvz c1761290vvz6 = ((C1761300vw0) awS0S3302000_26.l5).LIZIZ;
        c1761230vvt2.getClass();
        C1761230vvt.LIZLLL(laneParams, c1761290vvz6);
        InterfaceC1053404Aa interfaceC1053404Aa = ((C1761230vvt) awS0S3302000_26.l3).LIZJ;
        if (interfaceC1053404Aa != null && (mapLJ = interfaceC1053404Aa.LJ("a2270.b0293")) != null) {
            laneParams.withParamsGroup(mapLJ);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S3302000_26(int r3, int r4, X.C1761230vvt r5, X.C1761300vw0 r6, X.InterfaceC1748820vbs r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r2 = this;
            r2.$t = r11
            int r11 = 1 - r11
            if (r11 == 0) goto L1c
            r1 = r2
            r1.l3 = r5
            r1.s0 = r8
            r1.l4 = r7
            r1.s1 = r9
            r1.s2 = r10
            r1.i6 = r3
            r1.l5 = r6
            r1.i7 = r4
            r0 = 1
        L18:
            r1.<init>(r0)
            return
        L1c:
            r1 = r2
            r1.l3 = r5
            r1.s0 = r8
            r1.l4 = r7
            r1.s1 = r9
            r1.l5 = r6
            r1.i6 = r3
            r1.s2 = r10
            r1.i7 = r4
            r0 = 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S3302000_26.<init>(int, int, X.0vvt, X.0vw0, X.0vbs, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3302000_26(C1761230vvt c1761230vvt, String str, String str2, Integer num, String str3, int i, C1761300vw0 c1761300vw0, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l3 = c1761230vvt;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = num;
        this.s2 = str3;
        this.i6 = i;
        this.l5 = c1761300vw0;
        this.i7 = i2;
    }
}
