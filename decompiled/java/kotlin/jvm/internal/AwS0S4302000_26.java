package kotlin.jvm.internal;

import X.C09AY;
import X.C1761230vvt;
import X.C1761290vvz;
import X.C1761300vw0;
import X.EnumC1760580vuq;
import X.InterfaceC1053404Aa;
import X.InterfaceC1748820vbs;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS0S4302000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i7;
    public int i8;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS0S4302000_26 awS0S4302000_26, Object obj) {
        Object uri;
        Object objValueOf;
        Object obj2;
        int i;
        int length;
        Map<String, ? extends Object> mapLJ;
        Integer num;
        String str;
        Video video;
        Double d;
        Video video2;
        Object obj3;
        Image image;
        LaneParams laneParams = (LaneParams) obj;
        C1761230vvt c1761230vvt = (C1761230vvt) awS0S4302000_26.l4;
        String str2 = awS0S4302000_26.s0;
        c1761230vvt.getClass();
        C1761230vvt.LIZJ(laneParams, str2);
        laneParams.plusAssign("page_name", ((InterfaceC1748820vbs) awS0S4302000_26.l5).getPageName());
        laneParams.plusAssign("previous_page", awS0S4302000_26.s1);
        Object obj4 = awS0S4302000_26.s2;
        Object obj5 = "";
        if (obj4 == null) {
            obj4 = "";
        }
        laneParams.plusAssign("product_id", obj4);
        laneParams.plusAssign("quit_type", awS0S4302000_26.s3);
        int i2 = 1;
        laneParams.plusAssign("is_load_data", Integer.valueOf(!((C1761230vvt) awS0S4302000_26.l4).LJIIIZ.isEmpty() ? 1 : 0));
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((C1761230vvt) awS0S4302000_26.l4).LJI));
        laneParams.plusAssign("item_order", Integer.valueOf(awS0S4302000_26.i7));
        ReviewMedia reviewMedia = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (uri = image.getUri()) == null) {
            uri = "";
        }
        laneParams.plusAssign("photo_id", uri);
        ReviewMedia reviewMedia2 = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (obj3 = video2.id) != null) {
            obj5 = obj3;
        }
        laneParams.plusAssign("video_id", obj5);
        ReviewMedia reviewMedia3 = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            objValueOf = Double.valueOf(d.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            objValueOf = 0;
        }
        laneParams.plusAssign("whole_duration", objValueOf);
        laneParams.plusAssign("photo_cnt", Integer.valueOf(awS0S4302000_26.i8));
        C1761290vvz c1761290vvz = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz != null) {
            obj2 = c1761290vvz.LIZIZ;
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("rate", obj2);
        C1761290vvz c1761290vvz2 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz2 != null && c1761290vvz2.LJIIIIZZ) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i));
        C1761230vvt c1761230vvt2 = (C1761230vvt) awS0S4302000_26.l4;
        C1761290vvz c1761290vvz3 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        c1761230vvt2.getClass();
        C1761230vvt.LIZLLL(laneParams, c1761290vvz3);
        C1761290vvz c1761290vvz4 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz4 != null && (str = c1761290vvz4.LJIJ) != null) {
            length = str.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        C1761290vvz c1761290vvz5 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz5 == null || !c1761290vvz5.LJIJI) {
            i2 = 0;
        }
        laneParams.plusAssign("is_local", Integer.valueOf(i2));
        C1761290vvz c1761290vvz6 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz6 != null && (num = c1761290vvz6.LJIILJJIL) != null) {
            laneParams.plusAssign("is_third_party", Integer.valueOf(num.intValue()));
        }
        InterfaceC1053404Aa interfaceC1053404Aa = ((C1761230vvt) awS0S4302000_26.l4).LIZJ;
        if (interfaceC1053404Aa != null && (mapLJ = interfaceC1053404Aa.LJ("a2270.b0293")) != null) {
            laneParams.withParamsGroup(mapLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4302000_26 awS0S4302000_26, Object obj) {
        Object uri;
        Object objValueOf;
        Object obj2;
        int i;
        int length;
        Integer num;
        String str;
        Video video;
        Double d;
        Video video2;
        Object obj3;
        Image image;
        LaneParams laneParams = (LaneParams) obj;
        C1761230vvt c1761230vvt = (C1761230vvt) awS0S4302000_26.l4;
        String str2 = awS0S4302000_26.s0;
        c1761230vvt.getClass();
        C1761230vvt.LIZJ(laneParams, str2);
        laneParams.plusAssign("page_name", awS0S4302000_26.s1);
        Integer num2 = (Integer) awS0S4302000_26.l5;
        int type = EnumC1760580vuq.SHOP_TAB_REVIEW_GALLERY.getType();
        if (num2 != null && num2.intValue() == type) {
            laneParams.plusAssign("previous_page", "shop");
        }
        Object obj4 = awS0S4302000_26.s2;
        Object obj5 = "";
        if (obj4 == null) {
            obj4 = "";
        }
        laneParams.plusAssign("product_id", obj4);
        laneParams.plusAssign("quit_type", awS0S4302000_26.s3);
        int i2 = 1;
        laneParams.plusAssign("is_load_data", Integer.valueOf(!((C1761230vvt) awS0S4302000_26.l4).LJIIIZ.isEmpty() ? 1 : 0));
        laneParams.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((C1761230vvt) awS0S4302000_26.l4).LJ));
        laneParams.plusAssign("item_order", Integer.valueOf(awS0S4302000_26.i7));
        ReviewMedia reviewMedia = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (uri = image.getUri()) == null) {
            uri = "";
        }
        laneParams.plusAssign("photo_id", uri);
        ReviewMedia reviewMedia2 = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (obj3 = video2.id) != null) {
            obj5 = obj3;
        }
        laneParams.plusAssign("video_id", obj5);
        ReviewMedia reviewMedia3 = ((C1761300vw0) awS0S4302000_26.l6).LIZ;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            objValueOf = Double.valueOf(d.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            objValueOf = 0;
        }
        laneParams.plusAssign("whole_duration", objValueOf);
        laneParams.plusAssign("photo_cnt", Integer.valueOf(awS0S4302000_26.i8));
        C1761290vvz c1761290vvz = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz != null) {
            obj2 = c1761290vvz.LIZIZ;
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("rate", obj2);
        C1761290vvz c1761290vvz2 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz2 != null && c1761290vvz2.LJIIIIZZ) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i));
        C1761230vvt c1761230vvt2 = (C1761230vvt) awS0S4302000_26.l4;
        C1761290vvz c1761290vvz3 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        c1761230vvt2.getClass();
        C1761230vvt.LIZLLL(laneParams, c1761290vvz3);
        C1761290vvz c1761290vvz4 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz4 != null && (str = c1761290vvz4.LJIJ) != null) {
            length = str.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        C1761290vvz c1761290vvz5 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz5 == null || !c1761290vvz5.LJIJI) {
            i2 = 0;
        }
        laneParams.plusAssign("is_local", Integer.valueOf(i2));
        C1761290vvz c1761290vvz6 = ((C1761300vw0) awS0S4302000_26.l6).LIZIZ;
        if (c1761290vvz6 != null && (num = c1761290vvz6.LJIILJJIL) != null) {
            laneParams.plusAssign("is_third_party", Integer.valueOf(num.intValue()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4302000_26(C1761230vvt c1761230vvt, String str, InterfaceC1748820vbs interfaceC1748820vbs, String str2, String str3, String str4, int i, C1761300vw0 c1761300vw0, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l4 = c1761230vvt;
        this.s0 = str;
        this.l5 = interfaceC1748820vbs;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.i7 = i;
        this.l6 = c1761300vw0;
        this.i8 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4302000_26(C1761230vvt c1761230vvt, String str, String str2, Integer num, String str3, String str4, int i, C1761300vw0 c1761300vw0, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l4 = c1761230vvt;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = num;
        this.s2 = str3;
        this.s3 = str4;
        this.i7 = i;
        this.l6 = c1761300vw0;
        this.i8 = i2;
    }
}
