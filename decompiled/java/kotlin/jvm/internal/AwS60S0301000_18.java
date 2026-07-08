package kotlin.jvm.internal;

import X.C09AY;
import X.C1189680h42;
import X.C1189910h4P;
import X.C1194140hBE;
import X.C1322110kVd;
import X.C1558360qeg;
import X.C18JG;
import X.C946803n0;
import X.InterfaceC1194150hBF;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS60S0301000_18 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS60S0301000_18 awS60S0301000_18, Object obj, Object obj2) {
        if (((C1189910h4P) awS60S0301000_18.l0).LLJ.add(Integer.valueOf(awS60S0301000_18.i3))) {
            ((Function2) awS60S0301000_18.l1).invoke((PoiListApi.PostTag) awS60S0301000_18.l2, Integer.valueOf(awS60S0301000_18.i3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S0301000_18 awS60S0301000_18, Object obj, Object obj2) {
        String str;
        C1194140hBE c1194140hBE = (C1194140hBE) awS60S0301000_18.l0;
        if (!c1194140hBE.LLIZ) {
            InterfaceC1194150hBF interfaceC1194150hBF = c1194140hBE.LL;
            String str2 = ((PoiActivityApi.PoiBannerInfo) awS60S0301000_18.l1).activityId;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            interfaceC1194150hBF.LIZJ(str2);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            String strLIZLLL = C18JG.LIZLLL(PageFinder.via((View) awS60S0301000_18.l2), "a4257.b26943.c2786.d0", null);
            C1189680h42 c1189680h42 = C1189680h42.LIZ;
            if (((C1194140hBE) awS60S0301000_18.l0).LLILLJJLI) {
                str = "poi_detail";
            } else {
                str = "add_location";
            }
            String str4 = ((PoiActivityApi.PoiBannerInfo) awS60S0301000_18.l1).activityId;
            if (str4 != null) {
                str3 = str4;
            }
            Integer numValueOf = Integer.valueOf(awS60S0301000_18.i3 + 1);
            C1194140hBE c1194140hBE2 = (C1194140hBE) awS60S0301000_18.l0;
            String str5 = c1194140hBE2.LLILLL;
            String str6 = c1194140hBE2.LLILZ;
            Fragment fragmentLIZ = C946803n0.LIZ(c1194140hBE2);
            if (fragmentLIZ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
            }
            C1189680h42.LIZ(c1189680h42, true, str, str3, numValueOf, str5, str6, null, interfaceC665370Q7zLJFF, String.valueOf(strLIZLLL), PageFinder.via((View) awS60S0301000_18.l0), 64);
        }
        ((C1194140hBE) awS60S0301000_18.l0).LLIZ = true;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0301000_18(int i, C1322110kVd c1322110kVd, PoiActivityApi.PoiBannerInfo poiBannerInfo, C1194140hBE c1194140hBE, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1194140hBE;
        this.l1 = poiBannerInfo;
        this.l2 = c1322110kVd;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0301000_18(C1189910h4P c1189910h4P, C1189910h4P c1189910h4P2, int i, Function2<? super PoiListApi.PostTag, ? super Integer, Unit> function2, PoiListApi.PostTag postTag) {
        super(2);
        this.$t = postTag;
        this.l0 = c1189910h4P;
        this.i3 = c1189910h4P2;
        this.l1 = i;
        this.l2 = function2;
    }
}
