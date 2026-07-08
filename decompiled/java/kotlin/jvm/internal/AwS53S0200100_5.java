package kotlin.jvm.internal;

import X.C09AY;
import X.C0E00;
import X.C0E01;
import X.C0FDM;
import X.C0FGD;
import X.C0FGR;
import X.C354240Dug;
import X.C354510Dv7;
import X.C361680EFy;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.image.phototemplate.processor.PhotoTemplateMagicProcessor;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class AwS53S0200100_5 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0200100_5(long j, C354240Dug c354240Dug, PhotoTemplateMagicProcessor photoTemplateMagicProcessor, int i) {
        super(3);
        this.$t = i;
        this.j2 = j;
        this.l0 = c354240Dug;
        this.l1 = photoTemplateMagicProcessor;
    }

    public static final Object invoke$0(AwS53S0200100_5 awS53S0200100_5, Object obj, Object obj2, Object obj3) {
        String second;
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        String str2 = (String) obj3;
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(str);
        if (pairLIZJ != null) {
            second = pairLIZJ.getSecond();
        } else {
            second = null;
        }
        C0FGR c0fgr = ((C0FDM) awS53S0200100_5.l0).LIZIZ;
        if (c0fgr != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - awS53S0200100_5.j2;
            C0FDM c0fdm = (C0FDM) awS53S0200100_5.l0;
            CaptionTemplateData captionTemplateData = (CaptionTemplateData) awS53S0200100_5.l1;
            c0fdm.getClass();
            c0fgr.LJJIIJ(1, jCurrentTimeMillis, second, C0FDM.LJIIIZ(captionTemplateData, str), ((CaptionTemplateData) awS53S0200100_5.l1).resID, false, Integer.valueOf(iIntValue), str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S0200100_5 awS53S0200100_5, Object obj, Object obj2, Object obj3) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        Integer num = (Integer) obj2;
        String str2 = (String) obj3;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS53S0200100_5.j2;
        C354510Dv7 c354510Dv7 = ((C354240Dug) awS53S0200100_5.l0).LIZ;
        String str3 = c354510Dv7.LIZJ;
        String str4 = c354510Dv7.LIZ;
        PhotoTemplateMagicProcessor photoTemplateMagicProcessor = (PhotoTemplateMagicProcessor) awS53S0200100_5.l1;
        C0E00 c0e00 = c354510Dv7.LJFF;
        if (c0e00 != null) {
            photoTemplateMagicProcessor.getClass();
            int i = C0E01.LIZ[c0e00.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "combine";
                } else {
                    str = "client";
                }
            } else {
                str = "server";
            }
            C361680EFy.LJJLIIIJILLIZJL(iIntValue, num, str2, jCurrentTimeMillis, str3, str4, str, "photo_template", null);
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0200100_5(C0FDM c0fdm, long j, CaptionTemplateData captionTemplateData, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0fdm;
        this.j2 = j;
        this.l1 = captionTemplateData;
    }
}
