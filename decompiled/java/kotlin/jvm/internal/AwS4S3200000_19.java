package kotlin.jvm.internal;

import X.AbstractC1225770i0F;
import X.C09AY;
import X.C09ZB;
import X.C1226980i2C;
import X.C1261860iwS;
import X.C1440005kM;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C299940BpI;
import X.C888460YtI;
import android.content.Context;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS4S3200000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S3200000_19 awS4S3200000_19, Object obj) {
        int i;
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        UserCardListAbility userCardListAbility = (UserCardListAbility) awS4S3200000_19.l3;
        String str2 = awS4S3200000_19.s0;
        String str3 = awS4S3200000_19.s1;
        String uniqueId = ((C1261860iwS) awS4S3200000_19.l4).getUniqueId();
        if (zBooleanValue) {
            i = 4;
        } else {
            i = 0;
        }
        C23250099c.LIZLLL(userCardListAbility.LLILLJJLI, null, null, new C09ZB(userCardListAbility, str2, str3, i, uniqueId, null), 3);
        C888460YtI c888460YtI = new C888460YtI();
        c888460YtI.LIZ = (C1261860iwS) awS4S3200000_19.l4;
        C1440005kM.LIZ(c888460YtI);
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str4 = awS4S3200000_19.s2;
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("target", "confirm");
        Map<String, String> map = c2344009Gk.LIZ;
        if (C299940BpI.LIZ()) {
            if (zBooleanValue) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) map).put("remove_linked_account_toggle", str);
        }
        C20684815ws.LJIILLIIL("block_confirm", map);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S3200000_19 awS4S3200000_19, Object obj) {
        IContactSelectorTemplateFactory iContactSelectorTemplateFactory = (IContactSelectorTemplateFactory) obj;
        C1226980i2C c1226980i2C = (C1226980i2C) awS4S3200000_19.l3;
        String str = awS4S3200000_19.s0;
        String str2 = awS4S3200000_19.s1;
        String str3 = awS4S3200000_19.s2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = c1226980i2C.LLILZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("open_platform_biz_scene", str2), new Pair("open_platform_biz_line", str), new Pair("open_platform_source", str3)));
        AbstractC1225770i0F abstractC1225770i0FGI0 = iContactSelectorTemplateFactory.gI0(C1226980i2C.LJIIL(c1226980i2C, linkedHashMap, null, false, 0, false, false, false, false, null, 2147483645));
        if (abstractC1225770i0FGI0 != null) {
            Context context = (Context) awS4S3200000_19.l4;
            IContactSelectorAPI iContactSelectorAPI = (IContactSelectorAPI) PluggableExtentionKt.pluggableSpiForReal(IContactSelectorAPI.class);
            if (iContactSelectorAPI != null) {
                iContactSelectorAPI.LJ(context, abstractC1225770i0FGI0);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3200000_19(Context context, C1226980i2C c1226980i2C, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = c1226980i2C;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3200000_19(UserCardListAbility userCardListAbility, String str, String str2, C1261860iwS c1261860iwS, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = userCardListAbility;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = c1261860iwS;
        this.s2 = str3;
    }
}
