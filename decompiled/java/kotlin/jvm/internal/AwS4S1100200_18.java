package kotlin.jvm.internal;

import X.C09AY;
import X.C1182980gtE;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS4S1100200_18 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS4S1100200_18 awS4S1100200_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS4S1100200_18.j2);
        c1182980gtE.LIZIZ = Long.valueOf(awS4S1100200_18.j3);
        c1182980gtE.LJ = "influencer_extension_api";
        c1182980gtE.LIZLLL = awS4S1100200_18.s0;
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) awS4S1100200_18.l1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1100200_18 awS4S1100200_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZ = Long.valueOf(awS4S1100200_18.j2);
        c1182980gtE.LIZIZ = Long.valueOf(awS4S1100200_18.j3);
        c1182980gtE.LJ = "influencer_recommend_api";
        c1182980gtE.LIZLLL = awS4S1100200_18.s0;
        c1182980gtE.LIZJ = (InterfaceC1201180hMa) awS4S1100200_18.l1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1100200_18(long j, long j2, PoiCreatorApi.PoiCreatorBaseConfigResponse poiCreatorBaseConfigResponse, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.j3 = j2;
        this.s0 = "/tiktok/ls/add/location/extension";
        this.l1 = poiCreatorBaseConfigResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1100200_18(long j, long j2, PoiCreatorApi.PoiCreatorPromoteStoresResponse poiCreatorPromoteStoresResponse, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.j3 = j2;
        this.s0 = "/tiktok/ls/influencer/poi/recommend";
        this.l1 = poiCreatorPromoteStoresResponse;
    }
}
