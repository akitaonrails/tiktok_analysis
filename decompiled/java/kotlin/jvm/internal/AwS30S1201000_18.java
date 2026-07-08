package kotlin.jvm.internal;

import X.C09AY;
import X.C1186300gya;
import X.C1187080gzq;
import X.C1189060h32;
import X.C1206930hVr;
import X.C1331660kl2;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C5183020f;
import X.EnumC1187010gzj;
import X.EnumC1187020gzk;
import X.InterfaceC1325460kb2;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashAbility;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitSkuListAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS30S1201000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS30S1201000_18 awS30S1201000_18) {
        C1206930hVr c1206930hVr = C1206930hVr.LIZ;
        String str = awS30S1201000_18.s0;
        String string = ((Bundle) awS30S1201000_18.l1).getString("enterMethod");
        Integer numValueOf = Integer.valueOf(awS30S1201000_18.i3);
        C5183020f c5183020f = new C5183020f((Context) awS30S1201000_18.l2, 133);
        c1206930hVr.getClass();
        C1206930hVr.LIZIZ(str, string, numValueOf, c5183020f);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S1201000_18 awS30S1201000_18) {
        ArrayList arrayList;
        PoiOrderSubmitSlashAbility poiOrderSubmitSlashAbility;
        String str;
        EnumC1187010gzj enumC1187010gzj;
        List<BuySkuItem> list;
        BuySkuItem buySkuItem;
        C1187080gzq c1187080gzq = (C1187080gzq) awS30S1201000_18.l1;
        if (c1187080gzq != null && (list = c1187080gzq.LIZIZ) != null) {
            String str2 = awS30S1201000_18.s0;
            int i = awS30S1201000_18.i3;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (BuySkuItem buySkuItem2 : list) {
                if (Intrinsics.LJFF(buySkuItem2.skuId, str2)) {
                    buySkuItem = new BuySkuItem(buySkuItem2.skuId, Integer.valueOf(i), buySkuItem2.productId);
                } else {
                    buySkuItem = new BuySkuItem(buySkuItem2.skuId, buySkuItem2.quantity, buySkuItem2.productId);
                }
                arrayList.add(buySkuItem);
            }
        } else {
            arrayList = new ArrayList();
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiOrderSubmitSkuListAssem) awS30S1201000_18.l2);
        String str3 = null;
        if (fragmentLJIIJ == null || (poiOrderSubmitSlashAbility = (PoiOrderSubmitSlashAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiOrderSubmitSlashAbility.class, null)) == null) {
            return null;
        }
        C1187080gzq c1187080gzq2 = (C1187080gzq) awS30S1201000_18.l1;
        if (c1187080gzq2 != null) {
            str = c1187080gzq2.LIZ;
        } else {
            str = null;
        }
        EnumC1187020gzk enumC1187020gzk = EnumC1187020gzk.SKU_QUANTITY_CHANGE;
        if (c1187080gzq2 != null) {
            str3 = c1187080gzq2.LIZLLL;
        }
        if (c1187080gzq2 == null || (enumC1187010gzj = c1187080gzq2.LJ) == null) {
            enumC1187010gzj = EnumC1187010gzj.DEFAULT;
        }
        return poiOrderSubmitSlashAbility.GA2(str, arrayList, enumC1187020gzk, null, str3, enumC1187010gzj);
    }

    public static final Object invoke$2(AwS30S1201000_18 awS30S1201000_18) {
        Uri uri = (Uri) awS30S1201000_18.l1;
        if (uri != null) {
            PoiGalleryCell poiGalleryCell = (PoiGalleryCell) awS30S1201000_18.l2;
            int i = awS30S1201000_18.i3;
            String str = awS30S1201000_18.s0;
            poiGalleryCell.LLILLL = false;
            poiGalleryCell.LLILZ = false;
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            if (interfaceC1325460kb2LIZJ != null) {
                interfaceC1325460kb2LIZJ.LJIIL(uri, new C1186300gya(i, uri, poiGalleryCell, str));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S1201000_18(int i, Context context, Bundle bundle, String str, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = bundle;
        this.i3 = i;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S1201000_18(int i, Uri uri, PoiGalleryCell poiGalleryCell, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = uri;
        this.l2 = poiGalleryCell;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S1201000_18(C1187080gzq c1187080gzq, PoiOrderSubmitSkuListAssem poiOrderSubmitSkuListAssem, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c1187080gzq;
        this.l2 = poiOrderSubmitSkuListAssem;
        this.s0 = str;
        this.i3 = i;
    }
}
