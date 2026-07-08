package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C1290210jgB;
import X.C12OY;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1547980qNw;
import X.C1722300uv6;
import X.C19KU;
import X.C1A2G;
import X.C1A5D;
import X.C1AGN;
import X.C1AGX;
import X.C1AH3;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C1AI9;
import X.C1AIA;
import X.C1AIE;
import X.C1AIG;
import X.C1AIP;
import X.C1AWM;
import X.C21661919q5;
import X.C21662019q6;
import X.C2173661A5c;
import X.C2173691A5f;
import X.C2176531AGd;
import X.C2178071AMb;
import X.C2178091AMd;
import X.C2188811AlT;
import X.C259800zU;
import X.C723830SaL;
import X.C766270U4b;
import X.C985403tE;
import X.DialogInterfaceOnClickListenerC2189611Aml;
import X.EnumC1547970qNv;
import X.InterfaceC738310Sxh;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.view.View;
import cj7.b;
import com.bytedance.android.livesdk.broadcast.schema.BroadcastLiveCenterGrowthTaskEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.PathAnimationValue;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.EcPermissionVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VERecorder;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.AnchorTaskGuideInfo;
import webcast.data.AnchorTaskGuideInfoItem;
import webcast.data.AnchorTaskProgress;

/* JADX INFO: loaded from: classes34.dex */
public class AwS242S0300000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        C1290210jgB c1290210jgB = (C1290210jgB) obj;
        EnumC1547970qNv enumC1547970qNv = c1290210jgB.LIZIZ;
        if (enumC1547970qNv != null) {
            int i = C1547980qNw.LIZ[enumC1547970qNv.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String str = c1290210jgB.LIZ;
                    if (new C0VSJ(str).exists()) {
                        Function1 function1 = (Function1) awS242S0300000_33.l2;
                        if (function1 != null) {
                            function1.invoke(new C2178071AMb(((XAudioSrc) awS242S0300000_33.l1).getPlayUrl(), str, null, null, ((XAudioSrc) awS242S0300000_33.l1).getPlayModel(), 12));
                        }
                    } else {
                        super/*X.1AMe*/.LIZIZ((XAudioSrc) awS242S0300000_33.l1, (Function1) awS242S0300000_33.l2);
                    }
                }
            } else {
                String str2 = c1290210jgB.LIZ;
                if (str2 != null) {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenFd = ((C2178091AMd) awS242S0300000_33.l0).LIZIZ.getAssets().openFd(str2);
                        Function1 function12 = (Function1) awS242S0300000_33.l2;
                        if (function12 != null) {
                            function12.invoke(new C2178071AMb(((XAudioSrc) awS242S0300000_33.l1).getPlayUrl(), null, null, assetFileDescriptorOpenFd, ((XAudioSrc) awS242S0300000_33.l1).getPlayModel(), 6));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        super/*X.1AMe*/.LIZIZ((XAudioSrc) awS242S0300000_33.l1, (Function1) awS242S0300000_33.l2);
                    }
                } else {
                    super/*X.1AMe*/.LIZIZ((XAudioSrc) awS242S0300000_33.l1, (Function1) awS242S0300000_33.l2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        C1AWM c1awm;
        ((Number) obj).intValue();
        VERecorder vERecorder = ((b) awS242S0300000_33.l0).LIZ;
        Function1 function1 = (Function1) awS242S0300000_33.l1;
        if (function1 != null) {
            c1awm = new C1AWM(function1);
        } else {
            c1awm = null;
        }
        vERecorder.LJI(c1awm);
        Function0 function0 = (Function0) awS242S0300000_33.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        String str;
        C1AI6 c1ai6;
        Context context;
        if (((C1AIE) awS242S0300000_33.l0).LJIILJJIL) {
            View view = ((C1AIG) awS242S0300000_33.l1).LLIZ;
            if (view != null && (context = view.getContext()) != null) {
                C1AIA c1aia = (C1AIA) awS242S0300000_33.l2;
                C1AIG c1aig = (C1AIG) awS242S0300000_33.l1;
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZ(2131857000);
                C985403tE.LIZ(c1397580mTM, new AwS399S0200000_33(c1aia, c1aig, 44));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C1AI2 c1ai2 = new C1AI2("show", null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -2, 2097151);
            C1AI1.LIZ(c1ai2, ((C1AIA) awS242S0300000_33.l2).LIZLLL, true);
            C1AI0.LJIILL(c1ai2);
        } else {
            C1AI9 c1ai9 = ((C1AIA) awS242S0300000_33.l2).LIZIZ;
            if (c1ai9 != null) {
                c1ai9.LJ(((C1AIG) awS242S0300000_33.l1).getLayoutPosition());
            }
        }
        C1AIE c1aie = (C1AIE) awS242S0300000_33.l0;
        String str2 = c1aie.LJIIIZ;
        String str3 = c1aie.LJIIL;
        boolean z = c1aie.LJIILIIL;
        boolean z2 = c1aie.LJIILJJIL;
        C1AI9 c1ai92 = ((C1AIA) awS242S0300000_33.l2).LIZIZ;
        if (c1ai92 == null || (c1ai6 = c1ai92.LIZJ) == null || (str = c1ai6.LJIIIIZZ) == null) {
            str = "";
        }
        C1AI2 c1ai22 = new C1AI2(null, null, str2, "delete", null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, z, str, false, null, Boolean.valueOf(z2), null, null, null, 0, null, 0L, -13, 2094879);
        C1AI1.LIZ(c1ai22, ((C1AIA) awS242S0300000_33.l2).LIZLLL, true);
        C1AI0.LJIJ(c1ai22);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        String str;
        C1AI6 c1ai6;
        C1AIA c1aia = (C1AIA) awS242S0300000_33.l0;
        C1AIG c1aig = (C1AIG) awS242S0300000_33.l1;
        C1AIE c1aie = (C1AIE) awS242S0300000_33.l2;
        c1aia.getClass();
        if (c1aie.LJIILJJIL) {
            C766270U4b.LIZLLL(2131857006);
        } else if (c1aie.LJII != 4) {
            String str2 = c1aie.LJIIIZ;
            String str3 = c1aie.LJIIL;
            boolean z = c1aie.LJIILIIL;
            C1AI9 c1ai9 = c1aia.LIZIZ;
            if (c1ai9 == null || (c1ai6 = c1ai9.LIZJ) == null || (str = c1ai6.LJIIIIZZ) == null) {
                str = "";
            }
            C1AI2 c1ai2 = new C1AI2(null, null, str2, "edit_wish_content", null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, z, str, false, null, Boolean.FALSE, null, null, null, 0, null, 0L, -13, 2094879);
            C1AI1.LIZ(c1ai2, c1aia.LIZLLL, true);
            C1AI0.LJIJ(c1ai2);
            C1AIP c1aip = c1aia.LIZJ;
            if (c1aip != null) {
                c1aip.hA(c1aig, c1aie);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        ((Function1) awS242S0300000_33.l0).invoke(obj);
        ((C1AGN) awS242S0300000_33.l1).LJIIIIZZ.put(((PathAnimationValue) awS242S0300000_33.l2).LIZ(), obj);
        C1AGN c1agn = (C1AGN) awS242S0300000_33.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinish loadResult:");
        sbLIZ.append((Function1) awS242S0300000_33.l0);
        sbLIZ.append(" updateAvatarBitmap:");
        sbLIZ.append(obj.hashCode());
        c1agn.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        return C2173691A5f.LIZ((C2173691A5f) obj, new C2173661A5c((C1722300uv6) awS242S0300000_33.l0, null, (Function0) awS242S0300000_33.l1, (Float) awS242S0300000_33.l2, 2), false, null, 0, 14);
    }

    public static final Object invoke$4(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        Function1 function1 = (Function1) awS242S0300000_33.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C723830SaL.LIZIZ((ReusedUISlotAssem) awS242S0300000_33.l1, new AwS577S0100000_33((Function0) awS242S0300000_33.l2, (Function0<Unit>) 332));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        RadiusLayout radiusLayout = (RadiusLayout) obj;
        ((C21662019q6) awS242S0300000_33.l0).LIZIZ = radiusLayout;
        radiusLayout.setBackground(((C21661919q5) awS242S0300000_33.l1).LIZJ((Context) awS242S0300000_33.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS242S0300000_33 awS242S0300000_33, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        EcPermissionVM ecPermissionVM = (EcPermissionVM) awS242S0300000_33.l0;
        boolean z = ((C1A2G) awS242S0300000_33.l1).LL;
        boolean z2 = ((C1A2G) awS242S0300000_33.l2).LL;
        ecPermissionVM.getClass();
        jSONObject.put("camera_state", EcPermissionVM.vQ2(z, z2));
        EcPermissionVM ecPermissionVM2 = (EcPermissionVM) awS242S0300000_33.l0;
        boolean z3 = ((C1A2G) awS242S0300000_33.l1).LLILLJJLI;
        boolean z4 = ((C1A2G) awS242S0300000_33.l2).LLILLJJLI;
        ecPermissionVM2.getClass();
        jSONObject.put("album_state", EcPermissionVM.vQ2(z3, z4));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS242S0300000_33 awS242S0300000_33, Object obj) {
        String str;
        AnchorTaskGuideInfoItem anchorTaskGuideInfoItem;
        C12OY.LJIILLIIL(C12OY.LIZ, ((C19KU) awS242S0300000_33.l0).LL, C1AH3.GROWTH.getReportName(), "click", null, 0, null, null, 120);
        DataChannel dataChannel = ((C19KU) awS242S0300000_33.l0).LL;
        if (dataChannel != null) {
            AnchorTaskGuideInfo anchorTaskGuideInfo = ((AnchorTaskProgress) awS242S0300000_33.l1).taskGuideInfo;
            if (anchorTaskGuideInfo == null || (anchorTaskGuideInfoItem = anchorTaskGuideInfo.guideInRoom) == null || (str = anchorTaskGuideInfoItem.redirectSchema) == null) {
                str = "";
            }
            dataChannel.LC0(BroadcastLiveCenterGrowthTaskEvent.class, str);
        }
        C1AGX.LIZIZ(((C19KU) awS242S0300000_33.l0).LL, (C2176531AGd) awS242S0300000_33.l2, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS242S0300000_33 r3, java.lang.Object r4) {
        /*
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "is_disable_ignore"
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r0 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            boolean r0 = com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings.LJIIJ
            if (r0 == 0) goto L65
            if (r1 != 0) goto L27
            com.bytedance.keva.Keva r0 = X.C1A5O.LIZ
            java.lang.Object r2 = r3.l0
            X.1A5D r2 = (X.C1A5D) r2
            java.lang.String[] r1 = X.C1A5O.LIZIZ
            r0 = 0
            java.lang.String r0 = r2.LIZ(r0)
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 != 0) goto L65
        L27:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.service.IFeedDebugService> r0 = com.ss.android.ugc.aweme.service.IFeedDebugService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.service.IFeedDebugService r2 = (com.ss.android.ugc.aweme.service.IFeedDebugService) r2
            X.10ug r1 = X.C19397210ug.LIZ
            java.lang.Object r0 = r3.l0
            X.1A5D r0 = (X.C1A5D) r0
            android.view.View r0 = r0.LIZ
            r1.getClass()
            X.C19397210ug.LIZIZ(r0)
            java.lang.Object r0 = r3.l1
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "extra_msg"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L5c
            java.lang.String r0 = ""
        L5c:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r2.LJJII()
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS242S0300000_33.invoke$8(kotlin.jvm.internal.AwS242S0300000_33, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS242S0300000_33 r3, java.lang.Object r4) {
        /*
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "is_disable_ignore"
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r0 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            boolean r0 = com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings.LJIIJJI
            if (r0 == 0) goto L65
            if (r1 != 0) goto L27
            com.bytedance.keva.Keva r0 = X.C1A5O.LIZ
            java.lang.Object r2 = r3.l0
            X.1A5D r2 = (X.C1A5D) r2
            java.lang.String[] r1 = X.C1A5O.LIZIZ
            r0 = 0
            java.lang.String r0 = r2.LIZ(r0)
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 != 0) goto L65
        L27:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.service.IFeedDebugService> r0 = com.ss.android.ugc.aweme.service.IFeedDebugService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.service.IFeedDebugService r2 = (com.ss.android.ugc.aweme.service.IFeedDebugService) r2
            X.10ug r1 = X.C19397210ug.LIZ
            java.lang.Object r0 = r3.l0
            X.1A5D r0 = (X.C1A5D) r0
            android.view.View r0 = r0.LIZ
            r1.getClass()
            X.C19397210ug.LIZIZ(r0)
            java.lang.Object r0 = r3.l1
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "extra_msg"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L5c
            java.lang.String r0 = ""
        L5c:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r2.LJJII()
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS242S0300000_33.invoke$9(kotlin.jvm.internal.AwS242S0300000_33, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS242S0300000_33(X.C1AIE r3, X.C1AIG r4, X.C1AIA r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 10 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS242S0300000_33.<init>(X.1AIE, X.1AIG, X.1AIA, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS242S0300000_33(C1722300uv6 c1722300uv6, C1722300uv6 c1722300uv62, Function0<Unit> function0, Float f) {
        super(1);
        this.$t = f;
        this.l0 = c1722300uv6;
        this.l1 = c1722300uv62;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(C19KU c19ku, AnchorTaskProgress anchorTaskProgress, C2176531AGd c2176531AGd, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19ku;
        this.l1 = anchorTaskProgress;
        this.l2 = c2176531AGd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(C21662019q6 c21662019q6, C21661919q5 c21661919q5, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21662019q6;
        this.l1 = c21661919q5;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(C2178091AMd c2178091AMd, XAudioSrc xAudioSrc, AwS612S0100000_33 awS612S0100000_33, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2178091AMd;
        this.l1 = xAudioSrc;
        this.l2 = awS612S0100000_33;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS242S0300000_33(b bVar, b bVar2, Function1<? super Integer, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = bVar;
        this.l1 = bVar2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(EcPermissionVM ecPermissionVM, C1A2G c1a2g, C1A2G c1a2g2, int i) {
        super(1);
        this.$t = i;
        this.l0 = ecPermissionVM;
        this.l1 = c1a2g;
        this.l2 = c1a2g2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS242S0300000_33(Function1 function1, Function1<? super InterfaceC738310Sxh, Unit> function12, ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = reusedUISlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(AwS127S0400000_33 awS127S0400000_33, C1AGN c1agn, PathAnimationValue pathAnimationValue, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS127S0400000_33;
        this.l1 = c1agn;
        this.l2 = pathAnimationValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0300000_33(C1A5D c1a5d, C259800zU c259800zU, C259800zU c259800zU2, DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1a5d;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
    }
}
