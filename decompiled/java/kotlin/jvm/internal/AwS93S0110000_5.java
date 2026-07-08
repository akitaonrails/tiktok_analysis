package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0E55;
import X.C0EAX;
import X.C0EZJ;
import X.C0EZP;
import X.C0F3O;
import X.C0FB3;
import X.C0FFE;
import X.C0FHM;
import X.C0FKP;
import X.C0FLB;
import X.C0FUG;
import X.C0FV1;
import X.C1397660mTU;
import X.C19647711tz;
import X.C360160EAc;
import X.C360210EAh;
import X.C363550ENd;
import X.C373060Ejw;
import X.C373070Ejx;
import X.C373080Ejy;
import X.C373090Ejz;
import X.C373410EkV;
import X.C375830EoP;
import X.C377660ErM;
import X.C377830Erd;
import X.C384100F4e;
import X.C387990FJd;
import X.C389180FNs;
import X.C390090FRf;
import X.C545820Lau;
import X.EnumC366550EYr;
import X.EnumC373600Eko;
import X.EnumC384110F4f;
import X.InterfaceC1453430nvR;
import X.InterfaceC360800ECo;
import X.InterfaceC373190Ek9;
import X.InterfaceC373200EkA;
import X.InterfaceC373210EkB;
import X.InterfaceC373240EkE;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS93S0110000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(C0EAX c0eax, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0eax;
        this.z1 = true;
    }

    public static final Object invoke$0(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        return C389180FNs.LIZ((C389180FNs) obj, null, null, null, null, false, null, null, null, awS93S0110000_5.z1, false, null, (EnumC366550EYr) awS93S0110000_5.l0, 23039);
    }

    public static final Object invoke$1(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        C377830Erd c377830Erd = (C377830Erd) obj;
        if (awS93S0110000_5.z1) {
            int i = c377830Erd.LJIIL;
            return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i), null, null, null, Integer.valueOf(i), null, null, false, 245631);
        }
        int i2 = ((C377660ErM) awS93S0110000_5.l0).LIZLLL;
        c377830Erd.LJIIL = i2;
        return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i2), null, null, null, Integer.valueOf(((C377660ErM) awS93S0110000_5.l0).LIZLLL), null, null, false, 245631);
    }

    public static final Object invoke$10(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        if (awS93S0110000_5.z1) {
            InterfaceC373190Ek9 interfaceC373190Ek9H2 = ((C373070Ejx) awS93S0110000_5.l0).H2();
            if (interfaceC373190Ek9H2 != null) {
                interfaceC373190Ek9H2.save();
            }
        } else {
            InterfaceC373190Ek9 interfaceC373190Ek9H22 = ((C373070Ejx) awS93S0110000_5.l0).H2();
            if (interfaceC373190Ek9H22 != null) {
                interfaceC373190Ek9H22.cancel();
            }
        }
        InterfaceC373200EkA interfaceC373200EkAG2 = ((C373070Ejx) awS93S0110000_5.l0).G2();
        if (interfaceC373200EkAG2 != null) {
            interfaceC373200EkAG2.exit(awS93S0110000_5.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        Resources resources;
        Long l;
        int iLongValue;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        Context contextLIZIZ = C545820Lau.LIZIZ((C373410EkV) awS93S0110000_5.l0);
        if (contextLIZIZ != null) {
            resources = contextLIZIZ.getResources();
        } else {
            resources = null;
        }
        if (!awS93S0110000_5.z1 ? (l = ((C373410EkV) awS93S0110000_5.l0).LLJJJJLIIL) != null : (l = ((C373410EkV) awS93S0110000_5.l0).LLJJL) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        accessibilityNodeInfoCompat.setStateDescription(C0F3O.LIZIZ(resources, iLongValue));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        EnumC373600Eko enumC373600Eko;
        int iLongValue;
        int iLongValue2;
        LiveState<Long> liveStateC8;
        LiveState<Long> liveStateJq;
        C0E55 player;
        Boolean bool = Boolean.TRUE;
        boolean z = awS93S0110000_5.z1;
        C0E48 c0e48F4 = ((C0EZJ) awS93S0110000_5.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null && player.isPlaying()) {
            enumC373600Eko = EnumC373600Eko.PLAY;
        } else {
            enumC373600Eko = EnumC373600Eko.PAUSE;
        }
        InterfaceC360800ECo interfaceC360800ECoK4 = ((C0EZJ) awS93S0110000_5.l0).K4();
        if (interfaceC360800ECoK4 != null && (liveStateJq = interfaceC360800ECoK4.jq()) != null) {
            iLongValue = (int) liveStateJq.LIZJ().longValue();
        } else {
            iLongValue = 0;
        }
        InterfaceC360800ECo interfaceC360800ECoK42 = ((C0EZJ) awS93S0110000_5.l0).K4();
        if (interfaceC360800ECoK42 != null && (liveStateC8 = interfaceC360800ECoK42.c8()) != null) {
            iLongValue2 = (int) liveStateC8.LIZJ().longValue();
        } else {
            iLongValue2 = 0;
        }
        obj.getClass();
        return new C0EZP(bool, z, enumC373600Eko, iLongValue, iLongValue2);
    }

    public static final Object invoke$13(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        if (awS93S0110000_5.z1) {
            textStickerModel.setForceEffectRender(true);
        }
        if (((Integer) awS93S0110000_5.l0) != null) {
            textStickerModel.getBaseStickerModel().setZIndex(((Integer) awS93S0110000_5.l0).intValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        ((C0FUG) obj).LJIJI(((C0FFE) awS93S0110000_5.l0).getStickerId(), awS93S0110000_5.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        ((C0FUG) obj).LJIJI(((C0FFE) awS93S0110000_5.l0).getStickerId(), awS93S0110000_5.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        boolean z;
        C19647711tz c19647711tz = (C19647711tz) obj;
        if (awS93S0110000_5.z1 && ((C0FV1) awS93S0110000_5.l0).LJII) {
            z = true;
        } else {
            z = false;
        }
        return C19647711tz.LIZ(c19647711tz, false, false, false, z, 0.0f, 1015);
    }

    public static final Object invoke$17(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        boolean z;
        C19647711tz c19647711tz = (C19647711tz) obj;
        if (awS93S0110000_5.z1 && ((C0FV1) awS93S0110000_5.l0).LJII) {
            z = true;
        } else {
            z = false;
        }
        return C19647711tz.LIZ(c19647711tz, z, false, false, false, 0.0f, 1022);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS93S0110000_5 r8, java.lang.Object r9) {
        /*
            r3 = r9
            X.11tz r3 = (X.C19647711tz) r3
            r4 = 0
            boolean r2 = r8.z1
            r6 = 0
            if (r2 == 0) goto L2c
            java.lang.Object r1 = r8.l0
            X.0FV1 r1 = (X.C0FV1) r1
            boolean r0 = r1.LJII
            if (r0 == 0) goto L2c
            boolean r0 = r1.LJIIIIZZ
            if (r0 != 0) goto L2c
            r5 = 1
        L16:
            java.lang.Object r1 = r8.l0
            X.0FV1 r1 = (X.C0FV1) r1
            boolean r0 = r1.LJIIIIZZ
            if (r0 == 0) goto L23
            boolean r0 = r1.LJII
            if (r0 != 0) goto L23
            r6 = 1
        L23:
            r8 = 0
            r9 = 1017(0x3f9, float:1.425E-42)
            r7 = r4
            X.11tz r0 = X.C19647711tz.LIZ(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L2c:
            r5 = 0
            if (r2 == 0) goto L23
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S0110000_5.invoke$18(kotlin.jvm.internal.AwS93S0110000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$19(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        ((C0FUG) obj).LJIJI(((C390090FRf) awS93S0110000_5.l0).getStickerId(), awS93S0110000_5.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        C377830Erd c377830Erd = (C377830Erd) obj;
        if (awS93S0110000_5.z1) {
            int i = c377830Erd.LJIIJ;
            return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i), Integer.valueOf(i), null, null, null, null, null, false, 261759);
        }
        int i2 = ((C377660ErM) awS93S0110000_5.l0).LIZLLL;
        c377830Erd.LJIIJ = i2;
        return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i2), Integer.valueOf(((C377660ErM) awS93S0110000_5.l0).LIZLLL), Integer.valueOf(((C377660ErM) awS93S0110000_5.l0).LJ), null, null, null, null, false, 261247);
    }

    public static final Object invoke$20(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        C384100F4e c384100F4e = (C384100F4e) awS93S0110000_5.l0;
        c384100F4e.LJIIJ = EnumC384110F4f.SWITCH_FILTER;
        InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) c384100F4e.LJII.getValue();
        if (interfaceC1453430nvR != null) {
            interfaceC1453430nvR.OK(awS93S0110000_5.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        C387990FJd c387990FJd = (C387990FJd) obj;
        if (awS93S0110000_5.z1) {
            if (!((C0FKP) ((C0FLB) awS93S0110000_5.l0).LJII.getValue()).LIZLLL) {
                C0FKP c0fkp = (C0FKP) ((C0FLB) awS93S0110000_5.l0).LJII.getValue();
                c0fkp.LIZJ = C387990FJd.LIZ(c0fkp.LIZIZ.LJIIJ.LIZ, null, null, null, null, null, null, 63);
                c0fkp.LIZLLL = true;
            }
            return new C387990FJd(null, null, null, null, null, C0FHM.VISIBLE, 31);
        }
        if (((C0FKP) ((C0FLB) awS93S0110000_5.l0).LJII.getValue()).LIZLLL) {
            C0FKP c0fkp2 = (C0FKP) ((C0FLB) awS93S0110000_5.l0).LJII.getValue();
            c0fkp2.LIZLLL = false;
            C387990FJd c387990FJdLIZ = C387990FJd.LIZ(c0fkp2.LIZJ, null, null, null, null, null, null, 63);
            C0FHM c0fhm = C0FHM.GONE;
            C0FHM c0fhm2 = C0FHM.VISIBLE;
            return C387990FJd.LIZ(c387990FJdLIZ, null, null, c0fhm2, c0fhm2, null, c0fhm, 19);
        }
        C0FHM c0fhm3 = C0FHM.GONE;
        C0FHM c0fhm4 = C0FHM.VISIBLE;
        return C387990FJd.LIZ(c387990FJd, null, null, c0fhm4, c0fhm4, null, c0fhm3, 19);
    }

    public static final Object invoke$3(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        C377830Erd c377830Erd = (C377830Erd) obj;
        if (awS93S0110000_5.z1) {
            int i = c377830Erd.LJIIJJI;
            return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i), null, null, Integer.valueOf(i), null, null, null, false, 253823);
        }
        int i2 = ((C377660ErM) awS93S0110000_5.l0).LIZLLL;
        c377830Erd.LJIIJJI = i2;
        return C377830Erd.LIZ(c377830Erd, false, null, null, null, null, Integer.valueOf(i2), null, null, Integer.valueOf(((C377660ErM) awS93S0110000_5.l0).LIZLLL), null, Integer.valueOf(((C377660ErM) awS93S0110000_5.l0).LJ), null, false, 221055);
    }

    public static final Object invoke$4(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        if (awS93S0110000_5.z1) {
            InterfaceC373240EkE interfaceC373240EkEG2 = ((C373090Ejz) awS93S0110000_5.l0).G2();
            if (interfaceC373240EkEG2 != null) {
                interfaceC373240EkEG2.save();
            }
        } else {
            InterfaceC373240EkE interfaceC373240EkEG22 = ((C373090Ejz) awS93S0110000_5.l0).G2();
            if (interfaceC373240EkEG22 != null) {
                interfaceC373240EkEG22.cancel();
            }
        }
        InterfaceC373200EkA interfaceC373200EkAW2 = ((C373090Ejz) awS93S0110000_5.l0).w2();
        if (interfaceC373200EkAW2 != null) {
            interfaceC373200EkAW2.exit(awS93S0110000_5.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        if (awS93S0110000_5.z1) {
            ((C373060Ejw) awS93S0110000_5.l0).save();
        } else {
            ((C373060Ejw) awS93S0110000_5.l0).X1();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS93S0110000_5 r12, java.lang.Object r13) {
        /*
            r5 = r13
            X.0Emc r5 = (X.C374720Emc) r5
            r6 = 0
            java.lang.Object r0 = r12.l0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L30
            com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr r0 = r0.getChromaChannels()
            if (r0 == 0) goto L30
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLEChromaChannel r0 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r0
            com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r0.getSegment()
            float r0 = r0.getIntensity()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L35
            goto L16
        L30:
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            goto L4d
        L34:
            r1 = r4
        L35:
            com.bytedance.ies.nle.editor_jni.NLEChromaChannel r1 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r1
            if (r1 == 0) goto L30
            com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r1.getSegment()
            if (r0 == 0) goto L30
            float r0 = r0.getIntensity()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L30
            float r8 = r0.floatValue()
        L4d:
            java.lang.Object r0 = r12.l0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            if (r0 == 0) goto L77
            com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr r0 = r0.getChromaChannels()
            if (r0 == 0) goto L77
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLEChromaChannel r0 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r0
            com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r0.getSegment()
            float r0 = r0.getShadow()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7a
            goto L5d
        L77:
            r9 = 0
            goto L92
        L79:
            r1 = r4
        L7a:
            com.bytedance.ies.nle.editor_jni.NLEChromaChannel r1 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r1
            if (r1 == 0) goto L77
            com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r1.getSegment()
            if (r0 == 0) goto L77
            float r0 = r0.getShadow()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L77
            float r9 = r0.floatValue()
        L92:
            boolean r10 = r12.z1
            r13 = 135(0x87, float:1.89E-43)
            r7 = r6
            r11 = r10
            r12 = r6
            X.0Emc r0 = X.C374720Emc.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S0110000_5.invoke$6(kotlin.jvm.internal.AwS93S0110000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        return C360210EAh.LIZ((C360210EAh) obj, null, null, null, null, new C375830EoP(C360160EAc.LIZ(((C0EAX) awS93S0110000_5.l0).T2().LJ.LIZ, awS93S0110000_5.z1, false, false, 6)), null, null, null, false, null, false, false, 0, false, 16367);
    }

    public static final Object invoke$8(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        if (awS93S0110000_5.z1) {
            InterfaceC373210EkB interfaceC373210EkBH2 = ((C373080Ejy) awS93S0110000_5.l0).H2();
            if (interfaceC373210EkBH2 != null) {
                interfaceC373210EkBH2.save();
            }
        } else {
            InterfaceC373210EkB interfaceC373210EkBH22 = ((C373080Ejy) awS93S0110000_5.l0).H2();
            if (interfaceC373210EkBH22 != null) {
                interfaceC373210EkBH22.cancel();
            }
        }
        InterfaceC373200EkA interfaceC373200EkAW2 = ((C373080Ejy) awS93S0110000_5.l0).w2();
        if (interfaceC373200EkAW2 != null) {
            interfaceC373200EkAW2.exit(awS93S0110000_5.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS93S0110000_5 awS93S0110000_5, Object obj) {
        String uuid;
        C0E48 c0e48F4;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0FB3 c0fb3 = (C0FB3) obj;
        Boolean boolValueOf = Boolean.valueOf(awS93S0110000_5.z1);
        if (awS93S0110000_5.z1 && (c0e48F4 = ((C363550ENd) awS93S0110000_5.l0).F4()) != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        } else {
            uuid = null;
        }
        return C0FB3.LIZ(c0fb3, null, null, null, null, null, boolValueOf, uuid, null, null, null, null, null, 0L, false, 65343);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(C373410EkV c373410EkV, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c373410EkV;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(C384100F4e c384100F4e, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c384100F4e;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S0110000_5(C0FFE c0ffe, C0FFE<? extends T> c0ffe2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c0ffe;
        this.z1 = c0ffe2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(C390090FRf c390090FRf, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c390090FRf;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(NLETrackSlot nLETrackSlot, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = nLETrackSlot;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C363550ENd c363550ENd, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c363550ENd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, EnumC366550EYr enumC366550EYr, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC366550EYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C0EZJ c0ezj, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0ezj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C373060Ejw c373060Ejw, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c373060Ejw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C373070Ejx c373070Ejx, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c373070Ejx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C373080Ejy c373080Ejy, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c373080Ejy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C373090Ejz c373090Ejz, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c373090Ejz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C377660ErM c377660ErM, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c377660ErM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C0FLB c0flb, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0flb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, C0FV1 c0fv1, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0fv1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S0110000_5(boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = num;
    }
}
