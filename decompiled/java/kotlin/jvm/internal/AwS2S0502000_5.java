package kotlin.jvm.internal;

import X.C09AY;
import X.C0FVT;
import X.C1439780nZQ;
import X.C1439800nZS;
import X.C1453000nuk;
import X.C1453210nv5;
import X.C1664740tQG;
import X.C2188811AlT;
import X.C348460DlM;
import X.C371780Ehs;
import X.C385200F8k;
import X.C5183020f;
import X.C574070MfN;
import X.InterfaceC1452170ntP;
import X.InterfaceC1453220nv6;
import X.InterfaceC1453430nvR;
import X.InterfaceC1461650o8h;
import X.InterfaceC2217461Bqa;
import X.InterfaceC358220E2q;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS2S0502000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS2S0502000_5 awS2S0502000_5) {
        FilterBean filterBeanLJIIIIZZ;
        C1439780nZQ c1439780nZQ = (C1439780nZQ) awS2S0502000_5.l0;
        NLETrack nLETrack = (NLETrack) awS2S0502000_5.l2;
        ((NLETemplateModel) awS2S0502000_5.l3).getTemplateInfo();
        InterfaceC1452170ntP interfaceC1452170ntPG = c1439780nZQ.g();
        if (interfaceC1452170ntPG != null) {
            ImageFilterInfo imageFilterInfoLJFF = C371780Ehs.LJFF(nLETrack);
            if (imageFilterInfoLJFF != null && (filterBeanLJIIIIZZ = C574070MfN.LJIIIIZZ(imageFilterInfoLJFF)) != null) {
                C1664740tQG c1664740tQG = c1439780nZQ.LLILZLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1439780nZQ.LLJJIJI;
                InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) c1664740tQG.getValue(c1439780nZQ, interfaceC2217461BqaArr[3]);
                if (interfaceC1453430nvR != null) {
                    interfaceC1453430nvR.l4(true);
                }
                InterfaceC358220E2q value = c1439780nZQ.LIZLLL().xq1().getValue();
                InterfaceC1453220nv6 value2 = c1439780nZQ.LIZLLL().zj2().getValue();
                if (value != null && value2 != null) {
                    value.LIZIZ(filterBeanLJIIIIZZ, C1453210nv5.LIZJ(filterBeanLJIIIIZZ, imageFilterInfoLJFF.getFilterIntensityRatio(), value2));
                }
                InterfaceC1453430nvR interfaceC1453430nvR2 = (InterfaceC1453430nvR) c1439780nZQ.LLILZLL.getValue(c1439780nZQ, interfaceC2217461BqaArr[3]);
                if (interfaceC1453430nvR2 != null) {
                    interfaceC1453430nvR2.Dq2(new C1453000nuk(false, filterBeanLJIIIIZZ, false, (String) null, false, 60), false, null, true);
                }
            } else {
                Pair<C348460DlM, Integer> pairLJI = C371780Ehs.LJI(nLETrack);
                if (pairLJI != null) {
                    InterfaceC1461650o8h interfaceC1461650o8hLJ = c1439780nZQ.LJ();
                    if (interfaceC1461650o8hLJ != null) {
                        interfaceC1461650o8hLJ.sJ0(pairLJI.getFirst(), null, pairLJI.getSecond().intValue());
                    }
                    String str = pairLJI.getFirst().LIZIZ;
                    if (str != null) {
                        SingleImageData singleImageData = c1439780nZQ.LLJILJIL;
                        C371780Ehs.LIZLLL(singleImageData);
                        Float fLJIJI = C371780Ehs.LJIJI(interfaceC1452170ntPG, str, nLETrack, singleImageData.getImageRatio());
                        if (fLJIJI != null) {
                            float fFloatValue = fLJIJI.floatValue();
                            InterfaceC1461650o8h interfaceC1461650o8hLJ2 = c1439780nZQ.LJ();
                            if (interfaceC1461650o8hLJ2 != null) {
                                interfaceC1461650o8hLJ2.QZ1(str, fFloatValue);
                            }
                        }
                    }
                } else {
                    C348460DlM c348460DlMLJ = C371780Ehs.LJ(nLETrack);
                    if (c348460DlMLJ != null) {
                        InterfaceC1461650o8h interfaceC1461650o8hLJ3 = c1439780nZQ.LJ();
                        if (interfaceC1461650o8hLJ3 != null) {
                            interfaceC1461650o8hLJ3.sJ0(c348460DlMLJ, null, 28);
                        }
                        String str2 = c348460DlMLJ.LIZIZ;
                        if (str2 != null) {
                            C371780Ehs.LJIJ(interfaceC1452170ntPG, str2, nLETrack);
                        }
                    } else {
                        SingleImageData singleImageData2 = c1439780nZQ.LLJILJIL;
                        C371780Ehs.LIZLLL(singleImageData2);
                        TextStickerModel textStickerModelLJII = C371780Ehs.LJII(nLETrack, singleImageData2.getImageRatio());
                        if (textStickerModelLJII != null) {
                            C0FVT c0fvtLJII = c1439780nZQ.LJII();
                            if (c0fvtLJII != null) {
                                c0fvtLJII.ll(textStickerModelLJII);
                            }
                        } else {
                            SingleImageData singleImageData3 = c1439780nZQ.LLJILJIL;
                            C371780Ehs.LIZLLL(singleImageData3);
                            TextStickerModel textStickerModelLJIIIIZZ = C371780Ehs.LJIIIIZZ(nLETrack, false, false, 0, singleImageData3.getImageRatio(), 6);
                            if (textStickerModelLJIIIIZZ != null) {
                                C0FVT c0fvtLJII2 = c1439780nZQ.LJII();
                                if (c0fvtLJII2 != null) {
                                    c0fvtLJII2.ll(textStickerModelLJIIIIZZ);
                                }
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unsupported track:");
                                sbLIZ.append(nLETrack);
                                C385200F8k.LIZLLL("CanvasPhotoTemplateExternalApiAdapter", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                }
            }
        }
        ((Function1) awS2S0502000_5.l4).invoke(Float.valueOf(awS2S0502000_5.i5 / awS2S0502000_5.i6));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS2S0502000_5 r33) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0502000_5.invoke$1(kotlin.jvm.internal.AwS2S0502000_5):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0502000_5(C1439780nZQ c1439780nZQ, NLEModel nLEModel, NLETrack nLETrack, NLETemplateModel nLETemplateModel, C5183020f c5183020f, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1439780nZQ;
        this.l1 = nLEModel;
        this.l2 = nLETrack;
        this.l3 = nLETemplateModel;
        this.l4 = c5183020f;
        this.i5 = i;
        this.i6 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0502000_5(C1439800nZS c1439800nZS, NLEModel nLEModel, NLETrack nLETrack, NLETemplateModel nLETemplateModel, C5183020f c5183020f, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1439800nZS;
        this.l1 = nLEModel;
        this.l2 = nLETrack;
        this.l3 = nLETemplateModel;
        this.l4 = c5183020f;
        this.i5 = i;
        this.i6 = i2;
    }
}
