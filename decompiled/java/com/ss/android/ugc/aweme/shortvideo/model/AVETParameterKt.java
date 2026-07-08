package com.ss.android.ugc.aweme.shortvideo.model;

import X.C0MUK;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class AVETParameterKt {
    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final AVETParameter generateAVETParam(Bundle bundle) {
        if (bundle.getSerializable("av_et_parameter") != null) {
            return (AVETParameter) bundle.getSerializable("av_et_parameter");
        }
        AVETParameter aVETParameter = new AVETParameter();
        String string = bundle.getString("creation_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        aVETParameter.setCreationId(string);
        String str2 = C0MUK.LIZJ(bundle).draftInfoModel.newDraftId;
        if (str2 == null) {
            str2 = "";
        }
        aVETParameter.setNewDraftId(str2);
        aVETParameter.setDraftId(C0MUK.LIZJ(bundle).draftInfoModel.draftId);
        String string2 = bundle.getString("shoot_way");
        if (string2 == null) {
            string2 = "";
        }
        aVETParameter.setShootWay(string2);
        aVETParameter.setShootMode(bundle.getInt("shoot_mode", 0));
        if (bundle.containsKey("content_type")) {
            String string3 = bundle.getString("content_type");
            if (string3 == null) {
                string3 = "";
            }
            aVETParameter.setContentType(string3);
        }
        if (!bundle.containsKey("content_source")) {
            return aVETParameter;
        }
        String string4 = bundle.getString("content_source");
        if (string4 != null) {
            str = string4;
        }
        aVETParameter.setContentSource(str);
        return aVETParameter;
    }

    public static final AVETParameter generateAVETParam(Intent intent) {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        return generateAVETParam(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
    }
}
