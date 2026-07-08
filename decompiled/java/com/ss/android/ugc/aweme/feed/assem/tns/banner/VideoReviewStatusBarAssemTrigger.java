package com.ss.android.ugc.aweme.feed.assem.tns.banner;

import X.C01GW;
import X.C03H5;
import X.C06MM;
import X.C0RYX;
import X.C10IS;
import X.C10IT;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C1518090pbj;
import X.C1AV3;
import X.C1ER1;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C291190BbB;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724270Sb3;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.app.Activity;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.aweme.search.pages.result.common.copyrightmute.core.communicate.SearchCopyrightMuteServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.List;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoReviewStatusBarAssemTrigger extends BaseCellTriggerComponent<VideoReviewStatusBarAssemTrigger> implements BottomBarPriorityProtocol {
    public final Keva LLJJLIIIJLLLLLLLZ = Keva.getRepo("low_volume_toast");
    public final C01GW LLJL = C452501pT.LIZIZ(new C0RYX(this));

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(VideoReviewStatusBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        C724270Sb3 c724270Sb3 = this.LLJI;
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        if (statusSafety == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null) {
            mappedMuteStripStatus = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
        }
        if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE) {
            List<Integer> list = VideoReviewStatusVM.LLIZLLLIL;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (C10IT.LJIIIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme())) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                return (Intrinsics.LJFF(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType, "others_homepage") && C1ER1.LIZIZ.m()) ? "bottom_banner_audio_violation_low_priority" : "bottom_banner_audio_violation";
            }
            if (!C291190BbB.LIZ()) {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (C10IS.LIZJ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null))) {
                    return "bottom_banner_take_down";
                }
            }
            return "";
        }
        List<Integer> list2 = VideoReviewStatusVM.LLIZLLLIL;
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (!C10IT.LJIIIZ(((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme())) {
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (!C10IS.LJ((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null))) {
                if (!C291190BbB.LIZ()) {
                    C724270Sb3 c724270Sb37 = this.LLJI;
                    if (C10IS.LIZJ((VideoItemParams) (c724270Sb37 != null ? c724270Sb37.LL : null))) {
                        return "bottom_banner_take_down";
                    }
                }
                return "";
            }
        }
        C724270Sb3 c724270Sb38 = this.LLJI;
        return (Intrinsics.LJFF(((VideoItemParams) (c724270Sb38 != null ? c724270Sb38.LL : null)).mEventType, "others_homepage") && C1ER1.LIZIZ.m()) ? "bottom_banner_audio_violation_low_priority" : "bottom_banner_audio_violation";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ("1", "PNS", null, "review_statusbar"));
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 109));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Object obj;
        String uid;
        Object obj2;
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        Object obj3;
        boolean zLJIIIZ;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Aweme aweme;
        Music music;
        C1518090pbj c1518090pbj;
        Integer num;
        Object obj11;
        Object obj12;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj13 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User author = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId())) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj9 = c724270Sb32.LL;
            } else {
                obj9 = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj9).mEventType, "personal_homepage")) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj10 = c724270Sb33.LL;
                } else {
                    obj10 = null;
                }
                VideoItemParams videoItemParams2 = (VideoItemParams) obj10;
                if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (music = aweme.getMusic()) != null && (c1518090pbj = music.musicEditInfo) != null && (num = c1518090pbj.edit_music_scene) != null && num.intValue() == 1) {
                    Keva keva = this.LLJJLIIIJLLLLLLLZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("is_showed");
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj11 = c724270Sb34.LL;
                    } else {
                        obj11 = null;
                    }
                    sbLIZ.append(((VideoItemParams) obj11).getAweme().getAid());
                    if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                        Keva keva2 = this.LLJJLIIIJLLLLLLLZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("is_showed");
                        C724270Sb3 c724270Sb35 = this.LLJI;
                        if (c724270Sb35 != null) {
                            obj12 = c724270Sb35.LL;
                        } else {
                            obj12 = null;
                        }
                        sbLIZ2.append(((VideoItemParams) obj12).getAweme().getAid());
                        keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                        Activity activityLIZ = C06MM.LIZ(getContext());
                        if (activityLIZ != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIIZ(2131836899);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                }
            }
        }
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj2 = c724270Sb36.LL;
        } else {
            obj2 = null;
        }
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(((VideoItemParams) obj2).getAweme());
        if (statusSafety == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null) {
            mappedMuteStripStatus = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
        }
        if (C291190BbB.LIZ()) {
            List<Integer> list = VideoReviewStatusVM.LLIZLLLIL;
            C724270Sb3 c724270Sb37 = this.LLJI;
            if (c724270Sb37 != null) {
                obj8 = c724270Sb37.LL;
            } else {
                obj8 = null;
            }
            zLJIIIZ = C10IT.LJIIIZ(((VideoItemParams) obj8).getAweme());
        } else {
            List<Integer> list2 = VideoReviewStatusVM.LLIZLLLIL;
            C724270Sb3 c724270Sb38 = this.LLJI;
            if (c724270Sb38 != null) {
                obj3 = c724270Sb38.LL;
            } else {
                obj3 = null;
            }
            VideoItemParams videoItemParams3 = (VideoItemParams) obj3;
            if (!C10IS.LIZJ(videoItemParams3) && !AwemeExtKt.shouldShowReviewStatus(videoItemParams3.getAweme()) && !C10IT.LJIIIZ(videoItemParams3.getAweme())) {
                zLJIIIZ = false;
            } else {
                zLJIIIZ = true;
            }
        }
        if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE) {
            if (!zLJIIIZ) {
                return false;
            }
            ISearchCopyrightMuteService iSearchCopyrightMuteServiceLJI = SearchCopyrightMuteServiceImpl.LJI();
            C724270Sb3 c724270Sb39 = this.LLJI;
            if (c724270Sb39 != null) {
                obj7 = c724270Sb39.LL;
            } else {
                obj7 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj7).getAweme();
            C724270Sb3 c724270Sb310 = this.LLJI;
            if (c724270Sb310 != null) {
                obj13 = c724270Sb310.LL;
            }
            if (iSearchCopyrightMuteServiceLJI.LIZIZ(aweme2, ((VideoItemParams) obj13).mEventType)) {
                return false;
            }
        } else {
            ISearchCopyrightMuteService iSearchCopyrightMuteServiceLJI2 = SearchCopyrightMuteServiceImpl.LJI();
            C724270Sb3 c724270Sb311 = this.LLJI;
            if (c724270Sb311 != null) {
                obj4 = c724270Sb311.LL;
            } else {
                obj4 = null;
            }
            Aweme aweme3 = ((VideoItemParams) obj4).getAweme();
            C724270Sb3 c724270Sb312 = this.LLJI;
            if (c724270Sb312 != null) {
                obj5 = c724270Sb312.LL;
            } else {
                obj5 = null;
            }
            if (iSearchCopyrightMuteServiceLJI2.LIZIZ(aweme3, ((VideoItemParams) obj5).mEventType)) {
                return false;
            }
            C724270Sb3 c724270Sb313 = this.LLJI;
            if (c724270Sb313 != null) {
                obj6 = c724270Sb313.LL;
            } else {
                obj6 = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj6).mEventType, "homepage_hot")) {
                return zLJIIIZ;
            }
            if (!zLJIIIZ) {
                C724270Sb3 c724270Sb314 = this.LLJI;
                if (c724270Sb314 != null) {
                    obj13 = c724270Sb314.LL;
                }
                if (!C10IS.LJ((VideoItemParams) obj13)) {
                    return false;
                }
            }
        }
        return true;
    }
}
