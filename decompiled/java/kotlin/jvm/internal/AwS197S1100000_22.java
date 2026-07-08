package kotlin.jvm.internal;

import X.C09AJ;
import X.C09AY;
import X.C0CHQ;
import X.C0LAB;
import X.C0LCY;
import X.C1428790nHh;
import X.C19482611Ke;
import X.C20684815ws;
import X.C2188811AlT;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AwS197S1100000_22 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS197S1100000_22(VideoPublishEditModel videoPublishEditModel, int i) {
        super(2);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.s0 = "video_edit_page";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS197S1100000_22(C19482611Ke c19482611Ke, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c19482611Ke;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS197S1100000_22 awS197S1100000_22, Object obj, Object obj2) {
        String str = (String) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request AutoCut template detail failure: ");
        sbLIZ.append(str);
        C0LCY.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ));
        ((C09AJ) awS197S1100000_22.l1).onNext(new C1428790nHh(awS197S1100000_22.s0, 3, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (AVMusic) null, (String) null, (Boolean) null, 109, str, 16380));
        ((C09AJ) awS197S1100000_22.l1).onComplete();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS197S1100000_22 awS197S1100000_22, Object obj, Object obj2) {
        int i;
        String creationId;
        String str;
        String str2;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            i = 1;
        } else {
            i = 2;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS197S1100000_22.l1;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.allowCreateSticker = i;
        }
        C0CHQ.LIZ().LJJIIZI().LJIILL();
        C0CHQ.LIZ().LJJIIZI().LJJJLZIJ(i);
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS197S1100000_22.l1;
        if (videoPublishEditModel2 != null) {
            creationId = videoPublishEditModel2.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("enter_from", awS197S1100000_22.s0);
        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS197S1100000_22.l1;
        if (videoPublishEditModel3 != null) {
            str = videoPublishEditModel3.mShootWay;
        } else {
            str = null;
        }
        c0lab.LJ("shoot_way", str);
        if (zBooleanValue) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c0lab.LJ("to_status", str2);
        C20684815ws.LJIILLIIL("change_sticker_status", c0lab.LIZ);
        return Unit.LIZ;
    }
}
