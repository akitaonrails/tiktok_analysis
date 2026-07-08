package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13GX;
import X.C13H1;
import X.C13H3;
import X.C13H6;
import X.C13HB;
import X.C13HD;
import X.C13HG;
import X.C13HI;
import X.C13HO;
import X.C13II;
import X.C13KE;
import X.C13KG;
import X.C19983613Gw;
import X.C19983913Gz;
import X.InterfaceC1294060jmO;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986313Hx;
import X.InterfaceC19986513Hz;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class Effect$$serializer implements C13H1<Effect> {
    public static final Effect$$serializer INSTANCE;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public /* bridge */ /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        Effect$$serializer effect$$serializer = new Effect$$serializer();
        INSTANCE = effect$$serializer;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.android.ugc.effectmanager.effect.model.Effect", effect$$serializer, 73);
        c19983913Gz.LJIIJ("name", true);
        c19983913Gz.LJIIJ("_requirements", true);
        c19983913Gz.LJIIJ("requirements_sec", true);
        c19983913Gz.LJIIJ("hint", true);
        c19983913Gz.LJIIJ(FollowStatusChangeMethod.PARAM_UID, true);
        c19983913Gz.LJIIJ("effect_id", true);
        c19983913Gz.LJIIJ("file_url", true);
        c19983913Gz.LJIIJ("icon_url", true);
        c19983913Gz.LJIIJ("hint_icon", true);
        c19983913Gz.LJIIJ("hint_file", true);
        c19983913Gz.LJIIJ("hint_file_format", true);
        c19983913Gz.LJIIJ("_type", true);
        c19983913Gz.LJIIJ("types_sec", true);
        c19983913Gz.LJIIJ("tags", true);
        c19983913Gz.LJIIJ("tags_updated_at", true);
        c19983913Gz.LJIIJ("children", true);
        c19983913Gz.LJIIJ("child_effects", true);
        c19983913Gz.LJIIJ("parent", true);
        c19983913Gz.LJIIJ("effect_type", true);
        c19983913Gz.LJIIJ("source", true);
        c19983913Gz.LJIIJ("from_source", true);
        c19983913Gz.LJIIJ("designer_id", true);
        c19983913Gz.LJIIJ("designer_encrypted_id", true);
        c19983913Gz.LJIIJ("device_platform", true);
        c19983913Gz.LJIIJ("schema", true);
        c19983913Gz.LJIIJ("music", true);
        c19983913Gz.LJIIJ("extra", true);
        c19983913Gz.LJIIJ("perf_stats", true);
        c19983913Gz.LJIIJ("sdk_extra", true);
        c19983913Gz.LJIIJ("ad_raw_data", true);
        c19983913Gz.LJIIJ("composer_params", true);
        c19983913Gz.LJIIJ("is_busi", true);
        c19983913Gz.LJIIJ("iop_id", true);
        c19983913Gz.LJIIJ("is_iop", true);
        c19983913Gz.LJIIJ("resource_id", true);
        c19983913Gz.LJIIJ("bind_ids", true);
        c19983913Gz.LJIIJ("ptime", true);
        c19983913Gz.LJIIJ("grade_key", true);
        c19983913Gz.LJIIJ("challenge", true);
        c19983913Gz.LJIIJ("use_number", true);
        c19983913Gz.LJIIJ("effect_source_id", true);
        c19983913Gz.LJIIJ("composerPath", true);
        c19983913Gz.LJIIJ("zipPath", true);
        c19983913Gz.LJIIJ("unzipPath", true);
        c19983913Gz.LJIIJ("transResPath", true);
        c19983913Gz.LJIIJ("isDownloaded", true);
        c19983913Gz.LJIIJ("panel", true);
        c19983913Gz.LJIIJ("searchType", true);
        c19983913Gz.LJIIJ("recId", true);
        c19983913Gz.LJIIJ("_model_names", true);
        c19983913Gz.LJIIJ("model_names_sec", true);
        c19983913Gz.LJIIJ("original_effect_id", true);
        c19983913Gz.LJIIJ("trans_file_url", true);
        c19983913Gz.LJIIJ("template_effect_id", true);
        c19983913Gz.LJIIJ("doc_id", true);
        c19983913Gz.LJIIJ("rec_tag", true);
        c19983913Gz.LJIIJ("template_effect_extra", true);
        c19983913Gz.LJIIJ("server_extra", true);
        c19983913Gz.LJIIJ("file_diff", true);
        c19983913Gz.LJIIJ("provider", true);
        c19983913Gz.LJIIJ("package_size", true);
        c19983913Gz.LJIIJ("recommend_reason", true);
        c19983913Gz.LJIIJ("recommend_rule_tags", true);
        c19983913Gz.LJIIJ("effect_label", true);
        c19983913Gz.LJIIJ("graph_nodes", true);
        c19983913Gz.LJIIJ("logId", true);
        c19983913Gz.LJIIJ("is_cached_data", true);
        c19983913Gz.LJIIJ("isZstdDownload", true);
        c19983913Gz.LJIIJ("requirements", true);
        c19983913Gz.LJIIJ("types", true);
        c19983913Gz.LJIIJ("model_names", true);
        c19983913Gz.LJIIJ("verifySignatureExemptionEnabled", true);
        c19983913Gz.LJIIJ("verifySignatureExemptionReason", true);
        descriptor = c19983913Gz;
    }

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C01GW<C13HG<Object>>[] c01gwArr = Effect.$childSerializers;
        C13GX c13gx = C13GX.LIZ;
        UrlModel$$serializer urlModel$$serializer = UrlModel$$serializer.INSTANCE;
        C13HI c13hi = C13HI.LIZ;
        C13HO c13ho = C13HO.LIZ;
        C13H6 c13h6 = C13H6.LIZ;
        return new C13HG[]{c13gx, c01gwArr[1].getValue(), C19983613Gw.LIZ(c01gwArr[2].getValue()), c13gx, c13gx, c13gx, urlModel$$serializer, urlModel$$serializer, urlModel$$serializer, urlModel$$serializer, c13hi, c01gwArr[11].getValue(), C19983613Gw.LIZ(c01gwArr[12].getValue()), C19983613Gw.LIZ(c01gwArr[13].getValue()), c13gx, C19983613Gw.LIZ(c01gwArr[15].getValue()), c01gwArr[16].getValue(), C19983613Gw.LIZ(c13gx), c13hi, c13hi, c13hi, c13gx, c13gx, c13gx, c13gx, C19983613Gw.LIZ(c01gwArr[25].getValue()), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), c13gx, c13gx, c13gx, c13ho, c13gx, c13ho, c13gx, C19983613Gw.LIZ(c01gwArr[35].getValue()), c13h6, c13gx, C19983613Gw.LIZ(c01gwArr[38].getValue()), c13h6, C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c01gwArr[41].getValue()), c13gx, c13gx, c13gx, c13ho, c13gx, c13gx, C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(urlModel$$serializer), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c13gx), c13h6, C19983613Gw.LIZ(C13KG.LIZ), C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(C13KE.LIZ), c13h6, c13h6, C19983613Gw.LIZ(c13gx), C19983613Gw.LIZ(c01gwArr[62].getValue()), C19983613Gw.LIZ(EffectLabel$$serializer.INSTANCE), C19983613Gw.LIZ(c01gwArr[64].getValue()), c13gx, c13ho, c13ho, c01gwArr[68].getValue(), c01gwArr[69].getValue(), C19983613Gw.LIZ(c13gx), c13ho, c13gx};
    }

    @Override // X.InterfaceC19984213Hc
    public final Effect deserialize(C13HB c13hb) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        C01GW<C13HG<Object>>[] c01gwArr = Effect.$childSerializers;
        interfaceC19986313HxLIZIZ.LJJII();
        List list = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        String str2 = null;
        String str3 = null;
        DiffEffect diffEffect = null;
        String str4 = null;
        TemplateEffectExtra templateEffectExtra = null;
        String strLJIILL = null;
        String strLJIILL2 = null;
        String strLJIILL3 = null;
        String strLJIILL4 = null;
        List list4 = null;
        List list5 = null;
        UrlModel urlModel = null;
        UrlModel urlModel2 = null;
        String strLJIILL5 = null;
        UrlModel urlModel3 = null;
        UrlModel urlModel4 = null;
        List list6 = null;
        String strLJIILL6 = null;
        String strLJIILL7 = null;
        String strLJIILL8 = null;
        String strLJIILL9 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        String strLJIILL10 = null;
        String strLJIILL11 = null;
        String strLJIILL12 = null;
        String strLJIILL13 = null;
        String strLJIILL14 = null;
        List list10 = null;
        String strLJIILL15 = null;
        String str5 = null;
        List list11 = null;
        String str6 = null;
        String strLJIILL16 = null;
        String strLJIILL17 = null;
        String strLJIILL18 = null;
        String strLJIILL19 = null;
        String strLJIILL20 = null;
        String str7 = null;
        List list12 = null;
        List list13 = null;
        String str8 = null;
        List list14 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        UrlModel urlModel5 = null;
        String str13 = null;
        String strLJIILL21 = null;
        String strLJIILL22 = null;
        long jLJIIIIZZ = 0;
        long jLJIIIIZZ2 = 0;
        long jLJIIIIZZ3 = 0;
        long jLJIIIIZZ4 = 0;
        long jLJIIIIZZ5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iLJIJJLI = 0;
        int iLJIJJLI2 = 0;
        int iLJIJJLI3 = 0;
        int iLJIJJLI4 = 0;
        boolean zLJFF = false;
        boolean zLJFF2 = false;
        boolean zLJFF3 = false;
        int i8 = 0;
        boolean z = true;
        boolean zLJFF4 = false;
        boolean zLJFF5 = false;
        boolean zLJFF6 = false;
        List list15 = null;
        EffectLabel effectLabel = null;
        do {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            switch (iLJIJJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strLJIILL4 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i8 |= 1;
                    break;
                case 1:
                    list4 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), list4);
                    i8 |= 2;
                    break;
                case 2:
                    list5 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), list5);
                    i8 |= 4;
                    break;
                case 3:
                    strLJIILL3 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 3);
                    i8 |= 8;
                    break;
                case 4:
                    strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 4);
                    i8 |= 16;
                    break;
                case 5:
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 5);
                    i8 |= 32;
                    break;
                case 6:
                    urlModel = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 6, UrlModel$$serializer.INSTANCE, urlModel);
                    i8 |= 64;
                    break;
                case 7:
                    urlModel2 = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 7, UrlModel$$serializer.INSTANCE, urlModel2);
                    i8 |= 128;
                    break;
                case 8:
                    urlModel3 = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 8, UrlModel$$serializer.INSTANCE, urlModel3);
                    i8 |= 256;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    urlModel4 = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 9, UrlModel$$serializer.INSTANCE, urlModel4);
                    i8 |= 512;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 10);
                    i8 |= 1024;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    list6 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 11, c01gwArr[11].getValue(), list6);
                    i8 |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    list7 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 12, c01gwArr[12].getValue(), list7);
                    i8 |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    list8 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 13, c01gwArr[13].getValue(), list8);
                    i8 |= 8192;
                    break;
                case 14:
                    strLJIILL5 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 14);
                    i8 |= 16384;
                    break;
                case 15:
                    list9 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 15, c01gwArr[15].getValue(), list9);
                    i8 |= 32768;
                    break;
                case 16:
                    list10 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 16, c01gwArr[16].getValue(), list10);
                    i8 |= 65536;
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    str5 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 17, C13GX.LIZ, str5);
                    i8 |= 131072;
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    iLJIJJLI2 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 18);
                    i8 |= 262144;
                    break;
                case 19:
                    iLJIJJLI3 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 19);
                    i8 |= 524288;
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    iLJIJJLI4 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 20);
                    i8 |= 1048576;
                    break;
                case 21:
                    strLJIILL6 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 21);
                    i5 = 2097152;
                    i8 |= i5;
                    break;
                case 22:
                    strLJIILL7 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 22);
                    i5 = 4194304;
                    i8 |= i5;
                    break;
                case 23:
                    strLJIILL8 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 23);
                    i5 = 8388608;
                    i8 |= i5;
                    break;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    strLJIILL9 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 24);
                    i5 = 16777216;
                    i8 |= i5;
                    break;
                case 25:
                    list11 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 25, c01gwArr[25].getValue(), list11);
                    i5 = 33554432;
                    i8 |= i5;
                    break;
                case 26:
                    str6 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 26, C13GX.LIZ, str6);
                    i8 |= 67108864;
                    break;
                case 27:
                    str7 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 27, C13GX.LIZ, str7);
                    i8 |= 134217728;
                    break;
                case 28:
                    strLJIILL10 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 28);
                    i4 = 268435456;
                    i8 |= i4;
                    break;
                case 29:
                    strLJIILL11 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 29);
                    i4 = 536870912;
                    i8 |= i4;
                    break;
                case 30:
                    strLJIILL12 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 30);
                    i4 = 1073741824;
                    i8 |= i4;
                    break;
                case 31:
                    zLJFF = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 31);
                    i4 = Integer.MIN_VALUE;
                    i8 |= i4;
                    break;
                case 32:
                    strLJIILL13 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 32);
                    i6 |= 1;
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    zLJFF2 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 33);
                    i6 |= 2;
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    strLJIILL14 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 34);
                    i6 |= 4;
                    break;
                case 35:
                    list12 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 35, c01gwArr[35].getValue(), list12);
                    i6 |= 8;
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 36);
                    i6 |= 16;
                    break;
                case 37:
                    strLJIILL15 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 37);
                    i6 |= 32;
                    break;
                case 38:
                    list13 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 38, c01gwArr[38].getValue(), list13);
                    i6 |= 64;
                    break;
                case 39:
                    jLJIIIIZZ2 = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 39);
                    i6 |= 128;
                    break;
                case 40:
                    str8 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 40, C13GX.LIZ, str8);
                    i6 |= 256;
                    break;
                case 41:
                    list14 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 41, c01gwArr[41].getValue(), list14);
                    i6 |= 512;
                    break;
                case 42:
                    strLJIILL16 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 42);
                    i6 |= 1024;
                    break;
                case 43:
                    strLJIILL17 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 43);
                    i6 |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    break;
                case 44:
                    strLJIILL18 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 44);
                    i6 |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                    break;
                case 45:
                    zLJFF3 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 45);
                    i6 |= 8192;
                    break;
                case 46:
                    strLJIILL19 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 46);
                    i6 |= 16384;
                    break;
                case 47:
                    strLJIILL20 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 47);
                    i6 |= 32768;
                    break;
                case 48:
                    str9 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 48, C13GX.LIZ, str9);
                    i6 |= 65536;
                    break;
                case 49:
                    str10 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 49, C13GX.LIZ, str10);
                    i6 |= 131072;
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    str11 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 50, C13GX.LIZ, str11);
                    i6 |= 262144;
                    break;
                case 51:
                    str12 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 51, C13GX.LIZ, str12);
                    i6 |= 524288;
                    break;
                case 52:
                    urlModel5 = (UrlModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 52, UrlModel$$serializer.INSTANCE, urlModel5);
                    i6 |= 1048576;
                    break;
                case 53:
                    str13 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 53, C13GX.LIZ, str13);
                    i6 |= 2097152;
                    break;
                case 54:
                    str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 54, C13GX.LIZ, str);
                    i6 = 4194304 | i6;
                    break;
                case 55:
                    jLJIIIIZZ3 = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 55);
                    i3 = 8388608;
                    i6 |= i3;
                    break;
                case 56:
                    templateEffectExtra = (TemplateEffectExtra) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 56, C13KG.LIZ, templateEffectExtra);
                    i3 = 16777216;
                    i6 |= i3;
                    break;
                case 57:
                    str3 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 57, C13GX.LIZ, str3);
                    i6 |= 33554432;
                    break;
                case 58:
                    diffEffect = (DiffEffect) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 58, C13KE.LIZ, diffEffect);
                    i = 67108864;
                    i6 |= i;
                    break;
                case 59:
                    jLJIIIIZZ4 = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 59);
                    i2 = 134217728;
                    i6 |= i2;
                    break;
                case 60:
                    jLJIIIIZZ5 = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 60);
                    i2 = 268435456;
                    i6 |= i2;
                    break;
                case 61:
                    str4 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 61, C13GX.LIZ, str4);
                    i = 536870912;
                    i6 |= i;
                    break;
                case BaseNotice.CREATOR /* 62 */:
                    list15 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 62, c01gwArr[62].getValue(), list15);
                    i = 1073741824;
                    i6 |= i;
                    break;
                case 63:
                    effectLabel = (EffectLabel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 63, EffectLabel$$serializer.INSTANCE, effectLabel);
                    i = Integer.MIN_VALUE;
                    i6 |= i;
                    break;
                case 64:
                    list3 = (List) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 64, c01gwArr[64].getValue(), list3);
                    i7 |= 1;
                    break;
                case 65:
                    strLJIILL21 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 65);
                    i7 |= 2;
                    break;
                case 66:
                    zLJFF4 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 66);
                    i7 |= 4;
                    break;
                case 67:
                    zLJFF5 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 67);
                    i7 |= 8;
                    break;
                case 68:
                    list = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 68, c01gwArr[68].getValue(), list);
                    i7 |= 16;
                    break;
                case 69:
                    list2 = (List) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 69, c01gwArr[69].getValue(), list2);
                    i7 |= 32;
                    break;
                case 70:
                    str2 = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 70, C13GX.LIZ, str2);
                    i7 |= 64;
                    break;
                case 71:
                    zLJFF6 = interfaceC19986313HxLIZIZ.LJFF(interfaceC19983313Gt, 71);
                    i7 |= 128;
                    break;
                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                    strLJIILL22 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 72);
                    i7 |= 256;
                    break;
                default:
                    throw new C13II(iLJIJJ);
            }
        } while (z);
        interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
        return new Effect(i8, i6, i7, strLJIILL4, list4, list5, strLJIILL3, strLJIILL, strLJIILL2, urlModel, urlModel2, urlModel3, urlModel4, iLJIJJLI, list6, list7, list8, strLJIILL5, list9, list10, str5, iLJIJJLI2, iLJIJJLI3, iLJIJJLI4, strLJIILL6, strLJIILL7, strLJIILL8, strLJIILL9, list11, str6, str7, strLJIILL10, strLJIILL11, strLJIILL12, zLJFF, strLJIILL13, zLJFF2, strLJIILL14, list12, jLJIIIIZZ, strLJIILL15, list13, jLJIIIIZZ2, str8, list14, strLJIILL16, strLJIILL17, strLJIILL18, zLJFF3, strLJIILL19, strLJIILL20, str9, str10, str11, str12, urlModel5, str13, str, jLJIIIIZZ3, templateEffectExtra, str3, diffEffect, jLJIIIIZZ4, jLJIIIIZZ5, str4, list15, effectLabel, list3, strLJIILL21, zLJFF4, zLJFF5, list, list2, str2, zLJFF6, strLJIILL22, null);
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Effect effect) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        Effect.write$Self(effect, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
