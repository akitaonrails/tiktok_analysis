package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0LAB;
import X.C0LH4;
import X.C0MIH;
import X.C0MIK;
import X.C0MIO;
import X.C0MIP;
import X.C1428470nHB;
import X.C20684815ws;
import X.C527760Kms;
import X.EnumC1668730tWh;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS189S1100000_8 extends C09AY implements Function2 {
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
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS189S1100000_8(VideoPublishEditModel videoPublishEditModel, int i) {
        super(2);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.s0 = "video_edit_page";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS189S1100000_8(C0MIK c0mik, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c0mik;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS189S1100000_8 awS189S1100000_8, Object obj, Object obj2) {
        String str;
        String str2 = (String) obj2;
        C0MIK c0mik = (C0MIK) awS189S1100000_8.l1;
        if (c0mik.LJIIL) {
            str = null;
        } else {
            str = awS189S1100000_8.s0;
        }
        c0mik.LJIILLIIL = C0MIP.GENERATING;
        C0MIO c0mio = c0mik.LJJII;
        if (c0mio != null) {
            c0mio.SD0(new C0LH4(c0mik), str2, c0mik.LJIIIIZZ, new C0MIH(c0mik), str, new Pair<>(EnumC1668730tWh.STYLE_QUEUEING, null));
        }
        C0MIO c0mio2 = c0mik.LJJII;
        if (c0mio2 != null) {
            c0mio2.tH(c0mik.LJFF, new AwS587S0100000_8(c0mik, 120));
        }
        C0MIO c0mio3 = c0mik.LJJII;
        if (c0mio3 != null) {
            c0mio3.iE(c0mik.LJFF, new C527760Kms(c0mik, str2, str, null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS189S1100000_8 awS189S1100000_8, Object obj, Object obj2) {
        int i;
        String creationId;
        String str;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            i = 1;
        } else {
            i = 2;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS189S1100000_8.l1;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.contentReusePermission = i;
        }
        C0CHQ.LIZ().LJJIIZI().LJJJJLI();
        C0CHQ.LIZ().LJJIIZI().LJIILIIL(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", awS189S1100000_8.s0);
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS189S1100000_8.l1;
        if (videoPublishEditModel2 != null) {
            creationId = videoPublishEditModel2.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        if (zBooleanValue) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("value", str);
        C20684815ws.LJIILLIIL("toggle_post_reuse_content_settings", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS189S1100000_8 awS189S1100000_8, Object obj, Object obj2) {
        String creationId;
        String strLJIILL;
        AVETParameter avetParameter;
        PrivacySettingModel privacySettingModel;
        AIGCInfo aIGCInfo;
        PrivacySettingModel privacySettingModel2;
        AIGCInfo aIGCInfo2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS189S1100000_8.l1;
        if (videoPublishEditModel != null) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && (privacySettingModel2 = creativeModel.privacySettingModel) != null && (aIGCInfo2 = privacySettingModel2.aigcInfo) != null) {
                aIGCInfo2.AIGCLabelType = zBooleanValue ? 1 : 0;
            }
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2 != null && (privacySettingModel = creativeModel2.privacySettingModel) != null && (aIGCInfo = privacySettingModel.aigcInfo) != null) {
                aIGCInfo.manualChangeSwitch = true;
            }
        }
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS189S1100000_8.l1;
        if (videoPublishEditModel2 != null) {
            creationId = videoPublishEditModel2.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS189S1100000_8.l1;
        String contentSource = null;
        if (videoPublishEditModel3 != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel3);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        VideoPublishEditModel videoPublishEditModel4 = (VideoPublishEditModel) awS189S1100000_8.l1;
        if (videoPublishEditModel4 != null && (avetParameter = videoPublishEditModel4.getAvetParameter()) != null) {
            contentSource = avetParameter.getContentSource();
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LIZ(zBooleanValue ? 1 : 0, "action_type");
        c0lab.LJ("enter_from", awS189S1100000_8.s0);
        C20684815ws.LJIILLIIL("aigc_toggle", c0lab.LIZ);
        return Unit.LIZ;
    }
}
