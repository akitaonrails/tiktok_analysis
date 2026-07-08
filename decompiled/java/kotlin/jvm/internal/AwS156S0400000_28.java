package kotlin.jvm.internal;

import X.AbstractC1899090zWF;
import X.AbstractC1899280zWY;
import X.C01GW;
import X.C09AY;
import X.C09R7;
import X.C0LAB;
import X.C1008900cMS;
import X.C1009620cNc;
import X.C10IZ;
import X.C1389890mGx;
import X.C13IQ;
import X.C15O7;
import X.C1891380zJo;
import X.C1891440zJu;
import X.C1893630zNR;
import X.C1894700zPA;
import X.C1896810zSZ;
import X.C1898380zV6;
import X.C1898420zVA;
import X.C1898700zVc;
import X.C1898820zVo;
import X.C1898960zW2;
import X.C1898970zW3;
import X.C1898980zW4;
import X.C1899080zWE;
import X.C1900180zY0;
import X.C1901440za2;
import X.C1901480za6;
import X.C1908200zkw;
import X.C1914170zuZ;
import X.C19EG;
import X.C20684815ws;
import X.C21341918fZ;
import X.C2178808gE;
import X.C786410Ut5;
import X.C894700Z8a;
import X.DialogC1389620mGW;
import X.EnumC586670Mzh;
import X.InterfaceC1075600e62;
import X.InterfaceC1217270hmX;
import X.InterfaceC1411705fn;
import X.InterfaceC1766500w4O;
import X.InterfaceC1891370zJn;
import X.InterfaceC1898130zUh;
import X.InterfaceC1898430zVB;
import X.InterfaceC1898470zVF;
import X.InterfaceC1899340zWe;
import X.InterfaceC1914160zuY;
import X.InterfaceC1914220zue;
import X.ViewOnClickListenerC1908150zkr;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.incentive.taskevent.watchvideo.MultiDomainService;
import com.bytedance.incentive.taskevent.watchvideo.WatchVideoServiceImpl;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.CommonVideo;
import com.bytedance.touchpoint.api.model.CommonVideoContent;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.model.UserActionContent;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public class AwS156S0400000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS156S0400000_28 awS156S0400000_28) {
        TimeInfo timeInfo;
        TimeInfo timeInfo2;
        TimeInfo timeInfo3;
        MultiDomainService multiDomainService = (MultiDomainService) awS156S0400000_28.l0;
        List list = (List) awS156S0400000_28.l1;
        List<TaskEvent> list2 = (List) awS156S0400000_28.l2;
        Map map = (Map) awS156S0400000_28.l3;
        multiDomainService.getClass();
        for (final TaskEvent taskEvent : list2) {
            String str = taskEvent.userActionType;
            if (str != null) {
                int iHashCode = str.hashCode();
                Integer num = null;
                if (iHashCode != -2116491668) {
                    if (iHashCode != 1104592653) {
                        if (iHashCode == 1707912376 && str.equals("fixed_time")) {
                            AbstractC1899090zWF abstractC1899090zWF = new AbstractC1899090zWF(taskEvent) { // from class: X.0zW5
                                public boolean LLIZ;

                                @Override // X.InterfaceC1899310zWb
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC1899310zWb
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC1899310zWb
                                public final void LIZJ() {
                                }

                                @Override // X.InterfaceC1899310zWb
                                public final void LJ() {
                                }

                                @Override // X.InterfaceC1899310zWb
                                public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
                                }

                                @Override // X.AbstractC1899090zWF
                                public final void LJIIJ() {
                                    if (this.LLILLJJLI && !this.LLIZ) {
                                        this.LLIZ = true;
                                        TaskEventContent taskEventContentLIZ = C1898850zVr.LIZ(this.LL, "fixed_time", new UserActionContent(null, null, null, null, null, null, null, null, null), null);
                                        C1899080zWE c1899080zWE = this.LLILLL;
                                        if (c1899080zWE != null) {
                                            c1899080zWE.LJIIJJI(taskEventContentLIZ, true, new AwS607S0100000_28(this, 30));
                                        }
                                    }
                                }
                            };
                            C1899080zWE c1899080zWE = new C1899080zWE(abstractC1899090zWF, taskEvent);
                            DisplayInfo displayInfo = taskEvent.displayInfo;
                            if (displayInfo != null && (timeInfo = displayInfo.timeInfo) != null) {
                                num = timeInfo.timerLaunchPlayId;
                            }
                            abstractC1899090zWF.LJIILIIL(MultiDomainService.LIZ(num, map));
                            list.add(c1899080zWE);
                            ((ArrayList) multiDomainService.LIZ).add(abstractC1899090zWF);
                        }
                    } else if (str.equals("watch_feed_ads_time")) {
                        C1898960zW2 c1898960zW2 = new C1898960zW2(taskEvent);
                        C1899080zWE c1899080zWE2 = new C1899080zWE(c1898960zW2, taskEvent);
                        DisplayInfo displayInfo2 = taskEvent.displayInfo;
                        if (displayInfo2 != null && (timeInfo2 = displayInfo2.timeInfo) != null) {
                            num = timeInfo2.timerLaunchPlayId;
                        }
                        c1898960zW2.LJIILIIL(MultiDomainService.LIZ(num, map));
                        list.add(c1899080zWE2);
                        ((ArrayList) C1898970zW3.LIZIZ).add(c1898960zW2);
                    }
                } else if (str.equals("watch_ads_time")) {
                    AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = new AdWatchVideoTaskTrigger(taskEvent);
                    C1899080zWE c1899080zWE3 = new C1899080zWE(adWatchVideoTaskTrigger, taskEvent);
                    DisplayInfo displayInfo3 = taskEvent.displayInfo;
                    if (displayInfo3 != null && (timeInfo3 = displayInfo3.timeInfo) != null) {
                        num = timeInfo3.timerLaunchPlayId;
                    }
                    adWatchVideoTaskTrigger.LJIILIIL(MultiDomainService.LIZ(num, map));
                    list.add(c1899080zWE3);
                    ((ArrayList) C1898980zW4.LIZIZ).add(adWatchVideoTaskTrigger);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS156S0400000_28 awS156S0400000_28) {
        Integer num;
        TimeInfo timeInfo;
        WatchVideoServiceImpl watchVideoServiceImpl = (WatchVideoServiceImpl) awS156S0400000_28.l0;
        List list = (List) awS156S0400000_28.l1;
        List<TaskEvent> list2 = (List) awS156S0400000_28.l2;
        Map map = (Map) awS156S0400000_28.l3;
        watchVideoServiceImpl.getClass();
        for (final TaskEvent taskEvent : list2) {
            String str = taskEvent.userActionType;
            InterfaceC1898470zVF<TaskEvent> interfaceC1898470zVF = null;
            if (Intrinsics.LJFF(str, "watch_video_time")) {
                C1898820zVo c1898820zVo = new C1898820zVo(taskEvent);
                C1899080zWE c1899080zWE = new C1899080zWE(c1898820zVo, taskEvent);
                DisplayInfo displayInfo = taskEvent.displayInfo;
                if (displayInfo != null && (timeInfo = displayInfo.timeInfo) != null) {
                    num = timeInfo.timerLaunchPlayId;
                } else {
                    num = null;
                }
                Iterator it2 = map.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (num != null && iIntValue == num.intValue()) {
                        interfaceC1898470zVF = (InterfaceC1898470zVF) entry.getValue();
                        break;
                    }
                }
                c1898820zVo.LJIILIIL(interfaceC1898470zVF);
                list.add(c1899080zWE);
                ((ArrayList) watchVideoServiceImpl.LIZLLL).add(c1898820zVo);
                C1896810zSZ c1896810zSZ = watchVideoServiceImpl.LIZIZ;
                if (c1896810zSZ != null && watchVideoServiceImpl.LIZJ == EnumC586670Mzh.PLAYING) {
                    c1898820zVo.LJIILLIIL(c1896810zSZ);
                }
            } else if (Intrinsics.LJFF(str, "watch_video_item_count")) {
                AbstractC1899280zWY abstractC1899280zWY = new AbstractC1899280zWY(taskEvent) { // from class: X.0zW6
                    public int LLIZ;
                    public final List<CommonVideo> LLIZLLLIL = new ArrayList();
                    public final Set<String> LLJ = new LinkedHashSet();

                    @Override // X.InterfaceC1899310zWb
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1899310zWb
                    public final void LJ() {
                        this.LLIZ = 0;
                        ((ArrayList) this.LLIZLLLIL).clear();
                        Keva keva = C1898830zVp.LIZ;
                        C1898830zVp.LIZIZ(this.LL);
                    }

                    @Override // X.AbstractC1899090zWF
                    public final void LJI() {
                        this.LLIZ = 0;
                        ((ArrayList) this.LLIZLLLIL).clear();
                    }

                    @Override // X.AbstractC1899280zWY
                    public final void LJIIZILJ() {
                    }

                    @Override // X.InterfaceC1899310zWb
                    public final void LIZ() {
                        if (((ArrayList) this.LLIZLLLIL).isEmpty()) {
                            return;
                        }
                        TaskEventContent taskEventContentLIZ = C1898850zVr.LIZ(this.LL, "watch_video_item_count", new UserActionContent(null, null, new CommonVideoContent(C13LP.LLIIII(this.LLIZLLLIL)), null, null, null, null, null, null), null);
                        if (taskEventContentLIZ != null) {
                            Keva keva = C1898830zVp.LIZ;
                            C1898830zVp.LIZLLL(this.LL, taskEventContentLIZ);
                        }
                    }

                    @Override // X.InterfaceC1899310zWb
                    public final void LIZIZ() {
                        List list3;
                        Keva keva = C1898830zVp.LIZ;
                        TaskEventContent taskEventContentLIZJ = C1898830zVp.LIZJ(this.LL);
                        if (taskEventContentLIZJ != null) {
                            CommonVideoContent commonVideoContent = taskEventContentLIZJ.userActionContent.watchVideoItemCountContent;
                            if (commonVideoContent == null || (list3 = commonVideoContent.videos) == null) {
                                list3 = C13BV.INSTANCE;
                            }
                            if (!list3.isEmpty()) {
                                ((ArrayList) this.LLIZLLLIL).clear();
                                ((ArrayList) this.LLIZLLLIL).addAll(list3);
                                Set<String> set = this.LLJ;
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    String str2 = ((CommonVideo) it3.next()).itemId;
                                    if (str2 != null) {
                                        arrayList.add(str2);
                                    }
                                }
                                set.addAll(arrayList);
                                this.LLIZ = ((ArrayList) this.LLIZLLLIL).size();
                            }
                        }
                    }

                    @Override // X.AbstractC1899280zWY
                    public final void LJIILLIIL(C1896810zSZ c1896810zSZ2) {
                        Integer num2;
                        if (!this.LLILLJJLI || !C1898870zVt.LIZ(c1896810zSZ2, this.LLILZ)) {
                            return;
                        }
                        String str2 = c1896810zSZ2.LJIIJ;
                        int iIntValue2 = 1;
                        if (str2 != null && str2.length() != 0 && 0 == 0) {
                            CommonVideo commonVideo = new CommonVideo(str2, c1896810zSZ2.LIZ, c1896810zSZ2.LIZJ, c1896810zSZ2.LIZIZ, System.currentTimeMillis());
                            if (!this.LLJ.add(commonVideo.itemId)) {
                                return;
                            }
                            ((ArrayList) this.LLIZLLLIL).add(commonVideo);
                            this.LLIZ = ((ArrayList) this.LLIZLLLIL).size();
                            ReportInstruction reportInstruction = this.LL.reportInstruction;
                            if (reportInstruction != null && (num2 = reportInstruction.reportBatch) != null) {
                                iIntValue2 = num2.intValue();
                            }
                            if (this.LLIZ >= iIntValue2 && !((ArrayList) this.LLIZLLLIL).isEmpty()) {
                                TaskEventContent taskEventContentLIZ = C1898850zVr.LIZ(this.LL, "watch_video_item_count", new UserActionContent(null, null, new CommonVideoContent(C13LP.LLIIII(this.LLIZLLLIL)), null, null, null, null, null, null), null);
                                if (taskEventContentLIZ != null) {
                                    LJ();
                                    C1899080zWE c1899080zWE2 = this.LLILLL;
                                    if (c1899080zWE2 != null) {
                                        c1899080zWE2.LJIIJJI(taskEventContentLIZ, true, null);
                                    }
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC1899310zWb
                    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        TaskEvent taskEvent2 = this.LL;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        c1894320zOY.getClass();
                        C1894320zOY.LJIIIZ(taskEvent2, linkedHashMap);
                    }
                };
                list.add(new C1899080zWE(abstractC1899280zWY, taskEvent));
                ((ArrayList) watchVideoServiceImpl.LIZLLL).add(abstractC1899280zWY);
                C1896810zSZ c1896810zSZ2 = watchVideoServiceImpl.LIZIZ;
                if (c1896810zSZ2 != null && watchVideoServiceImpl.LIZJ == EnumC586670Mzh.PLAYING) {
                    abstractC1899280zWY.LJIILLIIL(c1896810zSZ2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS156S0400000_28 awS156S0400000_28) {
        String creationId;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS156S0400000_28.l0;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("value", "disabled");
        C20684815ws.LJIILLIIL("toggle_post_reuse_content_settings", c0lab.LIZ);
        C10IZ.LIZLLL((Activity) awS156S0400000_28.l1, (Fragment) awS156S0400000_28.l2, (VideoPublishEditModel) awS156S0400000_28.l0, (Function0) awS156S0400000_28.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS156S0400000_28 awS156S0400000_28) {
        C10IZ.LIZJ((Activity) awS156S0400000_28.l0, (Fragment) awS156S0400000_28.l2, (VideoPublishEditModel) awS156S0400000_28.l1, (Function0) awS156S0400000_28.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS156S0400000_28 awS156S0400000_28) {
        InterfaceC1217270hmX interfaceC1217270hmX;
        String cid;
        ArrayList arrayList = new ArrayList();
        List<TextExtraStruct> textExtra = ((Aweme) awS156S0400000_28.l0).getTextExtra();
        if (textExtra != null) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct != null && (cid = textExtraStruct.getCid()) != null) {
                    arrayList.add(cid);
                }
            }
        }
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        if (C2178808gE.LIZ().LJ(40) != null) {
            interfaceC1217270hmX = C1893630zNR.LL;
        } else {
            interfaceC1217270hmX = C1900180zY0.LL;
        }
        interfaceC1217270hmX.LIZIZ((Context) awS156S0400000_28.l1, ((Aweme) awS156S0400000_28.l0).getAid(), arrayList, (Function1) awS156S0400000_28.l2, (Function2) awS156S0400000_28.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T extends X.0zNV, X.0zNV] */
    public static final Object invoke$13(AwS156S0400000_28 awS156S0400000_28) {
        InterfaceC1898430zVB interfaceC1898430zVBLIZLLL;
        C1898700zVc c1898700zVc;
        DisplayInfo displayInfo;
        TimeInfo timeInfo;
        Integer num;
        ViewParent parent;
        ViewGroup viewGroup;
        ViewParent parent2;
        ViewGroup viewGroup2;
        AdFeedTimerPendantManager adFeedTimerPendantManagerLIZ = C1898380zV6.LIZ(((C1898420zVA) awS156S0400000_28.l0).LIZ);
        if (adFeedTimerPendantManagerLIZ != null) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS156S0400000_28.l1;
            ViewGroup viewGroup3 = (ViewGroup) awS156S0400000_28.l2;
            C1898420zVA c1898420zVA = (C1898420zVA) awS156S0400000_28.l0;
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            TaskEvent taskEventLIZLLL = C2178808gE.LIZ().LIZLLL(c1898420zVA.LIZIZ);
            if (taskEventLIZLLL != null && (displayInfo = taskEventLIZLLL.displayInfo) != null && (timeInfo = displayInfo.timeInfo) != null && (num = timeInfo.timerLaunchPlayId) != null) {
                int iIntValue = num.intValue();
                ?? LJI = C2178808gE.LIZ().LJI(76, iIntValue);
                C1009620cNc c1009620cNc = c1898420zVA.LIZJ;
                if (c1009620cNc != null && c1009620cNc.LIZ != 0 && LJI != 0) {
                    if (adFeedTimerPendantManagerLIZ.LJJ()) {
                        if (!Intrinsics.LJFF(adFeedTimerPendantManagerLIZ.LL, viewGroup3)) {
                            C1898700zVc c1898700zVc2 = adFeedTimerPendantManagerLIZ.LLIZ;
                            ViewParent parent3 = null;
                            if (c1898700zVc2 != null && c1898700zVc2.getParent() != null) {
                                C1898700zVc c1898700zVc3 = adFeedTimerPendantManagerLIZ.LLIZ;
                                if (c1898700zVc3 != null) {
                                    parent2 = c1898700zVc3.getParent();
                                } else {
                                    parent2 = null;
                                }
                                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                                    C786410Ut5.LJJJLZIJ(adFeedTimerPendantManagerLIZ.LLIZ, viewGroup2);
                                }
                            }
                            adFeedTimerPendantManagerLIZ.LL = viewGroup3;
                            C1898700zVc c1898700zVc4 = adFeedTimerPendantManagerLIZ.LLIZ;
                            if (c1898700zVc4 != null) {
                                parent = c1898700zVc4.getParent();
                            } else {
                                parent = null;
                            }
                            if (!Intrinsics.LJFF(parent, adFeedTimerPendantManagerLIZ.LL)) {
                                C1898700zVc c1898700zVc5 = adFeedTimerPendantManagerLIZ.LLIZ;
                                if (c1898700zVc5 != null && c1898700zVc5.getParent() != null) {
                                    C1898700zVc c1898700zVc6 = adFeedTimerPendantManagerLIZ.LLIZ;
                                    if (c1898700zVc6 != null) {
                                        parent3 = c1898700zVc6.getParent();
                                    }
                                    if ((parent3 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent3) != null) {
                                        C786410Ut5.LJJJLZIJ(adFeedTimerPendantManagerLIZ.LLIZ, viewGroup);
                                    }
                                }
                                ViewGroup viewGroup4 = adFeedTimerPendantManagerLIZ.LL;
                                if (((viewGroup4 instanceof FrameLayout) || (viewGroup4 instanceof RelativeLayout)) && viewGroup4 != null) {
                                    viewGroup4.addView(adFeedTimerPendantManagerLIZ.LLIZ);
                                }
                            }
                        }
                        adFeedTimerPendantManagerLIZ.LJJIII();
                        adFeedTimerPendantManagerLIZ.LJL();
                    } else {
                        adFeedTimerPendantManagerLIZ.LLJJJJ = Integer.valueOf(iIntValue);
                        adFeedTimerPendantManagerLIZ.LLJJJJLIIL = c1898420zVA;
                        adFeedTimerPendantManagerLIZ.LLJJJJJIL = c1898420zVA.LIZ;
                        adFeedTimerPendantManagerLIZ.LLILLL = LJI;
                        adFeedTimerPendantManagerLIZ.LJIIJ(viewGroup3, lifecycleOwner);
                    }
                }
            }
        }
        AdFeedTimerPendantManager adFeedTimerPendantManagerLIZ2 = C1898380zV6.LIZ(((C1898420zVA) awS156S0400000_28.l0).LIZ);
        if (adFeedTimerPendantManagerLIZ2 != null && (c1898700zVc = adFeedTimerPendantManagerLIZ2.LLIZ) != null) {
            C786410Ut5.j2(c1898700zVc, 0);
        }
        IMultiDomainService iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
        if (iMultiDomainService != null && (interfaceC1898430zVBLIZLLL = iMultiDomainService.LIZLLL()) != null) {
            interfaceC1898430zVBLIZLLL.LIZIZ((C1898420zVA) awS156S0400000_28.l0, (InterfaceC1899340zWe) awS156S0400000_28.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$14(AwS156S0400000_28 awS156S0400000_28) {
        Fragment fragment = (Fragment) awS156S0400000_28.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS156S0400000_28.l1).invoke(), C09R7.LIZ((C13IQ) awS156S0400000_28.l2));
        Function2 function2 = (Function2) awS156S0400000_28.l3;
        Fragment fragment2 = (Fragment) awS156S0400000_28.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(UserViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS394S0200000_28(function2, fragment2, 64));
        return jediViewModel;
    }

    public static final Object invoke$15(AwS156S0400000_28 awS156S0400000_28) {
        C1914170zuZ c1914170zuZ = C1914170zuZ.LIZ;
        UniversalPopupResponse universalPopupResponse = (UniversalPopupResponse) ((C15O7) awS156S0400000_28.l0).LJIIL();
        Context context = (Context) awS156S0400000_28.l1;
        InterfaceC1914220zue interfaceC1914220zue = (InterfaceC1914220zue) awS156S0400000_28.l2;
        InterfaceC1914160zuY interfaceC1914160zuY = (InterfaceC1914160zuY) awS156S0400000_28.l3;
        c1914170zuZ.getClass();
        C1914170zuZ.LJ(universalPopupResponse, context, interfaceC1914220zue, interfaceC1914160zuY);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS156S0400000_28 awS156S0400000_28) {
        ((C1891380zJo) awS156S0400000_28.l0).LIZIZ((C21341918fZ) awS156S0400000_28.l1, (C1891440zJu) awS156S0400000_28.l2, (InterfaceC1891370zJn) awS156S0400000_28.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS156S0400000_28 awS156S0400000_28) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS156S0400000_28.l0);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS156S0400000_28.l1);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJIIJJI();
        ((PrivacySettingDialogRouter) awS156S0400000_28.l2).sendLoopCurrentStoryEvent((Aweme) awS156S0400000_28.l3, false);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS156S0400000_28 awS156S0400000_28) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS156S0400000_28.l0);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS156S0400000_28.l1);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJIIJJI();
        ((PrivacySettingDialogRouter) awS156S0400000_28.l2).sendLoopCurrentStoryEvent((Aweme) awS156S0400000_28.l3, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$4(AwS156S0400000_28 awS156S0400000_28) {
        Fragment fragment = (Fragment) awS156S0400000_28.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS156S0400000_28.l1).invoke(), C09R7.LIZ((C13IQ) awS156S0400000_28.l2));
        Function2 function2 = (Function2) awS156S0400000_28.l3;
        Fragment fragment2 = (Fragment) awS156S0400000_28.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(NotificationLiveViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS394S0200000_28(function2, fragment2, 23));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS156S0400000_28 awS156S0400000_28) {
        Fragment fragment = (Fragment) awS156S0400000_28.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS156S0400000_28.l1).invoke(), C09R7.LIZ((C13IQ) awS156S0400000_28.l2));
        Function2 function2 = (Function2) awS156S0400000_28.l3;
        Fragment fragment2 = (Fragment) awS156S0400000_28.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(NotificationLiveViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS394S0200000_28(function2, fragment2, 24));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$6(AwS156S0400000_28 awS156S0400000_28) {
        Fragment fragment = (Fragment) awS156S0400000_28.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS156S0400000_28.l1).invoke(), C09R7.LIZ((C13IQ) awS156S0400000_28.l2));
        Function2 function2 = (Function2) awS156S0400000_28.l3;
        Fragment fragment2 = (Fragment) awS156S0400000_28.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(NotificationLiveViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS394S0200000_28(function2, fragment2, 25));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$7(AwS156S0400000_28 awS156S0400000_28) {
        Fragment fragment = (Fragment) awS156S0400000_28.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS156S0400000_28.l1).invoke(), C09R7.LIZ((C13IQ) awS156S0400000_28.l2));
        Function2 function2 = (Function2) awS156S0400000_28.l3;
        Fragment fragment2 = (Fragment) awS156S0400000_28.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(UserViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS394S0200000_28(function2, fragment2, 26));
        return jediViewModel;
    }

    public static final Object invoke$8(AwS156S0400000_28 awS156S0400000_28) {
        int iIntValue;
        boolean zBooleanValue;
        Boolean boolValueOf;
        C1901480za6 c1901480za6;
        C1901480za6 c1901480za62;
        C1901440za2.LIZ.getClass();
        ChangeLiveData<C1901480za6> changeLiveData = C1901440za2.LJI;
        Integer numValueOf = (Integer) awS156S0400000_28.l0;
        if (numValueOf != null || ((c1901480za62 = (C1901480za6) awS156S0400000_28.l1) != null && (numValueOf = Integer.valueOf(c1901480za62.LIZ)) != null)) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        Boolean boolValueOf2 = (Boolean) awS156S0400000_28.l2;
        boolean zBooleanValue2 = false;
        if (boolValueOf2 != null || ((c1901480za6 = (C1901480za6) awS156S0400000_28.l1) != null && (boolValueOf2 = Boolean.valueOf(c1901480za6.LIZIZ)) != null)) {
            zBooleanValue = boolValueOf2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool = (Boolean) awS156S0400000_28.l3;
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            C1901480za6 c1901480za63 = (C1901480za6) awS156S0400000_28.l1;
            if (c1901480za63 != null && (boolValueOf = Boolean.valueOf(c1901480za63.LIZJ)) != null) {
                zBooleanValue2 = boolValueOf.booleanValue();
            }
        }
        changeLiveData.setValue(new C1901480za6(iIntValue, zBooleanValue, zBooleanValue2));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS156S0400000_28 awS156S0400000_28) {
        String str;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        ((ViewOnClickListenerC1908150zkr) awS156S0400000_28.l0).I5((User) awS156S0400000_28.l1, (C894700Z8a) awS156S0400000_28.l2);
        C1908200zkw c1908200zkw = (C1908200zkw) awS156S0400000_28.l3;
        if (c1908200zkw != null && (str = c1908200zkw.LIZJ) != null) {
            ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr = (ViewOnClickListenerC1908150zkr) awS156S0400000_28.l0;
            String strLJJIIJZLJL = ViewOnClickListenerC1908150zkr.N5().LJJIIJZLJL(str, ((User) awS156S0400000_28.l1).getUid());
            InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) viewOnClickListenerC1908150zkr.LLJJI.getValue();
            if (interfaceC1411705fn != null) {
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi != null) {
                    jCurrentTimeMillis = iMHostApi.LIZIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi2 != null) {
                    jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                } else {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                interfaceC1411705fn.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, strLJJIIJZLJL);
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS156S0400000_28(X.C19EG r3, androidx.fragment.app.Fragment r4, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, kotlin.jvm.internal.AwS572S0100000_28 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 10 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r0 = 0
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r6
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS156S0400000_28.<init>(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, kotlin.jvm.internal.AwS572S0100000_28, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(DialogC1389620mGW dialogC1389620mGW, C19EG c19eg, PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogC1389620mGW;
        this.l1 = c19eg;
        this.l2 = privacySettingDialogRouter;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(C1891380zJo c1891380zJo, C21341918fZ c21341918fZ, C1891440zJu c1891440zJu, InterfaceC1891370zJn interfaceC1891370zJn, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1891380zJo;
        this.l1 = c21341918fZ;
        this.l2 = c1891440zJu;
        this.l3 = interfaceC1891370zJn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr, User user, C894700Z8a c894700Z8a, C1908200zkw c1908200zkw, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnClickListenerC1908150zkr;
        this.l1 = user;
        this.l2 = c894700Z8a;
        this.l3 = c1908200zkw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS156S0400000_28(C15O7 c15o7, C15O7<UniversalPopupResponse> c15o72, Context context, InterfaceC1914220zue interfaceC1914220zue, InterfaceC1914160zuY interfaceC1914160zuY) {
        super(0);
        this.$t = interfaceC1914160zuY;
        this.l0 = c15o7;
        this.l1 = c15o72;
        this.l2 = context;
        this.l3 = interfaceC1914220zue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(Context context, Aweme aweme, AwS590S0100000_11 awS590S0100000_11, AwS625S0100000_11 awS625S0100000_11, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = context;
        this.l2 = awS590S0100000_11;
        this.l3 = awS625S0100000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C1008900cMS c1008900cMS, C1898420zVA c1898420zVA, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1898420zVA;
        this.l1 = lifecycleOwner;
        this.l2 = viewGroup;
        this.l3 = c1008900cMS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(Fragment fragment, Function0 function0, C13IQ c13iq, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS156S0400000_28(MultiDomainService multiDomainService, MultiDomainService multiDomainService2, List<InterfaceC1898130zUh> list, List<TaskEvent> list2, Map<Integer, InterfaceC1898470zVF<TaskEvent>> map) {
        super(0);
        this.$t = map;
        this.l0 = multiDomainService;
        this.l1 = multiDomainService2;
        this.l2 = list;
        this.l3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS156S0400000_28(WatchVideoServiceImpl watchVideoServiceImpl, WatchVideoServiceImpl watchVideoServiceImpl2, List<InterfaceC1898130zUh> list, List<TaskEvent> list2, Map<Integer, InterfaceC1898470zVF<TaskEvent>> map) {
        super(0);
        this.$t = map;
        this.l0 = watchVideoServiceImpl;
        this.l1 = watchVideoServiceImpl2;
        this.l2 = list;
        this.l3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0400000_28(Integer num, C1901480za6 c1901480za6, Boolean bool, Boolean bool2, int i) {
        super(0);
        this.$t = i;
        this.l0 = num;
        this.l1 = c1901480za6;
        this.l2 = bool;
        this.l3 = bool2;
    }
}
