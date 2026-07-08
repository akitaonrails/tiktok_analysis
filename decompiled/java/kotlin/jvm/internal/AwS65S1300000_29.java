package kotlin.jvm.internal;

import X.AbstractC19531111bB;
import X.C013C;
import X.C09AY;
import X.C0CNO;
import X.C0FVT;
import X.C13LQ;
import X.C19530611b6;
import X.C19622411pu;
import X.C19622911pz;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.capcutpromotion.ButtonAction;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.ogc.news.anchor.INewsAnchorProducer;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS65S1300000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS65S1300000_29 awS65S1300000_29, Object obj) {
        ((TextStickerModel) awS65S1300000_29.l1).setTextStrWithLineBreak(C13LQ.LJJJ(((TextStickerTextWrap) obj).getStickerStringArray(), "\n", null, null, AFwS273S0000000_29.get$arr$(23), 30));
        TTSModel tTSModel = (TTSModel) awS65S1300000_29.l2;
        if (tTSModel != null && Intrinsics.LJFF(tTSModel.audioText, awS65S1300000_29.s0)) {
            AbstractC19531111bB.Z4((AbstractC19531111bB) awS65S1300000_29.l3, (TextStickerModel) awS65S1300000_29.l1, (TTSModel) awS65S1300000_29.l2, false, null, 12, null);
        }
        C0CNO.LIZLLL(0L, new AwS573S0100000_29((AbstractC19531111bB) awS65S1300000_29.l3, 48));
        C0FVT c0fvtD6 = ((AbstractC19531111bB) awS65S1300000_29.l3).d6();
        if (c0fvtD6 != null) {
            c0fvtD6.ll((TextStickerModel) awS65S1300000_29.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS65S1300000_29 awS65S1300000_29, Object obj) {
        ((TextStickerModel) awS65S1300000_29.l1).setTextStrWithLineBreak(C13LQ.LJJJ(((TextStickerTextWrap) obj).getStickerStringArray(), "\n", null, null, AFwS273S0000000_29.get$arr$(24), 30));
        C0FVT c0fvtD6 = ((C19530611b6) awS65S1300000_29.l2).d6();
        if (c0fvtD6 != null) {
            c0fvtD6.ll((TextStickerModel) awS65S1300000_29.l1);
        }
        TTSModel tTSModel = (TTSModel) awS65S1300000_29.l3;
        if (tTSModel != null && Intrinsics.LJFF(tTSModel.audioText, awS65S1300000_29.s0)) {
            AbstractC19531111bB.Z4((C19530611b6) awS65S1300000_29.l2, (TextStickerModel) awS65S1300000_29.l1, (TTSModel) awS65S1300000_29.l3, false, null, 12, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS65S1300000_29 awS65S1300000_29, Object obj) {
        C19622911pz c19622911pzX1 = ((C19622411pu) awS65S1300000_29.l1).X1();
        c19622911pzX1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("creation_id", c19622911pzX1.LIZ);
        C20684815ws.LJIILLIIL("edit_article_link_sticker_replace_anchor", linkedHashMap);
        ((INewsAnchorProducer) awS65S1300000_29.l2).LIZ(((C19622411pu) awS65S1300000_29.l1).bb2());
        ((C19622411pu) awS65S1300000_29.l1).LLIZLLLIL.LIZIZ(((CreateAnchorInfo) awS65S1300000_29.l3).getUrl());
        C19622411pu.G2((C19622411pu) awS65S1300000_29.l1, awS65S1300000_29.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS65S1300000_29 awS65S1300000_29, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", awS65S1300000_29.s0);
        c2344009Gk.LJIIIIZZ("enter_method", ((ButtonAction) awS65S1300000_29.l1).logPb.enterMethod);
        c2344009Gk.LJIIIIZZ("enter_type", ((ButtonAction) awS65S1300000_29.l1).logPb.enterType);
        C20684815ws.LJIILLIIL("cctott_posting_campaign_popup_click", c2344009Gk.LIZ);
        SmartRoute smartRoute = new SmartRoute((Activity) awS65S1300000_29.l2);
        smartRoute.withUrl(((ButtonAction) awS65S1300000_29.l1).schema);
        final C013C c013c = (C013C) awS65S1300000_29.l3;
        smartRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0z0Y
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                super.onSuccess(intent);
                c013c.element = true;
            }
        });
        smartRoute.open();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S1300000_29(C19622411pu c19622411pu, INewsAnchorProducer iNewsAnchorProducer, CreateAnchorInfo createAnchorInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19622411pu;
        this.l2 = iNewsAnchorProducer;
        this.l3 = createAnchorInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S1300000_29(TextStickerModel textStickerModel, C19530611b6 c19530611b6, TTSModel tTSModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = textStickerModel;
        this.l2 = c19530611b6;
        this.l3 = tTSModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S1300000_29(TextStickerModel textStickerModel, TextStickerModel textStickerModel2, TTSModel tTSModel, String str, AbstractC19531111bB<API_COMPONENT> abstractC19531111bB) {
        super(1);
        this.$t = abstractC19531111bB;
        this.l1 = textStickerModel;
        this.l2 = textStickerModel2;
        this.s0 = tTSModel;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S1300000_29(String str, ButtonAction buttonAction, Activity activity, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = buttonAction;
        this.l2 = activity;
        this.l3 = c013c;
    }
}
