package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1185430gxB;
import X.C1367960lha;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397620mTQ;
import X.C189200o6;
import X.C20145813s8;
import X.C20642515q3;
import X.C343970De7;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeHorizontalCardCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS3S3200000_18 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS3S3200000_18 awS3S3200000_18, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String string = awS3S3200000_18.s0;
        if (string == null) {
            string = ((Context) awS3S3200000_18.l3).getString(2131826410);
        }
        c1397620mTQ.LIZJ(0, string, new AwS41S2100000_18((PoiClaimFragment) awS3S3200000_18.l4, awS3S3200000_18.s1, awS3S3200000_18.s2, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S3200000_18 awS3S3200000_18, Object obj) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj, C343970De7.LIZ);
        PoiMapModeHorizontalCardCell poiMapModeHorizontalCardCell = (PoiMapModeHorizontalCardCell) awS3S3200000_18.l3;
        Context context = (Context) awS3S3200000_18.l4;
        String str2 = awS3S3200000_18.s0;
        String str3 = awS3S3200000_18.s1;
        String str4 = awS3S3200000_18.s2;
        try {
            poiMapModeHorizontalCardCell.getClass();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJI(C20642515q3.LIZJ(R.color.f570cs));
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            }
            try {
                C1367960lha.LIZ.getClass();
                C20145813s8.LIZ("copy_address", C1367960lha.LIZ().LJLI(str2, str3), context, CertProviderManagerKt.findCert("bpea-571", 1476399106));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PageFinder pageFinderN5 = poiMapModeHorizontalCardCell.N5();
            c1185430gxB.getClass();
            C1185430gxB.LJIILLIIL(pageFinderN5, "map_mode", "click_copy_address_button", str4);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S3200000_18(PoiMapModeHorizontalCardCell poiMapModeHorizontalCardCell, Context context, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = poiMapModeHorizontalCardCell;
        this.l4 = context;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S3200000_18(String str, Context context, PoiClaimFragment poiClaimFragment, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l3 = context;
        this.l4 = poiClaimFragment;
        this.s1 = str2;
        this.s2 = str3;
    }
}
