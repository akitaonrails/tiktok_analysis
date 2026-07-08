package com.ss.android.ugc.aweme.texttoimage;

import X.AnonymousClass0957;
import X.C01GW;
import X.C05CQ;
import X.C05CR;
import X.C05CS;
import X.C05CT;
import X.C05CU;
import X.C064S;
import X.C099G;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0AC5;
import X.C0CHQ;
import X.C0CQT;
import X.C0F8B;
import X.C0F9I;
import X.C0FW6;
import X.C0LAB;
import X.C0PEM;
import X.C0VSJ;
import X.C1097504Qz;
import X.C118300cf;
import X.C121D;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1633850scR;
import X.C1697810uHb;
import X.C18161079j;
import X.C19719612Di;
import X.C201955140j;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2286608xc;
import X.C23250099c;
import X.C2327809Ae;
import X.C259600AFi;
import X.C348100Dkm;
import X.C352130DrH;
import X.C385070F7x;
import X.C452501pT;
import X.C572740MdE;
import X.C572770MdH;
import X.C572780MdI;
import X.C572800MdK;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1988807qg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1452170ntP;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import X.InterfaceC1631630sYr;
import X.InterfaceC1635410sex;
import X.InterfaceC497601wk;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS96S0110000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageGenerator {
    public InterfaceC1452170ntP LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final Text2ImageApi LJ;
    public final InterfaceC1635410sex LJFF;
    public volatile VideoPublishEditModel LJI;
    public final C572800MdK LJII;
    public String LJIIIIZZ;
    public List<String> LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public C099G LJIIL;
    public AnonymousClass0957<Text2ImageApiResp> LJIILIIL;
    public final C01GW LJIILJJIL;

    public interface Text2ImageApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/photo/text2image")
        Object getResourceList(@InterfaceC1501100pAK("text") String str, @InterfaceC1501100pAK("creation_id") String str2, @InterfaceC1501100pAK("template_ids") String str3, @InterfaceC1501100pAK("keyboard_language_list") String str4, @InterfaceC1501100pAK("insert_template_ids") String str5, @InterfaceC1501100pAK("disable_normal_template") boolean z, @InterfaceC1501100pAK("need_summary_template") boolean z2, @InterfaceC1501100pAK("sort_type") int i, @InterfaceC1501100pAK("is_fast_generate") boolean z3, @InterfaceC1501100pAK("item_id") String str6, @InterfaceC1501100pAK("comment_id") String str7, @InterfaceC1501100pAK("comment_card") boolean z4, InterfaceC1364105Vn<? super Text2ImageApiResp> interfaceC1364105Vn);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/photo/ai_summary")
        Object getSummaryInfo(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("need_ai_summary") boolean z, InterfaceC1364105Vn<? super Text2ImageSummary> interfaceC1364105Vn);
    }

    public Text2ImageGenerator() {
        this(null);
    }

    public static List LJIILIIL() {
        String locale;
        C844470XAv.LIZ.getClass();
        try {
            InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) C786410Ut5.H2(C844470XAv.LIZ(), "input_method")).getCurrentInputMethodSubtype();
            if (currentInputMethodSubtype == null || (locale = currentInputMethodSubtype.getLocale()) == null) {
                locale = "";
            }
            return Collections.singletonList(locale);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public final AIGCArchWorkflowManager LJIIIZ() {
        return (AIGCArchWorkflowManager) this.LJIILJJIL.getValue();
    }

    public final boolean LJIILL() {
        return C18161079j.LIZ() && C123100dR.LIZ(this.LJIIJ);
    }

    public Text2ImageGenerator(InterfaceC1452170ntP interfaceC1452170ntP) {
        int i;
        int i2;
        this.LIZ = interfaceC1452170ntP;
        C01GW c01gw = C259600AFi.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            i = 720;
        } else {
            i = 1200;
        }
        this.LIZIZ = i;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            i2 = 960;
        } else {
            i2 = 1600;
        }
        this.LIZJ = i2;
        this.LIZLLL = 1000L;
        this.LJ = (Text2ImageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(Text2ImageApi.class);
        this.LJFF = C1633850scR.LIZ(C0CHQ.LIZ, null);
        this.LJII = new C572800MdK();
        this.LJIIIIZZ = "";
        this.LJIIIZ = C13BV.INSTANCE;
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(205));
    }

    public static Double LJIIJ(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        Double dValueOf = null;
        try {
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(str).optJSONArray("children");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(0);
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("text_params");
                } else {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject != null) {
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("canvasTextRect");
                } else {
                    jSONArrayOptJSONArray = null;
                }
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() >= 4) {
                    double dOptDouble = jSONArrayOptJSONArray.optDouble(3, Double.NaN);
                    if (!Double.isNaN(dOptDouble)) {
                        dValueOf = Double.valueOf(dOptDouble);
                        return dValueOf;
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return dValueOf;
    }

    public static String LJIIJJI(Effect effect) {
        if (effect == null) {
            return "";
        }
        File[] fileArrListFiles = new C0VSJ(effect.getUnzipPath()).listFiles();
        if (fileArrListFiles == null) {
            return effect.getUnzipPath();
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && !u.LJIIZILJ(file.getAbsolutePath(), ".json", false)) {
                return file.getAbsolutePath();
            }
        }
        return effect.getUnzipPath();
    }

    public final float LJIILJJIL(String str) {
        float fAbs;
        C348100Dkm c348100DkmLIZIZ;
        C0FW6 c0fw6LJIIIZ;
        C121D c121dLIZ;
        float[] fArrLIZJ;
        InterfaceC1452170ntP interfaceC1452170ntP;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession;
        INLEStickerRuntime stickerApi;
        String infoStickerNewTemplateParams;
        Double dLJIIJ;
        if (LJIILL() && (interfaceC1452170ntP = this.LIZ) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ) != null && (stickerApi = iNLEMediaSession.getStickerApi()) != null && (infoStickerNewTemplateParams = stickerApi.getInfoStickerNewTemplateParams(str)) != null && (dLJIIJ = LJIIJ(infoStickerNewTemplateParams)) != null) {
            return (float) ((dLJIIJ.doubleValue() / ((double) 2)) / 960.0d);
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ;
        if (interfaceC1452170ntP2 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2)) != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null && (c121dLIZ = c0fw6LJIIIZ.LIZ()) != null && (fArrLIZJ = c121dLIZ.LIZJ(str)) != null) {
            fAbs = Math.abs(fArrLIZJ[3] - fArrLIZJ[1]);
        } else {
            fAbs = 0.0f;
        }
        return fAbs / 2.0f;
    }

    public final boolean LJIILLIIL(Text2ImageInfo text2ImageInfo) {
        String coverPath;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        Text2ImageSummary text2ImageSummary;
        if (text2ImageInfo.LIZIZ.getUnzipPath().length() == 0 || text2ImageInfo.LIZ.length() == 0) {
            return false;
        }
        List<TemplateEleConfig> list = text2ImageInfo.templateEleConfig;
        if (list != null && list.isEmpty()) {
            if (C123100dR.LIZ(this.LJIIJJI)) {
                VideoPublishEditModel videoPublishEditModel = this.LJI;
                if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null && (text2ImageSummary = text2ImageModel.commentSummary) != null) {
                    coverPath = text2ImageSummary.getCoverPath();
                } else {
                    coverPath = null;
                }
                if (!C123100dR.LIZ(coverPath)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static List LJIJJ(String str, List list) {
        if (list.isEmpty()) {
            return Collections.singletonList(str);
        }
        Regex regex = new Regex(C13LP.LJJLIIIJ(list, "|", null, null, 0, null, AFwS239S0000000_8.get$arr$(133), 30));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (MatchResult matchResult : Regex.findAll$default(regex, str, 0, 2, null)) {
            int i2 = matchResult.LIZIZ().LL;
            int i3 = matchResult.LIZIZ().LLILLJJLI + 1;
            if (i < i2) {
                arrayList.add(str.substring(i, i2));
            }
            arrayList.add(str.substring(i2, i3));
            i = i3;
        }
        if (i < str.length()) {
            arrayList.add(str.substring(i));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZIZ(TextStickerModel textStickerModel, Text2ImageInfo text2ImageInfo) {
        String string;
        List list;
        boolean z;
        Object next;
        int length;
        float fFloatValue;
        Float f;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        Float fLJIIIIZZ;
        boolean z2;
        String str;
        List listLIZ;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        List<String> list2;
        CreativeModel creativeModel2;
        Text2ImageModel text2ImageModel2;
        CreativeModel creativeModel3;
        Text2ImageModel text2ImageModel3;
        CreativeModel creativeModel4;
        Text2ImageModel text2ImageModel4;
        String str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VideoPublishEditModel videoPublishEditModel = this.LJI;
        if (videoPublishEditModel == null || (creativeModel4 = videoPublishEditModel.creativeModel) == null || (text2ImageModel4 = creativeModel4.text2ImageModel) == null || (str2 = text2ImageModel4.text) == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJI;
        if (videoPublishEditModel2 == null || (creativeModel3 = videoPublishEditModel2.creativeModel) == null || (text2ImageModel3 = creativeModel3.text2ImageModel) == null || (list = text2ImageModel3.keyword) == null) {
            list = C13BV.INSTANCE;
        }
        List<String> listLJIJJ = LJIJJ(string, list);
        int iIntValue = 0;
        Object[] objArr = 0;
        List<String> listSplit = new Regex("\\s+|\\u3000|\\n").split(string, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = listSplit.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            String next2 = it2.next();
            if (next2.length() > 0) {
                arrayList.add(next2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            next = null;
        } else {
            next = it3.next();
            if (it3.hasNext()) {
                int length2 = ((String) next).length();
                do {
                    Object next3 = it3.next();
                    int length3 = ((String) next3).length();
                    if (length2 < length3) {
                        next = next3;
                        length2 = length3;
                    }
                } while (it3.hasNext());
            }
        }
        String str3 = (String) next;
        if (str3 != null) {
            length = str3.length();
        } else {
            length = 1;
        }
        Float f2 = text2ImageInfo.textWidth;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float f3 = (((fFloatValue * 720.0f) / length) * 72.0f) / 300.0f;
        VideoPublishEditModel videoPublishEditModel3 = this.LJI;
        float fFloatValue7 = 1.0f;
        if ((videoPublishEditModel3 != null && (creativeModel2 = videoPublishEditModel3.creativeModel) != null && (text2ImageModel2 = creativeModel2.text2ImageModel) != null && (f = text2ImageModel2.customFontScaling) != null) || (f = text2ImageInfo.textScaling) != null) {
            fFloatValue2 = f.floatValue();
        } else {
            fFloatValue2 = 1.0f;
        }
        C201955140j.LIZIZ("hyppp", "fontpath " + textStickerModel.getFontModel().localPath + ", fontsize: " + Math.max(f3 * fFloatValue2, 6.0f) + "longest length: " + length);
        String string2 = "";
        for (String str4 : listLJIJJ) {
            VideoPublishEditModel videoPublishEditModel4 = this.LJI;
            if (videoPublishEditModel4 != null && (creativeModel = videoPublishEditModel4.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null && (list2 = text2ImageModel.keyword) != null && list2.contains(str4) == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !linkedHashSet.contains(str4)) {
                String str5 = text2ImageInfo.keywordColor;
                if (str5 != null && str5.length() != 0) {
                    str = text2ImageInfo.keywordColor;
                } else {
                    str = text2ImageInfo.textColor;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(string2);
                Pair pair = new Pair(textStickerModel.getFontModel().fontResId, textStickerModel.getFontModel().localPath);
                if (str == null) {
                    str = "000000";
                }
                List listLIZ2 = C0F9I.LIZ(ColorProtector.parseColor("#".concat(str)));
                String str6 = text2ImageInfo.keywordBGColor;
                if (str6 != null && str6.length() != 0) {
                    listLIZ = C0F9I.LIZ(ColorProtector.parseColor("#" + text2ImageInfo.keywordBGColor));
                } else {
                    listLIZ = null;
                }
                float f4 = 0.0f;
                sb.append(u.LJJIFFI(new C385070F7x(str4, pair, listLIZ2, -1.0f, C123100dR.LIZ(text2ImageInfo.keywordBold), f4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f4, 0 == true ? 1 : 0, listLIZ, 2016, 0 == true ? 1 : 0).toLabelStr(), "\"", "\\\"", false));
                string2 = sb.toString();
                linkedHashSet.add(str4);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                float f5 = 0.0f;
                sb2.append(u.LJJIFFI(new C385070F7x(str4, new Pair(textStickerModel.getFontModel().fontResId, textStickerModel.getFontModel().localPath), C0F9I.LIZ(textStickerModel.getColor()), -1.0f, objArr == true ? 1 : 0, f5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4080, 0 == true ? 1 : 0).toLabelStr(), "\"", "\\\"", false));
                string2 = sb2.toString();
            }
            z = true;
        }
        Float f6 = text2ImageInfo.textHeight;
        if (f6 != null) {
            fFloatValue3 = f6.floatValue();
        } else {
            fFloatValue3 = 1.0f;
        }
        float f7 = fFloatValue3 * 960.0f;
        StringBuilder sb3 = new StringBuilder("\n           {\n                \"canvas\": true,\n                \"canvasCustomized\":true,\n                \"canvasWHFixed\": [\n                    ");
        Float f8 = text2ImageInfo.textWidth;
        if (f8 != null) {
            fFloatValue7 = f8.floatValue();
        }
        sb3.append(((double) fFloatValue7) * 720.0d);
        sb3.append(",\n                    ");
        sb3.append(f7);
        sb3.append("\n                ],\n                \"typeSettingAlign\": ");
        Integer num = text2ImageInfo.textAlign;
        if (num != null) {
            iIntValue = num.intValue();
        }
        sb3.append(iIntValue);
        sb3.append(",\n                \"autoAdaptCanvasEnabled\": true,\n                \"isSpacesOptimizationEnabled\": true,\n                \"isChineseLineBreakOptimizationEnabled\": true,\n                \"fixFontSize\": true,\n                \"autoWrapByWord\": true,\n                \"autoFontSizeMax\": ");
        Float f9 = text2ImageInfo.maxFontSize;
        if (f9 != null) {
            fFloatValue4 = f9.floatValue();
        } else {
            fFloatValue4 = 74.0f;
        }
        sb3.append(fFloatValue4);
        sb3.append(",\n                \"richText\": \"");
        sb3.append(string2);
        sb3.append("\",\n                \"version\": 2,\n                \"typeSettingKind\": 0,\n                \"enableMergeLines\": false,\n                \"canvasRoundCorner\": false,\n                \"canvasRoundRadiusScale\": 0.0,\n                \"canvasWrapped\": false,\n                \"fallbackFontPathList\": ");
        NLETextRichContent.Companion.getClass();
        sb3.append(C13LP.LJJLIIIJ(C0F8B.LIZIZ(""), "\",\"", "[\"", "\"]", 0, null, null, 56));
        sb3.append(",\n                \"boldValue\": ");
        String str7 = text2ImageInfo.keywordBold;
        if (str7 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str7)) != null) {
            fFloatValue5 = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue5 = 0.0f;
        }
        sb3.append(fFloatValue5);
        sb3.append(",\n                \"italicDegree\": 0,\n                \"canvasColor\": [\n                    0.0,\n                    0.0,\n                    0.0,\n                    0.0\n                ],\n                \"lineSpacing\": ");
        Float f10 = text2ImageInfo.lineSpacing;
        if (f10 != null) {
            fFloatValue6 = f10.floatValue();
        } else {
            fFloatValue6 = 0.0f;
        }
        sb3.append(fFloatValue6);
        sb3.append(",\n                \"decorationWidth\": 0.04,\n                \"decorationOffset\": 0.15,\n                \"innerPadding\": 0,\n                \"innerPaddingHV\": [\n                    0,\n                    0\n                ],\n                \"fallbackFontPathList\": ");
        sb3.append(C13LP.LJJLIIIJ(C0F8B.LIZIZ(""), ",", e3.e, e3.f, 0, null, AFwS239S0000000_8.get$arr$(132), 24));
        sb3.append(",\n                \"lineMaxWidth\": -1,\n                \"oneLineCutOff\": false,\n                \"shapeFlipX\": false,\n                \"shapeFlipY\": false,\n                \"autoAdaptDpiEnabled\": false,\n                \"globalAlpha\": 1,\n                \"sdfTextAlpha\": 1,\n                \"textLocale\": 1\n            }\n        ");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public final List<AnonymousClass0957<?>> LJFF(Text2ImageApiResp text2ImageApiResp, InterfaceC497601wk interfaceC497601wk) {
        List arrayList;
        ?? arrayList2;
        ArrayList arrayList3;
        Long lLJIILIIL;
        String str;
        String str2;
        ArrayList arrayList4 = new ArrayList();
        List<Text2ImageInfo> list = text2ImageApiResp.text2imageInfoList;
        if (list != null) {
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Text2ImageInfo text2ImageInfo : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Text2ImageInfo text2ImageInfo2 = text2ImageInfo;
                    arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C572770MdH(this, text2ImageInfo2, null), 3));
                    if (text2ImageInfo2.templateEleConfig != null && (!r0.isEmpty())) {
                        for (TemplateEleConfig templateEleConfig : text2ImageInfo2.templateEleConfig) {
                            Integer num = templateEleConfig.eleType;
                            int type = EnumC1988807qg.IMAGE.getType();
                            if (num != null && num.intValue() == type) {
                                arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C572780MdI(this, templateEleConfig, text2ImageInfo2, null), 3));
                            }
                        }
                    }
                    arrayList5.add(Unit.LIZ);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C201955140j.LIZIZ("hyppp", "start font");
        List<Text2ImageInfo> list2 = text2ImageApiResp.text2imageInfoList;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator<Text2ImageInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                List<TemplateEleConfig> list3 = it2.next().templateEleConfig;
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                ArrayList arrayList6 = new ArrayList();
                for (TemplateEleConfig templateEleConfig2 : list3) {
                    String[] strArr = new String[2];
                    TopBodyEleConfig topBodyEleConfig = templateEleConfig2.topBodyEleConfig;
                    if (topBodyEleConfig == null || (str = topBodyEleConfig.descFontId) == null || !(!a0.LJJJIL(str))) {
                        str = null;
                    }
                    strArr[0] = str;
                    TopBodyEleConfig topBodyEleConfig2 = templateEleConfig2.topBodyEleConfig;
                    if (topBodyEleConfig2 == null || (str2 = topBodyEleConfig2.userFontId) == null || !(!a0.LJJJIL(str2))) {
                        str2 = null;
                    }
                    strArr[1] = str2;
                    C19719612Di.LJJI(C13LQ.LJIJI(strArr), arrayList6);
                }
                C19719612Di.LJJI(arrayList6, arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List<Text2ImageInfo> list4 = text2ImageApiResp.text2imageInfoList;
        if (list4 != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Text2ImageInfo text2ImageInfo3 : list4) {
                if (hashSet.add(text2ImageInfo3.font)) {
                    arrayList7.add(text2ImageInfo3);
                }
            }
            arrayList2 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                String str3 = ((Text2ImageInfo) it3.next()).font;
                if (str3 != null) {
                    arrayList2.add(str3);
                }
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        ArrayList arrayList8 = new ArrayList(C13LP.LJJJJI(C13LP.LJLIL(arrayList, arrayList2)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("font list: ");
        sbLIZ.append(arrayList8);
        C201955140j.LIZIZ("hyppp", C2188811AlT.LIZIZ(sbLIZ));
        arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05CR(this, arrayList8, null), 3));
        if (C18161079j.LIZ() && C123100dR.LIZ((String) C05CU.LIZ.getValue())) {
            arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05CT(this, null), 3));
            List<Text2ImageInfo> list5 = text2ImageApiResp.text2imageInfoList;
            if (list5 != null) {
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList9 = new ArrayList();
                for (Text2ImageInfo text2ImageInfo4 : list5) {
                    if (hashSet2.add(text2ImageInfo4.emphasisId)) {
                        arrayList9.add(text2ImageInfo4);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj : arrayList9) {
                    String str4 = ((Text2ImageInfo) obj).emphasisId;
                    if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null && lLJIILIIL.longValue() > 0) {
                        arrayList10.add(obj);
                    }
                }
                arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList10, 10));
                Iterator it4 = arrayList10.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((Text2ImageInfo) it4.next()).emphasisId);
                }
            } else {
                arrayList3 = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("emphasis list: ");
            sbLIZ2.append(arrayList3);
            C201955140j.LIZIZ("hyppp", C2188811AlT.LIZIZ(sbLIZ2));
            if (arrayList3 != null) {
                ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                int i3 = 0;
                for (Object obj2 : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        String str5 = (String) obj2;
                        if (str5 != null && str5.length() != 0) {
                            arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05CQ(this, str5, null), 3));
                        }
                        arrayList11.add(Unit.LIZ);
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        if (C064S.LIZ()) {
            arrayList4.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05CS(this, null), 3));
        }
        return arrayList4;
    }

    public final String LJI(String str, boolean z) {
        String strSubstring = "";
        if (str == null) {
            str = "";
        }
        AwS96S0110000_8 awS96S0110000_8 = new AwS96S0110000_8(this, z, 12);
        String str2 = (String) awS96S0110000_8.invoke(str);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        int i = 0;
        while (characterInstance.next() != -1) {
            i++;
        }
        BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
        characterInstance2.setText(str);
        int i2 = 0;
        while (characterInstance2.next() != -1) {
            i2++;
        }
        if (i > 30 && i2 != 0) {
            int i3 = i - i2;
            if (i3 + 3 > 30) {
                return (String) awS96S0110000_8.invoke("...");
            }
            int i4 = (30 - i3) - 3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (str.length() != 0 && i4 > 0) {
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(str);
                int iFirst = characterInstance3.first();
                int i5 = 0;
                do {
                    int next = characterInstance3.next();
                    if (next == -1) {
                        break;
                    }
                    i5++;
                    iFirst = next;
                } while (i5 < i4);
                strSubstring = str.substring(0, iFirst);
            }
            sbLIZ.append(strSubstring);
            sbLIZ.append("...");
            return (String) awS96S0110000_8.invoke(C2188811AlT.LIZIZ(sbLIZ));
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r45, com.ss.android.ugc.aweme.texttoimage.Text2ImageInfo r46) {
        /*
            Method dump skipped, instruction units count: 1759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator.LJIIZILJ(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, com.ss.android.ugc.aweme.texttoimage.Text2ImageInfo):void");
    }

    public final boolean LJIJ(NLETrack nLETrack, NLETrack nLETrack2) {
        if ((LJIILL() && !((Boolean) C1097504Qz.LIZ.getValue()).booleanValue()) || !((Boolean) C0AC5.LIZ.getValue()).booleanValue() || (!nLETrack.getSlots().isEmpty()) || (!nLETrack2.getSlots().isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0dd0  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0deb  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0bd6 A[EDGE_INSN: B:622:0x0bd6->B:467:0x0bd6 BREAK  A[LOOP:10: B:385:0x0a58->B:625:0x0a58], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.texttoimage.Text2ImageInfo> r88, com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary r89, X.InterfaceC1364105Vn<? super kotlin.Unit> r90) {
        /*
            Method dump skipped, instruction units count: 3576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator.LIZ(java.util.List, com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a7 A[EDGE_INSN: B:89:0x03a7->B:19:0x00f6 BREAK  A[LOOP:1: B:42:0x0164->B:94:?]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r85, java.util.List r86, X.InterfaceC1364105Vn r87) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator.LIZJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(String str, String str2, String str3) {
        String str4;
        String str5;
        C572800MdK c572800MdK = this.LJII;
        long j = c572800MdK.LJIJJLI;
        if (j > 0 && c572800MdK.LJJ == 0) {
            if (c572800MdK.LJIL < j) {
                c572800MdK.LJIL = System.currentTimeMillis();
            }
            long j2 = c572800MdK.LJIL - c572800MdK.LJIJJLI;
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(0, "text_length");
            c0lab.LIZ(0, "create_success");
            c0lab.LIZ(0, "request_success");
            c0lab.LIZ(0, "resource_success");
            c0lab.LIZ(0, "nle_success");
            c0lab.LIZIZ(j2, "create_duration");
            c0lab.LIZIZ(0L, "request_duration");
            c0lab.LIZIZ(0L, "resource_duration");
            c0lab.LIZIZ(0L, "nle_duration");
            c0lab.LIZ(0, "error_code");
            c0lab.LJ("error_msg", "prepare_failed");
            c0lab.LIZ(0, "user_canceled");
            c0lab.LIZ(0, "is_load_more");
            c0lab.LIZIZ(j2, "prepare_duration");
            c0lab.LJ("prepare_success", CardStruct.IStatusCode.DEFAULT);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            c0lab.LJ("curr_crt_path_page_type", str4);
            if ((!Intrinsics.LJFF(str, "page") && !Intrinsics.LJFF(str, "preview_card")) || str2 == null) {
                str5 = "";
            } else {
                str5 = str2;
            }
            c0lab.LJ("preview_card_entrance", str5);
            if (str2 == null) {
                str2 = "";
            }
            c0lab.LJ("shoot_way", str2);
            c0lab.LIZ(0, "is_prefetch_request");
            c0lab.LIZ(c572800MdK.LJJIJ, "is_ai_modified");
            if (str3 != null && str3.length() != 0) {
                c0lab.LJ("comment_id", str3);
            }
            C20684815ws.LJIILLIIL("text_image_create_duration", c0lab.LIZ);
            c572800MdK.LJIJJLI = 0L;
            c572800MdK.LJIL = 0L;
            c572800MdK.LJJ = 0;
        }
    }

    public static /* synthetic */ Object LJ(Text2ImageGenerator text2ImageGenerator, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return text2ImageGenerator.LIZLLL(str, str2, z, null, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9, java.lang.String r10, boolean r11, com.ss.android.ugc.aweme.creative.model.CreativeInfo r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator.LIZLLL(java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.05Vn):java.lang.Object");
    }

    public final Object LJIIL(final String str, final String str2, final List list, final List list2, InterfaceC1364105Vn interfaceC1364105Vn) {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        List<TextImageTaskInfo> list3;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        final int size = 0;
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList3.add(C2286608xc.LJFF(((long) i) * this.LIZLLL));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        final C118300cf c118300cf = new C118300cf();
        VideoPublishEditModel videoPublishEditModel = this.LJI;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null && (list3 = text2ImageModel.imageTaskList) != null) {
            size = list3.size();
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
        if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
            C2286608xc.LJ(mediaRuntimeApi.getImages(new VecLongLong(arrayList3), this.LIZIZ, this.LIZJ, NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL, new INLEListenerGetImage() { // from class: X.0MdF
                /* JADX WARN: Removed duplicated region for block: B:100:0x0211 A[Catch: Exception -> 0x02c9, EDGE_INSN: B:96:0x020a->B:100:0x0211 BREAK  A[LOOP:2: B:90:0x01ee->B:176:0x01ee], PHI: r13
                  0x0211: PHI (r13v5 boolean) = (r13v2 boolean), (r13v7 boolean) binds: [B:98:0x020d, B:96:0x020a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x02c9, blocks: (B:8:0x0014, B:10:0x002d, B:12:0x0033, B:13:0x0061, B:15:0x0067, B:16:0x006b, B:22:0x0091, B:23:0x0095, B:25:0x00a7, B:27:0x00ad, B:28:0x00b2, B:30:0x00b8, B:32:0x00c4, B:34:0x00c8, B:35:0x00cc, B:37:0x00e3, B:39:0x00e7, B:40:0x00fd, B:42:0x0103, B:45:0x0119, B:47:0x0162, B:49:0x0166, B:51:0x016a, B:53:0x016e, B:55:0x0172, B:56:0x0176, B:57:0x017d, B:59:0x0181, B:61:0x0185, B:63:0x0189, B:65:0x018d, B:67:0x0195, B:68:0x019a, B:70:0x01a0, B:72:0x01ae, B:80:0x01c0, B:81:0x01c6, B:85:0x01e0, B:87:0x01e4, B:89:0x01ea, B:90:0x01ee, B:92:0x01f4, B:94:0x0204, B:100:0x0211, B:101:0x0213, B:103:0x0248, B:105:0x024c, B:107:0x0250, B:109:0x0254, B:111:0x025c, B:112:0x0260, B:113:0x0267, B:115:0x026b, B:117:0x026f, B:119:0x0273, B:124:0x027d, B:127:0x0282, B:75:0x01b7, B:130:0x028c, B:132:0x0292, B:134:0x0296, B:136:0x029a, B:138:0x029e, B:139:0x02a3, B:141:0x02a9, B:143:0x02ad, B:145:0x02b1, B:146:0x02b3), top: B:156:0x0014 }] */
                /* JADX WARN: Removed duplicated region for block: B:111:0x025c A[Catch: Exception -> 0x02c9, TryCatch #0 {Exception -> 0x02c9, blocks: (B:8:0x0014, B:10:0x002d, B:12:0x0033, B:13:0x0061, B:15:0x0067, B:16:0x006b, B:22:0x0091, B:23:0x0095, B:25:0x00a7, B:27:0x00ad, B:28:0x00b2, B:30:0x00b8, B:32:0x00c4, B:34:0x00c8, B:35:0x00cc, B:37:0x00e3, B:39:0x00e7, B:40:0x00fd, B:42:0x0103, B:45:0x0119, B:47:0x0162, B:49:0x0166, B:51:0x016a, B:53:0x016e, B:55:0x0172, B:56:0x0176, B:57:0x017d, B:59:0x0181, B:61:0x0185, B:63:0x0189, B:65:0x018d, B:67:0x0195, B:68:0x019a, B:70:0x01a0, B:72:0x01ae, B:80:0x01c0, B:81:0x01c6, B:85:0x01e0, B:87:0x01e4, B:89:0x01ea, B:90:0x01ee, B:92:0x01f4, B:94:0x0204, B:100:0x0211, B:101:0x0213, B:103:0x0248, B:105:0x024c, B:107:0x0250, B:109:0x0254, B:111:0x025c, B:112:0x0260, B:113:0x0267, B:115:0x026b, B:117:0x026f, B:119:0x0273, B:124:0x027d, B:127:0x0282, B:75:0x01b7, B:130:0x028c, B:132:0x0292, B:134:0x0296, B:136:0x029a, B:138:0x029e, B:139:0x02a3, B:141:0x02a9, B:143:0x02ad, B:145:0x02b1, B:146:0x02b3), top: B:156:0x0014 }] */
                /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x020f  */
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int onGetImageData(byte[] r38, int r39, int r40, int r41, float r42) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 749
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C572750MdF.onGetImageData(byte[], int, int, int, float):int");
                }
            }));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object LJII(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, String str, boolean z3, InterfaceC1631630sYr<? super List<TextImageTaskInfo>, ? super Boolean, ? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C572740MdE(interfaceC1631630sYr, this, videoPublishEditModel, z, z3, z2, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
