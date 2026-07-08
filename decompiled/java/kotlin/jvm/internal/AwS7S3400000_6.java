package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0HTT;
import X.C0I0B;
import X.C1387490mD5;
import X.C418440Gaw;
import X.C454640HsE;
import X.C737030Svd;
import X.C814420VxA;
import X.EnumC454550Hs5;
import X.InterfaceC447740Hh6;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS7S3400000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
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

    public static final Object invoke$0(AwS7S3400000_6 awS7S3400000_6) {
        C0HTT c0htt = (C0HTT) awS7S3400000_6.l3;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, (Aweme) awS7S3400000_6.l4);
            c737030Svd.LJIJ = Boolean.valueOf(((C013C) awS7S3400000_6.l5).element);
            c0htt.LLIIL(c737030Svd);
        }
        C1387490mD5.LJFF(true, (Aweme) awS7S3400000_6.l4, awS7S3400000_6.s0, awS7S3400000_6.s1, awS7S3400000_6.s2, null, 224);
        Function0 function0 = (Function0) awS7S3400000_6.l6;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S3400000_6 awS7S3400000_6) {
        LinkedHashMap linkedHashMap;
        long jLongValue;
        Integer numValueOf;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        c454640HsE.LIZIZ().getImStickerAnalytics().setBizType("comment");
        Map map = (Map) awS7S3400000_6.l3;
        Integer numValueOf2 = null;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            Object obj = linkedHashMap.get("enter_method");
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put("comment_enter_method", obj);
            linkedHashMap.put("enter_method", "comment");
        }
        c454640HsE.LIZIZ().getImStickerInputPanelService().LJIIIIZZ((View) awS7S3400000_6.l4, (SetSticker) awS7S3400000_6.l5, awS7S3400000_6.s0, awS7S3400000_6.s1, awS7S3400000_6.s2, Integer.valueOf(EnumC454550Hs5.COMMENT_LIST.getType()), linkedHashMap, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(483))), (Function0) awS7S3400000_6.l6);
        InterfaceC447740Hh6 imStickerStoreService = c454640HsE.LIZIZ().getImStickerStoreService();
        Long setId = ((SetSticker) awS7S3400000_6.l5).getSetId();
        if (setId != null) {
            jLongValue = setId.longValue();
        } else {
            jLongValue = 0;
        }
        boolean zLJIIL = imStickerStoreService.LJIIL(jLongValue);
        InterfaceC447740Hh6 imStickerStoreService2 = c454640HsE.LIZIZ().getImStickerStoreService();
        StickerSubType stickerSubType = ((SetSticker) awS7S3400000_6.l5).getStickerSubType();
        if (stickerSubType != null) {
            numValueOf = Integer.valueOf(stickerSubType.ordinal());
        } else {
            numValueOf = null;
        }
        boolean zLJJIIZI = imStickerStoreService2.LJJIIZI(String.valueOf(numValueOf));
        InterfaceC447740Hh6 imStickerStoreService3 = c454640HsE.LIZIZ().getImStickerStoreService();
        StickerSubType stickerSubType2 = ((SetSticker) awS7S3400000_6.l5).getStickerSubType();
        if (stickerSubType2 != null) {
            numValueOf2 = Integer.valueOf(stickerSubType2.ordinal());
        }
        c454640HsE.LIZIZ().getImStickerAnalytics().LJIJI(awS7S3400000_6.s1, String.valueOf(((SetSticker) awS7S3400000_6.l5).getSetId()), zLJIIL, "comment", zLJJIIZI, imStickerStoreService3.LJIJI(String.valueOf(numValueOf2)), linkedHashMap, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3400000_6(Map map, View view, SetSticker setSticker, String str, String str2, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l3 = map;
        this.l4 = view;
        this.l5 = setSticker;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = "video_comment";
        this.l6 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S3400000_6(C0HTT c0htt, C0HTT<C737030Svd> c0htt2, Aweme aweme, C013C c013c, String str, String str2, String str3, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l3 = c0htt;
        this.l4 = c0htt2;
        this.l5 = aweme;
        this.s0 = c013c;
        this.s1 = str;
        this.s2 = str2;
        this.l6 = str3;
    }
}
