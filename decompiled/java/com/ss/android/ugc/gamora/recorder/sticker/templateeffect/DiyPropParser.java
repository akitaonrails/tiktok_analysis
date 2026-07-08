package com.ss.android.ugc.gamora.recorder.sticker.templateeffect;

import X.AbstractC1622310sJp;
import X.AbstractC1665240tR4;
import X.AbstractC1665250tR5;
import X.C08JS;
import X.C09BH;
import X.C09CT;
import X.C0VSJ;
import X.C13LQ;
import X.C1622320sJq;
import X.C1624230sMv;
import X.C1665200tR0;
import X.C1DO8;
import X.C1DOD;
import X.C1DPB;
import X.C1DPC;
import X.C1DPK;
import X.C20012313Rx;
import X.C201955140j;
import X.C2188811AlT;
import X.C823050WQl;
import Y.ARunnableS43S0400000_35;
import android.graphics.Bitmap;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreMaxSize;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInputUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes26.dex */
public final class DiyPropParser {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Effect effect) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPC) && abstractC1665240tR4 != null && abstractC1665240tR4.LIZ != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Effect effect) {
        C1624230sMv c1624230sMvLJIIIZ = LJIIIZ(effect);
        if (c1624230sMvLJIIIZ != null) {
            return c1624230sMvLJIIIZ.LIZ;
        }
        return false;
    }

    public static boolean LIZJ(Effect effect) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        T t;
        UIAnnotationAssetType assetType;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII == null || (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) == null) {
            return false;
        }
        AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
        if (!(abstractC1665240tR4 instanceof C1DPB) || abstractC1665240tR4 == null || (t = abstractC1665240tR4.LIZ) == 0) {
            return false;
        }
        T t2 = t.LIZ;
        if (t2 != 0) {
            assetType = ((UIAnnotationAssetUIMore) t2).getAssetType();
        } else {
            assetType = UIAnnotationAssetType.UIAnnotationAssetType_Unknown;
        }
        if (assetType != UIAnnotationAssetType.UIAnnotationAssetType_Video) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Effect effect) {
        if (effect.getSdkExtra().length() > 0) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(effect.getUnzipPath());
            sbLIZ.append("/extra.json");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                return;
            }
            effect.setSdkExtra(C09BH.LJI(c0vsj, Charsets.UTF_8));
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fixExtra json fail: ");
            sbLIZ2.append(e);
            C201955140j.LJIJI(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ2));
        } catch (FileNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fixExtra file fail: ");
            sbLIZ3.append(e2);
            C201955140j.LJIJI(c20012313Rx2, C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static String LJ(Effect effect) {
        String templateId;
        MobileEffectTemplateInfo templateInfo;
        if (!(effect instanceof MobileEffect) || (templateInfo = ((MobileEffect) effect).getTemplateInfo()) == null || (templateId = templateInfo.getTemplateId()) == null) {
            templateId = "";
        }
        if (templateId.length() == 0) {
            String template_effect_id = effect.getTemplate_effect_id();
            if (template_effect_id == null) {
                return "";
            }
            return template_effect_id;
        }
        return templateId;
    }

    public static String LJFF(Effect effect) {
        String templateResourceId;
        String resource_id;
        MobileEffectTemplateInfo templateInfo;
        String str = "";
        if (!(effect instanceof MobileEffect) || (templateInfo = ((MobileEffect) effect).getTemplateInfo()) == null || (templateResourceId = templateInfo.getTemplateResourceId()) == null) {
            templateResourceId = "";
        }
        if (templateResourceId.length() == 0) {
            TemplateEffectExtra template_effect_extra = effect.getTemplate_effect_extra();
            if (template_effect_extra != null && (resource_id = template_effect_extra.getResource_id()) != null) {
                str = resource_id;
            }
            templateResourceId = str;
        }
        if (templateResourceId.length() == 0) {
            C201955140j.LJIJJ(C20012313Rx.LIZIZ, "DiyProp", "getTemplateResourceId null");
        }
        return templateResourceId;
    }

    public static int[] LJI(Effect effect) {
        AbstractC1665250tR5 abstractC1665250tR5;
        int width;
        UIAnnotationAssetUIMoreMaxSize uIAnnotationAssetUIMoreMaxSizeLIZ;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII == null) {
            return new int[]{480, 480};
        }
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset);
        if (abstractC1665240tR4ArrLIZ != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && abstractC1665240tR4 != null && (abstractC1665250tR5 = (AbstractC1665250tR5) abstractC1665240tR4.LIZ) != null) {
                int height = 480;
                UIAnnotationAssetUIMoreMaxSize uIAnnotationAssetUIMoreMaxSizeLIZ2 = abstractC1665250tR5.LIZ();
                if (uIAnnotationAssetUIMoreMaxSizeLIZ2 != null) {
                    width = (int) uIAnnotationAssetUIMoreMaxSizeLIZ2.getWidth();
                } else {
                    width = 480;
                }
                AbstractC1665250tR5 abstractC1665250tR52 = (AbstractC1665250tR5) abstractC1665240tR4.LIZ;
                if (abstractC1665250tR52 != null && (uIAnnotationAssetUIMoreMaxSizeLIZ = abstractC1665250tR52.LIZ()) != null) {
                    height = (int) uIAnnotationAssetUIMoreMaxSizeLIZ.getHeight();
                }
                return new int[]{width, height};
            }
            return new int[]{480, 480};
        }
        return new int[]{480, 480};
    }

    public static C1DPK LJII(Effect effect) {
        C1665200tR0.LIZ.getClass();
        return C1665200tR0.LIZIZ(effect);
    }

    public static String LJIIIIZZ(Effect effect) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        T t;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII == null || (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput)) == null || abstractC1665240tR4ArrLIZ.length == 0) {
            return null;
        }
        AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
        if (!(abstractC1665240tR4 instanceof C1DPC) || abstractC1665240tR4 == null || (t = abstractC1665240tR4.LIZ) == 0) {
            return null;
        }
        T t2 = t.LIZ;
        if (t2 != 0) {
            return ((UIAnnotationTextInputUIMore) t2).getCurrentValue();
        }
        return "";
    }

    public static C1624230sMv LJIIIZ(Effect effect) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        T t;
        UIAnnotationAssetType assetType;
        boolean z;
        boolean z2;
        int minCount;
        int maxCount;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && abstractC1665240tR4 != null && (t = abstractC1665240tR4.LIZ) != 0) {
                T t2 = t.LIZ;
                if (t2 != 0) {
                    assetType = ((UIAnnotationAssetUIMore) t2).getAssetType();
                } else {
                    assetType = UIAnnotationAssetType.UIAnnotationAssetType_Unknown;
                }
                if (assetType != UIAnnotationAssetType.UIAnnotationAssetType_Video) {
                    T t3 = t.LIZ;
                    if (t3 != 0) {
                        minCount = ((UIAnnotationAssetUIMore) t3).getMinCount();
                    } else {
                        minCount = 1;
                    }
                    T t4 = t.LIZ;
                    if (t4 != 0) {
                        maxCount = ((UIAnnotationAssetUIMore) t4).getMaxCount();
                    } else {
                        maxCount = 1;
                    }
                    if ((minCount == 1 && minCount == maxCount) || maxCount < minCount || minCount < 1) {
                        z2 = false;
                        z = true;
                    } else {
                        z = true;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                    minCount = 0;
                    maxCount = 0;
                }
                return new C1624230sMv(z, z2, minCount, maxCount, Boolean.valueOf(z), null, 224);
            }
        }
        return null;
    }

    public static boolean LJIIJ(Effect effect) {
        C1DPK c1dpkLJII = LJII(effect);
        boolean z = false;
        if (c1dpkLJII == null) {
            return false;
        }
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4Arr = c1dpkLJII.LIZLLL;
        if (abstractC1665240tR4Arr == null || abstractC1665240tR4Arr.length == 0) {
            z = true;
        }
        return !z;
    }

    public static boolean LJIIJJI(Effect effect) {
        boolean z;
        Editor editor;
        List<String> list;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && c1dpkLJII.LIZIZ().length != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C13LQ.LJJIJIIJI("tt-child-effect", c1dpkLJII.LIZIZ()) >= 0) {
                return true;
            }
            return false;
        }
        EffectExtraMET effectExtraMETLJIILIIL = LJIILIIL(effect);
        if (effectExtraMETLJIILIIL == null || (editor = effectExtraMETLJIILIIL.editor) == null || (list = editor.tags) == null) {
            return false;
        }
        return list.contains("tt-child-effect");
    }

    public static EffectExtraMET LJIILIIL(Effect effect) {
        LIZLLL(effect);
        try {
            return (EffectExtraMET) C08JS.LIZ(effect.getSdkExtra(), EffectExtraMET.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AllowExporting json fail: ");
            sbLIZ.append(e);
            C201955140j.LJIJI(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final class EffectExtraMET {

        @C09CT("allowExporting")
        public final Boolean allowExporting;

        @C09CT("editor")
        public final Editor editor;

        public EffectExtraMET() {
            this(null, null);
        }

        public EffectExtraMET(Boolean bool, Editor editor) {
            this.allowExporting = bool;
            this.editor = editor;
        }
    }

    public static void LJIILL(Effect effect, String str) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPC c1dpc;
        String str2 = str;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPC) && (c1dpc = (C1DPC) abstractC1665240tR4) != null) {
                if (str2 == null) {
                    str2 = "";
                }
                UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
                C1DO8 c1do8 = new C1DO8() { // from class: X.09hP
                    @Override // X.C1DO9
                    public final void onSuccess() {
                    }

                    @Override // X.C1DO7
                    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DiyPropParser#previewText errorCode:");
                        sbLIZ.append(uIAnnotationErrorCode);
                        C201955140j.LIZLLL(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                C1DOD.LIZ();
                C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpc, str2, uIAnnotationUpdateType, c1do8, 7));
            }
        }
    }

    public static final class Editor {

        @C09CT("allowExporting")
        public final Boolean allowExporting;

        @C09CT("tags")
        public final List<String> tags;

        @C09CT("version")
        public final String version;

        public Editor() {
            this(null, null, null);
        }

        public Editor(Boolean bool, String str, List<String> list) {
            this.allowExporting = bool;
            this.version = str;
            this.tags = list;
        }
    }

    public static void LJIILLIIL(C1622320sJq c1622320sJq, Effect effect, String str) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPB c1dpb;
        String[] strArr = {str};
        if (str.length() == 0) {
            strArr = new String[0];
        }
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Preview;
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && (c1dpb = (C1DPB) abstractC1665240tR4) != null) {
                c1dpb.LIZLLL(strArr, c1622320sJq.LIZ, null);
            }
        }
    }

    public static void LJIILJJIL(AbstractC1622310sJp abstractC1622310sJp, Effect effect, final Bitmap[] bitmapArr, final AFwS189S0000000_3 aFwS189S0000000_3) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPB c1dpb;
        C1DPK c1dpkLJII = LJII(effect);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && (c1dpb = (C1DPB) abstractC1665240tR4) != null) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DiyPropParser#previewImages startTime:");
                sbLIZ.append(jCurrentTimeMillis);
                C201955140j.LIZLLL(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                c1dpb.LIZLLL(bitmapArr, abstractC1622310sJp.LIZ, new C1DO8() { // from class: X.09hE
                    @Override // X.C1DO9
                    public final void onSuccess() {
                        Function0<Unit> function0 = aFwS189S0000000_3;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        for (Bitmap bitmap : bitmapArr) {
                            C1319770kRr.LIZLLL(bitmap);
                        }
                        C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DiyPropParser#previewImages onSuccess:");
                        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sbLIZ2.append(" ms");
                        C201955140j.LIZLLL(c20012313Rx2, "DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.C1DO7
                    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                        Function0<Unit> function0 = aFwS189S0000000_3;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        for (Bitmap bitmap : bitmapArr) {
                            C1319770kRr.LIZLLL(bitmap);
                        }
                        C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DiyPropParser#previewImages errorCode:");
                        sbLIZ2.append(uIAnnotationErrorCode);
                        sbLIZ2.append(':');
                        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sbLIZ2.append(" ms");
                        C201955140j.LIZLLL(c20012313Rx2, "DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                });
            }
        }
    }
}
