package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list;

import X.C04FY;
import X.C04G1;
import X.C1764130w0Z;
import X.C1764510w1B;
import X.EnumC1764120w0Y;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaViewPager2ListHelper implements ISeaListHelper {
    public final C1764130w0Z LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final void AS() {
        this.LLILLL = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final void hK2() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final C04G1 Mw() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            return c1764130w0Z.getCurrentCardNode();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final Boolean lJ0() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            return c1764130w0Z.LLJILJIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final int sz() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            return c1764130w0Z.getCurrentListIndex();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final boolean tN1() {
        C04G1 currentCardNode;
        C04FY c04fy;
        C1764130w0Z c1764130w0Z = this.LL;
        String str = null;
        if (c1764130w0Z != null && (currentCardNode = c1764130w0Z.getCurrentCardNode()) != null && (c04fy = currentCardNode.LJIJJLI) != null) {
            str = c04fy.LIZ;
        }
        return Intrinsics.LJFF(str, "video_style") && this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final int vh2() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            return c1764130w0Z.getDefaultListIndex();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final C1764510w1B yN() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            return c1764130w0Z.getRenderNodeInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final int r1() {
        return this.LLILLJJLI;
    }

    public SeaViewPager2ListHelper(C1764130w0Z c1764130w0Z) {
        this.LL = c1764130w0Z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final void tN2(int i) {
        this.LLILLJJLI = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final void Qi2(String str, EnumC1764120w0Y enumC1764120w0Y) {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            c1764130w0Z.LLJI = enumC1764120w0Y;
            Integer num = (Integer) ((LinkedHashMap) c1764130w0Z.LLILZIL).get(str);
            if (num != null) {
                c1764130w0Z.LL.getViewPager2().LJ(num.intValue(), false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper
    public final void h82(int i, EnumC1764120w0Y enumC1764120w0Y) {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            c1764130w0Z.LLJI = enumC1764120w0Y;
            c1764130w0Z.LL.getViewPager2().LJ(i, false);
        }
    }
}
