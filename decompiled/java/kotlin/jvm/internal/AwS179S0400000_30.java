package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C013C;
import X.C09AY;
import X.C0VSJ;
import X.C13TC;
import X.C13TD;
import X.C1429680nJ8;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC20236714Gf;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS179S0400000_30 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS179S0400000_30 awS179S0400000_30, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        C013C c013c = (C013C) awS179S0400000_30.l0;
        if (!c013c.element) {
            c013c.element = true;
            MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = (MediaPlayerManagerServiceImpl) awS179S0400000_30.l1;
            AnonymousClass0956 anonymousClass0956 = mediaPlayerManagerServiceImpl.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            mediaPlayerManagerServiceImpl.LIZIZ = null;
            CreativeDialogWrapper creativeDialogWrapper = mediaPlayerManagerServiceImpl.LIZJ;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.dismiss();
            }
            mediaPlayerManagerServiceImpl.LIZJ = null;
            MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl2 = (MediaPlayerManagerServiceImpl) awS179S0400000_30.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forceCopyMusic[onError]: musicId: ");
            sbLIZ.append(C1429680nJ8.LIZJ((MusicBuzModel) awS179S0400000_30.l2));
            sbLIZ.append(" errorCode: ");
            sbLIZ.append(iIntValue);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            mediaPlayerManagerServiceImpl2.getClass();
            MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS179S0400000_30.l3;
            Pair pair = new Pair(Boolean.FALSE, null);
            C189200o6.m2constructorimpl(pair);
            interfaceC20236714Gf.resumeWith(pair);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS179S0400000_30 awS179S0400000_30, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C013C c013c = (C013C) awS179S0400000_30.l0;
        if (!c013c.element) {
            c013c.element = true;
            MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = (MediaPlayerManagerServiceImpl) awS179S0400000_30.l1;
            AnonymousClass0956 anonymousClass0956 = mediaPlayerManagerServiceImpl.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            mediaPlayerManagerServiceImpl.LIZIZ = null;
            CreativeDialogWrapper creativeDialogWrapper = mediaPlayerManagerServiceImpl.LIZJ;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.dismiss();
            }
            mediaPlayerManagerServiceImpl.LIZJ = null;
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS179S0400000_30.l2;
            Pair pair = new Pair(Boolean.TRUE, str);
            C189200o6.m2constructorimpl(pair);
            interfaceC20236714Gf.resumeWith(pair);
            boolean z = C13TD.LIZIZ;
            C13TC.LIZ(new C0VSJ(str).getName(), C1429680nJ8.LIZJ((MusicBuzModel) awS179S0400000_30.l3));
            MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl2 = (MediaPlayerManagerServiceImpl) awS179S0400000_30.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forceCopyMusic[onSuccess]: musicId: ");
            sbLIZ.append(C1429680nJ8.LIZJ((MusicBuzModel) awS179S0400000_30.l3));
            sbLIZ.append(" path: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            mediaPlayerManagerServiceImpl2.getClass();
            MediaPlayerManagerServiceImpl.LJII(strLIZIZ);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS179S0400000_30(com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r3, com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl r4, X.C013C r5, X.C2252611DEt r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r3
            r0 = 2
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r6
            r0 = 2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS179S0400000_30.<init>(com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel, com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl, X.013C, X.1DEt, int):void");
    }
}
