package kotlin.jvm.internal;

import X.C09AY;
import X.C0H9H;
import X.C127I;
import X.C129G;
import X.C154M;
import X.C155H;
import X.C155Z;
import X.C15KP;
import X.C197039127h;
import X.C201955140j;
import X.C201962140q;
import X.C20359714lX;
import X.C20360614lg;
import X.C20377014oK;
import X.C20379114of;
import X.C20425514w9;
import X.C20426114wF;
import X.C20441214yg;
import X.C20684815ws;
import X.C20699115zB;
import X.C207069161b;
import X.C207071161d;
import X.C21268418La;
import X.C2188811AlT;
import X.C384050F3z;
import X.C807350Vll;
import X.C807840VmY;
import X.EnumC1654750tA9;
import X.EnumC20545715aR;
import X.InterfaceC204613154p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookFlowExtra;

/* JADX INFO: loaded from: classes32.dex */
public class AwS146S1200000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS146S1200000_31 awS146S1200000_31) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (((PageInfo) awS146S1200000_31.l1) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(((PageInfo) awS146S1200000_31.l1) instanceof BcmPageInfo);
        sbLIZ.append(' ');
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(' ');
        sbLIZ.append((BcmParams) awS146S1200000_31.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS146S1200000_31 awS146S1200000_31) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (((PageInfo) awS146S1200000_31.l1) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(((PageInfo) awS146S1200000_31.l1) instanceof BcmPageInfo);
        sbLIZ.append(' ');
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(' ');
        sbLIZ.append((BcmParams) awS146S1200000_31.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS146S1200000_31 awS146S1200000_31) {
        String str;
        Map<Long, PlaybookFlowExtra> map;
        String str2;
        PlaybookContent playbookContent;
        C20425514w9 c20425514w9;
        C20425514w9 c20425514w92;
        String str3;
        String str4;
        PlaybookContent playbookContent2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlaybookWithoutFlowStr, source=");
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(", playbook=");
        sbLIZ.append(PlaybookUtilKt.LJJIIZI((Playbook) awS146S1200000_31.l1));
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        C20377014oK c20377014oK = (C20377014oK) awS146S1200000_31.l2;
        if (c20377014oK.LIZJ == null) {
            c20377014oK.LIZJ = new C20425514w9(((C20377014oK) awS146S1200000_31.l2).LIZ);
        }
        HashMap<Long, PlayRule> mapLJIIZILJ = PlaybookUtilKt.LJIIZILJ(((C20377014oK) awS146S1200000_31.l2).LJFF);
        C20377014oK c20377014oK2 = (C20377014oK) awS146S1200000_31.l2;
        String str5 = "";
        C20360614lg c20360614lgLJ = null;
        if (c20377014oK2.LJIIJ) {
            C20379114of c20379114of = c20377014oK2.LJFF;
            Playbook playbook = (Playbook) awS146S1200000_31.l1;
            PlaybookContent playbookContent3 = c20379114of.LIZ.content;
            if (playbookContent3 != null && (str4 = playbookContent3.flowStr) != null && (playbookContent2 = playbook.content) != null) {
                playbookContent2.flowStr = str4;
            }
            c20379114of.LIZ = playbook;
        } else {
            C20379114of c20379114of2 = c20377014oK2.LJFF;
            Playbook playbook2 = (Playbook) awS146S1200000_31.l1;
            C20359714lX c20359714lX = c20377014oK2.LIZLLL;
            C20425514w9 c20425514w93 = c20377014oK2.LIZJ;
            if (c20425514w93 != null) {
                PlaybookContent playbookContent4 = c20379114of2.LIZ.content;
                if (playbookContent4 != null && (str2 = playbookContent4.flowStr) != null && (playbookContent = playbook2.content) != null) {
                    playbookContent.flowStr = str2;
                }
                c20379114of2.LIZ = playbook2;
                PlaybookContent playbookContent5 = playbook2.content;
                if (playbookContent5 == null || (str = playbookContent5.flowStr) == null) {
                    str = "";
                }
                C20426114wF c20426114wFLJIIJJI = c20425514w93.LJIIJJI(str);
                if (c20426114wFLJIIJJI != null) {
                    PlaybookContent playbookContent6 = c20379114of2.LIZ.content;
                    if (playbookContent6 != null) {
                        map = playbookContent6.functionExtraMap;
                    } else {
                        map = null;
                    }
                    c20360614lgLJ = PlaybookUtilKt.LJ(c20426114wFLJIIJJI, c20359714lX, mapLJIIZILJ, map, "detail", null, false, 48);
                }
                c20379114of2.LIZIZ = c20360614lgLJ;
            }
        }
        if (((C20377014oK) awS146S1200000_31.l2).LIZIZ.LIZIZ() && (((c20425514w9 = ((C20377014oK) awS146S1200000_31.l2).LIZJ) == null || c20425514w9.LJ() == null) && (c20425514w92 = ((C20377014oK) awS146S1200000_31.l2).LIZJ) != null)) {
            PlaybookContent playbookContent7 = ((Playbook) awS146S1200000_31.l1).content;
            if (playbookContent7 != null && (str3 = playbookContent7.flowStr) != null) {
                str5 = str3;
            }
            c20425514w92.LJIILJJIL(str5);
        }
        ((C20377014oK) awS146S1200000_31.l2).LJ.clear();
        ((C20377014oK) awS146S1200000_31.l2).LIZ(false);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS146S1200000_31 awS146S1200000_31) {
        C207069161b c207069161b = C207069161b.LIZ;
        C207071161d c207071161d = (C207071161d) awS146S1200000_31.l1;
        Map map = (Map) awS146S1200000_31.l2;
        c207069161b.getClass();
        if (c207071161d.LIZLLL) {
            C807840VmY.LIZIZ(C807350Vll.LIZIZ.LIZIZ(null), map);
        }
        C20684815ws.LJIILLIIL(awS146S1200000_31.s0, (Map) awS146S1200000_31.l2);
        C207069161b.LIZ((C207071161d) awS146S1200000_31.l1, awS146S1200000_31.s0, (Map) awS146S1200000_31.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS146S1200000_31 awS146S1200000_31) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (((PageInfo) awS146S1200000_31.l1) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(((PageInfo) awS146S1200000_31.l1) instanceof BcmPageInfo);
        sbLIZ.append(' ');
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(' ');
        sbLIZ.append((BcmParams) awS146S1200000_31.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS146S1200000_31 awS146S1200000_31) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (((PageInfo) awS146S1200000_31.l1) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(((PageInfo) awS146S1200000_31.l1) instanceof BcmPageInfo);
        sbLIZ.append(' ');
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(' ');
        sbLIZ.append((BcmParams) awS146S1200000_31.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS146S1200000_31 awS146S1200000_31) {
        boolean z;
        MusicModel.MusicItemType musicItemType;
        boolean z2;
        boolean zLJJJJI;
        boolean z3;
        String strEN;
        String musicId;
        InterfaceC204613154p interfaceC204613154pLJJJJLL;
        MusicModel musicModel = (MusicModel) awS146S1200000_31.l1;
        boolean z4 = false;
        if (musicModel != null && Intrinsics.LJFF(C154M.LIZ, musicModel.getMusicId())) {
            VideoPlayerComponent videoPlayerComponent = ((VerticalMusicViewV2) awS146S1200000_31.l2).LLJILJIL;
            if (videoPlayerComponent != null && videoPlayerComponent.LJ((MusicModel) awS146S1200000_31.l1)) {
                z = true;
            } else {
                z = false;
            }
            C155H c155h = null;
            if (z) {
                VideoPlayerComponent videoPlayerComponent2 = ((VerticalMusicViewV2) awS146S1200000_31.l2).LLJILJIL;
                if (videoPlayerComponent2 != null) {
                    MusicModel musicModel2 = (MusicModel) awS146S1200000_31.l1;
                    String str = awS146S1200000_31.s0;
                    if (musicModel2 != null && str != null && str.length() != 0) {
                        videoPlayerComponent2.LLJI = new Pair<>(musicModel2, str);
                    } else {
                        videoPlayerComponent2.LLJI = null;
                    }
                }
                ((VerticalMusicViewV2) awS146S1200000_31.l2).LLLIILIL.LJIIJ(Boolean.TRUE);
            } else {
                MusicModel musicModel3 = (MusicModel) awS146S1200000_31.l1;
                if (musicModel3 != null) {
                    musicItemType = musicModel3.getMusicItemType();
                } else {
                    musicItemType = null;
                }
                if (musicItemType == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) awS146S1200000_31.l2;
                EnumC1654750tA9 enumC1654750tA9 = verticalMusicViewV2.LLLF;
                EnumC1654750tA9 enumC1654750tA92 = EnumC1654750tA9.TAB_AI;
                if (enumC1654750tA9 == enumC1654750tA92) {
                    zLJJJJI = verticalMusicViewV2.LJJJJI((MusicModel) awS146S1200000_31.l1);
                } else {
                    zLJJJJI = false;
                }
                C129G c129gLJIILLIIL = ((VerticalMusicViewV2) awS146S1200000_31.l2).LJIILLIIL();
                VerticalMusicViewV2 verticalMusicViewV22 = (VerticalMusicViewV2) awS146S1200000_31.l2;
                C155H c155h2 = verticalMusicViewV22.LLIZ;
                if (c155h2 == null) {
                    c155h2 = null;
                }
                c155h2.LJIILIIL.LIZIZ(verticalMusicViewV22.LLJL, verticalMusicViewV22.LLJLIL, verticalMusicViewV22.LLJLILLLLZIIL, verticalMusicViewV22.LLJLL);
                ((VerticalMusicViewV2) awS146S1200000_31.l2).LLJLIL = System.currentTimeMillis();
                VerticalMusicViewV2 verticalMusicViewV23 = (VerticalMusicViewV2) awS146S1200000_31.l2;
                verticalMusicViewV23.LLJL = (MusicModel) awS146S1200000_31.l1;
                verticalMusicViewV23.LLJLILLLLZIIL = zLJJJJI;
                verticalMusicViewV23.LLJLL = C154M.LIZIZ + 1;
                C155H c155h3 = verticalMusicViewV23.LLIZ;
                if (c155h3 == null) {
                    c155h3 = null;
                }
                C155Z c155z = c155h3.LJIIL;
                String str2 = awS146S1200000_31.s0;
                AVMusic aVMusicLIZ = new C15KP().apply((MusicModel) awS146S1200000_31.l1);
                Long.valueOf(((VerticalMusicViewV2) awS146S1200000_31.l2).LLLIZZ);
                EnumC1654750tA9 enumC1654750tA93 = ((VerticalMusicViewV2) awS146S1200000_31.l2).LLLF;
                if (enumC1654750tA93 == enumC1654750tA92) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String stringValue = enumC1654750tA93.getStringValue();
                MusicModel musicModel4 = (MusicModel) awS146S1200000_31.l1;
                if (musicModel4 != null && (musicId = musicModel4.getMusicId()) != null && (interfaceC204613154pLJJJJLL = ((VerticalMusicViewV2) awS146S1200000_31.l2).LJJJJLL()) != null) {
                    strEN = interfaceC204613154pLJJJJLL.EN(musicId);
                } else {
                    strEN = null;
                }
                ((VerticalMusicViewV2) awS146S1200000_31.l2).LJJL();
                if (((VerticalMusicViewV2) awS146S1200000_31.l2).LLILZIL.J5() && !((VerticalMusicViewV2) awS146S1200000_31.l2).LLILZIL.Ct()) {
                    z4 = true;
                }
                c155z.LJIIIIZZ(str2, aVMusicLIZ, z3, z2, false, zLJJJJI, stringValue, strEN, z4, null, false, new AwS432S0200000_31((VerticalMusicViewV2) awS146S1200000_31.l2, (MusicModel) awS146S1200000_31.l1, 79));
                C201955140j.LJIILL(C201962140q.LIZIZ, "VerticalMusicView", "onMusicDownloadSuccess: onMusicChoose real success");
                if (c129gLJIILLIIL != null) {
                    c129gLJIILLIIL.LLLIILIL(-1);
                }
                VerticalMusicViewV2 verticalMusicViewV24 = (VerticalMusicViewV2) awS146S1200000_31.l2;
                C155H c155h4 = verticalMusicViewV24.LLIZ;
                if (c155h4 != null) {
                    c155h = c155h4;
                }
                c155h.LJIIL.LJIIIZ((MusicModel) awS146S1200000_31.l1, zLJJJJI, verticalMusicViewV24.LLLF.getStringValue(), ((VerticalMusicViewV2) awS146S1200000_31.l2).LLLIZZ);
            }
        } else {
            ((VerticalMusicViewV2) awS146S1200000_31.l2).LJIILJJIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS146S1200000_31 awS146S1200000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state: ");
        sbLIZ.append((EnumC20545715aR) awS146S1200000_31.l1);
        sbLIZ.append(" → ");
        sbLIZ.append((EnumC20545715aR) awS146S1200000_31.l2);
        sbLIZ.append(", reason: ");
        sbLIZ.append(awS146S1200000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS146S1200000_31 awS146S1200000_31) {
        String str;
        C197039127h couponBtnFromXml = ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml();
        PanelVoucherInfo panelVoucherInfo = (PanelVoucherInfo) awS146S1200000_31.l2;
        Drawable drawableLIZ = null;
        if (panelVoucherInfo != null) {
            str = panelVoucherInfo.buttonText;
        } else {
            str = null;
        }
        couponBtnFromXml.setText(str);
        String str2 = awS146S1200000_31.s0;
        if (Intrinsics.LJFF(str2, "claim")) {
            ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml().setButtonVariant(0);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZLLL = Integer.valueOf((int) C0H9H.LIZ(1));
            c384050F3z.LJFF = Integer.valueOf(R.attr.wf);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.wf);
            c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZ(4));
            ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml().setTextColorRes(R.attr.ee);
            C197039127h couponBtnFromXml2 = ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml();
            Context context = ((C21268418La) awS146S1200000_31.l1).getContext();
            if (context != null) {
                drawableLIZ = c384050F3z.LIZ(context);
            }
            couponBtnFromXml2.setBackground(drawableLIZ);
        } else if (Intrinsics.LJFF(str2, "use")) {
            ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml().setButtonVariant(1);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZLLL = Integer.valueOf((int) C0H9H.LIZ(1));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.wf);
            c384050F3z2.LIZIZ = null;
            c384050F3z2.LIZJ = Float.valueOf(C0H9H.LIZ(4));
            ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml().setTextColorRes(R.attr.wf);
            C197039127h couponBtnFromXml3 = ((C21268418La) awS146S1200000_31.l1).getCouponBtnFromXml();
            Context context2 = ((C21268418La) awS146S1200000_31.l1).getContext();
            if (context2 != null) {
                drawableLIZ = c384050F3z2.LIZ(context2);
            }
            couponBtnFromXml3.setBackground(drawableLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS146S1200000_31 awS146S1200000_31) {
        C127I c127i = C127I.LIZ;
        Context context = (Context) awS146S1200000_31.l1;
        PushSettings pushSettings = (PushSettings) awS146S1200000_31.l2;
        String str = awS146S1200000_31.s0;
        c127i.getClass();
        if (context != null) {
            String str2 = TranslationLanguageSettingPage._pnsPageId;
            List<ContentLanguage> list = pushSettings.translationLanguage;
            String str3 = "subtitle_bottom_banner";
            if (!Intrinsics.LJFF(str, "subtitle_bottom_banner")) {
                str3 = "translate_subtitle";
            }
            SmartRoute smartRouteLIZ = C20699115zB.LIZ(context, list, "settings_page", str3, null);
            if (smartRouteLIZ != null) {
                smartRouteLIZ.open(LSPassThroughRecordSizeConfig.DEFAULT);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS146S1200000_31 awS146S1200000_31) {
        ((Function2) awS146S1200000_31.l1).invoke(awS146S1200000_31.s0, (LiveEffect) awS146S1200000_31.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS146S1200000_31 awS146S1200000_31) {
        C20425514w9 c20425514w9;
        C20425514w9 c20425514w92;
        String str;
        String str2;
        Map<Long, PlaybookFlowExtra> map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlaybookWithFlowStr, source=");
        sbLIZ.append(awS146S1200000_31.s0);
        sbLIZ.append(", playbook=");
        sbLIZ.append(PlaybookUtilKt.LJJIIZI((Playbook) awS146S1200000_31.l1));
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        C20377014oK c20377014oK = (C20377014oK) awS146S1200000_31.l2;
        if (c20377014oK.LIZJ == null) {
            c20377014oK.LIZJ = new C20425514w9(((C20377014oK) awS146S1200000_31.l2).LIZ);
        }
        HashMap<Long, PlayRule> mapLJIIZILJ = PlaybookUtilKt.LJIIZILJ(((C20377014oK) awS146S1200000_31.l2).LJFF);
        C20377014oK c20377014oK2 = (C20377014oK) awS146S1200000_31.l2;
        C20379114of c20379114of = c20377014oK2.LJFF;
        Playbook playbook = (Playbook) awS146S1200000_31.l1;
        C20359714lX c20359714lX = c20377014oK2.LIZLLL;
        C20425514w9 c20425514w93 = c20377014oK2.LIZJ;
        String str3 = "";
        C20360614lg c20360614lgLJ = null;
        if (c20425514w93 != null) {
            c20379114of.LIZ = playbook;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent == null || (str2 = playbookContent.flowStr) == null) {
                str2 = "";
            }
            C20426114wF c20426114wFLJIIJJI = c20425514w93.LJIIJJI(str2);
            if (c20426114wFLJIIJJI != null) {
                PlaybookContent playbookContent2 = c20379114of.LIZ.content;
                if (playbookContent2 != null) {
                    map = playbookContent2.functionExtraMap;
                } else {
                    map = null;
                }
                c20360614lgLJ = PlaybookUtilKt.LJ(c20426114wFLJIIJJI, c20359714lX, mapLJIIZILJ, map, "detail", null, false, 48);
            }
            c20379114of.LIZIZ = c20360614lgLJ;
        }
        if (((C20377014oK) awS146S1200000_31.l2).LIZIZ.LIZIZ() && (((c20425514w9 = ((C20377014oK) awS146S1200000_31.l2).LIZJ) == null || c20425514w9.LJ() == null) && (c20425514w92 = ((C20377014oK) awS146S1200000_31.l2).LIZJ) != null)) {
            PlaybookContent playbookContent3 = ((Playbook) awS146S1200000_31.l1).content;
            if (playbookContent3 != null && (str = playbookContent3.flowStr) != null) {
                str3 = str;
            }
            c20425514w92.LJIILJJIL(str3);
        }
        ((C20377014oK) awS146S1200000_31.l2).LJ.clear();
        ((C20377014oK) awS146S1200000_31.l2).LIZ(false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(EnumC20545715aR enumC20545715aR, EnumC20545715aR enumC20545715aR2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = enumC20545715aR;
        this.l2 = enumC20545715aR2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(C207071161d c207071161d, String str, Map map, int i) {
        super(0);
        this.$t = i;
        this.l1 = c207071161d;
        this.l2 = map;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(C21268418La c21268418La, PanelVoucherInfo panelVoucherInfo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21268418La;
        this.l2 = panelVoucherInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(Context context, PushSettings pushSettings, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = pushSettings;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(PageInfo pageInfo, String str, BcmParams bcmParams, int i) {
        super(0);
        this.$t = i;
        this.l1 = pageInfo;
        this.s0 = str;
        this.l2 = bcmParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(LiveEffect liveEffect, String str, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l1 = function2;
        this.s0 = str;
        this.l2 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(MusicModel musicModel, VerticalMusicViewV2 verticalMusicViewV2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = musicModel;
        this.l2 = verticalMusicViewV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1200000_31(String str, Playbook playbook, C20377014oK c20377014oK, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = playbook;
        this.l2 = c20377014oK;
    }
}
