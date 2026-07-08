package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1159020gGa;
import X.C1777700wMS;
import X.C1789050wel;
import X.C1789740wfs;
import X.C1815960xMA;
import X.C1837060xuC;
import X.C1855040yNC;
import X.C1857750yRZ;
import X.C1860380yVo;
import X.C1861040yWs;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C291001Au;
import X.C321970Cjj;
import X.InterfaceC1858000yRy;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS77S1000000_27 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S1000000_27(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C2097908Jt.LIZJ(new Pair(((C1789740wfs) obj).LIZIZ, awS77S1000000_27.s0));
    }

    public static final Object invoke$1(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        String str;
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        ArrayList arrayList = new ArrayList();
        String str2 = awS77S1000000_27.s0;
        List<InterfaceC1858000yRy> list = c1861040yWs.LL.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Message messageLIZ = C321970Cjj.LIZ((InterfaceC1858000yRy) obj2);
            if (messageLIZ != null) {
                str = messageLIZ.uuid;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, str2)) {
                arrayList2.add(obj2);
            }
        }
        arrayList.addAll(arrayList2);
        return C1861040yWs.LIZ(c1861040yWs, new C291001Au(arrayList), false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741818);
    }

    public static final Object invoke$10(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1159020gGa.LIZ((C1159020gGa) obj, new C291001Au(awS77S1000000_27.s0), null, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS77S1000000_27 r9, java.lang.Object r10) {
        /*
            r3 = r10
            X.0y85 r3 = (X.C1845670y85) r3
            java.lang.String r4 = r9.s0
            boolean r0 = X.C123100dR.LIZ(r4)
            r1 = 0
            if (r0 == 0) goto L16
            X.01Au<X.0wOd> r0 = r3.LLILLL
            if (r0 == 0) goto L2e
            T r2 = r0.LIZ
        L12:
            X.0wOd r0 = X.EnumC1779050wOd.NEW
            if (r2 == r0) goto L2c
        L16:
            X.01Au<X.0wOd> r0 = r3.LLILLL
            if (r0 == 0) goto L1c
            T r1 = r0.LIZ
        L1c:
            X.0wOd r0 = X.EnumC1779050wOd.EDIT
            if (r1 == r0) goto L2c
            r5 = 0
        L21:
            r6 = 0
            r10 = 60
            r7 = r6
            r8 = r6
            r9 = r6
            X.0y85 r0 = X.C1845670y85.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L2c:
            r5 = 1
            goto L21
        L2e:
            r2 = r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS77S1000000_27.invoke$11(kotlin.jvm.internal.AwS77S1000000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1855040yNC.LIZ((C1855040yNC) obj, null, null, null, null, false, false, null, null, awS77S1000000_27.s0, false, null, null, null, null, null, false, false, false, 261887);
    }

    public static final Object invoke$13(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((DownloadInfo) obj).getUrl(), awS77S1000000_27.s0));
    }

    public static final Object invoke$14(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1815960xMA.LIZ((C1815960xMA) obj, null, false, null, null, null, awS77S1000000_27.s0, false, 191);
    }

    public static final Object invoke$15(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C2097908Jt.LIZJ(new Pair(((C1789050wel) obj).LIZIZ, awS77S1000000_27.s0));
    }

    public static final Object invoke$2(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        String strLJII;
        int i;
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        C1860380yVo.LIZ.getClass();
        C01GW c01gw = C1860380yVo.LIZIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            strLJII = C1857750yRZ.LJII(2131822452);
        } else {
            strLJII = C1857750yRZ.LJII(2131849798);
        }
        takoMixFeed.hint = strLJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(takoMixFeed.text);
        sbLIZ.append(awS77S1000000_27.s0);
        takoMixFeed.text = C2188811AlT.LIZIZ(sbLIZ);
        takoMixFeed.hintInText = awS77S1000000_27.s0;
        takoMixFeed.msgExt.put("source_card_type", String.valueOf(takoMixFeed.cardType));
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            i = takoMixFeed.cardType;
            if (i == -1 || i == 301) {
                i = 1022;
            }
        } else {
            i = takoMixFeed.cardType;
            if (i == -1) {
                i = 0;
            }
        }
        takoMixFeed.cardType = i;
        takoMixFeed.status = 2;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        String str = awS77S1000000_27.s0;
        if (str == null) {
            str = "";
        }
        return C1861040yWs.LIZ(c1861040yWs, null, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, new C291001Au(str), null, null, false, null, false, null, 0L, null, null, null, null, null, 1073610751);
    }

    public static final Object invoke$4(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((DownloadInfo) obj).getUrl(), awS77S1000000_27.s0));
    }

    public static final Object invoke$5(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1837060xuC.LIZ((C1837060xuC) obj, null, new C1777700wMS(awS77S1000000_27.s0), 1);
    }

    public static final Object invoke$6(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        BaseImage baseImage = (BaseImage) obj;
        String str = awS77S1000000_27.s0;
        return baseImage.copy(str, baseImage.innerUrlList, baseImage.urlList, baseImage.thumbnailUrlList, baseImage.width, baseImage.height, str, 100L, baseImage.localCachePath, baseImage.compressedFilePath, baseImage.compressedFileSize, baseImage.imageSource, 3, baseImage.originalFileSize, baseImage.imageUuid, baseImage.stdSize, baseImage.imageSceneType, baseImage.extraInfo);
    }

    public static final Object invoke$7(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1855040yNC.LIZ((C1855040yNC) obj, null, null, null, null, false, false, null, null, null, false, null, null, awS77S1000000_27.s0, null, null, false, false, false, 258047);
    }

    public static final Object invoke$8(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return C1855040yNC.LIZ((C1855040yNC) obj, null, null, null, null, false, false, null, null, null, false, null, awS77S1000000_27.s0, null, null, null, false, false, false, 260095);
    }

    public static final Object invoke$9(AwS77S1000000_27 awS77S1000000_27, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((ConversationInfo) obj).subConversationId, awS77S1000000_27.s0));
    }
}
