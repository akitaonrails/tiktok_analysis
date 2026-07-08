package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0K76;
import X.C0K77;
import X.C0K7Q;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C477750IoP;
import X.C477860Ioa;
import X.C500260Jjc;
import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS67S0301000_7 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS67S0301000_7 awS67S0301000_7) {
        long id;
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onJoinClick");
        if (((MultiTopLiveDistributeAssem) awS67S0301000_7.l0).sp().vQ2((RecommendItem) awS67S0301000_7.l1, awS67S0301000_7.i3, "hangout_banner", null)) {
            ((MultiTopLiveDistributeAssem) awS67S0301000_7.l0).Fp();
            C500260Jjc.LJJJLL((C477750IoP) awS67S0301000_7.l2);
            ((MultiTopLiveDistributeAssem) awS67S0301000_7.l0).ip();
            Room room = ((RecommendItem) awS67S0301000_7.l1).room;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C477860Ioa.LIZJ(id, "toplive_cover_mg_apply_accepted", "click");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S0301000_7 awS67S0301000_7) {
        Object c098200Yq;
        C0K77 c0k77LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sub_share_link_upload_photo_");
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Bitmap bitmap = (Bitmap) awS67S0301000_7.l1;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) awS67S0301000_7.l2;
        int i = awS67S0301000_7.i3;
        Object obj = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(compressFormat, i, byteArrayOutputStream);
            C0K76 c0k76 = C0K76.LIZ;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c0k76.getClass();
            try {
                c0k77LIZ = C0K76.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (c0k77LIZ != null) {
                c098200Yq = c0k77LIZ.LJJIIZ(strLIZIZ, byteArray);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            C0K7Q c0k7q = (C0K7Q) awS67S0301000_7.l0;
            if (c0k7q != null) {
                c0k7q.LIZIZ(str);
            }
        } else {
            C0K7Q c0k7q2 = (C0K7Q) awS67S0301000_7.l0;
            if (c0k7q2 != null) {
                c0k7q2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0301000_7(int i, Bitmap.CompressFormat compressFormat, Bitmap bitmap, C0K7Q c0k7q, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0k7q;
        this.l1 = bitmap;
        this.l2 = compressFormat;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0301000_7(int i, RecommendItem recommendItem, MultiTopLiveDistributeAssem multiTopLiveDistributeAssem, C477750IoP c477750IoP, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiTopLiveDistributeAssem;
        this.l1 = recommendItem;
        this.i3 = i;
        this.l2 = c477750IoP;
    }
}
