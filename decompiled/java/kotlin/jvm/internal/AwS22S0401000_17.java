package kotlin.jvm.internal;

import X.AbstractC1110790f0n;
import X.C09AY;
import X.C1109770ez9;
import X.C1113510f5B;
import X.C1135290feJ;
import X.C1136400fg6;
import X.C1136410fg7;
import X.C1136560fgM;
import X.C15438062q;
import X.C1697810uHb;
import X.EnumC1133020fae;
import X.InterfaceC1135310feL;
import X.InterfaceC1136020ffU;
import X.InterfaceC1139780flY;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS22S0401000_17 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S0401000_17 awS22S0401000_17) {
        boolean z;
        InterfaceC1139780flY interfaceC1139780flYLIZJ = ((C1136560fgM) awS22S0401000_17.l0).LIZJ();
        AssetsModel assetsModel = (AssetsModel) awS22S0401000_17.l1;
        if (assetsModel != null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1139780flYLIZJ.LIZIZ(false, assetsModel, z, true, false);
        ((C1136410fg7) awS22S0401000_17.l2).LJIILIIL(awS22S0401000_17.i4, (GiftMessage) awS22S0401000_17.l3, (C1136560fgM) awS22S0401000_17.l0, "prepareAssetsModel fail");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S0401000_17 awS22S0401000_17) {
        ((C1135290feJ) awS22S0401000_17.l0).LJI((List) awS22S0401000_17.l1, awS22S0401000_17.i4 + 1, (EnumC1133020fae) awS22S0401000_17.l2, (InterfaceC1135310feL) awS22S0401000_17.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S0401000_17 awS22S0401000_17) {
        boolean z;
        InterfaceC1139780flY interfaceC1139780flYLIZJ = ((C1136560fgM) awS22S0401000_17.l0).LIZJ();
        AssetsModel assetsModel = (AssetsModel) awS22S0401000_17.l1;
        if (assetsModel != null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1139780flYLIZJ.LIZIZ(false, assetsModel, z, true, false);
        ((C1136400fg6) awS22S0401000_17.l2).LJIILLIIL(awS22S0401000_17.i4, (InterfaceC1136020ffU) awS22S0401000_17.l3, (C1136560fgM) awS22S0401000_17.l0, "prepareAssetsModel fail");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS22S0401000_17 awS22S0401000_17) {
        String str;
        int i;
        C1113510f5B c1113510f5B = (C1113510f5B) awS22S0401000_17.l0;
        AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) awS22S0401000_17.l1;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = (List) awS22S0401000_17.l2;
        int i2 = awS22S0401000_17.i4;
        c1113510f5B.getClass();
        boolean z = true;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it2 = list.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (i3 < i2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    arrayList.add(Integer.valueOf(i));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it3 = list.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                it3.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    if (i5 < i2) {
                        str = "";
                    } else {
                        str = "NoSpace";
                    }
                    arrayList2.add(str);
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c1113510f5B.LJIILIIL(abstractC1110790f0n, list, arrayList, arrayList2, "negative_page_fixed_icon");
        }
        C1113510f5B c1113510f5B2 = (C1113510f5B) awS22S0401000_17.l0;
        C1109770ez9 c1109770ez9 = (C1109770ez9) awS22S0401000_17.l3;
        if (awS22S0401000_17.i4 <= 0) {
            z = false;
        }
        c1113510f5B2.LJIIIIZZ(c1109770ez9, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0401000_17(int i, AssetsModel assetsModel, C1136400fg6 c1136400fg6, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1136560fgM;
        this.l1 = assetsModel;
        this.l2 = c1136400fg6;
        this.i4 = i;
        this.l3 = interfaceC1136020ffU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0401000_17(int i, AssetsModel assetsModel, C1136410fg7 c1136410fg7, GiftMessage giftMessage, C1136560fgM c1136560fgM, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1136560fgM;
        this.l1 = assetsModel;
        this.l2 = c1136410fg7;
        this.i4 = i;
        this.l3 = giftMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S0401000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110790f0n abstractC1110790f0n, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list, int i, C1109770ez9 c1109770ez9) {
        super(0);
        this.$t = c1109770ez9;
        this.l0 = c1113510f5B;
        this.l1 = c1113510f5B2;
        this.l2 = abstractC1110790f0n;
        this.i4 = list;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S0401000_17(C1135290feJ c1135290feJ, C1135290feJ c1135290feJ2, List<? extends InterfaceC1136020ffU> list, int i, EnumC1133020fae enumC1133020fae, InterfaceC1135310feL interfaceC1135310feL) {
        super(0);
        this.$t = interfaceC1135310feL;
        this.l0 = c1135290feJ;
        this.l1 = c1135290feJ2;
        this.i4 = list;
        this.l2 = i;
        this.l3 = enumC1133020fae;
    }
}
