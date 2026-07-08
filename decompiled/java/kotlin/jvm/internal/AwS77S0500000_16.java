package kotlin.jvm.internal;

import X.C09AY;
import X.C0CLW;
import X.C1050610dRj;
import X.C118300cf;
import X.C11W4;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1630020sWG;
import X.C786410Ut5;
import X.InterfaceC1291910jiv;
import Y.ARunnableS10S0500000_16;
import android.content.Context;
import android.net.Uri;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS77S0500000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS77S0500000_16 awS77S0500000_16) {
        C1322110kVd c1322110kVd = (C1322110kVd) awS77S0500000_16.l0;
        C1630020sWG c1630020sWG = (C1630020sWG) awS77S0500000_16.l1;
        HandlerHook.viewPost(c1322110kVd, new ARunnableS10S0500000_16((Uri) awS77S0500000_16.l2, (C1320700kTM) awS77S0500000_16.l4, c1322110kVd, (InterfaceC1291910jiv) awS77S0500000_16.l3, c1630020sWG, 1));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS77S0500000_16 awS77S0500000_16) {
        String strJ4 = C786410Ut5.j4(C0CLW.LIZIZ.LIZ.getWikipediaAnchorUrlPlaceholder(), Arrays.copyOf(new Object[]{((WikipediaInfo) awS77S0500000_16.l0).getLang(), ((WikipediaInfo) awS77S0500000_16.l0).getKeyword()}, 2));
        ((Map) awS77S0500000_16.l1).put("title", ((WikipediaInfo) awS77S0500000_16.l0).getKeyword());
        ((Map) awS77S0500000_16.l1).put("wiki_entry", ((WikipediaInfo) awS77S0500000_16.l0).getKeyword());
        ((Map) awS77S0500000_16.l1).put("language", ((WikipediaInfo) awS77S0500000_16.l0).getLang());
        Map map = (Map) awS77S0500000_16.l1;
        String anchorId = ((WikipediaInfo) awS77S0500000_16.l2).getAnchorId();
        if (anchorId == null) {
            anchorId = "";
        }
        map.put("anchor_id", anchorId);
        String str = AddWikiActivity._pnsPageId;
        C11W4.LIZ((Context) awS77S0500000_16.l3, strJ4, (Map) awS77S0500000_16.l1, (Map) awS77S0500000_16.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS77S0500000_16 awS77S0500000_16) {
        new C1050610dRj().LJI("ttelite_ba_video_product_publish_pop_click_try", new Pair<>("dialog_type", Integer.valueOf(((C118300cf) awS77S0500000_16.l0).element)));
        BAAnchorServiceImpl bAAnchorServiceImpl = (BAAnchorServiceImpl) awS77S0500000_16.l1;
        Context context = (Context) awS77S0500000_16.l2;
        bAAnchorServiceImpl.getClass();
        BAAnchorServiceImpl.LJIJJ(2, context);
        ((Function0) awS77S0500000_16.l3).invoke();
        ((Function0) awS77S0500000_16.l4).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0500000_16(C118300cf c118300cf, C118300cf c118300cf2, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = bAAnchorServiceImpl;
        this.l3 = context;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0500000_16(Uri uri, C1320700kTM c1320700kTM, C1322110kVd c1322110kVd, InterfaceC1291910jiv interfaceC1291910jiv, C1630020sWG c1630020sWG, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1322110kVd;
        this.l1 = c1630020sWG;
        this.l2 = uri;
        this.l3 = interfaceC1291910jiv;
        this.l4 = c1320700kTM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0500000_16(WikipediaInfo wikipediaInfo, WikipediaInfo wikipediaInfo2, Map<String, String> map, WikipediaInfo wikipediaInfo3, Context context, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = wikipediaInfo;
        this.l1 = wikipediaInfo2;
        this.l2 = map;
        this.l3 = wikipediaInfo3;
        this.l4 = context;
    }
}
