package kotlin.jvm.internal;

import X.C09AY;
import X.C0UO0;
import X.C1125770fOx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1863240yaQ;
import X.C19634511rr;
import X.C1A3X;
import X.C1AFI;
import X.C21459118yT;
import X.C2176311AFh;
import X.C2176871AHl;
import X.C2176881AHm;
import X.C2186441Ahe;
import X.C2186591Aht;
import X.C2186671Ai1;
import X.C2186731Ai7;
import X.C2188811AlT;
import X.C309120C9u;
import X.C480460Ism;
import X.C500260Jjc;
import X.EnumC1738800vLi;
import X.InterfaceC1631620sYq;
import X.InterfaceC1738830vLl;
import X.InterfaceC19321010iO;
import Y.AfS119S0300000_33;
import Y.AfS178S0100000_9;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import co5.g;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingAssem;
import com.bytedance.android.livesdk.gift.viewerwishes.api.ViewerWishesApi;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.viewer_picks.model.DeleteOrderParams;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3MusicTitleAssem;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS434S0200000_33;
import oo5.b;

/* JADX INFO: loaded from: classes34.dex */
public class AwS682S0100000_33 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(C1863240yaQ c1863240yaQ, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1863240yaQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(InterfaceC19321010iO interfaceC19321010iO, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC19321010iO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(C19634511rr c19634511rr, int i) {
        super(3);
        this.$t = i;
        this.l0 = c19634511rr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(C2176311AFh c2176311AFh, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2176311AFh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(PcsGenericLoadingAssem pcsGenericLoadingAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsGenericLoadingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(ViewerWishesQueuePage viewerWishesQueuePage, int i) {
        super(3);
        this.$t = i;
        this.l0 = viewerWishesQueuePage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(EcTakePhotoActivity ecTakePhotoActivity, int i) {
        super(3);
        this.$t = i;
        this.l0 = ecTakePhotoActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(FriendsV3MusicTitleAssem friendsV3MusicTitleAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = friendsV3MusicTitleAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(GeoFencingSelectionActivity geoFencingSelectionActivity, int i) {
        super(3);
        this.$t = i;
        this.l0 = geoFencingSelectionActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS682S0100000_33(AwS434S0200000_33 awS434S0200000_33, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS434S0200000_33;
    }

    public static final Object invoke$0(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        ((C2176311AFh) awS682S0100000_33.l0).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        ((C2176311AFh) awS682S0100000_33.l0).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$10(final AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        final C1AFI c1afi = (C1AFI) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ocrResponse: ");
        sbLIZ.append(c1afi);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            if (zBooleanValue && c1afi != null) {
                try {
                    if (c1afi.LJIIL) {
                        c1afi.LIZ((Bitmap) ((AwS434S0200000_33) awS682S0100000_33.l0).l1);
                        b bVar = b.LJIJJLI;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        OcrViewModel ocrViewModel = ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL;
                        long j = jCurrentTimeMillis - ocrViewModel.LLILLJJLI;
                        long j2 = ocrViewModel.LLILLL;
                        long j3 = ocrViewModel.LLILZ;
                        long j4 = ocrViewModel.LLILZIL;
                        bVar.getClass();
                        b.LJI(j, j2, j3, j4, "success");
                        b.LJIILLIIL = "server";
                        Bitmap bitmap = (Bitmap) ((AwS434S0200000_33) awS682S0100000_33.l0).l1;
                        eo5.b bVar2 = new eo5.b() { // from class: X.1Ai2
                            @Override // eo5.b
                            public final void LIZ(int i, int i2, String str2, g gVar, String str3) {
                                g gVarLIZ = C2186441Ahe.LIZ(c1afi);
                                gVarLIZ.LJII = gVar.LJII;
                                ((C2186671Ai1) ((AwS434S0200000_33) this.LIZ.l0).l0).LL.LL.postValue(new C2186591Aht(1, 1, "success", gVarLIZ));
                            }
                        };
                        InterfaceC1738830vLl interfaceC1738830vLl = b.LIZ.LJIIJ;
                        if (interfaceC1738830vLl != null) {
                            interfaceC1738830vLl.LIZ(EnumC1738800vLi.ImageCropped.getValue(), new C2186731Ai7(bVar2), bitmap);
                        }
                    } else {
                        b bVar3 = b.LJIJJLI;
                        String strValueOf = String.valueOf(101);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        OcrViewModel ocrViewModel2 = ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL;
                        long j5 = jCurrentTimeMillis2 - ocrViewModel2.LLILLJJLI;
                        long j6 = ocrViewModel2.LLILLL;
                        long j7 = ocrViewModel2.LLILZ;
                        long j8 = ocrViewModel2.LLILZIL;
                        bVar3.getClass();
                        b.LJI(j5, j6, j7, j8, strValueOf);
                        ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL.LL.postValue(new C2186591Aht(0, 101, "", C2186441Ahe.LIZ(c1afi)));
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    b bVar4 = b.LJIJJLI;
                    String strValueOf2 = String.valueOf(108);
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    OcrViewModel ocrViewModel3 = ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL;
                    long j9 = jCurrentTimeMillis3 - ocrViewModel3.LLILLJJLI;
                    long j10 = ocrViewModel3.LLILLL;
                    long j11 = ocrViewModel3.LLILZ;
                    long j12 = ocrViewModel3.LLILZIL;
                    bVar4.getClass();
                    b.LJI(j9, j10, j11, j12, strValueOf2);
                    MutableLiveData<C2186591Aht> mutableLiveData = ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(th);
                    mutableLiveData.postValue(new C2186591Aht(0, 108, C2188811AlT.LIZIZ(sbLIZ2), C2186441Ahe.LIZ(c1afi)));
                }
            } else {
                b bVar5 = b.LJIJJLI;
                String strValueOf3 = String.valueOf(107);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                OcrViewModel ocrViewModel4 = ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL;
                long j13 = jCurrentTimeMillis4 - ocrViewModel4.LLILLJJLI;
                long j14 = ocrViewModel4.LLILLL;
                long j15 = ocrViewModel4.LLILZ;
                long j16 = ocrViewModel4.LLILZIL;
                bVar5.getClass();
                b.LJI(j13, j14, j15, j16, strValueOf3);
                ((C2186671Ai1) ((AwS434S0200000_33) awS682S0100000_33.l0).l0).LL.LL.postValue(new C2186591Aht(0, 107, str, C2186441Ahe.LIZ(c1afi)));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        long j;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        C500260Jjc.LLFFF(((ViewerWishesQueuePage) awS682S0100000_33.l0).LLLII);
        ViewerWishesQueuePage viewerWishesQueuePage = (ViewerWishesQueuePage) awS682S0100000_33.l0;
        C2176871AHl c2176871AHl = viewerWishesQueuePage.LLJLLL;
        if (c2176871AHl != null) {
            AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(viewerWishesQueuePage, 158);
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((ViewerWishesQueuePage) awS682S0100000_33.l0, 3912);
            DeleteOrderParams deleteOrderParams = new DeleteOrderParams();
            DataChannel dataChannel = c2176871AHl.LIZ;
            if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null) {
                j = viewerPicksInfo.viewerPicksId;
            } else {
                j = 0;
            }
            deleteOrderParams.viewerPicksId = j;
            deleteOrderParams.viewerPicksOrderId = jLongValue;
            deleteOrderParams.viewerPicksOrdererId = jLongValue2;
            deleteOrderParams.giftPickId = jLongValue3;
            C480460Ism.LIZ().getClass();
            ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).deleteViewerWishesListOrder(deleteOrderParams).LJIILIIL(new C0UO0()).LJJLL(new AfS119S0300000_33(c2176871AHl, awS577S0100000_33, awS612S0100000_33, 4), new AfS178S0100000_9(awS577S0100000_33, 65));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        IEcExtendAlbumAbility iEcExtendAlbumAbility;
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI;
        NextLiveData<List<MediaModel>> nextLiveData;
        NextLiveData<List<MediaModel>> nextLiveData2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            C1A3X c1a3x = C1A3X.LIZ;
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) awS682S0100000_33.l0;
            c1a3x.getClass();
            if (!C1A3X.LIZJ(ecTakePhotoActivity)) {
                ((EcTakePhotoActivity) awS682S0100000_33.l0).W(false);
            }
            IEcExtendAlbumAbility iEcExtendAlbumAbility2 = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI((EcTakePhotoActivity) awS682S0100000_33.l0, null), IEcExtendAlbumAbility.class, null);
            if (iEcExtendAlbumAbility2 != null) {
                iEcExtendAlbumAbility2.dismiss();
            }
        } else {
            ((EcTakePhotoActivity) awS682S0100000_33.l0).W(true);
            EcTakePhotoActivity ecTakePhotoActivity2 = (EcTakePhotoActivity) awS682S0100000_33.l0;
            if (!ecTakePhotoActivity2.o() || C309120C9u.LIZ().enable != 0) {
                C1A3X c1a3x2 = C1A3X.LIZ;
                String[] strArrLLLLZIL = ecTakePhotoActivity2.LLLLZIL();
                c1a3x2.getClass();
                if ((C1A3X.LIZLLL(ecTakePhotoActivity2, strArrLLLLZIL) || C1A3X.LIZ(ecTakePhotoActivity2)) && (iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI(ecTakePhotoActivity2, null), IEcExtendAlbumAbility.class, null)) != null && !iEcExtendAlbumAbility.isShown() && (ecPhotoSearchAlbumVMLLLLZLLLI = ecTakePhotoActivity2.LLLLZLLLI()) != null) {
                    ecPhotoSearchAlbumVMLLLLZLLLI.wQ2(ecTakePhotoActivity2, new AwS612S0100000_33(ecTakePhotoActivity2, 218));
                }
                if (ecTakePhotoActivity2.LLLILZLLLI.LLILLJJLI) {
                    EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI2 = ecTakePhotoActivity2.LLLLZLLLI();
                    if (ecPhotoSearchAlbumVMLLLLZLLLI2 != null && (nextLiveData2 = ecPhotoSearchAlbumVMLLLLZLLLI2.LLILZ) != null) {
                        nextLiveData2.removeObserver(ecTakePhotoActivity2.LLLJIL);
                    }
                    EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLLLLZLLLI3 = ecTakePhotoActivity2.LLLLZLLLI();
                    if (ecPhotoSearchAlbumVMLLLLZLLLI3 != null && (nextLiveData = ecPhotoSearchAlbumVMLLLLZLLLI3.LLILZ) != null) {
                        nextLiveData.observe(ecTakePhotoActivity2, ecTakePhotoActivity2.LLLJIL);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS682S0100000_33 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L1f
            X.1A5m r0 = X.C2173761A5m.LIZ
            r0.getClass()
            boolean r0 = r4 instanceof X.C2173771A5n
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.l0
            com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingAssem r0 = (com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingAssem) r0
            android.view.ViewGroup r0 = r0.LLJJIJIL
            if (r0 == 0) goto L1c
            X.C500260Jjc.LLFFF(r0)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1f:
            java.lang.Object r0 = r1.l0
            com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingAssem r0 = (com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingAssem) r0
            android.view.ViewGroup r0 = r0.LLJJIJIL
            if (r0 == 0) goto L1c
            X.C500260Jjc.LJIILIIL(r0)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS682S0100000_33.invoke$2(kotlin.jvm.internal.AwS682S0100000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause/stopAnimation received, pause = ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", stop = ");
        sbLIZ.append(zBooleanValue2);
        C2188811AlT.LIZIZ(sbLIZ);
        C21459118yT c21459118yT = ((FriendsV3MusicTitleAssem) awS682S0100000_33.l0).LLLIIII;
        if (c21459118yT != null && (zBooleanValue || zBooleanValue2)) {
            c21459118yT.setTextShader(null);
            c21459118yT.removeOnLayoutChangeListener((View.OnLayoutChangeListener) ((FriendsV3MusicTitleAssem) awS682S0100000_33.l0).LLLLLIL.getValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS682S0100000_33 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L91
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8f
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS66S0001000_33 r4 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 3
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131849921(0x7f1172c1, float:1.933339E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131849920(0x7f1172c0, float:1.9333388E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS468S0200000_33 r2 = new kotlin.jvm.internal.AwS468S0200000_33
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity r1 = (com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity) r1
            r0 = 1
            r2.<init>(r1, r4, r0)
            r0 = 1817699187(0x6c57e373, float:1.0439726E27)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8f:
            r0 = 0
            goto L3e
        L91:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS682S0100000_33.invoke$4(kotlin.jvm.internal.AwS682S0100000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        ConversationInfo conversationInfo = (ConversationInfo) obj3;
        if (view != null) {
            ((C1863240yaQ) awS682S0100000_33.l0).LJIIL(view, conversationInfo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        ConversationInfo conversationInfo = (ConversationInfo) obj3;
        if (view != null) {
            ((C1863240yaQ) awS682S0100000_33.l0).LJIIL(view, conversationInfo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        ConversationInfo conversationInfo = (ConversationInfo) obj3;
        if (view != null) {
            ((C1863240yaQ) awS682S0100000_33.l0).LJIIL(view, conversationInfo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS682S0100000_33 awS682S0100000_33, Object obj, Object obj2, Object obj3) {
        ((InterfaceC19321010iO) awS682S0100000_33.l0).getAction().invoke(obj, obj3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS682S0100000_33 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L92
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L90
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS66S0001000_33 r4 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 8
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131829561(0x7f112339, float:1.9292095E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131829558(0x7f112336, float:1.9292089E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS468S0200000_33 r2 = new kotlin.jvm.internal.AwS468S0200000_33
            r0 = r16
            java.lang.Object r1 = r0.l0
            X.11rr r1 = (X.C19634511rr) r1
            r0 = 7
            r2.<init>(r1, r4, r0)
            r0 = -1360850488(0xffffffffaee311c8, float:-1.03259234E-10)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L90:
            r0 = 0
            goto L3e
        L92:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS682S0100000_33.invoke$9(kotlin.jvm.internal.AwS682S0100000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
