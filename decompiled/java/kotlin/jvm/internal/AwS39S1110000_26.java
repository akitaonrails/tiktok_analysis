package kotlin.jvm.internal;

import X.C09AY;
import X.C1764360w0w;
import X.C1766620w4a;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C1770530wAt;
import X.C957403oi;
import X.EnumC1770450wAl;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS39S1110000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
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
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        EnumC1770450wAl enumC1770450wAl = (EnumC1770450wAl) obj;
        if (awS39S1110000_26.z2) {
            C1770320wAY c1770320wAY = C1770320wAY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Aweme aweme = (Aweme) awS39S1110000_26.l1;
            String str = awS39S1110000_26.s0;
            linkedHashMap.put(Scene.SCENE_SERVICE, 2);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            linkedHashMap.put("aweme_id", aid);
            linkedHashMap.put("relation_type", Integer.valueOf(aweme.getProductRecallType()));
            linkedHashMap.put("enter_from", str);
            c1770320wAY.getClass();
            C1770320wAY.LJIIIIZZ(enumC1770450wAl, linkedHashMap, 11, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        return new C1770530wAt(awS39S1110000_26.s0, awS39S1110000_26.z2, (C1770220wAO) awS39S1110000_26.l1);
    }

    public static final Object invoke$2(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZJ("page_name", awS39S1110000_26.s0);
        c957403oi.LIZJ("cart_entry_from", (CartEntryFrom) awS39S1110000_26.l1);
        if (awS39S1110000_26.z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZJ("has_diff", str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        String str;
        String videoId;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("is_video", "1");
        if (awS39S1110000_26.z2) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        C1766620w4a c1766620w4a = ((C1764360w0w) awS39S1110000_26.l1).LLILZIL;
        if (c1766620w4a != null) {
            videoId = c1766620w4a.getVideoId();
        } else {
            videoId = null;
        }
        laneParams.plusAssign("photo_id", videoId);
        laneParams.plusAssign("photo_show_type", "main");
        laneParams.plusAssign("button_name", awS39S1110000_26.s0);
        laneParams.plusAssign("video_type", ((C1764360w0w) awS39S1110000_26.l1).getVideoType());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        String str;
        String videoId;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("is_video", "1");
        if (awS39S1110000_26.z2) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        C1766620w4a c1766620w4a = ((C1764360w0w) awS39S1110000_26.l1).LLILZIL;
        if (c1766620w4a != null) {
            videoId = c1766620w4a.getVideoId();
        } else {
            videoId = null;
        }
        laneParams.plusAssign("photo_id", videoId);
        laneParams.plusAssign("photo_show_type", "main");
        laneParams.plusAssign("button_name", awS39S1110000_26.s0);
        laneParams.plusAssign("video_type", ((C1764360w0w) awS39S1110000_26.l1).getVideoType());
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS39S1110000_26 awS39S1110000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        boolean z = awS39S1110000_26.z2;
        String str2 = awS39S1110000_26.s0;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        laneParams.plusAssign("save_type", str);
        laneParams.plusAssign("prompt_type", str2);
        laneParams.withParamsGroup((Map) awS39S1110000_26.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1110000_26(Aweme aweme, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1110000_26(String str, CartEntryFrom cartEntryFrom, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = cartEntryFrom;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1110000_26(String str, Map map, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1110000_26(String str, boolean z, C1770220wAO c1770220wAO, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = c1770220wAO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1110000_26(boolean z, C1764360w0w c1764360w0w, String str, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l1 = c1764360w0w;
        this.s0 = str;
    }
}
