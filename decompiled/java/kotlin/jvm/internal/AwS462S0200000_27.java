package kotlin.jvm.internal;

import X.AbstractC1837080xuE;
import X.AbstractC848400XPy;
import X.C013C;
import X.C07B0;
import X.C09AY;
import X.C0JT6;
import X.C0L9F;
import X.C0PEM;
import X.C0WQ1;
import X.C0WZX;
import X.C0XQ7;
import X.C1163410gNf;
import X.C1202170hOB;
import X.C123100dR;
import X.C1246020iWu;
import X.C1355280lN8;
import X.C1391990mKL;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561220qjI;
import X.C15HY;
import X.C1701330uNH;
import X.C1786240waE;
import X.C1800100wwa;
import X.C1833580xoa;
import X.C1834350xpp;
import X.C1836920xty;
import X.C1837160xuM;
import X.C1842270y2b;
import X.C1850150yFJ;
import X.C1850480yFq;
import X.C1852740yJU;
import X.C1854080yLe;
import X.C1854150yLl;
import X.C1854490yMJ;
import X.C1854540yMO;
import X.C1854760yMk;
import X.C1855030yNB;
import X.C1855180yNQ;
import X.C1855350yNh;
import X.C1855440yNq;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1862980ya0;
import X.C1862990ya1;
import X.C1909107dp;
import X.C197039127h;
import X.C19748612Om;
import X.C19EG;
import X.C19MB;
import X.C20441214yg;
import X.C21459418yW;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2382909Vj;
import X.C291001Au;
import X.C320040Cgc;
import X.C709650RsZ;
import X.C723850SaN;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C822890WPv;
import X.C822920WPy;
import X.C863410Xtz;
import X.EnumC1154120g8g;
import X.EnumC1154810g9n;
import X.EnumC1355300lNA;
import X.EnumC1854550yMP;
import X.EnumC1855290yNb;
import X.EnumC1855310yNd;
import X.EnumC1855360yNi;
import X.EnumC1863020ya4;
import X.InterfaceC1594550rb3;
import X.InterfaceC1850490yFr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC822930WPz;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.Editable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.pcs.course.PcsVideoActivity;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.TakoInputSkillLabelAssemV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.VoiceInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.image.TakoAIImageConvertStyleFragment;
import com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProcessInfo;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.album.TakoMediaChooseAlbumAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected.BottomSelectedMediaAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class AwS462S0200000_27 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            default:
                return null;
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_pcs_course_coursedetailpage_view_assem_CourseDetailContentAssem$getOnVideoClickEvent$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivity$0(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qLEJ+befpeFJ7ZpAklgHDP5horAvxCVY71yY3VW0jQm2ba0i+SANctcjt32fH/Td5fint0A==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_pcs_course_coursedetailpage_view_assem_CourseDetailContentAssem$getOnVideoClickEvent$1_com_bytedance_router_monitor_page_PageLancet_startActivity$1(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_pcs_course_coursedetailpage_view_assem_CourseDetailContentAssem$getOnVideoClickEvent$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivity$0(context, intent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(C863410Xtz c863410Xtz, C1786240waE c1786240waE, int i) {
        super(2);
        this.$t = i;
        this.l0 = c863410Xtz;
        this.l1 = c1786240waE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        String str;
        long j;
        int iIntValue = ((Number) obj).intValue();
        String str2 = (String) obj2;
        AbstractC1837080xuE abstractC1837080xuE = ((CourseDetailContentAssem) awS462S0200000_27.l0).lp().getState().LLILLJJLI;
        abstractC1837080xuE.getClass();
        if (abstractC1837080xuE instanceof C1837160xuM) {
            PcsCourseDetailVM.zQ2(((CourseDetailContentAssem) awS462S0200000_27.l0).lp(), "click", str2, Long.valueOf(((long[]) awS462S0200000_27.l1)[iIntValue]), false, 8);
            C1836920xty c1836920xtyKp = ((CourseDetailContentAssem) awS462S0200000_27.l0).kp();
            if (c1836920xtyKp != null && c1836920xtyKp.LLIZLLLIL) {
                str = "purchased_video_detail";
            } else {
                str = "live_unlock";
            }
            Context context = ((CourseDetailContentAssem) awS462S0200000_27.l0).getContext();
            if (context != null) {
                CourseDetailContentAssem courseDetailContentAssem = (CourseDetailContentAssem) awS462S0200000_27.l0;
                long[] jArr = (long[]) awS462S0200000_27.l1;
                Intent intent = new Intent(context, (Class<?>) PcsVideoActivity.class);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("fragment_type", "pcs_course_video_player", bundle);
                C786410Ut5.LJJJI("show_entrance", str, bundle);
                C1836920xty c1836920xtyKp2 = courseDetailContentAssem.kp();
                long j2 = -1;
                if (c1836920xtyKp2 != null) {
                    j = c1836920xtyKp2.LLILLJJLI;
                } else {
                    j = -1;
                }
                bundle.putLong("anchor_id", j);
                C1836920xty c1836920xtyKp3 = courseDetailContentAssem.kp();
                if (c1836920xtyKp3 != null) {
                    j2 = c1836920xtyKp3.LL;
                }
                bundle.putLong("course_id", j2);
                bundle.putLongArray("video_id_list", jArr);
                bundle.putInt("selected_position", iIntValue);
                intent.putExtras(bundle);
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_pcs_course_coursedetailpage_view_assem_CourseDetailContentAssem$getOnVideoClickEvent$1_com_bytedance_router_monitor_page_PageLancet_startActivity$1(context, intent);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        boolean z;
        PostConfigModel postConfigModel = (PostConfigModel) obj;
        if (((Boolean) obj2).booleanValue()) {
            if (postConfigModel != null) {
                LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) awS462S0200000_27.l0;
                String str = LiveHighLightPageFragment._pnsPageId;
                liveHighLightPageFragment.qS(postConfigModel, Boolean.FALSE);
            }
            if (((LiveHighLightPageFragment) awS462S0200000_27.l0).iS().LLIZ) {
                List<String> list = C1833580xoa.LIZ;
                C19EG c19eg = (C19EG) awS462S0200000_27.l1;
                FragmentManager childFragmentManager = ((LiveHighLightPageFragment) awS462S0200000_27.l0).getChildFragmentManager();
                AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27((LiveHighLightPageFragment) awS462S0200000_27.l0, 311);
                C1834350xpp c1834350xpp = C1834350xpp.LIZ;
                c1834350xpp.getClass();
                C0JT6<Integer> c0jt6 = C1834350xpp.LJIIZILJ;
                Integer numLIZ = c0jt6.LIZ();
                boolean z2 = true;
                int iIntValue = 0;
                if (numLIZ != null && numLIZ.intValue() >= 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showAutoPostLivingGuideAfterPublish ");
                    c1834350xpp.getClass();
                    Integer numLIZ2 = c0jt6.LIZ();
                    if (numLIZ2 == null || numLIZ2.intValue() < 3) {
                        z2 = false;
                    }
                    sbLIZ.append(z2);
                    C20441214yg.LIZIZ("LiveReplayListGuideManager", C2188811AlT.LIZIZ(sbLIZ));
                } else if (!C1833580xoa.LJIILJJIL() && !C1833580xoa.LJIILL()) {
                    c1834350xpp.getClass();
                    Integer numLIZ3 = c0jt6.LIZ();
                    if (numLIZ3 != null) {
                        iIntValue = numLIZ3.intValue();
                    }
                    c0jt6.LIZJ(Integer.valueOf(iIntValue + 1));
                    C1834350xpp.LJIJ.LIZJ(Long.valueOf(System.currentTimeMillis()));
                    C1246020iWu.LIZLLL("highlight_page", c19eg, childFragmentManager, awS571S0100000_27);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showAutoPostLivingGuideAfterPublish ");
                    sbLIZ2.append(C1833580xoa.LJIILJJIL());
                    sbLIZ2.append(" || ");
                    sbLIZ2.append(C1833580xoa.LJIILL());
                    C20441214yg.LIZIZ("LiveReplayListGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                C20441214yg.LIZIZ("LiveReplayListGuideManager", "auto post notice not show");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        if (obj != null) {
            C1854080yLe c1854080yLe = ((TakoMenuWindowAssem) awS462S0200000_27.l0).LLJJL;
            if (c1854080yLe != null) {
                c1854080yLe.LIZIZ();
            }
            TakoInputViewUIAbility takoInputViewUIAbilityLp = ((TakoMenuWindowAssem) awS462S0200000_27.l0).lp();
            if (takoInputViewUIAbilityLp != null) {
                takoInputViewUIAbilityLp.w7(EnumC1854550yMP.HOMEWORK, C1854490yMJ.LIZJ(((C1854150yLl) awS462S0200000_27.l1).LL), null, null, null, null, null, false, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        BottomInputAssem bottomInputAssem = (BottomInputAssem) awS462S0200000_27.l0;
        C1854540yMO c1854540yMO = (C1854540yMO) awS462S0200000_27.l1;
        bottomInputAssem.getClass();
        new AwS393S0200000_27(bottomInputAssem, c1854540yMO, 118).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        String str;
        BaseImage baseImage = (BaseImage) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (baseImage != null) {
            BottomInputAssem bottomInputAssem = (BottomInputAssem) awS462S0200000_27.l0;
            bottomInputAssem.Wp("ai_image_panel", bottomInputAssem.getContext(), baseImage, ((C1854150yLl) awS462S0200000_27.l1).LLJJIII);
        } else {
            TakoSubModeBarAbility takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BottomInputAssem) awS462S0200000_27.l0), TakoSubModeBarAbility.class, null);
            if (takoSubModeBarAbility != null) {
                takoSubModeBarAbility.zJ0();
            }
            BottomInputAssem bottomInputAssem2 = (BottomInputAssem) awS462S0200000_27.l0;
            C1854150yLl c1854150yLl = (C1854150yLl) awS462S0200000_27.l1;
            if (iIntValue == 4) {
                str = "click_cancel";
            } else {
                str = "image_non_compliant";
            }
            bottomInputAssem2.wq(c1854150yLl, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        Object obj3;
        C291001Au c291001Au = (C291001Au) obj2;
        Object obj4 = null;
        if (c291001Au != null) {
            obj3 = c291001Au.LIZ;
        } else {
            obj3 = null;
        }
        if (obj3 instanceof C1855030yNB) {
            ((C1855350yNh) awS462S0200000_27.l0).LJIIIIZZ(EnumC1855360yNi.UN_RECOGNIZE_TIP);
            C1862330yYx.LLFII(C1862330yYx.LIZ, ((BottomInputAssem) awS462S0200000_27.l1).getCommonParams(), "unrecognized");
            C1855350yNh c1855350yNh = (C1855350yNh) awS462S0200000_27.l0;
            c1855350yNh.setState(EnumC1855310yNd.INITIATE);
            c1855350yNh.setTalkState(EnumC1855290yNb.STOP);
            c1855350yNh.LIZ(false);
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                businessCapabilityServiceLIZ.LIZIZ(EnumC1355300lNA.TAKO_VOICE_MESSAGE);
            }
        } else {
            if (c291001Au != null) {
                obj4 = c291001Au.LIZ;
            }
            if (obj4 instanceof C1855440yNq) {
                C1855350yNh c1855350yNh2 = (C1855350yNh) awS462S0200000_27.l0;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BottomInputAssem.LLLLZIL;
                c1855350yNh2.setState(EnumC1855310yNd.INITIATE);
                c1855350yNh2.setTalkState(EnumC1855290yNb.STOP);
                c1855350yNh2.LIZ(false);
                BusinessCapabilityService.LIZ.getClass();
                BusinessCapabilityService businessCapabilityServiceLIZ2 = C1355280lN8.LIZ();
                if (businessCapabilityServiceLIZ2 != null) {
                    businessCapabilityServiceLIZ2.LIZIZ(EnumC1355300lNA.TAKO_VOICE_MESSAGE);
                }
            } else {
                ((C1855350yNh) awS462S0200000_27.l0).LJFF();
                ((C1855350yNh) awS462S0200000_27.l0).setTalkInterrupted(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        C1855180yNQ c1855180yNQ = (C1855180yNQ) obj2;
        if (((BottomInputAssem) awS462S0200000_27.l0).LLLLII <= c1855180yNQ.LIZ.length()) {
            String strSubstring = c1855180yNQ.LIZ.substring(((BottomInputAssem) awS462S0200000_27.l0).LLLLII);
            ((BottomInputAssem) awS462S0200000_27.l0).LLLLII = c1855180yNQ.LIZ.length();
            C1854760yMk c1854760yMk = ((BottomInputAssem) awS462S0200000_27.l0).LLJJJ;
            if (c1854760yMk != null) {
                c1854760yMk.LJIJI(strSubstring, true);
            }
        }
        if (c1855180yNQ.LIZIZ && c1855180yNQ.LIZ.length() == 0) {
            C1854760yMk c1854760yMk2 = ((BottomInputAssem) awS462S0200000_27.l0).LLJJJ;
            if (c1854760yMk2 != null) {
                c1854760yMk2.setVoicePendingSend(false);
            }
            ((TakoSpeechViewModel) awS462S0200000_27.l1).zQ2(new C1855030yNB("no valid content"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) throws Throwable {
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        BottomInputAssem bottomInputAssem = (BottomInputAssem) awS462S0200000_27.l0;
        if (bottomInputAssem.LLLJIL) {
            bottomInputAssem.LLLJIL = false;
        } else {
            boolean z = true;
            if (bottomInputAssem.LLLJL == 1) {
                bottomInputAssem.LLLJL = 2;
            }
            if (bottomInputAssem.LLLJ && C123100dR.LIZ(str)) {
                BottomInputAssem bottomInputAssem2 = (BottomInputAssem) awS462S0200000_27.l0;
                bottomInputAssem2.LLLJL = 1;
                bottomInputAssem2.LLLL = str;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C320040Cgc((BottomInputAssem) awS462S0200000_27.l0, str, null), 3);
            }
            ((BottomInputAssem) awS462S0200000_27.l0).LLLJ = false;
            Editable editableV = C2204961BRm.v(((C1854760yMk) awS462S0200000_27.l1).getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6tRPcGwZ0K8PXyTijw2/29g==", null));
            if (editableV != null && editableV.length() != 0) {
                z = false;
            }
            if (z) {
                ((BottomInputAssem) awS462S0200000_27.l0).LLLLLZ = "manual_input";
                ((C1854760yMk) awS462S0200000_27.l1).LJIJI("", false);
            } else if (!zBooleanValue) {
                if (Intrinsics.LJFF(((BottomInputAssem) awS462S0200000_27.l0).LLLLLZ, "voice_input")) {
                    ((BottomInputAssem) awS462S0200000_27.l0).LLLLLZ = "voice_and_manual";
                }
            } else if (Intrinsics.LJFF(((BottomInputAssem) awS462S0200000_27.l0).LLLLLZ, "manual_input")) {
                ((BottomInputAssem) awS462S0200000_27.l0).LLLLLZ = "voice_input";
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        TakoMenuWindowAbility takoMenuWindowAbility;
        TakoMenuWindowAbility takoMenuWindowAbility2;
        if (((Number) ((C291001Au) obj2).LIZ).intValue() == 1) {
            C013C c013c = (C013C) awS462S0200000_27.l0;
            if (c013c.element) {
                c013c.element = false;
                TakoBaseFragment takoBaseFragment = (TakoBaseFragment) awS462S0200000_27.l1;
                takoBaseFragment.getClass();
                C723850SaN.LIZ(takoBaseFragment, false, null, new AwS603S0100000_24(takoBaseFragment, 572), 3);
                View view = takoBaseFragment.LLJJIII;
                if (view != null && (takoMenuWindowAbility2 = (TakoMenuWindowAbility) C1558520qew.LIZ(C1558360qeg.LJFF(takoBaseFragment, null), TakoMenuWindowAbility.class, null)) != null) {
                    takoMenuWindowAbility2.t22(view);
                }
                takoBaseFragment.dS().LLILZLL = EnumC1154120g8g.TAKO_FRAGMENT;
                C736680Sv4.LJIIIIZZ(takoBaseFragment, takoBaseFragment.aS(), new C2217381BqS() { // from class: X.0yLH
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C1853920yLO) obj3).LLJJIJIIJIL;
                    }
                }, null, new AwS641S0100000_27(takoBaseFragment, 126), 6);
                C736680Sv4.LJIIIIZZ(takoBaseFragment, takoBaseFragment.aS(), new C2217381BqS() { // from class: X.0yLD
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C1853920yLO) obj3).LLJJIJIL;
                    }
                }, null, new AwS641S0100000_27(takoBaseFragment, 127), 6);
                C736680Sv4.LJIIIIZZ(takoBaseFragment, takoBaseFragment.aS(), new C2217381BqS() { // from class: X.0yLN
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C1853920yLO) obj3).LLJJJ;
                    }
                }, C736820SvI.LIZLLL(), new AwS641S0100000_27(takoBaseFragment, 128), 4);
                C736680Sv4.LJIIIIZZ(takoBaseFragment, takoBaseFragment.dS(), new C2217381BqS() { // from class: X.0yKR
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C1853320yKQ) obj3).LLILLL;
                    }
                }, C736820SvI.LIZLLL(), new AwS641S0100000_27(takoBaseFragment, 129), 4);
                C736680Sv4.LJIIIIZZ(takoBaseFragment, takoBaseFragment.aS(), new C2217381BqS() { // from class: X.0yLG
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C1853920yLO) obj3).LLJJJIL;
                    }
                }, null, new AwS641S0100000_27(takoBaseFragment, 125), 6);
                View view2 = takoBaseFragment.LLJJIII;
                if (view2 != null && (takoMenuWindowAbility = (TakoMenuWindowAbility) C1558520qew.LIZ(C1558360qeg.LJFF(takoBaseFragment, null), TakoMenuWindowAbility.class, null)) != null) {
                    takoMenuWindowAbility.Dj2(view2);
                }
                AssemVMLazy assemVMLazy = takoBaseFragment.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoBaseFragment.LLLLIILLL;
                C736680Sv4.LJIIIIZZ(takoBaseFragment, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OEc
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C0NPX) obj3).LLILZ;
                    }
                }, null, new AwS638S0100000_24(takoBaseFragment, 187), 6);
            }
            TakoMenuWindowAbility takoMenuWindowAbility3 = (TakoMenuWindowAbility) C1558520qew.LIZ(C1558360qeg.LJFF((TakoBaseFragment) awS462S0200000_27.l1, null), TakoMenuWindowAbility.class, null);
            if (takoMenuWindowAbility3 != null) {
                takoMenuWindowAbility3.Un2();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        Function2 function2 = (Function2) awS462S0200000_27.l0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), obj2);
        }
        ((C1800100wwa) awS462S0200000_27.l1).getClass();
        C822890WPv.LIZJ(new C0WQ1() { // from class: X.0wsp
            @Override // X.C0WQ1
            public final void LIZ() {
                C822890WPv c822890WPv = C822890WPv.LIZ;
                if (C822920WPy.LIZLLL(0L)) {
                    C1798550wu5.LIZIZ.onAppBackground();
                } else {
                    C1798550wu5.LIZIZ.onAppForeground();
                }
            }
        });
        HashMap<Integer, String> map = C822920WPy.LIZ;
        C822920WPy.LJ(new InterfaceC822930WPz() { // from class: X.0wsq
            @Override // X.InterfaceC822930WPz
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC822930WPz
            public final void onAppBackground() {
                C1798550wu5.LIZIZ.onAppBackground();
            }

            @Override // X.InterfaceC822930WPz
            public final void onAppForeground() {
                C1798550wu5.LIZIZ.onAppForeground();
            }

            @Override // X.InterfaceC822930WPz
            public final void LIZ() {
                if (MethodIDManager.LJI(196678)) {
                    MethodIDManager.LJ();
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        C19MB c19mb;
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1842270y2b c1842270y2b = ((InputInnerAssem) awS462S0200000_27.l0).LLJJI;
        if (c1842270y2b != null) {
            if (zBooleanValue) {
                i = Integer.MAX_VALUE;
            } else {
                i = 1;
            }
            c1842270y2b.setMaxLines(i);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) awS462S0200000_27.l1;
        C21459418yW c21459418yW = new C21459418yW();
        c21459418yW.LLILLL = 0L;
        c21459418yW.LLILZ = new AccelerateDecelerateInterpolator();
        c21459418yW.LJIILIIL(R.id.afz);
        c21459418yW.LJIILIIL(R.id.voice_send_container);
        C19748612Om.LIZ(constraintLayout, c21459418yW);
        InputInnerAssem inputInnerAssem = (InputInnerAssem) awS462S0200000_27.l0;
        if (zBooleanValue) {
            c19mb = inputInnerAssem.LLLF;
        } else {
            c19mb = inputInnerAssem.LLL;
        }
        if (c19mb != null) {
            c19mb.LIZIZ((ConstraintLayout) awS462S0200000_27.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS462S0200000_27 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS462S0200000_27.invoke$19(kotlin.jvm.internal.AwS462S0200000_27, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS462S0200000_27 r33, java.lang.Object r34, java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS462S0200000_27.invoke$2(kotlin.jvm.internal.AwS462S0200000_27, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$20(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((Number) obj).intValue();
        TakoPhotoChooseViewModel takoPhotoChooseViewModel = (TakoPhotoChooseViewModel) awS462S0200000_27.l0;
        C19EG c19eg = (C19EG) awS462S0200000_27.l1;
        for (Uri uri : (List) obj2) {
            TikTokMediaModel tikTokMediaModel = new TikTokMediaModel(UUID.randomUUID().toString(), C0L9F.CAMERA, 4);
            tikTokMediaModel.LJIILL(uri.toString());
            takoPhotoChooseViewModel.yQ2(tikTokMediaModel, c19eg, EnumC1154810g9n.CAMERA);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        TakoInputSkillLabelAssemV2 takoInputSkillLabelAssemV2 = (TakoInputSkillLabelAssemV2) awS462S0200000_27.l0;
        C1854540yMO c1854540yMO = (C1854540yMO) awS462S0200000_27.l1;
        takoInputSkillLabelAssemV2.getClass();
        new AwS393S0200000_27(takoInputSkillLabelAssemV2, c1854540yMO, 161).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        C1855180yNQ c1855180yNQ = (C1855180yNQ) obj2;
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZJ()) {
            if (c1855180yNQ.LIZIZ) {
                if (c1855180yNQ.LIZ.length() > 0) {
                    IInputInnerAbility iInputInnerAbility = (IInputInnerAbility) ((VoiceInputAssem) awS462S0200000_27.l0).LLJJIJIIJIL.getValue();
                    if (iInputInnerAbility != null) {
                        iInputInnerAbility.QR(c1855180yNQ.LIZ);
                    }
                } else {
                    ((VoiceInputAssem) awS462S0200000_27.l0).LLJLLIL = false;
                    ((TakoSpeechViewModel) awS462S0200000_27.l1).zQ2(new C1855030yNB("no valid content"));
                }
            }
        } else {
            if (((VoiceInputAssem) awS462S0200000_27.l0).LLJLL <= c1855180yNQ.LIZ.length()) {
                String strSubstring = c1855180yNQ.LIZ.substring(((VoiceInputAssem) awS462S0200000_27.l0).LLJLL);
                ((VoiceInputAssem) awS462S0200000_27.l0).LLJLL = c1855180yNQ.LIZ.length();
                IInputInnerAbility iInputInnerAbility2 = (IInputInnerAbility) ((VoiceInputAssem) awS462S0200000_27.l0).LLJJIJIIJIL.getValue();
                if (iInputInnerAbility2 != null) {
                    iInputInnerAbility2.QR(strSubstring);
                }
            }
            if (c1855180yNQ.LIZIZ && c1855180yNQ.LIZ.length() == 0) {
                ((VoiceInputAssem) awS462S0200000_27.l0).LLJLLIL = false;
                ((TakoSpeechViewModel) awS462S0200000_27.l1).zQ2(new C1855030yNB("no valid content"));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((C1391990mKL) obj2).LIZIZ = true;
        C863410Xtz c863410Xtz = (C863410Xtz) awS462S0200000_27.l0;
        if (!c863410Xtz.LIZ) {
            ((C1786240waE) awS462S0200000_27.l1).LIZ(c863410Xtz.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((C1391990mKL) obj2).LIZIZ = true;
        C863410Xtz c863410Xtz = (C863410Xtz) awS462S0200000_27.l0;
        if (c863410Xtz.LIZ) {
            ((C1786240waE) awS462S0200000_27.l1).LIZ(c863410Xtz.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C1561220qjI.LIZ.getClass();
        if (C1561220qjI.LIZ()) {
            ((TakoSubModeBarAssem) awS462S0200000_27.l0).hp((C1854150yLl) awS462S0200000_27.l1, iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((TakoSubModeBarAssem) awS462S0200000_27.l0).hp((C1854150yLl) awS462S0200000_27.l1, ((Number) obj2).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((TakoSubModeBarAssem) awS462S0200000_27.l0).hp((C1854150yLl) awS462S0200000_27.l1, ((Number) obj2).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        MusicModel musicModel;
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List list = (List) ((C1850150yFJ) awS462S0200000_27.l0).LJFF.getValue();
        if (list != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(iIntValue, list)) != null && zBooleanValue) {
            new C15HY((RecyclerView) awS462S0200000_27.l1, musicModel, iIntValue, 16).LIZLLL((LifecycleOwner) ((C1850150yFJ) awS462S0200000_27.l0).LIZLLL.LIZ(C1850150yFJ.LJI[2]));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoNewMarkdownAssem) awS462S0200000_27.l0), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.nX0(iIntValue, str);
            iMessageAbility.zN(iIntValue, str);
        }
        TakoNewMarkdownAssem takoNewMarkdownAssem = (TakoNewMarkdownAssem) awS462S0200000_27.l0;
        Message message = (Message) awS462S0200000_27.l1;
        takoNewMarkdownAssem.getClass();
        TakoNewMarkdownAssem.op(message);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        boolean z;
        ConvertStyleItem convertStyleItem = (ConvertStyleItem) obj2;
        ((TakoAIImageConvertStyleFragment) awS462S0200000_27.l0).LLJI = convertStyleItem;
        C197039127h c197039127h = (C197039127h) awS462S0200000_27.l1;
        if (c197039127h != null) {
            if (convertStyleItem != null) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((TakoMediaChooseAlbumAssem) awS462S0200000_27.l0).ip().wQ2(((View) awS462S0200000_27.l1).getContext());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((BottomSelectedMediaAssem) awS462S0200000_27.l0).op(null, (List) ((C291001Au) obj2).LIZ, true, (View) awS462S0200000_27.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        float fFloatValue = ((Number) obj2).floatValue();
        TakoFeedRightBottomEntranceViewModel takoFeedRightBottomEntranceViewModel = (TakoFeedRightBottomEntranceViewModel) awS462S0200000_27.l0;
        takoFeedRightBottomEntranceViewModel.setState(new C709650RsZ(iIntValue, takoFeedRightBottomEntranceViewModel, fFloatValue));
        if (iIntValue == 0 && fFloatValue > 0.0f) {
            TakoFeedRightBottomEntranceViewModel takoFeedRightBottomEntranceViewModel2 = (TakoFeedRightBottomEntranceViewModel) awS462S0200000_27.l0;
            if (!takoFeedRightBottomEntranceViewModel2.LLILLJJLI) {
                final Context context = ((View) awS462S0200000_27.l1).getContext();
                if (!takoFeedRightBottomEntranceViewModel2.LLILLL && ((Number) C07B0.LIZ.getValue()).intValue() == 2) {
                    C1862990ya1.LIZ.getClass();
                    if (C1862990ya1.LIZIZ() && !C1860520yW2.LJFF(C1860520yW2.LIZ)) {
                        C1862980ya0.LIZ.getClass();
                        Keva keva = (Keva) C1862980ya0.LIZIZ.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("has_prefetched_onboarding_images_once_");
                        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                            takoFeedRightBottomEntranceViewModel2.LLILLL = true;
                            C1852740yJU.LIZ.getClass();
                            final EnumC1863020ya4 enumC1863020ya4LIZ = C1862990ya1.LIZ(C1852740yJU.LIZ());
                            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0yZN
                                @Override // android.os.MessageQueue.IdleHandler
                                public final boolean queueIdle() {
                                    try {
                                        C1862980ya0 c1862980ya0 = C1862980ya0.LIZ;
                                        Context context2 = context;
                                        EnumC1863020ya4 enumC1863020ya4 = enumC1863020ya4LIZ;
                                        c1862980ya0.getClass();
                                        C1862980ya0.LIZIZ(context2, enumC1863020ya4);
                                        return false;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        return false;
                                    }
                                }
                            }, Looper.getMainLooper().getQueue());
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            CompletionBlock completionBlock = (CompletionBlock) awS462S0200000_27.l0;
            ((C1850480yFq) awS462S0200000_27.l1).getClass();
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1850490yFr.class, null);
            InterfaceC1850490yFr interfaceC1850490yFr = (InterfaceC1850490yFr) xBaseModelLIZJ;
            interfaceC1850490yFr.setCode(1);
            interfaceC1850490yFr.setMsg(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ((CompletionBlock) awS462S0200000_27.l0, 0, str, null, 4);
        }
        ((C1850480yFq) awS462S0200000_27.l1).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS462S0200000_27 awS462S0200000_27, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((TakoMenuWindowAssem) awS462S0200000_27.l0).kp().setState(new AwS603S0100000_24((List) obj2, (List<? extends InterfaceC1594550rb3>) 612));
        C1854080yLe c1854080yLe = ((TakoMenuWindowAssem) awS462S0200000_27.l0).LLJJL;
        if (c1854080yLe != null) {
            c1854080yLe.LIZIZ();
        }
        TakoInputViewUIAbility takoInputViewUIAbilityLp = ((TakoMenuWindowAssem) awS462S0200000_27.l0).lp();
        if (takoInputViewUIAbilityLp != null) {
            takoInputViewUIAbilityLp.w7(EnumC1854550yMP.HOMEWORK, C1854490yMJ.LIZJ(((C1854150yLl) awS462S0200000_27.l1).LL), null, null, null, null, null, false, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(C1202170hOB c1202170hOB, C1800100wwa c1800100wwa, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1202170hOB;
        this.l1 = c1800100wwa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(C1850150yFJ c1850150yFJ, RecyclerView recyclerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1850150yFJ;
        this.l1 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(C1855350yNh c1855350yNh, BottomInputAssem bottomInputAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1855350yNh;
        this.l1 = bottomInputAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS462S0200000_27(CompletionBlock completionBlock, CompletionBlock<InterfaceC1850490yFr> completionBlock2, C1850480yFq c1850480yFq) {
        super(2);
        this.$t = c1850480yFq;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(LiveHighLightPageFragment liveHighLightPageFragment, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveHighLightPageFragment;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(CourseDetailContentAssem courseDetailContentAssem, long[] jArr, int i) {
        super(2);
        this.$t = i;
        this.l0 = courseDetailContentAssem;
        this.l1 = jArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomInputAssem bottomInputAssem, C1854150yLl c1854150yLl, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = c1854150yLl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomInputAssem bottomInputAssem, C1854540yMO c1854540yMO, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = c1854540yMO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomInputAssem bottomInputAssem, C1854760yMk c1854760yMk, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = c1854760yMk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomInputAssem bottomInputAssem, TakoSpeechViewModel takoSpeechViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = takoSpeechViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomInputAssem bottomInputAssem, ActionBarImageItem actionBarImageItem, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = actionBarImageItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(InputInnerAssem inputInnerAssem, ConstraintLayout constraintLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = inputInnerAssem;
        this.l1 = constraintLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoInputSkillLabelAssemV2 takoInputSkillLabelAssemV2, C1854540yMO c1854540yMO, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoInputSkillLabelAssemV2;
        this.l1 = c1854540yMO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(VoiceInputAssem voiceInputAssem, TakoSpeechViewModel takoSpeechViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = voiceInputAssem;
        this.l1 = takoSpeechViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoNewMarkdownAssem takoNewMarkdownAssem, Message message, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoNewMarkdownAssem;
        this.l1 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoAIImageConvertStyleFragment takoAIImageConvertStyleFragment, C197039127h c197039127h, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoAIImageConvertStyleFragment;
        this.l1 = c197039127h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoSubModeBarAssem takoSubModeBarAssem, C1854150yLl c1854150yLl, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoSubModeBarAssem;
        this.l1 = c1854150yLl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoMenuWindowAssem takoMenuWindowAssem, C1854150yLl c1854150yLl, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoMenuWindowAssem;
        this.l1 = c1854150yLl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoMediaChooseAlbumAssem takoMediaChooseAlbumAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoMediaChooseAlbumAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(BottomSelectedMediaAssem bottomSelectedMediaAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomSelectedMediaAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoPhotoChooseViewModel takoPhotoChooseViewModel, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoPhotoChooseViewModel;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoFeedRightBottomEntranceViewModel takoFeedRightBottomEntranceViewModel, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoFeedRightBottomEntranceViewModel;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS462S0200000_27(TakoBaseFragment takoBaseFragment, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = takoBaseFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS462S0200000_27(List list, List<TakoProcessInfo> list2, TakoLoadingAssem takoLoadingAssem) {
        super(2);
        this.$t = takoLoadingAssem;
        this.l0 = list;
        this.l1 = list2;
    }
}
