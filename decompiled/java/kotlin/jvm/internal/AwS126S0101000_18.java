package kotlin.jvm.internal;

import X.AbstractC1203190hPp;
import X.C09AY;
import X.C1158960gGU;
import X.C1160480gIw;
import X.C1164120gOo;
import X.C1167390gU5;
import X.C1167470gUD;
import X.C1186500gyu;
import X.C1186530gyx;
import X.C1196140hES;
import X.C291001Au;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1177250gjz;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.detail.ui.FollowInnerFeedComponent;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeMapAssem;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS126S0101000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(FollowInnerFeedComponent followInnerFeedComponent, int i) {
        super(1);
        this.$t = i;
        this.l0 = followInnerFeedComponent;
        this.i1 = R.id.trk;
    }

    public static final Object invoke$0(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        C1158960gGU c1158960gGU = (C1158960gGU) obj;
        List list = (List) awS126S0101000_18.l0;
        int i = awS126S0101000_18.i1;
        C291001Au<C1160480gIw> c291001Au = c1158960gGU.LLILLL;
        c1158960gGU.getClass();
        return new C1158960gGU(list, i, c291001Au);
    }

    public static final Object invoke$1(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        int i = awS126S0101000_18.i1;
        C1167390gU5 c1167390gU5 = (C1167390gU5) awS126S0101000_18.l0;
        return C1167470gUD.LIZ((C1167470gUD) obj, null, null, null, 0L, i, c1167390gU5.LIZ, c1167390gU5.LIZIZ, null, null, 0, null, null, null, null, null, 32655);
    }

    public static final Object invoke$2(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        return C1164120gOo.LIZ((C1164120gOo) obj, (List) awS126S0101000_18.l0, null, null, awS126S0101000_18.i1, false, 0, null, null, null, 1014);
    }

    public static final Object invoke$3(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        if (awS126S0101000_18.i1 > 0) {
            i = 1;
        } else {
            i = -1;
        }
        ((PoiSlashVideoListPostsTriggerLineProvider) awS126S0101000_18.l0).LJII(iIntValue, i);
        ((PoiSlashVideoListPostsTriggerLineProvider) awS126S0101000_18.l0).LJI = i;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        return C1186500gyu.LIZ((C1186500gyu) obj, null, new C1186530gyx(awS126S0101000_18.i1, (AbstractC1203190hPp) awS126S0101000_18.l0), 1);
    }

    public static final Object invoke$5(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        ((Assembler) obj).RQ2((FollowInnerFeedComponent) awS126S0101000_18.l0, new AwS32S0001000_18(awS126S0101000_18.i1, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("card_type", String.valueOf(((CardTypeRequest) awS126S0101000_18.l0).cardType));
        c1196140hES.LIZIZ(awS126S0101000_18.i1, "request_count");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS126S0101000_18 awS126S0101000_18, Object obj) {
        InterfaceC1177250gjz interfaceC1177250gjz = ((PoiMapModeMapAssem) awS126S0101000_18.l0).LLJIJIL;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LJIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), awS126S0101000_18.i1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(int i, C1167390gU5 c1167390gU5, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1167390gU5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(int i, AbstractC1203190hPp abstractC1203190hPp, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = abstractC1203190hPp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(int i, PoiSlashVideoListPostsTriggerLineProvider poiSlashVideoListPostsTriggerLineProvider, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = poiSlashVideoListPostsTriggerLineProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(PoiMapModeMapAssem poiMapModeMapAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = poiMapModeMapAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0101000_18(CardTypeRequest cardTypeRequest, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = cardTypeRequest;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0101000_18(List list, List<InterfaceC1891350zJl> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
